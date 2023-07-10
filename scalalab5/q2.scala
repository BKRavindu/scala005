 def main(args: Array[String]): Unit = {
     import scala.io.StdIn

       def primeSeq(n: Int): Boolean = {
            def isPrime(num: Int, divisor: Int): Boolean = {
                 if (divisor <= 1) true
                 else if (num % divisor == 0) false
                 else isPrime(num, divisor - 1)
            }

            if (n > 2) {
                primeSeq(n - 1)
                if (isPrime(n, n / 2)) print(s"$n ")
            }
  
            isPrime(n, n / 2)
        }


         println("Enter a number:")
         val input = StdIn.readInt()


         println("Prime numbers less than " + input + ":")
         primeSeq(input)
}