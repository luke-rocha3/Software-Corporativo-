package ifpe.edu.br.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

     @GetMapping("/")
    public String hellooWorld() {
        return "Hello World!!";
    }
}
