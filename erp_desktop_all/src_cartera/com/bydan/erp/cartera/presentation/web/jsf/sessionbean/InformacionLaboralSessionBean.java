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
public class InformacionLaboralSessionBean  extends InformacionLaboralSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral;
	protected Long lIdInformacionLaboralActualForeignKey;	
	
	protected Long lIdInformacionLaboralActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras;
	protected String sUltimaBusquedaInformacionLaboral;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEmpresa;
	Long lidTipoEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRelaLabo;
	Long lidTipoRelaLaboActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAreaLabo;
	Long lidTipoAreaLaboActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	Long lidTipoCargoLaboActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	
	private Long id;
	private Long idcliente;
	private Long idvalorempresa;
	private Long idvalorclienterelacionlaboral;
	private Long idvalorclientearealaboral;
	private Long idvalorclientecargolaboral;
	private Long id_pais;
	private Long idciudad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected InformacionLaboralSessionBeanAdditional informacionlaboralSessionBeanAdditional=null;
	
	public InformacionLaboralSessionBeanAdditional getInformacionLaboralSessionBeanAdditional() {
		return this.informacionlaboralSessionBeanAdditional;
	}
	
	public void setInformacionLaboralSessionBeanAdditional(InformacionLaboralSessionBeanAdditional informacionlaboralSessionBeanAdditional) {
		try {
			this.informacionlaboralSessionBeanAdditional=informacionlaboralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public InformacionLaboralSessionBean () {
		this.inicializarInformacionLaboralSessionBean();
	}
	
	public void inicializarInformacionLaboralSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral=false;
		this.lIdInformacionLaboralActualForeignKey=0L;
		this.lIdInformacionLaboralActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras=false;
		this.sUltimaBusquedaInformacionLaboral ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEmpresa=false;
		lidTipoEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRelaLabo=false;
		lidTipoRelaLaboActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAreaLabo=false;
		lidTipoAreaLaboActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCargoLabo=false;
		lidTipoCargoLaboActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L; 
		
		
		
 		this.idcliente=-1L;
 		this.idvalorempresa=-1L;
 		this.idvalorclienterelacionlaboral=-1L;
 		this.idvalorclientearealaboral=-1L;
 		this.idvalorclientecargolaboral=-1L;
 		this.id_pais=-1L;
 		this.idciudad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral= isPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral(String sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral = sNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral() {
		return isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral= isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboral;
	}
					
	public Long getlIdInformacionLaboralActualForeignKey() {
		return lIdInformacionLaboralActualForeignKey;
	}

	public void setlIdInformacionLaboralActualForeignKey(
			Long lIdInformacionLaboralActualForeignKey) {
		this.lIdInformacionLaboralActualForeignKey = lIdInformacionLaboralActualForeignKey;
	}
				    
	public Long getlIdInformacionLaboralActualForeignKeyParaPosibleAtras() {
		return lIdInformacionLaboralActualForeignKeyParaPosibleAtras;
	}

	public void setlIdInformacionLaboralActualForeignKeyParaPosibleAtras(
			Long lIdInformacionLaboralActualForeignKeyParaPosibleAtras) {
		this.lIdInformacionLaboralActualForeignKeyParaPosibleAtras = lIdInformacionLaboralActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyInformacionLaboralParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaInformacionLaboral() {
		return sUltimaBusquedaInformacionLaboral;
	}

	public void setsUltimaBusquedaInformacionLaboral(String sUltimaBusquedaInformacionLaboral) {
		this.sUltimaBusquedaInformacionLaboral = sUltimaBusquedaInformacionLaboral;
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
    
	public Long getidcliente() {
		return this.idcliente;
	}
    
	public Long getidvalorempresa() {
		return this.idvalorempresa;
	}
    
	public Long getidvalorclienterelacionlaboral() {
		return this.idvalorclienterelacionlaboral;
	}
    
	public Long getidvalorclientearealaboral() {
		return this.idvalorclientearealaboral;
	}
    
	public Long getidvalorclientecargolaboral() {
		return this.idvalorclientecargolaboral;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getidciudad() {
		return this.idciudad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidcliente(Long newidcliente)throws Exception
	{
		try {
			if(this.idcliente!=newidcliente) {
				if(newidcliente==null) {
					//newidcliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorempresa(Long newidvalorempresa)throws Exception
	{
		try {
			if(this.idvalorempresa!=newidvalorempresa) {
				if(newidvalorempresa==null) {
					//newidvalorempresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idvalorempresa");
					}
				}

				this.idvalorempresa=newidvalorempresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclienterelacionlaboral(Long newidvalorclienterelacionlaboral)throws Exception
	{
		try {
			if(this.idvalorclienterelacionlaboral!=newidvalorclienterelacionlaboral) {
				if(newidvalorclienterelacionlaboral==null) {
					//newidvalorclienterelacionlaboral=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idvalorclienterelacionlaboral");
					}
				}

				this.idvalorclienterelacionlaboral=newidvalorclienterelacionlaboral;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientearealaboral(Long newidvalorclientearealaboral)throws Exception
	{
		try {
			if(this.idvalorclientearealaboral!=newidvalorclientearealaboral) {
				if(newidvalorclientearealaboral==null) {
					//newidvalorclientearealaboral=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idvalorclientearealaboral");
					}
				}

				this.idvalorclientearealaboral=newidvalorclientearealaboral;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientecargolaboral(Long newidvalorclientecargolaboral)throws Exception
	{
		try {
			if(this.idvalorclientecargolaboral!=newidvalorclientecargolaboral) {
				if(newidvalorclientecargolaboral==null) {
					//newidvalorclientecargolaboral=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idvalorclientecargolaboral");
					}
				}

				this.idvalorclientecargolaboral=newidvalorclientecargolaboral;
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
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidciudad(Long newidciudad)throws Exception
	{
		try {
			if(this.idciudad!=newidciudad) {
				if(newidciudad==null) {
					//newidciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("InformacionLaboral:Valor nulo no permitido en columna idciudad");
					}
				}

				this.idciudad=newidciudad;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoEmpresa = isBusquedaDesdeForeignKeySesionTipoEmpresa;
	}

	public Long getlidTipoEmpresaActual() {
		return lidTipoEmpresaActual;
	}

	public void setlidTipoEmpresaActual(Long lidTipoEmpresaActual) {
		this.lidTipoEmpresaActual = lidTipoEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRelaLabo() {
		return isBusquedaDesdeForeignKeySesionTipoRelaLabo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRelaLabo(
		Boolean isBusquedaDesdeForeignKeySesionTipoRelaLabo) {
		this.isBusquedaDesdeForeignKeySesionTipoRelaLabo = isBusquedaDesdeForeignKeySesionTipoRelaLabo;
	}

	public Long getlidTipoRelaLaboActual() {
		return lidTipoRelaLaboActual;
	}

	public void setlidTipoRelaLaboActual(Long lidTipoRelaLaboActual) {
		this.lidTipoRelaLaboActual = lidTipoRelaLaboActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAreaLabo() {
		return isBusquedaDesdeForeignKeySesionTipoAreaLabo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAreaLabo(
		Boolean isBusquedaDesdeForeignKeySesionTipoAreaLabo) {
		this.isBusquedaDesdeForeignKeySesionTipoAreaLabo = isBusquedaDesdeForeignKeySesionTipoAreaLabo;
	}

	public Long getlidTipoAreaLaboActual() {
		return lidTipoAreaLaboActual;
	}

	public void setlidTipoAreaLaboActual(Long lidTipoAreaLaboActual) {
		this.lidTipoAreaLaboActual = lidTipoAreaLaboActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCargoLabo() {
		return isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCargoLabo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCargoLabo) {
		this.isBusquedaDesdeForeignKeySesionTipoCargoLabo = isBusquedaDesdeForeignKeySesionTipoCargoLabo;
	}

	public Long getlidTipoCargoLaboActual() {
		return lidTipoCargoLaboActual;
	}

	public void setlidTipoCargoLaboActual(Long lidTipoCargoLaboActual) {
		this.lidTipoCargoLaboActual = lidTipoCargoLaboActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	
	
		
	
}
