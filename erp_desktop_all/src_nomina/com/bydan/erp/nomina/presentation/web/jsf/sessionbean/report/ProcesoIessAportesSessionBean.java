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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoIessAportesSessionBean  extends ProcesoIessAportesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes;
	protected Long lIdProcesoIessAportesActualForeignKey;	
	
	protected Long lIdProcesoIessAportesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras;
	protected String sUltimaBusquedaProcesoIessAportes;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	Long lidTipoAfiliacionActual;
	Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal;
	Long lidNumeroPatronalActual;
	
	private Long id;
	private Long id_anio;
	private Long id_mes;
	private Long id_tipo_afiliacion;
	private Long id_numero_patronal;
	private Double porcentaje;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoIessAportesSessionBeanAdditional procesoiessaportesSessionBeanAdditional=null;
	
	public ProcesoIessAportesSessionBeanAdditional getProcesoIessAportesSessionBeanAdditional() {
		return this.procesoiessaportesSessionBeanAdditional;
	}
	
	public void setProcesoIessAportesSessionBeanAdditional(ProcesoIessAportesSessionBeanAdditional procesoiessaportesSessionBeanAdditional) {
		try {
			this.procesoiessaportesSessionBeanAdditional=procesoiessaportesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoIessAportesSessionBean () {
		this.inicializarProcesoIessAportesSessionBean();
	}
	
	public void inicializarProcesoIessAportesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes=false;
		this.lIdProcesoIessAportesActualForeignKey=0L;
		this.lIdProcesoIessAportesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoIessAportes ="";
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
		
		
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAfiliacion=false;
		lidTipoAfiliacionActual=0L;
		isBusquedaDesdeForeignKeySesionNumeroPatronal=false;
		lidNumeroPatronalActual=0L; 
		
		
		
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_tipo_afiliacion=-1L;
 		this.id_numero_patronal=-1L;
 		this.porcentaje=0.0;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes= isPermiteNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoIessAportes;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes= isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportes;
	}
					
	public Long getlIdProcesoIessAportesActualForeignKey() {
		return lIdProcesoIessAportesActualForeignKey;
	}

	public void setlIdProcesoIessAportesActualForeignKey(
			Long lIdProcesoIessAportesActualForeignKey) {
		this.lIdProcesoIessAportesActualForeignKey = lIdProcesoIessAportesActualForeignKey;
	}
				    
	public Long getlIdProcesoIessAportesActualForeignKeyParaPosibleAtras() {
		return lIdProcesoIessAportesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoIessAportesActualForeignKeyParaPosibleAtras(
			Long lIdProcesoIessAportesActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoIessAportesActualForeignKeyParaPosibleAtras = lIdProcesoIessAportesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoIessAportesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoIessAportes() {
		return sUltimaBusquedaProcesoIessAportes;
	}

	public void setsUltimaBusquedaProcesoIessAportes(String sUltimaBusquedaProcesoIessAportes) {
		this.sUltimaBusquedaProcesoIessAportes = sUltimaBusquedaProcesoIessAportes;
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
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_tipo_afiliacion() {
		return this.id_tipo_afiliacion;
	}
    
	public Long getid_numero_patronal() {
		return this.id_numero_patronal;
	}
    
	public Double getporcentaje() {
		return this.porcentaje;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoIessAportes:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_tipo_afiliacion(Long newid_tipo_afiliacion)throws Exception
	{
		try {
			if(this.id_tipo_afiliacion!=newid_tipo_afiliacion) {
				if(newid_tipo_afiliacion==null) {
					//newid_tipo_afiliacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoIessAportes:Valor nulo no permitido en columna id_tipo_afiliacion");
					}
				}

				this.id_tipo_afiliacion=newid_tipo_afiliacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_numero_patronal(Long newid_numero_patronal)throws Exception
	{
		try {
			if(this.id_numero_patronal!=newid_numero_patronal) {
				if(newid_numero_patronal==null) {
					//newid_numero_patronal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoIessAportes:Valor nulo no permitido en columna id_numero_patronal");
					}
				}

				this.id_numero_patronal=newid_numero_patronal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setporcentaje(Double newporcentaje)throws Exception
	{
		try {
			if(this.porcentaje!=newporcentaje) {
				if(newporcentaje==null) {
					//newporcentaje=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoIessAportes:Valor nulo no permitido en columna porcentaje");
					}
				}

				this.porcentaje=newporcentaje;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAfiliacion() {
		return isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAfiliacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoAfiliacion) {
		this.isBusquedaDesdeForeignKeySesionTipoAfiliacion = isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	}

	public Long getlidTipoAfiliacionActual() {
		return lidTipoAfiliacionActual;
	}

	public void setlidTipoAfiliacionActual(Long lidTipoAfiliacionActual) {
		this.lidTipoAfiliacionActual = lidTipoAfiliacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionNumeroPatronal() {
		return isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public void setisBusquedaDesdeForeignKeySesionNumeroPatronal(
		Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal) {
		this.isBusquedaDesdeForeignKeySesionNumeroPatronal = isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public Long getlidNumeroPatronalActual() {
		return lidNumeroPatronalActual;
	}

	public void setlidNumeroPatronalActual(Long lidNumeroPatronalActual) {
		this.lidNumeroPatronalActual = lidNumeroPatronalActual;
	}
	
	
		
	
}
