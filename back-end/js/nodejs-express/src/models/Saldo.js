const mongoose = require('mongoose')

const SaldoSchema = new mongoose.Schema(
    {
        saldo: Number
    }
)

module.exports = mongoose.model("saldos", SaldoSchema)