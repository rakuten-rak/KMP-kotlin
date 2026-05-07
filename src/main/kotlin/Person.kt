open class Person(
    age: Int, // param
    val firstName: String, // prop
    val lastName: String, // prop
){
    // init block helps to validate our constructor
    init {
        check(age > 0){
            "A person age can not lesser than 0 or negative"
        }
    }
    val age:Int = age;
    open fun printName() = println("${firstName} ${lastName}")


}