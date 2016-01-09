package com.algaworks.cursojavaeeprimefaces.exercicio2.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.Cidade;

public class CidadeDAO {

	private static List<Cidade> listaCidades = Arrays.asList(new Cidade(1,
			"Rio de Janeiro"), new Cidade(2, "São Paulo"), new Cidade(3,
			"Belo Horizonte"), new Cidade(4, "Brasília"));

	public Cidade buscarCidade(Integer codigo) {
		return listaCidades.get(listaCidades.indexOf(new Cidade(codigo)));
	}

	public List<Cidade> buscarCidadePelaDescricao(String nome) {

		List<Cidade> lista = new ArrayList<Cidade>();

		for (Cidade cidade : listaCidades) {

			if (cidade.getNome().toLowerCase().startsWith(nome.toLowerCase())) {
				lista.add(cidade);
			}

		}

		return lista;
	}

}
