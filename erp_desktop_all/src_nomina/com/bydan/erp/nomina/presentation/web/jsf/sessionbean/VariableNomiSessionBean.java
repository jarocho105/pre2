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
public class VariableNomiSessionBean  extends VariableNomiSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi;
	protected Long lIdVariableNomiActualForeignKey;	
	
	protected Long lIdVariableNomiActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras;
	protected String sUltimaBusquedaVariableNomi;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoVariableNomi;
	Long lidTipoVariableNomiActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoValorVariableNomi;
	Long lidTipoValorVariableNomiActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_modulo;
	private Long id_tipo_variable_nomi;
	private Long id_tipo_valor_variable_nomi;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected VariableNomiSessionBeanAdditional variablenomiSessionBeanAdditional=null;
	
	public VariableNomiSessionBeanAdditional getVariableNomiSessionBeanAdditional() {
		return this.variablenomiSessionBeanAdditional;
	}
	
	public void setVariableNomiSessionBeanAdditional(VariableNomiSessionBeanAdditional variablenomiSessionBeanAdditional) {
		try {
			this.variablenomiSessionBeanAdditional=variablenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public VariableNomiSessionBean () {
		this.inicializarVariableNomiSessionBean();
	}
	
	public void inicializarVariableNomiSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi=false;
		this.lIdVariableNomiActualForeignKey=0L;
		this.lIdVariableNomiActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras=false;
		this.sUltimaBusquedaVariableNomi ="";
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
		isBusquedaDesdeForeignKeySesionTipoVariableNomi=false;
		lidTipoVariableNomiActual=0L;
		isBusquedaDesdeForeignKeySesionTipoValorVariableNomi=false;
		lidTipoValorVariableNomiActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_modulo=-1L;
 		this.id_tipo_variable_nomi=-1L;
 		this.id_tipo_valor_variable_nomi=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeVariableNomi() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeVariableNomi(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi= isPermiteNavegacionHaciaForeignKeyDesdeVariableNomi;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi(String sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi = sNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVariableNomi() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVariableNomi(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi= isBusquedaDesdeForeignKeySesionForeignKeyVariableNomi;
	}
					
	public Long getlIdVariableNomiActualForeignKey() {
		return lIdVariableNomiActualForeignKey;
	}

	public void setlIdVariableNomiActualForeignKey(
			Long lIdVariableNomiActualForeignKey) {
		this.lIdVariableNomiActualForeignKey = lIdVariableNomiActualForeignKey;
	}
				    
	public Long getlIdVariableNomiActualForeignKeyParaPosibleAtras() {
		return lIdVariableNomiActualForeignKeyParaPosibleAtras;
	}

	public void setlIdVariableNomiActualForeignKeyParaPosibleAtras(
			Long lIdVariableNomiActualForeignKeyParaPosibleAtras) {
		this.lIdVariableNomiActualForeignKeyParaPosibleAtras = lIdVariableNomiActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyVariableNomiParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaVariableNomi() {
		return sUltimaBusquedaVariableNomi;
	}

	public void setsUltimaBusquedaVariableNomi(String sUltimaBusquedaVariableNomi) {
		this.sUltimaBusquedaVariableNomi = sUltimaBusquedaVariableNomi;
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
    
	public Long getid_tipo_variable_nomi() {
		return this.id_tipo_variable_nomi;
	}
    
	public Long getid_tipo_valor_variable_nomi() {
		return this.id_tipo_valor_variable_nomi;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VariableNomi:Valor nulo no permitido en columna id");
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
						System.out.println("VariableNomi:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("VariableNomi:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_variable_nomi(Long newid_tipo_variable_nomi)throws Exception
	{
		try {
			if(this.id_tipo_variable_nomi!=newid_tipo_variable_nomi) {
				if(newid_tipo_variable_nomi==null) {
					//newid_tipo_variable_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VariableNomi:Valor nulo no permitido en columna id_tipo_variable_nomi");
					}
				}

				this.id_tipo_variable_nomi=newid_tipo_variable_nomi;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_valor_variable_nomi(Long newid_tipo_valor_variable_nomi)throws Exception
	{
		try {
			if(this.id_tipo_valor_variable_nomi!=newid_tipo_valor_variable_nomi) {
				if(newid_tipo_valor_variable_nomi==null) {
					//newid_tipo_valor_variable_nomi=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VariableNomi:Valor nulo no permitido en columna id_tipo_valor_variable_nomi");
					}
				}

				this.id_tipo_valor_variable_nomi=newid_tipo_valor_variable_nomi;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoVariableNomi() {
		return isBusquedaDesdeForeignKeySesionTipoVariableNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoVariableNomi(
		Boolean isBusquedaDesdeForeignKeySesionTipoVariableNomi) {
		this.isBusquedaDesdeForeignKeySesionTipoVariableNomi = isBusquedaDesdeForeignKeySesionTipoVariableNomi;
	}

	public Long getlidTipoVariableNomiActual() {
		return lidTipoVariableNomiActual;
	}

	public void setlidTipoVariableNomiActual(Long lidTipoVariableNomiActual) {
		this.lidTipoVariableNomiActual = lidTipoVariableNomiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoValorVariableNomi() {
		return isBusquedaDesdeForeignKeySesionTipoValorVariableNomi;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoValorVariableNomi(
		Boolean isBusquedaDesdeForeignKeySesionTipoValorVariableNomi) {
		this.isBusquedaDesdeForeignKeySesionTipoValorVariableNomi = isBusquedaDesdeForeignKeySesionTipoValorVariableNomi;
	}

	public Long getlidTipoValorVariableNomiActual() {
		return lidTipoValorVariableNomiActual;
	}

	public void setlidTipoValorVariableNomiActual(Long lidTipoValorVariableNomiActual) {
		this.lidTipoValorVariableNomiActual = lidTipoValorVariableNomiActual;
	}
	
	
		
	
}
