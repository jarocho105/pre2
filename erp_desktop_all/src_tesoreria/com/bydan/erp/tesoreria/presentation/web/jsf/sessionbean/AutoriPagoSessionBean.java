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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class AutoriPagoSessionBean  extends AutoriPagoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago;
	protected Long lIdAutoriPagoActualForeignKey;	
	
	protected Long lIdAutoriPagoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras;
	protected String sUltimaBusquedaAutoriPago;
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
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroActividad;
	Long lidCentroActividadActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaBanco;
	Long lidCuentaBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleProve;
	Long lidDetalleProveActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_cliente;
	private Long id_factura;
	private Long id_asiento_contable;
	private Long id_centro_costo;
	private Long id_centro_actividad;
	private Long id_banco;
	private Long id_cuenta_banco;
	private Long id_detalle_prove;
	private Long id_transaccion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AutoriPagoSessionBeanAdditional autoripagoSessionBeanAdditional=null;
	
	public AutoriPagoSessionBeanAdditional getAutoriPagoSessionBeanAdditional() {
		return this.autoripagoSessionBeanAdditional;
	}
	
	public void setAutoriPagoSessionBeanAdditional(AutoriPagoSessionBeanAdditional autoripagoSessionBeanAdditional) {
		try {
			this.autoripagoSessionBeanAdditional=autoripagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AutoriPagoSessionBean () {
		this.inicializarAutoriPagoSessionBean();
	}
	
	public void inicializarAutoriPagoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago=false;
		this.lIdAutoriPagoActualForeignKey=0L;
		this.lIdAutoriPagoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras=false;
		this.sUltimaBusquedaAutoriPago ="";
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
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCentroActividad=false;
		lidCentroActividadActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaBanco=false;
		lidCuentaBancoActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleProve=false;
		lidDetalleProveActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_cliente=-1L;
 		this.id_factura=-1L;
 		this.id_asiento_contable=-1L;
 		this.id_centro_costo=null;
 		this.id_centro_actividad=null;
 		this.id_banco=-1L;
 		this.id_cuenta_banco=-1L;
 		this.id_detalle_prove=-1L;
 		this.id_transaccion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAutoriPago() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAutoriPago(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago= isPermiteNavegacionHaciaForeignKeyDesdeAutoriPago;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago = sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriPago() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriPago(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago= isBusquedaDesdeForeignKeySesionForeignKeyAutoriPago;
	}
					
	public Long getlIdAutoriPagoActualForeignKey() {
		return lIdAutoriPagoActualForeignKey;
	}

	public void setlIdAutoriPagoActualForeignKey(
			Long lIdAutoriPagoActualForeignKey) {
		this.lIdAutoriPagoActualForeignKey = lIdAutoriPagoActualForeignKey;
	}
				    
	public Long getlIdAutoriPagoActualForeignKeyParaPosibleAtras() {
		return lIdAutoriPagoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAutoriPagoActualForeignKeyParaPosibleAtras(
			Long lIdAutoriPagoActualForeignKeyParaPosibleAtras) {
		this.lIdAutoriPagoActualForeignKeyParaPosibleAtras = lIdAutoriPagoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAutoriPagoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAutoriPago() {
		return sUltimaBusquedaAutoriPago;
	}

	public void setsUltimaBusquedaAutoriPago(String sUltimaBusquedaAutoriPago) {
		this.sUltimaBusquedaAutoriPago = sUltimaBusquedaAutoriPago;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_centro_actividad() {
		return this.id_centro_actividad;
	}
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_cuenta_banco() {
		return this.id_cuenta_banco;
	}
    
	public Long getid_detalle_prove() {
		return this.id_detalle_prove;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriPago:Valor nulo no permitido en columna id");
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_asiento_contable");
					}
				}

				this.id_asiento_contable=newid_asiento_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_centro_actividad(Long newid_centro_actividad) {
		if(this.id_centro_actividad!=newid_centro_actividad) {

			this.id_centro_actividad=newid_centro_actividad;
		}
	}
    
	public void setid_banco(Long newid_banco)throws Exception
	{
		try {
			if(this.id_banco!=newid_banco) {
				if(newid_banco==null) {
					//newid_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_banco(Long newid_cuenta_banco)throws Exception
	{
		try {
			if(this.id_cuenta_banco!=newid_cuenta_banco) {
				if(newid_cuenta_banco==null) {
					//newid_cuenta_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_cuenta_banco");
					}
				}

				this.id_cuenta_banco=newid_cuenta_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_prove(Long newid_detalle_prove)throws Exception
	{
		try {
			if(this.id_detalle_prove!=newid_detalle_prove) {
				if(newid_detalle_prove==null) {
					//newid_detalle_prove=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_detalle_prove");
					}
				}

				this.id_detalle_prove=newid_detalle_prove;
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
						System.out.println("AutoriPago:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroActividad() {
		return isBusquedaDesdeForeignKeySesionCentroActividad;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroActividad(
		Boolean isBusquedaDesdeForeignKeySesionCentroActividad) {
		this.isBusquedaDesdeForeignKeySesionCentroActividad = isBusquedaDesdeForeignKeySesionCentroActividad;
	}

	public Long getlidCentroActividadActual() {
		return lidCentroActividadActual;
	}

	public void setlidCentroActividadActual(Long lidCentroActividadActual) {
		this.lidCentroActividadActual = lidCentroActividadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBanco() {
		return isBusquedaDesdeForeignKeySesionBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionBanco(
		Boolean isBusquedaDesdeForeignKeySesionBanco) {
		this.isBusquedaDesdeForeignKeySesionBanco = isBusquedaDesdeForeignKeySesionBanco;
	}

	public Long getlidBancoActual() {
		return lidBancoActual;
	}

	public void setlidBancoActual(Long lidBancoActual) {
		this.lidBancoActual = lidBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaBanco(
		Boolean isBusquedaDesdeForeignKeySesionCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionCuentaBanco = isBusquedaDesdeForeignKeySesionCuentaBanco;
	}

	public Long getlidCuentaBancoActual() {
		return lidCuentaBancoActual;
	}

	public void setlidCuentaBancoActual(Long lidCuentaBancoActual) {
		this.lidCuentaBancoActual = lidCuentaBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleProve() {
		return isBusquedaDesdeForeignKeySesionDetalleProve;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleProve(
		Boolean isBusquedaDesdeForeignKeySesionDetalleProve) {
		this.isBusquedaDesdeForeignKeySesionDetalleProve = isBusquedaDesdeForeignKeySesionDetalleProve;
	}

	public Long getlidDetalleProveActual() {
		return lidDetalleProveActual;
	}

	public void setlidDetalleProveActual(Long lidDetalleProveActual) {
		this.lidDetalleProveActual = lidDetalleProveActual;
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
	
	
		
	
}
