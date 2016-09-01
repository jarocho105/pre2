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
public class ServicioTransporteSessionBean  extends ServicioTransporteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte;
	protected Long lIdServicioTransporteActualForeignKey;	
	
	protected Long lIdServicioTransporteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras;
	protected String sUltimaBusquedaServicioTransporte;
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
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteProveedor;
	Long lidClienteProveedorActual;
	Boolean isBusquedaDesdeForeignKeySesionTransportista;
	Long lidTransportistaActual;
	Boolean isBusquedaDesdeForeignKeySesionVehiculo;
	Long lidVehiculoActual;
	Boolean isBusquedaDesdeForeignKeySesionRutaTransporte;
	Long lidRutaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	Long lidDetalleActivoFijoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_cliente;
	private Long id_cliente_proveedor;
	private Long id_transportista;
	private Long id_vehiculo;
	private Long id_ruta_transporte;
	private Long id_detalle_activo_fijo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ServicioTransporteSessionBeanAdditional serviciotransporteSessionBeanAdditional=null;
	
	public ServicioTransporteSessionBeanAdditional getServicioTransporteSessionBeanAdditional() {
		return this.serviciotransporteSessionBeanAdditional;
	}
	
	public void setServicioTransporteSessionBeanAdditional(ServicioTransporteSessionBeanAdditional serviciotransporteSessionBeanAdditional) {
		try {
			this.serviciotransporteSessionBeanAdditional=serviciotransporteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ServicioTransporteSessionBean () {
		this.inicializarServicioTransporteSessionBean();
	}
	
	public void inicializarServicioTransporteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte=false;
		this.lIdServicioTransporteActualForeignKey=0L;
		this.lIdServicioTransporteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras=false;
		this.sUltimaBusquedaServicioTransporte ="";
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
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionClienteProveedor=false;
		lidClienteProveedorActual=0L;
		isBusquedaDesdeForeignKeySesionTransportista=false;
		lidTransportistaActual=0L;
		isBusquedaDesdeForeignKeySesionVehiculo=false;
		lidVehiculoActual=0L;
		isBusquedaDesdeForeignKeySesionRutaTransporte=false;
		lidRutaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleActivoFijo=false;
		lidDetalleActivoFijoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_cliente=-1L;
 		this.id_cliente_proveedor=-1L;
 		this.id_transportista=-1L;
 		this.id_vehiculo=-1L;
 		this.id_ruta_transporte=-1L;
 		this.id_detalle_activo_fijo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte= isPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte(String sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte = sNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte() {
		return isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte= isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporte;
	}
					
	public Long getlIdServicioTransporteActualForeignKey() {
		return lIdServicioTransporteActualForeignKey;
	}

	public void setlIdServicioTransporteActualForeignKey(
			Long lIdServicioTransporteActualForeignKey) {
		this.lIdServicioTransporteActualForeignKey = lIdServicioTransporteActualForeignKey;
	}
				    
	public Long getlIdServicioTransporteActualForeignKeyParaPosibleAtras() {
		return lIdServicioTransporteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdServicioTransporteActualForeignKeyParaPosibleAtras(
			Long lIdServicioTransporteActualForeignKeyParaPosibleAtras) {
		this.lIdServicioTransporteActualForeignKeyParaPosibleAtras = lIdServicioTransporteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyServicioTransporteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaServicioTransporte() {
		return sUltimaBusquedaServicioTransporte;
	}

	public void setsUltimaBusquedaServicioTransporte(String sUltimaBusquedaServicioTransporte) {
		this.sUltimaBusquedaServicioTransporte = sUltimaBusquedaServicioTransporte;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_cliente_proveedor() {
		return this.id_cliente_proveedor;
	}
    
	public Long getid_transportista() {
		return this.id_transportista;
	}
    
	public Long getid_vehiculo() {
		return this.id_vehiculo;
	}
    
	public Long getid_ruta_transporte() {
		return this.id_ruta_transporte;
	}
    
	public Long getid_detalle_activo_fijo() {
		return this.id_detalle_activo_fijo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id");
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_cliente");
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
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_cliente_proveedor");
					}
				}

				this.id_cliente_proveedor=newid_cliente_proveedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transportista(Long newid_transportista)throws Exception
	{
		try {
			if(this.id_transportista!=newid_transportista) {
				if(newid_transportista==null) {
					//newid_transportista=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_transportista");
					}
				}

				this.id_transportista=newid_transportista;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vehiculo(Long newid_vehiculo)throws Exception
	{
		try {
			if(this.id_vehiculo!=newid_vehiculo) {
				if(newid_vehiculo==null) {
					//newid_vehiculo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_vehiculo");
					}
				}

				this.id_vehiculo=newid_vehiculo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ruta_transporte(Long newid_ruta_transporte)throws Exception
	{
		try {
			if(this.id_ruta_transporte!=newid_ruta_transporte) {
				if(newid_ruta_transporte==null) {
					//newid_ruta_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_ruta_transporte");
					}
				}

				this.id_ruta_transporte=newid_ruta_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_activo_fijo(Long newid_detalle_activo_fijo)throws Exception
	{
		try {
			if(this.id_detalle_activo_fijo!=newid_detalle_activo_fijo) {
				if(newid_detalle_activo_fijo==null) {
					//newid_detalle_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ServicioTransporte:Valor nulo no permitido en columna id_detalle_activo_fijo");
					}
				}

				this.id_detalle_activo_fijo=newid_detalle_activo_fijo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionVehiculo() {
		return isBusquedaDesdeForeignKeySesionVehiculo;
	}

	public void setisBusquedaDesdeForeignKeySesionVehiculo(
		Boolean isBusquedaDesdeForeignKeySesionVehiculo) {
		this.isBusquedaDesdeForeignKeySesionVehiculo = isBusquedaDesdeForeignKeySesionVehiculo;
	}

	public Long getlidVehiculoActual() {
		return lidVehiculoActual;
	}

	public void setlidVehiculoActual(Long lidVehiculoActual) {
		this.lidVehiculoActual = lidVehiculoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleActivoFijo() {
		return isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionDetalleActivoFijo = isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public Long getlidDetalleActivoFijoActual() {
		return lidDetalleActivoFijoActual;
	}

	public void setlidDetalleActivoFijoActual(Long lidDetalleActivoFijoActual) {
		this.lidDetalleActivoFijoActual = lidDetalleActivoFijoActual;
	}
	
	
		
	
}
