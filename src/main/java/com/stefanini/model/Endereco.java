package com.stefanini.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable {



    /**
     * Serializacao da Classe
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID da Tabela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_ENDERECO")
    private Long id;

    @Column(name = "DS_CEP")
    private String cep;

    @Column(name = "CO_UF")
    private String uf;

    @Column(name = "DS_CIDADE")
    private String localidade;

    @Column(name = "DS_BAIRRO")
    private String bairro;

    @Column(name = "DS_COMPLEMENTO")
    private String complemento;

    @Column(name = "DS_LOGRADOURO")
    private String logradouro;
    /**
     * Unidirecional
     * Somente Pessoa acessa endereco
     */
   @Column(name = "CO_SEQ_PESSOA")
    private Long idPessoa;

    /* @ManyToOne
    @JoinColumn(name = "co_seq_pessoa", referencedColumnName = "co_seq_pessoa", nullable = true)
    private Pessoa pessoa;
   
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
 	 @JoinTable(
 			name = "TB_PESSOAS",
 			joinColumns = {@JoinColumn(name = "CO_SEQ_PESSOA")},
 			inverseJoinColumns = {@JoinColumn(name = "CO_SEQ_PESSOA")}
 	)
 	private Set<Pessoa> pessoas = new HashSet<>();*/
     
   


	public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
   }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", localidade='" + localidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", logradouro='" + logradouro  + '\'' +
                ", idPessoa=" + idPessoa +
                '}';
    }
    
    public Endereco( String cep,  String uf, String localidade,
    		String bairro, String complemento,String logradouro) {
		super();
		this.cep = cep;
		this.uf = uf;
		this.localidade = localidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.logradouro = logradouro;
	}

}
