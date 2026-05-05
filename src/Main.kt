

fun main () {
    val ints = arrayOf(1,2,3,4,5) // not nullable;
    val arrayOfNull = arrayOfNulls<Int>(10);
    val arr = Array(5){index -> index}
    val sizeOfArray = ints.size;

    val getArray = ints.get(2);
    val setArray = ints.set(2,66)

    val primitiveInts = intArrayOf(1,2,2,3,4)
    val primitiveUnsignedShort = ushortArrayOf(1u,2u,3u,5u)

    ints.forEach { println(it)


    }

}

fun greetingOfArray(greet: String,vararg items:Any){
    // the varag helps us not to pass in array class and define and object for us
    items.forEach { "" +
            "$greet $it" }


    // List...
    val listOfString: List<String> = listOf<String>("kotlin","code","perfect")
    val emptyStringLists = emptyList<String>()
    val language = mutableListOf("kotlin","java")

    // Sets and Maps...

    val aSettype = setOf<String>("c++","python","kotlin")
    val aMutableSetType = mutableSetOf<Int>(1,2,3,4,5)
    aMutableSetType.add(4);
    val changeTheaMutableSetType: MutableSet<Int> = mutableSetOf(1,2,3,4,5,6,7)
    changeTheaMutableSetType.add(4);

//    val testScore = mapOf(Pair("lang","js"), Pair(1,3),"new" to "c++")
    val testScore = mutableMapOf(Pair("lang","js"), Pair(1,3),"new" to "c++")

    testScore.keys.forEach { it
    }
//    val testScoreMutable = mutableMapOf(testScore)
testScore["lang"] = "language"
    testScore.put(222,33.5)
    testScore.replace(1,10)

    val groupCollection = mapOf("java" to 4,"c++" to 6,"python" to 9,"javascript" to 3)

    groupCollection.filter { it.value >= 4 }.map { it.key }.sorted().forEach { it }

    // Sequence

    val langSequence = sequenceOf("java","c++","kotlin")
    val langList = listOf(1,2,3).asSequence()
    // use case for sequence when you have a 1000 of list
    // not use case when dealing with a small amount of list


}