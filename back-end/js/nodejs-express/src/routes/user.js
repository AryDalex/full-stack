const express = require('express')
const router = express.Router()
const Users = require('../models/User')
const jwt = require('jsonwebtoken')

// app.use(bodyParser.json())

const SECRET = 'arydalex'

const check = [(req, res, next) => {

    Users.findOne({username: req.header('username')}).then( result => {
        const user = result.username; 
        const pass = result.password;

        if (req.header('password') != pass) {
            console.log("Incorrect password")
            return res.status(403).send()
        }else {
            console.log("Correct password");

            const token = jwt.sign({userId: 1}, SECRET, { expiresIn: 300 })
            return res.json({ auth: true, token })

            next()
        }

    }).catch(err => {
        return res.status(403).send("Incorrect username"+err);
    })
}]

router.get('/', check, (req, res) => {
    Users.find().then(users => {
        res.status(200).send(users);
    }).catch(error => {
        res.status(500).send(error)
    })
})

router.post('/', (req, res) => {
    const user = new Users({
        username: req.body.username,
        password: req.body.password,
        role: req.body.role
    })

    user.save().then(() => {
        res.status(200).send()
    })
})

router.delete('/', (req, res) => {
    
    Users.deleteMany().then(result => {
        res.status(200).send()
    });
})

module.exports = router;