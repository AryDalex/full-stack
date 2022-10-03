/*const http = require('http')
const express = require('express')
const bodyParser = require('body-parser')
const jwt = require('jsonwebtoken')
const app = express()

app.use(bodyParser.json())

const SECRET = 'arydalex'

app.get('/', (req, res) => {
    res.json({ message: "Tudo ok por aqui!"})
})

app.get('/clientes', (req, res) => {
    res.json([{id: 1, name: 'ary'}])
})

app.post('/login', (req, res) => {
    if(res.body.user === 'ary' && req.body.password === '123') {
        const token = jwt.sing({userId: 1}, SECRET, { expiresIn: 300 })
        // (id, senha para a assinatur digital, tempo que o token é valido) 
        return res.json({ auth: true, token })
        // (foi altenticado, token)
    }

    res.status(401).end() // nao altorizado
})

app.post('/logout', (req, res) => {
    res.end()
})

const server = http.createServer(app)
server.listen(3000)
console.log("Servidor escutando na porta 3000...")*/