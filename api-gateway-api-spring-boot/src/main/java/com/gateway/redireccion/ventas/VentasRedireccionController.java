package com.gateway.redireccion.ventas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentasRedireccionController {

    @GetMapping("/ventas/redirect")
    public String redirect() {
        return "Redireccionando al microservicio de ventas";
    }
}
