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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class FacturaImpresionSessionBean  extends FacturaImpresionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion;
	protected Long lIdFacturaImpresionActualForeignKey;	
	
	protected Long lIdFacturaImpresionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras;
	protected String sUltimaBusquedaFacturaImpresion;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoFactuImpre;
	Long lidEstadoFactuImpreActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_factura;
	private Long id_estado_factu_impre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FacturaImpresionSessionBeanAdditional facturaimpresionSessionBeanAdditional=null;
	
	public FacturaImpresionSessionBeanAdditional getFacturaImpresionSessionBeanAdditional() {
		return this.facturaimpresionSessionBeanAdditional;
	}
	
	public void setFacturaImpresionSessionBeanAdditional(FacturaImpresionSessionBeanAdditional facturaimpresionSessionBeanAdditional) {
		try {
			this.facturaimpresionSessionBeanAdditional=facturaimpresionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FacturaImpresionSessionBean () {
		this.inicializarFacturaImpresionSessionBean();
	}
	
	public void inicializarFacturaImpresionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion=false;
		this.lIdFacturaImpresionActualForeignKey=0L;
		this.lIdFacturaImpresionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras=false;
		this.sUltimaBusquedaFacturaImpresion ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoFactuImpre=false;
		lidEstadoFactuImpreActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_factura=-1L;
 		this.id_estado_factu_impre=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion= isPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion = sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion= isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion;
	}
					
	public Long getlIdFacturaImpresionActualForeignKey() {
		return lIdFacturaImpresionActualForeignKey;
	}

	public void setlIdFacturaImpresionActualForeignKey(
			Long lIdFacturaImpresionActualForeignKey) {
		this.lIdFacturaImpresionActualForeignKey = lIdFacturaImpresionActualForeignKey;
	}
				    
	public Long getlIdFacturaImpresionActualForeignKeyParaPosibleAtras() {
		return lIdFacturaImpresionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFacturaImpresionActualForeignKeyParaPosibleAtras(
			Long lIdFacturaImpresionActualForeignKeyParaPosibleAtras) {
		this.lIdFacturaImpresionActualForeignKeyParaPosibleAtras = lIdFacturaImpresionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFacturaImpresion() {
		return sUltimaBusquedaFacturaImpresion;
	}

	public void setsUltimaBusquedaFacturaImpresion(String sUltimaBusquedaFacturaImpresion) {
		this.sUltimaBusquedaFacturaImpresion = sUltimaBusquedaFacturaImpresion;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_estado_factu_impre() {
		return this.id_estado_factu_impre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaImpresion:Valor nulo no permitido en columna id");
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
						System.out.println("FacturaImpresion:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FacturaImpresion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("FacturaImpresion:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_factu_impre(Long newid_estado_factu_impre)throws Exception
	{
		try {
			if(this.id_estado_factu_impre!=newid_estado_factu_impre) {
				if(newid_estado_factu_impre==null) {
					//newid_estado_factu_impre=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaImpresion:Valor nulo no permitido en columna id_estado_factu_impre");
					}
				}

				this.id_estado_factu_impre=newid_estado_factu_impre;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoFactuImpre() {
		return isBusquedaDesdeForeignKeySesionEstadoFactuImpre;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoFactuImpre(
		Boolean isBusquedaDesdeForeignKeySesionEstadoFactuImpre) {
		this.isBusquedaDesdeForeignKeySesionEstadoFactuImpre = isBusquedaDesdeForeignKeySesionEstadoFactuImpre;
	}

	public Long getlidEstadoFactuImpreActual() {
		return lidEstadoFactuImpreActual;
	}

	public void setlidEstadoFactuImpreActual(Long lidEstadoFactuImpreActual) {
		this.lidEstadoFactuImpreActual = lidEstadoFactuImpreActual;
	}
	
	
		
	
}
