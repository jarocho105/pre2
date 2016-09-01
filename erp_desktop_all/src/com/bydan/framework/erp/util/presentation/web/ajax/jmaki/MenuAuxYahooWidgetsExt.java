package com.bydan.framework.erp.util.presentation.web.ajax.jmaki;
import java.util.ArrayList;

public class MenuAuxYahooWidgetsExt {
	 private String startMenu="menu: [";
	 private String startMenuLabel="{label:'";
	 private String startMenuUrl="url:'";
	 private String startMenuStyle="style:{";
	 private String beetwenItem=",";
	 private String endItem="'";
	 //private String endMenuUrl="'}";
	 //private String endMenuLabel="'";
	 private String endMenu="]";
	 private String style="";
	 private String label="";
	 private String url="";
	 private static String endKey="}";
	 //private static String startKey="{";
	
	 private Boolean esUltimo=false;
	 private Boolean esInicio=false;
	 
	 private ArrayList<MenuAuxYahooWidgetsExt> auxMenusYahoo= new ArrayList<MenuAuxYahooWidgetsExt>();
	
	 public Boolean getEsUltimo() {
		return esUltimo;
	 }
	
	 public void setEsUltimo(Boolean esUltimo) {
		this.esUltimo = esUltimo;
	 }
	
	 public String getLabel() {
		return label;
	 }
	
	 public void setLabel(String label) {
		this.label = label;
	 }
	
	 public  String getStyle() {
		return style;
	 }
	
	 public  void setStyle(String style) {
		this.style = style;
	 }
	
	 public ArrayList<MenuAuxYahooWidgetsExt> getAuxMenusYahoo() {
		return auxMenusYahoo;
	 }
	
	 public void setAuxMenusYahoo(ArrayList<MenuAuxYahooWidgetsExt> auxMenusYahoo) {
		this.auxMenusYahoo = auxMenusYahoo;
	 }
	
	 public String getUrl() {
		return url;
	 }
	
	 public void setUrl(String url) {
		this.url = url;
	 }
	
	 public Boolean getEsInicio() {
		return esInicio;
	 }
	
	 public void setEsInicio(Boolean esInicio) {
		this.esInicio = esInicio;
	 }
	
	 public void buildMenu(StringBuilder tableAjax) {
		
		Integer count=1;
		
		if(esInicio) {
			tableAjax.append(startMenu);				
		}
		
		tableAjax.append(startMenuLabel);
		tableAjax.append(label);
		tableAjax.append(endItem);
		
		if(auxMenusYahoo.size()>0) {
			tableAjax.append(",");
			
			for(MenuAuxYahooWidgetsExt aux:auxMenusYahoo) {		
				if(count.equals(1)) {
					aux.setEsInicio(true); 					
				}
				
				if(count.equals(auxMenusYahoo.size())) {
					aux.setEsUltimo(true); 
				}
				aux.buildMenu(tableAjax);
				count++;
			}
			
			tableAjax.append(endKey);
		} else {			
			
			if(url==null) {
				url="";
			}
			
			tableAjax.append(beetwenItem);
			tableAjax.append(startMenuUrl);
			tableAjax.append(url);
			tableAjax.append(endItem);
				
			tableAjax.append(beetwenItem);
			tableAjax.append(startMenu);
			tableAjax.append(endMenu);
			
			if(!style.equals("")) {
				tableAjax.append(beetwenItem);
				tableAjax.append(startMenuStyle);
				tableAjax.append(style);
				tableAjax.append(endKey);					
			}
			
			tableAjax.append(endKey);		
		}				
		
		if(!esUltimo) {
			tableAjax.append(",");
		} else {
			tableAjax.append(endMenu);			
		}		
	 }
}
