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
public class ComisionPenaSessionBean  extends ComisionPenaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionPena;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionPena;
	protected Long lIdComisionPenaActualForeignKey;	
	
	protected Long lIdComisionPenaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras;
	protected String sUltimaBusquedaComisionPena;
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
	Boolean isBusquedaDesdeForeignKeySesionComisionConfig;
	Long lidComisionConfigActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_comision_config;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ComisionPenaSessionBeanAdditional comisionpenaSessionBeanAdditional=null;
	
	public ComisionPenaSessionBeanAdditional getComisionPenaSessionBeanAdditional() {
		return this.comisionpenaSessionBeanAdditional;
	}
	
	public void setComisionPenaSessionBeanAdditional(ComisionPenaSessionBeanAdditional comisionpenaSessionBeanAdditional) {
		try {
			this.comisionpenaSessionBeanAdditional=comisionpenaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ComisionPenaSessionBean () {
		this.inicializarComisionPenaSessionBean();
	}
	
	public void inicializarComisionPenaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionPena=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionPena=false;
		this.lIdComisionPenaActualForeignKey=0L;
		this.lIdComisionPenaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras=false;
		this.sUltimaBusquedaComisionPena ="";
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
		isBusquedaDesdeForeignKeySesionComisionConfig=false;
		lidComisionConfigActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_comision_config=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeComisionPena() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeComisionPena;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeComisionPena(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionPena) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionPena= isPermiteNavegacionHaciaForeignKeyDesdeComisionPena;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena(String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena = sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionPena() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionPena;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionPena(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionPena) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionPena= isBusquedaDesdeForeignKeySesionForeignKeyComisionPena;
	}
					
	public Long getlIdComisionPenaActualForeignKey() {
		return lIdComisionPenaActualForeignKey;
	}

	public void setlIdComisionPenaActualForeignKey(
			Long lIdComisionPenaActualForeignKey) {
		this.lIdComisionPenaActualForeignKey = lIdComisionPenaActualForeignKey;
	}
				    
	public Long getlIdComisionPenaActualForeignKeyParaPosibleAtras() {
		return lIdComisionPenaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdComisionPenaActualForeignKeyParaPosibleAtras(
			Long lIdComisionPenaActualForeignKeyParaPosibleAtras) {
		this.lIdComisionPenaActualForeignKeyParaPosibleAtras = lIdComisionPenaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyComisionPenaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaComisionPena() {
		return sUltimaBusquedaComisionPena;
	}

	public void setsUltimaBusquedaComisionPena(String sUltimaBusquedaComisionPena) {
		this.sUltimaBusquedaComisionPena = sUltimaBusquedaComisionPena;
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
    
	public Long getid_comision_config() {
		return this.id_comision_config;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionPena:Valor nulo no permitido en columna id");
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
						System.out.println("ComisionPena:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_comision_config(Long newid_comision_config)throws Exception
	{
		try {
			if(this.id_comision_config!=newid_comision_config) {
				if(newid_comision_config==null) {
					//newid_comision_config=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionPena:Valor nulo no permitido en columna id_comision_config");
					}
				}

				this.id_comision_config=newid_comision_config;
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
	public Boolean getisBusquedaDesdeForeignKeySesionComisionConfig() {
		return isBusquedaDesdeForeignKeySesionComisionConfig;
	}

	public void setisBusquedaDesdeForeignKeySesionComisionConfig(
		Boolean isBusquedaDesdeForeignKeySesionComisionConfig) {
		this.isBusquedaDesdeForeignKeySesionComisionConfig = isBusquedaDesdeForeignKeySesionComisionConfig;
	}

	public Long getlidComisionConfigActual() {
		return lidComisionConfigActual;
	}

	public void setlidComisionConfigActual(Long lidComisionConfigActual) {
		this.lidComisionConfigActual = lidComisionConfigActual;
	}
	
	
		
	
}
