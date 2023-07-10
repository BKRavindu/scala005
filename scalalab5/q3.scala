def main(args: Array[String]): Unit = {
     import scala.io.StdIn

      def sum(n: Int): Int = {
         if (n <= 0) 0
         else n + sum(n - 1)
    }

      
     println("Enter a number:")
     val input = StdIn.readInt()

     val result = sum(input)

     println(s"The sum of numbers from 1 to $input is: $result")

}