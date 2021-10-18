import kotlin.random.Random
import kotlin.random.nextInt

/*fun main(args: Array<String>) {
    var name = "raghad"
    var poingame = readLine()!!.toDouble()
    println(poingame)

    if (poingame == 100.0 ) println(name + " you are haker ")
    else if (poingame >= 60 ) { println(name + " you are excellent ")}
    else if (poingame >= 50 ) {name + "you "}
    else
    {
        println(name + " tray again ")}


}
*/
//=============================================
//anonymous function
/*val isurgent : (age: Int) -> Boolean ={ age->
    age>=65}

fun main() { //anonymous function
    // or create function inside main exactly like the outside
    // if i create parameter then inetilis it with expression the result it will be boolean like - val age = age>=65
    val age = readLine()!!.toInt()

    println(isurgent(age)) //i can but the number of age direct in isurgent(30) without variable age
    /* or
 var result =isurgent(age)
    println(result) */
} */

//============================================

// like anonymous function the examole in the up but return string and take age and name
/*
val isurgent: ( Int, String) -> String ={ age,name ->
    if (age>= 65){
        "$name" + "is aurgent "// in lambda no need to but printlin
    }
    else {
        "$name"+"is not aurgent"
    }
}

    fun main() {

        val age = readLine()!!.toInt()
        val name = readLine()!!.toString()

        println(isurgent(age, name))
    }*/
//defining a function that accepts a function page 75

fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }
    runSimulation("Guyal", greetingFunction)
}
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = Random.nextInt(1..3)   // Randomly selects 1, 2, or 3
    println(greetingFunction(playerName, numBuildings))

}