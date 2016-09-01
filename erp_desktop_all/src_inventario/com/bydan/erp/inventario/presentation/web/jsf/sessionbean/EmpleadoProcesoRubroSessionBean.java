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
public class EmpleadoProcesoRubroSessionBean  extends EmpleadoProcesoRubroSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro;
	protected Long lIdEmpleadoProcesoRubroActualForeignKey;	
	
	protected Long lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras;
	protected String sUltimaBusquedaEmpleadoProcesoRubro;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estructura;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoProcesoRubroSessionBeanAdditional empleadoprocesorubroSessionBeanAdditional=null;
	
	public EmpleadoProcesoRubroSessionBeanAdditional getEmpleadoProcesoRubroSessionBeanAdditional() {
		return this.empleadoprocesorubroSessionBeanAdditional;
	}
	
	public void setEmpleadoProcesoRubroSessionBeanAdditional(EmpleadoProcesoRubroSessionBeanAdditional empleadoprocesorubroSessionBeanAdditional) {
		try {
			this.empleadoprocesorubroSessionBeanAdditional=empleadoprocesorubroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoProcesoRubroSessionBean () {
		this.inicializarEmpleadoProcesoRubroSessionBean();
	}
	
	public void inicializarEmpleadoProcesoRubroSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro=false;
		this.lIdEmpleadoProcesoRubroActualForeignKey=0L;
		this.lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleadoProcesoRubro ="";
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
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estructura=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro= isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoProcesoRubro;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro= isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubro;
	}
					
	public Long getlIdEmpleadoProcesoRubroActualForeignKey() {
		return lIdEmpleadoProcesoRubroActualForeignKey;
	}

	public void setlIdEmpleadoProcesoRubroActualForeignKey(
			Long lIdEmpleadoProcesoRubroActualForeignKey) {
		this.lIdEmpleadoProcesoRubroActualForeignKey = lIdEmpleadoProcesoRubroActualForeignKey;
	}
				    
	public Long getlIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras = lIdEmpleadoProcesoRubroActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoProcesoRubroParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleadoProcesoRubro() {
		return sUltimaBusquedaEmpleadoProcesoRubro;
	}

	public void setsUltimaBusquedaEmpleadoProcesoRubro(String sUltimaBusquedaEmpleadoProcesoRubro) {
		this.sUltimaBusquedaEmpleadoProcesoRubro = sUltimaBusquedaEmpleadoProcesoRubro;
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
						System.out.println("EmpleadoProcesoRubro:Valor nulo no permitido en columna id");
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
						System.out.println("EmpleadoProcesoRubro:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EmpleadoProcesoRubro:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("EmpleadoProcesoRubro:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
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
						System.out.println("EmpleadoProcesoRubro:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
