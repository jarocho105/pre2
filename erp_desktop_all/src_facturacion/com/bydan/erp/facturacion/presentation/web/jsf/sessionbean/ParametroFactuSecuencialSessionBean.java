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
public class ParametroFactuSecuencialSessionBean  extends ParametroFactuSecuencialSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial;
	protected Long lIdParametroFactuSecuencialActualForeignKey;	
	
	protected Long lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras;
	protected String sUltimaBusquedaParametroFactuSecuencial;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	Long lidTipoDocumentoGeneralActual;
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo;
	Long lidTipoParamFactuPlazoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaTransferencia;
	Long lidBodegaTransferenciaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionTransferencia;
	Long lidTransaccionTransferenciaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_documento_general;
	private Long id_bodega;
	private Long id_tipo_param_factu_plazo;
	private Long id_formato;
	private Long id_bodega_transferencia;
	private Long id_transaccion_transferencia;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFactuSecuencialSessionBeanAdditional parametrofactusecuencialSessionBeanAdditional=null;
	
	public ParametroFactuSecuencialSessionBeanAdditional getParametroFactuSecuencialSessionBeanAdditional() {
		return this.parametrofactusecuencialSessionBeanAdditional;
	}
	
	public void setParametroFactuSecuencialSessionBeanAdditional(ParametroFactuSecuencialSessionBeanAdditional parametrofactusecuencialSessionBeanAdditional) {
		try {
			this.parametrofactusecuencialSessionBeanAdditional=parametrofactusecuencialSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFactuSecuencialSessionBean () {
		this.inicializarParametroFactuSecuencialSessionBean();
	}
	
	public void inicializarParametroFactuSecuencialSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial=false;
		this.lIdParametroFactuSecuencialActualForeignKey=0L;
		this.lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFactuSecuencial ="";
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
		isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral=false;
		lidTipoDocumentoGeneralActual=0L;
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo=false;
		lidTipoParamFactuPlazoActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaTransferencia=false;
		lidBodegaTransferenciaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionTransferencia=false;
		lidTransaccionTransferenciaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_documento_general=-1L;
 		this.id_bodega=-1L;
 		this.id_tipo_param_factu_plazo=-1L;
 		this.id_formato=-1L;
 		this.id_bodega_transferencia=-1L;
 		this.id_transaccion_transferencia=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial= isPermiteNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuSecuencial;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial= isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencial;
	}
					
	public Long getlIdParametroFactuSecuencialActualForeignKey() {
		return lIdParametroFactuSecuencialActualForeignKey;
	}

	public void setlIdParametroFactuSecuencialActualForeignKey(
			Long lIdParametroFactuSecuencialActualForeignKey) {
		this.lIdParametroFactuSecuencialActualForeignKey = lIdParametroFactuSecuencialActualForeignKey;
	}
				    
	public Long getlIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras() {
		return lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras(
			Long lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras = lIdParametroFactuSecuencialActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFactuSecuencialParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFactuSecuencial() {
		return sUltimaBusquedaParametroFactuSecuencial;
	}

	public void setsUltimaBusquedaParametroFactuSecuencial(String sUltimaBusquedaParametroFactuSecuencial) {
		this.sUltimaBusquedaParametroFactuSecuencial = sUltimaBusquedaParametroFactuSecuencial;
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
    
	public Long getid_tipo_documento_general() {
		return this.id_tipo_documento_general;
	}
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_tipo_param_factu_plazo() {
		return this.id_tipo_param_factu_plazo;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_bodega_transferencia() {
		return this.id_bodega_transferencia;
	}
    
	public Long getid_transaccion_transferencia() {
		return this.id_transaccion_transferencia;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_general(Long newid_tipo_documento_general)throws Exception
	{
		try {
			if(this.id_tipo_documento_general!=newid_tipo_documento_general) {
				if(newid_tipo_documento_general==null) {
					//newid_tipo_documento_general=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_tipo_documento_general");
					}
				}

				this.id_tipo_documento_general=newid_tipo_documento_general;
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
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_param_factu_plazo(Long newid_tipo_param_factu_plazo)throws Exception
	{
		try {
			if(this.id_tipo_param_factu_plazo!=newid_tipo_param_factu_plazo) {
				if(newid_tipo_param_factu_plazo==null) {
					//newid_tipo_param_factu_plazo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_tipo_param_factu_plazo");
					}
				}

				this.id_tipo_param_factu_plazo=newid_tipo_param_factu_plazo;
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
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_transferencia(Long newid_bodega_transferencia)throws Exception
	{
		try {
			if(this.id_bodega_transferencia!=newid_bodega_transferencia) {
				if(newid_bodega_transferencia==null) {
					//newid_bodega_transferencia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_bodega_transferencia");
					}
				}

				this.id_bodega_transferencia=newid_bodega_transferencia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_transferencia(Long newid_transaccion_transferencia)throws Exception
	{
		try {
			if(this.id_transaccion_transferencia!=newid_transaccion_transferencia) {
				if(newid_transaccion_transferencia==null) {
					//newid_transaccion_transferencia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFactuSecuencial:Valor nulo no permitido en columna id_transaccion_transferencia");
					}
				}

				this.id_transaccion_transferencia=newid_transaccion_transferencia;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral = isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	}

	public Long getlidTipoDocumentoGeneralActual() {
		return lidTipoDocumentoGeneralActual;
	}

	public void setlidTipoDocumentoGeneralActual(Long lidTipoDocumentoGeneralActual) {
		this.lidTipoDocumentoGeneralActual = lidTipoDocumentoGeneralActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParamFactuPlazo() {
		return isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParamFactuPlazo(
		Boolean isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo) {
		this.isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo = isBusquedaDesdeForeignKeySesionTipoParamFactuPlazo;
	}

	public Long getlidTipoParamFactuPlazoActual() {
		return lidTipoParamFactuPlazoActual;
	}

	public void setlidTipoParamFactuPlazoActual(Long lidTipoParamFactuPlazoActual) {
		this.lidTipoParamFactuPlazoActual = lidTipoParamFactuPlazoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaTransferencia() {
		return isBusquedaDesdeForeignKeySesionBodegaTransferencia;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaTransferencia(
		Boolean isBusquedaDesdeForeignKeySesionBodegaTransferencia) {
		this.isBusquedaDesdeForeignKeySesionBodegaTransferencia = isBusquedaDesdeForeignKeySesionBodegaTransferencia;
	}

	public Long getlidBodegaTransferenciaActual() {
		return lidBodegaTransferenciaActual;
	}

	public void setlidBodegaTransferenciaActual(Long lidBodegaTransferenciaActual) {
		this.lidBodegaTransferenciaActual = lidBodegaTransferenciaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionTransferencia() {
		return isBusquedaDesdeForeignKeySesionTransaccionTransferencia;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionTransferencia(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionTransferencia) {
		this.isBusquedaDesdeForeignKeySesionTransaccionTransferencia = isBusquedaDesdeForeignKeySesionTransaccionTransferencia;
	}

	public Long getlidTransaccionTransferenciaActual() {
		return lidTransaccionTransferenciaActual;
	}

	public void setlidTransaccionTransferenciaActual(Long lidTransaccionTransferenciaActual) {
		this.lidTransaccionTransferenciaActual = lidTransaccionTransferenciaActual;
	}
	
	
		
	
}
