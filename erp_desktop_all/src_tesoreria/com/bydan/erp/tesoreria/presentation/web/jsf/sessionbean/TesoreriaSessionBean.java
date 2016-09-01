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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class TesoreriaSessionBean  extends TesoreriaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTesoreria;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTesoreria;
	protected Long lIdTesoreriaActualForeignKey;	
	
	protected Long lIdTesoreriaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras;
	protected String sUltimaBusquedaTesoreria;
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
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TesoreriaSessionBeanAdditional tesoreriaSessionBeanAdditional=null;
	
	public TesoreriaSessionBeanAdditional getTesoreriaSessionBeanAdditional() {
		return this.tesoreriaSessionBeanAdditional;
	}
	
	public void setTesoreriaSessionBeanAdditional(TesoreriaSessionBeanAdditional tesoreriaSessionBeanAdditional) {
		try {
			this.tesoreriaSessionBeanAdditional=tesoreriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TesoreriaSessionBean () {
		this.inicializarTesoreriaSessionBean();
	}
	
	public void inicializarTesoreriaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTesoreria=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTesoreria=false;
		this.lIdTesoreriaActualForeignKey=0L;
		this.lIdTesoreriaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras=false;
		this.sUltimaBusquedaTesoreria ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTesoreria() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTesoreria;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTesoreria(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTesoreria) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTesoreria= isPermiteNavegacionHaciaForeignKeyDesdeTesoreria;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria = sNombrePaginaNavegacionHaciaForeignKeyDesdeTesoreria;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTesoreria() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTesoreria;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTesoreria(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTesoreria) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTesoreria= isBusquedaDesdeForeignKeySesionForeignKeyTesoreria;
	}
					
	public Long getlIdTesoreriaActualForeignKey() {
		return lIdTesoreriaActualForeignKey;
	}

	public void setlIdTesoreriaActualForeignKey(
			Long lIdTesoreriaActualForeignKey) {
		this.lIdTesoreriaActualForeignKey = lIdTesoreriaActualForeignKey;
	}
				    
	public Long getlIdTesoreriaActualForeignKeyParaPosibleAtras() {
		return lIdTesoreriaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTesoreriaActualForeignKeyParaPosibleAtras(
			Long lIdTesoreriaActualForeignKeyParaPosibleAtras) {
		this.lIdTesoreriaActualForeignKeyParaPosibleAtras = lIdTesoreriaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTesoreriaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTesoreria() {
		return sUltimaBusquedaTesoreria;
	}

	public void setsUltimaBusquedaTesoreria(String sUltimaBusquedaTesoreria) {
		this.sUltimaBusquedaTesoreria = sUltimaBusquedaTesoreria;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tesoreria:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
