package br.com.luisbsltasklistback.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Task {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String titulo;
	
	@NotNull
	private Boolean status;
	
	private Boolean edicao;
	
	private Boolean remocao;
	
	private Boolean conclusao;
	
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="dt_criacao default CURRENT_TIMESTAMP")
	private Date dtCriacao = new Date();

	public Task() {
	}

	public Task(@NotBlank String titulo, @NotNull Boolean status, Boolean edicao, Boolean remocao,
			Boolean conclusao, String descricao) {
		super();
		this.titulo = titulo;
		this.status = status;
		this.edicao = edicao;
		this.remocao = remocao;
		this.conclusao = conclusao;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getEdicao() {
		return edicao;
	}

	public void setEdicao(Boolean edicao) {
		this.edicao = edicao;
	}

	public Boolean getRemocao() {
		return remocao;
	}

	public void setRemocao(Boolean remocao) {
		this.remocao = remocao;
	}

	public Boolean isConclusao() {
		return conclusao;
	}

	public void setConclusao(Boolean conclusao) {
		this.conclusao = conclusao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", titulo=" + titulo + ", status=" + status + ", edicao=" + edicao + ", remocao="
				+ remocao + ", conclusao=" + conclusao + ", descricao=" + descricao + ", dtCriacao=" + dtCriacao + "]";
	}
	
}
