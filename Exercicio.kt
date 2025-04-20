package com.example.classe

fun main() {
    val carro = Carro("Volvo V40")
    carro.acelerar()
    carro.desacelerar()
    println("Velocidade atual: ${carro.velocidadeAtual()} km/h")
}

abstract class Veiculo(open val modelo: String) {
    var velocidade: Int = 0
    abstract val aceleracao: Int
    abstract val desaceleracao: Int

    fun acelerar() {
        velocidade += aceleracao
        println("$modelo acelerou para $velocidade km/h")
    }

    fun desacelerar() {
        velocidade = if (velocidade >= desaceleracao) velocidade - desaceleracao else 0
        println("$modelo desacelerou para $velocidade")
    }

    fun velocidadeAtual(): Int = velocidade
}

class Carro(modelo: String) : Veiculo(modelo) {
    override val aceleracao = 100
    override val desaceleracao = 10
}

