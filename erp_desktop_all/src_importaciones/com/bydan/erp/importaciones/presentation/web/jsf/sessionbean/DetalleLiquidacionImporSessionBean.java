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
public class DetalleLiquidacionImporSessionBean  extends DetalleLiquidacionImporSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor;
	protected Long lIdDetalleLiquidacionImporActualForeignKey;	
	
	protected Long lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras;
	protected String sUltimaBusquedaDetalleLiquidacionImpor;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionLiquidacionImpor;
	Long lidLiquidacionImporActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCostoGastoImpor;
	Long lidCostoGastoImporActual;
	
	private Long id;
	private Long id_liquidacion_impor;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_centro_costo;
	private Long id_costo_gasto_impor;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleLiquidacionImporSessionBeanAdditional detalleliquidacionimporSessionBeanAdditional=null;
	
	public DetalleLiquidacionImporSessionBeanAdditional getDetalleLiquidacionImporSessionBeanAdditional() {
		return this.detalleliquidacionimporSessionBeanAdditional;
	}
	
	public void setDetalleLiquidacionImporSessionBeanAdditional(DetalleLiquidacionImporSessionBeanAdditional detalleliquidacionimporSessionBeanAdditional) {
		try {
			this.detalleliquidacionimporSessionBeanAdditional=detalleliquidacionimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleLiquidacionImporSessionBean () {
		this.inicializarDetalleLiquidacionImporSessionBean();
	}
	
	public void inicializarDetalleLiquidacionImporSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor=false;
		this.lIdDetalleLiquidacionImporActualForeignKey=0L;
		this.lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleLiquidacionImpor ="";
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
		
		
		isBusquedaDesdeForeignKeySesionLiquidacionImpor=false;
		lidLiquidacionImporActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCostoGastoImpor=false;
		lidCostoGastoImporActual=0L; 
		
		
		
 		this.id_liquidacion_impor=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_centro_costo=null;
 		this.id_costo_gasto_impor=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor= isPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor= isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImpor;
	}
					
	public Long getlIdDetalleLiquidacionImporActualForeignKey() {
		return lIdDetalleLiquidacionImporActualForeignKey;
	}

	public void setlIdDetalleLiquidacionImporActualForeignKey(
			Long lIdDetalleLiquidacionImporActualForeignKey) {
		this.lIdDetalleLiquidacionImporActualForeignKey = lIdDetalleLiquidacionImporActualForeignKey;
	}
				    
	public Long getlIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras() {
		return lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras(
			Long lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras = lIdDetalleLiquidacionImporActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleLiquidacionImporParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleLiquidacionImpor() {
		return sUltimaBusquedaDetalleLiquidacionImpor;
	}

	public void setsUltimaBusquedaDetalleLiquidacionImpor(String sUltimaBusquedaDetalleLiquidacionImpor) {
		this.sUltimaBusquedaDetalleLiquidacionImpor = sUltimaBusquedaDetalleLiquidacionImpor;
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
    
	public Long getid_liquidacion_impor() {
		return this.id_liquidacion_impor;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_costo_gasto_impor() {
		return this.id_costo_gasto_impor;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_liquidacion_impor(Long newid_liquidacion_impor)throws Exception
	{
		try {
			if(this.id_liquidacion_impor!=newid_liquidacion_impor) {
				if(newid_liquidacion_impor==null) {
					//newid_liquidacion_impor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id_liquidacion_impor");
					}
				}

				this.id_liquidacion_impor=newid_liquidacion_impor;
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
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_costo_gasto_impor(Long newid_costo_gasto_impor)throws Exception
	{
		try {
			if(this.id_costo_gasto_impor!=newid_costo_gasto_impor) {
				if(newid_costo_gasto_impor==null) {
					//newid_costo_gasto_impor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleLiquidacionImpor:Valor nulo no permitido en columna id_costo_gasto_impor");
					}
				}

				this.id_costo_gasto_impor=newid_costo_gasto_impor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionLiquidacionImpor() {
		return isBusquedaDesdeForeignKeySesionLiquidacionImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionLiquidacionImpor(
		Boolean isBusquedaDesdeForeignKeySesionLiquidacionImpor) {
		this.isBusquedaDesdeForeignKeySesionLiquidacionImpor = isBusquedaDesdeForeignKeySesionLiquidacionImpor;
	}

	public Long getlidLiquidacionImporActual() {
		return lidLiquidacionImporActual;
	}

	public void setlidLiquidacionImporActual(Long lidLiquidacionImporActual) {
		this.lidLiquidacionImporActual = lidLiquidacionImporActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCostoGastoImpor() {
		return isBusquedaDesdeForeignKeySesionCostoGastoImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionCostoGastoImpor(
		Boolean isBusquedaDesdeForeignKeySesionCostoGastoImpor) {
		this.isBusquedaDesdeForeignKeySesionCostoGastoImpor = isBusquedaDesdeForeignKeySesionCostoGastoImpor;
	}

	public Long getlidCostoGastoImporActual() {
		return lidCostoGastoImporActual;
	}

	public void setlidCostoGastoImporActual(Long lidCostoGastoImporActual) {
		this.lidCostoGastoImporActual = lidCostoGastoImporActual;
	}
	
	
		
	
}
