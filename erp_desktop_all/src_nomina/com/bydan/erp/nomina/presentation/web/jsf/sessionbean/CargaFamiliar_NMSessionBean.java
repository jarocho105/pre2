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
public class CargaFamiliar_NMSessionBean  extends CargaFamiliar_NMSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM;
	protected Long lIdCargaFamiliar_NMActualForeignKey;	
	
	protected Long lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras;
	protected String sUltimaBusquedaCargaFamiliar_NM;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCargaFami;
	Long lidTipoCargaFamiActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGenero;
	Long lidTipoGeneroActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCivil;
	Long lidEstadoCivilActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_tipo_carga_fami;
	private Long id_tipo_genero;
	private Long id_estado_civil;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CargaFamiliar_NMSessionBeanAdditional cargafamiliar_nmSessionBeanAdditional=null;
	
	public CargaFamiliar_NMSessionBeanAdditional getCargaFamiliar_NMSessionBeanAdditional() {
		return this.cargafamiliar_nmSessionBeanAdditional;
	}
	
	public void setCargaFamiliar_NMSessionBeanAdditional(CargaFamiliar_NMSessionBeanAdditional cargafamiliar_nmSessionBeanAdditional) {
		try {
			this.cargafamiliar_nmSessionBeanAdditional=cargafamiliar_nmSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CargaFamiliar_NMSessionBean () {
		this.inicializarCargaFamiliar_NMSessionBean();
	}
	
	public void inicializarCargaFamiliar_NMSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM=false;
		this.lIdCargaFamiliar_NMActualForeignKey=0L;
		this.lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras=false;
		this.sUltimaBusquedaCargaFamiliar_NM ="";
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
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCargaFami=false;
		lidTipoCargaFamiActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGenero=false;
		lidTipoGeneroActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCivil=false;
		lidEstadoCivilActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_carga_fami=-1L;
 		this.id_tipo_genero=-1L;
 		this.id_estado_civil=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM= isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM = sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM= isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM;
	}
					
	public Long getlIdCargaFamiliar_NMActualForeignKey() {
		return lIdCargaFamiliar_NMActualForeignKey;
	}

	public void setlIdCargaFamiliar_NMActualForeignKey(
			Long lIdCargaFamiliar_NMActualForeignKey) {
		this.lIdCargaFamiliar_NMActualForeignKey = lIdCargaFamiliar_NMActualForeignKey;
	}
				    
	public Long getlIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras() {
		return lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras(
			Long lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras) {
		this.lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras = lIdCargaFamiliar_NMActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NMParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCargaFamiliar_NM() {
		return sUltimaBusquedaCargaFamiliar_NM;
	}

	public void setsUltimaBusquedaCargaFamiliar_NM(String sUltimaBusquedaCargaFamiliar_NM) {
		this.sUltimaBusquedaCargaFamiliar_NM = sUltimaBusquedaCargaFamiliar_NM;
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
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_carga_fami() {
		return this.id_tipo_carga_fami;
	}
    
	public Long getid_tipo_genero() {
		return this.id_tipo_genero;
	}
    
	public Long getid_estado_civil() {
		return this.id_estado_civil;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id");
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
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_carga_fami(Long newid_tipo_carga_fami)throws Exception
	{
		try {
			if(this.id_tipo_carga_fami!=newid_tipo_carga_fami) {
				if(newid_tipo_carga_fami==null) {
					//newid_tipo_carga_fami=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id_tipo_carga_fami");
					}
				}

				this.id_tipo_carga_fami=newid_tipo_carga_fami;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_genero(Long newid_tipo_genero)throws Exception
	{
		try {
			if(this.id_tipo_genero!=newid_tipo_genero) {
				if(newid_tipo_genero==null) {
					//newid_tipo_genero=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id_tipo_genero");
					}
				}

				this.id_tipo_genero=newid_tipo_genero;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_civil(Long newid_estado_civil)throws Exception
	{
		try {
			if(this.id_estado_civil!=newid_estado_civil) {
				if(newid_estado_civil==null) {
					//newid_estado_civil=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CargaFamiliar_NM:Valor nulo no permitido en columna id_estado_civil");
					}
				}

				this.id_estado_civil=newid_estado_civil;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCargaFami() {
		return isBusquedaDesdeForeignKeySesionTipoCargaFami;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCargaFami(
		Boolean isBusquedaDesdeForeignKeySesionTipoCargaFami) {
		this.isBusquedaDesdeForeignKeySesionTipoCargaFami = isBusquedaDesdeForeignKeySesionTipoCargaFami;
	}

	public Long getlidTipoCargaFamiActual() {
		return lidTipoCargaFamiActual;
	}

	public void setlidTipoCargaFamiActual(Long lidTipoCargaFamiActual) {
		this.lidTipoCargaFamiActual = lidTipoCargaFamiActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGenero() {
		return isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGenero(
		Boolean isBusquedaDesdeForeignKeySesionTipoGenero) {
		this.isBusquedaDesdeForeignKeySesionTipoGenero = isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public Long getlidTipoGeneroActual() {
		return lidTipoGeneroActual;
	}

	public void setlidTipoGeneroActual(Long lidTipoGeneroActual) {
		this.lidTipoGeneroActual = lidTipoGeneroActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCivil() {
		return isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCivil(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCivil) {
		this.isBusquedaDesdeForeignKeySesionEstadoCivil = isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public Long getlidEstadoCivilActual() {
		return lidEstadoCivilActual;
	}

	public void setlidEstadoCivilActual(Long lidEstadoCivilActual) {
		this.lidEstadoCivilActual = lidEstadoCivilActual;
	}
	
	
		
	
}
