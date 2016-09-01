package com.bydan.framework.erp.business.entity;

public class OrderBy {
	public  static String CODIGO="CODIGO";
	public  static String NOMBRE="NOMBRE";
	public  static String NOMBREDB="DB";
	public  static String DESCRIPCION="DESCRIPCION";
	public  static String VALOR="VALOR";
	public  static String ESDESC="DESC";
	public  static String ISSELECTED="SEL";
	
	private String sCodigo="";	
	private String sNombre="";	
	private String sNombreDB="";
	private String sDescripcion="";
	private String sValor="";
	private String sPrefijoSql="";
	private Boolean esDesc=false;
	private Boolean isSelected=false;
	
	public OrderBy() {
		
	}
	
	public OrderBy(Boolean isSelected, String sNombre,String sNombreDB, Boolean esDesc,String sPrefijoSql) {
		super();
		this.isSelected = isSelected;
		this.sNombre = sNombre;
		this.sNombreDB = sNombreDB;
		this.esDesc = esDesc;
		this.sPrefijoSql=sPrefijoSql;
		
	}
	
	public OrderBy(Boolean isSelected, String sNombre,String sNombreDB, Boolean esDesc) {
		super();
		this.isSelected = isSelected;
		this.sNombre = sNombre;
		this.sNombreDB = sNombreDB;
		this.esDesc = esDesc;
		
	}
	
	public OrderBy(String sCodigo, String sNombre,String sNombreDB,
			 Boolean esDesc, Boolean isSelected) {
		super();
		this.sCodigo = sCodigo;
		this.sNombre = sNombre;
		this.sNombreDB = sNombreDB;
		this.esDesc = esDesc;
		this.isSelected = isSelected;
	}
	
	public OrderBy(String sCodigo, String sNombre, String sNombreDB, String sDescripcion,
			String sValor, Boolean esDesc, Boolean isSelected,String sPrefijoSql) {
		super();
		this.sCodigo = sCodigo;
		this.sNombre = sNombre;
		this.sNombreDB = sNombreDB;
		this.sDescripcion = sDescripcion;
		this.sValor = sValor;
		this.esDesc = esDesc;
		this.isSelected = isSelected;
		this.sPrefijoSql=sPrefijoSql;
	}

	public Boolean getisSelected() {
		return isSelected;
	}

	public void setisSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public Boolean getesDesc() {
		return esDesc;
	}

	public void setesDesc(Boolean esDesc) {
		this.esDesc = esDesc;
	}
	
	public String getsPrefijoSql() {
		return sPrefijoSql;
	}

	public void setsPrefijoSql(String sPrefijoSql) {
		this.sPrefijoSql = sPrefijoSql;
	}
	
	public String getsValor() {
		return sValor;
	}

	public void setsValor(String sValor) {
		this.sValor = sValor;
	}

	public String getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre= sNombre;
	}
	
	public String getsNombreDB() {
		return sNombreDB;
	}

	public void setsNombreDB(String sNombreDB) {
		this.sNombreDB= sNombreDB;
	}
	
	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}
}
