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
public class PerfilSessionBean  extends PerfilSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfil;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfil;
	protected Long lIdPerfilActualForeignKey;	
	
	protected Long lIdPerfilActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras;
	protected String sUltimaBusquedaPerfil;
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
	
	private Long id;
	private Long id_sistema;
	private String nombre;
	private String nombre2;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PerfilSessionBeanAdditional perfilSessionBeanAdditional=null;
	
	public PerfilSessionBeanAdditional getPerfilSessionBeanAdditional() {
		return this.perfilSessionBeanAdditional;
	}
	
	public void setPerfilSessionBeanAdditional(PerfilSessionBeanAdditional perfilSessionBeanAdditional) {
		try {
			this.perfilSessionBeanAdditional=perfilSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PerfilSessionBean () {
		this.inicializarPerfilSessionBean();
	}
	
	public void inicializarPerfilSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfil=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfil=false;
		this.lIdPerfilActualForeignKey=0L;
		this.lIdPerfilActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras=false;
		this.sUltimaBusquedaPerfil ="";
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
		
		this.esGuardarRelacionado=true;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionSistema=false;
		lidSistemaActual=0L; 
		
		
		
 		this.id_sistema=-1L;
 		this.nombre="";
 		this.nombre2="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePerfil() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePerfil;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePerfil(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePerfil) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePerfil= isPermiteNavegacionHaciaForeignKeyDesdePerfil;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePerfil() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfil(String sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil = sNombrePaginaNavegacionHaciaForeignKeyDesdePerfil;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfil() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfil;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfil(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfil) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfil= isBusquedaDesdeForeignKeySesionForeignKeyPerfil;
	}
					
	public Long getlIdPerfilActualForeignKey() {
		return lIdPerfilActualForeignKey;
	}

	public void setlIdPerfilActualForeignKey(
			Long lIdPerfilActualForeignKey) {
		this.lIdPerfilActualForeignKey = lIdPerfilActualForeignKey;
	}
				    
	public Long getlIdPerfilActualForeignKeyParaPosibleAtras() {
		return lIdPerfilActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPerfilActualForeignKeyParaPosibleAtras(
			Long lIdPerfilActualForeignKeyParaPosibleAtras) {
		this.lIdPerfilActualForeignKeyParaPosibleAtras = lIdPerfilActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPerfilParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPerfil() {
		return sUltimaBusquedaPerfil;
	}

	public void setsUltimaBusquedaPerfil(String sUltimaBusquedaPerfil) {
		this.sUltimaBusquedaPerfil = sUltimaBusquedaPerfil;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getnombre2() {
		return this.nombre2;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Perfil:Valor nulo no permitido en columna id");
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
						System.out.println("Perfil:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
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
						System.out.println("Perfil:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Perfil:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre2(String newnombre2)throws Exception
	{
		try {
			if(this.nombre2!=newnombre2) {
				if(newnombre2==null) {
					//newnombre2="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Perfil:Valor nulo no permitido en columna nombre2");
					}
				}

				if(newnombre2!=null&&newnombre2.length()>400) {
					newnombre2=newnombre2.substring(0,398);
					System.out.println("Perfil:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=400 en columna nombre2");
				}

				this.nombre2=newnombre2;
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
	
	
		
	
}
