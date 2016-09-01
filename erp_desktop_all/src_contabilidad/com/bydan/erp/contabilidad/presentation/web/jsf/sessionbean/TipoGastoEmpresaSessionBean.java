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
public class TipoGastoEmpresaSessionBean  extends TipoGastoEmpresaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa;
	protected Long lIdTipoGastoEmpresaActualForeignKey;	
	
	protected Long lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras;
	protected String sUltimaBusquedaTipoGastoEmpresa;
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
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	Long lidCuentaContableGastoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien;
	Long lidCuentaContableFiscalBienActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio;
	Long lidCuentaContableFiscalServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien;
	Long lidCuentaContableRetencionBienActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio;
	Long lidCuentaContableRetencionServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaBien;
	Long lidCuentaContableIvaBienActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio;
	Long lidCuentaContableIvaServicioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private String nombre;
	private Long id_formato;
	private Long id_cuenta_contable_gasto;
	private Long id_cuenta_contable_fiscal_bien;
	private Long id_cuenta_contable_fiscal_servicio;
	private Long id_cuenta_contable_retencion_bien;
	private Long id_cuenta_contable_retencion_servicio;
	private Long id_cuenta_contable_iva_bien;
	private Long id_cuenta_contable_iva_servicio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoGastoEmpresaSessionBeanAdditional tipogastoempresaSessionBeanAdditional=null;
	
	public TipoGastoEmpresaSessionBeanAdditional getTipoGastoEmpresaSessionBeanAdditional() {
		return this.tipogastoempresaSessionBeanAdditional;
	}
	
	public void setTipoGastoEmpresaSessionBeanAdditional(TipoGastoEmpresaSessionBeanAdditional tipogastoempresaSessionBeanAdditional) {
		try {
			this.tipogastoempresaSessionBeanAdditional=tipogastoempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoGastoEmpresaSessionBean () {
		this.inicializarTipoGastoEmpresaSessionBean();
	}
	
	public void inicializarTipoGastoEmpresaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa=false;
		this.lIdTipoGastoEmpresaActualForeignKey=0L;
		this.lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras=false;
		this.sUltimaBusquedaTipoGastoEmpresa ="";
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
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableGasto=false;
		lidCuentaContableGastoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien=false;
		lidCuentaContableFiscalBienActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio=false;
		lidCuentaContableFiscalServicioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien=false;
		lidCuentaContableRetencionBienActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio=false;
		lidCuentaContableRetencionServicioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIvaBien=false;
		lidCuentaContableIvaBienActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio=false;
		lidCuentaContableIvaServicioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.nombre="";
 		this.id_formato=-1L;
 		this.id_cuenta_contable_gasto=null;
 		this.id_cuenta_contable_fiscal_bien=null;
 		this.id_cuenta_contable_fiscal_servicio=null;
 		this.id_cuenta_contable_retencion_bien=null;
 		this.id_cuenta_contable_retencion_servicio=null;
 		this.id_cuenta_contable_iva_bien=null;
 		this.id_cuenta_contable_iva_servicio=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa= isPermiteNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoGastoEmpresa;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa= isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresa;
	}
					
	public Long getlIdTipoGastoEmpresaActualForeignKey() {
		return lIdTipoGastoEmpresaActualForeignKey;
	}

	public void setlIdTipoGastoEmpresaActualForeignKey(
			Long lIdTipoGastoEmpresaActualForeignKey) {
		this.lIdTipoGastoEmpresaActualForeignKey = lIdTipoGastoEmpresaActualForeignKey;
	}
				    
	public Long getlIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras() {
		return lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras(
			Long lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras) {
		this.lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras = lIdTipoGastoEmpresaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoGastoEmpresaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoGastoEmpresa() {
		return sUltimaBusquedaTipoGastoEmpresa;
	}

	public void setsUltimaBusquedaTipoGastoEmpresa(String sUltimaBusquedaTipoGastoEmpresa) {
		this.sUltimaBusquedaTipoGastoEmpresa = sUltimaBusquedaTipoGastoEmpresa;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_cuenta_contable_gasto() {
		return this.id_cuenta_contable_gasto;
	}
    
	public Long getid_cuenta_contable_fiscal_bien() {
		return this.id_cuenta_contable_fiscal_bien;
	}
    
	public Long getid_cuenta_contable_fiscal_servicio() {
		return this.id_cuenta_contable_fiscal_servicio;
	}
    
	public Long getid_cuenta_contable_retencion_bien() {
		return this.id_cuenta_contable_retencion_bien;
	}
    
	public Long getid_cuenta_contable_retencion_servicio() {
		return this.id_cuenta_contable_retencion_servicio;
	}
    
	public Long getid_cuenta_contable_iva_bien() {
		return this.id_cuenta_contable_iva_bien;
	}
    
	public Long getid_cuenta_contable_iva_servicio() {
		return this.id_cuenta_contable_iva_servicio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoGastoEmpresa:Valor nulo no permitido en columna id");
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
						System.out.println("TipoGastoEmpresa:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TipoGastoEmpresa:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoGastoEmpresa:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("TipoGastoEmpresa:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoGastoEmpresa:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_gasto(Long newid_cuenta_contable_gasto) {
		if(this.id_cuenta_contable_gasto!=newid_cuenta_contable_gasto) {

			this.id_cuenta_contable_gasto=newid_cuenta_contable_gasto;
		}
	}
    
	public void setid_cuenta_contable_fiscal_bien(Long newid_cuenta_contable_fiscal_bien) {
		if(this.id_cuenta_contable_fiscal_bien!=newid_cuenta_contable_fiscal_bien) {

			this.id_cuenta_contable_fiscal_bien=newid_cuenta_contable_fiscal_bien;
		}
	}
    
	public void setid_cuenta_contable_fiscal_servicio(Long newid_cuenta_contable_fiscal_servicio) {
		if(this.id_cuenta_contable_fiscal_servicio!=newid_cuenta_contable_fiscal_servicio) {

			this.id_cuenta_contable_fiscal_servicio=newid_cuenta_contable_fiscal_servicio;
		}
	}
    
	public void setid_cuenta_contable_retencion_bien(Long newid_cuenta_contable_retencion_bien) {
		if(this.id_cuenta_contable_retencion_bien!=newid_cuenta_contable_retencion_bien) {

			this.id_cuenta_contable_retencion_bien=newid_cuenta_contable_retencion_bien;
		}
	}
    
	public void setid_cuenta_contable_retencion_servicio(Long newid_cuenta_contable_retencion_servicio) {
		if(this.id_cuenta_contable_retencion_servicio!=newid_cuenta_contable_retencion_servicio) {

			this.id_cuenta_contable_retencion_servicio=newid_cuenta_contable_retencion_servicio;
		}
	}
    
	public void setid_cuenta_contable_iva_bien(Long newid_cuenta_contable_iva_bien) {
		if(this.id_cuenta_contable_iva_bien!=newid_cuenta_contable_iva_bien) {

			this.id_cuenta_contable_iva_bien=newid_cuenta_contable_iva_bien;
		}
	}
    
	public void setid_cuenta_contable_iva_servicio(Long newid_cuenta_contable_iva_servicio) {
		if(this.id_cuenta_contable_iva_servicio!=newid_cuenta_contable_iva_servicio) {

			this.id_cuenta_contable_iva_servicio=newid_cuenta_contable_iva_servicio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableGasto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableGasto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableGasto = isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public Long getlidCuentaContableGastoActual() {
		return lidCuentaContableGastoActual;
	}

	public void setlidCuentaContableGastoActual(Long lidCuentaContableGastoActual) {
		this.lidCuentaContableGastoActual = lidCuentaContableGastoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFiscalBien() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFiscalBien(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien = isBusquedaDesdeForeignKeySesionCuentaContableFiscalBien;
	}

	public Long getlidCuentaContableFiscalBienActual() {
		return lidCuentaContableFiscalBienActual;
	}

	public void setlidCuentaContableFiscalBienActual(Long lidCuentaContableFiscalBienActual) {
		this.lidCuentaContableFiscalBienActual = lidCuentaContableFiscalBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio = isBusquedaDesdeForeignKeySesionCuentaContableFiscalServicio;
	}

	public Long getlidCuentaContableFiscalServicioActual() {
		return lidCuentaContableFiscalServicioActual;
	}

	public void setlidCuentaContableFiscalServicioActual(Long lidCuentaContableFiscalServicioActual) {
		this.lidCuentaContableFiscalServicioActual = lidCuentaContableFiscalServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableRetencionBien() {
		return isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableRetencionBien(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien = isBusquedaDesdeForeignKeySesionCuentaContableRetencionBien;
	}

	public Long getlidCuentaContableRetencionBienActual() {
		return lidCuentaContableRetencionBienActual;
	}

	public void setlidCuentaContableRetencionBienActual(Long lidCuentaContableRetencionBienActual) {
		this.lidCuentaContableRetencionBienActual = lidCuentaContableRetencionBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio() {
		return isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio = isBusquedaDesdeForeignKeySesionCuentaContableRetencionServicio;
	}

	public Long getlidCuentaContableRetencionServicioActual() {
		return lidCuentaContableRetencionServicioActual;
	}

	public void setlidCuentaContableRetencionServicioActual(Long lidCuentaContableRetencionServicioActual) {
		this.lidCuentaContableRetencionServicioActual = lidCuentaContableRetencionServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIvaBien() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIvaBien;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIvaBien(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaBien) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIvaBien = isBusquedaDesdeForeignKeySesionCuentaContableIvaBien;
	}

	public Long getlidCuentaContableIvaBienActual() {
		return lidCuentaContableIvaBienActual;
	}

	public void setlidCuentaContableIvaBienActual(Long lidCuentaContableIvaBienActual) {
		this.lidCuentaContableIvaBienActual = lidCuentaContableIvaBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIvaServicio() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIvaServicio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio = isBusquedaDesdeForeignKeySesionCuentaContableIvaServicio;
	}

	public Long getlidCuentaContableIvaServicioActual() {
		return lidCuentaContableIvaServicioActual;
	}

	public void setlidCuentaContableIvaServicioActual(Long lidCuentaContableIvaServicioActual) {
		this.lidCuentaContableIvaServicioActual = lidCuentaContableIvaServicioActual;
	}
	
	
		
	
}
