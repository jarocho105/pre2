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
public class SriSessionBean  extends SriSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSri;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSri;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySri;
	protected Long lIdSriActualForeignKey;	
	
	protected Long lIdSriActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras;
	protected String sUltimaBusquedaSri;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionConta;
	Long lidTransaccionContaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoComprobante;
	Long lidTipoComprobanteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTributario;
	Long lidTipoTributarioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIva;
	Long lidTipoIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	Long lidTipoRetencionIvaBienActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	Long lidTipoRetencionIvaServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	
	private Long id;
	private Long id_asiento_contable;
	private Long id_transaccion_conta;
	private Long id_cliente;
	private Long tipo_comprobante;
	private Long tipo_tributario;
	private Long id_tipo_iva;
	private Long id_tipo_retencion_iva_bien;
	private Long id_tipo_retencion_iva_servicio;
	private Long id_tipo_movimiento;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SriSessionBeanAdditional sriSessionBeanAdditional=null;
	
	public SriSessionBeanAdditional getSriSessionBeanAdditional() {
		return this.sriSessionBeanAdditional;
	}
	
	public void setSriSessionBeanAdditional(SriSessionBeanAdditional sriSessionBeanAdditional) {
		try {
			this.sriSessionBeanAdditional=sriSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SriSessionBean () {
		this.inicializarSriSessionBean();
	}
	
	public void inicializarSriSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSri=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSri="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySri=false;
		this.lIdSriActualForeignKey=0L;
		this.lIdSriActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras=false;
		this.sUltimaBusquedaSri ="";
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
		
		
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionConta=false;
		lidTransaccionContaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoComprobante=false;
		lidTipoComprobanteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTributario=false;
		lidTipoTributarioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIva=false;
		lidTipoIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien=false;
		lidTipoRetencionIvaBienActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio=false;
		lidTipoRetencionIvaServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L; 
		
		
		
 		this.id_asiento_contable=-1L;
 		this.id_transaccion_conta=-1L;
 		this.id_cliente=-1L;
 		this.tipo_comprobante=-1L;
 		this.tipo_tributario=-1L;
 		this.id_tipo_iva=-1L;
 		this.id_tipo_retencion_iva_bien=-1L;
 		this.id_tipo_retencion_iva_servicio=-1L;
 		this.id_tipo_movimiento=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSri() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSri;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSri(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSri) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSri= isPermiteNavegacionHaciaForeignKeyDesdeSri;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSri() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSri;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSri(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSri) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSri = sNombrePaginaNavegacionHaciaForeignKeyDesdeSri;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySri() {
		return isBusquedaDesdeForeignKeySesionForeignKeySri;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySri(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySri) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySri= isBusquedaDesdeForeignKeySesionForeignKeySri;
	}
					
	public Long getlIdSriActualForeignKey() {
		return lIdSriActualForeignKey;
	}

	public void setlIdSriActualForeignKey(
			Long lIdSriActualForeignKey) {
		this.lIdSriActualForeignKey = lIdSriActualForeignKey;
	}
				    
	public Long getlIdSriActualForeignKeyParaPosibleAtras() {
		return lIdSriActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSriActualForeignKeyParaPosibleAtras(
			Long lIdSriActualForeignKeyParaPosibleAtras) {
		this.lIdSriActualForeignKeyParaPosibleAtras = lIdSriActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySriParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSri() {
		return sUltimaBusquedaSri;
	}

	public void setsUltimaBusquedaSri(String sUltimaBusquedaSri) {
		this.sUltimaBusquedaSri = sUltimaBusquedaSri;
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
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public Long getid_transaccion_conta() {
		return this.id_transaccion_conta;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long gettipo_comprobante() {
		return this.tipo_comprobante;
	}
    
	public Long gettipo_tributario() {
		return this.tipo_tributario;
	}
    
	public Long getid_tipo_iva() {
		return this.id_tipo_iva;
	}
    
	public Long getid_tipo_retencion_iva_bien() {
		return this.id_tipo_retencion_iva_bien;
	}
    
	public Long getid_tipo_retencion_iva_servicio() {
		return this.id_tipo_retencion_iva_servicio;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable)throws Exception
	{
		try {
			if(this.id_asiento_contable!=newid_asiento_contable) {
				if(newid_asiento_contable==null) {
					//newid_asiento_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_asiento_contable");
					}
				}

				this.id_asiento_contable=newid_asiento_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_conta(Long newid_transaccion_conta)throws Exception
	{
		try {
			if(this.id_transaccion_conta!=newid_transaccion_conta) {
				if(newid_transaccion_conta==null) {
					//newid_transaccion_conta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_transaccion_conta");
					}
				}

				this.id_transaccion_conta=newid_transaccion_conta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settipo_comprobante(Long newtipo_comprobante)throws Exception
	{
		try {
			if(this.tipo_comprobante!=newtipo_comprobante) {
				if(newtipo_comprobante==null) {
					//newtipo_comprobante=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna tipo_comprobante");
					}
				}

				this.tipo_comprobante=newtipo_comprobante;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settipo_tributario(Long newtipo_tributario)throws Exception
	{
		try {
			if(this.tipo_tributario!=newtipo_tributario) {
				if(newtipo_tributario==null) {
					//newtipo_tributario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna tipo_tributario");
					}
				}

				this.tipo_tributario=newtipo_tributario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_iva(Long newid_tipo_iva)throws Exception
	{
		try {
			if(this.id_tipo_iva!=newid_tipo_iva) {
				if(newid_tipo_iva==null) {
					//newid_tipo_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_tipo_iva");
					}
				}

				this.id_tipo_iva=newid_tipo_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva_bien(Long newid_tipo_retencion_iva_bien)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva_bien!=newid_tipo_retencion_iva_bien) {
				if(newid_tipo_retencion_iva_bien==null) {
					//newid_tipo_retencion_iva_bien=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_tipo_retencion_iva_bien");
					}
				}

				this.id_tipo_retencion_iva_bien=newid_tipo_retencion_iva_bien;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva_servicio(Long newid_tipo_retencion_iva_servicio)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva_servicio!=newid_tipo_retencion_iva_servicio) {
				if(newid_tipo_retencion_iva_servicio==null) {
					//newid_tipo_retencion_iva_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_tipo_retencion_iva_servicio");
					}
				}

				this.id_tipo_retencion_iva_servicio=newid_tipo_retencion_iva_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento)throws Exception
	{
		try {
			if(this.id_tipo_movimiento!=newid_tipo_movimiento) {
				if(newid_tipo_movimiento==null) {
					//newid_tipo_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Sri:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionAsientoContable() {
		return isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionAsientoContable = isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public Long getlidAsientoContableActual() {
		return lidAsientoContableActual;
	}

	public void setlidAsientoContableActual(Long lidAsientoContableActual) {
		this.lidAsientoContableActual = lidAsientoContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionConta() {
		return isBusquedaDesdeForeignKeySesionTransaccionConta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionConta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionConta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionConta = isBusquedaDesdeForeignKeySesionTransaccionConta;
	}

	public Long getlidTransaccionContaActual() {
		return lidTransaccionContaActual;
	}

	public void setlidTransaccionContaActual(Long lidTransaccionContaActual) {
		this.lidTransaccionContaActual = lidTransaccionContaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoComprobante() {
		return isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoComprobante(
		Boolean isBusquedaDesdeForeignKeySesionTipoComprobante) {
		this.isBusquedaDesdeForeignKeySesionTipoComprobante = isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public Long getlidTipoComprobanteActual() {
		return lidTipoComprobanteActual;
	}

	public void setlidTipoComprobanteActual(Long lidTipoComprobanteActual) {
		this.lidTipoComprobanteActual = lidTipoComprobanteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTributario() {
		return isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTributario(
		Boolean isBusquedaDesdeForeignKeySesionTipoTributario) {
		this.isBusquedaDesdeForeignKeySesionTipoTributario = isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public Long getlidTipoTributarioActual() {
		return lidTipoTributarioActual;
	}

	public void setlidTipoTributarioActual(Long lidTipoTributarioActual) {
		this.lidTipoTributarioActual = lidTipoTributarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIva() {
		return isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoIva) {
		this.isBusquedaDesdeForeignKeySesionTipoIva = isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public Long getlidTipoIvaActual() {
		return lidTipoIvaActual;
	}

	public void setlidTipoIvaActual(Long lidTipoIvaActual) {
		this.lidTipoIvaActual = lidTipoIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaBien() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaBien(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien = isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	}

	public Long getlidTipoRetencionIvaBienActual() {
		return lidTipoRetencionIvaBienActual;
	}

	public void setlidTipoRetencionIvaBienActual(Long lidTipoRetencionIvaBienActual) {
		this.lidTipoRetencionIvaBienActual = lidTipoRetencionIvaBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio = isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	}

	public Long getlidTipoRetencionIvaServicioActual() {
		return lidTipoRetencionIvaServicioActual;
	}

	public void setlidTipoRetencionIvaServicioActual(Long lidTipoRetencionIvaServicioActual) {
		this.lidTipoRetencionIvaServicioActual = lidTipoRetencionIvaServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
	}
	
	
		
	
}
