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
public class GastoDepreciacionCentroCostoSessionBean  extends GastoDepreciacionCentroCostoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto;
	protected Long lIdGastoDepreciacionCentroCostoActualForeignKey;	
	
	protected Long lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras;
	protected String sUltimaBusquedaGastoDepreciacionCentroCosto;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	Long lidDetalleActivoFijoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_centro_costo;
	private Long id_detalle_activo_fijo;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected GastoDepreciacionCentroCostoSessionBeanAdditional gastodepreciacioncentrocostoSessionBeanAdditional=null;
	
	public GastoDepreciacionCentroCostoSessionBeanAdditional getGastoDepreciacionCentroCostoSessionBeanAdditional() {
		return this.gastodepreciacioncentrocostoSessionBeanAdditional;
	}
	
	public void setGastoDepreciacionCentroCostoSessionBeanAdditional(GastoDepreciacionCentroCostoSessionBeanAdditional gastodepreciacioncentrocostoSessionBeanAdditional) {
		try {
			this.gastodepreciacioncentrocostoSessionBeanAdditional=gastodepreciacioncentrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public GastoDepreciacionCentroCostoSessionBean () {
		this.inicializarGastoDepreciacionCentroCostoSessionBean();
	}
	
	public void inicializarGastoDepreciacionCentroCostoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto=false;
		this.lIdGastoDepreciacionCentroCostoActualForeignKey=0L;
		this.lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras=false;
		this.sUltimaBusquedaGastoDepreciacionCentroCosto ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleActivoFijo=false;
		lidDetalleActivoFijoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_centro_costo=null;
 		this.id_detalle_activo_fijo=-1L;
 		this.id_cuenta_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto= isPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto = sNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacionCentroCosto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto= isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto;
	}
					
	public Long getlIdGastoDepreciacionCentroCostoActualForeignKey() {
		return lIdGastoDepreciacionCentroCostoActualForeignKey;
	}

	public void setlIdGastoDepreciacionCentroCostoActualForeignKey(
			Long lIdGastoDepreciacionCentroCostoActualForeignKey) {
		this.lIdGastoDepreciacionCentroCostoActualForeignKey = lIdGastoDepreciacionCentroCostoActualForeignKey;
	}
				    
	public Long getlIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras() {
		return lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras(
			Long lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras) {
		this.lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras = lIdGastoDepreciacionCentroCostoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCostoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaGastoDepreciacionCentroCosto() {
		return sUltimaBusquedaGastoDepreciacionCentroCosto;
	}

	public void setsUltimaBusquedaGastoDepreciacionCentroCosto(String sUltimaBusquedaGastoDepreciacionCentroCosto) {
		this.sUltimaBusquedaGastoDepreciacionCentroCosto = sUltimaBusquedaGastoDepreciacionCentroCosto;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_detalle_activo_fijo() {
		return this.id_detalle_activo_fijo;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("GastoDepreciacionCentroCosto:Valor nulo no permitido en columna id");
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
						System.out.println("GastoDepreciacionCentroCosto:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("GastoDepreciacionCentroCosto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_detalle_activo_fijo(Long newid_detalle_activo_fijo)throws Exception
	{
		try {
			if(this.id_detalle_activo_fijo!=newid_detalle_activo_fijo) {
				if(newid_detalle_activo_fijo==null) {
					//newid_detalle_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("GastoDepreciacionCentroCosto:Valor nulo no permitido en columna id_detalle_activo_fijo");
					}
				}

				this.id_detalle_activo_fijo=newid_detalle_activo_fijo;
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
						System.out.println("GastoDepreciacionCentroCosto:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleActivoFijo() {
		return isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionDetalleActivoFijo = isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public Long getlidDetalleActivoFijoActual() {
		return lidDetalleActivoFijoActual;
	}

	public void setlidDetalleActivoFijoActual(Long lidDetalleActivoFijoActual) {
		this.lidDetalleActivoFijoActual = lidDetalleActivoFijoActual;
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
	
	
		
	
}
