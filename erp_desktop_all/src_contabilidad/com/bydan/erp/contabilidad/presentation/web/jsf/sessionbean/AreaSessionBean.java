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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class AreaSessionBean  extends AreaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeArea;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeArea;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyArea;
	protected Long lIdAreaActualForeignKey;	
	
	protected Long lIdAreaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras;
	protected String sUltimaBusquedaArea;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpleadoSustituto;
	Long lidEmpleadoSustitutoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_empleado_sustituto;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AreaSessionBeanAdditional areaSessionBeanAdditional=null;
	
	public AreaSessionBeanAdditional getAreaSessionBeanAdditional() {
		return this.areaSessionBeanAdditional;
	}
	
	public void setAreaSessionBeanAdditional(AreaSessionBeanAdditional areaSessionBeanAdditional) {
		try {
			this.areaSessionBeanAdditional=areaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AreaSessionBean () {
		this.inicializarAreaSessionBean();
	}
	
	public void inicializarAreaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeArea=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeArea="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyArea=false;
		this.lIdAreaActualForeignKey=0L;
		this.lIdAreaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras=false;
		this.sUltimaBusquedaArea ="";
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
		isBusquedaDesdeForeignKeySesionEmpleadoSustituto=false;
		lidEmpleadoSustitutoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_empleado_sustituto=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeArea() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeArea;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeArea(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeArea) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeArea= isPermiteNavegacionHaciaForeignKeyDesdeArea;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeArea() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeArea;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeArea(String sNombrePaginaNavegacionHaciaForeignKeyDesdeArea) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeArea = sNombrePaginaNavegacionHaciaForeignKeyDesdeArea;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyArea() {
		return isBusquedaDesdeForeignKeySesionForeignKeyArea;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyArea(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyArea) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyArea= isBusquedaDesdeForeignKeySesionForeignKeyArea;
	}
					
	public Long getlIdAreaActualForeignKey() {
		return lIdAreaActualForeignKey;
	}

	public void setlIdAreaActualForeignKey(
			Long lIdAreaActualForeignKey) {
		this.lIdAreaActualForeignKey = lIdAreaActualForeignKey;
	}
				    
	public Long getlIdAreaActualForeignKeyParaPosibleAtras() {
		return lIdAreaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAreaActualForeignKeyParaPosibleAtras(
			Long lIdAreaActualForeignKeyParaPosibleAtras) {
		this.lIdAreaActualForeignKeyParaPosibleAtras = lIdAreaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAreaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaArea() {
		return sUltimaBusquedaArea;
	}

	public void setsUltimaBusquedaArea(String sUltimaBusquedaArea) {
		this.sUltimaBusquedaArea = sUltimaBusquedaArea;
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
    
	public Long getid_empleado_sustituto() {
		return this.id_empleado_sustituto;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Area:Valor nulo no permitido en columna id");
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
						System.out.println("Area:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Area:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado_sustituto(Long newid_empleado_sustituto)throws Exception
	{
		try {
			if(this.id_empleado_sustituto!=newid_empleado_sustituto) {
				if(newid_empleado_sustituto==null) {
					//newid_empleado_sustituto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Area:Valor nulo no permitido en columna id_empleado_sustituto");
					}
				}

				this.id_empleado_sustituto=newid_empleado_sustituto;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleadoSustituto() {
		return isBusquedaDesdeForeignKeySesionEmpleadoSustituto;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleadoSustituto(
		Boolean isBusquedaDesdeForeignKeySesionEmpleadoSustituto) {
		this.isBusquedaDesdeForeignKeySesionEmpleadoSustituto = isBusquedaDesdeForeignKeySesionEmpleadoSustituto;
	}

	public Long getlidEmpleadoSustitutoActual() {
		return lidEmpleadoSustitutoActual;
	}

	public void setlidEmpleadoSustitutoActual(Long lidEmpleadoSustitutoActual) {
		this.lidEmpleadoSustitutoActual = lidEmpleadoSustitutoActual;
	}
	
	
		
	
}
