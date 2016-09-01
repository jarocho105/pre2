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
public class DatoConstitucionSessionBean  extends DatoConstitucionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion;
	protected Long lIdDatoConstitucionActualForeignKey;	
	
	protected Long lIdDatoConstitucionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras;
	protected String sUltimaBusquedaDatoConstitucion;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoCompania;
	Long lidTipoCompaniaActual;
	
	private Long id;
	private Long idcliente;
	private Long idvalorclientecompania;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DatoConstitucionSessionBeanAdditional datoconstitucionSessionBeanAdditional=null;
	
	public DatoConstitucionSessionBeanAdditional getDatoConstitucionSessionBeanAdditional() {
		return this.datoconstitucionSessionBeanAdditional;
	}
	
	public void setDatoConstitucionSessionBeanAdditional(DatoConstitucionSessionBeanAdditional datoconstitucionSessionBeanAdditional) {
		try {
			this.datoconstitucionSessionBeanAdditional=datoconstitucionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DatoConstitucionSessionBean () {
		this.inicializarDatoConstitucionSessionBean();
	}
	
	public void inicializarDatoConstitucionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion=false;
		this.lIdDatoConstitucionActualForeignKey=0L;
		this.lIdDatoConstitucionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras=false;
		this.sUltimaBusquedaDatoConstitucion ="";
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
		isBusquedaDesdeForeignKeySesionTipoCompania=false;
		lidTipoCompaniaActual=0L; 
		
		
		
 		this.idcliente=-1L;
 		this.idvalorclientecompania=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion= isPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion = sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion= isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion;
	}
					
	public Long getlIdDatoConstitucionActualForeignKey() {
		return lIdDatoConstitucionActualForeignKey;
	}

	public void setlIdDatoConstitucionActualForeignKey(
			Long lIdDatoConstitucionActualForeignKey) {
		this.lIdDatoConstitucionActualForeignKey = lIdDatoConstitucionActualForeignKey;
	}
				    
	public Long getlIdDatoConstitucionActualForeignKeyParaPosibleAtras() {
		return lIdDatoConstitucionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDatoConstitucionActualForeignKeyParaPosibleAtras(
			Long lIdDatoConstitucionActualForeignKeyParaPosibleAtras) {
		this.lIdDatoConstitucionActualForeignKeyParaPosibleAtras = lIdDatoConstitucionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDatoConstitucion() {
		return sUltimaBusquedaDatoConstitucion;
	}

	public void setsUltimaBusquedaDatoConstitucion(String sUltimaBusquedaDatoConstitucion) {
		this.sUltimaBusquedaDatoConstitucion = sUltimaBusquedaDatoConstitucion;
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
    
	public Long getidvalorclientecompania() {
		return this.idvalorclientecompania;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoConstitucion:Valor nulo no permitido en columna id");
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
						System.out.println("DatoConstitucion:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientecompania(Long newidvalorclientecompania)throws Exception
	{
		try {
			if(this.idvalorclientecompania!=newidvalorclientecompania) {
				if(newidvalorclientecompania==null) {
					//newidvalorclientecompania=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoConstitucion:Valor nulo no permitido en columna idvalorclientecompania");
					}
				}

				this.idvalorclientecompania=newidvalorclientecompania;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCompania() {
		return isBusquedaDesdeForeignKeySesionTipoCompania;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCompania(
		Boolean isBusquedaDesdeForeignKeySesionTipoCompania) {
		this.isBusquedaDesdeForeignKeySesionTipoCompania = isBusquedaDesdeForeignKeySesionTipoCompania;
	}

	public Long getlidTipoCompaniaActual() {
		return lidTipoCompaniaActual;
	}

	public void setlidTipoCompaniaActual(Long lidTipoCompaniaActual) {
		this.lidTipoCompaniaActual = lidTipoCompaniaActual;
	}
	
	
		
	
}
