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
public class DetalleAutoriConsepSessionBean  extends DetalleAutoriConsepSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep;
	protected Long lIdDetalleAutoriConsepActualForeignKey;	
	
	protected Long lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras;
	protected String sUltimaBusquedaDetalleAutoriConsep;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionAutoriConsep;
	Long lidAutoriConsepActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep;
	Long lidEstadoDetalleAutoriConsepActual;
	
	private Long id;
	private Long id_autori_consep;
	private Long id_empresa;
	private Long id_producto;
	private Long id_unidad;
	private Long id_estado_detalle_autori_consep;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleAutoriConsepSessionBeanAdditional detalleautoriconsepSessionBeanAdditional=null;
	
	public DetalleAutoriConsepSessionBeanAdditional getDetalleAutoriConsepSessionBeanAdditional() {
		return this.detalleautoriconsepSessionBeanAdditional;
	}
	
	public void setDetalleAutoriConsepSessionBeanAdditional(DetalleAutoriConsepSessionBeanAdditional detalleautoriconsepSessionBeanAdditional) {
		try {
			this.detalleautoriconsepSessionBeanAdditional=detalleautoriconsepSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleAutoriConsepSessionBean () {
		this.inicializarDetalleAutoriConsepSessionBean();
	}
	
	public void inicializarDetalleAutoriConsepSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep=false;
		this.lIdDetalleAutoriConsepActualForeignKey=0L;
		this.lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleAutoriConsep ="";
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
		
		
		isBusquedaDesdeForeignKeySesionAutoriConsep=false;
		lidAutoriConsepActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep=false;
		lidEstadoDetalleAutoriConsepActual=0L; 
		
		
		
 		this.id_autori_consep=-1L;
 		this.id_empresa=-1L;
 		this.id_producto=-1L;
 		this.id_unidad=-1L;
 		this.id_estado_detalle_autori_consep=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep= isPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep= isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep;
	}
					
	public Long getlIdDetalleAutoriConsepActualForeignKey() {
		return lIdDetalleAutoriConsepActualForeignKey;
	}

	public void setlIdDetalleAutoriConsepActualForeignKey(
			Long lIdDetalleAutoriConsepActualForeignKey) {
		this.lIdDetalleAutoriConsepActualForeignKey = lIdDetalleAutoriConsepActualForeignKey;
	}
				    
	public Long getlIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras() {
		return lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras(
			Long lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras = lIdDetalleAutoriConsepActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsepParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleAutoriConsep() {
		return sUltimaBusquedaDetalleAutoriConsep;
	}

	public void setsUltimaBusquedaDetalleAutoriConsep(String sUltimaBusquedaDetalleAutoriConsep) {
		this.sUltimaBusquedaDetalleAutoriConsep = sUltimaBusquedaDetalleAutoriConsep;
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
    
	public Long getid_autori_consep() {
		return this.id_autori_consep;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_producto() {
		return this.id_producto;
	}
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
    
	public Long getid_estado_detalle_autori_consep() {
		return this.id_estado_detalle_autori_consep;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_autori_consep(Long newid_autori_consep)throws Exception
	{
		try {
			if(this.id_autori_consep!=newid_autori_consep) {
				if(newid_autori_consep==null) {
					//newid_autori_consep=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id_autori_consep");
					}
				}

				this.id_autori_consep=newid_autori_consep;
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
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id_producto");
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
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_detalle_autori_consep(Long newid_estado_detalle_autori_consep)throws Exception
	{
		try {
			if(this.id_estado_detalle_autori_consep!=newid_estado_detalle_autori_consep) {
				if(newid_estado_detalle_autori_consep==null) {
					//newid_estado_detalle_autori_consep=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleAutoriConsep:Valor nulo no permitido en columna id_estado_detalle_autori_consep");
					}
				}

				this.id_estado_detalle_autori_consep=newid_estado_detalle_autori_consep;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionAutoriConsep() {
		return isBusquedaDesdeForeignKeySesionAutoriConsep;
	}

	public void setisBusquedaDesdeForeignKeySesionAutoriConsep(
		Boolean isBusquedaDesdeForeignKeySesionAutoriConsep) {
		this.isBusquedaDesdeForeignKeySesionAutoriConsep = isBusquedaDesdeForeignKeySesionAutoriConsep;
	}

	public Long getlidAutoriConsepActual() {
		return lidAutoriConsepActual;
	}

	public void setlidAutoriConsepActual(Long lidAutoriConsepActual) {
		this.lidAutoriConsepActual = lidAutoriConsepActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep() {
		return isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep(
		Boolean isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep) {
		this.isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep = isBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep;
	}

	public Long getlidEstadoDetalleAutoriConsepActual() {
		return lidEstadoDetalleAutoriConsepActual;
	}

	public void setlidEstadoDetalleAutoriConsepActual(Long lidEstadoDetalleAutoriConsepActual) {
		this.lidEstadoDetalleAutoriConsepActual = lidEstadoDetalleAutoriConsepActual;
	}
	
	
		
	
}
