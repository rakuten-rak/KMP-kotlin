object NetworkConfig : NetworkInfoProvider {
    val baseUrl = "https:google.com";
    val userAgent = "apps";
    override fun getNetworkDetail() {
        println("$baseUrl" + "and" + "$userAgent")
    }
}