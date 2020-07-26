package br.com.validasenha.validate

import java.util.regex.Matcher
import java.util.regex.Pattern

open class ValidarSenha {

    var regex : String = "(\\w).*\\1+"

    val p: Pattern = Pattern.compile(regex)

    fun isValid(senha : String) : Boolean{
        var resultado = false
        if(senha =="" || senha.length <9)
            return false

        val m: Matcher = p.matcher(senha)

        if(!m.find())
            resultado =  true

        return resultado
    }

}