package com.bydan.framework.erp.util;

import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings("unused")
public class ConstantesValidacion 
{
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	final public static String SVALIDACIONCADENA="No es cadena";
	final public static String SVALIDACIONCADENA_TELEFONO="No es Telefono valido";
	final public static String SVALIDACIONCADENA_MAIL="No es Mail valido";
	
	final public static String SVALIDACIONTODOS="No es todos";
	
	final public static String SREGEXCADENA="[0-9A-Za-z_)( .=:;-]*";//"[^º]*";
	final public static String SREGEXCADENA_TELEFONO="[0-9)( -]*";//"[^º]*";
	final public static String SREGEXCADENA_MAIL="[0-9A-Za-z_)( .=:;-]*";//"[^º]*";
	
	final public static String SREGEXCADENATODOS="[^º]*";
	
	final public static String SVALIDACIONNUMEROENTERO="No es numero";
	
	final public static String SREGEXNUMEROENTERO="[^º]*";
	
	final public static String SVALIDACIONNOTNULL="Es nulo";
	
	final public static String SVALIDACIONSMALLINT="No es smallint";
	
	final public static String SVALIDACIONNOVACIO="No puede estar vacio";
	
	final public static String SVALIDACIONINT="No es int";
	
	final public static String SVALIDACIONBIGINT="No es bigint";
	
	final public static String SVALIDACIONDECIMAL="No es decimal";
	
	final public static String SVALIDACIONLENGTH="No tamanio";
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	
	private static ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();
	
}
