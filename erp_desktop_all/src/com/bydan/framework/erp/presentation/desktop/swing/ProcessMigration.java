package com.bydan.framework.erp.presentation.desktop.swing;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.util.ModuloConstantesFuncionesAdditional;
import com.bydan.erp.tesoreria.business.entity.TipoRetencionFuenteIva;
import com.bydan.erp.tesoreria.business.entity.Transaccion;
import com.bydan.erp.tesoreria.business.logic.TipoRetencionFuenteIvaLogic;
import com.bydan.erp.tesoreria.business.logic.TransaccionLogic;
import com.bydan.jh.business.entity.*;

@SuppressWarnings("unused")
public class ProcessMigration {
	
	public static void TipoDescripcionAsiento(Boolean esHibernate) throws SQLException, Exception{
		TipoDescripcionAsientoLogic tipodescripcionasientoLogic=new TipoDescripcionAsientoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saedeas saedeas=new saedeas();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoDescripcionAsiento();

			
			List<saedeas> saedeass = new  ArrayList<saedeas>();				
			
			saedeass=saedeas.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saedeass.size();
			
			
			TipoDescripcionAsiento tipodescripcionasiento= new TipoDescripcionAsiento();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saedeas saedeas2:saedeass) {
				idManual++;
				
				//nombre=GetFormatoNombreTipoDescripcionAsiento(saedeas2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoTipoDescripcionAsiento(saedeas2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipodescripcionasiento= new TipoDescripcionAsiento();
				
				/*
				tipodescripcionasiento.setId(lcodigo);
				tipodescripcionasiento.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				idModulo=GetConstantModulo(saedeas2.getdeas_cod_modu());
				
	 			tipodescripcionasiento.setid_empresa(LID_EMPRESA_DEFECTO);
	 			tipodescripcionasiento.setid_modulo(idModulo);
	 			tipodescripcionasiento.setcodigo(GetReplaceStringGeneral(saedeas2.getdeas_cod_deas().trim()));
	 			tipodescripcionasiento.setnombre(GetReplaceStringGeneral(saedeas2.getdeas_des_deas().trim()));
			
				
				tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(tipodescripcionasiento);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipodescripcionasientoLogic.saveTipoDescripcionAsientosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoDescripcionAsiento() throws SQLException, Exception{
		String  sFinal="";//"  where cact_cod_empr=1 ";
			
		return sFinal;
	}

	public static String GetFormatoNombreTipoDescripcionAsiento(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoDescripcionAsiento(String nombre,List<TipoDescripcionAsiento> tipodescripcionasientos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoDescripcionAsiento tipodescripcionasiento: tipodescripcionasientos) {
			if(tipodescripcionasiento.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void CentroActividad(Boolean esHibernate) throws SQLException, Exception{
		CentroActividadLogic centroactividadLogic=new CentroActividadLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saecact saecact=new saecact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalCentroActividad();

			
			List<saecact> saecacts = new  ArrayList<saecact>();				
			
			saecacts=saecact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saecacts.size();
			
			
			CentroActividad centroactividad= new CentroActividad();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saecact saecact2:saecacts) {
				idManual++;
				
				//nombre=GetFormatoNombreCentroActividad(saecact2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoCentroActividad(saecact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				centroactividad= new CentroActividad();
				
				/*
				centroactividad.setId(lcodigo);
				centroactividad.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				Long idDetalleGrupoActivoFijo=1L;
				
	 			centroactividad.setid_empresa(LID_EMPRESA_DEFECTO);
	 			centroactividad.setcodigo(saecact2.getcact_cod_cact().trim());
	 			centroactividad.setnombre(saecact2.getcact_nom_cact().trim());
	 			centroactividad.setid_tipo_movimiento(ProcessMigration.GetTipoMovimiento(saecact2.getcact_tip_movi().trim()));
	 			centroactividad.setid_tipo_grupo_flujo_caja(idDetalleGrupoActivoFijo);
	 			centroactividad.setconsolidado(false);
	 			centroactividad.setcon_proyecto(true);
	 			centroactividad.setobservacion("");
			
				
				centroactividadLogic.getCentroActividads().add(centroactividad);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			centroactividadLogic.saveCentroActividadsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalCentroActividad() throws SQLException, Exception{
		String  sFinal="  where cact_cod_empr=1 ";	
		return sFinal;
	}

	public static String GetFormatoNombreCentroActividad(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteCentroActividad(String nombre,List<CentroActividad> centroactividads) throws SQLException, Exception{
		Boolean existe=false;
			
		for(CentroActividad centroactividad: centroactividads) {
			if(centroactividad.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static Long GetTipoMovimiento(String sTipo) throws SQLException, Exception{
		Long sFinal=0L;
		
		if(sTipo.equals("D")) {
			sFinal=1L;
			
		} else if(sTipo.equals("I")) {
			sFinal=2L;
		
		} else if(sTipo.equals("E")) {
			sFinal=3L;
		}
		
		return sFinal;
	}
	
	
	public static void Unidad(Boolean esHibernate) throws SQLException, Exception{
		UnidadLogic unidadLogic=new UnidadLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeunid saeunid=new saeunid();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalUnidad();

			
			List<saeunid> saeunids = new  ArrayList<saeunid>();				
			
			saeunids=saeunid.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeunids.size();
			
			
			Unidad unidad= new Unidad();
			
			TipoUnidadLogic tipounidadLogic=new TipoUnidadLogic();
			TipoUnidad tipounidad= new TipoUnidad();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeunid saeunid2:saeunids) {
				idManual++;
				
				//nombre=GetFormatoNombreUnidad(saeunid2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoUnidad(saeunid2.getcact_cod_cact());
				
				nombre=saeunid2.getunid_nom_unid().trim();
				
				System.out.println(nombre);
				
				unidad= new Unidad();
				
				/*
				unidad.setId(lcodigo);
				unidad.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				tipounidadLogic.getTipoUnidadPorNombreWithConnection(nombre);
				tipounidad=tipounidadLogic.getTipoUnidad();
				
				
				if(tipounidad!=null && tipounidad.getId()>0) {
					unidad.setid_tipo_unidad(tipounidad.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
				
	 			unidad.setid_empresa(1L);
	 			//unidad.setid_tipo_unidad(-1L);
	 			
	 			unidad.setnombre(saeunid2.getunid_nom_unid().trim());
	 			unidad.setsiglas(saeunid2.getunid_sigl_unid().trim());
	 			
			
				
				unidadLogic.getUnidads().add(unidad);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//unidadLogic.saveUnidadsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalUnidad() throws SQLException, Exception{
		String sFinal="  where unid_cod_empr=1 ";		
		return sFinal;
	}

	public static String GetFormatoNombreUnidad(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteUnidad(String nombre,List<Unidad> unidads) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Unidad unidad: unidads) {
			if(unidad.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoUnidad(Boolean esHibernate) throws SQLException, Exception{
		TipoUnidadLogic tipounidadLogic=new TipoUnidadLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeunid saeunid=new saeunid();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoUnidad();

			
			List<saeunid> saeunids = new  ArrayList<saeunid>();				
			
			saeunids=saeunid.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeunids.size();
			
			
			TipoUnidad tipounidad= new TipoUnidad();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeunid saeunid2:saeunids) {
				idManual++;
				
				//nombre=GetFormatoNombreTipoUnidad(saeunid2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoTipoUnidad(saeunid2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipounidad= new TipoUnidad();
				
				
				tipounidad.setId(idManual);
				tipounidad.setnombre(saeunid2.getunid_nom_unid().trim());
				tipounidad.setsiglas(saeunid2.getunid_sigl_unid().trim());
				
				/*
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/					 			
			
				
				tipounidadLogic.getTipoUnidads().add(tipounidad);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipounidadLogic.saveTipoUnidadsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}
	
	public static String GetFinalTipoUnidad() throws SQLException, Exception{
		String sFinal=" where unid_cod_empr=1 ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoUnidad(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoUnidad(String nombre,List<TipoUnidad> tipounidads) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoUnidad tipounidad: tipounidads) {
			if(tipounidad.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoAfiliacion(Boolean esHibernate) throws SQLException, Exception{
		TipoAfiliacionLogic tipoafiliacionLogic=new TipoAfiliacionLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepdie saepdie=new saepdie();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoAfiliacion();

			
			List<saepdie> saepdies = new  ArrayList<saepdie>();				
			
			saepdies=saepdie.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepdies.size();
			
			
			TipoAfiliacion tipoafiliacion= new TipoAfiliacion();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepdie saepdie2:saepdies) {
				idManual++;
				
				//nombre=GetFormatoNombreTipoAfiliacion(saepdie2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoTipoAfiliacion(saepdie2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoafiliacion= new TipoAfiliacion();
				
				/*
				tipoafiliacion.setId(lcodigo);
				tipoafiliacion.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			tipoafiliacion.setid_empresa(1L);
	 			tipoafiliacion.setid_cate_tipo_afiliacion(ProcessMigration.GetCateTipoAfiliacion(saepdie2.getpdie_pla_pdie().trim()));
	 			tipoafiliacion.setcodigo(saepdie2.getpdie_cod_pdie().trim());
	 			tipoafiliacion.setnombre(saepdie2.getpdie_des_pdie().trim());
	 			tipoafiliacion.setporcen_emplea(saepdie2.getpdie_por_empl());
	 			tipoafiliacion.setporcen_patro(saepdie2.getpdie_por_patr());
	 			tipoafiliacion.setporcen_gene_emplea(saepdie2.getpdie_por_gemp());
	 			tipoafiliacion.setporcen_gene_patro(saepdie2.getpdie_por_gpat());
	 			tipoafiliacion.setporcen_secu(saepdie2.getpdie_por_seca());
	 			tipoafiliacion.setporcen_iece(saepdie2.getpdie_por_iece());
	 			tipoafiliacion.setdescripcion(saepdie2.getpdie_des_pdie().trim());
			
				
				tipoafiliacionLogic.getTipoAfiliacions().add(tipoafiliacion);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipoafiliacionLogic.saveTipoAfiliacionsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetCateTipoAfiliacion(String sTipo) throws SQLException, Exception{
		Long sFinal=1L;
		
		if(sTipo.equals("A")) {
			sFinal=1L;
		
		} else if(sTipo.equals("B")) {
			sFinal=2L;
			
		} else if(sTipo.equals("C")) {
			sFinal=3L;
		} else if(sTipo.equals("D")) {
			sFinal=4L;
		} else if(sTipo.equals("E")) {
			sFinal=5L;
		} else if(sTipo.equals("F")) {
			sFinal=6L;
		} else if(sTipo.equals("G")) {
			sFinal=7L;
		} else if(sTipo.equals("H")) {
			sFinal=8L;
		} else if(sTipo.equals("I")) {
			sFinal=9L;
		} else if(sTipo.equals("J")) {
			sFinal=10L;
		} else if(sTipo.equals("K")) {
			sFinal=11L;
		} else if(sTipo.equals("L")) {
			sFinal=12L;
		} else if(sTipo.equals("M")) {
			sFinal=13L;
		} else if(sTipo.equals("N")) {
			sFinal=14L;
		} else if(sTipo.equals("O")) {
			sFinal=15L;
		}
		
		return sFinal;
	}
	
	public static String GetFinalTipoAfiliacion() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoAfiliacion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoAfiliacion(String nombre,List<TipoAfiliacion> tipoafiliacions) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoAfiliacion tipoafiliacion: tipoafiliacions) {
			if(tipoafiliacion.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void RubroEmplea(Boolean esHibernate) throws SQLException, Exception{
		RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saerubr saerubr=new saerubr();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalRubroEmplea();

			
			List<saerubr> saerubrs = new  ArrayList<saerubr>();				
			
			saerubrs=saerubr.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saerubrs.size();
			
			
			RubroEmplea rubroemplea= new RubroEmplea();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saerubr saerubr2:saerubrs) {
				idManual++;
				
				//nombre=GetFormatoNombreRubroEmplea(saerubr2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoRubroEmplea(saerubr2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				rubroemplea= new RubroEmplea();
				
				/*
				rubroemplea.setId(lcodigo);
				rubroemplea.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			rubroemplea.setid_empresa(1L);
	 			rubroemplea.setid_tipo_calculo(GetTipoCalculoRubroEmplea(saerubr2.getrubr_cod_fcru().trim()));
	 			rubroemplea.setid_tipo_rubro_emplea(GetTipoRubroEmplea(saerubr2.getrubr_cod_erub().trim()));
	 			rubroemplea.setid_tipo_grupo_rubro_emplea(GetTipoGrupoRubroEmplea(saerubr2.getrubr_cod_trub().trim()));
	 			rubroemplea.setcodigo(saerubr2.getrubr_cod_rubr().trim());
	 			rubroemplea.setnombre(saerubr2.getrubr_des_rubr().trim());
	 			rubroemplea.setformula(saerubr2.getrubr_for_rubr());
	 			rubroemplea.setalias(saerubr2.getrubr_des_alia().trim());
	 			rubroemplea.setsecuencial(saerubr2.getrubr_sec_rubr());
	 			
	 			
	 			if(saerubr2.getrubr_rol_desp()!=null && saerubr2.getrubr_rol_desp().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_rol_pagos(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_tsu_rubr()!=null && saerubr2.getrubr_tsu_rubr().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_sueldo(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_pag_vaca()!=null && saerubr2.getrubr_pag_vaca().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_vacaciones(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_pag_impu()!=null && saerubr2.getrubr_pag_impu().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_impuesto_renta(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_pag_iess()!=null && saerubr2.getrubr_pag_iess().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_seguro_social(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_pag_prov()!=null && saerubr2.getrubr_pag_prov().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_provisiones(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_uti_rubr()!=null && saerubr2.getrubr_uti_rubr().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_utilidades(isTrueFalse);
	 			
	 			if(saerubr2.getrubr_iess_rubr()!=null && saerubr2.getrubr_iess_rubr().equals("1")){isTrueFalse=true;}else{isTrueFalse=false;}
	 			rubroemplea.setpara_rubro_iess(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			rubroemplea.setes_fondo_reserva(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			rubroemplea.setes_decimo_tercero(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			rubroemplea.setes_decimo_cuarto(isTrueFalse);
			
				
				rubroempleaLogic.getRubroEmpleas().add(rubroemplea);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			rubroempleaLogic.saveRubroEmpleasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetTipoGrupoRubroEmplea(String sTipo) throws SQLException, Exception{
		Long sFinal=1L;
		
		if(sTipo.equals("I")) {
			sFinal=1L;
		
		} else if(sTipo.equals("D")) {
			sFinal=2L;
			
		} else if(sTipo.equals("P")) {
			sFinal=3L;
		}
		
		return sFinal;
	}
	
	public static Long GetTipoRubroEmplea(String sTipo) throws SQLException, Exception{
		Long sFinal=1L;
		
		if(sTipo.equals("F")) {
			sFinal=1L;
		
		} else if(sTipo.equals("V")) {
			sFinal=2L;
			
		}
		
		return sFinal;
	}
	
	public static Long GetTipoCalculoRubroEmplea(String sTipo) throws SQLException, Exception{
		Long sFinal=1L;
		
		if(sTipo.equals("C")) {
			sFinal=1L;
		
		} else if(sTipo.equals("F")) {
			sFinal=3L;
			
		} else if(sTipo.equals("V")) {
			sFinal=2L;
			
		}
		
		return sFinal;
	}
	
	public static String GetFinalRubroEmplea() throws SQLException, Exception{
		String sFinal=" where rubr_cod_empr=1 ";		
		return sFinal;
	}

	public static String GetFormatoNombreRubroEmplea(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteRubroEmplea(String nombre,List<RubroEmplea> rubroempleas) throws SQLException, Exception{
		Boolean existe=false;
			
		for(RubroEmplea rubroemplea: rubroempleas) {
			if(rubroemplea.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void VariableNomi(Boolean esHibernate) throws SQLException, Exception{
		VariableNomiLogic variablenomiLogic=new VariableNomiLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saevari saevari=new saevari();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalVariableNomi();

			
			List<saevari> saevaris = new  ArrayList<saevari>();				
			
			saevaris=saevari.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saevaris.size();
			
			
			VariableNomi variablenomi= new VariableNomi();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saevari saevari2:saevaris) {
				idManual++;
				
				//nombre=GetFormatoNombreVariableNomi(saevari2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoVariableNomi(saevari2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				variablenomi= new VariableNomi();
				
				/*
				variablenomi.setId(lcodigo);
				variablenomi.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			variablenomi.setid_empresa(1L);
	 			variablenomi.setid_modulo(8L);
	 			variablenomi.setid_tipo_variable_nomi(ProcessMigration.GetTipoVariableNomi(saevari2.getvari_cod_tvar().trim()));
	 			variablenomi.setid_tipo_valor_variable_nomi(1L);
	 			variablenomi.setcodigo(saevari2.getvari_cod_vari().trim());
	 			variablenomi.setnombre(saevari2.getvari_des_vari().trim());
	 			if(saevari2.getvari_sql_vari()!=null){variablenomi.setsql1(saevari2.getvari_sql_vari().trim());}
	 			if(saevari2.getvari_sq1_vari()!=null){variablenomi.setsql2(saevari2.getvari_sq1_vari().trim());}
	 			if(saevari2.getvari_sq2_vari()!=null){variablenomi.setsql3(saevari2.getvari_sq2_vari().trim());}
	 			variablenomi.setvalor(saevari2.getvari_val_vari());
			
				
				variablenomiLogic.getVariableNomis().add(variablenomi);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			variablenomiLogic.saveVariableNomisWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetTipoVariableNomi(String sTipo) throws SQLException, Exception{
		Long sFinal=1L;
		
		if(sTipo.equals("S")) {
			sFinal=2L;
			
		} else if(sTipo.equals("V")) {
			sFinal=3L;
		}
		
		return sFinal;
	}
	
	public static String GetFinalVariableNomi() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreVariableNomi(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteVariableNomi(String nombre,List<VariableNomi> variablenomis) throws SQLException, Exception{
		Boolean existe=false;
			
		for(VariableNomi variablenomi: variablenomis) {
			if(variablenomi.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void ImpuestoRenta(Boolean esHibernate) throws SQLException, Exception{
		ImpuestoRentaLogic impuestorentaLogic=new ImpuestoRentaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeiren saeiren=new saeiren();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalImpuestoRenta();

			
			List<saeiren> saeirens = new  ArrayList<saeiren>();				
			
			saeirens=saeiren.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeirens.size();
			
			
			ImpuestoRenta impuestorenta= new ImpuestoRenta();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeiren saeiren2:saeirens) {
				idManual++;
				
				//nombre=GetFormatoNombreImpuestoRenta(saeiren2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoImpuestoRenta(saeiren2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				impuestorenta= new ImpuestoRenta();
				
				/*
				impuestorenta.setId(lcodigo);
				impuestorenta.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			impuestorenta.setid_empresa(1L);
	 			impuestorenta.setdesde(saeiren2.getiren_val_inic());
	 			impuestorenta.sethasta(saeiren2.getiren_val_fina());
	 			impuestorenta.setimpuesto(saeiren2.getiren_val_iren());
	 			impuestorenta.setporcentaje(saeiren2.getiren_por_iren());
			
				
				impuestorentaLogic.getImpuestoRentas().add(impuestorenta);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			impuestorentaLogic.saveImpuestoRentasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalImpuestoRenta() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreImpuestoRenta(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteImpuestoRenta(String nombre,List<ImpuestoRenta> impuestorentas) throws SQLException, Exception{
		Boolean existe=false;
			
		for(ImpuestoRenta impuestorenta: impuestorentas) {
			/*
			if(impuestorenta.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
			*/
		}
			
