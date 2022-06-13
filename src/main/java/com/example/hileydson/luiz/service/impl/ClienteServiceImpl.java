package com.example.hileydson.luiz.service.impl;

import com.example.hileydson.luiz.entity.Cliente;
import com.example.hileydson.luiz.repository.ClienteRepositorio;
import com.example.hileydson.luiz.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> getAllCliente() {
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getClienteByNome(String nome){
        return clienteRepositorio.findByNome(nome);
    }
}
