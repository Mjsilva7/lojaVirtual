package com.udemy.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

import com.udemy.loja.dao.FuncionarioDao;
import com.udemy.loja.models.Funcionario;

@Service
// @Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;

    @Override
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
        
    }

    @Override
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
        
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
        
    }

    @Override
    // @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    // @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }
    
}
