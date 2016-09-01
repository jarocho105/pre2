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
public class AuditoriaDetalleSessionBean  extends AuditoriaDetalleSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle;
	protected Long lIdAuditoriaDetalleActualForeignKey;	
	
	protected Long lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras;
	protected String sUltimaBusquedaAuditoriaDetalle;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionAuditoria;
	Long lidAuditoriaActual;
	
	private Long id;
	private Long id_auditoria;
	private String nombre_campo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AuditoriaDetalleSessionBeanAdditional auditoriadetalleSessionBeanAdditional=null;
	
	public AuditoriaDetalleSessionBeanAdditional getAuditoriaDetalleSessionBeanAdditional() {
		return this.auditoriadetalleSessionBeanAdditional;
	}
	
	public void setAuditoriaDetalleSessionBeanAdditional(AuditoriaDetalleSessionBeanAdditional auditoriadetalleSessionBeanAdditional) {
		try {
			this.auditoriadetalleSessionBeanAdditional=auditoriadetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AuditoriaDetalleSessionBean () {
		this.inicializarAuditoriaDetalleSessionBean();
	}
	
	public void inicializarAuditoriaDetalleSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle=false;
		this.lIdAuditoriaDetalleActualForeignKey=0L;
		this.lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras=false;
		this.sUltimaBusquedaAuditoriaDetalle ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionAuditoria=false;
		lidAuditoriaActual=0L; 
		
		
		
 		this.id_auditoria=-1L;
 		this.nombre_campo="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle= isPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle = sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle= isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalle;
	}
					
	public Long getlIdAuditoriaDetalleActualForeignKey() {
		return lIdAuditoriaDetalleActualForeignKey;
	}

	public void setlIdAuditoriaDetalleActualForeignKey(
			Long lIdAuditoriaDetalleActualForeignKey) {
		this.lIdAuditoriaDetalleActualForeignKey = lIdAuditoriaDetalleActualForeignKey;
	}
				    
	public Long getlIdAuditoriaDetalleActualForeignKeyParaPosibleAtras() {
		return lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAuditoriaDetalleActualForeignKeyParaPosibleAtras(
			Long lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras) {
		this.lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras = lIdAuditoriaDetalleActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaDetalleParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAuditoriaDetalle() {
		return sUltimaBusquedaAuditoriaDetalle;
	}

	public void setsUltimaBusquedaAuditoriaDetalle(String sUltimaBusquedaAuditoriaDetalle) {
		this.sUltimaBusquedaAuditoriaDetalle = sUltimaBusquedaAuditoriaDetalle;
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
    
	public Long getid_auditoria() {
		return this.id_auditoria;
	}
    
	public String getnombre_campo() {
		return this.nombre_campo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_auditoria(Long newid_auditoria)throws Exception
	{
		try {
			if(this.id_auditoria!=newid_auditoria) {
				if(newid_auditoria==null) {
					//newid_auditoria=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna id_auditoria");
					}
				}

				this.id_auditoria=newid_auditoria;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_campo(String newnombre_campo)throws Exception
	{
		try {
			if(this.nombre_campo!=newnombre_campo) {
				if(newnombre_campo==null) {
					//newnombre_campo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna nombre_campo");
					}
				}

				if(newnombre_campo!=null&&newnombre_campo.length()>150) {
					newnombre_campo=newnombre_campo.substring(0,148);
					System.out.println("AuditoriaDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_campo");
				}

				this.nombre_campo=newnombre_campo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionAuditoria() {
		return isBusquedaDesdeForeignKeySesionAuditoria;
	}

	public void setisBusquedaDesdeForeignKeySesionAuditoria(
		Boolean isBusquedaDesdeForeignKeySesionAuditoria) {
		this.isBusquedaDesdeForeignKeySesionAuditoria = isBusquedaDesdeForeignKeySesionAuditoria;
	}

	public Long getlidAuditoriaActual() {
		return lidAuditoriaActual;
	}

	public void setlidAuditoriaActual(Long lidAuditoriaActual) {
		this.lidAuditoriaActual = lidAuditoriaActual;
	}
	
	
		
	
}
