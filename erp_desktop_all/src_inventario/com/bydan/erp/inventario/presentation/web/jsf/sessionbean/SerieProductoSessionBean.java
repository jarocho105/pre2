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
public class SerieProductoSessionBean  extends SerieProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySerieProducto;
	protected Long lIdSerieProductoActualForeignKey;	
	
	protected Long lIdSerieProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras;
	protected String sUltimaBusquedaSerieProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_bodega;
	private Long id_producto;
	private Double codigo;
	private Date fecha_compra;
	private Date fecha_entrega;
	private Date fecha_venta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SerieProductoSessionBeanAdditional serieproductoSessionBeanAdditional=null;
	
	public SerieProductoSessionBeanAdditional getSerieProductoSessionBeanAdditional() {
		return this.serieproductoSessionBeanAdditional;
	}
	
	public void setSerieProductoSessionBeanAdditional(SerieProductoSessionBeanAdditional serieproductoSessionBeanAdditional) {
		try {
			this.serieproductoSessionBeanAdditional=serieproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SerieProductoSessionBean () {
		this.inicializarSerieProductoSessionBean();
	}
	
	public void inicializarSerieProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySerieProducto=false;
		this.lIdSerieProductoActualForeignKey=0L;
		this.lIdSerieProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras=false;
		this.sUltimaBusquedaSerieProducto ="";
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
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.codigo=0.0;
 		this.fecha_compra=new Date();
 		this.fecha_entrega=new Date();
 		this.fecha_venta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSerieProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSerieProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto= isPermiteNavegacionHaciaForeignKeyDesdeSerieProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeSerieProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySerieProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeySerieProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySerieProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySerieProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySerieProducto= isBusquedaDesdeForeignKeySesionForeignKeySerieProducto;
	}
					
	public Long getlIdSerieProductoActualForeignKey() {
		return lIdSerieProductoActualForeignKey;
	}

	public void setlIdSerieProductoActualForeignKey(
			Long lIdSerieProductoActualForeignKey) {
		this.lIdSerieProductoActualForeignKey = lIdSerieProductoActualForeignKey;
	}
				    
	public Long getlIdSerieProductoActualForeignKeyParaPosibleAtras() {
		return lIdSerieProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSerieProductoActualForeignKeyParaPosibleAtras(
			Long lIdSerieProductoActualForeignKeyParaPosibleAtras) {
		this.lIdSerieProductoActualForeignKeyParaPosibleAtras = lIdSerieProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySerieProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSerieProducto() {
		return sUltimaBusquedaSerieProducto;
	}

	public void setsUltimaBusquedaSerieProducto(String sUltimaBusquedaSerieProducto) {
		this.sUltimaBusquedaSerieProducto = sUltimaBusquedaSerieProducto;
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
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_producto() {
		return this.id_producto;
	}
    
	public Double getcodigo() {
		return this.codigo;
	}
    
	public Date getfecha_compra() {
		return this.fecha_compra;
	}
    
	public Date getfecha_entrega() {
		return this.fecha_entrega;
	}
    
	public Date getfecha_venta() {
		return this.fecha_venta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SerieProducto:Valor nulo no permitido en columna id");
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
						System.out.println("SerieProducto:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("SerieProducto:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("SerieProducto:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(Double newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SerieProducto:Valor nulo no permitido en columna codigo");
					}
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_compra(Date newfecha_compra)throws Exception
	{
		try {
			if(this.fecha_compra!=newfecha_compra) {
				if(newfecha_compra==null) {
					//newfecha_compra=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("SerieProducto:Valor nulo no permitido en columna fecha_compra");
					}
				}

				this.fecha_compra=newfecha_compra;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_entrega(Date newfecha_entrega)throws Exception
	{
		try {
			if(this.fecha_entrega!=newfecha_entrega) {
				if(newfecha_entrega==null) {
					//newfecha_entrega=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("SerieProducto:Valor nulo no permitido en columna fecha_entrega");
					}
				}

				this.fecha_entrega=newfecha_entrega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_venta(Date newfecha_venta)throws Exception
	{
		try {
			if(this.fecha_venta!=newfecha_venta) {
				if(newfecha_venta==null) {
					//newfecha_venta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("SerieProducto:Valor nulo no permitido en columna fecha_venta");
					}
				}

				this.fecha_venta=newfecha_venta;
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
	
	
		
	
}
