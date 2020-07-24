package br.com.validasenha.controller

import br.com.validasenha.data.InputSenha
import br.com.validasenha.validate.Validate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SenhaController : Validate() {


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
    @GetMapping("/validar/senha")
    fun validarSenha(@RequestParam(value = "senha", defaultValue = "") senha: String) =
        InputSenha(validar(senha));



}




