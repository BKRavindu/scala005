def main(args: Array[String]): Unit = {
     import scala.io.StdIn

     def isEven(n: Int): Boolean = {
         if (n%2== 0) true
         else isOdd(n - 1)
    }

     def isOdd(n: Int): Boolean = {
         if (n%2 == 0) false
         else isEven(n - 1)
    }


     println("Enter a number:")
     val input = StdIn.readInt()

     val isEvenNumber = isEven(input)

     if (isEvenNumber) {
         println(s"$input is an even number.")
    } else {
         println(s"$input is an odd number.")
    }


}