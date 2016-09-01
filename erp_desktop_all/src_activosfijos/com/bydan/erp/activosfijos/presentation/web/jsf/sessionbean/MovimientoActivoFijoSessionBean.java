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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class MovimientoActivoFijoSessionBean  extends MovimientoActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo;
	protected Long lIdMovimientoActivoFijoActualForeignKey;	
	
	protected Long lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaMovimientoActivoFijo;
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
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	Long lidEmpresaOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursalOrigen;
	Long lidSucursalOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen;
	Long lidDetalleActivoFijoOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresaDestino;
	Long lidEmpresaDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursalDestino;
	Long lidSucursalDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino;
	Long lidDetalleActivoFijoDestinoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_empresa_origen;
	private Long id_sucursal_origen;
	private Long id_detalle_activo_fijo_origen;
	private Long id_empresa_destino;
	private Long id_sucursal_destino;
	private Long id_detalle_activo_fijo_destino;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected MovimientoActivoFijoSessionBeanAdditional movimientoactivofijoSessionBeanAdditional=null;
	
	public MovimientoActivoFijoSessionBeanAdditional getMovimientoActivoFijoSessionBeanAdditional() {
		return this.movimientoactivofijoSessionBeanAdditional;
	}
	
	public void setMovimientoActivoFijoSessionBeanAdditional(MovimientoActivoFijoSessionBeanAdditional movimientoactivofijoSessionBeanAdditional) {
		try {
			this.movimientoactivofijoSessionBeanAdditional=movimientoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public MovimientoActivoFijoSessionBean () {
		this.inicializarMovimientoActivoFijoSessionBean();
	}
	
	public void inicializarMovimientoActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo=false;
		this.lIdMovimientoActivoFijoActualForeignKey=0L;
		this.lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaMovimientoActivoFijo ="";
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
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresaOrigen=false;
		lidEmpresaOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionSucursalOrigen=false;
		lidSucursalOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen=false;
		lidDetalleActivoFijoOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresaDestino=false;
		lidEmpresaDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionSucursalDestino=false;
		lidSucursalDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino=false;
		lidDetalleActivoFijoDestinoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_empresa_origen=-1L;
 		this.id_sucursal_origen=-1L;
 		this.id_detalle_activo_fijo_origen=-1L;
 		this.id_empresa_destino=-1L;
 		this.id_sucursal_destino=-1L;
 		this.id_detalle_activo_fijo_destino=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijo;
	}
					
	public Long getlIdMovimientoActivoFijoActualForeignKey() {
		return lIdMovimientoActivoFijoActualForeignKey;
	}

	public void setlIdMovimientoActivoFijoActualForeignKey(
			Long lIdMovimientoActivoFijoActualForeignKey) {
		this.lIdMovimientoActivoFijoActualForeignKey = lIdMovimientoActivoFijoActualForeignKey;
	}
				    
	public Long getlIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras = lIdMovimientoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyMovimientoActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaMovimientoActivoFijo() {
		return sUltimaBusquedaMovimientoActivoFijo;
	}

	public void setsUltimaBusquedaMovimientoActivoFijo(String sUltimaBusquedaMovimientoActivoFijo) {
		this.sUltimaBusquedaMovimientoActivoFijo = sUltimaBusquedaMovimientoActivoFijo;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_empresa_origen() {
		return this.id_empresa_origen;
	}
    
	public Long getid_sucursal_origen() {
		return this.id_sucursal_origen;
	}
    
	public Long getid_detalle_activo_fijo_origen() {
		return this.id_detalle_activo_fijo_origen;
	}
    
	public Long getid_empresa_destino() {
		return this.id_empresa_destino;
	}
    
	public Long getid_sucursal_destino() {
		return this.id_sucursal_destino;
	}
    
	public Long getid_detalle_activo_fijo_destino() {
		return this.id_detalle_activo_fijo_destino;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id");
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
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa_origen(Long newid_empresa_origen)throws Exception
	{
		try {
			if(this.id_empresa_origen!=newid_empresa_origen) {
				if(newid_empresa_origen==null) {
					//newid_empresa_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_empresa_origen");
					}
				}

				this.id_empresa_origen=newid_empresa_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal_origen(Long newid_sucursal_origen)throws Exception
	{
		try {
			if(this.id_sucursal_origen!=newid_sucursal_origen) {
				if(newid_sucursal_origen==null) {
					//newid_sucursal_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_sucursal_origen");
					}
				}

				this.id_sucursal_origen=newid_sucursal_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_activo_fijo_origen(Long newid_detalle_activo_fijo_origen)throws Exception
	{
		try {
			if(this.id_detalle_activo_fijo_origen!=newid_detalle_activo_fijo_origen) {
				if(newid_detalle_activo_fijo_origen==null) {
					//newid_detalle_activo_fijo_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_detalle_activo_fijo_origen");
					}
				}

				this.id_detalle_activo_fijo_origen=newid_detalle_activo_fijo_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa_destino(Long newid_empresa_destino)throws Exception
	{
		try {
			if(this.id_empresa_destino!=newid_empresa_destino) {
				if(newid_empresa_destino==null) {
					//newid_empresa_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_empresa_destino");
					}
				}

				this.id_empresa_destino=newid_empresa_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal_destino(Long newid_sucursal_destino)throws Exception
	{
		try {
			if(this.id_sucursal_destino!=newid_sucursal_destino) {
				if(newid_sucursal_destino==null) {
					//newid_sucursal_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_sucursal_destino");
					}
				}

				this.id_sucursal_destino=newid_sucursal_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_detalle_activo_fijo_destino(Long newid_detalle_activo_fijo_destino)throws Exception
	{
		try {
			if(this.id_detalle_activo_fijo_destino!=newid_detalle_activo_fijo_destino) {
				if(newid_detalle_activo_fijo_destino==null) {
					//newid_detalle_activo_fijo_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("MovimientoActivoFijo:Valor nulo no permitido en columna id_detalle_activo_fijo_destino");
					}
				}

				this.id_detalle_activo_fijo_destino=newid_detalle_activo_fijo_destino;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresaOrigen() {
		return isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresaOrigen(
		Boolean isBusquedaDesdeForeignKeySesionEmpresaOrigen) {
		this.isBusquedaDesdeForeignKeySesionEmpresaOrigen = isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	}

	public Long getlidEmpresaOrigenActual() {
		return lidEmpresaOrigenActual;
	}

	public void setlidEmpresaOrigenActual(Long lidEmpresaOrigenActual) {
		this.lidEmpresaOrigenActual = lidEmpresaOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSucursalOrigen() {
		return isBusquedaDesdeForeignKeySesionSucursalOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursalOrigen(
		Boolean isBusquedaDesdeForeignKeySesionSucursalOrigen) {
		this.isBusquedaDesdeForeignKeySesionSucursalOrigen = isBusquedaDesdeForeignKeySesionSucursalOrigen;
	}

	public Long getlidSucursalOrigenActual() {
		return lidSucursalOrigenActual;
	}

	public void setlidSucursalOrigenActual(Long lidSucursalOrigenActual) {
		this.lidSucursalOrigenActual = lidSucursalOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen() {
		return isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen(
		Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen) {
		this.isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen = isBusquedaDesdeForeignKeySesionDetalleActivoFijoOrigen;
	}

	public Long getlidDetalleActivoFijoOrigenActual() {
		return lidDetalleActivoFijoOrigenActual;
	}

	public void setlidDetalleActivoFijoOrigenActual(Long lidDetalleActivoFijoOrigenActual) {
		this.lidDetalleActivoFijoOrigenActual = lidDetalleActivoFijoOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresaDestino() {
		return isBusquedaDesdeForeignKeySesionEmpresaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresaDestino(
		Boolean isBusquedaDesdeForeignKeySesionEmpresaDestino) {
		this.isBusquedaDesdeForeignKeySesionEmpresaDestino = isBusquedaDesdeForeignKeySesionEmpresaDestino;
	}

	public Long getlidEmpresaDestinoActual() {
		return lidEmpresaDestinoActual;
	}

	public void setlidEmpresaDestinoActual(Long lidEmpresaDestinoActual) {
		this.lidEmpresaDestinoActual = lidEmpresaDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSucursalDestino() {
		return isBusquedaDesdeForeignKeySesionSucursalDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursalDestino(
		Boolean isBusquedaDesdeForeignKeySesionSucursalDestino) {
		this.isBusquedaDesdeForeignKeySesionSucursalDestino = isBusquedaDesdeForeignKeySesionSucursalDestino;
	}

	public Long getlidSucursalDestinoActual() {
		return lidSucursalDestinoActual;
	}

	public void setlidSucursalDestinoActual(Long lidSucursalDestinoActual) {
		this.lidSucursalDestinoActual = lidSucursalDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino() {
		return isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino(
		Boolean isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino) {
		this.isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino = isBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino;
	}

	public Long getlidDetalleActivoFijoDestinoActual() {
		return lidDetalleActivoFijoDestinoActual;
	}

	public void setlidDetalleActivoFijoDestinoActual(Long lidDetalleActivoFijoDestinoActual) {
		this.lidDetalleActivoFijoDestinoActual = lidDetalleActivoFijoDestinoActual;
	}
	
	
		
	
}
