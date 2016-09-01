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
public class CajaIngresoDetalleSessionBean  extends CajaIngresoDetalleSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle;
	protected Long lIdCajaIngresoDetalleActualForeignKey;	
	
	protected Long lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras;
	protected String sUltimaBusquedaCajaIngresoDetalle;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCajaIngreso;
	Long lidCajaIngresoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	
	private Long id;
	private Long id_caja_ingreso;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cliente;
	private Long id_factura;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CajaIngresoDetalleSessionBeanAdditional cajaingresodetalleSessionBeanAdditional=null;
	
	public CajaIngresoDetalleSessionBeanAdditional getCajaIngresoDetalleSessionBeanAdditional() {
		return this.cajaingresodetalleSessionBeanAdditional;
	}
	
	public void setCajaIngresoDetalleSessionBeanAdditional(CajaIngresoDetalleSessionBeanAdditional cajaingresodetalleSessionBeanAdditional) {
		try {
			this.cajaingresodetalleSessionBeanAdditional=cajaingresodetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CajaIngresoDetalleSessionBean () {
		this.inicializarCajaIngresoDetalleSessionBean();
	}
	
	public void inicializarCajaIngresoDetalleSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle=false;
		this.lIdCajaIngresoDetalleActualForeignKey=0L;
		this.lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras=false;
		this.sUltimaBusquedaCajaIngresoDetalle ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCajaIngreso=false;
		lidCajaIngresoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L; 
		
		
		
 		this.id_caja_ingreso=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cliente=-1L;
 		this.id_factura=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle= isPermiteNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle = sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngresoDetalle;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle= isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle;
	}
					
	public Long getlIdCajaIngresoDetalleActualForeignKey() {
		return lIdCajaIngresoDetalleActualForeignKey;
	}

	public void setlIdCajaIngresoDetalleActualForeignKey(
			Long lIdCajaIngresoDetalleActualForeignKey) {
		this.lIdCajaIngresoDetalleActualForeignKey = lIdCajaIngresoDetalleActualForeignKey;
	}
				    
	public Long getlIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras() {
		return lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras(
			Long lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras) {
		this.lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras = lIdCajaIngresoDetalleActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalleParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCajaIngresoDetalle() {
		return sUltimaBusquedaCajaIngresoDetalle;
	}

	public void setsUltimaBusquedaCajaIngresoDetalle(String sUltimaBusquedaCajaIngresoDetalle) {
		this.sUltimaBusquedaCajaIngresoDetalle = sUltimaBusquedaCajaIngresoDetalle;
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
    
	public Long getid_caja_ingreso() {
		return this.id_caja_ingreso;
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
    
	public Long getid_factura() {
		return this.id_factura;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_caja_ingreso(Long newid_caja_ingreso)throws Exception
	{
		try {
			if(this.id_caja_ingreso!=newid_caja_ingreso) {
				if(newid_caja_ingreso==null) {
					//newid_caja_ingreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id_caja_ingreso");
					}
				}

				this.id_caja_ingreso=newid_caja_ingreso;
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
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("CajaIngresoDetalle:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCajaIngreso() {
		return isBusquedaDesdeForeignKeySesionCajaIngreso;
	}

	public void setisBusquedaDesdeForeignKeySesionCajaIngreso(
		Boolean isBusquedaDesdeForeignKeySesionCajaIngreso) {
		this.isBusquedaDesdeForeignKeySesionCajaIngreso = isBusquedaDesdeForeignKeySesionCajaIngreso;
	}

	public Long getlidCajaIngresoActual() {
		return lidCajaIngresoActual;
	}

	public void setlidCajaIngresoActual(Long lidCajaIngresoActual) {
		this.lidCajaIngresoActual = lidCajaIngresoActual;
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
	
	
		
	
}
