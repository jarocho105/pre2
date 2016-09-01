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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class BarrioSessionBean  extends BarrioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBarrio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBarrio;
	protected Long lIdBarrioActualForeignKey;	
	
	protected Long lIdBarrioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras;
	protected String sUltimaBusquedaBarrio;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCanton;
	Long lidCantonActual;
	Boolean isBusquedaDesdeForeignKeySesionParroquia;
	Long lidParroquiaActual;
	
	private Long id;
	private Long id_provincia;
	private Long id_canton;
	private Long id_parroquia;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BarrioSessionBeanAdditional barrioSessionBeanAdditional=null;
	
	public BarrioSessionBeanAdditional getBarrioSessionBeanAdditional() {
		return this.barrioSessionBeanAdditional;
	}
	
	public void setBarrioSessionBeanAdditional(BarrioSessionBeanAdditional barrioSessionBeanAdditional) {
		try {
			this.barrioSessionBeanAdditional=barrioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BarrioSessionBean () {
		this.inicializarBarrioSessionBean();
	}
	
	public void inicializarBarrioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBarrio=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBarrio=false;
		this.lIdBarrioActualForeignKey=0L;
		this.lIdBarrioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras=false;
		this.sUltimaBusquedaBarrio ="";
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
		
		
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCanton=false;
		lidCantonActual=0L;
		isBusquedaDesdeForeignKeySesionParroquia=false;
		lidParroquiaActual=0L; 
		
		
		
 		this.id_provincia=-1L;
 		this.id_canton=-1L;
 		this.id_parroquia=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBarrio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBarrio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBarrio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBarrio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBarrio= isPermiteNavegacionHaciaForeignKeyDesdeBarrio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio = sNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBarrio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBarrio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBarrio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBarrio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBarrio= isBusquedaDesdeForeignKeySesionForeignKeyBarrio;
	}
					
	public Long getlIdBarrioActualForeignKey() {
		return lIdBarrioActualForeignKey;
	}

	public void setlIdBarrioActualForeignKey(
			Long lIdBarrioActualForeignKey) {
		this.lIdBarrioActualForeignKey = lIdBarrioActualForeignKey;
	}
				    
	public Long getlIdBarrioActualForeignKeyParaPosibleAtras() {
		return lIdBarrioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBarrioActualForeignKeyParaPosibleAtras(
			Long lIdBarrioActualForeignKeyParaPosibleAtras) {
		this.lIdBarrioActualForeignKeyParaPosibleAtras = lIdBarrioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBarrioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBarrio() {
		return sUltimaBusquedaBarrio;
	}

	public void setsUltimaBusquedaBarrio(String sUltimaBusquedaBarrio) {
		this.sUltimaBusquedaBarrio = sUltimaBusquedaBarrio;
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
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_canton() {
		return this.id_canton;
	}
    
	public Long getid_parroquia() {
		return this.id_parroquia;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Barrio:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_provincia(Long newid_provincia)throws Exception
	{
		try {
			if(this.id_provincia!=newid_provincia) {
				if(newid_provincia==null) {
					//newid_provincia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Barrio:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
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
						System.out.println("Barrio:Valor nulo no permitido en columna id_canton");
					}
				}

				this.id_canton=newid_canton;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_parroquia(Long newid_parroquia)throws Exception
	{
		try {
			if(this.id_parroquia!=newid_parroquia) {
				if(newid_parroquia==null) {
					//newid_parroquia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Barrio:Valor nulo no permitido en columna id_parroquia");
					}
				}

				this.id_parroquia=newid_parroquia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionProvincia() {
		return isBusquedaDesdeForeignKeySesionProvincia;
	}

	public void setisBusquedaDesdeForeignKeySesionProvincia(
		Boolean isBusquedaDesdeForeignKeySesionProvincia) {
		this.isBusquedaDesdeForeignKeySesionProvincia = isBusquedaDesdeForeignKeySesionProvincia;
	}

	public Long getlidProvinciaActual() {
		return lidProvinciaActual;
	}

	public void setlidProvinciaActual(Long lidProvinciaActual) {
		this.lidProvinciaActual = lidProvinciaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionParroquia() {
		return isBusquedaDesdeForeignKeySesionParroquia;
	}

	public void setisBusquedaDesdeForeignKeySesionParroquia(
		Boolean isBusquedaDesdeForeignKeySesionParroquia) {
		this.isBusquedaDesdeForeignKeySesionParroquia = isBusquedaDesdeForeignKeySesionParroquia;
	}

	public Long getlidParroquiaActual() {
		return lidParroquiaActual;
	}

	public void setlidParroquiaActual(Long lidParroquiaActual) {
		this.lidParroquiaActual = lidParroquiaActual;
	}
	
	
		
	
}
