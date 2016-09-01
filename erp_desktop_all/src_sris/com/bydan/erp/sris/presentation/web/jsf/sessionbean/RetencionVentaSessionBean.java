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
package com.bydan.erp.sris.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.sris.business.entity.*;

@SuppressWarnings("unused")
public class RetencionVentaSessionBean  extends RetencionVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta;
	protected Long lIdRetencionVentaActualForeignKey;	
	
	protected Long lIdRetencionVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras;
	protected String sUltimaBusquedaRetencionVenta;
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
	Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	Long lidPeriodoDeclaraActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencion;
	Long lidTipoRetencionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_periodo_declara;
	private Long id_tipo_retencion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RetencionVentaSessionBeanAdditional retencionventaSessionBeanAdditional=null;
	
	public RetencionVentaSessionBeanAdditional getRetencionVentaSessionBeanAdditional() {
		return this.retencionventaSessionBeanAdditional;
	}
	
	public void setRetencionVentaSessionBeanAdditional(RetencionVentaSessionBeanAdditional retencionventaSessionBeanAdditional) {
		try {
			this.retencionventaSessionBeanAdditional=retencionventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RetencionVentaSessionBean () {
		this.inicializarRetencionVentaSessionBean();
	}
	
	public void inicializarRetencionVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta=false;
		this.lIdRetencionVentaActualForeignKey=0L;
		this.lIdRetencionVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras=false;
		this.sUltimaBusquedaRetencionVenta ="";
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
		isBusquedaDesdeForeignKeySesionPeriodoDeclara=false;
		lidPeriodoDeclaraActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencion=false;
		lidTipoRetencionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_periodo_declara=-1L;
 		this.id_tipo_retencion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta= isPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta= isBusquedaDesdeForeignKeySesionForeignKeyRetencionVenta;
	}
					
	public Long getlIdRetencionVentaActualForeignKey() {
		return lIdRetencionVentaActualForeignKey;
	}

	public void setlIdRetencionVentaActualForeignKey(
			Long lIdRetencionVentaActualForeignKey) {
		this.lIdRetencionVentaActualForeignKey = lIdRetencionVentaActualForeignKey;
	}
				    
	public Long getlIdRetencionVentaActualForeignKeyParaPosibleAtras() {
		return lIdRetencionVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRetencionVentaActualForeignKeyParaPosibleAtras(
			Long lIdRetencionVentaActualForeignKeyParaPosibleAtras) {
		this.lIdRetencionVentaActualForeignKeyParaPosibleAtras = lIdRetencionVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRetencionVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRetencionVenta() {
		return sUltimaBusquedaRetencionVenta;
	}

	public void setsUltimaBusquedaRetencionVenta(String sUltimaBusquedaRetencionVenta) {
		this.sUltimaBusquedaRetencionVenta = sUltimaBusquedaRetencionVenta;
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
    
	public Long getid_periodo_declara() {
		return this.id_periodo_declara;
	}
    
	public Long getid_tipo_retencion() {
		return this.id_tipo_retencion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionVenta:Valor nulo no permitido en columna id");
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
						System.out.println("RetencionVenta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo_declara(Long newid_periodo_declara)throws Exception
	{
		try {
			if(this.id_periodo_declara!=newid_periodo_declara) {
				if(newid_periodo_declara==null) {
					//newid_periodo_declara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionVenta:Valor nulo no permitido en columna id_periodo_declara");
					}
				}

				this.id_periodo_declara=newid_periodo_declara;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion(Long newid_tipo_retencion)throws Exception
	{
		try {
			if(this.id_tipo_retencion!=newid_tipo_retencion) {
				if(newid_tipo_retencion==null) {
					//newid_tipo_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RetencionVenta:Valor nulo no permitido en columna id_tipo_retencion");
					}
				}

				this.id_tipo_retencion=newid_tipo_retencion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodoDeclara() {
		return isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodoDeclara(
		Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara) {
		this.isBusquedaDesdeForeignKeySesionPeriodoDeclara = isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public Long getlidPeriodoDeclaraActual() {
		return lidPeriodoDeclaraActual;
	}

	public void setlidPeriodoDeclaraActual(Long lidPeriodoDeclaraActual) {
		this.lidPeriodoDeclaraActual = lidPeriodoDeclaraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencion() {
		return isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencion) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencion = isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public Long getlidTipoRetencionActual() {
		return lidTipoRetencionActual;
	}

	public void setlidTipoRetencionActual(Long lidTipoRetencionActual) {
		this.lidTipoRetencionActual = lidTipoRetencionActual;
	}
	
	
		
	
}
