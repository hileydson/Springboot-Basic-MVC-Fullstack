package com.example.hileydson.luiz.service;

import com.example.hileydson.luiz.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAllCliente();
    List<Cliente> getClienteByNome(String nome);
}
