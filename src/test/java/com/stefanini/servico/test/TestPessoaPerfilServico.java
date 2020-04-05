package com.stefanini.servico.test;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.stefanini.dao.PessoaPerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.model.PessoaPerfil;
import com.stefanini.servico.PessoaPerfilServico;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;

public class TestPessoaPerfilServico {

	@Injectable
    EntityManager em;

	@Tested
	PessoaPerfilServico pessoaPerfilServico;


	@Injectable
    @Mocked
	PessoaPerfilDao pessoaPerfilDao;

	@Tested
	PessoaPerfil pessoaPerfil;

	private Long id;



	  @Test

	    public void BuscarPessoaPerfilTest() {




	        Stream<PessoaPerfil> pessoaPerfil = pessoaPerfilDao.buscarPessoaPerfil(1L,1L);
	        assertTrue(pessoaPerfil.isParallel());


	    }




	  @Test

	    public void BuscarPessoaPerfilTest2() {

		  new Expectations() {{
				pessoaPerfilDao.buscarPessoaPerfil(1L,1L);
				PessoaPerfil result = pessoaPerfil;
				}
			};



	    }



}
