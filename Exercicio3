package com.example.classe

fun main() {

    val listaDeVeiculos = mutableListOf<Veiculo>()

    val carro1 = VeiculoFactory.criarVeiculo("carro", "Volvo V40")
    val carro2 = VeiculoFactory.criarVeiculo("carro", "T-cross")

    val moto1 = VeiculoFactory.criarVeiculo("moto", "BMW C400GT")
    val moto2 = VeiculoFactory.criarVeiculo("moto", "BMW R 1300")

    listaDeVeiculos.add(carro1)
    listaDeVeiculos.add(carro2)
    listaDeVeiculos.add(moto1)
    listaDeVeiculos.add(moto2)


    for (veiculo in listaDeVeiculos) {
        veiculo.acelerar()
        println("${veiculo.modelo} esta a ${veiculo.velocidadeAtual()} km/h")
    }
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
    override val aceleracao = 90
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

object VeiculoFactory {
    fun criarVeiculo(tipo: String, modelo: String): Veiculo {
        return when (tipo.lowercase()) {
            "carro" -> Carro(modelo)
            "moto" -> Moto(modelo)
            else -> throw IllegalArgumentException("Tipo de veiculo desconhecido")
        }
    }
}
