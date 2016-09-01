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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class ParametroPlanillaSessionBean  extends ParametroPlanillaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla;
	protected Long lIdParametroPlanillaActualForeignKey;	
	
	protected Long lIdParametroPlanillaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras;
	protected String sUltimaBusquedaParametroPlanilla;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInicial;
	Long lidCuentaContableInicialActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFinal;
	Long lidCuentaContableFinalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cuenta_contable_inicial;
	private Long id_cuenta_contable_final;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroPlanillaSessionBeanAdditional parametroplanillaSessionBeanAdditional=null;
	
	public ParametroPlanillaSessionBeanAdditional getParametroPlanillaSessionBeanAdditional() {
		return this.parametroplanillaSessionBeanAdditional;
	}
	
	public void setParametroPlanillaSessionBeanAdditional(ParametroPlanillaSessionBeanAdditional parametroplanillaSessionBeanAdditional) {
		try {
			this.parametroplanillaSessionBeanAdditional=parametroplanillaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroPlanillaSessionBean () {
		this.inicializarParametroPlanillaSessionBean();
	}
	
	public void inicializarParametroPlanillaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla=false;
		this.lIdParametroPlanillaActualForeignKey=0L;
		this.lIdParametroPlanillaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras=false;
		this.sUltimaBusquedaParametroPlanilla ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableInicial=false;
		lidCuentaContableInicialActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFinal=false;
		lidCuentaContableFinalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cuenta_contable_inicial=-1L;
 		this.id_cuenta_contable_final=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla= isPermiteNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroPlanilla;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla= isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla;
	}
					
	public Long getlIdParametroPlanillaActualForeignKey() {
		return lIdParametroPlanillaActualForeignKey;
	}

	public void setlIdParametroPlanillaActualForeignKey(
			Long lIdParametroPlanillaActualForeignKey) {
		this.lIdParametroPlanillaActualForeignKey = lIdParametroPlanillaActualForeignKey;
	}
				    
	public Long getlIdParametroPlanillaActualForeignKeyParaPosibleAtras() {
		return lIdParametroPlanillaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroPlanillaActualForeignKeyParaPosibleAtras(
			Long lIdParametroPlanillaActualForeignKeyParaPosibleAtras) {
		this.lIdParametroPlanillaActualForeignKeyParaPosibleAtras = lIdParametroPlanillaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroPlanillaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroPlanilla() {
		return sUltimaBusquedaParametroPlanilla;
	}

	public void setsUltimaBusquedaParametroPlanilla(String sUltimaBusquedaParametroPlanilla) {
		this.sUltimaBusquedaParametroPlanilla = sUltimaBusquedaParametroPlanilla;
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
    
	public Long getid_cuenta_contable_inicial() {
		return this.id_cuenta_contable_inicial;
	}
    
	public Long getid_cuenta_contable_final() {
		return this.id_cuenta_contable_final;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroPlanilla:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroPlanilla:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inicial(Long newid_cuenta_contable_inicial)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inicial!=newid_cuenta_contable_inicial) {
				if(newid_cuenta_contable_inicial==null) {
					//newid_cuenta_contable_inicial=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroPlanilla:Valor nulo no permitido en columna id_cuenta_contable_inicial");
					}
				}

				this.id_cuenta_contable_inicial=newid_cuenta_contable_inicial;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_final(Long newid_cuenta_contable_final)throws Exception
	{
		try {
			if(this.id_cuenta_contable_final!=newid_cuenta_contable_final) {
				if(newid_cuenta_contable_final==null) {
					//newid_cuenta_contable_final=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroPlanilla:Valor nulo no permitido en columna id_cuenta_contable_final");
					}
				}

				this.id_cuenta_contable_final=newid_cuenta_contable_final;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInicial() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInicial;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInicial(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInicial) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInicial = isBusquedaDesdeForeignKeySesionCuentaContableInicial;
	}

	public Long getlidCuentaContableInicialActual() {
		return lidCuentaContableInicialActual;
	}

	public void setlidCuentaContableInicialActual(Long lidCuentaContableInicialActual) {
		this.lidCuentaContableInicialActual = lidCuentaContableInicialActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFinal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFinal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFinal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFinal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFinal = isBusquedaDesdeForeignKeySesionCuentaContableFinal;
	}

	public Long getlidCuentaContableFinalActual() {
		return lidCuentaContableFinalActual;
	}

	public void setlidCuentaContableFinalActual(Long lidCuentaContableFinalActual) {
		this.lidCuentaContableFinalActual = lidCuentaContableFinalActual;
	}
	
	
		
	
}
