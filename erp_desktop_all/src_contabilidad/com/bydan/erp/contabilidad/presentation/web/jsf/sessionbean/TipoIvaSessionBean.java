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
public class TipoIvaSessionBean  extends TipoIvaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoIva;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIva;
	protected Long lIdTipoIvaActualForeignKey;	
	
	protected Long lIdTipoIvaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras;
	protected String sUltimaBusquedaTipoIva;
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
	private String codigo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoIvaSessionBeanAdditional tipoivaSessionBeanAdditional=null;
	
	public TipoIvaSessionBeanAdditional getTipoIvaSessionBeanAdditional() {
		return this.tipoivaSessionBeanAdditional;
	}
	
	public void setTipoIvaSessionBeanAdditional(TipoIvaSessionBeanAdditional tipoivaSessionBeanAdditional) {
		try {
			this.tipoivaSessionBeanAdditional=tipoivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoIvaSessionBean () {
		this.inicializarTipoIvaSessionBean();
	}
	
	public void inicializarTipoIvaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIva=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIva=false;
		this.lIdTipoIvaActualForeignKey=0L;
		this.lIdTipoIvaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras=false;
		this.sUltimaBusquedaTipoIva ="";
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
		
		 
		
		
		
 		this.codigo="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoIva() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIva;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoIva(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoIva) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIva= isPermiteNavegacionHaciaForeignKeyDesdeTipoIva;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIva;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoIva() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoIva;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoIva(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIva) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIva= isBusquedaDesdeForeignKeySesionForeignKeyTipoIva;
	}
					
	public Long getlIdTipoIvaActualForeignKey() {
		return lIdTipoIvaActualForeignKey;
	}

	public void setlIdTipoIvaActualForeignKey(
			Long lIdTipoIvaActualForeignKey) {
		this.lIdTipoIvaActualForeignKey = lIdTipoIvaActualForeignKey;
	}
				    
	public Long getlIdTipoIvaActualForeignKeyParaPosibleAtras() {
		return lIdTipoIvaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoIvaActualForeignKeyParaPosibleAtras(
			Long lIdTipoIvaActualForeignKeyParaPosibleAtras) {
		this.lIdTipoIvaActualForeignKeyParaPosibleAtras = lIdTipoIvaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoIvaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoIva() {
		return sUltimaBusquedaTipoIva;
	}

	public void setsUltimaBusquedaTipoIva(String sUltimaBusquedaTipoIva) {
		this.sUltimaBusquedaTipoIva = sUltimaBusquedaTipoIva;
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
    
	public String getcodigo() {
		return this.codigo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoIva:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoIva:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("TipoIva:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
