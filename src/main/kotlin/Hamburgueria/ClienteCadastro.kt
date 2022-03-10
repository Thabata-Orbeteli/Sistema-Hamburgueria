package Hamburgueria

open class ClienteCadastro (){


    private var nome=String
    private var endereco=String
    private var telefone=String
    private var email=String


    fun nomeCliente():String{
        println("Digite o seu nome:")
        var nome=readLine()!!
        return(nome)
    }

    fun enderecoCliente():String{
        println("Digite o seu endereço:")
        var endereco=readLine()!!
        return(endereco)
    }

    fun telefoneCliente():String{
        println("Digite o seu telefone:")
        var telefone=readLine()!!
        return(telefone)
    }

    fun emailCliente():String{
        println("Digite o seu e-mail:")
        var email=readLine()!!
        return(email)
    }



}