package com.algaworks.cursojavaeeprimefaces.exercicio2.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.CidadeDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.Cidade;

@FacesConverter("cidadeConverter")
public class CidadeConverter implements Converter {

	private CidadeDAO cidadeDAO = new CidadeDAO();

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		Integer codigo = null;

		if (value != null) {
			try {
				codigo = Integer.valueOf(value);

			} catch (NumberFormatException e) {
				return null;
			}

			return cidadeDAO.buscarCidade(codigo);

		}

		return null;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		return String.valueOf(((Cidade) value).getCodigo());
	}

}
