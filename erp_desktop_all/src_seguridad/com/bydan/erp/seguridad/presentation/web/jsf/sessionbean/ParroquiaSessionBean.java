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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class ParroquiaSessionBean  extends ParroquiaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParroquia;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParroquia;
	protected Long lIdParroquiaActualForeignKey;	
	
	protected Long lIdParroquiaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras;
	protected String sUltimaBusquedaParroquia;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionCanton;
	Long lidCantonActual;
	
	private Long id;
	private Long id_canton;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParroquiaSessionBeanAdditional parroquiaSessionBeanAdditional=null;
	
	public ParroquiaSessionBeanAdditional getParroquiaSessionBeanAdditional() {
		return this.parroquiaSessionBeanAdditional;
	}
	
	public void setParroquiaSessionBeanAdditional(ParroquiaSessionBeanAdditional parroquiaSessionBeanAdditional) {
		try {
			this.parroquiaSessionBeanAdditional=parroquiaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParroquiaSessionBean () {
		this.inicializarParroquiaSessionBean();
	}
	
	public void inicializarParroquiaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParroquia=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParroquia=false;
		this.lIdParroquiaActualForeignKey=0L;
		this.lIdParroquiaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras=false;
		this.sUltimaBusquedaParroquia ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionCanton=false;
		lidCantonActual=0L; 
		
		
		
 		this.id_canton=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParroquia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParroquia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParroquia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParroquia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParroquia= isPermiteNavegacionHaciaForeignKeyDesdeParroquia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia = sNombrePaginaNavegacionHaciaForeignKeyDesdeParroquia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParroquia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParroquia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParroquia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParroquia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParroquia= isBusquedaDesdeForeignKeySesionForeignKeyParroquia;
	}
					
	public Long getlIdParroquiaActualForeignKey() {
		return lIdParroquiaActualForeignKey;
	}

	public void setlIdParroquiaActualForeignKey(
			Long lIdParroquiaActualForeignKey) {
		this.lIdParroquiaActualForeignKey = lIdParroquiaActualForeignKey;
	}
				    
	public Long getlIdParroquiaActualForeignKeyParaPosibleAtras() {
		return lIdParroquiaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParroquiaActualForeignKeyParaPosibleAtras(
			Long lIdParroquiaActualForeignKeyParaPosibleAtras) {
		this.lIdParroquiaActualForeignKeyParaPosibleAtras = lIdParroquiaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParroquiaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParroquia() {
		return sUltimaBusquedaParroquia;
	}

	public void setsUltimaBusquedaParroquia(String sUltimaBusquedaParroquia) {
		this.sUltimaBusquedaParroquia = sUltimaBusquedaParroquia;
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
    
	public Long getid_canton() {
		return this.id_canton;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Parroquia:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_canton(Long newid_canton)throws Exception
	{
		try {
			if(this.id_canton!=newid_canton) {
				if(newid_canton==null) {
					//newid_canton=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Parroquia:Valor nulo no permitido en columna id_canton");
					}
				}

				this.id_canton=newid_canton;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCanton() {
		return isBusquedaDesdeForeignKeySesionCanton;
	}

	public void setisBusquedaDesdeForeignKeySesionCanton(
		Boolean isBusquedaDesdeForeignKeySesionCanton) {
		this.isBusquedaDesdeForeignKeySesionCanton = isBusquedaDesdeForeignKeySesionCanton;
	}

	public Long getlidCantonActual() {
		return lidCantonActual;
	}

	public void setlidCantonActual(Long lidCantonActual) {
		this.lidCantonActual = lidCantonActual;
	}
	
	
		
	
}
