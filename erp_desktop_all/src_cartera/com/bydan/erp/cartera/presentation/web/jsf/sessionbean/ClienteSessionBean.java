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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class ClienteSessionBean  extends ClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCliente;
	protected Long lIdClienteActualForeignKey;	
	
	protected Long lIdClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras;
	protected String sUltimaBusquedaCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	Long lidTipoIdentificacionActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoCliente;
	Long lidGrupoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTituloCliente;
	Long lidTituloClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionAreaCr;
	Long lidAreaCrActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCliente;
	Long lidEstadoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionRegion;
	Long lidRegionActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionZona;
	Long lidZonaActual;
	Boolean isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	Long lidPaisNacionalidadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	Long lidTipoCargoLaboActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	Long lidTipoNivelEduActual;
	Boolean isBusquedaDesdeForeignKeySesionProfesion;
	Long lidProfesionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGenero;
	Long lidTipoGeneroActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCivil;
	Long lidEstadoCivilActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoLegal;
	Long lidEstadoLegalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionRuta;
	Long lidRutaActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroActividad;
	Long lidCentroActividadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa;
	Long lidTipoGarantiaEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCateTipoAfiliacion;
	Long lidCateTipoAfiliacionActual;
	Boolean isBusquedaDesdeForeignKeySesionDia;
	Long lidDiaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoListaPrecio;
	Long lidTipoListaPrecioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_identificacion;
	private String identificacion;
	private String nombre_completo;
	private String nombre_comercial;
	private Long id_grupo_cliente;
	private Long id_titulo_cliente;
	private Long id_area_cr;
	private Long id_estado_cliente;
	private Long id_pais;
	private Long id_region;
	private Long id_provincia;
	private Long id_ciudad;
	private Long id_zona;
	private Long id_pais_nacionalidad;
	private Long id_tipo_cargo_labo;
	private Long id_tipo_nivel_edu;
	private Long id_profesion;
	private Long id_tipo_genero;
	private Long id_estado_civil;
	private Long id_estado_legal;
	private Long id_cuenta_contable;
	private Long id_ruta;
	private Long id_vendedor;
	private Long id_centro_actividad;
	private Long id_tipo_garantia_empresa;
	private Long id_cate_tipo_afiliacion;
	private Long id_dia;
	private Long id_empleado;
	private Long id_tipo_precio;
	private Long id_tipo_lista_precio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ClienteSessionBeanAdditional clienteSessionBeanAdditional=null;
	
	public ClienteSessionBeanAdditional getClienteSessionBeanAdditional() {
		return this.clienteSessionBeanAdditional;
	}
	
	public void setClienteSessionBeanAdditional(ClienteSessionBeanAdditional clienteSessionBeanAdditional) {
		try {
			this.clienteSessionBeanAdditional=clienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ClienteSessionBean () {
		this.inicializarClienteSessionBean();
	}
	
	public void inicializarClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCliente=false;
		this.lIdClienteActualForeignKey=0L;
		this.lIdClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras=false;
		this.sUltimaBusquedaCliente ="";
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
		isBusquedaDesdeForeignKeySesionTipoIdentificacion=false;
		lidTipoIdentificacionActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoCliente=false;
		lidGrupoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTituloCliente=false;
		lidTituloClienteActual=0L;
		isBusquedaDesdeForeignKeySesionAreaCr=false;
		lidAreaCrActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCliente=false;
		lidEstadoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionRegion=false;
		lidRegionActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionZona=false;
		lidZonaActual=0L;
		isBusquedaDesdeForeignKeySesionPaisNacionalidad=false;
		lidPaisNacionalidadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCargoLabo=false;
		lidTipoCargoLaboActual=0L;
		isBusquedaDesdeForeignKeySesionTipoNivelEdu=false;
		lidTipoNivelEduActual=0L;
		isBusquedaDesdeForeignKeySesionProfesion=false;
		lidProfesionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGenero=false;
		lidTipoGeneroActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCivil=false;
		lidEstadoCivilActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoLegal=false;
		lidEstadoLegalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionRuta=false;
		lidRutaActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionCentroActividad=false;
		lidCentroActividadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa=false;
		lidTipoGarantiaEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCateTipoAfiliacion=false;
		lidCateTipoAfiliacionActual=0L;
		isBusquedaDesdeForeignKeySesionDia=false;
		lidDiaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoListaPrecio=false;
		lidTipoListaPrecioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_identificacion=-1L;
 		this.identificacion="";
 		this.nombre_completo="";
 		this.nombre_comercial="";
 		this.id_grupo_cliente=-1L;
 		this.id_titulo_cliente=-1L;
 		this.id_area_cr=-1L;
 		this.id_estado_cliente=-1L;
 		this.id_pais=-1L;
 		this.id_region=-1L;
 		this.id_provincia=-1L;
 		this.id_ciudad=-1L;
 		this.id_zona=-1L;
 		this.id_pais_nacionalidad=-1L;
 		this.id_tipo_cargo_labo=-1L;
 		this.id_tipo_nivel_edu=-1L;
 		this.id_profesion=-1L;
 		this.id_tipo_genero=-1L;
 		this.id_estado_civil=-1L;
 		this.id_estado_legal=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_ruta=-1L;
 		this.id_vendedor=-1L;
 		this.id_centro_actividad=null;
 		this.id_tipo_garantia_empresa=-1L;
 		this.id_cate_tipo_afiliacion=-1L;
 		this.id_dia=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_precio=-1L;
 		this.id_tipo_lista_precio=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCliente= isPermiteNavegacionHaciaForeignKeyDesdeCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCliente= isBusquedaDesdeForeignKeySesionForeignKeyCliente;
	}
					
	public Long getlIdClienteActualForeignKey() {
		return lIdClienteActualForeignKey;
	}

	public void setlIdClienteActualForeignKey(
			Long lIdClienteActualForeignKey) {
		this.lIdClienteActualForeignKey = lIdClienteActualForeignKey;
	}
				    
	public Long getlIdClienteActualForeignKeyParaPosibleAtras() {
		return lIdClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdClienteActualForeignKeyParaPosibleAtras(
			Long lIdClienteActualForeignKeyParaPosibleAtras) {
		this.lIdClienteActualForeignKeyParaPosibleAtras = lIdClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCliente() {
		return sUltimaBusquedaCliente;
	}

	public void setsUltimaBusquedaCliente(String sUltimaBusquedaCliente) {
		this.sUltimaBusquedaCliente = sUltimaBusquedaCliente;
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
    
	public Long getid_tipo_identificacion() {
		return this.id_tipo_identificacion;
	}
    
	public String getidentificacion() {
		return this.identificacion;
	}
    
	public String getnombre_completo() {
		return this.nombre_completo;
	}
    
	public String getnombre_comercial() {
		return this.nombre_comercial;
	}
    
	public Long getid_grupo_cliente() {
		return this.id_grupo_cliente;
	}
    
	public Long getid_titulo_cliente() {
		return this.id_titulo_cliente;
	}
    
	public Long getid_area_cr() {
		return this.id_area_cr;
	}
    
	public Long getid_estado_cliente() {
		return this.id_estado_cliente;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_region() {
		return this.id_region;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_zona() {
		return this.id_zona;
	}
    
	public Long getid_pais_nacionalidad() {
		return this.id_pais_nacionalidad;
	}
    
	public Long getid_tipo_cargo_labo() {
		return this.id_tipo_cargo_labo;
	}
    
	public Long getid_tipo_nivel_edu() {
		return this.id_tipo_nivel_edu;
	}
    
	public Long getid_profesion() {
		return this.id_profesion;
	}
    
	public Long getid_tipo_genero() {
		return this.id_tipo_genero;
	}
    
	public Long getid_estado_civil() {
		return this.id_estado_civil;
	}
    
	public Long getid_estado_legal() {
		return this.id_estado_legal;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_ruta() {
		return this.id_ruta;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_centro_actividad() {
		return this.id_centro_actividad;
	}
    
	public Long getid_tipo_garantia_empresa() {
		return this.id_tipo_garantia_empresa;
	}
    
	public Long getid_cate_tipo_afiliacion() {
		return this.id_cate_tipo_afiliacion;
	}
    
	public Long getid_dia() {
		return this.id_dia;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_tipo_lista_precio() {
		return this.id_tipo_lista_precio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id");
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_identificacion(Long newid_tipo_identificacion)throws Exception
	{
		try {
			if(this.id_tipo_identificacion!=newid_tipo_identificacion) {
				if(newid_tipo_identificacion==null) {
					//newid_tipo_identificacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_identificacion");
					}
				}

				this.id_tipo_identificacion=newid_tipo_identificacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidentificacion(String newidentificacion)throws Exception
	{
		try {
			if(this.identificacion!=newidentificacion) {
				if(newidentificacion==null) {
					//newidentificacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna identificacion");
					}
				}

				if(newidentificacion!=null&&newidentificacion.length()>25) {
					newidentificacion=newidentificacion.substring(0,23);
					System.out.println("Cliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna identificacion");
				}

				this.identificacion=newidentificacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_completo(String newnombre_completo)throws Exception
	{
		try {
			if(this.nombre_completo!=newnombre_completo) {
				if(newnombre_completo==null) {
					//newnombre_completo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna nombre_completo");
					}
				}

				if(newnombre_completo!=null&&newnombre_completo.length()>150) {
					newnombre_completo=newnombre_completo.substring(0,148);
					System.out.println("Cliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_completo");
				}

				this.nombre_completo=newnombre_completo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_comercial(String newnombre_comercial)throws Exception
	{
		try {
			if(this.nombre_comercial!=newnombre_comercial) {
				if(newnombre_comercial==null) {
					//newnombre_comercial="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna nombre_comercial");
					}
				}

				if(newnombre_comercial!=null&&newnombre_comercial.length()>150) {
					newnombre_comercial=newnombre_comercial.substring(0,148);
					System.out.println("Cliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_comercial");
				}

				this.nombre_comercial=newnombre_comercial;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_cliente(Long newid_grupo_cliente)throws Exception
	{
		try {
			if(this.id_grupo_cliente!=newid_grupo_cliente) {
				if(newid_grupo_cliente==null) {
					//newid_grupo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_grupo_cliente");
					}
				}

				this.id_grupo_cliente=newid_grupo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_titulo_cliente(Long newid_titulo_cliente)throws Exception
	{
		try {
			if(this.id_titulo_cliente!=newid_titulo_cliente) {
				if(newid_titulo_cliente==null) {
					//newid_titulo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_titulo_cliente");
					}
				}

				this.id_titulo_cliente=newid_titulo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_area_cr(Long newid_area_cr)throws Exception
	{
		try {
			if(this.id_area_cr!=newid_area_cr) {
				if(newid_area_cr==null) {
					//newid_area_cr=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_area_cr");
					}
				}

				this.id_area_cr=newid_area_cr;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_cliente(Long newid_estado_cliente)throws Exception
	{
		try {
			if(this.id_estado_cliente!=newid_estado_cliente) {
				if(newid_estado_cliente==null) {
					//newid_estado_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_estado_cliente");
					}
				}

				this.id_estado_cliente=newid_estado_cliente;
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_region(Long newid_region)throws Exception
	{
		try {
			if(this.id_region!=newid_region) {
				if(newid_region==null) {
					//newid_region=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_region");
					}
				}

				this.id_region=newid_region;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_provincia(Long newid_provincia)throws Exception
	{
		try {
			if(this.id_provincia!=newid_provincia) {
				if(newid_provincia==null) {
					//newid_provincia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_zona(Long newid_zona)throws Exception
	{
		try {
			if(this.id_zona!=newid_zona) {
				if(newid_zona==null) {
					//newid_zona=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_zona");
					}
				}

				this.id_zona=newid_zona;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais_nacionalidad(Long newid_pais_nacionalidad)throws Exception
	{
		try {
			if(this.id_pais_nacionalidad!=newid_pais_nacionalidad) {
				if(newid_pais_nacionalidad==null) {
					//newid_pais_nacionalidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_pais_nacionalidad");
					}
				}

				this.id_pais_nacionalidad=newid_pais_nacionalidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cargo_labo(Long newid_tipo_cargo_labo)throws Exception
	{
		try {
			if(this.id_tipo_cargo_labo!=newid_tipo_cargo_labo) {
				if(newid_tipo_cargo_labo==null) {
					//newid_tipo_cargo_labo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_cargo_labo");
					}
				}

				this.id_tipo_cargo_labo=newid_tipo_cargo_labo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_nivel_edu(Long newid_tipo_nivel_edu)throws Exception
	{
		try {
			if(this.id_tipo_nivel_edu!=newid_tipo_nivel_edu) {
				if(newid_tipo_nivel_edu==null) {
					//newid_tipo_nivel_edu=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_nivel_edu");
					}
				}

				this.id_tipo_nivel_edu=newid_tipo_nivel_edu;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_profesion(Long newid_profesion)throws Exception
	{
		try {
			if(this.id_profesion!=newid_profesion) {
				if(newid_profesion==null) {
					//newid_profesion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_profesion");
					}
				}

				this.id_profesion=newid_profesion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_genero(Long newid_tipo_genero)throws Exception
	{
		try {
			if(this.id_tipo_genero!=newid_tipo_genero) {
				if(newid_tipo_genero==null) {
					//newid_tipo_genero=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_genero");
					}
				}

				this.id_tipo_genero=newid_tipo_genero;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_civil(Long newid_estado_civil)throws Exception
	{
		try {
			if(this.id_estado_civil!=newid_estado_civil) {
				if(newid_estado_civil==null) {
					//newid_estado_civil=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_estado_civil");
					}
				}

				this.id_estado_civil=newid_estado_civil;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_legal(Long newid_estado_legal)throws Exception
	{
		try {
			if(this.id_estado_legal!=newid_estado_legal) {
				if(newid_estado_legal==null) {
					//newid_estado_legal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_estado_legal");
					}
				}

				this.id_estado_legal=newid_estado_legal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ruta(Long newid_ruta)throws Exception
	{
		try {
			if(this.id_ruta!=newid_ruta) {
				if(newid_ruta==null) {
					//newid_ruta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_ruta");
					}
				}

				this.id_ruta=newid_ruta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor)throws Exception
	{
		try {
			if(this.id_vendedor!=newid_vendedor) {
				if(newid_vendedor==null) {
					//newid_vendedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_vendedor");
					}
				}

				this.id_vendedor=newid_vendedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_actividad(Long newid_centro_actividad) {
		if(this.id_centro_actividad!=newid_centro_actividad) {

			this.id_centro_actividad=newid_centro_actividad;
		}
	}
    
	public void setid_tipo_garantia_empresa(Long newid_tipo_garantia_empresa)throws Exception
	{
		try {
			if(this.id_tipo_garantia_empresa!=newid_tipo_garantia_empresa) {
				if(newid_tipo_garantia_empresa==null) {
					//newid_tipo_garantia_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_garantia_empresa");
					}
				}

				this.id_tipo_garantia_empresa=newid_tipo_garantia_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cate_tipo_afiliacion(Long newid_cate_tipo_afiliacion)throws Exception
	{
		try {
			if(this.id_cate_tipo_afiliacion!=newid_cate_tipo_afiliacion) {
				if(newid_cate_tipo_afiliacion==null) {
					//newid_cate_tipo_afiliacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_cate_tipo_afiliacion");
					}
				}

				this.id_cate_tipo_afiliacion=newid_cate_tipo_afiliacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_dia(Long newid_dia)throws Exception
	{
		try {
			if(this.id_dia!=newid_dia) {
				if(newid_dia==null) {
					//newid_dia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_dia");
					}
				}

				this.id_dia=newid_dia;
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_lista_precio(Long newid_tipo_lista_precio)throws Exception
	{
		try {
			if(this.id_tipo_lista_precio!=newid_tipo_lista_precio) {
				if(newid_tipo_lista_precio==null) {
					//newid_tipo_lista_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Cliente:Valor nulo no permitido en columna id_tipo_lista_precio");
					}
				}

				this.id_tipo_lista_precio=newid_tipo_lista_precio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIdentificacion() {
		return isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIdentificacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion) {
		this.isBusquedaDesdeForeignKeySesionTipoIdentificacion = isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public Long getlidTipoIdentificacionActual() {
		return lidTipoIdentificacionActual;
	}

	public void setlidTipoIdentificacionActual(Long lidTipoIdentificacionActual) {
		this.lidTipoIdentificacionActual = lidTipoIdentificacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoCliente() {
		return isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoCliente(
		Boolean isBusquedaDesdeForeignKeySesionGrupoCliente) {
		this.isBusquedaDesdeForeignKeySesionGrupoCliente = isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public Long getlidGrupoClienteActual() {
		return lidGrupoClienteActual;
	}

	public void setlidGrupoClienteActual(Long lidGrupoClienteActual) {
		this.lidGrupoClienteActual = lidGrupoClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTituloCliente() {
		return isBusquedaDesdeForeignKeySesionTituloCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionTituloCliente(
		Boolean isBusquedaDesdeForeignKeySesionTituloCliente) {
		this.isBusquedaDesdeForeignKeySesionTituloCliente = isBusquedaDesdeForeignKeySesionTituloCliente;
	}

	public Long getlidTituloClienteActual() {
		return lidTituloClienteActual;
	}

	public void setlidTituloClienteActual(Long lidTituloClienteActual) {
		this.lidTituloClienteActual = lidTituloClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAreaCr() {
		return isBusquedaDesdeForeignKeySesionAreaCr;
	}

	public void setisBusquedaDesdeForeignKeySesionAreaCr(
		Boolean isBusquedaDesdeForeignKeySesionAreaCr) {
		this.isBusquedaDesdeForeignKeySesionAreaCr = isBusquedaDesdeForeignKeySesionAreaCr;
	}

	public Long getlidAreaCrActual() {
		return lidAreaCrActual;
	}

	public void setlidAreaCrActual(Long lidAreaCrActual) {
		this.lidAreaCrActual = lidAreaCrActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCliente() {
		return isBusquedaDesdeForeignKeySesionEstadoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCliente(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCliente) {
		this.isBusquedaDesdeForeignKeySesionEstadoCliente = isBusquedaDesdeForeignKeySesionEstadoCliente;
	}

	public Long getlidEstadoClienteActual() {
		return lidEstadoClienteActual;
	}

	public void setlidEstadoClienteActual(Long lidEstadoClienteActual) {
		this.lidEstadoClienteActual = lidEstadoClienteActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionRegion() {
		return isBusquedaDesdeForeignKeySesionRegion;
	}

	public void setisBusquedaDesdeForeignKeySesionRegion(
		Boolean isBusquedaDesdeForeignKeySesionRegion) {
		this.isBusquedaDesdeForeignKeySesionRegion = isBusquedaDesdeForeignKeySesionRegion;
	}

	public Long getlidRegionActual() {
		return lidRegionActual;
	}

	public void setlidRegionActual(Long lidRegionActual) {
		this.lidRegionActual = lidRegionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProvincia() {
		return isBusquedaDesdeForeignKeySesionProvincia;
	}

	public void setisBusquedaDesdeForeignKeySesionProvincia(
		Boolean isBusquedaDesdeForeignKeySesionProvincia) {
		this.isBusquedaDesdeForeignKeySesionProvincia = isBusquedaDesdeForeignKeySesionProvincia;
	}

	public Long getlidProvinciaActual() {
		return lidProvinciaActual;
	}

	public void setlidProvinciaActual(Long lidProvinciaActual) {
		this.lidProvinciaActual = lidProvinciaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionZona() {
		return isBusquedaDesdeForeignKeySesionZona;
	}

	public void setisBusquedaDesdeForeignKeySesionZona(
		Boolean isBusquedaDesdeForeignKeySesionZona) {
		this.isBusquedaDesdeForeignKeySesionZona = isBusquedaDesdeForeignKeySesionZona;
	}

	public Long getlidZonaActual() {
		return lidZonaActual;
	}

	public void setlidZonaActual(Long lidZonaActual) {
		this.lidZonaActual = lidZonaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPaisNacionalidad() {
		return isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	}

	public void setisBusquedaDesdeForeignKeySesionPaisNacionalidad(
		Boolean isBusquedaDesdeForeignKeySesionPaisNacionalidad) {
		this.isBusquedaDesdeForeignKeySesionPaisNacionalidad = isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	}

	public Long getlidPaisNacionalidadActual() {
		return lidPaisNacionalidadActual;
	}

	public void setlidPaisNacionalidadActual(Long lidPaisNacionalidadActual) {
		this.lidPaisNacionalidadActual = lidPaisNacionalidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCargoLabo() {
		return isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCargoLabo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCargoLabo) {
		this.isBusquedaDesdeForeignKeySesionTipoCargoLabo = isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	}

	public Long getlidTipoCargoLaboActual() {
		return lidTipoCargoLaboActual;
	}

	public void setlidTipoCargoLaboActual(Long lidTipoCargoLaboActual) {
		this.lidTipoCargoLaboActual = lidTipoCargoLaboActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoNivelEdu() {
		return isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoNivelEdu(
		Boolean isBusquedaDesdeForeignKeySesionTipoNivelEdu) {
		this.isBusquedaDesdeForeignKeySesionTipoNivelEdu = isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	}

	public Long getlidTipoNivelEduActual() {
		return lidTipoNivelEduActual;
	}

	public void setlidTipoNivelEduActual(Long lidTipoNivelEduActual) {
		this.lidTipoNivelEduActual = lidTipoNivelEduActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProfesion() {
		return isBusquedaDesdeForeignKeySesionProfesion;
	}

	public void setisBusquedaDesdeForeignKeySesionProfesion(
		Boolean isBusquedaDesdeForeignKeySesionProfesion) {
		this.isBusquedaDesdeForeignKeySesionProfesion = isBusquedaDesdeForeignKeySesionProfesion;
	}

	public Long getlidProfesionActual() {
		return lidProfesionActual;
	}

	public void setlidProfesionActual(Long lidProfesionActual) {
		this.lidProfesionActual = lidProfesionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGenero() {
		return isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGenero(
		Boolean isBusquedaDesdeForeignKeySesionTipoGenero) {
		this.isBusquedaDesdeForeignKeySesionTipoGenero = isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public Long getlidTipoGeneroActual() {
		return lidTipoGeneroActual;
	}

	public void setlidTipoGeneroActual(Long lidTipoGeneroActual) {
		this.lidTipoGeneroActual = lidTipoGeneroActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCivil() {
		return isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCivil(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCivil) {
		this.isBusquedaDesdeForeignKeySesionEstadoCivil = isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public Long getlidEstadoCivilActual() {
		return lidEstadoCivilActual;
	}

	public void setlidEstadoCivilActual(Long lidEstadoCivilActual) {
		this.lidEstadoCivilActual = lidEstadoCivilActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoLegal() {
		return isBusquedaDesdeForeignKeySesionEstadoLegal;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoLegal(
		Boolean isBusquedaDesdeForeignKeySesionEstadoLegal) {
		this.isBusquedaDesdeForeignKeySesionEstadoLegal = isBusquedaDesdeForeignKeySesionEstadoLegal;
	}

	public Long getlidEstadoLegalActual() {
		return lidEstadoLegalActual;
	}

	public void setlidEstadoLegalActual(Long lidEstadoLegalActual) {
		this.lidEstadoLegalActual = lidEstadoLegalActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionRuta() {
		return isBusquedaDesdeForeignKeySesionRuta;
	}

	public void setisBusquedaDesdeForeignKeySesionRuta(
		Boolean isBusquedaDesdeForeignKeySesionRuta) {
		this.isBusquedaDesdeForeignKeySesionRuta = isBusquedaDesdeForeignKeySesionRuta;
	}

	public Long getlidRutaActual() {
		return lidRutaActual;
	}

	public void setlidRutaActual(Long lidRutaActual) {
		this.lidRutaActual = lidRutaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroActividad() {
		return isBusquedaDesdeForeignKeySesionCentroActividad;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroActividad(
		Boolean isBusquedaDesdeForeignKeySesionCentroActividad) {
		this.isBusquedaDesdeForeignKeySesionCentroActividad = isBusquedaDesdeForeignKeySesionCentroActividad;
	}

	public Long getlidCentroActividadActual() {
		return lidCentroActividadActual;
	}

	public void setlidCentroActividadActual(Long lidCentroActividadActual) {
		this.lidCentroActividadActual = lidCentroActividadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa = isBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa;
	}

	public Long getlidTipoGarantiaEmpresaActual() {
		return lidTipoGarantiaEmpresaActual;
	}

	public void setlidTipoGarantiaEmpresaActual(Long lidTipoGarantiaEmpresaActual) {
		this.lidTipoGarantiaEmpresaActual = lidTipoGarantiaEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCateTipoAfiliacion() {
		return isBusquedaDesdeForeignKeySesionCateTipoAfiliacion;
	}

	public void setisBusquedaDesdeForeignKeySesionCateTipoAfiliacion(
		Boolean isBusquedaDesdeForeignKeySesionCateTipoAfiliacion) {
		this.isBusquedaDesdeForeignKeySesionCateTipoAfiliacion = isBusquedaDesdeForeignKeySesionCateTipoAfiliacion;
	}

	public Long getlidCateTipoAfiliacionActual() {
		return lidCateTipoAfiliacionActual;
	}

	public void setlidCateTipoAfiliacionActual(Long lidCateTipoAfiliacionActual) {
		this.lidCateTipoAfiliacionActual = lidCateTipoAfiliacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDia() {
		return isBusquedaDesdeForeignKeySesionDia;
	}

	public void setisBusquedaDesdeForeignKeySesionDia(
		Boolean isBusquedaDesdeForeignKeySesionDia) {
		this.isBusquedaDesdeForeignKeySesionDia = isBusquedaDesdeForeignKeySesionDia;
	}

	public Long getlidDiaActual() {
		return lidDiaActual;
	}

	public void setlidDiaActual(Long lidDiaActual) {
		this.lidDiaActual = lidDiaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoListaPrecio() {
		return isBusquedaDesdeForeignKeySesionTipoListaPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoListaPrecio(
		Boolean isBusquedaDesdeForeignKeySesionTipoListaPrecio) {
		this.isBusquedaDesdeForeignKeySesionTipoListaPrecio = isBusquedaDesdeForeignKeySesionTipoListaPrecio;
	}

	public Long getlidTipoListaPrecioActual() {
		return lidTipoListaPrecioActual;
	}

	public void setlidTipoListaPrecioActual(Long lidTipoListaPrecioActual) {
		this.lidTipoListaPrecioActual = lidTipoListaPrecioActual;
	}
	
	
		
	
}
