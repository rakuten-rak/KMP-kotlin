fun main (){
    var someVariable = 0;
    when {
        someVariable > 3 -> println("value is greater than 3")
        someVariable > 2 -> println("value is greater than 3")
        else -> print("no value")


    }

    when (someVariable){
        0,1,4 -> print("the value was 0,1 abd 4") // range
        4 -> {print("the value is 2")}
        6 -> {print("the value is 6")}
        in 10..Int.MAX_VALUE -> print("the value is greater than 10")
        else -> print("None");

    }
}