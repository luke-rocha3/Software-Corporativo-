package ifpe.edu.br.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String hellooWorld() {
        return "Hello World!!";
    }

    @GetMapping("/param")
    public String helloWorld(@RequestParam String nome) {
        return "Hello, " + nome + "!";
        //http://localhost:8080/api/hello/param?nome=Joao

    }

    @GetMapping("/path/{nome}")
    public String helloWorldPath(@PathVariable String nome) {
        return "Hello, " + nome + "!";
        //http://localhost:8080/api/hello/path/?

    }

}
