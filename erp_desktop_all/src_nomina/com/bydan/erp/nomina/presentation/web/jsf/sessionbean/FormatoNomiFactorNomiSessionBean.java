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
public class FormatoNomiFactorNomiSessionBean  extends FormatoNomiFactorNomiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi;
	protected Long lIdFormatoNomiFactorNomiActualForeignKey;	
	
	protected Long lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras;
	protected String sUltimaBusquedaFormatoNomiFactorNomi;
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
	Boolean isBusquedaDesdeForeignKeySesionFormatoNomi;
	Long lidFormatoNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionFactorNomi;
	Long lidFactorNomiActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_formato_nomi;
	private Long id_factor_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormatoNomiFactorNomiSessionBeanAdditional formatonomifactornomiSessionBeanAdditional=null;
	
	public FormatoNomiFactorNomiSessionBeanAdditional getFormatoNomiFactorNomiSessionBeanAdditional() {
		return this.formatonomifactornomiSessionBeanAdditional;
	}
	
	public void setFormatoNomiFactorNomiSessionBeanAdditional(FormatoNomiFactorNomiSessionBeanAdditional formatonomifactornomiSessionBeanAdditional) {
		try {
			this.formatonomifactornomiSessionBeanAdditional=formatonomifactornomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormatoNomiFactorNomiSessionBean () {
		this.inicializarFormatoNomiFactorNomiSessionBean();
	}
	
	public void inicializarFormatoNomiFactorNomiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi=false;
		this.lIdFormatoNomiFactorNomiActualForeignKey=0L;
		this.lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras=false;
		this.sUltimaBusquedaFormatoNomiFactorNomi ="";
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
		isBusquedaDesdeForeignKeySesionFormatoNomi=false;
		lidFormatoNomiActual=0L;
		isBusquedaDesdeForeignKeySesionFactorNomi=false;
		lidFactorNomiActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_formato_nomi=-1L;
 		this.id_factor_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi= isPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi= isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi;
	}
					
	public Long getlIdFormatoNomiFactorNomiActualForeignKey() {
		return lIdFormatoNomiFactorNomiActualForeignKey;
	}

	public void setlIdFormatoNomiFactorNomiActualForeignKey(
			Long lIdFormatoNomiFactorNomiActualForeignKey) {
		this.lIdFormatoNomiFactorNomiActualForeignKey = lIdFormatoNomiFactorNomiActualForeignKey;
	}
				    
	public Long getlIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras() {
		return lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras(
			Long lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras) {
		this.lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras = lIdFormatoNomiFactorNomiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormatoNomiFactorNomi() {
		return sUltimaBusquedaFormatoNomiFactorNomi;
	}

	public void setsUltimaBusquedaFormatoNomiFactorNomi(String sUltimaBusquedaFormatoNomiFactorNomi) {
		this.sUltimaBusquedaFormatoNomiFactorNomi = sUltimaBusquedaFormatoNomiFactorNomi;
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
    
	public Long getid_formato_nomi() {
		return this.id_formato_nomi;
	}
    
	public Long getid_factor_nomi() {
		return this.id_factor_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomiFactorNomi:Valor nulo no permitido en columna id");
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
						System.out.println("FormatoNomiFactorNomi:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FormatoNomiFactorNomi:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nomi(Long newid_formato_nomi)throws Exception
	{
		try {
			if(this.id_formato_nomi!=newid_formato_nomi) {
				if(newid_formato_nomi==null) {
					//newid_formato_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomiFactorNomi:Valor nulo no permitido en columna id_formato_nomi");
					}
				}

				this.id_formato_nomi=newid_formato_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factor_nomi(Long newid_factor_nomi)throws Exception
	{
		try {
			if(this.id_factor_nomi!=newid_factor_nomi) {
				if(newid_factor_nomi==null) {
					//newid_factor_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormatoNomiFactorNomi:Valor nulo no permitido en columna id_factor_nomi");
					}
				}

				this.id_factor_nomi=newid_factor_nomi;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNomi() {
		return isBusquedaDesdeForeignKeySesionFormatoNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNomi(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNomi) {
		this.isBusquedaDesdeForeignKeySesionFormatoNomi = isBusquedaDesdeForeignKeySesionFormatoNomi;
	}

	public Long getlidFormatoNomiActual() {
		return lidFormatoNomiActual;
	}

	public void setlidFormatoNomiActual(Long lidFormatoNomiActual) {
		this.lidFormatoNomiActual = lidFormatoNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFactorNomi() {
		return isBusquedaDesdeForeignKeySesionFactorNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionFactorNomi(
		Boolean isBusquedaDesdeForeignKeySesionFactorNomi) {
		this.isBusquedaDesdeForeignKeySesionFactorNomi = isBusquedaDesdeForeignKeySesionFactorNomi;
	}

	public Long getlidFactorNomiActual() {
		return lidFactorNomiActual;
	}

	public void setlidFactorNomiActual(Long lidFactorNomiActual) {
		this.lidFactorNomiActual = lidFactorNomiActual;
	}
	
	
		
	
}
