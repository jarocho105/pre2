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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class InformacionEconomicaSessionBean  extends InformacionEconomicaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica;
	protected Long lIdInformacionEconomicaActualForeignKey;	
	
	protected Long lIdInformacionEconomicaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras;
	protected String sUltimaBusquedaInformacionEconomica;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoVinculacion;
	Long lidTipoVinculacionActual;
	
	private Long id;
	private Long idcliente;
	private Long idvalorclientevinculacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected InformacionEconomicaSessionBeanAdditional informacioneconomicaSessionBeanAdditional=null;
	
	public InformacionEconomicaSessionBeanAdditional getInformacionEconomicaSessionBeanAdditional() {
		return this.informacioneconomicaSessionBeanAdditional;
	}
	
	public void setInformacionEconomicaSessionBeanAdditional(InformacionEconomicaSessionBeanAdditional informacioneconomicaSessionBeanAdditional) {
		try {
			this.informacioneconomicaSessionBeanAdditional=informacioneconomicaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public InformacionEconomicaSessionBean () {
		this.inicializarInformacionEconomicaSessionBean();
	}
	
	public void inicializarInformacionEconomicaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica=false;
		this.lIdInformacionEconomicaActualForeignKey=0L;
		this.lIdInformacionEconomicaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras=false;
		this.sUltimaBusquedaInformacionEconomica ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoVinculacion=false;
		lidTipoVinculacionActual=0L; 
		
		
		
 		this.idcliente=-1L;
 		this.idvalorclientevinculacion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica= isPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica(String sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica = sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica() {
		return isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica= isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica;
	}
					
	public Long getlIdInformacionEconomicaActualForeignKey() {
		return lIdInformacionEconomicaActualForeignKey;
	}

	public void setlIdInformacionEconomicaActualForeignKey(
			Long lIdInformacionEconomicaActualForeignKey) {
		this.lIdInformacionEconomicaActualForeignKey = lIdInformacionEconomicaActualForeignKey;
	}
				    
	public Long getlIdInformacionEconomicaActualForeignKeyParaPosibleAtras() {
		return lIdInformacionEconomicaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdInformacionEconomicaActualForeignKeyParaPosibleAtras(
			Long lIdInformacionEconomicaActualForeignKeyParaPosibleAtras) {
		this.lIdInformacionEconomicaActualForeignKeyParaPosibleAtras = lIdInformacionEconomicaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomicaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaInformacionEconomica() {
		return sUltimaBusquedaInformacionEconomica;
	}

	public void setsUltimaBusquedaInformacionEconomica(String sUltimaBusquedaInformacionEconomica) {
		this.sUltimaBusquedaInformacionEconomica = sUltimaBusquedaInformacionEconomica;
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
    
	public Long getidcliente() {
		return this.idcliente;
	}
    
	public Long getidvalorclientevinculacion() {
		return this.idvalorclientevinculacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionEconomica:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidcliente(Long newidcliente)throws Exception
	{
		try {
			if(this.idcliente!=newidcliente) {
				if(newidcliente==null) {
					//newidcliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionEconomica:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientevinculacion(Long newidvalorclientevinculacion)throws Exception
	{
		try {
			if(this.idvalorclientevinculacion!=newidvalorclientevinculacion) {
				if(newidvalorclientevinculacion==null) {
					//newidvalorclientevinculacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionEconomica:Valor nulo no permitido en columna idvalorclientevinculacion");
					}
				}

				this.idvalorclientevinculacion=newidvalorclientevinculacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoVinculacion() {
		return isBusquedaDesdeForeignKeySesionTipoVinculacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoVinculacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoVinculacion) {
		this.isBusquedaDesdeForeignKeySesionTipoVinculacion = isBusquedaDesdeForeignKeySesionTipoVinculacion;
	}

	public Long getlidTipoVinculacionActual() {
		return lidTipoVinculacionActual;
	}

	public void setlidTipoVinculacionActual(Long lidTipoVinculacionActual) {
		this.lidTipoVinculacionActual = lidTipoVinculacionActual;
	}
	
	
		
	
}
