package com.bydan.framework.erp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@SuppressWarnings("unused")
public class FuncionesJsp {

	
	
	public static String getStringHtmlRelacionImagenButon(Long idRowClase,String strNombreClase,String strNombreClasePlural,String strNombreClaseRelativePath,String strNombreClaseRelacionada,String strNombreClaseRelacionadaPlural) throws Exception {		
		String strHtmlRelacionImagenButon="";
		strHtmlRelacionImagenButon="<img src=\""+strNombreClaseRelativePath+"Imagenes/"+strNombreClaseRelacionada.toLowerCase()+strNombreClaseRelacionadaPlural.toLowerCase()+".gif\" onClick=\""+strNombreClase.toLowerCase()+"PaginaWebInteraccion.actualizar"+strNombreClaseRelacionada+strNombreClaseRelacionadaPlural.toLowerCase()+"Relacionadas"+"("+idRowClase+")\" width=\"40\" height=\"40\">";
		
		return strHtmlRelacionImagenButon;
	}

	public static String getStringHtmlCheckBox(Long lId,Boolean isTrue) throws Exception {		
		String strHtmlCheckBox="";
			
		strHtmlCheckBox="<input name=\"chb"+lId+"\" type=\"checkbox\" disabled=\"true\" align=\"middle\"" ;

		if(isTrue) {
			strHtmlCheckBox+=" checked=\"checked\">";
		} else {
			strHtmlCheckBox+=">";
		}
		
		return strHtmlCheckBox;
	}
}
