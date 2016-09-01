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
public class DetalleEvaluacionNomiSessionBean  extends DetalleEvaluacionNomiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi;
	protected Long lIdDetalleEvaluacionNomiActualForeignKey;	
	
	protected Long lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras;
	protected String sUltimaBusquedaDetalleEvaluacionNomi;
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
	Boolean isBusquedaDesdeForeignKeySesionEvaluacionNomi;
	Long lidEvaluacionNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNomi;
	Long lidFormatoNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionPreguntaNomi;
	Long lidPreguntaNomiActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_evaluacion_nomi;
	private Long id_formato_nomi;
	private Long id_pregunta_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected DetalleEvaluacionNomiSessionBeanAdditional detalleevaluacionnomiSessionBeanAdditional=null;
	
	public DetalleEvaluacionNomiSessionBeanAdditional getDetalleEvaluacionNomiSessionBeanAdditional() {
		return this.detalleevaluacionnomiSessionBeanAdditional;
	}
	
	public void setDetalleEvaluacionNomiSessionBeanAdditional(DetalleEvaluacionNomiSessionBeanAdditional detalleevaluacionnomiSessionBeanAdditional) {
		try {
			this.detalleevaluacionnomiSessionBeanAdditional=detalleevaluacionnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public DetalleEvaluacionNomiSessionBean () {
		this.inicializarDetalleEvaluacionNomiSessionBean();
	}
	
	public void inicializarDetalleEvaluacionNomiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi=false;
		this.lIdDetalleEvaluacionNomiActualForeignKey=0L;
		this.lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras=false;
		this.sUltimaBusquedaDetalleEvaluacionNomi ="";
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
		isBusquedaDesdeForeignKeySesionEvaluacionNomi=false;
		lidEvaluacionNomiActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNomi=false;
		lidFormatoNomiActual=0L;
		isBusquedaDesdeForeignKeySesionPreguntaNomi=false;
		lidPreguntaNomiActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_evaluacion_nomi=-1L;
 		this.id_formato_nomi=-1L;
 		this.id_pregunta_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi= isPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi = sNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi= isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomi;
	}
					
	public Long getlIdDetalleEvaluacionNomiActualForeignKey() {
		return lIdDetalleEvaluacionNomiActualForeignKey;
	}

	public void setlIdDetalleEvaluacionNomiActualForeignKey(
			Long lIdDetalleEvaluacionNomiActualForeignKey) {
		this.lIdDetalleEvaluacionNomiActualForeignKey = lIdDetalleEvaluacionNomiActualForeignKey;
	}
				    
	public Long getlIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras() {
		return lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras(
			Long lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras) {
		this.lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras = lIdDetalleEvaluacionNomiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyDetalleEvaluacionNomiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaDetalleEvaluacionNomi() {
		return sUltimaBusquedaDetalleEvaluacionNomi;
	}

	public void setsUltimaBusquedaDetalleEvaluacionNomi(String sUltimaBusquedaDetalleEvaluacionNomi) {
		this.sUltimaBusquedaDetalleEvaluacionNomi = sUltimaBusquedaDetalleEvaluacionNomi;
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
    
	public Long getid_evaluacion_nomi() {
		return this.id_evaluacion_nomi;
	}
    
	public Long getid_formato_nomi() {
		return this.id_formato_nomi;
	}
    
	public Long getid_pregunta_nomi() {
		return this.id_pregunta_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleEvaluacionNomi:Valor nulo no permitido en columna id");
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
						System.out.println("DetalleEvaluacionNomi:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_evaluacion_nomi(Long newid_evaluacion_nomi)throws Exception
	{
		try {
			if(this.id_evaluacion_nomi!=newid_evaluacion_nomi) {
				if(newid_evaluacion_nomi==null) {
					//newid_evaluacion_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleEvaluacionNomi:Valor nulo no permitido en columna id_evaluacion_nomi");
					}
				}

				this.id_evaluacion_nomi=newid_evaluacion_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nomi(Long newid_formato_nomi)throws Exception
	{
		try {
			if(this.id_formato_nomi!=newid_formato_nomi) {
				if(newid_formato_nomi==null) {
					//newid_formato_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleEvaluacionNomi:Valor nulo no permitido en columna id_formato_nomi");
					}
				}

				this.id_formato_nomi=newid_formato_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pregunta_nomi(Long newid_pregunta_nomi)throws Exception
	{
		try {
			if(this.id_pregunta_nomi!=newid_pregunta_nomi) {
				if(newid_pregunta_nomi==null) {
					//newid_pregunta_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("DetalleEvaluacionNomi:Valor nulo no permitido en columna id_pregunta_nomi");
					}
				}

				this.id_pregunta_nomi=newid_pregunta_nomi;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEvaluacionNomi() {
		return isBusquedaDesdeForeignKeySesionEvaluacionNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionEvaluacionNomi(
		Boolean isBusquedaDesdeForeignKeySesionEvaluacionNomi) {
		this.isBusquedaDesdeForeignKeySesionEvaluacionNomi = isBusquedaDesdeForeignKeySesionEvaluacionNomi;
	}

	public Long getlidEvaluacionNomiActual() {
		return lidEvaluacionNomiActual;
	}

	public void setlidEvaluacionNomiActual(Long lidEvaluacionNomiActual) {
		this.lidEvaluacionNomiActual = lidEvaluacionNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNomi() {
		return isBusquedaDesdeForeignKeySesionFormatoNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNomi(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNomi) {
		this.isBusquedaDesdeForeignKeySesionFormatoNomi = isBusquedaDesdeForeignKeySesionFormatoNomi;
	}

	public Long getlidFormatoNomiActual() {
		return lidFormatoNomiActual;
	}

	public void setlidFormatoNomiActual(Long lidFormatoNomiActual) {
		this.lidFormatoNomiActual = lidFormatoNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPreguntaNomi() {
		return isBusquedaDesdeForeignKeySesionPreguntaNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionPreguntaNomi(
		Boolean isBusquedaDesdeForeignKeySesionPreguntaNomi) {
		this.isBusquedaDesdeForeignKeySesionPreguntaNomi = isBusquedaDesdeForeignKeySesionPreguntaNomi;
	}

	public Long getlidPreguntaNomiActual() {
		return lidPreguntaNomiActual;
	}

	public void setlidPreguntaNomiActual(Long lidPreguntaNomiActual) {
		this.lidPreguntaNomiActual = lidPreguntaNomiActual;
	}
	
	
		
	
}
