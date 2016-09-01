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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class DetalleMensajeCorreoInvenSessionBean  extends DetalleMensajeCorreoInvenSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven;
	protected Long lIdDetalleMensajeCorreoInvenActualForeignKey;	
	
	protected Long lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras;
	protected String sUltimaBusquedaDetalleMensajeCorreoInven;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionMensajeCorreoInven;
	Long lidMensajeCorreoInvenActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_mensaje_correo_inven;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_usuario;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleMensajeCorreoInvenSessionBeanAdditional detallemensajecorreoinvenSessionBeanAdditional=null;
	
	public DetalleMensajeCorreoInvenSessionBeanAdditional getDetalleMensajeCorreoInvenSessionBeanAdditional() {
		return this.detallemensajecorreoinvenSessionBeanAdditional;
	}
	
	public void setDetalleMensajeCorreoInvenSessionBeanAdditional(DetalleMensajeCorreoInvenSessionBeanAdditional detallemensajecorreoinvenSessionBeanAdditional) {
		try {
			this.detallemensajecorreoinvenSessionBeanAdditional=detallemensajecorreoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleMensajeCorreoInvenSessionBean () {
		this.inicializarDetalleMensajeCorreoInvenSessionBean();
	}
	
	public void inicializarDetalleMensajeCorreoInvenSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven=false;
		this.lIdDetalleMensajeCorreoInvenActualForeignKey=0L;
		this.lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleMensajeCorreoInven ="";
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
		
		
		isBusquedaDesdeForeignKeySesionMensajeCorreoInven=false;
		lidMensajeCorreoInvenActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_mensaje_correo_inven=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=-1L;
 		this.id_usuario=-1L;
 		this.id_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven= isPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven= isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInven;
	}
					
	public Long getlIdDetalleMensajeCorreoInvenActualForeignKey() {
		return lIdDetalleMensajeCorreoInvenActualForeignKey;
	}

	public void setlIdDetalleMensajeCorreoInvenActualForeignKey(
			Long lIdDetalleMensajeCorreoInvenActualForeignKey) {
		this.lIdDetalleMensajeCorreoInvenActualForeignKey = lIdDetalleMensajeCorreoInvenActualForeignKey;
	}
				    
	public Long getlIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras() {
		return lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras(
			Long lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras = lIdDetalleMensajeCorreoInvenActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleMensajeCorreoInvenParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleMensajeCorreoInven() {
		return sUltimaBusquedaDetalleMensajeCorreoInven;
	}

	public void setsUltimaBusquedaDetalleMensajeCorreoInven(String sUltimaBusquedaDetalleMensajeCorreoInven) {
		this.sUltimaBusquedaDetalleMensajeCorreoInven = sUltimaBusquedaDetalleMensajeCorreoInven;
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
    
	public Long getid_mensaje_correo_inven() {
		return this.id_mensaje_correo_inven;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mensaje_correo_inven(Long newid_mensaje_correo_inven)throws Exception
	{
		try {
			if(this.id_mensaje_correo_inven!=newid_mensaje_correo_inven) {
				if(newid_mensaje_correo_inven==null) {
					//newid_mensaje_correo_inven=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_mensaje_correo_inven");
					}
				}

				this.id_mensaje_correo_inven=newid_mensaje_correo_inven;
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
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleMensajeCorreoInven:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionMensajeCorreoInven() {
		return isBusquedaDesdeForeignKeySesionMensajeCorreoInven;
	}

	public void setisBusquedaDesdeForeignKeySesionMensajeCorreoInven(
		Boolean isBusquedaDesdeForeignKeySesionMensajeCorreoInven) {
		this.isBusquedaDesdeForeignKeySesionMensajeCorreoInven = isBusquedaDesdeForeignKeySesionMensajeCorreoInven;
	}

	public Long getlidMensajeCorreoInvenActual() {
		return lidMensajeCorreoInvenActual;
	}

	public void setlidMensajeCorreoInvenActual(Long lidMensajeCorreoInvenActual) {
		this.lidMensajeCorreoInvenActual = lidMensajeCorreoInvenActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	
	
		
	
}
