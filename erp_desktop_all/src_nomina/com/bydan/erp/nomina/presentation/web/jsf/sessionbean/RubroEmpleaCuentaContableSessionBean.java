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
public class RubroEmpleaCuentaContableSessionBean  extends RubroEmpleaCuentaContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable;
	protected Long lIdRubroEmpleaCuentaContableActualForeignKey;	
	
	protected Long lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras;
	protected String sUltimaBusquedaRubroEmpleaCuentaContable;
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
	Boolean isBusquedaDesdeForeignKeySesionRubroEmplea;
	Long lidRubroEmpleaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_rubro_emplea;
	private Long id_cuenta_contable;
	private Long id_estructura;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RubroEmpleaCuentaContableSessionBeanAdditional rubroempleacuentacontableSessionBeanAdditional=null;
	
	public RubroEmpleaCuentaContableSessionBeanAdditional getRubroEmpleaCuentaContableSessionBeanAdditional() {
		return this.rubroempleacuentacontableSessionBeanAdditional;
	}
	
	public void setRubroEmpleaCuentaContableSessionBeanAdditional(RubroEmpleaCuentaContableSessionBeanAdditional rubroempleacuentacontableSessionBeanAdditional) {
		try {
			this.rubroempleacuentacontableSessionBeanAdditional=rubroempleacuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RubroEmpleaCuentaContableSessionBean () {
		this.inicializarRubroEmpleaCuentaContableSessionBean();
	}
	
	public void inicializarRubroEmpleaCuentaContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable=false;
		this.lIdRubroEmpleaCuentaContableActualForeignKey=0L;
		this.lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras=false;
		this.sUltimaBusquedaRubroEmpleaCuentaContable ="";
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
		isBusquedaDesdeForeignKeySesionRubroEmplea=false;
		lidRubroEmpleaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_rubro_emplea=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_estructura=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable= isPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleaCuentaContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable= isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContable;
	}
					
	public Long getlIdRubroEmpleaCuentaContableActualForeignKey() {
		return lIdRubroEmpleaCuentaContableActualForeignKey;
	}

	public void setlIdRubroEmpleaCuentaContableActualForeignKey(
			Long lIdRubroEmpleaCuentaContableActualForeignKey) {
		this.lIdRubroEmpleaCuentaContableActualForeignKey = lIdRubroEmpleaCuentaContableActualForeignKey;
	}
				    
	public Long getlIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras() {
		return lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras(
			Long lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras) {
		this.lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras = lIdRubroEmpleaCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaCuentaContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRubroEmpleaCuentaContable() {
		return sUltimaBusquedaRubroEmpleaCuentaContable;
	}

	public void setsUltimaBusquedaRubroEmpleaCuentaContable(String sUltimaBusquedaRubroEmpleaCuentaContable) {
		this.sUltimaBusquedaRubroEmpleaCuentaContable = sUltimaBusquedaRubroEmpleaCuentaContable;
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
    
	public Long getid_rubro_emplea() {
		return this.id_rubro_emplea;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id");
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
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_rubro_emplea(Long newid_rubro_emplea)throws Exception
	{
		try {
			if(this.id_rubro_emplea!=newid_rubro_emplea) {
				if(newid_rubro_emplea==null) {
					//newid_rubro_emplea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id_rubro_emplea");
					}
				}

				this.id_rubro_emplea=newid_rubro_emplea;
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
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmpleaCuentaContable:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
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
	public Boolean getisBusquedaDesdeForeignKeySesionRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionRubroEmplea(
		Boolean isBusquedaDesdeForeignKeySesionRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionRubroEmplea = isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public Long getlidRubroEmpleaActual() {
		return lidRubroEmpleaActual;
	}

	public void setlidRubroEmpleaActual(Long lidRubroEmpleaActual) {
		this.lidRubroEmpleaActual = lidRubroEmpleaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstructura() {
		return isBusquedaDesdeForeignKeySesionEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructura(
		Boolean isBusquedaDesdeForeignKeySesionEstructura) {
		this.isBusquedaDesdeForeignKeySesionEstructura = isBusquedaDesdeForeignKeySesionEstructura;
	}

	public Long getlidEstructuraActual() {
		return lidEstructuraActual;
	}

	public void setlidEstructuraActual(Long lidEstructuraActual) {
		this.lidEstructuraActual = lidEstructuraActual;
	}
	
	
		
	
}
