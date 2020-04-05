package com.stefanini.dao.test;

import static org.junit.Assert.assertFalse;

import java.util.stream.Stream;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.stefanini.dao.PessoaPerfilDao;
import com.stefanini.model.PessoaPerfil;

import mockit.Injectable;
import mockit.Tested;

public class TestPessoaPerfilDao {
	@Injectable
	EntityManager em;
	
	
	@Tested
	PessoaPerfilDao pessoaPerfilDao;
	
	@Injectable
	PessoaPerfil pessoaPerfil;
	
	@Test
	public void testPessoaPerfilDao() {
		Stream<PessoaPerfil> pessoaPerfil = pessoaPerfilDao.buscarPessoaPerfil(1L,1L);
	    assertFalse(pessoaPerfil.isParallel());
	}
}
