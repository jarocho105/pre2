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
package com.bydan.erp.sris.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.sris.business.entity.*;

@SuppressWarnings("unused")
public class SriDetalladosIvaSessionBean  extends SriDetalladosIvaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva;
	protected Long lIdSriDetalladosIvaActualForeignKey;	
	
	protected Long lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras;
	protected String sUltimaBusquedaSriDetalladosIva;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	Long lidPeriodoDeclaraActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoComprobante;
	Long lidTipoComprobanteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIva;
	Long lidTipoIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	Long lidTipoRetencionIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	Long lidTipoRetencionIvaPrestaActual;
	
	private Long id;
	private Long id_periodo_declara;
	private Long id_tipo_comprobante;
	private String ruc;
	private Long id_tipo_iva;
	private Long id_tipo_retencion_iva;
	private Long id_tipo_retencion_iva_presta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SriDetalladosIvaSessionBeanAdditional sridetalladosivaSessionBeanAdditional=null;
	
	public SriDetalladosIvaSessionBeanAdditional getSriDetalladosIvaSessionBeanAdditional() {
		return this.sridetalladosivaSessionBeanAdditional;
	}
	
	public void setSriDetalladosIvaSessionBeanAdditional(SriDetalladosIvaSessionBeanAdditional sridetalladosivaSessionBeanAdditional) {
		try {
			this.sridetalladosivaSessionBeanAdditional=sridetalladosivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SriDetalladosIvaSessionBean () {
		this.inicializarSriDetalladosIvaSessionBean();
	}
	
	public void inicializarSriDetalladosIvaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva=false;
		this.lIdSriDetalladosIvaActualForeignKey=0L;
		this.lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras=false;
		this.sUltimaBusquedaSriDetalladosIva ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPeriodoDeclara=false;
		lidPeriodoDeclaraActual=0L;
		isBusquedaDesdeForeignKeySesionTipoComprobante=false;
		lidTipoComprobanteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIva=false;
		lidTipoIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva=false;
		lidTipoRetencionIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta=false;
		lidTipoRetencionIvaPrestaActual=0L; 
		
		
		
 		this.id_periodo_declara=-1L;
 		this.id_tipo_comprobante=-1L;
 		this.ruc="";
 		this.id_tipo_iva=-1L;
 		this.id_tipo_retencion_iva=-1L;
 		this.id_tipo_retencion_iva_presta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva= isPermiteNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva = sNombrePaginaNavegacionHaciaForeignKeyDesdeSriDetalladosIva;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva() {
		return isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva= isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIva;
	}
					
	public Long getlIdSriDetalladosIvaActualForeignKey() {
		return lIdSriDetalladosIvaActualForeignKey;
	}

	public void setlIdSriDetalladosIvaActualForeignKey(
			Long lIdSriDetalladosIvaActualForeignKey) {
		this.lIdSriDetalladosIvaActualForeignKey = lIdSriDetalladosIvaActualForeignKey;
	}
				    
	public Long getlIdSriDetalladosIvaActualForeignKeyParaPosibleAtras() {
		return lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSriDetalladosIvaActualForeignKeyParaPosibleAtras(
			Long lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras) {
		this.lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras = lIdSriDetalladosIvaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySriDetalladosIvaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSriDetalladosIva() {
		return sUltimaBusquedaSriDetalladosIva;
	}

	public void setsUltimaBusquedaSriDetalladosIva(String sUltimaBusquedaSriDetalladosIva) {
		this.sUltimaBusquedaSriDetalladosIva = sUltimaBusquedaSriDetalladosIva;
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
    
	public Long getid_periodo_declara() {
		return this.id_periodo_declara;
	}
    
	public Long getid_tipo_comprobante() {
		return this.id_tipo_comprobante;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public Long getid_tipo_iva() {
		return this.id_tipo_iva;
	}
    
	public Long getid_tipo_retencion_iva() {
		return this.id_tipo_retencion_iva;
	}
    
	public Long getid_tipo_retencion_iva_presta() {
		return this.id_tipo_retencion_iva_presta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo_declara(Long newid_periodo_declara)throws Exception
	{
		try {
			if(this.id_periodo_declara!=newid_periodo_declara) {
				if(newid_periodo_declara==null) {
					//newid_periodo_declara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id_periodo_declara");
					}
				}

				this.id_periodo_declara=newid_periodo_declara;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_comprobante(Long newid_tipo_comprobante)throws Exception
	{
		try {
			if(this.id_tipo_comprobante!=newid_tipo_comprobante) {
				if(newid_tipo_comprobante==null) {
					//newid_tipo_comprobante=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id_tipo_comprobante");
					}
				}

				this.id_tipo_comprobante=newid_tipo_comprobante;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setruc(String newruc)throws Exception
	{
		try {
			if(this.ruc!=newruc) {
				if(newruc==null) {
					//newruc="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>20) {
					newruc=newruc.substring(0,18);
					System.out.println("SriDetalladosIva:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ruc");
				}

				this.ruc=newruc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_iva(Long newid_tipo_iva)throws Exception
	{
		try {
			if(this.id_tipo_iva!=newid_tipo_iva) {
				if(newid_tipo_iva==null) {
					//newid_tipo_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id_tipo_iva");
					}
				}

				this.id_tipo_iva=newid_tipo_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva(Long newid_tipo_retencion_iva)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva!=newid_tipo_retencion_iva) {
				if(newid_tipo_retencion_iva==null) {
					//newid_tipo_retencion_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id_tipo_retencion_iva");
					}
				}

				this.id_tipo_retencion_iva=newid_tipo_retencion_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva_presta(Long newid_tipo_retencion_iva_presta)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva_presta!=newid_tipo_retencion_iva_presta) {
				if(newid_tipo_retencion_iva_presta==null) {
					//newid_tipo_retencion_iva_presta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriDetalladosIva:Valor nulo no permitido en columna id_tipo_retencion_iva_presta");
					}
				}

				this.id_tipo_retencion_iva_presta=newid_tipo_retencion_iva_presta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodoDeclara() {
		return isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodoDeclara(
		Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara) {
		this.isBusquedaDesdeForeignKeySesionPeriodoDeclara = isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public Long getlidPeriodoDeclaraActual() {
		return lidPeriodoDeclaraActual;
	}

	public void setlidPeriodoDeclaraActual(Long lidPeriodoDeclaraActual) {
		this.lidPeriodoDeclaraActual = lidPeriodoDeclaraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoComprobante() {
		return isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoComprobante(
		Boolean isBusquedaDesdeForeignKeySesionTipoComprobante) {
		this.isBusquedaDesdeForeignKeySesionTipoComprobante = isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public Long getlidTipoComprobanteActual() {
		return lidTipoComprobanteActual;
	}

	public void setlidTipoComprobanteActual(Long lidTipoComprobanteActual) {
		this.lidTipoComprobanteActual = lidTipoComprobanteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIva() {
		return isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoIva) {
		this.isBusquedaDesdeForeignKeySesionTipoIva = isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public Long getlidTipoIvaActual() {
		return lidTipoIvaActual;
	}

	public void setlidTipoIvaActual(Long lidTipoIvaActual) {
		this.lidTipoIvaActual = lidTipoIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIva() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIva = isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public Long getlidTipoRetencionIvaActual() {
		return lidTipoRetencionIvaActual;
	}

	public void setlidTipoRetencionIvaActual(Long lidTipoRetencionIvaActual) {
		this.lidTipoRetencionIvaActual = lidTipoRetencionIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta = isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public Long getlidTipoRetencionIvaPrestaActual() {
		return lidTipoRetencionIvaPrestaActual;
	}

	public void setlidTipoRetencionIvaPrestaActual(Long lidTipoRetencionIvaPrestaActual) {
		this.lidTipoRetencionIvaPrestaActual = lidTipoRetencionIvaPrestaActual;
	}
	
	
		
	
}
