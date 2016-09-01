package com.bydan.framework.erp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConstantesCommon {
	public static EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory(ConstantesCommon.SJPAPERSISTENCEUNITNAME);
	public  static String SJPAPERSISTENCEUNITNAME="PersistenceUnitEnvioMail";//"PersistenceUnitAuditoria";//"PersistenceUnitSeguridad";
}
