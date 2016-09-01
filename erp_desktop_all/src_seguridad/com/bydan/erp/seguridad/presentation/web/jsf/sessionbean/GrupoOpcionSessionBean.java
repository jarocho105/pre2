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
public class GrupoOpcionSessionBean  extends GrupoOpcionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion;
	protected Long lIdGrupoOpcionActualForeignKey;	
	
	protected Long lIdGrupoOpcionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras;
	protected String sUltimaBusquedaGrupoOpcion;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	
	private Long id;
	private Long id_modulo;
	private String codigo;
	private String nombre_principal;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected GrupoOpcionSessionBeanAdditional grupoopcionSessionBeanAdditional=null;
	
	public GrupoOpcionSessionBeanAdditional getGrupoOpcionSessionBeanAdditional() {
		return this.grupoopcionSessionBeanAdditional;
	}
	
	public void setGrupoOpcionSessionBeanAdditional(GrupoOpcionSessionBeanAdditional grupoopcionSessionBeanAdditional) {
		try {
			this.grupoopcionSessionBeanAdditional=grupoopcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public GrupoOpcionSessionBean () {
		this.inicializarGrupoOpcionSessionBean();
	}
	
	public void inicializarGrupoOpcionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion=false;
		this.lIdGrupoOpcionActualForeignKey=0L;
		this.lIdGrupoOpcionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras=false;
		this.sUltimaBusquedaGrupoOpcion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L; 
		
		
		
 		this.id_modulo=-1L;
 		this.codigo="";
 		this.nombre_principal="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion= isPermiteNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion = sNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoOpcion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion= isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion;
	}
					
	public Long getlIdGrupoOpcionActualForeignKey() {
		return lIdGrupoOpcionActualForeignKey;
	}

	public void setlIdGrupoOpcionActualForeignKey(
			Long lIdGrupoOpcionActualForeignKey) {
		this.lIdGrupoOpcionActualForeignKey = lIdGrupoOpcionActualForeignKey;
	}
				    
	public Long getlIdGrupoOpcionActualForeignKeyParaPosibleAtras() {
		return lIdGrupoOpcionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdGrupoOpcionActualForeignKeyParaPosibleAtras(
			Long lIdGrupoOpcionActualForeignKeyParaPosibleAtras) {
		this.lIdGrupoOpcionActualForeignKeyParaPosibleAtras = lIdGrupoOpcionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaGrupoOpcion() {
		return sUltimaBusquedaGrupoOpcion;
	}

	public void setsUltimaBusquedaGrupoOpcion(String sUltimaBusquedaGrupoOpcion) {
		this.sUltimaBusquedaGrupoOpcion = sUltimaBusquedaGrupoOpcion;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre_principal() {
		return this.nombre_principal;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("GrupoOpcion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("GrupoOpcion:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("GrupoOpcion:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("GrupoOpcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_principal(String newnombre_principal)throws Exception
	{
		try {
			if(this.nombre_principal!=newnombre_principal) {
				if(newnombre_principal==null) {
					//newnombre_principal="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("GrupoOpcion:Valor nulo no permitido en columna nombre_principal");
					}
				}

				if(newnombre_principal!=null&&newnombre_principal.length()>100) {
					newnombre_principal=newnombre_principal.substring(0,98);
					System.out.println("GrupoOpcion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre_principal");
				}

				this.nombre_principal=newnombre_principal;
			}
		} catch(Exception e) {
			throw e;
		}
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
	
	
		
	
}
