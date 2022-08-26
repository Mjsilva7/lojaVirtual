package com.udemy.loja.models;

import java.util.List;

import javax.persistence.*;

import com.udemy.loja.domain.AbstractEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DEPARTAMENTOS")
@AllArgsConstructor
@NoArgsConstructor
public class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 100)
    private String nome;

    @OneToMany(mappedBy = "departamentos")
    private List<Cargo> cargos;
    
}
