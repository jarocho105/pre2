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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class TipoPrestamoSessionBean  extends TipoPrestamoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo;
	protected Long lIdTipoPrestamoActualForeignKey;	
	
	protected Long lIdTipoPrestamoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras;
	protected String sUltimaBusquedaTipoPrestamo;
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
	Boolean isBusquedaDesdeForeignKeySesionRubroEmplea;
	Long lidRubroEmpleaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_rubro_emplea;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoPrestamoSessionBeanAdditional tipoprestamoSessionBeanAdditional=null;
	
	public TipoPrestamoSessionBeanAdditional getTipoPrestamoSessionBeanAdditional() {
		return this.tipoprestamoSessionBeanAdditional;
	}
	
	public void setTipoPrestamoSessionBeanAdditional(TipoPrestamoSessionBeanAdditional tipoprestamoSessionBeanAdditional) {
		try {
			this.tipoprestamoSessionBeanAdditional=tipoprestamoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoPrestamoSessionBean () {
		this.inicializarTipoPrestamoSessionBean();
	}
	
	public void inicializarTipoPrestamoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo=false;
		this.lIdTipoPrestamoActualForeignKey=0L;
		this.lIdTipoPrestamoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras=false;
		this.sUltimaBusquedaTipoPrestamo ="";
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
		isBusquedaDesdeForeignKeySesionRubroEmplea=false;
		lidRubroEmpleaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_rubro_emplea=-1L;
 		this.id_cuenta_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo= isPermiteNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPrestamo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo= isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo;
	}
					
	public Long getlIdTipoPrestamoActualForeignKey() {
		return lIdTipoPrestamoActualForeignKey;
	}

	public void setlIdTipoPrestamoActualForeignKey(
			Long lIdTipoPrestamoActualForeignKey) {
		this.lIdTipoPrestamoActualForeignKey = lIdTipoPrestamoActualForeignKey;
	}
				    
	public Long getlIdTipoPrestamoActualForeignKeyParaPosibleAtras() {
		return lIdTipoPrestamoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoPrestamoActualForeignKeyParaPosibleAtras(
			Long lIdTipoPrestamoActualForeignKeyParaPosibleAtras) {
		this.lIdTipoPrestamoActualForeignKeyParaPosibleAtras = lIdTipoPrestamoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoPrestamo() {
		return sUltimaBusquedaTipoPrestamo;
	}

	public void setsUltimaBusquedaTipoPrestamo(String sUltimaBusquedaTipoPrestamo) {
		this.sUltimaBusquedaTipoPrestamo = sUltimaBusquedaTipoPrestamo;
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
    
	public Long getid_rubro_emplea() {
		return this.id_rubro_emplea;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoPrestamo:Valor nulo no permitido en columna id");
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
						System.out.println("TipoPrestamo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_rubro_emplea(Long newid_rubro_emplea)throws Exception
	{
		try {
			if(this.id_rubro_emplea!=newid_rubro_emplea) {
				if(newid_rubro_emplea==null) {
					//newid_rubro_emplea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoPrestamo:Valor nulo no permitido en columna id_rubro_emplea");
					}
				}

				this.id_rubro_emplea=newid_rubro_emplea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoPrestamo:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionRubroEmplea(
		Boolean isBusquedaDesdeForeignKeySesionRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionRubroEmplea = isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public Long getlidRubroEmpleaActual() {
		return lidRubroEmpleaActual;
	}

	public void setlidRubroEmpleaActual(Long lidRubroEmpleaActual) {
		this.lidRubroEmpleaActual = lidRubroEmpleaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	
	
		
	
}
