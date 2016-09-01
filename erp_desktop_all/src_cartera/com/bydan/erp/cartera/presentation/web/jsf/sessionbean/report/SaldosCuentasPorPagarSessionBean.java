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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class SaldosCuentasPorPagarSessionBean  extends SaldosCuentasPorPagarSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar;
	protected Long lIdSaldosCuentasPorPagarActualForeignKey;	
	
	protected Long lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras;
	protected String sUltimaBusquedaSaldosCuentasPorPagar;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionZona;
	Long lidZonaActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoCliente;
	Long lidGrupoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	
	private Long id;
	private Long id_zona;
	private Long id_grupo_cliente;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cliente;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SaldosCuentasPorPagarSessionBeanAdditional saldoscuentasporpagarSessionBeanAdditional=null;
	
	public SaldosCuentasPorPagarSessionBeanAdditional getSaldosCuentasPorPagarSessionBeanAdditional() {
		return this.saldoscuentasporpagarSessionBeanAdditional;
	}
	
	public void setSaldosCuentasPorPagarSessionBeanAdditional(SaldosCuentasPorPagarSessionBeanAdditional saldoscuentasporpagarSessionBeanAdditional) {
		try {
			this.saldoscuentasporpagarSessionBeanAdditional=saldoscuentasporpagarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SaldosCuentasPorPagarSessionBean () {
		this.inicializarSaldosCuentasPorPagarSessionBean();
	}
	
	public void inicializarSaldosCuentasPorPagarSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar=false;
		this.lIdSaldosCuentasPorPagarActualForeignKey=0L;
		this.lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras=false;
		this.sUltimaBusquedaSaldosCuentasPorPagar ="";
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
		
		
		isBusquedaDesdeForeignKeySesionZona=false;
		lidZonaActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoCliente=false;
		lidGrupoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L; 
		
		
		
 		this.id_zona=-1L;
 		this.id_grupo_cliente=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cliente=-1L;
 		this.fecha_emision_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar= isPermiteNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar = sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosCuentasPorPagar;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar() {
		return isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar= isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagar;
	}
					
	public Long getlIdSaldosCuentasPorPagarActualForeignKey() {
		return lIdSaldosCuentasPorPagarActualForeignKey;
	}

	public void setlIdSaldosCuentasPorPagarActualForeignKey(
			Long lIdSaldosCuentasPorPagarActualForeignKey) {
		this.lIdSaldosCuentasPorPagarActualForeignKey = lIdSaldosCuentasPorPagarActualForeignKey;
	}
				    
	public Long getlIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras() {
		return lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras(
			Long lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras) {
		this.lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras = lIdSaldosCuentasPorPagarActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySaldosCuentasPorPagarParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSaldosCuentasPorPagar() {
		return sUltimaBusquedaSaldosCuentasPorPagar;
	}

	public void setsUltimaBusquedaSaldosCuentasPorPagar(String sUltimaBusquedaSaldosCuentasPorPagar) {
		this.sUltimaBusquedaSaldosCuentasPorPagar = sUltimaBusquedaSaldosCuentasPorPagar;
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
    
	public Long getid_zona() {
		return this.id_zona;
	}
    
	public Long getid_grupo_cliente() {
		return this.id_grupo_cliente;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Date getfecha_emision_hasta() {
		return this.fecha_emision_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_zona(Long newid_zona)throws Exception
	{
		try {
			if(this.id_zona!=newid_zona) {
				if(newid_zona==null) {
					//newid_zona=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id_zona");
					}
				}

				this.id_zona=newid_zona;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_cliente(Long newid_grupo_cliente)throws Exception
	{
		try {
			if(this.id_grupo_cliente!=newid_grupo_cliente) {
				if(newid_grupo_cliente==null) {
					//newid_grupo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id_grupo_cliente");
					}
				}

				this.id_grupo_cliente=newid_grupo_cliente;
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
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_hasta(Date newfecha_emision_hasta)throws Exception
	{
		try {
			if(this.fecha_emision_hasta!=newfecha_emision_hasta) {
				if(newfecha_emision_hasta==null) {
					//newfecha_emision_hasta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosCuentasPorPagar:Valor nulo no permitido en columna fecha_emision_hasta");
					}
				}

				this.fecha_emision_hasta=newfecha_emision_hasta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionZona() {
		return isBusquedaDesdeForeignKeySesionZona;
	}

	public void setisBusquedaDesdeForeignKeySesionZona(
		Boolean isBusquedaDesdeForeignKeySesionZona) {
		this.isBusquedaDesdeForeignKeySesionZona = isBusquedaDesdeForeignKeySesionZona;
	}

	public Long getlidZonaActual() {
		return lidZonaActual;
	}

	public void setlidZonaActual(Long lidZonaActual) {
		this.lidZonaActual = lidZonaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoCliente() {
		return isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoCliente(
		Boolean isBusquedaDesdeForeignKeySesionGrupoCliente) {
		this.isBusquedaDesdeForeignKeySesionGrupoCliente = isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public Long getlidGrupoClienteActual() {
		return lidGrupoClienteActual;
	}

	public void setlidGrupoClienteActual(Long lidGrupoClienteActual) {
		this.lidGrupoClienteActual = lidGrupoClienteActual;
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
	
	
		
	
}
