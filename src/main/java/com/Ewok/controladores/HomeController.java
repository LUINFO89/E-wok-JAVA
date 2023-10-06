

package com.Ewok.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String mostrarPaginaInicio() {
        return "index"; // Devuelve el nombre de la plantilla HTML (sin .html)
    }
}

