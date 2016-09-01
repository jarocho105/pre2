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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class TipoPago_NMSessionBean  extends TipoPago_NMSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM;
	protected Long lIdTipoPago_NMActualForeignKey;	
	
	protected Long lIdTipoPago_NMActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras;
	protected String sUltimaBusquedaTipoPago_NM;
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
	
	private Long id;
	private Long id_empresa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoPago_NMSessionBeanAdditional tipopago_nmSessionBeanAdditional=null;
	
	public TipoPago_NMSessionBeanAdditional getTipoPago_NMSessionBeanAdditional() {
		return this.tipopago_nmSessionBeanAdditional;
	}
	
	public void setTipoPago_NMSessionBeanAdditional(TipoPago_NMSessionBeanAdditional tipopago_nmSessionBeanAdditional) {
		try {
			this.tipopago_nmSessionBeanAdditional=tipopago_nmSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoPago_NMSessionBean () {
		this.inicializarTipoPago_NMSessionBean();
	}
	
	public void inicializarTipoPago_NMSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM=false;
		this.lIdTipoPago_NMActualForeignKey=0L;
		this.lIdTipoPago_NMActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras=false;
		this.sUltimaBusquedaTipoPago_NM ="";
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
		
		
		
 		this.id_empresa=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM= isPermiteNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoPago_NM;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM= isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM;
	}
					
	public Long getlIdTipoPago_NMActualForeignKey() {
		return lIdTipoPago_NMActualForeignKey;
	}

	public void setlIdTipoPago_NMActualForeignKey(
			Long lIdTipoPago_NMActualForeignKey) {
		this.lIdTipoPago_NMActualForeignKey = lIdTipoPago_NMActualForeignKey;
	}
				    
	public Long getlIdTipoPago_NMActualForeignKeyParaPosibleAtras() {
		return lIdTipoPago_NMActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoPago_NMActualForeignKeyParaPosibleAtras(
			Long lIdTipoPago_NMActualForeignKeyParaPosibleAtras) {
		this.lIdTipoPago_NMActualForeignKeyParaPosibleAtras = lIdTipoPago_NMActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NMParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoPago_NM() {
		return sUltimaBusquedaTipoPago_NM;
	}

	public void setsUltimaBusquedaTipoPago_NM(String sUltimaBusquedaTipoPago_NM) {
		this.sUltimaBusquedaTipoPago_NM = sUltimaBusquedaTipoPago_NM;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoPago_NM:Valor nulo no permitido en columna id");
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
						System.out.println("TipoPago_NM:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
	
	
		
	
}
