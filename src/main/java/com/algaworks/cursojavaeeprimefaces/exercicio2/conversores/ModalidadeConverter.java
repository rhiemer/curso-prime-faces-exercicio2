package com.algaworks.cursojavaeeprimefaces.exercicio2.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.cursojavaeeprimefaces.exercicio2.enums.Modalidade;

@FacesConverter("modalidadeConverter")
public class ModalidadeConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		return Modalidade.buscarModalidadePeloNome(value);
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		return value.toString();
	}

}
