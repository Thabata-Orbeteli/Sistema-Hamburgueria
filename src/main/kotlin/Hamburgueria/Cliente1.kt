package Hamburgueria

open class Cliente1():ClienteCadastro() {

    private var nome=String
    private var endereco=String
    private var telefone=String
    private var email=String
    private var vip=Int

    fun brinde(){
        println("Você ganhou um Cupcake!")
        println("Bem vindo!")
    }

    fun exclusivo(){
        println("É sua primeira compra?")
        println("1 - Sim")
        println("2 - Não")
        var opc = readLine()!!.toInt()

        when (opc) {
            1 -> {
                println("Sim")
                brinde()
            }
            2 -> println("Não")
        }


    }



}