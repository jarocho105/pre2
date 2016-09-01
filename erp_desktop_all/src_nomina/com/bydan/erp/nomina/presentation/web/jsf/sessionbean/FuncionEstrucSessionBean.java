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
public class FuncionEstrucSessionBean  extends FuncionEstrucSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc;
	protected Long lIdFuncionEstrucActualForeignKey;	
	
	protected Long lIdFuncionEstrucActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras;
	protected String sUltimaBusquedaFuncionEstruc;
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
	Boolean isBusquedaDesdeForeignKeySesionFuncion;
	Long lidFuncionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_estructura;
	private Long id_funcion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FuncionEstrucSessionBeanAdditional funcionestrucSessionBeanAdditional=null;
	
	public FuncionEstrucSessionBeanAdditional getFuncionEstrucSessionBeanAdditional() {
		return this.funcionestrucSessionBeanAdditional;
	}
	
	public void setFuncionEstrucSessionBeanAdditional(FuncionEstrucSessionBeanAdditional funcionestrucSessionBeanAdditional) {
		try {
			this.funcionestrucSessionBeanAdditional=funcionestrucSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FuncionEstrucSessionBean () {
		this.inicializarFuncionEstrucSessionBean();
	}
	
	public void inicializarFuncionEstrucSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc=false;
		this.lIdFuncionEstrucActualForeignKey=0L;
		this.lIdFuncionEstrucActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras=false;
		this.sUltimaBusquedaFuncionEstruc ="";
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
		isBusquedaDesdeForeignKeySesionFuncion=false;
		lidFuncionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_estructura=-1L;
 		this.id_funcion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc= isPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc = sNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc= isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstruc;
	}
					
	public Long getlIdFuncionEstrucActualForeignKey() {
		return lIdFuncionEstrucActualForeignKey;
	}

	public void setlIdFuncionEstrucActualForeignKey(
			Long lIdFuncionEstrucActualForeignKey) {
		this.lIdFuncionEstrucActualForeignKey = lIdFuncionEstrucActualForeignKey;
	}
				    
	public Long getlIdFuncionEstrucActualForeignKeyParaPosibleAtras() {
		return lIdFuncionEstrucActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFuncionEstrucActualForeignKeyParaPosibleAtras(
			Long lIdFuncionEstrucActualForeignKeyParaPosibleAtras) {
		this.lIdFuncionEstrucActualForeignKeyParaPosibleAtras = lIdFuncionEstrucActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFuncionEstrucParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFuncionEstruc() {
		return sUltimaBusquedaFuncionEstruc;
	}

	public void setsUltimaBusquedaFuncionEstruc(String sUltimaBusquedaFuncionEstruc) {
		this.sUltimaBusquedaFuncionEstruc = sUltimaBusquedaFuncionEstruc;
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
    
	public Long getid_funcion() {
		return this.id_funcion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FuncionEstruc:Valor nulo no permitido en columna id");
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
						System.out.println("FuncionEstruc:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FuncionEstruc:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("FuncionEstruc:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_funcion(Long newid_funcion)throws Exception
	{
		try {
			if(this.id_funcion!=newid_funcion) {
				if(newid_funcion==null) {
					//newid_funcion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FuncionEstruc:Valor nulo no permitido en columna id_funcion");
					}
				}

				this.id_funcion=newid_funcion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFuncion() {
		return isBusquedaDesdeForeignKeySesionFuncion;
	}

	public void setisBusquedaDesdeForeignKeySesionFuncion(
		Boolean isBusquedaDesdeForeignKeySesionFuncion) {
		this.isBusquedaDesdeForeignKeySesionFuncion = isBusquedaDesdeForeignKeySesionFuncion;
	}

	public Long getlidFuncionActual() {
		return lidFuncionActual;
	}

	public void setlidFuncionActual(Long lidFuncionActual) {
		this.lidFuncionActual = lidFuncionActual;
	}
	
	
		
	
}
