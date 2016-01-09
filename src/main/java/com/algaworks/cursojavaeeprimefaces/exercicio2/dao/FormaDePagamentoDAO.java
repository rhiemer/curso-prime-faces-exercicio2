package com.algaworks.cursojavaeeprimefaces.exercicio2.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.FormaDePagamento;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.MetodoDePagamento;

public class FormaDePagamentoDAO {

	private static List<FormaDePagamento> listaDeFormasDePagamento = Arrays
			.asList(new FormaDePagamento(1, "Cartão de Crédito"),
					new FormaDePagamento(2, "Cheque"), new FormaDePagamento(3,
							"Dinheiro"));
	private static Map<FormaDePagamento, List<MetodoDePagamento>> modalidadesDePagamentoPorFormasDePagamento;

	static {
		MetodoDePagamentoDAO metodoDePagamentoDAO = new MetodoDePagamentoDAO();
		modalidadesDePagamentoPorFormasDePagamento = new HashMap<FormaDePagamento, List<MetodoDePagamento>>();
		modalidadesDePagamentoPorFormasDePagamento.put(listaDeFormasDePagamento
				.get(0), Arrays.asList(
				metodoDePagamentoDAO.buscarMetodoDePagamento(1),
				metodoDePagamentoDAO.buscarMetodoDePagamento(2),
				metodoDePagamentoDAO.buscarMetodoDePagamento(3),
				metodoDePagamentoDAO.buscarMetodoDePagamento(4),
				metodoDePagamentoDAO.buscarMetodoDePagamento(5),
				metodoDePagamentoDAO.buscarMetodoDePagamento(6),
				metodoDePagamentoDAO.buscarMetodoDePagamento(7)));
		modalidadesDePagamentoPorFormasDePagamento.put(listaDeFormasDePagamento
				.get(1), Arrays.asList(
				metodoDePagamentoDAO.buscarMetodoDePagamento(1),
				metodoDePagamentoDAO.buscarMetodoDePagamento(8)));
		modalidadesDePagamentoPorFormasDePagamento.put(
				listaDeFormasDePagamento.get(2),
				Arrays.asList(metodoDePagamentoDAO.buscarMetodoDePagamento(1)));

	}

	public FormaDePagamento buscarFormaDePagamento(Integer codigo) {
		return listaDeFormasDePagamento.get(listaDeFormasDePagamento
				.indexOf(new FormaDePagamento(codigo)));
	}

	public List<FormaDePagamento> listadeFormasDePagamento() {
		return listaDeFormasDePagamento;
	}

	public List<MetodoDePagamento> metodosDePagamentoPelaFormaDePagamento(
			FormaDePagamento formaDePagamento) {
		return modalidadesDePagamentoPorFormasDePagamento.get(formaDePagamento);

	}
}
