package com.gateway.redireccion.reportes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportesRedireccionController {

    @GetMapping("/reportes/redirect")
    public String redirect() {
        return "Redireccionando al microservicio de reportes";
    }
}
