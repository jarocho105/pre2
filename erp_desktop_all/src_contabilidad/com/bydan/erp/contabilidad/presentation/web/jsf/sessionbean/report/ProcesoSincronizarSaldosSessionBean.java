/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoSincronizarSaldosSessionBean  extends ProcesoSincronizarSaldosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos;
	protected Long lIdProcesoSincronizarSaldosActualForeignKey;	
	
	protected Long lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras;
	protected String sUltimaBusquedaProcesoSincronizarSaldos;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	
	private Long id;
	private Long id_ejercicio;
	private Long id_periodo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoSincronizarSaldosSessionBeanAdditional procesosincronizarsaldosSessionBeanAdditional=null;
	
	public ProcesoSincronizarSaldosSessionBeanAdditional getProcesoSincronizarSaldosSessionBeanAdditional() {
		return this.procesosincronizarsaldosSessionBeanAdditional;
	}
	
	public void setProcesoSincronizarSaldosSessionBeanAdditional(ProcesoSincronizarSaldosSessionBeanAdditional procesosincronizarsaldosSessionBeanAdditional) {
		try {
			this.procesosincronizarsaldosSessionBeanAdditional=procesosincronizarsaldosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoSincronizarSaldosSessionBean () {
		this.inicializarProcesoSincronizarSaldosSessionBean();
	}
	
	public void inicializarProcesoSincronizarSaldosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos=false;
		this.lIdProcesoSincronizarSaldosActualForeignKey=0L;
		this.lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoSincronizarSaldos ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:table-row;width:20%;height:800px;visibility:visible";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";		
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L; 
		
		
		
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
		
		
		
		
		
    } 
	
	public void setPaginaPopupVariables(Boolean isPopupVariables) { 		
		if(isPopupVariables) {
			if(!this.isPaginaPopup) {
				this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
				this.sStyleDivContent="height:800px;width:100%";;
				this.sStyleDivOpcionesBanner="display:none";
				this.sStyleDivExpandirColapsar="display:none";
				this.isPaginaPopup=true;
			}
		} else {
			if(this.isPaginaPopup) {
				this.sStyleDivArbol="display:table-row;width:15%;height:600px;visibility:visible;overflow:auto;";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos= isPermiteNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoSincronizarSaldos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos= isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldos;
	}
					
	public Long getlIdProcesoSincronizarSaldosActualForeignKey() {
		return lIdProcesoSincronizarSaldosActualForeignKey;
	}

	public void setlIdProcesoSincronizarSaldosActualForeignKey(
			Long lIdProcesoSincronizarSaldosActualForeignKey) {
		this.lIdProcesoSincronizarSaldosActualForeignKey = lIdProcesoSincronizarSaldosActualForeignKey;
	}
				    
	public Long getlIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras() {
		return lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras(
			Long lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras = lIdProcesoSincronizarSaldosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoSincronizarSaldosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoSincronizarSaldos() {
		return sUltimaBusquedaProcesoSincronizarSaldos;
	}

	public void setsUltimaBusquedaProcesoSincronizarSaldos(String sUltimaBusquedaProcesoSincronizarSaldos) {
		this.sUltimaBusquedaProcesoSincronizarSaldos = sUltimaBusquedaProcesoSincronizarSaldos;
	}
	
	public String getsServletGenerarHtmlReporte() {
		return sServletGenerarHtmlReporte;
	}

	public void setsServletGenerarHtmlReporte(String sServletGenerarHtmlReporte) {
		this.sServletGenerarHtmlReporte = sServletGenerarHtmlReporte;
	}
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	public String getsPathNavegacionActual() {
		return this.sPathNavegacionActual;
	}

	public void setsPathNavegacionActual(String sPathNavegacionActual) {
		this.sPathNavegacionActual = sPathNavegacionActual;
	}
	
	public Boolean getisPaginaPopup() {
		return this.isPaginaPopup;
	}

	public void setisPaginaPopup(Boolean isPaginaPopup) {
		this.isPaginaPopup = isPaginaPopup;
	}	
	
	public String getsStyleDivArbol() {
		return this.sStyleDivArbol;
	}

	public void setsStyleDivArbol(String sStyleDivArbol) {
		this.sStyleDivArbol = sStyleDivArbol;
	}
	
	public String getsStyleDivContent() {
		return this.sStyleDivContent;
	}

	public void setsStyleDivContent(String sStyleDivContent) {
		this.sStyleDivContent = sStyleDivContent;
	}
	
	public String getsStyleDivOpcionesBanner() {
		return this.sStyleDivOpcionesBanner;
	}

	public void setsStyleDivOpcionesBanner(String sStyleDivOpcionesBanner) {
		this.sStyleDivOpcionesBanner = sStyleDivOpcionesBanner;
	}	
	
	public String getsStyleDivExpandirColapsar() {
		return this.sStyleDivExpandirColapsar;
	}

	public void setsStyleDivExpandirColapsar(String sStyleDivExpandirColapsar) {
		this.sStyleDivExpandirColapsar = sStyleDivExpandirColapsar;
	}		
	
	public String getsFuncionBusquedaRapida() {
		return this.sFuncionBusquedaRapida;
	}

	public void setsFuncionBusquedaRapida(String sFuncionBusquedaRapida) {
		this.sFuncionBusquedaRapida = sFuncionBusquedaRapida;
	}
	
	public Boolean getConGuardarRelaciones() {
		return this.conGuardarRelaciones;
	}

	public void setConGuardarRelaciones(Boolean conGuardarRelaciones) {
		this.conGuardarRelaciones = conGuardarRelaciones;
	}	
	
	public Boolean getEstaModoGuardarRelaciones() {
		return this.estaModoGuardarRelaciones;
	}

	public void setEstaModoGuardarRelaciones(Boolean estaModoGuardarRelaciones) {
		this.estaModoGuardarRelaciones = estaModoGuardarRelaciones;
	}	
	
	public Boolean getEsGuardarRelacionado() {
		return this.esGuardarRelacionado;
	}

	public void setEsGuardarRelacionado(Boolean esGuardarRelacionado) {
		this.esGuardarRelacionado = esGuardarRelacionado;
	}	
	
	public Boolean getEstaModoBusqueda() {
		return this.estaModoBusqueda;
	}

	public void setEstaModoBusqueda(Boolean estaModoBusqueda) {
		this.estaModoBusqueda = estaModoBusqueda;
	}
	
	public Boolean getNoMantenimiento() {
		return this.noMantenimiento;
	}

	public void setNoMantenimiento(Boolean noMantenimiento) {
		this.noMantenimiento = noMantenimiento;
	}
	
    
	public Long getid() {
		return this.id;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoSincronizarSaldos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoSincronizarSaldos:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoSincronizarSaldos:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
	}
	
	
		
	
}
