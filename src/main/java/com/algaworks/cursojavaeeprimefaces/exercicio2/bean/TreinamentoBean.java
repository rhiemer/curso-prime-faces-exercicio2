package com.algaworks.cursojavaeeprimefaces.exercicio2.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.CidadeDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.CursoContratadoDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.FormaDePagamentoDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.Cidade;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.CursoContratado;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.FormaDePagamento;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.MetodoDePagamento;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.Treinamento;

@ManagedBean
@ViewScoped
public class TreinamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private CidadeDAO cidadeDAO = new CidadeDAO();

	private FormaDePagamentoDAO formaDePagamentoDAO = new FormaDePagamentoDAO();

	private CursoContratadoDAO cursoContratadoDAO = new CursoContratadoDAO();

	private Treinamento treinamento = new Treinamento();

	private List<MetodoDePagamento> listaMetodosDePagamento = new ArrayList<MetodoDePagamento>();

	private List<FormaDePagamento> listaFormasDePagamento = new ArrayList<FormaDePagamento>();

	public TreinamentoBean() {
		listaFormasDePagamento = formaDePagamentoDAO.listadeFormasDePagamento();
	}

	public void cadastrar() {
		System.out.println("Treinamento:" + getTreinamento().toString());
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Treinamento atualizado!"));
		treinamento = new Treinamento();
	}

	public List<Cidade> buscarCidadeDescricao(String nome) {
		return cidadeDAO.buscarCidadePelaDescricao(nome);
	}

	public List<CursoContratado> listarCursosContradaos() {
		return cursoContratadoDAO.listarCursosContradaos();
	}

	public void metodosDePagamentoPelaFormaDePagamento() {
		listaMetodosDePagamento.clear();
		if (treinamento.getFormaDePagamento() != null) {
			listaMetodosDePagamento.addAll(formaDePagamentoDAO
					.metodosDePagamentoPelaFormaDePagamento(treinamento
							.getFormaDePagamento()));
		}
	}

	public Treinamento getTreinamento() {
		return treinamento;
	}

	public void setTreinamento(Treinamento treinamento) {
		this.treinamento = treinamento;
	}

	public List<MetodoDePagamento> getListaMetodosDePagamento() {
		return listaMetodosDePagamento;
	}

	public List<FormaDePagamento> getListaFormasDePagamento() {
		return listaFormasDePagamento;
	}

}