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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class ConversionUnidadSessionBean  extends ConversionUnidadSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad;
	protected Long lIdConversionUnidadActualForeignKey;	
	
	protected Long lIdConversionUnidadActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras;
	protected String sUltimaBusquedaConversionUnidad;
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
	Boolean isBusquedaDesdeForeignKeySesionUnidadDesde;
	Long lidUnidadDesdeActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidadHasta;
	Long lidUnidadHastaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_unidad_desde;
	private Long id_unidad_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ConversionUnidadSessionBeanAdditional conversionunidadSessionBeanAdditional=null;
	
	public ConversionUnidadSessionBeanAdditional getConversionUnidadSessionBeanAdditional() {
		return this.conversionunidadSessionBeanAdditional;
	}
	
	public void setConversionUnidadSessionBeanAdditional(ConversionUnidadSessionBeanAdditional conversionunidadSessionBeanAdditional) {
		try {
			this.conversionunidadSessionBeanAdditional=conversionunidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ConversionUnidadSessionBean () {
		this.inicializarConversionUnidadSessionBean();
	}
	
	public void inicializarConversionUnidadSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad=false;
		this.lIdConversionUnidadActualForeignKey=0L;
		this.lIdConversionUnidadActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras=false;
		this.sUltimaBusquedaConversionUnidad ="";
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
		isBusquedaDesdeForeignKeySesionUnidadDesde=false;
		lidUnidadDesdeActual=0L;
		isBusquedaDesdeForeignKeySesionUnidadHasta=false;
		lidUnidadHastaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_unidad_desde=-1L;
 		this.id_unidad_hasta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad= isPermiteNavegacionHaciaForeignKeyDesdeConversionUnidad;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad(String sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad = sNombrePaginaNavegacionHaciaForeignKeyDesdeConversionUnidad;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad= isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidad;
	}
					
	public Long getlIdConversionUnidadActualForeignKey() {
		return lIdConversionUnidadActualForeignKey;
	}

	public void setlIdConversionUnidadActualForeignKey(
			Long lIdConversionUnidadActualForeignKey) {
		this.lIdConversionUnidadActualForeignKey = lIdConversionUnidadActualForeignKey;
	}
				    
	public Long getlIdConversionUnidadActualForeignKeyParaPosibleAtras() {
		return lIdConversionUnidadActualForeignKeyParaPosibleAtras;
	}

	public void setlIdConversionUnidadActualForeignKeyParaPosibleAtras(
			Long lIdConversionUnidadActualForeignKeyParaPosibleAtras) {
		this.lIdConversionUnidadActualForeignKeyParaPosibleAtras = lIdConversionUnidadActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyConversionUnidadParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaConversionUnidad() {
		return sUltimaBusquedaConversionUnidad;
	}

	public void setsUltimaBusquedaConversionUnidad(String sUltimaBusquedaConversionUnidad) {
		this.sUltimaBusquedaConversionUnidad = sUltimaBusquedaConversionUnidad;
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
    
	public Long getid_unidad_desde() {
		return this.id_unidad_desde;
	}
    
	public Long getid_unidad_hasta() {
		return this.id_unidad_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConversionUnidad:Valor nulo no permitido en columna id");
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
						System.out.println("ConversionUnidad:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad_desde(Long newid_unidad_desde)throws Exception
	{
		try {
			if(this.id_unidad_desde!=newid_unidad_desde) {
				if(newid_unidad_desde==null) {
					//newid_unidad_desde=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConversionUnidad:Valor nulo no permitido en columna id_unidad_desde");
					}
				}

				this.id_unidad_desde=newid_unidad_desde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad_hasta(Long newid_unidad_hasta)throws Exception
	{
		try {
			if(this.id_unidad_hasta!=newid_unidad_hasta) {
				if(newid_unidad_hasta==null) {
					//newid_unidad_hasta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConversionUnidad:Valor nulo no permitido en columna id_unidad_hasta");
					}
				}

				this.id_unidad_hasta=newid_unidad_hasta;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUnidadDesde() {
		return isBusquedaDesdeForeignKeySesionUnidadDesde;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidadDesde(
		Boolean isBusquedaDesdeForeignKeySesionUnidadDesde) {
		this.isBusquedaDesdeForeignKeySesionUnidadDesde = isBusquedaDesdeForeignKeySesionUnidadDesde;
	}

	public Long getlidUnidadDesdeActual() {
		return lidUnidadDesdeActual;
	}

	public void setlidUnidadDesdeActual(Long lidUnidadDesdeActual) {
		this.lidUnidadDesdeActual = lidUnidadDesdeActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionUnidadHasta() {
		return isBusquedaDesdeForeignKeySesionUnidadHasta;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidadHasta(
		Boolean isBusquedaDesdeForeignKeySesionUnidadHasta) {
		this.isBusquedaDesdeForeignKeySesionUnidadHasta = isBusquedaDesdeForeignKeySesionUnidadHasta;
	}

	public Long getlidUnidadHastaActual() {
		return lidUnidadHastaActual;
	}

	public void setlidUnidadHastaActual(Long lidUnidadHastaActual) {
		this.lidUnidadHastaActual = lidUnidadHastaActual;
	}
	
	
		
	
}
