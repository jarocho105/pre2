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
public class VisaSessionBean  extends VisaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeVisa;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVisa;
	protected Long lIdVisaActualForeignKey;	
	
	protected Long lIdVisaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras;
	protected String sUltimaBusquedaVisa;
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
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_pais;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected VisaSessionBeanAdditional visaSessionBeanAdditional=null;
	
	public VisaSessionBeanAdditional getVisaSessionBeanAdditional() {
		return this.visaSessionBeanAdditional;
	}
	
	public void setVisaSessionBeanAdditional(VisaSessionBeanAdditional visaSessionBeanAdditional) {
		try {
			this.visaSessionBeanAdditional=visaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public VisaSessionBean () {
		this.inicializarVisaSessionBean();
	}
	
	public void inicializarVisaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeVisa=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyVisa=false;
		this.lIdVisaActualForeignKey=0L;
		this.lIdVisaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras=false;
		this.sUltimaBusquedaVisa ="";
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
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_pais=-1L;
 		this.id_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeVisa() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeVisa;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeVisa(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeVisa) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeVisa= isPermiteNavegacionHaciaForeignKeyDesdeVisa;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeVisa() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeVisa(String sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa = sNombrePaginaNavegacionHaciaForeignKeyDesdeVisa;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVisa() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVisa;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVisa(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVisa) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVisa= isBusquedaDesdeForeignKeySesionForeignKeyVisa;
	}
					
	public Long getlIdVisaActualForeignKey() {
		return lIdVisaActualForeignKey;
	}

	public void setlIdVisaActualForeignKey(
			Long lIdVisaActualForeignKey) {
		this.lIdVisaActualForeignKey = lIdVisaActualForeignKey;
	}
				    
	public Long getlIdVisaActualForeignKeyParaPosibleAtras() {
		return lIdVisaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdVisaActualForeignKeyParaPosibleAtras(
			Long lIdVisaActualForeignKeyParaPosibleAtras) {
		this.lIdVisaActualForeignKeyParaPosibleAtras = lIdVisaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyVisaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaVisa() {
		return sUltimaBusquedaVisa;
	}

	public void setsUltimaBusquedaVisa(String sUltimaBusquedaVisa) {
		this.sUltimaBusquedaVisa = sUltimaBusquedaVisa;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Visa:Valor nulo no permitido en columna id");
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
						System.out.println("Visa:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("Visa:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Visa:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
	
	
		
	
}
