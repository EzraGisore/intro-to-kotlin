fun main(args: Array<String>) {
    println("Enter your score.")
    var score:Int = readLine()!!.toInt()
    if (score in  80..100){
        var grade = "A"
        print("Grade - ")
        println(grade)
        print("Astounding Performance")
    }
    if (score in 70..79){
        var grade = "A-"
        print("Grade - ")
        println(grade)
        print("Very Good")
    }
    if (score in 60..69){
        var grade = "B"
        print("Grade - ")
        println(grade)
        print("Good")
    }
    if (score in 50..59){
        var grade = "C"
        print("Grade - ")
        println(grade)
        print("Average")
    }
    if (score in 40..49){
        var grade = "D"
        print("Grade - ")
        println(grade)
        print("Bellow Expectation")
    }
    if (score <30) {
        var grade = "E"
        print("Grade - ")
        println(grade)
        print("Fail. Required to retake the Examination.")
    }
    if (score >100){
        print("Invalid Entry!")
    }


}
