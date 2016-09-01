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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class TerminoProformaSessionBean  extends TerminoProformaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma;
	protected Long lIdTerminoProformaActualForeignKey;	
	
	protected Long lIdTerminoProformaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras;
	protected String sUltimaBusquedaTerminoProforma;
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
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionProforma;
	Long lidProformaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_moneda;
	private Long id_proforma;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TerminoProformaSessionBeanAdditional terminoproformaSessionBeanAdditional=null;
	
	public TerminoProformaSessionBeanAdditional getTerminoProformaSessionBeanAdditional() {
		return this.terminoproformaSessionBeanAdditional;
	}
	
	public void setTerminoProformaSessionBeanAdditional(TerminoProformaSessionBeanAdditional terminoproformaSessionBeanAdditional) {
		try {
			this.terminoproformaSessionBeanAdditional=terminoproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TerminoProformaSessionBean () {
		this.inicializarTerminoProformaSessionBean();
	}
	
	public void inicializarTerminoProformaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma=false;
		this.lIdTerminoProformaActualForeignKey=0L;
		this.lIdTerminoProformaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras=false;
		this.sUltimaBusquedaTerminoProforma ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionProforma=false;
		lidProformaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_moneda=-1L;
 		this.id_proforma=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma= isPermiteNavegacionHaciaForeignKeyDesdeTerminoProforma;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma = sNombrePaginaNavegacionHaciaForeignKeyDesdeTerminoProforma;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma= isBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma;
	}
					
	public Long getlIdTerminoProformaActualForeignKey() {
		return lIdTerminoProformaActualForeignKey;
	}

	public void setlIdTerminoProformaActualForeignKey(
			Long lIdTerminoProformaActualForeignKey) {
		this.lIdTerminoProformaActualForeignKey = lIdTerminoProformaActualForeignKey;
	}
				    
	public Long getlIdTerminoProformaActualForeignKeyParaPosibleAtras() {
		return lIdTerminoProformaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTerminoProformaActualForeignKeyParaPosibleAtras(
			Long lIdTerminoProformaActualForeignKeyParaPosibleAtras) {
		this.lIdTerminoProformaActualForeignKeyParaPosibleAtras = lIdTerminoProformaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTerminoProformaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTerminoProforma() {
		return sUltimaBusquedaTerminoProforma;
	}

	public void setsUltimaBusquedaTerminoProforma(String sUltimaBusquedaTerminoProforma) {
		this.sUltimaBusquedaTerminoProforma = sUltimaBusquedaTerminoProforma;
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
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_proforma() {
		return this.id_proforma;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TerminoProforma:Valor nulo no permitido en columna id");
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
						System.out.println("TerminoProforma:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TerminoProforma:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TerminoProforma:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_proforma(Long newid_proforma)throws Exception
	{
		try {
			if(this.id_proforma!=newid_proforma) {
				if(newid_proforma==null) {
					//newid_proforma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TerminoProforma:Valor nulo no permitido en columna id_proforma");
					}
				}

				this.id_proforma=newid_proforma;
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
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProforma() {
		return isBusquedaDesdeForeignKeySesionProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionProforma(
		Boolean isBusquedaDesdeForeignKeySesionProforma) {
		this.isBusquedaDesdeForeignKeySesionProforma = isBusquedaDesdeForeignKeySesionProforma;
	}

	public Long getlidProformaActual() {
		return lidProformaActual;
	}

	public void setlidProformaActual(Long lidProformaActual) {
		this.lidProformaActual = lidProformaActual;
	}
	
	
		
	
}
