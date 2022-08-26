package com.udemy.loja.dao;

import java.util.List;

import com.udemy.loja.models.Funcionario;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

}
