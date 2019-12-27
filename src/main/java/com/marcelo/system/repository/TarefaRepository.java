package com.marcelo.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.system.domain.TarefaDomain;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaDomain, Long> {

}
