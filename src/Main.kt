import java.io.File

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
}