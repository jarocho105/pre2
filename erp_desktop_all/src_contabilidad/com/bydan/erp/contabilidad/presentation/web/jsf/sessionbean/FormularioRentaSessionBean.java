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
public class FormularioRentaSessionBean  extends FormularioRentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta;
	protected Long lIdFormularioRentaActualForeignKey;	
	
	protected Long lIdFormularioRentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras;
	protected String sUltimaBusquedaFormularioRenta;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	Long lidDatoFormularioRentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencion;
	Long lidTipoRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionParametroFormularioIva;
	Long lidParametroFormularioIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_dato_formulario_renta;
	private Long id_cuenta_contable;
	private Long id_tipo_retencion;
	private Long id_parametro_formulario_iva;
	private Long id_pais;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormularioRentaSessionBeanAdditional formulariorentaSessionBeanAdditional=null;
	
	public FormularioRentaSessionBeanAdditional getFormularioRentaSessionBeanAdditional() {
		return this.formulariorentaSessionBeanAdditional;
	}
	
	public void setFormularioRentaSessionBeanAdditional(FormularioRentaSessionBeanAdditional formulariorentaSessionBeanAdditional) {
		try {
			this.formulariorentaSessionBeanAdditional=formulariorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormularioRentaSessionBean () {
		this.inicializarFormularioRentaSessionBean();
	}
	
	public void inicializarFormularioRentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta=false;
		this.lIdFormularioRentaActualForeignKey=0L;
		this.lIdFormularioRentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras=false;
		this.sUltimaBusquedaFormularioRenta ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionDatoFormularioRenta=false;
		lidDatoFormularioRentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencion=false;
		lidTipoRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionParametroFormularioIva=false;
		lidParametroFormularioIvaActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_dato_formulario_renta=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_tipo_retencion=-1L;
 		this.id_parametro_formulario_iva=-1L;
 		this.id_pais=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta= isPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta= isBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta;
	}
					
	public Long getlIdFormularioRentaActualForeignKey() {
		return lIdFormularioRentaActualForeignKey;
	}

	public void setlIdFormularioRentaActualForeignKey(
			Long lIdFormularioRentaActualForeignKey) {
		this.lIdFormularioRentaActualForeignKey = lIdFormularioRentaActualForeignKey;
	}
				    
	public Long getlIdFormularioRentaActualForeignKeyParaPosibleAtras() {
		return lIdFormularioRentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormularioRentaActualForeignKeyParaPosibleAtras(
			Long lIdFormularioRentaActualForeignKeyParaPosibleAtras) {
		this.lIdFormularioRentaActualForeignKeyParaPosibleAtras = lIdFormularioRentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormularioRenta() {
		return sUltimaBusquedaFormularioRenta;
	}

	public void setsUltimaBusquedaFormularioRenta(String sUltimaBusquedaFormularioRenta) {
		this.sUltimaBusquedaFormularioRenta = sUltimaBusquedaFormularioRenta;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_dato_formulario_renta() {
		return this.id_dato_formulario_renta;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_tipo_retencion() {
		return this.id_tipo_retencion;
	}
    
	public Long getid_parametro_formulario_iva() {
		return this.id_parametro_formulario_iva;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id");
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
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_dato_formulario_renta(Long newid_dato_formulario_renta)throws Exception
	{
		try {
			if(this.id_dato_formulario_renta!=newid_dato_formulario_renta) {
				if(newid_dato_formulario_renta==null) {
					//newid_dato_formulario_renta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_dato_formulario_renta");
					}
				}

				this.id_dato_formulario_renta=newid_dato_formulario_renta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion(Long newid_tipo_retencion)throws Exception
	{
		try {
			if(this.id_tipo_retencion!=newid_tipo_retencion) {
				if(newid_tipo_retencion==null) {
					//newid_tipo_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_tipo_retencion");
					}
				}

				this.id_tipo_retencion=newid_tipo_retencion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_parametro_formulario_iva(Long newid_parametro_formulario_iva)throws Exception
	{
		try {
			if(this.id_parametro_formulario_iva!=newid_parametro_formulario_iva) {
				if(newid_parametro_formulario_iva==null) {
					//newid_parametro_formulario_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_parametro_formulario_iva");
					}
				}

				this.id_parametro_formulario_iva=newid_parametro_formulario_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRenta:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
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
	public Boolean getisBusquedaDesdeForeignKeySesionDatoFormularioRenta() {
		return isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	}

	public void setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(
		Boolean isBusquedaDesdeForeignKeySesionDatoFormularioRenta) {
		this.isBusquedaDesdeForeignKeySesionDatoFormularioRenta = isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	}

	public Long getlidDatoFormularioRentaActual() {
		return lidDatoFormularioRentaActual;
	}

	public void setlidDatoFormularioRentaActual(Long lidDatoFormularioRentaActual) {
		this.lidDatoFormularioRentaActual = lidDatoFormularioRentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencion() {
		return isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencion) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencion = isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public Long getlidTipoRetencionActual() {
		return lidTipoRetencionActual;
	}

	public void setlidTipoRetencionActual(Long lidTipoRetencionActual) {
		this.lidTipoRetencionActual = lidTipoRetencionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionParametroFormularioIva(
		Boolean isBusquedaDesdeForeignKeySesionParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionParametroFormularioIva = isBusquedaDesdeForeignKeySesionParametroFormularioIva;
	}

	public Long getlidParametroFormularioIvaActual() {
		return lidParametroFormularioIvaActual;
	}

	public void setlidParametroFormularioIvaActual(Long lidParametroFormularioIvaActual) {
		this.lidParametroFormularioIvaActual = lidParametroFormularioIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	
	
		
	
}
