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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoCierreProvisionSessionBean  extends ProcesoCierreProvisionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision;
	protected Long lIdProcesoCierreProvisionActualForeignKey;	
	
	protected Long lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras;
	protected String sUltimaBusquedaProcesoCierreProvision;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado;
	Long lidDefiProvisionEmpleadoActual;
	
	private Long id;
	private Long id_anio;
	private Long id_estructura;
	private Long id_empleado;
	private Long id_defi_provision_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoCierreProvisionSessionBeanAdditional procesocierreprovisionSessionBeanAdditional=null;
	
	public ProcesoCierreProvisionSessionBeanAdditional getProcesoCierreProvisionSessionBeanAdditional() {
		return this.procesocierreprovisionSessionBeanAdditional;
	}
	
	public void setProcesoCierreProvisionSessionBeanAdditional(ProcesoCierreProvisionSessionBeanAdditional procesocierreprovisionSessionBeanAdditional) {
		try {
			this.procesocierreprovisionSessionBeanAdditional=procesocierreprovisionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoCierreProvisionSessionBean () {
		this.inicializarProcesoCierreProvisionSessionBean();
	}
	
	public void inicializarProcesoCierreProvisionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision=false;
		this.lIdProcesoCierreProvisionActualForeignKey=0L;
		this.lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoCierreProvision ="";
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
		
		
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionDefiProvisionEmpleado=false;
		lidDefiProvisionEmpleadoActual=0L; 
		
		
		
 		this.id_anio=null;
 		this.id_estructura=-1L;
 		this.id_empleado=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision= isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreProvision;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision= isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvision;
	}
					
	public Long getlIdProcesoCierreProvisionActualForeignKey() {
		return lIdProcesoCierreProvisionActualForeignKey;
	}

	public void setlIdProcesoCierreProvisionActualForeignKey(
			Long lIdProcesoCierreProvisionActualForeignKey) {
		this.lIdProcesoCierreProvisionActualForeignKey = lIdProcesoCierreProvisionActualForeignKey;
	}
				    
	public Long getlIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras() {
		return lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras(
			Long lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras = lIdProcesoCierreProvisionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreProvisionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoCierreProvision() {
		return sUltimaBusquedaProcesoCierreProvision;
	}

	public void setsUltimaBusquedaProcesoCierreProvision(String sUltimaBusquedaProcesoCierreProvision) {
		this.sUltimaBusquedaProcesoCierreProvision = sUltimaBusquedaProcesoCierreProvision;
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
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
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
						System.out.println("ProcesoCierreProvision:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreProvision:Valor nulo no permitido en columna id_estructura");
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
						System.out.println("ProcesoCierreProvision:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
						System.out.println("ProcesoCierreProvision:Valor nulo no permitido en columna id_defi_provision_empleado");
					}
				}

				this.id_defi_provision_empleado=newid_defi_provision_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
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
