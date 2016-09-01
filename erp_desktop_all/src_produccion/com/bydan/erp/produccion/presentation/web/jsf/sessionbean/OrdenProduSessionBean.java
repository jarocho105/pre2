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
package com.bydan.erp.produccion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.produccion.business.entity.*;

@SuppressWarnings("unused")
public class OrdenProduSessionBean  extends OrdenProduSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu;
	protected Long lIdOrdenProduActualForeignKey;	
	
	protected Long lIdOrdenProduActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras;
	protected String sUltimaBusquedaOrdenProdu;
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
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu;
	Long lidTipoPrioridadEmpresaProduActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleadoResponsable;
	Long lidEmpleadoResponsableActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoOrdenProdu;
	Long lidEstadoOrdenProduActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_formato;
	private Long id_tipo_prioridad_empresa_produ;
	private Long id_empleado_responsable;
	private Long id_cliente;
	private Long id_estado_orden_produ;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected OrdenProduSessionBeanAdditional ordenproduSessionBeanAdditional=null;
	
	public OrdenProduSessionBeanAdditional getOrdenProduSessionBeanAdditional() {
		return this.ordenproduSessionBeanAdditional;
	}
	
	public void setOrdenProduSessionBeanAdditional(OrdenProduSessionBeanAdditional ordenproduSessionBeanAdditional) {
		try {
			this.ordenproduSessionBeanAdditional=ordenproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public OrdenProduSessionBean () {
		this.inicializarOrdenProduSessionBean();
	}
	
	public void inicializarOrdenProduSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu=false;
		this.lIdOrdenProduActualForeignKey=0L;
		this.lIdOrdenProduActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras=false;
		this.sUltimaBusquedaOrdenProdu ="";
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
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu=false;
		lidTipoPrioridadEmpresaProduActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleadoResponsable=false;
		lidEmpleadoResponsableActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoOrdenProdu=false;
		lidEstadoOrdenProduActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_formato=null;
 		this.id_tipo_prioridad_empresa_produ=-1L;
 		this.id_empleado_responsable=-1L;
 		this.id_cliente=-1L;
 		this.id_estado_orden_produ=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu= isPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu(String sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu = sNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu() {
		return isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu= isBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu;
	}
					
	public Long getlIdOrdenProduActualForeignKey() {
		return lIdOrdenProduActualForeignKey;
	}

	public void setlIdOrdenProduActualForeignKey(
			Long lIdOrdenProduActualForeignKey) {
		this.lIdOrdenProduActualForeignKey = lIdOrdenProduActualForeignKey;
	}
				    
	public Long getlIdOrdenProduActualForeignKeyParaPosibleAtras() {
		return lIdOrdenProduActualForeignKeyParaPosibleAtras;
	}

	public void setlIdOrdenProduActualForeignKeyParaPosibleAtras(
			Long lIdOrdenProduActualForeignKeyParaPosibleAtras) {
		this.lIdOrdenProduActualForeignKeyParaPosibleAtras = lIdOrdenProduActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyOrdenProduParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaOrdenProdu() {
		return sUltimaBusquedaOrdenProdu;
	}

	public void setsUltimaBusquedaOrdenProdu(String sUltimaBusquedaOrdenProdu) {
		this.sUltimaBusquedaOrdenProdu = sUltimaBusquedaOrdenProdu;
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
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_tipo_prioridad_empresa_produ() {
		return this.id_tipo_prioridad_empresa_produ;
	}
    
	public Long getid_empleado_responsable() {
		return this.id_empleado_responsable;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_estado_orden_produ() {
		return this.id_estado_orden_produ;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id");
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
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
    
	public void setid_tipo_prioridad_empresa_produ(Long newid_tipo_prioridad_empresa_produ)throws Exception
	{
		try {
			if(this.id_tipo_prioridad_empresa_produ!=newid_tipo_prioridad_empresa_produ) {
				if(newid_tipo_prioridad_empresa_produ==null) {
					//newid_tipo_prioridad_empresa_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_tipo_prioridad_empresa_produ");
					}
				}

				this.id_tipo_prioridad_empresa_produ=newid_tipo_prioridad_empresa_produ;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado_responsable(Long newid_empleado_responsable)throws Exception
	{
		try {
			if(this.id_empleado_responsable!=newid_empleado_responsable) {
				if(newid_empleado_responsable==null) {
					//newid_empleado_responsable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_empleado_responsable");
					}
				}

				this.id_empleado_responsable=newid_empleado_responsable;
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
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_orden_produ(Long newid_estado_orden_produ)throws Exception
	{
		try {
			if(this.id_estado_orden_produ!=newid_estado_orden_produ) {
				if(newid_estado_orden_produ==null) {
					//newid_estado_orden_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("OrdenProdu:Valor nulo no permitido en columna id_estado_orden_produ");
					}
				}

				this.id_estado_orden_produ=newid_estado_orden_produ;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu() {
		return isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu) {
		this.isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu = isBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu;
	}

	public Long getlidTipoPrioridadEmpresaProduActual() {
		return lidTipoPrioridadEmpresaProduActual;
	}

	public void setlidTipoPrioridadEmpresaProduActual(Long lidTipoPrioridadEmpresaProduActual) {
		this.lidTipoPrioridadEmpresaProduActual = lidTipoPrioridadEmpresaProduActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleadoResponsable() {
		return isBusquedaDesdeForeignKeySesionEmpleadoResponsable;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleadoResponsable(
		Boolean isBusquedaDesdeForeignKeySesionEmpleadoResponsable) {
		this.isBusquedaDesdeForeignKeySesionEmpleadoResponsable = isBusquedaDesdeForeignKeySesionEmpleadoResponsable;
	}

	public Long getlidEmpleadoResponsableActual() {
		return lidEmpleadoResponsableActual;
	}

	public void setlidEmpleadoResponsableActual(Long lidEmpleadoResponsableActual) {
		this.lidEmpleadoResponsableActual = lidEmpleadoResponsableActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu() {
		return isBusquedaDesdeForeignKeySesionEstadoOrdenProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoOrdenProdu(
		Boolean isBusquedaDesdeForeignKeySesionEstadoOrdenProdu) {
		this.isBusquedaDesdeForeignKeySesionEstadoOrdenProdu = isBusquedaDesdeForeignKeySesionEstadoOrdenProdu;
	}

	public Long getlidEstadoOrdenProduActual() {
		return lidEstadoOrdenProduActual;
	}

	public void setlidEstadoOrdenProduActual(Long lidEstadoOrdenProduActual) {
		this.lidEstadoOrdenProduActual = lidEstadoOrdenProduActual;
	}
	
	
		
	
}
