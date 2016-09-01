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
public class EmpleadoIdiomaSessionBean  extends EmpleadoIdiomaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma;
	protected Long lIdEmpleadoIdiomaActualForeignKey;	
	
	protected Long lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras;
	protected String sUltimaBusquedaEmpleadoIdioma;
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
	Boolean isBusquedaDesdeForeignKeySesionIdioma;
	Long lidIdiomaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_idioma;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoIdiomaSessionBeanAdditional empleadoidiomaSessionBeanAdditional=null;
	
	public EmpleadoIdiomaSessionBeanAdditional getEmpleadoIdiomaSessionBeanAdditional() {
		return this.empleadoidiomaSessionBeanAdditional;
	}
	
	public void setEmpleadoIdiomaSessionBeanAdditional(EmpleadoIdiomaSessionBeanAdditional empleadoidiomaSessionBeanAdditional) {
		try {
			this.empleadoidiomaSessionBeanAdditional=empleadoidiomaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoIdiomaSessionBean () {
		this.inicializarEmpleadoIdiomaSessionBean();
	}
	
	public void inicializarEmpleadoIdiomaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma=false;
		this.lIdEmpleadoIdiomaActualForeignKey=0L;
		this.lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleadoIdioma ="";
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
		isBusquedaDesdeForeignKeySesionIdioma=false;
		lidIdiomaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_idioma=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma= isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma= isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma;
	}
					
	public Long getlIdEmpleadoIdiomaActualForeignKey() {
		return lIdEmpleadoIdiomaActualForeignKey;
	}

	public void setlIdEmpleadoIdiomaActualForeignKey(
			Long lIdEmpleadoIdiomaActualForeignKey) {
		this.lIdEmpleadoIdiomaActualForeignKey = lIdEmpleadoIdiomaActualForeignKey;
	}
				    
	public Long getlIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras = lIdEmpleadoIdiomaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdiomaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleadoIdioma() {
		return sUltimaBusquedaEmpleadoIdioma;
	}

	public void setsUltimaBusquedaEmpleadoIdioma(String sUltimaBusquedaEmpleadoIdioma) {
		this.sUltimaBusquedaEmpleadoIdioma = sUltimaBusquedaEmpleadoIdioma;
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
    
	public Long getid_idioma() {
		return this.id_idioma;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoIdioma:Valor nulo no permitido en columna id");
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
						System.out.println("EmpleadoIdioma:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EmpleadoIdioma:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_idioma(Long newid_idioma)throws Exception
	{
		try {
			if(this.id_idioma!=newid_idioma) {
				if(newid_idioma==null) {
					//newid_idioma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoIdioma:Valor nulo no permitido en columna id_idioma");
					}
				}

				this.id_idioma=newid_idioma;
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
	public Boolean getisBusquedaDesdeForeignKeySesionIdioma() {
		return isBusquedaDesdeForeignKeySesionIdioma;
	}

	public void setisBusquedaDesdeForeignKeySesionIdioma(
		Boolean isBusquedaDesdeForeignKeySesionIdioma) {
		this.isBusquedaDesdeForeignKeySesionIdioma = isBusquedaDesdeForeignKeySesionIdioma;
	}

	public Long getlidIdiomaActual() {
		return lidIdiomaActual;
	}

	public void setlidIdiomaActual(Long lidIdiomaActual) {
		this.lidIdiomaActual = lidIdiomaActual;
	}
	
	
		
	
}
