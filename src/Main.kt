import java.util.Collections.max

fun main(){

  fun printLong(number: Long) { println(number)}

   val one      = 1
   var oneL     = 1L

    for(i in 1..3){
        // one += i  // Quando é Declarado com VAL a variável vira uma CONSTANTE, ou seja ela é imutável;
        oneL += 1 // Quando é declarada com VAR o valor da variável pode ser alterado;
    }

    //printLong()

    println("For INCREMENTADO DE 2 EM 2")
    for (i in 1..10 step 2){ // For com o I sendo incrementado de 2 EM 2
        println(i)
    }

    println("FOR DECRESCENTE:")
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    println("For UNTIL:")
    for(i in 1 until 10){
        println(i)
    }

   fun whenUseCase(array: IntArray){

       fun getPar(number: Int){
           when(number % 2){
              0 -> println("Número: $number é par")
              else -> println("Número: $number é impar")
           }
       }

       fun isInRange(number: Int){
           when(number){
               in 1..10 -> println("Número: $number está na range")
               !in 1..10 -> println("Número: $number não está na range")
               else -> println("Nenhuma das opções acima")
           }
       }

      /* loop@*/ for(i in array){
           getPar(i)
           isInRange(i)

           /* if (i > 50)  break@loop */
       }
   }
    val numbers = intArrayOf(1, 2, 3, 4, 100, 200, 300)
    whenUseCase(numbers)


/* HIGH-ORDER FUNCTIONS ( SÃO FUNÇÕES QUE PODEM SER ARMAZENADAS
EM VARIÁVEIS E PODEM SER PASSADAS COMO ARGS ou RETORNA DE OUTRAS FUNÇÕES*/



 /** LAMBDA Expression SÃO FUNÇÕES que ñ sao declaradas, são passadas diretamente */
 /** Uma expressão LAMBDA é sempre cercada por chaves */

    val otherSum = { x: Int, y: Int -> x + y}
    println(otherSum(3, 7))

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

    /** Collections */

    val mutable = mutableListOf(1, 22, 44, 22, "oi", "alou")

    val mutableString = mutableListOf<String>("oi", "eita", "tudo", "pbsoft")

    mutable.add(1)
    println(mutable)

    mutableString.add("TJ")

    val listOfPerson = mutableListOf<Person>()

    listOfPerson.add(Person(1, "Ricardo", "Batista", 12))
    listOfPerson.add(Person(2, "Ihaguin", "Alenk", 12))


    println(listOfPerson)

    println(listOfPerson.map { it.firstName })

}