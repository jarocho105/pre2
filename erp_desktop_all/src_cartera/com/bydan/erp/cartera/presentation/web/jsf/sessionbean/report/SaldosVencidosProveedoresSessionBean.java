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
public class SaldosVencidosProveedoresSessionBean  extends SaldosVencidosProveedoresSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores;
	protected Long lIdSaldosVencidosProveedoresActualForeignKey;	
	
	protected Long lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras;
	protected String sUltimaBusquedaSaldosVencidosProveedores;
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
	Boolean isBusquedaDesdeForeignKeySesionGrupoCliente;
	Long lidGrupoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_grupo_cliente;
	private Long id_factura;
	private Long id_moneda;
	private Long id_cliente;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SaldosVencidosProveedoresSessionBeanAdditional saldosvencidosproveedoresSessionBeanAdditional=null;
	
	public SaldosVencidosProveedoresSessionBeanAdditional getSaldosVencidosProveedoresSessionBeanAdditional() {
		return this.saldosvencidosproveedoresSessionBeanAdditional;
	}
	
	public void setSaldosVencidosProveedoresSessionBeanAdditional(SaldosVencidosProveedoresSessionBeanAdditional saldosvencidosproveedoresSessionBeanAdditional) {
		try {
			this.saldosvencidosproveedoresSessionBeanAdditional=saldosvencidosproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SaldosVencidosProveedoresSessionBean () {
		this.inicializarSaldosVencidosProveedoresSessionBean();
	}
	
	public void inicializarSaldosVencidosProveedoresSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores=false;
		this.lIdSaldosVencidosProveedoresActualForeignKey=0L;
		this.lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras=false;
		this.sUltimaBusquedaSaldosVencidosProveedores ="";
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
		isBusquedaDesdeForeignKeySesionGrupoCliente=false;
		lidGrupoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_grupo_cliente=-1L;
 		this.id_factura=-1L;
 		this.id_moneda=-1L;
 		this.id_cliente=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores= isPermiteNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores = sNombrePaginaNavegacionHaciaForeignKeyDesdeSaldosVencidosProveedores;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores() {
		return isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores= isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedores;
	}
					
	public Long getlIdSaldosVencidosProveedoresActualForeignKey() {
		return lIdSaldosVencidosProveedoresActualForeignKey;
	}

	public void setlIdSaldosVencidosProveedoresActualForeignKey(
			Long lIdSaldosVencidosProveedoresActualForeignKey) {
		this.lIdSaldosVencidosProveedoresActualForeignKey = lIdSaldosVencidosProveedoresActualForeignKey;
	}
				    
	public Long getlIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras() {
		return lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras(
			Long lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras) {
		this.lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras = lIdSaldosVencidosProveedoresActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySaldosVencidosProveedoresParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSaldosVencidosProveedores() {
		return sUltimaBusquedaSaldosVencidosProveedores;
	}

	public void setsUltimaBusquedaSaldosVencidosProveedores(String sUltimaBusquedaSaldosVencidosProveedores) {
		this.sUltimaBusquedaSaldosVencidosProveedores = sUltimaBusquedaSaldosVencidosProveedores;
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
    
	public Long getid_grupo_cliente() {
		return this.id_grupo_cliente;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id");
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
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id_grupo_cliente");
					}
				}

				this.id_grupo_cliente=newid_grupo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura(Long newid_factura)throws Exception
	{
		try {
			if(this.id_factura!=newid_factura) {
				if(newid_factura==null) {
					//newid_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
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
						System.out.println("SaldosVencidosProveedores:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFactura() {
		return isBusquedaDesdeForeignKeySesionFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionFactura(
		Boolean isBusquedaDesdeForeignKeySesionFactura) {
		this.isBusquedaDesdeForeignKeySesionFactura = isBusquedaDesdeForeignKeySesionFactura;
	}

	public Long getlidFacturaActual() {
		return lidFacturaActual;
	}

	public void setlidFacturaActual(Long lidFacturaActual) {
		this.lidFacturaActual = lidFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
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
