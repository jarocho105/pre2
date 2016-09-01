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
public class UsuarioOpcionSessionBean  extends UsuarioOpcionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion;
	protected Long lIdUsuarioOpcionActualForeignKey;	
	
	protected Long lIdUsuarioOpcionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras;
	protected String sUltimaBusquedaUsuarioOpcion;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionSistema;
	Long lidSistemaActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoOpcion;
	Long lidGrupoOpcionActual;
	Boolean isBusquedaDesdeForeignKeySesionOpcion;
	Long lidOpcionActual;
	Boolean isBusquedaDesdeForeignKeySesionPerfil;
	Long lidPerfilActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	
	private Long id;
	private Long id_sistema;
	private Long id_modulo;
	private Long id_grupo_opcion;
	private Long id_opcion;
	private Long id_perfil;
	private Long id_usuario;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected UsuarioOpcionSessionBeanAdditional usuarioopcionSessionBeanAdditional=null;
	
	public UsuarioOpcionSessionBeanAdditional getUsuarioOpcionSessionBeanAdditional() {
		return this.usuarioopcionSessionBeanAdditional;
	}
	
	public void setUsuarioOpcionSessionBeanAdditional(UsuarioOpcionSessionBeanAdditional usuarioopcionSessionBeanAdditional) {
		try {
			this.usuarioopcionSessionBeanAdditional=usuarioopcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public UsuarioOpcionSessionBean () {
		this.inicializarUsuarioOpcionSessionBean();
	}
	
	public void inicializarUsuarioOpcionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion=false;
		this.lIdUsuarioOpcionActualForeignKey=0L;
		this.lIdUsuarioOpcionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras=false;
		this.sUltimaBusquedaUsuarioOpcion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionSistema=false;
		lidSistemaActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoOpcion=false;
		lidGrupoOpcionActual=0L;
		isBusquedaDesdeForeignKeySesionOpcion=false;
		lidOpcionActual=0L;
		isBusquedaDesdeForeignKeySesionPerfil=false;
		lidPerfilActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L; 
		
		
		
 		this.id_sistema=-1L;
 		this.id_modulo=-1L;
 		this.id_grupo_opcion=null;
 		this.id_opcion=-1L;
 		this.id_perfil=-1L;
 		this.id_usuario=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion= isPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion = sNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion= isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion;
	}
					
	public Long getlIdUsuarioOpcionActualForeignKey() {
		return lIdUsuarioOpcionActualForeignKey;
	}

	public void setlIdUsuarioOpcionActualForeignKey(
			Long lIdUsuarioOpcionActualForeignKey) {
		this.lIdUsuarioOpcionActualForeignKey = lIdUsuarioOpcionActualForeignKey;
	}
				    
	public Long getlIdUsuarioOpcionActualForeignKeyParaPosibleAtras() {
		return lIdUsuarioOpcionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdUsuarioOpcionActualForeignKeyParaPosibleAtras(
			Long lIdUsuarioOpcionActualForeignKeyParaPosibleAtras) {
		this.lIdUsuarioOpcionActualForeignKeyParaPosibleAtras = lIdUsuarioOpcionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaUsuarioOpcion() {
		return sUltimaBusquedaUsuarioOpcion;
	}

	public void setsUltimaBusquedaUsuarioOpcion(String sUltimaBusquedaUsuarioOpcion) {
		this.sUltimaBusquedaUsuarioOpcion = sUltimaBusquedaUsuarioOpcion;
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
    
	public Long getid_sistema() {
		return this.id_sistema;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_grupo_opcion() {
		return this.id_grupo_opcion;
	}
    
	public Long getid_opcion() {
		return this.id_opcion;
	}
    
	public Long getid_perfil() {
		return this.id_perfil;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sistema(Long newid_sistema)throws Exception
	{
		try {
			if(this.id_sistema!=newid_sistema) {
				if(newid_sistema==null) {
					//newid_sistema=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_opcion(Long newid_grupo_opcion) {
		if(this.id_grupo_opcion!=newid_grupo_opcion) {

			this.id_grupo_opcion=newid_grupo_opcion;
		}
	}
    
	public void setid_opcion(Long newid_opcion)throws Exception
	{
		try {
			if(this.id_opcion!=newid_opcion) {
				if(newid_opcion==null) {
					//newid_opcion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id_opcion");
					}
				}

				this.id_opcion=newid_opcion;
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
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UsuarioOpcion:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionSistema() {
		return isBusquedaDesdeForeignKeySesionSistema;
	}

	public void setisBusquedaDesdeForeignKeySesionSistema(
		Boolean isBusquedaDesdeForeignKeySesionSistema) {
		this.isBusquedaDesdeForeignKeySesionSistema = isBusquedaDesdeForeignKeySesionSistema;
	}

	public Long getlidSistemaActual() {
		return lidSistemaActual;
	}

	public void setlidSistemaActual(Long lidSistemaActual) {
		this.lidSistemaActual = lidSistemaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoOpcion() {
		return isBusquedaDesdeForeignKeySesionGrupoOpcion;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoOpcion(
		Boolean isBusquedaDesdeForeignKeySesionGrupoOpcion) {
		this.isBusquedaDesdeForeignKeySesionGrupoOpcion = isBusquedaDesdeForeignKeySesionGrupoOpcion;
	}

	public Long getlidGrupoOpcionActual() {
		return lidGrupoOpcionActual;
	}

	public void setlidGrupoOpcionActual(Long lidGrupoOpcionActual) {
		this.lidGrupoOpcionActual = lidGrupoOpcionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionOpcion() {
		return isBusquedaDesdeForeignKeySesionOpcion;
	}

	public void setisBusquedaDesdeForeignKeySesionOpcion(
		Boolean isBusquedaDesdeForeignKeySesionOpcion) {
		this.isBusquedaDesdeForeignKeySesionOpcion = isBusquedaDesdeForeignKeySesionOpcion;
	}

	public Long getlidOpcionActual() {
		return lidOpcionActual;
	}

	public void setlidOpcionActual(Long lidOpcionActual) {
		this.lidOpcionActual = lidOpcionActual;
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
	
	
		
	
}
