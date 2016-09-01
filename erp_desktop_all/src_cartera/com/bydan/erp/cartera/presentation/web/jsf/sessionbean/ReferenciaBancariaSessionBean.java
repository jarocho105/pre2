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
public class ReferenciaBancariaSessionBean  extends ReferenciaBancariaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria;
	protected Long lIdReferenciaBancariaActualForeignKey;	
	
	protected Long lIdReferenciaBancariaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras;
	protected String sUltimaBusquedaReferenciaBancaria;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProduBanco;
	Long lidTipoProduBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	Long lidTipoCuentaBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoValoracion;
	Long lidTipoValoracionActual;
	
	private Long id;
	private Long id_empresa;
	private Long idcliente;
	private Long idvalorclientebanco;
	private Long idvalorclienteproductobanco;
	private Long idvalorclientecuentabanco;
	private Long id_tipo_valoracion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ReferenciaBancariaSessionBeanAdditional referenciabancariaSessionBeanAdditional=null;
	
	public ReferenciaBancariaSessionBeanAdditional getReferenciaBancariaSessionBeanAdditional() {
		return this.referenciabancariaSessionBeanAdditional;
	}
	
	public void setReferenciaBancariaSessionBeanAdditional(ReferenciaBancariaSessionBeanAdditional referenciabancariaSessionBeanAdditional) {
		try {
			this.referenciabancariaSessionBeanAdditional=referenciabancariaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ReferenciaBancariaSessionBean () {
		this.inicializarReferenciaBancariaSessionBean();
	}
	
	public void inicializarReferenciaBancariaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria=false;
		this.lIdReferenciaBancariaActualForeignKey=0L;
		this.lIdReferenciaBancariaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras=false;
		this.sUltimaBusquedaReferenciaBancaria ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProduBanco=false;
		lidTipoProduBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBanco=false;
		lidTipoCuentaBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoValoracion=false;
		lidTipoValoracionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.idcliente=-1L;
 		this.idvalorclientebanco=-1L;
 		this.idvalorclienteproductobanco=-1L;
 		this.idvalorclientecuentabanco=-1L;
 		this.id_tipo_valoracion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria= isPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria(String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria = sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria= isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria;
	}
					
	public Long getlIdReferenciaBancariaActualForeignKey() {
		return lIdReferenciaBancariaActualForeignKey;
	}

	public void setlIdReferenciaBancariaActualForeignKey(
			Long lIdReferenciaBancariaActualForeignKey) {
		this.lIdReferenciaBancariaActualForeignKey = lIdReferenciaBancariaActualForeignKey;
	}
				    
	public Long getlIdReferenciaBancariaActualForeignKeyParaPosibleAtras() {
		return lIdReferenciaBancariaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdReferenciaBancariaActualForeignKeyParaPosibleAtras(
			Long lIdReferenciaBancariaActualForeignKeyParaPosibleAtras) {
		this.lIdReferenciaBancariaActualForeignKeyParaPosibleAtras = lIdReferenciaBancariaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancariaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaReferenciaBancaria() {
		return sUltimaBusquedaReferenciaBancaria;
	}

	public void setsUltimaBusquedaReferenciaBancaria(String sUltimaBusquedaReferenciaBancaria) {
		this.sUltimaBusquedaReferenciaBancaria = sUltimaBusquedaReferenciaBancaria;
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
    
	public Long getidcliente() {
		return this.idcliente;
	}
    
	public Long getidvalorclientebanco() {
		return this.idvalorclientebanco;
	}
    
	public Long getidvalorclienteproductobanco() {
		return this.idvalorclienteproductobanco;
	}
    
	public Long getidvalorclientecuentabanco() {
		return this.idvalorclientecuentabanco;
	}
    
	public Long getid_tipo_valoracion() {
		return this.id_tipo_valoracion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna id");
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
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidcliente(Long newidcliente)throws Exception
	{
		try {
			if(this.idcliente!=newidcliente) {
				if(newidcliente==null) {
					//newidcliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientebanco(Long newidvalorclientebanco)throws Exception
	{
		try {
			if(this.idvalorclientebanco!=newidvalorclientebanco) {
				if(newidvalorclientebanco==null) {
					//newidvalorclientebanco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna idvalorclientebanco");
					}
				}

				this.idvalorclientebanco=newidvalorclientebanco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclienteproductobanco(Long newidvalorclienteproductobanco)throws Exception
	{
		try {
			if(this.idvalorclienteproductobanco!=newidvalorclienteproductobanco) {
				if(newidvalorclienteproductobanco==null) {
					//newidvalorclienteproductobanco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna idvalorclienteproductobanco");
					}
				}

				this.idvalorclienteproductobanco=newidvalorclienteproductobanco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientecuentabanco(Long newidvalorclientecuentabanco)throws Exception
	{
		try {
			if(this.idvalorclientecuentabanco!=newidvalorclientecuentabanco) {
				if(newidvalorclientecuentabanco==null) {
					//newidvalorclientecuentabanco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna idvalorclientecuentabanco");
					}
				}

				this.idvalorclientecuentabanco=newidvalorclientecuentabanco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_valoracion(Long newid_tipo_valoracion)throws Exception
	{
		try {
			if(this.id_tipo_valoracion!=newid_tipo_valoracion) {
				if(newid_tipo_valoracion==null) {
					//newid_tipo_valoracion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaBancaria:Valor nulo no permitido en columna id_tipo_valoracion");
					}
				}

				this.id_tipo_valoracion=newid_tipo_valoracion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProduBanco() {
		return isBusquedaDesdeForeignKeySesionTipoProduBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProduBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoProduBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoProduBanco = isBusquedaDesdeForeignKeySesionTipoProduBanco;
	}

	public Long getlidTipoProduBancoActual() {
		return lidTipoProduBancoActual;
	}

	public void setlidTipoProduBancoActual(Long lidTipoProduBancoActual) {
		this.lidTipoProduBancoActual = lidTipoProduBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBanco = isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	}

	public Long getlidTipoCuentaBancoActual() {
		return lidTipoCuentaBancoActual;
	}

	public void setlidTipoCuentaBancoActual(Long lidTipoCuentaBancoActual) {
		this.lidTipoCuentaBancoActual = lidTipoCuentaBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoValoracion() {
		return isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoValoracion(
		Boolean isBusquedaDesdeForeignKeySesionTipoValoracion) {
		this.isBusquedaDesdeForeignKeySesionTipoValoracion = isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public Long getlidTipoValoracionActual() {
		return lidTipoValoracionActual;
	}

	public void setlidTipoValoracionActual(Long lidTipoValoracionActual) {
		this.lidTipoValoracionActual = lidTipoValoracionActual;
	}
	
	
		
	
}
