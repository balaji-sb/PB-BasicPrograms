package programs.kotlin

class PermutationCombination {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            findPermutation("ABC","")
        }

        fun findPermutation(value: String, result: String){
            if (value.isEmpty()) {
                println(result)
                return
            }
            value.indices.forEachIndexed { index, i ->
                val recurseString = value.substring(0, index) + value.substring(index + 1)
                findPermutation(recurseString, result + value[i])
            }
        }
    }

}