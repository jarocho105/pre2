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
public class NovedadSeguimientoSessionBean  extends NovedadSeguimientoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento;
	protected Long lIdNovedadSeguimientoActualForeignKey;	
	
	protected Long lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras;
	protected String sUltimaBusquedaNovedadSeguimiento;
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
	Boolean isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario;
	Long lidDetalleMovimientoInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionNovedadProducto;
	Long lidNovedadProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento;
	Long lidEstadoNovedadSeguimientoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_detalle_movimiento_inventario;
	private Long id_novedad_producto;
	private Long id_estado_novedad_seguimiento;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected NovedadSeguimientoSessionBeanAdditional novedadseguimientoSessionBeanAdditional=null;
	
	public NovedadSeguimientoSessionBeanAdditional getNovedadSeguimientoSessionBeanAdditional() {
		return this.novedadseguimientoSessionBeanAdditional;
	}
	
	public void setNovedadSeguimientoSessionBeanAdditional(NovedadSeguimientoSessionBeanAdditional novedadseguimientoSessionBeanAdditional) {
		try {
			this.novedadseguimientoSessionBeanAdditional=novedadseguimientoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public NovedadSeguimientoSessionBean () {
		this.inicializarNovedadSeguimientoSessionBean();
	}
	
	public void inicializarNovedadSeguimientoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento=false;
		this.lIdNovedadSeguimientoActualForeignKey=0L;
		this.lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras=false;
		this.sUltimaBusquedaNovedadSeguimiento ="";
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
		isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario=false;
		lidDetalleMovimientoInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionNovedadProducto=false;
		lidNovedadProductoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento=false;
		lidEstadoNovedadSeguimientoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_detalle_movimiento_inventario=-1L;
 		this.id_novedad_producto=-1L;
 		this.id_estado_novedad_seguimiento=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento= isPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento(String sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento = sNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento= isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimiento;
	}
					
	public Long getlIdNovedadSeguimientoActualForeignKey() {
		return lIdNovedadSeguimientoActualForeignKey;
	}

	public void setlIdNovedadSeguimientoActualForeignKey(
			Long lIdNovedadSeguimientoActualForeignKey) {
		this.lIdNovedadSeguimientoActualForeignKey = lIdNovedadSeguimientoActualForeignKey;
	}
				    
	public Long getlIdNovedadSeguimientoActualForeignKeyParaPosibleAtras() {
		return lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdNovedadSeguimientoActualForeignKeyParaPosibleAtras(
			Long lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras) {
		this.lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras = lIdNovedadSeguimientoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyNovedadSeguimientoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaNovedadSeguimiento() {
		return sUltimaBusquedaNovedadSeguimiento;
	}

	public void setsUltimaBusquedaNovedadSeguimiento(String sUltimaBusquedaNovedadSeguimiento) {
		this.sUltimaBusquedaNovedadSeguimiento = sUltimaBusquedaNovedadSeguimiento;
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
    
	public Long getid_detalle_movimiento_inventario() {
		return this.id_detalle_movimiento_inventario;
	}
    
	public Long getid_novedad_producto() {
		return this.id_novedad_producto;
	}
    
	public Long getid_estado_novedad_seguimiento() {
		return this.id_estado_novedad_seguimiento;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id");
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
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_movimiento_inventario(Long newid_detalle_movimiento_inventario)throws Exception
	{
		try {
			if(this.id_detalle_movimiento_inventario!=newid_detalle_movimiento_inventario) {
				if(newid_detalle_movimiento_inventario==null) {
					//newid_detalle_movimiento_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id_detalle_movimiento_inventario");
					}
				}

				this.id_detalle_movimiento_inventario=newid_detalle_movimiento_inventario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_novedad_producto(Long newid_novedad_producto)throws Exception
	{
		try {
			if(this.id_novedad_producto!=newid_novedad_producto) {
				if(newid_novedad_producto==null) {
					//newid_novedad_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id_novedad_producto");
					}
				}

				this.id_novedad_producto=newid_novedad_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_novedad_seguimiento(Long newid_estado_novedad_seguimiento)throws Exception
	{
		try {
			if(this.id_estado_novedad_seguimiento!=newid_estado_novedad_seguimiento) {
				if(newid_estado_novedad_seguimiento==null) {
					//newid_estado_novedad_seguimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("NovedadSeguimiento:Valor nulo no permitido en columna id_estado_novedad_seguimiento");
					}
				}

				this.id_estado_novedad_seguimiento=newid_estado_novedad_seguimiento;
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
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario() {
		return isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario(
		Boolean isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario) {
		this.isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario = isBusquedaDesdeForeignKeySesionDetalleMovimientoInventario;
	}

	public Long getlidDetalleMovimientoInventarioActual() {
		return lidDetalleMovimientoInventarioActual;
	}

	public void setlidDetalleMovimientoInventarioActual(Long lidDetalleMovimientoInventarioActual) {
		this.lidDetalleMovimientoInventarioActual = lidDetalleMovimientoInventarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionNovedadProducto() {
		return isBusquedaDesdeForeignKeySesionNovedadProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionNovedadProducto(
		Boolean isBusquedaDesdeForeignKeySesionNovedadProducto) {
		this.isBusquedaDesdeForeignKeySesionNovedadProducto = isBusquedaDesdeForeignKeySesionNovedadProducto;
	}

	public Long getlidNovedadProductoActual() {
		return lidNovedadProductoActual;
	}

	public void setlidNovedadProductoActual(Long lidNovedadProductoActual) {
		this.lidNovedadProductoActual = lidNovedadProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento() {
		return isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento(
		Boolean isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento) {
		this.isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento = isBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento;
	}

	public Long getlidEstadoNovedadSeguimientoActual() {
		return lidEstadoNovedadSeguimientoActual;
	}

	public void setlidEstadoNovedadSeguimientoActual(Long lidEstadoNovedadSeguimientoActual) {
		this.lidEstadoNovedadSeguimientoActual = lidEstadoNovedadSeguimientoActual;
	}
	
	
		
	
}
