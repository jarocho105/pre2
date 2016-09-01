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
public class DetalleImpuestoInvenSessionBean  extends DetalleImpuestoInvenSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven;
	protected Long lIdDetalleImpuestoInvenActualForeignKey;	
	
	protected Long lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras;
	protected String sUltimaBusquedaDetalleImpuestoInven;
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
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionImpuestoInven;
	Long lidImpuestoInvenActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_producto;
	private Long id_impuesto_inven;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleImpuestoInvenSessionBeanAdditional detalleimpuestoinvenSessionBeanAdditional=null;
	
	public DetalleImpuestoInvenSessionBeanAdditional getDetalleImpuestoInvenSessionBeanAdditional() {
		return this.detalleimpuestoinvenSessionBeanAdditional;
	}
	
	public void setDetalleImpuestoInvenSessionBeanAdditional(DetalleImpuestoInvenSessionBeanAdditional detalleimpuestoinvenSessionBeanAdditional) {
		try {
			this.detalleimpuestoinvenSessionBeanAdditional=detalleimpuestoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleImpuestoInvenSessionBean () {
		this.inicializarDetalleImpuestoInvenSessionBean();
	}
	
	public void inicializarDetalleImpuestoInvenSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven=false;
		this.lIdDetalleImpuestoInvenActualForeignKey=0L;
		this.lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleImpuestoInven ="";
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
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionImpuestoInven=false;
		lidImpuestoInvenActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_impuesto_inven=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven= isPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven= isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven;
	}
					
	public Long getlIdDetalleImpuestoInvenActualForeignKey() {
		return lIdDetalleImpuestoInvenActualForeignKey;
	}

	public void setlIdDetalleImpuestoInvenActualForeignKey(
			Long lIdDetalleImpuestoInvenActualForeignKey) {
		this.lIdDetalleImpuestoInvenActualForeignKey = lIdDetalleImpuestoInvenActualForeignKey;
	}
				    
	public Long getlIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras() {
		return lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras(
			Long lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras = lIdDetalleImpuestoInvenActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInvenParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleImpuestoInven() {
		return sUltimaBusquedaDetalleImpuestoInven;
	}

	public void setsUltimaBusquedaDetalleImpuestoInven(String sUltimaBusquedaDetalleImpuestoInven) {
		this.sUltimaBusquedaDetalleImpuestoInven = sUltimaBusquedaDetalleImpuestoInven;
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
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_producto() {
		return this.id_producto;
	}
    
	public Long getid_impuesto_inven() {
		return this.id_impuesto_inven;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_impuesto_inven(Long newid_impuesto_inven)throws Exception
	{
		try {
			if(this.id_impuesto_inven!=newid_impuesto_inven) {
				if(newid_impuesto_inven==null) {
					//newid_impuesto_inven=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleImpuestoInven:Valor nulo no permitido en columna id_impuesto_inven");
					}
				}

				this.id_impuesto_inven=newid_impuesto_inven;
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
	public Boolean getisBusquedaDesdeForeignKeySesionImpuestoInven() {
		return isBusquedaDesdeForeignKeySesionImpuestoInven;
	}

	public void setisBusquedaDesdeForeignKeySesionImpuestoInven(
		Boolean isBusquedaDesdeForeignKeySesionImpuestoInven) {
		this.isBusquedaDesdeForeignKeySesionImpuestoInven = isBusquedaDesdeForeignKeySesionImpuestoInven;
	}

	public Long getlidImpuestoInvenActual() {
		return lidImpuestoInvenActual;
	}

	public void setlidImpuestoInvenActual(Long lidImpuestoInvenActual) {
		this.lidImpuestoInvenActual = lidImpuestoInvenActual;
	}
	
	
		
	
}
