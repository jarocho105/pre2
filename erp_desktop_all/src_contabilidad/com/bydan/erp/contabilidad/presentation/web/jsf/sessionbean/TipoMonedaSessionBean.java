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
public class TipoMonedaSessionBean  extends TipoMonedaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda;
	protected Long lIdTipoMonedaActualForeignKey;	
	
	protected Long lIdTipoMonedaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras;
	protected String sUltimaBusquedaTipoMoneda;
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
	
	
	
	private Long id;
	private String nombre;
	private String sigla;
	private String simbolo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoMonedaSessionBeanAdditional tipomonedaSessionBeanAdditional=null;
	
	public TipoMonedaSessionBeanAdditional getTipoMonedaSessionBeanAdditional() {
		return this.tipomonedaSessionBeanAdditional;
	}
	
	public void setTipoMonedaSessionBeanAdditional(TipoMonedaSessionBeanAdditional tipomonedaSessionBeanAdditional) {
		try {
			this.tipomonedaSessionBeanAdditional=tipomonedaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoMonedaSessionBean () {
		this.inicializarTipoMonedaSessionBean();
	}
	
	public void inicializarTipoMonedaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda=false;
		this.lIdTipoMonedaActualForeignKey=0L;
		this.lIdTipoMonedaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras=false;
		this.sUltimaBusquedaTipoMoneda ="";
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
		
		 
		
		
		
 		this.nombre="";
 		this.sigla="";
 		this.simbolo="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda= isPermiteNavegacionHaciaForeignKeyDesdeTipoMoneda;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoMoneda;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda= isBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda;
	}
					
	public Long getlIdTipoMonedaActualForeignKey() {
		return lIdTipoMonedaActualForeignKey;
	}

	public void setlIdTipoMonedaActualForeignKey(
			Long lIdTipoMonedaActualForeignKey) {
		this.lIdTipoMonedaActualForeignKey = lIdTipoMonedaActualForeignKey;
	}
				    
	public Long getlIdTipoMonedaActualForeignKeyParaPosibleAtras() {
		return lIdTipoMonedaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoMonedaActualForeignKeyParaPosibleAtras(
			Long lIdTipoMonedaActualForeignKeyParaPosibleAtras) {
		this.lIdTipoMonedaActualForeignKeyParaPosibleAtras = lIdTipoMonedaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoMonedaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoMoneda() {
		return sUltimaBusquedaTipoMoneda;
	}

	public void setsUltimaBusquedaTipoMoneda(String sUltimaBusquedaTipoMoneda) {
		this.sUltimaBusquedaTipoMoneda = sUltimaBusquedaTipoMoneda;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getsigla() {
		return this.sigla;
	}
    
	public String getsimbolo() {
		return this.simbolo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMoneda:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMoneda:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("TipoMoneda:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setsigla(String newsigla)throws Exception
	{
		try {
			if(this.sigla!=newsigla) {
				if(newsigla==null) {
					//newsigla="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMoneda:Valor nulo no permitido en columna sigla");
					}
				}

				if(newsigla!=null&&newsigla.length()>50) {
					newsigla=newsigla.substring(0,48);
					System.out.println("TipoMoneda:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna sigla");
				}

				this.sigla=newsigla;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setsimbolo(String newsimbolo)throws Exception
	{
		try {
			if(this.simbolo!=newsimbolo) {
				if(newsimbolo==null) {
					//newsimbolo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoMoneda:Valor nulo no permitido en columna simbolo");
					}
				}

				if(newsimbolo!=null&&newsimbolo.length()>5) {
					newsimbolo=newsimbolo.substring(0,3);
					System.out.println("TipoMoneda:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=5 en columna simbolo");
				}

				this.simbolo=newsimbolo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
