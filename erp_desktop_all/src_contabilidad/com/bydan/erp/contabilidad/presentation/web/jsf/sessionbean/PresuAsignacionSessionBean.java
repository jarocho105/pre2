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
public class PresuAsignacionSessionBean  extends PresuAsignacionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion;
	protected Long lIdPresuAsignacionActualForeignKey;	
	
	protected Long lIdPresuAsignacionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras;
	protected String sUltimaBusquedaPresuAsignacion;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPresuProyectoCuenta;
	Long lidPresuProyectoCuentaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionPresuEstado;
	Long lidPresuEstadoActual;
	
	private Long id;
	private Long id_presu_proyecto_cuenta;
	private Long id_empleado;
	private Long id_presu_estado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PresuAsignacionSessionBeanAdditional presuasignacionSessionBeanAdditional=null;
	
	public PresuAsignacionSessionBeanAdditional getPresuAsignacionSessionBeanAdditional() {
		return this.presuasignacionSessionBeanAdditional;
	}
	
	public void setPresuAsignacionSessionBeanAdditional(PresuAsignacionSessionBeanAdditional presuasignacionSessionBeanAdditional) {
		try {
			this.presuasignacionSessionBeanAdditional=presuasignacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PresuAsignacionSessionBean () {
		this.inicializarPresuAsignacionSessionBean();
	}
	
	public void inicializarPresuAsignacionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion=false;
		this.lIdPresuAsignacionActualForeignKey=0L;
		this.lIdPresuAsignacionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras=false;
		this.sUltimaBusquedaPresuAsignacion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPresuProyectoCuenta=false;
		lidPresuProyectoCuentaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionPresuEstado=false;
		lidPresuEstadoActual=0L; 
		
		
		
 		this.id_presu_proyecto_cuenta=-1L;
 		this.id_empleado=-1L;
 		this.id_presu_estado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion= isPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion(String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion = sNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion= isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion;
	}
					
	public Long getlIdPresuAsignacionActualForeignKey() {
		return lIdPresuAsignacionActualForeignKey;
	}

	public void setlIdPresuAsignacionActualForeignKey(
			Long lIdPresuAsignacionActualForeignKey) {
		this.lIdPresuAsignacionActualForeignKey = lIdPresuAsignacionActualForeignKey;
	}
				    
	public Long getlIdPresuAsignacionActualForeignKeyParaPosibleAtras() {
		return lIdPresuAsignacionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPresuAsignacionActualForeignKeyParaPosibleAtras(
			Long lIdPresuAsignacionActualForeignKeyParaPosibleAtras) {
		this.lIdPresuAsignacionActualForeignKeyParaPosibleAtras = lIdPresuAsignacionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPresuAsignacion() {
		return sUltimaBusquedaPresuAsignacion;
	}

	public void setsUltimaBusquedaPresuAsignacion(String sUltimaBusquedaPresuAsignacion) {
		this.sUltimaBusquedaPresuAsignacion = sUltimaBusquedaPresuAsignacion;
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
    
	public Long getid_presu_proyecto_cuenta() {
		return this.id_presu_proyecto_cuenta;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_presu_estado() {
		return this.id_presu_estado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuAsignacion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_presu_proyecto_cuenta(Long newid_presu_proyecto_cuenta)throws Exception
	{
		try {
			if(this.id_presu_proyecto_cuenta!=newid_presu_proyecto_cuenta) {
				if(newid_presu_proyecto_cuenta==null) {
					//newid_presu_proyecto_cuenta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuAsignacion:Valor nulo no permitido en columna id_presu_proyecto_cuenta");
					}
				}

				this.id_presu_proyecto_cuenta=newid_presu_proyecto_cuenta;
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
						System.out.println("PresuAsignacion:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_presu_estado(Long newid_presu_estado)throws Exception
	{
		try {
			if(this.id_presu_estado!=newid_presu_estado) {
				if(newid_presu_estado==null) {
					//newid_presu_estado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuAsignacion:Valor nulo no permitido en columna id_presu_estado");
					}
				}

				this.id_presu_estado=newid_presu_estado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPresuProyectoCuenta() {
		return isBusquedaDesdeForeignKeySesionPresuProyectoCuenta;
	}

	public void setisBusquedaDesdeForeignKeySesionPresuProyectoCuenta(
		Boolean isBusquedaDesdeForeignKeySesionPresuProyectoCuenta) {
		this.isBusquedaDesdeForeignKeySesionPresuProyectoCuenta = isBusquedaDesdeForeignKeySesionPresuProyectoCuenta;
	}

	public Long getlidPresuProyectoCuentaActual() {
		return lidPresuProyectoCuentaActual;
	}

	public void setlidPresuProyectoCuentaActual(Long lidPresuProyectoCuentaActual) {
		this.lidPresuProyectoCuentaActual = lidPresuProyectoCuentaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPresuEstado() {
		return isBusquedaDesdeForeignKeySesionPresuEstado;
	}

	public void setisBusquedaDesdeForeignKeySesionPresuEstado(
		Boolean isBusquedaDesdeForeignKeySesionPresuEstado) {
		this.isBusquedaDesdeForeignKeySesionPresuEstado = isBusquedaDesdeForeignKeySesionPresuEstado;
	}

	public Long getlidPresuEstadoActual() {
		return lidPresuEstadoActual;
	}

	public void setlidPresuEstadoActual(Long lidPresuEstadoActual) {
		this.lidPresuEstadoActual = lidPresuEstadoActual;
	}
	
	
		
	
}
