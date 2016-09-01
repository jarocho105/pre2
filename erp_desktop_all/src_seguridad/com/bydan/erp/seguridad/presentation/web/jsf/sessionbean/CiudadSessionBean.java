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
public class CiudadSessionBean  extends CiudadSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCiudad;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCiudad;
	protected Long lIdCiudadActualForeignKey;	
	
	protected Long lIdCiudadActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras;
	protected String sUltimaBusquedaCiudad;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	
	private Long id;
	private Long id_pais;
	private Long id_provincia;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CiudadSessionBeanAdditional ciudadSessionBeanAdditional=null;
	
	public CiudadSessionBeanAdditional getCiudadSessionBeanAdditional() {
		return this.ciudadSessionBeanAdditional;
	}
	
	public void setCiudadSessionBeanAdditional(CiudadSessionBeanAdditional ciudadSessionBeanAdditional) {
		try {
			this.ciudadSessionBeanAdditional=ciudadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CiudadSessionBean () {
		this.inicializarCiudadSessionBean();
	}
	
	public void inicializarCiudadSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCiudad=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCiudad=false;
		this.lIdCiudadActualForeignKey=0L;
		this.lIdCiudadActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras=false;
		this.sUltimaBusquedaCiudad ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L; 
		
		
		
 		this.id_pais=-1L;
 		this.id_provincia=null;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCiudad() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCiudad;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCiudad(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCiudad) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCiudad= isPermiteNavegacionHaciaForeignKeyDesdeCiudad;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad = sNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCiudad() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCiudad(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCiudad) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCiudad= isBusquedaDesdeForeignKeySesionForeignKeyCiudad;
	}
					
	public Long getlIdCiudadActualForeignKey() {
		return lIdCiudadActualForeignKey;
	}

	public void setlIdCiudadActualForeignKey(
			Long lIdCiudadActualForeignKey) {
		this.lIdCiudadActualForeignKey = lIdCiudadActualForeignKey;
	}
				    
	public Long getlIdCiudadActualForeignKeyParaPosibleAtras() {
		return lIdCiudadActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCiudadActualForeignKeyParaPosibleAtras(
			Long lIdCiudadActualForeignKeyParaPosibleAtras) {
		this.lIdCiudadActualForeignKeyParaPosibleAtras = lIdCiudadActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCiudadParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCiudad() {
		return sUltimaBusquedaCiudad;
	}

	public void setsUltimaBusquedaCiudad(String sUltimaBusquedaCiudad) {
		this.sUltimaBusquedaCiudad = sUltimaBusquedaCiudad;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
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
						System.out.println("Ciudad:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("Ciudad:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_provincia(Long newid_provincia) {
		if(this.id_provincia!=newid_provincia) {

			this.id_provincia=newid_provincia;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ciudad:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Ciudad:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
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
	
	
		
	
}
