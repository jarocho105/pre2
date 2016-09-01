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
public class NotaCreditoPuntoVentaSessionBean  extends NotaCreditoPuntoVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta;
	protected Long lIdNotaCreditoPuntoVentaActualForeignKey;	
	
	protected Long lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras;
	protected String sUltimaBusquedaNotaCreditoPuntoVenta;
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
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionCaja;
	Long lidCajaActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionMesa;
	Long lidMesaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta;
	Long lidTipoFacturaPuntoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta;
	Long lidEstadoNotaCreditoPuntoVentaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_vendedor;
	private Long id_cliente;
	private Long id_caja;
	private Long id_asiento_contable;
	private Long id_tipo_precio;
	private Long id_mesa;
	private Long id_formato;
	private Long id_tipo_factura_punto_venta;
	private Long id_estado_nota_credito_punto_venta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected NotaCreditoPuntoVentaSessionBeanAdditional notacreditopuntoventaSessionBeanAdditional=null;
	
	public NotaCreditoPuntoVentaSessionBeanAdditional getNotaCreditoPuntoVentaSessionBeanAdditional() {
		return this.notacreditopuntoventaSessionBeanAdditional;
	}
	
	public void setNotaCreditoPuntoVentaSessionBeanAdditional(NotaCreditoPuntoVentaSessionBeanAdditional notacreditopuntoventaSessionBeanAdditional) {
		try {
			this.notacreditopuntoventaSessionBeanAdditional=notacreditopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public NotaCreditoPuntoVentaSessionBean () {
		this.inicializarNotaCreditoPuntoVentaSessionBean();
	}
	
	public void inicializarNotaCreditoPuntoVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta=false;
		this.lIdNotaCreditoPuntoVentaActualForeignKey=0L;
		this.lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras=false;
		this.sUltimaBusquedaNotaCreditoPuntoVenta ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionCaja=false;
		lidCajaActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionMesa=false;
		lidMesaActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta=false;
		lidTipoFacturaPuntoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta=false;
		lidEstadoNotaCreditoPuntoVentaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_vendedor=-1L;
 		this.id_cliente=-1L;
 		this.id_caja=-1L;
 		this.id_asiento_contable=null;
 		this.id_tipo_precio=-1L;
 		this.id_mesa=-1L;
 		this.id_formato=-1L;
 		this.id_tipo_factura_punto_venta=-1L;
 		this.id_estado_nota_credito_punto_venta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta= isPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta= isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVenta;
	}
					
	public Long getlIdNotaCreditoPuntoVentaActualForeignKey() {
		return lIdNotaCreditoPuntoVentaActualForeignKey;
	}

	public void setlIdNotaCreditoPuntoVentaActualForeignKey(
			Long lIdNotaCreditoPuntoVentaActualForeignKey) {
		this.lIdNotaCreditoPuntoVentaActualForeignKey = lIdNotaCreditoPuntoVentaActualForeignKey;
	}
				    
	public Long getlIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras() {
		return lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras(
			Long lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras) {
		this.lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras = lIdNotaCreditoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyNotaCreditoPuntoVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaNotaCreditoPuntoVenta() {
		return sUltimaBusquedaNotaCreditoPuntoVenta;
	}

	public void setsUltimaBusquedaNotaCreditoPuntoVenta(String sUltimaBusquedaNotaCreditoPuntoVenta) {
		this.sUltimaBusquedaNotaCreditoPuntoVenta = sUltimaBusquedaNotaCreditoPuntoVenta;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_caja() {
		return this.id_caja;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_mesa() {
		return this.id_mesa;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_tipo_factura_punto_venta() {
		return this.id_tipo_factura_punto_venta;
	}
    
	public Long getid_estado_nota_credito_punto_venta() {
		return this.id_estado_nota_credito_punto_venta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id");
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
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor)throws Exception
	{
		try {
			if(this.id_vendedor!=newid_vendedor) {
				if(newid_vendedor==null) {
					//newid_vendedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_vendedor");
					}
				}

				this.id_vendedor=newid_vendedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_caja(Long newid_caja)throws Exception
	{
		try {
			if(this.id_caja!=newid_caja) {
				if(newid_caja==null) {
					//newid_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_caja");
					}
				}

				this.id_caja=newid_caja;
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
    
	public void setid_tipo_precio(Long newid_tipo_precio)throws Exception
	{
		try {
			if(this.id_tipo_precio!=newid_tipo_precio) {
				if(newid_tipo_precio==null) {
					//newid_tipo_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mesa(Long newid_mesa)throws Exception
	{
		try {
			if(this.id_mesa!=newid_mesa) {
				if(newid_mesa==null) {
					//newid_mesa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_mesa");
					}
				}

				this.id_mesa=newid_mesa;
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
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_factura_punto_venta(Long newid_tipo_factura_punto_venta)throws Exception
	{
		try {
			if(this.id_tipo_factura_punto_venta!=newid_tipo_factura_punto_venta) {
				if(newid_tipo_factura_punto_venta==null) {
					//newid_tipo_factura_punto_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_tipo_factura_punto_venta");
					}
				}

				this.id_tipo_factura_punto_venta=newid_tipo_factura_punto_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_nota_credito_punto_venta(Long newid_estado_nota_credito_punto_venta)throws Exception
	{
		try {
			if(this.id_estado_nota_credito_punto_venta!=newid_estado_nota_credito_punto_venta) {
				if(newid_estado_nota_credito_punto_venta==null) {
					//newid_estado_nota_credito_punto_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NotaCreditoPuntoVenta:Valor nulo no permitido en columna id_estado_nota_credito_punto_venta");
					}
				}

				this.id_estado_nota_credito_punto_venta=newid_estado_nota_credito_punto_venta;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionVendedor() {
		return isBusquedaDesdeForeignKeySesionVendedor;
	}

	public void setisBusquedaDesdeForeignKeySesionVendedor(
		Boolean isBusquedaDesdeForeignKeySesionVendedor) {
		this.isBusquedaDesdeForeignKeySesionVendedor = isBusquedaDesdeForeignKeySesionVendedor;
	}

	public Long getlidVendedorActual() {
		return lidVendedorActual;
	}

	public void setlidVendedorActual(Long lidVendedorActual) {
		this.lidVendedorActual = lidVendedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCaja() {
		return isBusquedaDesdeForeignKeySesionCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionCaja(
		Boolean isBusquedaDesdeForeignKeySesionCaja) {
		this.isBusquedaDesdeForeignKeySesionCaja = isBusquedaDesdeForeignKeySesionCaja;
	}

	public Long getlidCajaActual() {
		return lidCajaActual;
	}

	public void setlidCajaActual(Long lidCajaActual) {
		this.lidCajaActual = lidCajaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrecio() {
		return isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrecio(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrecio) {
		this.isBusquedaDesdeForeignKeySesionTipoPrecio = isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public Long getlidTipoPrecioActual() {
		return lidTipoPrecioActual;
	}

	public void setlidTipoPrecioActual(Long lidTipoPrecioActual) {
		this.lidTipoPrecioActual = lidTipoPrecioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesa() {
		return isBusquedaDesdeForeignKeySesionMesa;
	}

	public void setisBusquedaDesdeForeignKeySesionMesa(
		Boolean isBusquedaDesdeForeignKeySesionMesa) {
		this.isBusquedaDesdeForeignKeySesionMesa = isBusquedaDesdeForeignKeySesionMesa;
	}

	public Long getlidMesaActual() {
		return lidMesaActual;
	}

	public void setlidMesaActual(Long lidMesaActual) {
		this.lidMesaActual = lidMesaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta(
		Boolean isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta = isBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta;
	}

	public Long getlidTipoFacturaPuntoVentaActual() {
		return lidTipoFacturaPuntoVentaActual;
	}

	public void setlidTipoFacturaPuntoVentaActual(Long lidTipoFacturaPuntoVentaActual) {
		this.lidTipoFacturaPuntoVentaActual = lidTipoFacturaPuntoVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta(
		Boolean isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta = isBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta;
	}

	public Long getlidEstadoNotaCreditoPuntoVentaActual() {
		return lidEstadoNotaCreditoPuntoVentaActual;
	}

	public void setlidEstadoNotaCreditoPuntoVentaActual(Long lidEstadoNotaCreditoPuntoVentaActual) {
		this.lidEstadoNotaCreditoPuntoVentaActual = lidEstadoNotaCreditoPuntoVentaActual;
	}
	
	
		
	
}
