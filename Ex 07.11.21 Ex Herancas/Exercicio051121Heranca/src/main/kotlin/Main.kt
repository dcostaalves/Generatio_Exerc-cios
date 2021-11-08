import java.util.Collections.min
import kotlin.math.min

open class Employee (var firstName:String, var lastName: String, var registration: Int, var age: Int,
                     var daysWorked:Int, var vacationDaysTaken: Int, var salary: Double, var yearsWorked: Int ){

    //tempo até aposentar
    fun timeToRetirement(){
        var retirement = min(60-age,40-yearsWorked)
    }

    //tempo ate fim de férias
    fun vacationTimeLeft(){
        var timeLeft = ((daysWorked/360) * (30-vacationDaysTaken))
    }

    fun calculateBonus(){
        var bonus = 2.2*salary
        println("Seu Bonus é: R$ $bonus")
    }

}

class SalesRep(firstName: String,lastName: String,registration: Int,age: Int,
daysWorked: Int,vacationDaysTaken: Int,salary: Double,yearsWorked: Int,
var salesMade: Double):Employee(firstName, lastName, registration, age, daysWorked,
vacationDaysTaken,salary,yearsWorked){

    fun calculateComission(){
        var comission = (0.1*salesMade)
        println("Sua comissão é: R$ $comission")

    }

}

class SalesManager (firstName: String,lastName: String,registration: Int,age: Int,
                    daysWorked: Int,vacationDaysTaken: Int,salary: Double,yearsWorked: Int)
                     : Employee(firstName, lastName, registration, age, daysWorked,
                     vacationDaysTaken,salary,yearsWorked){

    //val teamLis = hashMapof<Int, SalesRep>
    val teamLis = HashMap<Int, SalesRep>()

    //fun addRepVendas(sales: SalesRep)
    //  teamList.put(sales.registration, sales)
    fun cadastrar(sales: SalesRep){
        teamLis.put(sales.registration, sales)
    }

    fun cadastrar(sales: List<SalesRep>){
        for(x in sales){
            teamLis.put(x.registration, x)
        }
    }

    //fun var allSales = 0.0
    //  if(teamList.isEmpty()){ //.isEmpty verifica se a lista esta vazia
    //      println("Não há representantes de vensdas na equipe")
    //  }else{
    //         for(item in temaList){
    //              allSales+= item.value.sales
    //          }
    //    val allComission = 0.03*allSales
    //  println("A comissão do Gerente= $allComission")
    //  }
    fun calculateComission(){
        var allSales = 0.0
        var allComission = 0.0
        for (y in teamLis){
            allSales+=y.value.salesMade
        }

        allComission=0.03*allSales
        println("A comissão do Gerente= $allComission")
    }


}

fun main(args: Array<String>) {

    val guilherme = SalesRep("Guilherme","Rasoppi", 6924,23, 369,
        5,3500.00,1,5000.00)

    val danilo = SalesRep("Danilo","Alves", 2469,30, 400,
        5,4500.00,1,4500.00)

    val gerente = SalesManager("Gerente","Brabo",1212,45,630,
        52,10000.00,5)


    val lista = mutableListOf(guilherme, danilo)

    gerente.cadastrar(lista)

    println("A qtde de funcionários cadastros é: ${gerente.teamLis.size}")

    gerente.calculateComission()



}