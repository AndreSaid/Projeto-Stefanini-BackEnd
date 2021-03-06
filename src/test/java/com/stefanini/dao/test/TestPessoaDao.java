package com.stefanini.dao.test;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.stefanini.dao.PessoaDao;
import com.stefanini.model.Pessoa;


import mockit.Injectable;
import mockit.Tested;

public class TestPessoaDao {
	
	@Tested
	PessoaDao pessoaDao;
	
	@Injectable
	EntityManager entityManager;
	

	@Test
	
	public void BuscarPessoaPorEmailTest() {
		
		Optional<Pessoa> pessoa = pessoaDao.buscarPessoaPorEmail("qualquercoisa");
	    assertTrue(pessoa.isEmpty());
		
		
	}
	
	
	@Test
	public void GetPessosa() {
		
		List<Pessoa> pessoa = pessoaDao.getPessoaCheia();
	    assertTrue(pessoa.isEmpty());
		
		
	
	}
	
	@Test
	public void GetPessoa() {
		java.util.List<Pessoa> pessoa = pessoaDao.getPessoaCheia();
		assertTrue(pessoa.isEmpty());
	}
	
	
}
