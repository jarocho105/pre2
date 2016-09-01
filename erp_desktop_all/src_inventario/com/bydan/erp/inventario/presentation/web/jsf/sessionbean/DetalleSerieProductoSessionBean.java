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
public class DetalleSerieProductoSessionBean  extends DetalleSerieProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto;
	protected Long lIdDetalleSerieProductoActualForeignKey;	
	
	protected Long lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras;
	protected String sUltimaBusquedaDetalleSerieProducto;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionSerieProducto;
	Long lidSerieProductoActual;
	
	private Long id;
	private Long id_serie_producto;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleSerieProductoSessionBeanAdditional detalleserieproductoSessionBeanAdditional=null;
	
	public DetalleSerieProductoSessionBeanAdditional getDetalleSerieProductoSessionBeanAdditional() {
		return this.detalleserieproductoSessionBeanAdditional;
	}
	
	public void setDetalleSerieProductoSessionBeanAdditional(DetalleSerieProductoSessionBeanAdditional detalleserieproductoSessionBeanAdditional) {
		try {
			this.detalleserieproductoSessionBeanAdditional=detalleserieproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleSerieProductoSessionBean () {
		this.inicializarDetalleSerieProductoSessionBean();
	}
	
	public void inicializarDetalleSerieProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto=false;
		this.lIdDetalleSerieProductoActualForeignKey=0L;
		this.lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleSerieProducto ="";
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
		
		
		isBusquedaDesdeForeignKeySesionSerieProducto=false;
		lidSerieProductoActual=0L; 
		
		
		
 		this.id_serie_producto=-1L;
 		this.nombre="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto= isPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto= isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProducto;
	}
					
	public Long getlIdDetalleSerieProductoActualForeignKey() {
		return lIdDetalleSerieProductoActualForeignKey;
	}

	public void setlIdDetalleSerieProductoActualForeignKey(
			Long lIdDetalleSerieProductoActualForeignKey) {
		this.lIdDetalleSerieProductoActualForeignKey = lIdDetalleSerieProductoActualForeignKey;
	}
				    
	public Long getlIdDetalleSerieProductoActualForeignKeyParaPosibleAtras() {
		return lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleSerieProductoActualForeignKeyParaPosibleAtras(
			Long lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras = lIdDetalleSerieProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleSerieProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleSerieProducto() {
		return sUltimaBusquedaDetalleSerieProducto;
	}

	public void setsUltimaBusquedaDetalleSerieProducto(String sUltimaBusquedaDetalleSerieProducto) {
		this.sUltimaBusquedaDetalleSerieProducto = sUltimaBusquedaDetalleSerieProducto;
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
    
	public Long getid_serie_producto() {
		return this.id_serie_producto;
	}
    
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleSerieProducto:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_serie_producto(Long newid_serie_producto)throws Exception
	{
		try {
			if(this.id_serie_producto!=newid_serie_producto) {
				if(newid_serie_producto==null) {
					//newid_serie_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleSerieProducto:Valor nulo no permitido en columna id_serie_producto");
					}
				}

				this.id_serie_producto=newid_serie_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleSerieProducto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("DetalleSerieProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionSerieProducto() {
		return isBusquedaDesdeForeignKeySesionSerieProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionSerieProducto(
		Boolean isBusquedaDesdeForeignKeySesionSerieProducto) {
		this.isBusquedaDesdeForeignKeySesionSerieProducto = isBusquedaDesdeForeignKeySesionSerieProducto;
	}

	public Long getlidSerieProductoActual() {
		return lidSerieProductoActual;
	}

	public void setlidSerieProductoActual(Long lidSerieProductoActual) {
		this.lidSerieProductoActual = lidSerieProductoActual;
	}
	
	
		
	
}
