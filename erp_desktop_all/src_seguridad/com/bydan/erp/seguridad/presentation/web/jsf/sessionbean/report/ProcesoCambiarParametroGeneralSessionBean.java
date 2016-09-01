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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoCambiarParametroGeneralSessionBean  extends ProcesoCambiarParametroGeneralSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral;
	protected Long lIdProcesoCambiarParametroGeneralActualForeignKey;	
	
	protected Long lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras;
	protected String sUltimaBusquedaProcesoCambiarParametroGeneral;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoVisual;
	Long lidTipoVisualActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondo;
	Long lidTipoFondoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondoBorde;
	Long lidTipoFondoBordeActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFondoControl;
	Long lidTipoFondoControlActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControl;
	Long lidTipoTamanioControlActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoExportar;
	Long lidTipoExportarActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDelimiter;
	Long lidTipoDelimiterActual;
	
	private Long id;
	private Long id_tipo_visual;
	private Long id_tipo_fondo;
	private Long id_tipo_fondo_borde;
	private Long id_tipo_fondo_control;
	private Long id_tipo_tamanio_control;
	private Boolean con_mensaje_confirmacion;
	private Boolean con_botones_tool_bar;
	private Long id_tipo_exportar;
	private Long id_tipo_delimiter;
	private Boolean con_exportar_cabecera;
	private String path_exportar;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoCambiarParametroGeneralSessionBeanAdditional procesocambiarparametrogeneralSessionBeanAdditional=null;
	
	public ProcesoCambiarParametroGeneralSessionBeanAdditional getProcesoCambiarParametroGeneralSessionBeanAdditional() {
		return this.procesocambiarparametrogeneralSessionBeanAdditional;
	}
	
	public void setProcesoCambiarParametroGeneralSessionBeanAdditional(ProcesoCambiarParametroGeneralSessionBeanAdditional procesocambiarparametrogeneralSessionBeanAdditional) {
		try {
			this.procesocambiarparametrogeneralSessionBeanAdditional=procesocambiarparametrogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoCambiarParametroGeneralSessionBean () {
		this.inicializarProcesoCambiarParametroGeneralSessionBean();
	}
	
	public void inicializarProcesoCambiarParametroGeneralSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral=false;
		this.lIdProcesoCambiarParametroGeneralActualForeignKey=0L;
		this.lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoCambiarParametroGeneral ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoVisual=false;
		lidTipoVisualActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondo=false;
		lidTipoFondoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondoBorde=false;
		lidTipoFondoBordeActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFondoControl=false;
		lidTipoFondoControlActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTamanioControl=false;
		lidTipoTamanioControlActual=0L;
		isBusquedaDesdeForeignKeySesionTipoExportar=false;
		lidTipoExportarActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDelimiter=false;
		lidTipoDelimiterActual=0L; 
		
		
		
 		this.id_tipo_visual=-1L;
 		this.id_tipo_fondo=-1L;
 		this.id_tipo_fondo_borde=-1L;
 		this.id_tipo_fondo_control=-1L;
 		this.id_tipo_tamanio_control=-1L;
 		this.con_mensaje_confirmacion=false;
 		this.con_botones_tool_bar=false;
 		this.id_tipo_exportar=-1L;
 		this.id_tipo_delimiter=-1L;
 		this.con_exportar_cabecera=false;
 		this.path_exportar="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral= isPermiteNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCambiarParametroGeneral;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral= isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneral;
	}
					
	public Long getlIdProcesoCambiarParametroGeneralActualForeignKey() {
		return lIdProcesoCambiarParametroGeneralActualForeignKey;
	}

	public void setlIdProcesoCambiarParametroGeneralActualForeignKey(
			Long lIdProcesoCambiarParametroGeneralActualForeignKey) {
		this.lIdProcesoCambiarParametroGeneralActualForeignKey = lIdProcesoCambiarParametroGeneralActualForeignKey;
	}
				    
	public Long getlIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras() {
		return lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras(
			Long lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras = lIdProcesoCambiarParametroGeneralActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoCambiarParametroGeneralParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoCambiarParametroGeneral() {
		return sUltimaBusquedaProcesoCambiarParametroGeneral;
	}

	public void setsUltimaBusquedaProcesoCambiarParametroGeneral(String sUltimaBusquedaProcesoCambiarParametroGeneral) {
		this.sUltimaBusquedaProcesoCambiarParametroGeneral = sUltimaBusquedaProcesoCambiarParametroGeneral;
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
    
	public Long getid_tipo_tamanio_control() {
		return this.id_tipo_tamanio_control;
	}
    
	public Boolean getcon_mensaje_confirmacion() {
		return this.con_mensaje_confirmacion;
	}
    
	public Boolean getcon_botones_tool_bar() {
		return this.con_botones_tool_bar;
	}
    
	public Long getid_tipo_exportar() {
		return this.id_tipo_exportar;
	}
    
	public Long getid_tipo_delimiter() {
		return this.id_tipo_delimiter;
	}
    
	public Boolean getcon_exportar_cabecera() {
		return this.con_exportar_cabecera;
	}
    
	public String getpath_exportar() {
		return this.path_exportar;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_visual(Long newid_tipo_visual)throws Exception
	{
		try {
			if(this.id_tipo_visual!=newid_tipo_visual) {
				if(newid_tipo_visual==null) {
					//newid_tipo_visual=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_visual");
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
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_fondo");
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
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_fondo_borde");
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
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_fondo_control");
					}
				}

				this.id_tipo_fondo_control=newid_tipo_fondo_control;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tamanio_control(Long newid_tipo_tamanio_control)throws Exception
	{
		try {
			if(this.id_tipo_tamanio_control!=newid_tipo_tamanio_control) {
				if(newid_tipo_tamanio_control==null) {
					//newid_tipo_tamanio_control=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_tamanio_control");
					}
				}

				this.id_tipo_tamanio_control=newid_tipo_tamanio_control;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_mensaje_confirmacion(Boolean newcon_mensaje_confirmacion)throws Exception
	{
		try {
			if(this.con_mensaje_confirmacion!=newcon_mensaje_confirmacion) {
				if(newcon_mensaje_confirmacion==null) {
					//newcon_mensaje_confirmacion=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna con_mensaje_confirmacion");
					}
				}

				this.con_mensaje_confirmacion=newcon_mensaje_confirmacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_botones_tool_bar(Boolean newcon_botones_tool_bar)throws Exception
	{
		try {
			if(this.con_botones_tool_bar!=newcon_botones_tool_bar) {
				if(newcon_botones_tool_bar==null) {
					//newcon_botones_tool_bar=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna con_botones_tool_bar");
					}
				}

				this.con_botones_tool_bar=newcon_botones_tool_bar;
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
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_exportar");
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
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna id_tipo_delimiter");
					}
				}

				this.id_tipo_delimiter=newid_tipo_delimiter;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_exportar_cabecera(Boolean newcon_exportar_cabecera)throws Exception
	{
		try {
			if(this.con_exportar_cabecera!=newcon_exportar_cabecera) {
				if(newcon_exportar_cabecera==null) {
					//newcon_exportar_cabecera=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna con_exportar_cabecera");
					}
				}

				this.con_exportar_cabecera=newcon_exportar_cabecera;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpath_exportar(String newpath_exportar)throws Exception
	{
		try {
			if(this.path_exportar!=newpath_exportar) {
				if(newpath_exportar==null) {
					//newpath_exportar="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCambiarParametroGeneral:Valor nulo no permitido en columna path_exportar");
					}
				}

				if(newpath_exportar!=null&&newpath_exportar.length()>100) {
					newpath_exportar=newpath_exportar.substring(0,98);
					System.out.println("ProcesoCambiarParametroGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna path_exportar");
				}

				this.path_exportar=newpath_exportar;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTamanioControl() {
		return isBusquedaDesdeForeignKeySesionTipoTamanioControl;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTamanioControl(
		Boolean isBusquedaDesdeForeignKeySesionTipoTamanioControl) {
		this.isBusquedaDesdeForeignKeySesionTipoTamanioControl = isBusquedaDesdeForeignKeySesionTipoTamanioControl;
	}

	public Long getlidTipoTamanioControlActual() {
		return lidTipoTamanioControlActual;
	}

	public void setlidTipoTamanioControlActual(Long lidTipoTamanioControlActual) {
		this.lidTipoTamanioControlActual = lidTipoTamanioControlActual;
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
