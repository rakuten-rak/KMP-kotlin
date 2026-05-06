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

    // Parsing a list of a data from a file

    print("Enter the name of the file:")
    val inputName = readLine() ?: ""

    val inputFileName = File(inputName)
   val rawFile =  inputFileName.readLines()
    val formatedFile = rawFile.map {
        val splitForm = it.split(":")
        splitForm[0] to splitForm[1]
    }

    val finalScore = formatedFile.sortedByDescending { it.second }.take(3)

    val filePath = File("sorted-score.txt").toPath()
    val finalOutputScore = finalScore.map { "${it.first}:${it.second}" }

    filePath.writeLines(finalOutputScore)



}