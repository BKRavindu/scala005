def main(args: Array[String]): Unit = {
    import scala.io.StdIn

     def sumEven(n: Int): Int = {
         if (n <= 0) 0
         else if (n % 2 == 0) n + sumEven(n - 2)
         else sumEven(n - 1)
    }

     
    println("Enter a number:")
    val input = StdIn.readInt()

    val result = sumEven(input)

    println(s"The sum of all even numbers less than $input is: $result")


}