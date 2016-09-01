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
public class EvaluacionesPeriodosSessionBean  extends EvaluacionesPeriodosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos;
	protected Long lIdEvaluacionesPeriodosActualForeignKey;	
	
	protected Long lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras;
	protected String sUltimaBusquedaEvaluacionesPeriodos;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado;
	Long lidTipoCalificacionEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado;
	Long lidTipoEvaluacionEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi;
	Long lidFormatoNomiPreguntaNomiActual;
	
	private Long id;
	private Long id_tipo_calificacion_empleado;
	private Boolean verificado;
	private Long id_estructura;
	private String codigo;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_tipo_evaluacion_empleado;
	private Long id_formato_nomi_pregunta_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EvaluacionesPeriodosSessionBeanAdditional evaluacionesperiodosSessionBeanAdditional=null;
	
	public EvaluacionesPeriodosSessionBeanAdditional getEvaluacionesPeriodosSessionBeanAdditional() {
		return this.evaluacionesperiodosSessionBeanAdditional;
	}
	
	public void setEvaluacionesPeriodosSessionBeanAdditional(EvaluacionesPeriodosSessionBeanAdditional evaluacionesperiodosSessionBeanAdditional) {
		try {
			this.evaluacionesperiodosSessionBeanAdditional=evaluacionesperiodosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EvaluacionesPeriodosSessionBean () {
		this.inicializarEvaluacionesPeriodosSessionBean();
	}
	
	public void inicializarEvaluacionesPeriodosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos=false;
		this.lIdEvaluacionesPeriodosActualForeignKey=0L;
		this.lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras=false;
		this.sUltimaBusquedaEvaluacionesPeriodos ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado=false;
		lidTipoCalificacionEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado=false;
		lidTipoEvaluacionEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi=false;
		lidFormatoNomiPreguntaNomiActual=0L; 
		
		
		
 		this.id_tipo_calificacion_empleado=-1L;
 		this.verificado=false;
 		this.id_estructura=-1L;
 		this.codigo="";
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_tipo_evaluacion_empleado=-1L;
 		this.id_formato_nomi_pregunta_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos= isPermiteNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos = sNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionesPeriodos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos= isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodos;
	}
					
	public Long getlIdEvaluacionesPeriodosActualForeignKey() {
		return lIdEvaluacionesPeriodosActualForeignKey;
	}

	public void setlIdEvaluacionesPeriodosActualForeignKey(
			Long lIdEvaluacionesPeriodosActualForeignKey) {
		this.lIdEvaluacionesPeriodosActualForeignKey = lIdEvaluacionesPeriodosActualForeignKey;
	}
				    
	public Long getlIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras() {
		return lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras(
			Long lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras) {
		this.lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras = lIdEvaluacionesPeriodosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEvaluacionesPeriodosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEvaluacionesPeriodos() {
		return sUltimaBusquedaEvaluacionesPeriodos;
	}

	public void setsUltimaBusquedaEvaluacionesPeriodos(String sUltimaBusquedaEvaluacionesPeriodos) {
		this.sUltimaBusquedaEvaluacionesPeriodos = sUltimaBusquedaEvaluacionesPeriodos;
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
    
	public Long getid_tipo_calificacion_empleado() {
		return this.id_tipo_calificacion_empleado;
	}
    
	public Boolean getverificado() {
		return this.verificado;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public String getcodigo() {
		return this.codigo;
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
    
	public Long getid_tipo_evaluacion_empleado() {
		return this.id_tipo_evaluacion_empleado;
	}
    
	public Long getid_formato_nomi_pregunta_nomi() {
		return this.id_formato_nomi_pregunta_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_tipo_calificacion_empleado");
					}
				}

				this.id_tipo_calificacion_empleado=newid_tipo_calificacion_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setverificado(Boolean newverificado)throws Exception
	{
		try {
			if(this.verificado!=newverificado) {
				if(newverificado==null) {
					//newverificado=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna verificado");
					}
				}

				this.verificado=newverificado;
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("EvaluacionesPeriodos:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_tipo_evaluacion_empleado");
					}
				}

				this.id_tipo_evaluacion_empleado=newid_tipo_evaluacion_empleado;
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
						System.out.println("EvaluacionesPeriodos:Valor nulo no permitido en columna id_formato_nomi_pregunta_nomi");
					}
				}

				this.id_formato_nomi_pregunta_nomi=newid_formato_nomi_pregunta_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
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
	
	
		
	
}
