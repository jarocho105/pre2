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
public class ParametroFormularioIvaSessionBean  extends ParametroFormularioIvaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva;
	protected Long lIdParametroFormularioIvaActualForeignKey;	
	
	protected Long lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras;
	protected String sUltimaBusquedaParametroFormularioIva;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva;
	Long lidTipoParametroFormularioIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva;
	Long lidGrupoParametroFormularioIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva;
	Long lidSubGrupoParametroFormularioIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable1;
	Long lidCuentaContable1Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable2;
	Long lidCuentaContable2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable3;
	Long lidCuentaContable3Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable4;
	Long lidCuentaContable4Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable5;
	Long lidCuentaContable5Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_parametro_formulario_iva;
	private Long id_grupo_parametro_formulario_iva;
	private Long id_sub_grupo_parametro_formulario_iva;
	private Long id_cuenta_contable1;
	private Long id_cuenta_contable2;
	private Long id_cuenta_contable3;
	private Long id_cuenta_contable4;
	private Long id_cuenta_contable5;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroFormularioIvaSessionBeanAdditional parametroformularioivaSessionBeanAdditional=null;
	
	public ParametroFormularioIvaSessionBeanAdditional getParametroFormularioIvaSessionBeanAdditional() {
		return this.parametroformularioivaSessionBeanAdditional;
	}
	
	public void setParametroFormularioIvaSessionBeanAdditional(ParametroFormularioIvaSessionBeanAdditional parametroformularioivaSessionBeanAdditional) {
		try {
			this.parametroformularioivaSessionBeanAdditional=parametroformularioivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroFormularioIvaSessionBean () {
		this.inicializarParametroFormularioIvaSessionBean();
	}
	
	public void inicializarParametroFormularioIvaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva=false;
		this.lIdParametroFormularioIvaActualForeignKey=0L;
		this.lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras=false;
		this.sUltimaBusquedaParametroFormularioIva ="";
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
		isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva=false;
		lidTipoParametroFormularioIvaActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva=false;
		lidGrupoParametroFormularioIvaActual=0L;
		isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva=false;
		lidSubGrupoParametroFormularioIvaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable1=false;
		lidCuentaContable1Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable2=false;
		lidCuentaContable2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable3=false;
		lidCuentaContable3Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable4=false;
		lidCuentaContable4Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable5=false;
		lidCuentaContable5Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_parametro_formulario_iva=-1L;
 		this.id_grupo_parametro_formulario_iva=-1L;
 		this.id_sub_grupo_parametro_formulario_iva=-1L;
 		this.id_cuenta_contable1=null;
 		this.id_cuenta_contable2=null;
 		this.id_cuenta_contable3=null;
 		this.id_cuenta_contable4=null;
 		this.id_cuenta_contable5=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva= isPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva= isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIva;
	}
					
	public Long getlIdParametroFormularioIvaActualForeignKey() {
		return lIdParametroFormularioIvaActualForeignKey;
	}

	public void setlIdParametroFormularioIvaActualForeignKey(
			Long lIdParametroFormularioIvaActualForeignKey) {
		this.lIdParametroFormularioIvaActualForeignKey = lIdParametroFormularioIvaActualForeignKey;
	}
				    
	public Long getlIdParametroFormularioIvaActualForeignKeyParaPosibleAtras() {
		return lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroFormularioIvaActualForeignKeyParaPosibleAtras(
			Long lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras) {
		this.lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras = lIdParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroFormularioIvaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroFormularioIva() {
		return sUltimaBusquedaParametroFormularioIva;
	}

	public void setsUltimaBusquedaParametroFormularioIva(String sUltimaBusquedaParametroFormularioIva) {
		this.sUltimaBusquedaParametroFormularioIva = sUltimaBusquedaParametroFormularioIva;
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
    
	public Long getid_tipo_parametro_formulario_iva() {
		return this.id_tipo_parametro_formulario_iva;
	}
    
	public Long getid_grupo_parametro_formulario_iva() {
		return this.id_grupo_parametro_formulario_iva;
	}
    
	public Long getid_sub_grupo_parametro_formulario_iva() {
		return this.id_sub_grupo_parametro_formulario_iva;
	}
    
	public Long getid_cuenta_contable1() {
		return this.id_cuenta_contable1;
	}
    
	public Long getid_cuenta_contable2() {
		return this.id_cuenta_contable2;
	}
    
	public Long getid_cuenta_contable3() {
		return this.id_cuenta_contable3;
	}
    
	public Long getid_cuenta_contable4() {
		return this.id_cuenta_contable4;
	}
    
	public Long getid_cuenta_contable5() {
		return this.id_cuenta_contable5;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFormularioIva:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroFormularioIva:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_parametro_formulario_iva(Long newid_tipo_parametro_formulario_iva)throws Exception
	{
		try {
			if(this.id_tipo_parametro_formulario_iva!=newid_tipo_parametro_formulario_iva) {
				if(newid_tipo_parametro_formulario_iva==null) {
					//newid_tipo_parametro_formulario_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFormularioIva:Valor nulo no permitido en columna id_tipo_parametro_formulario_iva");
					}
				}

				this.id_tipo_parametro_formulario_iva=newid_tipo_parametro_formulario_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_parametro_formulario_iva(Long newid_grupo_parametro_formulario_iva)throws Exception
	{
		try {
			if(this.id_grupo_parametro_formulario_iva!=newid_grupo_parametro_formulario_iva) {
				if(newid_grupo_parametro_formulario_iva==null) {
					//newid_grupo_parametro_formulario_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFormularioIva:Valor nulo no permitido en columna id_grupo_parametro_formulario_iva");
					}
				}

				this.id_grupo_parametro_formulario_iva=newid_grupo_parametro_formulario_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sub_grupo_parametro_formulario_iva(Long newid_sub_grupo_parametro_formulario_iva)throws Exception
	{
		try {
			if(this.id_sub_grupo_parametro_formulario_iva!=newid_sub_grupo_parametro_formulario_iva) {
				if(newid_sub_grupo_parametro_formulario_iva==null) {
					//newid_sub_grupo_parametro_formulario_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroFormularioIva:Valor nulo no permitido en columna id_sub_grupo_parametro_formulario_iva");
					}
				}

				this.id_sub_grupo_parametro_formulario_iva=newid_sub_grupo_parametro_formulario_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable1(Long newid_cuenta_contable1) {
		if(this.id_cuenta_contable1!=newid_cuenta_contable1) {

			this.id_cuenta_contable1=newid_cuenta_contable1;
		}
	}
    
	public void setid_cuenta_contable2(Long newid_cuenta_contable2) {
		if(this.id_cuenta_contable2!=newid_cuenta_contable2) {

			this.id_cuenta_contable2=newid_cuenta_contable2;
		}
	}
    
	public void setid_cuenta_contable3(Long newid_cuenta_contable3) {
		if(this.id_cuenta_contable3!=newid_cuenta_contable3) {

			this.id_cuenta_contable3=newid_cuenta_contable3;
		}
	}
    
	public void setid_cuenta_contable4(Long newid_cuenta_contable4) {
		if(this.id_cuenta_contable4!=newid_cuenta_contable4) {

			this.id_cuenta_contable4=newid_cuenta_contable4;
		}
	}
    
	public void setid_cuenta_contable5(Long newid_cuenta_contable5) {
		if(this.id_cuenta_contable5!=newid_cuenta_contable5) {

			this.id_cuenta_contable5=newid_cuenta_contable5;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoParametroFormularioIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva = isBusquedaDesdeForeignKeySesionTipoParametroFormularioIva;
	}

	public Long getlidTipoParametroFormularioIvaActual() {
		return lidTipoParametroFormularioIvaActual;
	}

	public void setlidTipoParametroFormularioIvaActual(Long lidTipoParametroFormularioIvaActual) {
		this.lidTipoParametroFormularioIvaActual = lidTipoParametroFormularioIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva(
		Boolean isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva = isBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva;
	}

	public Long getlidGrupoParametroFormularioIvaActual() {
		return lidGrupoParametroFormularioIvaActual;
	}

	public void setlidGrupoParametroFormularioIvaActual(Long lidGrupoParametroFormularioIvaActual) {
		this.lidGrupoParametroFormularioIvaActual = lidGrupoParametroFormularioIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva(
		Boolean isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva = isBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva;
	}

	public Long getlidSubGrupoParametroFormularioIvaActual() {
		return lidSubGrupoParametroFormularioIvaActual;
	}

	public void setlidSubGrupoParametroFormularioIvaActual(Long lidSubGrupoParametroFormularioIvaActual) {
		this.lidSubGrupoParametroFormularioIvaActual = lidSubGrupoParametroFormularioIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable1() {
		return isBusquedaDesdeForeignKeySesionCuentaContable1;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable1(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable1) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable1 = isBusquedaDesdeForeignKeySesionCuentaContable1;
	}

	public Long getlidCuentaContable1Actual() {
		return lidCuentaContable1Actual;
	}

	public void setlidCuentaContable1Actual(Long lidCuentaContable1Actual) {
		this.lidCuentaContable1Actual = lidCuentaContable1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable2() {
		return isBusquedaDesdeForeignKeySesionCuentaContable2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable2 = isBusquedaDesdeForeignKeySesionCuentaContable2;
	}

	public Long getlidCuentaContable2Actual() {
		return lidCuentaContable2Actual;
	}

	public void setlidCuentaContable2Actual(Long lidCuentaContable2Actual) {
		this.lidCuentaContable2Actual = lidCuentaContable2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable3() {
		return isBusquedaDesdeForeignKeySesionCuentaContable3;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable3(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable3) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable3 = isBusquedaDesdeForeignKeySesionCuentaContable3;
	}

	public Long getlidCuentaContable3Actual() {
		return lidCuentaContable3Actual;
	}

	public void setlidCuentaContable3Actual(Long lidCuentaContable3Actual) {
		this.lidCuentaContable3Actual = lidCuentaContable3Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable4() {
		return isBusquedaDesdeForeignKeySesionCuentaContable4;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable4(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable4) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable4 = isBusquedaDesdeForeignKeySesionCuentaContable4;
	}

	public Long getlidCuentaContable4Actual() {
		return lidCuentaContable4Actual;
	}

	public void setlidCuentaContable4Actual(Long lidCuentaContable4Actual) {
		this.lidCuentaContable4Actual = lidCuentaContable4Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable5() {
		return isBusquedaDesdeForeignKeySesionCuentaContable5;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable5(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable5) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable5 = isBusquedaDesdeForeignKeySesionCuentaContable5;
	}

	public Long getlidCuentaContable5Actual() {
		return lidCuentaContable5Actual;
	}

	public void setlidCuentaContable5Actual(Long lidCuentaContable5Actual) {
		this.lidCuentaContable5Actual = lidCuentaContable5Actual;
	}
	
	
		
	
}
