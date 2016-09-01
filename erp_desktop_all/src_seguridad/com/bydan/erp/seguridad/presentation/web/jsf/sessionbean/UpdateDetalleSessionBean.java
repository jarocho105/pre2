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
public class UpdateDetalleSessionBean  extends UpdateDetalleSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle;
	protected Long lIdUpdateDetalleActualForeignKey;	
	
	protected Long lIdUpdateDetalleActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras;
	protected String sUltimaBusquedaUpdateDetalle;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionUpdate;
	Long lidUpdateActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_update;
	private Long id_anio;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected UpdateDetalleSessionBeanAdditional updatedetalleSessionBeanAdditional=null;
	
	public UpdateDetalleSessionBeanAdditional getUpdateDetalleSessionBeanAdditional() {
		return this.updatedetalleSessionBeanAdditional;
	}
	
	public void setUpdateDetalleSessionBeanAdditional(UpdateDetalleSessionBeanAdditional updatedetalleSessionBeanAdditional) {
		try {
			this.updatedetalleSessionBeanAdditional=updatedetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public UpdateDetalleSessionBean () {
		this.inicializarUpdateDetalleSessionBean();
	}
	
	public void inicializarUpdateDetalleSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle=false;
		this.lIdUpdateDetalleActualForeignKey=0L;
		this.lIdUpdateDetalleActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras=false;
		this.sUltimaBusquedaUpdateDetalle ="";
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
		
		
		isBusquedaDesdeForeignKeySesionUpdate=false;
		lidUpdateActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_update=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle= isPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle(String sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle = sNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle= isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalle;
	}
					
	public Long getlIdUpdateDetalleActualForeignKey() {
		return lIdUpdateDetalleActualForeignKey;
	}

	public void setlIdUpdateDetalleActualForeignKey(
			Long lIdUpdateDetalleActualForeignKey) {
		this.lIdUpdateDetalleActualForeignKey = lIdUpdateDetalleActualForeignKey;
	}
				    
	public Long getlIdUpdateDetalleActualForeignKeyParaPosibleAtras() {
		return lIdUpdateDetalleActualForeignKeyParaPosibleAtras;
	}

	public void setlIdUpdateDetalleActualForeignKeyParaPosibleAtras(
			Long lIdUpdateDetalleActualForeignKeyParaPosibleAtras) {
		this.lIdUpdateDetalleActualForeignKeyParaPosibleAtras = lIdUpdateDetalleActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyUpdateDetalleParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaUpdateDetalle() {
		return sUltimaBusquedaUpdateDetalle;
	}

	public void setsUltimaBusquedaUpdateDetalle(String sUltimaBusquedaUpdateDetalle) {
		this.sUltimaBusquedaUpdateDetalle = sUltimaBusquedaUpdateDetalle;
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
    
	public Long getid_update() {
		return this.id_update;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UpdateDetalle:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_update(Long newid_update)throws Exception
	{
		try {
			if(this.id_update!=newid_update) {
				if(newid_update==null) {
					//newid_update=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UpdateDetalle:Valor nulo no permitido en columna id_update");
					}
				}

				this.id_update=newid_update;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionUpdate() {
		return isBusquedaDesdeForeignKeySesionUpdate;
	}

	public void setisBusquedaDesdeForeignKeySesionUpdate(
		Boolean isBusquedaDesdeForeignKeySesionUpdate) {
		this.isBusquedaDesdeForeignKeySesionUpdate = isBusquedaDesdeForeignKeySesionUpdate;
	}

	public Long getlidUpdateActual() {
		return lidUpdateActual;
	}

	public void setlidUpdateActual(Long lidUpdateActual) {
		this.lidUpdateActual = lidUpdateActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	
	
		
	
}
