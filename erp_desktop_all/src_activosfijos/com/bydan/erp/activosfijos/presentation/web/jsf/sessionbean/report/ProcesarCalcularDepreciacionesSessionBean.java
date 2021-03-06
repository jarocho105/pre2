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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class ProcesarCalcularDepreciacionesSessionBean  extends ProcesarCalcularDepreciacionesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones;
	protected Long lIdProcesarCalcularDepreciacionesActualForeignKey;	
	
	protected Long lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras;
	protected String sUltimaBusquedaProcesarCalcularDepreciaciones;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	Long lidDetalleGrupoActivoFijoActual;
	Boolean isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo;
	Long lidSubGrupoActivoFijoActual;
	
	private Long id;
	private Long id_anio;
	private Long id_mes;
	private Long id_detalle_grupo_activo_fijo;
	private Long id_sub_grupo_activo_fijo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesarCalcularDepreciacionesSessionBeanAdditional procesarcalculardepreciacionesSessionBeanAdditional=null;
	
	public ProcesarCalcularDepreciacionesSessionBeanAdditional getProcesarCalcularDepreciacionesSessionBeanAdditional() {
		return this.procesarcalculardepreciacionesSessionBeanAdditional;
	}
	
	public void setProcesarCalcularDepreciacionesSessionBeanAdditional(ProcesarCalcularDepreciacionesSessionBeanAdditional procesarcalculardepreciacionesSessionBeanAdditional) {
		try {
			this.procesarcalculardepreciacionesSessionBeanAdditional=procesarcalculardepreciacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesarCalcularDepreciacionesSessionBean () {
		this.inicializarProcesarCalcularDepreciacionesSessionBean();
	}
	
	public void inicializarProcesarCalcularDepreciacionesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones=false;
		this.lIdProcesarCalcularDepreciacionesActualForeignKey=0L;
		this.lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras=false;
		this.sUltimaBusquedaProcesarCalcularDepreciaciones ="";
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
		
		
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo=false;
		lidDetalleGrupoActivoFijoActual=0L;
		isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo=false;
		lidSubGrupoActivoFijoActual=0L; 
		
		
		
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_detalle_grupo_activo_fijo=-1L;
 		this.id_sub_grupo_activo_fijo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones= isPermiteNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesarCalcularDepreciaciones;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones= isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciaciones;
	}
					
	public Long getlIdProcesarCalcularDepreciacionesActualForeignKey() {
		return lIdProcesarCalcularDepreciacionesActualForeignKey;
	}

	public void setlIdProcesarCalcularDepreciacionesActualForeignKey(
			Long lIdProcesarCalcularDepreciacionesActualForeignKey) {
		this.lIdProcesarCalcularDepreciacionesActualForeignKey = lIdProcesarCalcularDepreciacionesActualForeignKey;
	}
				    
	public Long getlIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras() {
		return lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras(
			Long lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras) {
		this.lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras = lIdProcesarCalcularDepreciacionesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesarCalcularDepreciacionesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesarCalcularDepreciaciones() {
		return sUltimaBusquedaProcesarCalcularDepreciaciones;
	}

	public void setsUltimaBusquedaProcesarCalcularDepreciaciones(String sUltimaBusquedaProcesarCalcularDepreciaciones) {
		this.sUltimaBusquedaProcesarCalcularDepreciaciones = sUltimaBusquedaProcesarCalcularDepreciaciones;
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
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_detalle_grupo_activo_fijo() {
		return this.id_detalle_grupo_activo_fijo;
	}
    
	public Long getid_sub_grupo_activo_fijo() {
		return this.id_sub_grupo_activo_fijo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesarCalcularDepreciaciones:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
    
	public void setid_detalle_grupo_activo_fijo(Long newid_detalle_grupo_activo_fijo)throws Exception
	{
		try {
			if(this.id_detalle_grupo_activo_fijo!=newid_detalle_grupo_activo_fijo) {
				if(newid_detalle_grupo_activo_fijo==null) {
					//newid_detalle_grupo_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesarCalcularDepreciaciones:Valor nulo no permitido en columna id_detalle_grupo_activo_fijo");
					}
				}

				this.id_detalle_grupo_activo_fijo=newid_detalle_grupo_activo_fijo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sub_grupo_activo_fijo(Long newid_sub_grupo_activo_fijo)throws Exception
	{
		try {
			if(this.id_sub_grupo_activo_fijo!=newid_sub_grupo_activo_fijo) {
				if(newid_sub_grupo_activo_fijo==null) {
					//newid_sub_grupo_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesarCalcularDepreciaciones:Valor nulo no permitido en columna id_sub_grupo_activo_fijo");
					}
				}

				this.id_sub_grupo_activo_fijo=newid_sub_grupo_activo_fijo;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo = isBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo;
	}

	public Long getlidDetalleGrupoActivoFijoActual() {
		return lidDetalleGrupoActivoFijoActual;
	}

	public void setlidDetalleGrupoActivoFijoActual(Long lidDetalleGrupoActivoFijoActual) {
		this.lidDetalleGrupoActivoFijoActual = lidDetalleGrupoActivoFijoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo = isBusquedaDesdeForeignKeySesionSubGrupoActivoFijo;
	}

	public Long getlidSubGrupoActivoFijoActual() {
		return lidSubGrupoActivoFijoActual;
	}

	public void setlidSubGrupoActivoFijoActual(Long lidSubGrupoActivoFijoActual) {
		this.lidSubGrupoActivoFijoActual = lidSubGrupoActivoFijoActual;
	}
	
	
		
	
}
