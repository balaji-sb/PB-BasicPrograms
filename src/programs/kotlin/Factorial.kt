package programs.kotlin

class Factorial {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){
            print(factorial(4))
        }

        private fun factorial(value: Int): Int {
            if (value <= 1) return value
            return value * factorial(value - 1)
        }
    }


}