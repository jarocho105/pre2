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
package com.bydan.erp.importaciones.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.importaciones.business.entity.*;

@SuppressWarnings("unused")
public class CostoGastoImporSessionBean  extends CostoGastoImporSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor;
	protected Long lIdCostoGastoImporActualForeignKey;	
	
	protected Long lIdCostoGastoImporActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras;
	protected String sUltimaBusquedaCostoGastoImpor;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor;
	Long lidTipoCostoGastoImporActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_costo_gasto_impor;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CostoGastoImporSessionBeanAdditional costogastoimporSessionBeanAdditional=null;
	
	public CostoGastoImporSessionBeanAdditional getCostoGastoImporSessionBeanAdditional() {
		return this.costogastoimporSessionBeanAdditional;
	}
	
	public void setCostoGastoImporSessionBeanAdditional(CostoGastoImporSessionBeanAdditional costogastoimporSessionBeanAdditional) {
		try {
			this.costogastoimporSessionBeanAdditional=costogastoimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CostoGastoImporSessionBean () {
		this.inicializarCostoGastoImporSessionBean();
	}
	
	public void inicializarCostoGastoImporSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor=false;
		this.lIdCostoGastoImporActualForeignKey=0L;
		this.lIdCostoGastoImporActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras=false;
		this.sUltimaBusquedaCostoGastoImpor ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor=false;
		lidTipoCostoGastoImporActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_costo_gasto_impor=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor= isPermiteNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor = sNombrePaginaNavegacionHaciaForeignKeyDesdeCostoGastoImpor;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor= isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor;
	}
					
	public Long getlIdCostoGastoImporActualForeignKey() {
		return lIdCostoGastoImporActualForeignKey;
	}

	public void setlIdCostoGastoImporActualForeignKey(
			Long lIdCostoGastoImporActualForeignKey) {
		this.lIdCostoGastoImporActualForeignKey = lIdCostoGastoImporActualForeignKey;
	}
				    
	public Long getlIdCostoGastoImporActualForeignKeyParaPosibleAtras() {
		return lIdCostoGastoImporActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCostoGastoImporActualForeignKeyParaPosibleAtras(
			Long lIdCostoGastoImporActualForeignKeyParaPosibleAtras) {
		this.lIdCostoGastoImporActualForeignKeyParaPosibleAtras = lIdCostoGastoImporActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImporParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCostoGastoImpor() {
		return sUltimaBusquedaCostoGastoImpor;
	}

	public void setsUltimaBusquedaCostoGastoImpor(String sUltimaBusquedaCostoGastoImpor) {
		this.sUltimaBusquedaCostoGastoImpor = sUltimaBusquedaCostoGastoImpor;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_tipo_costo_gasto_impor() {
		return this.id_tipo_costo_gasto_impor;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CostoGastoImpor:Valor nulo no permitido en columna id");
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
						System.out.println("CostoGastoImpor:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CostoGastoImpor:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_costo_gasto_impor(Long newid_tipo_costo_gasto_impor)throws Exception
	{
		try {
			if(this.id_tipo_costo_gasto_impor!=newid_tipo_costo_gasto_impor) {
				if(newid_tipo_costo_gasto_impor==null) {
					//newid_tipo_costo_gasto_impor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CostoGastoImpor:Valor nulo no permitido en columna id_tipo_costo_gasto_impor");
					}
				}

				this.id_tipo_costo_gasto_impor=newid_tipo_costo_gasto_impor;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCostoGastoImpor() {
		return isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCostoGastoImpor(
		Boolean isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor) {
		this.isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor = isBusquedaDesdeForeignKeySesionTipoCostoGastoImpor;
	}

	public Long getlidTipoCostoGastoImporActual() {
		return lidTipoCostoGastoImporActual;
	}

	public void setlidTipoCostoGastoImporActual(Long lidTipoCostoGastoImporActual) {
		this.lidTipoCostoGastoImporActual = lidTipoCostoGastoImporActual;
	}
	
	
		
	
}
