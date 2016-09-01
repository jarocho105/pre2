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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class ParametroTesoreriaDefectoSessionBean  extends ParametroTesoreriaDefectoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto;
	protected Long lIdParametroTesoreriaDefectoActualForeignKey;	
	
	protected Long lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras;
	protected String sUltimaBusquedaParametroTesoreriaDefecto;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	Long lidTipoCuentaBancoGlobalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_cuenta_banco_global;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroTesoreriaDefectoSessionBeanAdditional parametrotesoreriadefectoSessionBeanAdditional=null;
	
	public ParametroTesoreriaDefectoSessionBeanAdditional getParametroTesoreriaDefectoSessionBeanAdditional() {
		return this.parametrotesoreriadefectoSessionBeanAdditional;
	}
	
	public void setParametroTesoreriaDefectoSessionBeanAdditional(ParametroTesoreriaDefectoSessionBeanAdditional parametrotesoreriadefectoSessionBeanAdditional) {
		try {
			this.parametrotesoreriadefectoSessionBeanAdditional=parametrotesoreriadefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroTesoreriaDefectoSessionBean () {
		this.inicializarParametroTesoreriaDefectoSessionBean();
	}
	
	public void inicializarParametroTesoreriaDefectoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto=false;
		this.lIdParametroTesoreriaDefectoActualForeignKey=0L;
		this.lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras=false;
		this.sUltimaBusquedaParametroTesoreriaDefecto ="";
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
		isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal=false;
		lidTipoCuentaBancoGlobalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_cuenta_banco_global=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto= isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto= isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefecto;
	}
					
	public Long getlIdParametroTesoreriaDefectoActualForeignKey() {
		return lIdParametroTesoreriaDefectoActualForeignKey;
	}

	public void setlIdParametroTesoreriaDefectoActualForeignKey(
			Long lIdParametroTesoreriaDefectoActualForeignKey) {
		this.lIdParametroTesoreriaDefectoActualForeignKey = lIdParametroTesoreriaDefectoActualForeignKey;
	}
				    
	public Long getlIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras() {
		return lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras(
			Long lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras) {
		this.lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras = lIdParametroTesoreriaDefectoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaDefectoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroTesoreriaDefecto() {
		return sUltimaBusquedaParametroTesoreriaDefecto;
	}

	public void setsUltimaBusquedaParametroTesoreriaDefecto(String sUltimaBusquedaParametroTesoreriaDefecto) {
		this.sUltimaBusquedaParametroTesoreriaDefecto = sUltimaBusquedaParametroTesoreriaDefecto;
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
    
	public Long getid_tipo_cuenta_banco_global() {
		return this.id_tipo_cuenta_banco_global;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreriaDefecto:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroTesoreriaDefecto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroTesoreriaDefecto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_banco_global(Long newid_tipo_cuenta_banco_global)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_banco_global!=newid_tipo_cuenta_banco_global) {
				if(newid_tipo_cuenta_banco_global==null) {
					//newid_tipo_cuenta_banco_global=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreriaDefecto:Valor nulo no permitido en columna id_tipo_cuenta_banco_global");
					}
				}

				this.id_tipo_cuenta_banco_global=newid_tipo_cuenta_banco_global;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal = isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public Long getlidTipoCuentaBancoGlobalActual() {
		return lidTipoCuentaBancoGlobalActual;
	}

	public void setlidTipoCuentaBancoGlobalActual(Long lidTipoCuentaBancoGlobalActual) {
		this.lidTipoCuentaBancoGlobalActual = lidTipoCuentaBancoGlobalActual;
	}
	
	
		
	
}
