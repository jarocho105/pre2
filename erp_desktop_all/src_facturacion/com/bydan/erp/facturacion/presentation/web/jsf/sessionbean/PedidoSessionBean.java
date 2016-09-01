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
public class PedidoSessionBean  extends PedidoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePedido;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePedido;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedido;
	protected Long lIdPedidoActualForeignKey;	
	
	protected Long lIdPedidoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras;
	protected String sUltimaBusquedaPedido;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionSubCliente;
	Long lidSubClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionConsultor;
	Long lidConsultorActual;
	Boolean isBusquedaDesdeForeignKeySesionResponsable;
	Long lidResponsableActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedido;
	Long lidEstadoPedidoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransporte;
	Long lidTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionRutaTransporte;
	Long lidRutaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoLlamada;
	Long lidTipoLlamadaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransportista;
	Long lidTransportistaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCambio;
	Long lidTipoCambioActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionZona;
	Long lidZonaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_usuario;
	private Long id_moneda;
	private Long id_empleado;
	private Long id_tipo_precio;
	private Long id_formato;
	private Long id_cliente;
	private Long id_sub_cliente;
	private Long id_vendedor;
	private Long id_consultor;
	private Long id_responsable;
	private Long id_estado_pedido;
	private Long id_transporte;
	private Long id_ruta_transporte;
	private Long id_tipo_llamada;
	private Long id_transportista;
	private Long id_tipo_cambio;
	private Long id_centro_costo;
	private Long id_zona;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PedidoSessionBeanAdditional pedidoSessionBeanAdditional=null;
	
	public PedidoSessionBeanAdditional getPedidoSessionBeanAdditional() {
		return this.pedidoSessionBeanAdditional;
	}
	
	public void setPedidoSessionBeanAdditional(PedidoSessionBeanAdditional pedidoSessionBeanAdditional) {
		try {
			this.pedidoSessionBeanAdditional=pedidoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PedidoSessionBean () {
		this.inicializarPedidoSessionBean();
	}
	
	public void inicializarPedidoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePedido=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedido="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedido=false;
		this.lIdPedidoActualForeignKey=0L;
		this.lIdPedidoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras=false;
		this.sUltimaBusquedaPedido ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionSubCliente=false;
		lidSubClienteActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionConsultor=false;
		lidConsultorActual=0L;
		isBusquedaDesdeForeignKeySesionResponsable=false;
		lidResponsableActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedido=false;
		lidEstadoPedidoActual=0L;
		isBusquedaDesdeForeignKeySesionTransporte=false;
		lidTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionRutaTransporte=false;
		lidRutaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoLlamada=false;
		lidTipoLlamadaActual=0L;
		isBusquedaDesdeForeignKeySesionTransportista=false;
		lidTransportistaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCambio=false;
		lidTipoCambioActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionZona=false;
		lidZonaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_usuario=-1L;
 		this.id_moneda=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_precio=-1L;
 		this.id_formato=null;
 		this.id_cliente=-1L;
 		this.id_sub_cliente=null;
 		this.id_vendedor=null;
 		this.id_consultor=null;
 		this.id_responsable=null;
 		this.id_estado_pedido=1L;
 		this.id_transporte=null;
 		this.id_ruta_transporte=null;
 		this.id_tipo_llamada=null;
 		this.id_transportista=null;
 		this.id_tipo_cambio=null;
 		this.id_centro_costo=null;
 		this.id_zona=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePedido() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePedido;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePedido(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePedido) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePedido= isPermiteNavegacionHaciaForeignKeyDesdePedido;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePedido() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedido;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePedido(String sNombrePaginaNavegacionHaciaForeignKeyDesdePedido) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePedido = sNombrePaginaNavegacionHaciaForeignKeyDesdePedido;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPedido() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPedido;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPedido(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedido) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedido= isBusquedaDesdeForeignKeySesionForeignKeyPedido;
	}
					
	public Long getlIdPedidoActualForeignKey() {
		return lIdPedidoActualForeignKey;
	}

	public void setlIdPedidoActualForeignKey(
			Long lIdPedidoActualForeignKey) {
		this.lIdPedidoActualForeignKey = lIdPedidoActualForeignKey;
	}
				    
	public Long getlIdPedidoActualForeignKeyParaPosibleAtras() {
		return lIdPedidoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPedidoActualForeignKeyParaPosibleAtras(
			Long lIdPedidoActualForeignKeyParaPosibleAtras) {
		this.lIdPedidoActualForeignKeyParaPosibleAtras = lIdPedidoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPedidoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPedido() {
		return sUltimaBusquedaPedido;
	}

	public void setsUltimaBusquedaPedido(String sUltimaBusquedaPedido) {
		this.sUltimaBusquedaPedido = sUltimaBusquedaPedido;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_sub_cliente() {
		return this.id_sub_cliente;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_consultor() {
		return this.id_consultor;
	}
    
	public Long getid_responsable() {
		return this.id_responsable;
	}
    
	public Long getid_estado_pedido() {
		return this.id_estado_pedido;
	}
    
	public Long getid_transporte() {
		return this.id_transporte;
	}
    
	public Long getid_ruta_transporte() {
		return this.id_ruta_transporte;
	}
    
	public Long getid_tipo_llamada() {
		return this.id_tipo_llamada;
	}
    
	public Long getid_transportista() {
		return this.id_transportista;
	}
    
	public Long getid_tipo_cambio() {
		return this.id_tipo_cambio;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_zona() {
		return this.id_zona;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Pedido:Valor nulo no permitido en columna id");
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Pedido:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
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
						System.out.println("Pedido:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_precio(Long newid_tipo_precio)throws Exception
	{
		try {
			if(this.id_tipo_precio!=newid_tipo_precio) {
				if(newid_tipo_precio==null) {
					//newid_tipo_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Pedido:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato) {
		if(this.id_formato!=newid_formato) {

			this.id_formato=newid_formato;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Pedido:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sub_cliente(Long newid_sub_cliente) {
		if(this.id_sub_cliente!=newid_sub_cliente) {

			this.id_sub_cliente=newid_sub_cliente;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor) {
		if(this.id_vendedor!=newid_vendedor) {

			this.id_vendedor=newid_vendedor;
		}
	}
    
	public void setid_consultor(Long newid_consultor) {
		if(this.id_consultor!=newid_consultor) {

			this.id_consultor=newid_consultor;
		}
	}
    
	public void setid_responsable(Long newid_responsable) {
		if(this.id_responsable!=newid_responsable) {

			this.id_responsable=newid_responsable;
		}
	}
    
	public void setid_estado_pedido(Long newid_estado_pedido)throws Exception
	{
		try {
			if(this.id_estado_pedido!=newid_estado_pedido) {
				if(newid_estado_pedido==null) {
					//newid_estado_pedido=1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Pedido:Valor nulo no permitido en columna id_estado_pedido");
					}
				}

				this.id_estado_pedido=newid_estado_pedido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transporte(Long newid_transporte) {
		if(this.id_transporte!=newid_transporte) {

			this.id_transporte=newid_transporte;
		}
	}
    
	public void setid_ruta_transporte(Long newid_ruta_transporte) {
		if(this.id_ruta_transporte!=newid_ruta_transporte) {

			this.id_ruta_transporte=newid_ruta_transporte;
		}
	}
    
	public void setid_tipo_llamada(Long newid_tipo_llamada) {
		if(this.id_tipo_llamada!=newid_tipo_llamada) {

			this.id_tipo_llamada=newid_tipo_llamada;
		}
	}
    
	public void setid_transportista(Long newid_transportista) {
		if(this.id_transportista!=newid_transportista) {

			this.id_transportista=newid_transportista;
		}
	}
    
	public void setid_tipo_cambio(Long newid_tipo_cambio) {
		if(this.id_tipo_cambio!=newid_tipo_cambio) {

			this.id_tipo_cambio=newid_tipo_cambio;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_zona(Long newid_zona) {
		if(this.id_zona!=newid_zona) {

			this.id_zona=newid_zona;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSubCliente() {
		return isBusquedaDesdeForeignKeySesionSubCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionSubCliente(
		Boolean isBusquedaDesdeForeignKeySesionSubCliente) {
		this.isBusquedaDesdeForeignKeySesionSubCliente = isBusquedaDesdeForeignKeySesionSubCliente;
	}

	public Long getlidSubClienteActual() {
		return lidSubClienteActual;
	}

	public void setlidSubClienteActual(Long lidSubClienteActual) {
		this.lidSubClienteActual = lidSubClienteActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionConsultor() {
		return isBusquedaDesdeForeignKeySesionConsultor;
	}

	public void setisBusquedaDesdeForeignKeySesionConsultor(
		Boolean isBusquedaDesdeForeignKeySesionConsultor) {
		this.isBusquedaDesdeForeignKeySesionConsultor = isBusquedaDesdeForeignKeySesionConsultor;
	}

	public Long getlidConsultorActual() {
		return lidConsultorActual;
	}

	public void setlidConsultorActual(Long lidConsultorActual) {
		this.lidConsultorActual = lidConsultorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionResponsable() {
		return isBusquedaDesdeForeignKeySesionResponsable;
	}

	public void setisBusquedaDesdeForeignKeySesionResponsable(
		Boolean isBusquedaDesdeForeignKeySesionResponsable) {
		this.isBusquedaDesdeForeignKeySesionResponsable = isBusquedaDesdeForeignKeySesionResponsable;
	}

	public Long getlidResponsableActual() {
		return lidResponsableActual;
	}

	public void setlidResponsableActual(Long lidResponsableActual) {
		this.lidResponsableActual = lidResponsableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedido() {
		return isBusquedaDesdeForeignKeySesionEstadoPedido;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedido(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedido) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedido = isBusquedaDesdeForeignKeySesionEstadoPedido;
	}

	public Long getlidEstadoPedidoActual() {
		return lidEstadoPedidoActual;
	}

	public void setlidEstadoPedidoActual(Long lidEstadoPedidoActual) {
		this.lidEstadoPedidoActual = lidEstadoPedidoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransporte() {
		return isBusquedaDesdeForeignKeySesionTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTransporte) {
		this.isBusquedaDesdeForeignKeySesionTransporte = isBusquedaDesdeForeignKeySesionTransporte;
	}

	public Long getlidTransporteActual() {
		return lidTransporteActual;
	}

	public void setlidTransporteActual(Long lidTransporteActual) {
		this.lidTransporteActual = lidTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionRutaTransporte() {
		return isBusquedaDesdeForeignKeySesionRutaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionRutaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionRutaTransporte) {
		this.isBusquedaDesdeForeignKeySesionRutaTransporte = isBusquedaDesdeForeignKeySesionRutaTransporte;
	}

	public Long getlidRutaTransporteActual() {
		return lidRutaTransporteActual;
	}

	public void setlidRutaTransporteActual(Long lidRutaTransporteActual) {
		this.lidRutaTransporteActual = lidRutaTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoLlamada() {
		return isBusquedaDesdeForeignKeySesionTipoLlamada;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoLlamada(
		Boolean isBusquedaDesdeForeignKeySesionTipoLlamada) {
		this.isBusquedaDesdeForeignKeySesionTipoLlamada = isBusquedaDesdeForeignKeySesionTipoLlamada;
	}

	public Long getlidTipoLlamadaActual() {
		return lidTipoLlamadaActual;
	}

	public void setlidTipoLlamadaActual(Long lidTipoLlamadaActual) {
		this.lidTipoLlamadaActual = lidTipoLlamadaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransportista() {
		return isBusquedaDesdeForeignKeySesionTransportista;
	}

	public void setisBusquedaDesdeForeignKeySesionTransportista(
		Boolean isBusquedaDesdeForeignKeySesionTransportista) {
		this.isBusquedaDesdeForeignKeySesionTransportista = isBusquedaDesdeForeignKeySesionTransportista;
	}

	public Long getlidTransportistaActual() {
		return lidTransportistaActual;
	}

	public void setlidTransportistaActual(Long lidTransportistaActual) {
		this.lidTransportistaActual = lidTransportistaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionZona() {
		return isBusquedaDesdeForeignKeySesionZona;
	}

	public void setisBusquedaDesdeForeignKeySesionZona(
		Boolean isBusquedaDesdeForeignKeySesionZona) {
		this.isBusquedaDesdeForeignKeySesionZona = isBusquedaDesdeForeignKeySesionZona;
	}

	public Long getlidZonaActual() {
		return lidZonaActual;
	}

	public void setlidZonaActual(Long lidZonaActual) {
		this.lidZonaActual = lidZonaActual;
	}
	
	
		
	
}
