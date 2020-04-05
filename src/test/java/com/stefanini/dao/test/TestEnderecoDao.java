package com.stefanini.dao.test;

import org.junit.jupiter.api.Test;

import com.stefanini.dao.EnderecoDao;
import com.stefanini.model.Endereco;

import mockit.Injectable;
import mockit.Mocked;

public class TestEnderecoDao {
	@Injectable
	EnderecoDao enderecoDao;
	
	@Injectable
	@Mocked
	Endereco endereco;
	
	@Test
	public void testEnderecoDao() {
		EnderecoDao dao = new EnderecoDao();
	}
}
