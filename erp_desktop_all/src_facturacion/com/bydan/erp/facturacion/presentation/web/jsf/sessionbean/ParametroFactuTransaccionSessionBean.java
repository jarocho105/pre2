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
public class ParametroFactuTransaccionSessionBean  extends ParametroFactuTransaccionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion;
	protected Long lIdParametroFactuTransaccionActualForeignKey;	
	
	protected Long lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras;
	protected String sUltimaBusquedaParametroFactuTransaccion;
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
	Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenFactura;
	Long lidTransaccionInvenFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito;
	Long lidTransaccionInvenNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta;
	Long lidTransaccionInvenNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura;
	Long lidTransaccionCuentaCoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito;
	Long lidTransaccionCuentaCoNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta;
	Long lidTransaccionCuentaCoNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta;
	Long lidTransaccionCuentaCoTarjetaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura;
	Long lidTransaccionCuentaPaFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito;
	Long lidTransaccionCuentaPaNotaCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_transaccion_inven_factura;
	private Long id_transaccion_inven_nota_credito;
	private Long id_transaccion_inven_nota_venta;
	private Long id_transaccion_cuenta_co_factura;
	private Long id_transaccion_cuenta_co_nota_credito;
	private Long id_transaccion_cuenta_co_nota_venta;
	private Long id_transaccion_cuenta_co_tarjeta;
	private Long id_transaccion_cuenta_pa_factura;
	private Long id_transaccion_cuenta_pa_nota_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFactuTransaccionSessionBeanAdditional parametrofactutransaccionSessionBeanAdditional=null;
	
	public ParametroFactuTransaccionSessionBeanAdditional getParametroFactuTransaccionSessionBeanAdditional() {
		return this.parametrofactutransaccionSessionBeanAdditional;
	}
	
	public void setParametroFactuTransaccionSessionBeanAdditional(ParametroFactuTransaccionSessionBeanAdditional parametrofactutransaccionSessionBeanAdditional) {
		try {
			this.parametrofactutransaccionSessionBeanAdditional=parametrofactutransaccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFactuTransaccionSessionBean () {
		this.inicializarParametroFactuTransaccionSessionBean();
	}
	
	public void inicializarParametroFactuTransaccionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion=false;
		this.lIdParametroFactuTransaccionActualForeignKey=0L;
		this.lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFactuTransaccion ="";
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
		isBusquedaDesdeForeignKeySesionTransaccionInvenFactura=false;
		lidTransaccionInvenFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito=false;
		lidTransaccionInvenNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta=false;
		lidTransaccionInvenNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura=false;
		lidTransaccionCuentaCoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito=false;
		lidTransaccionCuentaCoNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta=false;
		lidTransaccionCuentaCoNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta=false;
		lidTransaccionCuentaCoTarjetaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura=false;
		lidTransaccionCuentaPaFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito=false;
		lidTransaccionCuentaPaNotaCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_transaccion_inven_factura=-1L;
 		this.id_transaccion_inven_nota_credito=-1L;
 		this.id_transaccion_inven_nota_venta=-1L;
 		this.id_transaccion_cuenta_co_factura=-1L;
 		this.id_transaccion_cuenta_co_nota_credito=-1L;
 		this.id_transaccion_cuenta_co_nota_venta=-1L;
 		this.id_transaccion_cuenta_co_tarjeta=-1L;
 		this.id_transaccion_cuenta_pa_factura=-1L;
 		this.id_transaccion_cuenta_pa_nota_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion= isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuTransaccion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion= isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccion;
	}
					
	public Long getlIdParametroFactuTransaccionActualForeignKey() {
		return lIdParametroFactuTransaccionActualForeignKey;
	}

	public void setlIdParametroFactuTransaccionActualForeignKey(
			Long lIdParametroFactuTransaccionActualForeignKey) {
		this.lIdParametroFactuTransaccionActualForeignKey = lIdParametroFactuTransaccionActualForeignKey;
	}
				    
	public Long getlIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras() {
		return lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras(
			Long lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras = lIdParametroFactuTransaccionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuTransaccionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFactuTransaccion() {
		return sUltimaBusquedaParametroFactuTransaccion;
	}

	public void setsUltimaBusquedaParametroFactuTransaccion(String sUltimaBusquedaParametroFactuTransaccion) {
		this.sUltimaBusquedaParametroFactuTransaccion = sUltimaBusquedaParametroFactuTransaccion;
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
    
	public Long getid_transaccion_inven_factura() {
		return this.id_transaccion_inven_factura;
	}
    
	public Long getid_transaccion_inven_nota_credito() {
		return this.id_transaccion_inven_nota_credito;
	}
    
	public Long getid_transaccion_inven_nota_venta() {
		return this.id_transaccion_inven_nota_venta;
	}
    
	public Long getid_transaccion_cuenta_co_factura() {
		return this.id_transaccion_cuenta_co_factura;
	}
    
	public Long getid_transaccion_cuenta_co_nota_credito() {
		return this.id_transaccion_cuenta_co_nota_credito;
	}
    
	public Long getid_transaccion_cuenta_co_nota_venta() {
		return this.id_transaccion_cuenta_co_nota_venta;
	}
    
	public Long getid_transaccion_cuenta_co_tarjeta() {
		return this.id_transaccion_cuenta_co_tarjeta;
	}
    
	public Long getid_transaccion_cuenta_pa_factura() {
		return this.id_transaccion_cuenta_pa_factura;
	}
    
	public Long getid_transaccion_cuenta_pa_nota_credito() {
		return this.id_transaccion_cuenta_pa_nota_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_inven_factura(Long newid_transaccion_inven_factura)throws Exception
	{
		try {
			if(this.id_transaccion_inven_factura!=newid_transaccion_inven_factura) {
				if(newid_transaccion_inven_factura==null) {
					//newid_transaccion_inven_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_inven_factura");
					}
				}

				this.id_transaccion_inven_factura=newid_transaccion_inven_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_inven_nota_credito(Long newid_transaccion_inven_nota_credito)throws Exception
	{
		try {
			if(this.id_transaccion_inven_nota_credito!=newid_transaccion_inven_nota_credito) {
				if(newid_transaccion_inven_nota_credito==null) {
					//newid_transaccion_inven_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_inven_nota_credito");
					}
				}

				this.id_transaccion_inven_nota_credito=newid_transaccion_inven_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_inven_nota_venta(Long newid_transaccion_inven_nota_venta)throws Exception
	{
		try {
			if(this.id_transaccion_inven_nota_venta!=newid_transaccion_inven_nota_venta) {
				if(newid_transaccion_inven_nota_venta==null) {
					//newid_transaccion_inven_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_inven_nota_venta");
					}
				}

				this.id_transaccion_inven_nota_venta=newid_transaccion_inven_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_co_factura(Long newid_transaccion_cuenta_co_factura)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_co_factura!=newid_transaccion_cuenta_co_factura) {
				if(newid_transaccion_cuenta_co_factura==null) {
					//newid_transaccion_cuenta_co_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_co_factura");
					}
				}

				this.id_transaccion_cuenta_co_factura=newid_transaccion_cuenta_co_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_co_nota_credito(Long newid_transaccion_cuenta_co_nota_credito)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_co_nota_credito!=newid_transaccion_cuenta_co_nota_credito) {
				if(newid_transaccion_cuenta_co_nota_credito==null) {
					//newid_transaccion_cuenta_co_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_co_nota_credito");
					}
				}

				this.id_transaccion_cuenta_co_nota_credito=newid_transaccion_cuenta_co_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_co_nota_venta(Long newid_transaccion_cuenta_co_nota_venta)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_co_nota_venta!=newid_transaccion_cuenta_co_nota_venta) {
				if(newid_transaccion_cuenta_co_nota_venta==null) {
					//newid_transaccion_cuenta_co_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_co_nota_venta");
					}
				}

				this.id_transaccion_cuenta_co_nota_venta=newid_transaccion_cuenta_co_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_co_tarjeta(Long newid_transaccion_cuenta_co_tarjeta)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_co_tarjeta!=newid_transaccion_cuenta_co_tarjeta) {
				if(newid_transaccion_cuenta_co_tarjeta==null) {
					//newid_transaccion_cuenta_co_tarjeta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_co_tarjeta");
					}
				}

				this.id_transaccion_cuenta_co_tarjeta=newid_transaccion_cuenta_co_tarjeta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_pa_factura(Long newid_transaccion_cuenta_pa_factura)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_pa_factura!=newid_transaccion_cuenta_pa_factura) {
				if(newid_transaccion_cuenta_pa_factura==null) {
					//newid_transaccion_cuenta_pa_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_pa_factura");
					}
				}

				this.id_transaccion_cuenta_pa_factura=newid_transaccion_cuenta_pa_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_pa_nota_credito(Long newid_transaccion_cuenta_pa_nota_credito)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_pa_nota_credito!=newid_transaccion_cuenta_pa_nota_credito) {
				if(newid_transaccion_cuenta_pa_nota_credito==null) {
					//newid_transaccion_cuenta_pa_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuTransaccion:Valor nulo no permitido en columna id_transaccion_cuenta_pa_nota_credito");
					}
				}

				this.id_transaccion_cuenta_pa_nota_credito=newid_transaccion_cuenta_pa_nota_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionInvenFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionInvenFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionInvenFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionInvenFactura = isBusquedaDesdeForeignKeySesionTransaccionInvenFactura;
	}

	public Long getlidTransaccionInvenFacturaActual() {
		return lidTransaccionInvenFacturaActual;
	}

	public void setlidTransaccionInvenFacturaActual(Long lidTransaccionInvenFacturaActual) {
		this.lidTransaccionInvenFacturaActual = lidTransaccionInvenFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito = isBusquedaDesdeForeignKeySesionTransaccionInvenNotaCredito;
	}

	public Long getlidTransaccionInvenNotaCreditoActual() {
		return lidTransaccionInvenNotaCreditoActual;
	}

	public void setlidTransaccionInvenNotaCreditoActual(Long lidTransaccionInvenNotaCreditoActual) {
		this.lidTransaccionInvenNotaCreditoActual = lidTransaccionInvenNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta() {
		return isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta = isBusquedaDesdeForeignKeySesionTransaccionInvenNotaVenta;
	}

	public Long getlidTransaccionInvenNotaVentaActual() {
		return lidTransaccionInvenNotaVentaActual;
	}

	public void setlidTransaccionInvenNotaVentaActual(Long lidTransaccionInvenNotaVentaActual) {
		this.lidTransaccionInvenNotaVentaActual = lidTransaccionInvenNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura = isBusquedaDesdeForeignKeySesionTransaccionCuentaCoFactura;
	}

	public Long getlidTransaccionCuentaCoFacturaActual() {
		return lidTransaccionCuentaCoFacturaActual;
	}

	public void setlidTransaccionCuentaCoFacturaActual(Long lidTransaccionCuentaCoFacturaActual) {
		this.lidTransaccionCuentaCoFacturaActual = lidTransaccionCuentaCoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito = isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaCredito;
	}

	public Long getlidTransaccionCuentaCoNotaCreditoActual() {
		return lidTransaccionCuentaCoNotaCreditoActual;
	}

	public void setlidTransaccionCuentaCoNotaCreditoActual(Long lidTransaccionCuentaCoNotaCreditoActual) {
		this.lidTransaccionCuentaCoNotaCreditoActual = lidTransaccionCuentaCoNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta = isBusquedaDesdeForeignKeySesionTransaccionCuentaCoNotaVenta;
	}

	public Long getlidTransaccionCuentaCoNotaVentaActual() {
		return lidTransaccionCuentaCoNotaVentaActual;
	}

	public void setlidTransaccionCuentaCoNotaVentaActual(Long lidTransaccionCuentaCoNotaVentaActual) {
		this.lidTransaccionCuentaCoNotaVentaActual = lidTransaccionCuentaCoNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta = isBusquedaDesdeForeignKeySesionTransaccionCuentaCoTarjeta;
	}

	public Long getlidTransaccionCuentaCoTarjetaActual() {
		return lidTransaccionCuentaCoTarjetaActual;
	}

	public void setlidTransaccionCuentaCoTarjetaActual(Long lidTransaccionCuentaCoTarjetaActual) {
		this.lidTransaccionCuentaCoTarjetaActual = lidTransaccionCuentaCoTarjetaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura = isBusquedaDesdeForeignKeySesionTransaccionCuentaPaFactura;
	}

	public Long getlidTransaccionCuentaPaFacturaActual() {
		return lidTransaccionCuentaPaFacturaActual;
	}

	public void setlidTransaccionCuentaPaFacturaActual(Long lidTransaccionCuentaPaFacturaActual) {
		this.lidTransaccionCuentaPaFacturaActual = lidTransaccionCuentaPaFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito = isBusquedaDesdeForeignKeySesionTransaccionCuentaPaNotaCredito;
	}

	public Long getlidTransaccionCuentaPaNotaCreditoActual() {
		return lidTransaccionCuentaPaNotaCreditoActual;
	}

	public void setlidTransaccionCuentaPaNotaCreditoActual(Long lidTransaccionCuentaPaNotaCreditoActual) {
		this.lidTransaccionCuentaPaNotaCreditoActual = lidTransaccionCuentaPaNotaCreditoActual;
	}
	
	
		
	
}
