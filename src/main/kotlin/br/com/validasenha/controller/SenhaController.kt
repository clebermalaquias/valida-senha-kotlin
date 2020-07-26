package br.com.validasenha.controller

import br.com.validasenha.data.Senha
import br.com.validasenha.validate.ValidarSenha
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SenhaController : ValidarSenha() {

    @GetMapping("/validar/senha")
    fun requestSenha(@RequestParam(value = "senha", defaultValue = "") senha: String) =
        Senha(isValid(senha));

}




