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
package com.bydan.erp.comisiones.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.comisiones.business.entity.*;

@SuppressWarnings("unused")
public class ComisionConfigSessionBean  extends ComisionConfigSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig;
	protected Long lIdComisionConfigActualForeignKey;	
	
	protected Long lIdComisionConfigActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras;
	protected String sUltimaBusquedaComisionConfig;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoComisionConfig;
	Long lidTipoComisionConfigActual;
	Boolean isBusquedaDesdeForeignKeySesionNivelLinea;
	Long lidNivelLineaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_comision_config;
	private Long id_nivel_linea;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ComisionConfigSessionBeanAdditional comisionconfigSessionBeanAdditional=null;
	
	public ComisionConfigSessionBeanAdditional getComisionConfigSessionBeanAdditional() {
		return this.comisionconfigSessionBeanAdditional;
	}
	
	public void setComisionConfigSessionBeanAdditional(ComisionConfigSessionBeanAdditional comisionconfigSessionBeanAdditional) {
		try {
			this.comisionconfigSessionBeanAdditional=comisionconfigSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ComisionConfigSessionBean () {
		this.inicializarComisionConfigSessionBean();
	}
	
	public void inicializarComisionConfigSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig=false;
		this.lIdComisionConfigActualForeignKey=0L;
		this.lIdComisionConfigActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras=false;
		this.sUltimaBusquedaComisionConfig ="";
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
		isBusquedaDesdeForeignKeySesionTipoComisionConfig=false;
		lidTipoComisionConfigActual=0L;
		isBusquedaDesdeForeignKeySesionNivelLinea=false;
		lidNivelLineaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_comision_config=-1L;
 		this.id_nivel_linea=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeComisionConfig() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeComisionConfig(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig= isPermiteNavegacionHaciaForeignKeyDesdeComisionConfig;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig(String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig = sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig= isBusquedaDesdeForeignKeySesionForeignKeyComisionConfig;
	}
					
	public Long getlIdComisionConfigActualForeignKey() {
		return lIdComisionConfigActualForeignKey;
	}

	public void setlIdComisionConfigActualForeignKey(
			Long lIdComisionConfigActualForeignKey) {
		this.lIdComisionConfigActualForeignKey = lIdComisionConfigActualForeignKey;
	}
				    
	public Long getlIdComisionConfigActualForeignKeyParaPosibleAtras() {
		return lIdComisionConfigActualForeignKeyParaPosibleAtras;
	}

	public void setlIdComisionConfigActualForeignKeyParaPosibleAtras(
			Long lIdComisionConfigActualForeignKeyParaPosibleAtras) {
		this.lIdComisionConfigActualForeignKeyParaPosibleAtras = lIdComisionConfigActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyComisionConfigParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaComisionConfig() {
		return sUltimaBusquedaComisionConfig;
	}

	public void setsUltimaBusquedaComisionConfig(String sUltimaBusquedaComisionConfig) {
		this.sUltimaBusquedaComisionConfig = sUltimaBusquedaComisionConfig;
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
    
	public Long getid_tipo_comision_config() {
		return this.id_tipo_comision_config;
	}
    
	public Long getid_nivel_linea() {
		return this.id_nivel_linea;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionConfig:Valor nulo no permitido en columna id");
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
						System.out.println("ComisionConfig:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_comision_config(Long newid_tipo_comision_config)throws Exception
	{
		try {
			if(this.id_tipo_comision_config!=newid_tipo_comision_config) {
				if(newid_tipo_comision_config==null) {
					//newid_tipo_comision_config=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionConfig:Valor nulo no permitido en columna id_tipo_comision_config");
					}
				}

				this.id_tipo_comision_config=newid_tipo_comision_config;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_nivel_linea(Long newid_nivel_linea)throws Exception
	{
		try {
			if(this.id_nivel_linea!=newid_nivel_linea) {
				if(newid_nivel_linea==null) {
					//newid_nivel_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionConfig:Valor nulo no permitido en columna id_nivel_linea");
					}
				}

				this.id_nivel_linea=newid_nivel_linea;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoComisionConfig() {
		return isBusquedaDesdeForeignKeySesionTipoComisionConfig;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoComisionConfig(
		Boolean isBusquedaDesdeForeignKeySesionTipoComisionConfig) {
		this.isBusquedaDesdeForeignKeySesionTipoComisionConfig = isBusquedaDesdeForeignKeySesionTipoComisionConfig;
	}

	public Long getlidTipoComisionConfigActual() {
		return lidTipoComisionConfigActual;
	}

	public void setlidTipoComisionConfigActual(Long lidTipoComisionConfigActual) {
		this.lidTipoComisionConfigActual = lidTipoComisionConfigActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionNivelLinea() {
		return isBusquedaDesdeForeignKeySesionNivelLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionNivelLinea(
		Boolean isBusquedaDesdeForeignKeySesionNivelLinea) {
		this.isBusquedaDesdeForeignKeySesionNivelLinea = isBusquedaDesdeForeignKeySesionNivelLinea;
	}

	public Long getlidNivelLineaActual() {
		return lidNivelLineaActual;
	}

	public void setlidNivelLineaActual(Long lidNivelLineaActual) {
		this.lidNivelLineaActual = lidNivelLineaActual;
	}
	
	
		
	
}
