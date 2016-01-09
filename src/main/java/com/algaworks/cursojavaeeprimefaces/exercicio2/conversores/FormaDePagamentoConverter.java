package com.algaworks.cursojavaeeprimefaces.exercicio2.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.cursojavaeeprimefaces.exercicio2.dao.FormaDePagamentoDAO;
import com.algaworks.cursojavaeeprimefaces.exercicio2.modelo.FormaDePagamento;

@FacesConverter("formaDePagamentoConverter")
public class FormaDePagamentoConverter implements Converter {

	private FormaDePagamentoDAO formaDePagamentoDAO = new FormaDePagamentoDAO();

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		Integer codigo = null;

		if (value != null) {
			try {
				codigo = Integer.valueOf(value);

			} catch (NumberFormatException e) {
				return null;
			}

			return formaDePagamentoDAO.buscarFormaDePagamento(codigo);

		}

		return null;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		try {
			return String.valueOf(((FormaDePagamento) value).getCodigo());
		} catch (ClassCastException e) {
			return value.toString();
		}
	}

}
