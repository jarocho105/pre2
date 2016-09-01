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
public class DatoGeneralEmpleadoSessionBean  extends DatoGeneralEmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado;
	protected Long lIdDatoGeneralEmpleadoActualForeignKey;	
	
	protected Long lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaDatoGeneralEmpleado;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal;
	Long lidNumeroPatronalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	Long lidTipoAfiliacionActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCanton;
	Long lidCantonActual;
	Boolean isBusquedaDesdeForeignKeySesionParroquia;
	Long lidParroquiaActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoContrato;
	Long lidTipoContratoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoLibretaMili;
	Long lidTipoLibretaMiliActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	Long lidTipoGrupoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	Long lidTipoCuentaBancoGlobalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoSangre;
	Long lidTipoSangreActual;
	
	private Long id_empleado;
	private Long id_numero_patronal;
	private Long id_tipo_afiliacion;
	private Long id_pais;
	private Long id_provincia;
	private Long id_canton;
	private Long id_parroquia;
	private Long id_moneda;
	private Long id_tipo_contrato;
	private Long id_tipo_libreta_mili;
	private Long id_tipo_grupo_forma_pago;
	private Long id_banco;
	private Long id_tipo_cuenta_banco_global;
	private Long id_tipo_sangre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DatoGeneralEmpleadoSessionBeanAdditional datogeneralempleadoSessionBeanAdditional=null;
	
	public DatoGeneralEmpleadoSessionBeanAdditional getDatoGeneralEmpleadoSessionBeanAdditional() {
		return this.datogeneralempleadoSessionBeanAdditional;
	}
	
	public void setDatoGeneralEmpleadoSessionBeanAdditional(DatoGeneralEmpleadoSessionBeanAdditional datogeneralempleadoSessionBeanAdditional) {
		try {
			this.datogeneralempleadoSessionBeanAdditional=datogeneralempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DatoGeneralEmpleadoSessionBean () {
		this.inicializarDatoGeneralEmpleadoSessionBean();
	}
	
	public void inicializarDatoGeneralEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado=false;
		this.lIdDatoGeneralEmpleadoActualForeignKey=0L;
		this.lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaDatoGeneralEmpleado ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionNumeroPatronal=false;
		lidNumeroPatronalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAfiliacion=false;
		lidTipoAfiliacionActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCanton=false;
		lidCantonActual=0L;
		isBusquedaDesdeForeignKeySesionParroquia=false;
		lidParroquiaActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoContrato=false;
		lidTipoContratoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoLibretaMili=false;
		lidTipoLibretaMiliActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago=false;
		lidTipoGrupoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal=false;
		lidTipoCuentaBancoGlobalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoSangre=false;
		lidTipoSangreActual=0L; 
		
		
		
 		this.id_numero_patronal=-1L;
 		this.id_tipo_afiliacion=-1L;
 		this.id_pais=-1L;
 		this.id_provincia=-1L;
 		this.id_canton=-1L;
 		this.id_parroquia=-1L;
 		this.id_moneda=-1L;
 		this.id_tipo_contrato=-1L;
 		this.id_tipo_libreta_mili=-1L;
 		this.id_tipo_grupo_forma_pago=-1L;
 		this.id_banco=-1L;
 		this.id_tipo_cuenta_banco_global=-1L;
 		this.id_tipo_sangre=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleado;
	}
					
	public Long getlIdDatoGeneralEmpleadoActualForeignKey() {
		return lIdDatoGeneralEmpleadoActualForeignKey;
	}

	public void setlIdDatoGeneralEmpleadoActualForeignKey(
			Long lIdDatoGeneralEmpleadoActualForeignKey) {
		this.lIdDatoGeneralEmpleadoActualForeignKey = lIdDatoGeneralEmpleadoActualForeignKey;
	}
				    
	public Long getlIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras = lIdDatoGeneralEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDatoGeneralEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDatoGeneralEmpleado() {
		return sUltimaBusquedaDatoGeneralEmpleado;
	}

	public void setsUltimaBusquedaDatoGeneralEmpleado(String sUltimaBusquedaDatoGeneralEmpleado) {
		this.sUltimaBusquedaDatoGeneralEmpleado = sUltimaBusquedaDatoGeneralEmpleado;
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
	
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_numero_patronal() {
		return this.id_numero_patronal;
	}
    
	public Long getid_tipo_afiliacion() {
		return this.id_tipo_afiliacion;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_canton() {
		return this.id_canton;
	}
    
	public Long getid_parroquia() {
		return this.id_parroquia;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_tipo_contrato() {
		return this.id_tipo_contrato;
	}
    
	public Long getid_tipo_libreta_mili() {
		return this.id_tipo_libreta_mili;
	}
    
	public Long getid_tipo_grupo_forma_pago() {
		return this.id_tipo_grupo_forma_pago;
	}
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_tipo_cuenta_banco_global() {
		return this.id_tipo_cuenta_banco_global;
	}
    
	public Long getid_tipo_sangre() {
		return this.id_tipo_sangre;
	}
	
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_numero_patronal(Long newid_numero_patronal)throws Exception
	{
		try {
			if(this.id_numero_patronal!=newid_numero_patronal) {
				if(newid_numero_patronal==null) {
					//newid_numero_patronal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_numero_patronal");
					}
				}

				this.id_numero_patronal=newid_numero_patronal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_afiliacion(Long newid_tipo_afiliacion)throws Exception
	{
		try {
			if(this.id_tipo_afiliacion!=newid_tipo_afiliacion) {
				if(newid_tipo_afiliacion==null) {
					//newid_tipo_afiliacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_afiliacion");
					}
				}

				this.id_tipo_afiliacion=newid_tipo_afiliacion;
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
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_pais");
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
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_canton(Long newid_canton)throws Exception
	{
		try {
			if(this.id_canton!=newid_canton) {
				if(newid_canton==null) {
					//newid_canton=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_canton");
					}
				}

				this.id_canton=newid_canton;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_parroquia(Long newid_parroquia)throws Exception
	{
		try {
			if(this.id_parroquia!=newid_parroquia) {
				if(newid_parroquia==null) {
					//newid_parroquia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_parroquia");
					}
				}

				this.id_parroquia=newid_parroquia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
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
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_contrato");
					}
				}

				this.id_tipo_contrato=newid_tipo_contrato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_libreta_mili(Long newid_tipo_libreta_mili)throws Exception
	{
		try {
			if(this.id_tipo_libreta_mili!=newid_tipo_libreta_mili) {
				if(newid_tipo_libreta_mili==null) {
					//newid_tipo_libreta_mili=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_libreta_mili");
					}
				}

				this.id_tipo_libreta_mili=newid_tipo_libreta_mili;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grupo_forma_pago(Long newid_tipo_grupo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_grupo_forma_pago!=newid_tipo_grupo_forma_pago) {
				if(newid_tipo_grupo_forma_pago==null) {
					//newid_tipo_grupo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_grupo_forma_pago");
					}
				}

				this.id_tipo_grupo_forma_pago=newid_tipo_grupo_forma_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_banco(Long newid_banco)throws Exception
	{
		try {
			if(this.id_banco!=newid_banco) {
				if(newid_banco==null) {
					//newid_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
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
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_cuenta_banco_global");
					}
				}

				this.id_tipo_cuenta_banco_global=newid_tipo_cuenta_banco_global;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_sangre(Long newid_tipo_sangre)throws Exception
	{
		try {
			if(this.id_tipo_sangre!=newid_tipo_sangre) {
				if(newid_tipo_sangre==null) {
					//newid_tipo_sangre=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DatoGeneralEmpleado:Valor nulo no permitido en columna id_tipo_sangre");
					}
				}

				this.id_tipo_sangre=newid_tipo_sangre;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionNumeroPatronal() {
		return isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public void setisBusquedaDesdeForeignKeySesionNumeroPatronal(
		Boolean isBusquedaDesdeForeignKeySesionNumeroPatronal) {
		this.isBusquedaDesdeForeignKeySesionNumeroPatronal = isBusquedaDesdeForeignKeySesionNumeroPatronal;
	}

	public Long getlidNumeroPatronalActual() {
		return lidNumeroPatronalActual;
	}

	public void setlidNumeroPatronalActual(Long lidNumeroPatronalActual) {
		this.lidNumeroPatronalActual = lidNumeroPatronalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAfiliacion() {
		return isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAfiliacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoAfiliacion) {
		this.isBusquedaDesdeForeignKeySesionTipoAfiliacion = isBusquedaDesdeForeignKeySesionTipoAfiliacion;
	}

	public Long getlidTipoAfiliacionActual() {
		return lidTipoAfiliacionActual;
	}

	public void setlidTipoAfiliacionActual(Long lidTipoAfiliacionActual) {
		this.lidTipoAfiliacionActual = lidTipoAfiliacionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCanton() {
		return isBusquedaDesdeForeignKeySesionCanton;
	}

	public void setisBusquedaDesdeForeignKeySesionCanton(
		Boolean isBusquedaDesdeForeignKeySesionCanton) {
		this.isBusquedaDesdeForeignKeySesionCanton = isBusquedaDesdeForeignKeySesionCanton;
	}

	public Long getlidCantonActual() {
		return lidCantonActual;
	}

	public void setlidCantonActual(Long lidCantonActual) {
		this.lidCantonActual = lidCantonActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionParroquia() {
		return isBusquedaDesdeForeignKeySesionParroquia;
	}

	public void setisBusquedaDesdeForeignKeySesionParroquia(
		Boolean isBusquedaDesdeForeignKeySesionParroquia) {
		this.isBusquedaDesdeForeignKeySesionParroquia = isBusquedaDesdeForeignKeySesionParroquia;
	}

	public Long getlidParroquiaActual() {
		return lidParroquiaActual;
	}

	public void setlidParroquiaActual(Long lidParroquiaActual) {
		this.lidParroquiaActual = lidParroquiaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoLibretaMili() {
		return isBusquedaDesdeForeignKeySesionTipoLibretaMili;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoLibretaMili(
		Boolean isBusquedaDesdeForeignKeySesionTipoLibretaMili) {
		this.isBusquedaDesdeForeignKeySesionTipoLibretaMili = isBusquedaDesdeForeignKeySesionTipoLibretaMili;
	}

	public Long getlidTipoLibretaMiliActual() {
		return lidTipoLibretaMiliActual;
	}

	public void setlidTipoLibretaMiliActual(Long lidTipoLibretaMiliActual) {
		this.lidTipoLibretaMiliActual = lidTipoLibretaMiliActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago = isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public Long getlidTipoGrupoFormaPagoActual() {
		return lidTipoGrupoFormaPagoActual;
	}

	public void setlidTipoGrupoFormaPagoActual(Long lidTipoGrupoFormaPagoActual) {
		this.lidTipoGrupoFormaPagoActual = lidTipoGrupoFormaPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBanco() {
		return isBusquedaDesdeForeignKeySesionBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionBanco(
		Boolean isBusquedaDesdeForeignKeySesionBanco) {
		this.isBusquedaDesdeForeignKeySesionBanco = isBusquedaDesdeForeignKeySesionBanco;
	}

	public Long getlidBancoActual() {
		return lidBancoActual;
	}

	public void setlidBancoActual(Long lidBancoActual) {
		this.lidBancoActual = lidBancoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoSangre() {
		return isBusquedaDesdeForeignKeySesionTipoSangre;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoSangre(
		Boolean isBusquedaDesdeForeignKeySesionTipoSangre) {
		this.isBusquedaDesdeForeignKeySesionTipoSangre = isBusquedaDesdeForeignKeySesionTipoSangre;
	}

	public Long getlidTipoSangreActual() {
		return lidTipoSangreActual;
	}

	public void setlidTipoSangreActual(Long lidTipoSangreActual) {
		this.lidTipoSangreActual = lidTipoSangreActual;
	}
	
	
		
	
}
