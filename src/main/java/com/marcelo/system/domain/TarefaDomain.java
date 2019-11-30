package com.marcelo.system.domain;

import java.io.Serializable;
import java.sql.Date;

public class TarefaDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	private Date dataExpericao;
	private boolean concluida;

	public TarefaDomain() {
		super();
	}

	public TarefaDomain(Long id, String descricao, Date dataExpericao, boolean concluida) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataExpericao = dataExpericao;
		this.concluida = concluida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataExpericao() {
		return dataExpericao;
	}

	public void setDataExpericao(Date dataExpericao) {
		this.dataExpericao = dataExpericao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (concluida ? 1231 : 1237);
		result = prime * result + ((dataExpericao == null) ? 0 : dataExpericao.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TarefaDomain other = (TarefaDomain) obj;
		if (concluida != other.concluida)
			return false;
		if (dataExpericao == null) {
			if (other.dataExpericao != null)
				return false;
		} else if (!dataExpericao.equals(other.dataExpericao))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
