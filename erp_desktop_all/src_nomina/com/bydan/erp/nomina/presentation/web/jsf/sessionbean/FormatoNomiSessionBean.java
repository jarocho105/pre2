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
public class FormatoNomiSessionBean  extends FormatoNomiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi;
	protected Long lIdFormatoNomiActualForeignKey;	
	
	protected Long lIdFormatoNomiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras;
	protected String sUltimaBusquedaFormatoNomi;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionPuntajeNomi;
	Long lidPuntajeNomiActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estructura;
	private Long id_puntaje_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormatoNomiSessionBeanAdditional formatonomiSessionBeanAdditional=null;
	
	public FormatoNomiSessionBeanAdditional getFormatoNomiSessionBeanAdditional() {
		return this.formatonomiSessionBeanAdditional;
	}
	
	public void setFormatoNomiSessionBeanAdditional(FormatoNomiSessionBeanAdditional formatonomiSessionBeanAdditional) {
		try {
			this.formatonomiSessionBeanAdditional=formatonomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormatoNomiSessionBean () {
		this.inicializarFormatoNomiSessionBean();
	}
	
	public void inicializarFormatoNomiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi=false;
		this.lIdFormatoNomiActualForeignKey=0L;
		this.lIdFormatoNomiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras=false;
		this.sUltimaBusquedaFormatoNomi ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionPuntajeNomi=false;
		lidPuntajeNomiActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estructura=-1L;
 		this.id_puntaje_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi= isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi= isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi;
	}
					
	public Long getlIdFormatoNomiActualForeignKey() {
		return lIdFormatoNomiActualForeignKey;
	}

	public void setlIdFormatoNomiActualForeignKey(
			Long lIdFormatoNomiActualForeignKey) {
		this.lIdFormatoNomiActualForeignKey = lIdFormatoNomiActualForeignKey;
	}
				    
	public Long getlIdFormatoNomiActualForeignKeyParaPosibleAtras() {
		return lIdFormatoNomiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormatoNomiActualForeignKeyParaPosibleAtras(
			Long lIdFormatoNomiActualForeignKeyParaPosibleAtras) {
		this.lIdFormatoNomiActualForeignKeyParaPosibleAtras = lIdFormatoNomiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormatoNomi() {
		return sUltimaBusquedaFormatoNomi;
	}

	public void setsUltimaBusquedaFormatoNomi(String sUltimaBusquedaFormatoNomi) {
		this.sUltimaBusquedaFormatoNomi = sUltimaBusquedaFormatoNomi;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_puntaje_nomi() {
		return this.id_puntaje_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomi:Valor nulo no permitido en columna id");
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
						System.out.println("FormatoNomi:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomi:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomi:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_puntaje_nomi(Long newid_puntaje_nomi)throws Exception
	{
		try {
			if(this.id_puntaje_nomi!=newid_puntaje_nomi) {
				if(newid_puntaje_nomi==null) {
					//newid_puntaje_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomi:Valor nulo no permitido en columna id_puntaje_nomi");
					}
				}

				this.id_puntaje_nomi=newid_puntaje_nomi;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPuntajeNomi() {
		return isBusquedaDesdeForeignKeySesionPuntajeNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionPuntajeNomi(
		Boolean isBusquedaDesdeForeignKeySesionPuntajeNomi) {
		this.isBusquedaDesdeForeignKeySesionPuntajeNomi = isBusquedaDesdeForeignKeySesionPuntajeNomi;
	}

	public Long getlidPuntajeNomiActual() {
		return lidPuntajeNomiActual;
	}

	public void setlidPuntajeNomiActual(Long lidPuntajeNomiActual) {
		this.lidPuntajeNomiActual = lidPuntajeNomiActual;
	}
	
	
		
	
}
