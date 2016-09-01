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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class ParametroCompraSessionBean  extends ParametroCompraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra;
	protected Long lIdParametroCompraActualForeignKey;	
	
	protected Long lIdParametroCompraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras;
	protected String sUltimaBusquedaParametroCompra;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaReserva;
	Long lidBodegaReservaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmbarcador;
	Long lidEmbarcadorActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	Long lidTipoMovimientoModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoPedido;
	Long lidFormatoPedidoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente;
	Long lidEstadoPedidoPendienteActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoCotizacion;
	Long lidFormatoCotizacionActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado;
	Long lidEstadoPedidoCotizadoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoAutorizacion;
	Long lidFormatoAutorizacionActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado;
	Long lidEstadoPedidoAutorizadoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoItem;
	Long lidFormatoItemActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado;
	Long lidEstadoPedidoAnuladoActual;
	Boolean isBusquedaDesdeForeignKeySesionPrioridadPedido;
	Long lidPrioridadPedidoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido;
	Long lidEstadoPedidoSuspendidoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado;
	Long lidEstadoPedidoRegularizadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_documento;
	private Long id_tipo_movimiento;
	private Long id_bodega;
	private Long id_bodega_reserva;
	private Long id_empleado;
	private Long id_embarcador;
	private Long id_modulo;
	private Long id_tipo_movimiento_modulo;
	private Long id_formato_pedido;
	private Long id_estado_pedido_pendiente;
	private Long id_formato_cotizacion;
	private Long id_estado_pedido_cotizado;
	private Long id_formato_autorizacion;
	private Long id_estado_pedido_autorizado;
	private Long id_formato_item;
	private Long id_estado_pedido_anulado;
	private Long id_prioridad_pedido;
	private Long id_estado_pedido_suspendido;
	private Long id_estado_pedido_regularizado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroCompraSessionBeanAdditional parametrocompraSessionBeanAdditional=null;
	
	public ParametroCompraSessionBeanAdditional getParametroCompraSessionBeanAdditional() {
		return this.parametrocompraSessionBeanAdditional;
	}
	
	public void setParametroCompraSessionBeanAdditional(ParametroCompraSessionBeanAdditional parametrocompraSessionBeanAdditional) {
		try {
			this.parametrocompraSessionBeanAdditional=parametrocompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroCompraSessionBean () {
		this.inicializarParametroCompraSessionBean();
	}
	
	public void inicializarParametroCompraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra=false;
		this.lIdParametroCompraActualForeignKey=0L;
		this.lIdParametroCompraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras=false;
		this.sUltimaBusquedaParametroCompra ="";
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
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaReserva=false;
		lidBodegaReservaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionEmbarcador=false;
		lidEmbarcadorActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimientoModulo=false;
		lidTipoMovimientoModuloActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoPedido=false;
		lidFormatoPedidoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente=false;
		lidEstadoPedidoPendienteActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoCotizacion=false;
		lidFormatoCotizacionActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado=false;
		lidEstadoPedidoCotizadoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoAutorizacion=false;
		lidFormatoAutorizacionActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado=false;
		lidEstadoPedidoAutorizadoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoItem=false;
		lidFormatoItemActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado=false;
		lidEstadoPedidoAnuladoActual=0L;
		isBusquedaDesdeForeignKeySesionPrioridadPedido=false;
		lidPrioridadPedidoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido=false;
		lidEstadoPedidoSuspendidoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado=false;
		lidEstadoPedidoRegularizadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_documento=-1L;
 		this.id_tipo_movimiento=-1L;
 		this.id_bodega=-1L;
 		this.id_bodega_reserva=-1L;
 		this.id_empleado=-1L;
 		this.id_embarcador=-1L;
 		this.id_modulo=-1L;
 		this.id_tipo_movimiento_modulo=-1L;
 		this.id_formato_pedido=-1L;
 		this.id_estado_pedido_pendiente=-1L;
 		this.id_formato_cotizacion=-1L;
 		this.id_estado_pedido_cotizado=-1L;
 		this.id_formato_autorizacion=-1L;
 		this.id_estado_pedido_autorizado=-1L;
 		this.id_formato_item=-1L;
 		this.id_estado_pedido_anulado=-1L;
 		this.id_prioridad_pedido=-1L;
 		this.id_estado_pedido_suspendido=-1L;
 		this.id_estado_pedido_regularizado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroCompra() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroCompra(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra= isPermiteNavegacionHaciaForeignKeyDesdeParametroCompra;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroCompra() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroCompra(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra= isBusquedaDesdeForeignKeySesionForeignKeyParametroCompra;
	}
					
	public Long getlIdParametroCompraActualForeignKey() {
		return lIdParametroCompraActualForeignKey;
	}

	public void setlIdParametroCompraActualForeignKey(
			Long lIdParametroCompraActualForeignKey) {
		this.lIdParametroCompraActualForeignKey = lIdParametroCompraActualForeignKey;
	}
				    
	public Long getlIdParametroCompraActualForeignKeyParaPosibleAtras() {
		return lIdParametroCompraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroCompraActualForeignKeyParaPosibleAtras(
			Long lIdParametroCompraActualForeignKeyParaPosibleAtras) {
		this.lIdParametroCompraActualForeignKeyParaPosibleAtras = lIdParametroCompraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroCompraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroCompra() {
		return sUltimaBusquedaParametroCompra;
	}

	public void setsUltimaBusquedaParametroCompra(String sUltimaBusquedaParametroCompra) {
		this.sUltimaBusquedaParametroCompra = sUltimaBusquedaParametroCompra;
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
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_bodega_reserva() {
		return this.id_bodega_reserva;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_embarcador() {
		return this.id_embarcador;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_tipo_movimiento_modulo() {
		return this.id_tipo_movimiento_modulo;
	}
    
	public Long getid_formato_pedido() {
		return this.id_formato_pedido;
	}
    
	public Long getid_estado_pedido_pendiente() {
		return this.id_estado_pedido_pendiente;
	}
    
	public Long getid_formato_cotizacion() {
		return this.id_formato_cotizacion;
	}
    
	public Long getid_estado_pedido_cotizado() {
		return this.id_estado_pedido_cotizado;
	}
    
	public Long getid_formato_autorizacion() {
		return this.id_formato_autorizacion;
	}
    
	public Long getid_estado_pedido_autorizado() {
		return this.id_estado_pedido_autorizado;
	}
    
	public Long getid_formato_item() {
		return this.id_formato_item;
	}
    
	public Long getid_estado_pedido_anulado() {
		return this.id_estado_pedido_anulado;
	}
    
	public Long getid_prioridad_pedido() {
		return this.id_prioridad_pedido;
	}
    
	public Long getid_estado_pedido_suspendido() {
		return this.id_estado_pedido_suspendido;
	}
    
	public Long getid_estado_pedido_regularizado() {
		return this.id_estado_pedido_regularizado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento)throws Exception
	{
		try {
			if(this.id_tipo_movimiento!=newid_tipo_movimiento) {
				if(newid_tipo_movimiento==null) {
					//newid_tipo_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_reserva(Long newid_bodega_reserva)throws Exception
	{
		try {
			if(this.id_bodega_reserva!=newid_bodega_reserva) {
				if(newid_bodega_reserva==null) {
					//newid_bodega_reserva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_bodega_reserva");
					}
				}

				this.id_bodega_reserva=newid_bodega_reserva;
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
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_embarcador");
					}
				}

				this.id_embarcador=newid_embarcador;
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
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento_modulo(Long newid_tipo_movimiento_modulo)throws Exception
	{
		try {
			if(this.id_tipo_movimiento_modulo!=newid_tipo_movimiento_modulo) {
				if(newid_tipo_movimiento_modulo==null) {
					//newid_tipo_movimiento_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_tipo_movimiento_modulo");
					}
				}

				this.id_tipo_movimiento_modulo=newid_tipo_movimiento_modulo;
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
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_formato_pedido");
					}
				}

				this.id_formato_pedido=newid_formato_pedido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_pendiente(Long newid_estado_pedido_pendiente)throws Exception
	{
		try {
			if(this.id_estado_pedido_pendiente!=newid_estado_pedido_pendiente) {
				if(newid_estado_pedido_pendiente==null) {
					//newid_estado_pedido_pendiente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_pendiente");
					}
				}

				this.id_estado_pedido_pendiente=newid_estado_pedido_pendiente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_cotizacion(Long newid_formato_cotizacion)throws Exception
	{
		try {
			if(this.id_formato_cotizacion!=newid_formato_cotizacion) {
				if(newid_formato_cotizacion==null) {
					//newid_formato_cotizacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_formato_cotizacion");
					}
				}

				this.id_formato_cotizacion=newid_formato_cotizacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_cotizado(Long newid_estado_pedido_cotizado)throws Exception
	{
		try {
			if(this.id_estado_pedido_cotizado!=newid_estado_pedido_cotizado) {
				if(newid_estado_pedido_cotizado==null) {
					//newid_estado_pedido_cotizado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_cotizado");
					}
				}

				this.id_estado_pedido_cotizado=newid_estado_pedido_cotizado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_autorizacion(Long newid_formato_autorizacion)throws Exception
	{
		try {
			if(this.id_formato_autorizacion!=newid_formato_autorizacion) {
				if(newid_formato_autorizacion==null) {
					//newid_formato_autorizacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_formato_autorizacion");
					}
				}

				this.id_formato_autorizacion=newid_formato_autorizacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_autorizado(Long newid_estado_pedido_autorizado)throws Exception
	{
		try {
			if(this.id_estado_pedido_autorizado!=newid_estado_pedido_autorizado) {
				if(newid_estado_pedido_autorizado==null) {
					//newid_estado_pedido_autorizado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_autorizado");
					}
				}

				this.id_estado_pedido_autorizado=newid_estado_pedido_autorizado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_item(Long newid_formato_item)throws Exception
	{
		try {
			if(this.id_formato_item!=newid_formato_item) {
				if(newid_formato_item==null) {
					//newid_formato_item=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_formato_item");
					}
				}

				this.id_formato_item=newid_formato_item;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_anulado(Long newid_estado_pedido_anulado)throws Exception
	{
		try {
			if(this.id_estado_pedido_anulado!=newid_estado_pedido_anulado) {
				if(newid_estado_pedido_anulado==null) {
					//newid_estado_pedido_anulado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_anulado");
					}
				}

				this.id_estado_pedido_anulado=newid_estado_pedido_anulado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_prioridad_pedido(Long newid_prioridad_pedido)throws Exception
	{
		try {
			if(this.id_prioridad_pedido!=newid_prioridad_pedido) {
				if(newid_prioridad_pedido==null) {
					//newid_prioridad_pedido=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_prioridad_pedido");
					}
				}

				this.id_prioridad_pedido=newid_prioridad_pedido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_suspendido(Long newid_estado_pedido_suspendido)throws Exception
	{
		try {
			if(this.id_estado_pedido_suspendido!=newid_estado_pedido_suspendido) {
				if(newid_estado_pedido_suspendido==null) {
					//newid_estado_pedido_suspendido=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_suspendido");
					}
				}

				this.id_estado_pedido_suspendido=newid_estado_pedido_suspendido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_pedido_regularizado(Long newid_estado_pedido_regularizado)throws Exception
	{
		try {
			if(this.id_estado_pedido_regularizado!=newid_estado_pedido_regularizado) {
				if(newid_estado_pedido_regularizado==null) {
					//newid_estado_pedido_regularizado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCompra:Valor nulo no permitido en columna id_estado_pedido_regularizado");
					}
				}

				this.id_estado_pedido_regularizado=newid_estado_pedido_regularizado;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodega() {
		return isBusquedaDesdeForeignKeySesionBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionBodega(
		Boolean isBusquedaDesdeForeignKeySesionBodega) {
		this.isBusquedaDesdeForeignKeySesionBodega = isBusquedaDesdeForeignKeySesionBodega;
	}

	public Long getlidBodegaActual() {
		return lidBodegaActual;
	}

	public void setlidBodegaActual(Long lidBodegaActual) {
		this.lidBodegaActual = lidBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaReserva() {
		return isBusquedaDesdeForeignKeySesionBodegaReserva;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaReserva(
		Boolean isBusquedaDesdeForeignKeySesionBodegaReserva) {
		this.isBusquedaDesdeForeignKeySesionBodegaReserva = isBusquedaDesdeForeignKeySesionBodegaReserva;
	}

	public Long getlidBodegaReservaActual() {
		return lidBodegaReservaActual;
	}

	public void setlidBodegaReservaActual(Long lidBodegaReservaActual) {
		this.lidBodegaReservaActual = lidBodegaReservaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo() {
		return isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimientoModulo = isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public Long getlidTipoMovimientoModuloActual() {
		return lidTipoMovimientoModuloActual;
	}

	public void setlidTipoMovimientoModuloActual(Long lidTipoMovimientoModuloActual) {
		this.lidTipoMovimientoModuloActual = lidTipoMovimientoModuloActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoPendiente() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoPendiente(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente = isBusquedaDesdeForeignKeySesionEstadoPedidoPendiente;
	}

	public Long getlidEstadoPedidoPendienteActual() {
		return lidEstadoPedidoPendienteActual;
	}

	public void setlidEstadoPedidoPendienteActual(Long lidEstadoPedidoPendienteActual) {
		this.lidEstadoPedidoPendienteActual = lidEstadoPedidoPendienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoCotizacion() {
		return isBusquedaDesdeForeignKeySesionFormatoCotizacion;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoCotizacion(
		Boolean isBusquedaDesdeForeignKeySesionFormatoCotizacion) {
		this.isBusquedaDesdeForeignKeySesionFormatoCotizacion = isBusquedaDesdeForeignKeySesionFormatoCotizacion;
	}

	public Long getlidFormatoCotizacionActual() {
		return lidFormatoCotizacionActual;
	}

	public void setlidFormatoCotizacionActual(Long lidFormatoCotizacionActual) {
		this.lidFormatoCotizacionActual = lidFormatoCotizacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoCotizado() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoCotizado(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado = isBusquedaDesdeForeignKeySesionEstadoPedidoCotizado;
	}

	public Long getlidEstadoPedidoCotizadoActual() {
		return lidEstadoPedidoCotizadoActual;
	}

	public void setlidEstadoPedidoCotizadoActual(Long lidEstadoPedidoCotizadoActual) {
		this.lidEstadoPedidoCotizadoActual = lidEstadoPedidoCotizadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoAutorizacion() {
		return isBusquedaDesdeForeignKeySesionFormatoAutorizacion;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoAutorizacion(
		Boolean isBusquedaDesdeForeignKeySesionFormatoAutorizacion) {
		this.isBusquedaDesdeForeignKeySesionFormatoAutorizacion = isBusquedaDesdeForeignKeySesionFormatoAutorizacion;
	}

	public Long getlidFormatoAutorizacionActual() {
		return lidFormatoAutorizacionActual;
	}

	public void setlidFormatoAutorizacionActual(Long lidFormatoAutorizacionActual) {
		this.lidFormatoAutorizacionActual = lidFormatoAutorizacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado = isBusquedaDesdeForeignKeySesionEstadoPedidoAutorizado;
	}

	public Long getlidEstadoPedidoAutorizadoActual() {
		return lidEstadoPedidoAutorizadoActual;
	}

	public void setlidEstadoPedidoAutorizadoActual(Long lidEstadoPedidoAutorizadoActual) {
		this.lidEstadoPedidoAutorizadoActual = lidEstadoPedidoAutorizadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoItem() {
		return isBusquedaDesdeForeignKeySesionFormatoItem;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoItem(
		Boolean isBusquedaDesdeForeignKeySesionFormatoItem) {
		this.isBusquedaDesdeForeignKeySesionFormatoItem = isBusquedaDesdeForeignKeySesionFormatoItem;
	}

	public Long getlidFormatoItemActual() {
		return lidFormatoItemActual;
	}

	public void setlidFormatoItemActual(Long lidFormatoItemActual) {
		this.lidFormatoItemActual = lidFormatoItemActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoAnulado() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoAnulado(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado = isBusquedaDesdeForeignKeySesionEstadoPedidoAnulado;
	}

	public Long getlidEstadoPedidoAnuladoActual() {
		return lidEstadoPedidoAnuladoActual;
	}

	public void setlidEstadoPedidoAnuladoActual(Long lidEstadoPedidoAnuladoActual) {
		this.lidEstadoPedidoAnuladoActual = lidEstadoPedidoAnuladoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPrioridadPedido() {
		return isBusquedaDesdeForeignKeySesionPrioridadPedido;
	}

	public void setisBusquedaDesdeForeignKeySesionPrioridadPedido(
		Boolean isBusquedaDesdeForeignKeySesionPrioridadPedido) {
		this.isBusquedaDesdeForeignKeySesionPrioridadPedido = isBusquedaDesdeForeignKeySesionPrioridadPedido;
	}

	public Long getlidPrioridadPedidoActual() {
		return lidPrioridadPedidoActual;
	}

	public void setlidPrioridadPedidoActual(Long lidPrioridadPedidoActual) {
		this.lidPrioridadPedidoActual = lidPrioridadPedidoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido = isBusquedaDesdeForeignKeySesionEstadoPedidoSuspendido;
	}

	public Long getlidEstadoPedidoSuspendidoActual() {
		return lidEstadoPedidoSuspendidoActual;
	}

	public void setlidEstadoPedidoSuspendidoActual(Long lidEstadoPedidoSuspendidoActual) {
		this.lidEstadoPedidoSuspendidoActual = lidEstadoPedidoSuspendidoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado() {
		return isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado) {
		this.isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado = isBusquedaDesdeForeignKeySesionEstadoPedidoRegularizado;
	}

	public Long getlidEstadoPedidoRegularizadoActual() {
		return lidEstadoPedidoRegularizadoActual;
	}

	public void setlidEstadoPedidoRegularizadoActual(Long lidEstadoPedidoRegularizadoActual) {
		this.lidEstadoPedidoRegularizadoActual = lidEstadoPedidoRegularizadoActual;
	}
	
	
		
	
}
