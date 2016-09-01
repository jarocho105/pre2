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
public class DefinicionSessionBean  extends DefinicionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDefinicion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefinicion;
	protected Long lIdDefinicionActualForeignKey;	
	
	protected Long lIdDefinicionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras;
	protected String sUltimaBusquedaDefinicion;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDefinicion;
	Long lidTipoDefinicionActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIvaItem;
	Long lidTipoIvaItemActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGlobalCliente;
	Long lidTipoGlobalClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion;
	Long lidTipoCosteoDefinicionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCostoDefinicion;
	Long lidTipoCostoDefinicionActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTributario;
	Long lidTipoTributarioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencion;
	Long lidTipoRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionLibroContable;
	Long lidLibroContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_modulo;
	private Long id_tipo_definicion;
	private Long id_transaccion;
	private Long id_sucursal;
	private Long id_tipo_iva_item;
	private Long id_tipo_global_cliente;
	private Long id_tipo_costeo_definicion;
	private Long id_tipo_costo_definicion;
	private Long id_formato;
	private Long id_tipo_tributario;
	private Long id_tipo_retencion;
	private Long id_tipo_documento;
	private Long id_libro_contable;
	private Long id_tipo_transaccion_modulo;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DefinicionSessionBeanAdditional definicionSessionBeanAdditional=null;
	
	public DefinicionSessionBeanAdditional getDefinicionSessionBeanAdditional() {
		return this.definicionSessionBeanAdditional;
	}
	
	public void setDefinicionSessionBeanAdditional(DefinicionSessionBeanAdditional definicionSessionBeanAdditional) {
		try {
			this.definicionSessionBeanAdditional=definicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DefinicionSessionBean () {
		this.inicializarDefinicionSessionBean();
	}
	
	public void inicializarDefinicionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDefinicion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefinicion=false;
		this.lIdDefinicionActualForeignKey=0L;
		this.lIdDefinicionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras=false;
		this.sUltimaBusquedaDefinicion ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDefinicion=false;
		lidTipoDefinicionActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIvaItem=false;
		lidTipoIvaItemActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGlobalCliente=false;
		lidTipoGlobalClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion=false;
		lidTipoCosteoDefinicionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCostoDefinicion=false;
		lidTipoCostoDefinicionActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTributario=false;
		lidTipoTributarioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencion=false;
		lidTipoRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionLibroContable=false;
		lidLibroContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_modulo=-1L;
 		this.id_tipo_definicion=-1L;
 		this.id_transaccion=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_iva_item=-1L;
 		this.id_tipo_global_cliente=-1L;
 		this.id_tipo_costeo_definicion=-1L;
 		this.id_tipo_costo_definicion=-1L;
 		this.id_formato=null;
 		this.id_tipo_tributario=null;
 		this.id_tipo_retencion=null;
 		this.id_tipo_documento=null;
 		this.id_libro_contable=null;
 		this.id_tipo_transaccion_modulo=null;
 		this.id_cuenta_contable=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDefinicion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDefinicion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDefinicion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDefinicion= isPermiteNavegacionHaciaForeignKeyDesdeDefinicion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion = sNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDefinicion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDefinicion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDefinicion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefinicion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefinicion= isBusquedaDesdeForeignKeySesionForeignKeyDefinicion;
	}
					
	public Long getlIdDefinicionActualForeignKey() {
		return lIdDefinicionActualForeignKey;
	}

	public void setlIdDefinicionActualForeignKey(
			Long lIdDefinicionActualForeignKey) {
		this.lIdDefinicionActualForeignKey = lIdDefinicionActualForeignKey;
	}
				    
	public Long getlIdDefinicionActualForeignKeyParaPosibleAtras() {
		return lIdDefinicionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDefinicionActualForeignKeyParaPosibleAtras(
			Long lIdDefinicionActualForeignKeyParaPosibleAtras) {
		this.lIdDefinicionActualForeignKeyParaPosibleAtras = lIdDefinicionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDefinicionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDefinicion() {
		return sUltimaBusquedaDefinicion;
	}

	public void setsUltimaBusquedaDefinicion(String sUltimaBusquedaDefinicion) {
		this.sUltimaBusquedaDefinicion = sUltimaBusquedaDefinicion;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_tipo_definicion() {
		return this.id_tipo_definicion;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_tipo_iva_item() {
		return this.id_tipo_iva_item;
	}
    
	public Long getid_tipo_global_cliente() {
		return this.id_tipo_global_cliente;
	}
    
	public Long getid_tipo_costeo_definicion() {
		return this.id_tipo_costeo_definicion;
	}
    
	public Long getid_tipo_costo_definicion() {
		return this.id_tipo_costo_definicion;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_tipo_tributario() {
		return this.id_tipo_tributario;
	}
    
	public Long getid_tipo_retencion() {
		return this.id_tipo_retencion;
	}
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Long getid_libro_contable() {
		return this.id_libro_contable;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id");
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
						System.out.println("Definicion:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_definicion(Long newid_tipo_definicion)throws Exception
	{
		try {
			if(this.id_tipo_definicion!=newid_tipo_definicion) {
				if(newid_tipo_definicion==null) {
					//newid_tipo_definicion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_tipo_definicion");
					}
				}

				this.id_tipo_definicion=newid_tipo_definicion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion(Long newid_transaccion)throws Exception
	{
		try {
			if(this.id_transaccion!=newid_transaccion) {
				if(newid_transaccion==null) {
					//newid_transaccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
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
						System.out.println("Definicion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_iva_item(Long newid_tipo_iva_item)throws Exception
	{
		try {
			if(this.id_tipo_iva_item!=newid_tipo_iva_item) {
				if(newid_tipo_iva_item==null) {
					//newid_tipo_iva_item=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_tipo_iva_item");
					}
				}

				this.id_tipo_iva_item=newid_tipo_iva_item;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_global_cliente(Long newid_tipo_global_cliente)throws Exception
	{
		try {
			if(this.id_tipo_global_cliente!=newid_tipo_global_cliente) {
				if(newid_tipo_global_cliente==null) {
					//newid_tipo_global_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_tipo_global_cliente");
					}
				}

				this.id_tipo_global_cliente=newid_tipo_global_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_costeo_definicion(Long newid_tipo_costeo_definicion)throws Exception
	{
		try {
			if(this.id_tipo_costeo_definicion!=newid_tipo_costeo_definicion) {
				if(newid_tipo_costeo_definicion==null) {
					//newid_tipo_costeo_definicion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_tipo_costeo_definicion");
					}
				}

				this.id_tipo_costeo_definicion=newid_tipo_costeo_definicion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_costo_definicion(Long newid_tipo_costo_definicion)throws Exception
	{
		try {
			if(this.id_tipo_costo_definicion!=newid_tipo_costo_definicion) {
				if(newid_tipo_costo_definicion==null) {
					//newid_tipo_costo_definicion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Definicion:Valor nulo no permitido en columna id_tipo_costo_definicion");
					}
				}

				this.id_tipo_costo_definicion=newid_tipo_costo_definicion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato) {
		if(this.id_formato!=newid_formato) {

			this.id_formato=newid_formato;
		}
	}
    
	public void setid_tipo_tributario(Long newid_tipo_tributario) {
		if(this.id_tipo_tributario!=newid_tipo_tributario) {

			this.id_tipo_tributario=newid_tipo_tributario;
		}
	}
    
	public void setid_tipo_retencion(Long newid_tipo_retencion) {
		if(this.id_tipo_retencion!=newid_tipo_retencion) {

			this.id_tipo_retencion=newid_tipo_retencion;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento) {
		if(this.id_tipo_documento!=newid_tipo_documento) {

			this.id_tipo_documento=newid_tipo_documento;
		}
	}
    
	public void setid_libro_contable(Long newid_libro_contable) {
		if(this.id_libro_contable!=newid_libro_contable) {

			this.id_libro_contable=newid_libro_contable;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo) {
		if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {

			this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable) {
		if(this.id_cuenta_contable!=newid_cuenta_contable) {

			this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDefinicion() {
		return isBusquedaDesdeForeignKeySesionTipoDefinicion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDefinicion(
		Boolean isBusquedaDesdeForeignKeySesionTipoDefinicion) {
		this.isBusquedaDesdeForeignKeySesionTipoDefinicion = isBusquedaDesdeForeignKeySesionTipoDefinicion;
	}

	public Long getlidTipoDefinicionActual() {
		return lidTipoDefinicionActual;
	}

	public void setlidTipoDefinicionActual(Long lidTipoDefinicionActual) {
		this.lidTipoDefinicionActual = lidTipoDefinicionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion() {
		return isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion) {
		this.isBusquedaDesdeForeignKeySesionTransaccion = isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public Long getlidTransaccionActual() {
		return lidTransaccionActual;
	}

	public void setlidTransaccionActual(Long lidTransaccionActual) {
		this.lidTransaccionActual = lidTransaccionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIvaItem() {
		return isBusquedaDesdeForeignKeySesionTipoIvaItem;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIvaItem(
		Boolean isBusquedaDesdeForeignKeySesionTipoIvaItem) {
		this.isBusquedaDesdeForeignKeySesionTipoIvaItem = isBusquedaDesdeForeignKeySesionTipoIvaItem;
	}

	public Long getlidTipoIvaItemActual() {
		return lidTipoIvaItemActual;
	}

	public void setlidTipoIvaItemActual(Long lidTipoIvaItemActual) {
		this.lidTipoIvaItemActual = lidTipoIvaItemActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGlobalCliente() {
		return isBusquedaDesdeForeignKeySesionTipoGlobalCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGlobalCliente(
		Boolean isBusquedaDesdeForeignKeySesionTipoGlobalCliente) {
		this.isBusquedaDesdeForeignKeySesionTipoGlobalCliente = isBusquedaDesdeForeignKeySesionTipoGlobalCliente;
	}

	public Long getlidTipoGlobalClienteActual() {
		return lidTipoGlobalClienteActual;
	}

	public void setlidTipoGlobalClienteActual(Long lidTipoGlobalClienteActual) {
		this.lidTipoGlobalClienteActual = lidTipoGlobalClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCosteoDefinicion() {
		return isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCosteoDefinicion(
		Boolean isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion) {
		this.isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion = isBusquedaDesdeForeignKeySesionTipoCosteoDefinicion;
	}

	public Long getlidTipoCosteoDefinicionActual() {
		return lidTipoCosteoDefinicionActual;
	}

	public void setlidTipoCosteoDefinicionActual(Long lidTipoCosteoDefinicionActual) {
		this.lidTipoCosteoDefinicionActual = lidTipoCosteoDefinicionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCostoDefinicion() {
		return isBusquedaDesdeForeignKeySesionTipoCostoDefinicion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCostoDefinicion(
		Boolean isBusquedaDesdeForeignKeySesionTipoCostoDefinicion) {
		this.isBusquedaDesdeForeignKeySesionTipoCostoDefinicion = isBusquedaDesdeForeignKeySesionTipoCostoDefinicion;
	}

	public Long getlidTipoCostoDefinicionActual() {
		return lidTipoCostoDefinicionActual;
	}

	public void setlidTipoCostoDefinicionActual(Long lidTipoCostoDefinicionActual) {
		this.lidTipoCostoDefinicionActual = lidTipoCostoDefinicionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTributario() {
		return isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTributario(
		Boolean isBusquedaDesdeForeignKeySesionTipoTributario) {
		this.isBusquedaDesdeForeignKeySesionTipoTributario = isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public Long getlidTipoTributarioActual() {
		return lidTipoTributarioActual;
	}

	public void setlidTipoTributarioActual(Long lidTipoTributarioActual) {
		this.lidTipoTributarioActual = lidTipoTributarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencion() {
		return isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencion) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencion = isBusquedaDesdeForeignKeySesionTipoRetencion;
	}

	public Long getlidTipoRetencionActual() {
		return lidTipoRetencionActual;
	}

	public void setlidTipoRetencionActual(Long lidTipoRetencionActual) {
		this.lidTipoRetencionActual = lidTipoRetencionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLibroContable() {
		return isBusquedaDesdeForeignKeySesionLibroContable;
	}

	public void setisBusquedaDesdeForeignKeySesionLibroContable(
		Boolean isBusquedaDesdeForeignKeySesionLibroContable) {
		this.isBusquedaDesdeForeignKeySesionLibroContable = isBusquedaDesdeForeignKeySesionLibroContable;
	}

	public Long getlidLibroContableActual() {
		return lidLibroContableActual;
	}

	public void setlidLibroContableActual(Long lidLibroContableActual) {
		this.lidLibroContableActual = lidLibroContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo() {
		return isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTransaccionModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoTransaccionModulo = isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public Long getlidTipoTransaccionModuloActual() {
		return lidTipoTransaccionModuloActual;
	}

	public void setlidTipoTransaccionModuloActual(Long lidTipoTransaccionModuloActual) {
		this.lidTipoTransaccionModuloActual = lidTipoTransaccionModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	
	
		
	
}
