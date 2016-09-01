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
public class TablaAmortiDetalleSessionBean  extends TablaAmortiDetalleSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle;
	protected Long lIdTablaAmortiDetalleActualForeignKey;	
	
	protected Long lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras;
	protected String sUltimaBusquedaTablaAmortiDetalle;
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
	Boolean isBusquedaDesdeForeignKeySesionTasa;
	Long lidTasaActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo;
	Long lidTipoIntervaloActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_tasa;
	private Long id_factura;
	private Long id_tipo_intervalo;
	private Long id_anio;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TablaAmortiDetalleSessionBeanAdditional tablaamortidetalleSessionBeanAdditional=null;
	
	public TablaAmortiDetalleSessionBeanAdditional getTablaAmortiDetalleSessionBeanAdditional() {
		return this.tablaamortidetalleSessionBeanAdditional;
	}
	
	public void setTablaAmortiDetalleSessionBeanAdditional(TablaAmortiDetalleSessionBeanAdditional tablaamortidetalleSessionBeanAdditional) {
		try {
			this.tablaamortidetalleSessionBeanAdditional=tablaamortidetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TablaAmortiDetalleSessionBean () {
		this.inicializarTablaAmortiDetalleSessionBean();
	}
	
	public void inicializarTablaAmortiDetalleSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle=false;
		this.lIdTablaAmortiDetalleActualForeignKey=0L;
		this.lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras=false;
		this.sUltimaBusquedaTablaAmortiDetalle ="";
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
		isBusquedaDesdeForeignKeySesionTasa=false;
		lidTasaActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIntervalo=false;
		lidTipoIntervaloActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_tasa=-1L;
 		this.id_factura=-1L;
 		this.id_tipo_intervalo=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle= isPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle = sNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle= isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle;
	}
					
	public Long getlIdTablaAmortiDetalleActualForeignKey() {
		return lIdTablaAmortiDetalleActualForeignKey;
	}

	public void setlIdTablaAmortiDetalleActualForeignKey(
			Long lIdTablaAmortiDetalleActualForeignKey) {
		this.lIdTablaAmortiDetalleActualForeignKey = lIdTablaAmortiDetalleActualForeignKey;
	}
				    
	public Long getlIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras() {
		return lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras(
			Long lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras) {
		this.lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras = lIdTablaAmortiDetalleActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalleParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTablaAmortiDetalle() {
		return sUltimaBusquedaTablaAmortiDetalle;
	}

	public void setsUltimaBusquedaTablaAmortiDetalle(String sUltimaBusquedaTablaAmortiDetalle) {
		this.sUltimaBusquedaTablaAmortiDetalle = sUltimaBusquedaTablaAmortiDetalle;
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
    
	public Long getid_tasa() {
		return this.id_tasa;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_tipo_intervalo() {
		return this.id_tipo_intervalo;
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id");
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tasa(Long newid_tasa)throws Exception
	{
		try {
			if(this.id_tasa!=newid_tasa) {
				if(newid_tasa==null) {
					//newid_tasa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_tasa");
					}
				}

				this.id_tasa=newid_tasa;
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
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_intervalo(Long newid_tipo_intervalo)throws Exception
	{
		try {
			if(this.id_tipo_intervalo!=newid_tipo_intervalo) {
				if(newid_tipo_intervalo==null) {
					//newid_tipo_intervalo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TablaAmortiDetalle:Valor nulo no permitido en columna id_tipo_intervalo");
					}
				}

				this.id_tipo_intervalo=newid_tipo_intervalo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTasa() {
		return isBusquedaDesdeForeignKeySesionTasa;
	}

	public void setisBusquedaDesdeForeignKeySesionTasa(
		Boolean isBusquedaDesdeForeignKeySesionTasa) {
		this.isBusquedaDesdeForeignKeySesionTasa = isBusquedaDesdeForeignKeySesionTasa;
	}

	public Long getlidTasaActual() {
		return lidTasaActual;
	}

	public void setlidTasaActual(Long lidTasaActual) {
		this.lidTasaActual = lidTasaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIntervalo() {
		return isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIntervalo(
		Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo) {
		this.isBusquedaDesdeForeignKeySesionTipoIntervalo = isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public Long getlidTipoIntervaloActual() {
		return lidTipoIntervaloActual;
	}

	public void setlidTipoIntervaloActual(Long lidTipoIntervaloActual) {
		this.lidTipoIntervaloActual = lidTipoIntervaloActual;
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
