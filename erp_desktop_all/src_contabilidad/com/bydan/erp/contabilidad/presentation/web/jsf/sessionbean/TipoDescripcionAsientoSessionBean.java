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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class TipoDescripcionAsientoSessionBean  extends TipoDescripcionAsientoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento;
	protected Long lIdTipoDescripcionAsientoActualForeignKey;	
	
	protected Long lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras;
	protected String sUltimaBusquedaTipoDescripcionAsiento;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_modulo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoDescripcionAsientoSessionBeanAdditional tipodescripcionasientoSessionBeanAdditional=null;
	
	public TipoDescripcionAsientoSessionBeanAdditional getTipoDescripcionAsientoSessionBeanAdditional() {
		return this.tipodescripcionasientoSessionBeanAdditional;
	}
	
	public void setTipoDescripcionAsientoSessionBeanAdditional(TipoDescripcionAsientoSessionBeanAdditional tipodescripcionasientoSessionBeanAdditional) {
		try {
			this.tipodescripcionasientoSessionBeanAdditional=tipodescripcionasientoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoDescripcionAsientoSessionBean () {
		this.inicializarTipoDescripcionAsientoSessionBean();
	}
	
	public void inicializarTipoDescripcionAsientoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento=false;
		this.lIdTipoDescripcionAsientoActualForeignKey=0L;
		this.lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras=false;
		this.sUltimaBusquedaTipoDescripcionAsiento ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_modulo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento= isPermiteNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDescripcionAsiento;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento= isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsiento;
	}
					
	public Long getlIdTipoDescripcionAsientoActualForeignKey() {
		return lIdTipoDescripcionAsientoActualForeignKey;
	}

	public void setlIdTipoDescripcionAsientoActualForeignKey(
			Long lIdTipoDescripcionAsientoActualForeignKey) {
		this.lIdTipoDescripcionAsientoActualForeignKey = lIdTipoDescripcionAsientoActualForeignKey;
	}
				    
	public Long getlIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras() {
		return lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras(
			Long lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras) {
		this.lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras = lIdTipoDescripcionAsientoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoDescripcionAsientoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoDescripcionAsiento() {
		return sUltimaBusquedaTipoDescripcionAsiento;
	}

	public void setsUltimaBusquedaTipoDescripcionAsiento(String sUltimaBusquedaTipoDescripcionAsiento) {
		this.sUltimaBusquedaTipoDescripcionAsiento = sUltimaBusquedaTipoDescripcionAsiento;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoDescripcionAsiento:Valor nulo no permitido en columna id");
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
						System.out.println("TipoDescripcionAsiento:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoDescripcionAsiento:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	
	
		
	
}
