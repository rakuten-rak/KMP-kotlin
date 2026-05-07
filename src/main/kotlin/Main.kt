import kotlin.reflect.typeOf


fun main(){


    // object class
    NetworkConfig.getNetworkDetail()

    val network = object :NetworkInfoProvider {
        override fun getNetworkDetail() {

        }
    }
}