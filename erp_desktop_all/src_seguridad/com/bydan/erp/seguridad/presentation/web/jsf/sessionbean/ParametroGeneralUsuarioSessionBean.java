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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class ParametroGeneralUsuarioSessionBean  extends ParametroGeneralUsuarioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario;
	protected Long lIdParametroGeneralUsuarioActualForeignKey;	
	
	protected Long lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras;
	protected String sUltimaBusquedaParametroGeneralUsuario;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoVisual;
	Long lidTipoVisualActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondo;
	Long lidTipoFondoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondoBorde;
	Long lidTipoFondoBordeActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondoControl;
	Long lidTipoFondoControlActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFuente;
	Long lidTipoFuenteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal;
	Long lidTipoTamanioControlNormalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion;
	Long lidTipoTamanioControlRelacionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoExportar;
	Long lidTipoExportarActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDelimiter;
	Long lidTipoDelimiterActual;
	
	private Long id_usuario;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_moneda;
	private Long id_anio;
	private Long id_mes;
	private Long id_tipo_visual;
	private Long id_tipo_fondo;
	private Long id_tipo_fondo_borde;
	private Long id_tipo_fondo_control;
	private Long id_tipo_fuente;
	private Long id_tipo_tamanio_control_normal;
	private Long id_tipo_tamanio_control_relacion;
	private Long id_tipo_exportar;
	private Long id_tipo_delimiter;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroGeneralUsuarioSessionBeanAdditional parametrogeneralusuarioSessionBeanAdditional=null;
	
	public ParametroGeneralUsuarioSessionBeanAdditional getParametroGeneralUsuarioSessionBeanAdditional() {
		return this.parametrogeneralusuarioSessionBeanAdditional;
	}
	
	public void setParametroGeneralUsuarioSessionBeanAdditional(ParametroGeneralUsuarioSessionBeanAdditional parametrogeneralusuarioSessionBeanAdditional) {
		try {
			this.parametrogeneralusuarioSessionBeanAdditional=parametrogeneralusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroGeneralUsuarioSessionBean () {
		this.inicializarParametroGeneralUsuarioSessionBean();
	}
	
	public void inicializarParametroGeneralUsuarioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario=false;
		this.lIdParametroGeneralUsuarioActualForeignKey=0L;
		this.lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras=false;
		this.sUltimaBusquedaParametroGeneralUsuario ="";
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
		
		
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionTipoVisual=false;
		lidTipoVisualActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondo=false;
		lidTipoFondoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondoBorde=false;
		lidTipoFondoBordeActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondoControl=false;
		lidTipoFondoControlActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFuente=false;
		lidTipoFuenteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal=false;
		lidTipoTamanioControlNormalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion=false;
		lidTipoTamanioControlRelacionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoExportar=false;
		lidTipoExportarActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDelimiter=false;
		lidTipoDelimiterActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_moneda=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_tipo_visual=-1L;
 		this.id_tipo_fondo=-1L;
 		this.id_tipo_fondo_borde=-1L;
 		this.id_tipo_fondo_control=-1L;
 		this.id_tipo_fuente=-1L;
 		this.id_tipo_tamanio_control_normal=-1L;
 		this.id_tipo_tamanio_control_relacion=-1L;
 		this.id_tipo_exportar=-1L;
 		this.id_tipo_delimiter=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario= isPermiteNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroGeneralUsuario;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario= isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuario;
	}
					
	public Long getlIdParametroGeneralUsuarioActualForeignKey() {
		return lIdParametroGeneralUsuarioActualForeignKey;
	}

	public void setlIdParametroGeneralUsuarioActualForeignKey(
			Long lIdParametroGeneralUsuarioActualForeignKey) {
		this.lIdParametroGeneralUsuarioActualForeignKey = lIdParametroGeneralUsuarioActualForeignKey;
	}
				    
	public Long getlIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras() {
		return lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras(
			Long lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras) {
		this.lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras = lIdParametroGeneralUsuarioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroGeneralUsuarioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroGeneralUsuario() {
		return sUltimaBusquedaParametroGeneralUsuario;
	}

	public void setsUltimaBusquedaParametroGeneralUsuario(String sUltimaBusquedaParametroGeneralUsuario) {
		this.sUltimaBusquedaParametroGeneralUsuario = sUltimaBusquedaParametroGeneralUsuario;
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
	
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_tipo_visual() {
		return this.id_tipo_visual;
	}
    
	public Long getid_tipo_fondo() {
		return this.id_tipo_fondo;
	}
    
	public Long getid_tipo_fondo_borde() {
		return this.id_tipo_fondo_borde;
	}
    
	public Long getid_tipo_fondo_control() {
		return this.id_tipo_fondo_control;
	}
    
	public Long getid_tipo_fuente() {
		return this.id_tipo_fuente;
	}
    
	public Long getid_tipo_tamanio_control_normal() {
		return this.id_tipo_tamanio_control_normal;
	}
    
	public Long getid_tipo_tamanio_control_relacion() {
		return this.id_tipo_tamanio_control_relacion;
	}
    
	public Long getid_tipo_exportar() {
		return this.id_tipo_exportar;
	}
    
	public Long getid_tipo_delimiter() {
		return this.id_tipo_delimiter;
	}
	
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
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
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
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
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
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
    
	public void setid_tipo_visual(Long newid_tipo_visual)throws Exception
	{
		try {
			if(this.id_tipo_visual!=newid_tipo_visual) {
				if(newid_tipo_visual==null) {
					//newid_tipo_visual=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_visual");
					}
				}

				this.id_tipo_visual=newid_tipo_visual;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_fondo(Long newid_tipo_fondo)throws Exception
	{
		try {
			if(this.id_tipo_fondo!=newid_tipo_fondo) {
				if(newid_tipo_fondo==null) {
					//newid_tipo_fondo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_fondo");
					}
				}

				this.id_tipo_fondo=newid_tipo_fondo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_fondo_borde(Long newid_tipo_fondo_borde)throws Exception
	{
		try {
			if(this.id_tipo_fondo_borde!=newid_tipo_fondo_borde) {
				if(newid_tipo_fondo_borde==null) {
					//newid_tipo_fondo_borde=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_fondo_borde");
					}
				}

				this.id_tipo_fondo_borde=newid_tipo_fondo_borde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_fondo_control(Long newid_tipo_fondo_control)throws Exception
	{
		try {
			if(this.id_tipo_fondo_control!=newid_tipo_fondo_control) {
				if(newid_tipo_fondo_control==null) {
					//newid_tipo_fondo_control=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_fondo_control");
					}
				}

				this.id_tipo_fondo_control=newid_tipo_fondo_control;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_fuente(Long newid_tipo_fuente)throws Exception
	{
		try {
			if(this.id_tipo_fuente!=newid_tipo_fuente) {
				if(newid_tipo_fuente==null) {
					//newid_tipo_fuente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_fuente");
					}
				}

				this.id_tipo_fuente=newid_tipo_fuente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tamanio_control_normal(Long newid_tipo_tamanio_control_normal)throws Exception
	{
		try {
			if(this.id_tipo_tamanio_control_normal!=newid_tipo_tamanio_control_normal) {
				if(newid_tipo_tamanio_control_normal==null) {
					//newid_tipo_tamanio_control_normal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_tamanio_control_normal");
					}
				}

				this.id_tipo_tamanio_control_normal=newid_tipo_tamanio_control_normal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tamanio_control_relacion(Long newid_tipo_tamanio_control_relacion)throws Exception
	{
		try {
			if(this.id_tipo_tamanio_control_relacion!=newid_tipo_tamanio_control_relacion) {
				if(newid_tipo_tamanio_control_relacion==null) {
					//newid_tipo_tamanio_control_relacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_tamanio_control_relacion");
					}
				}

				this.id_tipo_tamanio_control_relacion=newid_tipo_tamanio_control_relacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_exportar(Long newid_tipo_exportar)throws Exception
	{
		try {
			if(this.id_tipo_exportar!=newid_tipo_exportar) {
				if(newid_tipo_exportar==null) {
					//newid_tipo_exportar=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_exportar");
					}
				}

				this.id_tipo_exportar=newid_tipo_exportar;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_delimiter(Long newid_tipo_delimiter)throws Exception
	{
		try {
			if(this.id_tipo_delimiter!=newid_tipo_delimiter) {
				if(newid_tipo_delimiter==null) {
					//newid_tipo_delimiter=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_delimiter");
					}
				}

				this.id_tipo_delimiter=newid_tipo_delimiter;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoVisual() {
		return isBusquedaDesdeForeignKeySesionTipoVisual;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoVisual(
		Boolean isBusquedaDesdeForeignKeySesionTipoVisual) {
		this.isBusquedaDesdeForeignKeySesionTipoVisual = isBusquedaDesdeForeignKeySesionTipoVisual;
	}

	public Long getlidTipoVisualActual() {
		return lidTipoVisualActual;
	}

	public void setlidTipoVisualActual(Long lidTipoVisualActual) {
		this.lidTipoVisualActual = lidTipoVisualActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFondo() {
		return isBusquedaDesdeForeignKeySesionTipoFondo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFondo(
		Boolean isBusquedaDesdeForeignKeySesionTipoFondo) {
		this.isBusquedaDesdeForeignKeySesionTipoFondo = isBusquedaDesdeForeignKeySesionTipoFondo;
	}

	public Long getlidTipoFondoActual() {
		return lidTipoFondoActual;
	}

	public void setlidTipoFondoActual(Long lidTipoFondoActual) {
		this.lidTipoFondoActual = lidTipoFondoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFondoBorde() {
		return isBusquedaDesdeForeignKeySesionTipoFondoBorde;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFondoBorde(
		Boolean isBusquedaDesdeForeignKeySesionTipoFondoBorde) {
		this.isBusquedaDesdeForeignKeySesionTipoFondoBorde = isBusquedaDesdeForeignKeySesionTipoFondoBorde;
	}

	public Long getlidTipoFondoBordeActual() {
		return lidTipoFondoBordeActual;
	}

	public void setlidTipoFondoBordeActual(Long lidTipoFondoBordeActual) {
		this.lidTipoFondoBordeActual = lidTipoFondoBordeActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFondoControl() {
		return isBusquedaDesdeForeignKeySesionTipoFondoControl;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFondoControl(
		Boolean isBusquedaDesdeForeignKeySesionTipoFondoControl) {
		this.isBusquedaDesdeForeignKeySesionTipoFondoControl = isBusquedaDesdeForeignKeySesionTipoFondoControl;
	}

	public Long getlidTipoFondoControlActual() {
		return lidTipoFondoControlActual;
	}

	public void setlidTipoFondoControlActual(Long lidTipoFondoControlActual) {
		this.lidTipoFondoControlActual = lidTipoFondoControlActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFuente() {
		return isBusquedaDesdeForeignKeySesionTipoFuente;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFuente(
		Boolean isBusquedaDesdeForeignKeySesionTipoFuente) {
		this.isBusquedaDesdeForeignKeySesionTipoFuente = isBusquedaDesdeForeignKeySesionTipoFuente;
	}

	public Long getlidTipoFuenteActual() {
		return lidTipoFuenteActual;
	}

	public void setlidTipoFuenteActual(Long lidTipoFuenteActual) {
		this.lidTipoFuenteActual = lidTipoFuenteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTamanioControlNormal() {
		return isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTamanioControlNormal(
		Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal) {
		this.isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal = isBusquedaDesdeForeignKeySesionTipoTamanioControlNormal;
	}

	public Long getlidTipoTamanioControlNormalActual() {
		return lidTipoTamanioControlNormalActual;
	}

	public void setlidTipoTamanioControlNormalActual(Long lidTipoTamanioControlNormalActual) {
		this.lidTipoTamanioControlNormalActual = lidTipoTamanioControlNormalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion() {
		return isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion) {
		this.isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion = isBusquedaDesdeForeignKeySesionTipoTamanioControlRelacion;
	}

	public Long getlidTipoTamanioControlRelacionActual() {
		return lidTipoTamanioControlRelacionActual;
	}

	public void setlidTipoTamanioControlRelacionActual(Long lidTipoTamanioControlRelacionActual) {
		this.lidTipoTamanioControlRelacionActual = lidTipoTamanioControlRelacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoExportar() {
		return isBusquedaDesdeForeignKeySesionTipoExportar;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoExportar(
		Boolean isBusquedaDesdeForeignKeySesionTipoExportar) {
		this.isBusquedaDesdeForeignKeySesionTipoExportar = isBusquedaDesdeForeignKeySesionTipoExportar;
	}

	public Long getlidTipoExportarActual() {
		return lidTipoExportarActual;
	}

	public void setlidTipoExportarActual(Long lidTipoExportarActual) {
		this.lidTipoExportarActual = lidTipoExportarActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDelimiter() {
		return isBusquedaDesdeForeignKeySesionTipoDelimiter;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDelimiter(
		Boolean isBusquedaDesdeForeignKeySesionTipoDelimiter) {
		this.isBusquedaDesdeForeignKeySesionTipoDelimiter = isBusquedaDesdeForeignKeySesionTipoDelimiter;
	}

	public Long getlidTipoDelimiterActual() {
		return lidTipoDelimiterActual;
	}

	public void setlidTipoDelimiterActual(Long lidTipoDelimiterActual) {
		this.lidTipoDelimiterActual = lidTipoDelimiterActual;
	}
	
	
		
	
}
