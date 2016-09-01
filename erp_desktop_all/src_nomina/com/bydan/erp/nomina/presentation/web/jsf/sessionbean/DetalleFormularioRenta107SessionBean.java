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
public class DetalleFormularioRenta107SessionBean  extends DetalleFormularioRenta107SessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107;
	protected Long lIdDetalleFormularioRenta107ActualForeignKey;	
	
	protected Long lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras;
	protected String sUltimaBusquedaDetalleFormularioRenta107;
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
	Boolean isBusquedaDesdeForeignKeySesionFormularioRenta107;
	Long lidFormularioRenta107Actual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_formulario_renta107;
	private Long id_ejercicio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleFormularioRenta107SessionBeanAdditional detalleformulariorenta107SessionBeanAdditional=null;
	
	public DetalleFormularioRenta107SessionBeanAdditional getDetalleFormularioRenta107SessionBeanAdditional() {
		return this.detalleformulariorenta107SessionBeanAdditional;
	}
	
	public void setDetalleFormularioRenta107SessionBeanAdditional(DetalleFormularioRenta107SessionBeanAdditional detalleformulariorenta107SessionBeanAdditional) {
		try {
			this.detalleformulariorenta107SessionBeanAdditional=detalleformulariorenta107SessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleFormularioRenta107SessionBean () {
		this.inicializarDetalleFormularioRenta107SessionBean();
	}
	
	public void inicializarDetalleFormularioRenta107SessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107=false;
		this.lIdDetalleFormularioRenta107ActualForeignKey=0L;
		this.lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleFormularioRenta107 ="";
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
		isBusquedaDesdeForeignKeySesionFormularioRenta107=false;
		lidFormularioRenta107Actual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_formulario_renta107=-1L;
 		this.id_ejercicio=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107= isPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107 = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107= isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107;
	}
					
	public Long getlIdDetalleFormularioRenta107ActualForeignKey() {
		return lIdDetalleFormularioRenta107ActualForeignKey;
	}

	public void setlIdDetalleFormularioRenta107ActualForeignKey(
			Long lIdDetalleFormularioRenta107ActualForeignKey) {
		this.lIdDetalleFormularioRenta107ActualForeignKey = lIdDetalleFormularioRenta107ActualForeignKey;
	}
				    
	public Long getlIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras() {
		return lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras(
			Long lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras = lIdDetalleFormularioRenta107ActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleFormularioRenta107ParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleFormularioRenta107() {
		return sUltimaBusquedaDetalleFormularioRenta107;
	}

	public void setsUltimaBusquedaDetalleFormularioRenta107(String sUltimaBusquedaDetalleFormularioRenta107) {
		this.sUltimaBusquedaDetalleFormularioRenta107 = sUltimaBusquedaDetalleFormularioRenta107;
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
    
	public Long getid_formulario_renta107() {
		return this.id_formulario_renta107;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleFormularioRenta107:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleFormularioRenta107:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleFormularioRenta107:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formulario_renta107(Long newid_formulario_renta107)throws Exception
	{
		try {
			if(this.id_formulario_renta107!=newid_formulario_renta107) {
				if(newid_formulario_renta107==null) {
					//newid_formulario_renta107=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleFormularioRenta107:Valor nulo no permitido en columna id_formulario_renta107");
					}
				}

				this.id_formulario_renta107=newid_formulario_renta107;
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
						System.out.println("DetalleFormularioRenta107:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormularioRenta107() {
		return isBusquedaDesdeForeignKeySesionFormularioRenta107;
	}

	public void setisBusquedaDesdeForeignKeySesionFormularioRenta107(
		Boolean isBusquedaDesdeForeignKeySesionFormularioRenta107) {
		this.isBusquedaDesdeForeignKeySesionFormularioRenta107 = isBusquedaDesdeForeignKeySesionFormularioRenta107;
	}

	public Long getlidFormularioRenta107Actual() {
		return lidFormularioRenta107Actual;
	}

	public void setlidFormularioRenta107Actual(Long lidFormularioRenta107Actual) {
		this.lidFormularioRenta107Actual = lidFormularioRenta107Actual;
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
	
	
		
	
}
