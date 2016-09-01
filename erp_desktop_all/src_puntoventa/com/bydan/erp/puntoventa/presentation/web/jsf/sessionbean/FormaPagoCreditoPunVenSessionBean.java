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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class FormaPagoCreditoPunVenSessionBean  extends FormaPagoCreditoPunVenSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen;
	protected Long lIdFormaPagoCreditoPunVenActualForeignKey;	
	
	protected Long lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras;
	protected String sUltimaBusquedaFormaPagoCreditoPunVen;
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
	Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	Long lidFacturaPuntoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago;
	Long lidTipoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_factura_punto_venta;
	private Long id_tipo_forma_pago;
	private Long id_asiento_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormaPagoCreditoPunVenSessionBeanAdditional formapagocreditopunvenSessionBeanAdditional=null;
	
	public FormaPagoCreditoPunVenSessionBeanAdditional getFormaPagoCreditoPunVenSessionBeanAdditional() {
		return this.formapagocreditopunvenSessionBeanAdditional;
	}
	
	public void setFormaPagoCreditoPunVenSessionBeanAdditional(FormaPagoCreditoPunVenSessionBeanAdditional formapagocreditopunvenSessionBeanAdditional) {
		try {
			this.formapagocreditopunvenSessionBeanAdditional=formapagocreditopunvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormaPagoCreditoPunVenSessionBean () {
		this.inicializarFormaPagoCreditoPunVenSessionBean();
	}
	
	public void inicializarFormaPagoCreditoPunVenSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen=false;
		this.lIdFormaPagoCreditoPunVenActualForeignKey=0L;
		this.lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras=false;
		this.sUltimaBusquedaFormaPagoCreditoPunVen ="";
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
		isBusquedaDesdeForeignKeySesionFacturaPuntoVenta=false;
		lidFacturaPuntoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFormaPago=false;
		lidTipoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_factura_punto_venta=-1L;
 		this.id_tipo_forma_pago=-1L;
 		this.id_asiento_contable=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen= isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoCreditoPunVen;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen= isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVen;
	}
					
	public Long getlIdFormaPagoCreditoPunVenActualForeignKey() {
		return lIdFormaPagoCreditoPunVenActualForeignKey;
	}

	public void setlIdFormaPagoCreditoPunVenActualForeignKey(
			Long lIdFormaPagoCreditoPunVenActualForeignKey) {
		this.lIdFormaPagoCreditoPunVenActualForeignKey = lIdFormaPagoCreditoPunVenActualForeignKey;
	}
				    
	public Long getlIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras() {
		return lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras(
			Long lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras) {
		this.lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras = lIdFormaPagoCreditoPunVenActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoCreditoPunVenParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormaPagoCreditoPunVen() {
		return sUltimaBusquedaFormaPagoCreditoPunVen;
	}

	public void setsUltimaBusquedaFormaPagoCreditoPunVen(String sUltimaBusquedaFormaPagoCreditoPunVen) {
		this.sUltimaBusquedaFormaPagoCreditoPunVen = sUltimaBusquedaFormaPagoCreditoPunVen;
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
    
	public Long getid_factura_punto_venta() {
		return this.id_factura_punto_venta;
	}
    
	public Long getid_tipo_forma_pago() {
		return this.id_tipo_forma_pago;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoCreditoPunVen:Valor nulo no permitido en columna id");
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
						System.out.println("FormaPagoCreditoPunVen:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FormaPagoCreditoPunVen:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura_punto_venta(Long newid_factura_punto_venta)throws Exception
	{
		try {
			if(this.id_factura_punto_venta!=newid_factura_punto_venta) {
				if(newid_factura_punto_venta==null) {
					//newid_factura_punto_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoCreditoPunVen:Valor nulo no permitido en columna id_factura_punto_venta");
					}
				}

				this.id_factura_punto_venta=newid_factura_punto_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_forma_pago(Long newid_tipo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_forma_pago!=newid_tipo_forma_pago) {
				if(newid_tipo_forma_pago==null) {
					//newid_tipo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoCreditoPunVen:Valor nulo no permitido en columna id_tipo_forma_pago");
					}
				}

				this.id_tipo_forma_pago=newid_tipo_forma_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable) {
		if(this.id_asiento_contable!=newid_asiento_contable) {

			this.id_asiento_contable=newid_asiento_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionFacturaPuntoVenta(
		Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionFacturaPuntoVenta = isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public Long getlidFacturaPuntoVentaActual() {
		return lidFacturaPuntoVentaActual;
	}

	public void setlidFacturaPuntoVentaActual(Long lidFacturaPuntoVentaActual) {
		this.lidFacturaPuntoVentaActual = lidFacturaPuntoVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoFormaPago = isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public Long getlidTipoFormaPagoActual() {
		return lidTipoFormaPagoActual;
	}

	public void setlidTipoFormaPagoActual(Long lidTipoFormaPagoActual) {
		this.lidTipoFormaPagoActual = lidTipoFormaPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAsientoContable() {
		return isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionAsientoContable = isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public Long getlidAsientoContableActual() {
		return lidAsientoContableActual;
	}

	public void setlidAsientoContableActual(Long lidAsientoContableActual) {
		this.lidAsientoContableActual = lidAsientoContableActual;
	}
	
	
		
	
}
