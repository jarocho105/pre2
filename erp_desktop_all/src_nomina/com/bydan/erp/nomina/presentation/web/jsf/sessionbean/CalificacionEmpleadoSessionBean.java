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
public class CalificacionEmpleadoSessionBean  extends CalificacionEmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado;
	protected Long lIdCalificacionEmpleadoActualForeignKey;	
	
	protected Long lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaCalificacionEmpleado;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionEvaluacionEmpleado;
	Long lidEvaluacionEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi;
	Long lidFormatoNomiFactorNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi;
	Long lidFormatoNomiPreguntaNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado;
	Long lidTipoCalificacionEmpleadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_empleado;
	private Long id_evaluacion_empleado;
	private Long id_formato_nomi_factor_nomi;
	private Long id_formato_nomi_pregunta_nomi;
	private Long id_tipo_calificacion_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CalificacionEmpleadoSessionBeanAdditional calificacionempleadoSessionBeanAdditional=null;
	
	public CalificacionEmpleadoSessionBeanAdditional getCalificacionEmpleadoSessionBeanAdditional() {
		return this.calificacionempleadoSessionBeanAdditional;
	}
	
	public void setCalificacionEmpleadoSessionBeanAdditional(CalificacionEmpleadoSessionBeanAdditional calificacionempleadoSessionBeanAdditional) {
		try {
			this.calificacionempleadoSessionBeanAdditional=calificacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CalificacionEmpleadoSessionBean () {
		this.inicializarCalificacionEmpleadoSessionBean();
	}
	
	public void inicializarCalificacionEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado=false;
		this.lIdCalificacionEmpleadoActualForeignKey=0L;
		this.lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaCalificacionEmpleado ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionEvaluacionEmpleado=false;
		lidEvaluacionEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi=false;
		lidFormatoNomiFactorNomiActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi=false;
		lidFormatoNomiPreguntaNomiActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado=false;
		lidTipoCalificacionEmpleadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_empleado=-1L;
 		this.id_evaluacion_empleado=-1L;
 		this.id_formato_nomi_factor_nomi=-1L;
 		this.id_formato_nomi_pregunta_nomi=-1L;
 		this.id_tipo_calificacion_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleado;
	}
					
	public Long getlIdCalificacionEmpleadoActualForeignKey() {
		return lIdCalificacionEmpleadoActualForeignKey;
	}

	public void setlIdCalificacionEmpleadoActualForeignKey(
			Long lIdCalificacionEmpleadoActualForeignKey) {
		this.lIdCalificacionEmpleadoActualForeignKey = lIdCalificacionEmpleadoActualForeignKey;
	}
				    
	public Long getlIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras = lIdCalificacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCalificacionEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCalificacionEmpleado() {
		return sUltimaBusquedaCalificacionEmpleado;
	}

	public void setsUltimaBusquedaCalificacionEmpleado(String sUltimaBusquedaCalificacionEmpleado) {
		this.sUltimaBusquedaCalificacionEmpleado = sUltimaBusquedaCalificacionEmpleado;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_evaluacion_empleado() {
		return this.id_evaluacion_empleado;
	}
    
	public Long getid_formato_nomi_factor_nomi() {
		return this.id_formato_nomi_factor_nomi;
	}
    
	public Long getid_formato_nomi_pregunta_nomi() {
		return this.id_formato_nomi_pregunta_nomi;
	}
    
	public Long getid_tipo_calificacion_empleado() {
		return this.id_tipo_calificacion_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id");
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
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_evaluacion_empleado(Long newid_evaluacion_empleado)throws Exception
	{
		try {
			if(this.id_evaluacion_empleado!=newid_evaluacion_empleado) {
				if(newid_evaluacion_empleado==null) {
					//newid_evaluacion_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_evaluacion_empleado");
					}
				}

				this.id_evaluacion_empleado=newid_evaluacion_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nomi_factor_nomi(Long newid_formato_nomi_factor_nomi)throws Exception
	{
		try {
			if(this.id_formato_nomi_factor_nomi!=newid_formato_nomi_factor_nomi) {
				if(newid_formato_nomi_factor_nomi==null) {
					//newid_formato_nomi_factor_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_formato_nomi_factor_nomi");
					}
				}

				this.id_formato_nomi_factor_nomi=newid_formato_nomi_factor_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nomi_pregunta_nomi(Long newid_formato_nomi_pregunta_nomi)throws Exception
	{
		try {
			if(this.id_formato_nomi_pregunta_nomi!=newid_formato_nomi_pregunta_nomi) {
				if(newid_formato_nomi_pregunta_nomi==null) {
					//newid_formato_nomi_pregunta_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_formato_nomi_pregunta_nomi");
					}
				}

				this.id_formato_nomi_pregunta_nomi=newid_formato_nomi_pregunta_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_calificacion_empleado(Long newid_tipo_calificacion_empleado)throws Exception
	{
		try {
			if(this.id_tipo_calificacion_empleado!=newid_tipo_calificacion_empleado) {
				if(newid_tipo_calificacion_empleado==null) {
					//newid_tipo_calificacion_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CalificacionEmpleado:Valor nulo no permitido en columna id_tipo_calificacion_empleado");
					}
				}

				this.id_tipo_calificacion_empleado=newid_tipo_calificacion_empleado;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEvaluacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEvaluacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEvaluacionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEvaluacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEvaluacionEmpleado = isBusquedaDesdeForeignKeySesionEvaluacionEmpleado;
	}

	public Long getlidEvaluacionEmpleadoActual() {
		return lidEvaluacionEmpleadoActual;
	}

	public void setlidEvaluacionEmpleadoActual(Long lidEvaluacionEmpleadoActual) {
		this.lidEvaluacionEmpleadoActual = lidEvaluacionEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi() {
		return isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi) {
		this.isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi = isBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi;
	}

	public Long getlidFormatoNomiFactorNomiActual() {
		return lidFormatoNomiFactorNomiActual;
	}

	public void setlidFormatoNomiFactorNomiActual(Long lidFormatoNomiFactorNomiActual) {
		this.lidFormatoNomiFactorNomiActual = lidFormatoNomiFactorNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi() {
		return isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi) {
		this.isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi = isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi;
	}

	public Long getlidFormatoNomiPreguntaNomiActual() {
		return lidFormatoNomiPreguntaNomiActual;
	}

	public void setlidFormatoNomiPreguntaNomiActual(Long lidFormatoNomiPreguntaNomiActual) {
		this.lidFormatoNomiPreguntaNomiActual = lidFormatoNomiPreguntaNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado = isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado;
	}

	public Long getlidTipoCalificacionEmpleadoActual() {
		return lidTipoCalificacionEmpleadoActual;
	}

	public void setlidTipoCalificacionEmpleadoActual(Long lidTipoCalificacionEmpleadoActual) {
		this.lidTipoCalificacionEmpleadoActual = lidTipoCalificacionEmpleadoActual;
	}
	
	
		
	
}
