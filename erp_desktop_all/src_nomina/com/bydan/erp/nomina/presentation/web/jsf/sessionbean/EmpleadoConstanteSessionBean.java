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
public class EmpleadoConstanteSessionBean  extends EmpleadoConstanteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante;
	protected Long lIdEmpleadoConstanteActualForeignKey;	
	
	protected Long lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras;
	protected String sUltimaBusquedaEmpleadoConstante;
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
	Boolean isBusquedaDesdeForeignKeySesionConstanteNomi;
	Long lidConstanteNomiActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_constante_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoConstanteSessionBeanAdditional empleadoconstanteSessionBeanAdditional=null;
	
	public EmpleadoConstanteSessionBeanAdditional getEmpleadoConstanteSessionBeanAdditional() {
		return this.empleadoconstanteSessionBeanAdditional;
	}
	
	public void setEmpleadoConstanteSessionBeanAdditional(EmpleadoConstanteSessionBeanAdditional empleadoconstanteSessionBeanAdditional) {
		try {
			this.empleadoconstanteSessionBeanAdditional=empleadoconstanteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoConstanteSessionBean () {
		this.inicializarEmpleadoConstanteSessionBean();
	}
	
	public void inicializarEmpleadoConstanteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante=false;
		this.lIdEmpleadoConstanteActualForeignKey=0L;
		this.lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleadoConstante ="";
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
		isBusquedaDesdeForeignKeySesionConstanteNomi=false;
		lidConstanteNomiActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_constante_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante= isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante= isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstante;
	}
					
	public Long getlIdEmpleadoConstanteActualForeignKey() {
		return lIdEmpleadoConstanteActualForeignKey;
	}

	public void setlIdEmpleadoConstanteActualForeignKey(
			Long lIdEmpleadoConstanteActualForeignKey) {
		this.lIdEmpleadoConstanteActualForeignKey = lIdEmpleadoConstanteActualForeignKey;
	}
				    
	public Long getlIdEmpleadoConstanteActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoConstanteActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras = lIdEmpleadoConstanteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoConstanteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleadoConstante() {
		return sUltimaBusquedaEmpleadoConstante;
	}

	public void setsUltimaBusquedaEmpleadoConstante(String sUltimaBusquedaEmpleadoConstante) {
		this.sUltimaBusquedaEmpleadoConstante = sUltimaBusquedaEmpleadoConstante;
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
    
	public Long getid_constante_nomi() {
		return this.id_constante_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoConstante:Valor nulo no permitido en columna id");
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
						System.out.println("EmpleadoConstante:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EmpleadoConstante:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_constante_nomi(Long newid_constante_nomi)throws Exception
	{
		try {
			if(this.id_constante_nomi!=newid_constante_nomi) {
				if(newid_constante_nomi==null) {
					//newid_constante_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoConstante:Valor nulo no permitido en columna id_constante_nomi");
					}
				}

				this.id_constante_nomi=newid_constante_nomi;
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
	public Boolean getisBusquedaDesdeForeignKeySesionConstanteNomi() {
		return isBusquedaDesdeForeignKeySesionConstanteNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionConstanteNomi(
		Boolean isBusquedaDesdeForeignKeySesionConstanteNomi) {
		this.isBusquedaDesdeForeignKeySesionConstanteNomi = isBusquedaDesdeForeignKeySesionConstanteNomi;
	}

	public Long getlidConstanteNomiActual() {
		return lidConstanteNomiActual;
	}

	public void setlidConstanteNomiActual(Long lidConstanteNomiActual) {
		this.lidConstanteNomiActual = lidConstanteNomiActual;
	}
	
	
		
	
}
