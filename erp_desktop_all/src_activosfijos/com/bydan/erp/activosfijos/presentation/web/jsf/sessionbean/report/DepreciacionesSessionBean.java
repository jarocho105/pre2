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
package com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.activosfijos.business.entity.*;

@SuppressWarnings("unused")
public class DepreciacionesSessionBean  extends DepreciacionesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones;
	protected Long lIdDepreciacionesActualForeignKey;	
	
	protected Long lIdDepreciacionesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras;
	protected String sUltimaBusquedaDepreciaciones;
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
	Boolean isBusquedaDesdeForeignKeySesionAnioInicio;
	Long lidAnioInicioActual;
	Boolean isBusquedaDesdeForeignKeySesionAnioFin;
	Long lidAnioFinActual;
	Boolean isBusquedaDesdeForeignKeySesionMesInicio;
	Long lidMesInicioActual;
	Boolean isBusquedaDesdeForeignKeySesionMesFin;
	Long lidMesFinActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_anio_inicio;
	private Long id_anio_fin;
	private Long id_mes_inicio;
	private Long id_mes_fin;
	private Long id_anio;
	private Long id_mes;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DepreciacionesSessionBeanAdditional depreciacionesSessionBeanAdditional=null;
	
	public DepreciacionesSessionBeanAdditional getDepreciacionesSessionBeanAdditional() {
		return this.depreciacionesSessionBeanAdditional;
	}
	
	public void setDepreciacionesSessionBeanAdditional(DepreciacionesSessionBeanAdditional depreciacionesSessionBeanAdditional) {
		try {
			this.depreciacionesSessionBeanAdditional=depreciacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DepreciacionesSessionBean () {
		this.inicializarDepreciacionesSessionBean();
	}
	
	public void inicializarDepreciacionesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones=false;
		this.lIdDepreciacionesActualForeignKey=0L;
		this.lIdDepreciacionesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras=false;
		this.sUltimaBusquedaDepreciaciones ="";
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
		isBusquedaDesdeForeignKeySesionAnioInicio=false;
		lidAnioInicioActual=0L;
		isBusquedaDesdeForeignKeySesionAnioFin=false;
		lidAnioFinActual=0L;
		isBusquedaDesdeForeignKeySesionMesInicio=false;
		lidMesInicioActual=0L;
		isBusquedaDesdeForeignKeySesionMesFin=false;
		lidMesFinActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_anio_inicio=-1L;
 		this.id_anio_fin=-1L;
 		this.id_mes_inicio=-1L;
 		this.id_mes_fin=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones= isPermiteNavegacionHaciaForeignKeyDesdeDepreciaciones;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones = sNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciaciones;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones= isBusquedaDesdeForeignKeySesionForeignKeyDepreciaciones;
	}
					
	public Long getlIdDepreciacionesActualForeignKey() {
		return lIdDepreciacionesActualForeignKey;
	}

	public void setlIdDepreciacionesActualForeignKey(
			Long lIdDepreciacionesActualForeignKey) {
		this.lIdDepreciacionesActualForeignKey = lIdDepreciacionesActualForeignKey;
	}
				    
	public Long getlIdDepreciacionesActualForeignKeyParaPosibleAtras() {
		return lIdDepreciacionesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDepreciacionesActualForeignKeyParaPosibleAtras(
			Long lIdDepreciacionesActualForeignKeyParaPosibleAtras) {
		this.lIdDepreciacionesActualForeignKeyParaPosibleAtras = lIdDepreciacionesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDepreciacionesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDepreciaciones() {
		return sUltimaBusquedaDepreciaciones;
	}

	public void setsUltimaBusquedaDepreciaciones(String sUltimaBusquedaDepreciaciones) {
		this.sUltimaBusquedaDepreciaciones = sUltimaBusquedaDepreciaciones;
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
    
	public Long getid_anio_inicio() {
		return this.id_anio_inicio;
	}
    
	public Long getid_anio_fin() {
		return this.id_anio_fin;
	}
    
	public Long getid_mes_inicio() {
		return this.id_mes_inicio;
	}
    
	public Long getid_mes_fin() {
		return this.id_mes_fin;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id");
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
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio_inicio(Long newid_anio_inicio)throws Exception
	{
		try {
			if(this.id_anio_inicio!=newid_anio_inicio) {
				if(newid_anio_inicio==null) {
					//newid_anio_inicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id_anio_inicio");
					}
				}

				this.id_anio_inicio=newid_anio_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio_fin(Long newid_anio_fin)throws Exception
	{
		try {
			if(this.id_anio_fin!=newid_anio_fin) {
				if(newid_anio_fin==null) {
					//newid_anio_fin=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id_anio_fin");
					}
				}

				this.id_anio_fin=newid_anio_fin;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_inicio(Long newid_mes_inicio)throws Exception
	{
		try {
			if(this.id_mes_inicio!=newid_mes_inicio) {
				if(newid_mes_inicio==null) {
					//newid_mes_inicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id_mes_inicio");
					}
				}

				this.id_mes_inicio=newid_mes_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_fin(Long newid_mes_fin)throws Exception
	{
		try {
			if(this.id_mes_fin!=newid_mes_fin) {
				if(newid_mes_fin==null) {
					//newid_mes_fin=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Depreciaciones:Valor nulo no permitido en columna id_mes_fin");
					}
				}

				this.id_mes_fin=newid_mes_fin;
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
	public Boolean getisBusquedaDesdeForeignKeySesionAnioInicio() {
		return isBusquedaDesdeForeignKeySesionAnioInicio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnioInicio(
		Boolean isBusquedaDesdeForeignKeySesionAnioInicio) {
		this.isBusquedaDesdeForeignKeySesionAnioInicio = isBusquedaDesdeForeignKeySesionAnioInicio;
	}

	public Long getlidAnioInicioActual() {
		return lidAnioInicioActual;
	}

	public void setlidAnioInicioActual(Long lidAnioInicioActual) {
		this.lidAnioInicioActual = lidAnioInicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnioFin() {
		return isBusquedaDesdeForeignKeySesionAnioFin;
	}

	public void setisBusquedaDesdeForeignKeySesionAnioFin(
		Boolean isBusquedaDesdeForeignKeySesionAnioFin) {
		this.isBusquedaDesdeForeignKeySesionAnioFin = isBusquedaDesdeForeignKeySesionAnioFin;
	}

	public Long getlidAnioFinActual() {
		return lidAnioFinActual;
	}

	public void setlidAnioFinActual(Long lidAnioFinActual) {
		this.lidAnioFinActual = lidAnioFinActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesInicio() {
		return isBusquedaDesdeForeignKeySesionMesInicio;
	}

	public void setisBusquedaDesdeForeignKeySesionMesInicio(
		Boolean isBusquedaDesdeForeignKeySesionMesInicio) {
		this.isBusquedaDesdeForeignKeySesionMesInicio = isBusquedaDesdeForeignKeySesionMesInicio;
	}

	public Long getlidMesInicioActual() {
		return lidMesInicioActual;
	}

	public void setlidMesInicioActual(Long lidMesInicioActual) {
		this.lidMesInicioActual = lidMesInicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesFin() {
		return isBusquedaDesdeForeignKeySesionMesFin;
	}

	public void setisBusquedaDesdeForeignKeySesionMesFin(
		Boolean isBusquedaDesdeForeignKeySesionMesFin) {
		this.isBusquedaDesdeForeignKeySesionMesFin = isBusquedaDesdeForeignKeySesionMesFin;
	}

	public Long getlidMesFinActual() {
		return lidMesFinActual;
	}

	public void setlidMesFinActual(Long lidMesFinActual) {
		this.lidMesFinActual = lidMesFinActual;
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
	
	
		
	
}
