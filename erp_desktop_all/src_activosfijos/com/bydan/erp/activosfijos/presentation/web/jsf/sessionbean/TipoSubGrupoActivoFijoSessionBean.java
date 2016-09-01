/*
*AVISO LEGAL
? Copyright
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
public class TipoSubGrupoActivoFijoSessionBean  extends TipoSubGrupoActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo;
	protected Long lIdTipoSubGrupoActivoFijoActualForeignKey;	
	
	protected Long lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaTipoSubGrupoActivoFijo;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo;
	Long lidTipoGrupoActivoFijoActual;
	
	private Long id;
	private Long id_tipo_grupo_activo_fijo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoSubGrupoActivoFijoSessionBeanAdditional tiposubgrupoactivofijoSessionBeanAdditional=null;
	
	public TipoSubGrupoActivoFijoSessionBeanAdditional getTipoSubGrupoActivoFijoSessionBeanAdditional() {
		return this.tiposubgrupoactivofijoSessionBeanAdditional;
	}
	
	public void setTipoSubGrupoActivoFijoSessionBeanAdditional(TipoSubGrupoActivoFijoSessionBeanAdditional tiposubgrupoactivofijoSessionBeanAdditional) {
		try {
			this.tiposubgrupoactivofijoSessionBeanAdditional=tiposubgrupoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoSubGrupoActivoFijoSessionBean () {
		this.inicializarTipoSubGrupoActivoFijoSessionBean();
	}
	
	public void inicializarTipoSubGrupoActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo=false;
		this.lIdTipoSubGrupoActivoFijoActualForeignKey=0L;
		this.lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaTipoSubGrupoActivoFijo ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo=false;
		lidTipoGrupoActivoFijoActual=0L; 
		
		
		
 		this.id_tipo_grupo_activo_fijo=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoSubGrupoActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijo;
	}
					
	public Long getlIdTipoSubGrupoActivoFijoActualForeignKey() {
		return lIdTipoSubGrupoActivoFijoActualForeignKey;
	}

	public void setlIdTipoSubGrupoActivoFijoActualForeignKey(
			Long lIdTipoSubGrupoActivoFijoActualForeignKey) {
		this.lIdTipoSubGrupoActivoFijoActualForeignKey = lIdTipoSubGrupoActivoFijoActualForeignKey;
	}
				    
	public Long getlIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras = lIdTipoSubGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoSubGrupoActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoSubGrupoActivoFijo() {
		return sUltimaBusquedaTipoSubGrupoActivoFijo;
	}

	public void setsUltimaBusquedaTipoSubGrupoActivoFijo(String sUltimaBusquedaTipoSubGrupoActivoFijo) {
		this.sUltimaBusquedaTipoSubGrupoActivoFijo = sUltimaBusquedaTipoSubGrupoActivoFijo;
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
    
	public Long getid_tipo_grupo_activo_fijo() {
		return this.id_tipo_grupo_activo_fijo;
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
						System.out.println("TipoSubGrupoActivoFijo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grupo_activo_fijo(Long newid_tipo_grupo_activo_fijo)throws Exception
	{
		try {
			if(this.id_tipo_grupo_activo_fijo!=newid_tipo_grupo_activo_fijo) {
				if(newid_tipo_grupo_activo_fijo==null) {
					//newid_tipo_grupo_activo_fijo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoSubGrupoActivoFijo:Valor nulo no permitido en columna id_tipo_grupo_activo_fijo");
					}
				}

				this.id_tipo_grupo_activo_fijo=newid_tipo_grupo_activo_fijo;
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
						System.out.println("TipoSubGrupoActivoFijo:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("TipoSubGrupoActivoFijo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo = isBusquedaDesdeForeignKeySesionTipoGrupoActivoFijo;
	}

	public Long getlidTipoGrupoActivoFijoActual() {
		return lidTipoGrupoActivoFijoActual;
	}

	public void setlidTipoGrupoActivoFijoActual(Long lidTipoGrupoActivoFijoActual) {
		this.lidTipoGrupoActivoFijoActual = lidTipoGrupoActivoFijoActual;
	}
	
	
		
	
}
