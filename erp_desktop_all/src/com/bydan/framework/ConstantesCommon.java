package com.bydan.framework;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConstantesCommon {
	public static EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory("PersistenceUnitSeguridad"/*ConstantesCommon.SJPAPERSISTENCEUNITNAME*/);
	public  static String SJPAPERSISTENCEUNITNAME="PersistenceUnitSeguridad";//"PersistenceUnitAuditoria";//"PersistenceUnitSeguridad";
}
