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
public class DetalleGrupoActivoFijoSessionBean  extends DetalleGrupoActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo;
	protected Long lIdDetalleGrupoActivoFijoActualForeignKey;	
	
	protected Long lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaDetalleGrupoActivoFijo;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal;
	Long lidCuentaContableCostoOriginalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal;
	Long lidCuentaContableDepreNormalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal;
	Long lidCuentaContableDepreGastoNormalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cuenta_contable_costo_original;
	private Long id_cuenta_contable_depre_normal;
	private Long id_cuenta_contable_depre_gasto_normal;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleGrupoActivoFijoSessionBeanAdditional detallegrupoactivofijoSessionBeanAdditional=null;
	
	public DetalleGrupoActivoFijoSessionBeanAdditional getDetalleGrupoActivoFijoSessionBeanAdditional() {
		return this.detallegrupoactivofijoSessionBeanAdditional;
	}
	
	public void setDetalleGrupoActivoFijoSessionBeanAdditional(DetalleGrupoActivoFijoSessionBeanAdditional detallegrupoactivofijoSessionBeanAdditional) {
		try {
			this.detallegrupoactivofijoSessionBeanAdditional=detallegrupoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleGrupoActivoFijoSessionBean () {
		this.inicializarDetalleGrupoActivoFijoSessionBean();
	}
	
	public void inicializarDetalleGrupoActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo=false;
		this.lIdDetalleGrupoActivoFijoActualForeignKey=0L;
		this.lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleGrupoActivoFijo ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal=false;
		lidCuentaContableCostoOriginalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal=false;
		lidCuentaContableDepreNormalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal=false;
		lidCuentaContableDepreGastoNormalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cuenta_contable_costo_original=null;
 		this.id_cuenta_contable_depre_normal=null;
 		this.id_cuenta_contable_depre_gasto_normal=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleGrupoActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo;
	}
					
	public Long getlIdDetalleGrupoActivoFijoActualForeignKey() {
		return lIdDetalleGrupoActivoFijoActualForeignKey;
	}

	public void setlIdDetalleGrupoActivoFijoActualForeignKey(
			Long lIdDetalleGrupoActivoFijoActualForeignKey) {
		this.lIdDetalleGrupoActivoFijoActualForeignKey = lIdDetalleGrupoActivoFijoActualForeignKey;
	}
				    
	public Long getlIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras = lIdDetalleGrupoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleGrupoActivoFijo() {
		return sUltimaBusquedaDetalleGrupoActivoFijo;
	}

	public void setsUltimaBusquedaDetalleGrupoActivoFijo(String sUltimaBusquedaDetalleGrupoActivoFijo) {
		this.sUltimaBusquedaDetalleGrupoActivoFijo = sUltimaBusquedaDetalleGrupoActivoFijo;
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
    
	public Long getid_cuenta_contable_costo_original() {
		return this.id_cuenta_contable_costo_original;
	}
    
	public Long getid_cuenta_contable_depre_normal() {
		return this.id_cuenta_contable_depre_normal;
	}
    
	public Long getid_cuenta_contable_depre_gasto_normal() {
		return this.id_cuenta_contable_depre_gasto_normal;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleGrupoActivoFijo:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleGrupoActivoFijo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo_original(Long newid_cuenta_contable_costo_original) {
		if(this.id_cuenta_contable_costo_original!=newid_cuenta_contable_costo_original) {

			this.id_cuenta_contable_costo_original=newid_cuenta_contable_costo_original;
		}
	}
    
	public void setid_cuenta_contable_depre_normal(Long newid_cuenta_contable_depre_normal) {
		if(this.id_cuenta_contable_depre_normal!=newid_cuenta_contable_depre_normal) {

			this.id_cuenta_contable_depre_normal=newid_cuenta_contable_depre_normal;
		}
	}
    
	public void setid_cuenta_contable_depre_gasto_normal(Long newid_cuenta_contable_depre_gasto_normal) {
		if(this.id_cuenta_contable_depre_gasto_normal!=newid_cuenta_contable_depre_gasto_normal) {

			this.id_cuenta_contable_depre_gasto_normal=newid_cuenta_contable_depre_gasto_normal;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal = isBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal;
	}

	public Long getlidCuentaContableCostoOriginalActual() {
		return lidCuentaContableCostoOriginalActual;
	}

	public void setlidCuentaContableCostoOriginalActual(Long lidCuentaContableCostoOriginalActual) {
		this.lidCuentaContableCostoOriginalActual = lidCuentaContableCostoOriginalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDepreNormal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDepreNormal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal = isBusquedaDesdeForeignKeySesionCuentaContableDepreNormal;
	}

	public Long getlidCuentaContableDepreNormalActual() {
		return lidCuentaContableDepreNormalActual;
	}

	public void setlidCuentaContableDepreNormalActual(Long lidCuentaContableDepreNormalActual) {
		this.lidCuentaContableDepreNormalActual = lidCuentaContableDepreNormalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal = isBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal;
	}

	public Long getlidCuentaContableDepreGastoNormalActual() {
		return lidCuentaContableDepreGastoNormalActual;
	}

	public void setlidCuentaContableDepreGastoNormalActual(Long lidCuentaContableDepreGastoNormalActual) {
		this.lidCuentaContableDepreGastoNormalActual = lidCuentaContableDepreGastoNormalActual;
	}
	
	
		
	
}
