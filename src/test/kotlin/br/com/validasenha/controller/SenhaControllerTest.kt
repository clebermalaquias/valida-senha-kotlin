package br.com.validasenha.controller

import org.assertj.core.api.Assert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.regex.Matcher
import java.util.regex.Pattern

@SpringBootTest
class SenhaControllerTest {


    /*

        Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

Nove ou mais caracteres
Ao menos 1 dígito
Ao menos 1 letra minúscula
Ao menos 1 letra maiúscula
Ao menos 1 caractere especial
Considere como especial os seguintes caracteres: !@#$%^&*()-+
Não possuir caracteres repetidos dentro do conjunto
Exemplo:

IsValid("") // false
IsValid("aa") // false
IsValid("ab") // false
IsValid("AAAbbbCc") // false
IsValid("AbTp9!foo") // false
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true


Testes de unidade / integração
Abstração, acoplamento, extensibilidade e coesão
Design de API
Clean Code
SOLID
Documentação da solução no README

     */

    var testeSenha1 : String = "" //false
    var testeSenha2 : String = "aa" //false
    var testeSenha3 : String = "AbTp9 fok" //false
    var testeSenha4 : String = "AAAbbbCc"//false
    var testeSenha5 : String = "ab" //false
    var testeSenha6 : String = "AbTp9!foo" //false
    var testeSenha7 : String = "AbTp9!foA" //false
    var testeSenha8 : String = "AbTp9!fok" //true

    //var reg: String = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%^&*()-+])(?:([0-9a-zA-Z!@#\$%^&*()-+])(?!\\1)){9,}"
    var reg: String ="//^((.)(?!2))\\1+\$//"

    //^.*[0-9a-zA-Z!@#$%^&*()-+]{9,}$ - falta caracter repetido
    val p: Pattern = Pattern.compile(reg)

    //var reg : String = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#\$%^&*()-+]).{9,}\$"


    @Test
    fun validarSenha1() {

        val m: Matcher = p.matcher(testeSenha1)
        var resultado : Boolean = false
        if(m.find())
            resultado = true
        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha2() {

        val m: Matcher = p.matcher(testeSenha2)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha3() {

        val m: Matcher = p.matcher(testeSenha3)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha4() {

        val m: Matcher = p.matcher(testeSenha4)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha5() {

        val m: Matcher = p.matcher(testeSenha5)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha6() {

        val m: Matcher = p.matcher(testeSenha6)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha7() {

        val m: Matcher = p.matcher(testeSenha7)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

    @Test
    fun validarSenha8() {

        val m: Matcher = p.matcher(testeSenha8)
        var resultado : Boolean = false
        if(m.find())
            resultado = true

        Assertions.assertEquals(true, resultado)
        println("o resultado foi: "+resultado)
    }


}





