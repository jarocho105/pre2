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
public class AccionistaSessionBean  extends AccionistaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAccionista;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAccionista;
	protected Long lIdAccionistaActualForeignKey;	
	
	protected Long lIdAccionistaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras;
	protected String sUltimaBusquedaAccionista;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoInversion;
	Long lidTipoInversionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	Long lidTipoIdentificacionActual;
	
	private Long id;
	private Long idcliente;
	private Long idvalorclienteinversion;
	private Long idvaloridentificacion;
	private String nombrecorto;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AccionistaSessionBeanAdditional accionistaSessionBeanAdditional=null;
	
	public AccionistaSessionBeanAdditional getAccionistaSessionBeanAdditional() {
		return this.accionistaSessionBeanAdditional;
	}
	
	public void setAccionistaSessionBeanAdditional(AccionistaSessionBeanAdditional accionistaSessionBeanAdditional) {
		try {
			this.accionistaSessionBeanAdditional=accionistaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AccionistaSessionBean () {
		this.inicializarAccionistaSessionBean();
	}
	
	public void inicializarAccionistaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAccionista=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAccionista=false;
		this.lIdAccionistaActualForeignKey=0L;
		this.lIdAccionistaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras=false;
		this.sUltimaBusquedaAccionista ="";
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
		isBusquedaDesdeForeignKeySesionTipoInversion=false;
		lidTipoInversionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIdentificacion=false;
		lidTipoIdentificacionActual=0L; 
		
		
		
 		this.idcliente=-1L;
 		this.idvalorclienteinversion=-1L;
 		this.idvaloridentificacion=-1L;
 		this.nombrecorto="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAccionista() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAccionista;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAccionista(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAccionista) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAccionista= isPermiteNavegacionHaciaForeignKeyDesdeAccionista;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista = sNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAccionista() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAccionista;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAccionista(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAccionista) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAccionista= isBusquedaDesdeForeignKeySesionForeignKeyAccionista;
	}
					
	public Long getlIdAccionistaActualForeignKey() {
		return lIdAccionistaActualForeignKey;
	}

	public void setlIdAccionistaActualForeignKey(
			Long lIdAccionistaActualForeignKey) {
		this.lIdAccionistaActualForeignKey = lIdAccionistaActualForeignKey;
	}
				    
	public Long getlIdAccionistaActualForeignKeyParaPosibleAtras() {
		return lIdAccionistaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAccionistaActualForeignKeyParaPosibleAtras(
			Long lIdAccionistaActualForeignKeyParaPosibleAtras) {
		this.lIdAccionistaActualForeignKeyParaPosibleAtras = lIdAccionistaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAccionistaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAccionista() {
		return sUltimaBusquedaAccionista;
	}

	public void setsUltimaBusquedaAccionista(String sUltimaBusquedaAccionista) {
		this.sUltimaBusquedaAccionista = sUltimaBusquedaAccionista;
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
    
	public Long getidvalorclienteinversion() {
		return this.idvalorclienteinversion;
	}
    
	public Long getidvaloridentificacion() {
		return this.idvaloridentificacion;
	}
    
	public String getnombrecorto() {
		return this.nombrecorto;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Accionista:Valor nulo no permitido en columna id");
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
						System.out.println("Accionista:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclienteinversion(Long newidvalorclienteinversion)throws Exception
	{
		try {
			if(this.idvalorclienteinversion!=newidvalorclienteinversion) {
				if(newidvalorclienteinversion==null) {
					//newidvalorclienteinversion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Accionista:Valor nulo no permitido en columna idvalorclienteinversion");
					}
				}

				this.idvalorclienteinversion=newidvalorclienteinversion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvaloridentificacion(Long newidvaloridentificacion)throws Exception
	{
		try {
			if(this.idvaloridentificacion!=newidvaloridentificacion) {
				if(newidvaloridentificacion==null) {
					//newidvaloridentificacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Accionista:Valor nulo no permitido en columna idvaloridentificacion");
					}
				}

				this.idvaloridentificacion=newidvaloridentificacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombrecorto(String newnombrecorto)throws Exception
	{
		try {
			if(this.nombrecorto!=newnombrecorto) {
				if(newnombrecorto==null) {
					//newnombrecorto="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Accionista:Valor nulo no permitido en columna nombrecorto");
					}
				}

				if(newnombrecorto!=null&&newnombrecorto.length()>250) {
					newnombrecorto=newnombrecorto.substring(0,248);
					System.out.println("Accionista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=250 en columna nombrecorto");
				}

				this.nombrecorto=newnombrecorto;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoInversion() {
		return isBusquedaDesdeForeignKeySesionTipoInversion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoInversion(
		Boolean isBusquedaDesdeForeignKeySesionTipoInversion) {
		this.isBusquedaDesdeForeignKeySesionTipoInversion = isBusquedaDesdeForeignKeySesionTipoInversion;
	}

	public Long getlidTipoInversionActual() {
		return lidTipoInversionActual;
	}

	public void setlidTipoInversionActual(Long lidTipoInversionActual) {
		this.lidTipoInversionActual = lidTipoInversionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIdentificacion() {
		return isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIdentificacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion) {
		this.isBusquedaDesdeForeignKeySesionTipoIdentificacion = isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public Long getlidTipoIdentificacionActual() {
		return lidTipoIdentificacionActual;
	}

	public void setlidTipoIdentificacionActual(Long lidTipoIdentificacionActual) {
		this.lidTipoIdentificacionActual = lidTipoIdentificacionActual;
	}
	
	
		
	
}
