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
public class PerfilCampoSessionBean  extends PerfilCampoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo;
	protected Long lIdPerfilCampoActualForeignKey;	
	
	protected Long lIdPerfilCampoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras;
	protected String sUltimaBusquedaPerfilCampo;
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
	Boolean isBusquedaDesdeForeignKeySesionCampo;
	Long lidCampoActual;
	
	private Long id;
	private Long id_perfil;
	private Long id_campo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PerfilCampoSessionBeanAdditional perfilcampoSessionBeanAdditional=null;
	
	public PerfilCampoSessionBeanAdditional getPerfilCampoSessionBeanAdditional() {
		return this.perfilcampoSessionBeanAdditional;
	}
	
	public void setPerfilCampoSessionBeanAdditional(PerfilCampoSessionBeanAdditional perfilcampoSessionBeanAdditional) {
		try {
			this.perfilcampoSessionBeanAdditional=perfilcampoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PerfilCampoSessionBean () {
		this.inicializarPerfilCampoSessionBean();
	}
	
	public void inicializarPerfilCampoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo=false;
		this.lIdPerfilCampoActualForeignKey=0L;
		this.lIdPerfilCampoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras=false;
		this.sUltimaBusquedaPerfilCampo ="";
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
		isBusquedaDesdeForeignKeySesionCampo=false;
		lidCampoActual=0L; 
		
		
		
 		this.id_perfil=-1L;
 		this.id_campo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePerfilCampo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePerfilCampo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo= isPermiteNavegacionHaciaForeignKeyDesdePerfilCampo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo(String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo = sNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo= isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo;
	}
					
	public Long getlIdPerfilCampoActualForeignKey() {
		return lIdPerfilCampoActualForeignKey;
	}

	public void setlIdPerfilCampoActualForeignKey(
			Long lIdPerfilCampoActualForeignKey) {
		this.lIdPerfilCampoActualForeignKey = lIdPerfilCampoActualForeignKey;
	}
				    
	public Long getlIdPerfilCampoActualForeignKeyParaPosibleAtras() {
		return lIdPerfilCampoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPerfilCampoActualForeignKeyParaPosibleAtras(
			Long lIdPerfilCampoActualForeignKeyParaPosibleAtras) {
		this.lIdPerfilCampoActualForeignKeyParaPosibleAtras = lIdPerfilCampoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPerfilCampoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPerfilCampo() {
		return sUltimaBusquedaPerfilCampo;
	}

	public void setsUltimaBusquedaPerfilCampo(String sUltimaBusquedaPerfilCampo) {
		this.sUltimaBusquedaPerfilCampo = sUltimaBusquedaPerfilCampo;
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
    
	public Long getid_campo() {
		return this.id_campo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna id");
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
						System.out.println("PerfilCampo:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_campo(Long newid_campo)throws Exception
	{
		try {
			if(this.id_campo!=newid_campo) {
				if(newid_campo==null) {
					//newid_campo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna id_campo");
					}
				}

				this.id_campo=newid_campo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCampo() {
		return isBusquedaDesdeForeignKeySesionCampo;
	}

	public void setisBusquedaDesdeForeignKeySesionCampo(
		Boolean isBusquedaDesdeForeignKeySesionCampo) {
		this.isBusquedaDesdeForeignKeySesionCampo = isBusquedaDesdeForeignKeySesionCampo;
	}

	public Long getlidCampoActual() {
		return lidCampoActual;
	}

	public void setlidCampoActual(Long lidCampoActual) {
		this.lidCampoActual = lidCampoActual;
	}
	
	
		
	
}
