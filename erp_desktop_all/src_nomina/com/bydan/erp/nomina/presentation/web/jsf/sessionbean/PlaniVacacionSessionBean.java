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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class PlaniVacacionSessionBean  extends PlaniVacacionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion;
	protected Long lIdPlaniVacacionActualForeignKey;	
	
	protected Long lIdPlaniVacacionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras;
	protected String sUltimaBusquedaPlaniVacacion;
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
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	Long lidEstructuraSeccionActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructuraCargo;
	Long lidEstructuraCargoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estructura;
	private Long id_estructura_seccion;
	private Long id_estructura_cargo;
	private Long id_empleado;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PlaniVacacionSessionBeanAdditional planivacacionSessionBeanAdditional=null;
	
	public PlaniVacacionSessionBeanAdditional getPlaniVacacionSessionBeanAdditional() {
		return this.planivacacionSessionBeanAdditional;
	}
	
	public void setPlaniVacacionSessionBeanAdditional(PlaniVacacionSessionBeanAdditional planivacacionSessionBeanAdditional) {
		try {
			this.planivacacionSessionBeanAdditional=planivacacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PlaniVacacionSessionBean () {
		this.inicializarPlaniVacacionSessionBean();
	}
	
	public void inicializarPlaniVacacionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion=false;
		this.lIdPlaniVacacionActualForeignKey=0L;
		this.lIdPlaniVacacionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras=false;
		this.sUltimaBusquedaPlaniVacacion ="";
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
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEstructuraSeccion=false;
		lidEstructuraSeccionActual=0L;
		isBusquedaDesdeForeignKeySesionEstructuraCargo=false;
		lidEstructuraCargoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estructura=-1L;
 		this.id_estructura_seccion=-1L;
 		this.id_estructura_cargo=-1L;
 		this.id_empleado=-1L;
 		this.id_mes=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion= isPermiteNavegacionHaciaForeignKeyDesdePlaniVacacion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion(String sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion = sNombrePaginaNavegacionHaciaForeignKeyDesdePlaniVacacion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion= isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacion;
	}
					
	public Long getlIdPlaniVacacionActualForeignKey() {
		return lIdPlaniVacacionActualForeignKey;
	}

	public void setlIdPlaniVacacionActualForeignKey(
			Long lIdPlaniVacacionActualForeignKey) {
		this.lIdPlaniVacacionActualForeignKey = lIdPlaniVacacionActualForeignKey;
	}
				    
	public Long getlIdPlaniVacacionActualForeignKeyParaPosibleAtras() {
		return lIdPlaniVacacionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPlaniVacacionActualForeignKeyParaPosibleAtras(
			Long lIdPlaniVacacionActualForeignKeyParaPosibleAtras) {
		this.lIdPlaniVacacionActualForeignKeyParaPosibleAtras = lIdPlaniVacacionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPlaniVacacionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPlaniVacacion() {
		return sUltimaBusquedaPlaniVacacion;
	}

	public void setsUltimaBusquedaPlaniVacacion(String sUltimaBusquedaPlaniVacacion) {
		this.sUltimaBusquedaPlaniVacacion = sUltimaBusquedaPlaniVacacion;
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
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_estructura_seccion() {
		return this.id_estructura_seccion;
	}
    
	public Long getid_estructura_cargo() {
		return this.id_estructura_cargo;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id");
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
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura_seccion(Long newid_estructura_seccion)throws Exception
	{
		try {
			if(this.id_estructura_seccion!=newid_estructura_seccion) {
				if(newid_estructura_seccion==null) {
					//newid_estructura_seccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_estructura_seccion");
					}
				}

				this.id_estructura_seccion=newid_estructura_seccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura_cargo(Long newid_estructura_cargo)throws Exception
	{
		try {
			if(this.id_estructura_cargo!=newid_estructura_cargo) {
				if(newid_estructura_cargo==null) {
					//newid_estructura_cargo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_estructura_cargo");
					}
				}

				this.id_estructura_cargo=newid_estructura_cargo;
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
						System.out.println("PlaniVacacion:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstructura() {
		return isBusquedaDesdeForeignKeySesionEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructura(
		Boolean isBusquedaDesdeForeignKeySesionEstructura) {
		this.isBusquedaDesdeForeignKeySesionEstructura = isBusquedaDesdeForeignKeySesionEstructura;
	}

	public Long getlidEstructuraActual() {
		return lidEstructuraActual;
	}

	public void setlidEstructuraActual(Long lidEstructuraActual) {
		this.lidEstructuraActual = lidEstructuraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstructuraSeccion() {
		return isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructuraSeccion(
		Boolean isBusquedaDesdeForeignKeySesionEstructuraSeccion) {
		this.isBusquedaDesdeForeignKeySesionEstructuraSeccion = isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	}

	public Long getlidEstructuraSeccionActual() {
		return lidEstructuraSeccionActual;
	}

	public void setlidEstructuraSeccionActual(Long lidEstructuraSeccionActual) {
		this.lidEstructuraSeccionActual = lidEstructuraSeccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstructuraCargo() {
		return isBusquedaDesdeForeignKeySesionEstructuraCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructuraCargo(
		Boolean isBusquedaDesdeForeignKeySesionEstructuraCargo) {
		this.isBusquedaDesdeForeignKeySesionEstructuraCargo = isBusquedaDesdeForeignKeySesionEstructuraCargo;
	}

	public Long getlidEstructuraCargoActual() {
		return lidEstructuraCargoActual;
	}

	public void setlidEstructuraCargoActual(Long lidEstructuraCargoActual) {
		this.lidEstructuraCargoActual = lidEstructuraCargoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	
	
		
	
}
