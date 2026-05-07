import kotlin.reflect.typeOf


fun main(){
val directions = Directions.EAST

    println(directions.name)
    println(directions.ordinal)

    val parsedApi = Directions.valueOf("SOUTH")
    println(directions.name)

    val valuesAPI = Directions.values()[1]

val color = HighlightColor.BLUES
    print(color.name)
//    print(color.values)

    // Data classes
    val data1 = Task("1","Feli")
    val data2  = Task("2","Nora")
    val data2copy = data2.copy()
    val (id,name) = data1;

    if(data1.name == data2.name) println("same")
    else println("not same")
 }