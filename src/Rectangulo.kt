class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(base > 0) {"La base debe ser mayor que 0."}
        require(altura > 0) {"La altura debe ser mayor que 0."}
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Base: $base, Altura: $altura, Área: ${this.calcularArea()}, Perímetro: ${this.calcularPerimetro()}"
    }
}