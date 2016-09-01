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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class TarjetaCreditoSessionBean  extends TarjetaCreditoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito;
	protected Long lIdTarjetaCreditoActualForeignKey;	
	
	protected Long lIdTarjetaCreditoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras;
	protected String sUltimaBusquedaTarjetaCredito;
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
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencion;
	Long lidTipoRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	Long lidTipoRetencionIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableComision;
	Long lidCuentaContableComisionActual;
	Boolean isBusquedaDesdeForeignKeySesionFormulaPagoBanco;
	Long lidFormulaPagoBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDiferencia;
	Long lidCuentaContableDiferenciaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormulaRetencion;
	Long lidFormulaRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionFormulaComision;
	Long lidFormulaComisionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_banco;
	private Long id_tipo_retencion;
	private Long id_cuenta_contable;
	private Long id_tipo_retencion_iva;
	private Long id_cuenta_contable_comision;
	private Long id_formula_pago_banco;
	private Long id_cuenta_contable_diferencia;
	private Long id_formula_retencion;
	private Long id_formula_comision;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TarjetaCreditoSessionBeanAdditional tarjetacreditoSessionBeanAdditional=null;
	
	public TarjetaCreditoSessionBeanAdditional getTarjetaCreditoSessionBeanAdditional() {
		return this.tarjetacreditoSessionBeanAdditional;
	}
	
	public void setTarjetaCreditoSessionBeanAdditional(TarjetaCreditoSessionBeanAdditional tarjetacreditoSessionBeanAdditional) {
		try {
			this.tarjetacreditoSessionBeanAdditional=tarjetacreditoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TarjetaCreditoSessionBean () {
		this.inicializarTarjetaCreditoSessionBean();
	}
	
	public void inicializarTarjetaCreditoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito=false;
		this.lIdTarjetaCreditoActualForeignKey=0L;
		this.lIdTarjetaCreditoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras=false;
		this.sUltimaBusquedaTarjetaCredito ="";
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
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencion=false;
		lidTipoRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva=false;
		lidTipoRetencionIvaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableComision=false;
		lidCuentaContableComisionActual=0L;
		isBusquedaDesdeForeignKeySesionFormulaPagoBanco=false;
		lidFormulaPagoBancoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDiferencia=false;
		lidCuentaContableDiferenciaActual=0L;
		isBusquedaDesdeForeignKeySesionFormulaRetencion=false;
		lidFormulaRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionFormulaComision=false;
		lidFormulaComisionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_banco=-1L;
 		this.id_tipo_retencion=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_tipo_retencion_iva=-1L;
 		this.id_cuenta_contable_comision=-1L;
 		this.id_formula_pago_banco=-1L;
 		this.id_cuenta_contable_diferencia=-1L;
 		this.id_formula_retencion=-1L;
 		this.id_formula_comision=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito= isPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito = sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito= isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCredito;
	}
					
	public Long getlIdTarjetaCreditoActualForeignKey() {
		return lIdTarjetaCreditoActualForeignKey;
	}

	public void setlIdTarjetaCreditoActualForeignKey(
			Long lIdTarjetaCreditoActualForeignKey) {
		this.lIdTarjetaCreditoActualForeignKey = lIdTarjetaCreditoActualForeignKey;
	}
				    
	public Long getlIdTarjetaCreditoActualForeignKeyParaPosibleAtras() {
		return lIdTarjetaCreditoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTarjetaCreditoActualForeignKeyParaPosibleAtras(
			Long lIdTarjetaCreditoActualForeignKeyParaPosibleAtras) {
		this.lIdTarjetaCreditoActualForeignKeyParaPosibleAtras = lIdTarjetaCreditoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTarjetaCreditoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTarjetaCredito() {
		return sUltimaBusquedaTarjetaCredito;
	}

	public void setsUltimaBusquedaTarjetaCredito(String sUltimaBusquedaTarjetaCredito) {
		this.sUltimaBusquedaTarjetaCredito = sUltimaBusquedaTarjetaCredito;
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
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_tipo_retencion() {
		return this.id_tipo_retencion;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_tipo_retencion_iva() {
		return this.id_tipo_retencion_iva;
	}
    
	public Long getid_cuenta_contable_comision() {
		return this.id_cuenta_contable_comision;
	}
    
	public Long getid_formula_pago_banco() {
		return this.id_formula_pago_banco;
	}
    
	public Long getid_cuenta_contable_diferencia() {
		return this.id_cuenta_contable_diferencia;
	}
    
	public Long getid_formula_retencion() {
		return this.id_formula_retencion;
	}
    
	public Long getid_formula_comision() {
		return this.id_formula_comision;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id");
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
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_banco(Long newid_banco)throws Exception
	{
		try {
			if(this.id_banco!=newid_banco) {
				if(newid_banco==null) {
					//newid_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion(Long newid_tipo_retencion)throws Exception
	{
		try {
			if(this.id_tipo_retencion!=newid_tipo_retencion) {
				if(newid_tipo_retencion==null) {
					//newid_tipo_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_tipo_retencion");
					}
				}

				this.id_tipo_retencion=newid_tipo_retencion;
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
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva(Long newid_tipo_retencion_iva)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva!=newid_tipo_retencion_iva) {
				if(newid_tipo_retencion_iva==null) {
					//newid_tipo_retencion_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_tipo_retencion_iva");
					}
				}

				this.id_tipo_retencion_iva=newid_tipo_retencion_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_comision(Long newid_cuenta_contable_comision)throws Exception
	{
		try {
			if(this.id_cuenta_contable_comision!=newid_cuenta_contable_comision) {
				if(newid_cuenta_contable_comision==null) {
					//newid_cuenta_contable_comision=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_cuenta_contable_comision");
					}
				}

				this.id_cuenta_contable_comision=newid_cuenta_contable_comision;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formula_pago_banco(Long newid_formula_pago_banco)throws Exception
	{
		try {
			if(this.id_formula_pago_banco!=newid_formula_pago_banco) {
				if(newid_formula_pago_banco==null) {
					//newid_formula_pago_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_formula_pago_banco");
					}
				}

				this.id_formula_pago_banco=newid_formula_pago_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_diferencia(Long newid_cuenta_contable_diferencia)throws Exception
	{
		try {
			if(this.id_cuenta_contable_diferencia!=newid_cuenta_contable_diferencia) {
				if(newid_cuenta_contable_diferencia==null) {
					//newid_cuenta_contable_diferencia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_cuenta_contable_diferencia");
					}
				}

				this.id_cuenta_contable_diferencia=newid_cuenta_contable_diferencia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formula_retencion(Long newid_formula_retencion)throws Exception
	{
		try {
			if(this.id_formula_retencion!=newid_formula_retencion) {
				if(newid_formula_retencion==null) {
					//newid_formula_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_formula_retencion");
					}
				}

				this.id_formula_retencion=newid_formula_retencion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formula_comision(Long newid_formula_comision)throws Exception
	{
		try {
			if(this.id_formula_comision!=newid_formula_comision) {
				if(newid_formula_comision==null) {
					//newid_formula_comision=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetaCredito:Valor nulo no permitido en columna id_formula_comision");
					}
				}

				this.id_formula_comision=newid_formula_comision;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBanco() {
		return isBusquedaDesdeForeignKeySesionBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionBanco(
		Boolean isBusquedaDesdeForeignKeySesionBanco) {
		this.isBusquedaDesdeForeignKeySesionBanco = isBusquedaDesdeForeignKeySesionBanco;
	}

	public Long getlidBancoActual() {
		return lidBancoActual;
	}

	public void setlidBancoActual(Long lidBancoActual) {
		this.lidBancoActual = lidBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencion() {
		return isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencion) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencion = isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public Long getlidTipoRetencionActual() {
		return lidTipoRetencionActual;
	}

	public void setlidTipoRetencionActual(Long lidTipoRetencionActual) {
		this.lidTipoRetencionActual = lidTipoRetencionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIva() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIva = isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public Long getlidTipoRetencionIvaActual() {
		return lidTipoRetencionIvaActual;
	}

	public void setlidTipoRetencionIvaActual(Long lidTipoRetencionIvaActual) {
		this.lidTipoRetencionIvaActual = lidTipoRetencionIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableComision() {
		return isBusquedaDesdeForeignKeySesionCuentaContableComision;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableComision(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableComision) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableComision = isBusquedaDesdeForeignKeySesionCuentaContableComision;
	}

	public Long getlidCuentaContableComisionActual() {
		return lidCuentaContableComisionActual;
	}

	public void setlidCuentaContableComisionActual(Long lidCuentaContableComisionActual) {
		this.lidCuentaContableComisionActual = lidCuentaContableComisionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormulaPagoBanco() {
		return isBusquedaDesdeForeignKeySesionFormulaPagoBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionFormulaPagoBanco(
		Boolean isBusquedaDesdeForeignKeySesionFormulaPagoBanco) {
		this.isBusquedaDesdeForeignKeySesionFormulaPagoBanco = isBusquedaDesdeForeignKeySesionFormulaPagoBanco;
	}

	public Long getlidFormulaPagoBancoActual() {
		return lidFormulaPagoBancoActual;
	}

	public void setlidFormulaPagoBancoActual(Long lidFormulaPagoBancoActual) {
		this.lidFormulaPagoBancoActual = lidFormulaPagoBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDiferencia() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDiferencia;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDiferencia(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDiferencia) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDiferencia = isBusquedaDesdeForeignKeySesionCuentaContableDiferencia;
	}

	public Long getlidCuentaContableDiferenciaActual() {
		return lidCuentaContableDiferenciaActual;
	}

	public void setlidCuentaContableDiferenciaActual(Long lidCuentaContableDiferenciaActual) {
		this.lidCuentaContableDiferenciaActual = lidCuentaContableDiferenciaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormulaRetencion() {
		return isBusquedaDesdeForeignKeySesionFormulaRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionFormulaRetencion(
		Boolean isBusquedaDesdeForeignKeySesionFormulaRetencion) {
		this.isBusquedaDesdeForeignKeySesionFormulaRetencion = isBusquedaDesdeForeignKeySesionFormulaRetencion;
	}

	public Long getlidFormulaRetencionActual() {
		return lidFormulaRetencionActual;
	}

	public void setlidFormulaRetencionActual(Long lidFormulaRetencionActual) {
		this.lidFormulaRetencionActual = lidFormulaRetencionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormulaComision() {
		return isBusquedaDesdeForeignKeySesionFormulaComision;
	}

	public void setisBusquedaDesdeForeignKeySesionFormulaComision(
		Boolean isBusquedaDesdeForeignKeySesionFormulaComision) {
		this.isBusquedaDesdeForeignKeySesionFormulaComision = isBusquedaDesdeForeignKeySesionFormulaComision;
	}

	public Long getlidFormulaComisionActual() {
		return lidFormulaComisionActual;
	}

	public void setlidFormulaComisionActual(Long lidFormulaComisionActual) {
		this.lidFormulaComisionActual = lidFormulaComisionActual;
	}
	
	
		
	
}
