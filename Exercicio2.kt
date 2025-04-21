package com.example.classe

fun main() {
    val carro = Carro("Volvo V40")
    carro.acelerar()
    carro.desacelerar()
    println("Velocidade atual: ${carro.velocidadeAtual()} km/h\n")

    val moto = Moto("Honda CB500")
    moto.acelerar()
    moto.desacelerar()
    println("Velocidade atual da moto: ${moto.velocidadeAtual()}\n")
}

interface Veiculo {
    val modelo: String
    val aceleracao: Int
    val desaceleracao: Int
    var velocidade: Int

    fun acelerar()
    fun desacelerar()
    fun velocidadeAtual(): Int

}

class Carro(override val modelo: String) : Veiculo {
    override val aceleracao = 100
    override val desaceleracao = 10
    override var velocidade: Int = 0

   override fun acelerar() {
        velocidade += aceleracao
        println("$modelo acelerou para $velocidade km/h")
    }

   override fun desacelerar() {
        velocidade = if (velocidade >= desaceleracao) velocidade - desaceleracao else 0
        println("$modelo desacelerou para $velocidade")
    }

    override fun velocidadeAtual(): Int = velocidade
    }

class Moto (override val modelo: String): Veiculo {
    override val aceleracao = 5
    override val desaceleracao = 1
    override var velocidade: Int = 0


    override fun acelerar() {
        velocidade += aceleracao
        println("$modelo acelerou para $velocidade km/h")
    }

    override fun desacelerar() {
        velocidade = if (velocidade >= desaceleracao) velocidade - desaceleracao else 0
        println("$modelo desacelerou para $velocidade")
    }

    override fun velocidadeAtual(): Int = velocidade
}
