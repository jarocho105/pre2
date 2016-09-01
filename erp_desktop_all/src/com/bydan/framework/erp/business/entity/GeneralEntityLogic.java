package com.bydan.framework.erp.business.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.apache.log4j.Logger;

import com.bydan.erp.puntoventa.business.dataaccess.MesaDataAccess;
import com.bydan.erp.puntoventa.business.entity.Mesa;
import com.bydan.erp.puntoventa.business.logic.MesaLogic;
import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.DatosDeep;
import com.bydan.framework.erp.util.Connexion;
import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.ParameterDbType;


@SuppressWarnings("unused")
public class GeneralEntityLogic {
	static Logger logger = Logger.getLogger(GeneralEntityLogic.class);
	
	protected ArrayList<DatoGeneral> arrDatoGeneral;
	protected Connexion connexion;
	protected DatosCliente datosCliente;
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected EntityManagerFactory entityManagerFactory;
	
	protected DatosDeep datosDeep;
	protected Boolean isConDeep=false;
	protected Boolean isConRefrescarForeignKeys=false;
			
	public GeneralEntityLogic () throws Exception {		
		try	{
			
			this.connexion=new Connexion();
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}			
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			this.isConRefrescarForeignKeys=false;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
	} 		
	
	public GeneralEntityLogic (Connexion newConnexion) throws Exception {			
		try	{
			this.connexion=newConnexion;
			
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			this.isConRefrescarForeignKeys=false;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
	}
	
	public Connexion getConnexion() {
		return this.connexion;		
	}
	
	public void setConnexion(Connexion newConnexion) {
		this.connexion=newConnexion;		
	}
	
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}

	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
	}
	
	public DatosDeep getDatosDeep() {
		return this.datosDeep;
	}

	public void setDatosDeep(DatosDeep datosDeep) {
		this.datosDeep = datosDeep;
	}
	
	public void setDatosDeepFromDatosCliente() {
		this.datosDeep = this.datosCliente.getDatosDeep();
		this.isConDeep=this.datosCliente.getIsConDeep();
	}
	
	public Boolean getIsConDeep() {
		return this.isConDeep;
	}

	public void setIsConDeep(Boolean isConDeep) {
		this.isConDeep = isConDeep;
	}
	
	public Boolean getIsConRefrescarForeignKeys() {
		return this.isConRefrescarForeignKeys;
	}

	public void setIsConRefrescarForeignKeys(Boolean isConRefrescarForeignKeys) {
		this.isConRefrescarForeignKeys = isConRefrescarForeignKeys;
	}
	
	public ArrayList<DatoGeneral> getArrDatoGeneral() {
		return arrDatoGeneral;
	}

	public void setArrDatoGeneral(ArrayList<DatoGeneral> arrDatoGeneral) {
		this.arrDatoGeneral = arrDatoGeneral;
	}
	
	public ConnexionType getConnexionType() {
		return connexionType;
	}

	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}


	public ParameterDbType getParameterDbType() {
		return parameterDbType;
	}

	public void setParameterDbType(ParameterDbType parameterDbType) {
		this.parameterDbType = parameterDbType;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
}
