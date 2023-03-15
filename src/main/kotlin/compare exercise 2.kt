fun main(args: Array<String>) {
    println("Select plan by entering a relevant number.")
    var option:Int = readLine()!!.toInt()

    if (option == 0){
        print("Sh20 = 1GB for 1hr")
    }
    if (option == 1){
        print("Data Deals")
    }
    if (option == 2){
        print("Daily Bundles")
    }
    if (option == 3){
        print("Weekly Bundles")
    }
    if (option == 4){
        print("GO MONTHLY")
    }
    if (option == 5){
        print("No Expiry")
    }
    if (option == 6){
        print("Video Bundles")
    }
    if (option == 7){
        print("Okoa Data")
    }
    if (option == 8){
        print("Lipa Mdogo")
    }
    if (option == 9){
        print("Data Plus NEW")
    }
    if (option == 10){
        print("Hot Minutes")
    }
    if (option == 98){
        print("MORE")
    }
    else{
        print("Invalid Entry")
    }
}