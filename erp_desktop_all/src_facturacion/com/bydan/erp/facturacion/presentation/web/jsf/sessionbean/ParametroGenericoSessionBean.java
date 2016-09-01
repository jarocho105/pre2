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
public class ParametroGenericoSessionBean  extends ParametroGenericoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico;
	protected Long lIdParametroGenericoActualForeignKey;	
	
	protected Long lIdParametroGenericoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras;
	protected String sUltimaBusquedaParametroGenerico;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionRecibo;
	Long lidTransaccionReciboActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionServicio;
	Long lidServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoRecibo;
	Long lidFormatoReciboActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_transaccion;
	private Long id_transaccion_recibo;
	private Long id_bodega;
	private Long id_servicio;
	private Long id_formato;
	private Long id_formato_recibo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroGenericoSessionBeanAdditional parametrogenericoSessionBeanAdditional=null;
	
	public ParametroGenericoSessionBeanAdditional getParametroGenericoSessionBeanAdditional() {
		return this.parametrogenericoSessionBeanAdditional;
	}
	
	public void setParametroGenericoSessionBeanAdditional(ParametroGenericoSessionBeanAdditional parametrogenericoSessionBeanAdditional) {
		try {
			this.parametrogenericoSessionBeanAdditional=parametrogenericoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroGenericoSessionBean () {
		this.inicializarParametroGenericoSessionBean();
	}
	
	public void inicializarParametroGenericoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico=false;
		this.lIdParametroGenericoActualForeignKey=0L;
		this.lIdParametroGenericoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras=false;
		this.sUltimaBusquedaParametroGenerico ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionRecibo=false;
		lidTransaccionReciboActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionServicio=false;
		lidServicioActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoRecibo=false;
		lidFormatoReciboActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=-1L;
 		this.id_transaccion=-1L;
 		this.id_transaccion_recibo=null;
 		this.id_bodega=-1L;
 		this.id_servicio=-1L;
 		this.id_formato=-1L;
 		this.id_formato_recibo=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico= isPermiteNavegacionHaciaForeignKeyDesdeParametroGenerico;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGenerico;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico= isBusquedaDesdeForeignKeySesionForeignKeyParametroGenerico;
	}
					
	public Long getlIdParametroGenericoActualForeignKey() {
		return lIdParametroGenericoActualForeignKey;
	}

	public void setlIdParametroGenericoActualForeignKey(
			Long lIdParametroGenericoActualForeignKey) {
		this.lIdParametroGenericoActualForeignKey = lIdParametroGenericoActualForeignKey;
	}
				    
	public Long getlIdParametroGenericoActualForeignKeyParaPosibleAtras() {
		return lIdParametroGenericoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroGenericoActualForeignKeyParaPosibleAtras(
			Long lIdParametroGenericoActualForeignKeyParaPosibleAtras) {
		this.lIdParametroGenericoActualForeignKeyParaPosibleAtras = lIdParametroGenericoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroGenericoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroGenerico() {
		return sUltimaBusquedaParametroGenerico;
	}

	public void setsUltimaBusquedaParametroGenerico(String sUltimaBusquedaParametroGenerico) {
		this.sUltimaBusquedaParametroGenerico = sUltimaBusquedaParametroGenerico;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_transaccion_recibo() {
		return this.id_transaccion_recibo;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_servicio() {
		return this.id_servicio;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_formato_recibo() {
		return this.id_formato_recibo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_recibo(Long newid_transaccion_recibo) {
		if(this.id_transaccion_recibo!=newid_transaccion_recibo) {

			this.id_transaccion_recibo=newid_transaccion_recibo;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_servicio(Long newid_servicio)throws Exception
	{
		try {
			if(this.id_servicio!=newid_servicio) {
				if(newid_servicio==null) {
					//newid_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_servicio");
					}
				}

				this.id_servicio=newid_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGenerico:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_recibo(Long newid_formato_recibo) {
		if(this.id_formato_recibo!=newid_formato_recibo) {

			this.id_formato_recibo=newid_formato_recibo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionRecibo() {
		return isBusquedaDesdeForeignKeySesionTransaccionRecibo;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionRecibo(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionRecibo) {
		this.isBusquedaDesdeForeignKeySesionTransaccionRecibo = isBusquedaDesdeForeignKeySesionTransaccionRecibo;
	}

	public Long getlidTransaccionReciboActual() {
		return lidTransaccionReciboActual;
	}

	public void setlidTransaccionReciboActual(Long lidTransaccionReciboActual) {
		this.lidTransaccionReciboActual = lidTransaccionReciboActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionServicio() {
		return isBusquedaDesdeForeignKeySesionServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionServicio(
		Boolean isBusquedaDesdeForeignKeySesionServicio) {
		this.isBusquedaDesdeForeignKeySesionServicio = isBusquedaDesdeForeignKeySesionServicio;
	}

	public Long getlidServicioActual() {
		return lidServicioActual;
	}

	public void setlidServicioActual(Long lidServicioActual) {
		this.lidServicioActual = lidServicioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoRecibo() {
		return isBusquedaDesdeForeignKeySesionFormatoRecibo;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoRecibo(
		Boolean isBusquedaDesdeForeignKeySesionFormatoRecibo) {
		this.isBusquedaDesdeForeignKeySesionFormatoRecibo = isBusquedaDesdeForeignKeySesionFormatoRecibo;
	}

	public Long getlidFormatoReciboActual() {
		return lidFormatoReciboActual;
	}

	public void setlidFormatoReciboActual(Long lidFormatoReciboActual) {
		this.lidFormatoReciboActual = lidFormatoReciboActual;
	}
	
	
		
	
}
