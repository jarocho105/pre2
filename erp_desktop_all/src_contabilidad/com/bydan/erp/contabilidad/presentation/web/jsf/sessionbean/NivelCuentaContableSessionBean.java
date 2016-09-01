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
public class NivelCuentaContableSessionBean  extends NivelCuentaContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable;
	protected Long lIdNivelCuentaContableActualForeignKey;	
	
	protected Long lIdNivelCuentaContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras;
	protected String sUltimaBusquedaNivelCuentaContable;
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
	
	private Long id;
	private Long id_empresa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected NivelCuentaContableSessionBeanAdditional nivelcuentacontableSessionBeanAdditional=null;
	
	public NivelCuentaContableSessionBeanAdditional getNivelCuentaContableSessionBeanAdditional() {
		return this.nivelcuentacontableSessionBeanAdditional;
	}
	
	public void setNivelCuentaContableSessionBeanAdditional(NivelCuentaContableSessionBeanAdditional nivelcuentacontableSessionBeanAdditional) {
		try {
			this.nivelcuentacontableSessionBeanAdditional=nivelcuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public NivelCuentaContableSessionBean () {
		this.inicializarNivelCuentaContableSessionBean();
	}
	
	public void inicializarNivelCuentaContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable=false;
		this.lIdNivelCuentaContableActualForeignKey=0L;
		this.lIdNivelCuentaContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras=false;
		this.sUltimaBusquedaNivelCuentaContable ="";
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
		
		
		
 		this.id_empresa=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable= isPermiteNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeNivelCuentaContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable= isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContable;
	}
					
	public Long getlIdNivelCuentaContableActualForeignKey() {
		return lIdNivelCuentaContableActualForeignKey;
	}

	public void setlIdNivelCuentaContableActualForeignKey(
			Long lIdNivelCuentaContableActualForeignKey) {
		this.lIdNivelCuentaContableActualForeignKey = lIdNivelCuentaContableActualForeignKey;
	}
				    
	public Long getlIdNivelCuentaContableActualForeignKeyParaPosibleAtras() {
		return lIdNivelCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdNivelCuentaContableActualForeignKeyParaPosibleAtras(
			Long lIdNivelCuentaContableActualForeignKeyParaPosibleAtras) {
		this.lIdNivelCuentaContableActualForeignKeyParaPosibleAtras = lIdNivelCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyNivelCuentaContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaNivelCuentaContable() {
		return sUltimaBusquedaNivelCuentaContable;
	}

	public void setsUltimaBusquedaNivelCuentaContable(String sUltimaBusquedaNivelCuentaContable) {
		this.sUltimaBusquedaNivelCuentaContable = sUltimaBusquedaNivelCuentaContable;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NivelCuentaContable:Valor nulo no permitido en columna id");
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
						System.out.println("NivelCuentaContable:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
	
	
		
	
}
