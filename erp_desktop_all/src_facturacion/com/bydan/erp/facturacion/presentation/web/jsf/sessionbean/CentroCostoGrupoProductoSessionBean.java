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
public class CentroCostoGrupoProductoSessionBean  extends CentroCostoGrupoProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto;
	protected Long lIdCentroCostoGrupoProductoActualForeignKey;	
	
	protected Long lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras;
	protected String sUltimaBusquedaCentroCostoGrupoProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_centro_costo;
	private Long id_linea;
	private Long id_linea_grupo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CentroCostoGrupoProductoSessionBeanAdditional centrocostogrupoproductoSessionBeanAdditional=null;
	
	public CentroCostoGrupoProductoSessionBeanAdditional getCentroCostoGrupoProductoSessionBeanAdditional() {
		return this.centrocostogrupoproductoSessionBeanAdditional;
	}
	
	public void setCentroCostoGrupoProductoSessionBeanAdditional(CentroCostoGrupoProductoSessionBeanAdditional centrocostogrupoproductoSessionBeanAdditional) {
		try {
			this.centrocostogrupoproductoSessionBeanAdditional=centrocostogrupoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CentroCostoGrupoProductoSessionBean () {
		this.inicializarCentroCostoGrupoProductoSessionBean();
	}
	
	public void inicializarCentroCostoGrupoProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto=false;
		this.lIdCentroCostoGrupoProductoActualForeignKey=0L;
		this.lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras=false;
		this.sUltimaBusquedaCentroCostoGrupoProducto ="";
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
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_centro_costo=null;
 		this.id_linea=-1L;
 		this.id_linea_grupo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto= isPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto= isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto;
	}
					
	public Long getlIdCentroCostoGrupoProductoActualForeignKey() {
		return lIdCentroCostoGrupoProductoActualForeignKey;
	}

	public void setlIdCentroCostoGrupoProductoActualForeignKey(
			Long lIdCentroCostoGrupoProductoActualForeignKey) {
		this.lIdCentroCostoGrupoProductoActualForeignKey = lIdCentroCostoGrupoProductoActualForeignKey;
	}
				    
	public Long getlIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras() {
		return lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras(
			Long lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras) {
		this.lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras = lIdCentroCostoGrupoProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCentroCostoGrupoProducto() {
		return sUltimaBusquedaCentroCostoGrupoProducto;
	}

	public void setsUltimaBusquedaCentroCostoGrupoProducto(String sUltimaBusquedaCentroCostoGrupoProducto) {
		this.sUltimaBusquedaCentroCostoGrupoProducto = sUltimaBusquedaCentroCostoGrupoProducto;
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
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_linea() {
		return this.id_linea;
	}
    
	public Long getid_linea_grupo() {
		return this.id_linea_grupo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CentroCostoGrupoProducto:Valor nulo no permitido en columna id");
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
						System.out.println("CentroCostoGrupoProducto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CentroCostoGrupoProducto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_linea(Long newid_linea)throws Exception
	{
		try {
			if(this.id_linea!=newid_linea) {
				if(newid_linea==null) {
					//newid_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CentroCostoGrupoProducto:Valor nulo no permitido en columna id_linea");
					}
				}

				this.id_linea=newid_linea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_grupo(Long newid_linea_grupo)throws Exception
	{
		try {
			if(this.id_linea_grupo!=newid_linea_grupo) {
				if(newid_linea_grupo==null) {
					//newid_linea_grupo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CentroCostoGrupoProducto:Valor nulo no permitido en columna id_linea_grupo");
					}
				}

				this.id_linea_grupo=newid_linea_grupo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLinea() {
		return isBusquedaDesdeForeignKeySesionLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionLinea(
		Boolean isBusquedaDesdeForeignKeySesionLinea) {
		this.isBusquedaDesdeForeignKeySesionLinea = isBusquedaDesdeForeignKeySesionLinea;
	}

	public Long getlidLineaActual() {
		return lidLineaActual;
	}

	public void setlidLineaActual(Long lidLineaActual) {
		this.lidLineaActual = lidLineaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaGrupo() {
		return isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaGrupo(
		Boolean isBusquedaDesdeForeignKeySesionLineaGrupo) {
		this.isBusquedaDesdeForeignKeySesionLineaGrupo = isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public Long getlidLineaGrupoActual() {
		return lidLineaGrupoActual;
	}

	public void setlidLineaGrupoActual(Long lidLineaGrupoActual) {
		this.lidLineaGrupoActual = lidLineaGrupoActual;
	}
	
	
		
	
}
