//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }

    //val ourFirstVariable = true; // val in the contest of kotlin means readonly
    var ourFirstVariable = true;
    println(ourFirstVariable)
    ourFirstVariable = false;
    println(ourFirstVariable);

    println(ourFirstVariable === true)
    println(ourFirstVariable == false)

    val aInt:Int = 0;
    val anOtherInt = 0;

    val aByte: Byte = 0;
    val aShort:Short = 0;

    val aLong: Long  = 0;
    val inferredInt = 10;
    val inferredLong = 1000000;

    val anotherLong = 10L;
    val unsignedInt: UInt = 0U;

    val anotherUnsignedInt = 0U;
    val unsignedLong = 0UL;

    val aDouble:Double = 5.5;
    val aFloat:Float = 5F

    val inferredDouble = 5.5;
    val inferredFloat = 5.5F;

    println(10.5.toInt());
    10.9.toFloat();
    10.toULong();
    100_000_000.toByte();






}
