package dev.arydalex.ApiRegioes.geo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoController {

    @GetMapping("/regiao/{token}")
    public String getRegiao(@PathVariable String token) {
        return "Regioes do Estado";
    }

    @GetMapping("/home/{token}") //"/cidade"
    public String getCidade(@PathVariable String token) {
        return "Cidades da Regiao";
    }


}
