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
public class DefiProvisionEmpleadoSessionBean  extends DefiProvisionEmpleadoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado;
	protected Long lIdDefiProvisionEmpleadoActualForeignKey;	
	
	protected Long lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras;
	protected String sUltimaBusquedaDefiProvisionEmpleado;
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
	Boolean isBusquedaDesdeForeignKeySesionRubroEmplea;
	Long lidRubroEmpleaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionMesInicial;
	Long lidMesInicialActual;
	Boolean isBusquedaDesdeForeignKeySesionMesFinal;
	Long lidMesFinalActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_rubro_emplea;
	private Long id_formato;
	private Long id_mes_inicial;
	private Long id_mes_final;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DefiProvisionEmpleadoSessionBeanAdditional defiprovisionempleadoSessionBeanAdditional=null;
	
	public DefiProvisionEmpleadoSessionBeanAdditional getDefiProvisionEmpleadoSessionBeanAdditional() {
		return this.defiprovisionempleadoSessionBeanAdditional;
	}
	
	public void setDefiProvisionEmpleadoSessionBeanAdditional(DefiProvisionEmpleadoSessionBeanAdditional defiprovisionempleadoSessionBeanAdditional) {
		try {
			this.defiprovisionempleadoSessionBeanAdditional=defiprovisionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DefiProvisionEmpleadoSessionBean () {
		this.inicializarDefiProvisionEmpleadoSessionBean();
	}
	
	public void inicializarDefiProvisionEmpleadoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado=false;
		this.lIdDefiProvisionEmpleadoActualForeignKey=0L;
		this.lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras=false;
		this.sUltimaBusquedaDefiProvisionEmpleado ="";
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
		isBusquedaDesdeForeignKeySesionRubroEmplea=false;
		lidRubroEmpleaActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionMesInicial=false;
		lidMesInicialActual=0L;
		isBusquedaDesdeForeignKeySesionMesFinal=false;
		lidMesFinalActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_rubro_emplea=-1L;
 		this.id_formato=-1L;
 		this.id_mes_inicial=-1L;
 		this.id_mes_final=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado= isPermiteNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado = sNombrePaginaNavegacionHaciaForeignKeyDesdeDefiProvisionEmpleado;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado= isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleado;
	}
					
	public Long getlIdDefiProvisionEmpleadoActualForeignKey() {
		return lIdDefiProvisionEmpleadoActualForeignKey;
	}

	public void setlIdDefiProvisionEmpleadoActualForeignKey(
			Long lIdDefiProvisionEmpleadoActualForeignKey) {
		this.lIdDefiProvisionEmpleadoActualForeignKey = lIdDefiProvisionEmpleadoActualForeignKey;
	}
				    
	public Long getlIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras() {
		return lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras(
			Long lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras) {
		this.lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras = lIdDefiProvisionEmpleadoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDefiProvisionEmpleadoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDefiProvisionEmpleado() {
		return sUltimaBusquedaDefiProvisionEmpleado;
	}

	public void setsUltimaBusquedaDefiProvisionEmpleado(String sUltimaBusquedaDefiProvisionEmpleado) {
		this.sUltimaBusquedaDefiProvisionEmpleado = sUltimaBusquedaDefiProvisionEmpleado;
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
    
	public Long getid_rubro_emplea() {
		return this.id_rubro_emplea;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_mes_inicial() {
		return this.id_mes_inicial;
	}
    
	public Long getid_mes_final() {
		return this.id_mes_final;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id");
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
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_rubro_emplea(Long newid_rubro_emplea)throws Exception
	{
		try {
			if(this.id_rubro_emplea!=newid_rubro_emplea) {
				if(newid_rubro_emplea==null) {
					//newid_rubro_emplea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id_rubro_emplea");
					}
				}

				this.id_rubro_emplea=newid_rubro_emplea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_inicial(Long newid_mes_inicial)throws Exception
	{
		try {
			if(this.id_mes_inicial!=newid_mes_inicial) {
				if(newid_mes_inicial==null) {
					//newid_mes_inicial=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id_mes_inicial");
					}
				}

				this.id_mes_inicial=newid_mes_inicial;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes_final(Long newid_mes_final)throws Exception
	{
		try {
			if(this.id_mes_final!=newid_mes_final) {
				if(newid_mes_final==null) {
					//newid_mes_final=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DefiProvisionEmpleado:Valor nulo no permitido en columna id_mes_final");
					}
				}

				this.id_mes_final=newid_mes_final;
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
	public Boolean getisBusquedaDesdeForeignKeySesionRubroEmplea() {
		return isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public void setisBusquedaDesdeForeignKeySesionRubroEmplea(
		Boolean isBusquedaDesdeForeignKeySesionRubroEmplea) {
		this.isBusquedaDesdeForeignKeySesionRubroEmplea = isBusquedaDesdeForeignKeySesionRubroEmplea;
	}

	public Long getlidRubroEmpleaActual() {
		return lidRubroEmpleaActual;
	}

	public void setlidRubroEmpleaActual(Long lidRubroEmpleaActual) {
		this.lidRubroEmpleaActual = lidRubroEmpleaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesInicial() {
		return isBusquedaDesdeForeignKeySesionMesInicial;
	}

	public void setisBusquedaDesdeForeignKeySesionMesInicial(
		Boolean isBusquedaDesdeForeignKeySesionMesInicial) {
		this.isBusquedaDesdeForeignKeySesionMesInicial = isBusquedaDesdeForeignKeySesionMesInicial;
	}

	public Long getlidMesInicialActual() {
		return lidMesInicialActual;
	}

	public void setlidMesInicialActual(Long lidMesInicialActual) {
		this.lidMesInicialActual = lidMesInicialActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesFinal() {
		return isBusquedaDesdeForeignKeySesionMesFinal;
	}

	public void setisBusquedaDesdeForeignKeySesionMesFinal(
		Boolean isBusquedaDesdeForeignKeySesionMesFinal) {
		this.isBusquedaDesdeForeignKeySesionMesFinal = isBusquedaDesdeForeignKeySesionMesFinal;
	}

	public Long getlidMesFinalActual() {
		return lidMesFinalActual;
	}

	public void setlidMesFinalActual(Long lidMesFinalActual) {
		this.lidMesFinalActual = lidMesFinalActual;
	}
	
	
		
	
}
