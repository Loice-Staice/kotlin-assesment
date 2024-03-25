import kotlin.math.pow

fun main(){
    count("Barnie bakes brown bagels and buns")
    println(4.0/3.0)
    isPalindrome("akirachix")

}
fun count(sentence:String){
    val words = sentence.split("b")
    println(words)
}
fun calculate(radius: Double): Double {
    val pi = 3.14159
    return (4.0 / 3.0) * pi * radius.pow(3)
}
fun isPalindrome(word: String): Boolean {
    val r = word.reversed()
    return word == word.reversed()
}
