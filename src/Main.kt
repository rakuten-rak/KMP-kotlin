fun main(vararg  args: String){
    if (args.isEmpty()) {
    print("Please pass a argument to the command line or pass an args to the e" +
            "edit configuration");
    }
    println("the first arg is ${args[0]}");

    for (arg in args) println(arg)
}