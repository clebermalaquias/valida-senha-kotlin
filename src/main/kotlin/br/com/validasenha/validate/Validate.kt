package br.com.validasenha.validate

import java.util.regex.Matcher
import java.util.regex.Pattern

open class Validate {

    fun validar(senha : String) : Boolean{
        var reg : String = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%^&*()-+])(?:([0-9a-zA-Z!@#\$%^&*()-+])(?!\\1)){9,}"

        val p: Pattern = Pattern.compile(reg)
        val m: Matcher = p.matcher(senha)
        return m.find()


    }
}