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
public class DetalleTerminoProformaSessionBean  extends DetalleTerminoProformaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma;
	protected Long lIdDetalleTerminoProformaActualForeignKey;	
	
	protected Long lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras;
	protected String sUltimaBusquedaDetalleTerminoProforma;
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
	Boolean isBusquedaDesdeForeignKeySesionTerminoProforma;
	Long lidTerminoProformaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_termino_proforma;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleTerminoProformaSessionBeanAdditional detalleterminoproformaSessionBeanAdditional=null;
	
	public DetalleTerminoProformaSessionBeanAdditional getDetalleTerminoProformaSessionBeanAdditional() {
		return this.detalleterminoproformaSessionBeanAdditional;
	}
	
	public void setDetalleTerminoProformaSessionBeanAdditional(DetalleTerminoProformaSessionBeanAdditional detalleterminoproformaSessionBeanAdditional) {
		try {
			this.detalleterminoproformaSessionBeanAdditional=detalleterminoproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleTerminoProformaSessionBean () {
		this.inicializarDetalleTerminoProformaSessionBean();
	}
	
	public void inicializarDetalleTerminoProformaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma=false;
		this.lIdDetalleTerminoProformaActualForeignKey=0L;
		this.lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleTerminoProforma ="";
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
		isBusquedaDesdeForeignKeySesionTerminoProforma=false;
		lidTerminoProformaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_termino_proforma=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma= isPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma= isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProforma;
	}
					
	public Long getlIdDetalleTerminoProformaActualForeignKey() {
		return lIdDetalleTerminoProformaActualForeignKey;
	}

	public void setlIdDetalleTerminoProformaActualForeignKey(
			Long lIdDetalleTerminoProformaActualForeignKey) {
		this.lIdDetalleTerminoProformaActualForeignKey = lIdDetalleTerminoProformaActualForeignKey;
	}
				    
	public Long getlIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras() {
		return lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras(
			Long lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras = lIdDetalleTerminoProformaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleTerminoProformaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleTerminoProforma() {
		return sUltimaBusquedaDetalleTerminoProforma;
	}

	public void setsUltimaBusquedaDetalleTerminoProforma(String sUltimaBusquedaDetalleTerminoProforma) {
		this.sUltimaBusquedaDetalleTerminoProforma = sUltimaBusquedaDetalleTerminoProforma;
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
    
	public Long getid_termino_proforma() {
		return this.id_termino_proforma;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleTerminoProforma:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleTerminoProforma:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("DetalleTerminoProforma:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_termino_proforma(Long newid_termino_proforma)throws Exception
	{
		try {
			if(this.id_termino_proforma!=newid_termino_proforma) {
				if(newid_termino_proforma==null) {
					//newid_termino_proforma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleTerminoProforma:Valor nulo no permitido en columna id_termino_proforma");
					}
				}

				this.id_termino_proforma=newid_termino_proforma;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTerminoProforma() {
		return isBusquedaDesdeForeignKeySesionTerminoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionTerminoProforma(
		Boolean isBusquedaDesdeForeignKeySesionTerminoProforma) {
		this.isBusquedaDesdeForeignKeySesionTerminoProforma = isBusquedaDesdeForeignKeySesionTerminoProforma;
	}

	public Long getlidTerminoProformaActual() {
		return lidTerminoProformaActual;
	}

	public void setlidTerminoProformaActual(Long lidTerminoProformaActual) {
		this.lidTerminoProformaActual = lidTerminoProformaActual;
	}
	
	
		
	
}
