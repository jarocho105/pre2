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
public class ProductoOrdenDetaProduSessionBean  extends ProductoOrdenDetaProduSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu;
	protected Long lIdProductoOrdenDetaProduActualForeignKey;	
	
	protected Long lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras;
	protected String sUltimaBusquedaProductoOrdenDetaProdu;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	Long lidOrdenDetaProduActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	
	private Long id;
	private Long id_orden_deta_produ;
	private Long id_bodega;
	private Long id_producto;
	private Long id_unidad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoOrdenDetaProduSessionBeanAdditional productoordendetaproduSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduSessionBeanAdditional getProductoOrdenDetaProduSessionBeanAdditional() {
		return this.productoordendetaproduSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduSessionBeanAdditional(ProductoOrdenDetaProduSessionBeanAdditional productoordendetaproduSessionBeanAdditional) {
		try {
			this.productoordendetaproduSessionBeanAdditional=productoordendetaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoOrdenDetaProduSessionBean () {
		this.inicializarProductoOrdenDetaProduSessionBean();
	}
	
	public void inicializarProductoOrdenDetaProduSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu=false;
		this.lIdProductoOrdenDetaProduActualForeignKey=0L;
		this.lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras=false;
		this.sUltimaBusquedaProductoOrdenDetaProdu ="";
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
		
		
		isBusquedaDesdeForeignKeySesionOrdenDetaProdu=false;
		lidOrdenDetaProduActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L; 
		
		
		
 		this.id_orden_deta_produ=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_unidad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu= isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProdu;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu= isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu;
	}
					
	public Long getlIdProductoOrdenDetaProduActualForeignKey() {
		return lIdProductoOrdenDetaProduActualForeignKey;
	}

	public void setlIdProductoOrdenDetaProduActualForeignKey(
			Long lIdProductoOrdenDetaProduActualForeignKey) {
		this.lIdProductoOrdenDetaProduActualForeignKey = lIdProductoOrdenDetaProduActualForeignKey;
	}
				    
	public Long getlIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras() {
		return lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras(
			Long lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras) {
		this.lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras = lIdProductoOrdenDetaProduActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoOrdenDetaProdu() {
		return sUltimaBusquedaProductoOrdenDetaProdu;
	}

	public void setsUltimaBusquedaProductoOrdenDetaProdu(String sUltimaBusquedaProductoOrdenDetaProdu) {
		this.sUltimaBusquedaProductoOrdenDetaProdu = sUltimaBusquedaProductoOrdenDetaProdu;
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
    
	public Long getid_orden_deta_produ() {
		return this.id_orden_deta_produ;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProdu:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_orden_deta_produ(Long newid_orden_deta_produ)throws Exception
	{
		try {
			if(this.id_orden_deta_produ!=newid_orden_deta_produ) {
				if(newid_orden_deta_produ==null) {
					//newid_orden_deta_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProdu:Valor nulo no permitido en columna id_orden_deta_produ");
					}
				}

				this.id_orden_deta_produ=newid_orden_deta_produ;
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
						System.out.println("ProductoOrdenDetaProdu:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("ProductoOrdenDetaProdu:Valor nulo no permitido en columna id_producto");
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
						System.out.println("ProductoOrdenDetaProdu:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionOrdenDetaProdu() {
		return isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(
		Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu) {
		this.isBusquedaDesdeForeignKeySesionOrdenDetaProdu = isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public Long getlidOrdenDetaProduActual() {
		return lidOrdenDetaProduActual;
	}

	public void setlidOrdenDetaProduActual(Long lidOrdenDetaProduActual) {
		this.lidOrdenDetaProduActual = lidOrdenDetaProduActual;
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
	
	
		
	
}
