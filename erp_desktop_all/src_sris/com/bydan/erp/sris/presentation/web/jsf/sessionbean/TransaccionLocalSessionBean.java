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
package com.bydan.erp.sris.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.sris.business.entity.*;

@SuppressWarnings("unused")
public class TransaccionLocalSessionBean  extends TransaccionLocalSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal;
	protected Long lIdTransaccionLocalActualForeignKey;	
	
	protected Long lIdTransaccionLocalActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras;
	protected String sUltimaBusquedaTransaccionLocal;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCompra;
	Long lidCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	Long lidPeriodoDeclaraActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionConta;
	Long lidTransaccionContaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoComprobante;
	Long lidTipoComprobanteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTributario;
	Long lidTipoTributarioActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIva;
	Long lidTipoIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	Long lidTipoRetencionIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	Long lidTipoRetencionIvaPrestaActual;
	
	private Long id;
	private Long id_compra;
	private Long id_periodo_declara;
	private Long id_transaccion_conta;
	private Long id_cliente;
	private Long id_tipo_comprobante;
	private Long id_tipo_tributario;
	private Long id_asiento_contable;
	private Long id_tipo_iva;
	private Long id_tipo_retencion_iva;
	private Long id_tipo_retencion_iva_presta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TransaccionLocalSessionBeanAdditional transaccionlocalSessionBeanAdditional=null;
	
	public TransaccionLocalSessionBeanAdditional getTransaccionLocalSessionBeanAdditional() {
		return this.transaccionlocalSessionBeanAdditional;
	}
	
	public void setTransaccionLocalSessionBeanAdditional(TransaccionLocalSessionBeanAdditional transaccionlocalSessionBeanAdditional) {
		try {
			this.transaccionlocalSessionBeanAdditional=transaccionlocalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TransaccionLocalSessionBean () {
		this.inicializarTransaccionLocalSessionBean();
	}
	
	public void inicializarTransaccionLocalSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal=false;
		this.lIdTransaccionLocalActualForeignKey=0L;
		this.lIdTransaccionLocalActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras=false;
		this.sUltimaBusquedaTransaccionLocal ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCompra=false;
		lidCompraActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodoDeclara=false;
		lidPeriodoDeclaraActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionConta=false;
		lidTransaccionContaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoComprobante=false;
		lidTipoComprobanteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTributario=false;
		lidTipoTributarioActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIva=false;
		lidTipoIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva=false;
		lidTipoRetencionIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta=false;
		lidTipoRetencionIvaPrestaActual=0L; 
		
		
		
 		this.id_compra=null;
 		this.id_periodo_declara=-1L;
 		this.id_transaccion_conta=-1L;
 		this.id_cliente=-1L;
 		this.id_tipo_comprobante=-1L;
 		this.id_tipo_tributario=-1L;
 		this.id_asiento_contable=null;
 		this.id_tipo_iva=-1L;
 		this.id_tipo_retencion_iva=-1L;
 		this.id_tipo_retencion_iva_presta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal= isPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal = sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal= isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocal;
	}
					
	public Long getlIdTransaccionLocalActualForeignKey() {
		return lIdTransaccionLocalActualForeignKey;
	}

	public void setlIdTransaccionLocalActualForeignKey(
			Long lIdTransaccionLocalActualForeignKey) {
		this.lIdTransaccionLocalActualForeignKey = lIdTransaccionLocalActualForeignKey;
	}
				    
	public Long getlIdTransaccionLocalActualForeignKeyParaPosibleAtras() {
		return lIdTransaccionLocalActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTransaccionLocalActualForeignKeyParaPosibleAtras(
			Long lIdTransaccionLocalActualForeignKeyParaPosibleAtras) {
		this.lIdTransaccionLocalActualForeignKeyParaPosibleAtras = lIdTransaccionLocalActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTransaccionLocalParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTransaccionLocal() {
		return sUltimaBusquedaTransaccionLocal;
	}

	public void setsUltimaBusquedaTransaccionLocal(String sUltimaBusquedaTransaccionLocal) {
		this.sUltimaBusquedaTransaccionLocal = sUltimaBusquedaTransaccionLocal;
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
    
	public Long getid_compra() {
		return this.id_compra;
	}
    
	public Long getid_periodo_declara() {
		return this.id_periodo_declara;
	}
    
	public Long getid_transaccion_conta() {
		return this.id_transaccion_conta;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipo_comprobante() {
		return this.id_tipo_comprobante;
	}
    
	public Long getid_tipo_tributario() {
		return this.id_tipo_tributario;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public Long getid_tipo_iva() {
		return this.id_tipo_iva;
	}
    
	public Long getid_tipo_retencion_iva() {
		return this.id_tipo_retencion_iva;
	}
    
	public Long getid_tipo_retencion_iva_presta() {
		return this.id_tipo_retencion_iva_presta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_compra(Long newid_compra) {
		if(this.id_compra!=newid_compra) {

			this.id_compra=newid_compra;
		}
	}
    
	public void setid_periodo_declara(Long newid_periodo_declara)throws Exception
	{
		try {
			if(this.id_periodo_declara!=newid_periodo_declara) {
				if(newid_periodo_declara==null) {
					//newid_periodo_declara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_periodo_declara");
					}
				}

				this.id_periodo_declara=newid_periodo_declara;
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
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_transaccion_conta");
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
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_comprobante(Long newid_tipo_comprobante)throws Exception
	{
		try {
			if(this.id_tipo_comprobante!=newid_tipo_comprobante) {
				if(newid_tipo_comprobante==null) {
					//newid_tipo_comprobante=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_tipo_comprobante");
					}
				}

				this.id_tipo_comprobante=newid_tipo_comprobante;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tributario(Long newid_tipo_tributario)throws Exception
	{
		try {
			if(this.id_tipo_tributario!=newid_tipo_tributario) {
				if(newid_tipo_tributario==null) {
					//newid_tipo_tributario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_tipo_tributario");
					}
				}

				this.id_tipo_tributario=newid_tipo_tributario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable) {
		if(this.id_asiento_contable!=newid_asiento_contable) {

			this.id_asiento_contable=newid_asiento_contable;
		}
	}
    
	public void setid_tipo_iva(Long newid_tipo_iva)throws Exception
	{
		try {
			if(this.id_tipo_iva!=newid_tipo_iva) {
				if(newid_tipo_iva==null) {
					//newid_tipo_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_tipo_iva");
					}
				}

				this.id_tipo_iva=newid_tipo_iva;
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
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_tipo_retencion_iva");
					}
				}

				this.id_tipo_retencion_iva=newid_tipo_retencion_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva_presta(Long newid_tipo_retencion_iva_presta)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva_presta!=newid_tipo_retencion_iva_presta) {
				if(newid_tipo_retencion_iva_presta==null) {
					//newid_tipo_retencion_iva_presta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionLocal:Valor nulo no permitido en columna id_tipo_retencion_iva_presta");
					}
				}

				this.id_tipo_retencion_iva_presta=newid_tipo_retencion_iva_presta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCompra() {
		return isBusquedaDesdeForeignKeySesionCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionCompra(
		Boolean isBusquedaDesdeForeignKeySesionCompra) {
		this.isBusquedaDesdeForeignKeySesionCompra = isBusquedaDesdeForeignKeySesionCompra;
	}

	public Long getlidCompraActual() {
		return lidCompraActual;
	}

	public void setlidCompraActual(Long lidCompraActual) {
		this.lidCompraActual = lidCompraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodoDeclara() {
		return isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodoDeclara(
		Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara) {
		this.isBusquedaDesdeForeignKeySesionPeriodoDeclara = isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public Long getlidPeriodoDeclaraActual() {
		return lidPeriodoDeclaraActual;
	}

	public void setlidPeriodoDeclaraActual(Long lidPeriodoDeclaraActual) {
		this.lidPeriodoDeclaraActual = lidPeriodoDeclaraActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta = isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public Long getlidTipoRetencionIvaPrestaActual() {
		return lidTipoRetencionIvaPrestaActual;
	}

	public void setlidTipoRetencionIvaPrestaActual(Long lidTipoRetencionIvaPrestaActual) {
		this.lidTipoRetencionIvaPrestaActual = lidTipoRetencionIvaPrestaActual;
	}
	
	
		
	
}
