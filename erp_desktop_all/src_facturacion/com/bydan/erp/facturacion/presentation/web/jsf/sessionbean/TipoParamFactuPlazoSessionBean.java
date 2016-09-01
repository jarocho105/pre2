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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class TipoParamFactuPlazoSessionBean  extends TipoParamFactuPlazoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo;
	protected Long lIdTipoParamFactuPlazoActualForeignKey;	
	
	protected Long lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras;
	protected String sUltimaBusquedaTipoParamFactuPlazo;
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
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoParamFactuPlazoSessionBeanAdditional tipoparamfactuplazoSessionBeanAdditional=null;
	
	public TipoParamFactuPlazoSessionBeanAdditional getTipoParamFactuPlazoSessionBeanAdditional() {
		return this.tipoparamfactuplazoSessionBeanAdditional;
	}
	
	public void setTipoParamFactuPlazoSessionBeanAdditional(TipoParamFactuPlazoSessionBeanAdditional tipoparamfactuplazoSessionBeanAdditional) {
		try {
			this.tipoparamfactuplazoSessionBeanAdditional=tipoparamfactuplazoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoParamFactuPlazoSessionBean () {
		this.inicializarTipoParamFactuPlazoSessionBean();
	}
	
	public void inicializarTipoParamFactuPlazoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo=false;
		this.lIdTipoParamFactuPlazoActualForeignKey=0L;
		this.lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras=false;
		this.sUltimaBusquedaTipoParamFactuPlazo ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo= isPermiteNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoParamFactuPlazo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo= isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazo;
	}
					
	public Long getlIdTipoParamFactuPlazoActualForeignKey() {
		return lIdTipoParamFactuPlazoActualForeignKey;
	}

	public void setlIdTipoParamFactuPlazoActualForeignKey(
			Long lIdTipoParamFactuPlazoActualForeignKey) {
		this.lIdTipoParamFactuPlazoActualForeignKey = lIdTipoParamFactuPlazoActualForeignKey;
	}
				    
	public Long getlIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras() {
		return lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras(
			Long lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras) {
		this.lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras = lIdTipoParamFactuPlazoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoParamFactuPlazoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoParamFactuPlazo() {
		return sUltimaBusquedaTipoParamFactuPlazo;
	}

	public void setsUltimaBusquedaTipoParamFactuPlazo(String sUltimaBusquedaTipoParamFactuPlazo) {
		this.sUltimaBusquedaTipoParamFactuPlazo = sUltimaBusquedaTipoParamFactuPlazo;
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
						System.out.println("TipoParamFactuPlazo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("TipoParamFactuPlazo:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("TipoParamFactuPlazo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
