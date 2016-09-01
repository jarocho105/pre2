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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class RadioVenciClienteProveSessionBean  extends RadioVenciClienteProveSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve;
	protected Long lIdRadioVenciClienteProveActualForeignKey;	
	
	protected Long lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras;
	protected String sUltimaBusquedaRadioVenciClienteProve;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoRadioVenci;
	Long lidTipoRadioVenciActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_radio_venci;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RadioVenciClienteProveSessionBeanAdditional radiovenciclienteproveSessionBeanAdditional=null;
	
	public RadioVenciClienteProveSessionBeanAdditional getRadioVenciClienteProveSessionBeanAdditional() {
		return this.radiovenciclienteproveSessionBeanAdditional;
	}
	
	public void setRadioVenciClienteProveSessionBeanAdditional(RadioVenciClienteProveSessionBeanAdditional radiovenciclienteproveSessionBeanAdditional) {
		try {
			this.radiovenciclienteproveSessionBeanAdditional=radiovenciclienteproveSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RadioVenciClienteProveSessionBean () {
		this.inicializarRadioVenciClienteProveSessionBean();
	}
	
	public void inicializarRadioVenciClienteProveSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve=false;
		this.lIdRadioVenciClienteProveActualForeignKey=0L;
		this.lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras=false;
		this.sUltimaBusquedaRadioVenciClienteProve ="";
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
		isBusquedaDesdeForeignKeySesionTipoRadioVenci=false;
		lidTipoRadioVenciActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_radio_venci=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve= isPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve = sNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve= isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProve;
	}
					
	public Long getlIdRadioVenciClienteProveActualForeignKey() {
		return lIdRadioVenciClienteProveActualForeignKey;
	}

	public void setlIdRadioVenciClienteProveActualForeignKey(
			Long lIdRadioVenciClienteProveActualForeignKey) {
		this.lIdRadioVenciClienteProveActualForeignKey = lIdRadioVenciClienteProveActualForeignKey;
	}
				    
	public Long getlIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras() {
		return lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras(
			Long lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras) {
		this.lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras = lIdRadioVenciClienteProveActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRadioVenciClienteProveParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRadioVenciClienteProve() {
		return sUltimaBusquedaRadioVenciClienteProve;
	}

	public void setsUltimaBusquedaRadioVenciClienteProve(String sUltimaBusquedaRadioVenciClienteProve) {
		this.sUltimaBusquedaRadioVenciClienteProve = sUltimaBusquedaRadioVenciClienteProve;
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
    
	public Long getid_tipo_radio_venci() {
		return this.id_tipo_radio_venci;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RadioVenciClienteProve:Valor nulo no permitido en columna id");
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
						System.out.println("RadioVenciClienteProve:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_radio_venci(Long newid_tipo_radio_venci)throws Exception
	{
		try {
			if(this.id_tipo_radio_venci!=newid_tipo_radio_venci) {
				if(newid_tipo_radio_venci==null) {
					//newid_tipo_radio_venci=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RadioVenciClienteProve:Valor nulo no permitido en columna id_tipo_radio_venci");
					}
				}

				this.id_tipo_radio_venci=newid_tipo_radio_venci;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRadioVenci() {
		return isBusquedaDesdeForeignKeySesionTipoRadioVenci;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRadioVenci(
		Boolean isBusquedaDesdeForeignKeySesionTipoRadioVenci) {
		this.isBusquedaDesdeForeignKeySesionTipoRadioVenci = isBusquedaDesdeForeignKeySesionTipoRadioVenci;
	}

	public Long getlidTipoRadioVenciActual() {
		return lidTipoRadioVenciActual;
	}

	public void setlidTipoRadioVenciActual(Long lidTipoRadioVenciActual) {
		this.lidTipoRadioVenciActual = lidTipoRadioVenciActual;
	}
	
	
		
	
}
