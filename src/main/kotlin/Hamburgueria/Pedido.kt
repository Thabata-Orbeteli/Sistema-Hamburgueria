package Hamburgueria

open class Pedido{

    fun pedidoCliente() {
        println("MENU")
        println("Escolha uma opção deliciosa abaixo:")
        println("1 - Combo Salada (x-salada,batata frita,refrigerante lata) ")
        println("2 - Combo Chicken (steak de frango,batata frita,refrigerante lata)")
        println("3 - Combo Tudão (x-tudo,batata frita,refrigerante lata)")
        println("4 - Combo Cheddar (hambúrger,batata frita com cheddar,refrigerante lata)")
        println("5 - Combo Veggie (hambúrguer de soja, batata frita,refrigerante lata")
        println("6 - Sair")
        var opcao = readLine()!!.toInt()

        if (opcao < 1 || opcao > 6) {
            println("\nOPÇÃO INVALIDA!!!!\n")

        } else {

            when (opcao) {

                1 -> {
                    println("Você escolheu o Combo Salada")
                    pagamentoCliente()
                }
                2 -> {
                    println("Você escolheu o Combo Chicken")
                    pagamentoCliente()
                }
                3 -> {
                    println("Você escolheu o Combo Tudão")
                    pagamentoCliente()
                }
                4 -> {
                    println("Você escolheu o Combo Tudão")
                    pagamentoCliente()
                }
                5 -> {
                    println("Você escolheu o Combo Veggie")
                    pagamentoCliente()
                }
                6 -> println("Sair")
            }

            while(opcao ==6){
            println("Obrigado!")
            break
        }
        }
    }

    fun pagamentoCliente() {
        println("Escolha uma opção de pagamento:")
        println("1 - Dinheiro")
        println("2 - Cartão ou Pix")
        println("3 - Cancelar")
        var opcao = readLine()!!.toInt()

        if (opcao < 1 || opcao > 6) {
            println("\nOPÇÃO INVALIDA!!!!\n")

        } else {

            when (opcao) {
                1 -> troco()
                2 -> cartao()
                3 -> cancelar()
            }
        }
    }


    fun sair() {
        println("Obrigado!")

    }

    fun cancelar() {
        println("Pedido Cancelado!")
    }

    fun troco() {
        println("Você vai precisar de troco?")
        println("Informe a opção: ")
        println("1 - Sim")
        println("2 - Não")
        var opc = readLine()!!.toInt()

        when (opc) {
            1 -> println("Sim")
            2 -> println("Não")
        }
        println("Hamburgueria.Pedido recebido!")
        println("Lembre de pagar na entrega!")

    }

    fun cartao() {
        println("Hamburgueria.Pedido recebido!")
        println("Lembre de pagar na entrega!")
    }




}


