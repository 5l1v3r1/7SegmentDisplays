import java.io.File

fun main(args: Array<String>) {
    val longest = mutableListOf<String>()
    val invalid = ".*[gkmqvwxzio].*".toRegex()
    var maxlen = 0

    File("words.txt").forEachLine {
        if(it.length == maxlen) {
            if(!it.matches(invalid)) {
                longest.add(it)
            }
        } else if(it.length > maxlen) {
            if(!it.matches(invalid)) {
                longest.clear()
                longest.add(it)
                maxlen = it.length
            }
        }
    }

    longest.forEach(::println)
}
