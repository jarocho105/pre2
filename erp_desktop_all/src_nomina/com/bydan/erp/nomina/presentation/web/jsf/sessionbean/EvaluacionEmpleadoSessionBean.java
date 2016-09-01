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
public class EvaluacionEmpleadoSessionBean  extends EvaluacionEmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado;
	protected Long lIdEvaluacionEmpleadoActualForeignKey;	
	
	protected Long lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaEvaluacionEmpleado;
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
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleadoEvalua;
	Long lidEmpleadoEvaluaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado;
	Long lidTipoEvaluacionEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionSemestre;
	Long lidSemestreActual;
	Boolean isBusquedaDesdeForeignKeySesionTrimestre;
	Long lidTrimestreActual;
	Boolean isBusquedaDesdeForeignKeySesionBimestre;
	Long lidBimestreActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_estructura;
	private Long id_empleado;
	private Long id_empleado_evalua;
	private Long id_tipo_evaluacion_empleado;
	private Long id_anio;
	private Long id_semestre;
	private Long id_trimestre;
	private Long id_bimestre;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EvaluacionEmpleadoSessionBeanAdditional evaluacionempleadoSessionBeanAdditional=null;
	
	public EvaluacionEmpleadoSessionBeanAdditional getEvaluacionEmpleadoSessionBeanAdditional() {
		return this.evaluacionempleadoSessionBeanAdditional;
	}
	
	public void setEvaluacionEmpleadoSessionBeanAdditional(EvaluacionEmpleadoSessionBeanAdditional evaluacionempleadoSessionBeanAdditional) {
		try {
			this.evaluacionempleadoSessionBeanAdditional=evaluacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EvaluacionEmpleadoSessionBean () {
		this.inicializarEvaluacionEmpleadoSessionBean();
	}
	
	public void inicializarEvaluacionEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado=false;
		this.lIdEvaluacionEmpleadoActualForeignKey=0L;
		this.lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaEvaluacionEmpleado ="";
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
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleadoEvalua=false;
		lidEmpleadoEvaluaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado=false;
		lidTipoEvaluacionEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionSemestre=false;
		lidSemestreActual=0L;
		isBusquedaDesdeForeignKeySesionTrimestre=false;
		lidTrimestreActual=0L;
		isBusquedaDesdeForeignKeySesionBimestre=false;
		lidBimestreActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_estructura=-1L;
 		this.id_empleado=-1L;
 		this.id_empleado_evalua=-1L;
 		this.id_tipo_evaluacion_empleado=-1L;
 		this.id_anio=null;
 		this.id_semestre=-1L;
 		this.id_trimestre=-1L;
 		this.id_bimestre=-1L;
 		this.id_mes=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleado;
	}
					
	public Long getlIdEvaluacionEmpleadoActualForeignKey() {
		return lIdEvaluacionEmpleadoActualForeignKey;
	}

	public void setlIdEvaluacionEmpleadoActualForeignKey(
			Long lIdEvaluacionEmpleadoActualForeignKey) {
		this.lIdEvaluacionEmpleadoActualForeignKey = lIdEvaluacionEmpleadoActualForeignKey;
	}
				    
	public Long getlIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras = lIdEvaluacionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEvaluacionEmpleado() {
		return sUltimaBusquedaEvaluacionEmpleado;
	}

	public void setsUltimaBusquedaEvaluacionEmpleado(String sUltimaBusquedaEvaluacionEmpleado) {
		this.sUltimaBusquedaEvaluacionEmpleado = sUltimaBusquedaEvaluacionEmpleado;
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
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_empleado_evalua() {
		return this.id_empleado_evalua;
	}
    
	public Long getid_tipo_evaluacion_empleado() {
		return this.id_tipo_evaluacion_empleado;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_semestre() {
		return this.id_semestre;
	}
    
	public Long getid_trimestre() {
		return this.id_trimestre;
	}
    
	public Long getid_bimestre() {
		return this.id_bimestre;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id");
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
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_estructura");
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
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado_evalua(Long newid_empleado_evalua)throws Exception
	{
		try {
			if(this.id_empleado_evalua!=newid_empleado_evalua) {
				if(newid_empleado_evalua==null) {
					//newid_empleado_evalua=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_empleado_evalua");
					}
				}

				this.id_empleado_evalua=newid_empleado_evalua;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_evaluacion_empleado(Long newid_tipo_evaluacion_empleado)throws Exception
	{
		try {
			if(this.id_tipo_evaluacion_empleado!=newid_tipo_evaluacion_empleado) {
				if(newid_tipo_evaluacion_empleado==null) {
					//newid_tipo_evaluacion_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_tipo_evaluacion_empleado");
					}
				}

				this.id_tipo_evaluacion_empleado=newid_tipo_evaluacion_empleado;
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
    
	public void setid_semestre(Long newid_semestre)throws Exception
	{
		try {
			if(this.id_semestre!=newid_semestre) {
				if(newid_semestre==null) {
					//newid_semestre=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_semestre");
					}
				}

				this.id_semestre=newid_semestre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_trimestre(Long newid_trimestre)throws Exception
	{
		try {
			if(this.id_trimestre!=newid_trimestre) {
				if(newid_trimestre==null) {
					//newid_trimestre=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_trimestre");
					}
				}

				this.id_trimestre=newid_trimestre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bimestre(Long newid_bimestre)throws Exception
	{
		try {
			if(this.id_bimestre!=newid_bimestre) {
				if(newid_bimestre==null) {
					//newid_bimestre=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionEmpleado:Valor nulo no permitido en columna id_bimestre");
					}
				}

				this.id_bimestre=newid_bimestre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleadoEvalua() {
		return isBusquedaDesdeForeignKeySesionEmpleadoEvalua;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleadoEvalua(
		Boolean isBusquedaDesdeForeignKeySesionEmpleadoEvalua) {
		this.isBusquedaDesdeForeignKeySesionEmpleadoEvalua = isBusquedaDesdeForeignKeySesionEmpleadoEvalua;
	}

	public Long getlidEmpleadoEvaluaActual() {
		return lidEmpleadoEvaluaActual;
	}

	public void setlidEmpleadoEvaluaActual(Long lidEmpleadoEvaluaActual) {
		this.lidEmpleadoEvaluaActual = lidEmpleadoEvaluaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado() {
		return isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado = isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado;
	}

	public Long getlidTipoEvaluacionEmpleadoActual() {
		return lidTipoEvaluacionEmpleadoActual;
	}

	public void setlidTipoEvaluacionEmpleadoActual(Long lidTipoEvaluacionEmpleadoActual) {
		this.lidTipoEvaluacionEmpleadoActual = lidTipoEvaluacionEmpleadoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSemestre() {
		return isBusquedaDesdeForeignKeySesionSemestre;
	}

	public void setisBusquedaDesdeForeignKeySesionSemestre(
		Boolean isBusquedaDesdeForeignKeySesionSemestre) {
		this.isBusquedaDesdeForeignKeySesionSemestre = isBusquedaDesdeForeignKeySesionSemestre;
	}

	public Long getlidSemestreActual() {
		return lidSemestreActual;
	}

	public void setlidSemestreActual(Long lidSemestreActual) {
		this.lidSemestreActual = lidSemestreActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTrimestre() {
		return isBusquedaDesdeForeignKeySesionTrimestre;
	}

	public void setisBusquedaDesdeForeignKeySesionTrimestre(
		Boolean isBusquedaDesdeForeignKeySesionTrimestre) {
		this.isBusquedaDesdeForeignKeySesionTrimestre = isBusquedaDesdeForeignKeySesionTrimestre;
	}

	public Long getlidTrimestreActual() {
		return lidTrimestreActual;
	}

	public void setlidTrimestreActual(Long lidTrimestreActual) {
		this.lidTrimestreActual = lidTrimestreActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBimestre() {
		return isBusquedaDesdeForeignKeySesionBimestre;
	}

	public void setisBusquedaDesdeForeignKeySesionBimestre(
		Boolean isBusquedaDesdeForeignKeySesionBimestre) {
		this.isBusquedaDesdeForeignKeySesionBimestre = isBusquedaDesdeForeignKeySesionBimestre;
	}

	public Long getlidBimestreActual() {
		return lidBimestreActual;
	}

	public void setlidBimestreActual(Long lidBimestreActual) {
		this.lidBimestreActual = lidBimestreActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	
	
		
	
}
