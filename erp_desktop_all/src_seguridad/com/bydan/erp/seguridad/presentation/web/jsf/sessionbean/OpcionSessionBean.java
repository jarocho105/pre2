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
public class OpcionSessionBean  extends OpcionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeOpcion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyOpcion;
	protected Long lIdOpcionActualForeignKey;	
	
	protected Long lIdOpcionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras;
	protected String sUltimaBusquedaOpcion;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionSistema;
	Long lidSistemaActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoOpcion;
	Long lidGrupoOpcionActual;
	Boolean isBusquedaDesdeForeignKeySesionOpcion;
	Long lidOpcionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	Long lidTipoTeclaMascaraActual;
	
	private Long id;
	private Long id_sistema;
	private Long id_modulo;
	private Long id_grupo_opcion;
	private Long id_opcion;
	private String nombre;
	private Long id_tipo_tecla_mascara;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected OpcionSessionBeanAdditional opcionSessionBeanAdditional=null;
	
	public OpcionSessionBeanAdditional getOpcionSessionBeanAdditional() {
		return this.opcionSessionBeanAdditional;
	}
	
	public void setOpcionSessionBeanAdditional(OpcionSessionBeanAdditional opcionSessionBeanAdditional) {
		try {
			this.opcionSessionBeanAdditional=opcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public OpcionSessionBean () {
		this.inicializarOpcionSessionBean();
	}
	
	public void inicializarOpcionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeOpcion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyOpcion=false;
		this.lIdOpcionActualForeignKey=0L;
		this.lIdOpcionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras=false;
		this.sUltimaBusquedaOpcion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionSistema=false;
		lidSistemaActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoOpcion=false;
		lidGrupoOpcionActual=0L;
		isBusquedaDesdeForeignKeySesionOpcion=false;
		lidOpcionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTeclaMascara=false;
		lidTipoTeclaMascaraActual=0L; 
		
		
		
 		this.id_sistema=-1L;
 		this.id_modulo=-1L;
 		this.id_grupo_opcion=null;
 		this.id_opcion=null;
 		this.nombre="";
 		this.id_tipo_tecla_mascara=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeOpcion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeOpcion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeOpcion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeOpcion= isPermiteNavegacionHaciaForeignKeyDesdeOpcion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion = sNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyOpcion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyOpcion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyOpcion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyOpcion= isBusquedaDesdeForeignKeySesionForeignKeyOpcion;
	}
					
	public Long getlIdOpcionActualForeignKey() {
		return lIdOpcionActualForeignKey;
	}

	public void setlIdOpcionActualForeignKey(
			Long lIdOpcionActualForeignKey) {
		this.lIdOpcionActualForeignKey = lIdOpcionActualForeignKey;
	}
				    
	public Long getlIdOpcionActualForeignKeyParaPosibleAtras() {
		return lIdOpcionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdOpcionActualForeignKeyParaPosibleAtras(
			Long lIdOpcionActualForeignKeyParaPosibleAtras) {
		this.lIdOpcionActualForeignKeyParaPosibleAtras = lIdOpcionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyOpcionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaOpcion() {
		return sUltimaBusquedaOpcion;
	}

	public void setsUltimaBusquedaOpcion(String sUltimaBusquedaOpcion) {
		this.sUltimaBusquedaOpcion = sUltimaBusquedaOpcion;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_tipo_tecla_mascara() {
		return this.id_tipo_tecla_mascara;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna id");
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
						System.out.println("Opcion:Valor nulo no permitido en columna id_sistema");
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
						System.out.println("Opcion:Valor nulo no permitido en columna id_modulo");
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
    
	public void setid_opcion(Long newid_opcion) {
		if(this.id_opcion!=newid_opcion) {

			this.id_opcion=newid_opcion;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Opcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tecla_mascara(Long newid_tipo_tecla_mascara)throws Exception
	{
		try {
			if(this.id_tipo_tecla_mascara!=newid_tipo_tecla_mascara) {
				if(newid_tipo_tecla_mascara==null) {
					//newid_tipo_tecla_mascara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Opcion:Valor nulo no permitido en columna id_tipo_tecla_mascara");
					}
				}

				this.id_tipo_tecla_mascara=newid_tipo_tecla_mascara;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTeclaMascara() {
		return isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTeclaMascara(
		Boolean isBusquedaDesdeForeignKeySesionTipoTeclaMascara) {
		this.isBusquedaDesdeForeignKeySesionTipoTeclaMascara = isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	}

	public Long getlidTipoTeclaMascaraActual() {
		return lidTipoTeclaMascaraActual;
	}

	public void setlidTipoTeclaMascaraActual(Long lidTipoTeclaMascaraActual) {
		this.lidTipoTeclaMascaraActual = lidTipoTeclaMascaraActual;
	}
	
	
		
	
}
