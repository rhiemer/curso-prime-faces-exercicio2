package com.algaworks.cursojavaeeprimefaces.exercicio2.dao;

import java.util.Arrays;
import java.util.List;

import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.MetodoDePagamento;

public class MetodoDePagamentoDAO {

	private static List<MetodoDePagamento> listaMetodosDePagamento = Arrays
			.asList(new MetodoDePagamento(1, "À Vista"), new MetodoDePagamento(
					2, "1x"), new MetodoDePagamento(3, "2x"),
					new MetodoDePagamento(4, "3x"), new MetodoDePagamento(5,
							"4x"), new MetodoDePagamento(6, "5x"),
					new MetodoDePagamento(7, "6x"), new MetodoDePagamento(8,
							"Entrada + 30 dias"));

	public MetodoDePagamento buscarMetodoDePagamento(Integer codigo) {
		return listaMetodosDePagamento.get(listaMetodosDePagamento
				.indexOf(new MetodoDePagamento(codigo)));
	}

}
