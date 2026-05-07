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
}