package com.example.hileydson.luiz.controller;

import com.example.hileydson.luiz.entity.Cliente;
import com.example.hileydson.luiz.service.impl.ClienteServiceImpl;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping("/helloBuscar")
    public String buscar(@RequestParam(name = "fname") String nome) {

        List<Cliente> clientesEncontrados = clienteService.getClienteByNome(nome);

        JSONObject clienteJson = null;
        if(!clientesEncontrados.isEmpty()){
            clienteJson = new JSONObject(clientesEncontrados.get(0));//EXEMPLO, PEGO O PRIMEIRO E IGNORO OS OUTROS REGISTROS
        }

        return !clientesEncontrados.isEmpty() ? clienteJson.toString() : "null";
    }

}
