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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class ParametroTesoreriaSessionBean  extends ParametroTesoreriaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria;
	protected Long lIdParametroTesoreriaActualForeignKey;	
	
	protected Long lIdParametroTesoreriaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras;
	protected String sUltimaBusquedaParametroTesoreria;
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
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarPago;
	Long lidTransaccionCobrarPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito;
	Long lidTransaccionCobrarDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito;
	Long lidTransaccionCobrarCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarPago;
	Long lidTransaccionPagarPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarDebito;
	Long lidTransaccionPagarDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarCredito;
	Long lidTransaccionPagarCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_transaccion_cobrar_pago;
	private Long id_transaccion_cobrar_debito;
	private Long id_transaccion_cobrar_credito;
	private Long id_transaccion_pagar_pago;
	private Long id_transaccion_pagar_debito;
	private Long id_transaccion_pagar_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroTesoreriaSessionBeanAdditional parametrotesoreriaSessionBeanAdditional=null;
	
	public ParametroTesoreriaSessionBeanAdditional getParametroTesoreriaSessionBeanAdditional() {
		return this.parametrotesoreriaSessionBeanAdditional;
	}
	
	public void setParametroTesoreriaSessionBeanAdditional(ParametroTesoreriaSessionBeanAdditional parametrotesoreriaSessionBeanAdditional) {
		try {
			this.parametrotesoreriaSessionBeanAdditional=parametrotesoreriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroTesoreriaSessionBean () {
		this.inicializarParametroTesoreriaSessionBean();
	}
	
	public void inicializarParametroTesoreriaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria=false;
		this.lIdParametroTesoreriaActualForeignKey=0L;
		this.lIdParametroTesoreriaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras=false;
		this.sUltimaBusquedaParametroTesoreria ="";
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
		isBusquedaDesdeForeignKeySesionTransaccionCobrarPago=false;
		lidTransaccionCobrarPagoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito=false;
		lidTransaccionCobrarDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito=false;
		lidTransaccionCobrarCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionPagarPago=false;
		lidTransaccionPagarPagoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionPagarDebito=false;
		lidTransaccionPagarDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionPagarCredito=false;
		lidTransaccionPagarCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_transaccion_cobrar_pago=-1L;
 		this.id_transaccion_cobrar_debito=-1L;
 		this.id_transaccion_cobrar_credito=-1L;
 		this.id_transaccion_pagar_pago=-1L;
 		this.id_transaccion_pagar_debito=-1L;
 		this.id_transaccion_pagar_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria= isPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreria;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria= isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreria;
	}
					
	public Long getlIdParametroTesoreriaActualForeignKey() {
		return lIdParametroTesoreriaActualForeignKey;
	}

	public void setlIdParametroTesoreriaActualForeignKey(
			Long lIdParametroTesoreriaActualForeignKey) {
		this.lIdParametroTesoreriaActualForeignKey = lIdParametroTesoreriaActualForeignKey;
	}
				    
	public Long getlIdParametroTesoreriaActualForeignKeyParaPosibleAtras() {
		return lIdParametroTesoreriaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroTesoreriaActualForeignKeyParaPosibleAtras(
			Long lIdParametroTesoreriaActualForeignKeyParaPosibleAtras) {
		this.lIdParametroTesoreriaActualForeignKeyParaPosibleAtras = lIdParametroTesoreriaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroTesoreriaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroTesoreria() {
		return sUltimaBusquedaParametroTesoreria;
	}

	public void setsUltimaBusquedaParametroTesoreria(String sUltimaBusquedaParametroTesoreria) {
		this.sUltimaBusquedaParametroTesoreria = sUltimaBusquedaParametroTesoreria;
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
    
	public Long getid_transaccion_cobrar_pago() {
		return this.id_transaccion_cobrar_pago;
	}
    
	public Long getid_transaccion_cobrar_debito() {
		return this.id_transaccion_cobrar_debito;
	}
    
	public Long getid_transaccion_cobrar_credito() {
		return this.id_transaccion_cobrar_credito;
	}
    
	public Long getid_transaccion_pagar_pago() {
		return this.id_transaccion_pagar_pago;
	}
    
	public Long getid_transaccion_pagar_debito() {
		return this.id_transaccion_pagar_debito;
	}
    
	public Long getid_transaccion_pagar_credito() {
		return this.id_transaccion_pagar_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cobrar_pago(Long newid_transaccion_cobrar_pago)throws Exception
	{
		try {
			if(this.id_transaccion_cobrar_pago!=newid_transaccion_cobrar_pago) {
				if(newid_transaccion_cobrar_pago==null) {
					//newid_transaccion_cobrar_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_cobrar_pago");
					}
				}

				this.id_transaccion_cobrar_pago=newid_transaccion_cobrar_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cobrar_debito(Long newid_transaccion_cobrar_debito)throws Exception
	{
		try {
			if(this.id_transaccion_cobrar_debito!=newid_transaccion_cobrar_debito) {
				if(newid_transaccion_cobrar_debito==null) {
					//newid_transaccion_cobrar_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_cobrar_debito");
					}
				}

				this.id_transaccion_cobrar_debito=newid_transaccion_cobrar_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cobrar_credito(Long newid_transaccion_cobrar_credito)throws Exception
	{
		try {
			if(this.id_transaccion_cobrar_credito!=newid_transaccion_cobrar_credito) {
				if(newid_transaccion_cobrar_credito==null) {
					//newid_transaccion_cobrar_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_cobrar_credito");
					}
				}

				this.id_transaccion_cobrar_credito=newid_transaccion_cobrar_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_pagar_pago(Long newid_transaccion_pagar_pago)throws Exception
	{
		try {
			if(this.id_transaccion_pagar_pago!=newid_transaccion_pagar_pago) {
				if(newid_transaccion_pagar_pago==null) {
					//newid_transaccion_pagar_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_pagar_pago");
					}
				}

				this.id_transaccion_pagar_pago=newid_transaccion_pagar_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_pagar_debito(Long newid_transaccion_pagar_debito)throws Exception
	{
		try {
			if(this.id_transaccion_pagar_debito!=newid_transaccion_pagar_debito) {
				if(newid_transaccion_pagar_debito==null) {
					//newid_transaccion_pagar_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_pagar_debito");
					}
				}

				this.id_transaccion_pagar_debito=newid_transaccion_pagar_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_pagar_credito(Long newid_transaccion_pagar_credito)throws Exception
	{
		try {
			if(this.id_transaccion_pagar_credito!=newid_transaccion_pagar_credito) {
				if(newid_transaccion_pagar_credito==null) {
					//newid_transaccion_pagar_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroTesoreria:Valor nulo no permitido en columna id_transaccion_pagar_credito");
					}
				}

				this.id_transaccion_pagar_credito=newid_transaccion_pagar_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCobrarPago() {
		return isBusquedaDesdeForeignKeySesionTransaccionCobrarPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCobrarPago(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarPago) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCobrarPago = isBusquedaDesdeForeignKeySesionTransaccionCobrarPago;
	}

	public Long getlidTransaccionCobrarPagoActual() {
		return lidTransaccionCobrarPagoActual;
	}

	public void setlidTransaccionCobrarPagoActual(Long lidTransaccionCobrarPagoActual) {
		this.lidTransaccionCobrarPagoActual = lidTransaccionCobrarPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCobrarDebito() {
		return isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCobrarDebito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito = isBusquedaDesdeForeignKeySesionTransaccionCobrarDebito;
	}

	public Long getlidTransaccionCobrarDebitoActual() {
		return lidTransaccionCobrarDebitoActual;
	}

	public void setlidTransaccionCobrarDebitoActual(Long lidTransaccionCobrarDebitoActual) {
		this.lidTransaccionCobrarDebitoActual = lidTransaccionCobrarDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCobrarCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCobrarCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito = isBusquedaDesdeForeignKeySesionTransaccionCobrarCredito;
	}

	public Long getlidTransaccionCobrarCreditoActual() {
		return lidTransaccionCobrarCreditoActual;
	}

	public void setlidTransaccionCobrarCreditoActual(Long lidTransaccionCobrarCreditoActual) {
		this.lidTransaccionCobrarCreditoActual = lidTransaccionCobrarCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionPagarPago() {
		return isBusquedaDesdeForeignKeySesionTransaccionPagarPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionPagarPago(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarPago) {
		this.isBusquedaDesdeForeignKeySesionTransaccionPagarPago = isBusquedaDesdeForeignKeySesionTransaccionPagarPago;
	}

	public Long getlidTransaccionPagarPagoActual() {
		return lidTransaccionPagarPagoActual;
	}

	public void setlidTransaccionPagarPagoActual(Long lidTransaccionPagarPagoActual) {
		this.lidTransaccionPagarPagoActual = lidTransaccionPagarPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionPagarDebito() {
		return isBusquedaDesdeForeignKeySesionTransaccionPagarDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionPagarDebito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarDebito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionPagarDebito = isBusquedaDesdeForeignKeySesionTransaccionPagarDebito;
	}

	public Long getlidTransaccionPagarDebitoActual() {
		return lidTransaccionPagarDebitoActual;
	}

	public void setlidTransaccionPagarDebitoActual(Long lidTransaccionPagarDebitoActual) {
		this.lidTransaccionPagarDebitoActual = lidTransaccionPagarDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionPagarCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionPagarCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionPagarCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionPagarCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionPagarCredito = isBusquedaDesdeForeignKeySesionTransaccionPagarCredito;
	}

	public Long getlidTransaccionPagarCreditoActual() {
		return lidTransaccionPagarCreditoActual;
	}

	public void setlidTransaccionPagarCreditoActual(Long lidTransaccionPagarCreditoActual) {
		this.lidTransaccionPagarCreditoActual = lidTransaccionPagarCreditoActual;
	}
	
	
		
	
}
