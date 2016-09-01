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
public class RubroEmpleaSessionBean  extends RubroEmpleaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea;
	protected Long lIdRubroEmpleaActualForeignKey;	
	
	protected Long lIdRubroEmpleaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras;
	protected String sUltimaBusquedaRubroEmplea;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoCalculo;
	Long lidTipoCalculoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRubroEmplea;
	Long lidTipoRubroEmpleaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea;
	Long lidTipoGrupoRubroEmpleaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_calculo;
	private Long id_tipo_rubro_emplea;
	private Long id_tipo_grupo_rubro_emplea;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RubroEmpleaSessionBeanAdditional rubroempleaSessionBeanAdditional=null;
	
	public RubroEmpleaSessionBeanAdditional getRubroEmpleaSessionBeanAdditional() {
		return this.rubroempleaSessionBeanAdditional;
	}
	
	public void setRubroEmpleaSessionBeanAdditional(RubroEmpleaSessionBeanAdditional rubroempleaSessionBeanAdditional) {
		try {
			this.rubroempleaSessionBeanAdditional=rubroempleaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RubroEmpleaSessionBean () {
		this.inicializarRubroEmpleaSessionBean();
	}
	
	public void inicializarRubroEmpleaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea=false;
		this.lIdRubroEmpleaActualForeignKey=0L;
		this.lIdRubroEmpleaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras=false;
		this.sUltimaBusquedaRubroEmplea ="";
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
		isBusquedaDesdeForeignKeySesionTipoCalculo=false;
		lidTipoCalculoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRubroEmplea=false;
		lidTipoRubroEmpleaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea=false;
		lidTipoGrupoRubroEmpleaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_calculo=-1L;
 		this.id_tipo_rubro_emplea=-1L;
 		this.id_tipo_grupo_rubro_emplea=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea= isPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea = sNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea= isBusquedaDesdeForeignKeySesionForeignKeyRubroEmplea;
	}
					
	public Long getlIdRubroEmpleaActualForeignKey() {
		return lIdRubroEmpleaActualForeignKey;
	}

	public void setlIdRubroEmpleaActualForeignKey(
			Long lIdRubroEmpleaActualForeignKey) {
		this.lIdRubroEmpleaActualForeignKey = lIdRubroEmpleaActualForeignKey;
	}
				    
	public Long getlIdRubroEmpleaActualForeignKeyParaPosibleAtras() {
		return lIdRubroEmpleaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRubroEmpleaActualForeignKeyParaPosibleAtras(
			Long lIdRubroEmpleaActualForeignKeyParaPosibleAtras) {
		this.lIdRubroEmpleaActualForeignKeyParaPosibleAtras = lIdRubroEmpleaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRubroEmpleaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRubroEmplea() {
		return sUltimaBusquedaRubroEmplea;
	}

	public void setsUltimaBusquedaRubroEmplea(String sUltimaBusquedaRubroEmplea) {
		this.sUltimaBusquedaRubroEmplea = sUltimaBusquedaRubroEmplea;
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
    
	public Long getid_tipo_calculo() {
		return this.id_tipo_calculo;
	}
    
	public Long getid_tipo_rubro_emplea() {
		return this.id_tipo_rubro_emplea;
	}
    
	public Long getid_tipo_grupo_rubro_emplea() {
		return this.id_tipo_grupo_rubro_emplea;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmplea:Valor nulo no permitido en columna id");
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
						System.out.println("RubroEmplea:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_calculo(Long newid_tipo_calculo)throws Exception
	{
		try {
			if(this.id_tipo_calculo!=newid_tipo_calculo) {
				if(newid_tipo_calculo==null) {
					//newid_tipo_calculo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmplea:Valor nulo no permitido en columna id_tipo_calculo");
					}
				}

				this.id_tipo_calculo=newid_tipo_calculo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_rubro_emplea(Long newid_tipo_rubro_emplea)throws Exception
	{
		try {
			if(this.id_tipo_rubro_emplea!=newid_tipo_rubro_emplea) {
				if(newid_tipo_rubro_emplea==null) {
					//newid_tipo_rubro_emplea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmplea:Valor nulo no permitido en columna id_tipo_rubro_emplea");
					}
				}

				this.id_tipo_rubro_emplea=newid_tipo_rubro_emplea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grupo_rubro_emplea(Long newid_tipo_grupo_rubro_emplea)throws Exception
	{
		try {
			if(this.id_tipo_grupo_rubro_emplea!=newid_tipo_grupo_rubro_emplea) {
				if(newid_tipo_grupo_rubro_emplea==null) {
					//newid_tipo_grupo_rubro_emplea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("RubroEmplea:Valor nulo no permitido en columna id_tipo_grupo_rubro_emplea");
					}
				}

				this.id_tipo_grupo_rubro_emplea=newid_tipo_grupo_rubro_emplea;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCalculo() {
		return isBusquedaDesdeForeignKeySesionTipoCalculo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCalculo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCalculo) {
		this.isBusquedaDesdeForeignKeySesionTipoCalculo = isBusquedaDesdeForeignKeySesionTipoCalculo;
	}

	public Long getlidTipoCalculoActual() {
		return lidTipoCalculoActual;
	}

	public void setlidTipoCalculoActual(Long lidTipoCalculoActual) {
		this.lidTipoCalculoActual = lidTipoCalculoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionTipoRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRubroEmplea(
		Boolean isBusquedaDesdeForeignKeySesionTipoRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionTipoRubroEmplea = isBusquedaDesdeForeignKeySesionTipoRubroEmplea;
	}

	public Long getlidTipoRubroEmpleaActual() {
		return lidTipoRubroEmpleaActual;
	}

	public void setlidTipoRubroEmpleaActual(Long lidTipoRubroEmpleaActual) {
		this.lidTipoRubroEmpleaActual = lidTipoRubroEmpleaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea = isBusquedaDesdeForeignKeySesionTipoGrupoRubroEmplea;
	}

	public Long getlidTipoGrupoRubroEmpleaActual() {
		return lidTipoGrupoRubroEmpleaActual;
	}

	public void setlidTipoGrupoRubroEmpleaActual(Long lidTipoGrupoRubroEmpleaActual) {
		this.lidTipoGrupoRubroEmpleaActual = lidTipoGrupoRubroEmpleaActual;
	}
	
	
		
	
}
