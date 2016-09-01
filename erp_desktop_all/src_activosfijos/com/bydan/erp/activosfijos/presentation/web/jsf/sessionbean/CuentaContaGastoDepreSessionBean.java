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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class CuentaContaGastoDepreSessionBean  extends CuentaContaGastoDepreSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre;
	protected Long lIdCuentaContaGastoDepreActualForeignKey;	
	
	protected Long lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras;
	protected String sUltimaBusquedaCuentaContaGastoDepre;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionGastoDepreciacion;
	Long lidGastoDepreciacionActual;
	
	private Long id;
	private Long id_cuenta_contable;
	private Long id_gasto_depreciacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaContaGastoDepreSessionBeanAdditional cuentacontagastodepreSessionBeanAdditional=null;
	
	public CuentaContaGastoDepreSessionBeanAdditional getCuentaContaGastoDepreSessionBeanAdditional() {
		return this.cuentacontagastodepreSessionBeanAdditional;
	}
	
	public void setCuentaContaGastoDepreSessionBeanAdditional(CuentaContaGastoDepreSessionBeanAdditional cuentacontagastodepreSessionBeanAdditional) {
		try {
			this.cuentacontagastodepreSessionBeanAdditional=cuentacontagastodepreSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaContaGastoDepreSessionBean () {
		this.inicializarCuentaContaGastoDepreSessionBean();
	}
	
	public void inicializarCuentaContaGastoDepreSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre=false;
		this.lIdCuentaContaGastoDepreActualForeignKey=0L;
		this.lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaContaGastoDepre ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionGastoDepreciacion=false;
		lidGastoDepreciacionActual=0L; 
		
		
		
 		this.id_cuenta_contable=-1L;
 		this.id_gasto_depreciacion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre= isPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre= isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre;
	}
					
	public Long getlIdCuentaContaGastoDepreActualForeignKey() {
		return lIdCuentaContaGastoDepreActualForeignKey;
	}

	public void setlIdCuentaContaGastoDepreActualForeignKey(
			Long lIdCuentaContaGastoDepreActualForeignKey) {
		this.lIdCuentaContaGastoDepreActualForeignKey = lIdCuentaContaGastoDepreActualForeignKey;
	}
				    
	public Long getlIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras() {
		return lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras(
			Long lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras = lIdCuentaContaGastoDepreActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepreParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaContaGastoDepre() {
		return sUltimaBusquedaCuentaContaGastoDepre;
	}

	public void setsUltimaBusquedaCuentaContaGastoDepre(String sUltimaBusquedaCuentaContaGastoDepre) {
		this.sUltimaBusquedaCuentaContaGastoDepre = sUltimaBusquedaCuentaContaGastoDepre;
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
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_gasto_depreciacion() {
		return this.id_gasto_depreciacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContaGastoDepre:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("CuentaContaGastoDepre:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_gasto_depreciacion(Long newid_gasto_depreciacion)throws Exception
	{
		try {
			if(this.id_gasto_depreciacion!=newid_gasto_depreciacion) {
				if(newid_gasto_depreciacion==null) {
					//newid_gasto_depreciacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContaGastoDepre:Valor nulo no permitido en columna id_gasto_depreciacion");
					}
				}

				this.id_gasto_depreciacion=newid_gasto_depreciacion;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionGastoDepreciacion() {
		return isBusquedaDesdeForeignKeySesionGastoDepreciacion;
	}

	public void setisBusquedaDesdeForeignKeySesionGastoDepreciacion(
		Boolean isBusquedaDesdeForeignKeySesionGastoDepreciacion) {
		this.isBusquedaDesdeForeignKeySesionGastoDepreciacion = isBusquedaDesdeForeignKeySesionGastoDepreciacion;
	}

	public Long getlidGastoDepreciacionActual() {
		return lidGastoDepreciacionActual;
	}

	public void setlidGastoDepreciacionActual(Long lidGastoDepreciacionActual) {
		this.lidGastoDepreciacionActual = lidGastoDepreciacionActual;
	}
	
	
		
	
}
