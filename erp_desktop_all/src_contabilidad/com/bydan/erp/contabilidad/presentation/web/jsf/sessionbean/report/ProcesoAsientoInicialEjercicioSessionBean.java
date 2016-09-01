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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoAsientoInicialEjercicioSessionBean  extends ProcesoAsientoInicialEjercicioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio;
	protected Long lIdProcesoAsientoInicialEjercicioActualForeignKey;	
	
	protected Long lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras;
	protected String sUltimaBusquedaProcesoAsientoInicialEjercicio;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	
	private Long id;
	private Long id_tipo_documento;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoAsientoInicialEjercicioSessionBeanAdditional procesoasientoinicialejercicioSessionBeanAdditional=null;
	
	public ProcesoAsientoInicialEjercicioSessionBeanAdditional getProcesoAsientoInicialEjercicioSessionBeanAdditional() {
		return this.procesoasientoinicialejercicioSessionBeanAdditional;
	}
	
	public void setProcesoAsientoInicialEjercicioSessionBeanAdditional(ProcesoAsientoInicialEjercicioSessionBeanAdditional procesoasientoinicialejercicioSessionBeanAdditional) {
		try {
			this.procesoasientoinicialejercicioSessionBeanAdditional=procesoasientoinicialejercicioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoAsientoInicialEjercicioSessionBean () {
		this.inicializarProcesoAsientoInicialEjercicioSessionBean();
	}
	
	public void inicializarProcesoAsientoInicialEjercicioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio=false;
		this.lIdProcesoAsientoInicialEjercicioActualForeignKey=0L;
		this.lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoAsientoInicialEjercicio ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L; 
		
		
		
 		this.id_tipo_documento=-1L;
 		this.fecha_inicio=new Date();
 		this.fecha_fin=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio= isPermiteNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio= isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicio;
	}
					
	public Long getlIdProcesoAsientoInicialEjercicioActualForeignKey() {
		return lIdProcesoAsientoInicialEjercicioActualForeignKey;
	}

	public void setlIdProcesoAsientoInicialEjercicioActualForeignKey(
			Long lIdProcesoAsientoInicialEjercicioActualForeignKey) {
		this.lIdProcesoAsientoInicialEjercicioActualForeignKey = lIdProcesoAsientoInicialEjercicioActualForeignKey;
	}
				    
	public Long getlIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras() {
		return lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras(
			Long lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras = lIdProcesoAsientoInicialEjercicioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoAsientoInicialEjercicioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoAsientoInicialEjercicio() {
		return sUltimaBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setsUltimaBusquedaProcesoAsientoInicialEjercicio(String sUltimaBusquedaProcesoAsientoInicialEjercicio) {
		this.sUltimaBusquedaProcesoAsientoInicialEjercicio = sUltimaBusquedaProcesoAsientoInicialEjercicio;
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
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Date getfecha_inicio() {
		return this.fecha_inicio;
	}
    
	public Date getfecha_fin() {
		return this.fecha_fin;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoAsientoInicialEjercicio:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoAsientoInicialEjercicio:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_inicio(Date newfecha_inicio)throws Exception
	{
		try {
			if(this.fecha_inicio!=newfecha_inicio) {
				if(newfecha_inicio==null) {
					//newfecha_inicio=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoAsientoInicialEjercicio:Valor nulo no permitido en columna fecha_inicio");
					}
				}

				this.fecha_inicio=newfecha_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_fin(Date newfecha_fin)throws Exception
	{
		try {
			if(this.fecha_fin!=newfecha_fin) {
				if(newfecha_fin==null) {
					//newfecha_fin=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoAsientoInicialEjercicio:Valor nulo no permitido en columna fecha_fin");
					}
				}

				this.fecha_fin=newfecha_fin;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
	}
	
	
		
	
}
