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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class LineaPuntoVentaSessionBean  extends LineaPuntoVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta;
	protected Long lIdLineaPuntoVentaActualForeignKey;	
	
	protected Long lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras;
	protected String sUltimaBusquedaLineaPuntoVenta;
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
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarca;
	Long lidLineaMarcaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected LineaPuntoVentaSessionBeanAdditional lineapuntoventaSessionBeanAdditional=null;
	
	public LineaPuntoVentaSessionBeanAdditional getLineaPuntoVentaSessionBeanAdditional() {
		return this.lineapuntoventaSessionBeanAdditional;
	}
	
	public void setLineaPuntoVentaSessionBeanAdditional(LineaPuntoVentaSessionBeanAdditional lineapuntoventaSessionBeanAdditional) {
		try {
			this.lineapuntoventaSessionBeanAdditional=lineapuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public LineaPuntoVentaSessionBean () {
		this.inicializarLineaPuntoVentaSessionBean();
	}
	
	public void inicializarLineaPuntoVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta=false;
		this.lIdLineaPuntoVentaActualForeignKey=0L;
		this.lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras=false;
		this.sUltimaBusquedaLineaPuntoVenta ="";
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
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarca=false;
		lidLineaMarcaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_linea=-1L;
 		this.id_linea_grupo=null;
 		this.id_linea_categoria=null;
 		this.id_linea_marca=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta= isPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta= isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVenta;
	}
					
	public Long getlIdLineaPuntoVentaActualForeignKey() {
		return lIdLineaPuntoVentaActualForeignKey;
	}

	public void setlIdLineaPuntoVentaActualForeignKey(
			Long lIdLineaPuntoVentaActualForeignKey) {
		this.lIdLineaPuntoVentaActualForeignKey = lIdLineaPuntoVentaActualForeignKey;
	}
				    
	public Long getlIdLineaPuntoVentaActualForeignKeyParaPosibleAtras() {
		return lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdLineaPuntoVentaActualForeignKeyParaPosibleAtras(
			Long lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras) {
		this.lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras = lIdLineaPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyLineaPuntoVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaLineaPuntoVenta() {
		return sUltimaBusquedaLineaPuntoVenta;
	}

	public void setsUltimaBusquedaLineaPuntoVenta(String sUltimaBusquedaLineaPuntoVenta) {
		this.sUltimaBusquedaLineaPuntoVenta = sUltimaBusquedaLineaPuntoVenta;
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
    
	public Long getid_linea() {
		return this.id_linea;
	}
    
	public Long getid_linea_grupo() {
		return this.id_linea_grupo;
	}
    
	public Long getid_linea_categoria() {
		return this.id_linea_categoria;
	}
    
	public Long getid_linea_marca() {
		return this.id_linea_marca;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("LineaPuntoVenta:Valor nulo no permitido en columna id");
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
						System.out.println("LineaPuntoVenta:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("LineaPuntoVenta:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea(Long newid_linea)throws Exception
	{
		try {
			if(this.id_linea!=newid_linea) {
				if(newid_linea==null) {
					//newid_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("LineaPuntoVenta:Valor nulo no permitido en columna id_linea");
					}
				}

				this.id_linea=newid_linea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_grupo(Long newid_linea_grupo) {
		if(this.id_linea_grupo!=newid_linea_grupo) {

			this.id_linea_grupo=newid_linea_grupo;
		}
	}
    
	public void setid_linea_categoria(Long newid_linea_categoria) {
		if(this.id_linea_categoria!=newid_linea_categoria) {

			this.id_linea_categoria=newid_linea_categoria;
		}
	}
    
	public void setid_linea_marca(Long newid_linea_marca) {
		if(this.id_linea_marca!=newid_linea_marca) {

			this.id_linea_marca=newid_linea_marca;
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
	public Boolean getisBusquedaDesdeForeignKeySesionLineaCategoria() {
		return isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaCategoria(
		Boolean isBusquedaDesdeForeignKeySesionLineaCategoria) {
		this.isBusquedaDesdeForeignKeySesionLineaCategoria = isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public Long getlidLineaCategoriaActual() {
		return lidLineaCategoriaActual;
	}

	public void setlidLineaCategoriaActual(Long lidLineaCategoriaActual) {
		this.lidLineaCategoriaActual = lidLineaCategoriaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaMarca() {
		return isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaMarca(
		Boolean isBusquedaDesdeForeignKeySesionLineaMarca) {
		this.isBusquedaDesdeForeignKeySesionLineaMarca = isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public Long getlidLineaMarcaActual() {
		return lidLineaMarcaActual;
	}

	public void setlidLineaMarcaActual(Long lidLineaMarcaActual) {
		this.lidLineaMarcaActual = lidLineaMarcaActual;
	}
	
	
		
	
}
