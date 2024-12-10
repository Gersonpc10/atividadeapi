package com.br.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.tarefa.tarefa.Tarefa;

@Repository
public interface TarefaRepository  extends JpaRepository<Tarefa, Long>{



}
