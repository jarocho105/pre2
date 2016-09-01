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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoCierreMesSessionBean  extends ProcesoCierreMesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes;
	protected Long lIdProcesoCierreMesActualForeignKey;	
	
	protected Long lIdProcesoCierreMesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras;
	protected String sUltimaBusquedaProcesoCierreMes;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	
	private Long id;
	private Long id_mes;
	private Long id_estructura;
	private Boolean es_para_reversion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoCierreMesSessionBeanAdditional procesocierremesSessionBeanAdditional=null;
	
	public ProcesoCierreMesSessionBeanAdditional getProcesoCierreMesSessionBeanAdditional() {
		return this.procesocierremesSessionBeanAdditional;
	}
	
	public void setProcesoCierreMesSessionBeanAdditional(ProcesoCierreMesSessionBeanAdditional procesocierremesSessionBeanAdditional) {
		try {
			this.procesocierremesSessionBeanAdditional=procesocierremesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoCierreMesSessionBean () {
		this.inicializarProcesoCierreMesSessionBean();
	}
	
	public void inicializarProcesoCierreMesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes=false;
		this.lIdProcesoCierreMesActualForeignKey=0L;
		this.lIdProcesoCierreMesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoCierreMes ="";
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
		
		
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L; 
		
		
		
 		this.id_mes=null;
 		this.id_estructura=-1L;
 		this.es_para_reversion=false;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes= isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreMes;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes= isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMes;
	}
					
	public Long getlIdProcesoCierreMesActualForeignKey() {
		return lIdProcesoCierreMesActualForeignKey;
	}

	public void setlIdProcesoCierreMesActualForeignKey(
			Long lIdProcesoCierreMesActualForeignKey) {
		this.lIdProcesoCierreMesActualForeignKey = lIdProcesoCierreMesActualForeignKey;
	}
				    
	public Long getlIdProcesoCierreMesActualForeignKeyParaPosibleAtras() {
		return lIdProcesoCierreMesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoCierreMesActualForeignKeyParaPosibleAtras(
			Long lIdProcesoCierreMesActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoCierreMesActualForeignKeyParaPosibleAtras = lIdProcesoCierreMesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreMesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoCierreMes() {
		return sUltimaBusquedaProcesoCierreMes;
	}

	public void setsUltimaBusquedaProcesoCierreMes(String sUltimaBusquedaProcesoCierreMes) {
		this.sUltimaBusquedaProcesoCierreMes = sUltimaBusquedaProcesoCierreMes;
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
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Boolean getes_para_reversion() {
		return this.es_para_reversion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreMes:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreMes:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setes_para_reversion(Boolean newes_para_reversion)throws Exception
	{
		try {
			if(this.es_para_reversion!=newes_para_reversion) {
				if(newes_para_reversion==null) {
					//newes_para_reversion=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreMes:Valor nulo no permitido en columna es_para_reversion");
					}
				}

				this.es_para_reversion=newes_para_reversion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstructura() {
		return isBusquedaDesdeForeignKeySesionEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructura(
		Boolean isBusquedaDesdeForeignKeySesionEstructura) {
		this.isBusquedaDesdeForeignKeySesionEstructura = isBusquedaDesdeForeignKeySesionEstructura;
	}

	public Long getlidEstructuraActual() {
		return lidEstructuraActual;
	}

	public void setlidEstructuraActual(Long lidEstructuraActual) {
		this.lidEstructuraActual = lidEstructuraActual;
	}
	
	
		
	
}
