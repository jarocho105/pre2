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
public class ProcesoUtilidadesSessionBean  extends ProcesoUtilidadesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades;
	protected Long lIdProcesoUtilidadesActualForeignKey;	
	
	protected Long lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras;
	protected String sUltimaBusquedaProcesoUtilidades;
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
	
	private Long id;
	private Long id_anio;
	private Double valor;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoUtilidadesSessionBeanAdditional procesoutilidadesSessionBeanAdditional=null;
	
	public ProcesoUtilidadesSessionBeanAdditional getProcesoUtilidadesSessionBeanAdditional() {
		return this.procesoutilidadesSessionBeanAdditional;
	}
	
	public void setProcesoUtilidadesSessionBeanAdditional(ProcesoUtilidadesSessionBeanAdditional procesoutilidadesSessionBeanAdditional) {
		try {
			this.procesoutilidadesSessionBeanAdditional=procesoutilidadesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoUtilidadesSessionBean () {
		this.inicializarProcesoUtilidadesSessionBean();
	}
	
	public void inicializarProcesoUtilidadesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades=false;
		this.lIdProcesoUtilidadesActualForeignKey=0L;
		this.lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoUtilidades ="";
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
		
		
		
 		this.id_anio=null;
 		this.valor=0.0;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades= isPermiteNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoUtilidades;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades= isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidades;
	}
					
	public Long getlIdProcesoUtilidadesActualForeignKey() {
		return lIdProcesoUtilidadesActualForeignKey;
	}

	public void setlIdProcesoUtilidadesActualForeignKey(
			Long lIdProcesoUtilidadesActualForeignKey) {
		this.lIdProcesoUtilidadesActualForeignKey = lIdProcesoUtilidadesActualForeignKey;
	}
				    
	public Long getlIdProcesoUtilidadesActualForeignKeyParaPosibleAtras() {
		return lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoUtilidadesActualForeignKeyParaPosibleAtras(
			Long lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras = lIdProcesoUtilidadesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoUtilidadesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoUtilidades() {
		return sUltimaBusquedaProcesoUtilidades;
	}

	public void setsUltimaBusquedaProcesoUtilidades(String sUltimaBusquedaProcesoUtilidades) {
		this.sUltimaBusquedaProcesoUtilidades = sUltimaBusquedaProcesoUtilidades;
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
    
	public Double getvalor() {
		return this.valor;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoUtilidades:Valor nulo no permitido en columna id");
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
    
	public void setvalor(Double newvalor)throws Exception
	{
		try {
			if(this.valor!=newvalor) {
				if(newvalor==null) {
					//newvalor=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoUtilidades:Valor nulo no permitido en columna valor");
					}
				}

				this.valor=newvalor;
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
	
	
		
	
}
