const express = require('express')
const router = express.Router()
const Saldo = require('../models/Saldo')

const expressValidator = require('express-validator')

const validate = [
    expressValidator.check('saldo').isLength({min: 1}).withMessage('Field saldo can not be null'),
    expressValidator.check('saldo').isNumeric().withMessage('Field saldo should be a number')
]

router.get('/', (req, res) => {
    Saldo.find().then(saldos => {
        res.status(200).send(saldos);
    }).catch(error => {
        res.status(500).send(error)
    })
})

router.get('/:id', (req, res) => {

    Saldo.findById(req.params.id)
    .then(saldo => {
        res.status(200).send(saldo)
    }).catch(error => {
        res.status(404);
    })

})

router.post('/', [validate], (req, res) => {

    const erros = expressValidator.validationResult(req);
    if(!erros.isEmpty()){
        return res.status(422).send({erros: erros.array()})
    }

    const saldo = new Saldo({
        saldo: req.body.saldo
    })

    saldo.save()
    .then(result => {
        res.status(201).send(result)
    })
})

router.delete('/', (req, res) => {
    
    Saldo.deleteMany().then(result => {
        res.status(200).send()
    });
})

router.delete('/query', (req, res) => {
    
    Saldo.findByIdAndRemove(req.query.id)
    .then(result => {
        res.status(200).send(result)
    }).catch( error => {
        res.status(404).send()
    })
})

router.put('/:value', (req, res) => {
    const pathValue = req.params.value

    Saldo.findById(req.query.id).then(saldo => {
        saldo.saldo = pathValue
        saldo.save().then(result => {
            res.status(200).send(result)
        })
    }).catch( error => {
        res.status(404).send()
    })

})

module.exports = router;