package com.jesieljardim.repository;

import java.util.List;

import org.springframework.data.repository.Repository;


import com.jesieljardim.model.PessoaModel;

public interface PessoaRepository extends Repository<PessoaModel, Integer> {

	void save(PessoaModel pessoa);
	
	void delete(PessoaModel pessoa);
	
	List<PessoaModel> findAll();
	
	//PessoaModel findOne(Integer codigo);
	
	PessoaModel findByCodigo(Integer codigo);
}
