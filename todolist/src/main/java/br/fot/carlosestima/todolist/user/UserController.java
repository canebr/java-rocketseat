package br.fot.carlosestima.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

/**
 * Modeificadores da classe (ou de um metodo) podem ser:
 * public
 * private
 * protected
 */
public class UserController {

    /**
     * Tipos de retorno dos métodos:
     * String - texto
     * Integer (int) - numeros inteiros
     * Double (double) - numero c casas decimal - 0.0000
     * Float (float) - numero c casas decimal - diferença p double - quant decimais
     * / precisão - 0.000
     * char - 1 caracter (A C )
     * Date - data
     * void - quando não queremos retorno, só q execute alguma lógica
     * entre outros
     */
    /*
     * Requisição virá de dentro do Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);

    }
}
