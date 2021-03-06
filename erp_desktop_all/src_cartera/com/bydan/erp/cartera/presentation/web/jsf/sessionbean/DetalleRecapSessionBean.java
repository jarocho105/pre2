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
public class DetalleRecapSessionBean  extends DetalleRecapSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap;
	protected Long lIdDetalleRecapActualForeignKey;	
	
	protected Long lIdDetalleRecapActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras;
	protected String sUltimaBusquedaDetalleRecap;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionRecap;
	Long lidRecapActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleCliente;
	Long lidDetalleClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	
	private Long id;
	private Long id_recap;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_detalle_cliente;
	private Long id_cliente;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleRecapSessionBeanAdditional detallerecapSessionBeanAdditional=null;
	
	public DetalleRecapSessionBeanAdditional getDetalleRecapSessionBeanAdditional() {
		return this.detallerecapSessionBeanAdditional;
	}
	
	public void setDetalleRecapSessionBeanAdditional(DetalleRecapSessionBeanAdditional detallerecapSessionBeanAdditional) {
		try {
			this.detallerecapSessionBeanAdditional=detallerecapSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleRecapSessionBean () {
		this.inicializarDetalleRecapSessionBean();
	}
	
	public void inicializarDetalleRecapSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap=false;
		this.lIdDetalleRecapActualForeignKey=0L;
		this.lIdDetalleRecapActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleRecap ="";
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
		
		
		isBusquedaDesdeForeignKeySesionRecap=false;
		lidRecapActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleCliente=false;
		lidDetalleClienteActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L; 
		
		
		
 		this.id_recap=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_detalle_cliente=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap= isPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap= isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap;
	}
					
	public Long getlIdDetalleRecapActualForeignKey() {
		return lIdDetalleRecapActualForeignKey;
	}

	public void setlIdDetalleRecapActualForeignKey(
			Long lIdDetalleRecapActualForeignKey) {
		this.lIdDetalleRecapActualForeignKey = lIdDetalleRecapActualForeignKey;
	}
				    
	public Long getlIdDetalleRecapActualForeignKeyParaPosibleAtras() {
		return lIdDetalleRecapActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleRecapActualForeignKeyParaPosibleAtras(
			Long lIdDetalleRecapActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleRecapActualForeignKeyParaPosibleAtras = lIdDetalleRecapActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleRecapParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleRecap() {
		return sUltimaBusquedaDetalleRecap;
	}

	public void setsUltimaBusquedaDetalleRecap(String sUltimaBusquedaDetalleRecap) {
		this.sUltimaBusquedaDetalleRecap = sUltimaBusquedaDetalleRecap;
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
    
	public Long getid_recap() {
		return this.id_recap;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_detalle_cliente() {
		return this.id_detalle_cliente;
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
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_recap(Long newid_recap)throws Exception
	{
		try {
			if(this.id_recap!=newid_recap) {
				if(newid_recap==null) {
					//newid_recap=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_recap");
					}
				}

				this.id_recap=newid_recap;
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
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_cliente(Long newid_detalle_cliente)throws Exception
	{
		try {
			if(this.id_detalle_cliente!=newid_detalle_cliente) {
				if(newid_detalle_cliente==null) {
					//newid_detalle_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_detalle_cliente");
					}
				}

				this.id_detalle_cliente=newid_detalle_cliente;
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
						System.out.println("DetalleRecap:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionRecap() {
		return isBusquedaDesdeForeignKeySesionRecap;
	}

	public void setisBusquedaDesdeForeignKeySesionRecap(
		Boolean isBusquedaDesdeForeignKeySesionRecap) {
		this.isBusquedaDesdeForeignKeySesionRecap = isBusquedaDesdeForeignKeySesionRecap;
	}

	public Long getlidRecapActual() {
		return lidRecapActual;
	}

	public void setlidRecapActual(Long lidRecapActual) {
		this.lidRecapActual = lidRecapActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleCliente() {
		return isBusquedaDesdeForeignKeySesionDetalleCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleCliente(
		Boolean isBusquedaDesdeForeignKeySesionDetalleCliente) {
		this.isBusquedaDesdeForeignKeySesionDetalleCliente = isBusquedaDesdeForeignKeySesionDetalleCliente;
	}

	public Long getlidDetalleClienteActual() {
		return lidDetalleClienteActual;
	}

	public void setlidDetalleClienteActual(Long lidDetalleClienteActual) {
		this.lidDetalleClienteActual = lidDetalleClienteActual;
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
