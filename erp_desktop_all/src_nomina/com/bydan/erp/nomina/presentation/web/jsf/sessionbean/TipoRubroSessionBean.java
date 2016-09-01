/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class TipoRubroSessionBean {
	private Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro;
	private Boolean isPermiteRecargarInformacion;
	private String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro;
	private Long lIdTipoRubroActualForeignKey;	
	
	private Long lIdTipoRubroActualForeignKeyParaPosibleAtras;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras;
	private String sUltimaBusquedaTipoRubro;
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
	
	private Long id;
	private Long id_empresa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	
					
	 	
		
	public TipoRubroSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro=false;
		this.lIdTipoRubroActualForeignKey=0L;
		this.lIdTipoRubroActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras=false;
		this.sUltimaBusquedaTipoRubro ="";
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
		
		
		
 		this.id_empresa=0L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoRubro() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoRubro(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro= isPermiteNavegacionHaciaForeignKeyDesdeTipoRubro;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRubro;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRubro() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRubro(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro= isBusquedaDesdeForeignKeySesionForeignKeyTipoRubro;
	}
					
	public Long getlIdTipoRubroActualForeignKey() {
		return lIdTipoRubroActualForeignKey;
	}

	public void setlIdTipoRubroActualForeignKey(
			Long lIdTipoRubroActualForeignKey) {
		this.lIdTipoRubroActualForeignKey = lIdTipoRubroActualForeignKey;
	}
				    
	public Long getlIdTipoRubroActualForeignKeyParaPosibleAtras() {
		return lIdTipoRubroActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoRubroActualForeignKeyParaPosibleAtras(
			Long lIdTipoRubroActualForeignKeyParaPosibleAtras) {
		this.lIdTipoRubroActualForeignKeyParaPosibleAtras = lIdTipoRubroActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoRubroParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoRubro() {
		return sUltimaBusquedaTipoRubro;
	}

	public void setsUltimaBusquedaTipoRubro(String sUltimaBusquedaTipoRubro) {
		this.sUltimaBusquedaTipoRubro = sUltimaBusquedaTipoRubro;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("TipoRubro:Valor nulo no permitido en columna id");
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
					System.out.println("TipoRubro:Valor nulo no permitido en columna id_empresa");
				}

				this.id_empresa=newid_empresa;
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
	
	
		
	
}
