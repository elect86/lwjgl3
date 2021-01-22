package lwjgl

class Javac(
    var sourcepath: String = "",
    var debug: String = "yes",
    var source: String? = null,
    var target: String? = null,
    var encoding: String = "UTF-8",
    val args: ArrayList<String> = ArrayList()) {
}