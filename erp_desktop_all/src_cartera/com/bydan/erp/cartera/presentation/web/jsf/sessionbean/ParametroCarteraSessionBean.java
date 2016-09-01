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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class ParametroCarteraSessionBean  extends ParametroCarteraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera;
	protected Long lIdParametroCarteraActualForeignKey;	
	
	protected Long lIdParametroCarteraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras;
	protected String sUltimaBusquedaParametroCartera;
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
	Boolean isBusquedaDesdeForeignKeySesionTransaccionFactura;
	Long lidTransaccionFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionDeshabilita;
	Long lidTransaccionDeshabilitaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionHabilita;
	Long lidTransaccionHabilitaActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFactura;
	Long lidTipoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAutoPago;
	Long lidTipoAutoPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal;
	Long lidCuentaContableCreditoFiscalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_transaccion_factura;
	private Long id_empleado;
	private Long id_transaccion_deshabilita;
	private Long id_transaccion_habilita;
	private Long id_bodega;
	private Long id_tipo_factura;
	private Long id_tipo_auto_pago;
	private Long id_cuenta_contable_credito_fiscal;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroCarteraSessionBeanAdditional parametrocarteraSessionBeanAdditional=null;
	
	public ParametroCarteraSessionBeanAdditional getParametroCarteraSessionBeanAdditional() {
		return this.parametrocarteraSessionBeanAdditional;
	}
	
	public void setParametroCarteraSessionBeanAdditional(ParametroCarteraSessionBeanAdditional parametrocarteraSessionBeanAdditional) {
		try {
			this.parametrocarteraSessionBeanAdditional=parametrocarteraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroCarteraSessionBean () {
		this.inicializarParametroCarteraSessionBean();
	}
	
	public void inicializarParametroCarteraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera=false;
		this.lIdParametroCarteraActualForeignKey=0L;
		this.lIdParametroCarteraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras=false;
		this.sUltimaBusquedaParametroCartera ="";
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
		isBusquedaDesdeForeignKeySesionTransaccionFactura=false;
		lidTransaccionFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionDeshabilita=false;
		lidTransaccionDeshabilitaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionHabilita=false;
		lidTransaccionHabilitaActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFactura=false;
		lidTipoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAutoPago=false;
		lidTipoAutoPagoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal=false;
		lidCuentaContableCreditoFiscalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_transaccion_factura=-1L;
 		this.id_empleado=-1L;
 		this.id_transaccion_deshabilita=-1L;
 		this.id_transaccion_habilita=-1L;
 		this.id_bodega=-1L;
 		this.id_tipo_factura=-1L;
 		this.id_tipo_auto_pago=-1L;
 		this.id_cuenta_contable_credito_fiscal=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroCartera() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroCartera(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera= isPermiteNavegacionHaciaForeignKeyDesdeParametroCartera;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCartera;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroCartera() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroCartera(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera= isBusquedaDesdeForeignKeySesionForeignKeyParametroCartera;
	}
					
	public Long getlIdParametroCarteraActualForeignKey() {
		return lIdParametroCarteraActualForeignKey;
	}

	public void setlIdParametroCarteraActualForeignKey(
			Long lIdParametroCarteraActualForeignKey) {
		this.lIdParametroCarteraActualForeignKey = lIdParametroCarteraActualForeignKey;
	}
				    
	public Long getlIdParametroCarteraActualForeignKeyParaPosibleAtras() {
		return lIdParametroCarteraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroCarteraActualForeignKeyParaPosibleAtras(
			Long lIdParametroCarteraActualForeignKeyParaPosibleAtras) {
		this.lIdParametroCarteraActualForeignKeyParaPosibleAtras = lIdParametroCarteraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroCarteraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroCartera() {
		return sUltimaBusquedaParametroCartera;
	}

	public void setsUltimaBusquedaParametroCartera(String sUltimaBusquedaParametroCartera) {
		this.sUltimaBusquedaParametroCartera = sUltimaBusquedaParametroCartera;
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
    
	public Long getid_transaccion_factura() {
		return this.id_transaccion_factura;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_transaccion_deshabilita() {
		return this.id_transaccion_deshabilita;
	}
    
	public Long getid_transaccion_habilita() {
		return this.id_transaccion_habilita;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_tipo_factura() {
		return this.id_tipo_factura;
	}
    
	public Long getid_tipo_auto_pago() {
		return this.id_tipo_auto_pago;
	}
    
	public Long getid_cuenta_contable_credito_fiscal() {
		return this.id_cuenta_contable_credito_fiscal;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_factura(Long newid_transaccion_factura)throws Exception
	{
		try {
			if(this.id_transaccion_factura!=newid_transaccion_factura) {
				if(newid_transaccion_factura==null) {
					//newid_transaccion_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_transaccion_factura");
					}
				}

				this.id_transaccion_factura=newid_transaccion_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_deshabilita(Long newid_transaccion_deshabilita)throws Exception
	{
		try {
			if(this.id_transaccion_deshabilita!=newid_transaccion_deshabilita) {
				if(newid_transaccion_deshabilita==null) {
					//newid_transaccion_deshabilita=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_transaccion_deshabilita");
					}
				}

				this.id_transaccion_deshabilita=newid_transaccion_deshabilita;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_habilita(Long newid_transaccion_habilita)throws Exception
	{
		try {
			if(this.id_transaccion_habilita!=newid_transaccion_habilita) {
				if(newid_transaccion_habilita==null) {
					//newid_transaccion_habilita=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_transaccion_habilita");
					}
				}

				this.id_transaccion_habilita=newid_transaccion_habilita;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_factura(Long newid_tipo_factura)throws Exception
	{
		try {
			if(this.id_tipo_factura!=newid_tipo_factura) {
				if(newid_tipo_factura==null) {
					//newid_tipo_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_tipo_factura");
					}
				}

				this.id_tipo_factura=newid_tipo_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_auto_pago(Long newid_tipo_auto_pago)throws Exception
	{
		try {
			if(this.id_tipo_auto_pago!=newid_tipo_auto_pago) {
				if(newid_tipo_auto_pago==null) {
					//newid_tipo_auto_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroCartera:Valor nulo no permitido en columna id_tipo_auto_pago");
					}
				}

				this.id_tipo_auto_pago=newid_tipo_auto_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito_fiscal(Long newid_cuenta_contable_credito_fiscal) {
		if(this.id_cuenta_contable_credito_fiscal!=newid_cuenta_contable_credito_fiscal) {

			this.id_cuenta_contable_credito_fiscal=newid_cuenta_contable_credito_fiscal;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionFactura = isBusquedaDesdeForeignKeySesionTransaccionFactura;
	}

	public Long getlidTransaccionFacturaActual() {
		return lidTransaccionFacturaActual;
	}

	public void setlidTransaccionFacturaActual(Long lidTransaccionFacturaActual) {
		this.lidTransaccionFacturaActual = lidTransaccionFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionDeshabilita() {
		return isBusquedaDesdeForeignKeySesionTransaccionDeshabilita;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionDeshabilita(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionDeshabilita) {
		this.isBusquedaDesdeForeignKeySesionTransaccionDeshabilita = isBusquedaDesdeForeignKeySesionTransaccionDeshabilita;
	}

	public Long getlidTransaccionDeshabilitaActual() {
		return lidTransaccionDeshabilitaActual;
	}

	public void setlidTransaccionDeshabilitaActual(Long lidTransaccionDeshabilitaActual) {
		this.lidTransaccionDeshabilitaActual = lidTransaccionDeshabilitaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionHabilita() {
		return isBusquedaDesdeForeignKeySesionTransaccionHabilita;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionHabilita(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionHabilita) {
		this.isBusquedaDesdeForeignKeySesionTransaccionHabilita = isBusquedaDesdeForeignKeySesionTransaccionHabilita;
	}

	public Long getlidTransaccionHabilitaActual() {
		return lidTransaccionHabilitaActual;
	}

	public void setlidTransaccionHabilitaActual(Long lidTransaccionHabilitaActual) {
		this.lidTransaccionHabilitaActual = lidTransaccionHabilitaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodega() {
		return isBusquedaDesdeForeignKeySesionBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionBodega(
		Boolean isBusquedaDesdeForeignKeySesionBodega) {
		this.isBusquedaDesdeForeignKeySesionBodega = isBusquedaDesdeForeignKeySesionBodega;
	}

	public Long getlidBodegaActual() {
		return lidBodegaActual;
	}

	public void setlidBodegaActual(Long lidBodegaActual) {
		this.lidBodegaActual = lidBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFactura() {
		return isBusquedaDesdeForeignKeySesionTipoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFactura(
		Boolean isBusquedaDesdeForeignKeySesionTipoFactura) {
		this.isBusquedaDesdeForeignKeySesionTipoFactura = isBusquedaDesdeForeignKeySesionTipoFactura;
	}

	public Long getlidTipoFacturaActual() {
		return lidTipoFacturaActual;
	}

	public void setlidTipoFacturaActual(Long lidTipoFacturaActual) {
		this.lidTipoFacturaActual = lidTipoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAutoPago() {
		return isBusquedaDesdeForeignKeySesionTipoAutoPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAutoPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoAutoPago) {
		this.isBusquedaDesdeForeignKeySesionTipoAutoPago = isBusquedaDesdeForeignKeySesionTipoAutoPago;
	}

	public Long getlidTipoAutoPagoActual() {
		return lidTipoAutoPagoActual;
	}

	public void setlidTipoAutoPagoActual(Long lidTipoAutoPagoActual) {
		this.lidTipoAutoPagoActual = lidTipoAutoPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal = isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal;
	}

	public Long getlidCuentaContableCreditoFiscalActual() {
		return lidCuentaContableCreditoFiscalActual;
	}

	public void setlidCuentaContableCreditoFiscalActual(Long lidCuentaContableCreditoFiscalActual) {
		this.lidCuentaContableCreditoFiscalActual = lidCuentaContableCreditoFiscalActual;
	}
	
	
		
	
}
