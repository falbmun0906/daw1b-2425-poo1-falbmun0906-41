/* Ejercicio 4.1
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.

*/

fun main() {

    val rectangulos: Map<String, Pair<Double, Double>> = mapOf(
        "rect1" to Pair(5.0, 3.0),
        "rect2" to Pair(7.0, 4.0)
    )
    val objetosRectangulo: MutableMap<String, Rectangulo> = mutableMapOf()

    for ((nombre, dimensiones) in rectangulos) {
        try {
            val (base, altura) = dimensiones
            objetosRectangulo[nombre] = Rectangulo(base, altura)
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }

    var cont: Int = 1
    for (rectangulo in objetosRectangulo.keys) {
        if (objetosRectangulo[rectangulo]?.calcularArea() != null) {
            println("Área del rectángulo $cont: ${objetosRectangulo[rectangulo]?.calcularArea()}")
            println("Perímetro del rectángulo $cont: ${objetosRectangulo[rectangulo]?.calcularPerimetro()}")
            cont ++
        }
    }
}