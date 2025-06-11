package com.gateway.redireccion.soporte;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoporteRedireccionController {

    @GetMapping("/soporte/redirect")
    public String redirect() {
        return "Redireccionando al microservicio de soporte";
    }
}
