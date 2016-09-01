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
public class CuentaContableTipoSessionBean  extends CuentaContableTipoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo;
	protected Long lIdCuentaContableTipoActualForeignKey;	
	
	protected Long lIdCuentaContableTipoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras;
	protected String sUltimaBusquedaCuentaContableTipo;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo;
	Long lidTipoCuentaContableTipoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	Long lidTipoProductoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	Long lidCuentaContableVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	Long lidCuentaContableDescuentoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	Long lidCuentaContableDevolucionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	Long lidCuentaContableCostoActual;
	
	private Long id;
	private Long id_empresa;
	private String nombre;
	private Long id_tipo_cuenta_contable_tipo;
	private Long id_tipo_producto_servicio;
	private Long id_cuenta_contable_venta;
	private Long id_cuenta_contable_descuento;
	private Long id_cuenta_contable_devolucion;
	private Long id_cuenta_contable_costo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaContableTipoSessionBeanAdditional cuentacontabletipoSessionBeanAdditional=null;
	
	public CuentaContableTipoSessionBeanAdditional getCuentaContableTipoSessionBeanAdditional() {
		return this.cuentacontabletipoSessionBeanAdditional;
	}
	
	public void setCuentaContableTipoSessionBeanAdditional(CuentaContableTipoSessionBeanAdditional cuentacontabletipoSessionBeanAdditional) {
		try {
			this.cuentacontabletipoSessionBeanAdditional=cuentacontabletipoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaContableTipoSessionBean () {
		this.inicializarCuentaContableTipoSessionBean();
	}
	
	public void inicializarCuentaContableTipoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo=false;
		this.lIdCuentaContableTipoActualForeignKey=0L;
		this.lIdCuentaContableTipoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaContableTipo ="";
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
		isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo=false;
		lidTipoCuentaContableTipoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProductoServicio=false;
		lidTipoProductoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVenta=false;
		lidCuentaContableVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDescuento=false;
		lidCuentaContableDescuentoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDevolucion=false;
		lidCuentaContableDevolucionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCosto=false;
		lidCuentaContableCostoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.nombre="";
 		this.id_tipo_cuenta_contable_tipo=-1L;
 		this.id_tipo_producto_servicio=-1L;
 		this.id_cuenta_contable_venta=null;
 		this.id_cuenta_contable_descuento=null;
 		this.id_cuenta_contable_devolucion=null;
 		this.id_cuenta_contable_costo=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo= isPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo= isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo;
	}
					
	public Long getlIdCuentaContableTipoActualForeignKey() {
		return lIdCuentaContableTipoActualForeignKey;
	}

	public void setlIdCuentaContableTipoActualForeignKey(
			Long lIdCuentaContableTipoActualForeignKey) {
		this.lIdCuentaContableTipoActualForeignKey = lIdCuentaContableTipoActualForeignKey;
	}
				    
	public Long getlIdCuentaContableTipoActualForeignKeyParaPosibleAtras() {
		return lIdCuentaContableTipoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaContableTipoActualForeignKeyParaPosibleAtras(
			Long lIdCuentaContableTipoActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaContableTipoActualForeignKeyParaPosibleAtras = lIdCuentaContableTipoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaContableTipo() {
		return sUltimaBusquedaCuentaContableTipo;
	}

	public void setsUltimaBusquedaCuentaContableTipo(String sUltimaBusquedaCuentaContableTipo) {
		this.sUltimaBusquedaCuentaContableTipo = sUltimaBusquedaCuentaContableTipo;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_tipo_cuenta_contable_tipo() {
		return this.id_tipo_cuenta_contable_tipo;
	}
    
	public Long getid_tipo_producto_servicio() {
		return this.id_tipo_producto_servicio;
	}
    
	public Long getid_cuenta_contable_venta() {
		return this.id_cuenta_contable_venta;
	}
    
	public Long getid_cuenta_contable_descuento() {
		return this.id_cuenta_contable_descuento;
	}
    
	public Long getid_cuenta_contable_devolucion() {
		return this.id_cuenta_contable_devolucion;
	}
    
	public Long getid_cuenta_contable_costo() {
		return this.id_cuenta_contable_costo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContableTipo:Valor nulo no permitido en columna id");
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
						System.out.println("CuentaContableTipo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContableTipo:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("CuentaContableTipo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_contable_tipo(Long newid_tipo_cuenta_contable_tipo)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_contable_tipo!=newid_tipo_cuenta_contable_tipo) {
				if(newid_tipo_cuenta_contable_tipo==null) {
					//newid_tipo_cuenta_contable_tipo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContableTipo:Valor nulo no permitido en columna id_tipo_cuenta_contable_tipo");
					}
				}

				this.id_tipo_cuenta_contable_tipo=newid_tipo_cuenta_contable_tipo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto_servicio(Long newid_tipo_producto_servicio)throws Exception
	{
		try {
			if(this.id_tipo_producto_servicio!=newid_tipo_producto_servicio) {
				if(newid_tipo_producto_servicio==null) {
					//newid_tipo_producto_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContableTipo:Valor nulo no permitido en columna id_tipo_producto_servicio");
					}
				}

				this.id_tipo_producto_servicio=newid_tipo_producto_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_venta(Long newid_cuenta_contable_venta) {
		if(this.id_cuenta_contable_venta!=newid_cuenta_contable_venta) {

			this.id_cuenta_contable_venta=newid_cuenta_contable_venta;
		}
	}
    
	public void setid_cuenta_contable_descuento(Long newid_cuenta_contable_descuento) {
		if(this.id_cuenta_contable_descuento!=newid_cuenta_contable_descuento) {

			this.id_cuenta_contable_descuento=newid_cuenta_contable_descuento;
		}
	}
    
	public void setid_cuenta_contable_devolucion(Long newid_cuenta_contable_devolucion) {
		if(this.id_cuenta_contable_devolucion!=newid_cuenta_contable_devolucion) {

			this.id_cuenta_contable_devolucion=newid_cuenta_contable_devolucion;
		}
	}
    
	public void setid_cuenta_contable_costo(Long newid_cuenta_contable_costo) {
		if(this.id_cuenta_contable_costo!=newid_cuenta_contable_costo) {

			this.id_cuenta_contable_costo=newid_cuenta_contable_costo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo = isBusquedaDesdeForeignKeySesionTipoCuentaContableTipo;
	}

	public Long getlidTipoCuentaContableTipoActual() {
		return lidTipoCuentaContableTipoActual;
	}

	public void setlidTipoCuentaContableTipoActual(Long lidTipoCuentaContableTipoActual) {
		this.lidTipoCuentaContableTipoActual = lidTipoCuentaContableTipoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProductoServicio() {
		return isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProductoServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoProductoServicio = isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public Long getlidTipoProductoServicioActual() {
		return lidTipoProductoServicioActual;
	}

	public void setlidTipoProductoServicioActual(Long lidTipoProductoServicioActual) {
		this.lidTipoProductoServicioActual = lidTipoProductoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableVenta = isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public Long getlidCuentaContableVentaActual() {
		return lidCuentaContableVentaActual;
	}

	public void setlidCuentaContableVentaActual(Long lidCuentaContableVentaActual) {
		this.lidCuentaContableVentaActual = lidCuentaContableVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDescuento() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDescuento(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDescuento = isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public Long getlidCuentaContableDescuentoActual() {
		return lidCuentaContableDescuentoActual;
	}

	public void setlidCuentaContableDescuentoActual(Long lidCuentaContableDescuentoActual) {
		this.lidCuentaContableDescuentoActual = lidCuentaContableDescuentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDevolucion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDevolucion = isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public Long getlidCuentaContableDevolucionActual() {
		return lidCuentaContableDevolucionActual;
	}

	public void setlidCuentaContableDevolucionActual(Long lidCuentaContableDevolucionActual) {
		this.lidCuentaContableDevolucionActual = lidCuentaContableDevolucionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCosto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCosto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCosto = isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public Long getlidCuentaContableCostoActual() {
		return lidCuentaContableCostoActual;
	}

	public void setlidCuentaContableCostoActual(Long lidCuentaContableCostoActual) {
		this.lidCuentaContableCostoActual = lidCuentaContableCostoActual;
	}
	
	
		
	
}
