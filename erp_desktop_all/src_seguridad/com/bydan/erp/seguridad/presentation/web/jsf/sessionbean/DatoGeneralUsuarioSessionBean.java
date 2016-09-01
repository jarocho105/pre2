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
public class DatoGeneralUsuarioSessionBean  extends DatoGeneralUsuarioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario;
	protected Long lIdDatoGeneralUsuarioActualForeignKey;	
	
	protected Long lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras;
	protected String sUltimaBusquedaDatoGeneralUsuario;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	
	private Long id_usuario;
	private Long id_pais;
	private Long id_provincia;
	private Long id_ciudad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DatoGeneralUsuarioSessionBeanAdditional datogeneralusuarioSessionBeanAdditional=null;
	
	public DatoGeneralUsuarioSessionBeanAdditional getDatoGeneralUsuarioSessionBeanAdditional() {
		return this.datogeneralusuarioSessionBeanAdditional;
	}
	
	public void setDatoGeneralUsuarioSessionBeanAdditional(DatoGeneralUsuarioSessionBeanAdditional datogeneralusuarioSessionBeanAdditional) {
		try {
			this.datogeneralusuarioSessionBeanAdditional=datogeneralusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DatoGeneralUsuarioSessionBean () {
		this.inicializarDatoGeneralUsuarioSessionBean();
	}
	
	public void inicializarDatoGeneralUsuarioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario=false;
		this.lIdDatoGeneralUsuarioActualForeignKey=0L;
		this.lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras=false;
		this.sUltimaBusquedaDatoGeneralUsuario ="";
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
		
		
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L; 
		
		
		
 		this.id_pais=-1L;
 		this.id_provincia=-1L;
 		this.id_ciudad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario= isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario = sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralUsuario;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario= isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuario;
	}
					
	public Long getlIdDatoGeneralUsuarioActualForeignKey() {
		return lIdDatoGeneralUsuarioActualForeignKey;
	}

	public void setlIdDatoGeneralUsuarioActualForeignKey(
			Long lIdDatoGeneralUsuarioActualForeignKey) {
		this.lIdDatoGeneralUsuarioActualForeignKey = lIdDatoGeneralUsuarioActualForeignKey;
	}
				    
	public Long getlIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras() {
		return lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras(
			Long lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras) {
		this.lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras = lIdDatoGeneralUsuarioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralUsuarioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDatoGeneralUsuario() {
		return sUltimaBusquedaDatoGeneralUsuario;
	}

	public void setsUltimaBusquedaDatoGeneralUsuario(String sUltimaBusquedaDatoGeneralUsuario) {
		this.sUltimaBusquedaDatoGeneralUsuario = sUltimaBusquedaDatoGeneralUsuario;
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
	
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
	
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralUsuario:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralUsuario:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_provincia(Long newid_provincia)throws Exception
	{
		try {
			if(this.id_provincia!=newid_provincia) {
				if(newid_provincia==null) {
					//newid_provincia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralUsuario:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralUsuario:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProvincia() {
		return isBusquedaDesdeForeignKeySesionProvincia;
	}

	public void setisBusquedaDesdeForeignKeySesionProvincia(
		Boolean isBusquedaDesdeForeignKeySesionProvincia) {
		this.isBusquedaDesdeForeignKeySesionProvincia = isBusquedaDesdeForeignKeySesionProvincia;
	}

	public Long getlidProvinciaActual() {
		return lidProvinciaActual;
	}

	public void setlidProvinciaActual(Long lidProvinciaActual) {
		this.lidProvinciaActual = lidProvinciaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	
	
		
	
}
