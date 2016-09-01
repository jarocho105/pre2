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
public class ParametroContaDetalleSessionBean  extends ParametroContaDetalleSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle;
	protected Long lIdParametroContaDetalleActualForeignKey;	
	
	protected Long lIdParametroContaDetalleActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras;
	protected String sUltimaBusquedaParametroContaDetalle;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionParametroConta;
	Long lidParametroContaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoParametroConta;
	Long lidTipoParametroContaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_parametro_conta;
	private Long id_tipo_parametro_conta;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroContaDetalleSessionBeanAdditional parametrocontadetalleSessionBeanAdditional=null;
	
	public ParametroContaDetalleSessionBeanAdditional getParametroContaDetalleSessionBeanAdditional() {
		return this.parametrocontadetalleSessionBeanAdditional;
	}
	
	public void setParametroContaDetalleSessionBeanAdditional(ParametroContaDetalleSessionBeanAdditional parametrocontadetalleSessionBeanAdditional) {
		try {
			this.parametrocontadetalleSessionBeanAdditional=parametrocontadetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroContaDetalleSessionBean () {
		this.inicializarParametroContaDetalleSessionBean();
	}
	
	public void inicializarParametroContaDetalleSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle=false;
		this.lIdParametroContaDetalleActualForeignKey=0L;
		this.lIdParametroContaDetalleActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras=false;
		this.sUltimaBusquedaParametroContaDetalle ="";
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
		
		
		isBusquedaDesdeForeignKeySesionParametroConta=false;
		lidParametroContaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoParametroConta=false;
		lidTipoParametroContaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_parametro_conta=-1L;
 		this.id_tipo_parametro_conta=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle= isPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle= isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle;
	}
					
	public Long getlIdParametroContaDetalleActualForeignKey() {
		return lIdParametroContaDetalleActualForeignKey;
	}

	public void setlIdParametroContaDetalleActualForeignKey(
			Long lIdParametroContaDetalleActualForeignKey) {
		this.lIdParametroContaDetalleActualForeignKey = lIdParametroContaDetalleActualForeignKey;
	}
				    
	public Long getlIdParametroContaDetalleActualForeignKeyParaPosibleAtras() {
		return lIdParametroContaDetalleActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroContaDetalleActualForeignKeyParaPosibleAtras(
			Long lIdParametroContaDetalleActualForeignKeyParaPosibleAtras) {
		this.lIdParametroContaDetalleActualForeignKeyParaPosibleAtras = lIdParametroContaDetalleActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalleParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroContaDetalle() {
		return sUltimaBusquedaParametroContaDetalle;
	}

	public void setsUltimaBusquedaParametroContaDetalle(String sUltimaBusquedaParametroContaDetalle) {
		this.sUltimaBusquedaParametroContaDetalle = sUltimaBusquedaParametroContaDetalle;
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
    
	public Long getid_parametro_conta() {
		return this.id_parametro_conta;
	}
    
	public Long getid_tipo_parametro_conta() {
		return this.id_tipo_parametro_conta;
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
						System.out.println("ParametroContaDetalle:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_parametro_conta(Long newid_parametro_conta)throws Exception
	{
		try {
			if(this.id_parametro_conta!=newid_parametro_conta) {
				if(newid_parametro_conta==null) {
					//newid_parametro_conta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContaDetalle:Valor nulo no permitido en columna id_parametro_conta");
					}
				}

				this.id_parametro_conta=newid_parametro_conta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_parametro_conta(Long newid_tipo_parametro_conta)throws Exception
	{
		try {
			if(this.id_tipo_parametro_conta!=newid_tipo_parametro_conta) {
				if(newid_tipo_parametro_conta==null) {
					//newid_tipo_parametro_conta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroContaDetalle:Valor nulo no permitido en columna id_tipo_parametro_conta");
					}
				}

				this.id_tipo_parametro_conta=newid_tipo_parametro_conta;
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
						System.out.println("ParametroContaDetalle:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionParametroConta() {
		return isBusquedaDesdeForeignKeySesionParametroConta;
	}

	public void setisBusquedaDesdeForeignKeySesionParametroConta(
		Boolean isBusquedaDesdeForeignKeySesionParametroConta) {
		this.isBusquedaDesdeForeignKeySesionParametroConta = isBusquedaDesdeForeignKeySesionParametroConta;
	}

	public Long getlidParametroContaActual() {
		return lidParametroContaActual;
	}

	public void setlidParametroContaActual(Long lidParametroContaActual) {
		this.lidParametroContaActual = lidParametroContaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParametroConta() {
		return isBusquedaDesdeForeignKeySesionTipoParametroConta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParametroConta(
		Boolean isBusquedaDesdeForeignKeySesionTipoParametroConta) {
		this.isBusquedaDesdeForeignKeySesionTipoParametroConta = isBusquedaDesdeForeignKeySesionTipoParametroConta;
	}

	public Long getlidTipoParametroContaActual() {
		return lidTipoParametroContaActual;
	}

	public void setlidTipoParametroContaActual(Long lidTipoParametroContaActual) {
		this.lidTipoParametroContaActual = lidTipoParametroContaActual;
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
