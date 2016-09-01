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
package com.bydan.erp.produccion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.produccion.business.entity.*;

@SuppressWarnings("unused")
public class TipoMaquinaEmpresaSessionBean  extends TipoMaquinaEmpresaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa;
	protected Long lIdTipoMaquinaEmpresaActualForeignKey;	
	
	protected Long lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras;
	protected String sUltimaBusquedaTipoMaquinaEmpresa;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoMaquinaEmpresaSessionBeanAdditional tipomaquinaempresaSessionBeanAdditional=null;
	
	public TipoMaquinaEmpresaSessionBeanAdditional getTipoMaquinaEmpresaSessionBeanAdditional() {
		return this.tipomaquinaempresaSessionBeanAdditional;
	}
	
	public void setTipoMaquinaEmpresaSessionBeanAdditional(TipoMaquinaEmpresaSessionBeanAdditional tipomaquinaempresaSessionBeanAdditional) {
		try {
			this.tipomaquinaempresaSessionBeanAdditional=tipomaquinaempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoMaquinaEmpresaSessionBean () {
		this.inicializarTipoMaquinaEmpresaSessionBean();
	}
	
	public void inicializarTipoMaquinaEmpresaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa=false;
		this.lIdTipoMaquinaEmpresaActualForeignKey=0L;
		this.lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras=false;
		this.sUltimaBusquedaTipoMaquinaEmpresa ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cuenta_contable_debito=-1L;
 		this.id_cuenta_contable_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa= isPermiteNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMaquinaEmpresa;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa= isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa;
	}
					
	public Long getlIdTipoMaquinaEmpresaActualForeignKey() {
		return lIdTipoMaquinaEmpresaActualForeignKey;
	}

	public void setlIdTipoMaquinaEmpresaActualForeignKey(
			Long lIdTipoMaquinaEmpresaActualForeignKey) {
		this.lIdTipoMaquinaEmpresaActualForeignKey = lIdTipoMaquinaEmpresaActualForeignKey;
	}
				    
	public Long getlIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras() {
		return lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras(
			Long lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras) {
		this.lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras = lIdTipoMaquinaEmpresaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoMaquinaEmpresa() {
		return sUltimaBusquedaTipoMaquinaEmpresa;
	}

	public void setsUltimaBusquedaTipoMaquinaEmpresa(String sUltimaBusquedaTipoMaquinaEmpresa) {
		this.sUltimaBusquedaTipoMaquinaEmpresa = sUltimaBusquedaTipoMaquinaEmpresa;
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
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMaquinaEmpresa:Valor nulo no permitido en columna id");
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
						System.out.println("TipoMaquinaEmpresa:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TipoMaquinaEmpresa:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_debito(Long newid_cuenta_contable_debito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_debito!=newid_cuenta_contable_debito) {
				if(newid_cuenta_contable_debito==null) {
					//newid_cuenta_contable_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMaquinaEmpresa:Valor nulo no permitido en columna id_cuenta_contable_debito");
					}
				}

				this.id_cuenta_contable_debito=newid_cuenta_contable_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {
				if(newid_cuenta_contable_credito==null) {
					//newid_cuenta_contable_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMaquinaEmpresa:Valor nulo no permitido en columna id_cuenta_contable_credito");
					}
				}

				this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDebito = isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public Long getlidCuentaContableDebitoActual() {
		return lidCuentaContableDebitoActual;
	}

	public void setlidCuentaContableDebitoActual(Long lidCuentaContableDebitoActual) {
		this.lidCuentaContableDebitoActual = lidCuentaContableDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCredito = isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public Long getlidCuentaContableCreditoActual() {
		return lidCuentaContableCreditoActual;
	}

	public void setlidCuentaContableCreditoActual(Long lidCuentaContableCreditoActual) {
		this.lidCuentaContableCreditoActual = lidCuentaContableCreditoActual;
	}
	
	
		
	
}
