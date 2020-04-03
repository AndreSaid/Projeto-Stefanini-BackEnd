package com.stefanini.dao;

import java.util.Optional;

import javax.persistence.TypedQuery;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class EnderecoDao extends GenericDao<Endereco, Long> {

	public EnderecoDao() {
		super(Endereco.class);
	}
	
	/**
	 * Efetuando busca de Endereço por pessoa
	 * @param pessoa
	 * @return
	 */
	/*public Optional<Endereco> buscarEnderecoPorPessoa(String pessoa){
		TypedQuery<Endereco> q2 =
				entityManager.createQuery(" select p from Endereco p where p.pessoa=:pessoa", Endereco.class);
		q2.setParameter("pessoa", pessoa);
		return q2.getResultStream().findFirst();
	}*/
	
}
