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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class DetalleAsientoContableSessionBean  extends DetalleAsientoContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable;
	protected Long lIdDetalleAsientoContableActualForeignKey;	
	
	protected Long lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras;
	protected String sUltimaBusquedaDetalleAsientoContable;
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
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroActividad;
	Long lidCentroActividadActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCambio;
	Long lidTipoCambioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_asiento_contable;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_cuenta_contable;
	private Long id_centro_actividad;
	private Long id_centro_costo;
	private Long id_tipo_cambio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleAsientoContableSessionBeanAdditional detalleasientocontableSessionBeanAdditional=null;
	
	public DetalleAsientoContableSessionBeanAdditional getDetalleAsientoContableSessionBeanAdditional() {
		return this.detalleasientocontableSessionBeanAdditional;
	}
	
	public void setDetalleAsientoContableSessionBeanAdditional(DetalleAsientoContableSessionBeanAdditional detalleasientocontableSessionBeanAdditional) {
		try {
			this.detalleasientocontableSessionBeanAdditional=detalleasientocontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleAsientoContableSessionBean () {
		this.inicializarDetalleAsientoContableSessionBean();
	}
	
	public void inicializarDetalleAsientoContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable=false;
		this.lIdDetalleAsientoContableActualForeignKey=0L;
		this.lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleAsientoContable ="";
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
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionCentroActividad=false;
		lidCentroActividadActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCambio=false;
		lidTipoCambioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_asiento_contable=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_cuenta_contable=-1L;
 		this.id_centro_actividad=null;
 		this.id_centro_costo=null;
 		this.id_tipo_cambio=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable= isPermiteNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAsientoContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable= isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContable;
	}
					
	public Long getlIdDetalleAsientoContableActualForeignKey() {
		return lIdDetalleAsientoContableActualForeignKey;
	}

	public void setlIdDetalleAsientoContableActualForeignKey(
			Long lIdDetalleAsientoContableActualForeignKey) {
		this.lIdDetalleAsientoContableActualForeignKey = lIdDetalleAsientoContableActualForeignKey;
	}
				    
	public Long getlIdDetalleAsientoContableActualForeignKeyParaPosibleAtras() {
		return lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleAsientoContableActualForeignKeyParaPosibleAtras(
			Long lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras = lIdDetalleAsientoContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleAsientoContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleAsientoContable() {
		return sUltimaBusquedaDetalleAsientoContable;
	}

	public void setsUltimaBusquedaDetalleAsientoContable(String sUltimaBusquedaDetalleAsientoContable) {
		this.sUltimaBusquedaDetalleAsientoContable = sUltimaBusquedaDetalleAsientoContable;
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
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
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
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_centro_actividad() {
		return this.id_centro_actividad;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_tipo_cambio() {
		return this.id_tipo_cambio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_asiento_contable");
					}
				}

				this.id_asiento_contable=newid_asiento_contable;
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
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_periodo");
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
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleAsientoContable:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_actividad(Long newid_centro_actividad) {
		if(this.id_centro_actividad!=newid_centro_actividad) {

			this.id_centro_actividad=newid_centro_actividad;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_tipo_cambio(Long newid_tipo_cambio) {
		if(this.id_tipo_cambio!=newid_tipo_cambio) {

			this.id_tipo_cambio=newid_tipo_cambio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
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
	
	
		
	
}
