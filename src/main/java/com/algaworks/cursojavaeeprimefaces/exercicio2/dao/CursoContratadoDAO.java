package com.algaworks.cursojavaeeprimefaces.exercicio2.dao;

import java.util.Arrays;
import java.util.List;

import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.CursoContratado;

public class CursoContratadoDAO {

	private static List<CursoContratado> listaCursosContratados = Arrays
			.asList(new CursoContratado(1,
					"Fundamentos Java e Orientação a Objetos"),
					new CursoContratado(2, "Desenvolvimento Web com JSF2"),
					new CursoContratado(3,
							"Persistência de Dados com JPA e Hibernate"),
					new CursoContratado(4,
							"Gerenciamento Ágil de Projetos com Scrum"));

	public CursoContratado buscarCursoContradao(Integer codigo) {
		return listaCursosContratados.get(listaCursosContratados
				.indexOf(new CursoContratado(codigo)));
	}
	
	public  List<CursoContratado> listarCursosContradaos() {
		return listaCursosContratados;
	}


}
