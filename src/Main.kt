import java.io.File
import kotlin.io.path.writeLines

fun main(vararg  args: String){
    if (args.isEmpty()) {
    print("Please pass a argument to the command line or pass an args to the e" +
            "edit configuration");
    }
    println("the first arg is ${args[0]}");

    for (arg in args) println(arg)

    // user input
    print("enter some file:")
    val filename = readLine() ?: ""
    print("this is your file ${filename}")

    var isValidFile = File(filename).isFile
    if (isValidFile)  true;
    else false;

    // read and write

    val testScore= File("scores.txt")
    testScore.forEachLine{println(it)}

    var sortedReadLines = testScore.readLines().sorted()

    var outputFile = File("scoreOutput.txt").toPath()
//    outputFile.writeText(sortedReadLines.toString())
    outputFile.writeLines(sortedReadLines)

}