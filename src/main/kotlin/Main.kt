import kotlin.math.min

fun main() {
//    invoking function from question 4
   inputName("Alice", "Grace", "Carol")
    createStrings("Joan","Clarine","Christine","Angela")
    numerals()
    places()
}
//    question 1
    fun createStrings(first:String,second:String,third:String,fourth:String) {
    val names = arrayOf(first,second,third,fourth)
    println(names.contentToString())
}
//    question 2
fun places() {
    val cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (city in cities){
        val capCities=city.capitalize()
        println(capCities.capitalize())
    }
}
//    question 3
fun numerals(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}

//    question 4
    fun inputName(name1:String,name2:String,name3:String):Array<String>{
    val jo = arrayOf(name1,name2,name3)
    return jo

}



