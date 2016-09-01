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
public class DetalleCuentaFlujoCajaSessionBean  extends DetalleCuentaFlujoCajaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja;
	protected Long lIdDetalleCuentaFlujoCajaActualForeignKey;	
	
	protected Long lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras;
	protected String sUltimaBusquedaDetalleCuentaFlujoCaja;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoOperacion;
	Long lidTipoOperacionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaFlujoCaja;
	Long lidCuentaFlujoCajaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_tipo_operacion;
	private Long id_cuenta_flujo_caja;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleCuentaFlujoCajaSessionBeanAdditional detallecuentaflujocajaSessionBeanAdditional=null;
	
	public DetalleCuentaFlujoCajaSessionBeanAdditional getDetalleCuentaFlujoCajaSessionBeanAdditional() {
		return this.detallecuentaflujocajaSessionBeanAdditional;
	}
	
	public void setDetalleCuentaFlujoCajaSessionBeanAdditional(DetalleCuentaFlujoCajaSessionBeanAdditional detallecuentaflujocajaSessionBeanAdditional) {
		try {
			this.detallecuentaflujocajaSessionBeanAdditional=detallecuentaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleCuentaFlujoCajaSessionBean () {
		this.inicializarDetalleCuentaFlujoCajaSessionBean();
	}
	
	public void inicializarDetalleCuentaFlujoCajaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja=false;
		this.lIdDetalleCuentaFlujoCajaActualForeignKey=0L;
		this.lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleCuentaFlujoCaja ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoOperacion=false;
		lidTipoOperacionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaFlujoCaja=false;
		lidCuentaFlujoCajaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_tipo_operacion=-1L;
 		this.id_cuenta_flujo_caja=-1L;
 		this.id_cuenta_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja= isPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja= isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCaja;
	}
					
	public Long getlIdDetalleCuentaFlujoCajaActualForeignKey() {
		return lIdDetalleCuentaFlujoCajaActualForeignKey;
	}

	public void setlIdDetalleCuentaFlujoCajaActualForeignKey(
			Long lIdDetalleCuentaFlujoCajaActualForeignKey) {
		this.lIdDetalleCuentaFlujoCajaActualForeignKey = lIdDetalleCuentaFlujoCajaActualForeignKey;
	}
				    
	public Long getlIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras() {
		return lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras(
			Long lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras = lIdDetalleCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleCuentaFlujoCajaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleCuentaFlujoCaja() {
		return sUltimaBusquedaDetalleCuentaFlujoCaja;
	}

	public void setsUltimaBusquedaDetalleCuentaFlujoCaja(String sUltimaBusquedaDetalleCuentaFlujoCaja) {
		this.sUltimaBusquedaDetalleCuentaFlujoCaja = sUltimaBusquedaDetalleCuentaFlujoCaja;
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
    
	public Long getid_tipo_operacion() {
		return this.id_tipo_operacion;
	}
    
	public Long getid_cuenta_flujo_caja() {
		return this.id_cuenta_flujo_caja;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCuentaFlujoCaja:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_operacion(Long newid_tipo_operacion)throws Exception
	{
		try {
			if(this.id_tipo_operacion!=newid_tipo_operacion) {
				if(newid_tipo_operacion==null) {
					//newid_tipo_operacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCuentaFlujoCaja:Valor nulo no permitido en columna id_tipo_operacion");
					}
				}

				this.id_tipo_operacion=newid_tipo_operacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_flujo_caja(Long newid_cuenta_flujo_caja)throws Exception
	{
		try {
			if(this.id_cuenta_flujo_caja!=newid_cuenta_flujo_caja) {
				if(newid_cuenta_flujo_caja==null) {
					//newid_cuenta_flujo_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleCuentaFlujoCaja:Valor nulo no permitido en columna id_cuenta_flujo_caja");
					}
				}

				this.id_cuenta_flujo_caja=newid_cuenta_flujo_caja;
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
						System.out.println("DetalleCuentaFlujoCaja:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoOperacion() {
		return isBusquedaDesdeForeignKeySesionTipoOperacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoOperacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoOperacion) {
		this.isBusquedaDesdeForeignKeySesionTipoOperacion = isBusquedaDesdeForeignKeySesionTipoOperacion;
	}

	public Long getlidTipoOperacionActual() {
		return lidTipoOperacionActual;
	}

	public void setlidTipoOperacionActual(Long lidTipoOperacionActual) {
		this.lidTipoOperacionActual = lidTipoOperacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionCuentaFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaFlujoCaja(
		Boolean isBusquedaDesdeForeignKeySesionCuentaFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionCuentaFlujoCaja = isBusquedaDesdeForeignKeySesionCuentaFlujoCaja;
	}

	public Long getlidCuentaFlujoCajaActual() {
		return lidCuentaFlujoCajaActual;
	}

	public void setlidCuentaFlujoCajaActual(Long lidCuentaFlujoCajaActual) {
		this.lidCuentaFlujoCajaActual = lidCuentaFlujoCajaActual;
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
	
	
		
	
}
