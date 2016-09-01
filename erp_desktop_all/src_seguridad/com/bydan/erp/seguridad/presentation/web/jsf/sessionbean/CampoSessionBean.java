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
public class CampoSessionBean  extends CampoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCampo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCampo;
	protected Long lIdCampoActualForeignKey;	
	
	protected Long lIdCampoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras;
	protected String sUltimaBusquedaCampo;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionOpcion;
	Long lidOpcionActual;
	
	private Long id;
	private Long id_opcion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CampoSessionBeanAdditional campoSessionBeanAdditional=null;
	
	public CampoSessionBeanAdditional getCampoSessionBeanAdditional() {
		return this.campoSessionBeanAdditional;
	}
	
	public void setCampoSessionBeanAdditional(CampoSessionBeanAdditional campoSessionBeanAdditional) {
		try {
			this.campoSessionBeanAdditional=campoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CampoSessionBean () {
		this.inicializarCampoSessionBean();
	}
	
	public void inicializarCampoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCampo=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCampo=false;
		this.lIdCampoActualForeignKey=0L;
		this.lIdCampoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras=false;
		this.sUltimaBusquedaCampo ="";
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
		
		
		isBusquedaDesdeForeignKeySesionOpcion=false;
		lidOpcionActual=0L; 
		
		
		
 		this.id_opcion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCampo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCampo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCampo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCampo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCampo= isPermiteNavegacionHaciaForeignKeyDesdeCampo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCampo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCampo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo = sNombrePaginaNavegacionHaciaForeignKeyDesdeCampo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCampo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCampo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCampo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCampo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCampo= isBusquedaDesdeForeignKeySesionForeignKeyCampo;
	}
					
	public Long getlIdCampoActualForeignKey() {
		return lIdCampoActualForeignKey;
	}

	public void setlIdCampoActualForeignKey(
			Long lIdCampoActualForeignKey) {
		this.lIdCampoActualForeignKey = lIdCampoActualForeignKey;
	}
				    
	public Long getlIdCampoActualForeignKeyParaPosibleAtras() {
		return lIdCampoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCampoActualForeignKeyParaPosibleAtras(
			Long lIdCampoActualForeignKeyParaPosibleAtras) {
		this.lIdCampoActualForeignKeyParaPosibleAtras = lIdCampoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCampoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCampo() {
		return sUltimaBusquedaCampo;
	}

	public void setsUltimaBusquedaCampo(String sUltimaBusquedaCampo) {
		this.sUltimaBusquedaCampo = sUltimaBusquedaCampo;
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
    
	public Long getid_opcion() {
		return this.id_opcion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Campo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_opcion(Long newid_opcion)throws Exception
	{
		try {
			if(this.id_opcion!=newid_opcion) {
				if(newid_opcion==null) {
					//newid_opcion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Campo:Valor nulo no permitido en columna id_opcion");
					}
				}

				this.id_opcion=newid_opcion;
			}
		} catch(Exception e) {
			throw e;
		}
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
	
	
		
	
}
