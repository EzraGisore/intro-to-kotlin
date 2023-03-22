package OOP

class House(owner:String,bedrooms:String, price:Int,){
//Initialize class
    init{
        println("Owner is $owner")
        println("Number of bedrooms are $bedrooms")
        println("Price is $price")

    }

}
fun main(args: Array<String>) {
    var house_one = House("Mike Joe","2",70000000)
    var house_two = House("sharon","2",85000000)
    var house_three = House("Keith","2",65000000)
}
