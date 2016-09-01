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
public class ProductoSessionBean  extends ProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProducto;
	protected Long lIdProductoActualForeignKey;	
	
	protected Long lIdProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras;
	protected String sUltimaBusquedaProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	Long lidTipoProductoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	Long lidTipoProductoServicioInvenActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCosteo;
	Long lidTipoCosteoActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidadPeso;
	Long lidUnidadPesoActual;
	Boolean isBusquedaDesdeForeignKeySesionArancel;
	Long lidArancelActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteProveedorDefecto;
	Long lidClienteProveedorDefectoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProducto;
	Long lidTipoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionColorProducto;
	Long lidColorProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionClaseProducto;
	Long lidClaseProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionEfectoProducto;
	Long lidEfectoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionMarcaProducto;
	Long lidMarcaProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionModeloProducto;
	Long lidModeloProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionMaterialProducto;
	Long lidMaterialProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionSegmentoProducto;
	Long lidSegmentoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionTallaProducto;
	Long lidTallaProductoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private String codigo;
	private String nombre;
	private String nombre_extranjero;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	private Long id_tipo_producto_servicio;
	private Long id_tipo_producto_servicio_inven;
	private Long id_tipo_costeo;
	private Long id_unidad;
	private Long id_unidad_peso;
	private Long id_arancel;
	private Long id_cliente;
	private Long id_cliente_proveedor_defecto;
	private Long id_tipo_producto;
	private Long id_color_producto;
	private Long id_clase_producto;
	private Long id_efecto_producto;
	private Long id_marca_producto;
	private Long id_modelo_producto;
	private Long id_material_producto;
	private Long id_segmento_producto;
	private Long id_talla_producto;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoSessionBeanAdditional productoSessionBeanAdditional=null;
	
	public ProductoSessionBeanAdditional getProductoSessionBeanAdditional() {
		return this.productoSessionBeanAdditional;
	}
	
	public void setProductoSessionBeanAdditional(ProductoSessionBeanAdditional productoSessionBeanAdditional) {
		try {
			this.productoSessionBeanAdditional=productoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoSessionBean () {
		this.inicializarProductoSessionBean();
	}
	
	public void inicializarProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProducto=false;
		this.lIdProductoActualForeignKey=0L;
		this.lIdProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras=false;
		this.sUltimaBusquedaProducto ="";
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
		isBusquedaDesdeForeignKeySesionTipoProductoServicio=false;
		lidTipoProductoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProductoServicioInven=false;
		lidTipoProductoServicioInvenActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCosteo=false;
		lidTipoCosteoActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L;
		isBusquedaDesdeForeignKeySesionUnidadPeso=false;
		lidUnidadPesoActual=0L;
		isBusquedaDesdeForeignKeySesionArancel=false;
		lidArancelActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionClienteProveedorDefecto=false;
		lidClienteProveedorDefectoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProducto=false;
		lidTipoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionColorProducto=false;
		lidColorProductoActual=0L;
		isBusquedaDesdeForeignKeySesionClaseProducto=false;
		lidClaseProductoActual=0L;
		isBusquedaDesdeForeignKeySesionEfectoProducto=false;
		lidEfectoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionMarcaProducto=false;
		lidMarcaProductoActual=0L;
		isBusquedaDesdeForeignKeySesionModeloProducto=false;
		lidModeloProductoActual=0L;
		isBusquedaDesdeForeignKeySesionMaterialProducto=false;
		lidMaterialProductoActual=0L;
		isBusquedaDesdeForeignKeySesionSegmentoProducto=false;
		lidSegmentoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionTallaProducto=false;
		lidTallaProductoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.nombre_extranjero="";
 		this.id_linea=-1L;
 		this.id_linea_grupo=null;
 		this.id_linea_categoria=null;
 		this.id_linea_marca=null;
 		this.id_tipo_producto_servicio=-1L;
 		this.id_tipo_producto_servicio_inven=-1L;
 		this.id_tipo_costeo=-1L;
 		this.id_unidad=-1L;
 		this.id_unidad_peso=-1L;
 		this.id_arancel=-1L;
 		this.id_cliente=-1L;
 		this.id_cliente_proveedor_defecto=-1L;
 		this.id_tipo_producto=-1L;
 		this.id_color_producto=-1L;
 		this.id_clase_producto=-1L;
 		this.id_efecto_producto=-1L;
 		this.id_marca_producto=-1L;
 		this.id_modelo_producto=-1L;
 		this.id_material_producto=-1L;
 		this.id_segmento_producto=-1L;
 		this.id_talla_producto=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProducto= isPermiteNavegacionHaciaForeignKeyDesdeProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProducto= isBusquedaDesdeForeignKeySesionForeignKeyProducto;
	}
					
	public Long getlIdProductoActualForeignKey() {
		return lIdProductoActualForeignKey;
	}

	public void setlIdProductoActualForeignKey(
			Long lIdProductoActualForeignKey) {
		this.lIdProductoActualForeignKey = lIdProductoActualForeignKey;
	}
				    
	public Long getlIdProductoActualForeignKeyParaPosibleAtras() {
		return lIdProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoActualForeignKeyParaPosibleAtras(
			Long lIdProductoActualForeignKeyParaPosibleAtras) {
		this.lIdProductoActualForeignKeyParaPosibleAtras = lIdProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProducto() {
		return sUltimaBusquedaProducto;
	}

	public void setsUltimaBusquedaProducto(String sUltimaBusquedaProducto) {
		this.sUltimaBusquedaProducto = sUltimaBusquedaProducto;
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
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getnombre_extranjero() {
		return this.nombre_extranjero;
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
    
	public Long getid_tipo_producto_servicio() {
		return this.id_tipo_producto_servicio;
	}
    
	public Long getid_tipo_producto_servicio_inven() {
		return this.id_tipo_producto_servicio_inven;
	}
    
	public Long getid_tipo_costeo() {
		return this.id_tipo_costeo;
	}
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
    
	public Long getid_unidad_peso() {
		return this.id_unidad_peso;
	}
    
	public Long getid_arancel() {
		return this.id_arancel;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_cliente_proveedor_defecto() {
		return this.id_cliente_proveedor_defecto;
	}
    
	public Long getid_tipo_producto() {
		return this.id_tipo_producto;
	}
    
	public Long getid_color_producto() {
		return this.id_color_producto;
	}
    
	public Long getid_clase_producto() {
		return this.id_clase_producto;
	}
    
	public Long getid_efecto_producto() {
		return this.id_efecto_producto;
	}
    
	public Long getid_marca_producto() {
		return this.id_marca_producto;
	}
    
	public Long getid_modelo_producto() {
		return this.id_modelo_producto;
	}
    
	public Long getid_material_producto() {
		return this.id_material_producto;
	}
    
	public Long getid_segmento_producto() {
		return this.id_segmento_producto;
	}
    
	public Long getid_talla_producto() {
		return this.id_talla_producto;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id");
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
						System.out.println("Producto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Producto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Producto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Producto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_extranjero(String newnombre_extranjero)throws Exception
	{
		try {
			if(this.nombre_extranjero!=newnombre_extranjero) {
				if(newnombre_extranjero==null) {
					//newnombre_extranjero="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna nombre_extranjero");
					}
				}

				if(newnombre_extranjero!=null&&newnombre_extranjero.length()>150) {
					newnombre_extranjero=newnombre_extranjero.substring(0,148);
					System.out.println("Producto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_extranjero");
				}

				this.nombre_extranjero=newnombre_extranjero;
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
						System.out.println("Producto:Valor nulo no permitido en columna id_linea");
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
    
	public void setid_tipo_producto_servicio(Long newid_tipo_producto_servicio)throws Exception
	{
		try {
			if(this.id_tipo_producto_servicio!=newid_tipo_producto_servicio) {
				if(newid_tipo_producto_servicio==null) {
					//newid_tipo_producto_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_tipo_producto_servicio");
					}
				}

				this.id_tipo_producto_servicio=newid_tipo_producto_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto_servicio_inven(Long newid_tipo_producto_servicio_inven)throws Exception
	{
		try {
			if(this.id_tipo_producto_servicio_inven!=newid_tipo_producto_servicio_inven) {
				if(newid_tipo_producto_servicio_inven==null) {
					//newid_tipo_producto_servicio_inven=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_tipo_producto_servicio_inven");
					}
				}

				this.id_tipo_producto_servicio_inven=newid_tipo_producto_servicio_inven;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_costeo(Long newid_tipo_costeo)throws Exception
	{
		try {
			if(this.id_tipo_costeo!=newid_tipo_costeo) {
				if(newid_tipo_costeo==null) {
					//newid_tipo_costeo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_tipo_costeo");
					}
				}

				this.id_tipo_costeo=newid_tipo_costeo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad(Long newid_unidad)throws Exception
	{
		try {
			if(this.id_unidad!=newid_unidad) {
				if(newid_unidad==null) {
					//newid_unidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad_peso(Long newid_unidad_peso)throws Exception
	{
		try {
			if(this.id_unidad_peso!=newid_unidad_peso) {
				if(newid_unidad_peso==null) {
					//newid_unidad_peso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_unidad_peso");
					}
				}

				this.id_unidad_peso=newid_unidad_peso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_arancel(Long newid_arancel)throws Exception
	{
		try {
			if(this.id_arancel!=newid_arancel) {
				if(newid_arancel==null) {
					//newid_arancel=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_arancel");
					}
				}

				this.id_arancel=newid_arancel;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_proveedor_defecto(Long newid_cliente_proveedor_defecto)throws Exception
	{
		try {
			if(this.id_cliente_proveedor_defecto!=newid_cliente_proveedor_defecto) {
				if(newid_cliente_proveedor_defecto==null) {
					//newid_cliente_proveedor_defecto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_cliente_proveedor_defecto");
					}
				}

				this.id_cliente_proveedor_defecto=newid_cliente_proveedor_defecto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto(Long newid_tipo_producto)throws Exception
	{
		try {
			if(this.id_tipo_producto!=newid_tipo_producto) {
				if(newid_tipo_producto==null) {
					//newid_tipo_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_tipo_producto");
					}
				}

				this.id_tipo_producto=newid_tipo_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_color_producto(Long newid_color_producto)throws Exception
	{
		try {
			if(this.id_color_producto!=newid_color_producto) {
				if(newid_color_producto==null) {
					//newid_color_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_color_producto");
					}
				}

				this.id_color_producto=newid_color_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_clase_producto(Long newid_clase_producto)throws Exception
	{
		try {
			if(this.id_clase_producto!=newid_clase_producto) {
				if(newid_clase_producto==null) {
					//newid_clase_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_clase_producto");
					}
				}

				this.id_clase_producto=newid_clase_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_efecto_producto(Long newid_efecto_producto)throws Exception
	{
		try {
			if(this.id_efecto_producto!=newid_efecto_producto) {
				if(newid_efecto_producto==null) {
					//newid_efecto_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_efecto_producto");
					}
				}

				this.id_efecto_producto=newid_efecto_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_marca_producto(Long newid_marca_producto)throws Exception
	{
		try {
			if(this.id_marca_producto!=newid_marca_producto) {
				if(newid_marca_producto==null) {
					//newid_marca_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_marca_producto");
					}
				}

				this.id_marca_producto=newid_marca_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modelo_producto(Long newid_modelo_producto)throws Exception
	{
		try {
			if(this.id_modelo_producto!=newid_modelo_producto) {
				if(newid_modelo_producto==null) {
					//newid_modelo_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_modelo_producto");
					}
				}

				this.id_modelo_producto=newid_modelo_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_material_producto(Long newid_material_producto)throws Exception
	{
		try {
			if(this.id_material_producto!=newid_material_producto) {
				if(newid_material_producto==null) {
					//newid_material_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_material_producto");
					}
				}

				this.id_material_producto=newid_material_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_segmento_producto(Long newid_segmento_producto)throws Exception
	{
		try {
			if(this.id_segmento_producto!=newid_segmento_producto) {
				if(newid_segmento_producto==null) {
					//newid_segmento_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_segmento_producto");
					}
				}

				this.id_segmento_producto=newid_segmento_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_talla_producto(Long newid_talla_producto)throws Exception
	{
		try {
			if(this.id_talla_producto!=newid_talla_producto) {
				if(newid_talla_producto==null) {
					//newid_talla_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Producto:Valor nulo no permitido en columna id_talla_producto");
					}
				}

				this.id_talla_producto=newid_talla_producto;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProductoServicio() {
		return isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProductoServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoProductoServicio = isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public Long getlidTipoProductoServicioActual() {
		return lidTipoProductoServicioActual;
	}

	public void setlidTipoProductoServicioActual(Long lidTipoProductoServicioActual) {
		this.lidTipoProductoServicioActual = lidTipoProductoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProductoServicioInven() {
		return isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProductoServicioInven(
		Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicioInven) {
		this.isBusquedaDesdeForeignKeySesionTipoProductoServicioInven = isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	}

	public Long getlidTipoProductoServicioInvenActual() {
		return lidTipoProductoServicioInvenActual;
	}

	public void setlidTipoProductoServicioInvenActual(Long lidTipoProductoServicioInvenActual) {
		this.lidTipoProductoServicioInvenActual = lidTipoProductoServicioInvenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCosteo() {
		return isBusquedaDesdeForeignKeySesionTipoCosteo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCosteo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCosteo) {
		this.isBusquedaDesdeForeignKeySesionTipoCosteo = isBusquedaDesdeForeignKeySesionTipoCosteo;
	}

	public Long getlidTipoCosteoActual() {
		return lidTipoCosteoActual;
	}

	public void setlidTipoCosteoActual(Long lidTipoCosteoActual) {
		this.lidTipoCosteoActual = lidTipoCosteoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionUnidad() {
		return isBusquedaDesdeForeignKeySesionUnidad;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidad(
		Boolean isBusquedaDesdeForeignKeySesionUnidad) {
		this.isBusquedaDesdeForeignKeySesionUnidad = isBusquedaDesdeForeignKeySesionUnidad;
	}

	public Long getlidUnidadActual() {
		return lidUnidadActual;
	}

	public void setlidUnidadActual(Long lidUnidadActual) {
		this.lidUnidadActual = lidUnidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionUnidadPeso() {
		return isBusquedaDesdeForeignKeySesionUnidadPeso;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidadPeso(
		Boolean isBusquedaDesdeForeignKeySesionUnidadPeso) {
		this.isBusquedaDesdeForeignKeySesionUnidadPeso = isBusquedaDesdeForeignKeySesionUnidadPeso;
	}

	public Long getlidUnidadPesoActual() {
		return lidUnidadPesoActual;
	}

	public void setlidUnidadPesoActual(Long lidUnidadPesoActual) {
		this.lidUnidadPesoActual = lidUnidadPesoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionArancel() {
		return isBusquedaDesdeForeignKeySesionArancel;
	}

	public void setisBusquedaDesdeForeignKeySesionArancel(
		Boolean isBusquedaDesdeForeignKeySesionArancel) {
		this.isBusquedaDesdeForeignKeySesionArancel = isBusquedaDesdeForeignKeySesionArancel;
	}

	public Long getlidArancelActual() {
		return lidArancelActual;
	}

	public void setlidArancelActual(Long lidArancelActual) {
		this.lidArancelActual = lidArancelActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClienteProveedorDefecto() {
		return isBusquedaDesdeForeignKeySesionClienteProveedorDefecto;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteProveedorDefecto(
		Boolean isBusquedaDesdeForeignKeySesionClienteProveedorDefecto) {
		this.isBusquedaDesdeForeignKeySesionClienteProveedorDefecto = isBusquedaDesdeForeignKeySesionClienteProveedorDefecto;
	}

	public Long getlidClienteProveedorDefectoActual() {
		return lidClienteProveedorDefectoActual;
	}

	public void setlidClienteProveedorDefectoActual(Long lidClienteProveedorDefectoActual) {
		this.lidClienteProveedorDefectoActual = lidClienteProveedorDefectoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProducto() {
		return isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProducto(
		Boolean isBusquedaDesdeForeignKeySesionTipoProducto) {
		this.isBusquedaDesdeForeignKeySesionTipoProducto = isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public Long getlidTipoProductoActual() {
		return lidTipoProductoActual;
	}

	public void setlidTipoProductoActual(Long lidTipoProductoActual) {
		this.lidTipoProductoActual = lidTipoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionColorProducto() {
		return isBusquedaDesdeForeignKeySesionColorProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionColorProducto(
		Boolean isBusquedaDesdeForeignKeySesionColorProducto) {
		this.isBusquedaDesdeForeignKeySesionColorProducto = isBusquedaDesdeForeignKeySesionColorProducto;
	}

	public Long getlidColorProductoActual() {
		return lidColorProductoActual;
	}

	public void setlidColorProductoActual(Long lidColorProductoActual) {
		this.lidColorProductoActual = lidColorProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClaseProducto() {
		return isBusquedaDesdeForeignKeySesionClaseProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionClaseProducto(
		Boolean isBusquedaDesdeForeignKeySesionClaseProducto) {
		this.isBusquedaDesdeForeignKeySesionClaseProducto = isBusquedaDesdeForeignKeySesionClaseProducto;
	}

	public Long getlidClaseProductoActual() {
		return lidClaseProductoActual;
	}

	public void setlidClaseProductoActual(Long lidClaseProductoActual) {
		this.lidClaseProductoActual = lidClaseProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEfectoProducto() {
		return isBusquedaDesdeForeignKeySesionEfectoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionEfectoProducto(
		Boolean isBusquedaDesdeForeignKeySesionEfectoProducto) {
		this.isBusquedaDesdeForeignKeySesionEfectoProducto = isBusquedaDesdeForeignKeySesionEfectoProducto;
	}

	public Long getlidEfectoProductoActual() {
		return lidEfectoProductoActual;
	}

	public void setlidEfectoProductoActual(Long lidEfectoProductoActual) {
		this.lidEfectoProductoActual = lidEfectoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMarcaProducto() {
		return isBusquedaDesdeForeignKeySesionMarcaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionMarcaProducto(
		Boolean isBusquedaDesdeForeignKeySesionMarcaProducto) {
		this.isBusquedaDesdeForeignKeySesionMarcaProducto = isBusquedaDesdeForeignKeySesionMarcaProducto;
	}

	public Long getlidMarcaProductoActual() {
		return lidMarcaProductoActual;
	}

	public void setlidMarcaProductoActual(Long lidMarcaProductoActual) {
		this.lidMarcaProductoActual = lidMarcaProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModeloProducto() {
		return isBusquedaDesdeForeignKeySesionModeloProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionModeloProducto(
		Boolean isBusquedaDesdeForeignKeySesionModeloProducto) {
		this.isBusquedaDesdeForeignKeySesionModeloProducto = isBusquedaDesdeForeignKeySesionModeloProducto;
	}

	public Long getlidModeloProductoActual() {
		return lidModeloProductoActual;
	}

	public void setlidModeloProductoActual(Long lidModeloProductoActual) {
		this.lidModeloProductoActual = lidModeloProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMaterialProducto() {
		return isBusquedaDesdeForeignKeySesionMaterialProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionMaterialProducto(
		Boolean isBusquedaDesdeForeignKeySesionMaterialProducto) {
		this.isBusquedaDesdeForeignKeySesionMaterialProducto = isBusquedaDesdeForeignKeySesionMaterialProducto;
	}

	public Long getlidMaterialProductoActual() {
		return lidMaterialProductoActual;
	}

	public void setlidMaterialProductoActual(Long lidMaterialProductoActual) {
		this.lidMaterialProductoActual = lidMaterialProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSegmentoProducto() {
		return isBusquedaDesdeForeignKeySesionSegmentoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionSegmentoProducto(
		Boolean isBusquedaDesdeForeignKeySesionSegmentoProducto) {
		this.isBusquedaDesdeForeignKeySesionSegmentoProducto = isBusquedaDesdeForeignKeySesionSegmentoProducto;
	}

	public Long getlidSegmentoProductoActual() {
		return lidSegmentoProductoActual;
	}

	public void setlidSegmentoProductoActual(Long lidSegmentoProductoActual) {
		this.lidSegmentoProductoActual = lidSegmentoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTallaProducto() {
		return isBusquedaDesdeForeignKeySesionTallaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionTallaProducto(
		Boolean isBusquedaDesdeForeignKeySesionTallaProducto) {
		this.isBusquedaDesdeForeignKeySesionTallaProducto = isBusquedaDesdeForeignKeySesionTallaProducto;
	}

	public Long getlidTallaProductoActual() {
		return lidTallaProductoActual;
	}

	public void setlidTallaProductoActual(Long lidTallaProductoActual) {
		this.lidTallaProductoActual = lidTallaProductoActual;
	}
	
	
		
	
}
