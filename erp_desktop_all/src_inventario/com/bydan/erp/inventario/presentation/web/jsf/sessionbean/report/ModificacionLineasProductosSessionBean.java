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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class ModificacionLineasProductosSessionBean  extends ModificacionLineasProductosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos;
	protected Long lIdModificacionLineasProductosActualForeignKey;	
	
	protected Long lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras;
	protected String sUltimaBusquedaModificacionLineasProductos;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarca;
	Long lidLineaMarcaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaDestino;
	Long lidLineaDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupoDestino;
	Long lidLineaGrupoDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoriaDestino;
	Long lidLineaCategoriaDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarcaDestino;
	Long lidLineaMarcaDestinoActual;
	
	private Long id;
	private Long id_producto;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	private Long id_linea_destino;
	private Long id_linea_grupo_destino;
	private Long id_linea_categoria_destino;
	private Long id_linea_marca_destino;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ModificacionLineasProductosSessionBeanAdditional modificacionlineasproductosSessionBeanAdditional=null;
	
	public ModificacionLineasProductosSessionBeanAdditional getModificacionLineasProductosSessionBeanAdditional() {
		return this.modificacionlineasproductosSessionBeanAdditional;
	}
	
	public void setModificacionLineasProductosSessionBeanAdditional(ModificacionLineasProductosSessionBeanAdditional modificacionlineasproductosSessionBeanAdditional) {
		try {
			this.modificacionlineasproductosSessionBeanAdditional=modificacionlineasproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ModificacionLineasProductosSessionBean () {
		this.inicializarModificacionLineasProductosSessionBean();
	}
	
	public void inicializarModificacionLineasProductosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos=false;
		this.lIdModificacionLineasProductosActualForeignKey=0L;
		this.lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras=false;
		this.sUltimaBusquedaModificacionLineasProductos ="";
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
		
		
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarca=false;
		lidLineaMarcaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaDestino=false;
		lidLineaDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupoDestino=false;
		lidLineaGrupoDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoriaDestino=false;
		lidLineaCategoriaDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarcaDestino=false;
		lidLineaMarcaDestinoActual=0L; 
		
		
		
 		this.id_producto=-1L;
 		this.id_linea=-1L;
 		this.id_linea_grupo=-1L;
 		this.id_linea_categoria=-1L;
 		this.id_linea_marca=-1L;
 		this.id_linea_destino=-1L;
 		this.id_linea_grupo_destino=-1L;
 		this.id_linea_categoria_destino=-1L;
 		this.id_linea_marca_destino=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos= isPermiteNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos = sNombrePaginaNavegacionHaciaForeignKeyDesdeModificacionLineasProductos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos= isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductos;
	}
					
	public Long getlIdModificacionLineasProductosActualForeignKey() {
		return lIdModificacionLineasProductosActualForeignKey;
	}

	public void setlIdModificacionLineasProductosActualForeignKey(
			Long lIdModificacionLineasProductosActualForeignKey) {
		this.lIdModificacionLineasProductosActualForeignKey = lIdModificacionLineasProductosActualForeignKey;
	}
				    
	public Long getlIdModificacionLineasProductosActualForeignKeyParaPosibleAtras() {
		return lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdModificacionLineasProductosActualForeignKeyParaPosibleAtras(
			Long lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras) {
		this.lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras = lIdModificacionLineasProductosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyModificacionLineasProductosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaModificacionLineasProductos() {
		return sUltimaBusquedaModificacionLineasProductos;
	}

	public void setsUltimaBusquedaModificacionLineasProductos(String sUltimaBusquedaModificacionLineasProductos) {
		this.sUltimaBusquedaModificacionLineasProductos = sUltimaBusquedaModificacionLineasProductos;
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
    
	public Long getid_producto() {
		return this.id_producto;
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
    
	public Long getid_linea_destino() {
		return this.id_linea_destino;
	}
    
	public Long getid_linea_grupo_destino() {
		return this.id_linea_grupo_destino;
	}
    
	public Long getid_linea_categoria_destino() {
		return this.id_linea_categoria_destino;
	}
    
	public Long getid_linea_marca_destino() {
		return this.id_linea_marca_destino;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_producto(Long newid_producto)throws Exception
	{
		try {
			if(this.id_producto!=newid_producto) {
				if(newid_producto==null) {
					//newid_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
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
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea");
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
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_grupo");
					}
				}

				this.id_linea_grupo=newid_linea_grupo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_categoria(Long newid_linea_categoria)throws Exception
	{
		try {
			if(this.id_linea_categoria!=newid_linea_categoria) {
				if(newid_linea_categoria==null) {
					//newid_linea_categoria=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_categoria");
					}
				}

				this.id_linea_categoria=newid_linea_categoria;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_marca(Long newid_linea_marca)throws Exception
	{
		try {
			if(this.id_linea_marca!=newid_linea_marca) {
				if(newid_linea_marca==null) {
					//newid_linea_marca=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_marca");
					}
				}

				this.id_linea_marca=newid_linea_marca;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_destino(Long newid_linea_destino)throws Exception
	{
		try {
			if(this.id_linea_destino!=newid_linea_destino) {
				if(newid_linea_destino==null) {
					//newid_linea_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_destino");
					}
				}

				this.id_linea_destino=newid_linea_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_grupo_destino(Long newid_linea_grupo_destino)throws Exception
	{
		try {
			if(this.id_linea_grupo_destino!=newid_linea_grupo_destino) {
				if(newid_linea_grupo_destino==null) {
					//newid_linea_grupo_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_grupo_destino");
					}
				}

				this.id_linea_grupo_destino=newid_linea_grupo_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_categoria_destino(Long newid_linea_categoria_destino)throws Exception
	{
		try {
			if(this.id_linea_categoria_destino!=newid_linea_categoria_destino) {
				if(newid_linea_categoria_destino==null) {
					//newid_linea_categoria_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_categoria_destino");
					}
				}

				this.id_linea_categoria_destino=newid_linea_categoria_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_marca_destino(Long newid_linea_marca_destino)throws Exception
	{
		try {
			if(this.id_linea_marca_destino!=newid_linea_marca_destino) {
				if(newid_linea_marca_destino==null) {
					//newid_linea_marca_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModificacionLineasProductos:Valor nulo no permitido en columna id_linea_marca_destino");
					}
				}

				this.id_linea_marca_destino=newid_linea_marca_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionProducto() {
		return isBusquedaDesdeForeignKeySesionProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionProducto(
		Boolean isBusquedaDesdeForeignKeySesionProducto) {
		this.isBusquedaDesdeForeignKeySesionProducto = isBusquedaDesdeForeignKeySesionProducto;
	}

	public Long getlidProductoActual() {
		return lidProductoActual;
	}

	public void setlidProductoActual(Long lidProductoActual) {
		this.lidProductoActual = lidProductoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionLineaDestino() {
		return isBusquedaDesdeForeignKeySesionLineaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaDestino(
		Boolean isBusquedaDesdeForeignKeySesionLineaDestino) {
		this.isBusquedaDesdeForeignKeySesionLineaDestino = isBusquedaDesdeForeignKeySesionLineaDestino;
	}

	public Long getlidLineaDestinoActual() {
		return lidLineaDestinoActual;
	}

	public void setlidLineaDestinoActual(Long lidLineaDestinoActual) {
		this.lidLineaDestinoActual = lidLineaDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaGrupoDestino() {
		return isBusquedaDesdeForeignKeySesionLineaGrupoDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaGrupoDestino(
		Boolean isBusquedaDesdeForeignKeySesionLineaGrupoDestino) {
		this.isBusquedaDesdeForeignKeySesionLineaGrupoDestino = isBusquedaDesdeForeignKeySesionLineaGrupoDestino;
	}

	public Long getlidLineaGrupoDestinoActual() {
		return lidLineaGrupoDestinoActual;
	}

	public void setlidLineaGrupoDestinoActual(Long lidLineaGrupoDestinoActual) {
		this.lidLineaGrupoDestinoActual = lidLineaGrupoDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaCategoriaDestino() {
		return isBusquedaDesdeForeignKeySesionLineaCategoriaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaCategoriaDestino(
		Boolean isBusquedaDesdeForeignKeySesionLineaCategoriaDestino) {
		this.isBusquedaDesdeForeignKeySesionLineaCategoriaDestino = isBusquedaDesdeForeignKeySesionLineaCategoriaDestino;
	}

	public Long getlidLineaCategoriaDestinoActual() {
		return lidLineaCategoriaDestinoActual;
	}

	public void setlidLineaCategoriaDestinoActual(Long lidLineaCategoriaDestinoActual) {
		this.lidLineaCategoriaDestinoActual = lidLineaCategoriaDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaMarcaDestino() {
		return isBusquedaDesdeForeignKeySesionLineaMarcaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaMarcaDestino(
		Boolean isBusquedaDesdeForeignKeySesionLineaMarcaDestino) {
		this.isBusquedaDesdeForeignKeySesionLineaMarcaDestino = isBusquedaDesdeForeignKeySesionLineaMarcaDestino;
	}

	public Long getlidLineaMarcaDestinoActual() {
		return lidLineaMarcaDestinoActual;
	}

	public void setlidLineaMarcaDestinoActual(Long lidLineaMarcaDestinoActual) {
		this.lidLineaMarcaDestinoActual = lidLineaMarcaDestinoActual;
	}
	
	
		
	
}
