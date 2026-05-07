import kotlin.reflect.typeOf

interface StringProvider {
    fun  getString(num:Int): String

    fun placeHolder(id:Int): Long = id.toLong() // this works because kotlin we an initialize our prop method

}
class DefaultResourceProvider : StringProvider{
    override fun getString(num: Int): String {
        return ("id $num")
    }
    fun checkingType(){
        println("type of" + typeOf<String>())
    }

}
fun main(){
    var stringProvider:StringProvider = DefaultResourceProvider();
    print(stringProvider.getString(10))
    var df  = DefaultResourceProvider()
    df.checkingType()


}