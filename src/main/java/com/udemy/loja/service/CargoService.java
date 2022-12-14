package com.udemy.loja.service;

import java.util.List;

import com.udemy.loja.models.Cargo;

public interface CargoService {
    
    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
}
