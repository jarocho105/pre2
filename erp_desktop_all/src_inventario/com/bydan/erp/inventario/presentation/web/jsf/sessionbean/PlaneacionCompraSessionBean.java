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
public class PlaneacionCompraSessionBean  extends PlaneacionCompraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra;
	protected Long lIdPlaneacionCompraActualForeignKey;	
	
	protected Long lIdPlaneacionCompraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras;
	protected String sUltimaBusquedaPlaneacionCompra;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionMesInicio;
	Long lidMesInicioActual;
	Boolean isBusquedaDesdeForeignKeySesionMesFin;
	Long lidMesFinActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_empleado;
	private Long id_usuario;
	private Long id_formato;
	private Long id_mes_inicio;
	private Long id_mes_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PlaneacionCompraSessionBeanAdditional planeacioncompraSessionBeanAdditional=null;
	
	public PlaneacionCompraSessionBeanAdditional getPlaneacionCompraSessionBeanAdditional() {
		return this.planeacioncompraSessionBeanAdditional;
	}
	
	public void setPlaneacionCompraSessionBeanAdditional(PlaneacionCompraSessionBeanAdditional planeacioncompraSessionBeanAdditional) {
		try {
			this.planeacioncompraSessionBeanAdditional=planeacioncompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PlaneacionCompraSessionBean () {
		this.inicializarPlaneacionCompraSessionBean();
	}
	
	public void inicializarPlaneacionCompraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra=false;
		this.lIdPlaneacionCompraActualForeignKey=0L;
		this.lIdPlaneacionCompraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras=false;
		this.sUltimaBusquedaPlaneacionCompra ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionMesInicio=false;
		lidMesInicioActual=0L;
		isBusquedaDesdeForeignKeySesionMesFin=false;
		lidMesFinActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_empleado=-1L;
 		this.id_usuario=-1L;
 		this.id_formato=-1L;
 		this.id_mes_inicio=-1L;
 		this.id_mes_fin=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra= isPermiteNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra(String sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra = sNombrePaginaNavegacionHaciaForeignKeyDesdePlaneacionCompra;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra= isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra;
	}
					
	public Long getlIdPlaneacionCompraActualForeignKey() {
		return lIdPlaneacionCompraActualForeignKey;
	}

	public void setlIdPlaneacionCompraActualForeignKey(
			Long lIdPlaneacionCompraActualForeignKey) {
		this.lIdPlaneacionCompraActualForeignKey = lIdPlaneacionCompraActualForeignKey;
	}
				    
	public Long getlIdPlaneacionCompraActualForeignKeyParaPosibleAtras() {
		return lIdPlaneacionCompraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPlaneacionCompraActualForeignKeyParaPosibleAtras(
			Long lIdPlaneacionCompraActualForeignKeyParaPosibleAtras) {
		this.lIdPlaneacionCompraActualForeignKeyParaPosibleAtras = lIdPlaneacionCompraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPlaneacionCompra() {
		return sUltimaBusquedaPlaneacionCompra;
	}

	public void setsUltimaBusquedaPlaneacionCompra(String sUltimaBusquedaPlaneacionCompra) {
		this.sUltimaBusquedaPlaneacionCompra = sUltimaBusquedaPlaneacionCompra;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_mes_inicio() {
		return this.id_mes_inicio;
	}
    
	public Long getid_mes_fin() {
		return this.id_mes_fin;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id");
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
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_inicio(Long newid_mes_inicio)throws Exception
	{
		try {
			if(this.id_mes_inicio!=newid_mes_inicio) {
				if(newid_mes_inicio==null) {
					//newid_mes_inicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_mes_inicio");
					}
				}

				this.id_mes_inicio=newid_mes_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_fin(Long newid_mes_fin)throws Exception
	{
		try {
			if(this.id_mes_fin!=newid_mes_fin) {
				if(newid_mes_fin==null) {
					//newid_mes_fin=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaneacionCompra:Valor nulo no permitido en columna id_mes_fin");
					}
				}

				this.id_mes_fin=newid_mes_fin;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesInicio() {
		return isBusquedaDesdeForeignKeySesionMesInicio;
	}

	public void setisBusquedaDesdeForeignKeySesionMesInicio(
		Boolean isBusquedaDesdeForeignKeySesionMesInicio) {
		this.isBusquedaDesdeForeignKeySesionMesInicio = isBusquedaDesdeForeignKeySesionMesInicio;
	}

	public Long getlidMesInicioActual() {
		return lidMesInicioActual;
	}

	public void setlidMesInicioActual(Long lidMesInicioActual) {
		this.lidMesInicioActual = lidMesInicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesFin() {
		return isBusquedaDesdeForeignKeySesionMesFin;
	}

	public void setisBusquedaDesdeForeignKeySesionMesFin(
		Boolean isBusquedaDesdeForeignKeySesionMesFin) {
		this.isBusquedaDesdeForeignKeySesionMesFin = isBusquedaDesdeForeignKeySesionMesFin;
	}

	public Long getlidMesFinActual() {
		return lidMesFinActual;
	}

	public void setlidMesFinActual(Long lidMesFinActual) {
		this.lidMesFinActual = lidMesFinActual;
	}
	
	
		
	
}
