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
public class HistorialFormaPagoPuntoVentaSessionBean  extends HistorialFormaPagoPuntoVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta;
	protected Long lIdHistorialFormaPagoPuntoVentaActualForeignKey;	
	
	protected Long lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras;
	protected String sUltimaBusquedaHistorialFormaPagoPuntoVenta;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	Long lidFacturaPuntoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	
	private Long id;
	private Long id_factura_punto_venta;
	private Long id_empresa;
	private Long id_sucursal;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected HistorialFormaPagoPuntoVentaSessionBeanAdditional historialformapagopuntoventaSessionBeanAdditional=null;
	
	public HistorialFormaPagoPuntoVentaSessionBeanAdditional getHistorialFormaPagoPuntoVentaSessionBeanAdditional() {
		return this.historialformapagopuntoventaSessionBeanAdditional;
	}
	
	public void setHistorialFormaPagoPuntoVentaSessionBeanAdditional(HistorialFormaPagoPuntoVentaSessionBeanAdditional historialformapagopuntoventaSessionBeanAdditional) {
		try {
			this.historialformapagopuntoventaSessionBeanAdditional=historialformapagopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public HistorialFormaPagoPuntoVentaSessionBean () {
		this.inicializarHistorialFormaPagoPuntoVentaSessionBean();
	}
	
	public void inicializarHistorialFormaPagoPuntoVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta=false;
		this.lIdHistorialFormaPagoPuntoVentaActualForeignKey=0L;
		this.lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras=false;
		this.sUltimaBusquedaHistorialFormaPagoPuntoVenta ="";
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
		
		
		isBusquedaDesdeForeignKeySesionFacturaPuntoVenta=false;
		lidFacturaPuntoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L; 
		
		
		
 		this.id_factura_punto_venta=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta= isPermiteNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta= isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVenta;
	}
					
	public Long getlIdHistorialFormaPagoPuntoVentaActualForeignKey() {
		return lIdHistorialFormaPagoPuntoVentaActualForeignKey;
	}

	public void setlIdHistorialFormaPagoPuntoVentaActualForeignKey(
			Long lIdHistorialFormaPagoPuntoVentaActualForeignKey) {
		this.lIdHistorialFormaPagoPuntoVentaActualForeignKey = lIdHistorialFormaPagoPuntoVentaActualForeignKey;
	}
				    
	public Long getlIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras() {
		return lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras(
			Long lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras) {
		this.lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras = lIdHistorialFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPagoPuntoVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaHistorialFormaPagoPuntoVenta() {
		return sUltimaBusquedaHistorialFormaPagoPuntoVenta;
	}

	public void setsUltimaBusquedaHistorialFormaPagoPuntoVenta(String sUltimaBusquedaHistorialFormaPagoPuntoVenta) {
		this.sUltimaBusquedaHistorialFormaPagoPuntoVenta = sUltimaBusquedaHistorialFormaPagoPuntoVenta;
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
    
	public Long getid_factura_punto_venta() {
		return this.id_factura_punto_venta;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HistorialFormaPagoPuntoVenta:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura_punto_venta(Long newid_factura_punto_venta)throws Exception
	{
		try {
			if(this.id_factura_punto_venta!=newid_factura_punto_venta) {
				if(newid_factura_punto_venta==null) {
					//newid_factura_punto_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HistorialFormaPagoPuntoVenta:Valor nulo no permitido en columna id_factura_punto_venta");
					}
				}

				this.id_factura_punto_venta=newid_factura_punto_venta;
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
						System.out.println("HistorialFormaPagoPuntoVenta:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("HistorialFormaPagoPuntoVenta:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionFacturaPuntoVenta(
		Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionFacturaPuntoVenta = isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public Long getlidFacturaPuntoVentaActual() {
		return lidFacturaPuntoVentaActual;
	}

	public void setlidFacturaPuntoVentaActual(Long lidFacturaPuntoVentaActual) {
		this.lidFacturaPuntoVentaActual = lidFacturaPuntoVentaActual;
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
	
	
		
	
}
