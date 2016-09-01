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
public class DetaNotaCreditoSessionBean  extends DetaNotaCreditoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito;
	protected Long lIdDetaNotaCreditoActualForeignKey;	
	
	protected Long lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras;
	protected String sUltimaBusquedaDetaNotaCredito;
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
	Boolean isBusquedaDesdeForeignKeySesionNotaCredito;
	Long lidNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito;
	Long lidTipoDetaNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa;
	Long lidTipoDevolucionEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpaque;
	Long lidEmpaqueActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_nota_credito;
	private Long id_bodega;
	private Long id_producto;
	private Long id_unidad;
	private Long id_tipo_deta_nota_credito;
	private Long id_tipo_devolucion_empresa;
	private Long id_centro_costo;
	private Long id_empaque;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetaNotaCreditoSessionBeanAdditional detanotacreditoSessionBeanAdditional=null;
	
	public DetaNotaCreditoSessionBeanAdditional getDetaNotaCreditoSessionBeanAdditional() {
		return this.detanotacreditoSessionBeanAdditional;
	}
	
	public void setDetaNotaCreditoSessionBeanAdditional(DetaNotaCreditoSessionBeanAdditional detanotacreditoSessionBeanAdditional) {
		try {
			this.detanotacreditoSessionBeanAdditional=detanotacreditoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetaNotaCreditoSessionBean () {
		this.inicializarDetaNotaCreditoSessionBean();
	}
	
	public void inicializarDetaNotaCreditoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito=false;
		this.lIdDetaNotaCreditoActualForeignKey=0L;
		this.lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras=false;
		this.sUltimaBusquedaDetaNotaCredito ="";
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
		isBusquedaDesdeForeignKeySesionNotaCredito=false;
		lidNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito=false;
		lidTipoDetaNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa=false;
		lidTipoDevolucionEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpaque=false;
		lidEmpaqueActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_nota_credito=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_unidad=-1L;
 		this.id_tipo_deta_nota_credito=-1L;
 		this.id_tipo_devolucion_empresa=-1L;
 		this.id_centro_costo=null;
 		this.id_empaque=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito= isPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCredito;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito= isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCredito;
	}
					
	public Long getlIdDetaNotaCreditoActualForeignKey() {
		return lIdDetaNotaCreditoActualForeignKey;
	}

	public void setlIdDetaNotaCreditoActualForeignKey(
			Long lIdDetaNotaCreditoActualForeignKey) {
		this.lIdDetaNotaCreditoActualForeignKey = lIdDetaNotaCreditoActualForeignKey;
	}
				    
	public Long getlIdDetaNotaCreditoActualForeignKeyParaPosibleAtras() {
		return lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetaNotaCreditoActualForeignKeyParaPosibleAtras(
			Long lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras) {
		this.lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras = lIdDetaNotaCreditoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetaNotaCreditoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetaNotaCredito() {
		return sUltimaBusquedaDetaNotaCredito;
	}

	public void setsUltimaBusquedaDetaNotaCredito(String sUltimaBusquedaDetaNotaCredito) {
		this.sUltimaBusquedaDetaNotaCredito = sUltimaBusquedaDetaNotaCredito;
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
    
	public Long getid_nota_credito() {
		return this.id_nota_credito;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_producto() {
		return this.id_producto;
	}
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
    
	public Long getid_tipo_deta_nota_credito() {
		return this.id_tipo_deta_nota_credito;
	}
    
	public Long getid_tipo_devolucion_empresa() {
		return this.id_tipo_devolucion_empresa;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_empaque() {
		return this.id_empaque;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id");
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
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_periodo");
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
    
	public void setid_nota_credito(Long newid_nota_credito)throws Exception
	{
		try {
			if(this.id_nota_credito!=newid_nota_credito) {
				if(newid_nota_credito==null) {
					//newid_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_nota_credito");
					}
				}

				this.id_nota_credito=newid_nota_credito;
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
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_producto(Long newid_producto)throws Exception
	{
		try {
			if(this.id_producto!=newid_producto) {
				if(newid_producto==null) {
					//newid_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad(Long newid_unidad)throws Exception
	{
		try {
			if(this.id_unidad!=newid_unidad) {
				if(newid_unidad==null) {
					//newid_unidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_deta_nota_credito(Long newid_tipo_deta_nota_credito)throws Exception
	{
		try {
			if(this.id_tipo_deta_nota_credito!=newid_tipo_deta_nota_credito) {
				if(newid_tipo_deta_nota_credito==null) {
					//newid_tipo_deta_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_tipo_deta_nota_credito");
					}
				}

				this.id_tipo_deta_nota_credito=newid_tipo_deta_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_devolucion_empresa(Long newid_tipo_devolucion_empresa)throws Exception
	{
		try {
			if(this.id_tipo_devolucion_empresa!=newid_tipo_devolucion_empresa) {
				if(newid_tipo_devolucion_empresa==null) {
					//newid_tipo_devolucion_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetaNotaCredito:Valor nulo no permitido en columna id_tipo_devolucion_empresa");
					}
				}

				this.id_tipo_devolucion_empresa=newid_tipo_devolucion_empresa;
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
    
	public void setid_empaque(Long newid_empaque) {
		if(this.id_empaque!=newid_empaque) {

			this.id_empaque=newid_empaque;
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
	public Boolean getisBusquedaDesdeForeignKeySesionNotaCredito() {
		return isBusquedaDesdeForeignKeySesionNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionNotaCredito = isBusquedaDesdeForeignKeySesionNotaCredito;
	}

	public Long getlidNotaCreditoActual() {
		return lidNotaCreditoActual;
	}

	public void setlidNotaCreditoActual(Long lidNotaCreditoActual) {
		this.lidNotaCreditoActual = lidNotaCreditoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionProducto() {
		return isBusquedaDesdeForeignKeySesionProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionProducto(
		Boolean isBusquedaDesdeForeignKeySesionProducto) {
		this.isBusquedaDesdeForeignKeySesionProducto = isBusquedaDesdeForeignKeySesionProducto;
	}

	public Long getlidProductoActual() {
		return lidProductoActual;
	}

	public void setlidProductoActual(Long lidProductoActual) {
		this.lidProductoActual = lidProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionUnidad() {
		return isBusquedaDesdeForeignKeySesionUnidad;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidad(
		Boolean isBusquedaDesdeForeignKeySesionUnidad) {
		this.isBusquedaDesdeForeignKeySesionUnidad = isBusquedaDesdeForeignKeySesionUnidad;
	}

	public Long getlidUnidadActual() {
		return lidUnidadActual;
	}

	public void setlidUnidadActual(Long lidUnidadActual) {
		this.lidUnidadActual = lidUnidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDetaNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDetaNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito = isBusquedaDesdeForeignKeySesionTipoDetaNotaCredito;
	}

	public Long getlidTipoDetaNotaCreditoActual() {
		return lidTipoDetaNotaCreditoActual;
	}

	public void setlidTipoDetaNotaCreditoActual(Long lidTipoDetaNotaCreditoActual) {
		this.lidTipoDetaNotaCreditoActual = lidTipoDetaNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa = isBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa;
	}

	public Long getlidTipoDevolucionEmpresaActual() {
		return lidTipoDevolucionEmpresaActual;
	}

	public void setlidTipoDevolucionEmpresaActual(Long lidTipoDevolucionEmpresaActual) {
		this.lidTipoDevolucionEmpresaActual = lidTipoDevolucionEmpresaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpaque() {
		return isBusquedaDesdeForeignKeySesionEmpaque;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpaque(
		Boolean isBusquedaDesdeForeignKeySesionEmpaque) {
		this.isBusquedaDesdeForeignKeySesionEmpaque = isBusquedaDesdeForeignKeySesionEmpaque;
	}

	public Long getlidEmpaqueActual() {
		return lidEmpaqueActual;
	}

	public void setlidEmpaqueActual(Long lidEmpaqueActual) {
		this.lidEmpaqueActual = lidEmpaqueActual;
	}
	
	
		
	
}
