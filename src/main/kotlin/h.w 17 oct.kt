import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

  //Anonymous Functions
// 1)=================================================================================
   /* val countlitters = "missiisssbi".count({litter ->
        litter =='s'})
    println(countlitters)
    */


// 2)=================================================================================

    /*
    println({
        val currenyear =2021
        "welcome to haya world ($currenyear)"
    }() //when i do run without paranthes the massege for run it will be like "Function0<java.lang.String>"
    )

     */

//3)=================================================================================

    /*
      val greetingFunction: () -> String ={
        val currenyear =2021
        "welcome to haya world ($currenyear)"}
    println(greetingFunction())
    */


//4)=================================================================================

/* val greetingFunction: (String) -> String ={ playerName ->
        val currenyear =2021
        "welcome to haya world, $playerName ($currenyear)"
    }
    println(greetingFunction("saud"))*/


//5)=================================================================================
   /* val greetingFunction: (String) -> String ={
        val currenyear =2021
        "welcome to haya world, $it! ($currenyear)"
    }
    println(greetingFunction("saud"))*/


//6)=================================================================================
   /* val greetingFunction: (String, Int ) -> String ={ playerName, numBuildings ->
        val currenyear =2021
        println("adding $numBuildings houses")
        "welcome to haya world, $playerName! ($currenyear)"
    }
    println(greetingFunction("saud", 96))*/



//7)=================================================================================
  /*  val greetingFunction ={ playerName: String , numBuildings: Int ->
        val currenyear =2021
        println("adding $numBuildings houses")
        "welcome to haya world, $playerName! ($currenyear)"
    }
    println(greetingFunction("saud", 96))*/


    //8)=================================================================================
   /* val greetingFunction ={ playerName: String , numBuildings: Int ->
        val currenyear =2021
        println("adding $numBuildings houses")
        "welcome to haya world, $playerName! ($currenyear)"
    }
   rS("saud", greetingFunction)*/ // the "rs" function outside the main function



//=================================================================================



// point (9) and (10) after the main =======================================================
/*
    runSimulation("Guyal", ::printcons) { playerName, numBuildings ->
        val currentYear = 2021
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    */

//11)===================function type =================================================================================

/*   runSimulation()     */


    //12)=================================================================================================================
/*
fun runSim(){
    val greatingFUN = configGreatingFunction()
    println(greatingFUN("HAYA"))
    println(greatingFUN("HAYA"))
}*/

    //13)i don't under stand this code :( =================================================================================================================

   /* Greeting greeting = (, numBuildings) -> {
        int currentYear = 2018;
        System.out.println("Adding " + numBuildings + " houses");
        return "Welcome to SimVillage, " + playerName +
    };
    "! (copyright " + currentYear + ")";
    public interface Greeting {
        String greet(String playerName, int numBuildings);
    }*/



//14)exception code  =================================================================================================================

}





//======================this function related to point (8)and  point  (9)=================================================================================
/*fun rS(playerName: String, greetingFunction: (String, Int) -> String ) {
    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction(playerName, numBuildings))
}*/






//====================this tow functions related to points (11) and (12)=================================================================================
/*fun runSimulation() {
    val greetingFunction = configGreatingFunction()
    println(greetingFunction("Haya"))
}*/



//====================this tow functions related to points (11) and (12)===========================================

/*fun configGreatingFunction(): (String) -> (String){
    val stType = "hospital"

    return {pName: String ->
        val cury = 2021
        val numBuilding += 1
        println("Adding $numBuilding $stType")
        "welcom to simvillage, $pName! (copyright $cury"}*/
}

//9)&& 10) "inlining" //  i have related function for these points outside mani ==========================================================



inline fun rS(
    playerName: String
    costPrinter: (Int)-> Unit,
    greetingFunction: (String, Int) -> String
) {
    val numBuildings =Random.nextInt(1..3)
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}
fun printcons(numBuildings: Int){
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
