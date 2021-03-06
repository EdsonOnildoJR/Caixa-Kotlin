package model

abstract class ContaBancaria (var saldo : Double, var nConta : Int, var nCartao : Int, var senha: Int)
{
    var cliente: ContaBancaria? = null

    abstract fun aplicarJuros()

    fun debitar(valor : Double)
    {
        this.saldo -= valor
    }

    fun creditar(valor : Double)
    {
        this.saldo += valor
    }

    abstract fun getTipo() : Char
}