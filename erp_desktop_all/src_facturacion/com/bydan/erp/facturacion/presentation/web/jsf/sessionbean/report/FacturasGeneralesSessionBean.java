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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class FacturasGeneralesSessionBean  extends FacturasGeneralesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales;
	protected Long lIdFacturasGeneralesActualForeignKey;	
	
	protected Long lIdFacturasGeneralesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras;
	protected String sUltimaBusquedaFacturasGenerales;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFactura;
	Long lidTipoFacturaActual;
	
	private Long id;
	private Long id_zona;
	private Long id_tipo_cliente;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cliente;
	private Long id_tipo_factura;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FacturasGeneralesSessionBeanAdditional facturasgeneralesSessionBeanAdditional=null;
	
	public FacturasGeneralesSessionBeanAdditional getFacturasGeneralesSessionBeanAdditional() {
		return this.facturasgeneralesSessionBeanAdditional;
	}
	
	public void setFacturasGeneralesSessionBeanAdditional(FacturasGeneralesSessionBeanAdditional facturasgeneralesSessionBeanAdditional) {
		try {
			this.facturasgeneralesSessionBeanAdditional=facturasgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FacturasGeneralesSessionBean () {
		this.inicializarFacturasGeneralesSessionBean();
	}
	
	public void inicializarFacturasGeneralesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales=false;
		this.lIdFacturasGeneralesActualForeignKey=0L;
		this.lIdFacturasGeneralesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras=false;
		this.sUltimaBusquedaFacturasGenerales ="";
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
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFactura=false;
		lidTipoFacturaActual=0L; 
		
		
		
 		this.id_zona=-1L;
 		this.id_tipo_cliente=0L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cliente=-1L;
 		this.id_tipo_factura=-1L;
 		this.fecha_emision_desde=new Date();
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales= isPermiteNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales = sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasGenerales;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales= isBusquedaDesdeForeignKeySesionForeignKeyFacturasGenerales;
	}
					
	public Long getlIdFacturasGeneralesActualForeignKey() {
		return lIdFacturasGeneralesActualForeignKey;
	}

	public void setlIdFacturasGeneralesActualForeignKey(
			Long lIdFacturasGeneralesActualForeignKey) {
		this.lIdFacturasGeneralesActualForeignKey = lIdFacturasGeneralesActualForeignKey;
	}
				    
	public Long getlIdFacturasGeneralesActualForeignKeyParaPosibleAtras() {
		return lIdFacturasGeneralesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFacturasGeneralesActualForeignKeyParaPosibleAtras(
			Long lIdFacturasGeneralesActualForeignKeyParaPosibleAtras) {
		this.lIdFacturasGeneralesActualForeignKeyParaPosibleAtras = lIdFacturasGeneralesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFacturasGeneralesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFacturasGenerales() {
		return sUltimaBusquedaFacturasGenerales;
	}

	public void setsUltimaBusquedaFacturasGenerales(String sUltimaBusquedaFacturasGenerales) {
		this.sUltimaBusquedaFacturasGenerales = sUltimaBusquedaFacturasGenerales;
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
    
	public Long getid_tipo_cliente() {
		return this.id_tipo_cliente;
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
    
	public Long getid_tipo_factura() {
		return this.id_tipo_factura;
	}
    
	public Date getfecha_emision_desde() {
		return this.fecha_emision_desde;
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id");
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_zona");
					}
				}

				this.id_zona=newid_zona;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cliente(Long newid_tipo_cliente)throws Exception
	{
		try {
			if(this.id_tipo_cliente!=newid_tipo_cliente) {
				if(newid_tipo_cliente==null) {
					//newid_tipo_cliente=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_tipo_cliente");
					}
				}

				this.id_tipo_cliente=newid_tipo_cliente;
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna id_tipo_factura");
					}
				}

				this.id_tipo_factura=newid_tipo_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_desde(Date newfecha_emision_desde)throws Exception
	{
		try {
			if(this.fecha_emision_desde!=newfecha_emision_desde) {
				if(newfecha_emision_desde==null) {
					//newfecha_emision_desde=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna fecha_emision_desde");
					}
				}

				this.fecha_emision_desde=newfecha_emision_desde;
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
						System.out.println("FacturasGenerales:Valor nulo no permitido en columna fecha_emision_hasta");
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
	
	
		
	
}
