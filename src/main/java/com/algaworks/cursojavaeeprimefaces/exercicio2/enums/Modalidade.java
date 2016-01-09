package com.algaworks.cursojavaeeprimefaces.exercicio2.enums;

import java.util.HashMap;
import java.util.Map;

public enum Modalidade {

	EAD("EAD"), PRESENCIAL("PRESENCIAL");

	private String nome;
	private static Map<String, Modalidade> mapNome=new HashMap<String, Modalidade>();

	Modalidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	static {
		for (Modalidade modalidade : Modalidade.values()) {
			mapNome.put(modalidade.getNome(), modalidade);
		}
	}

	public static Modalidade buscarModalidadePeloNome(String nome) {
		return mapNome.get(nome);
	}

}
