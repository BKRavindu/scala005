
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def isPrime(n: Int): Boolean = {
      def isPrimeUtil(divisor: Int): Boolean = {
        if (divisor <= 1) true
        else if (n % divisor == 0) false
        else isPrimeUtil(divisor - 1)
      }

      isPrimeUtil(n / 2)
    }

    println("Enter a number:")
    val input = StdIn.readInt()

    val result = isPrime(input)

    println(s"$input is prime: $result")

  }
