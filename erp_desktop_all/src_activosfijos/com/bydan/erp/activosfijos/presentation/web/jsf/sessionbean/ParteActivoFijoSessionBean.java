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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class ParteActivoFijoSessionBean  extends ParteActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo;
	protected Long lIdParteActivoFijoActualForeignKey;	
	
	protected Long lIdParteActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaParteActivoFijo;
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
	Boolean isBusquedaDesdeForeignKeySesionEstadoActivoFijo;
	Long lidEstadoActivoFijoActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	Long lidDetalleActivoFijoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estado_activo_fijo;
	private Long id_detalle_activo_fijo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParteActivoFijoSessionBeanAdditional parteactivofijoSessionBeanAdditional=null;
	
	public ParteActivoFijoSessionBeanAdditional getParteActivoFijoSessionBeanAdditional() {
		return this.parteactivofijoSessionBeanAdditional;
	}
	
	public void setParteActivoFijoSessionBeanAdditional(ParteActivoFijoSessionBeanAdditional parteactivofijoSessionBeanAdditional) {
		try {
			this.parteactivofijoSessionBeanAdditional=parteactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParteActivoFijoSessionBean () {
		this.inicializarParteActivoFijoSessionBean();
	}
	
	public void inicializarParteActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo=false;
		this.lIdParteActivoFijoActualForeignKey=0L;
		this.lIdParteActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaParteActivoFijo ="";
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
		isBusquedaDesdeForeignKeySesionEstadoActivoFijo=false;
		lidEstadoActivoFijoActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleActivoFijo=false;
		lidDetalleActivoFijoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estado_activo_fijo=-1L;
 		this.id_detalle_activo_fijo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijo;
	}
					
	public Long getlIdParteActivoFijoActualForeignKey() {
		return lIdParteActivoFijoActualForeignKey;
	}

	public void setlIdParteActivoFijoActualForeignKey(
			Long lIdParteActivoFijoActualForeignKey) {
		this.lIdParteActivoFijoActualForeignKey = lIdParteActivoFijoActualForeignKey;
	}
				    
	public Long getlIdParteActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdParteActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParteActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdParteActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdParteActivoFijoActualForeignKeyParaPosibleAtras = lIdParteActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParteActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParteActivoFijo() {
		return sUltimaBusquedaParteActivoFijo;
	}

	public void setsUltimaBusquedaParteActivoFijo(String sUltimaBusquedaParteActivoFijo) {
		this.sUltimaBusquedaParteActivoFijo = sUltimaBusquedaParteActivoFijo;
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
    
	public Long getid_estado_activo_fijo() {
		return this.id_estado_activo_fijo;
	}
    
	public Long getid_detalle_activo_fijo() {
		return this.id_detalle_activo_fijo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParteActivoFijo:Valor nulo no permitido en columna id");
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
						System.out.println("ParteActivoFijo:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParteActivoFijo:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_activo_fijo(Long newid_estado_activo_fijo)throws Exception
	{
		try {
			if(this.id_estado_activo_fijo!=newid_estado_activo_fijo) {
				if(newid_estado_activo_fijo==null) {
					//newid_estado_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParteActivoFijo:Valor nulo no permitido en columna id_estado_activo_fijo");
					}
				}

				this.id_estado_activo_fijo=newid_estado_activo_fijo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_activo_fijo(Long newid_detalle_activo_fijo)throws Exception
	{
		try {
			if(this.id_detalle_activo_fijo!=newid_detalle_activo_fijo) {
				if(newid_detalle_activo_fijo==null) {
					//newid_detalle_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParteActivoFijo:Valor nulo no permitido en columna id_detalle_activo_fijo");
					}
				}

				this.id_detalle_activo_fijo=newid_detalle_activo_fijo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionEstadoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionEstadoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionEstadoActivoFijo = isBusquedaDesdeForeignKeySesionEstadoActivoFijo;
	}

	public Long getlidEstadoActivoFijoActual() {
		return lidEstadoActivoFijoActual;
	}

	public void setlidEstadoActivoFijoActual(Long lidEstadoActivoFijoActual) {
		this.lidEstadoActivoFijoActual = lidEstadoActivoFijoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleActivoFijo() {
		return isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionDetalleActivoFijo = isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	}

	public Long getlidDetalleActivoFijoActual() {
		return lidDetalleActivoFijoActual;
	}

	public void setlidDetalleActivoFijoActual(Long lidDetalleActivoFijoActual) {
		this.lidDetalleActivoFijoActual = lidDetalleActivoFijoActual;
	}
	
	
		
	
}
