package com.bydan.framework.erp.business.logic;

import java.io.Serializable;

import com.bydan.framework.erp.util.Constantes;

public class Pagination implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Integer iFirstResult;
	private Integer iMaxResults;
	private String sType;
	
	public  Pagination() {
		iFirstResult=-1;
		iMaxResults=-1;
		sType=Constantes.SPAGINATIONONE;
    }
	
	public  Pagination(Integer newIFirstResult,Integer newIMaxResults,String newSType) {
		iFirstResult=newIFirstResult;
		iMaxResults= newIMaxResults;
		sType=newSType;
    }
	
	public  Pagination(Integer newIFirstResult,Integer newIMaxResults) {
		iFirstResult=newIFirstResult;
		iMaxResults= newIMaxResults;
		sType="NONE";
    }

	public Integer getiFirstResult() {
		return iFirstResult;
	}

	public void setiFirstResult(Integer iFirstResult) {
		this.iFirstResult = iFirstResult;
	}

	public Integer getiMaxResults() {
		return iMaxResults;
	}

	public void setiMaxResults(Integer iMaxResults) {
		this.iMaxResults = iMaxResults;
	}

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}
	
	
}
