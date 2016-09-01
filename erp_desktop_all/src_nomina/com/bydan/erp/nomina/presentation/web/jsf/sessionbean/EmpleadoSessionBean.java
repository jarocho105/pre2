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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class EmpleadoSessionBean  extends EmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleado;
	protected Long lIdEmpleadoActualForeignKey;	
	
	protected Long lIdEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaEmpleado;
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
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionReligion;
	Long lidReligionActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCivil;
	Long lidEstadoCivilActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGenero;
	Long lidTipoGeneroActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEmpleado;
	Long lidTipoEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoInstruccion;
	Long lidTipoInstruccionActual;
	Boolean isBusquedaDesdeForeignKeySesionCargo;
	Long lidCargoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructura;
	Long lidEstructuraActual;
	Boolean isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	Long lidEstructuraSeccionActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoEmpleado;
	Long lidEstadoEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoContrato;
	Long lidTipoContratoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	Long lidTipoCuentaBancoGlobalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_pais;
	private Long id_provincia;
	private Long id_ciudad;
	private Long id_centro_costo;
	private Long id_religion;
	private Long id_estado_civil;
	private Long id_tipo_genero;
	private Long id_tipo_empleado;
	private Long id_tipo_instruccion;
	private Long id_cargo;
	private Long id_estructura;
	private Long id_estructura_seccion;
	private Long id_estado_empleado;
	private Long id_tipo_contrato;
	private Long id_tipo_cuenta_banco_global;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpleadoSessionBeanAdditional empleadoSessionBeanAdditional=null;
	
	public EmpleadoSessionBeanAdditional getEmpleadoSessionBeanAdditional() {
		return this.empleadoSessionBeanAdditional;
	}
	
	public void setEmpleadoSessionBeanAdditional(EmpleadoSessionBeanAdditional empleadoSessionBeanAdditional) {
		try {
			this.empleadoSessionBeanAdditional=empleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpleadoSessionBean () {
		this.inicializarEmpleadoSessionBean();
	}
	
	public void inicializarEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleado=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleado=false;
		this.lIdEmpleadoActualForeignKey=0L;
		this.lIdEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaEmpleado ="";
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
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionReligion=false;
		lidReligionActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCivil=false;
		lidEstadoCivilActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGenero=false;
		lidTipoGeneroActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEmpleado=false;
		lidTipoEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoInstruccion=false;
		lidTipoInstruccionActual=0L;
		isBusquedaDesdeForeignKeySesionCargo=false;
		lidCargoActual=0L;
		isBusquedaDesdeForeignKeySesionEstructura=false;
		lidEstructuraActual=0L;
		isBusquedaDesdeForeignKeySesionEstructuraSeccion=false;
		lidEstructuraSeccionActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoEmpleado=false;
		lidEstadoEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoContrato=false;
		lidTipoContratoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal=false;
		lidTipoCuentaBancoGlobalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_pais=-1L;
 		this.id_provincia=-1L;
 		this.id_ciudad=-1L;
 		this.id_centro_costo=null;
 		this.id_religion=-1L;
 		this.id_estado_civil=-1L;
 		this.id_tipo_genero=-1L;
 		this.id_tipo_empleado=-1L;
 		this.id_tipo_instruccion=-1L;
 		this.id_cargo=-1L;
 		this.id_estructura=-1L;
 		this.id_estructura_seccion=-1L;
 		this.id_estado_empleado=-1L;
 		this.id_tipo_contrato=-1L;
 		this.id_tipo_cuenta_banco_global=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyEmpleado;
	}
					
	public Long getlIdEmpleadoActualForeignKey() {
		return lIdEmpleadoActualForeignKey;
	}

	public void setlIdEmpleadoActualForeignKey(
			Long lIdEmpleadoActualForeignKey) {
		this.lIdEmpleadoActualForeignKey = lIdEmpleadoActualForeignKey;
	}
				    
	public Long getlIdEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdEmpleadoActualForeignKeyParaPosibleAtras = lIdEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpleado() {
		return sUltimaBusquedaEmpleado;
	}

	public void setsUltimaBusquedaEmpleado(String sUltimaBusquedaEmpleado) {
		this.sUltimaBusquedaEmpleado = sUltimaBusquedaEmpleado;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_religion() {
		return this.id_religion;
	}
    
	public Long getid_estado_civil() {
		return this.id_estado_civil;
	}
    
	public Long getid_tipo_genero() {
		return this.id_tipo_genero;
	}
    
	public Long getid_tipo_empleado() {
		return this.id_tipo_empleado;
	}
    
	public Long getid_tipo_instruccion() {
		return this.id_tipo_instruccion;
	}
    
	public Long getid_cargo() {
		return this.id_cargo;
	}
    
	public Long getid_estructura() {
		return this.id_estructura;
	}
    
	public Long getid_estructura_seccion() {
		return this.id_estructura_seccion;
	}
    
	public Long getid_estado_empleado() {
		return this.id_estado_empleado;
	}
    
	public Long getid_tipo_contrato() {
		return this.id_tipo_contrato;
	}
    
	public Long getid_tipo_cuenta_banco_global() {
		return this.id_tipo_cuenta_banco_global;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id");
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_provincia");
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_ciudad");
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
    
	public void setid_religion(Long newid_religion)throws Exception
	{
		try {
			if(this.id_religion!=newid_religion) {
				if(newid_religion==null) {
					//newid_religion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_religion");
					}
				}

				this.id_religion=newid_religion;
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_estado_civil");
					}
				}

				this.id_estado_civil=newid_estado_civil;
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
						System.out.println("Empleado:Valor nulo no permitido en columna id_tipo_genero");
					}
				}

				this.id_tipo_genero=newid_tipo_genero;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_empleado(Long newid_tipo_empleado)throws Exception
	{
		try {
			if(this.id_tipo_empleado!=newid_tipo_empleado) {
				if(newid_tipo_empleado==null) {
					//newid_tipo_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_tipo_empleado");
					}
				}

				this.id_tipo_empleado=newid_tipo_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_instruccion(Long newid_tipo_instruccion)throws Exception
	{
		try {
			if(this.id_tipo_instruccion!=newid_tipo_instruccion) {
				if(newid_tipo_instruccion==null) {
					//newid_tipo_instruccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_tipo_instruccion");
					}
				}

				this.id_tipo_instruccion=newid_tipo_instruccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cargo(Long newid_cargo)throws Exception
	{
		try {
			if(this.id_cargo!=newid_cargo) {
				if(newid_cargo==null) {
					//newid_cargo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_cargo");
					}
				}

				this.id_cargo=newid_cargo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura(Long newid_estructura)throws Exception
	{
		try {
			if(this.id_estructura!=newid_estructura) {
				if(newid_estructura==null) {
					//newid_estructura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_estructura");
					}
				}

				this.id_estructura=newid_estructura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estructura_seccion(Long newid_estructura_seccion)throws Exception
	{
		try {
			if(this.id_estructura_seccion!=newid_estructura_seccion) {
				if(newid_estructura_seccion==null) {
					//newid_estructura_seccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_estructura_seccion");
					}
				}

				this.id_estructura_seccion=newid_estructura_seccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_empleado(Long newid_estado_empleado)throws Exception
	{
		try {
			if(this.id_estado_empleado!=newid_estado_empleado) {
				if(newid_estado_empleado==null) {
					//newid_estado_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_estado_empleado");
					}
				}

				this.id_estado_empleado=newid_estado_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_contrato(Long newid_tipo_contrato)throws Exception
	{
		try {
			if(this.id_tipo_contrato!=newid_tipo_contrato) {
				if(newid_tipo_contrato==null) {
					//newid_tipo_contrato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_tipo_contrato");
					}
				}

				this.id_tipo_contrato=newid_tipo_contrato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_banco_global(Long newid_tipo_cuenta_banco_global)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_banco_global!=newid_tipo_cuenta_banco_global) {
				if(newid_tipo_cuenta_banco_global==null) {
					//newid_tipo_cuenta_banco_global=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empleado:Valor nulo no permitido en columna id_tipo_cuenta_banco_global");
					}
				}

				this.id_tipo_cuenta_banco_global=newid_tipo_cuenta_banco_global;
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
	public Boolean getisBusquedaDesdeForeignKeySesionReligion() {
		return isBusquedaDesdeForeignKeySesionReligion;
	}

	public void setisBusquedaDesdeForeignKeySesionReligion(
		Boolean isBusquedaDesdeForeignKeySesionReligion) {
		this.isBusquedaDesdeForeignKeySesionReligion = isBusquedaDesdeForeignKeySesionReligion;
	}

	public Long getlidReligionActual() {
		return lidReligionActual;
	}

	public void setlidReligionActual(Long lidReligionActual) {
		this.lidReligionActual = lidReligionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoEmpleado() {
		return isBusquedaDesdeForeignKeySesionTipoEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionTipoEmpleado) {
		this.isBusquedaDesdeForeignKeySesionTipoEmpleado = isBusquedaDesdeForeignKeySesionTipoEmpleado;
	}

	public Long getlidTipoEmpleadoActual() {
		return lidTipoEmpleadoActual;
	}

	public void setlidTipoEmpleadoActual(Long lidTipoEmpleadoActual) {
		this.lidTipoEmpleadoActual = lidTipoEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoInstruccion() {
		return isBusquedaDesdeForeignKeySesionTipoInstruccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoInstruccion(
		Boolean isBusquedaDesdeForeignKeySesionTipoInstruccion) {
		this.isBusquedaDesdeForeignKeySesionTipoInstruccion = isBusquedaDesdeForeignKeySesionTipoInstruccion;
	}

	public Long getlidTipoInstruccionActual() {
		return lidTipoInstruccionActual;
	}

	public void setlidTipoInstruccionActual(Long lidTipoInstruccionActual) {
		this.lidTipoInstruccionActual = lidTipoInstruccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCargo() {
		return isBusquedaDesdeForeignKeySesionCargo;
	}

	public void setisBusquedaDesdeForeignKeySesionCargo(
		Boolean isBusquedaDesdeForeignKeySesionCargo) {
		this.isBusquedaDesdeForeignKeySesionCargo = isBusquedaDesdeForeignKeySesionCargo;
	}

	public Long getlidCargoActual() {
		return lidCargoActual;
	}

	public void setlidCargoActual(Long lidCargoActual) {
		this.lidCargoActual = lidCargoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstructura() {
		return isBusquedaDesdeForeignKeySesionEstructura;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructura(
		Boolean isBusquedaDesdeForeignKeySesionEstructura) {
		this.isBusquedaDesdeForeignKeySesionEstructura = isBusquedaDesdeForeignKeySesionEstructura;
	}

	public Long getlidEstructuraActual() {
		return lidEstructuraActual;
	}

	public void setlidEstructuraActual(Long lidEstructuraActual) {
		this.lidEstructuraActual = lidEstructuraActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstructuraSeccion() {
		return isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	}

	public void setisBusquedaDesdeForeignKeySesionEstructuraSeccion(
		Boolean isBusquedaDesdeForeignKeySesionEstructuraSeccion) {
		this.isBusquedaDesdeForeignKeySesionEstructuraSeccion = isBusquedaDesdeForeignKeySesionEstructuraSeccion;
	}

	public Long getlidEstructuraSeccionActual() {
		return lidEstructuraSeccionActual;
	}

	public void setlidEstructuraSeccionActual(Long lidEstructuraSeccionActual) {
		this.lidEstructuraSeccionActual = lidEstructuraSeccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoEmpleado() {
		return isBusquedaDesdeForeignKeySesionEstadoEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEstadoEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEstadoEmpleado = isBusquedaDesdeForeignKeySesionEstadoEmpleado;
	}

	public Long getlidEstadoEmpleadoActual() {
		return lidEstadoEmpleadoActual;
	}

	public void setlidEstadoEmpleadoActual(Long lidEstadoEmpleadoActual) {
		this.lidEstadoEmpleadoActual = lidEstadoEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoContrato() {
		return isBusquedaDesdeForeignKeySesionTipoContrato;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoContrato(
		Boolean isBusquedaDesdeForeignKeySesionTipoContrato) {
		this.isBusquedaDesdeForeignKeySesionTipoContrato = isBusquedaDesdeForeignKeySesionTipoContrato;
	}

	public Long getlidTipoContratoActual() {
		return lidTipoContratoActual;
	}

	public void setlidTipoContratoActual(Long lidTipoContratoActual) {
		this.lidTipoContratoActual = lidTipoContratoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal = isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public Long getlidTipoCuentaBancoGlobalActual() {
		return lidTipoCuentaBancoGlobalActual;
	}

	public void setlidTipoCuentaBancoGlobalActual(Long lidTipoCuentaBancoGlobalActual) {
		this.lidTipoCuentaBancoGlobalActual = lidTipoCuentaBancoGlobalActual;
	}
	
	
		
	
}
