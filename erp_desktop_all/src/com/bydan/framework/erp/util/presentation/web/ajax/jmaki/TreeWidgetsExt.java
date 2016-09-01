package com.bydan.framework.erp.util.presentation.web.ajax.jmaki;

//import java.util.ArrayList;

//import Business.Entities.erp.Usuario;


public class TreeWidgetsExt {
	 private String startChildren="children : [";
	 private String endChildren="]";
	 private String startKey="{";
	 private String endKey="}";
	 private String startArgs="{topic : '";
	 private String startRoot="root : {";
	 private String startTreeTitle="label : '";
	 private String endTreeTitle="'";
	 private String endArgs="'}";
	 private String topic="";
	 private String title="";
	 private Boolean expanded=false;
	 //private TreeAuxYahooExt auxMenuYahoo;
	
	public String getEndChildren() {
		return endChildren;
	}

	public void setEndChildren(String endChildren) {
		this.endChildren = endChildren;
	}

	public String getStartChildren() {
		return startChildren;
	}

	public void setStartChildren(String startChildren) {
		this.startChildren = startChildren;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public  String getTopic() {
		return topic;
	}

	public  void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public  void startCreateTree(StringBuilder tableAjax) {	
		tableAjax.append(startKey);
		tableAjax.append(startRoot);
		
		if(title!=""){
			tableAjax.append(startTreeTitle);
			tableAjax.append(title);
			tableAjax.append(endTreeTitle);
		}
		
		tableAjax.append(",");
		tableAjax.append("expanded:");
		
		if(expanded) {
			tableAjax.append("true ,");
		} else {
			tableAjax.append("false ,");
		}
	}
			
	public  void endCreateTree(StringBuilder tableAjax) {	
		tableAjax.append(endKey);
		tableAjax.append(endKey);		
	}
		
	public  String traerTopic(String topic) {
		StringBuilder tableAjax=new StringBuilder();
		tableAjax.append(startArgs);
		tableAjax.append(topic);
		tableAjax.append(endArgs);
		
		return tableAjax.toString();
	}
	/*
	public  String TraerUsuarios(ArrayList<Usuario> usuarios,ArrayList<Usuario> usuarios2) 
	{	
		this.setTitle("New");
		this.setExpanded(true);
		
		StringBuilder tableAjax=new StringBuilder();
		Integer count=1;
		Integer count2=0;
		
		StartCreateTree(tableAjax) ;	
		
		
		TreeAuxYahooExt auxTreeYahoo2=new TreeAuxYahooExt();	
		ArrayList<TreeAuxYahooExt> auxTreesYahoo2= new ArrayList<TreeAuxYahooExt>();
		
		
		for(Usuario usuario2:usuarios2)
		{
			
			if(count2<3){
				auxTreeYahoo2=new TreeAuxYahooExt();		
				//auxTreeYahoo2.setTitle(usuario2.getNombre()); 
				//auxTreeYahoo2.setOnClickUrl(usuario2.getClave()); 
				auxTreesYahoo2.add(auxTreeYahoo2);
				
			}
			else{
				break;	
			}
		
			count2++;		
		}		
		
		tableAjax.append(startChildren);
		
		for(Usuario usuario:usuarios)
		{
			
			TreeAuxYahooExt auxTreeYahoo=new TreeAuxYahooExt();			
			
			//auxTreeYahoo.setTitle(usuario.getNombre()); 	
			
			auxTreeYahoo.setAuxTreesYahoo(auxTreesYahoo2);
			
			if(count.equals(usuarios.size())){
				auxTreeYahoo.setEsUltimo(true);	
			}
			
		    auxTreeYahoo.buildTree(tableAjax);
			
		    
			count++;
		}		
		tableAjax.append(endChildren);
		EndCreateTree(tableAjax) ;	
		
		return tableAjax.toString();
	}
	*/
	/*public  String TraerUsuariosHijos(ArrayList<Usuario> usuarios) 
	{	
		StringBuilder tableAjax=new StringBuilder();
		Integer count=1;
		
		StartCreateTree(tableAjax) ;	
		
		ArrayList<TreeAuxYahooExt> auxTreesYahoo= new ArrayList<TreeAuxYahooExt>();
		
		TreeAuxYahooExt auxTreeYahoo=new TreeAuxYahooExt();		 
		auxTreeYahoo.setLabel("test"); 
		auxTreeYahoo.setUrl("test"); 
		auxTreeYahoo.setEsInicio(true); 
		auxTreeYahoo.setEsUltimo(true); 
		
		for(Usuario usuario:usuarios)
		{
			
			TreeAuxYahooExt auxTreeYahoo1=new TreeAuxYahooExt();		 
				
			
			auxTreeYahoo1.setLabel(usuario.getNombre()); 
			auxTreeYahoo1.setUrl(usuario.getClave()); 						
			auxTreesYahoo.add(auxTreeYahoo1);
			
			count++;
		}		
		auxTreeYahoo.setAuxTreesYahoo(auxTreesYahoo);
		auxTreeYahoo.buildTree(tableAjax);
		
		EndCreateTree(tableAjax) ;	
		
		return tableAjax.toString();
	}
	
	public  String TraerUsuariosPadresHijos(ArrayList<Usuario> usuarios) 
	{	
		StringBuilder tableAjax=new StringBuilder();
		Integer count=1;
		
		StartCreateTree(tableAjax) ;	
		
		ArrayList<TreeAuxYahooExt> auxTreesYahoo= new ArrayList<TreeAuxYahooExt>();
		
		TreeAuxYahooExt auxTreeYahoo=new TreeAuxYahooExt();		 
		auxTreeYahoo.setLabel("test"); 
		auxTreeYahoo.setUrl("test"); 
		auxTreeYahoo.setEsInicio(true); 
		auxTreeYahoo.setEsUltimo(true); 
		
		for(Usuario usuario:usuarios)
		{
			
			TreeAuxYahooExt auxTreeYahoo1=new TreeAuxYahooExt();		 			
			
			auxTreeYahoo1.setLabel(usuario.getNombre()); 
			auxTreeYahoo1.setUrl(usuario.getClave()); 						
			auxTreesYahoo.add(auxTreeYahoo1);
			count++;
		}		
		auxTreeYahoo.setAuxTreesYahoo(auxTreesYahoo);
		auxTreeYahoo.buildTree(tableAjax);
		
		EndCreateTree(tableAjax) ;	
		
		return tableAjax.toString();
	}*/
}
