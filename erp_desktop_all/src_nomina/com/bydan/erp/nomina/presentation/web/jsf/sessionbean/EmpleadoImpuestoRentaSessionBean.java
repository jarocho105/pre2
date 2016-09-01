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
public class EmpleadoImpuestoRentaSessionBean  extends EmpleadoImpuestoRentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta;
	protected Long lIdEmpleadoImpuestoRentaActualForeignKey;	
	
	protected Long lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras;
	protected String sUltimaBusquedaEmpleadoImpuestoRenta;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_anio;
	private Long id_mes;
	private Long id_estructura;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoImpuestoRentaSessionBeanAdditional empleadoimpuestorentaSessionBeanAdditional=null;
	
	public EmpleadoImpuestoRentaSessionBeanAdditional getEmpleadoImpuestoRentaSessionBeanAdditional() {
		return this.empleadoimpuestorentaSessionBeanAdditional;
	}
	
	public void setEmpleadoImpuestoRentaSessionBeanAdditional(EmpleadoImpuestoRentaSessionBeanAdditional empleadoimpuestorentaSessionBeanAdditional) {
		try {
			this.empleadoimpuestorentaSessionBeanAdditional=empleadoimpuestorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoImpuestoRentaSessionBean () {
		this.inicializarEmpleadoImpuestoRentaSessionBean();
	}
	
	public void inicializarEmpleadoImpuestoRentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta=false;
		this.lIdEmpleadoImpuestoRentaActualForeignKey=0L;
		this.lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleadoImpuestoRenta ="";
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
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_estructura=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta= isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoImpuestoRenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta= isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRenta;
	}
					
	public Long getlIdEmpleadoImpuestoRentaActualForeignKey() {
		return lIdEmpleadoImpuestoRentaActualForeignKey;
	}

	public void setlIdEmpleadoImpuestoRentaActualForeignKey(
			Long lIdEmpleadoImpuestoRentaActualForeignKey) {
		this.lIdEmpleadoImpuestoRentaActualForeignKey = lIdEmpleadoImpuestoRentaActualForeignKey;
	}
				    
	public Long getlIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras = lIdEmpleadoImpuestoRentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoImpuestoRentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleadoImpuestoRenta() {
		return sUltimaBusquedaEmpleadoImpuestoRenta;
	}

	public void setsUltimaBusquedaEmpleadoImpuestoRenta(String sUltimaBusquedaEmpleadoImpuestoRenta) {
		this.sUltimaBusquedaEmpleadoImpuestoRenta = sUltimaBusquedaEmpleadoImpuestoRenta;
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
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoImpuestoRenta:Valor nulo no permitido en columna id");
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
						System.out.println("EmpleadoImpuestoRenta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("EmpleadoImpuestoRenta:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoImpuestoRenta:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
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
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
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
	
	
		
	
}
