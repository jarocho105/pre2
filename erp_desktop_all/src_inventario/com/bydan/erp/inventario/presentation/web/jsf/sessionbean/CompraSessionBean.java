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
public class CompraSessionBean  extends CompraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCompra;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCompra;
	protected Long lIdCompraActualForeignKey;	
	
	protected Long lIdCompraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras;
	protected String sUltimaBusquedaCompra;
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
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCambio;
	Long lidTipoCambioActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoInventario;
	Long lidEstadoInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransportista;
	Long lidTransportistaActual;
	Boolean isBusquedaDesdeForeignKeySesionOrdenCompra;
	Long lidOrdenCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionPedidoCompra;
	Long lidPedidoCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_usuario;
	private Long id_moneda;
	private Long id_tipo_cambio;
	private Long id_estado_inventario;
	private Long id_cliente;
	private Long id_formato;
	private Long id_empleado;
	private Long id_transportista;
	private Long id_orden_compra;
	private Long id_pedido_compra;
	private Long id_tipo_transaccion_modulo;
	private Long id_asiento_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CompraSessionBeanAdditional compraSessionBeanAdditional=null;
	
	public CompraSessionBeanAdditional getCompraSessionBeanAdditional() {
		return this.compraSessionBeanAdditional;
	}
	
	public void setCompraSessionBeanAdditional(CompraSessionBeanAdditional compraSessionBeanAdditional) {
		try {
			this.compraSessionBeanAdditional=compraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CompraSessionBean () {
		this.inicializarCompraSessionBean();
	}
	
	public void inicializarCompraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCompra=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCompra=false;
		this.lIdCompraActualForeignKey=0L;
		this.lIdCompraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras=false;
		this.sUltimaBusquedaCompra ="";
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
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCambio=false;
		lidTipoCambioActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoInventario=false;
		lidEstadoInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTransportista=false;
		lidTransportistaActual=0L;
		isBusquedaDesdeForeignKeySesionOrdenCompra=false;
		lidOrdenCompraActual=0L;
		isBusquedaDesdeForeignKeySesionPedidoCompra=false;
		lidPedidoCompraActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_usuario=-1L;
 		this.id_moneda=-1L;
 		this.id_tipo_cambio=null;
 		this.id_estado_inventario=-1L;
 		this.id_cliente=-1L;
 		this.id_formato=-1L;
 		this.id_empleado=-1L;
 		this.id_transportista=null;
 		this.id_orden_compra=null;
 		this.id_pedido_compra=null;
 		this.id_tipo_transaccion_modulo=null;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCompra() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCompra;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCompra(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCompra) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCompra= isPermiteNavegacionHaciaForeignKeyDesdeCompra;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCompra() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCompra(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra = sNombrePaginaNavegacionHaciaForeignKeyDesdeCompra;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCompra() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCompra(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCompra) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCompra= isBusquedaDesdeForeignKeySesionForeignKeyCompra;
	}
					
	public Long getlIdCompraActualForeignKey() {
		return lIdCompraActualForeignKey;
	}

	public void setlIdCompraActualForeignKey(
			Long lIdCompraActualForeignKey) {
		this.lIdCompraActualForeignKey = lIdCompraActualForeignKey;
	}
				    
	public Long getlIdCompraActualForeignKeyParaPosibleAtras() {
		return lIdCompraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCompraActualForeignKeyParaPosibleAtras(
			Long lIdCompraActualForeignKeyParaPosibleAtras) {
		this.lIdCompraActualForeignKeyParaPosibleAtras = lIdCompraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCompraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCompra() {
		return sUltimaBusquedaCompra;
	}

	public void setsUltimaBusquedaCompra(String sUltimaBusquedaCompra) {
		this.sUltimaBusquedaCompra = sUltimaBusquedaCompra;
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
    
	public Long getid_tipo_cambio() {
		return this.id_tipo_cambio;
	}
    
	public Long getid_estado_inventario() {
		return this.id_estado_inventario;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_transportista() {
		return this.id_transportista;
	}
    
	public Long getid_orden_compra() {
		return this.id_orden_compra;
	}
    
	public Long getid_pedido_compra() {
		return this.id_pedido_compra;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
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
						System.out.println("Compra:Valor nulo no permitido en columna id");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_modulo");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_periodo");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_usuario");
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
						System.out.println("Compra:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
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
    
	public void setid_estado_inventario(Long newid_estado_inventario)throws Exception
	{
		try {
			if(this.id_estado_inventario!=newid_estado_inventario) {
				if(newid_estado_inventario==null) {
					//newid_estado_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Compra:Valor nulo no permitido en columna id_estado_inventario");
					}
				}

				this.id_estado_inventario=newid_estado_inventario;
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
						System.out.println("Compra:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("Compra:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
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
						System.out.println("Compra:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transportista(Long newid_transportista) {
		if(this.id_transportista!=newid_transportista) {

			this.id_transportista=newid_transportista;
		}
	}
    
	public void setid_orden_compra(Long newid_orden_compra) {
		if(this.id_orden_compra!=newid_orden_compra) {

			this.id_orden_compra=newid_orden_compra;
		}
	}
    
	public void setid_pedido_compra(Long newid_pedido_compra) {
		if(this.id_pedido_compra!=newid_pedido_compra) {

			this.id_pedido_compra=newid_pedido_compra;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo) {
		if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {

			this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoInventario() {
		return isBusquedaDesdeForeignKeySesionEstadoInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoInventario(
		Boolean isBusquedaDesdeForeignKeySesionEstadoInventario) {
		this.isBusquedaDesdeForeignKeySesionEstadoInventario = isBusquedaDesdeForeignKeySesionEstadoInventario;
	}

	public Long getlidEstadoInventarioActual() {
		return lidEstadoInventarioActual;
	}

	public void setlidEstadoInventarioActual(Long lidEstadoInventarioActual) {
		this.lidEstadoInventarioActual = lidEstadoInventarioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionOrdenCompra() {
		return isBusquedaDesdeForeignKeySesionOrdenCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionOrdenCompra(
		Boolean isBusquedaDesdeForeignKeySesionOrdenCompra) {
		this.isBusquedaDesdeForeignKeySesionOrdenCompra = isBusquedaDesdeForeignKeySesionOrdenCompra;
	}

	public Long getlidOrdenCompraActual() {
		return lidOrdenCompraActual;
	}

	public void setlidOrdenCompraActual(Long lidOrdenCompraActual) {
		this.lidOrdenCompraActual = lidOrdenCompraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPedidoCompra() {
		return isBusquedaDesdeForeignKeySesionPedidoCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionPedidoCompra(
		Boolean isBusquedaDesdeForeignKeySesionPedidoCompra) {
		this.isBusquedaDesdeForeignKeySesionPedidoCompra = isBusquedaDesdeForeignKeySesionPedidoCompra;
	}

	public Long getlidPedidoCompraActual() {
		return lidPedidoCompraActual;
	}

	public void setlidPedidoCompraActual(Long lidPedidoCompraActual) {
		this.lidPedidoCompraActual = lidPedidoCompraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo() {
		return isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTransaccionModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoTransaccionModulo = isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public Long getlidTipoTransaccionModuloActual() {
		return lidTipoTransaccionModuloActual;
	}

	public void setlidTipoTransaccionModuloActual(Long lidTipoTransaccionModuloActual) {
		this.lidTipoTransaccionModuloActual = lidTipoTransaccionModuloActual;
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
