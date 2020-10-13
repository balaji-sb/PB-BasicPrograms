package programs.kotlin

class FibonacciSeries {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){
            val value=6
            for(i in 0 until value ){
                print("${findFibonacci(i)} ")
            }
        }

        private fun findFibonacci(value:Int):Int{
            if(value<=1)
                return value
            return findFibonacci(value-1)+ findFibonacci(value-2)
        }

    }

}