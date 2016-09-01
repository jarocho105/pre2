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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class RetencionesPorPagarPorCuentasSessionBean  extends RetencionesPorPagarPorCuentasSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas;
	protected Long lIdRetencionesPorPagarPorCuentasActualForeignKey;	
	
	protected Long lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras;
	protected String sUltimaBusquedaRetencionesPorPagarPorCuentas;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencion;
	Long lidTipoRetencionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_tipo_retencion;
	private Boolean es_debito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RetencionesPorPagarPorCuentasSessionBeanAdditional retencionesporpagarporcuentasSessionBeanAdditional=null;
	
	public RetencionesPorPagarPorCuentasSessionBeanAdditional getRetencionesPorPagarPorCuentasSessionBeanAdditional() {
		return this.retencionesporpagarporcuentasSessionBeanAdditional;
	}
	
	public void setRetencionesPorPagarPorCuentasSessionBeanAdditional(RetencionesPorPagarPorCuentasSessionBeanAdditional retencionesporpagarporcuentasSessionBeanAdditional) {
		try {
			this.retencionesporpagarporcuentasSessionBeanAdditional=retencionesporpagarporcuentasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RetencionesPorPagarPorCuentasSessionBean () {
		this.inicializarRetencionesPorPagarPorCuentasSessionBean();
	}
	
	public void inicializarRetencionesPorPagarPorCuentasSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas=false;
		this.lIdRetencionesPorPagarPorCuentasActualForeignKey=0L;
		this.lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras=false;
		this.sUltimaBusquedaRetencionesPorPagarPorCuentas ="";
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
		isBusquedaDesdeForeignKeySesionTipoRetencion=false;
		lidTipoRetencionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_tipo_retencion=-1L;
 		this.es_debito=false;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas= isPermiteNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas = sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas= isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentas;
	}
					
	public Long getlIdRetencionesPorPagarPorCuentasActualForeignKey() {
		return lIdRetencionesPorPagarPorCuentasActualForeignKey;
	}

	public void setlIdRetencionesPorPagarPorCuentasActualForeignKey(
			Long lIdRetencionesPorPagarPorCuentasActualForeignKey) {
		this.lIdRetencionesPorPagarPorCuentasActualForeignKey = lIdRetencionesPorPagarPorCuentasActualForeignKey;
	}
				    
	public Long getlIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras() {
		return lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras(
			Long lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras) {
		this.lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras = lIdRetencionesPorPagarPorCuentasActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRetencionesPorPagarPorCuentasParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRetencionesPorPagarPorCuentas() {
		return sUltimaBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setsUltimaBusquedaRetencionesPorPagarPorCuentas(String sUltimaBusquedaRetencionesPorPagarPorCuentas) {
		this.sUltimaBusquedaRetencionesPorPagarPorCuentas = sUltimaBusquedaRetencionesPorPagarPorCuentas;
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
    
	public Long getid_tipo_retencion() {
		return this.id_tipo_retencion;
	}
    
	public Boolean getes_debito() {
		return this.es_debito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id");
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
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion(Long newid_tipo_retencion)throws Exception
	{
		try {
			if(this.id_tipo_retencion!=newid_tipo_retencion) {
				if(newid_tipo_retencion==null) {
					//newid_tipo_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna id_tipo_retencion");
					}
				}

				this.id_tipo_retencion=newid_tipo_retencion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setes_debito(Boolean newes_debito)throws Exception
	{
		try {
			if(this.es_debito!=newes_debito) {
				if(newes_debito==null) {
					//newes_debito=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionesPorPagarPorCuentas:Valor nulo no permitido en columna es_debito");
					}
				}

				this.es_debito=newes_debito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencion() {
		return isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencion) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencion = isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public Long getlidTipoRetencionActual() {
		return lidTipoRetencionActual;
	}

	public void setlidTipoRetencionActual(Long lidTipoRetencionActual) {
		this.lidTipoRetencionActual = lidTipoRetencionActual;
	}
	
	
		
	
}
