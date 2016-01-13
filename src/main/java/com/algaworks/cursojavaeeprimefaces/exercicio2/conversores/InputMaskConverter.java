package com.algaworks.cursojavaeeprimefaces.exercicio2.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("inputMaskConverter")
public class InputMaskConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		if (value != null && !"".equals(value.trim())) {

			String somenteNumeroLetra = value.replaceAll("[^0-9a-zA-Z]+", "");

			return somenteNumeroLetra;

		}

		return null;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		return value + "";
	}

}
