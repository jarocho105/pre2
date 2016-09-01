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
public class EstructuraSessionBean  extends EstructuraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstructura;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstructura;
	protected Long lIdEstructuraActualForeignKey;	
	
	protected Long lIdEstructuraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras;
	protected String sUltimaBusquedaEstructura;
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
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPago_NM;
	Long lidTipoPago_NMActual;
	Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal;
	Long lidNumeroPatronalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEstructura;
	Long lidTipoEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estructura;
	private Long id_tipo_pago__n_m;
	private Long id_numero_patronal;
	private Long id_cuenta_contable;
	private Long id_tipo_estructura;
	private Long id_pais;
	private Long id_ciudad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EstructuraSessionBeanAdditional estructuraSessionBeanAdditional=null;
	
	public EstructuraSessionBeanAdditional getEstructuraSessionBeanAdditional() {
		return this.estructuraSessionBeanAdditional;
	}
	
	public void setEstructuraSessionBeanAdditional(EstructuraSessionBeanAdditional estructuraSessionBeanAdditional) {
		try {
			this.estructuraSessionBeanAdditional=estructuraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EstructuraSessionBean () {
		this.inicializarEstructuraSessionBean();
	}
	
	public void inicializarEstructuraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstructura=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstructura=false;
		this.lIdEstructuraActualForeignKey=0L;
		this.lIdEstructuraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras=false;
		this.sUltimaBusquedaEstructura ="";
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
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPago_NM=false;
		lidTipoPago_NMActual=0L;
		isBusquedaDesdeForeignKeySesionNumeroPatronal=false;
		lidNumeroPatronalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEstructura=false;
		lidTipoEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estructura=null;
 		this.id_tipo_pago__n_m=-1L;
 		this.id_numero_patronal=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_tipo_estructura=-1L;
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEstructura() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEstructura;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEstructura(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstructura) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstructura= isPermiteNavegacionHaciaForeignKeyDesdeEstructura;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura = sNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstructura() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstructura(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstructura) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstructura= isBusquedaDesdeForeignKeySesionForeignKeyEstructura;
	}
					
	public Long getlIdEstructuraActualForeignKey() {
		return lIdEstructuraActualForeignKey;
	}

	public void setlIdEstructuraActualForeignKey(
			Long lIdEstructuraActualForeignKey) {
		this.lIdEstructuraActualForeignKey = lIdEstructuraActualForeignKey;
	}
				    
	public Long getlIdEstructuraActualForeignKeyParaPosibleAtras() {
		return lIdEstructuraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEstructuraActualForeignKeyParaPosibleAtras(
			Long lIdEstructuraActualForeignKeyParaPosibleAtras) {
		this.lIdEstructuraActualForeignKeyParaPosibleAtras = lIdEstructuraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEstructuraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEstructura() {
		return sUltimaBusquedaEstructura;
	}

	public void setsUltimaBusquedaEstructura(String sUltimaBusquedaEstructura) {
		this.sUltimaBusquedaEstructura = sUltimaBusquedaEstructura;
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
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_tipo_pago__n_m() {
		return this.id_tipo_pago__n_m;
	}
    
	public Long getid_numero_patronal() {
		return this.id_numero_patronal;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_tipo_estructura() {
		return this.id_tipo_estructura;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id");
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
						System.out.println("Estructura:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Estructura:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura) {
		if(this.id_estructura!=newid_estructura) {

			this.id_estructura=newid_estructura;
		}
	}
    
	public void setid_tipo_pago__n_m(Long newid_tipo_pago__n_m)throws Exception
	{
		try {
			if(this.id_tipo_pago__n_m!=newid_tipo_pago__n_m) {
				if(newid_tipo_pago__n_m==null) {
					//newid_tipo_pago__n_m=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id_tipo_pago__n_m");
					}
				}

				this.id_tipo_pago__n_m=newid_tipo_pago__n_m;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_numero_patronal(Long newid_numero_patronal)throws Exception
	{
		try {
			if(this.id_numero_patronal!=newid_numero_patronal) {
				if(newid_numero_patronal==null) {
					//newid_numero_patronal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id_numero_patronal");
					}
				}

				this.id_numero_patronal=newid_numero_patronal;
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
						System.out.println("Estructura:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_estructura(Long newid_tipo_estructura)throws Exception
	{
		try {
			if(this.id_tipo_estructura!=newid_tipo_estructura) {
				if(newid_tipo_estructura==null) {
					//newid_tipo_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id_tipo_estructura");
					}
				}

				this.id_tipo_estructura=newid_tipo_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Estructura:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPago_NM() {
		return isBusquedaDesdeForeignKeySesionTipoPago_NM;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPago_NM(
		Boolean isBusquedaDesdeForeignKeySesionTipoPago_NM) {
		this.isBusquedaDesdeForeignKeySesionTipoPago_NM = isBusquedaDesdeForeignKeySesionTipoPago_NM;
	}

	public Long getlidTipoPago_NMActual() {
		return lidTipoPago_NMActual;
	}

	public void setlidTipoPago_NMActual(Long lidTipoPago_NMActual) {
		this.lidTipoPago_NMActual = lidTipoPago_NMActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionNumeroPatronal() {
		return isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public void setisBusquedaDesdeForeignKeySesionNumeroPatronal(
		Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal) {
		this.isBusquedaDesdeForeignKeySesionNumeroPatronal = isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public Long getlidNumeroPatronalActual() {
		return lidNumeroPatronalActual;
	}

	public void setlidNumeroPatronalActual(Long lidNumeroPatronalActual) {
		this.lidNumeroPatronalActual = lidNumeroPatronalActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoEstructura() {
		return isBusquedaDesdeForeignKeySesionTipoEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoEstructura(
		Boolean isBusquedaDesdeForeignKeySesionTipoEstructura) {
		this.isBusquedaDesdeForeignKeySesionTipoEstructura = isBusquedaDesdeForeignKeySesionTipoEstructura;
	}

	public Long getlidTipoEstructuraActual() {
		return lidTipoEstructuraActual;
	}

	public void setlidTipoEstructuraActual(Long lidTipoEstructuraActual) {
		this.lidTipoEstructuraActual = lidTipoEstructuraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	
	
		
	
}
