fun main(args: Array<String>) {
    for (range in 1..100)


        if (range % 3 == 0){
            println("$range - Fizzbuzz")
        }
        else if (range % 5 == 0){
            println("$range - buzz")
        }
        else if (range % 15 == 0){
            println("$range - Fizz")
        }
        else{
            println("$range Not Divisible")
        }
}