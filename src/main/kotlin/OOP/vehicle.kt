package OOP

class Vehicle(type:String, brand:String,model:String,price:Int,owner:String ){
    init {
        println("Vehicle type is $type")
        println("Vehicle brand is $brand")
        println("Vehicle model is $model")
        println("Vehicle price is $price")
        println("Owner's name is $owner")
    }
}

fun main(args: Array<String>) {
    var vehicle_one=Vehicle("SUV","Mazda","CX-5", 4500000,"Edgar Musee")
    var vehicle_two=Vehicle("Van","Nissan","pavillion", 2500000,"David Iluvya")
    var vehicle_three=Vehicle("SUV","Toyota","Crown", 6500000,"joshua Opati")
}