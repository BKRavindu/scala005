import scala.io.StdIn

     def fibonacci(n: Int): List[Int] = {
         if (n <= 0) List()
         else if (n == 1) List(0)
         else if (n == 2) List(0, 1)
         else {
             val fibSeq = fibonacci(n - 1)
             fibSeq :+ (fibSeq(n - 2) + fibSeq(n - 3))
            }
     }

def main(args: Array[String]): Unit = {
     println("Enter the value of n:")
     val n = StdIn.readInt()

     val fibonacciSeq = fibonacci(n)
     println(s"The first $n Fibonacci numbers are: ")
     fibonacciSeq.foreach(num => print(s"$num "))
}
