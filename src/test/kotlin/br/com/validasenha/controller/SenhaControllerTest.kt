package br.com.validasenha.controller

import org.assertj.core.api.Assert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.regex.Matcher
import java.util.regex.Pattern

@SpringBootTest
class SenhaControllerTest {

    var testeSenhaErro: String = "AbTp9!foA" //false
    var testeSenhaOK : String = "AbTp9!fok" //true

    var regex : String = "(\\w).*\\1+"

    var p : Pattern = Pattern.compile(regex)

    @Test
    fun validarSenhaOK() {

        val m: Matcher = p.matcher(testeSenhaOK)
        var resultado : Boolean = false
        if(!m.find())
            resultado = true
        Assertions.assertEquals(true, resultado)
        println("o resultado foi: "+resultado)
    }


    @Test
    fun validarSenhaErro() {

        val m: Matcher = p.matcher(testeSenhaErro)
        var resultado : Boolean = false
        if(!m.find())
            resultado = true
        Assertions.assertEquals(false, resultado)
        println("o resultado foi: "+resultado)
    }

}





