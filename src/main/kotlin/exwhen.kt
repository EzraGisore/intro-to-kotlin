fun main(args: Array<String>) {
    print("Enter USSD:")
    var ussd: Int = readLine()!!.toInt()
    println("Enter number to select data plan")
    if (ussd == 544){
        var number: Int = readLine()!!.toInt()

        when (number) {
            0 -> println("1.5GB for 3 hours @Ksh50")
            2 -> println("Amazing + Bazu data")
            3 -> println("Tubonge + ALLNET")
            4 -> println("UnlimiNET Combo")
            5 -> println("Kopa")
            6 -> println("Gift Bundle")
            7 -> println("Special offers")
            8 -> println("Roaming")

            else -> println("Invalid MMI")
    }



    }
}

