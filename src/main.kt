import kotlin.random.Random

fun main(){

    val randomNumber= Random.nextInt(10)

    println("\nFind The Correct Answer:\n")

    var num1=enterNumber("First")
    var num2=enterNumber("Second")
    var X:Int

    val answer=num1*randomNumber+num2

    while(true) {
        try {
            println("$num1*X+$num2 = $answer")
            print("What is X? >> ")
            X = readLine()!!.toInt()
            if(X==randomNumber)
                println("You Got It!!")
            else
                println("Wrong Answer.\nThe Correct Answer is: $randomNumber")
            break
        }
        catch(e:Exception){
            println("Please Enter Numbers Only\n")
        }
    }
}

fun enterNumber(str:String): Int {
    var num:Int
    while(true) {
        try {
            print("Enter The $str Number: ")
            num = readLine()!!.toInt()
            return num
        }
        catch(e:Exception){
            println("Please Enter Numbers Only\n")
        }
    }
}