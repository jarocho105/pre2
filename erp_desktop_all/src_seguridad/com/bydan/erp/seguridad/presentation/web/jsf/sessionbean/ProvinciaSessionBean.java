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
public class ProvinciaSessionBean  extends ProvinciaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProvincia;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProvincia;
	protected Long lIdProvinciaActualForeignKey;	
	
	protected Long lIdProvinciaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras;
	protected String sUltimaBusquedaProvincia;
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
	Boolean isBusquedaDesdeForeignKeySesionRegion;
	Long lidRegionActual;
	
	private Long id;
	private Long id_pais;
	private Long id_region;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProvinciaSessionBeanAdditional provinciaSessionBeanAdditional=null;
	
	public ProvinciaSessionBeanAdditional getProvinciaSessionBeanAdditional() {
		return this.provinciaSessionBeanAdditional;
	}
	
	public void setProvinciaSessionBeanAdditional(ProvinciaSessionBeanAdditional provinciaSessionBeanAdditional) {
		try {
			this.provinciaSessionBeanAdditional=provinciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProvinciaSessionBean () {
		this.inicializarProvinciaSessionBean();
	}
	
	public void inicializarProvinciaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProvincia=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProvincia=false;
		this.lIdProvinciaActualForeignKey=0L;
		this.lIdProvinciaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras=false;
		this.sUltimaBusquedaProvincia ="";
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
		isBusquedaDesdeForeignKeySesionRegion=false;
		lidRegionActual=0L; 
		
		
		
 		this.id_pais=-1L;
 		this.id_region=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProvincia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProvincia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProvincia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProvincia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProvincia= isPermiteNavegacionHaciaForeignKeyDesdeProvincia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia = sNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProvincia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProvincia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProvincia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProvincia= isBusquedaDesdeForeignKeySesionForeignKeyProvincia;
	}
					
	public Long getlIdProvinciaActualForeignKey() {
		return lIdProvinciaActualForeignKey;
	}

	public void setlIdProvinciaActualForeignKey(
			Long lIdProvinciaActualForeignKey) {
		this.lIdProvinciaActualForeignKey = lIdProvinciaActualForeignKey;
	}
				    
	public Long getlIdProvinciaActualForeignKeyParaPosibleAtras() {
		return lIdProvinciaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProvinciaActualForeignKeyParaPosibleAtras(
			Long lIdProvinciaActualForeignKeyParaPosibleAtras) {
		this.lIdProvinciaActualForeignKeyParaPosibleAtras = lIdProvinciaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProvinciaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProvincia() {
		return sUltimaBusquedaProvincia;
	}

	public void setsUltimaBusquedaProvincia(String sUltimaBusquedaProvincia) {
		this.sUltimaBusquedaProvincia = sUltimaBusquedaProvincia;
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
    
	public Long getid_region() {
		return this.id_region;
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
						System.out.println("Provincia:Valor nulo no permitido en columna id");
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
						System.out.println("Provincia:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_region(Long newid_region)throws Exception
	{
		try {
			if(this.id_region!=newid_region) {
				if(newid_region==null) {
					//newid_region=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Provincia:Valor nulo no permitido en columna id_region");
					}
				}

				this.id_region=newid_region;
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
						System.out.println("Provincia:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Provincia:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
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
	public Boolean getisBusquedaDesdeForeignKeySesionRegion() {
		return isBusquedaDesdeForeignKeySesionRegion;
	}

	public void setisBusquedaDesdeForeignKeySesionRegion(
		Boolean isBusquedaDesdeForeignKeySesionRegion) {
		this.isBusquedaDesdeForeignKeySesionRegion = isBusquedaDesdeForeignKeySesionRegion;
	}

	public Long getlidRegionActual() {
		return lidRegionActual;
	}

	public void setlidRegionActual(Long lidRegionActual) {
		this.lidRegionActual = lidRegionActual;
	}
	
	
		
	
}
