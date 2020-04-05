package com.stefanini.dao.test;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;

import com.google.common.base.Optional;
import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;

import mockit.Injectable;
import mockit.Tested;

public class TestPerfilDao {
	@Injectable
	EntityManager entityManager;
	
	@Tested
	PerfilDao perfilDao;
	
	

	@Test
	
	public void BuscarPessoaPorNomeTest() {
		
		java.util.Optional<Perfil> perfil = perfilDao.buscarPessoaPorNome("qualquercoisa");
	    assertTrue(perfil.isEmpty());
		
		
	}
	
	
	
}
