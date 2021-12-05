fun main(args: Array<String>) {
    val amount = 150000
    val commission = amount / 100 * 0.75
    var result = commission.toInt()

    if(commission < 3000){
        var result = 3000
    }
    println("Коммисия ровна: " + result / 100 + "." + result % 100 + " руб.")

}