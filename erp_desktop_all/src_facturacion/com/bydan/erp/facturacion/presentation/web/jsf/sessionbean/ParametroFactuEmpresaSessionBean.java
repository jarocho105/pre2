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
public class ParametroFactuEmpresaSessionBean  extends ParametroFactuEmpresaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa;
	protected Long lIdParametroFactuEmpresaActualForeignKey;	
	
	protected Long lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras;
	protected String sUltimaBusquedaParametroFactuEmpresa;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	Long lidEmpresaOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionOrigen;
	Long lidTransaccionOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaOrigen;
	Long lidBodegaOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteOrigen;
	Long lidClienteOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresaDestino;
	Long lidEmpresaDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursalDestino;
	Long lidSucursalDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionDestino;
	Long lidTransaccionDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaDestino;
	Long lidBodegaDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteDestino;
	Long lidClienteDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresaMultiDestino;
	Long lidEmpresaMultiDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursalMultiDestino;
	Long lidSucursalMultiDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionMultiDestino;
	Long lidTransaccionMultiDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaMultiOrigen;
	Long lidBodegaMultiOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaMultiDestino;
	Long lidBodegaMultiDestinoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empresa_origen;
	private Long id_sucursal;
	private Long id_transaccion_origen;
	private Long id_bodega_origen;
	private Long id_cliente_origen;
	private Long id_empresa_destino;
	private Long id_sucursal_destino;
	private Long id_transaccion_destino;
	private Long id_bodega_destino;
	private Long id_cliente_destino;
	private Long id_empresa_multi_destino;
	private Long id_sucursal_multi_destino;
	private Long id_transaccion_multi_destino;
	private Long id_bodega_multi_origen;
	private Long id_bodega_multi_destino;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFactuEmpresaSessionBeanAdditional parametrofactuempresaSessionBeanAdditional=null;
	
	public ParametroFactuEmpresaSessionBeanAdditional getParametroFactuEmpresaSessionBeanAdditional() {
		return this.parametrofactuempresaSessionBeanAdditional;
	}
	
	public void setParametroFactuEmpresaSessionBeanAdditional(ParametroFactuEmpresaSessionBeanAdditional parametrofactuempresaSessionBeanAdditional) {
		try {
			this.parametrofactuempresaSessionBeanAdditional=parametrofactuempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFactuEmpresaSessionBean () {
		this.inicializarParametroFactuEmpresaSessionBean();
	}
	
	public void inicializarParametroFactuEmpresaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa=false;
		this.lIdParametroFactuEmpresaActualForeignKey=0L;
		this.lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFactuEmpresa ="";
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
		isBusquedaDesdeForeignKeySesionEmpresaOrigen=false;
		lidEmpresaOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionOrigen=false;
		lidTransaccionOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaOrigen=false;
		lidBodegaOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionClienteOrigen=false;
		lidClienteOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresaDestino=false;
		lidEmpresaDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionSucursalDestino=false;
		lidSucursalDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionDestino=false;
		lidTransaccionDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaDestino=false;
		lidBodegaDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionClienteDestino=false;
		lidClienteDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresaMultiDestino=false;
		lidEmpresaMultiDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionSucursalMultiDestino=false;
		lidSucursalMultiDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionMultiDestino=false;
		lidTransaccionMultiDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaMultiOrigen=false;
		lidBodegaMultiOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaMultiDestino=false;
		lidBodegaMultiDestinoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empresa_origen=-1L;
 		this.id_sucursal=-1L;
 		this.id_transaccion_origen=-1L;
 		this.id_bodega_origen=-1L;
 		this.id_cliente_origen=-1L;
 		this.id_empresa_destino=-1L;
 		this.id_sucursal_destino=-1L;
 		this.id_transaccion_destino=-1L;
 		this.id_bodega_destino=-1L;
 		this.id_cliente_destino=-1L;
 		this.id_empresa_multi_destino=-1L;
 		this.id_sucursal_multi_destino=-1L;
 		this.id_transaccion_multi_destino=-1L;
 		this.id_bodega_multi_origen=-1L;
 		this.id_bodega_multi_destino=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa= isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuEmpresa;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa= isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresa;
	}
					
	public Long getlIdParametroFactuEmpresaActualForeignKey() {
		return lIdParametroFactuEmpresaActualForeignKey;
	}

	public void setlIdParametroFactuEmpresaActualForeignKey(
			Long lIdParametroFactuEmpresaActualForeignKey) {
		this.lIdParametroFactuEmpresaActualForeignKey = lIdParametroFactuEmpresaActualForeignKey;
	}
				    
	public Long getlIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras() {
		return lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras(
			Long lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras = lIdParametroFactuEmpresaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuEmpresaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFactuEmpresa() {
		return sUltimaBusquedaParametroFactuEmpresa;
	}

	public void setsUltimaBusquedaParametroFactuEmpresa(String sUltimaBusquedaParametroFactuEmpresa) {
		this.sUltimaBusquedaParametroFactuEmpresa = sUltimaBusquedaParametroFactuEmpresa;
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
    
	public Long getid_empresa_origen() {
		return this.id_empresa_origen;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_transaccion_origen() {
		return this.id_transaccion_origen;
	}
    
	public Long getid_bodega_origen() {
		return this.id_bodega_origen;
	}
    
	public Long getid_cliente_origen() {
		return this.id_cliente_origen;
	}
    
	public Long getid_empresa_destino() {
		return this.id_empresa_destino;
	}
    
	public Long getid_sucursal_destino() {
		return this.id_sucursal_destino;
	}
    
	public Long getid_transaccion_destino() {
		return this.id_transaccion_destino;
	}
    
	public Long getid_bodega_destino() {
		return this.id_bodega_destino;
	}
    
	public Long getid_cliente_destino() {
		return this.id_cliente_destino;
	}
    
	public Long getid_empresa_multi_destino() {
		return this.id_empresa_multi_destino;
	}
    
	public Long getid_sucursal_multi_destino() {
		return this.id_sucursal_multi_destino;
	}
    
	public Long getid_transaccion_multi_destino() {
		return this.id_transaccion_multi_destino;
	}
    
	public Long getid_bodega_multi_origen() {
		return this.id_bodega_multi_origen;
	}
    
	public Long getid_bodega_multi_destino() {
		return this.id_bodega_multi_destino;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa_origen(Long newid_empresa_origen)throws Exception
	{
		try {
			if(this.id_empresa_origen!=newid_empresa_origen) {
				if(newid_empresa_origen==null) {
					//newid_empresa_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_empresa_origen");
					}
				}

				this.id_empresa_origen=newid_empresa_origen;
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
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_origen(Long newid_transaccion_origen)throws Exception
	{
		try {
			if(this.id_transaccion_origen!=newid_transaccion_origen) {
				if(newid_transaccion_origen==null) {
					//newid_transaccion_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_transaccion_origen");
					}
				}

				this.id_transaccion_origen=newid_transaccion_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_origen(Long newid_bodega_origen)throws Exception
	{
		try {
			if(this.id_bodega_origen!=newid_bodega_origen) {
				if(newid_bodega_origen==null) {
					//newid_bodega_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_bodega_origen");
					}
				}

				this.id_bodega_origen=newid_bodega_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_origen(Long newid_cliente_origen)throws Exception
	{
		try {
			if(this.id_cliente_origen!=newid_cliente_origen) {
				if(newid_cliente_origen==null) {
					//newid_cliente_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_cliente_origen");
					}
				}

				this.id_cliente_origen=newid_cliente_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa_destino(Long newid_empresa_destino)throws Exception
	{
		try {
			if(this.id_empresa_destino!=newid_empresa_destino) {
				if(newid_empresa_destino==null) {
					//newid_empresa_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_empresa_destino");
					}
				}

				this.id_empresa_destino=newid_empresa_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal_destino(Long newid_sucursal_destino)throws Exception
	{
		try {
			if(this.id_sucursal_destino!=newid_sucursal_destino) {
				if(newid_sucursal_destino==null) {
					//newid_sucursal_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_sucursal_destino");
					}
				}

				this.id_sucursal_destino=newid_sucursal_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_destino(Long newid_transaccion_destino)throws Exception
	{
		try {
			if(this.id_transaccion_destino!=newid_transaccion_destino) {
				if(newid_transaccion_destino==null) {
					//newid_transaccion_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_transaccion_destino");
					}
				}

				this.id_transaccion_destino=newid_transaccion_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_destino(Long newid_bodega_destino)throws Exception
	{
		try {
			if(this.id_bodega_destino!=newid_bodega_destino) {
				if(newid_bodega_destino==null) {
					//newid_bodega_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_bodega_destino");
					}
				}

				this.id_bodega_destino=newid_bodega_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_destino(Long newid_cliente_destino)throws Exception
	{
		try {
			if(this.id_cliente_destino!=newid_cliente_destino) {
				if(newid_cliente_destino==null) {
					//newid_cliente_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_cliente_destino");
					}
				}

				this.id_cliente_destino=newid_cliente_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa_multi_destino(Long newid_empresa_multi_destino)throws Exception
	{
		try {
			if(this.id_empresa_multi_destino!=newid_empresa_multi_destino) {
				if(newid_empresa_multi_destino==null) {
					//newid_empresa_multi_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_empresa_multi_destino");
					}
				}

				this.id_empresa_multi_destino=newid_empresa_multi_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal_multi_destino(Long newid_sucursal_multi_destino)throws Exception
	{
		try {
			if(this.id_sucursal_multi_destino!=newid_sucursal_multi_destino) {
				if(newid_sucursal_multi_destino==null) {
					//newid_sucursal_multi_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_sucursal_multi_destino");
					}
				}

				this.id_sucursal_multi_destino=newid_sucursal_multi_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_multi_destino(Long newid_transaccion_multi_destino)throws Exception
	{
		try {
			if(this.id_transaccion_multi_destino!=newid_transaccion_multi_destino) {
				if(newid_transaccion_multi_destino==null) {
					//newid_transaccion_multi_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_transaccion_multi_destino");
					}
				}

				this.id_transaccion_multi_destino=newid_transaccion_multi_destino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_multi_origen(Long newid_bodega_multi_origen)throws Exception
	{
		try {
			if(this.id_bodega_multi_origen!=newid_bodega_multi_origen) {
				if(newid_bodega_multi_origen==null) {
					//newid_bodega_multi_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_bodega_multi_origen");
					}
				}

				this.id_bodega_multi_origen=newid_bodega_multi_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_multi_destino(Long newid_bodega_multi_destino)throws Exception
	{
		try {
			if(this.id_bodega_multi_destino!=newid_bodega_multi_destino) {
				if(newid_bodega_multi_destino==null) {
					//newid_bodega_multi_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuEmpresa:Valor nulo no permitido en columna id_bodega_multi_destino");
					}
				}

				this.id_bodega_multi_destino=newid_bodega_multi_destino;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresaOrigen() {
		return isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresaOrigen(
		Boolean isBusquedaDesdeForeignKeySesionEmpresaOrigen) {
		this.isBusquedaDesdeForeignKeySesionEmpresaOrigen = isBusquedaDesdeForeignKeySesionEmpresaOrigen;
	}

	public Long getlidEmpresaOrigenActual() {
		return lidEmpresaOrigenActual;
	}

	public void setlidEmpresaOrigenActual(Long lidEmpresaOrigenActual) {
		this.lidEmpresaOrigenActual = lidEmpresaOrigenActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionOrigen() {
		return isBusquedaDesdeForeignKeySesionTransaccionOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionOrigen(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionOrigen) {
		this.isBusquedaDesdeForeignKeySesionTransaccionOrigen = isBusquedaDesdeForeignKeySesionTransaccionOrigen;
	}

	public Long getlidTransaccionOrigenActual() {
		return lidTransaccionOrigenActual;
	}

	public void setlidTransaccionOrigenActual(Long lidTransaccionOrigenActual) {
		this.lidTransaccionOrigenActual = lidTransaccionOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaOrigen() {
		return isBusquedaDesdeForeignKeySesionBodegaOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaOrigen(
		Boolean isBusquedaDesdeForeignKeySesionBodegaOrigen) {
		this.isBusquedaDesdeForeignKeySesionBodegaOrigen = isBusquedaDesdeForeignKeySesionBodegaOrigen;
	}

	public Long getlidBodegaOrigenActual() {
		return lidBodegaOrigenActual;
	}

	public void setlidBodegaOrigenActual(Long lidBodegaOrigenActual) {
		this.lidBodegaOrigenActual = lidBodegaOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClienteOrigen() {
		return isBusquedaDesdeForeignKeySesionClienteOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteOrigen(
		Boolean isBusquedaDesdeForeignKeySesionClienteOrigen) {
		this.isBusquedaDesdeForeignKeySesionClienteOrigen = isBusquedaDesdeForeignKeySesionClienteOrigen;
	}

	public Long getlidClienteOrigenActual() {
		return lidClienteOrigenActual;
	}

	public void setlidClienteOrigenActual(Long lidClienteOrigenActual) {
		this.lidClienteOrigenActual = lidClienteOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresaDestino() {
		return isBusquedaDesdeForeignKeySesionEmpresaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresaDestino(
		Boolean isBusquedaDesdeForeignKeySesionEmpresaDestino) {
		this.isBusquedaDesdeForeignKeySesionEmpresaDestino = isBusquedaDesdeForeignKeySesionEmpresaDestino;
	}

	public Long getlidEmpresaDestinoActual() {
		return lidEmpresaDestinoActual;
	}

	public void setlidEmpresaDestinoActual(Long lidEmpresaDestinoActual) {
		this.lidEmpresaDestinoActual = lidEmpresaDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSucursalDestino() {
		return isBusquedaDesdeForeignKeySesionSucursalDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursalDestino(
		Boolean isBusquedaDesdeForeignKeySesionSucursalDestino) {
		this.isBusquedaDesdeForeignKeySesionSucursalDestino = isBusquedaDesdeForeignKeySesionSucursalDestino;
	}

	public Long getlidSucursalDestinoActual() {
		return lidSucursalDestinoActual;
	}

	public void setlidSucursalDestinoActual(Long lidSucursalDestinoActual) {
		this.lidSucursalDestinoActual = lidSucursalDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionDestino() {
		return isBusquedaDesdeForeignKeySesionTransaccionDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionDestino(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionDestino) {
		this.isBusquedaDesdeForeignKeySesionTransaccionDestino = isBusquedaDesdeForeignKeySesionTransaccionDestino;
	}

	public Long getlidTransaccionDestinoActual() {
		return lidTransaccionDestinoActual;
	}

	public void setlidTransaccionDestinoActual(Long lidTransaccionDestinoActual) {
		this.lidTransaccionDestinoActual = lidTransaccionDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaDestino() {
		return isBusquedaDesdeForeignKeySesionBodegaDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaDestino(
		Boolean isBusquedaDesdeForeignKeySesionBodegaDestino) {
		this.isBusquedaDesdeForeignKeySesionBodegaDestino = isBusquedaDesdeForeignKeySesionBodegaDestino;
	}

	public Long getlidBodegaDestinoActual() {
		return lidBodegaDestinoActual;
	}

	public void setlidBodegaDestinoActual(Long lidBodegaDestinoActual) {
		this.lidBodegaDestinoActual = lidBodegaDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClienteDestino() {
		return isBusquedaDesdeForeignKeySesionClienteDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteDestino(
		Boolean isBusquedaDesdeForeignKeySesionClienteDestino) {
		this.isBusquedaDesdeForeignKeySesionClienteDestino = isBusquedaDesdeForeignKeySesionClienteDestino;
	}

	public Long getlidClienteDestinoActual() {
		return lidClienteDestinoActual;
	}

	public void setlidClienteDestinoActual(Long lidClienteDestinoActual) {
		this.lidClienteDestinoActual = lidClienteDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresaMultiDestino() {
		return isBusquedaDesdeForeignKeySesionEmpresaMultiDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresaMultiDestino(
		Boolean isBusquedaDesdeForeignKeySesionEmpresaMultiDestino) {
		this.isBusquedaDesdeForeignKeySesionEmpresaMultiDestino = isBusquedaDesdeForeignKeySesionEmpresaMultiDestino;
	}

	public Long getlidEmpresaMultiDestinoActual() {
		return lidEmpresaMultiDestinoActual;
	}

	public void setlidEmpresaMultiDestinoActual(Long lidEmpresaMultiDestinoActual) {
		this.lidEmpresaMultiDestinoActual = lidEmpresaMultiDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSucursalMultiDestino() {
		return isBusquedaDesdeForeignKeySesionSucursalMultiDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursalMultiDestino(
		Boolean isBusquedaDesdeForeignKeySesionSucursalMultiDestino) {
		this.isBusquedaDesdeForeignKeySesionSucursalMultiDestino = isBusquedaDesdeForeignKeySesionSucursalMultiDestino;
	}

	public Long getlidSucursalMultiDestinoActual() {
		return lidSucursalMultiDestinoActual;
	}

	public void setlidSucursalMultiDestinoActual(Long lidSucursalMultiDestinoActual) {
		this.lidSucursalMultiDestinoActual = lidSucursalMultiDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionMultiDestino() {
		return isBusquedaDesdeForeignKeySesionTransaccionMultiDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionMultiDestino(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionMultiDestino) {
		this.isBusquedaDesdeForeignKeySesionTransaccionMultiDestino = isBusquedaDesdeForeignKeySesionTransaccionMultiDestino;
	}

	public Long getlidTransaccionMultiDestinoActual() {
		return lidTransaccionMultiDestinoActual;
	}

	public void setlidTransaccionMultiDestinoActual(Long lidTransaccionMultiDestinoActual) {
		this.lidTransaccionMultiDestinoActual = lidTransaccionMultiDestinoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaMultiOrigen() {
		return isBusquedaDesdeForeignKeySesionBodegaMultiOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaMultiOrigen(
		Boolean isBusquedaDesdeForeignKeySesionBodegaMultiOrigen) {
		this.isBusquedaDesdeForeignKeySesionBodegaMultiOrigen = isBusquedaDesdeForeignKeySesionBodegaMultiOrigen;
	}

	public Long getlidBodegaMultiOrigenActual() {
		return lidBodegaMultiOrigenActual;
	}

	public void setlidBodegaMultiOrigenActual(Long lidBodegaMultiOrigenActual) {
		this.lidBodegaMultiOrigenActual = lidBodegaMultiOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaMultiDestino() {
		return isBusquedaDesdeForeignKeySesionBodegaMultiDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaMultiDestino(
		Boolean isBusquedaDesdeForeignKeySesionBodegaMultiDestino) {
		this.isBusquedaDesdeForeignKeySesionBodegaMultiDestino = isBusquedaDesdeForeignKeySesionBodegaMultiDestino;
	}

	public Long getlidBodegaMultiDestinoActual() {
		return lidBodegaMultiDestinoActual;
	}

	public void setlidBodegaMultiDestinoActual(Long lidBodegaMultiDestinoActual) {
		this.lidBodegaMultiDestinoActual = lidBodegaMultiDestinoActual;
	}
	
	
		
	
}
