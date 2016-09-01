package com.bydan.framework.erp.util;

public class ArchivoMailAttachment {
	private String sFileName;	
	private Integer iTypeAttachment;	
	private byte [] arrBytesFile;
	
	public ArchivoMailAttachment () {
		this.sFileName="";
		this.iTypeAttachment=-1;
		this.arrBytesFile=null;		
    }

	public String getSFileName() {
		return sFileName;
	}

	public void setSFileName(String sFileName) {
		this.sFileName = sFileName;
	}

	public Integer getITypeAttachment() {
		return iTypeAttachment;
	}

	public void setITypeAttachment(Integer iTypeAttachment) {
		this.iTypeAttachment = iTypeAttachment;
	}

	public byte[] getArrBytesFile() {
		return arrBytesFile;
	}

	public void setArrBytesFile(byte[] arrBytesFile) {
		this.arrBytesFile = arrBytesFile;
	}
}
