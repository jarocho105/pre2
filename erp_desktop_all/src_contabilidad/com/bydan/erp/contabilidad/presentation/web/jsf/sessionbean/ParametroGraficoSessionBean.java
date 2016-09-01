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
public class ParametroGraficoSessionBean  extends ParametroGraficoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico;
	protected Long lIdParametroGraficoActualForeignKey;	
	
	protected Long lIdParametroGraficoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras;
	protected String sUltimaBusquedaParametroGrafico;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	Long lidCuentaContableActivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	Long lidCuentaContablePasivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	Long lidCuentaContableInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad;
	Long lidCuentaContableDisponibilidadActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	Long lidCuentaContableCostoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni;
	Long lidCuentaContableInventarioIniActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin;
	Long lidCuentaContableInventarioFinActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar;
	Long lidCuentaContableCuentasCobrarActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito;
	Long lidCuentaContableVentaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal;
	Long lidCuentaContableActivoTotalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal;
	Long lidCuentaContablePasivoTotalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	Long lidCuentaContablePatrimonioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal;
	Long lidCuentaContablePatrimonioTotalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	Long lidCuentaContableVentaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cuenta_contable_activo;
	private Long id_cuenta_contable_pasivo;
	private Long id_cuenta_contable_inventario;
	private Long id_cuenta_contable_disponibilidad;
	private Long id_cuenta_contable_costo_venta;
	private Long id_cuenta_contable_inventario_ini;
	private Long id_cuenta_contable_inventario_fin;
	private Long id_cuenta_contable_cuenta_cobrar;
	private Long id_cuenta_contable_venta_credito;
	private Long id_cuenta_contable_activo_total;
	private Long id_cuenta_contable_pasivo_total;
	private Long id_cuenta_contable_patrimonio;
	private Long id_cuenta_contable_patrimonio_total;
	private Long id_cuenta_contable_venta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroGraficoSessionBeanAdditional parametrograficoSessionBeanAdditional=null;
	
	public ParametroGraficoSessionBeanAdditional getParametroGraficoSessionBeanAdditional() {
		return this.parametrograficoSessionBeanAdditional;
	}
	
	public void setParametroGraficoSessionBeanAdditional(ParametroGraficoSessionBeanAdditional parametrograficoSessionBeanAdditional) {
		try {
			this.parametrograficoSessionBeanAdditional=parametrograficoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroGraficoSessionBean () {
		this.inicializarParametroGraficoSessionBean();
	}
	
	public void inicializarParametroGraficoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico=false;
		this.lIdParametroGraficoActualForeignKey=0L;
		this.lIdParametroGraficoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras=false;
		this.sUltimaBusquedaParametroGrafico ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableActivo=false;
		lidCuentaContableActivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePasivo=false;
		lidCuentaContablePasivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventario=false;
		lidCuentaContableInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad=false;
		lidCuentaContableDisponibilidadActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta=false;
		lidCuentaContableCostoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni=false;
		lidCuentaContableInventarioIniActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin=false;
		lidCuentaContableInventarioFinActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar=false;
		lidCuentaContableCuentasCobrarActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito=false;
		lidCuentaContableVentaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal=false;
		lidCuentaContableActivoTotalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal=false;
		lidCuentaContablePasivoTotalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio=false;
		lidCuentaContablePatrimonioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal=false;
		lidCuentaContablePatrimonioTotalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVenta=false;
		lidCuentaContableVentaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cuenta_contable_activo=-1L;
 		this.id_cuenta_contable_pasivo=-1L;
 		this.id_cuenta_contable_inventario=-1L;
 		this.id_cuenta_contable_disponibilidad=-1L;
 		this.id_cuenta_contable_costo_venta=-1L;
 		this.id_cuenta_contable_inventario_ini=-1L;
 		this.id_cuenta_contable_inventario_fin=-1L;
 		this.id_cuenta_contable_cuenta_cobrar=-1L;
 		this.id_cuenta_contable_venta_credito=-1L;
 		this.id_cuenta_contable_activo_total=-1L;
 		this.id_cuenta_contable_pasivo_total=-1L;
 		this.id_cuenta_contable_patrimonio=-1L;
 		this.id_cuenta_contable_patrimonio_total=-1L;
 		this.id_cuenta_contable_venta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico= isPermiteNavegacionHaciaForeignKeyDesdeParametroGrafico;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGrafico;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico= isBusquedaDesdeForeignKeySesionForeignKeyParametroGrafico;
	}
					
	public Long getlIdParametroGraficoActualForeignKey() {
		return lIdParametroGraficoActualForeignKey;
	}

	public void setlIdParametroGraficoActualForeignKey(
			Long lIdParametroGraficoActualForeignKey) {
		this.lIdParametroGraficoActualForeignKey = lIdParametroGraficoActualForeignKey;
	}
				    
	public Long getlIdParametroGraficoActualForeignKeyParaPosibleAtras() {
		return lIdParametroGraficoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroGraficoActualForeignKeyParaPosibleAtras(
			Long lIdParametroGraficoActualForeignKeyParaPosibleAtras) {
		this.lIdParametroGraficoActualForeignKeyParaPosibleAtras = lIdParametroGraficoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroGraficoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroGrafico() {
		return sUltimaBusquedaParametroGrafico;
	}

	public void setsUltimaBusquedaParametroGrafico(String sUltimaBusquedaParametroGrafico) {
		this.sUltimaBusquedaParametroGrafico = sUltimaBusquedaParametroGrafico;
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
    
	public Long getid_cuenta_contable_activo() {
		return this.id_cuenta_contable_activo;
	}
    
	public Long getid_cuenta_contable_pasivo() {
		return this.id_cuenta_contable_pasivo;
	}
    
	public Long getid_cuenta_contable_inventario() {
		return this.id_cuenta_contable_inventario;
	}
    
	public Long getid_cuenta_contable_disponibilidad() {
		return this.id_cuenta_contable_disponibilidad;
	}
    
	public Long getid_cuenta_contable_costo_venta() {
		return this.id_cuenta_contable_costo_venta;
	}
    
	public Long getid_cuenta_contable_inventario_ini() {
		return this.id_cuenta_contable_inventario_ini;
	}
    
	public Long getid_cuenta_contable_inventario_fin() {
		return this.id_cuenta_contable_inventario_fin;
	}
    
	public Long getid_cuenta_contable_cuenta_cobrar() {
		return this.id_cuenta_contable_cuenta_cobrar;
	}
    
	public Long getid_cuenta_contable_venta_credito() {
		return this.id_cuenta_contable_venta_credito;
	}
    
	public Long getid_cuenta_contable_activo_total() {
		return this.id_cuenta_contable_activo_total;
	}
    
	public Long getid_cuenta_contable_pasivo_total() {
		return this.id_cuenta_contable_pasivo_total;
	}
    
	public Long getid_cuenta_contable_patrimonio() {
		return this.id_cuenta_contable_patrimonio;
	}
    
	public Long getid_cuenta_contable_patrimonio_total() {
		return this.id_cuenta_contable_patrimonio_total;
	}
    
	public Long getid_cuenta_contable_venta() {
		return this.id_cuenta_contable_venta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_activo(Long newid_cuenta_contable_activo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_activo!=newid_cuenta_contable_activo) {
				if(newid_cuenta_contable_activo==null) {
					//newid_cuenta_contable_activo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_activo");
					}
				}

				this.id_cuenta_contable_activo=newid_cuenta_contable_activo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_pasivo(Long newid_cuenta_contable_pasivo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_pasivo!=newid_cuenta_contable_pasivo) {
				if(newid_cuenta_contable_pasivo==null) {
					//newid_cuenta_contable_pasivo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_pasivo");
					}
				}

				this.id_cuenta_contable_pasivo=newid_cuenta_contable_pasivo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inventario(Long newid_cuenta_contable_inventario)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario!=newid_cuenta_contable_inventario) {
				if(newid_cuenta_contable_inventario==null) {
					//newid_cuenta_contable_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_inventario");
					}
				}

				this.id_cuenta_contable_inventario=newid_cuenta_contable_inventario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_disponibilidad(Long newid_cuenta_contable_disponibilidad)throws Exception
	{
		try {
			if(this.id_cuenta_contable_disponibilidad!=newid_cuenta_contable_disponibilidad) {
				if(newid_cuenta_contable_disponibilidad==null) {
					//newid_cuenta_contable_disponibilidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_disponibilidad");
					}
				}

				this.id_cuenta_contable_disponibilidad=newid_cuenta_contable_disponibilidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo_venta(Long newid_cuenta_contable_costo_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo_venta!=newid_cuenta_contable_costo_venta) {
				if(newid_cuenta_contable_costo_venta==null) {
					//newid_cuenta_contable_costo_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_costo_venta");
					}
				}

				this.id_cuenta_contable_costo_venta=newid_cuenta_contable_costo_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inventario_ini(Long newid_cuenta_contable_inventario_ini)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario_ini!=newid_cuenta_contable_inventario_ini) {
				if(newid_cuenta_contable_inventario_ini==null) {
					//newid_cuenta_contable_inventario_ini=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_inventario_ini");
					}
				}

				this.id_cuenta_contable_inventario_ini=newid_cuenta_contable_inventario_ini;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inventario_fin(Long newid_cuenta_contable_inventario_fin)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario_fin!=newid_cuenta_contable_inventario_fin) {
				if(newid_cuenta_contable_inventario_fin==null) {
					//newid_cuenta_contable_inventario_fin=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_inventario_fin");
					}
				}

				this.id_cuenta_contable_inventario_fin=newid_cuenta_contable_inventario_fin;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_cuenta_cobrar(Long newid_cuenta_contable_cuenta_cobrar)throws Exception
	{
		try {
			if(this.id_cuenta_contable_cuenta_cobrar!=newid_cuenta_contable_cuenta_cobrar) {
				if(newid_cuenta_contable_cuenta_cobrar==null) {
					//newid_cuenta_contable_cuenta_cobrar=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_cuenta_cobrar");
					}
				}

				this.id_cuenta_contable_cuenta_cobrar=newid_cuenta_contable_cuenta_cobrar;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_venta_credito(Long newid_cuenta_contable_venta_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_venta_credito!=newid_cuenta_contable_venta_credito) {
				if(newid_cuenta_contable_venta_credito==null) {
					//newid_cuenta_contable_venta_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_venta_credito");
					}
				}

				this.id_cuenta_contable_venta_credito=newid_cuenta_contable_venta_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_activo_total(Long newid_cuenta_contable_activo_total)throws Exception
	{
		try {
			if(this.id_cuenta_contable_activo_total!=newid_cuenta_contable_activo_total) {
				if(newid_cuenta_contable_activo_total==null) {
					//newid_cuenta_contable_activo_total=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_activo_total");
					}
				}

				this.id_cuenta_contable_activo_total=newid_cuenta_contable_activo_total;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_pasivo_total(Long newid_cuenta_contable_pasivo_total)throws Exception
	{
		try {
			if(this.id_cuenta_contable_pasivo_total!=newid_cuenta_contable_pasivo_total) {
				if(newid_cuenta_contable_pasivo_total==null) {
					//newid_cuenta_contable_pasivo_total=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_pasivo_total");
					}
				}

				this.id_cuenta_contable_pasivo_total=newid_cuenta_contable_pasivo_total;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_patrimonio(Long newid_cuenta_contable_patrimonio)throws Exception
	{
		try {
			if(this.id_cuenta_contable_patrimonio!=newid_cuenta_contable_patrimonio) {
				if(newid_cuenta_contable_patrimonio==null) {
					//newid_cuenta_contable_patrimonio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_patrimonio");
					}
				}

				this.id_cuenta_contable_patrimonio=newid_cuenta_contable_patrimonio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_patrimonio_total(Long newid_cuenta_contable_patrimonio_total)throws Exception
	{
		try {
			if(this.id_cuenta_contable_patrimonio_total!=newid_cuenta_contable_patrimonio_total) {
				if(newid_cuenta_contable_patrimonio_total==null) {
					//newid_cuenta_contable_patrimonio_total=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_patrimonio_total");
					}
				}

				this.id_cuenta_contable_patrimonio_total=newid_cuenta_contable_patrimonio_total;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_venta(Long newid_cuenta_contable_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_venta!=newid_cuenta_contable_venta) {
				if(newid_cuenta_contable_venta==null) {
					//newid_cuenta_contable_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGrafico:Valor nulo no permitido en columna id_cuenta_contable_venta");
					}
				}

				this.id_cuenta_contable_venta=newid_cuenta_contable_venta;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableActivo() {
		return isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableActivo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableActivo = isBusquedaDesdeForeignKeySesionCuentaContableActivo;
	}

	public Long getlidCuentaContableActivoActual() {
		return lidCuentaContableActivoActual;
	}

	public void setlidCuentaContableActivoActual(Long lidCuentaContableActivoActual) {
		this.lidCuentaContableActivoActual = lidCuentaContableActivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePasivo() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePasivo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePasivo = isBusquedaDesdeForeignKeySesionCuentaContablePasivo;
	}

	public Long getlidCuentaContablePasivoActual() {
		return lidCuentaContablePasivoActual;
	}

	public void setlidCuentaContablePasivoActual(Long lidCuentaContablePasivoActual) {
		this.lidCuentaContablePasivoActual = lidCuentaContablePasivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInventario() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInventario(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInventario = isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public Long getlidCuentaContableInventarioActual() {
		return lidCuentaContableInventarioActual;
	}

	public void setlidCuentaContableInventarioActual(Long lidCuentaContableInventarioActual) {
		this.lidCuentaContableInventarioActual = lidCuentaContableInventarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad = isBusquedaDesdeForeignKeySesionCuentaContableDisponibilidad;
	}

	public Long getlidCuentaContableDisponibilidadActual() {
		return lidCuentaContableDisponibilidadActual;
	}

	public void setlidCuentaContableDisponibilidadActual(Long lidCuentaContableDisponibilidadActual) {
		this.lidCuentaContableDisponibilidadActual = lidCuentaContableDisponibilidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCostoVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCostoVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta = isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	}

	public Long getlidCuentaContableCostoVentaActual() {
		return lidCuentaContableCostoVentaActual;
	}

	public void setlidCuentaContableCostoVentaActual(Long lidCuentaContableCostoVentaActual) {
		this.lidCuentaContableCostoVentaActual = lidCuentaContableCostoVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInventarioIni() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInventarioIni(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni = isBusquedaDesdeForeignKeySesionCuentaContableInventarioIni;
	}

	public Long getlidCuentaContableInventarioIniActual() {
		return lidCuentaContableInventarioIniActual;
	}

	public void setlidCuentaContableInventarioIniActual(Long lidCuentaContableInventarioIniActual) {
		this.lidCuentaContableInventarioIniActual = lidCuentaContableInventarioIniActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInventarioFin() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInventarioFin(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin = isBusquedaDesdeForeignKeySesionCuentaContableInventarioFin;
	}

	public Long getlidCuentaContableInventarioFinActual() {
		return lidCuentaContableInventarioFinActual;
	}

	public void setlidCuentaContableInventarioFinActual(Long lidCuentaContableInventarioFinActual) {
		this.lidCuentaContableInventarioFinActual = lidCuentaContableInventarioFinActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar = isBusquedaDesdeForeignKeySesionCuentaContableCuentasCobrar;
	}

	public Long getlidCuentaContableCuentasCobrarActual() {
		return lidCuentaContableCuentasCobrarActual;
	}

	public void setlidCuentaContableCuentasCobrarActual(Long lidCuentaContableCuentasCobrarActual) {
		this.lidCuentaContableCuentasCobrarActual = lidCuentaContableCuentasCobrarActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableVentaCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableVentaCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito = isBusquedaDesdeForeignKeySesionCuentaContableVentaCredito;
	}

	public Long getlidCuentaContableVentaCreditoActual() {
		return lidCuentaContableVentaCreditoActual;
	}

	public void setlidCuentaContableVentaCreditoActual(Long lidCuentaContableVentaCreditoActual) {
		this.lidCuentaContableVentaCreditoActual = lidCuentaContableVentaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableActivoTotal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableActivoTotal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal = isBusquedaDesdeForeignKeySesionCuentaContableActivoTotal;
	}

	public Long getlidCuentaContableActivoTotalActual() {
		return lidCuentaContableActivoTotalActual;
	}

	public void setlidCuentaContableActivoTotalActual(Long lidCuentaContableActivoTotalActual) {
		this.lidCuentaContableActivoTotalActual = lidCuentaContableActivoTotalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal = isBusquedaDesdeForeignKeySesionCuentaContablePasivoTotal;
	}

	public Long getlidCuentaContablePasivoTotalActual() {
		return lidCuentaContablePasivoTotalActual;
	}

	public void setlidCuentaContablePasivoTotalActual(Long lidCuentaContablePasivoTotalActual) {
		this.lidCuentaContablePasivoTotalActual = lidCuentaContablePasivoTotalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePatrimonio() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePatrimonio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio = isBusquedaDesdeForeignKeySesionCuentaContablePatrimonio;
	}

	public Long getlidCuentaContablePatrimonioActual() {
		return lidCuentaContablePatrimonioActual;
	}

	public void setlidCuentaContablePatrimonioActual(Long lidCuentaContablePatrimonioActual) {
		this.lidCuentaContablePatrimonioActual = lidCuentaContablePatrimonioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal() {
		return isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal = isBusquedaDesdeForeignKeySesionCuentaContablePatrimonioTotal;
	}

	public Long getlidCuentaContablePatrimonioTotalActual() {
		return lidCuentaContablePatrimonioTotalActual;
	}

	public void setlidCuentaContablePatrimonioTotalActual(Long lidCuentaContablePatrimonioTotalActual) {
		this.lidCuentaContablePatrimonioTotalActual = lidCuentaContablePatrimonioTotalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableVenta = isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public Long getlidCuentaContableVentaActual() {
		return lidCuentaContableVentaActual;
	}

	public void setlidCuentaContableVentaActual(Long lidCuentaContableVentaActual) {
		this.lidCuentaContableVentaActual = lidCuentaContableVentaActual;
	}
	
	
		
	
}
