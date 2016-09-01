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
public class NumeroPatronalSessionBean  extends NumeroPatronalSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal;
	protected Long lIdNumeroPatronalActualForeignKey;	
	
	protected Long lIdNumeroPatronalActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras;
	protected String sUltimaBusquedaNumeroPatronal;
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
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCanton;
	Long lidCantonActual;
	Boolean isBusquedaDesdeForeignKeySesionParroquia;
	Long lidParroquiaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_provincia;
	private Long id_canton;
	private Long id_parroquia;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected NumeroPatronalSessionBeanAdditional numeropatronalSessionBeanAdditional=null;
	
	public NumeroPatronalSessionBeanAdditional getNumeroPatronalSessionBeanAdditional() {
		return this.numeropatronalSessionBeanAdditional;
	}
	
	public void setNumeroPatronalSessionBeanAdditional(NumeroPatronalSessionBeanAdditional numeropatronalSessionBeanAdditional) {
		try {
			this.numeropatronalSessionBeanAdditional=numeropatronalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public NumeroPatronalSessionBean () {
		this.inicializarNumeroPatronalSessionBean();
	}
	
	public void inicializarNumeroPatronalSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal=false;
		this.lIdNumeroPatronalActualForeignKey=0L;
		this.lIdNumeroPatronalActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras=false;
		this.sUltimaBusquedaNumeroPatronal ="";
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
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCanton=false;
		lidCantonActual=0L;
		isBusquedaDesdeForeignKeySesionParroquia=false;
		lidParroquiaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal= isPermiteNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal(String sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal = sNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroPatronal;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal= isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal;
	}
					
	public Long getlIdNumeroPatronalActualForeignKey() {
		return lIdNumeroPatronalActualForeignKey;
	}

	public void setlIdNumeroPatronalActualForeignKey(
			Long lIdNumeroPatronalActualForeignKey) {
		this.lIdNumeroPatronalActualForeignKey = lIdNumeroPatronalActualForeignKey;
	}
				    
	public Long getlIdNumeroPatronalActualForeignKeyParaPosibleAtras() {
		return lIdNumeroPatronalActualForeignKeyParaPosibleAtras;
	}

	public void setlIdNumeroPatronalActualForeignKeyParaPosibleAtras(
			Long lIdNumeroPatronalActualForeignKeyParaPosibleAtras) {
		this.lIdNumeroPatronalActualForeignKeyParaPosibleAtras = lIdNumeroPatronalActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronalParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaNumeroPatronal() {
		return sUltimaBusquedaNumeroPatronal;
	}

	public void setsUltimaBusquedaNumeroPatronal(String sUltimaBusquedaNumeroPatronal) {
		this.sUltimaBusquedaNumeroPatronal = sUltimaBusquedaNumeroPatronal;
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
						System.out.println("NumeroPatronal:Valor nulo no permitido en columna id");
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
						System.out.println("NumeroPatronal:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("NumeroPatronal:Valor nulo no permitido en columna id_provincia");
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
						System.out.println("NumeroPatronal:Valor nulo no permitido en columna id_canton");
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
						System.out.println("NumeroPatronal:Valor nulo no permitido en columna id_parroquia");
					}
				}

				this.id_parroquia=newid_parroquia;
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
