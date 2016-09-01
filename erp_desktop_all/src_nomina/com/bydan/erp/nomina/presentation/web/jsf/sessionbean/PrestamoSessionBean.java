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
public class PrestamoSessionBean  extends PrestamoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePrestamo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrestamo;
	protected Long lIdPrestamoActualForeignKey;	
	
	protected Long lIdPrestamoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras;
	protected String sUltimaBusquedaPrestamo;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoPrestamo;
	Long lidTipoPrestamoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuota;
	Long lidTipoCuotaActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_tipo_prestamo;
	private Long id_tipo_cuota;
	private Long id_asiento_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PrestamoSessionBeanAdditional prestamoSessionBeanAdditional=null;
	
	public PrestamoSessionBeanAdditional getPrestamoSessionBeanAdditional() {
		return this.prestamoSessionBeanAdditional;
	}
	
	public void setPrestamoSessionBeanAdditional(PrestamoSessionBeanAdditional prestamoSessionBeanAdditional) {
		try {
			this.prestamoSessionBeanAdditional=prestamoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PrestamoSessionBean () {
		this.inicializarPrestamoSessionBean();
	}
	
	public void inicializarPrestamoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePrestamo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrestamo=false;
		this.lIdPrestamoActualForeignKey=0L;
		this.lIdPrestamoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras=false;
		this.sUltimaBusquedaPrestamo ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrestamo=false;
		lidTipoPrestamoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuota=false;
		lidTipoCuotaActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_prestamo=-1L;
 		this.id_tipo_cuota=-1L;
 		this.id_asiento_contable=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePrestamo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePrestamo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePrestamo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePrestamo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePrestamo= isPermiteNavegacionHaciaForeignKeyDesdePrestamo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo(String sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo = sNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPrestamo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPrestamo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPrestamo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrestamo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrestamo= isBusquedaDesdeForeignKeySesionForeignKeyPrestamo;
	}
					
	public Long getlIdPrestamoActualForeignKey() {
		return lIdPrestamoActualForeignKey;
	}

	public void setlIdPrestamoActualForeignKey(
			Long lIdPrestamoActualForeignKey) {
		this.lIdPrestamoActualForeignKey = lIdPrestamoActualForeignKey;
	}
				    
	public Long getlIdPrestamoActualForeignKeyParaPosibleAtras() {
		return lIdPrestamoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPrestamoActualForeignKeyParaPosibleAtras(
			Long lIdPrestamoActualForeignKeyParaPosibleAtras) {
		this.lIdPrestamoActualForeignKeyParaPosibleAtras = lIdPrestamoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPrestamoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPrestamo() {
		return sUltimaBusquedaPrestamo;
	}

	public void setsUltimaBusquedaPrestamo(String sUltimaBusquedaPrestamo) {
		this.sUltimaBusquedaPrestamo = sUltimaBusquedaPrestamo;
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
    
	public Long getid_tipo_prestamo() {
		return this.id_tipo_prestamo;
	}
    
	public Long getid_tipo_cuota() {
		return this.id_tipo_cuota;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Prestamo:Valor nulo no permitido en columna id");
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
						System.out.println("Prestamo:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Prestamo:Valor nulo no permitido en columna id_empleado");
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
						System.out.println("Prestamo:Valor nulo no permitido en columna id_tipo_prestamo");
					}
				}

				this.id_tipo_prestamo=newid_tipo_prestamo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuota(Long newid_tipo_cuota)throws Exception
	{
		try {
			if(this.id_tipo_cuota!=newid_tipo_cuota) {
				if(newid_tipo_cuota==null) {
					//newid_tipo_cuota=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Prestamo:Valor nulo no permitido en columna id_tipo_cuota");
					}
				}

				this.id_tipo_cuota=newid_tipo_cuota;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable) {
		if(this.id_asiento_contable!=newid_asiento_contable) {

			this.id_asiento_contable=newid_asiento_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuota() {
		return isBusquedaDesdeForeignKeySesionTipoCuota;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuota(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuota) {
		this.isBusquedaDesdeForeignKeySesionTipoCuota = isBusquedaDesdeForeignKeySesionTipoCuota;
	}

	public Long getlidTipoCuotaActual() {
		return lidTipoCuotaActual;
	}

	public void setlidTipoCuotaActual(Long lidTipoCuotaActual) {
		this.lidTipoCuotaActual = lidTipoCuotaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAsientoContable() {
		return isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionAsientoContable = isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public Long getlidAsientoContableActual() {
		return lidAsientoContableActual;
	}

	public void setlidAsientoContableActual(Long lidAsientoContableActual) {
		this.lidAsientoContableActual = lidAsientoContableActual;
	}
	
	
		
	
}
