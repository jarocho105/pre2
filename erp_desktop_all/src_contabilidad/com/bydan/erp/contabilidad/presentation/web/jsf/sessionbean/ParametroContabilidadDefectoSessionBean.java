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
public class ParametroContabilidadDefectoSessionBean  extends ParametroContabilidadDefectoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto;
	protected Long lIdParametroContabilidadDefectoActualForeignKey;	
	
	protected Long lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras;
	protected String sUltimaBusquedaParametroContabilidadDefecto;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoMoneda;
	Long lidTipoMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo;
	Long lidTipoIntervaloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	Long lidEstadoAsientoContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_moneda;
	private Long id_moneda;
	private Long id_modulo;
	private Long id_tipo_intervalo;
	private Long id_tipo_movimiento;
	private Long id_tipo_documento;
	private Long id_estado_asiento_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroContabilidadDefectoSessionBeanAdditional parametrocontabilidaddefectoSessionBeanAdditional=null;
	
	public ParametroContabilidadDefectoSessionBeanAdditional getParametroContabilidadDefectoSessionBeanAdditional() {
		return this.parametrocontabilidaddefectoSessionBeanAdditional;
	}
	
	public void setParametroContabilidadDefectoSessionBeanAdditional(ParametroContabilidadDefectoSessionBeanAdditional parametrocontabilidaddefectoSessionBeanAdditional) {
		try {
			this.parametrocontabilidaddefectoSessionBeanAdditional=parametrocontabilidaddefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroContabilidadDefectoSessionBean () {
		this.inicializarParametroContabilidadDefectoSessionBean();
	}
	
	public void inicializarParametroContabilidadDefectoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto=false;
		this.lIdParametroContabilidadDefectoActualForeignKey=0L;
		this.lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras=false;
		this.sUltimaBusquedaParametroContabilidadDefecto ="";
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
		isBusquedaDesdeForeignKeySesionTipoMoneda=false;
		lidTipoMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIntervalo=false;
		lidTipoIntervaloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoAsientoContable=false;
		lidEstadoAsientoContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_moneda=-1L;
 		this.id_moneda=-1L;
 		this.id_modulo=-1L;
 		this.id_tipo_intervalo=-1L;
 		this.id_tipo_movimiento=-1L;
 		this.id_tipo_documento=-1L;
 		this.id_estado_asiento_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto= isPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto= isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefecto;
	}
					
	public Long getlIdParametroContabilidadDefectoActualForeignKey() {
		return lIdParametroContabilidadDefectoActualForeignKey;
	}

	public void setlIdParametroContabilidadDefectoActualForeignKey(
			Long lIdParametroContabilidadDefectoActualForeignKey) {
		this.lIdParametroContabilidadDefectoActualForeignKey = lIdParametroContabilidadDefectoActualForeignKey;
	}
				    
	public Long getlIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras() {
		return lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras(
			Long lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras) {
		this.lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras = lIdParametroContabilidadDefectoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroContabilidadDefectoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroContabilidadDefecto() {
		return sUltimaBusquedaParametroContabilidadDefecto;
	}

	public void setsUltimaBusquedaParametroContabilidadDefecto(String sUltimaBusquedaParametroContabilidadDefecto) {
		this.sUltimaBusquedaParametroContabilidadDefecto = sUltimaBusquedaParametroContabilidadDefecto;
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
    
	public Long getid_tipo_moneda() {
		return this.id_tipo_moneda;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_tipo_intervalo() {
		return this.id_tipo_intervalo;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Long getid_estado_asiento_contable() {
		return this.id_estado_asiento_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_moneda(Long newid_tipo_moneda)throws Exception
	{
		try {
			if(this.id_tipo_moneda!=newid_tipo_moneda) {
				if(newid_tipo_moneda==null) {
					//newid_tipo_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_tipo_moneda");
					}
				}

				this.id_tipo_moneda=newid_tipo_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_intervalo(Long newid_tipo_intervalo)throws Exception
	{
		try {
			if(this.id_tipo_intervalo!=newid_tipo_intervalo) {
				if(newid_tipo_intervalo==null) {
					//newid_tipo_intervalo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_tipo_intervalo");
					}
				}

				this.id_tipo_intervalo=newid_tipo_intervalo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento)throws Exception
	{
		try {
			if(this.id_tipo_movimiento!=newid_tipo_movimiento) {
				if(newid_tipo_movimiento==null) {
					//newid_tipo_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_asiento_contable(Long newid_estado_asiento_contable)throws Exception
	{
		try {
			if(this.id_estado_asiento_contable!=newid_estado_asiento_contable) {
				if(newid_estado_asiento_contable==null) {
					//newid_estado_asiento_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContabilidadDefecto:Valor nulo no permitido en columna id_estado_asiento_contable");
					}
				}

				this.id_estado_asiento_contable=newid_estado_asiento_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMoneda() {
		return isBusquedaDesdeForeignKeySesionTipoMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMoneda(
		Boolean isBusquedaDesdeForeignKeySesionTipoMoneda) {
		this.isBusquedaDesdeForeignKeySesionTipoMoneda = isBusquedaDesdeForeignKeySesionTipoMoneda;
	}

	public Long getlidTipoMonedaActual() {
		return lidTipoMonedaActual;
	}

	public void setlidTipoMonedaActual(Long lidTipoMonedaActual) {
		this.lidTipoMonedaActual = lidTipoMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIntervalo() {
		return isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIntervalo(
		Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo) {
		this.isBusquedaDesdeForeignKeySesionTipoIntervalo = isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public Long getlidTipoIntervaloActual() {
		return lidTipoIntervaloActual;
	}

	public void setlidTipoIntervaloActual(Long lidTipoIntervaloActual) {
		this.lidTipoIntervaloActual = lidTipoIntervaloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoAsientoContable() {
		return isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionEstadoAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionEstadoAsientoContable = isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	}

	public Long getlidEstadoAsientoContableActual() {
		return lidEstadoAsientoContableActual;
	}

	public void setlidEstadoAsientoContableActual(Long lidEstadoAsientoContableActual) {
		this.lidEstadoAsientoContableActual = lidEstadoAsientoContableActual;
	}
	
	
		
	
}
