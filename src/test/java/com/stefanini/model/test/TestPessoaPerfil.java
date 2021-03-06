package com.stefanini.model.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;

import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.model.PessoaPerfil;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;

public class TestPessoaPerfil {
	
	
    
	@Injectable
    EntityManager em;

    @Tested
    PessoaPerfil pessoaPerfil;

    @Test
    public void testPessoaPerfil1() {
        Long id = 1L;
        Long idPerfil = 1L;
        Long idPessoa = 1L;
        Perfil perfil = new Perfil();
        Pessoa pessoa = new Pessoa();
        pessoaPerfil = new PessoaPerfil();
    
        

        pessoaPerfil.setId(id);
        pessoaPerfil.setIdPerfil(idPerfil);
        pessoaPerfil.setIdPessoa(idPessoa);
        pessoaPerfil.setPerfil(perfil);
        pessoaPerfil.setPessoa(pessoa);
        

        Assert.assertEquals(pessoaPerfil.getId(), id);
        Assert.assertEquals(pessoaPerfil.getIdPerfil(), idPerfil);
        Assert.assertEquals(pessoaPerfil.getIdPessoa(), idPessoa);
        Assert.assertEquals(pessoaPerfil.getPerfil(), perfil);
        Assert.assertEquals(pessoaPerfil.getPessoa(), pessoa);
        
        
        
        
        
        
    }
    
    @Test
    public void testConstrutor() {
    	
    	Perfil perfil = new Perfil();
        Pessoa pessoa = new Pessoa();
        pessoaPerfil = new PessoaPerfil(perfil,pessoa);
        
        
        Assert.assertEquals(pessoaPerfil.getPerfil(),perfil);
        Assert.assertEquals(pessoaPerfil.getPessoa(),pessoa);
        
    	
    	
    	
    	
    }

}
