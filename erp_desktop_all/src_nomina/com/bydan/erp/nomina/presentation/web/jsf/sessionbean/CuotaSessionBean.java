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
public class CuotaSessionBean  extends CuotaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuota;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuota;
	protected Long lIdCuotaActualForeignKey;	
	
	protected Long lIdCuotaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras;
	protected String sUltimaBusquedaCuota;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPrestamo;
	Long lidPrestamoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCuota;
	Long lidEstadoCuotaActual;
	Boolean isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado;
	Long lidDefiProvisionEmpleadoActual;
	
	private Long id;
	private Long id_prestamo;
	private Long id_estado_cuota;
	private Long id_defi_provision_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuotaSessionBeanAdditional cuotaSessionBeanAdditional=null;
	
	public CuotaSessionBeanAdditional getCuotaSessionBeanAdditional() {
		return this.cuotaSessionBeanAdditional;
	}
	
	public void setCuotaSessionBeanAdditional(CuotaSessionBeanAdditional cuotaSessionBeanAdditional) {
		try {
			this.cuotaSessionBeanAdditional=cuotaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuotaSessionBean () {
		this.inicializarCuotaSessionBean();
	}
	
	public void inicializarCuotaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuota=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuota=false;
		this.lIdCuotaActualForeignKey=0L;
		this.lIdCuotaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras=false;
		this.sUltimaBusquedaCuota ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPrestamo=false;
		lidPrestamoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCuota=false;
		lidEstadoCuotaActual=0L;
		isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado=false;
		lidDefiProvisionEmpleadoActual=0L; 
		
		
		
 		this.id_prestamo=-1L;
 		this.id_estado_cuota=-1L;
 		this.id_defi_provision_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuota() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuota;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuota(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuota) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuota= isPermiteNavegacionHaciaForeignKeyDesdeCuota;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuota() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuota(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuota;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuota() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuota;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuota(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuota) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuota= isBusquedaDesdeForeignKeySesionForeignKeyCuota;
	}
					
	public Long getlIdCuotaActualForeignKey() {
		return lIdCuotaActualForeignKey;
	}

	public void setlIdCuotaActualForeignKey(
			Long lIdCuotaActualForeignKey) {
		this.lIdCuotaActualForeignKey = lIdCuotaActualForeignKey;
	}
				    
	public Long getlIdCuotaActualForeignKeyParaPosibleAtras() {
		return lIdCuotaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuotaActualForeignKeyParaPosibleAtras(
			Long lIdCuotaActualForeignKeyParaPosibleAtras) {
		this.lIdCuotaActualForeignKeyParaPosibleAtras = lIdCuotaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuotaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuota() {
		return sUltimaBusquedaCuota;
	}

	public void setsUltimaBusquedaCuota(String sUltimaBusquedaCuota) {
		this.sUltimaBusquedaCuota = sUltimaBusquedaCuota;
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
    
	public Long getid_prestamo() {
		return this.id_prestamo;
	}
    
	public Long getid_estado_cuota() {
		return this.id_estado_cuota;
	}
    
	public Long getid_defi_provision_empleado() {
		return this.id_defi_provision_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cuota:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_prestamo(Long newid_prestamo)throws Exception
	{
		try {
			if(this.id_prestamo!=newid_prestamo) {
				if(newid_prestamo==null) {
					//newid_prestamo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cuota:Valor nulo no permitido en columna id_prestamo");
					}
				}

				this.id_prestamo=newid_prestamo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_cuota(Long newid_estado_cuota)throws Exception
	{
		try {
			if(this.id_estado_cuota!=newid_estado_cuota) {
				if(newid_estado_cuota==null) {
					//newid_estado_cuota=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cuota:Valor nulo no permitido en columna id_estado_cuota");
					}
				}

				this.id_estado_cuota=newid_estado_cuota;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_defi_provision_empleado(Long newid_defi_provision_empleado)throws Exception
	{
		try {
			if(this.id_defi_provision_empleado!=newid_defi_provision_empleado) {
				if(newid_defi_provision_empleado==null) {
					//newid_defi_provision_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cuota:Valor nulo no permitido en columna id_defi_provision_empleado");
					}
				}

				this.id_defi_provision_empleado=newid_defi_provision_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPrestamo() {
		return isBusquedaDesdeForeignKeySesionPrestamo;
	}

	public void setisBusquedaDesdeForeignKeySesionPrestamo(
		Boolean isBusquedaDesdeForeignKeySesionPrestamo) {
		this.isBusquedaDesdeForeignKeySesionPrestamo = isBusquedaDesdeForeignKeySesionPrestamo;
	}

	public Long getlidPrestamoActual() {
		return lidPrestamoActual;
	}

	public void setlidPrestamoActual(Long lidPrestamoActual) {
		this.lidPrestamoActual = lidPrestamoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCuota() {
		return isBusquedaDesdeForeignKeySesionEstadoCuota;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCuota(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCuota) {
		this.isBusquedaDesdeForeignKeySesionEstadoCuota = isBusquedaDesdeForeignKeySesionEstadoCuota;
	}

	public Long getlidEstadoCuotaActual() {
		return lidEstadoCuotaActual;
	}

	public void setlidEstadoCuotaActual(Long lidEstadoCuotaActual) {
		this.lidEstadoCuotaActual = lidEstadoCuotaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado() {
		return isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado = isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado;
	}

	public Long getlidDefiProvisionEmpleadoActual() {
		return lidDefiProvisionEmpleadoActual;
	}

	public void setlidDefiProvisionEmpleadoActual(Long lidDefiProvisionEmpleadoActual) {
		this.lidDefiProvisionEmpleadoActual = lidDefiProvisionEmpleadoActual;
	}
	
	
		
	
}
