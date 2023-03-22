fun main(args: Array<String>) {
    multiplication()
    add()
}
fun multiplication(){
    print("Enter first value")
    var num1:Int = readLine()!!.toInt()
    print("Enter second value")
    var num2:Int = readLine()!!.toInt()
    var result:Int = num1 * num2
    println(result)
}
fun add(){

    print("Enter first value")
    var num3:Int = readLine()!!.toInt()
    print("Enter second value")
    var num4:Int = readLine()!!.toInt()
    var result:Int = num3 + num4
    println(result)
}


