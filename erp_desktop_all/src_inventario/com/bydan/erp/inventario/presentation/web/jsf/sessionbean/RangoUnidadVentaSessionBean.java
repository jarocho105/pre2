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
public class RangoUnidadVentaSessionBean  extends RangoUnidadVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta;
	protected Long lIdRangoUnidadVentaActualForeignKey;	
	
	protected Long lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras;
	protected String sUltimaBusquedaRangoUnidadVenta;
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
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_unidad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RangoUnidadVentaSessionBeanAdditional rangounidadventaSessionBeanAdditional=null;
	
	public RangoUnidadVentaSessionBeanAdditional getRangoUnidadVentaSessionBeanAdditional() {
		return this.rangounidadventaSessionBeanAdditional;
	}
	
	public void setRangoUnidadVentaSessionBeanAdditional(RangoUnidadVentaSessionBeanAdditional rangounidadventaSessionBeanAdditional) {
		try {
			this.rangounidadventaSessionBeanAdditional=rangounidadventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RangoUnidadVentaSessionBean () {
		this.inicializarRangoUnidadVentaSessionBean();
	}
	
	public void inicializarRangoUnidadVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta=false;
		this.lIdRangoUnidadVentaActualForeignKey=0L;
		this.lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras=false;
		this.sUltimaBusquedaRangoUnidadVenta ="";
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
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L; 
		
		
		
 		this.id_empresa=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta= isPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta= isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta;
	}
					
	public Long getlIdRangoUnidadVentaActualForeignKey() {
		return lIdRangoUnidadVentaActualForeignKey;
	}

	public void setlIdRangoUnidadVentaActualForeignKey(
			Long lIdRangoUnidadVentaActualForeignKey) {
		this.lIdRangoUnidadVentaActualForeignKey = lIdRangoUnidadVentaActualForeignKey;
	}
				    
	public Long getlIdRangoUnidadVentaActualForeignKeyParaPosibleAtras() {
		return lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRangoUnidadVentaActualForeignKeyParaPosibleAtras(
			Long lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras) {
		this.lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras = lIdRangoUnidadVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRangoUnidadVenta() {
		return sUltimaBusquedaRangoUnidadVenta;
	}

	public void setsUltimaBusquedaRangoUnidadVenta(String sUltimaBusquedaRangoUnidadVenta) {
		this.sUltimaBusquedaRangoUnidadVenta = sUltimaBusquedaRangoUnidadVenta;
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
						System.out.println("RangoUnidadVenta:Valor nulo no permitido en columna id");
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
						System.out.println("RangoUnidadVenta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("RangoUnidadVenta:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
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
