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
public class PlanetaSistemaSolarSessionBean  extends PlanetaSistemaSolarSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar;
	protected Long lIdPlanetaSistemaSolarActualForeignKey;	
	
	protected Long lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras;
	protected String sUltimaBusquedaPlanetaSistemaSolar;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoValoracion;
	Long lidTipoValoracionActual;
	
	private Long id;
	private Long id_tipo_valoracion;
	private String codigo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PlanetaSistemaSolarSessionBeanAdditional planetasistemasolarSessionBeanAdditional=null;
	
	public PlanetaSistemaSolarSessionBeanAdditional getPlanetaSistemaSolarSessionBeanAdditional() {
		return this.planetasistemasolarSessionBeanAdditional;
	}
	
	public void setPlanetaSistemaSolarSessionBeanAdditional(PlanetaSistemaSolarSessionBeanAdditional planetasistemasolarSessionBeanAdditional) {
		try {
			this.planetasistemasolarSessionBeanAdditional=planetasistemasolarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PlanetaSistemaSolarSessionBean () {
		this.inicializarPlanetaSistemaSolarSessionBean();
	}
	
	public void inicializarPlanetaSistemaSolarSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar=false;
		this.lIdPlanetaSistemaSolarActualForeignKey=0L;
		this.lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras=false;
		this.sUltimaBusquedaPlanetaSistemaSolar ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoValoracion=false;
		lidTipoValoracionActual=0L; 
		
		
		
 		this.id_tipo_valoracion=-1L;
 		this.codigo="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar= isPermiteNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar(String sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar = sNombrePaginaNavegacionHaciaForeignKeyDesdePlanetaSistemaSolar;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar= isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolar;
	}
					
	public Long getlIdPlanetaSistemaSolarActualForeignKey() {
		return lIdPlanetaSistemaSolarActualForeignKey;
	}

	public void setlIdPlanetaSistemaSolarActualForeignKey(
			Long lIdPlanetaSistemaSolarActualForeignKey) {
		this.lIdPlanetaSistemaSolarActualForeignKey = lIdPlanetaSistemaSolarActualForeignKey;
	}
				    
	public Long getlIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras() {
		return lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras(
			Long lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras) {
		this.lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras = lIdPlanetaSistemaSolarActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPlanetaSistemaSolarParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPlanetaSistemaSolar() {
		return sUltimaBusquedaPlanetaSistemaSolar;
	}

	public void setsUltimaBusquedaPlanetaSistemaSolar(String sUltimaBusquedaPlanetaSistemaSolar) {
		this.sUltimaBusquedaPlanetaSistemaSolar = sUltimaBusquedaPlanetaSistemaSolar;
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
    
	public Long getid_tipo_valoracion() {
		return this.id_tipo_valoracion;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlanetaSistemaSolar:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_valoracion(Long newid_tipo_valoracion)throws Exception
	{
		try {
			if(this.id_tipo_valoracion!=newid_tipo_valoracion) {
				if(newid_tipo_valoracion==null) {
					//newid_tipo_valoracion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlanetaSistemaSolar:Valor nulo no permitido en columna id_tipo_valoracion");
					}
				}

				this.id_tipo_valoracion=newid_tipo_valoracion;
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
						System.out.println("PlanetaSistemaSolar:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("PlanetaSistemaSolar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoValoracion() {
		return isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoValoracion(
		Boolean isBusquedaDesdeForeignKeySesionTipoValoracion) {
		this.isBusquedaDesdeForeignKeySesionTipoValoracion = isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public Long getlidTipoValoracionActual() {
		return lidTipoValoracionActual;
	}

	public void setlidTipoValoracionActual(Long lidTipoValoracionActual) {
		this.lidTipoValoracionActual = lidTipoValoracionActual;
	}
	
	
		
	
}
