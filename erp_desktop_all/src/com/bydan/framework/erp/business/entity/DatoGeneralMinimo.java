package com.bydan.framework.erp.business.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

//@SuppressWarnings("unused")
public class DatoGeneralMinimo {
	private String sCodigo="";	
	private String sDescripcion="";
	private String sValor="";
	
	private String sValorString="";	
	private Integer iValorInteger=0;
	private Long lValorLong=0L;
	private Boolean isValorBoolean=false;
	private Date dtValorDate=new Date();
	private Double dValorDouble=0.0;
	
	private Short shValorShort=0;
	private Float fValorFloat=Float.MIN_VALUE;
	private BigDecimal dbValorBigDecimal=BigDecimal.ZERO;
	private Timestamp tsValorTimestamp=null;
	private Time tValorTime=null;
	private Byte bValorByte=Byte.MIN_VALUE;		
	
	public DatoGeneralMinimo() {
		this.sCodigo="";	
		this.sDescripcion="";
		this.sValor="";
	}
	
	public String getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}
	
	public String getsValor() {
		return sValor;
	}

	public void setsValor(String sValor) {
		this.sValor = sValor;
	}	
	
	//VALORES
	public String getsValorString() {return sValorString;}
	public void setsValorString(String sValorString) {this.sValorString = sValorString;}
	
	public Integer getiValorInteger() {return iValorInteger;}
	public void setiValorInteger(Integer iValorInteger) {this.iValorInteger = iValorInteger;}
	
	public Long getlValorLong() {return lValorLong;	}
	public void setlValorLong(Long lValorLong) {this.lValorLong = lValorLong;}
	
	public Boolean getIsValorBoolean() {return isValorBoolean;}
	public void setIsValorBoolean(Boolean isValorBoolean) {this.isValorBoolean = isValorBoolean;}
	
	public Date getDtValorDate() {return dtValorDate;}
	public void setDtValorDate(Date dtValorDate) {this.dtValorDate = dtValorDate;}
	
	public Double getdValorDouble() {return dValorDouble;}
	public void setdValorDouble(Double dValorDouble) {this.dValorDouble = dValorDouble;}

	
	public Short getShValorShort() {return shValorShort;}
	public void setShValorShort(Short shValorShort) {this.shValorShort = shValorShort;	}

	public Float getfValorFloat() {return fValorFloat;}
	public void setfValorFloat(Float fValorFloat) {this.fValorFloat = fValorFloat;	}

	public BigDecimal getDbValorBigDecimal() {return dbValorBigDecimal;}
	public void setDbValorBigDecimal(BigDecimal dbValorBigDecimal) {this.dbValorBigDecimal = dbValorBigDecimal;	}

	public Timestamp getTsValorTimestamp() {return tsValorTimestamp;}
	public void setTsValorTimestamp(Timestamp tsValorTimestamp) {this.tsValorTimestamp = tsValorTimestamp;}

	public Time gettValorTime() {return tValorTime;	}
	public void settValorTime(Time tValorTime) {this.tValorTime = tValorTime;}

	public Byte getbValorByte() {return bValorByte;}
	public void setbValorByte(Byte bValorByte) {this.bValorByte = bValorByte;}
	
	public String NOMBRE_STRING="";
	public String NOMBRE_INTEGER="";
	public String NOMBRE_LONG="";
	public String NOMBRE_BOOLEAN="";
	public String NOMBRE_DATE="";
	public String NOMBRE_DOUBLE="";
	
	public String NOMBRE_SHORT="";
	public String NOMBRE_FLOAT="";
	public String NOMBRE_BIGDECIMAL="";
	public String NOMBRE_TIMESTAMP="";
	public String NOMBRE_TIME="";
	public String NOMBRE_BYTE="";
}
