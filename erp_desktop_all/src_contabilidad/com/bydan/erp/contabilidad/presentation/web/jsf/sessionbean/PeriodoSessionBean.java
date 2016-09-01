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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class PeriodoSessionBean  extends PeriodoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePeriodo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPeriodo;
	protected Long lIdPeriodoActualForeignKey;	
	
	protected Long lIdPeriodoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras;
	protected String sUltimaBusquedaPeriodo;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPeriodo;
	Long lidEstadoPeriodoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_anio;
	private Long id_ejercicio;
	private Long id_mes;
	private Long id_estado_periodo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PeriodoSessionBeanAdditional periodoSessionBeanAdditional=null;
	
	public PeriodoSessionBeanAdditional getPeriodoSessionBeanAdditional() {
		return this.periodoSessionBeanAdditional;
	}
	
	public void setPeriodoSessionBeanAdditional(PeriodoSessionBeanAdditional periodoSessionBeanAdditional) {
		try {
			this.periodoSessionBeanAdditional=periodoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PeriodoSessionBean () {
		this.inicializarPeriodoSessionBean();
	}
	
	public void inicializarPeriodoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePeriodo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPeriodo=false;
		this.lIdPeriodoActualForeignKey=0L;
		this.lIdPeriodoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras=false;
		this.sUltimaBusquedaPeriodo ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPeriodo=false;
		lidEstadoPeriodoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_anio=null;
 		this.id_ejercicio=-1L;
 		this.id_mes=-1L;
 		this.id_estado_periodo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePeriodo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePeriodo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePeriodo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePeriodo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePeriodo= isPermiteNavegacionHaciaForeignKeyDesdePeriodo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo(String sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo = sNombrePaginaNavegacionHaciaForeignKeyDesdePeriodo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPeriodo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPeriodo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPeriodo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPeriodo= isBusquedaDesdeForeignKeySesionForeignKeyPeriodo;
	}
					
	public Long getlIdPeriodoActualForeignKey() {
		return lIdPeriodoActualForeignKey;
	}

	public void setlIdPeriodoActualForeignKey(
			Long lIdPeriodoActualForeignKey) {
		this.lIdPeriodoActualForeignKey = lIdPeriodoActualForeignKey;
	}
				    
	public Long getlIdPeriodoActualForeignKeyParaPosibleAtras() {
		return lIdPeriodoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPeriodoActualForeignKeyParaPosibleAtras(
			Long lIdPeriodoActualForeignKeyParaPosibleAtras) {
		this.lIdPeriodoActualForeignKeyParaPosibleAtras = lIdPeriodoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPeriodoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPeriodo() {
		return sUltimaBusquedaPeriodo;
	}

	public void setsUltimaBusquedaPeriodo(String sUltimaBusquedaPeriodo) {
		this.sUltimaBusquedaPeriodo = sUltimaBusquedaPeriodo;
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
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_estado_periodo() {
		return this.id_estado_periodo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Periodo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa(Long newid_empresa)throws Exception
	{
		try {
			if(this.id_empresa!=newid_empresa) {
				if(newid_empresa==null) {
					//newid_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Periodo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Periodo:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes(Long newid_mes)throws Exception
	{
		try {
			if(this.id_mes!=newid_mes) {
				if(newid_mes==null) {
					//newid_mes=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Periodo:Valor nulo no permitido en columna id_mes");
					}
				}

				this.id_mes=newid_mes;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_periodo(Long newid_estado_periodo)throws Exception
	{
		try {
			if(this.id_estado_periodo!=newid_estado_periodo) {
				if(newid_estado_periodo==null) {
					//newid_estado_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Periodo:Valor nulo no permitido en columna id_estado_periodo");
					}
				}

				this.id_estado_periodo=newid_estado_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresa() {
		return isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionEmpresa) {
		this.isBusquedaDesdeForeignKeySesionEmpresa = isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public Long getlidEmpresaActual() {
		return lidEmpresaActual;
	}

	public void setlidEmpresaActual(Long lidEmpresaActual) {
		this.lidEmpresaActual = lidEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPeriodo() {
		return isBusquedaDesdeForeignKeySesionEstadoPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPeriodo) {
		this.isBusquedaDesdeForeignKeySesionEstadoPeriodo = isBusquedaDesdeForeignKeySesionEstadoPeriodo;
	}

	public Long getlidEstadoPeriodoActual() {
		return lidEstadoPeriodoActual;
	}

	public void setlidEstadoPeriodoActual(Long lidEstadoPeriodoActual) {
		this.lidEstadoPeriodoActual = lidEstadoPeriodoActual;
	}
	
	
		
	
}
