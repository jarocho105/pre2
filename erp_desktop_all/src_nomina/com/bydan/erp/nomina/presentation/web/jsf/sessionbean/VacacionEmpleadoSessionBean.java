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
public class VacacionEmpleadoSessionBean  extends VacacionEmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado;
	protected Long lIdVacacionEmpleadoActualForeignKey;	
	
	protected Long lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaVacacionEmpleado;
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
	Boolean isBusquedaDesdeForeignKeySesionAnioPeriodo1;
	Long lidAnioPeriodo1Actual;
	Boolean isBusquedaDesdeForeignKeySesionAnioPeriodo2;
	Long lidAnioPeriodo2Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_anio_periodo1;
	private Long id_anio_periodo2;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected VacacionEmpleadoSessionBeanAdditional vacacionempleadoSessionBeanAdditional=null;
	
	public VacacionEmpleadoSessionBeanAdditional getVacacionEmpleadoSessionBeanAdditional() {
		return this.vacacionempleadoSessionBeanAdditional;
	}
	
	public void setVacacionEmpleadoSessionBeanAdditional(VacacionEmpleadoSessionBeanAdditional vacacionempleadoSessionBeanAdditional) {
		try {
			this.vacacionempleadoSessionBeanAdditional=vacacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public VacacionEmpleadoSessionBean () {
		this.inicializarVacacionEmpleadoSessionBean();
	}
	
	public void inicializarVacacionEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado=false;
		this.lIdVacacionEmpleadoActualForeignKey=0L;
		this.lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaVacacionEmpleado ="";
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
		isBusquedaDesdeForeignKeySesionAnioPeriodo1=false;
		lidAnioPeriodo1Actual=0L;
		isBusquedaDesdeForeignKeySesionAnioPeriodo2=false;
		lidAnioPeriodo2Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_anio_periodo1=-1L;
 		this.id_anio_periodo2=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeVacacionEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleado;
	}
					
	public Long getlIdVacacionEmpleadoActualForeignKey() {
		return lIdVacacionEmpleadoActualForeignKey;
	}

	public void setlIdVacacionEmpleadoActualForeignKey(
			Long lIdVacacionEmpleadoActualForeignKey) {
		this.lIdVacacionEmpleadoActualForeignKey = lIdVacacionEmpleadoActualForeignKey;
	}
				    
	public Long getlIdVacacionEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdVacacionEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras = lIdVacacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyVacacionEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaVacacionEmpleado() {
		return sUltimaBusquedaVacacionEmpleado;
	}

	public void setsUltimaBusquedaVacacionEmpleado(String sUltimaBusquedaVacacionEmpleado) {
		this.sUltimaBusquedaVacacionEmpleado = sUltimaBusquedaVacacionEmpleado;
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
    
	public Long getid_anio_periodo1() {
		return this.id_anio_periodo1;
	}
    
	public Long getid_anio_periodo2() {
		return this.id_anio_periodo2;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VacacionEmpleado:Valor nulo no permitido en columna id");
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
						System.out.println("VacacionEmpleado:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("VacacionEmpleado:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio_periodo1(Long newid_anio_periodo1)throws Exception
	{
		try {
			if(this.id_anio_periodo1!=newid_anio_periodo1) {
				if(newid_anio_periodo1==null) {
					//newid_anio_periodo1=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VacacionEmpleado:Valor nulo no permitido en columna id_anio_periodo1");
					}
				}

				this.id_anio_periodo1=newid_anio_periodo1;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio_periodo2(Long newid_anio_periodo2)throws Exception
	{
		try {
			if(this.id_anio_periodo2!=newid_anio_periodo2) {
				if(newid_anio_periodo2==null) {
					//newid_anio_periodo2=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VacacionEmpleado:Valor nulo no permitido en columna id_anio_periodo2");
					}
				}

				this.id_anio_periodo2=newid_anio_periodo2;
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
	public Boolean getisBusquedaDesdeForeignKeySesionAnioPeriodo1() {
		return isBusquedaDesdeForeignKeySesionAnioPeriodo1;
	}

	public void setisBusquedaDesdeForeignKeySesionAnioPeriodo1(
		Boolean isBusquedaDesdeForeignKeySesionAnioPeriodo1) {
		this.isBusquedaDesdeForeignKeySesionAnioPeriodo1 = isBusquedaDesdeForeignKeySesionAnioPeriodo1;
	}

	public Long getlidAnioPeriodo1Actual() {
		return lidAnioPeriodo1Actual;
	}

	public void setlidAnioPeriodo1Actual(Long lidAnioPeriodo1Actual) {
		this.lidAnioPeriodo1Actual = lidAnioPeriodo1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnioPeriodo2() {
		return isBusquedaDesdeForeignKeySesionAnioPeriodo2;
	}

	public void setisBusquedaDesdeForeignKeySesionAnioPeriodo2(
		Boolean isBusquedaDesdeForeignKeySesionAnioPeriodo2) {
		this.isBusquedaDesdeForeignKeySesionAnioPeriodo2 = isBusquedaDesdeForeignKeySesionAnioPeriodo2;
	}

	public Long getlidAnioPeriodo2Actual() {
		return lidAnioPeriodo2Actual;
	}

	public void setlidAnioPeriodo2Actual(Long lidAnioPeriodo2Actual) {
		this.lidAnioPeriodo2Actual = lidAnioPeriodo2Actual;
	}
	
	
		
	
}
