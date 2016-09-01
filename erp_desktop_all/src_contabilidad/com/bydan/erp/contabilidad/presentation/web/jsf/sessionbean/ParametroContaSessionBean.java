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
public class ParametroContaSessionBean  extends ParametroContaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroConta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroConta;
	protected Long lIdParametroContaActualForeignKey;	
	
	protected Long lIdParametroContaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras;
	protected String sUltimaBusquedaParametroConta;
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
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionMonedaExtranjera;
	Long lidMonedaExtranjeraActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	Long lidCuentaContableActivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	Long lidCuentaContablePasivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	Long lidCuentaContablePatrimonioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso;
	Long lidCuentaContableIngresoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso;
	Long lidCuentaContableEgresoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableResumen;
	Long lidCuentaContableResumenActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDeudor;
	Long lidCuentaContableDeudorActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableAcreedor;
	Long lidCuentaContableAcreedorActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso1;
	Long lidCuentaContableIngreso1Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso2;
	Long lidCuentaContableIngreso2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso3;
	Long lidCuentaContableIngreso3Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso1;
	Long lidCuentaContableEgreso1Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso2;
	Long lidCuentaContableEgreso2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso3;
	Long lidCuentaContableEgreso3Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_moneda;
	private Long id_moneda_extranjera;
	private Long id_cuenta_contable_activo;
	private Long id_cuenta_contable_pasivo;
	private Long id_cuenta_contable_patrimonio;
	private Long id_cuenta_contable_ingreso;
	private Long id_cuenta_contable_egreso;
	private Long id_cuenta_contable_resumen;
	private Long id_cuenta_contable_deudor;
	private Long id_cuenta_contable_acreedor;
	private Long id_cuenta_contable_ingreso1;
	private Long id_cuenta_contable_ingreso2;
	private Long id_cuenta_contable_ingreso3;
	private Long id_cuenta_contable_egreso1;
	private Long id_cuenta_contable_egreso2;
	private Long id_cuenta_contable_egreso3;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroContaSessionBeanAdditional parametrocontaSessionBeanAdditional=null;
	
	public ParametroContaSessionBeanAdditional getParametroContaSessionBeanAdditional() {
		return this.parametrocontaSessionBeanAdditional;
	}
	
	public void setParametroContaSessionBeanAdditional(ParametroContaSessionBeanAdditional parametrocontaSessionBeanAdditional) {
		try {
			this.parametrocontaSessionBeanAdditional=parametrocontaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroContaSessionBean () {
		this.inicializarParametroContaSessionBean();
	}
	
	public void inicializarParametroContaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroConta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroConta=false;
		this.lIdParametroContaActualForeignKey=0L;
		this.lIdParametroContaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras=false;
		this.sUltimaBusquedaParametroConta ="";
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
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionMonedaExtranjera=false;
		lidMonedaExtranjeraActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableActivo=false;
		lidCuentaContableActivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePasivo=false;
		lidCuentaContablePasivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio=false;
		lidCuentaContablePatrimonioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngreso=false;
		lidCuentaContableIngresoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableEgreso=false;
		lidCuentaContableEgresoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableResumen=false;
		lidCuentaContableResumenActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDeudor=false;
		lidCuentaContableDeudorActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableAcreedor=false;
		lidCuentaContableAcreedorActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngreso1=false;
		lidCuentaContableIngreso1Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngreso2=false;
		lidCuentaContableIngreso2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngreso3=false;
		lidCuentaContableIngreso3Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableEgreso1=false;
		lidCuentaContableEgreso1Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableEgreso2=false;
		lidCuentaContableEgreso2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableEgreso3=false;
		lidCuentaContableEgreso3Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_moneda=-1L;
 		this.id_moneda_extranjera=-1L;
 		this.id_cuenta_contable_activo=-1L;
 		this.id_cuenta_contable_pasivo=-1L;
 		this.id_cuenta_contable_patrimonio=-1L;
 		this.id_cuenta_contable_ingreso=-1L;
 		this.id_cuenta_contable_egreso=-1L;
 		this.id_cuenta_contable_resumen=-1L;
 		this.id_cuenta_contable_deudor=-1L;
 		this.id_cuenta_contable_acreedor=-1L;
 		this.id_cuenta_contable_ingreso1=null;
 		this.id_cuenta_contable_ingreso2=null;
 		this.id_cuenta_contable_ingreso3=null;
 		this.id_cuenta_contable_egreso1=null;
 		this.id_cuenta_contable_egreso2=null;
 		this.id_cuenta_contable_egreso3=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroConta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroConta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroConta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroConta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroConta= isPermiteNavegacionHaciaForeignKeyDesdeParametroConta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroConta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroConta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroConta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroConta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroConta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroConta= isBusquedaDesdeForeignKeySesionForeignKeyParametroConta;
	}
					
	public Long getlIdParametroContaActualForeignKey() {
		return lIdParametroContaActualForeignKey;
	}

	public void setlIdParametroContaActualForeignKey(
			Long lIdParametroContaActualForeignKey) {
		this.lIdParametroContaActualForeignKey = lIdParametroContaActualForeignKey;
	}
				    
	public Long getlIdParametroContaActualForeignKeyParaPosibleAtras() {
		return lIdParametroContaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroContaActualForeignKeyParaPosibleAtras(
			Long lIdParametroContaActualForeignKeyParaPosibleAtras) {
		this.lIdParametroContaActualForeignKeyParaPosibleAtras = lIdParametroContaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroContaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroConta() {
		return sUltimaBusquedaParametroConta;
	}

	public void setsUltimaBusquedaParametroConta(String sUltimaBusquedaParametroConta) {
		this.sUltimaBusquedaParametroConta = sUltimaBusquedaParametroConta;
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
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_moneda_extranjera() {
		return this.id_moneda_extranjera;
	}
    
	public Long getid_cuenta_contable_activo() {
		return this.id_cuenta_contable_activo;
	}
    
	public Long getid_cuenta_contable_pasivo() {
		return this.id_cuenta_contable_pasivo;
	}
    
	public Long getid_cuenta_contable_patrimonio() {
		return this.id_cuenta_contable_patrimonio;
	}
    
	public Long getid_cuenta_contable_ingreso() {
		return this.id_cuenta_contable_ingreso;
	}
    
	public Long getid_cuenta_contable_egreso() {
		return this.id_cuenta_contable_egreso;
	}
    
	public Long getid_cuenta_contable_resumen() {
		return this.id_cuenta_contable_resumen;
	}
    
	public Long getid_cuenta_contable_deudor() {
		return this.id_cuenta_contable_deudor;
	}
    
	public Long getid_cuenta_contable_acreedor() {
		return this.id_cuenta_contable_acreedor;
	}
    
	public Long getid_cuenta_contable_ingreso1() {
		return this.id_cuenta_contable_ingreso1;
	}
    
	public Long getid_cuenta_contable_ingreso2() {
		return this.id_cuenta_contable_ingreso2;
	}
    
	public Long getid_cuenta_contable_ingreso3() {
		return this.id_cuenta_contable_ingreso3;
	}
    
	public Long getid_cuenta_contable_egreso1() {
		return this.id_cuenta_contable_egreso1;
	}
    
	public Long getid_cuenta_contable_egreso2() {
		return this.id_cuenta_contable_egreso2;
	}
    
	public Long getid_cuenta_contable_egreso3() {
		return this.id_cuenta_contable_egreso3;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda_extranjera(Long newid_moneda_extranjera)throws Exception
	{
		try {
			if(this.id_moneda_extranjera!=newid_moneda_extranjera) {
				if(newid_moneda_extranjera==null) {
					//newid_moneda_extranjera=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_moneda_extranjera");
					}
				}

				this.id_moneda_extranjera=newid_moneda_extranjera;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_activo(Long newid_cuenta_contable_activo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_activo!=newid_cuenta_contable_activo) {
				if(newid_cuenta_contable_activo==null) {
					//newid_cuenta_contable_activo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_activo");
					}
				}

				this.id_cuenta_contable_activo=newid_cuenta_contable_activo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_pasivo(Long newid_cuenta_contable_pasivo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_pasivo!=newid_cuenta_contable_pasivo) {
				if(newid_cuenta_contable_pasivo==null) {
					//newid_cuenta_contable_pasivo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_pasivo");
					}
				}

				this.id_cuenta_contable_pasivo=newid_cuenta_contable_pasivo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_patrimonio(Long newid_cuenta_contable_patrimonio)throws Exception
	{
		try {
			if(this.id_cuenta_contable_patrimonio!=newid_cuenta_contable_patrimonio) {
				if(newid_cuenta_contable_patrimonio==null) {
					//newid_cuenta_contable_patrimonio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_patrimonio");
					}
				}

				this.id_cuenta_contable_patrimonio=newid_cuenta_contable_patrimonio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ingreso(Long newid_cuenta_contable_ingreso)throws Exception
	{
		try {
			if(this.id_cuenta_contable_ingreso!=newid_cuenta_contable_ingreso) {
				if(newid_cuenta_contable_ingreso==null) {
					//newid_cuenta_contable_ingreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_ingreso");
					}
				}

				this.id_cuenta_contable_ingreso=newid_cuenta_contable_ingreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_egreso(Long newid_cuenta_contable_egreso)throws Exception
	{
		try {
			if(this.id_cuenta_contable_egreso!=newid_cuenta_contable_egreso) {
				if(newid_cuenta_contable_egreso==null) {
					//newid_cuenta_contable_egreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_egreso");
					}
				}

				this.id_cuenta_contable_egreso=newid_cuenta_contable_egreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_resumen(Long newid_cuenta_contable_resumen)throws Exception
	{
		try {
			if(this.id_cuenta_contable_resumen!=newid_cuenta_contable_resumen) {
				if(newid_cuenta_contable_resumen==null) {
					//newid_cuenta_contable_resumen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_resumen");
					}
				}

				this.id_cuenta_contable_resumen=newid_cuenta_contable_resumen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_deudor(Long newid_cuenta_contable_deudor)throws Exception
	{
		try {
			if(this.id_cuenta_contable_deudor!=newid_cuenta_contable_deudor) {
				if(newid_cuenta_contable_deudor==null) {
					//newid_cuenta_contable_deudor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_deudor");
					}
				}

				this.id_cuenta_contable_deudor=newid_cuenta_contable_deudor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_acreedor(Long newid_cuenta_contable_acreedor)throws Exception
	{
		try {
			if(this.id_cuenta_contable_acreedor!=newid_cuenta_contable_acreedor) {
				if(newid_cuenta_contable_acreedor==null) {
					//newid_cuenta_contable_acreedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroConta:Valor nulo no permitido en columna id_cuenta_contable_acreedor");
					}
				}

				this.id_cuenta_contable_acreedor=newid_cuenta_contable_acreedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ingreso1(Long newid_cuenta_contable_ingreso1) {
		if(this.id_cuenta_contable_ingreso1!=newid_cuenta_contable_ingreso1) {

			this.id_cuenta_contable_ingreso1=newid_cuenta_contable_ingreso1;
		}
	}
    
	public void setid_cuenta_contable_ingreso2(Long newid_cuenta_contable_ingreso2) {
		if(this.id_cuenta_contable_ingreso2!=newid_cuenta_contable_ingreso2) {

			this.id_cuenta_contable_ingreso2=newid_cuenta_contable_ingreso2;
		}
	}
    
	public void setid_cuenta_contable_ingreso3(Long newid_cuenta_contable_ingreso3) {
		if(this.id_cuenta_contable_ingreso3!=newid_cuenta_contable_ingreso3) {

			this.id_cuenta_contable_ingreso3=newid_cuenta_contable_ingreso3;
		}
	}
    
	public void setid_cuenta_contable_egreso1(Long newid_cuenta_contable_egreso1) {
		if(this.id_cuenta_contable_egreso1!=newid_cuenta_contable_egreso1) {

			this.id_cuenta_contable_egreso1=newid_cuenta_contable_egreso1;
		}
	}
    
	public void setid_cuenta_contable_egreso2(Long newid_cuenta_contable_egreso2) {
		if(this.id_cuenta_contable_egreso2!=newid_cuenta_contable_egreso2) {

			this.id_cuenta_contable_egreso2=newid_cuenta_contable_egreso2;
		}
	}
    
	public void setid_cuenta_contable_egreso3(Long newid_cuenta_contable_egreso3) {
		if(this.id_cuenta_contable_egreso3!=newid_cuenta_contable_egreso3) {

			this.id_cuenta_contable_egreso3=newid_cuenta_contable_egreso3;
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
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMonedaExtranjera() {
		return isBusquedaDesdeForeignKeySesionMonedaExtranjera;
	}

	public void setisBusquedaDesdeForeignKeySesionMonedaExtranjera(
		Boolean isBusquedaDesdeForeignKeySesionMonedaExtranjera) {
		this.isBusquedaDesdeForeignKeySesionMonedaExtranjera = isBusquedaDesdeForeignKeySesionMonedaExtranjera;
	}

	public Long getlidMonedaExtranjeraActual() {
		return lidMonedaExtranjeraActual;
	}

	public void setlidMonedaExtranjeraActual(Long lidMonedaExtranjeraActual) {
		this.lidMonedaExtranjeraActual = lidMonedaExtranjeraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableActivo() {
		return isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableActivo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableActivo = isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	}

	public Long getlidCuentaContableActivoActual() {
		return lidCuentaContableActivoActual;
	}

	public void setlidCuentaContableActivoActual(Long lidCuentaContableActivoActual) {
		this.lidCuentaContableActivoActual = lidCuentaContableActivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePasivo() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePasivo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePasivo = isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	}

	public Long getlidCuentaContablePasivoActual() {
		return lidCuentaContablePasivoActual;
	}

	public void setlidCuentaContablePasivoActual(Long lidCuentaContablePasivoActual) {
		this.lidCuentaContablePasivoActual = lidCuentaContablePasivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePatrimonio() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePatrimonio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio = isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	}

	public Long getlidCuentaContablePatrimonioActual() {
		return lidCuentaContablePatrimonioActual;
	}

	public void setlidCuentaContablePatrimonioActual(Long lidCuentaContablePatrimonioActual) {
		this.lidCuentaContablePatrimonioActual = lidCuentaContablePatrimonioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngreso() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngreso;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngreso(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngreso = isBusquedaDesdeForeignKeySesionCuentaContableIngreso;
	}

	public Long getlidCuentaContableIngresoActual() {
		return lidCuentaContableIngresoActual;
	}

	public void setlidCuentaContableIngresoActual(Long lidCuentaContableIngresoActual) {
		this.lidCuentaContableIngresoActual = lidCuentaContableIngresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableEgreso() {
		return isBusquedaDesdeForeignKeySesionCuentaContableEgreso;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableEgreso(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableEgreso = isBusquedaDesdeForeignKeySesionCuentaContableEgreso;
	}

	public Long getlidCuentaContableEgresoActual() {
		return lidCuentaContableEgresoActual;
	}

	public void setlidCuentaContableEgresoActual(Long lidCuentaContableEgresoActual) {
		this.lidCuentaContableEgresoActual = lidCuentaContableEgresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableResumen() {
		return isBusquedaDesdeForeignKeySesionCuentaContableResumen;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableResumen(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableResumen) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableResumen = isBusquedaDesdeForeignKeySesionCuentaContableResumen;
	}

	public Long getlidCuentaContableResumenActual() {
		return lidCuentaContableResumenActual;
	}

	public void setlidCuentaContableResumenActual(Long lidCuentaContableResumenActual) {
		this.lidCuentaContableResumenActual = lidCuentaContableResumenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDeudor() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDeudor;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDeudor(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDeudor) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDeudor = isBusquedaDesdeForeignKeySesionCuentaContableDeudor;
	}

	public Long getlidCuentaContableDeudorActual() {
		return lidCuentaContableDeudorActual;
	}

	public void setlidCuentaContableDeudorActual(Long lidCuentaContableDeudorActual) {
		this.lidCuentaContableDeudorActual = lidCuentaContableDeudorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableAcreedor() {
		return isBusquedaDesdeForeignKeySesionCuentaContableAcreedor;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableAcreedor(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableAcreedor) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableAcreedor = isBusquedaDesdeForeignKeySesionCuentaContableAcreedor;
	}

	public Long getlidCuentaContableAcreedorActual() {
		return lidCuentaContableAcreedorActual;
	}

	public void setlidCuentaContableAcreedorActual(Long lidCuentaContableAcreedorActual) {
		this.lidCuentaContableAcreedorActual = lidCuentaContableAcreedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngreso1() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngreso1;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngreso1(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso1) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngreso1 = isBusquedaDesdeForeignKeySesionCuentaContableIngreso1;
	}

	public Long getlidCuentaContableIngreso1Actual() {
		return lidCuentaContableIngreso1Actual;
	}

	public void setlidCuentaContableIngreso1Actual(Long lidCuentaContableIngreso1Actual) {
		this.lidCuentaContableIngreso1Actual = lidCuentaContableIngreso1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngreso2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngreso2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngreso2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngreso2 = isBusquedaDesdeForeignKeySesionCuentaContableIngreso2;
	}

	public Long getlidCuentaContableIngreso2Actual() {
		return lidCuentaContableIngreso2Actual;
	}

	public void setlidCuentaContableIngreso2Actual(Long lidCuentaContableIngreso2Actual) {
		this.lidCuentaContableIngreso2Actual = lidCuentaContableIngreso2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngreso3() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngreso3;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngreso3(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngreso3) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngreso3 = isBusquedaDesdeForeignKeySesionCuentaContableIngreso3;
	}

	public Long getlidCuentaContableIngreso3Actual() {
		return lidCuentaContableIngreso3Actual;
	}

	public void setlidCuentaContableIngreso3Actual(Long lidCuentaContableIngreso3Actual) {
		this.lidCuentaContableIngreso3Actual = lidCuentaContableIngreso3Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableEgreso1() {
		return isBusquedaDesdeForeignKeySesionCuentaContableEgreso1;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableEgreso1(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso1) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableEgreso1 = isBusquedaDesdeForeignKeySesionCuentaContableEgreso1;
	}

	public Long getlidCuentaContableEgreso1Actual() {
		return lidCuentaContableEgreso1Actual;
	}

	public void setlidCuentaContableEgreso1Actual(Long lidCuentaContableEgreso1Actual) {
		this.lidCuentaContableEgreso1Actual = lidCuentaContableEgreso1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableEgreso2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableEgreso2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableEgreso2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableEgreso2 = isBusquedaDesdeForeignKeySesionCuentaContableEgreso2;
	}

	public Long getlidCuentaContableEgreso2Actual() {
		return lidCuentaContableEgreso2Actual;
	}

	public void setlidCuentaContableEgreso2Actual(Long lidCuentaContableEgreso2Actual) {
		this.lidCuentaContableEgreso2Actual = lidCuentaContableEgreso2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableEgreso3() {
		return isBusquedaDesdeForeignKeySesionCuentaContableEgreso3;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableEgreso3(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableEgreso3) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableEgreso3 = isBusquedaDesdeForeignKeySesionCuentaContableEgreso3;
	}

	public Long getlidCuentaContableEgreso3Actual() {
		return lidCuentaContableEgreso3Actual;
	}

	public void setlidCuentaContableEgreso3Actual(Long lidCuentaContableEgreso3Actual) {
		this.lidCuentaContableEgreso3Actual = lidCuentaContableEgreso3Actual;
	}
	
	
		
	
}
