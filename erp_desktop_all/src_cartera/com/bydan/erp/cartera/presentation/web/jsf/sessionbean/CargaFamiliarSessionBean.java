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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class CargaFamiliarSessionBean  extends CargaFamiliarSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar;
	protected Long lIdCargaFamiliarActualForeignKey;	
	
	protected Long lIdCargaFamiliarActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras;
	protected String sUltimaBusquedaCargaFamiliar;
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
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCargaFami;
	Long lidTipoCargaFamiActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGenero;
	Long lidTipoGeneroActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCivil;
	Long lidEstadoCivilActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_tipo_carga_fami;
	private Long id_tipo_genero;
	private Long id_estado_civil;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CargaFamiliarSessionBeanAdditional cargafamiliarSessionBeanAdditional=null;
	
	public CargaFamiliarSessionBeanAdditional getCargaFamiliarSessionBeanAdditional() {
		return this.cargafamiliarSessionBeanAdditional;
	}
	
	public void setCargaFamiliarSessionBeanAdditional(CargaFamiliarSessionBeanAdditional cargafamiliarSessionBeanAdditional) {
		try {
			this.cargafamiliarSessionBeanAdditional=cargafamiliarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CargaFamiliarSessionBean () {
		this.inicializarCargaFamiliarSessionBean();
	}
	
	public void inicializarCargaFamiliarSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar=false;
		this.lIdCargaFamiliarActualForeignKey=0L;
		this.lIdCargaFamiliarActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras=false;
		this.sUltimaBusquedaCargaFamiliar ="";
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
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCargaFami=false;
		lidTipoCargaFamiActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGenero=false;
		lidTipoGeneroActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCivil=false;
		lidEstadoCivilActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar= isPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar = sNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar= isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar;
	}
					
	public Long getlIdCargaFamiliarActualForeignKey() {
		return lIdCargaFamiliarActualForeignKey;
	}

	public void setlIdCargaFamiliarActualForeignKey(
			Long lIdCargaFamiliarActualForeignKey) {
		this.lIdCargaFamiliarActualForeignKey = lIdCargaFamiliarActualForeignKey;
	}
				    
	public Long getlIdCargaFamiliarActualForeignKeyParaPosibleAtras() {
		return lIdCargaFamiliarActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCargaFamiliarActualForeignKeyParaPosibleAtras(
			Long lIdCargaFamiliarActualForeignKeyParaPosibleAtras) {
		this.lIdCargaFamiliarActualForeignKeyParaPosibleAtras = lIdCargaFamiliarActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliarParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCargaFamiliar() {
		return sUltimaBusquedaCargaFamiliar;
	}

	public void setsUltimaBusquedaCargaFamiliar(String sUltimaBusquedaCargaFamiliar) {
		this.sUltimaBusquedaCargaFamiliar = sUltimaBusquedaCargaFamiliar;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
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
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id");
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
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id_tipo_carga_fami");
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
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id_tipo_genero");
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
						System.out.println("CargaFamiliar:Valor nulo no permitido en columna id_estado_civil");
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
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
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
