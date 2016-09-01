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
public class PoliticasClienteSessionBean  extends PoliticasClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente;
	protected Long lIdPoliticasClienteActualForeignKey;	
	
	protected Long lIdPoliticasClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras;
	protected String sUltimaBusquedaPoliticasCliente;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionTransporte;
	Long lidTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaNegocio;
	Long lidLineaNegocioActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	Long lidTipoCuentaBancoGlobalActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente;
	Long lidEstadoPoliticasClienteActual;
	
	private Long id_cliente;
	private Long id_empresa;
	private Long id_tipo_precio;
	private Long id_transporte;
	private Long id_linea_negocio;
	private Long id_banco;
	private Long id_tipo_cuenta_banco_global;
	private Long id_estado_politicas_cliente;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PoliticasClienteSessionBeanAdditional politicasclienteSessionBeanAdditional=null;
	
	public PoliticasClienteSessionBeanAdditional getPoliticasClienteSessionBeanAdditional() {
		return this.politicasclienteSessionBeanAdditional;
	}
	
	public void setPoliticasClienteSessionBeanAdditional(PoliticasClienteSessionBeanAdditional politicasclienteSessionBeanAdditional) {
		try {
			this.politicasclienteSessionBeanAdditional=politicasclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PoliticasClienteSessionBean () {
		this.inicializarPoliticasClienteSessionBean();
	}
	
	public void inicializarPoliticasClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente=false;
		this.lIdPoliticasClienteActualForeignKey=0L;
		this.lIdPoliticasClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras=false;
		this.sUltimaBusquedaPoliticasCliente ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionTransporte=false;
		lidTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionLineaNegocio=false;
		lidLineaNegocioActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal=false;
		lidTipoCuentaBancoGlobalActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente=false;
		lidEstadoPoliticasClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_precio=-1L;
 		this.id_transporte=-1L;
 		this.id_linea_negocio=-1L;
 		this.id_banco=-1L;
 		this.id_tipo_cuenta_banco_global=-1L;
 		this.id_estado_politicas_cliente=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente= isPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente= isBusquedaDesdeForeignKeySesionForeignKeyPoliticasCliente;
	}
					
	public Long getlIdPoliticasClienteActualForeignKey() {
		return lIdPoliticasClienteActualForeignKey;
	}

	public void setlIdPoliticasClienteActualForeignKey(
			Long lIdPoliticasClienteActualForeignKey) {
		this.lIdPoliticasClienteActualForeignKey = lIdPoliticasClienteActualForeignKey;
	}
				    
	public Long getlIdPoliticasClienteActualForeignKeyParaPosibleAtras() {
		return lIdPoliticasClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPoliticasClienteActualForeignKeyParaPosibleAtras(
			Long lIdPoliticasClienteActualForeignKeyParaPosibleAtras) {
		this.lIdPoliticasClienteActualForeignKeyParaPosibleAtras = lIdPoliticasClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPoliticasClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPoliticasCliente() {
		return sUltimaBusquedaPoliticasCliente;
	}

	public void setsUltimaBusquedaPoliticasCliente(String sUltimaBusquedaPoliticasCliente) {
		this.sUltimaBusquedaPoliticasCliente = sUltimaBusquedaPoliticasCliente;
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
	
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_transporte() {
		return this.id_transporte;
	}
    
	public Long getid_linea_negocio() {
		return this.id_linea_negocio;
	}
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_tipo_cuenta_banco_global() {
		return this.id_tipo_cuenta_banco_global;
	}
    
	public Long getid_estado_politicas_cliente() {
		return this.id_estado_politicas_cliente;
	}
	
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_precio(Long newid_tipo_precio)throws Exception
	{
		try {
			if(this.id_tipo_precio!=newid_tipo_precio) {
				if(newid_tipo_precio==null) {
					//newid_tipo_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transporte(Long newid_transporte)throws Exception
	{
		try {
			if(this.id_transporte!=newid_transporte) {
				if(newid_transporte==null) {
					//newid_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_transporte");
					}
				}

				this.id_transporte=newid_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_negocio(Long newid_linea_negocio)throws Exception
	{
		try {
			if(this.id_linea_negocio!=newid_linea_negocio) {
				if(newid_linea_negocio==null) {
					//newid_linea_negocio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_linea_negocio");
					}
				}

				this.id_linea_negocio=newid_linea_negocio;
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
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_banco_global(Long newid_tipo_cuenta_banco_global)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_banco_global!=newid_tipo_cuenta_banco_global) {
				if(newid_tipo_cuenta_banco_global==null) {
					//newid_tipo_cuenta_banco_global=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_tipo_cuenta_banco_global");
					}
				}

				this.id_tipo_cuenta_banco_global=newid_tipo_cuenta_banco_global;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_politicas_cliente(Long newid_estado_politicas_cliente)throws Exception
	{
		try {
			if(this.id_estado_politicas_cliente!=newid_estado_politicas_cliente) {
				if(newid_estado_politicas_cliente==null) {
					//newid_estado_politicas_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PoliticasCliente:Valor nulo no permitido en columna id_estado_politicas_cliente");
					}
				}

				this.id_estado_politicas_cliente=newid_estado_politicas_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrecio() {
		return isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrecio(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrecio) {
		this.isBusquedaDesdeForeignKeySesionTipoPrecio = isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public Long getlidTipoPrecioActual() {
		return lidTipoPrecioActual;
	}

	public void setlidTipoPrecioActual(Long lidTipoPrecioActual) {
		this.lidTipoPrecioActual = lidTipoPrecioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransporte() {
		return isBusquedaDesdeForeignKeySesionTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTransporte) {
		this.isBusquedaDesdeForeignKeySesionTransporte = isBusquedaDesdeForeignKeySesionTransporte;
	}

	public Long getlidTransporteActual() {
		return lidTransporteActual;
	}

	public void setlidTransporteActual(Long lidTransporteActual) {
		this.lidTransporteActual = lidTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaNegocio() {
		return isBusquedaDesdeForeignKeySesionLineaNegocio;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaNegocio(
		Boolean isBusquedaDesdeForeignKeySesionLineaNegocio) {
		this.isBusquedaDesdeForeignKeySesionLineaNegocio = isBusquedaDesdeForeignKeySesionLineaNegocio;
	}

	public Long getlidLineaNegocioActual() {
		return lidLineaNegocioActual;
	}

	public void setlidLineaNegocioActual(Long lidLineaNegocioActual) {
		this.lidLineaNegocioActual = lidLineaNegocioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal = isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public Long getlidTipoCuentaBancoGlobalActual() {
		return lidTipoCuentaBancoGlobalActual;
	}

	public void setlidTipoCuentaBancoGlobalActual(Long lidTipoCuentaBancoGlobalActual) {
		this.lidTipoCuentaBancoGlobalActual = lidTipoCuentaBancoGlobalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPoliticasCliente() {
		return isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPoliticasCliente(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente) {
		this.isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente = isBusquedaDesdeForeignKeySesionEstadoPoliticasCliente;
	}

	public Long getlidEstadoPoliticasClienteActual() {
		return lidEstadoPoliticasClienteActual;
	}

	public void setlidEstadoPoliticasClienteActual(Long lidEstadoPoliticasClienteActual) {
		this.lidEstadoPoliticasClienteActual = lidEstadoPoliticasClienteActual;
	}
	
	
		
	
}
