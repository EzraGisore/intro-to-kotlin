fun main(args: Array<String>) {
    println("Enter Your Mass(kg)")
    var mass:Int = readLine()!!.toInt()
    println("Enter your height(m)")
    var height = readLine()!!.toDouble()
    var BMI = mass/(height * height)
    if (BMI <=18 ){
        println(BMI)
        println("Underweight")
    }
    else if(BMI <=29 ){
        println(BMI)
        println("Normal Weight")
    }
    else if(BMI <=34 ){
        println(BMI)
        println("Overweight")
    }
    else {
        println(BMI)
        println("Obese")
    }
}