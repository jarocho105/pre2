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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoLiquidacionSessionBean  extends ProcesoLiquidacionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion;
	protected Long lIdProcesoLiquidacionActualForeignKey;	
	
	protected Long lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras;
	protected String sUltimaBusquedaProcesoLiquidacion;
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
	
	
	
	private Long id;
	private Date fecha;
	private Boolean es_reversar;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoLiquidacionSessionBeanAdditional procesoliquidacionSessionBeanAdditional=null;
	
	public ProcesoLiquidacionSessionBeanAdditional getProcesoLiquidacionSessionBeanAdditional() {
		return this.procesoliquidacionSessionBeanAdditional;
	}
	
	public void setProcesoLiquidacionSessionBeanAdditional(ProcesoLiquidacionSessionBeanAdditional procesoliquidacionSessionBeanAdditional) {
		try {
			this.procesoliquidacionSessionBeanAdditional=procesoliquidacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoLiquidacionSessionBean () {
		this.inicializarProcesoLiquidacionSessionBean();
	}
	
	public void inicializarProcesoLiquidacionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion=false;
		this.lIdProcesoLiquidacionActualForeignKey=0L;
		this.lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoLiquidacion ="";
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
		
		 
		
		
		
 		this.fecha=new Date();
 		this.es_reversar=false;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion= isPermiteNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoLiquidacion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion= isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacion;
	}
					
	public Long getlIdProcesoLiquidacionActualForeignKey() {
		return lIdProcesoLiquidacionActualForeignKey;
	}

	public void setlIdProcesoLiquidacionActualForeignKey(
			Long lIdProcesoLiquidacionActualForeignKey) {
		this.lIdProcesoLiquidacionActualForeignKey = lIdProcesoLiquidacionActualForeignKey;
	}
				    
	public Long getlIdProcesoLiquidacionActualForeignKeyParaPosibleAtras() {
		return lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoLiquidacionActualForeignKeyParaPosibleAtras(
			Long lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras = lIdProcesoLiquidacionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoLiquidacionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoLiquidacion() {
		return sUltimaBusquedaProcesoLiquidacion;
	}

	public void setsUltimaBusquedaProcesoLiquidacion(String sUltimaBusquedaProcesoLiquidacion) {
		this.sUltimaBusquedaProcesoLiquidacion = sUltimaBusquedaProcesoLiquidacion;
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
    
	public Date getfecha() {
		return this.fecha;
	}
    
	public Boolean getes_reversar() {
		return this.es_reversar;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoLiquidacion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha(Date newfecha)throws Exception
	{
		try {
			if(this.fecha!=newfecha) {
				if(newfecha==null) {
					//newfecha=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoLiquidacion:Valor nulo no permitido en columna fecha");
					}
				}

				this.fecha=newfecha;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setes_reversar(Boolean newes_reversar)throws Exception
	{
		try {
			if(this.es_reversar!=newes_reversar) {
				if(newes_reversar==null) {
					//newes_reversar=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoLiquidacion:Valor nulo no permitido en columna es_reversar");
					}
				}

				this.es_reversar=newes_reversar;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
