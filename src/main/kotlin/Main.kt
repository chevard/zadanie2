import java.util.Scanner

fun main(args: Array<String>) {
    println("Введите количество лайков:")
   val scanner = Scanner(System. `in`)
val likes = scanner.nextInt();
    if (likes % 10 == 1){
        println("Понравилось " + likes + " человеку")
    }
    else {
        println("Понравилось " + likes + " людям")
    }
}