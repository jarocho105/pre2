/*
* ============================================================================
* GNU Lesser General Public License
* ============================================================================
*
* BYDAN - Free Java BYDAN library.
* Copyright (C) 2008 
* 
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
* 
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
* 
* BYDAN Corporation
*/
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class EstadoMonedaSessionBean {
	private Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	private Boolean isPermiteRecargarInformacion;
	private String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda;
	private Long lIdEstadoMonedaActualForeignKey;	
	
	private Long lIdEstadoMonedaActualForeignKeyParaPosibleAtras;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras;
	private String sUltimaBusquedaEstadoMoneda;
	private String sServletGenerarHtmlReporte;
	
	private Integer iNumeroPaginacion;
	private Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	
	
	private Long id;
	private String codigo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	
					
	 	
		
	public EstadoMonedaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda=false;
		this.lIdEstadoMonedaActualForeignKey=0L;
		this.lIdEstadoMonedaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras=false;
		this.sUltimaBusquedaEstadoMoneda ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		
		this.sStyleDivArbol="display:table-row";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		 
		
		
		
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
				this.sStyleDivArbol="display:table-row";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda= isPermiteNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda = sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoMoneda;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda= isBusquedaDesdeForeignKeySesionForeignKeyEstadoMoneda;
	}
					
	public Long getlIdEstadoMonedaActualForeignKey() {
		return lIdEstadoMonedaActualForeignKey;
	}

	public void setlIdEstadoMonedaActualForeignKey(
			Long lIdEstadoMonedaActualForeignKey) {
		this.lIdEstadoMonedaActualForeignKey = lIdEstadoMonedaActualForeignKey;
	}
				    
	public Long getlIdEstadoMonedaActualForeignKeyParaPosibleAtras() {
		return lIdEstadoMonedaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEstadoMonedaActualForeignKeyParaPosibleAtras(
			Long lIdEstadoMonedaActualForeignKeyParaPosibleAtras) {
		this.lIdEstadoMonedaActualForeignKeyParaPosibleAtras = lIdEstadoMonedaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEstadoMonedaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEstadoMoneda() {
		return sUltimaBusquedaEstadoMoneda;
	}

	public void setsUltimaBusquedaEstadoMoneda(String sUltimaBusquedaEstadoMoneda) {
		this.sUltimaBusquedaEstadoMoneda = sUltimaBusquedaEstadoMoneda;
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
			
    
	public Long getid() {
		return this.id;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("EstadoMoneda:Valor nulo no permitido en columna id");
				}

				this.id=newid;
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
					newcodigo="";
					System.out.println("EstadoMoneda:Valor nulo no permitido en columna codigo");
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("EstadoMoneda:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
