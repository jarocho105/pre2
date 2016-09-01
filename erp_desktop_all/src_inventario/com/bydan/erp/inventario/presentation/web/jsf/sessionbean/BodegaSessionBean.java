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
public class BodegaSessionBean  extends BodegaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBodega;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodega;
	protected Long lIdBodegaActualForeignKey;	
	
	protected Long lIdBodegaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras;
	protected String sUltimaBusquedaBodega;
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
	Boolean isBusquedaDesdeForeignKeySesionGrupoBodega;
	Long lidGrupoBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionCalidadProducto;
	Long lidCalidadProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	Long lidCuentaContableInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	Long lidCuentaContableCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	Long lidCuentaContableVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	Long lidCuentaContableDescuentoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	Long lidCuentaContableDevolucionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	Long lidCuentaContableBonificaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	Long lidCuentaContableProduccionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	Long lidCuentaContableCostoBonificaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_grupo_bodega;
	private Long id_calidad_producto;
	private String codigo;
	private String nombre;
	private String siglas;
	private String telefono;
	private String ruc;
	private String responsable_nombre;
	private Long id_pais;
	private Long id_ciudad;
	private Long id_centro_costo;
	private Long id_empleado;
	private Long id_cuenta_contable_inventario;
	private Long id_cuenta_contable_costo;
	private Long id_cuenta_contable_venta;
	private Long id_cuenta_contable_descuento;
	private Long id_cuenta_contable_devolucion;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	private Long id_cuenta_contable_bonifica;
	private Long id_cuenta_contable_produccion;
	private Long id_cuenta_contable_costo_bonifica;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BodegaSessionBeanAdditional bodegaSessionBeanAdditional=null;
	
	public BodegaSessionBeanAdditional getBodegaSessionBeanAdditional() {
		return this.bodegaSessionBeanAdditional;
	}
	
	public void setBodegaSessionBeanAdditional(BodegaSessionBeanAdditional bodegaSessionBeanAdditional) {
		try {
			this.bodegaSessionBeanAdditional=bodegaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BodegaSessionBean () {
		this.inicializarBodegaSessionBean();
	}
	
	public void inicializarBodegaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBodega=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodega=false;
		this.lIdBodegaActualForeignKey=0L;
		this.lIdBodegaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras=false;
		this.sUltimaBusquedaBodega ="";
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
		isBusquedaDesdeForeignKeySesionGrupoBodega=false;
		lidGrupoBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionCalidadProducto=false;
		lidCalidadProductoActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventario=false;
		lidCuentaContableInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCosto=false;
		lidCuentaContableCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVenta=false;
		lidCuentaContableVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDescuento=false;
		lidCuentaContableDescuentoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDevolucion=false;
		lidCuentaContableDevolucionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableBonifica=false;
		lidCuentaContableBonificaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableProduccion=false;
		lidCuentaContableProduccionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica=false;
		lidCuentaContableCostoBonificaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_grupo_bodega=-1L;
 		this.id_calidad_producto=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.siglas="";
 		this.telefono="";
 		this.ruc="";
 		this.responsable_nombre="";
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
 		this.id_centro_costo=null;
 		this.id_empleado=-1L;
 		this.id_cuenta_contable_inventario=-1L;
 		this.id_cuenta_contable_costo=-1L;
 		this.id_cuenta_contable_venta=-1L;
 		this.id_cuenta_contable_descuento=-1L;
 		this.id_cuenta_contable_devolucion=-1L;
 		this.id_cuenta_contable_debito=null;
 		this.id_cuenta_contable_credito=null;
 		this.id_cuenta_contable_bonifica=-1L;
 		this.id_cuenta_contable_produccion=-1L;
 		this.id_cuenta_contable_costo_bonifica=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBodega() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBodega;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBodega(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBodega) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBodega= isPermiteNavegacionHaciaForeignKeyDesdeBodega;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBodega() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBodega(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega = sNombrePaginaNavegacionHaciaForeignKeyDesdeBodega;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBodega() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBodega(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodega) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodega= isBusquedaDesdeForeignKeySesionForeignKeyBodega;
	}
					
	public Long getlIdBodegaActualForeignKey() {
		return lIdBodegaActualForeignKey;
	}

	public void setlIdBodegaActualForeignKey(
			Long lIdBodegaActualForeignKey) {
		this.lIdBodegaActualForeignKey = lIdBodegaActualForeignKey;
	}
				    
	public Long getlIdBodegaActualForeignKeyParaPosibleAtras() {
		return lIdBodegaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBodegaActualForeignKeyParaPosibleAtras(
			Long lIdBodegaActualForeignKeyParaPosibleAtras) {
		this.lIdBodegaActualForeignKeyParaPosibleAtras = lIdBodegaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBodegaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBodega() {
		return sUltimaBusquedaBodega;
	}

	public void setsUltimaBusquedaBodega(String sUltimaBusquedaBodega) {
		this.sUltimaBusquedaBodega = sUltimaBusquedaBodega;
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
    
	public Long getid_grupo_bodega() {
		return this.id_grupo_bodega;
	}
    
	public Long getid_calidad_producto() {
		return this.id_calidad_producto;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getsiglas() {
		return this.siglas;
	}
    
	public String gettelefono() {
		return this.telefono;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public String getresponsable_nombre() {
		return this.responsable_nombre;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_cuenta_contable_inventario() {
		return this.id_cuenta_contable_inventario;
	}
    
	public Long getid_cuenta_contable_costo() {
		return this.id_cuenta_contable_costo;
	}
    
	public Long getid_cuenta_contable_venta() {
		return this.id_cuenta_contable_venta;
	}
    
	public Long getid_cuenta_contable_descuento() {
		return this.id_cuenta_contable_descuento;
	}
    
	public Long getid_cuenta_contable_devolucion() {
		return this.id_cuenta_contable_devolucion;
	}
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
    
	public Long getid_cuenta_contable_bonifica() {
		return this.id_cuenta_contable_bonifica;
	}
    
	public Long getid_cuenta_contable_produccion() {
		return this.id_cuenta_contable_produccion;
	}
    
	public Long getid_cuenta_contable_costo_bonifica() {
		return this.id_cuenta_contable_costo_bonifica;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id");
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
						System.out.println("Bodega:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_bodega(Long newid_grupo_bodega)throws Exception
	{
		try {
			if(this.id_grupo_bodega!=newid_grupo_bodega) {
				if(newid_grupo_bodega==null) {
					//newid_grupo_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_grupo_bodega");
					}
				}

				this.id_grupo_bodega=newid_grupo_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_calidad_producto(Long newid_calidad_producto)throws Exception
	{
		try {
			if(this.id_calidad_producto!=newid_calidad_producto) {
				if(newid_calidad_producto==null) {
					//newid_calidad_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_calidad_producto");
					}
				}

				this.id_calidad_producto=newid_calidad_producto;
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
						System.out.println("Bodega:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>100) {
					newcodigo=newcodigo.substring(0,98);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna codigo");
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
						System.out.println("Bodega:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setsiglas(String newsiglas)throws Exception
	{
		try {
			if(this.siglas!=newsiglas) {
				if(newsiglas==null) {
					//newsiglas="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna siglas");
					}
				}

				if(newsiglas!=null&&newsiglas.length()>50) {
					newsiglas=newsiglas.substring(0,48);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna siglas");
				}

				this.siglas=newsiglas;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settelefono(String newtelefono)throws Exception
	{
		try {
			if(this.telefono!=newtelefono) {
				if(newtelefono==null) {
					//newtelefono="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna telefono");
					}
				}

				if(newtelefono!=null&&newtelefono.length()>50) {
					newtelefono=newtelefono.substring(0,48);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna telefono");
				}

				this.telefono=newtelefono;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setruc(String newruc)throws Exception
	{
		try {
			if(this.ruc!=newruc) {
				if(newruc==null) {
					//newruc="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>20) {
					newruc=newruc.substring(0,18);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ruc");
				}

				this.ruc=newruc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setresponsable_nombre(String newresponsable_nombre)throws Exception
	{
		try {
			if(this.responsable_nombre!=newresponsable_nombre) {
				if(newresponsable_nombre==null) {
					//newresponsable_nombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna responsable_nombre");
					}
				}

				if(newresponsable_nombre!=null&&newresponsable_nombre.length()>150) {
					newresponsable_nombre=newresponsable_nombre.substring(0,148);
					System.out.println("Bodega:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna responsable_nombre");
				}

				this.responsable_nombre=newresponsable_nombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
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
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inventario(Long newid_cuenta_contable_inventario)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario!=newid_cuenta_contable_inventario) {
				if(newid_cuenta_contable_inventario==null) {
					//newid_cuenta_contable_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_inventario");
					}
				}

				this.id_cuenta_contable_inventario=newid_cuenta_contable_inventario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo(Long newid_cuenta_contable_costo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo!=newid_cuenta_contable_costo) {
				if(newid_cuenta_contable_costo==null) {
					//newid_cuenta_contable_costo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_costo");
					}
				}

				this.id_cuenta_contable_costo=newid_cuenta_contable_costo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_venta(Long newid_cuenta_contable_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_venta!=newid_cuenta_contable_venta) {
				if(newid_cuenta_contable_venta==null) {
					//newid_cuenta_contable_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_venta");
					}
				}

				this.id_cuenta_contable_venta=newid_cuenta_contable_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_descuento(Long newid_cuenta_contable_descuento)throws Exception
	{
		try {
			if(this.id_cuenta_contable_descuento!=newid_cuenta_contable_descuento) {
				if(newid_cuenta_contable_descuento==null) {
					//newid_cuenta_contable_descuento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_descuento");
					}
				}

				this.id_cuenta_contable_descuento=newid_cuenta_contable_descuento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_devolucion(Long newid_cuenta_contable_devolucion)throws Exception
	{
		try {
			if(this.id_cuenta_contable_devolucion!=newid_cuenta_contable_devolucion) {
				if(newid_cuenta_contable_devolucion==null) {
					//newid_cuenta_contable_devolucion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_devolucion");
					}
				}

				this.id_cuenta_contable_devolucion=newid_cuenta_contable_devolucion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_debito(Long newid_cuenta_contable_debito) {
		if(this.id_cuenta_contable_debito!=newid_cuenta_contable_debito) {

			this.id_cuenta_contable_debito=newid_cuenta_contable_debito;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito) {
		if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {

			this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
		}
	}
    
	public void setid_cuenta_contable_bonifica(Long newid_cuenta_contable_bonifica)throws Exception
	{
		try {
			if(this.id_cuenta_contable_bonifica!=newid_cuenta_contable_bonifica) {
				if(newid_cuenta_contable_bonifica==null) {
					//newid_cuenta_contable_bonifica=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_bonifica");
					}
				}

				this.id_cuenta_contable_bonifica=newid_cuenta_contable_bonifica;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_produccion(Long newid_cuenta_contable_produccion)throws Exception
	{
		try {
			if(this.id_cuenta_contable_produccion!=newid_cuenta_contable_produccion) {
				if(newid_cuenta_contable_produccion==null) {
					//newid_cuenta_contable_produccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_produccion");
					}
				}

				this.id_cuenta_contable_produccion=newid_cuenta_contable_produccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo_bonifica(Long newid_cuenta_contable_costo_bonifica)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo_bonifica!=newid_cuenta_contable_costo_bonifica) {
				if(newid_cuenta_contable_costo_bonifica==null) {
					//newid_cuenta_contable_costo_bonifica=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bodega:Valor nulo no permitido en columna id_cuenta_contable_costo_bonifica");
					}
				}

				this.id_cuenta_contable_costo_bonifica=newid_cuenta_contable_costo_bonifica;
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
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoBodega() {
		return isBusquedaDesdeForeignKeySesionGrupoBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoBodega(
		Boolean isBusquedaDesdeForeignKeySesionGrupoBodega) {
		this.isBusquedaDesdeForeignKeySesionGrupoBodega = isBusquedaDesdeForeignKeySesionGrupoBodega;
	}

	public Long getlidGrupoBodegaActual() {
		return lidGrupoBodegaActual;
	}

	public void setlidGrupoBodegaActual(Long lidGrupoBodegaActual) {
		this.lidGrupoBodegaActual = lidGrupoBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCalidadProducto() {
		return isBusquedaDesdeForeignKeySesionCalidadProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionCalidadProducto(
		Boolean isBusquedaDesdeForeignKeySesionCalidadProducto) {
		this.isBusquedaDesdeForeignKeySesionCalidadProducto = isBusquedaDesdeForeignKeySesionCalidadProducto;
	}

	public Long getlidCalidadProductoActual() {
		return lidCalidadProductoActual;
	}

	public void setlidCalidadProductoActual(Long lidCalidadProductoActual) {
		this.lidCalidadProductoActual = lidCalidadProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInventario() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInventario(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInventario = isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public Long getlidCuentaContableInventarioActual() {
		return lidCuentaContableInventarioActual;
	}

	public void setlidCuentaContableInventarioActual(Long lidCuentaContableInventarioActual) {
		this.lidCuentaContableInventarioActual = lidCuentaContableInventarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCosto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCosto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCosto = isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public Long getlidCuentaContableCostoActual() {
		return lidCuentaContableCostoActual;
	}

	public void setlidCuentaContableCostoActual(Long lidCuentaContableCostoActual) {
		this.lidCuentaContableCostoActual = lidCuentaContableCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableVenta = isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public Long getlidCuentaContableVentaActual() {
		return lidCuentaContableVentaActual;
	}

	public void setlidCuentaContableVentaActual(Long lidCuentaContableVentaActual) {
		this.lidCuentaContableVentaActual = lidCuentaContableVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDescuento() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDescuento(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDescuento = isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public Long getlidCuentaContableDescuentoActual() {
		return lidCuentaContableDescuentoActual;
	}

	public void setlidCuentaContableDescuentoActual(Long lidCuentaContableDescuentoActual) {
		this.lidCuentaContableDescuentoActual = lidCuentaContableDescuentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDevolucion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDevolucion = isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public Long getlidCuentaContableDevolucionActual() {
		return lidCuentaContableDevolucionActual;
	}

	public void setlidCuentaContableDevolucionActual(Long lidCuentaContableDevolucionActual) {
		this.lidCuentaContableDevolucionActual = lidCuentaContableDevolucionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDebito = isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public Long getlidCuentaContableDebitoActual() {
		return lidCuentaContableDebitoActual;
	}

	public void setlidCuentaContableDebitoActual(Long lidCuentaContableDebitoActual) {
		this.lidCuentaContableDebitoActual = lidCuentaContableDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCredito = isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public Long getlidCuentaContableCreditoActual() {
		return lidCuentaContableCreditoActual;
	}

	public void setlidCuentaContableCreditoActual(Long lidCuentaContableCreditoActual) {
		this.lidCuentaContableCreditoActual = lidCuentaContableCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableBonifica() {
		return isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableBonifica(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableBonifica) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableBonifica = isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	}

	public Long getlidCuentaContableBonificaActual() {
		return lidCuentaContableBonificaActual;
	}

	public void setlidCuentaContableBonificaActual(Long lidCuentaContableBonificaActual) {
		this.lidCuentaContableBonificaActual = lidCuentaContableBonificaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableProduccion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableProduccion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableProduccion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableProduccion = isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	}

	public Long getlidCuentaContableProduccionActual() {
		return lidCuentaContableProduccionActual;
	}

	public void setlidCuentaContableProduccionActual(Long lidCuentaContableProduccionActual) {
		this.lidCuentaContableProduccionActual = lidCuentaContableProduccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica = isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	}

	public Long getlidCuentaContableCostoBonificaActual() {
		return lidCuentaContableCostoBonificaActual;
	}

	public void setlidCuentaContableCostoBonificaActual(Long lidCuentaContableCostoBonificaActual) {
		this.lidCuentaContableCostoBonificaActual = lidCuentaContableCostoBonificaActual;
	}
	
	
		
	
}
