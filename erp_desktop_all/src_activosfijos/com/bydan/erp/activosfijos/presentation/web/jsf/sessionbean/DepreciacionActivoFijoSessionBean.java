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
public class DepreciacionActivoFijoSessionBean  extends DepreciacionActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo;
	protected Long lIdDepreciacionActivoFijoActualForeignKey;	
	
	protected Long lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaDepreciacionActivoFijo;
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
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijo;
	Long lidDetalleActivoFijoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa;
	Long lidTipoDepreciacionEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoDepreActi;
	Long lidEstadoDepreActiActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_detalle_activo_fijo;
	private Long id_tipo_depreciacion_empresa;
	private Long id_estado_depre_acti;
	private Long id_anio;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DepreciacionActivoFijoSessionBeanAdditional depreciacionactivofijoSessionBeanAdditional=null;
	
	public DepreciacionActivoFijoSessionBeanAdditional getDepreciacionActivoFijoSessionBeanAdditional() {
		return this.depreciacionactivofijoSessionBeanAdditional;
	}
	
	public void setDepreciacionActivoFijoSessionBeanAdditional(DepreciacionActivoFijoSessionBeanAdditional depreciacionactivofijoSessionBeanAdditional) {
		try {
			this.depreciacionactivofijoSessionBeanAdditional=depreciacionactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DepreciacionActivoFijoSessionBean () {
		this.inicializarDepreciacionActivoFijoSessionBean();
	}
	
	public void inicializarDepreciacionActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo=false;
		this.lIdDepreciacionActivoFijoActualForeignKey=0L;
		this.lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaDepreciacionActivoFijo ="";
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
		isBusquedaDesdeForeignKeySesionDetalleActivoFijo=false;
		lidDetalleActivoFijoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa=false;
		lidTipoDepreciacionEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoDepreActi=false;
		lidEstadoDepreActiActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_detalle_activo_fijo=-1L;
 		this.id_tipo_depreciacion_empresa=-1L;
 		this.id_estado_depre_acti=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijo;
	}
					
	public Long getlIdDepreciacionActivoFijoActualForeignKey() {
		return lIdDepreciacionActivoFijoActualForeignKey;
	}

	public void setlIdDepreciacionActivoFijoActualForeignKey(
			Long lIdDepreciacionActivoFijoActualForeignKey) {
		this.lIdDepreciacionActivoFijoActualForeignKey = lIdDepreciacionActivoFijoActualForeignKey;
	}
				    
	public Long getlIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras = lIdDepreciacionActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDepreciacionActivoFijo() {
		return sUltimaBusquedaDepreciacionActivoFijo;
	}

	public void setsUltimaBusquedaDepreciacionActivoFijo(String sUltimaBusquedaDepreciacionActivoFijo) {
		this.sUltimaBusquedaDepreciacionActivoFijo = sUltimaBusquedaDepreciacionActivoFijo;
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
    
	public Long getid_detalle_activo_fijo() {
		return this.id_detalle_activo_fijo;
	}
    
	public Long getid_tipo_depreciacion_empresa() {
		return this.id_tipo_depreciacion_empresa;
	}
    
	public Long getid_estado_depre_acti() {
		return this.id_estado_depre_acti;
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
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id");
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
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id_detalle_activo_fijo");
					}
				}

				this.id_detalle_activo_fijo=newid_detalle_activo_fijo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_depreciacion_empresa(Long newid_tipo_depreciacion_empresa)throws Exception
	{
		try {
			if(this.id_tipo_depreciacion_empresa!=newid_tipo_depreciacion_empresa) {
				if(newid_tipo_depreciacion_empresa==null) {
					//newid_tipo_depreciacion_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id_tipo_depreciacion_empresa");
					}
				}

				this.id_tipo_depreciacion_empresa=newid_tipo_depreciacion_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_depre_acti(Long newid_estado_depre_acti)throws Exception
	{
		try {
			if(this.id_estado_depre_acti!=newid_estado_depre_acti) {
				if(newid_estado_depre_acti==null) {
					//newid_estado_depre_acti=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DepreciacionActivoFijo:Valor nulo no permitido en columna id_estado_depre_acti");
					}
				}

				this.id_estado_depre_acti=newid_estado_depre_acti;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa = isBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa;
	}

	public Long getlidTipoDepreciacionEmpresaActual() {
		return lidTipoDepreciacionEmpresaActual;
	}

	public void setlidTipoDepreciacionEmpresaActual(Long lidTipoDepreciacionEmpresaActual) {
		this.lidTipoDepreciacionEmpresaActual = lidTipoDepreciacionEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoDepreActi() {
		return isBusquedaDesdeForeignKeySesionEstadoDepreActi;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoDepreActi(
		Boolean isBusquedaDesdeForeignKeySesionEstadoDepreActi) {
		this.isBusquedaDesdeForeignKeySesionEstadoDepreActi = isBusquedaDesdeForeignKeySesionEstadoDepreActi;
	}

	public Long getlidEstadoDepreActiActual() {
		return lidEstadoDepreActiActual;
	}

	public void setlidEstadoDepreActiActual(Long lidEstadoDepreActiActual) {
		this.lidEstadoDepreActiActual = lidEstadoDepreActiActual;
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
