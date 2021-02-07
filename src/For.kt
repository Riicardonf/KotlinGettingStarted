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
}