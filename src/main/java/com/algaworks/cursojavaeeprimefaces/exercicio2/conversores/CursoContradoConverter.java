package com.algaworks.cursojavaeeprimefaces.exercicio2.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.CursoContratadoDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.CursoContratado;

@FacesConverter("cursoContradoConverter")
public class CursoContradoConverter implements Converter {

	private CursoContratadoDAO cursoContratadoDAO = new CursoContratadoDAO();

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		Integer codigo = null;

		if (value != null) {
			try {
				codigo = Integer.valueOf(value);

			} catch (NumberFormatException e) {
				return null;
			}

			return cursoContratadoDAO.buscarCursoContradao(codigo);

		}

		return null;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		try {
			return String.valueOf(((CursoContratado) value).getCodigo());
		} catch (ClassCastException e) {
			return value.toString();
		}
	}

}
