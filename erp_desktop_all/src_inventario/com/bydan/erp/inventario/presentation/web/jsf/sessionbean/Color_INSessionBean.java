/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class Color_INSessionBean {
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeColor_IN;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyColor_IN;
	protected Long lIdColor_INActualForeignKey;	
	
	protected Long lIdColor_INActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras;
	protected String sUltimaBusquedaColor_IN;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionGrupoColor;
	Long lidGrupoColorActual;
	
	private Long id;
	private Long id_grupo_color;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	public Color_INSessionBean () {
		this.inicializarColor_INSessionBean();
	}
	
	public void inicializarColor_INSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeColor_IN=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyColor_IN=false;
		this.lIdColor_INActualForeignKey=0L;
		this.lIdColor_INActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras=false;
		this.sUltimaBusquedaColor_IN ="";
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
		
		
		isBusquedaDesdeForeignKeySesionGrupoColor=false;
		lidGrupoColorActual=0L; 
		
		
		
 		this.id_grupo_color=0L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeColor_IN() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeColor_IN;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeColor_IN(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeColor_IN) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeColor_IN= isPermiteNavegacionHaciaForeignKeyDesdeColor_IN;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN(String sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN = sNombrePaginaNavegacionHaciaForeignKeyDesdeColor_IN;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyColor_IN() {
		return isBusquedaDesdeForeignKeySesionForeignKeyColor_IN;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyColor_IN(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyColor_IN) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyColor_IN= isBusquedaDesdeForeignKeySesionForeignKeyColor_IN;
	}
					
	public Long getlIdColor_INActualForeignKey() {
		return lIdColor_INActualForeignKey;
	}

	public void setlIdColor_INActualForeignKey(
			Long lIdColor_INActualForeignKey) {
		this.lIdColor_INActualForeignKey = lIdColor_INActualForeignKey;
	}
				    
	public Long getlIdColor_INActualForeignKeyParaPosibleAtras() {
		return lIdColor_INActualForeignKeyParaPosibleAtras;
	}

	public void setlIdColor_INActualForeignKeyParaPosibleAtras(
			Long lIdColor_INActualForeignKeyParaPosibleAtras) {
		this.lIdColor_INActualForeignKeyParaPosibleAtras = lIdColor_INActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyColor_INParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaColor_IN() {
		return sUltimaBusquedaColor_IN;
	}

	public void setsUltimaBusquedaColor_IN(String sUltimaBusquedaColor_IN) {
		this.sUltimaBusquedaColor_IN = sUltimaBusquedaColor_IN;
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
    
	public Long getid_grupo_color() {
		return this.id_grupo_color;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("Color_IN:Valor nulo no permitido en columna id");
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_color(Long newid_grupo_color)throws Exception
	{
		try {
			if(this.id_grupo_color!=newid_grupo_color) {
				if(newid_grupo_color==null) {
					newid_grupo_color=0L;
					System.out.println("Color_IN:Valor nulo no permitido en columna id_grupo_color");
				}

				this.id_grupo_color=newid_grupo_color;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoColor() {
		return isBusquedaDesdeForeignKeySesionGrupoColor;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoColor(
		Boolean isBusquedaDesdeForeignKeySesionGrupoColor) {
		this.isBusquedaDesdeForeignKeySesionGrupoColor = isBusquedaDesdeForeignKeySesionGrupoColor;
	}

	public Long getlidGrupoColorActual() {
		return lidGrupoColorActual;
	}

	public void setlidGrupoColorActual(Long lidGrupoColorActual) {
		this.lidGrupoColorActual = lidGrupoColorActual;
	}
	
	
		
	
}
