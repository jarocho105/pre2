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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class PerfilAccionSessionBean  extends PerfilAccionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion;
	protected Long lIdPerfilAccionActualForeignKey;	
	
	protected Long lIdPerfilAccionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras;
	protected String sUltimaBusquedaPerfilAccion;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionPerfil;
	Long lidPerfilActual;
	Boolean isBusquedaDesdeForeignKeySesionAccion;
	Long lidAccionActual;
	
	private Long id;
	private Long id_perfil;
	private Long id_accion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PerfilAccionSessionBeanAdditional perfilaccionSessionBeanAdditional=null;
	
	public PerfilAccionSessionBeanAdditional getPerfilAccionSessionBeanAdditional() {
		return this.perfilaccionSessionBeanAdditional;
	}
	
	public void setPerfilAccionSessionBeanAdditional(PerfilAccionSessionBeanAdditional perfilaccionSessionBeanAdditional) {
		try {
			this.perfilaccionSessionBeanAdditional=perfilaccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PerfilAccionSessionBean () {
		this.inicializarPerfilAccionSessionBean();
	}
	
	public void inicializarPerfilAccionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion=false;
		this.lIdPerfilAccionActualForeignKey=0L;
		this.lIdPerfilAccionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras=false;
		this.sUltimaBusquedaPerfilAccion ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionPerfil=false;
		lidPerfilActual=0L;
		isBusquedaDesdeForeignKeySesionAccion=false;
		lidAccionActual=0L; 
		
		
		
 		this.id_perfil=-1L;
 		this.id_accion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePerfilAccion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePerfilAccion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion= isPermiteNavegacionHaciaForeignKeyDesdePerfilAccion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion(String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion = sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion= isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion;
	}
					
	public Long getlIdPerfilAccionActualForeignKey() {
		return lIdPerfilAccionActualForeignKey;
	}

	public void setlIdPerfilAccionActualForeignKey(
			Long lIdPerfilAccionActualForeignKey) {
		this.lIdPerfilAccionActualForeignKey = lIdPerfilAccionActualForeignKey;
	}
				    
	public Long getlIdPerfilAccionActualForeignKeyParaPosibleAtras() {
		return lIdPerfilAccionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPerfilAccionActualForeignKeyParaPosibleAtras(
			Long lIdPerfilAccionActualForeignKeyParaPosibleAtras) {
		this.lIdPerfilAccionActualForeignKeyParaPosibleAtras = lIdPerfilAccionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPerfilAccionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPerfilAccion() {
		return sUltimaBusquedaPerfilAccion;
	}

	public void setsUltimaBusquedaPerfilAccion(String sUltimaBusquedaPerfilAccion) {
		this.sUltimaBusquedaPerfilAccion = sUltimaBusquedaPerfilAccion;
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
    
	public Long getid_perfil() {
		return this.id_perfil;
	}
    
	public Long getid_accion() {
		return this.id_accion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_perfil(Long newid_perfil)throws Exception
	{
		try {
			if(this.id_perfil!=newid_perfil) {
				if(newid_perfil==null) {
					//newid_perfil=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_accion(Long newid_accion)throws Exception
	{
		try {
			if(this.id_accion!=newid_accion) {
				if(newid_accion==null) {
					//newid_accion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna id_accion");
					}
				}

				this.id_accion=newid_accion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPerfil() {
		return isBusquedaDesdeForeignKeySesionPerfil;
	}

	public void setisBusquedaDesdeForeignKeySesionPerfil(
		Boolean isBusquedaDesdeForeignKeySesionPerfil) {
		this.isBusquedaDesdeForeignKeySesionPerfil = isBusquedaDesdeForeignKeySesionPerfil;
	}

	public Long getlidPerfilActual() {
		return lidPerfilActual;
	}

	public void setlidPerfilActual(Long lidPerfilActual) {
		this.lidPerfilActual = lidPerfilActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAccion() {
		return isBusquedaDesdeForeignKeySesionAccion;
	}

	public void setisBusquedaDesdeForeignKeySesionAccion(
		Boolean isBusquedaDesdeForeignKeySesionAccion) {
		this.isBusquedaDesdeForeignKeySesionAccion = isBusquedaDesdeForeignKeySesionAccion;
	}

	public Long getlidAccionActual() {
		return lidAccionActual;
	}

	public void setlidAccionActual(Long lidAccionActual) {
		this.lidAccionActual = lidAccionActual;
	}
	
	
		
	
}
