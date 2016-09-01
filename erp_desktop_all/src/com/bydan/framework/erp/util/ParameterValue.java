package com.bydan.framework.erp.util;

import java.util.Date;//java.sql.Date;
import java.io.File;
import java.sql.Time;
import java.sql.Timestamp;

public class ParameterValue<T> {
	private T value;
	
	public ParameterValue(T newValue) {
		value=newValue;	
	}
	
	public ParameterValue() {
		
	}
	
	public T getValue() {		
		return value;		
	}
	
	public Date getValueDate() {
		return ((Date)value);	
	}
	
	public Timestamp getValueTimestamp() {
		return ((Timestamp)value);	
	}
	
	public Time getValueTime() {
		return ((Time)value);	
	}
	
	public void setValue(T newValue) {
		this.value = newValue;
	}
	
	public int getValueInteger() {
		return ((Integer)value).intValue();	
	}
	
	public byte getValueByte() {
		return ((Byte)value).byteValue();	
	}
	
	public Byte[] getValueBytes() {
		return (Byte[])value;	
	}
	
	public byte[] getValuebytes() {
		return (byte[])value;	
	}
	
	public File getValueFile() {
		return (File)value;	
	}
	
	public double getValueDouble() {
		return ((Double)value).doubleValue();	
	}
	
	public float getValueFloat() {
		return ((Float)value).floatValue();	
	}
	
	public short getValueShort() {
		return ((Short)value).shortValue();	
	}
	
	public long getValueLong() {
		return ((Long)value).longValue();	
	}
	
	public Number getValueNumber() {
		return (Number)value;	
	}
	
	public String getValueString() {
		return (String)value;	
	}
	
	public boolean getValueBoolean() {
		return ((Boolean)value).booleanValue();	
	}
	
	public char getValueCharacter() {
		return ((Character)value).charValue();	
	}
	
	public Object getValueObject() {
		return value;	
	}	
}