		return existe;
	}
	
	public static void PeriodoDeclara(Boolean esHibernate) throws SQLException, Exception{
		PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepinf saepinf=new saepinf();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalPeriodoDeclara();

			
			List<saepinf> saepinfs = new  ArrayList<saepinf>();				
			
			saepinfs=saepinf.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepinfs.size();
			
			
			PeriodoDeclara periododeclara= new PeriodoDeclara();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepinf saepinf2:saepinfs) {
				idManual++;
				
				//nombre=GetFormatoNombrePeriodoDeclara(saepinf2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoPeriodoDeclara(saepinf2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				periododeclara= new PeriodoDeclara();
				
				/*
				periododeclara.setId(lcodigo);
				periododeclara.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			periododeclara.setcodigo(saepinf2.getpinf_cod_pinf().trim());
	 			periododeclara.setid_anio(Long.parseLong(saepinf2.getpinf_ano_pinf().toString()));
	 			periododeclara.setid_mes(Long.parseLong(saepinf2.getpinf_mes_pinf().toString()));
	 			periododeclara.setfecha(new Date());
	 			periododeclara.setesta_activo(true);
			
				
				periododeclaraLogic.getPeriodoDeclaras().add(periododeclara);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			periododeclaraLogic.savePeriodoDeclarasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalPeriodoDeclara() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombrePeriodoDeclara(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExistePeriodoDeclara(String nombre,List<PeriodoDeclara> periododeclaras) throws SQLException, Exception{
		Boolean existe=false;
			
		for(PeriodoDeclara periododeclara: periododeclaras) {
			if(periododeclara.getcodigo().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Embarcador(Boolean esHibernate) throws SQLException, Exception{
		EmbarcadorLogic embarcadorLogic=new EmbarcadorLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeemba saeemba=new saeemba();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalEmbarcador();

			
			List<saeemba> saeembas = new  ArrayList<saeemba>();				
			
			saeembas=saeemba.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeembas.size();
			
			
			Embarcador embarcador= new Embarcador();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeemba saeemba2:saeembas) {
				idManual++;
				
				//nombre=GetFormatoNombreEmbarcador(saeemba2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoEmbarcador(saeemba2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				embarcador= new Embarcador();
				
				/*
				embarcador.setId(lcodigo);
				embarcador.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			embarcador.setid_empresa(1L);
	 			embarcador.setid_pais(1L);
	 			embarcador.setid_ciudad(1L);
	 			embarcador.setid_empleado(1L);
	 			embarcador.setid_tipo_via_transporte(1L);
	 			embarcador.setid_puerto(1L);
	 			
	 			if(saeemba2.getemba_ruc_emba()!=null) 
	 			embarcador.setruc(saeemba2.getemba_ruc_emba().trim());
	 			
	 			if(saeemba2.getemba_nom_emba()!=null) 
	 			embarcador.setnombre(saeemba2.getemba_nom_emba().trim());
	 			
	 			if(saeemba2.getemba_dir_emba()!=null) 
	 			embarcador.setdireccion(saeemba2.getemba_dir_emba().trim());
	 			
	 			if(saeemba2.getemba_mail_emba()!=null) 
	 			embarcador.sete_mail(saeemba2.getemba_mail_emba().trim());
	 			
	 			if(saeemba2.getemba_telf_emba()!=null) 
	 			embarcador.settelefono(saeemba2.getemba_telf_emba().trim());
	 			
	 			if(saeemba2.getemba_fax_emba()!=null) 
	 			embarcador.setfax(saeemba2.getemba_fax_emba().trim());
	 			
	 			if(saeemba2.getemba_cto_emba()!=null) 
	 			embarcador.setcontacto(saeemba2.getemba_cto_emba().trim());
			
				
				embarcadorLogic.getEmbarcadors().add(embarcador);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			embarcadorLogic.saveEmbarcadorsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalEmbarcador() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreEmbarcador(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void Arancel(Boolean esHibernate) throws SQLException, Exception{
		ArancelLogic arancelLogic=new ArancelLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saearan saearan=new saearan();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalArancel();

			
			List<saearan> saearans = new  ArrayList<saearan>();				
			
			saearans=saearan.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saearans.size();
			
			
			Arancel arancel= new Arancel();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saearan saearan2:saearans) {
				idManual++;
				
				//nombre=GetFormatoNombreArancel(saearan2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoArancel(saearan2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				arancel= new Arancel();
				
				/*
				arancel.setId(lcodigo);
				arancel.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			arancel.setid_empresa(1L);
	 			arancel.setcodigo(saearan2.getaran_aran_aran().trim());
	 			arancel.setnombre(saearan2.getaran_obs_aran().trim());
	 			arancel.setporcentaje(saearan2.getaran_por_aran());
	 			arancel.setobservacion(saearan2.getaran_nom_cort());
			
				
				arancelLogic.getArancels().add(arancel);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			arancelLogic.saveArancelsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalArancel() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreArancel(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void CostoGastoImpor(Boolean esHibernate) throws SQLException, Exception{
		CostoGastoImporLogic costogastoimporLogic=new CostoGastoImporLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saecoga saecoga=new saecoga();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalCostoGastoImpor();

			
			List<saecoga> saecogas = new  ArrayList<saecoga>();				
			
			saecogas=saecoga.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saecogas.size();
			
			
			CostoGastoImpor costogastoimpor= new CostoGastoImpor();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saecoga saecoga2:saecogas) {
				idManual++;
				
				//nombre=GetFormatoNombreCostoGastoImpor(saecoga2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoCostoGastoImpor(saecoga2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				costogastoimpor= new CostoGastoImpor();
				
				/*
				costogastoimpor.setId(lcodigo);
				costogastoimpor.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			costogastoimpor.setid_empresa(Long.parseLong(saecoga2.getcoga_cod_empr().toString()));
	 			costogastoimpor.setid_sucursal(Long.parseLong(saecoga2.getcoga_cod_sucu().toString()));	 			
	 			costogastoimpor.setnombre(saecoga2.getcoga_des_coga().trim());
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_act_coga()!=null && saecoga2.getcoga_act_coga().equals("A")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setes_activo(isTrueFalse);
	 			
	 			isTrueFalse=true;
	 			if(saecoga2.getcoga_agr_coga()!=null &&saecoga2.getcoga_agr_coga().equals("N")) {
	 				isTrueFalse=false;
	 			}
	 			costogastoimpor.setcon_agrupa(isTrueFalse);
	 			
	 			isTrueFalse=true;
	 			if(saecoga2.getcoga_ing_coga()!=null &&saecoga2.getcoga_ing_coga().equals("N")) {
	 				isTrueFalse=false;
	 			}
	 			costogastoimpor.setcon_prorratea(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_fac_coga()!=null &&saecoga2.getcoga_fac_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_factura(isTrueFalse);
	 			
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_fle_coga()!=null &&saecoga2.getcoga_fle_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_flete(isTrueFalse);
	 			
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_ara_coga()!=null &&saecoga2.getcoga_ara_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_arancel(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_seg_coga()!=null &&saecoga2.getcoga_seg_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_seguro(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_tip_coga()!=null &&saecoga2.getcoga_tip_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_total_general(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			if(saecoga2.getcoga_dig_coga()!=null &&saecoga2.getcoga_dig_coga().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			costogastoimpor.setcon_digitado(isTrueFalse);
			
	 			costogastoimpor.setid_tipo_costo_gasto_impor(GetConstantTipoCostoGasto(saecoga2.getcoga_est_coga()));
				
				costogastoimporLogic.getCostoGastoImpors().add(costogastoimpor);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			costogastoimporLogic.saveCostoGastoImporsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetConstantTipoCostoGasto(String sTipoGrupo) throws SQLException, Exception{
		Long idModulo=1L;
		
		if(sTipoGrupo!=null) {
			switch(sTipoGrupo){ 
				case "C": 
							idModulo=1L;
					   		break;
				case "G": 
							idModulo=2L;
							break;
				case "M": 
							idModulo=3L;
							break;
					
				case "P": 
							idModulo=4L;
							break;
				default: idModulo=1L;
			};
		}
		
		return idModulo;		
	}
	
	public static String GetFinalCostoGastoImpor() throws SQLException, Exception{
		String sFinal=" where coga_cod_empr=1 and coga_cod_sucu=1";		
		return sFinal;
	}

	public static String GetFormatoNombreCostoGastoImpor(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void Puerto(Boolean esHibernate) throws SQLException, Exception{
		PuertoLogic puertoLogic=new PuertoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeprto saeprto=new saeprto();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalPuerto();

			
			List<saeprto> saeprtos = new  ArrayList<saeprto>();				
			
			saeprtos=saeprto.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeprtos.size();
			
			
			Puerto puerto= new Puerto();
			
			PaisLogic paisLogic=new PaisLogic();
			Pais pais= new Pais();	
			
			saepais saepais= new saepais();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeprto saeprto2:saeprtos) {
				idManual++;
				
				nombre=GetFormatoNombrePuerto(saeprto2.getprto_des_prto());
				//lcodigo=GetFormatoCodigoPuerto(saeprto2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				puerto= new Puerto();
				
				/*
				puerto.setId(lcodigo);
				puerto.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 				 			
	 			puerto.setnombre(nombre);
	 			puerto.setes_local(false);
	 			puerto.setdescripcion(nombre);
			
				if(saeprto2.getprto_tip_prto().equals("E")) {
					puerto.setid_tipo_puerto(1L);
				} else {
					puerto.setid_tipo_puerto(2L);
				}
				
				List<saepais> saepaiss=new ArrayList<saepais>(); 
				sFinalQuery=" where pais_cod_pais="+saeprto2.getprto_pais_prto()+"";								
				saepaiss=saepais.getEntitiesWithConnection(sFinalQuery);
				
				if(saepaiss.size()>0) {
					String sNombre="";
					for(saepais saepaisAux:saepaiss) {
						sNombre=saepaisAux.getpais_des_pais();
					}
					
					sFinalQuery=" where nombre='"+sNombre.trim()+"'";
						
					paisLogic.getEntityWithConnection(sFinalQuery);
					pais=paisLogic.getPais();
				
				
					if(pais!=null && pais.getId()>0) {
						puerto.setid_pais(pais.getId());	
						
					} else {
						countNoExiste++;
						stringBuilderNoExiste.append(","+nombre);
						
						continue;
					}
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
				puertoLogic.getPuertos().add(puerto);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			puertoLogic.savePuertosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalPuerto() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}
	
	public static String GetFormatoNombrePuerto(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void Zona(Boolean esHibernate) throws SQLException, Exception{
		ZonaLogic zonaLogic=new ZonaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saezona saezona=new saezona();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalZona();

			
			List<saezona> saezonas = new  ArrayList<saezona>();				
			
			saezonas=saezona.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saezonas.size();
			
			
			Zona zona= new Zona();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saezona saezona2:saezonas) {
				idManual++;
				
				nombre=GetFormatoNombreZona(saezona2.getzona_nom_zona());
				//lcodigo=GetFormatoCodigoZona(saezona2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				zona= new Zona();
				
				/*
				zona.setId(lcodigo);
				zona.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(saezona2.getzona_cod_zona().equals(11)) {
					continue;
				}
				
	 			zona.setid_empresa(Long.parseLong(saezona2.getzona_cod_empr().toString()));
	 			zona.setid_sucursal(Long.parseLong(saezona2.getzona_cod_sucu().toString()));
	 			zona.setnombre(nombre);
			
				
				zonaLogic.getZonas().add(zona);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			zonaLogic.saveZonasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalZona() throws SQLException, Exception{
		String sFinal=" where zona_cod_empr=1 and zona_cod_sucu=1";		
		return sFinal;
	}

	public static String GetFormatoNombreZona(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteZona(String nombre,List<Zona> zonas) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Zona zona: zonas) {
			if(zona.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Ciudad(Boolean esHibernate) throws SQLException, Exception{
		CiudadLogic ciudadLogic=new CiudadLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeciud saeciud=new saeciud();
			saepais saepais=new saepais();
			saeprovc saeprovc=new saeprovc();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalCiudad();

			
			List<saeciud> saeciuds = new  ArrayList<saeciud>();
			List<saeprovc> saeprovcs = new  ArrayList<saeprovc>();	
			List<saepais> saepaiss = new  ArrayList<saepais>();	
			
			saeciuds=saeciud.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeciuds.size();
			
			
			Ciudad ciudad= new Ciudad();
			
			ProvinciaLogic provinciaLogic=new ProvinciaLogic();
			Provincia provincia= new Provincia();		
						
			PaisLogic paisLogic=new PaisLogic();
			Pais pais= new Pais();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			String nombre_pais="";
			String nombre_provincia="";
			
			Long lcodigo=1L;
			Long idModulo=0L;
			Long idPais=24L;
			Long idProvincia=1L;
			
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeciud saeciud2:saeciuds) {
				idManual++;
				idPais=24L;
				idProvincia=1L;
				
				nombre=GetFormatoNombreCiudad(saeciud2.getciud_nom_ciud());
				//lcodigo=GetFormatoCodigoCiudad(saeciud2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				ciudad= new Ciudad();
				
				/*
				ciudad.setId(lcodigo);
				ciudad.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				provinciaLogic.getProvinciaPorNombreWithConnection(nombre);
				provincia=provinciaLogic.getProvincia();
				
				
				if(provincia!=null && provincia.getId()>0) {
					ciudad.setid_provincia(provincia.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				*/
				
				
	 			if(saeciud2.getciud_cod_ciud().equals(2119.0) || saeciud2.getciud_cod_ciud().equals(2120.0)
	 				|| saeciud2.getciud_cod_ciud().equals(2188.0)|| saeciud2.getciud_cod_ciud().equals(163.0)
	 				|| saeciud2.getciud_cod_ciud().equals(167.0)|| saeciud2.getciud_cod_ciud().equals(2121.0)) {
	 				continue;
	 			}
	 			
	 			
	 			ciudad.setcodigo(nombre);
	 			ciudad.setnombre(nombre);
			
	 			idProvincia=null;
	 			
	 			if(saeciud2.getciud_cod_provc()!=null && saeciud2.getciud_cod_provc()!="" && saeciud2.getciud_cod_provc()!="0") {
		 			sFinalQuery=" where provc_cod_provc="+saeciud2.getciud_cod_provc();
		 			saeprovcs=saeprovc.getEntitiesWithConnection(sFinalQuery);
		 			
		 			if(saeprovcs.size()<=0) {
		 				//continue;
		 				idProvincia=null;
		 			} else {
		 				for(saeprovc saeprovc2:saeprovcs) {
		 					nombre_provincia=GetFormatoNombreProvincia(saeprovc2.getprovc_nom_provc());		 				
			 			}
		 				
		 				sFinalQuery=" where nombre='"+nombre_provincia+"'";
		 				provinciaLogic.getEntityWithConnection(sFinalQuery);
		 				
		 				idProvincia=provinciaLogic.getProvincia().getId();
		 			}
	 			}
	 			
	 			//PAIS
	 			sFinalQuery=" where pais_cod_pais="+saeciud2.getciud_cod_pais();
	 			saepaiss=saepais.getEntitiesWithConnection(sFinalQuery);
	 			
	 			if(saepaiss.size()<=0) {
	 				continue;
	 			} else {
	 				for(saepais saepais2:saepaiss) {
	 					nombre_pais=GetFormatoNombrePais(saepais2.getpais_des_pais());		 						 				
		 			}
	 				
	 				sFinalQuery=" where nombre='"+nombre_pais+"'";
	 				paisLogic.getEntityWithConnection(sFinalQuery);
	 				
	 				idPais=paisLogic.getPais().getId();
	 			}	 			
	 			
	 			
	 			
	 			ciudad.setid_pais(idPais);
	 			ciudad.setid_provincia(idProvincia);
	 			
				
				ciudadLogic.getCiudads().add(ciudad);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			ciudadLogic.saveCiudadsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalCiudad() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreCiudad(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteCiudad(String nombre,List<Ciudad> ciudads) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Ciudad ciudad: ciudads) {
			if(ciudad.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Provincia(Boolean esHibernate) throws SQLException, Exception{
		ProvinciaLogic provinciaLogic=new ProvinciaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeprovc saeprovc=new saeprovc();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalProvincia();

			
			List<saeprovc> saeprovcs = new  ArrayList<saeprovc>();				
			
			saeprovcs=saeprovc.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeprovcs.size();
			
			
			Provincia provincia= new Provincia();
			
			RegionLogic regionLogic=new RegionLogic();
			Region region= new Region();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Long idPaisEcuador=24L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeprovc saeprovc2:saeprovcs) {
				idManual++;
				
				nombre=GetFormatoNombreProvincia(saeprovc2.getprovc_nom_provc());
				//lcodigo=GetFormatoCodigoProvincia(saeprovc2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				provincia= new Provincia();
				
				/*
				provincia.setId(lcodigo);
				provincia.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				regionLogic.getRegionPorNombreWithConnection(nombre);
				region=regionLogic.getRegion();
				
				
				if(region!=null && region.getId()>0) {
					provincia.setid_region(region.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				*/
				
	 			provincia.setid_pais(idPaisEcuador);
	 			provincia.setcodigo(nombre);
	 			provincia.setnombre(nombre);
			
				
	 			provincia.setid_region(GetConstantRegion(saeprovc2.getprovc_cod_region()));
	 			
				provinciaLogic.getProvincias().add(provincia);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			provinciaLogic.saveProvinciasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalProvincia() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreProvincia(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteProvincia(String nombre,List<Provincia> provincias) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Provincia provincia: provincias) {
			if(provincia.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Region(Boolean esHibernate) throws SQLException, Exception{
		RegionLogic regionLogic=new RegionLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saergion saergion=new saergion();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalRegion();

			
			List<saergion> saergions = new  ArrayList<saergion>();				
			
			saergions=saergion.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saergions.size();
			
			
			Region region= new Region();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			Long idPaisEcuador=24L;
			
			for(saergion saergion2:saergions) {
				idManual++;
				
				nombre=GetFormatoNombreRegion(saergion2.getrgion_nom_rgion());
				//lcodigo=GetFormatoCodigoRegion(saergion2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				region= new Region();
				
				/*
				region.setId(lcodigo);
				region.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(saergion2.getrgion_cod_rgion().equals(5.0) || saergion2.getrgion_cod_rgion().equals(6.0)) {
					continue;
				}
	 			
	 			region.setcodigo(nombre);
	 			region.setnombre(nombre);
			
				
	 			region.setid_pais(idPaisEcuador);
	 			
				regionLogic.getRegions().add(region);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			regionLogic.saveRegionsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalRegion() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreRegion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteRegion(String nombre,List<Region> regions) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Region region: regions) {
			if(region.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Pais(Boolean esHibernate) throws SQLException, Exception{
		PaisLogic paisLogic=new PaisLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepais saepais=new saepais();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalPais();

			
			List<saepais> saepaiss = new  ArrayList<saepais>();				
			
			saepaiss=saepais.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepaiss.size();
			
			
			Pais pais= new Pais();
			
			ContinenteLogic continenteLogic=new ContinenteLogic();
			Continente continente= new Continente();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepais saepais2:saepaiss) {
				idManual++;
				
				nombre=GetFormatoNombrePais(saepais2.getpais_des_pais());
				//lcodigo=GetFormatoCodigoPais(saepais2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				pais= new Pais();
				
				/*
				pais.setId(lcodigo);
				pais.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				continenteLogic.getContinentePorNombreWithConnection(nombre);
				continente=continenteLogic.getContinente();
				
				
				if(continente!=null && continente.getId()>0) {
					pais.setid_continente(continente.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				*/
					 		
				if(saepais2.getpais_cod_pais().equals(31.0)) {
					continue;
				}
				
	 			pais.setcodigo(nombre);
	 			pais.setnombre(nombre);
	 			pais.setnacionalidad(saepais2.getpais_des_naci().trim());
	 			//saepais2.getpais_cod_grup()
	 			pais.setid_continente(GetConstantContinente(saepais2.getpais_cod_grup()));
	 			
				paisLogic.getPaiss().add(pais);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			paisLogic.savePaissWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalPais() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombrePais(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExistePais(String nombre,List<Pais> paiss) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Pais pais: paiss) {
			if(pais.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void Continente(Boolean esHibernate) throws SQLException, Exception{
		ContinenteLogic continenteLogic=new ContinenteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saegrup saegrup=new saegrup();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalContinente();

			
			List<saegrup> saegrups = new  ArrayList<saegrup>();				
			
			saegrups=saegrup.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saegrups.size();
			
			
			Continente continente= new Continente();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saegrup saegrup2:saegrups) {
				idManual++;
				
				nombre=GetFormatoNombreContinente(saegrup2.getgrup_des_grup());
				//lcodigo=GetFormatoCodigoContinente(saegrup2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				continente= new Continente();
				
				/*
				continente.setId(lcodigo);
				continente.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(saegrup2.getgrup_cod_grup().equals(13.0)) {
					continue;
				}
				
				continente.setId(idManual);
	 			continente.setcodigo(nombre);
	 			continente.setnombre(nombre);
			
				
				continenteLogic.getContinentes().add(continente);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			continenteLogic.saveContinentesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalContinente() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreContinente(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteContinente(String nombre,List<Continente> continentes) throws SQLException, Exception{
		Boolean existe=false;
			
		for(Continente continente: continentes) {
			if(continente.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void PrioridadPedido(Boolean esHibernate) throws SQLException, Exception{
		PrioridadPedidoLogic prioridadpedidoLogic=new PrioridadPedidoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeprip saeprip=new saeprip();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoPrioridadPedido();

			
			List<saeprip> saeprips = new  ArrayList<saeprip>();				
			
			saeprips=saeprip.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeprips.size();
			
			
			PrioridadPedido prioridadpedido= new PrioridadPedido();
			
			TipoPrioridadPedidoLogic tipoprioridadpedidoLogic=new TipoPrioridadPedidoLogic();
			TipoPrioridadPedido tipoprioridadpedido= new TipoPrioridadPedido();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeprip saeprip2:saeprips) {
				idManual++;
				
				nombre=GetFormatoNombrePrioridadPedido(saeprip2.getprip_des_prip());
				//lcodigo=GetFormatoCodigoPrioridadPedido(saeprip2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				prioridadpedido= new PrioridadPedido();
				
				/*
				prioridadpedido.setId(lcodigo);
				prioridadpedido.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			prioridadpedido.setid_empresa(Long.parseLong(saeprip2.getprip_cod_empr().toString()));	 			
	 			prioridadpedido.setnombre(nombre);
	 			prioridadpedido.setdia(saeprip2.getprip_dia_entre());
			
	 			
	 			
	 			
				
				tipoprioridadpedidoLogic.getTipoPrioridadPedidoPorNombreWithConnection(nombre);
				tipoprioridadpedido=tipoprioridadpedidoLogic.getTipoPrioridadPedido();
				
				
				if(tipoprioridadpedido!=null && tipoprioridadpedido.getId()>0) {
					//prioridadpedido.setid_tipo_prioridad_pedido(tipoprioridadpedido.getId());	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
				prioridadpedidoLogic.getPrioridadPedidos().add(prioridadpedido);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			prioridadpedidoLogic.savePrioridadPedidosWithConnection();
			

			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalPrioridadPedido() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombrePrioridadPedido(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExistePrioridadPedido(String nombre,List<PrioridadPedido> prioridadpedidos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(PrioridadPedido prioridadpedido: prioridadpedidos) {
			if(prioridadpedido.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoPrioridadPedido(Boolean esHibernate) throws SQLException, Exception{
		TipoPrioridadPedidoLogic tipoprioridadpedidoLogic=new TipoPrioridadPedidoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeprip saeprip=new saeprip();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoPrioridadPedido();

			
			List<saeprip> saeprips = new  ArrayList<saeprip>();				
			
			saeprips=saeprip.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeprips.size();
			
			
			TipoPrioridadPedido tipoprioridadpedido= new TipoPrioridadPedido();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeprip saeprip2:saeprips) {
				idManual++;
				
				nombre=GetFormatoNombreTipoPrioridadPedido(saeprip2.getprip_des_prip());
				//lcodigo=GetFormatoCodigoTipoPrioridadPedido(saeprip2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoprioridadpedido= new TipoPrioridadPedido();
				
				/*
				tipoprioridadpedido.setId(lcodigo);
				tipoprioridadpedido.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipoprioridadpedido.setId(idManual);
	 			tipoprioridadpedido.setnombre(nombre);
			
				
				tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(tipoprioridadpedido);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoprioridadpedidoLogic.saveTipoPrioridadPedidosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoPrioridadPedido() throws SQLException, Exception{
		String sFinal=" where prip_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoPrioridadPedido(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	/*
	public static Boolean ExisteTipoPrioridadPedido(String nombre,List<TipoPrioridadPedido> tipoprioridadpedidos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoPrioridadPedido tipoprioridadpedido: tipoprioridadpedidos) {
			if(tipoprioridadpedido.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	*/
	
	public static void EstadoPedido(Boolean esHibernate) throws SQLException, Exception{
		EstadoPedidoLogic estadopedidoLogic=new EstadoPedidoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeestp saeestp=new saeestp();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoEstadoPedido();

			
			List<saeestp> saeestps = new  ArrayList<saeestp>();				
			
			saeestps=saeestp.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeestps.size();
			
			
			EstadoPedido estadopedido= new EstadoPedido();
			
			TipoEstadoPedidoLogic tipoestadopedidoLogic=new TipoEstadoPedidoLogic();
			TipoEstadoPedido tipoestadopedido= new TipoEstadoPedido();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeestp saeestp2:saeestps) {
				idManual++;
				
				nombre=GetFormatoNombreEstadoPedido(saeestp2.getestp_des_estp());
				//lcodigo=GetFormatoCodigoEstadoPedido(saeestp2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				estadopedido= new EstadoPedido();
				
				/*
				estadopedido.setId(lcodigo);
				estadopedido.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			//estadopedido.setid_empresa(Long.parseLong(saeestp2.getestp_cod_empr().toString()));	 			
	 			estadopedido.setcodigo(nombre);
	 			estadopedido.setnombre(nombre);
			
	 			
	 			tipoestadopedidoLogic.getTipoEstadoPedidoPorNombreWithConnection(nombre);
				tipoestadopedido=tipoestadopedidoLogic.getTipoEstadoPedido();
				
				
				if(tipoestadopedido.getId().equals(1L) || tipoestadopedido.getId().equals(1.1)) {
					continue;
				}
				
				
				if(tipoestadopedido!=null && tipoestadopedido.getId()>0) {
					//estadopedido.setid_tipo_estado_pedido(tipoestadopedido.getId()); 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
				
				estadopedidoLogic.getEstadoPedidos().add(estadopedido);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			estadopedidoLogic.saveEstadoPedidosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalEstadoPedido() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreEstadoPedido(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteEstadoPedido(String nombre,List<EstadoPedido> estadopedidos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(EstadoPedido estadopedido: estadopedidos) {
			if(estadopedido.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoEstadoPedido(Boolean esHibernate) throws SQLException, Exception{
		TipoEstadoPedidoLogic tipoestadopedidoLogic=new TipoEstadoPedidoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeestp saeestp=new saeestp();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoEstadoPedido();

			
			List<saeestp> saeestps = new  ArrayList<saeestp>();				
			
			saeestps=saeestp.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeestps.size();
			
			
			TipoEstadoPedido tipoestadopedido= new TipoEstadoPedido();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeestp saeestp2:saeestps) {
				idManual++;
				
				nombre=GetFormatoNombreTipoEstadoPedido(saeestp2.getestp_des_estp());
				//lcodigo=GetFormatoCodigoTipoEstadoPedido(saeestp2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoestadopedido= new TipoEstadoPedido();
				
				/*
				tipoestadopedido.setId(lcodigo);
				tipoestadopedido.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipoestadopedido.setId(idManual);
	 			tipoestadopedido.setnombre(nombre);
			
				
				tipoestadopedidoLogic.getTipoEstadoPedidos().add(tipoestadopedido);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoestadopedidoLogic.saveTipoEstadoPedidosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoEstadoPedido() throws SQLException, Exception{
		String sFinal=" where estp_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoEstadoPedido(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoEstadoPedido(String nombre,List<TipoEstadoPedido> tipoestadopedidos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoEstadoPedido tipoestadopedido: tipoestadopedidos) {
			if(tipoestadopedido.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoPrecio(Boolean esHibernate) throws SQLException, Exception{
		TipoPrecioLogic tipoprecioLogic=new TipoPrecioLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saenomp saenomp=new saenomp();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoPrecio();

			
			List<saenomp> saenomps = new  ArrayList<saenomp>();				
			
			saenomps=saenomp.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saenomps.size();
			
			
			TipoPrecio tipoprecio= new TipoPrecio();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saenomp saenomp2:saenomps) {
				idManual++;
				
				nombre=GetFormatoNombreTipoPrecio(saenomp2.getnomp_nomb_nomp());
				//lcodigo=GetFormatoCodigoTipoPrecio(saenomp2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoprecio= new TipoPrecio();
				
				/*
				tipoprecio.setId(lcodigo);
				tipoprecio.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			tipoprecio.setid_empresa(Long.parseLong(saenomp2.getnomp_cod_empr().toString()));
	 			tipoprecio.setesta_activo(true);
	 			tipoprecio.setcodigo(nombre);
	 			tipoprecio.setnombre(nombre);
	 			tipoprecio.setfecha_desde(new Date());
	 			tipoprecio.setfecha_hasta(new Date());
	 			tipoprecio.setmonto(0.0);
	 			tipoprecio.setdescripcion("");
			
				
				tipoprecioLogic.getTipoPrecios().add(tipoprecio);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoprecioLogic.saveTipoPreciosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoPrecio() throws SQLException, Exception{
		String sFinal=" where nomp_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoPrecio(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoPrecio(String nombre,List<TipoPrecio> tipoprecios) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoPrecio tipoprecio: tipoprecios) {
			if(tipoprecio.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void CuentaContableTipo(Boolean esHibernate) throws SQLException, Exception{
		CuentaContableTipoLogic cuentacontabletipoLogic=new CuentaContableTipoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saefaccue saefaccue=new saefaccue();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalCuentaContableTipo();

			
			List<saefaccue> saefaccues = new  ArrayList<saefaccue>();				
			
			saefaccues=saefaccue.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saefaccues.size();
			
			
			CuentaContableTipo cuentacontabletipo= new CuentaContableTipo();
			
			TipoCuentaContableTipoLogic tipocuentacontabletipoLogic=new TipoCuentaContableTipoLogic();
			TipoCuentaContableTipo tipocuentacontabletipo= new TipoCuentaContableTipo();		
			
			TipoProductoServicioLogic tipoproductoservicioLogic=new TipoProductoServicioLogic();
			TipoProductoServicio tipoproductoservicio= new TipoProductoServicio();		
			List<TipoProductoServicio> tipoproductoservicios = new  ArrayList<TipoProductoServicio>();
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			tipoproductoservicioLogic.getEntitiesWithConnection("");
			tipoproductoservicios =tipoproductoservicioLogic.getTipoProductoServicios();
					
			for(TipoProductoServicio tipoproductoservicio2:tipoproductoservicios) {
				for(saefaccue saefaccue2:saefaccues) {
					idManual++;
					
					nombre=GetFormatoNombreCuentaContableTipo(saefaccue2.getfaccue_nom_faccue());
					//lcodigo=GetFormatoCodigoCuentaContableTipo(saefaccue2.getcact_cod_cact());
							
					System.out.println(nombre);
					
					cuentacontabletipo= new CuentaContableTipo();
					
					/*
					cuentacontabletipo.setId(lcodigo);
					cuentacontabletipo.setnombre(nombre);
					
					if(saecact2.getcact_cod_cact()!=null) {
						tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
					}
					*/
					
					
					
		 			cuentacontabletipo.setid_empresa(Long.parseLong(saefaccue2.getfaccue_cod_empr().toString()));
		 			cuentacontabletipo.setnombre(nombre);	 			
		 			cuentacontabletipo.setid_cuenta_contable_venta(null);
		 			cuentacontabletipo.setid_cuenta_contable_descuento(null);
		 			cuentacontabletipo.setid_cuenta_contable_devolucion(null);
		 			cuentacontabletipo.setid_cuenta_contable_costo(null);
		 			cuentacontabletipo.setdigito_verificador(0);//NOSE
						 			
		 			cuentacontabletipo.setid_tipo_producto_servicio(tipoproductoservicio2.getId());
				
		 			
		 			tipocuentacontabletipoLogic.getTipoCuentaContableTipoPorNombreWithConnection(nombre);
					tipocuentacontabletipo=tipocuentacontabletipoLogic.getTipoCuentaContableTipo();
					
					
					if(tipocuentacontabletipo!=null && tipocuentacontabletipo.getId()>0) {
						cuentacontabletipo.setid_tipo_cuenta_contable_tipo(tipocuentacontabletipo.getId());	 	
					} else {
						countNoExiste++;
						stringBuilderNoExiste.append(","+nombre);
						
						continue;
					}
					
		 			
		 			
		 			
					cuentacontabletipoLogic.getCuentaContableTipos().add(cuentacontabletipo);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			cuentacontabletipoLogic.saveCuentaContableTiposWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalCuentaContableTipo() throws SQLException, Exception{
		String sFinal=" where faccue_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreCuentaContableTipo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoCuentaContableTipo(Boolean esHibernate) throws SQLException, Exception{
		TipoCuentaContableTipoLogic tipocuentacontabletipoLogic=new TipoCuentaContableTipoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saefaccue saefaccue=new saefaccue();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoCuentaContableTipo();

			
			List<saefaccue> saefaccues = new  ArrayList<saefaccue>();				
			
			saefaccues=saefaccue.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saefaccues.size();
			
			
			TipoCuentaContableTipo tipocuentacontabletipo= new TipoCuentaContableTipo();
			
			
			Long idManual=2L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saefaccue saefaccue2:saefaccues) {
				idManual++;
				
				nombre=GetFormatoNombreTipoCuentaContableTipo(saefaccue2.getfaccue_nom_faccue());
				//lcodigo=GetFormatoCodigoTipoCuentaContableTipo(saefaccue2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipocuentacontabletipo= new TipoCuentaContableTipo();
				
				/*
				tipocuentacontabletipo.setId(lcodigo);
				tipocuentacontabletipo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipocuentacontabletipo.setId(idManual);
	 			tipocuentacontabletipo.setnombre(nombre);
			
				if(!ExisteTipoCuentaContableTipo(nombre,tipocuentacontabletipoLogic.getTipoCuentaContableTipos())) {
					tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(tipocuentacontabletipo);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipocuentacontabletipoLogic.saveTipoCuentaContableTiposWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoCuentaContableTipo() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoCuentaContableTipo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoCuentaContableTipo(String nombre,List<TipoCuentaContableTipo> tipocuentacontabletipos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoCuentaContableTipo tipocuentacontabletipo: tipocuentacontabletipos) {
			if(tipocuentacontabletipo.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void EstadoFisicoFacturaEmpresa(Boolean esHibernate) throws SQLException, Exception{
		EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogic=new EstadoFisicoFacturaEmpresaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeesfa saeesfa=new saeesfa();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalEstadoFisicoFacturaEmpresa();

			
			List<saeesfa> saeesfas = new  ArrayList<saeesfa>();				
			
			saeesfas=saeesfa.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeesfas.size();
			
			
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresa= new EstadoFisicoFacturaEmpresa();
			
			EstadoFisicoFacturaLogic estadofisicofacturaLogic=new EstadoFisicoFacturaLogic();
			EstadoFisicoFactura estadofisicofactura= new EstadoFisicoFactura();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeesfa saeesfa2:saeesfas) {
				idManual++;
				
				nombre=GetFormatoNombreEstadoFisicoFacturaEmpresa(saeesfa2.getesfa_nom_esfa());
				//lcodigo=GetFormatoCodigoEstadoFisicoFacturaEmpresa(saeesfa2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				estadofisicofacturaempresa= new EstadoFisicoFacturaEmpresa();
				
				/*
				estadofisicofacturaempresa.setId(lcodigo);
				estadofisicofacturaempresa.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			estadofisicofacturaempresa.setid_empresa(Long.parseLong(saeesfa2.getesfa_cod_empr().toString()));
	 			estadofisicofacturaempresa.setcodigo(nombre);
	 			estadofisicofacturaempresa.setnombre(nombre);
	 			
	 			isTrueFalse=false;
	 			if(saeesfa2.getesfa_por_def()!=null && saeesfa2.getesfa_por_def().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			estadofisicofacturaempresa.setes_pendiente(isTrueFalse);
			
	 			
	 			estadofisicofacturaLogic.getEstadoFisicoFacturaPorNombreWithConnection(nombre);
				estadofisicofactura=estadofisicofacturaLogic.getEstadoFisicoFactura();
				
				
				if(estadofisicofactura!=null && estadofisicofactura.getId()>0) {
					//estadofisicofacturaempresa.setid_estado_fisico_factura(estadofisicofactura.getId());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
				
				estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(estadofisicofacturaempresa);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalEstadoFisicoFacturaEmpresa() throws SQLException, Exception{
		String sFinal=" where esfa_cod_empr=1";// and esfa_cod_sucu=1		
		return sFinal;
	}

	public static String GetFormatoNombreEstadoFisicoFacturaEmpresa(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void EstadoFisicoFactura(Boolean esHibernate) throws SQLException, Exception{
		EstadoFisicoFacturaLogic estadofisicofacturaLogic=new EstadoFisicoFacturaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeesfa saeesfa=new saeesfa();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalEstadoFisicoFactura();

			
			List<saeesfa> saeesfas = new  ArrayList<saeesfa>();				
			
			saeesfas=saeesfa.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeesfas.size();
			
			
			EstadoFisicoFactura estadofisicofactura= new EstadoFisicoFactura();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeesfa saeesfa2:saeesfas) {
				idManual++;
				
				nombre=GetFormatoNombreEstadoFisicoFactura(saeesfa2.getesfa_nom_esfa());
				//lcodigo=GetFormatoCodigoEstadoFisicoFactura(saeesfa2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				estadofisicofactura= new EstadoFisicoFactura();
				
				/*
				estadofisicofactura.setId(lcodigo);
				estadofisicofactura.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				estadofisicofactura.setId(idManual);
	 			estadofisicofactura.setnombre(nombre);
			
				if(!ExisteEstadoFisicoFactura(nombre,estadofisicofacturaLogic.getEstadoFisicoFacturas())) {
					estadofisicofacturaLogic.getEstadoFisicoFacturas().add(estadofisicofactura);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			estadofisicofacturaLogic.saveEstadoFisicoFacturasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalEstadoFisicoFactura() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreEstadoFisicoFactura(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteEstadoFisicoFactura(String nombre,List<EstadoFisicoFactura> estadofisicofacturas) throws SQLException, Exception{
		Boolean existe=false;
			
		for(EstadoFisicoFactura estadofisicofactura: estadofisicofacturas) {
			if(estadofisicofactura.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoDevolucionEmpresa(Boolean esHibernate) throws SQLException, Exception{
		TipoDevolucionEmpresaLogic tipodevolucionempresaLogic=new TipoDevolucionEmpresaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetdev saetdev=new saetdev();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoDevolucionEmpresa();

			
			List<saetdev> saetdevs = new  ArrayList<saetdev>();				
			
			saetdevs=saetdev.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetdevs.size();
			
			
			TipoDevolucionEmpresa tipodevolucionempresa= new TipoDevolucionEmpresa();
			
			TipoDevolucionLogic tipodevolucionLogic=new TipoDevolucionLogic();
			TipoDevolucion tipodevolucion= new TipoDevolucion();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetdev saetdev2:saetdevs) {
				idManual++;
				
				nombre=GetFormatoNombreTipoDevolucionEmpresa(saetdev2.gettdev_nom_tdev());
				//lcodigo=GetFormatoCodigoTipoDevolucionEmpresa(saetdev2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipodevolucionempresa= new TipoDevolucionEmpresa();
				
				/*
				tipodevolucionempresa.setId(lcodigo);
				tipodevolucionempresa.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/								
				
	 			tipodevolucionempresa.setid_empresa(Long.parseLong(saetdev2.gettdev_cod_empr().toString()));
	 			tipodevolucionempresa.setcodigo(nombre);
	 			tipodevolucionempresa.setnombre(nombre);
	 			
	 			isTrueFalse=false;
	 			if(saetdev2.gettdev_ban_tdev()!=null && saetdev2.gettdev_ban_tdev().equals("A")) {
	 				isTrueFalse=true;
	 			}
	 			tipodevolucionempresa.setesta_activo(isTrueFalse);
			
	 			
	 			tipodevolucionLogic.getTipoDevolucionPorNombreWithConnection(nombre);
				tipodevolucion=tipodevolucionLogic.getTipoDevolucion();
				
				
				if(tipodevolucion!=null && tipodevolucion.getId()>0) {
					//tipodevolucionempresa.setid_tipo_devolucion(tipodevolucion.getId());	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
	 			
				
				tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(tipodevolucionempresa);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipodevolucionempresaLogic.saveTipoDevolucionEmpresasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoDevolucionEmpresa() throws SQLException, Exception{
		String sFinal=" where tdev_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoDevolucionEmpresa(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoDevolucionEmpresa(String nombre,List<TipoDevolucionEmpresa> tipodevolucionempresas) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoDevolucionEmpresa tipodevolucionempresa: tipodevolucionempresas) {
			if(tipodevolucionempresa.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoDevolucion(Boolean esHibernate) throws SQLException, Exception{
		TipoDevolucionLogic tipodevolucionLogic=new TipoDevolucionLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetdev saetdev=new saetdev();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoDevolucion();

			
			List<saetdev> saetdevs = new  ArrayList<saetdev>();				
			
			saetdevs=saetdev.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetdevs.size();
			
			
			TipoDevolucion tipodevolucion= new TipoDevolucion();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=0L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetdev saetdev2:saetdevs) {
				idManual++;
				
				nombre=GetFormatoNombreTipoDevolucion(saetdev2.gettdev_nom_tdev());
				//lcodigo=GetFormatoCodigoTipoDevolucion(saetdev2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipodevolucion= new TipoDevolucion();
				
				/*
				tipodevolucion.setId(lcodigo);
				tipodevolucion.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipodevolucion.setId(idManual);
	 			tipodevolucion.setnombre(nombre);
			
				if(!ExisteTipoDevolucion(nombre,tipodevolucionLogic.getTipoDevolucions())) {
					tipodevolucionLogic.getTipoDevolucions().add(tipodevolucion);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipodevolucionLogic.saveTipoDevolucionsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoDevolucion() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoDevolucion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoDevolucion(String nombre,List<TipoDevolucion> tipodevolucions) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoDevolucion tipodevolucion: tipodevolucions) {
			if(tipodevolucion.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void SubGrupoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		SubGrupoActivoFijoLogic subgrupoactivofijoLogic=new SubGrupoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saesgac saesgac=new saesgac();
			saegact saegact=new saegact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalSubGrupoActivoFijo();

			
			List<saesgac> saesgacs = new  ArrayList<saesgac>();				
			List<saegact> saegacts = new  ArrayList<saegact>();	
			
			saesgacs=saesgac.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saesgacs.size();
			
			
			SubGrupoActivoFijo subgrupoactivofijo= new SubGrupoActivoFijo();
			
			
			TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic=new TipoGrupoActivoFijoLogic();
			TipoGrupoActivoFijo tipogrupoactivofijo= new TipoGrupoActivoFijo();	
			
			DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
			DetalleGrupoActivoFijo detallegrupoactivofijo= new DetalleGrupoActivoFijo();	
			
			Long idManual=0L;
			String nombre="";
			String nombre_grupo="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saesgac saesgac2:saesgacs) {
				idManual++;
				
				nombre=GetFormatoNombreSubGrupoActivoFijo(saesgac2.getsgac_des_sgac());
				//lcodigo=GetFormatoCodigoSubGrupoActivoFijo(saesgac2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				subgrupoactivofijo= new SubGrupoActivoFijo();
				
				/*
				subgrupoactivofijo.setId(lcodigo);
				subgrupoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			subgrupoactivofijo.setid_empresa(Long.parseLong(saesgac2.getsgac_cod_empr().toString()));	 			
	 			subgrupoactivofijo.setcodigo(nombre);
	 			subgrupoactivofijo.setnombre(nombre);
	 			subgrupoactivofijo.setsiglas(saesgac2.getsgac_cod_ini().trim());
	 			
	 			isTrueFalse=false;
	 			if(saesgac2.getsgac_act_vehi()!=null && saesgac2.getsgac_act_vehi().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			subgrupoactivofijo.setes_vehiculo(isTrueFalse);
			
				
	 			
	 			sFinalQuery=" where gact_cod_gact='"+saesgac2.getgact_cod_gact().trim()+"'";
	 			saegacts=saegact.getEntitiesWithConnection(sFinalQuery);
	 			
	 			for(saegact saegact2:saegacts) {
	 				nombre_grupo=GetFormatoNombreTipoGrupoActivoFijo(saegact2.getgact_des_gact());
	 				break;
	 			}
	 			
	 			tipogrupoactivofijoLogic.getTipoGrupoActivoFijoPorNombreWithConnection(nombre_grupo);
				tipogrupoactivofijo=tipogrupoactivofijoLogic.getTipoGrupoActivoFijo();
				
				
				if(tipogrupoactivofijo!=null && tipogrupoactivofijo.getId()>0) {
					
		 			
					
					
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre_grupo);
					
					continue;
				}
	 			
	 			
	 			
	 			
				
	 			
	 			
	 			
				subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(subgrupoactivofijo);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			subgrupoactivofijoLogic.saveSubGrupoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalSubGrupoActivoFijo() throws SQLException, Exception{
		String sFinal=" where sgac_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreSubGrupoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteSubGrupoActivoFijo(String nombre,List<SubGrupoActivoFijo> subgrupoactivofijos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(SubGrupoActivoFijo subgrupoactivofijo: subgrupoactivofijos) {
			if(subgrupoactivofijo.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	
	public static String GetFinalTipoSubGrupoActivoFijo() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoSubGrupoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	
	
	public static void DetalleGrupoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saegact saegact=new saegact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalDetalleGrupoActivoFijo();

			
			List<saegact> saegacts = new  ArrayList<saegact>();				
			
			saegacts=saegact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saegacts.size();
			
			
			DetalleGrupoActivoFijo detallegrupoactivofijo= new DetalleGrupoActivoFijo();
			
			TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic=new TipoGrupoActivoFijoLogic();
			TipoGrupoActivoFijo tipogrupoactivofijo= new TipoGrupoActivoFijo();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saegact saegact2:saegacts) {
				idManual++;
				
				nombre=GetFormatoNombreDetalleGrupoActivoFijo(saegact2.getgact_des_gact());
				//lcodigo=GetFormatoCodigoDetalleGrupoActivoFijo(saegact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				detallegrupoactivofijo= new DetalleGrupoActivoFijo();
				
				/*
				detallegrupoactivofijo.setId(lcodigo);
				detallegrupoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			detallegrupoactivofijo.setid_empresa(Long.parseLong(saegact2.getgact_cod_empr().toString()));	 			
	 			detallegrupoactivofijo.setcodigo(nombre);
	 			detallegrupoactivofijo.setnombre(nombre);
	 			detallegrupoactivofijo.setsiglas(saegact2.getgact_cod_ini().trim());
	 			detallegrupoactivofijo.setid_cuenta_contable_costo_original(null);
	 			detallegrupoactivofijo.setid_cuenta_contable_depre_normal(null);
	 			detallegrupoactivofijo.setid_cuenta_contable_depre_gasto_normal(null);
			
	 			
	 			
	 			tipogrupoactivofijoLogic.getTipoGrupoActivoFijoPorNombreWithConnection(nombre);
				tipogrupoactivofijo=tipogrupoactivofijoLogic.getTipoGrupoActivoFijo();
				
				
				if(tipogrupoactivofijo!=null && tipogrupoactivofijo.getId()>0) {
					//detallegrupoactivofijo.setid_tipo_grupo_activo_fijo(tipogrupoactivofijo.getId());	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
				
				detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(detallegrupoactivofijo);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalDetalleGrupoActivoFijo() throws SQLException, Exception{
		String sFinal=" where gact_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreDetalleGrupoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoGrupoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic=new TipoGrupoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saegact saegact=new saegact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoGrupoActivoFijo();

			
			List<saegact> saegacts = new  ArrayList<saegact>();				
			
			saegacts=saegact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saegacts.size();
			
			
			TipoGrupoActivoFijo tipogrupoactivofijo= new TipoGrupoActivoFijo();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saegact saegact2:saegacts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoGrupoActivoFijo(saegact2.getgact_des_gact());
				//lcodigo=GetFormatoCodigoTipoGrupoActivoFijo(saegact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipogrupoactivofijo= new TipoGrupoActivoFijo();
				
				/*
				tipogrupoactivofijo.setId(lcodigo);
				tipogrupoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipogrupoactivofijo.setId(idManual);
	 			tipogrupoactivofijo.setnombre(nombre);
			
				if(!ExisteTipoGrupoActivoFijo(nombre,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos())) {
					tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(tipogrupoactivofijo);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipogrupoactivofijoLogic.saveTipoGrupoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoGrupoActivoFijo() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoGrupoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoGrupoActivoFijo(String nombre,List<TipoGrupoActivoFijo> tipogrupoactivofijos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoGrupoActivoFijo tipogrupoactivofijo: tipogrupoactivofijos) {
			if(tipogrupoactivofijo.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoDepreciacionEmpresa(Boolean esHibernate) throws SQLException, Exception{
		TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic=new TipoDepreciacionEmpresaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetdep saetdep=new saetdep();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoDepreciacionEmpresa();

			
			List<saetdep> saetdeps = new  ArrayList<saetdep>();				
			
			saetdeps=saetdep.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetdeps.size();
			
			
			TipoDepreciacionEmpresa tipodepreciacionempresa= new TipoDepreciacionEmpresa();
			
			TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic=new TipoCalculoDepreciacionLogic();
			TipoCalculoDepreciacion tipocalculodepreciacion= new TipoCalculoDepreciacion();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetdep saetdep2:saetdeps) {
				idManual++;
				
				nombre=GetFormatoNombreTipoDepreciacionEmpresa(saetdep2.gettdep_desc_tdep());
				//lcodigo=GetFormatoCodigoTipoDepreciacionEmpresa(saetdep2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipodepreciacionempresa= new TipoDepreciacionEmpresa();
				
				/*
				tipodepreciacionempresa.setId(lcodigo);
				tipodepreciacionempresa.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			tipodepreciacionempresa.setid_empresa(Long.parseLong(saetdep2.gettdep_cod_empr().toString()));
	 			tipodepreciacionempresa.setcodigo(nombre);
	 			tipodepreciacionempresa.setnombre(nombre);
	 			
	 			isTrueFalse=false;
	 			if(saetdep2.gettdep_tip_meto().equals("L")) {
	 				isTrueFalse=true;
	 			}
	 			
	 			tipodepreciacionempresa.setes_linea_recta(isTrueFalse);
			
	 			
	 			tipocalculodepreciacionLogic.getTipoCalculoDepreciacionPorNombreWithConnection(nombre);
				tipocalculodepreciacion=tipocalculodepreciacionLogic.getTipoCalculoDepreciacion();
				
				
				if(tipocalculodepreciacion!=null && tipocalculodepreciacion.getId()>0) {
					//tipodepreciacionempresa.setid_tipo_calculo_depreciacion(tipocalculodepreciacion.getId());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
	 			
				
				tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(tipodepreciacionempresa);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipodepreciacionempresaLogic.saveTipoDepreciacionEmpresasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoDepreciacionEmpresa() throws SQLException, Exception{
		String sFinal=" where tdep_cod_empr=1 ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoDepreciacionEmpresa(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoCalculoDepreciacion(Boolean esHibernate) throws SQLException, Exception{
		TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic=new TipoCalculoDepreciacionLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetdep saetdep=new saetdep();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoCalculoDepreciacion();

			
			List<saetdep> saetdeps = new  ArrayList<saetdep>();				
			
			saetdeps=saetdep.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetdeps.size();
			
			
			TipoCalculoDepreciacion tipocalculodepreciacion= new TipoCalculoDepreciacion();
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetdep saetdep2:saetdeps) {
				idManual++;
				
				nombre=GetFormatoNombreTipoCalculoDepreciacion(saetdep2.gettdep_desc_tdep());
				//lcodigo=GetFormatoCodigoTipoCalculoDepreciacion(saetdep2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipocalculodepreciacion= new TipoCalculoDepreciacion();
				
				/*
				tipocalculodepreciacion.setId(lcodigo);
				tipocalculodepreciacion.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipocalculodepreciacion.setId(idManual);
	 			tipocalculodepreciacion.setnombre(nombre);
			
				
	 			if(!ExisteTipoCalculoDepreciacion(nombre,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions())) {
	 				tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(tipocalculodepreciacion);
	 			}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipocalculodepreciacionLogic.saveTipoCalculoDepreciacionsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoCalculoDepreciacion() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoCalculoDepreciacion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoCalculoDepreciacion(String nombre,List<TipoCalculoDepreciacion> tipocalculodepreciacions) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoCalculoDepreciacion tipocalculodepreciacion: tipocalculodepreciacions) {
			if(tipocalculodepreciacion.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void TipoActivoFijoEmpresa(Boolean esHibernate) throws SQLException, Exception{
		TipoActivoFijoEmpresaLogic tipoactivofijoempresaLogic=new TipoActivoFijoEmpresaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetact saetact=new saetact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoActivoFijoEmpresa();

			
			List<saetact> saetacts = new  ArrayList<saetact>();				
			
			saetacts=saetact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetacts.size();
			
			
			TipoActivoFijoEmpresa tipoactivofijoempresa= new TipoActivoFijoEmpresa();
			
			TipoActivoFijoLogic tipoactivofijoLogic=new TipoActivoFijoLogic();
			TipoActivoFijo tipoactivofijo= new TipoActivoFijo();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetact saetact2:saetacts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoActivoFijoEmpresa(saetact2.gettact_des_tact());
				//lcodigo=GetFormatoCodigoTipoActivoFijoEmpresa(saetact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoactivofijoempresa= new TipoActivoFijoEmpresa();
				
				/*
				tipoactivofijoempresa.setId(lcodigo);
				tipoactivofijoempresa.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			tipoactivofijoempresa.setid_empresa(Long.parseLong(saetact2.gettact_cod_empr().toString()));	 			
	 			tipoactivofijoempresa.setcodigo(nombre);
	 			tipoactivofijoempresa.setnombre(nombre);
			
	 			
	 			tipoactivofijoLogic.getTipoActivoFijoPorNombreWithConnection(nombre);
				tipoactivofijo=tipoactivofijoLogic.getTipoActivoFijo();
				
				
				if(tipoactivofijo!=null && tipoactivofijo.getId()>0) {
					//tipoactivofijoempresa.setid_tipo_activo_fijo(tipoactivofijo.getId());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
				
				tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(tipoactivofijoempresa);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoActivoFijoEmpresa() throws SQLException, Exception{
		String sFinal=" where tact_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoActivoFijoEmpresa(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		TipoActivoFijoLogic tipoactivofijoLogic=new TipoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetact saetact=new saetact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoActivoFijo();

			
			List<saetact> saetacts = new  ArrayList<saetact>();				
			
			saetacts=saetact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetacts.size();
			
			
			TipoActivoFijo tipoactivofijo= new TipoActivoFijo();
			
			
			Long idManual=2L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetact saetact2:saetacts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoActivoFijo(saetact2.gettact_des_tact());
				//lcodigo=GetFormatoCodigoTipoActivoFijo(saetact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoactivofijo= new TipoActivoFijo();
				
				/*
				tipoactivofijo.setId(lcodigo);
				tipoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipoactivofijo.setId(idManual);
	 			tipoactivofijo.setnombre(nombre);
			
	 			if(!ExisteTipoActivoFijo(nombre,tipoactivofijoLogic.getTipoActivoFijos())) {					
	 				tipoactivofijoLogic.getTipoActivoFijos().add(tipoactivofijo);
	 			}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoactivofijoLogic.saveTipoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoActivoFijo() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}

	public static Boolean ExisteTipoActivoFijo(String nombre,List<TipoActivoFijo> tipoactivofijos) throws SQLException, Exception{
		Boolean existe=false;
			
		for(TipoActivoFijo tipoactivofijo: tipoactivofijos) {
			if(tipoactivofijo.getnombre().equals(nombre)) {
				existe=true;
				break;
			}
		}
			
		return existe;
	}
	
	public static void EstadoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		EstadoActivoFijoLogic estadoactivofijoLogic=new EstadoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeeact saeeact=new saeeact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalEstadoActivoFijo();

			
			List<saeeact> saeeacts = new  ArrayList<saeeact>();				
			
			saeeacts=saeeact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeeacts.size();
			
			
			EstadoActivoFijo estadoactivofijo= new EstadoActivoFijo();
			
			TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic=new TipoEstadoActivoFijoLogic();
			TipoEstadoActivoFijo tipoestadoactivofijo= new TipoEstadoActivoFijo();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeeact saeeact2:saeeacts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoEstadoActivoFijo(saeeact2.geteact_desc_eact());
				//lcodigo=GetFormatoCodigoEstadoActivoFijo(saeeact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				estadoactivofijo= new EstadoActivoFijo();
				
				/*
				estadoactivofijo.setId(lcodigo);
				estadoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
	 			estadoactivofijo.setid_empresa(Long.parseLong(saeeact2.geteact_cod_empr().toString()));	 			
	 			estadoactivofijo.setcodigo(nombre);
	 			estadoactivofijo.setnombre(nombre);
			
	 			
	 			
	 			tipoestadoactivofijoLogic.getTipoEstadoActivoFijoPorNombreWithConnection(nombre);
				tipoestadoactivofijo=tipoestadoactivofijoLogic.getTipoEstadoActivoFijo();
				
				
				if(tipoestadoactivofijo!=null && tipoestadoactivofijo.getId()>0) {
					//estadoactivofijo.setid_tipo_estado_activo_fijo(tipoestadoactivofijo.getId());	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
				
				estadoactivofijoLogic.getEstadoActivoFijos().add(estadoactivofijo);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			estadoactivofijoLogic.saveEstadoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalEstadoActivoFijo() throws SQLException, Exception{
		String sFinal=" where eact_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreEstadoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoEstadoActivoFijo(Boolean esHibernate) throws SQLException, Exception{
		TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic=new TipoEstadoActivoFijoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeeact saeeact=new saeeact();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoEstadoActivoFijo();

			
			List<saeeact> saeeacts = new  ArrayList<saeeact>();				
			
			saeeacts=saeeact.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeeacts.size();
			
			
			TipoEstadoActivoFijo tipoestadoactivofijo= new TipoEstadoActivoFijo();
			
			//TipoTransporteLogic tipotransporteLogic=new TipoTransporteLogic();
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeeact saeeact2:saeeacts) {
				idManual++;
				
				if(idManual.equals(1L) || idManual.equals(1)) {
					continue;
				}
				
				nombre=GetFormatoNombreTipoEstadoActivoFijo(saeeact2.geteact_desc_eact());
				//lcodigo=GetFormatoCodigoTipoEstadoActivoFijo(saeeact2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoestadoactivofijo= new TipoEstadoActivoFijo();
				
				/*
				tipoestadoactivofijo.setId(lcodigo);
				tipoestadoactivofijo.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				tipotransporteLogic.getTipoTransportePorNombreWithConnection(nombre);
				tipotransporte=tipotransporteLogic.getTipoTransporte();
				
				
				if(tipotransporte!=null && tipotransporte.getId()>0) {
					tipoestadoactivofijo.setid_tipotransporte(tipotransporte.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				*/
				
				tipoestadoactivofijo.setId(idManual);
	 			tipoestadoactivofijo.setnombre(nombre);
			
				if(!Existe(nombre,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos())) {
					tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(tipoestadoactivofijo);
				}
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoestadoactivofijoLogic.saveTipoEstadoActivoFijosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Boolean Existe(String sNombre,List<TipoEstadoActivoFijo> tipoestadoactivofijos) throws SQLException, Exception{
		Boolean existe=false;
		
		for(TipoEstadoActivoFijo tipoestadoactivofijo: tipoestadoactivofijos) {
			if(tipoestadoactivofijo.getnombre().equals(sNombre)) {
				existe=true;
				break;
			}
		}
		
		return existe;
	}
	
	public static String GetFinalTipoEstadoActivoFijo() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoEstadoActivoFijo(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void Transporte(Boolean esHibernate) throws SQLException, Exception{
		TransporteLogic transporteLogic=new TransporteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeeden saeeden=new saeeden();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoTransporte();

			
			List<saeeden> saeedens = new  ArrayList<saeeden>();				
			
			saeedens=saeeden.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeedens.size();
			
			
			Transporte transporte= new Transporte();
			
			//TipoTransporteLogic tipotransporteLogic=new TipoTransporteLogic();
			//TipoTransporte tipotransporte= new TipoTransporte();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeeden saeeden2:saeedens) {
				idManual++;
				
				nombre=GetFormatoNombreTipoTransporte(saeeden2.geteden_nom_eden());
				//lcodigo=GetFormatoCodigoTransporte(saeeden2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				transporte= new Transporte();
				
				/*
				transporte.setId(lcodigo);
				transporte.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
	 			transporte.setid_empresa(Long.parseLong(saeeden2.geteden_cod_empr().toString()));	 			
	 			transporte.setcodigo(nombre);
	 			transporte.setnombre(nombre);
			
	 			
	 			
	 			//tipotransporteLogic.getTipoTransportePorNombreWithConnection(nombre);
				//tipotransporte=tipotransporteLogic.getTipoTransporte();
				
				
	 			/*
				if(tipotransporte!=null && tipotransporte.getId()>0) {
					//transporte.setid_tipo_transporte(tipotransporte.getId());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
	 			*/
				
				transporteLogic.getTransportes().add(transporte);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			transporteLogic.saveTransportesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}
	
	public static void TipoTransporte(Boolean esHibernate) throws SQLException, Exception{
		//TipoTransporteLogic tipotransporteLogic=new TipoTransporteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saeeden saeeden=new saeeden();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoTransporte();

			
			List<saeeden> saeedens = new  ArrayList<saeeden>();				
			
			saeedens=saeeden.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeedens.size();
			
			
			
			
			Long idManual=1L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saeeden saeeden2:saeedens) {
				idManual++;
				
				nombre=GetFormatoNombreTipoTransporte(saeeden2.geteden_nom_eden());
				//lcodigo=GetFormatoCodigoTipoTransporte(saeeden2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				//tipotransporte= new TipoTransporte();
				
				/*
				tipotransporte.setId(lcodigo);
				tipotransporte.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				/*
				tipotransporte.setId(idManual);
	 			tipotransporte.setid_tipo_via_transporte(GetConstantTipoTransporte(saeeden2.geteden_tip_eden()));
	 			tipotransporte.setnombre(nombre);
			     */
				
				//tipotransporteLogic.getTipoTransportes().add(tipotransporte);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipotransporteLogic.saveTipoTransportesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetConstantTipoTransporte(String sTipoMovimiento) throws SQLException, Exception{
		sTipoMovimiento=sTipoMovimiento.trim();
		
		Long idModulo=1L;
		
		if(sTipoMovimiento!=null) {
			switch(sTipoMovimiento){ 
				case "T": 
					idModulo=1L;
					break;
					
				case "A": 
					idModulo=2L;
					break; 	
		
				case "M":
						idModulo=3L;
					   break;
					   
				
				default: idModulo=1L;
			};
		}
		
		return idModulo;
		
	}
	
	public static String GetFinalTipoTransporte() throws SQLException, Exception{
		String sFinal=" where eden_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoTransporte(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void RadioVenciClienteProve(Boolean esHibernate) throws SQLException, Exception{
		RadioVenciClienteProveLogic radiovenciclienteproveLogic=new RadioVenciClienteProveLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saerdpv saerdpv=new saerdpv();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalRadioVenciClienteProve();

			
			List<saerdpv> saerdpvs = new  ArrayList<saerdpv>();				
			
			saerdpvs=saerdpv.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saerdpvs.size();
			
			
			RadioVenciClienteProve radiovenciclienteprove= new RadioVenciClienteProve();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saerdpv saerdpv2:saerdpvs) {
				idManual++;
				
				//nombre=GetFormatoNombreRadioVenciClienteProve(saerdpv2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoRadioVenciClienteProve(saerdpv2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				radiovenciclienteprove= new RadioVenciClienteProve();
				
				/*
				radiovenciclienteprove.setId(lcodigo);
				radiovenciclienteprove.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			radiovenciclienteprove.setid_empresa(Long.parseLong(saerdpv2.getrdpv_cod_empr().toString()));
	 			radiovenciclienteprove.setid_tipo_radio_venci(1L);
	 			radiovenciclienteprove.setdia_desde(saerdpv2.getrdpv_dia_desd());
	 			radiovenciclienteprove.setdia_hasta(saerdpv2.getrdpv_dia_hast());
			
				
				radiovenciclienteproveLogic.getRadioVenciClienteProves().add(radiovenciclienteprove);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			radiovenciclienteproveLogic.saveRadioVenciClienteProvesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalRadioVenciClienteProve() throws SQLException, Exception{
		String sFinal=" where rdpv_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreRadioVenciClienteProve(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void RadioVenciProve(Boolean esHibernate) throws SQLException, Exception{
		RadioVenciProveLogic radiovenciproveLogic=new RadioVenciProveLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saerdve saerdve=new saerdve();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalRadioVenciProve();

			
			List<saerdve> saerdves = new  ArrayList<saerdve>();				
			
			saerdves=saerdve.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saerdves.size();
			
			
			RadioVenciProve radiovenciprove= new RadioVenciProve();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saerdve saerdve2:saerdves) {
				idManual++;
				
				//nombre=GetFormatoNombreRadioVenciProve(saerdve2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoRadioVenciProve(saerdve2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				radiovenciprove= new RadioVenciProve();
				
				/*
				radiovenciprove.setId(lcodigo);
				radiovenciprove.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			radiovenciprove.setid_empresa(Long.parseLong(saerdve2.getrdve_cod_empr().toString()));
	 			radiovenciprove.setid_tipo_radio_venci(GetConstantTipoRadioVencimiento(saerdve2.getrvde_nom_rvde()));
	 			radiovenciprove.setdia_desde(saerdve2.getrdve_dia_desd());
	 			radiovenciprove.setdia_hasta(saerdve2.getrdve_dia_hast());
			
				
				radiovenciproveLogic.getRadioVenciProves().add(radiovenciprove);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			radiovenciproveLogic.saveRadioVenciProvesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	
	public static Long GetConstantTipoRadioVencimiento(String sTipoMovimiento) throws SQLException, Exception{
		sTipoMovimiento=sTipoMovimiento.trim();
		
		Long idModulo=1L;
		
		if(sTipoMovimiento!=null) {
			switch(sTipoMovimiento){ 
				case "NORMAL": 
					idModulo=1L;
					break;
					
				case "RIESGO": 
					idModulo=2L;
					break; 	
		
				case "VENCIDA":
						idModulo=3L;
					   break;
					   
				case "JUDICIAL": 
						idModulo=4L;
						break;
				
				
				default: idModulo=1L;
			};
		}
		
		return idModulo;
		
	}
	
	public static String GetFinalRadioVenciProve() throws SQLException, Exception{
		String sFinal="  where rdve_cod_empr=1; ";		
		return sFinal;
	}

	public static String GetFormatoNombreRadioVenciProve(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoGarantiaEmpresa(Boolean esHibernate) throws SQLException, Exception{
		TipoGarantiaEmpresaLogic tipogarantiaempresaLogic=new TipoGarantiaEmpresaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetgrt saetgrt=new saetgrt();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoGarantia();

			
			List<saetgrt> saetgrts = new  ArrayList<saetgrt>();				
			
			saetgrts=saetgrt.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetgrts.size();
			
			
			TipoGarantiaEmpresa tipogarantiaempresa= new TipoGarantiaEmpresa();
			
			TipoGarantiaLogic tipogarantiaLogic=new TipoGarantiaLogic();
			TipoGarantia tipogarantia= new TipoGarantia();
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetgrt saetgrt2:saetgrts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoGarantia(saetgrt2.gettgrt_nom_tgrt());
				//lcodigo=GetFormatoCodigoTipoGarantiaEmpresa(saetgrt2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipogarantiaempresa= new TipoGarantiaEmpresa();
				
				/*
				tipogarantiaempresa.setId(lcodigo);
				tipogarantiaempresa.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			tipogarantiaempresa.setid_empresa(Long.parseLong(saetgrt2.gettgrt_cod_empr().toString()));	 			
	 			tipogarantiaempresa.setcodigo(nombre);
	 			tipogarantiaempresa.setnombre(nombre);
			
	 			tipogarantiaLogic.getTipoGarantiaPorNombreWithConnection(nombre);
				tipogarantia=tipogarantiaLogic.getTipoGarantia();
				
				
				if(tipogarantia!=null && tipogarantia.getId()>0) {
					//tipogarantiaempresa.setid_tipo_garantia(tipogarantia.getId()); 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
				tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(tipogarantiaempresa);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipogarantiaempresaLogic.saveTipoGarantiaEmpresasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoGarantiaEmpresa() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoGarantiaEmpresa(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoGarantia(Boolean esHibernate) throws SQLException, Exception{
		TipoGarantiaLogic tipogarantiaLogic=new TipoGarantiaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetgrt saetgrt=new saetgrt();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoGarantia();

			
			List<saetgrt> saetgrts = new  ArrayList<saetgrt>();				
			
			saetgrts=saetgrt.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetgrts.size();
			
			
			TipoGarantia tipogarantia= new TipoGarantia();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetgrt saetgrt2:saetgrts) {
				idManual++;
				
				nombre=GetFormatoNombreTipoGarantia(saetgrt2.gettgrt_nom_tgrt());
				//lcodigo=GetFormatoCodigoTipoGarantia(saetgrt2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipogarantia= new TipoGarantia();
				
				/*
				tipogarantia.setId(lcodigo);
				tipogarantia.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipogarantia.setId(idManual);
	 			tipogarantia.setnombre(nombre);
			
				
				tipogarantiaLogic.getTipoGarantias().add(tipogarantia);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipogarantiaLogic.saveTipoGarantiasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoGarantia() throws SQLException, Exception{
		String sFinal=" where tgrt_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoGarantia(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoCliente(Boolean esHibernate) throws SQLException, Exception{
		//TipoClienteLogic tipoclienteLogic=new TipoClienteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetitu saetitu=new saetitu();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoCliente();

			
			List<saetitu> saetitus = new  ArrayList<saetitu>();				
			
			saetitus=saetitu.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetitus.size();
			
			
			//TipoCliente tipocliente= new TipoCliente();
			
			TipoTituloClienteLogic tipotituloclienteLogic=new TipoTituloClienteLogic();
			TipoTituloCliente tipotitulocliente= new TipoTituloCliente();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetitu saetitu2:saetitus) {
				idManual++;
				
				nombre=GetFormatoNombreTipoCliente(saetitu2.gettitu_des_titu());
				//lcodigo=GetFormatoCodigoTipoCliente(saetitu2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				
				/*
				tipocliente.setId(lcodigo);
				tipocliente.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				/*
	 			tipocliente.setid_empresa(Long.parseLong(saetitu2.gettitu_cod_empr().toString()));	 			
	 			tipocliente.setcodigo(nombre);
	 			tipocliente.setnombre(nombre);
	 			tipocliente.setsiglas(saetitu2.gettitu_sig_titu().trim());
			
	 			
	 			tipotituloclienteLogic.getTipoTituloClientePorNombreWithConnection(nombre);
				tipotitulocliente=tipotituloclienteLogic.getTipoTituloCliente();
				
				
				if(tipotitulocliente!=null && tipotitulocliente.getId()>0) {
					tipocliente.setid_tipo_titulo_cliente(tipotitulocliente.getId());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
	 			*/
	 			
				
				//tipoclienteLogic.getTipoClientes().add(tipocliente);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipoclienteLogic.saveTipoClientesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoCliente() throws SQLException, Exception{
		String sFinal=" where titu_cod_empr=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoCliente(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoFormaPago(Boolean esHibernate) throws SQLException, Exception{
		TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saefpag saefpag=new saefpag();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoFormaPago();

			
			List<saefpag> saefpags = new  ArrayList<saefpag>();				
			
			saefpags=saefpag.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saefpags.size();
			
			
			TipoFormaPago tipoformapago= new TipoFormaPago();
			
			TransaccionLogic transaccionLogic=new TransaccionLogic();
			Transaccion transaccion= new Transaccion();		
			
			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			TipoTransaccionModulo tipotransaccionmodulo= new TipoTransaccionModulo();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saefpag saefpag2:saefpags) {
				idManual++;
				
				idModulo=GetConstantModulo(saefpag2.getfpag_cod_modu());
				
				nombre=GetFormatoNombreTipoFormaPago(saefpag2.getfpag_des_fpag());
				//lcodigo=GetFormatoCodigoTipoFormaPago(saefpag2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoformapago= new TipoFormaPago();
				
				/*
				tipoformapago.setId(lcodigo);
				tipoformapago.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			tipoformapago.setid_empresa(Long.parseLong(saefpag2.getfpag_cod_empr().toString()));
	 			tipoformapago.setid_sucursal(Long.parseLong(saefpag2.getfpag_cod_sucu().toString()));
	 			tipoformapago.setid_modulo(idModulo);
	 			tipoformapago.setid_cuenta_contable(null);
	 			
	 			if(saefpag2.getfpag_cod_tran()!=null) {
		 			sFinalQuery=" where id_modulo="+idModulo+" and siglas='"+saefpag2.getfpag_cod_tran().trim()+"'";
		 			
		 			tipotransaccionmoduloLogic.getEntityWithConnection(sFinalQuery);
		 			tipotransaccionmodulo=tipotransaccionmoduloLogic.getTipoTransaccionModulo();
	 			} else {
	 				tipotransaccionmodulo=null;
	 			}
	 			
	 			if(tipotransaccionmodulo!=null && tipotransaccionmodulo.getId()>0) {
	 				tipoformapago.setid_tipo_transaccion_modulo(tipotransaccionmodulo.getId());
	 				
	 				sFinalQuery=" where id_empresa="+tipoformapago.getid_empresa()+" and id_sucursal="+tipoformapago.getid_sucursal();
	 				sFinalQuery+=" and id_modulo="+idModulo+" and id_tipo_transaccion_modulo="+tipotransaccionmodulo.getId();
		 			
		 			transaccionLogic.getEntityWithConnection(sFinalQuery);
		 			transaccion=transaccionLogic.getTransaccion();
		 			
		 			if(transaccion!=null && transaccion.getId()>0) {
		 				tipoformapago.setid_transaccion(transaccion.getId());
		 			} else {
		 				tipoformapago.setid_transaccion(null);
		 			}	 					 				
	 			} else {
	 				tipoformapago.setid_transaccion(null);
	 				tipoformapago.setid_tipo_transaccion_modulo(null);
	 			}
	 			
	 			
	 			
	 			tipoformapago.setid_tipo_grupo_forma_pago(GetConstantTipoGrupoFormaPago(saefpag2.getfpag_cot_fpag()));
	 				 			
	 			tipoformapago.setnombre(nombre);
	 			tipoformapago.setsiglas(saefpag2.getfpag_sig_fpag().trim());
	 			
	 			isTrueFalse=false;
	 			if(saefpag2.getfpag_det_fpag()!=null && saefpag2.getfpag_det_fpag().equals("SI")) {
	 				isTrueFalse=true;
	 			}
	 			tipoformapago.setcon_detalle(isTrueFalse);
	 			
	 			isTrueFalse=false;
	 			if(saefpag2.getfpag_man_cuot()!=null && saefpag2.getfpag_man_cuot()!="" && saefpag2.getfpag_man_cuot().equals("S")) {
	 				isTrueFalse=true;
	 			}
	 			tipoformapago.setcon_cuotas(isTrueFalse);
	 			
	 			tipoformapago.setdescripcion("INICIAL");
			
				
				tipoformapagoLogic.getTipoFormaPagos().add(tipoformapago);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipoformapagoLogic.saveTipoFormaPagosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoFormaPago() throws SQLException, Exception{
		String sFinal="  where fpag_cod_empr=1 and fpag_cod_sucu=1";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoFormaPago(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoIce(Boolean esHibernate) throws SQLException, Exception{
		TipoIceLogic tipoiceLogic=new TipoIceLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepice saepice=new saepice();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery="";//GetFinalTipoIce();

			
			List<saepice> saepices = new  ArrayList<saepice>();				
			
			saepices=saepice.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepices.size();
			
			
			TipoIce tipoice= new TipoIce();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepice saepice2:saepices) {
				idManual++;
				
				nombre=GetFormatoNombreTipoIce(saepice2.getpice_des_pice());
				lcodigo=GetFormatoCodigoTipoIce(saepice2.getpice_cod_pice().toString());
						
				System.out.println(nombre);
				
				tipoice= new TipoIce();
				
				/*
				tipoice.setId(lcodigo);
				tipoice.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipoice.setId(lcodigo);
	 			tipoice.setnombre(nombre);
	 			tipoice.setporcentaje(saepice2.getpice_por_pice());
			
				
				tipoiceLogic.getTipoIces().add(tipoice);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//tipoiceLogic.saveTipoIcesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetFormatoCodigoTipoIce(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoIce(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void PeriodoImportExport(Boolean esHibernate) throws SQLException, Exception{
		PeriodoImportExportLogic periodoimportexportLogic=new PeriodoImportExportLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepinf saepinf=new saepinf();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalPeriodoImportExport();

			
			List<saepinf> saepinfs = new  ArrayList<saepinf>();				
			
			saepinfs=saepinf.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepinfs.size();
			
			
			PeriodoImportExport periodoimportexport= new PeriodoImportExport();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepinf saepinf2:saepinfs) {
				idManual++;
				
				//nombre=GetFormatoNombrePeriodoImportExport(saepinf2.getcact_nom_cact());
				lcodigo=GetFormatoCodigoPeriodoImportExport(saepinf2.getpinf_cod_pinf());
						
				System.out.println(nombre);
				
				periodoimportexport= new PeriodoImportExport();
				
				/*
				periodoimportexport.setId(lcodigo);
				periodoimportexport.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(lcodigo.equals(101L) || lcodigo.equals(101)) {
					continue;
				}
				
				periodoimportexport.setId(lcodigo);
	 			periodoimportexport.setcodigo(saepinf2.getpinf_ano_pinf()+"-"+saepinf2.getpinf_mes_pinf());
	 			periodoimportexport.setid_anio(Long.parseLong(saepinf2.getpinf_ano_pinf().toString()));
	 			periodoimportexport.setid_mes(Long.parseLong(saepinf2.getpinf_mes_pinf().toString()));
			
				
				periodoimportexportLogic.getPeriodoImportExports().add(periodoimportexport);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			periodoimportexportLogic.savePeriodoImportExportsWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetFormatoCodigoPeriodoImportExport(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFinalPeriodoImportExport() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombrePeriodoImportExport(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void Banco(Boolean esHibernate) throws SQLException, Exception{
		BancoLogic bancoLogic=new BancoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saebanc saebanc=new saebanc();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalBanco();

			
			List<saebanc> saebancs = new  ArrayList<saebanc>();				
			
			saebancs=saebanc.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saebancs.size();
			
			
			Banco banco= new Banco();
			
			TipoBancoLogic tipobancoLogic=new TipoBancoLogic();
			TipoBanco tipobanco= new TipoBanco();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saebanc saebanc2:saebancs) {
				idManual++;
				
				//nombre=GetFormatoNombreBanco(saebanc2.getcact_nom_cact());
				//lcodigo=GetFormatoCodigoBanco(saebanc2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				banco= new Banco();
				
				/*
				banco.setId(lcodigo);
				banco.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				tipobancoLogic.getEntityWithConnection(Long.parseLong(saebanc2.getbanc_cod_bsri()));
				tipobanco=tipobancoLogic.getTipoBanco();
				
				
				if(tipobanco!=null && tipobanco.getId()>0) {
					banco.setid_tipo_banco(tipobanco.getId());
					banco.setcodigo(tipobanco.getnombre().trim());
		 			banco.setnombre(tipobanco.getnombre().trim());
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
				
	 			
	 			
	 			
	 			banco.setid_empresa(Long.parseLong(saebanc2.getbanc_cod_empr().toString()));
	 			banco.setid_sucursal(Long.parseLong(saebanc2.getbanc_cod_sucu().toString()));
	 			
	 			
	 			if(saebanc2.getbanc_dia_efe_loc()!=null) {
	 				banco.setdias_efectivo_local(saebanc2.getbanc_dia_efe_loc());
	 			}
	 			
	 			if(saebanc2.getbanc_dia_efe_ext()!=null) {
	 				banco.setdias_efectivo_extranjero(saebanc2.getbanc_dia_efe_ext());
	 			}
			
				
				bancoLogic.getBancos().add(banco);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			//bancoLogic.saveBancosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalBanco() throws SQLException, Exception{
		String sFinal=" where banc_cod_empr=1 ";		
		return sFinal;
	}

	public static String GetFormatoNombreBanco(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoBanco(Boolean esHibernate) throws SQLException, Exception{
		TipoBancoLogic tipobancoLogic=new TipoBancoLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saerban saerban=new saerban();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoBanco();

			
			List<saerban> saerbans = new  ArrayList<saerban>();				
			
			saerbans=saerban.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saerbans.size();
			
			
			TipoBanco tipobanco= new TipoBanco();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saerban saerban2:saerbans) {
				idManual++;
				
				nombre=GetFormatoNombreTipoBanco(saerban2.getrban_des_rban());
				lcodigo=GetFormatoCodigoTipoBanco(saerban2.getrban_cod_rban());
						
				System.out.println(nombre);
				
				tipobanco= new TipoBanco();
				
				/*
				tipobanco.setId(lcodigo);
				tipobanco.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(lcodigo.equals(1L)||lcodigo.equals(1.0)||lcodigo.equals(1)) {
					continue;
				}
				
				tipobanco.setId(lcodigo);
	 			tipobanco.setnombre(nombre);
			
				
				tipobancoLogic.getTipoBancos().add(tipobanco);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipobancoLogic.saveTipoBancosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetFormatoCodigoTipoBanco(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFinalTipoBanco() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoBanco(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TituloCliente(Boolean esHibernate) throws SQLException, Exception{
		TituloClienteLogic tituloclienteLogic=new TituloClienteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetitu saetitu=new saetitu();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTituloCliente();

			
			List<saetitu> saetitus = new  ArrayList<saetitu>();				
			
			saetitus=saetitu.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetitus.size();
			
			
			TituloCliente titulocliente= new TituloCliente();
			
			TipoTituloClienteLogic tipotituloclienteLogic=new TipoTituloClienteLogic();
			TipoTituloCliente tipotitulocliente= new TipoTituloCliente();		
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetitu saetitu2:saetitus) {
				idManual++;
				
				nombre=GetFormatoNombreTipoTituloCliente(saetitu2.gettitu_des_titu());
				//lcodigo=GetFormatoCodigoTituloCliente(saetitu2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				titulocliente= new TituloCliente();
				
				/*
				titulocliente.setId(lcodigo);
				titulocliente.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				
				
				
				
	 			titulocliente.setid_empresa(Long.parseLong(saetitu2.gettitu_cod_empr().toString()));	 			
	 			titulocliente.setcodigo(nombre);
	 			titulocliente.setnombre(nombre);
	 			titulocliente.setsiglas(saetitu2.gettitu_sig_titu().trim());
			
	 			
	 			tipotituloclienteLogic.getTipoTituloClientePorNombreWithConnection(nombre);
				tipotitulocliente=tipotituloclienteLogic.getTipoTituloCliente();
				
				
				if(tipotitulocliente!=null && tipotitulocliente.getId()>0) {
					//titulocliente.setid_tipo_titulo_cliente(tipotitulocliente.getId());	 	
				} else {
					countNoExiste++;
					stringBuilderNoExiste.append(","+nombre);
					
					continue;
				}
	 			
				tituloclienteLogic.getTituloClientes().add(titulocliente);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tituloclienteLogic.saveTituloClientesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}
	
	public static String GetFinalTituloCliente() throws SQLException, Exception{
		String sFinal="  where titu_cod_empr=1 ";		
		return sFinal;
	}

		
	public static void TipoTituloCliente(Boolean esHibernate) throws SQLException, Exception{
		TipoTituloClienteLogic tipotituloclienteLogic=new TipoTituloClienteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saetitu saetitu=new saetitu();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoTituloCliente();

			
			List<saetitu> saetitus = new  ArrayList<saetitu>();				
			
			saetitus=saetitu.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saetitus.size();
			
			
			TipoTituloCliente tipotitulocliente= new TipoTituloCliente();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saetitu saetitu2:saetitus) {
				idManual++;
				
				if(idManual.equals(1L)) {
					continue;
				}
				
				nombre=GetFormatoNombreTipoTituloCliente(saetitu2.gettitu_des_titu());
				//lcodigo=GetFormatoCodigoTipoTituloCliente(saetitu2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipotitulocliente= new TipoTituloCliente();
				
				/*
				tipotitulocliente.setId(lcodigo);
				tipotitulocliente.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				tipotitulocliente.setId(idManual);
	 			tipotitulocliente.setnombre(nombre);
	 			tipotitulocliente.setsiglas(saetitu2.gettitu_sig_titu().trim());
				
				tipotituloclienteLogic.getTipoTituloClientes().add(tipotitulocliente);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipotituloclienteLogic.saveTipoTituloClientesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoTituloCliente() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoTituloCliente(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void GrupoCliente(Boolean esHibernate) throws SQLException, Exception{
		GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saegrpv saegrpv=new saegrpv();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalGrupoCliente();

			
			List<saegrpv> saegrpvs = new  ArrayList<saegrpv>();				
			
			saegrpvs=saegrpv.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saegrpvs.size();
			
			
			GrupoCliente grupocliente= new GrupoCliente();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saegrpv saegrpv2:saegrpvs) {
				idManual++;
				
				nombre=GetFormatoNombreGrupoCliente(saegrpv2.getgrpv_nom_grpv());
				codigo=GetFormatoNombreGrupoCliente(saegrpv2.getgrpv_cod_grpv());
				
				//lcodigo=GetFormatoCodigoGrupoCliente(saegrpv2.getcact_cod_cact());
				idModulo=GetConstantModulo(saegrpv2.getgrpv_cod_modu());
				
				System.out.println(nombre);
				
				grupocliente= new GrupoCliente();
				
				/*
				grupocliente.setId(lcodigo);
				grupocliente.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
	 			grupocliente.setid_empresa(Long.parseLong(saegrpv2.getgrpv_cod_empr().toString()));
	 			grupocliente.setid_cuenta_contable(null);
	 			grupocliente.setid_modulo(idModulo);
	 			grupocliente.setid_centro_costo(null);
	 			grupocliente.setcodigo(codigo);
	 			grupocliente.setnombre(nombre);
	 			grupocliente.setsiglas(saegrpv2.getgrpv_ini_grpv().trim());
	 			grupocliente.setdescripcion("INICIAL");
	 			
	 			isTrueFalse=false;
	 			if(codigo.contains("PV")) {
	 				isTrueFalse=true;
	 			}
	 			grupocliente.setes_prove(isTrueFalse);
			
				
				grupoclienteLogic.getGrupoClientes().add(grupocliente);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			grupoclienteLogic.saveGrupoClientesWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalGrupoCliente() throws SQLException, Exception{
		String sFinal="  where grpv_cod_empr=1; ";		
		return sFinal;
	}

	public static String GetFormatoNombreGrupoCliente(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoIva(Boolean esHibernate) throws SQLException, Exception{
		TipoIvaLogic tipoivaLogic=new TipoIvaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepiva saepiva=new saepiva();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoIva();

			
			List<saepiva> saepivas = new  ArrayList<saepiva>();				
			
			saepivas=saepiva.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saepivas.size();
			
			
			TipoIva tipoiva= new TipoIva();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepiva saepiva2:saepivas) {
				idManual++;
				
				nombre=GetFormatoNombreTipoIva(saepiva2.getpiva_por_piva().toString());
				lcodigo=Long.parseLong(saepiva2.getpiva_por_piva().toString());//GetFormatoCodigoTipoIva(saepiva2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tipoiva= new TipoIva();
				
				/*
				tipoiva.setId(lcodigo);
				tipoiva.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(saepiva2.getpiva_por_piva().equals(12L)||saepiva2.getpiva_por_piva().equals(12.0)||saepiva2.getpiva_por_piva().equals(12)) {
					continue;
				}
				
				tipoiva.setId(lcodigo);
	 			tipoiva.setcodigo(nombre);
	 			tipoiva.setnombre(nombre);
			
				
				tipoivaLogic.getTipoIvas().add(tipoiva);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipoivaLogic.saveTipoIvasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoIva() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoIva(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoRetencionIva(Boolean esHibernate) throws SQLException, Exception{
		TipoRetencionIvaLogic tiporetencionivaLogic=new TipoRetencionIvaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saepriv saepriv=new saepriv();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoRetencionIva();

			
			List<saepriv> saeprivs = new  ArrayList<saepriv>();				
			
			saeprivs=saepriv.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saeprivs.size();
			
			
			TipoRetencionIva tiporetencioniva= new TipoRetencionIva();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saepriv saepriv2:saeprivs) {
				idManual++;
				
				nombre=GetFormatoNombreTipoRetencionIva(saepriv2.getpriv_por_priv().toString());
				//lcodigo=GetFormatoCodigoTipoRetencionIva(saepriv2.getcact_cod_cact());
						
				System.out.println(nombre);
				
				tiporetencioniva= new TipoRetencionIva();
				
				/*
				tiporetencioniva.setId(lcodigo);
				tiporetencioniva.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(saepriv2.getpriv_cod_priv().equals(0) || saepriv2.getpriv_cod_priv().equals(0.0)) {
					continue;
				}
				
				tiporetencioniva.setId(Long.parseLong(saepriv2.getpriv_por_priv().toString()));
	 			tiporetencioniva.setcodigo(nombre);
	 			tiporetencioniva.setnombre(nombre);
			
				
				tiporetencionivaLogic.getTipoRetencionIvas().add(tiporetencioniva);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tiporetencionivaLogic.saveTipoRetencionIvasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static String GetFinalTipoRetencionIva() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoRetencionIva(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
				
	public static void TipoTributario(Boolean esHibernate) throws SQLException, Exception{
		TipoTributarioLogic tipotributarioLogic=new TipoTributarioLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saecrtr saecrtr=new saecrtr();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTipoTributario();

			
			List<saecrtr> saecrtrs = new  ArrayList<saecrtr>();				
			
			saecrtrs=saecrtr.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saecrtrs.size();
			
			
			TipoTributario tipotributario= new TipoTributario();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saecrtr saecrtr2:saecrtrs) {
				idManual++;
				
				nombre=GetFormatoNombreTipoTributario(saecrtr2.getcrtr_des_crtr());
				lcodigo=GetFormatoCodigoTipoTributario(saecrtr2.getcrtr_cod_crtr());
						
				System.out.println(nombre);
				
				tipotributario= new TipoTributario();
				
				/*
				tipotributario.setId(lcodigo);
				tipotributario.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(lcodigo.equals(1L) || lcodigo.equals(1.0)) {
					continue;
				}
				
				tipotributario.setId(lcodigo);
	 			tipotributario.setcodigo(nombre);
	 			tipotributario.setnombre(nombre);
			
				
				tipotributarioLogic.getTipoTributarios().add(tipotributario);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			tipotributarioLogic.saveTipoTributariosWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetFormatoCodigoTipoTributario(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFinalTipoTributario() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTipoTributario(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TransaccionConta(Boolean esHibernate) throws SQLException, Exception{
		TransaccionContaLogic transaccioncontaLogic=new TransaccionContaLogic();
		
		
		try {
			int iTotal=0;
			long time_start = System.currentTimeMillis();
			
			if(esHibernate) {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			} else {
				com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
				com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
			}
						
			saestrs saestrs=new saestrs();
			
			long time_persistence = System.currentTimeMillis();
			
			String sFinalQuery=GetFinalTransaccionConta();

			
			List<saestrs> saestrss = new  ArrayList<saestrs>();				
			
			saestrss=saestrs.getEntitiesWithConnection(sFinalQuery);
			
			long time_query = System.currentTimeMillis();
					
			
			iTotal=saestrss.size();
			
			
			TransaccionConta transaccionconta= new TransaccionConta();
			
			
			Long idManual=0L;
			String nombre="";
			String codigo="";
			Long lcodigo=1L;
			Long idModulo=0L;
			Boolean isTrueFalse=false;
			
			int countNoExiste=0;
			StringBuilder stringBuilderNoExiste=new StringBuilder();
			
			for(saestrs saestrs2:saestrss) {
				idManual++;
				
				nombre=GetFormatoNombreTransaccionConta(saestrs2.getstrs_des_strs());
				lcodigo=GetFormatoCodigoTransaccionConta(saestrs2.getstrs_cod_strs());
						
				System.out.println(nombre);
				
				transaccionconta= new TransaccionConta();
				
				/*
				transaccionconta.setId(lcodigo);
				transaccionconta.setnombre(nombre);
				
				if(saecact2.getcact_cod_cact()!=null) {
					tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
				}
				*/
				
				/*
				*/
				
				if(lcodigo.equals(1L) || lcodigo.equals(1.0)) {
					continue;
				}
				
				transaccionconta.setId(lcodigo);
	 			transaccionconta.setcodigo(nombre);
	 			transaccionconta.setnombre(nombre);
			
				
				transaccioncontaLogic.getTransaccionContas().add(transaccionconta);
			}
			
			if(stringBuilderNoExiste.length() >0) {						
				System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
			}
			
		
			transaccioncontaLogic.saveTransaccionContasWithConnection();
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
			System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
		    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
		    
		    System.out.println("TOTAL No ITEMS : " + iTotal);
		} catch(Exception e) {
			
			throw e;
				
		} finally {
		}
	}

	public static Long GetFormatoCodigoTransaccionConta(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFinalTransaccionConta() throws SQLException, Exception{
		String sFinal=" ";		
		return sFinal;
	}

	public static String GetFormatoNombreTransaccionConta(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void CentroCosto(Boolean esHibernate) throws SQLException, Exception{
		CentroCostoLogic centrocostoLogic=new CentroCostoLogic();
		
		centrocostoLogic.getNewConnexionToDeep();
		
		try {
					
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saeccosn saeccosn=new saeccosn();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalCentroCosto();

		
		List<saeccosn> saeccosns = new  ArrayList<saeccosn>();				
		
		saeccosns=saeccosn.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saeccosns.size();
		
		
		
		CentroCosto centrocosto= new CentroCosto();
		CentroCosto centrocostoPadre= new CentroCosto();
		
		Long idManual=0L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		Long idCentroCostoPadre=1L;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		
		
		for(saeccosn saeccosn2:saeccosns) {
			idManual++;
			
			nombre=GetFormatoNombreCentroCosto(saeccosn2.getccosn_nom_ccosn());
			//lcodigo=GetFormatoCodigoCentroCosto(saeccosn2.getcact_cod_cact());
					
			System.out.println(nombre);
			
			centrocosto= new CentroCosto();
			
			/*
			centrocosto.setId(lcodigo);
			centrocosto.setnombre(nombre);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
			
			/*
			*/
			
 			centrocosto.setid_empresa(Long.parseLong(saeccosn2.getccosn_cod_empr().toString()));
 			
 			
 			
 			
 			
 			
 			if(!saeccosn2.getccosn_cod_ccosn().trim().equals("1.")) {
 				sFinalQuery=" where codigo='"+saeccosn2.getccosn_cod_padr().trim()+"'";
 				centrocostoLogic.getEntity(sFinalQuery);
 				
 				centrocostoPadre=centrocostoLogic.getCentroCosto();
 				
 				if(centrocostoPadre!=null && centrocostoPadre.getId()>0) {
 					centrocosto.setid_centro_costo(centrocostoPadre.getId());
 				}
 			} else {
 				centrocosto.setid_centro_costo(null);
 			}
 			 			
 			
 			
 			
 			
 			centrocosto.setcodigo(saeccosn2.getccosn_cod_ccosn().trim());
 			centrocosto.setnombre(nombre);
 			centrocosto.setorden(saeccosn2.getccosn_ord_ccosn());
 		
 			
 			isTrueFalse=false;
 			if(saeccosn2.getccosn_mov_ccosn().equals(1)){
 				isTrueFalse=true; 				
 			}		
 			centrocosto.setes_final(isTrueFalse);
 			
 			centrocostoLogic.setCentroCosto(centrocosto);
 			centrocostoLogic.saveCentroCosto();
 			
			//centrocostoLogic.getCentroCostos().add(centrocosto);
		}
		
		
		//centrocostoLogic.commitNewConnexionToDeep();
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//centrocostoLogic.saveCentroCostosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	    
		} catch(Exception e) {
			centrocostoLogic.rollbackNewConnexionToDeep();
			
		} finally {
			centrocostoLogic.closeNewConnexionToDeep();
		}
}
	
	
	public static String GetFinalCentroCosto() throws SQLException, Exception{
		String sFinal="  where ccosn_cod_empr=1 order by  ccosn_niv_ccosn,ccosn_ord_ccosn";		
		return sFinal;
	}

	public static String GetFormatoNombreCentroCosto(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
			
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
			
		return sNombreTipoDocumento;
	}
	
	public static void TipoGastoEmpresa(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetgas saetgas=new saetgas();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoGasto();

		
		List<saetgas> saetgass = new  ArrayList<saetgas>();				
		
		saetgass=saetgas.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetgass.size();
		
		
		TipoGastoEmpresaLogic tipogastoempresaLogic=new TipoGastoEmpresaLogic();
		TipoGastoEmpresa tipogastoempresa= new TipoGastoEmpresa();
		
		TipoGastoLogic tipogastoLogic=new TipoGastoLogic();
		TipoGasto tipogasto= new TipoGasto();		
		
		Long idManual=0L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetgas saetgas2:saetgass) {
			idManual++;
			
			nombre=GetFormatoNombreTipoGasto(saetgas2.gettgas_nom_thas());
			//lcodigo=GetFormatoCodigoTipoGastoEmpresa(saetgas2.getcact_cod_cact());
					
			System.out.println(nombre);
			
			tipogastoempresa= new TipoGastoEmpresa();
			
			/*
			tipogastoempresa.setId(lcodigo);
			tipogastoempresa.setnombre(nombre);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
			
			
			
			
			
 			tipogastoempresa.setid_empresa(Long.parseLong(saetgas2.gettgas_cod_empr().toString()));
 			tipogastoempresa.setid_sucursal(Long.parseLong(saetgas2.gettgas_cod_sucu().toString()));
 			
 			
 			tipogastoLogic.getTipoGastoPorNombreWithConnection(nombre);
			tipogasto=tipogastoLogic.getTipoGasto();
			
			
			if(tipogasto!=null && tipogasto.getId()>0) {
				//tipogastoempresa.setid_tipo_gasto(tipogasto.getId());	
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append(","+nombre);
				
				continue;
			}
			
 			
 			
 			tipogastoempresa.setid_formato(1L);
 			
 			tipogastoempresa.setnombre(nombre);
 			tipogastoempresa.setdescripcion(nombre);
 			
 			tipogastoempresa.setid_cuenta_contable_gasto(null);
 			tipogastoempresa.setid_cuenta_contable_fiscal_bien(null);
 			tipogastoempresa.setid_cuenta_contable_fiscal_servicio(null);
 			tipogastoempresa.setid_cuenta_contable_retencion_bien(null);
 			tipogastoempresa.setid_cuenta_contable_retencion_servicio(null);
 			tipogastoempresa.setid_cuenta_contable_iva_bien(null);
 			tipogastoempresa.setid_cuenta_contable_iva_servicio(null);
		
			tipogastoempresaLogic.getTipoGastoEmpresas().add(tipogastoempresa);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//tipogastoempresaLogic.saveTipoGastoEmpresasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void TipoGasto(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetgas saetgas=new saetgas();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoGasto();

		
		List<saetgas> saetgass = new  ArrayList<saetgas>();				
		
		saetgass=saetgas.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetgass.size();
		
		
		TipoGastoLogic tipogastoLogic=new TipoGastoLogic();
		TipoGasto tipogasto= new TipoGasto();
		
		
		Long idManual=3L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetgas saetgas2:saetgass) {
			idManual++;
			
			nombre=GetFormatoNombreTipoGasto(saetgas2.gettgas_nom_thas());
			//lcodigo=GetFormatoCodigoTipoGasto(saetgas2.getcact_cod_cact());
					
			System.out.println(nombre);
			
			tipogasto= new TipoGasto();
			
			/*
			tipogasto.setId(lcodigo);
			tipogasto.setnombre(nombre);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
			
			/*
			*/
			
			tipogasto.setId(idManual);
 			tipogasto.setnombre(nombre);
		
 			if(saetgas2.gettgas_cod_tgas().equals(5.0) || saetgas2.gettgas_cod_tgas().equals(11.0)) {
 				continue;
 				
 			}
 			
			tipogastoLogic.getTipoGastos().add(tipogasto);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//tipogastoLogic.saveTipoGastosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
}
	
	public static String GetFinalTipoGasto() throws SQLException, Exception{
		String sFinal=" where tgas_cod_empr=1 ";		
		return sFinal;
	}
	
	public static String GetFormatoNombreTipoGasto(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static void Formato(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saeftrn saeftrn=new saeftrn();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalFormato();

		
		List<saeftrn> saeftrns = new  ArrayList<saeftrn>();				
		
		saeftrns=saeftrn.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saeftrns.size();
		
		
		FormatoLogic formatoLogic=new FormatoLogic();
		Formato formato= new Formato();
		
		TipoFormatoLogic tipoformatoLogic=new TipoFormatoLogic();
		TipoFormato tipoformato= new TipoFormato();		
		
		//Long idManual=0L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		Long idTipoMovimiento=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saeftrn saeftrn2:saeftrns) {
			//idManual++;
			
			nombre=GetFormatoNombreFormato(saeftrn2.getftrn_des_ftrn());
			idModulo=GetConstantModulo(saeftrn2.getftrn_cod_modu());
			//lcodigo=GetFormatoCodigoFormato(saeftrn2.getcact_cod_cact());
					
			System.out.println(nombre);
			
			formato= new Formato();
			
			/*
			formato.setId(lcodigo);
			formato.setnombre(nombre);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
						
			
 			formato.setid_empresa(Long.parseLong(saeftrn2.getftrn_cod_empr().toString()));
 			formato.setid_modulo(idModulo);
 			
 			idTipoMovimiento=4l; 			
 			if(saeftrn2.getftrn_tip_movi()!=null) {
 				if(saeftrn2.getftrn_tip_movi().equals("DI")) {
 					formato.setid_tipo_movimiento(1L);
 				} else if(saeftrn2.getftrn_tip_movi().equals("EG")) {
 					formato.setid_tipo_movimiento(3L);
 				} else if(saeftrn2.getftrn_tip_movi().equals("IN")) {
 					formato.setid_tipo_movimiento(2L);
 				}
 			}
 			
 			
 			tipoformatoLogic.getTipoFormatoPorNombreWithConnection(nombre);
			tipoformato=tipoformatoLogic.getTipoFormato();
						
			if(tipoformato!=null && tipoformato.getId()>0) {
				formato.setid_tipo_formato(tipoformato.getId()); 	
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append(","+nombre);
				
				continue;
			}
			
			
 			
 			
 			formato.setnombre(nombre); 			
 			formato.setubicacion(nombre.toLowerCase().replace(" ", ""));
		
 			//YA EXISTE DEBE CONTINUAE, NO COJE SI NO SE PONE .0
 			System.out.println(saeftrn2.getftrn_cod_ftrn());
 			
 			if(saeftrn2.getftrn_cod_ftrn().equals(492.0) || saeftrn2.getftrn_cod_ftrn().equals(493.0)) {
 				continue;
 			}
 			
 			if(idModulo.equals(1) && tipoformato.getId().equals(1L)) {
 				countNoExiste++;
				stringBuilderNoExiste.append(","+nombre);
				
 				continue;
 			}
 			
			formatoLogic.getFormatos().add(formato);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//formatoLogic.saveFormatosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
}
	
	public static void ParametroFormularioIva(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetiva saetiva=new saetiva();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoParametroFormularioIva();

		
		List<saetiva> saetivas = new  ArrayList<saetiva>();				
		
		saetivas=saetiva.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetivas.size();
		
		
		ParametroFormularioIvaLogic parametroformularioivaLogic=new ParametroFormularioIvaLogic();
		ParametroFormularioIva parametroformularioiva= new ParametroFormularioIva();
		
		TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic=new TipoParametroFormularioIvaLogic();
		TipoParametroFormularioIva tipoparametroformularioiva= new TipoParametroFormularioIva();		
		
		//Long idManual=0L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetiva saetiva2:saetivas) {
			//idManual++;
			
			codigo=saetiva2.gettiva_cod_nsri().trim();
			nombre=GetFormatoNombreTipoParametroFormularioIva(saetiva2.gettiva_des_tiva());
			lcodigo=GetFormatoCodigoTipoParametroFormularioIva(saetiva2.gettiva_cod_nsri());
					
			System.out.println(nombre);
			
			parametroformularioiva= new ParametroFormularioIva();
			
			/*
			parametroformularioiva.setId(lcodigo);
			parametroformularioiva.setnombre(nombre);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
			
			
			
 			parametroformularioiva.setid_empresa(Long.parseLong(saetiva2.gettiva_cod_empr().toString()));
 			parametroformularioiva.setcodigo_sri(codigo);
 			parametroformularioiva.setnombre(nombre);
 			parametroformularioiva.setporcentaje(0.0);
 			
 			
 			
 			tipoparametroformularioivaLogic.getEntityWithConnection(lcodigo);
			tipoparametroformularioiva=tipoparametroformularioivaLogic.getTipoParametroFormularioIva();
			
			
			if(tipoparametroformularioiva!=null && tipoparametroformularioiva.getId()>0) {
				parametroformularioiva.setid_tipo_parametro_formulario_iva(tipoparametroformularioiva.getId());	 	
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append(","+nombre);
				
				continue;
			}
			
 			
 			isTrueFalse=false; 			
 			if(saetiva2.gettiva_cod_total().equals("1")) {
 				isTrueFalse=true;  				
 			}
 			parametroformularioiva.setcon_total(isTrueFalse);
 			
 			
 			parametroformularioiva.setgrupo(saetiva2.gettiva_cod_grpr());
 			parametroformularioiva.setgrupo2(saetiva2.gettiva_cod_grprg());
 			
 			parametroformularioiva.setid_cuenta_contable1(null);
 			parametroformularioiva.setid_cuenta_contable2(null);
 			parametroformularioiva.setid_cuenta_contable3(null);
 			parametroformularioiva.setid_cuenta_contable4(null);
 			parametroformularioiva.setid_cuenta_contable5(null);
		
			parametroformularioivaLogic.getParametroFormularioIvas().add(parametroformularioiva);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		parametroformularioivaLogic.saveParametroFormularioIvasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
}
	
	public static void TipoParametroFormularioIva(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetiva saetiva=new saetiva();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoParametroFormularioIva();

		
		List<saetiva> saetivas = new  ArrayList<saetiva>();				
		
		saetivas=saetiva.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetivas.size();
		
		
		TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic=new TipoParametroFormularioIvaLogic();
		TipoParametroFormularioIva tipoparametroformularioiva= new TipoParametroFormularioIva();
		
		//Long idManual=0L;
		String nombre="";
		String codigo="";
		Long lcodigo=1L;
		Long idModulo=0L;
		
		for(saetiva saetiva2:saetivas) {
			//idManual++;
			
			nombre=GetFormatoNombreTipoParametroFormularioIva(saetiva2.gettiva_des_tiva());
			lcodigo=GetFormatoCodigoTipoParametroFormularioIva(saetiva2.gettiva_cod_nsri());
					
			System.out.println(nombre);
			
			tipoparametroformularioiva= new TipoParametroFormularioIva();
			
			/*
			tipoLineaFlujoCaja.setId(cact_cod_cact);
			tipoLineaFlujoCaja.setnombre(cact_nom_cact);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			*/
			
			tipoparametroformularioiva.setId(lcodigo);
 			tipoparametroformularioiva.setnombre(nombre);
 			tipoparametroformularioiva.setcodigo_sri(saetiva2.gettiva_cod_nsri().trim());
 			
			tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().add(tipoparametroformularioiva);
		}
		
		//tipoparametroformularioivaLogic.saveTipoParametroFormularioIvasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
}
	
	public static void LineaFlujoCaja(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saecact saecact=new saecact();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoLineaFlujoCaja();

		
		List<saecact> saecacts = new  ArrayList<saecact>();				
		
		saecacts=saecact.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saecacts.size();
		
		
		LineaFlujoCajaLogic lineaFlujoCajaLogic=new LineaFlujoCajaLogic();		
		LineaFlujoCaja lineaFlujoCaja= new LineaFlujoCaja();
		
		TipoLineaFlujoCajaLogic tipoLineaFlujoCajaLogic=new TipoLineaFlujoCajaLogic();
		TipoLineaFlujoCaja tipoLineaFlujoCaja= new TipoLineaFlujoCaja();
		
		//Long idManual=0L;
		String cact_nom_cact="";
		String tret_cod_nsri="";
		Long cact_cod_cact=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saecact saecact2:saecacts) {
			//idManual++;
			
			cact_nom_cact=GetFormatoNombreTipoLineaFlujoCaja(saecact2.getcact_nom_cact());
			cact_cod_cact=GetFormatoCodigoTipoLineaFlujoCaja(saecact2.getcact_cod_cact());
			
			System.out.println(cact_nom_cact);
			
			lineaFlujoCaja= new LineaFlujoCaja();
			
			lineaFlujoCaja.setid_empresa(Long.parseLong(saecact2.getcact_cod_empr().toString()));
	 		
			

			tipoLineaFlujoCajaLogic.getTipoLineaFlujoCajaPorNombreWithConnection(cact_nom_cact);
			tipoLineaFlujoCaja=tipoLineaFlujoCajaLogic.getTipoLineaFlujoCaja();
			
			
			if(tipoLineaFlujoCaja!=null && tipoLineaFlujoCaja.getId()>0) {
				lineaFlujoCaja.setid_tipo_linea_flujo_caja(tipoLineaFlujoCaja.getId());	 	
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append(","+cact_nom_cact);
				
				continue;
			}
			
			
	 	
	 		
	 		
	 		lineaFlujoCaja.setcodigo(saecact2.getcact_cod_cact().trim());
	 		lineaFlujoCaja.setnombre(cact_nom_cact);
	 		
	 		/*
	 		lineaFlujoCaja.setid_tipo_movimiento(2L);
	 		if(saecact2.getcact_tip_movi()!=null && saecact2.getcact_tip_movi().equals("E")) {
	 			lineaFlujoCaja.setid_tipo_movimiento(3L);
	 		}
	 		*/
	 		
	 		lineaFlujoCaja.setid_tipo_grupo_flujo_caja(1L);
	 		if(saecact2.getcact_grp_cact()!=null && saecact2.getcact_grp_cact().equals("101")) {
	 			lineaFlujoCaja.setid_tipo_grupo_flujo_caja(2L);
	 		}
	 		

	 		isTrueFalse=false;	 		
	 		if(saecact2.getcact_con_cact()!=null && saecact2.getcact_con_cact().equals("S")) {
	 			isTrueFalse=true;
	 		}	 		
	 		lineaFlujoCaja.setes_consolidado(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saecact2.getcact_proy_cact()!=null && saecact2.getcact_proy_cact().equals("S")) {
	 			isTrueFalse=true;
	 		}	 		
	 		lineaFlujoCaja.setesta_proyeccion(isTrueFalse);
	 			 		
			/*
			lineaFlujoCaja.setid_empresa(Long.parseLong(saecact2.gettret_cod_empr().toString()));
	 		lineaFlujoCaja.setid_cuenta_contable(null);
	 		lineaFlujoCaja.setid_cuenta_contable_credito(null);
	 		
	 		
	 		tipoRetencionLogic.getTipoLineaFlujoCajaPorNombreWithConnection(tret_det_tret);
	 		tipoRetencion=tipoRetencionLogic.getTipoLineaFlujoCaja();
	 				
	 		if(tipoRetencion!=null && tipoRetencion.getId()>0) {
	 			lineaFlujoCaja.setid_tipo_retencion( tipoRetencion.getId());
	 		} else {
	 			countNoExiste++;
				stringBuilderNoExiste.append(","+tret_det_tret);
				
				continue;
	 		}
	 		
	 		
	 		if(saecact2.gettret_cod_nsri()!=null) {
	 			lineaFlujoCaja.setcodigo(saecact2.gettret_cod_nsri().trim());
	 		}
	 		
	 		lineaFlujoCaja.setnombre(tret_det_tret);
	 		lineaFlujoCaja.setporcentaje(saecact2.gettret_porct());
	 		lineaFlujoCaja.setmonto_minimo(saecact2.gettret_mont_min());
	 		
	 		isTrueFalse=false;	 		
	 		if(saecact2.gettret_ban_retf()!=null && saecact2.gettret_ban_retf().equals("RI")) {
	 			isTrueFalse=true;
	 		}	 		
	 		lineaFlujoCaja.setes_retencion_iva(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saecact2.gettret_ban_crdb()!=null && saecact2.gettret_ban_crdb().equals("DB")) {
	 			isTrueFalse=true;
	 		}	 		
	 		lineaFlujoCaja.setes_debito(isTrueFalse);
	 		*/
	 		
	 		
	 		
	 		
	 		lineaFlujoCajaLogic.getLineaFlujoCajas().add(lineaFlujoCaja);
	 		
		}
		
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		lineaFlujoCajaLogic.saveLineaFlujoCajasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void TipoLineaFlujoCaja(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saecact saecact=new saecact();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoLineaFlujoCaja();

		
		List<saecact> saecacts = new  ArrayList<saecact>();				
		
		saecacts=saecact.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saecacts.size();
		
		
		TipoLineaFlujoCajaLogic tipoLineaFlujoCajaLogic=new TipoLineaFlujoCajaLogic();
		TipoLineaFlujoCaja tipoLineaFlujoCaja= new TipoLineaFlujoCaja();
		
		//Long idManual=0L;
		String cact_nom_cact="";
		String cact_cod_nsri="";
		Long cact_cod_cact=1L;
		Long idModulo=0L;
		
		for(saecact saecact2:saecacts) {
			//idManual++;
			
			cact_nom_cact=GetFormatoNombreTipoLineaFlujoCaja(saecact2.getcact_nom_cact());
			cact_cod_cact=GetFormatoCodigoTipoLineaFlujoCaja(saecact2.getcact_cod_cact());
					
			System.out.println(cact_nom_cact);
			
			tipoLineaFlujoCaja= new TipoLineaFlujoCaja();
			
			tipoLineaFlujoCaja.setId(cact_cod_cact);
			tipoLineaFlujoCaja.setnombre(cact_nom_cact);
			
			if(saecact2.getcact_cod_cact()!=null) {
				tipoLineaFlujoCaja.setcodigo_sri(saecact2.getcact_cod_cact().trim());
			}
			
			tipoLineaFlujoCajaLogic.getTipoLineaFlujoCajas().add(tipoLineaFlujoCaja);
		}
		
		//tipoLineaFlujoCajaLogic.saveTipoLineaFlujoCajasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void Transaccion(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetran saetran=new saetran();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoTransaccion();

		
		List<saetran> saetrans = new  ArrayList<saetran>();				
		
		saetrans=saetran.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetrans.size();
		
		
		TransaccionLogic transaccionLogic=new TransaccionLogic();
		Transaccion transaccion= new Transaccion();
		
		TipoTransaccionModuloLogic tipoTransaccionModuloLogic=new TipoTransaccionModuloLogic();
		TipoTransaccionModulo tipoTransaccionModulo= new TipoTransaccionModulo();
		
		TipoRetencionFuenteIvaLogic tipoRetencionFuenteIVaLogic=new TipoRetencionFuenteIvaLogic();
		TipoRetencionFuenteIva tipoRetencionFuenteIVa= new TipoRetencionFuenteIva();
		
		Long idModulo=0L;
		Long idTipoTransa=0L;
		Long idTipoMovimiento=0L;
		String tran_des_tran="";
		String tran_cod_tran="";
		Long tran_cod_tret=1L;
		
		int count=1;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetran saetran2:saetrans) {			
			//CON EL PRIMERO NO HACER
			/*
			if(count==1) {
				count++;
				continue;
			}
			*/
			tran_des_tran=GetFormatoNombreTipoTransaccionModulo(saetran2.gettran_des_tran());
			idModulo=ProcessMigration.GetConstantModulo(saetran2.gettran_cod_modu());
			tran_cod_tran=GetFormatoSiglasTipoTransaccionModulo(saetran2.gettran_cod_tran());
			idTipoTransa=GetConstantTipoTransaccion(saetran2.gettrans_tip_tran());
			tran_cod_tret=GetFormatoCodigoTipoRetencion(saetran2.gettran_cod_tret());
			
			System.out.println(tran_des_tran);
			
			transaccion= new Transaccion();
			
			
			tipoTransaccionModuloLogic.getTipoTransaccionModuloPorIdModuloPorNombreWithConnection(idModulo, tran_des_tran);
			tipoTransaccionModulo=tipoTransaccionModuloLogic.getTipoTransaccionModulo();
					
			if(tipoTransaccionModulo!=null && tipoTransaccionModulo.getId()>0){ 
				transaccion.setid_tipo_transaccion_modulo(tipoTransaccionModulo.getId());
			} else {
				//throw new Exception("NO EXISTE TIPO MOVIMIENTO MODULO:");
				countNoExiste++;
				stringBuilderNoExiste.append(","+tran_des_tran);
				
				continue;
			}
			
			
			
			transaccion.setid_empresa(Long.parseLong(saetran2.gettran_cod_empr().toString()));
			transaccion.setid_sucursal(Long.parseLong(saetran2.gettran_cod_sucu().toString()));
			transaccion.setid_modulo(idModulo);			
			transaccion.setid_tipo_transa(idTipoTransa);
			
			transaccion.setid_cuenta_contable(null);
			
			if(saetran2.gettrans_tip_comp()!=null && !saetran2.gettrans_tip_comp().equals("")) { 
				transaccion.setid_tipo_comprobante(Long.parseLong(saetran2.gettrans_tip_comp()));
			} else {
				transaccion.setid_tipo_comprobante(null);
			}
			
			
			//tipoRetencionFuenteIVaLogic.getTipoRetencionFuenteIvaPorIdEmpresaPorIdTipoRetencionWithConnection(Long.parseLong(saetran2.gettran_cod_empr().toString()), tran_cod_tret);								
			tipoRetencionFuenteIVa=tipoRetencionFuenteIVaLogic.getTipoRetencionFuenteIva();
					
			if(tipoRetencionFuenteIVa!=null && tipoRetencionFuenteIVa.getId()>0) { 
				//transaccion.setid_tipo_retencion_fuente_iva(tipoRetencionFuenteIVa.getId());
			} else {
				//transaccion.setid_tipo_retencion_fuente_iva(null);	
			}
			
			
			transaccion.setcodigo(tran_cod_tran);
			transaccion.setnombre(tran_des_tran);
			transaccion.setdescripcion("INICIAL");
			
			
			transaccionLogic.getTransaccions().add(transaccion);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//transaccionLogic.saveTransaccionsWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	    
	    /*ERROR:(Se lo agrego manual)
		NO EXISTE (2) 
		IMPORTACIONES-INVENTARIOS
		FACTURACION-VENTAS
		*/
	}
	
	public static void TipoRetencionFuenteIva(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetret saetret=new saetret();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoRetencion();

		
		List<saetret> saetrets = new  ArrayList<saetret>();				
		
		saetrets=saetret.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetrets.size();
		
		
		TipoRetencionFuenteIvaLogic tipoRetencionFuenteIVaLogic=new TipoRetencionFuenteIvaLogic();
		TipoRetencionFuenteIva tipoRetencionFuenteIVa= new TipoRetencionFuenteIva();
		
		TipoRetencionLogic tipoRetencionLogic=new TipoRetencionLogic();
		TipoRetencion tipoRetencion= new TipoRetencion();
		
		//Long idManual=0L;
		String tret_det_tret="";
		String tret_cod_nsri="";
		Long tret_cod_tret=1L;
		Long idModulo=0L;
		Boolean isTrueFalse=false;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetret saetret2:saetrets) {
			//idManual++;
			
			tret_det_tret=GetFormatoNombreTipoRetencion(saetret2.gettret_det_ret());
			tret_cod_tret=GetFormatoCodigoTipoRetencion(saetret2.gettret_cod());
			
			System.out.println(tret_det_tret);
			
			tipoRetencionFuenteIVa= new TipoRetencionFuenteIva();
			
			//tipoRetencionFuenteIVa.setid_empresa(Long.parseLong(saetret2.gettret_cod_empr().toString()));
	 		tipoRetencionFuenteIVa.setid_cuenta_contable(null);
	 		tipoRetencionFuenteIVa.setid_cuenta_contable_credito(null);
	 		
	 		
	 		tipoRetencionLogic.getTipoRetencionPorNombreWithConnection(tret_det_tret);
	 		tipoRetencion=tipoRetencionLogic.getTipoRetencion();
	 				
	 		if(tipoRetencion!=null && tipoRetencion.getId()>0) {
	 			//tipoRetencionFuenteIVa.setid_tipo_retencion( tipoRetencion.getId());
	 		} else {
	 			countNoExiste++;
				stringBuilderNoExiste.append(","+tret_det_tret);
				
				continue;
	 		}
	 		
	 		
	 		if(saetret2.gettret_cod_nsri()!=null) {
	 			tipoRetencionFuenteIVa.setcodigo(saetret2.gettret_cod_nsri().trim());
	 		}
	 		
	 		tipoRetencionFuenteIVa.setnombre(tret_det_tret);
	 		tipoRetencionFuenteIVa.setporcentaje(saetret2.gettret_porct());
	 		tipoRetencionFuenteIVa.setmonto_minimo(saetret2.gettret_mont_min());
	 		
	 		isTrueFalse=false;	 		
	 		if(saetret2.gettret_ban_retf()!=null && saetret2.gettret_ban_retf().equals("RI")) {
	 			isTrueFalse=true;
	 		}	 		
	 		tipoRetencionFuenteIVa.setes_retencion_iva(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saetret2.gettret_ban_crdb()!=null && saetret2.gettret_ban_crdb().equals("DB")) {
	 			isTrueFalse=true;
	 		}	 		
	 		tipoRetencionFuenteIVa.setes_debito(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saetret2.gettret_ban_retf_sn()!=null && saetret2.gettret_ban_retf_sn().equals("SI")) {
	 			isTrueFalse=true;
	 		}	 		
	 		tipoRetencionFuenteIVa.setes_con_secuencial(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saetret2.gettret_tip_iva()!=null && saetret2.gettret_tip_iva().equals("S")) {
	 			isTrueFalse=true;
	 		}	 		
	 		tipoRetencionFuenteIVa.setes_con_iva_factura(isTrueFalse);
	 		
	 		
	 		isTrueFalse=false;	 		
	 		if(saetret2.gettret_tip_subt()!=null && saetret2.gettret_tip_subt().equals("S")) {
	 			isTrueFalse=true;
	 		}	 		
	 		tipoRetencionFuenteIVa.setes_con_sub_total_factura(isTrueFalse);
	 		
	 		
	 		tipoRetencionFuenteIVaLogic.getTipoRetencionFuenteIvas().add(tipoRetencionFuenteIVa);
	 		
		}
		
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//tipoRetencionFuenteIVaLogic.saveTipoRetencionFuenteIvasWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void TipoRetencion(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetret saetret=new saetret();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoRetencion();

		
		List<saetret> saetrets = new  ArrayList<saetret>();				
		
		saetrets=saetret.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetrets.size();
		
		
		TipoRetencionLogic tipoRetencionLogic=new TipoRetencionLogic();
		TipoRetencion tipoRetencion= new TipoRetencion();
		
		//Long idManual=0L;
		String tret_det_tret="";
		String tret_cod_nsri="";
		Long tret_cod_tret=1L;
		Long idModulo=0L;
		
		for(saetret saetret2:saetrets) {
			//idManual++;
			
			tret_det_tret=GetFormatoNombreTipoRetencion(saetret2.gettret_det_ret());
			tret_cod_tret=GetFormatoCodigoTipoRetencion(saetret2.gettret_cod());
					
			System.out.println(tret_det_tret);
			
			tipoRetencion= new TipoRetencion();
			
			tipoRetencion.setId(tret_cod_tret);
			tipoRetencion.setnombre(tret_det_tret);
			
			if(saetret2.gettret_cod_nsri()!=null) {
				//tipoRetencion.setcodigo_sri(saetret2.gettret_cod_nsri().trim());
			}
			
			tipoRetencionLogic.getTipoRetencions().add(tipoRetencion);
		}
		
		tipoRetencionLogic.saveTipoRetencionsWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void TipoComprobante(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetcmp saetcmp=new saetcmp();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery="";//GetFinalTipoTransaccion();

		
		List<saetcmp> saetcmps = new  ArrayList<saetcmp>();				
		
		saetcmps=saetcmp.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetcmps.size();
		
		
		TipoComprobanteLogic tipoComprobanteLogic=new TipoComprobanteLogic();
		TipoComprobante tipoComprobante= new TipoComprobante();
		
		//Long idManual=0L;
		String tcmp_des_tcmp="";
		Long tcmp_cod_tcmp=0L;
		Long idModulo=0L;
		
		for(saetcmp saetcmp2:saetcmps) {
			//idManual++;
			
			tcmp_des_tcmp=GetFormatoNombreTipoComprobante(saetcmp2.gettcmp_des_tcmp());
			tcmp_cod_tcmp=GetFormatoCodigoTipoComprobante(saetcmp2.gettcmp_cod_tcmp());
					
			System.out.println(tcmp_des_tcmp);
			
			tipoComprobante= new TipoComprobante();
			
			tipoComprobante.setId(tcmp_cod_tcmp);
			tipoComprobante.setnombre(tcmp_des_tcmp);
			
			//PRIMETO YA INGRESADO, SOLO ACTUALIZO
			if(tcmp_cod_tcmp.equals(1L)) {
				continue;
				//tipoComprobante.setIsNew(false);
				//tipoComprobante.setIsChanged(true);
			}
			
			tipoComprobanteLogic.getTipoComprobantes().add(tipoComprobante);
		}
		
		tipoComprobanteLogic.saveTipoComprobantesWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}		
	
	public static void TipoTransaccionModulo(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetran saetran=new saetran();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoTransaccion();

		
		List<saetran> saetrans = new  ArrayList<saetran>();				
		
		saetrans=saetran.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetrans.size();
		
		
		TipoTransaccionModuloLogic tipoTransaccionModuloLogic=new TipoTransaccionModuloLogic();
		TipoTransaccionModulo tipoTransaccionModulo= new TipoTransaccionModulo();
		
		Long idManual=0L;
		String tran_des_tran="";
		String tran_cod_tran="";
		Long idModulo=0L;
		
		for(saetran saetran2:saetrans) {
			idManual++;
			
			//tidu_des_tidu=saetran2.gettidu_des_tidu().trim().replace(" - ", "-");
			tran_des_tran=GetFormatoNombreTipoTransaccionModulo(saetran2.gettran_des_tran());
			tran_cod_tran=GetFormatoSiglasTipoTransaccionModulo(saetran2.gettran_cod_tran());
			idModulo=ProcessMigration.GetConstantModulo(saetran2.gettran_cod_modu());
					
			System.out.println(tran_des_tran);
			
			tipoTransaccionModulo= new TipoTransaccionModulo();
			
			tipoTransaccionModulo.setId(idManual);
			tipoTransaccionModulo.setid_modulo(idModulo);
			tipoTransaccionModulo.setnombre(tran_des_tran);
			tipoTransaccionModulo.setsiglas(tran_cod_tran);
			
			tipoTransaccionModuloLogic.getTipoTransaccionModulos().add(tipoTransaccionModulo);
		}
		
		//tipoTransaccionModuloLogic.saveTipoTransaccionModulosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	public static void Secuencial(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saesecu saesecu=new saesecu();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalSecuencial();

		
		List<saesecu> saesecus = new  ArrayList<saesecu>();				
		
		saesecus=saesecu.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saesecus.size();
		
		
		SecuencialLogic secuencialLogic=new SecuencialLogic();
		Secuencial secuencial= new Secuencial();
		
		PeriodoLogic periodoLogic=new PeriodoLogic();
		Periodo periodo= new Periodo();
		
		TipoDocumentoLogic tipoDocumentoLogic=new TipoDocumentoLogic();
		TipoDocumento tipoDocumento= new TipoDocumento();
		
		Long idModulo=0L;
		Long idTipoMovimiento=0L;
		Long idMes=0L;
		Long idEmpresa=0L;
		Long idEjercicio=0L;
		Long idSucursal=0L;
		Long idTipoMovimientoModulo=0L;
		
		String tidu_des_tidu="";
		int count=1;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		//GetConstantTipoMovimientoModulo
		
		for(saesecu saesecu2:saesecus) {			
			//CON EL PRIMERO NO HACER
			/*
			if(count==1) {
				count++;
				continue;
			}
			*/
			
			idModulo=ProcessMigration.GetConstantModulo(saesecu2.getsecu_cod_modu());
			idMes=Long.parseLong(saesecu2.getsecu_num_prdo().toString());
			idEmpresa=Long.parseLong(saesecu2.getsecu_cod_empr().toString());
			idSucursal=Long.parseLong(saesecu2.getsecu_cod_sucu().toString());
			idTipoMovimientoModulo=GetConstantTipoMovimientoModulo(saesecu2.getsecu_cod_tidu());
			idEjercicio=GetConstantEjercicio(saesecu2.getsecu_cod_ejer());
					 
			secuencial= new Secuencial();
			
			secuencial.setid_empresa(idEmpresa);
			secuencial.setid_sucursal(idSucursal);			
			secuencial.setid_modulo(idModulo);
			secuencial.setid_ejercicio(idEjercicio);
			
			secuencial.setid_anio(LID_ANIO_DEFECTO);
			secuencial.setid_mes(idMes);
			
			//OBTENER PERIODO
			periodoLogic.getPeriodoPorEmprePorAnioPorMesWithConnection(idEmpresa, LID_ANIO_DEFECTO, idMes);
			periodo=periodoLogic.getPeriodo();
			
			
			if(periodo!=null && periodo.getId()>0){ 
				secuencial.setid_periodo(periodo.getId());
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append("\r\n,PERIODO="+LID_ANIO_DEFECTO+idMes);
				
				continue;
			}
			
						
						
			tipoDocumentoLogic.getTipoDocumentoPorEmpresaPorModuloPorTipoMoviModuWithConnection(idEmpresa, idModulo, idTipoMovimientoModulo);
			tipoDocumento=tipoDocumentoLogic.getTipoDocumento();
					
			if(tipoDocumento!=null && tipoDocumento.getId()>0){ 
				secuencial.setid_tipo_documento(tipoDocumento.getId());
				secuencial.setid_tipo_movimiento(tipoDocumento.getid_tipo_movimiento());
				secuencial.setid_tipo_movimiento_modulo(tipoDocumento.getid_tipo_movimiento_modulo());
			} else {
				countNoExiste++;
				stringBuilderNoExiste.append("\r\n,TIPO DOCUMENTO:EMPRESA="+idEmpresa+",MODULO="+idModulo+",MOVIMIENTO MODULO="+idTipoMovimientoModulo);
				
				continue;
			}
			
			secuencial.setnumero_asiento(Long.parseLong(saesecu2.getsecu_asi_comp()));
			secuencial.setnumero_asiento_formato(saesecu2.getsecu_asi_comp());			
			secuencial.setnumero_ingreso(Long.parseLong(saesecu2.getsecu_ing_comp()));
			secuencial.setnumero_ingreso_formato(saesecu2.getsecu_ing_comp());
			secuencial.setnumero_egreso(Long.parseLong(saesecu2.getsecu_egr_comp()));
			secuencial.setnumero_egreso_formato(saesecu2.getsecu_egr_comp());
			secuencial.setnumero_diario(Long.parseLong(saesecu2.getsecu_dia_comp()));
			secuencial.setnumero_diario_formato(saesecu2.getsecu_dia_comp());
			secuencial.setnumero_retencion_fuente(Long.parseLong(saesecu2.getsecu_ret_fuen().toString()));
			secuencial.setnumero_retencion_fuente_formato(saesecu2.getsecu_ret_fuen().toString());
			secuencial.setnumero_retencion_iva(Long.parseLong(saesecu2.getsecu_ret_iva().toString()));
			secuencial.setnumero_retencion_iva_formato(saesecu2.getsecu_ret_iva().toString());
			
			secuencialLogic.getSecuencials().add(secuencial);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//secuencialLogic.saveSecuencialsWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	    
	    /*ERROR:(Se lo agrego manual)
		NO EXISTE (2) 
		IMPORTACIONES-INVENTARIOS
		FACTURACION-VENTAS
		*/
	}
	
	public static void TipoDocumento(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetidu saetidu=new saetidu();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoDocumento();

		
		List<saetidu> saetidus = new  ArrayList<saetidu>();				
		
		saetidus=saetidu.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetidus.size();
		
		
		TipoDocumentoLogic tipoDocumentoModuloLogic=new TipoDocumentoLogic();
		TipoDocumento tipoDocumento= new TipoDocumento();
		
		TipoMovimientoModuloLogic tipoMovimientoModuloModuloLogic=new TipoMovimientoModuloLogic();
		TipoMovimientoModulo tipoMovimientoModulo= new TipoMovimientoModulo();
		
		Long idModulo=0L;
		Long idTipoMovimiento=0L;
		String tidu_des_tidu="";
		int count=1;
		
		int countNoExiste=0;
		StringBuilder stringBuilderNoExiste=new StringBuilder();
		
		for(saetidu saetidu2:saetidus) {			
			//CON EL PRIMERO NO HACER
			if(count==1) {
				count++;
				continue;
			}
			
			//tidu_des_tidu=saetidu2.gettidu_des_tidu().trim().replace(" - ", "-");
			tidu_des_tidu=GetFormatoNombreTipoDocumento(saetidu2.gettidu_des_tidu());
			
			System.out.println(tidu_des_tidu);
			
			tipoDocumento= new TipoDocumento();
			
			tipoDocumento.setid_empresa(LID_EMPRESA_DEFECTO);
			
			idModulo=ProcessMigration.GetConstantModulo(saetidu2.gettidu_cod_modu());
			tipoDocumento.setid_modulo(idModulo);
			
			idTipoMovimiento=ProcessMigration.GetConstantTipoMovimiento(saetidu2.gettidu_tip_tidu());
			tipoDocumento.setid_tipo_movimiento(idTipoMovimiento);
			
			tipoMovimientoModuloModuloLogic.getTipoMovimientoModuloPorIdModuloPorCodigoWithConnection(idModulo, tidu_des_tidu);
			tipoMovimientoModulo=tipoMovimientoModuloModuloLogic.getTipoMovimientoModulo();
					
			if(tipoMovimientoModulo!=null && tipoMovimientoModulo.getId()>0){ 
				tipoDocumento.setid_tipo_movimiento_modulo(tipoMovimientoModulo.getId());
			} else {
				//throw new Exception("NO EXISTE TIPO MOVIMIENTO MODULO:");
				countNoExiste++;
				stringBuilderNoExiste.append(","+tidu_des_tidu);
				
				continue;
			}
			
			tipoDocumento.setnombre(tidu_des_tidu);
			tipoDocumento.setes_defecto(false);
			tipoDocumento.setes_mayor(false);
			tipoDocumentoModuloLogic.getTipoDocumentos().add(tipoDocumento);
		}
		
		if(stringBuilderNoExiste.length() >0) {						
			System.out.println("NO EXISTE("+countNoExiste+"):"+stringBuilderNoExiste.toString());
		}
		
		//tipoDocumentoModuloLogic.saveTipoDocumentosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	    
	    /*ERROR:(Se lo agrego manual)
		NO EXISTE (2) 
		IMPORTACIONES-INVENTARIOS
		FACTURACION-VENTAS
		*/
	}		
	
	public static void TipoMovimientoModulo(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saetidu saetidu=new saetidu();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery=GetFinalTipoDocumento();

		
		List<saetidu> saetidus = new  ArrayList<saetidu>();				
		
		saetidus=saetidu.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
				
		
		iTotal=saetidus.size();
		
		
		TipoMovimientoModuloLogic tipoModiviemtoModuloLogic=new TipoMovimientoModuloLogic();
		TipoMovimientoModulo tipomovimientomodulo= new TipoMovimientoModulo();
		
		Long idManual=0L;
		String tidu_des_tidu="";
		
		for(saetidu saetidu2:saetidus) {
			idManual++;
			
			//tidu_des_tidu=saetidu2.gettidu_des_tidu().trim().replace(" - ", "-");
			tidu_des_tidu=GetFormatoNombreTipoDocumento(saetidu2.gettidu_des_tidu());
			
			System.out.println(tidu_des_tidu);
			
			tipomovimientomodulo= new TipoMovimientoModulo();
			
			tipomovimientomodulo.setId(idManual);
			tipomovimientomodulo.setid_modulo(ProcessMigration.GetConstantModulo(saetidu2.gettidu_cod_modu()));
			tipomovimientomodulo.setcodigo(tidu_des_tidu);
			tipomovimientomodulo.setnombre(tidu_des_tidu);
			
			tipoModiviemtoModuloLogic.getTipoMovimientoModulos().add(tipomovimientomodulo);
		}
		
		tipoModiviemtoModuloLogic.saveTipoMovimientoModulosWithConnection();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}
	
	//CONTSTANTE
	public static Long GetConstantRegion(Integer iTipoTransaccion) throws SQLException, Exception{
		Long idModulo=1L;
		
		
		
			switch(iTipoTransaccion){ 
				case 1:
						idModulo=1L;
					   break;
				case 2: 
						idModulo=2L;
						break;		
						
				case 3: 
					idModulo=3L;
					break;	
					
				case 4: 
					idModulo=4L;
					break;	
					
				case 5: 
					idModulo=5L;
					break;	
					
				case 6: 
					idModulo=2L;
					break;	
									
				default: idModulo=0L;
			};
		
		
		return idModulo;
		
	}
	
	public static Long GetConstantContinente(Integer iTipoTransaccion) throws SQLException, Exception{
		Long idModulo=1L;
		
		
		
			switch(iTipoTransaccion){ 
				case 1:
						idModulo=1L;
					   break;
				case 2: 
						idModulo=2L;
						break;		
						
				case 3: 
					idModulo=3L;
					break;	
					
				case 4: 
					idModulo=4L;
					break;	
					
				case 11: 
					idModulo=5L;
					break;	
					
				case 12: 
					idModulo=6L;
					break;	
					
				case 13: 
					idModulo=1L;
					break;	
					
				default: idModulo=0L;
			};
		
		
		return idModulo;
		
	}
	
	public static Long GetConstantTipoTransaccion(String sTipoTransaccion) throws SQLException, Exception{
		Long idModulo=1L;
		
		
		if(sTipoTransaccion!=null && !sTipoTransaccion.equals("")) {
			sTipoTransaccion=sTipoTransaccion.trim();						
		
			switch(sTipoTransaccion){ 
				case "CR":
						idModulo=2L;
					   break;
				case "DB": 
						idModulo=1L;
						break;		
						
				default: idModulo=0L;
			};
		} else {
			idModulo=0L;
		}
		
		return idModulo;
		
	}
	
	public static Long GetConstantTipoMovimiento(String sTipoMovimiento) throws SQLException, Exception{
		sTipoMovimiento=sTipoMovimiento.trim();
		
		Long idModulo=1L;
		
		switch(sTipoMovimiento){ 
			case "DI":
					idModulo=1L;
				   break;
			case "IN": 
					idModulo=2L;
					break;
			case "EG": 
					idModulo=3L;
					break; 														
			default: idModulo=1L;
		};
		
		return idModulo;
		
	}
	
	public static Long GetConstantModulo(Integer idModuloAnt) throws SQLException, Exception{
		Long idModulo=1L;
		
		if(idModuloAnt!=null) {
			switch(idModuloAnt){ 
				case 11:idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_ACTIVOS_FIJOS;
					   break;
				case 91: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_COMISIONES;
						break;
				case 1: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_CONTABILIDAD;
						break; 
				case 3: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR;
						break; 				
				case 4: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR;
						break; 
				case 7: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_FACTURACION;
						break; 
				case 10: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_INVENTARIO;
						break; 
				case 2: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_NOMINA;
						break; 
				case 6: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_PRODUCCION;
						break; 
				case 58: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_PROYECTOS;
						break; 
				case 17: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_PUNTO_VENTA;
						break; 
				case 15: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_SEGURIDAD;
						break; 
				case 23: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_SRI;
						break; 
				case 5: 
						idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_TESORERIA;
						break; 
			
				case 18: 
					idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_IMPORTACIONES;
					break; 
					
				case 20: 
					idModulo=ModuloConstantesFuncionesAdditional.LID_MODULO_GERENCIAL;
					break; 
					
				default: idModulo=1L;
			};
		} else {
			idModuloAnt=null;
		}
		
		return idModulo;		
	}
	
	public static Long GetConstantTipoGrupoFormaPago(String sTipoGrupo) throws SQLException, Exception{
		Long idModulo=0L;
		
		if(sTipoGrupo!=null) {
			switch(sTipoGrupo){ 
				case "EFE": 
							idModulo=1L;
					   		break;
				case "CRE": 
							idModulo=4L;
							break;
				case "S": 
							idModulo=5L;
							break;
					
				default: idModulo=0L;
			};
		}
		
		return idModulo;		
	}
	
	public static Long GetConstantEjercicio(Integer idEjercicioAnt) throws SQLException, Exception{
		Long idEjercicio=LID_EJERCICIO_DEFECTO;
		
		switch(idEjercicioAnt){ 
			case 23:idEjercicio=LID_EJERCICIO_DEFECTO;
				    break;			
				
			default: idEjercicio=LID_EJERCICIO_DEFECTO;
		};
		
		return idEjercicio;		
	}
	
	public static Long GetConstantTipoMovimientoModulo(String sTipoMovimientoModuloAnt) throws SQLException, Exception{
		Long idTipoMovimientoModulo=1L;
		
		sTipoMovimientoModuloAnt=sTipoMovimientoModuloAnt.trim();
		
		switch(sTipoMovimientoModuloAnt){ 
			case "001": idTipoMovimientoModulo=1L;
						break;			
			case "011": idTipoMovimientoModulo=25L;
						break;
			case "016": idTipoMovimientoModulo=6L;
						break;
			case "021": idTipoMovimientoModulo=9L;
						break;
			case "027": idTipoMovimientoModulo=13L;
						break;
			case "026": idTipoMovimientoModulo=12L;
						break;
			case "028": idTipoMovimientoModulo=11L;
						break;
			case "002": idTipoMovimientoModulo=3L;
						break;
			case "003": idTipoMovimientoModulo=2L;
						break;
			case "006": idTipoMovimientoModulo=17L;
						break;
			case "007": idTipoMovimientoModulo=20L;
						break;
			case "008": idTipoMovimientoModulo=16L;
						break;
			case "009": idTipoMovimientoModulo=19L;
						break;
			case "010": idTipoMovimientoModulo=18L;
						break;
			case "012": idTipoMovimientoModulo=15L;
						break;
			case "017": idTipoMovimientoModulo=7L;
						break;
			case "018": idTipoMovimientoModulo=5L;
						break;
			case "029": idTipoMovimientoModulo=10L;
						break;
			case "031": idTipoMovimientoModulo=24L;
						break;
			case "036": idTipoMovimientoModulo=4L;
						break;
			case "041": idTipoMovimientoModulo=21L;
						break;
			case "046": idTipoMovimientoModulo=22L;
						break;
			case "047": idTipoMovimientoModulo=23L;
						break;
			case "051": idTipoMovimientoModulo=14L;
						break;
			case "019": idTipoMovimientoModulo=5L;
						break;
			
			default: idTipoMovimientoModulo=1L;
		};
		
		return idTipoMovimientoModulo;		
	}
		
	public static String GetReplaceStringGeneral(String sCadena) throws SQLException, Exception{
		String sCadenaFinal="";
		
		sCadenaFinal=sCadena;
		
		sCadenaFinal=sCadenaFinal.replace("�", "N");
		sCadenaFinal=sCadenaFinal.replace("�", "n");
		sCadenaFinal=sCadenaFinal.replace("�", "E");
		sCadenaFinal=sCadenaFinal.replace("�", "A");
		sCadenaFinal=sCadenaFinal.replace("�", "o");
		
		return sCadenaFinal;
	}
	
	public static 	Long LID_EMPRESA_DEFECTO=1L;
	public static 	Long LID_SUCURSAL_DEFECTO=1L;
	public static 	Long LID_EJERCICIO_DEFECTO=1L;
	public static 	Long LID_ANIO_DEFECTO=2013L;
	//CONTSTANTE_FIN
	
	//FORMATO	
	public static String GetFormatoNombreFormato(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoParametroFormularioIva(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static Long GetFormatoCodigoTipoParametroFormularioIva(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	
	public static String GetFormatoNombreTipoLineaFlujoCaja(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static Long GetFormatoCodigoTipoLineaFlujoCaja(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.trim();			
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoRetencion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static Long GetFormatoCodigoTipoRetencion(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		if(sNombreTipoDocumentoOrig!=null) {
			if(sNombreTipoDocumentoOrig.contains("R")) {
				sNombreTipoDocumentoOrig=sNombreTipoDocumentoOrig.replace("R", "9");
			}
			
			sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		}
		
		return sNombreTipoDocumento;
	}
	
	public static Long GetFormatoCodigoTipoComprobante(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		Long sNombreTipoDocumento=0L;
		
		sNombreTipoDocumento=Long.parseLong(sNombreTipoDocumentoOrig);
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoComprobante(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim();
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoDocumento(String sNombreTipoDocumentoOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoDocumentoOrig.trim().replace(" - ", "-");
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoNombreTipoTransaccionModulo(String sNombreTipoTransaccionOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sNombreTipoTransaccionOrig.trim().replace("GYE", "").trim();
		
		return sNombreTipoDocumento;
	}
	
	public static String GetFormatoSiglasTipoTransaccionModulo(String sSiglasTipoTransaccionOrig) throws SQLException, Exception{
		String sNombreTipoDocumento="";
		
		sNombreTipoDocumento=sSiglasTipoTransaccionOrig.trim();
		
		return sNombreTipoDocumento;
	}
	//FORMATO_FIN
	
	//FINAL	
	public static String GetFinalFormato() throws SQLException, Exception{
		String sFinal=" where ftrn_cod_empr=1 ";		
		return sFinal;
	}
	
	public static String GetFinalTipoParametroFormularioIva() throws SQLException, Exception{
		String sFinal="  where tiva_cod_empr=1";		
		return sFinal;
	}
	
	public static String GetFinalTipoLineaFlujoCaja() throws SQLException, Exception{
		String sFinal="  where cact_cod_empr=1";		
		return sFinal;
	}
	
	public static String GetFinalTipoRetencion() throws SQLException, Exception{
		String sFinal="  where tret_cod_empr=1";		
		return sFinal;
	}
	
	public static String GetFinalTipoTransaccion() throws SQLException, Exception{
		String sFinal="  where tran_cod_empr=1 and tran_cod_sucu=1";		
		return sFinal;
	}
	
	public static String GetFinalTipoDocumento() throws SQLException, Exception{
		String sFinal=" where tidu_cod_empr=1 order by tidu_cod_modu";		
		return sFinal;
	}
	
	public static String GetFinalSecuencial() throws SQLException, Exception{
		String sFinal=" where secu_cod_empr=1 and secu_cod_sucu=1 and secu_cod_ejer=23";		
		return sFinal;
	}
	//FINAL_FIN
}
