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
public class AsistenciaPorCentroCostoSessionBean  extends AsistenciaPorCentroCostoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto;
	protected Long lIdAsistenciaPorCentroCostoActualForeignKey;	
	
	protected Long lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras;
	protected String sUltimaBusquedaAsistenciaPorCentroCosto;
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
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_centro_costo;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AsistenciaPorCentroCostoSessionBeanAdditional asistenciaporcentrocostoSessionBeanAdditional=null;
	
	public AsistenciaPorCentroCostoSessionBeanAdditional getAsistenciaPorCentroCostoSessionBeanAdditional() {
		return this.asistenciaporcentrocostoSessionBeanAdditional;
	}
	
	public void setAsistenciaPorCentroCostoSessionBeanAdditional(AsistenciaPorCentroCostoSessionBeanAdditional asistenciaporcentrocostoSessionBeanAdditional) {
		try {
			this.asistenciaporcentrocostoSessionBeanAdditional=asistenciaporcentrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AsistenciaPorCentroCostoSessionBean () {
		this.inicializarAsistenciaPorCentroCostoSessionBean();
	}
	
	public void inicializarAsistenciaPorCentroCostoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto=false;
		this.lIdAsistenciaPorCentroCostoActualForeignKey=0L;
		this.lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras=false;
		this.sUltimaBusquedaAsistenciaPorCentroCosto ="";
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
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_centro_costo=null;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto= isPermiteNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto = sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaPorCentroCosto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto= isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCosto;
	}
					
	public Long getlIdAsistenciaPorCentroCostoActualForeignKey() {
		return lIdAsistenciaPorCentroCostoActualForeignKey;
	}

	public void setlIdAsistenciaPorCentroCostoActualForeignKey(
			Long lIdAsistenciaPorCentroCostoActualForeignKey) {
		this.lIdAsistenciaPorCentroCostoActualForeignKey = lIdAsistenciaPorCentroCostoActualForeignKey;
	}
				    
	public Long getlIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras() {
		return lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras(
			Long lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras) {
		this.lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras = lIdAsistenciaPorCentroCostoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaPorCentroCostoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAsistenciaPorCentroCosto() {
		return sUltimaBusquedaAsistenciaPorCentroCosto;
	}

	public void setsUltimaBusquedaAsistenciaPorCentroCosto(String sUltimaBusquedaAsistenciaPorCentroCosto) {
		this.sUltimaBusquedaAsistenciaPorCentroCosto = sUltimaBusquedaAsistenciaPorCentroCosto;
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
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
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
						System.out.println("AsistenciaPorCentroCosto:Valor nulo no permitido en columna id");
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
						System.out.println("AsistenciaPorCentroCosto:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsistenciaPorCentroCosto:Valor nulo no permitido en columna id_empleado");
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
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
