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
public class CreditosDetalladosSessionBean  extends CreditosDetalladosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados;
	protected Long lIdCreditosDetalladosActualForeignKey;	
	
	protected Long lIdCreditosDetalladosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras;
	protected String sUltimaBusquedaCreditosDetallados;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCargo;
	Long lidCargoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrestamo;
	Long lidTipoPrestamoActual;
	
	private Long id;
	private Long id_cargo;
	private Long id_estructura;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_tipo_prestamo;
	private Date fecha_vencimiento_desde;
	private Date fecha_vencimiento_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CreditosDetalladosSessionBeanAdditional creditosdetalladosSessionBeanAdditional=null;
	
	public CreditosDetalladosSessionBeanAdditional getCreditosDetalladosSessionBeanAdditional() {
		return this.creditosdetalladosSessionBeanAdditional;
	}
	
	public void setCreditosDetalladosSessionBeanAdditional(CreditosDetalladosSessionBeanAdditional creditosdetalladosSessionBeanAdditional) {
		try {
			this.creditosdetalladosSessionBeanAdditional=creditosdetalladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CreditosDetalladosSessionBean () {
		this.inicializarCreditosDetalladosSessionBean();
	}
	
	public void inicializarCreditosDetalladosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados=false;
		this.lIdCreditosDetalladosActualForeignKey=0L;
		this.lIdCreditosDetalladosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras=false;
		this.sUltimaBusquedaCreditosDetallados ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCargo=false;
		lidCargoActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrestamo=false;
		lidTipoPrestamoActual=0L; 
		
		
		
 		this.id_cargo=-1L;
 		this.id_estructura=-1L;
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_prestamo=-1L;
 		this.fecha_vencimiento_desde=new Date();
 		this.fecha_vencimiento_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados= isPermiteNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados = sNombrePaginaNavegacionHaciaForeignKeyDesdeCreditosDetallados;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados= isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetallados;
	}
					
	public Long getlIdCreditosDetalladosActualForeignKey() {
		return lIdCreditosDetalladosActualForeignKey;
	}

	public void setlIdCreditosDetalladosActualForeignKey(
			Long lIdCreditosDetalladosActualForeignKey) {
		this.lIdCreditosDetalladosActualForeignKey = lIdCreditosDetalladosActualForeignKey;
	}
				    
	public Long getlIdCreditosDetalladosActualForeignKeyParaPosibleAtras() {
		return lIdCreditosDetalladosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCreditosDetalladosActualForeignKeyParaPosibleAtras(
			Long lIdCreditosDetalladosActualForeignKeyParaPosibleAtras) {
		this.lIdCreditosDetalladosActualForeignKeyParaPosibleAtras = lIdCreditosDetalladosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCreditosDetalladosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCreditosDetallados() {
		return sUltimaBusquedaCreditosDetallados;
	}

	public void setsUltimaBusquedaCreditosDetallados(String sUltimaBusquedaCreditosDetallados) {
		this.sUltimaBusquedaCreditosDetallados = sUltimaBusquedaCreditosDetallados;
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
    
	public Long getid_cargo() {
		return this.id_cargo;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_prestamo() {
		return this.id_tipo_prestamo;
	}
    
	public Date getfecha_vencimiento_desde() {
		return this.fecha_vencimiento_desde;
	}
    
	public Date getfecha_vencimiento_hasta() {
		return this.fecha_vencimiento_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cargo(Long newid_cargo)throws Exception
	{
		try {
			if(this.id_cargo!=newid_cargo) {
				if(newid_cargo==null) {
					//newid_cargo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id_cargo");
					}
				}

				this.id_cargo=newid_cargo;
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
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
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
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_prestamo(Long newid_tipo_prestamo)throws Exception
	{
		try {
			if(this.id_tipo_prestamo!=newid_tipo_prestamo) {
				if(newid_tipo_prestamo==null) {
					//newid_tipo_prestamo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna id_tipo_prestamo");
					}
				}

				this.id_tipo_prestamo=newid_tipo_prestamo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_vencimiento_desde(Date newfecha_vencimiento_desde)throws Exception
	{
		try {
			if(this.fecha_vencimiento_desde!=newfecha_vencimiento_desde) {
				if(newfecha_vencimiento_desde==null) {
					//newfecha_vencimiento_desde=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna fecha_vencimiento_desde");
					}
				}

				this.fecha_vencimiento_desde=newfecha_vencimiento_desde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_vencimiento_hasta(Date newfecha_vencimiento_hasta)throws Exception
	{
		try {
			if(this.fecha_vencimiento_hasta!=newfecha_vencimiento_hasta) {
				if(newfecha_vencimiento_hasta==null) {
					//newfecha_vencimiento_hasta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CreditosDetallados:Valor nulo no permitido en columna fecha_vencimiento_hasta");
					}
				}

				this.fecha_vencimiento_hasta=newfecha_vencimiento_hasta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCargo() {
		return isBusquedaDesdeForeignKeySesionCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionCargo(
		Boolean isBusquedaDesdeForeignKeySesionCargo) {
		this.isBusquedaDesdeForeignKeySesionCargo = isBusquedaDesdeForeignKeySesionCargo;
	}

	public Long getlidCargoActual() {
		return lidCargoActual;
	}

	public void setlidCargoActual(Long lidCargoActual) {
		this.lidCargoActual = lidCargoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrestamo() {
		return isBusquedaDesdeForeignKeySesionTipoPrestamo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrestamo(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrestamo) {
		this.isBusquedaDesdeForeignKeySesionTipoPrestamo = isBusquedaDesdeForeignKeySesionTipoPrestamo;
	}

	public Long getlidTipoPrestamoActual() {
		return lidTipoPrestamoActual;
	}

	public void setlidTipoPrestamoActual(Long lidTipoPrestamoActual) {
		this.lidTipoPrestamoActual = lidTipoPrestamoActual;
	}
	
	
		
	
}
