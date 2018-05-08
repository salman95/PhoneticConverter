import kotlin.collections.Collection

fun main (args: Array<String>) {


    val alphas: Collection<String> = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India",
            "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform",
            "Victor", "Whiskey", "X-ray", "Yankee", "Zulu")
    val letterList: Collection<String> = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

    println("Type letters to convert into phonetic alphabet")
    val letter = readLine()

    if(letterList.contains(letter)) {
        val i = letterList.indexOf(letter)
        println(alphas.elementAt(i))

    }






}