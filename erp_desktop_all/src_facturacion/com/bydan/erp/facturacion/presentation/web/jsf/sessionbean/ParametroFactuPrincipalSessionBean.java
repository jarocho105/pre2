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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class ParametroFactuPrincipalSessionBean  extends ParametroFactuPrincipalSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal;
	protected Long lIdParametroFactuPrincipalActualForeignKey;	
	
	protected Long lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras;
	protected String sUltimaBusquedaParametroFactuPrincipal;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento;
	Long lidTipoParamFactuDescuentoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente;
	Long lidTipoParamFactuListadoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo;
	Long lidTipoParamFactuSecuenciaTrabajoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	Long lidTipoDocumentoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	Long lidTipoDocumentoNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito;
	Long lidTipoDocumentoNotaDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionLibroContable;
	Long lidLibroContableActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta;
	Long lidCuentaContableFleteVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo;
	Long lidCuentaContableOtroCargoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFinan;
	Long lidCuentaContableFinanActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableBoni;
	Long lidCuentaContableBoniActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol;
	Long lidCuentaContableBoniDevolActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIce;
	Long lidCuentaContableIceActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_param_factu_descuento;
	private Long id_tipo_param_factu_listado_cliente;
	private Long id_tipo_param_factu_secuencia_trabajo;
	private Long id_tipo_documento_factura;
	private Long id_tipo_documento_nota_credito;
	private Long id_tipo_documento_nota_debito;
	private Long id_libro_contable;
	private Long id_moneda;
	private Long id_formato;
	private Long id_cuenta_contable_flete_venta;
	private Long id_cuenta_contable_otro_cargo;
	private Long id_cuenta_contable_finan;
	private Long id_cuenta_contable_boni;
	private Long id_cuenta_contable_boni_devol;
	private Long id_cuenta_contable_ice;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFactuPrincipalSessionBeanAdditional parametrofactuprincipalSessionBeanAdditional=null;
	
	public ParametroFactuPrincipalSessionBeanAdditional getParametroFactuPrincipalSessionBeanAdditional() {
		return this.parametrofactuprincipalSessionBeanAdditional;
	}
	
	public void setParametroFactuPrincipalSessionBeanAdditional(ParametroFactuPrincipalSessionBeanAdditional parametrofactuprincipalSessionBeanAdditional) {
		try {
			this.parametrofactuprincipalSessionBeanAdditional=parametrofactuprincipalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFactuPrincipalSessionBean () {
		this.inicializarParametroFactuPrincipalSessionBean();
	}
	
	public void inicializarParametroFactuPrincipalSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal=false;
		this.lIdParametroFactuPrincipalActualForeignKey=0L;
		this.lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFactuPrincipal ="";
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
		isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento=false;
		lidTipoParamFactuDescuentoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente=false;
		lidTipoParamFactuListadoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo=false;
		lidTipoParamFactuSecuenciaTrabajoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoFactura=false;
		lidTipoDocumentoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito=false;
		lidTipoDocumentoNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito=false;
		lidTipoDocumentoNotaDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionLibroContable=false;
		lidLibroContableActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta=false;
		lidCuentaContableFleteVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo=false;
		lidCuentaContableOtroCargoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFinan=false;
		lidCuentaContableFinanActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableBoni=false;
		lidCuentaContableBoniActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol=false;
		lidCuentaContableBoniDevolActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIce=false;
		lidCuentaContableIceActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_param_factu_descuento=-1L;
 		this.id_tipo_param_factu_listado_cliente=-1L;
 		this.id_tipo_param_factu_secuencia_trabajo=-1L;
 		this.id_tipo_documento_factura=-1L;
 		this.id_tipo_documento_nota_credito=-1L;
 		this.id_tipo_documento_nota_debito=-1L;
 		this.id_libro_contable=-1L;
 		this.id_moneda=-1L;
 		this.id_formato=-1L;
 		this.id_cuenta_contable_flete_venta=-1L;
 		this.id_cuenta_contable_otro_cargo=-1L;
 		this.id_cuenta_contable_finan=-1L;
 		this.id_cuenta_contable_boni=-1L;
 		this.id_cuenta_contable_boni_devol=-1L;
 		this.id_cuenta_contable_ice=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal= isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal= isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipal;
	}
					
	public Long getlIdParametroFactuPrincipalActualForeignKey() {
		return lIdParametroFactuPrincipalActualForeignKey;
	}

	public void setlIdParametroFactuPrincipalActualForeignKey(
			Long lIdParametroFactuPrincipalActualForeignKey) {
		this.lIdParametroFactuPrincipalActualForeignKey = lIdParametroFactuPrincipalActualForeignKey;
	}
				    
	public Long getlIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras() {
		return lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras(
			Long lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras = lIdParametroFactuPrincipalActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuPrincipalParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFactuPrincipal() {
		return sUltimaBusquedaParametroFactuPrincipal;
	}

	public void setsUltimaBusquedaParametroFactuPrincipal(String sUltimaBusquedaParametroFactuPrincipal) {
		this.sUltimaBusquedaParametroFactuPrincipal = sUltimaBusquedaParametroFactuPrincipal;
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
    
	public Long getid_tipo_param_factu_descuento() {
		return this.id_tipo_param_factu_descuento;
	}
    
	public Long getid_tipo_param_factu_listado_cliente() {
		return this.id_tipo_param_factu_listado_cliente;
	}
    
	public Long getid_tipo_param_factu_secuencia_trabajo() {
		return this.id_tipo_param_factu_secuencia_trabajo;
	}
    
	public Long getid_tipo_documento_factura() {
		return this.id_tipo_documento_factura;
	}
    
	public Long getid_tipo_documento_nota_credito() {
		return this.id_tipo_documento_nota_credito;
	}
    
	public Long getid_tipo_documento_nota_debito() {
		return this.id_tipo_documento_nota_debito;
	}
    
	public Long getid_libro_contable() {
		return this.id_libro_contable;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_cuenta_contable_flete_venta() {
		return this.id_cuenta_contable_flete_venta;
	}
    
	public Long getid_cuenta_contable_otro_cargo() {
		return this.id_cuenta_contable_otro_cargo;
	}
    
	public Long getid_cuenta_contable_finan() {
		return this.id_cuenta_contable_finan;
	}
    
	public Long getid_cuenta_contable_boni() {
		return this.id_cuenta_contable_boni;
	}
    
	public Long getid_cuenta_contable_boni_devol() {
		return this.id_cuenta_contable_boni_devol;
	}
    
	public Long getid_cuenta_contable_ice() {
		return this.id_cuenta_contable_ice;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_param_factu_descuento(Long newid_tipo_param_factu_descuento)throws Exception
	{
		try {
			if(this.id_tipo_param_factu_descuento!=newid_tipo_param_factu_descuento) {
				if(newid_tipo_param_factu_descuento==null) {
					//newid_tipo_param_factu_descuento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_param_factu_descuento");
					}
				}

				this.id_tipo_param_factu_descuento=newid_tipo_param_factu_descuento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_param_factu_listado_cliente(Long newid_tipo_param_factu_listado_cliente)throws Exception
	{
		try {
			if(this.id_tipo_param_factu_listado_cliente!=newid_tipo_param_factu_listado_cliente) {
				if(newid_tipo_param_factu_listado_cliente==null) {
					//newid_tipo_param_factu_listado_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_param_factu_listado_cliente");
					}
				}

				this.id_tipo_param_factu_listado_cliente=newid_tipo_param_factu_listado_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_param_factu_secuencia_trabajo(Long newid_tipo_param_factu_secuencia_trabajo)throws Exception
	{
		try {
			if(this.id_tipo_param_factu_secuencia_trabajo!=newid_tipo_param_factu_secuencia_trabajo) {
				if(newid_tipo_param_factu_secuencia_trabajo==null) {
					//newid_tipo_param_factu_secuencia_trabajo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_param_factu_secuencia_trabajo");
					}
				}

				this.id_tipo_param_factu_secuencia_trabajo=newid_tipo_param_factu_secuencia_trabajo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_factura(Long newid_tipo_documento_factura)throws Exception
	{
		try {
			if(this.id_tipo_documento_factura!=newid_tipo_documento_factura) {
				if(newid_tipo_documento_factura==null) {
					//newid_tipo_documento_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_documento_factura");
					}
				}

				this.id_tipo_documento_factura=newid_tipo_documento_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_nota_credito(Long newid_tipo_documento_nota_credito)throws Exception
	{
		try {
			if(this.id_tipo_documento_nota_credito!=newid_tipo_documento_nota_credito) {
				if(newid_tipo_documento_nota_credito==null) {
					//newid_tipo_documento_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_documento_nota_credito");
					}
				}

				this.id_tipo_documento_nota_credito=newid_tipo_documento_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_nota_debito(Long newid_tipo_documento_nota_debito)throws Exception
	{
		try {
			if(this.id_tipo_documento_nota_debito!=newid_tipo_documento_nota_debito) {
				if(newid_tipo_documento_nota_debito==null) {
					//newid_tipo_documento_nota_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_tipo_documento_nota_debito");
					}
				}

				this.id_tipo_documento_nota_debito=newid_tipo_documento_nota_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_libro_contable(Long newid_libro_contable)throws Exception
	{
		try {
			if(this.id_libro_contable!=newid_libro_contable) {
				if(newid_libro_contable==null) {
					//newid_libro_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_libro_contable");
					}
				}

				this.id_libro_contable=newid_libro_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_flete_venta(Long newid_cuenta_contable_flete_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_flete_venta!=newid_cuenta_contable_flete_venta) {
				if(newid_cuenta_contable_flete_venta==null) {
					//newid_cuenta_contable_flete_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_flete_venta");
					}
				}

				this.id_cuenta_contable_flete_venta=newid_cuenta_contable_flete_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_otro_cargo(Long newid_cuenta_contable_otro_cargo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_otro_cargo!=newid_cuenta_contable_otro_cargo) {
				if(newid_cuenta_contable_otro_cargo==null) {
					//newid_cuenta_contable_otro_cargo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_otro_cargo");
					}
				}

				this.id_cuenta_contable_otro_cargo=newid_cuenta_contable_otro_cargo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_finan(Long newid_cuenta_contable_finan)throws Exception
	{
		try {
			if(this.id_cuenta_contable_finan!=newid_cuenta_contable_finan) {
				if(newid_cuenta_contable_finan==null) {
					//newid_cuenta_contable_finan=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_finan");
					}
				}

				this.id_cuenta_contable_finan=newid_cuenta_contable_finan;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_boni(Long newid_cuenta_contable_boni)throws Exception
	{
		try {
			if(this.id_cuenta_contable_boni!=newid_cuenta_contable_boni) {
				if(newid_cuenta_contable_boni==null) {
					//newid_cuenta_contable_boni=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_boni");
					}
				}

				this.id_cuenta_contable_boni=newid_cuenta_contable_boni;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_boni_devol(Long newid_cuenta_contable_boni_devol)throws Exception
	{
		try {
			if(this.id_cuenta_contable_boni_devol!=newid_cuenta_contable_boni_devol) {
				if(newid_cuenta_contable_boni_devol==null) {
					//newid_cuenta_contable_boni_devol=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_boni_devol");
					}
				}

				this.id_cuenta_contable_boni_devol=newid_cuenta_contable_boni_devol;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ice(Long newid_cuenta_contable_ice)throws Exception
	{
		try {
			if(this.id_cuenta_contable_ice!=newid_cuenta_contable_ice) {
				if(newid_cuenta_contable_ice==null) {
					//newid_cuenta_contable_ice=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuPrincipal:Valor nulo no permitido en columna id_cuenta_contable_ice");
					}
				}

				this.id_cuenta_contable_ice=newid_cuenta_contable_ice;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParamFactuDescuento() {
		return isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParamFactuDescuento(
		Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento) {
		this.isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento = isBusquedaDesdeForeignKeySesionTipoParamFactuDescuento;
	}

	public Long getlidTipoParamFactuDescuentoActual() {
		return lidTipoParamFactuDescuentoActual;
	}

	public void setlidTipoParamFactuDescuentoActual(Long lidTipoParamFactuDescuentoActual) {
		this.lidTipoParamFactuDescuentoActual = lidTipoParamFactuDescuentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente() {
		return isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente(
		Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente) {
		this.isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente = isBusquedaDesdeForeignKeySesionTipoParamFactuListadoCliente;
	}

	public Long getlidTipoParamFactuListadoClienteActual() {
		return lidTipoParamFactuListadoClienteActual;
	}

	public void setlidTipoParamFactuListadoClienteActual(Long lidTipoParamFactuListadoClienteActual) {
		this.lidTipoParamFactuListadoClienteActual = lidTipoParamFactuListadoClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo() {
		return isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo(
		Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo) {
		this.isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo = isBusquedaDesdeForeignKeySesionTipoParamFactuSecuenciaTrabajo;
	}

	public Long getlidTipoParamFactuSecuenciaTrabajoActual() {
		return lidTipoParamFactuSecuenciaTrabajoActual;
	}

	public void setlidTipoParamFactuSecuenciaTrabajoActual(Long lidTipoParamFactuSecuenciaTrabajoActual) {
		this.lidTipoParamFactuSecuenciaTrabajoActual = lidTipoParamFactuSecuenciaTrabajoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoFactura() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoFactura(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoFactura) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoFactura = isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	}

	public Long getlidTipoDocumentoFacturaActual() {
		return lidTipoDocumentoFacturaActual;
	}

	public void setlidTipoDocumentoFacturaActual(Long lidTipoDocumentoFacturaActual) {
		this.lidTipoDocumentoFacturaActual = lidTipoDocumentoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito = isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	}

	public Long getlidTipoDocumentoNotaCreditoActual() {
		return lidTipoDocumentoNotaCreditoActual;
	}

	public void setlidTipoDocumentoNotaCreditoActual(Long lidTipoDocumentoNotaCreditoActual) {
		this.lidTipoDocumentoNotaCreditoActual = lidTipoDocumentoNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito = isBusquedaDesdeForeignKeySesionTipoDocumentoNotaDebito;
	}

	public Long getlidTipoDocumentoNotaDebitoActual() {
		return lidTipoDocumentoNotaDebitoActual;
	}

	public void setlidTipoDocumentoNotaDebitoActual(Long lidTipoDocumentoNotaDebitoActual) {
		this.lidTipoDocumentoNotaDebitoActual = lidTipoDocumentoNotaDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLibroContable() {
		return isBusquedaDesdeForeignKeySesionLibroContable;
	}

	public void setisBusquedaDesdeForeignKeySesionLibroContable(
		Boolean isBusquedaDesdeForeignKeySesionLibroContable) {
		this.isBusquedaDesdeForeignKeySesionLibroContable = isBusquedaDesdeForeignKeySesionLibroContable;
	}

	public Long getlidLibroContableActual() {
		return lidLibroContableActual;
	}

	public void setlidLibroContableActual(Long lidLibroContableActual) {
		this.lidLibroContableActual = lidLibroContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFleteVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFleteVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta = isBusquedaDesdeForeignKeySesionCuentaContableFleteVenta;
	}

	public Long getlidCuentaContableFleteVentaActual() {
		return lidCuentaContableFleteVentaActual;
	}

	public void setlidCuentaContableFleteVentaActual(Long lidCuentaContableFleteVentaActual) {
		this.lidCuentaContableFleteVentaActual = lidCuentaContableFleteVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableOtroCargo() {
		return isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableOtroCargo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo = isBusquedaDesdeForeignKeySesionCuentaContableOtroCargo;
	}

	public Long getlidCuentaContableOtroCargoActual() {
		return lidCuentaContableOtroCargoActual;
	}

	public void setlidCuentaContableOtroCargoActual(Long lidCuentaContableOtroCargoActual) {
		this.lidCuentaContableOtroCargoActual = lidCuentaContableOtroCargoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFinan() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFinan;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFinan(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFinan) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFinan = isBusquedaDesdeForeignKeySesionCuentaContableFinan;
	}

	public Long getlidCuentaContableFinanActual() {
		return lidCuentaContableFinanActual;
	}

	public void setlidCuentaContableFinanActual(Long lidCuentaContableFinanActual) {
		this.lidCuentaContableFinanActual = lidCuentaContableFinanActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableBoni() {
		return isBusquedaDesdeForeignKeySesionCuentaContableBoni;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableBoni(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableBoni) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableBoni = isBusquedaDesdeForeignKeySesionCuentaContableBoni;
	}

	public Long getlidCuentaContableBoniActual() {
		return lidCuentaContableBoniActual;
	}

	public void setlidCuentaContableBoniActual(Long lidCuentaContableBoniActual) {
		this.lidCuentaContableBoniActual = lidCuentaContableBoniActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableBoniDevol() {
		return isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableBoniDevol(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol = isBusquedaDesdeForeignKeySesionCuentaContableBoniDevol;
	}

	public Long getlidCuentaContableBoniDevolActual() {
		return lidCuentaContableBoniDevolActual;
	}

	public void setlidCuentaContableBoniDevolActual(Long lidCuentaContableBoniDevolActual) {
		this.lidCuentaContableBoniDevolActual = lidCuentaContableBoniDevolActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIce() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIce;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIce(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIce) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIce = isBusquedaDesdeForeignKeySesionCuentaContableIce;
	}

	public Long getlidCuentaContableIceActual() {
		return lidCuentaContableIceActual;
	}

	public void setlidCuentaContableIceActual(Long lidCuentaContableIceActual) {
		this.lidCuentaContableIceActual = lidCuentaContableIceActual;
	}
	
	
		
	
}
