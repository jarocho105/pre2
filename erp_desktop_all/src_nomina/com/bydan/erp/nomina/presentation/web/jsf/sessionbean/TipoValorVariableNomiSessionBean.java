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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class TipoValorVariableNomiSessionBean  extends TipoValorVariableNomiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi;
	protected Long lIdTipoValorVariableNomiActualForeignKey;	
	
	protected Long lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras;
	protected String sUltimaBusquedaTipoValorVariableNomi;
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
	
					
	 	
		
	
	protected TipoValorVariableNomiSessionBeanAdditional tipovalorvariablenomiSessionBeanAdditional=null;
	
	public TipoValorVariableNomiSessionBeanAdditional getTipoValorVariableNomiSessionBeanAdditional() {
		return this.tipovalorvariablenomiSessionBeanAdditional;
	}
	
	public void setTipoValorVariableNomiSessionBeanAdditional(TipoValorVariableNomiSessionBeanAdditional tipovalorvariablenomiSessionBeanAdditional) {
		try {
			this.tipovalorvariablenomiSessionBeanAdditional=tipovalorvariablenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoValorVariableNomiSessionBean () {
		this.inicializarTipoValorVariableNomiSessionBean();
	}
	
	public void inicializarTipoValorVariableNomiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi=false;
		this.lIdTipoValorVariableNomiActualForeignKey=0L;
		this.lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras=false;
		this.sUltimaBusquedaTipoValorVariableNomi ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi= isPermiteNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoValorVariableNomi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi= isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi;
	}
					
	public Long getlIdTipoValorVariableNomiActualForeignKey() {
		return lIdTipoValorVariableNomiActualForeignKey;
	}

	public void setlIdTipoValorVariableNomiActualForeignKey(
			Long lIdTipoValorVariableNomiActualForeignKey) {
		this.lIdTipoValorVariableNomiActualForeignKey = lIdTipoValorVariableNomiActualForeignKey;
	}
				    
	public Long getlIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras() {
		return lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras(
			Long lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras) {
		this.lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras = lIdTipoValorVariableNomiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoValorVariableNomi() {
		return sUltimaBusquedaTipoValorVariableNomi;
	}

	public void setsUltimaBusquedaTipoValorVariableNomi(String sUltimaBusquedaTipoValorVariableNomi) {
		this.sUltimaBusquedaTipoValorVariableNomi = sUltimaBusquedaTipoValorVariableNomi;
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
						System.out.println("TipoValorVariableNomi:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
