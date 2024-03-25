import kotlin.math.pow

fun main(){
    val inputString = "Barnie bakes brown bagels and buns"
    val words = inputString.split("Barnie bakes brown bagels and buns")
    println(inputString)
    println(4.0/3.0)

}
fun calculate(radius: Double): Double {
    val pi = 3.14159
    return (4.0 / 3.0) * pi * radius.pow(3)
}
fun isPalindrome(str: String): Boolean {
    val reversedStr = str.reversed()
    return str == reversedStr
}
