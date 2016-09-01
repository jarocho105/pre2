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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class FormatoActivoFijoSessionBean  extends FormatoActivoFijoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo;
	protected Long lIdFormatoActivoFijoActualForeignKey;	
	
	protected Long lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras;
	protected String sUltimaBusquedaFormatoActivoFijo;
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
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato2;
	Long lidFormato2Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_formato;
	private Long id_formato2;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormatoActivoFijoSessionBeanAdditional formatoactivofijoSessionBeanAdditional=null;
	
	public FormatoActivoFijoSessionBeanAdditional getFormatoActivoFijoSessionBeanAdditional() {
		return this.formatoactivofijoSessionBeanAdditional;
	}
	
	public void setFormatoActivoFijoSessionBeanAdditional(FormatoActivoFijoSessionBeanAdditional formatoactivofijoSessionBeanAdditional) {
		try {
			this.formatoactivofijoSessionBeanAdditional=formatoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormatoActivoFijoSessionBean () {
		this.inicializarFormatoActivoFijoSessionBean();
	}
	
	public void inicializarFormatoActivoFijoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo=false;
		this.lIdFormatoActivoFijoActualForeignKey=0L;
		this.lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras=false;
		this.sUltimaBusquedaFormatoActivoFijo ="";
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
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionFormato2=false;
		lidFormato2Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_formato=-1L;
 		this.id_formato2=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo= isPermiteNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoActivoFijo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo= isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijo;
	}
					
	public Long getlIdFormatoActivoFijoActualForeignKey() {
		return lIdFormatoActivoFijoActualForeignKey;
	}

	public void setlIdFormatoActivoFijoActualForeignKey(
			Long lIdFormatoActivoFijoActualForeignKey) {
		this.lIdFormatoActivoFijoActualForeignKey = lIdFormatoActivoFijoActualForeignKey;
	}
				    
	public Long getlIdFormatoActivoFijoActualForeignKeyParaPosibleAtras() {
		return lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormatoActivoFijoActualForeignKeyParaPosibleAtras(
			Long lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras) {
		this.lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras = lIdFormatoActivoFijoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormatoActivoFijoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormatoActivoFijo() {
		return sUltimaBusquedaFormatoActivoFijo;
	}

	public void setsUltimaBusquedaFormatoActivoFijo(String sUltimaBusquedaFormatoActivoFijo) {
		this.sUltimaBusquedaFormatoActivoFijo = sUltimaBusquedaFormatoActivoFijo;
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
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_formato2() {
		return this.id_formato2;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoActivoFijo:Valor nulo no permitido en columna id");
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
						System.out.println("FormatoActivoFijo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoActivoFijo:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato2(Long newid_formato2)throws Exception
	{
		try {
			if(this.id_formato2!=newid_formato2) {
				if(newid_formato2==null) {
					//newid_formato2=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoActivoFijo:Valor nulo no permitido en columna id_formato2");
					}
				}

				this.id_formato2=newid_formato2;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato2() {
		return isBusquedaDesdeForeignKeySesionFormato2;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato2(
		Boolean isBusquedaDesdeForeignKeySesionFormato2) {
		this.isBusquedaDesdeForeignKeySesionFormato2 = isBusquedaDesdeForeignKeySesionFormato2;
	}

	public Long getlidFormato2Actual() {
		return lidFormato2Actual;
	}

	public void setlidFormato2Actual(Long lidFormato2Actual) {
		this.lidFormato2Actual = lidFormato2Actual;
	}
	
	
		
	
}
