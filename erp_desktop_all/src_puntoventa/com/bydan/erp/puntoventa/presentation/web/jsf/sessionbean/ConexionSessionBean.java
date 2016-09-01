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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class ConexionSessionBean  extends ConexionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeConexion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConexion;
	protected Long lIdConexionActualForeignKey;	
	
	protected Long lIdConexionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras;
	protected String sUltimaBusquedaConexion;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoConexion;
	Long lidTipoConexionActual;
	
	private Long id;
	private Long id_tipo_conexion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ConexionSessionBeanAdditional conexionSessionBeanAdditional=null;
	
	public ConexionSessionBeanAdditional getConexionSessionBeanAdditional() {
		return this.conexionSessionBeanAdditional;
	}
	
	public void setConexionSessionBeanAdditional(ConexionSessionBeanAdditional conexionSessionBeanAdditional) {
		try {
			this.conexionSessionBeanAdditional=conexionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ConexionSessionBean () {
		this.inicializarConexionSessionBean();
	}
	
	public void inicializarConexionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeConexion=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyConexion=false;
		this.lIdConexionActualForeignKey=0L;
		this.lIdConexionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras=false;
		this.sUltimaBusquedaConexion ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoConexion=false;
		lidTipoConexionActual=0L; 
		
		
		
 		this.id_tipo_conexion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeConexion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeConexion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeConexion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeConexion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeConexion= isPermiteNavegacionHaciaForeignKeyDesdeConexion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeConexion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeConexion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion = sNombrePaginaNavegacionHaciaForeignKeyDesdeConexion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConexion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConexion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConexion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConexion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConexion= isBusquedaDesdeForeignKeySesionForeignKeyConexion;
	}
					
	public Long getlIdConexionActualForeignKey() {
		return lIdConexionActualForeignKey;
	}

	public void setlIdConexionActualForeignKey(
			Long lIdConexionActualForeignKey) {
		this.lIdConexionActualForeignKey = lIdConexionActualForeignKey;
	}
				    
	public Long getlIdConexionActualForeignKeyParaPosibleAtras() {
		return lIdConexionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdConexionActualForeignKeyParaPosibleAtras(
			Long lIdConexionActualForeignKeyParaPosibleAtras) {
		this.lIdConexionActualForeignKeyParaPosibleAtras = lIdConexionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyConexionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaConexion() {
		return sUltimaBusquedaConexion;
	}

	public void setsUltimaBusquedaConexion(String sUltimaBusquedaConexion) {
		this.sUltimaBusquedaConexion = sUltimaBusquedaConexion;
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
    
	public Long getid_tipo_conexion() {
		return this.id_tipo_conexion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Conexion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_conexion(Long newid_tipo_conexion)throws Exception
	{
		try {
			if(this.id_tipo_conexion!=newid_tipo_conexion) {
				if(newid_tipo_conexion==null) {
					//newid_tipo_conexion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Conexion:Valor nulo no permitido en columna id_tipo_conexion");
					}
				}

				this.id_tipo_conexion=newid_tipo_conexion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoConexion() {
		return isBusquedaDesdeForeignKeySesionTipoConexion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoConexion(
		Boolean isBusquedaDesdeForeignKeySesionTipoConexion) {
		this.isBusquedaDesdeForeignKeySesionTipoConexion = isBusquedaDesdeForeignKeySesionTipoConexion;
	}

	public Long getlidTipoConexionActual() {
		return lidTipoConexionActual;
	}

	public void setlidTipoConexionActual(Long lidTipoConexionActual) {
		this.lidTipoConexionActual = lidTipoConexionActual;
	}
	
	
		
	
}
