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
package com.bydan.erp.importaciones.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.importaciones.business.entity.*;

@SuppressWarnings("unused")
public class ParametroImporSessionBean  extends ParametroImporSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor;
	protected Long lIdParametroImporActualForeignKey;	
	
	protected Long lIdParametroImporActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras;
	protected String sUltimaBusquedaParametroImpor;
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
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra;
	Long lidTransaccionOrdenCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionIngreso;
	Long lidTransaccionIngresoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoOrdenCompra;
	Long lidFormatoOrdenCompraActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoIngreso;
	Long lidFormatoIngresoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoPedido;
	Long lidFormatoPedidoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoLiquidacion;
	Long lidFormatoLiquidacionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_pais;
	private Long id_bodega;
	private Long id_centro_costo;
	private Long id_cuenta_contable;
	private Long id_transaccion_orden_compra;
	private Long id_transaccion_ingreso;
	private Long id_formato_orden_compra;
	private Long id_formato_ingreso;
	private Long id_formato_pedido;
	private Long id_formato_liquidacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroImporSessionBeanAdditional parametroimporSessionBeanAdditional=null;
	
	public ParametroImporSessionBeanAdditional getParametroImporSessionBeanAdditional() {
		return this.parametroimporSessionBeanAdditional;
	}
	
	public void setParametroImporSessionBeanAdditional(ParametroImporSessionBeanAdditional parametroimporSessionBeanAdditional) {
		try {
			this.parametroimporSessionBeanAdditional=parametroimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroImporSessionBean () {
		this.inicializarParametroImporSessionBean();
	}
	
	public void inicializarParametroImporSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor=false;
		this.lIdParametroImporActualForeignKey=0L;
		this.lIdParametroImporActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras=false;
		this.sUltimaBusquedaParametroImpor ="";
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
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra=false;
		lidTransaccionOrdenCompraActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionIngreso=false;
		lidTransaccionIngresoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoOrdenCompra=false;
		lidFormatoOrdenCompraActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoIngreso=false;
		lidFormatoIngresoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoPedido=false;
		lidFormatoPedidoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoLiquidacion=false;
		lidFormatoLiquidacionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_pais=-1L;
 		this.id_bodega=-1L;
 		this.id_centro_costo=null;
 		this.id_cuenta_contable=-1L;
 		this.id_transaccion_orden_compra=-1L;
 		this.id_transaccion_ingreso=-1L;
 		this.id_formato_orden_compra=-1L;
 		this.id_formato_ingreso=-1L;
 		this.id_formato_pedido=-1L;
 		this.id_formato_liquidacion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroImpor() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroImpor(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor= isPermiteNavegacionHaciaForeignKeyDesdeParametroImpor;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroImpor;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroImpor() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroImpor(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor= isBusquedaDesdeForeignKeySesionForeignKeyParametroImpor;
	}
					
	public Long getlIdParametroImporActualForeignKey() {
		return lIdParametroImporActualForeignKey;
	}

	public void setlIdParametroImporActualForeignKey(
			Long lIdParametroImporActualForeignKey) {
		this.lIdParametroImporActualForeignKey = lIdParametroImporActualForeignKey;
	}
				    
	public Long getlIdParametroImporActualForeignKeyParaPosibleAtras() {
		return lIdParametroImporActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroImporActualForeignKeyParaPosibleAtras(
			Long lIdParametroImporActualForeignKeyParaPosibleAtras) {
		this.lIdParametroImporActualForeignKeyParaPosibleAtras = lIdParametroImporActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroImporParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroImpor() {
		return sUltimaBusquedaParametroImpor;
	}

	public void setsUltimaBusquedaParametroImpor(String sUltimaBusquedaParametroImpor) {
		this.sUltimaBusquedaParametroImpor = sUltimaBusquedaParametroImpor;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_transaccion_orden_compra() {
		return this.id_transaccion_orden_compra;
	}
    
	public Long getid_transaccion_ingreso() {
		return this.id_transaccion_ingreso;
	}
    
	public Long getid_formato_orden_compra() {
		return this.id_formato_orden_compra;
	}
    
	public Long getid_formato_ingreso() {
		return this.id_formato_ingreso;
	}
    
	public Long getid_formato_pedido() {
		return this.id_formato_pedido;
	}
    
	public Long getid_formato_liquidacion() {
		return this.id_formato_liquidacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
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
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_orden_compra(Long newid_transaccion_orden_compra)throws Exception
	{
		try {
			if(this.id_transaccion_orden_compra!=newid_transaccion_orden_compra) {
				if(newid_transaccion_orden_compra==null) {
					//newid_transaccion_orden_compra=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_transaccion_orden_compra");
					}
				}

				this.id_transaccion_orden_compra=newid_transaccion_orden_compra;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_ingreso(Long newid_transaccion_ingreso)throws Exception
	{
		try {
			if(this.id_transaccion_ingreso!=newid_transaccion_ingreso) {
				if(newid_transaccion_ingreso==null) {
					//newid_transaccion_ingreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_transaccion_ingreso");
					}
				}

				this.id_transaccion_ingreso=newid_transaccion_ingreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_orden_compra(Long newid_formato_orden_compra)throws Exception
	{
		try {
			if(this.id_formato_orden_compra!=newid_formato_orden_compra) {
				if(newid_formato_orden_compra==null) {
					//newid_formato_orden_compra=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_formato_orden_compra");
					}
				}

				this.id_formato_orden_compra=newid_formato_orden_compra;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_ingreso(Long newid_formato_ingreso)throws Exception
	{
		try {
			if(this.id_formato_ingreso!=newid_formato_ingreso) {
				if(newid_formato_ingreso==null) {
					//newid_formato_ingreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_formato_ingreso");
					}
				}

				this.id_formato_ingreso=newid_formato_ingreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_pedido(Long newid_formato_pedido)throws Exception
	{
		try {
			if(this.id_formato_pedido!=newid_formato_pedido) {
				if(newid_formato_pedido==null) {
					//newid_formato_pedido=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_formato_pedido");
					}
				}

				this.id_formato_pedido=newid_formato_pedido;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_liquidacion(Long newid_formato_liquidacion)throws Exception
	{
		try {
			if(this.id_formato_liquidacion!=newid_formato_liquidacion) {
				if(newid_formato_liquidacion==null) {
					//newid_formato_liquidacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroImpor:Valor nulo no permitido en columna id_formato_liquidacion");
					}
				}

				this.id_formato_liquidacion=newid_formato_liquidacion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBodega() {
		return isBusquedaDesdeForeignKeySesionBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionBodega(
		Boolean isBusquedaDesdeForeignKeySesionBodega) {
		this.isBusquedaDesdeForeignKeySesionBodega = isBusquedaDesdeForeignKeySesionBodega;
	}

	public Long getlidBodegaActual() {
		return lidBodegaActual;
	}

	public void setlidBodegaActual(Long lidBodegaActual) {
		this.lidBodegaActual = lidBodegaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionOrdenCompra() {
		return isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionOrdenCompra(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra) {
		this.isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra = isBusquedaDesdeForeignKeySesionTransaccionOrdenCompra;
	}

	public Long getlidTransaccionOrdenCompraActual() {
		return lidTransaccionOrdenCompraActual;
	}

	public void setlidTransaccionOrdenCompraActual(Long lidTransaccionOrdenCompraActual) {
		this.lidTransaccionOrdenCompraActual = lidTransaccionOrdenCompraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionIngreso() {
		return isBusquedaDesdeForeignKeySesionTransaccionIngreso;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionIngreso(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionIngreso) {
		this.isBusquedaDesdeForeignKeySesionTransaccionIngreso = isBusquedaDesdeForeignKeySesionTransaccionIngreso;
	}

	public Long getlidTransaccionIngresoActual() {
		return lidTransaccionIngresoActual;
	}

	public void setlidTransaccionIngresoActual(Long lidTransaccionIngresoActual) {
		this.lidTransaccionIngresoActual = lidTransaccionIngresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoOrdenCompra() {
		return isBusquedaDesdeForeignKeySesionFormatoOrdenCompra;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoOrdenCompra(
		Boolean isBusquedaDesdeForeignKeySesionFormatoOrdenCompra) {
		this.isBusquedaDesdeForeignKeySesionFormatoOrdenCompra = isBusquedaDesdeForeignKeySesionFormatoOrdenCompra;
	}

	public Long getlidFormatoOrdenCompraActual() {
		return lidFormatoOrdenCompraActual;
	}

	public void setlidFormatoOrdenCompraActual(Long lidFormatoOrdenCompraActual) {
		this.lidFormatoOrdenCompraActual = lidFormatoOrdenCompraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoIngreso() {
		return isBusquedaDesdeForeignKeySesionFormatoIngreso;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoIngreso(
		Boolean isBusquedaDesdeForeignKeySesionFormatoIngreso) {
		this.isBusquedaDesdeForeignKeySesionFormatoIngreso = isBusquedaDesdeForeignKeySesionFormatoIngreso;
	}

	public Long getlidFormatoIngresoActual() {
		return lidFormatoIngresoActual;
	}

	public void setlidFormatoIngresoActual(Long lidFormatoIngresoActual) {
		this.lidFormatoIngresoActual = lidFormatoIngresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoPedido() {
		return isBusquedaDesdeForeignKeySesionFormatoPedido;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoPedido(
		Boolean isBusquedaDesdeForeignKeySesionFormatoPedido) {
		this.isBusquedaDesdeForeignKeySesionFormatoPedido = isBusquedaDesdeForeignKeySesionFormatoPedido;
	}

	public Long getlidFormatoPedidoActual() {
		return lidFormatoPedidoActual;
	}

	public void setlidFormatoPedidoActual(Long lidFormatoPedidoActual) {
		this.lidFormatoPedidoActual = lidFormatoPedidoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoLiquidacion() {
		return isBusquedaDesdeForeignKeySesionFormatoLiquidacion;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoLiquidacion(
		Boolean isBusquedaDesdeForeignKeySesionFormatoLiquidacion) {
		this.isBusquedaDesdeForeignKeySesionFormatoLiquidacion = isBusquedaDesdeForeignKeySesionFormatoLiquidacion;
	}

	public Long getlidFormatoLiquidacionActual() {
		return lidFormatoLiquidacionActual;
	}

	public void setlidFormatoLiquidacionActual(Long lidFormatoLiquidacionActual) {
		this.lidFormatoLiquidacionActual = lidFormatoLiquidacionActual;
	}
	
	
		
	
}
