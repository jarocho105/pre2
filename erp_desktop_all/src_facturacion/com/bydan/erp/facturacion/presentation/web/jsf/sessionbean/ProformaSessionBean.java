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
public class ProformaSessionBean  extends ProformaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProforma;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProforma;
	protected Long lIdProformaActualForeignKey;	
	
	protected Long lIdProformaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras;
	protected String sUltimaBusquedaProforma;
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
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoProforma;
	Long lidEstadoProformaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionSubCliente;
	Long lidSubClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	Long lidTipoViaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionTransporte;
	Long lidTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionRutaTransporte;
	Long lidRutaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProforma;
	Long lidTipoProformaActual;
	Boolean isBusquedaDesdeForeignKeySesionConsignatario;
	Long lidConsignatarioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCambio;
	Long lidTipoCambioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_moneda;
	private Long id_empleado;
	private Long id_formato;
	private Long id_estado_proforma;
	private Long id_cliente;
	private Long id_tipo_precio;
	private Long id_vendedor;
	private Long id_sub_cliente;
	private Long id_tipo_via_transporte;
	private Long id_transporte;
	private Long id_ruta_transporte;
	private Long id_centro_costo;
	private Long id_tipo_proforma;
	private Long id_consignatario;
	private Long id_tipo_cambio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProformaSessionBeanAdditional proformaSessionBeanAdditional=null;
	
	public ProformaSessionBeanAdditional getProformaSessionBeanAdditional() {
		return this.proformaSessionBeanAdditional;
	}
	
	public void setProformaSessionBeanAdditional(ProformaSessionBeanAdditional proformaSessionBeanAdditional) {
		try {
			this.proformaSessionBeanAdditional=proformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProformaSessionBean () {
		this.inicializarProformaSessionBean();
	}
	
	public void inicializarProformaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProforma=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProforma=false;
		this.lIdProformaActualForeignKey=0L;
		this.lIdProformaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras=false;
		this.sUltimaBusquedaProforma ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoProforma=false;
		lidEstadoProformaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionSubCliente=false;
		lidSubClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoViaTransporte=false;
		lidTipoViaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionTransporte=false;
		lidTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionRutaTransporte=false;
		lidRutaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProforma=false;
		lidTipoProformaActual=0L;
		isBusquedaDesdeForeignKeySesionConsignatario=false;
		lidConsignatarioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCambio=false;
		lidTipoCambioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_moneda=-1L;
 		this.id_empleado=-1L;
 		this.id_formato=null;
 		this.id_estado_proforma=-1L;
 		this.id_cliente=-1L;
 		this.id_tipo_precio=-1L;
 		this.id_vendedor=null;
 		this.id_sub_cliente=null;
 		this.id_tipo_via_transporte=-1L;
 		this.id_transporte=-1L;
 		this.id_ruta_transporte=-1L;
 		this.id_centro_costo=null;
 		this.id_tipo_proforma=-1L;
 		this.id_consignatario=-1L;
 		this.id_tipo_cambio=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProforma() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProforma;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProforma(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProforma) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProforma= isPermiteNavegacionHaciaForeignKeyDesdeProforma;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProforma() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProforma(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma = sNombrePaginaNavegacionHaciaForeignKeyDesdeProforma;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProforma() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProforma(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProforma) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProforma= isBusquedaDesdeForeignKeySesionForeignKeyProforma;
	}
					
	public Long getlIdProformaActualForeignKey() {
		return lIdProformaActualForeignKey;
	}

	public void setlIdProformaActualForeignKey(
			Long lIdProformaActualForeignKey) {
		this.lIdProformaActualForeignKey = lIdProformaActualForeignKey;
	}
				    
	public Long getlIdProformaActualForeignKeyParaPosibleAtras() {
		return lIdProformaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProformaActualForeignKeyParaPosibleAtras(
			Long lIdProformaActualForeignKeyParaPosibleAtras) {
		this.lIdProformaActualForeignKeyParaPosibleAtras = lIdProformaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProformaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProforma() {
		return sUltimaBusquedaProforma;
	}

	public void setsUltimaBusquedaProforma(String sUltimaBusquedaProforma) {
		this.sUltimaBusquedaProforma = sUltimaBusquedaProforma;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_estado_proforma() {
		return this.id_estado_proforma;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_sub_cliente() {
		return this.id_sub_cliente;
	}
    
	public Long getid_tipo_via_transporte() {
		return this.id_tipo_via_transporte;
	}
    
	public Long getid_transporte() {
		return this.id_transporte;
	}
    
	public Long getid_ruta_transporte() {
		return this.id_ruta_transporte;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_tipo_proforma() {
		return this.id_tipo_proforma;
	}
    
	public Long getid_consignatario() {
		return this.id_consignatario;
	}
    
	public Long getid_tipo_cambio() {
		return this.id_tipo_cambio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id");
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
						System.out.println("Proforma:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Proforma:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
    
	public void setid_estado_proforma(Long newid_estado_proforma)throws Exception
	{
		try {
			if(this.id_estado_proforma!=newid_estado_proforma) {
				if(newid_estado_proforma==null) {
					//newid_estado_proforma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_estado_proforma");
					}
				}

				this.id_estado_proforma=newid_estado_proforma;
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
						System.out.println("Proforma:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_precio(Long newid_tipo_precio)throws Exception
	{
		try {
			if(this.id_tipo_precio!=newid_tipo_precio) {
				if(newid_tipo_precio==null) {
					//newid_tipo_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor) {
		if(this.id_vendedor!=newid_vendedor) {

			this.id_vendedor=newid_vendedor;
		}
	}
    
	public void setid_sub_cliente(Long newid_sub_cliente) {
		if(this.id_sub_cliente!=newid_sub_cliente) {

			this.id_sub_cliente=newid_sub_cliente;
		}
	}
    
	public void setid_tipo_via_transporte(Long newid_tipo_via_transporte)throws Exception
	{
		try {
			if(this.id_tipo_via_transporte!=newid_tipo_via_transporte) {
				if(newid_tipo_via_transporte==null) {
					//newid_tipo_via_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_tipo_via_transporte");
					}
				}

				this.id_tipo_via_transporte=newid_tipo_via_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transporte(Long newid_transporte)throws Exception
	{
		try {
			if(this.id_transporte!=newid_transporte) {
				if(newid_transporte==null) {
					//newid_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_transporte");
					}
				}

				this.id_transporte=newid_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ruta_transporte(Long newid_ruta_transporte)throws Exception
	{
		try {
			if(this.id_ruta_transporte!=newid_ruta_transporte) {
				if(newid_ruta_transporte==null) {
					//newid_ruta_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_ruta_transporte");
					}
				}

				this.id_ruta_transporte=newid_ruta_transporte;
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
    
	public void setid_tipo_proforma(Long newid_tipo_proforma)throws Exception
	{
		try {
			if(this.id_tipo_proforma!=newid_tipo_proforma) {
				if(newid_tipo_proforma==null) {
					//newid_tipo_proforma=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_tipo_proforma");
					}
				}

				this.id_tipo_proforma=newid_tipo_proforma;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_consignatario(Long newid_consignatario)throws Exception
	{
		try {
			if(this.id_consignatario!=newid_consignatario) {
				if(newid_consignatario==null) {
					//newid_consignatario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Proforma:Valor nulo no permitido en columna id_consignatario");
					}
				}

				this.id_consignatario=newid_consignatario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cambio(Long newid_tipo_cambio) {
		if(this.id_tipo_cambio!=newid_tipo_cambio) {

			this.id_tipo_cambio=newid_tipo_cambio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoProforma() {
		return isBusquedaDesdeForeignKeySesionEstadoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoProforma(
		Boolean isBusquedaDesdeForeignKeySesionEstadoProforma) {
		this.isBusquedaDesdeForeignKeySesionEstadoProforma = isBusquedaDesdeForeignKeySesionEstadoProforma;
	}

	public Long getlidEstadoProformaActual() {
		return lidEstadoProformaActual;
	}

	public void setlidEstadoProformaActual(Long lidEstadoProformaActual) {
		this.lidEstadoProformaActual = lidEstadoProformaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrecio() {
		return isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrecio(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrecio) {
		this.isBusquedaDesdeForeignKeySesionTipoPrecio = isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public Long getlidTipoPrecioActual() {
		return lidTipoPrecioActual;
	}

	public void setlidTipoPrecioActual(Long lidTipoPrecioActual) {
		this.lidTipoPrecioActual = lidTipoPrecioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionVendedor() {
		return isBusquedaDesdeForeignKeySesionVendedor;
	}

	public void setisBusquedaDesdeForeignKeySesionVendedor(
		Boolean isBusquedaDesdeForeignKeySesionVendedor) {
		this.isBusquedaDesdeForeignKeySesionVendedor = isBusquedaDesdeForeignKeySesionVendedor;
	}

	public Long getlidVendedorActual() {
		return lidVendedorActual;
	}

	public void setlidVendedorActual(Long lidVendedorActual) {
		this.lidVendedorActual = lidVendedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSubCliente() {
		return isBusquedaDesdeForeignKeySesionSubCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionSubCliente(
		Boolean isBusquedaDesdeForeignKeySesionSubCliente) {
		this.isBusquedaDesdeForeignKeySesionSubCliente = isBusquedaDesdeForeignKeySesionSubCliente;
	}

	public Long getlidSubClienteActual() {
		return lidSubClienteActual;
	}

	public void setlidSubClienteActual(Long lidSubClienteActual) {
		this.lidSubClienteActual = lidSubClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoViaTransporte() {
		return isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoViaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte) {
		this.isBusquedaDesdeForeignKeySesionTipoViaTransporte = isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public Long getlidTipoViaTransporteActual() {
		return lidTipoViaTransporteActual;
	}

	public void setlidTipoViaTransporteActual(Long lidTipoViaTransporteActual) {
		this.lidTipoViaTransporteActual = lidTipoViaTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransporte() {
		return isBusquedaDesdeForeignKeySesionTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTransporte) {
		this.isBusquedaDesdeForeignKeySesionTransporte = isBusquedaDesdeForeignKeySesionTransporte;
	}

	public Long getlidTransporteActual() {
		return lidTransporteActual;
	}

	public void setlidTransporteActual(Long lidTransporteActual) {
		this.lidTransporteActual = lidTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionRutaTransporte() {
		return isBusquedaDesdeForeignKeySesionRutaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionRutaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionRutaTransporte) {
		this.isBusquedaDesdeForeignKeySesionRutaTransporte = isBusquedaDesdeForeignKeySesionRutaTransporte;
	}

	public Long getlidRutaTransporteActual() {
		return lidRutaTransporteActual;
	}

	public void setlidRutaTransporteActual(Long lidRutaTransporteActual) {
		this.lidRutaTransporteActual = lidRutaTransporteActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProforma() {
		return isBusquedaDesdeForeignKeySesionTipoProforma;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProforma(
		Boolean isBusquedaDesdeForeignKeySesionTipoProforma) {
		this.isBusquedaDesdeForeignKeySesionTipoProforma = isBusquedaDesdeForeignKeySesionTipoProforma;
	}

	public Long getlidTipoProformaActual() {
		return lidTipoProformaActual;
	}

	public void setlidTipoProformaActual(Long lidTipoProformaActual) {
		this.lidTipoProformaActual = lidTipoProformaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionConsignatario() {
		return isBusquedaDesdeForeignKeySesionConsignatario;
	}

	public void setisBusquedaDesdeForeignKeySesionConsignatario(
		Boolean isBusquedaDesdeForeignKeySesionConsignatario) {
		this.isBusquedaDesdeForeignKeySesionConsignatario = isBusquedaDesdeForeignKeySesionConsignatario;
	}

	public Long getlidConsignatarioActual() {
		return lidConsignatarioActual;
	}

	public void setlidConsignatarioActual(Long lidConsignatarioActual) {
		this.lidConsignatarioActual = lidConsignatarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCambio() {
		return isBusquedaDesdeForeignKeySesionTipoCambio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCambio(
		Boolean isBusquedaDesdeForeignKeySesionTipoCambio) {
		this.isBusquedaDesdeForeignKeySesionTipoCambio = isBusquedaDesdeForeignKeySesionTipoCambio;
	}

	public Long getlidTipoCambioActual() {
		return lidTipoCambioActual;
	}

	public void setlidTipoCambioActual(Long lidTipoCambioActual) {
		this.lidTipoCambioActual = lidTipoCambioActual;
	}
	
	
		
	
}
