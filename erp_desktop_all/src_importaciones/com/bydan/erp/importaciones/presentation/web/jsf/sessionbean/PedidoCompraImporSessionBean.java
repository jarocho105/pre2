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
package com.bydan.erp.importaciones.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.importaciones.business.entity.*;

@SuppressWarnings("unused")
public class PedidoCompraImporSessionBean  extends PedidoCompraImporSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor;
	protected Long lIdPedidoCompraImporActualForeignKey;	
	
	protected Long lIdPedidoCompraImporActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras;
	protected String sUltimaBusquedaPedidoCompraImpor;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteProveedor;
	Long lidClienteProveedorActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCambio;
	Long lidTipoCambioActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProrrateoImpor;
	Long lidTipoProrrateoImporActual;
	Boolean isBusquedaDesdeForeignKeySesionEmbarcador;
	Long lidEmbarcadorActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	Long lidTipoViaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionPuerto;
	Long lidPuertoActual;
	Boolean isBusquedaDesdeForeignKeySesionPuertoDestino;
	Long lidPuertoDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTerminosImpor;
	Long lidTipoTerminosImporActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoCompra;
	Long lidEstadoPedidoCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_pais;
	private Long id_cliente;
	private Long id_cliente_proveedor;
	private Long id_empleado;
	private Long id_usuario;
	private Long id_tipo_cambio;
	private Long id_moneda;
	private Long id_tipo_prorrateo_impor;
	private Long id_embarcador;
	private Long id_tipo_via_transporte;
	private Long id_puerto;
	private Long id_puerto_destino;
	private Long id_tipo_terminos_impor;
	private Long id_estado_pedido_compra;
	private Long id_formato;
	private Long id_anio;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PedidoCompraImporSessionBeanAdditional pedidocompraimporSessionBeanAdditional=null;
	
	public PedidoCompraImporSessionBeanAdditional getPedidoCompraImporSessionBeanAdditional() {
		return this.pedidocompraimporSessionBeanAdditional;
	}
	
	public void setPedidoCompraImporSessionBeanAdditional(PedidoCompraImporSessionBeanAdditional pedidocompraimporSessionBeanAdditional) {
		try {
			this.pedidocompraimporSessionBeanAdditional=pedidocompraimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PedidoCompraImporSessionBean () {
		this.inicializarPedidoCompraImporSessionBean();
	}
	
	public void inicializarPedidoCompraImporSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor=false;
		this.lIdPedidoCompraImporActualForeignKey=0L;
		this.lIdPedidoCompraImporActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras=false;
		this.sUltimaBusquedaPedidoCompraImpor ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionClienteProveedor=false;
		lidClienteProveedorActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCambio=false;
		lidTipoCambioActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProrrateoImpor=false;
		lidTipoProrrateoImporActual=0L;
		isBusquedaDesdeForeignKeySesionEmbarcador=false;
		lidEmbarcadorActual=0L;
		isBusquedaDesdeForeignKeySesionTipoViaTransporte=false;
		lidTipoViaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionPuerto=false;
		lidPuertoActual=0L;
		isBusquedaDesdeForeignKeySesionPuertoDestino=false;
		lidPuertoDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTerminosImpor=false;
		lidTipoTerminosImporActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoCompra=false;
		lidEstadoPedidoCompraActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_pais=-1L;
 		this.id_cliente=-1L;
 		this.id_cliente_proveedor=-1L;
 		this.id_empleado=-1L;
 		this.id_usuario=-1L;
 		this.id_tipo_cambio=null;
 		this.id_moneda=-1L;
 		this.id_tipo_prorrateo_impor=-1L;
 		this.id_embarcador=-1L;
 		this.id_tipo_via_transporte=-1L;
 		this.id_puerto=-1L;
 		this.id_puerto_destino=-1L;
 		this.id_tipo_terminos_impor=-1L;
 		this.id_estado_pedido_compra=-1L;
 		this.id_formato=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor= isPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor(String sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor = sNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor= isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImpor;
	}
					
	public Long getlIdPedidoCompraImporActualForeignKey() {
		return lIdPedidoCompraImporActualForeignKey;
	}

	public void setlIdPedidoCompraImporActualForeignKey(
			Long lIdPedidoCompraImporActualForeignKey) {
		this.lIdPedidoCompraImporActualForeignKey = lIdPedidoCompraImporActualForeignKey;
	}
				    
	public Long getlIdPedidoCompraImporActualForeignKeyParaPosibleAtras() {
		return lIdPedidoCompraImporActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPedidoCompraImporActualForeignKeyParaPosibleAtras(
			Long lIdPedidoCompraImporActualForeignKeyParaPosibleAtras) {
		this.lIdPedidoCompraImporActualForeignKeyParaPosibleAtras = lIdPedidoCompraImporActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPedidoCompraImporParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPedidoCompraImpor() {
		return sUltimaBusquedaPedidoCompraImpor;
	}

	public void setsUltimaBusquedaPedidoCompraImpor(String sUltimaBusquedaPedidoCompraImpor) {
		this.sUltimaBusquedaPedidoCompraImpor = sUltimaBusquedaPedidoCompraImpor;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_cliente_proveedor() {
		return this.id_cliente_proveedor;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_tipo_cambio() {
		return this.id_tipo_cambio;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_tipo_prorrateo_impor() {
		return this.id_tipo_prorrateo_impor;
	}
    
	public Long getid_embarcador() {
		return this.id_embarcador;
	}
    
	public Long getid_tipo_via_transporte() {
		return this.id_tipo_via_transporte;
	}
    
	public Long getid_puerto() {
		return this.id_puerto;
	}
    
	public Long getid_puerto_destino() {
		return this.id_puerto_destino;
	}
    
	public Long getid_tipo_terminos_impor() {
		return this.id_tipo_terminos_impor;
	}
    
	public Long getid_estado_pedido_compra() {
		return this.id_estado_pedido_compra;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id");
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_proveedor(Long newid_cliente_proveedor)throws Exception
	{
		try {
			if(this.id_cliente_proveedor!=newid_cliente_proveedor) {
				if(newid_cliente_proveedor==null) {
					//newid_cliente_proveedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_cliente_proveedor");
					}
				}

				this.id_cliente_proveedor=newid_cliente_proveedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cambio(Long newid_tipo_cambio) {
		if(this.id_tipo_cambio!=newid_tipo_cambio) {

			this.id_tipo_cambio=newid_tipo_cambio;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_prorrateo_impor(Long newid_tipo_prorrateo_impor)throws Exception
	{
		try {
			if(this.id_tipo_prorrateo_impor!=newid_tipo_prorrateo_impor) {
				if(newid_tipo_prorrateo_impor==null) {
					//newid_tipo_prorrateo_impor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_tipo_prorrateo_impor");
					}
				}

				this.id_tipo_prorrateo_impor=newid_tipo_prorrateo_impor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_embarcador(Long newid_embarcador)throws Exception
	{
		try {
			if(this.id_embarcador!=newid_embarcador) {
				if(newid_embarcador==null) {
					//newid_embarcador=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_embarcador");
					}
				}

				this.id_embarcador=newid_embarcador;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_via_transporte(Long newid_tipo_via_transporte)throws Exception
	{
		try {
			if(this.id_tipo_via_transporte!=newid_tipo_via_transporte) {
				if(newid_tipo_via_transporte==null) {
					//newid_tipo_via_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_tipo_via_transporte");
					}
				}

				this.id_tipo_via_transporte=newid_tipo_via_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_puerto(Long newid_puerto)throws Exception
	{
		try {
			if(this.id_puerto!=newid_puerto) {
				if(newid_puerto==null) {
					//newid_puerto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_puerto");
					}
				}

				this.id_puerto=newid_puerto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_puerto_destino(Long newid_puerto_destino)throws Exception
	{
		try {
			if(this.id_puerto_destino!=newid_puerto_destino) {
				if(newid_puerto_destino==null) {
					//newid_puerto_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_puerto_destino");
					}
				}

				this.id_puerto_destino=newid_puerto_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_terminos_impor(Long newid_tipo_terminos_impor)throws Exception
	{
		try {
			if(this.id_tipo_terminos_impor!=newid_tipo_terminos_impor) {
				if(newid_tipo_terminos_impor==null) {
					//newid_tipo_terminos_impor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_tipo_terminos_impor");
					}
				}

				this.id_tipo_terminos_impor=newid_tipo_terminos_impor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_compra(Long newid_estado_pedido_compra)throws Exception
	{
		try {
			if(this.id_estado_pedido_compra!=newid_estado_pedido_compra) {
				if(newid_estado_pedido_compra==null) {
					//newid_estado_pedido_compra=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_estado_pedido_compra");
					}
				}

				this.id_estado_pedido_compra=newid_estado_pedido_compra;
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
						System.out.println("PedidoCompraImpor:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionClienteProveedor() {
		return isBusquedaDesdeForeignKeySesionClienteProveedor;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteProveedor(
		Boolean isBusquedaDesdeForeignKeySesionClienteProveedor) {
		this.isBusquedaDesdeForeignKeySesionClienteProveedor = isBusquedaDesdeForeignKeySesionClienteProveedor;
	}

	public Long getlidClienteProveedorActual() {
		return lidClienteProveedorActual;
	}

	public void setlidClienteProveedorActual(Long lidClienteProveedorActual) {
		this.lidClienteProveedorActual = lidClienteProveedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCambio() {
		return isBusquedaDesdeForeignKeySesionTipoCambio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCambio(
		Boolean isBusquedaDesdeForeignKeySesionTipoCambio) {
		this.isBusquedaDesdeForeignKeySesionTipoCambio = isBusquedaDesdeForeignKeySesionTipoCambio;
	}

	public Long getlidTipoCambioActual() {
		return lidTipoCambioActual;
	}

	public void setlidTipoCambioActual(Long lidTipoCambioActual) {
		this.lidTipoCambioActual = lidTipoCambioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProrrateoImpor() {
		return isBusquedaDesdeForeignKeySesionTipoProrrateoImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProrrateoImpor(
		Boolean isBusquedaDesdeForeignKeySesionTipoProrrateoImpor) {
		this.isBusquedaDesdeForeignKeySesionTipoProrrateoImpor = isBusquedaDesdeForeignKeySesionTipoProrrateoImpor;
	}

	public Long getlidTipoProrrateoImporActual() {
		return lidTipoProrrateoImporActual;
	}

	public void setlidTipoProrrateoImporActual(Long lidTipoProrrateoImporActual) {
		this.lidTipoProrrateoImporActual = lidTipoProrrateoImporActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmbarcador() {
		return isBusquedaDesdeForeignKeySesionEmbarcador;
	}

	public void setisBusquedaDesdeForeignKeySesionEmbarcador(
		Boolean isBusquedaDesdeForeignKeySesionEmbarcador) {
		this.isBusquedaDesdeForeignKeySesionEmbarcador = isBusquedaDesdeForeignKeySesionEmbarcador;
	}

	public Long getlidEmbarcadorActual() {
		return lidEmbarcadorActual;
	}

	public void setlidEmbarcadorActual(Long lidEmbarcadorActual) {
		this.lidEmbarcadorActual = lidEmbarcadorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoViaTransporte() {
		return isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoViaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte) {
		this.isBusquedaDesdeForeignKeySesionTipoViaTransporte = isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public Long getlidTipoViaTransporteActual() {
		return lidTipoViaTransporteActual;
	}

	public void setlidTipoViaTransporteActual(Long lidTipoViaTransporteActual) {
		this.lidTipoViaTransporteActual = lidTipoViaTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPuerto() {
		return isBusquedaDesdeForeignKeySesionPuerto;
	}

	public void setisBusquedaDesdeForeignKeySesionPuerto(
		Boolean isBusquedaDesdeForeignKeySesionPuerto) {
		this.isBusquedaDesdeForeignKeySesionPuerto = isBusquedaDesdeForeignKeySesionPuerto;
	}

	public Long getlidPuertoActual() {
		return lidPuertoActual;
	}

	public void setlidPuertoActual(Long lidPuertoActual) {
		this.lidPuertoActual = lidPuertoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPuertoDestino() {
		return isBusquedaDesdeForeignKeySesionPuertoDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionPuertoDestino(
		Boolean isBusquedaDesdeForeignKeySesionPuertoDestino) {
		this.isBusquedaDesdeForeignKeySesionPuertoDestino = isBusquedaDesdeForeignKeySesionPuertoDestino;
	}

	public Long getlidPuertoDestinoActual() {
		return lidPuertoDestinoActual;
	}

	public void setlidPuertoDestinoActual(Long lidPuertoDestinoActual) {
		this.lidPuertoDestinoActual = lidPuertoDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTerminosImpor() {
		return isBusquedaDesdeForeignKeySesionTipoTerminosImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTerminosImpor(
		Boolean isBusquedaDesdeForeignKeySesionTipoTerminosImpor) {
		this.isBusquedaDesdeForeignKeySesionTipoTerminosImpor = isBusquedaDesdeForeignKeySesionTipoTerminosImpor;
	}

	public Long getlidTipoTerminosImporActual() {
		return lidTipoTerminosImporActual;
	}

	public void setlidTipoTerminosImporActual(Long lidTipoTerminosImporActual) {
		this.lidTipoTerminosImporActual = lidTipoTerminosImporActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoCompra() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoCompra(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoCompra) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoCompra = isBusquedaDesdeForeignKeySesionEstadoPedidoCompra;
	}

	public Long getlidEstadoPedidoCompraActual() {
		return lidEstadoPedidoCompraActual;
	}

	public void setlidEstadoPedidoCompraActual(Long lidEstadoPedidoCompraActual) {
		this.lidEstadoPedidoCompraActual = lidEstadoPedidoCompraActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	
	
		
	
}
