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
public class ParametroFactuSessionBean  extends ParametroFactuSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu;
	protected Long lIdParametroFactuActualForeignKey;	
	
	protected Long lIdParametroFactuActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras;
	protected String sUltimaBusquedaParametroFactu;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFactu;
	Long lidCuentaContableFactuActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFinan;
	Long lidCuentaContableFinanActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtro;
	Long lidCuentaContableOtroActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoProforma;
	Long lidFormatoProformaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoPedido;
	Long lidFormatoPedidoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoFactura;
	Long lidFormatoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	Long lidFormatoNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoInventario;
	Long lidFormatoInventarioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cuenta_contable_factu;
	private Long id_cuenta_contable_finan;
	private Long id_cuenta_contable_otro;
	private Long id_formato_proforma;
	private Long id_formato_pedido;
	private Long id_formato_factura;
	private Long id_formato_nota_credito;
	private Long id_formato_inventario;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFactuSessionBeanAdditional parametrofactuSessionBeanAdditional=null;
	
	public ParametroFactuSessionBeanAdditional getParametroFactuSessionBeanAdditional() {
		return this.parametrofactuSessionBeanAdditional;
	}
	
	public void setParametroFactuSessionBeanAdditional(ParametroFactuSessionBeanAdditional parametrofactuSessionBeanAdditional) {
		try {
			this.parametrofactuSessionBeanAdditional=parametrofactuSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFactuSessionBean () {
		this.inicializarParametroFactuSessionBean();
	}
	
	public void inicializarParametroFactuSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu=false;
		this.lIdParametroFactuActualForeignKey=0L;
		this.lIdParametroFactuActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFactu ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableFactu=false;
		lidCuentaContableFactuActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFinan=false;
		lidCuentaContableFinanActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableOtro=false;
		lidCuentaContableOtroActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoProforma=false;
		lidFormatoProformaActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoPedido=false;
		lidFormatoPedidoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoFactura=false;
		lidFormatoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNotaCredito=false;
		lidFormatoNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoInventario=false;
		lidFormatoInventarioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cuenta_contable_factu=-1L;
 		this.id_cuenta_contable_finan=-1L;
 		this.id_cuenta_contable_otro=-1L;
 		this.id_formato_proforma=-1L;
 		this.id_formato_pedido=-1L;
 		this.id_formato_factura=-1L;
 		this.id_formato_nota_credito=-1L;
 		this.id_formato_inventario=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFactu() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactu(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu= isPermiteNavegacionHaciaForeignKeyDesdeParametroFactu;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactu;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactu() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactu(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu= isBusquedaDesdeForeignKeySesionForeignKeyParametroFactu;
	}
					
	public Long getlIdParametroFactuActualForeignKey() {
		return lIdParametroFactuActualForeignKey;
	}

	public void setlIdParametroFactuActualForeignKey(
			Long lIdParametroFactuActualForeignKey) {
		this.lIdParametroFactuActualForeignKey = lIdParametroFactuActualForeignKey;
	}
				    
	public Long getlIdParametroFactuActualForeignKeyParaPosibleAtras() {
		return lIdParametroFactuActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFactuActualForeignKeyParaPosibleAtras(
			Long lIdParametroFactuActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFactuActualForeignKeyParaPosibleAtras = lIdParametroFactuActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFactu() {
		return sUltimaBusquedaParametroFactu;
	}

	public void setsUltimaBusquedaParametroFactu(String sUltimaBusquedaParametroFactu) {
		this.sUltimaBusquedaParametroFactu = sUltimaBusquedaParametroFactu;
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
    
	public Long getid_cuenta_contable_factu() {
		return this.id_cuenta_contable_factu;
	}
    
	public Long getid_cuenta_contable_finan() {
		return this.id_cuenta_contable_finan;
	}
    
	public Long getid_cuenta_contable_otro() {
		return this.id_cuenta_contable_otro;
	}
    
	public Long getid_formato_proforma() {
		return this.id_formato_proforma;
	}
    
	public Long getid_formato_pedido() {
		return this.id_formato_pedido;
	}
    
	public Long getid_formato_factura() {
		return this.id_formato_factura;
	}
    
	public Long getid_formato_nota_credito() {
		return this.id_formato_nota_credito;
	}
    
	public Long getid_formato_inventario() {
		return this.id_formato_inventario;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_factu(Long newid_cuenta_contable_factu)throws Exception
	{
		try {
			if(this.id_cuenta_contable_factu!=newid_cuenta_contable_factu) {
				if(newid_cuenta_contable_factu==null) {
					//newid_cuenta_contable_factu=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_cuenta_contable_factu");
					}
				}

				this.id_cuenta_contable_factu=newid_cuenta_contable_factu;
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
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_cuenta_contable_finan");
					}
				}

				this.id_cuenta_contable_finan=newid_cuenta_contable_finan;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_otro(Long newid_cuenta_contable_otro)throws Exception
	{
		try {
			if(this.id_cuenta_contable_otro!=newid_cuenta_contable_otro) {
				if(newid_cuenta_contable_otro==null) {
					//newid_cuenta_contable_otro=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_cuenta_contable_otro");
					}
				}

				this.id_cuenta_contable_otro=newid_cuenta_contable_otro;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_proforma(Long newid_formato_proforma)throws Exception
	{
		try {
			if(this.id_formato_proforma!=newid_formato_proforma) {
				if(newid_formato_proforma==null) {
					//newid_formato_proforma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_formato_proforma");
					}
				}

				this.id_formato_proforma=newid_formato_proforma;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_pedido(Long newid_formato_pedido)throws Exception
	{
		try {
			if(this.id_formato_pedido!=newid_formato_pedido) {
				if(newid_formato_pedido==null) {
					//newid_formato_pedido=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_formato_pedido");
					}
				}

				this.id_formato_pedido=newid_formato_pedido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_factura(Long newid_formato_factura)throws Exception
	{
		try {
			if(this.id_formato_factura!=newid_formato_factura) {
				if(newid_formato_factura==null) {
					//newid_formato_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_formato_factura");
					}
				}

				this.id_formato_factura=newid_formato_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nota_credito(Long newid_formato_nota_credito)throws Exception
	{
		try {
			if(this.id_formato_nota_credito!=newid_formato_nota_credito) {
				if(newid_formato_nota_credito==null) {
					//newid_formato_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_formato_nota_credito");
					}
				}

				this.id_formato_nota_credito=newid_formato_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_inventario(Long newid_formato_inventario)throws Exception
	{
		try {
			if(this.id_formato_inventario!=newid_formato_inventario) {
				if(newid_formato_inventario==null) {
					//newid_formato_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactu:Valor nulo no permitido en columna id_formato_inventario");
					}
				}

				this.id_formato_inventario=newid_formato_inventario;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFactu() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFactu;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFactu(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFactu) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFactu = isBusquedaDesdeForeignKeySesionCuentaContableFactu;
	}

	public Long getlidCuentaContableFactuActual() {
		return lidCuentaContableFactuActual;
	}

	public void setlidCuentaContableFactuActual(Long lidCuentaContableFactuActual) {
		this.lidCuentaContableFactuActual = lidCuentaContableFactuActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableOtro() {
		return isBusquedaDesdeForeignKeySesionCuentaContableOtro;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableOtro(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtro) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableOtro = isBusquedaDesdeForeignKeySesionCuentaContableOtro;
	}

	public Long getlidCuentaContableOtroActual() {
		return lidCuentaContableOtroActual;
	}

	public void setlidCuentaContableOtroActual(Long lidCuentaContableOtroActual) {
		this.lidCuentaContableOtroActual = lidCuentaContableOtroActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoProforma() {
		return isBusquedaDesdeForeignKeySesionFormatoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoProforma(
		Boolean isBusquedaDesdeForeignKeySesionFormatoProforma) {
		this.isBusquedaDesdeForeignKeySesionFormatoProforma = isBusquedaDesdeForeignKeySesionFormatoProforma;
	}

	public Long getlidFormatoProformaActual() {
		return lidFormatoProformaActual;
	}

	public void setlidFormatoProformaActual(Long lidFormatoProformaActual) {
		this.lidFormatoProformaActual = lidFormatoProformaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoPedido() {
		return isBusquedaDesdeForeignKeySesionFormatoPedido;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoPedido(
		Boolean isBusquedaDesdeForeignKeySesionFormatoPedido) {
		this.isBusquedaDesdeForeignKeySesionFormatoPedido = isBusquedaDesdeForeignKeySesionFormatoPedido;
	}

	public Long getlidFormatoPedidoActual() {
		return lidFormatoPedidoActual;
	}

	public void setlidFormatoPedidoActual(Long lidFormatoPedidoActual) {
		this.lidFormatoPedidoActual = lidFormatoPedidoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoFactura() {
		return isBusquedaDesdeForeignKeySesionFormatoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoFactura(
		Boolean isBusquedaDesdeForeignKeySesionFormatoFactura) {
		this.isBusquedaDesdeForeignKeySesionFormatoFactura = isBusquedaDesdeForeignKeySesionFormatoFactura;
	}

	public Long getlidFormatoFacturaActual() {
		return lidFormatoFacturaActual;
	}

	public void setlidFormatoFacturaActual(Long lidFormatoFacturaActual) {
		this.lidFormatoFacturaActual = lidFormatoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNotaCredito() {
		return isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionFormatoNotaCredito = isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	}

	public Long getlidFormatoNotaCreditoActual() {
		return lidFormatoNotaCreditoActual;
	}

	public void setlidFormatoNotaCreditoActual(Long lidFormatoNotaCreditoActual) {
		this.lidFormatoNotaCreditoActual = lidFormatoNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoInventario() {
		return isBusquedaDesdeForeignKeySesionFormatoInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoInventario(
		Boolean isBusquedaDesdeForeignKeySesionFormatoInventario) {
		this.isBusquedaDesdeForeignKeySesionFormatoInventario = isBusquedaDesdeForeignKeySesionFormatoInventario;
	}

	public Long getlidFormatoInventarioActual() {
		return lidFormatoInventarioActual;
	}

	public void setlidFormatoInventarioActual(Long lidFormatoInventarioActual) {
		this.lidFormatoInventarioActual = lidFormatoInventarioActual;
	}
	
	
		
	
}
