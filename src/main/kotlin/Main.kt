import Hamburgueria.ClienteCadastro
import Hamburgueria.Cliente1
import Hamburgueria.Pedido

fun main() {

    println("Bem -vindo a Hambúrgueria DEV BURGUERS!")
    var etapa1 = ClienteCadastro()
    println("\n")

    etapa1.nomeCliente()
    etapa1.telefoneCliente()
    etapa1.emailCliente()
    etapa1.enderecoCliente()

    var etapa2=Cliente1()
    etapa2.exclusivo()

    println("\n")
    var etapa3 = Pedido()
    etapa3.pedidoCliente()
    println("\n")

}