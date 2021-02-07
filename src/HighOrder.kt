fun main(){

val numbers = intArrayOf(1, 2, 3, 4, 100, 200, 300)

/* HIGH-ORDER FUNCTIONS ( SÃO FUNÇÕES QUE PODEM SER ARMAZENADAS
EM VARIÁVEIS E PODEM SER PASSADAS COMO ARGS ou RETORNA DE OUTRAS FUNÇÕES*/


 /** LAMBDA Expression SÃO FUNÇÕES que ñ sao declaradas, são passadas diretamente */
 /** Uma expressão LAMBDA é sempre cercada por chaves  conhecida como (FUNÇÃO ANONIMA) */

val sum = { x: Int, y: Int -> x + y}
println(sum(3, 7))

    numbers.fold(0 , {
            acc, i -> println("Acumulator: $acc, i = $i")
        val result = acc + i
        println("Resultado: $result" )
        result
    })

    val product = numbers.fold(0) { acc, i -> acc + i  }
    println(product)

    val intSum = numbers.fold(1, Int::plus)

    println(intSum)

    /** quando a função lambda tem apenas um
     * parametro pode ser usado IT e omitido o "->"
     * */
    println(numbers.filter { it > 10 })

   val sortedBt =  numbers
        .filter {
            it > 10
        }.sortedByDescending { it }

    println(sortedBt)

    fun sum(x: Int) = run { x + 10 }

    println(numbers.map { sum(it) })


}