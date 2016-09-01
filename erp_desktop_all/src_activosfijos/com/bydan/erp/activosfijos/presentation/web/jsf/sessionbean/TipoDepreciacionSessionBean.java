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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class TipoDepreciacionSessionBean {
	private Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	private Boolean isPermiteRecargarInformacion;
	private String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion;
	private Long lIdTipoDepreciacionActualForeignKey;	
	
	private Long lIdTipoDepreciacionActualForeignKeyParaPosibleAtras;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras;
	private String sUltimaBusquedaTipoDepreciacion;
	private String sServletGenerarHtmlReporte;
	
	private Integer iNumeroPaginacion;
	private Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion;
	Long lidTipoCalculoDepreciacionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_calculo_depreciacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	
					
	 	
		
	public TipoDepreciacionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion=false;
		this.lIdTipoDepreciacionActualForeignKey=0L;
		this.lIdTipoDepreciacionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras=false;
		this.sUltimaBusquedaTipoDepreciacion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion=false;
		lidTipoCalculoDepreciacionActual=0L; 
		
		
		
 		this.id_empresa=0L;
 		this.id_tipo_calculo_depreciacion=0L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion= isPermiteNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDepreciacion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion= isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacion;
	}
					
	public Long getlIdTipoDepreciacionActualForeignKey() {
		return lIdTipoDepreciacionActualForeignKey;
	}

	public void setlIdTipoDepreciacionActualForeignKey(
			Long lIdTipoDepreciacionActualForeignKey) {
		this.lIdTipoDepreciacionActualForeignKey = lIdTipoDepreciacionActualForeignKey;
	}
				    
	public Long getlIdTipoDepreciacionActualForeignKeyParaPosibleAtras() {
		return lIdTipoDepreciacionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoDepreciacionActualForeignKeyParaPosibleAtras(
			Long lIdTipoDepreciacionActualForeignKeyParaPosibleAtras) {
		this.lIdTipoDepreciacionActualForeignKeyParaPosibleAtras = lIdTipoDepreciacionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoDepreciacion() {
		return sUltimaBusquedaTipoDepreciacion;
	}

	public void setsUltimaBusquedaTipoDepreciacion(String sUltimaBusquedaTipoDepreciacion) {
		this.sUltimaBusquedaTipoDepreciacion = sUltimaBusquedaTipoDepreciacion;
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
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_tipo_calculo_depreciacion() {
		return this.id_tipo_calculo_depreciacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("TipoDepreciacion:Valor nulo no permitido en columna id");
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa(Long newid_empresa)throws Exception
	{
		try {
			if(this.id_empresa!=newid_empresa) {
				if(newid_empresa==null) {
					newid_empresa=0L;
					System.out.println("TipoDepreciacion:Valor nulo no permitido en columna id_empresa");
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_calculo_depreciacion(Long newid_tipo_calculo_depreciacion)throws Exception
	{
		try {
			if(this.id_tipo_calculo_depreciacion!=newid_tipo_calculo_depreciacion) {
				if(newid_tipo_calculo_depreciacion==null) {
					newid_tipo_calculo_depreciacion=0L;
					System.out.println("TipoDepreciacion:Valor nulo no permitido en columna id_tipo_calculo_depreciacion");
				}

				this.id_tipo_calculo_depreciacion=newid_tipo_calculo_depreciacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresa() {
		return isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionEmpresa) {
		this.isBusquedaDesdeForeignKeySesionEmpresa = isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public Long getlidEmpresaActual() {
		return lidEmpresaActual;
	}

	public void setlidEmpresaActual(Long lidEmpresaActual) {
		this.lidEmpresaActual = lidEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion() {
		return isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion) {
		this.isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion = isBusquedaDesdeForeignKeySesionTipoCalculoDepreciacion;
	}

	public Long getlidTipoCalculoDepreciacionActual() {
		return lidTipoCalculoDepreciacionActual;
	}

	public void setlidTipoCalculoDepreciacionActual(Long lidTipoCalculoDepreciacionActual) {
		this.lidTipoCalculoDepreciacionActual = lidTipoCalculoDepreciacionActual;
	}
	
	
		
	
}
