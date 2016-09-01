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
public class CargoSessionBean  extends CargoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargo;
	protected Long lIdCargoActualForeignKey;	
	
	protected Long lIdCargoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras;
	protected String sUltimaBusquedaCargo;
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
	Boolean isBusquedaDesdeForeignKeySesionCargo;
	Long lidCargoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal;
	Long lidNumeroPatronalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPago_NM;
	Long lidTipoPago_NMActual;
	Boolean isBusquedaDesdeForeignKeySesionCargoGrupo;
	Long lidCargoGrupoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cargo;
	private Long id_cuenta_contable;
	private Long id_numero_patronal;
	private Long id_tipo_pago__n_m;
	private Long id_cargo_grupo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CargoSessionBeanAdditional cargoSessionBeanAdditional=null;
	
	public CargoSessionBeanAdditional getCargoSessionBeanAdditional() {
		return this.cargoSessionBeanAdditional;
	}
	
	public void setCargoSessionBeanAdditional(CargoSessionBeanAdditional cargoSessionBeanAdditional) {
		try {
			this.cargoSessionBeanAdditional=cargoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CargoSessionBean () {
		this.inicializarCargoSessionBean();
	}
	
	public void inicializarCargoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargo=false;
		this.lIdCargoActualForeignKey=0L;
		this.lIdCargoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras=false;
		this.sUltimaBusquedaCargo ="";
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
		isBusquedaDesdeForeignKeySesionCargo=false;
		lidCargoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionNumeroPatronal=false;
		lidNumeroPatronalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPago_NM=false;
		lidTipoPago_NMActual=0L;
		isBusquedaDesdeForeignKeySesionCargoGrupo=false;
		lidCargoGrupoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cargo=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_numero_patronal=-1L;
 		this.id_tipo_pago__n_m=-1L;
 		this.id_cargo_grupo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCargo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCargo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCargo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargo= isPermiteNavegacionHaciaForeignKeyDesdeCargo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo = sNombrePaginaNavegacionHaciaForeignKeyDesdeCargo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargo= isBusquedaDesdeForeignKeySesionForeignKeyCargo;
	}
					
	public Long getlIdCargoActualForeignKey() {
		return lIdCargoActualForeignKey;
	}

	public void setlIdCargoActualForeignKey(
			Long lIdCargoActualForeignKey) {
		this.lIdCargoActualForeignKey = lIdCargoActualForeignKey;
	}
				    
	public Long getlIdCargoActualForeignKeyParaPosibleAtras() {
		return lIdCargoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCargoActualForeignKeyParaPosibleAtras(
			Long lIdCargoActualForeignKeyParaPosibleAtras) {
		this.lIdCargoActualForeignKeyParaPosibleAtras = lIdCargoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCargoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCargo() {
		return sUltimaBusquedaCargo;
	}

	public void setsUltimaBusquedaCargo(String sUltimaBusquedaCargo) {
		this.sUltimaBusquedaCargo = sUltimaBusquedaCargo;
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
    
	public Long getid_cargo() {
		return this.id_cargo;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_numero_patronal() {
		return this.id_numero_patronal;
	}
    
	public Long getid_tipo_pago__n_m() {
		return this.id_tipo_pago__n_m;
	}
    
	public Long getid_cargo_grupo() {
		return this.id_cargo_grupo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cargo:Valor nulo no permitido en columna id");
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
						System.out.println("Cargo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cargo(Long newid_cargo)throws Exception
	{
		try {
			if(this.id_cargo!=newid_cargo) {
				if(newid_cargo==null) {
					//newid_cargo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cargo:Valor nulo no permitido en columna id_cargo");
					}
				}

				this.id_cargo=newid_cargo;
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
						System.out.println("Cargo:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_numero_patronal(Long newid_numero_patronal)throws Exception
	{
		try {
			if(this.id_numero_patronal!=newid_numero_patronal) {
				if(newid_numero_patronal==null) {
					//newid_numero_patronal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cargo:Valor nulo no permitido en columna id_numero_patronal");
					}
				}

				this.id_numero_patronal=newid_numero_patronal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_pago__n_m(Long newid_tipo_pago__n_m)throws Exception
	{
		try {
			if(this.id_tipo_pago__n_m!=newid_tipo_pago__n_m) {
				if(newid_tipo_pago__n_m==null) {
					//newid_tipo_pago__n_m=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cargo:Valor nulo no permitido en columna id_tipo_pago__n_m");
					}
				}

				this.id_tipo_pago__n_m=newid_tipo_pago__n_m;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cargo_grupo(Long newid_cargo_grupo)throws Exception
	{
		try {
			if(this.id_cargo_grupo!=newid_cargo_grupo) {
				if(newid_cargo_grupo==null) {
					//newid_cargo_grupo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cargo:Valor nulo no permitido en columna id_cargo_grupo");
					}
				}

				this.id_cargo_grupo=newid_cargo_grupo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCargo() {
		return isBusquedaDesdeForeignKeySesionCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionCargo(
		Boolean isBusquedaDesdeForeignKeySesionCargo) {
		this.isBusquedaDesdeForeignKeySesionCargo = isBusquedaDesdeForeignKeySesionCargo;
	}

	public Long getlidCargoActual() {
		return lidCargoActual;
	}

	public void setlidCargoActual(Long lidCargoActual) {
		this.lidCargoActual = lidCargoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionNumeroPatronal() {
		return isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public void setisBusquedaDesdeForeignKeySesionNumeroPatronal(
		Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal) {
		this.isBusquedaDesdeForeignKeySesionNumeroPatronal = isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public Long getlidNumeroPatronalActual() {
		return lidNumeroPatronalActual;
	}

	public void setlidNumeroPatronalActual(Long lidNumeroPatronalActual) {
		this.lidNumeroPatronalActual = lidNumeroPatronalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPago_NM() {
		return isBusquedaDesdeForeignKeySesionTipoPago_NM;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPago_NM(
		Boolean isBusquedaDesdeForeignKeySesionTipoPago_NM) {
		this.isBusquedaDesdeForeignKeySesionTipoPago_NM = isBusquedaDesdeForeignKeySesionTipoPago_NM;
	}

	public Long getlidTipoPago_NMActual() {
		return lidTipoPago_NMActual;
	}

	public void setlidTipoPago_NMActual(Long lidTipoPago_NMActual) {
		this.lidTipoPago_NMActual = lidTipoPago_NMActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCargoGrupo() {
		return isBusquedaDesdeForeignKeySesionCargoGrupo;
	}

	public void setisBusquedaDesdeForeignKeySesionCargoGrupo(
		Boolean isBusquedaDesdeForeignKeySesionCargoGrupo) {
		this.isBusquedaDesdeForeignKeySesionCargoGrupo = isBusquedaDesdeForeignKeySesionCargoGrupo;
	}

	public Long getlidCargoGrupoActual() {
		return lidCargoGrupoActual;
	}

	public void setlidCargoGrupoActual(Long lidCargoGrupoActual) {
		this.lidCargoGrupoActual = lidCargoGrupoActual;
	}
	
	
		
	
}
