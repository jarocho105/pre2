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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class CuentaContaDetaGrupoActiSessionBean  extends CuentaContaDetaGrupoActiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi;
	protected Long lIdCuentaContaDetaGrupoActiActualForeignKey;	
	
	protected Long lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras;
	protected String sUltimaBusquedaCuentaContaDetaGrupoActi;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	Long lidDetalleGrupoActivoFijoActual;
	
	private Long id;
	private Long id_cuenta_contable;
	private Long id_detalle_grupo_activo_fijo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaContaDetaGrupoActiSessionBeanAdditional cuentacontadetagrupoactiSessionBeanAdditional=null;
	
	public CuentaContaDetaGrupoActiSessionBeanAdditional getCuentaContaDetaGrupoActiSessionBeanAdditional() {
		return this.cuentacontadetagrupoactiSessionBeanAdditional;
	}
	
	public void setCuentaContaDetaGrupoActiSessionBeanAdditional(CuentaContaDetaGrupoActiSessionBeanAdditional cuentacontadetagrupoactiSessionBeanAdditional) {
		try {
			this.cuentacontadetagrupoactiSessionBeanAdditional=cuentacontadetagrupoactiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaContaDetaGrupoActiSessionBean () {
		this.inicializarCuentaContaDetaGrupoActiSessionBean();
	}
	
	public void inicializarCuentaContaDetaGrupoActiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi=false;
		this.lIdCuentaContaDetaGrupoActiActualForeignKey=0L;
		this.lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaContaDetaGrupoActi ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo=false;
		lidDetalleGrupoActivoFijoActual=0L; 
		
		
		
 		this.id_cuenta_contable=-1L;
 		this.id_detalle_grupo_activo_fijo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi= isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi= isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActi;
	}
					
	public Long getlIdCuentaContaDetaGrupoActiActualForeignKey() {
		return lIdCuentaContaDetaGrupoActiActualForeignKey;
	}

	public void setlIdCuentaContaDetaGrupoActiActualForeignKey(
			Long lIdCuentaContaDetaGrupoActiActualForeignKey) {
		this.lIdCuentaContaDetaGrupoActiActualForeignKey = lIdCuentaContaDetaGrupoActiActualForeignKey;
	}
				    
	public Long getlIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras() {
		return lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras(
			Long lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras = lIdCuentaContaDetaGrupoActiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaDetaGrupoActiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaContaDetaGrupoActi() {
		return sUltimaBusquedaCuentaContaDetaGrupoActi;
	}

	public void setsUltimaBusquedaCuentaContaDetaGrupoActi(String sUltimaBusquedaCuentaContaDetaGrupoActi) {
		this.sUltimaBusquedaCuentaContaDetaGrupoActi = sUltimaBusquedaCuentaContaDetaGrupoActi;
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
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_detalle_grupo_activo_fijo() {
		return this.id_detalle_grupo_activo_fijo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContaDetaGrupoActi:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContaDetaGrupoActi:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_grupo_activo_fijo(Long newid_detalle_grupo_activo_fijo)throws Exception
	{
		try {
			if(this.id_detalle_grupo_activo_fijo!=newid_detalle_grupo_activo_fijo) {
				if(newid_detalle_grupo_activo_fijo==null) {
					//newid_detalle_grupo_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContaDetaGrupoActi:Valor nulo no permitido en columna id_detalle_grupo_activo_fijo");
					}
				}

				this.id_detalle_grupo_activo_fijo=newid_detalle_grupo_activo_fijo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo = isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	}

	public Long getlidDetalleGrupoActivoFijoActual() {
		return lidDetalleGrupoActivoFijoActual;
	}

	public void setlidDetalleGrupoActivoFijoActual(Long lidDetalleGrupoActivoFijoActual) {
		this.lidDetalleGrupoActivoFijoActual = lidDetalleGrupoActivoFijoActual;
	}
	
	
		
	
}
