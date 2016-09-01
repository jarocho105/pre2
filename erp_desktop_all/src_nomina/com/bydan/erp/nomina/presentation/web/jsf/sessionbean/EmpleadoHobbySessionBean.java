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
public class EmpleadoHobbySessionBean  extends EmpleadoHobbySessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby;
	protected Long lIdEmpleadoHobbyActualForeignKey;	
	
	protected Long lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras;
	protected String sUltimaBusquedaEmpleadoHobby;
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
	Boolean isBusquedaDesdeForeignKeySesionHobby;
	Long lidHobbyActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_hobby;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoHobbySessionBeanAdditional empleadohobbySessionBeanAdditional=null;
	
	public EmpleadoHobbySessionBeanAdditional getEmpleadoHobbySessionBeanAdditional() {
		return this.empleadohobbySessionBeanAdditional;
	}
	
	public void setEmpleadoHobbySessionBeanAdditional(EmpleadoHobbySessionBeanAdditional empleadohobbySessionBeanAdditional) {
		try {
			this.empleadohobbySessionBeanAdditional=empleadohobbySessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoHobbySessionBean () {
		this.inicializarEmpleadoHobbySessionBean();
	}
	
	public void inicializarEmpleadoHobbySessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby=false;
		this.lIdEmpleadoHobbyActualForeignKey=0L;
		this.lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleadoHobby ="";
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
		isBusquedaDesdeForeignKeySesionHobby=false;
		lidHobbyActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_hobby=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby= isPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby= isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby;
	}
					
	public Long getlIdEmpleadoHobbyActualForeignKey() {
		return lIdEmpleadoHobbyActualForeignKey;
	}

	public void setlIdEmpleadoHobbyActualForeignKey(
			Long lIdEmpleadoHobbyActualForeignKey) {
		this.lIdEmpleadoHobbyActualForeignKey = lIdEmpleadoHobbyActualForeignKey;
	}
				    
	public Long getlIdEmpleadoHobbyActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoHobbyActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras = lIdEmpleadoHobbyActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobbyParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleadoHobby() {
		return sUltimaBusquedaEmpleadoHobby;
	}

	public void setsUltimaBusquedaEmpleadoHobby(String sUltimaBusquedaEmpleadoHobby) {
		this.sUltimaBusquedaEmpleadoHobby = sUltimaBusquedaEmpleadoHobby;
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
    
	public Long getid_hobby() {
		return this.id_hobby;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoHobby:Valor nulo no permitido en columna id");
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
						System.out.println("EmpleadoHobby:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EmpleadoHobby:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_hobby(Long newid_hobby)throws Exception
	{
		try {
			if(this.id_hobby!=newid_hobby) {
				if(newid_hobby==null) {
					//newid_hobby=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EmpleadoHobby:Valor nulo no permitido en columna id_hobby");
					}
				}

				this.id_hobby=newid_hobby;
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
	public Boolean getisBusquedaDesdeForeignKeySesionHobby() {
		return isBusquedaDesdeForeignKeySesionHobby;
	}

	public void setisBusquedaDesdeForeignKeySesionHobby(
		Boolean isBusquedaDesdeForeignKeySesionHobby) {
		this.isBusquedaDesdeForeignKeySesionHobby = isBusquedaDesdeForeignKeySesionHobby;
	}

	public Long getlidHobbyActual() {
		return lidHobbyActual;
	}

	public void setlidHobbyActual(Long lidHobbyActual) {
		this.lidHobbyActual = lidHobbyActual;
	}
	
	
		
	
}
