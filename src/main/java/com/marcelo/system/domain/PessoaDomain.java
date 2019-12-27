package com.marcelo.system.domain;

import java.io.Serializable;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Calendar;
=======
<<<<<<< HEAD
=======
import java.util.Calendar;
>>>>>>> features
>>>>>>> master
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PessoaDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private String email;

<<<<<<< HEAD
=======
<<<<<<< HEAD
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa", fetch = FetchType.EAGER)
	private List<TarefaDomain> tarefas = new ArrayList<>();
=======
>>>>>>> master
	@Temporal(TemporalType.DATE)
	private Calendar dtNascimento;

<<<<<<< HEAD
<<<<<<< HEAD
	@OneToMany(mappedBy = "pessoa", targetEntity = TarefaDomain.class, cascade = CascadeType.PERSIST)
	private List<TarefaDomain> tarefas;
=======
	@OneToMany(mappedBy = "pessoa")
=======
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa", fetch = FetchType.EAGER)
>>>>>>> Cadastro de TarefaDomain vinculado ao PessoaDomain
	private List<TarefaDomain> tarefas = new ArrayList<>();
>>>>>>> Erro ao vincular PessoaDomain e TarefaDomain
<<<<<<< HEAD
=======
>>>>>>> features
>>>>>>> master

	public PessoaDomain() {
		super();
	}

<<<<<<< HEAD
	public PessoaDomain(Long id, String nome, String email, Calendar dtNascimento, List<TarefaDomain> tarefas) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
=======
<<<<<<< HEAD
	public PessoaDomain(Long id, String nome, List<TarefaDomain> tarefas) {
		super();
		this.id = id;
		this.nome = nome;
=======
	public PessoaDomain(Long id, String nome, String email, Calendar dtNascimento, List<TarefaDomain> tarefas) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
>>>>>>> features
>>>>>>> master
		this.tarefas = tarefas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<TarefaDomain> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<TarefaDomain> tarefas) {
		this.tarefas = tarefas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtNascimento == null) ? 0 : dtNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tarefas == null) ? 0 : tarefas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaDomain other = (PessoaDomain) obj;
		if (dtNascimento == null) {
			if (other.dtNascimento != null)
				return false;
		} else if (!dtNascimento.equals(other.dtNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tarefas == null) {
			if (other.tarefas != null)
				return false;
		} else if (!tarefas.equals(other.tarefas))
			return false;
		return true;
	}

}
