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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class PagosAutorizadosSessionBean  extends PagosAutorizadosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados;
	protected Long lIdPagosAutorizadosActualForeignKey;	
	
	protected Long lIdPagosAutorizadosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras;
	protected String sUltimaBusquedaPagosAutorizados;
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
	private Date fecha_corte;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PagosAutorizadosSessionBeanAdditional pagosautorizadosSessionBeanAdditional=null;
	
	public PagosAutorizadosSessionBeanAdditional getPagosAutorizadosSessionBeanAdditional() {
		return this.pagosautorizadosSessionBeanAdditional;
	}
	
	public void setPagosAutorizadosSessionBeanAdditional(PagosAutorizadosSessionBeanAdditional pagosautorizadosSessionBeanAdditional) {
		try {
			this.pagosautorizadosSessionBeanAdditional=pagosautorizadosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PagosAutorizadosSessionBean () {
		this.inicializarPagosAutorizadosSessionBean();
	}
	
	public void inicializarPagosAutorizadosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados=false;
		this.lIdPagosAutorizadosActualForeignKey=0L;
		this.lIdPagosAutorizadosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras=false;
		this.sUltimaBusquedaPagosAutorizados ="";
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
 		this.fecha_corte=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados= isPermiteNavegacionHaciaForeignKeyDesdePagosAutorizados;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados(String sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados = sNombrePaginaNavegacionHaciaForeignKeyDesdePagosAutorizados;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados= isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizados;
	}
					
	public Long getlIdPagosAutorizadosActualForeignKey() {
		return lIdPagosAutorizadosActualForeignKey;
	}

	public void setlIdPagosAutorizadosActualForeignKey(
			Long lIdPagosAutorizadosActualForeignKey) {
		this.lIdPagosAutorizadosActualForeignKey = lIdPagosAutorizadosActualForeignKey;
	}
				    
	public Long getlIdPagosAutorizadosActualForeignKeyParaPosibleAtras() {
		return lIdPagosAutorizadosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPagosAutorizadosActualForeignKeyParaPosibleAtras(
			Long lIdPagosAutorizadosActualForeignKeyParaPosibleAtras) {
		this.lIdPagosAutorizadosActualForeignKeyParaPosibleAtras = lIdPagosAutorizadosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPagosAutorizadosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPagosAutorizados() {
		return sUltimaBusquedaPagosAutorizados;
	}

	public void setsUltimaBusquedaPagosAutorizados(String sUltimaBusquedaPagosAutorizados) {
		this.sUltimaBusquedaPagosAutorizados = sUltimaBusquedaPagosAutorizados;
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
    
	public Date getfecha_corte() {
		return this.fecha_corte;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PagosAutorizados:Valor nulo no permitido en columna id");
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
						System.out.println("PagosAutorizados:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_corte(Date newfecha_corte)throws Exception
	{
		try {
			if(this.fecha_corte!=newfecha_corte) {
				if(newfecha_corte==null) {
					//newfecha_corte=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("PagosAutorizados:Valor nulo no permitido en columna fecha_corte");
					}
				}

				this.fecha_corte=newfecha_corte;
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
