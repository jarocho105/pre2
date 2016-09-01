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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class CobrarListadosMovimientosSessionBean  extends CobrarListadosMovimientosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos;
	protected Long lIdCobrarListadosMovimientosActualForeignKey;	
	
	protected Long lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras;
	protected String sUltimaBusquedaCobrarListadosMovimientos;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	
	private Long id;
	private Long id_empresa;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CobrarListadosMovimientosSessionBeanAdditional cobrarlistadosmovimientosSessionBeanAdditional=null;
	
	public CobrarListadosMovimientosSessionBeanAdditional getCobrarListadosMovimientosSessionBeanAdditional() {
		return this.cobrarlistadosmovimientosSessionBeanAdditional;
	}
	
	public void setCobrarListadosMovimientosSessionBeanAdditional(CobrarListadosMovimientosSessionBeanAdditional cobrarlistadosmovimientosSessionBeanAdditional) {
		try {
			this.cobrarlistadosmovimientosSessionBeanAdditional=cobrarlistadosmovimientosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CobrarListadosMovimientosSessionBean () {
		this.inicializarCobrarListadosMovimientosSessionBean();
	}
	
	public void inicializarCobrarListadosMovimientosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos=false;
		this.lIdCobrarListadosMovimientosActualForeignKey=0L;
		this.lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras=false;
		this.sUltimaBusquedaCobrarListadosMovimientos ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.fecha_emision_desde=new Date();
 		this.fecha_emision_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos= isPermiteNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos = sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarListadosMovimientos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos= isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientos;
	}
					
	public Long getlIdCobrarListadosMovimientosActualForeignKey() {
		return lIdCobrarListadosMovimientosActualForeignKey;
	}

	public void setlIdCobrarListadosMovimientosActualForeignKey(
			Long lIdCobrarListadosMovimientosActualForeignKey) {
		this.lIdCobrarListadosMovimientosActualForeignKey = lIdCobrarListadosMovimientosActualForeignKey;
	}
				    
	public Long getlIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras() {
		return lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras(
			Long lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras) {
		this.lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras = lIdCobrarListadosMovimientosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCobrarListadosMovimientosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCobrarListadosMovimientos() {
		return sUltimaBusquedaCobrarListadosMovimientos;
	}

	public void setsUltimaBusquedaCobrarListadosMovimientos(String sUltimaBusquedaCobrarListadosMovimientos) {
		this.sUltimaBusquedaCobrarListadosMovimientos = sUltimaBusquedaCobrarListadosMovimientos;
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
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Date getfecha_emision_desde() {
		return this.fecha_emision_desde;
	}
    
	public Date getfecha_emision_hasta() {
		return this.fecha_emision_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarListadosMovimientos:Valor nulo no permitido en columna id");
					}
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
					//newid_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarListadosMovimientos:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_desde(Date newfecha_emision_desde)throws Exception
	{
		try {
			if(this.fecha_emision_desde!=newfecha_emision_desde) {
				if(newfecha_emision_desde==null) {
					//newfecha_emision_desde=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarListadosMovimientos:Valor nulo no permitido en columna fecha_emision_desde");
					}
				}

				this.fecha_emision_desde=newfecha_emision_desde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_hasta(Date newfecha_emision_hasta)throws Exception
	{
		try {
			if(this.fecha_emision_hasta!=newfecha_emision_hasta) {
				if(newfecha_emision_hasta==null) {
					//newfecha_emision_hasta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarListadosMovimientos:Valor nulo no permitido en columna fecha_emision_hasta");
					}
				}

				this.fecha_emision_hasta=newfecha_emision_hasta;
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
