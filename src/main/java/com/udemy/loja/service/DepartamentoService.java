package com.udemy.loja.service;

import java.util.List;

import com.udemy.loja.models.Departamento;

public interface DepartamentoService {
    
    void salvar(Departamento departamento);
    void editar(Departamento departamento);
    void excluir(Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarTodos();
}
