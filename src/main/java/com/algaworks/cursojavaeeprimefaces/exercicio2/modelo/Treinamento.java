package com.algaworks.cursojavaeeprimefaces.exercicio2.modelo;

import java.util.Date;
import java.util.List;

import com.algaworks.cursojavaeeprimefaces.exercicio2.enums.Modalidade;

public class Treinamento {

	private String razaoSocial;
	private String cnpj;
	private Cidade cidade;
	private Modalidade modalidade;
	private Date dataDoContrato;
	private Double valorDoContrato;
	private MetodoDePagamento metodoDePagamento;
	private FormaDePagamento formaDePagamento;
	private List<CursoContratado> cursosContrados;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorDoContrato() {
		return valorDoContrato;
	}

	public void setValorDoContrato(Double valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}

	public MetodoDePagamento getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public List<CursoContratado> getCursosContrados() {
		return cursosContrados;
	}

	public void setCursosContrados(List<CursoContratado> cursosContrados) {
		this.cursosContrados = cursosContrados;
	}

	@Override
	public String toString() {
		return "Treinamento [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj
				+ ", cidade=" + cidade + ", modalidade="
				+ (modalidade != null ? modalidade.getNome() : "null")
				+ ", dataDoContrato=" + dataDoContrato + ", valorDoContrato="
				+ valorDoContrato + ", metodoDePagamento=" + metodoDePagamento
				+ ", formaDePagamento=" + formaDePagamento
				+ ", cursosContrados=" + cursosContrados + "]";
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
