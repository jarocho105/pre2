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
public class BonoEficienciaSessionBean  extends BonoEficienciaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia;
	protected Long lIdBonoEficienciaActualForeignKey;	
	
	protected Long lIdBonoEficienciaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras;
	protected String sUltimaBusquedaBonoEficiencia;
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
	
	private Long id;
	private Long id_empresa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BonoEficienciaSessionBeanAdditional bonoeficienciaSessionBeanAdditional=null;
	
	public BonoEficienciaSessionBeanAdditional getBonoEficienciaSessionBeanAdditional() {
		return this.bonoeficienciaSessionBeanAdditional;
	}
	
	public void setBonoEficienciaSessionBeanAdditional(BonoEficienciaSessionBeanAdditional bonoeficienciaSessionBeanAdditional) {
		try {
			this.bonoeficienciaSessionBeanAdditional=bonoeficienciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BonoEficienciaSessionBean () {
		this.inicializarBonoEficienciaSessionBean();
	}
	
	public void inicializarBonoEficienciaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia=false;
		this.lIdBonoEficienciaActualForeignKey=0L;
		this.lIdBonoEficienciaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras=false;
		this.sUltimaBusquedaBonoEficiencia ="";
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
		
		
		
 		this.id_empresa=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia= isPermiteNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia = sNombrePaginaNavegacionHaciaForeignKeyDesdeBonoEficiencia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia= isBusquedaDesdeForeignKeySesionForeignKeyBonoEficiencia;
	}
					
	public Long getlIdBonoEficienciaActualForeignKey() {
		return lIdBonoEficienciaActualForeignKey;
	}

	public void setlIdBonoEficienciaActualForeignKey(
			Long lIdBonoEficienciaActualForeignKey) {
		this.lIdBonoEficienciaActualForeignKey = lIdBonoEficienciaActualForeignKey;
	}
				    
	public Long getlIdBonoEficienciaActualForeignKeyParaPosibleAtras() {
		return lIdBonoEficienciaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBonoEficienciaActualForeignKeyParaPosibleAtras(
			Long lIdBonoEficienciaActualForeignKeyParaPosibleAtras) {
		this.lIdBonoEficienciaActualForeignKeyParaPosibleAtras = lIdBonoEficienciaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBonoEficienciaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBonoEficiencia() {
		return sUltimaBusquedaBonoEficiencia;
	}

	public void setsUltimaBusquedaBonoEficiencia(String sUltimaBusquedaBonoEficiencia) {
		this.sUltimaBusquedaBonoEficiencia = sUltimaBusquedaBonoEficiencia;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BonoEficiencia:Valor nulo no permitido en columna id");
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
						System.out.println("BonoEficiencia:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
	
	
		
	
}
