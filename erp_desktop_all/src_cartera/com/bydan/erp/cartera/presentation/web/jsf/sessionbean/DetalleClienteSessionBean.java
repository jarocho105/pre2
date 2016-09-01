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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class DetalleClienteSessionBean  extends DetalleClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente;
	protected Long lIdDetalleClienteActualForeignKey;	
	
	protected Long lIdDetalleClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras;
	protected String sUltimaBusquedaDetalleCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursalMovimiento;
	Long lidSucursalMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoDetalleCliente;
	Long lidEstadoDetalleClienteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_modulo;
	private Long id_asiento_contable;
	private Long id_cliente;
	private Long id_transaccion;
	private Long id_factura;
	private Date fecha_vence;
	private Date fecha_venceFinal;
	private Long id_moneda;
	private Long id_sucursal_movimiento;
	private Long id_tipo_transaccion_modulo;
	private Date fecha_emision;
	private Date fecha_emisionFinal;
	private Long id_estado_detalle_cliente;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleClienteSessionBeanAdditional detalleclienteSessionBeanAdditional=null;
	
	public DetalleClienteSessionBeanAdditional getDetalleClienteSessionBeanAdditional() {
		return this.detalleclienteSessionBeanAdditional;
	}
	
	public void setDetalleClienteSessionBeanAdditional(DetalleClienteSessionBeanAdditional detalleclienteSessionBeanAdditional) {
		try {
			this.detalleclienteSessionBeanAdditional=detalleclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleClienteSessionBean () {
		this.inicializarDetalleClienteSessionBean();
	}
	
	public void inicializarDetalleClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente=false;
		this.lIdDetalleClienteActualForeignKey=0L;
		this.lIdDetalleClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleCliente ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursalMovimiento=false;
		lidSucursalMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoDetalleCliente=false;
		lidEstadoDetalleClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_modulo=-1L;
 		this.id_asiento_contable=-1L;
 		this.id_cliente=-1L;
 		this.id_transaccion=-1L;
 		this.id_factura=-1L;
 		this.fecha_vence=new Date();
		this.fecha_venceFinal=new Date();
 		this.id_moneda=-1L;
 		this.id_sucursal_movimiento=-1L;
 		this.id_tipo_transaccion_modulo=null;
 		this.fecha_emision=new Date();
		this.fecha_emisionFinal=new Date();
 		this.id_estado_detalle_cliente=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente= isPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente= isBusquedaDesdeForeignKeySesionForeignKeyDetalleCliente;
	}
					
	public Long getlIdDetalleClienteActualForeignKey() {
		return lIdDetalleClienteActualForeignKey;
	}

	public void setlIdDetalleClienteActualForeignKey(
			Long lIdDetalleClienteActualForeignKey) {
		this.lIdDetalleClienteActualForeignKey = lIdDetalleClienteActualForeignKey;
	}
				    
	public Long getlIdDetalleClienteActualForeignKeyParaPosibleAtras() {
		return lIdDetalleClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleClienteActualForeignKeyParaPosibleAtras(
			Long lIdDetalleClienteActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleClienteActualForeignKeyParaPosibleAtras = lIdDetalleClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleCliente() {
		return sUltimaBusquedaDetalleCliente;
	}

	public void setsUltimaBusquedaDetalleCliente(String sUltimaBusquedaDetalleCliente) {
		this.sUltimaBusquedaDetalleCliente = sUltimaBusquedaDetalleCliente;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Date getfecha_vence() {
		return this.fecha_vence;
	}
		
	public Date getfecha_venceFinal() {
		return this.fecha_venceFinal;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_sucursal_movimiento() {
		return this.id_sucursal_movimiento;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
    
	public Date getfecha_emision() {
		return this.fecha_emision;
	}
		
	public Date getfecha_emisionFinal() {
		return this.fecha_emisionFinal;
	}
    
	public Long getid_estado_detalle_cliente() {
		return this.id_estado_detalle_cliente;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_periodo");
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
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable)throws Exception
	{
		try {
			if(this.id_asiento_contable!=newid_asiento_contable) {
				if(newid_asiento_contable==null) {
					//newid_asiento_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_asiento_contable");
					}
				}

				this.id_asiento_contable=newid_asiento_contable;
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion(Long newid_transaccion)throws Exception
	{
		try {
			if(this.id_transaccion!=newid_transaccion) {
				if(newid_transaccion==null) {
					//newid_transaccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura(Long newid_factura)throws Exception
	{
		try {
			if(this.id_factura!=newid_factura) {
				if(newid_factura==null) {
					//newid_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_vence(Date newfecha_vence)throws Exception
	{
		try {
			if(this.fecha_vence!=newfecha_vence) {
				if(newfecha_vence==null) {
					//newfecha_vence=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna fecha_vence");
					}
				}

				this.fecha_vence=newfecha_vence;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setfecha_venceFinal(Date newfecha_venceFinal)throws Exception
	{
		try {
			if(this.fecha_venceFinal!=newfecha_venceFinal) {
				if(newfecha_venceFinal==null) {
					//newfecha_venceFinal=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleClienteFinal:Valor nulo no permitido en columna fecha_venceFinal");
					}
				}

				this.fecha_venceFinal=newfecha_venceFinal;
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
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal_movimiento(Long newid_sucursal_movimiento)throws Exception
	{
		try {
			if(this.id_sucursal_movimiento!=newid_sucursal_movimiento) {
				if(newid_sucursal_movimiento==null) {
					//newid_sucursal_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_sucursal_movimiento");
					}
				}

				this.id_sucursal_movimiento=newid_sucursal_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo) {
		if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {

			this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
		}
	}
    
	public void setfecha_emision(Date newfecha_emision)throws Exception
	{
		try {
			if(this.fecha_emision!=newfecha_emision) {
				if(newfecha_emision==null) {
					//newfecha_emision=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna fecha_emision");
					}
				}

				this.fecha_emision=newfecha_emision;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setfecha_emisionFinal(Date newfecha_emisionFinal)throws Exception
	{
		try {
			if(this.fecha_emisionFinal!=newfecha_emisionFinal) {
				if(newfecha_emisionFinal==null) {
					//newfecha_emisionFinal=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleClienteFinal:Valor nulo no permitido en columna fecha_emisionFinal");
					}
				}

				this.fecha_emisionFinal=newfecha_emisionFinal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_detalle_cliente(Long newid_estado_detalle_cliente)throws Exception
	{
		try {
			if(this.id_estado_detalle_cliente!=newid_estado_detalle_cliente) {
				if(newid_estado_detalle_cliente==null) {
					//newid_estado_detalle_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCliente:Valor nulo no permitido en columna id_estado_detalle_cliente");
					}
				}

				this.id_estado_detalle_cliente=newid_estado_detalle_cliente;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion() {
		return isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion) {
		this.isBusquedaDesdeForeignKeySesionTransaccion = isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public Long getlidTransaccionActual() {
		return lidTransaccionActual;
	}

	public void setlidTransaccionActual(Long lidTransaccionActual) {
		this.lidTransaccionActual = lidTransaccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFactura() {
		return isBusquedaDesdeForeignKeySesionFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionFactura(
		Boolean isBusquedaDesdeForeignKeySesionFactura) {
		this.isBusquedaDesdeForeignKeySesionFactura = isBusquedaDesdeForeignKeySesionFactura;
	}

	public Long getlidFacturaActual() {
		return lidFacturaActual;
	}

	public void setlidFacturaActual(Long lidFacturaActual) {
		this.lidFacturaActual = lidFacturaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursalMovimiento() {
		return isBusquedaDesdeForeignKeySesionSucursalMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursalMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionSucursalMovimiento) {
		this.isBusquedaDesdeForeignKeySesionSucursalMovimiento = isBusquedaDesdeForeignKeySesionSucursalMovimiento;
	}

	public Long getlidSucursalMovimientoActual() {
		return lidSucursalMovimientoActual;
	}

	public void setlidSucursalMovimientoActual(Long lidSucursalMovimientoActual) {
		this.lidSucursalMovimientoActual = lidSucursalMovimientoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoDetalleCliente() {
		return isBusquedaDesdeForeignKeySesionEstadoDetalleCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(
		Boolean isBusquedaDesdeForeignKeySesionEstadoDetalleCliente) {
		this.isBusquedaDesdeForeignKeySesionEstadoDetalleCliente = isBusquedaDesdeForeignKeySesionEstadoDetalleCliente;
	}

	public Long getlidEstadoDetalleClienteActual() {
		return lidEstadoDetalleClienteActual;
	}

	public void setlidEstadoDetalleClienteActual(Long lidEstadoDetalleClienteActual) {
		this.lidEstadoDetalleClienteActual = lidEstadoDetalleClienteActual;
	}
	
	
		
	
}
