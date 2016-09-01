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
public class ReferenciaComercialSessionBean  extends ReferenciaComercialSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial;
	protected Long lIdReferenciaComercialActualForeignKey;	
	
	protected Long lIdReferenciaComercialActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras;
	protected String sUltimaBusquedaReferenciaComercial;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoSectorEcono;
	Long lidTipoSectorEconoActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoValoracion;
	Long lidTipoValoracionActual;
	
	private Long id;
	private Long id_empresa;
	private Long idcliente;
	private Long idvalorclientesectoreconomico;
	private Long id_pais;
	private Long idciudad;
	private Long id_tipo_valoracion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ReferenciaComercialSessionBeanAdditional referenciacomercialSessionBeanAdditional=null;
	
	public ReferenciaComercialSessionBeanAdditional getReferenciaComercialSessionBeanAdditional() {
		return this.referenciacomercialSessionBeanAdditional;
	}
	
	public void setReferenciaComercialSessionBeanAdditional(ReferenciaComercialSessionBeanAdditional referenciacomercialSessionBeanAdditional) {
		try {
			this.referenciacomercialSessionBeanAdditional=referenciacomercialSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ReferenciaComercialSessionBean () {
		this.inicializarReferenciaComercialSessionBean();
	}
	
	public void inicializarReferenciaComercialSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial=false;
		this.lIdReferenciaComercialActualForeignKey=0L;
		this.lIdReferenciaComercialActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras=false;
		this.sUltimaBusquedaReferenciaComercial ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoSectorEcono=false;
		lidTipoSectorEconoActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoValoracion=false;
		lidTipoValoracionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.idcliente=-1L;
 		this.idvalorclientesectoreconomico=-1L;
 		this.id_pais=-1L;
 		this.idciudad=-1L;
 		this.id_tipo_valoracion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial= isPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial(String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial = sNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial= isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial;
	}
					
	public Long getlIdReferenciaComercialActualForeignKey() {
		return lIdReferenciaComercialActualForeignKey;
	}

	public void setlIdReferenciaComercialActualForeignKey(
			Long lIdReferenciaComercialActualForeignKey) {
		this.lIdReferenciaComercialActualForeignKey = lIdReferenciaComercialActualForeignKey;
	}
				    
	public Long getlIdReferenciaComercialActualForeignKeyParaPosibleAtras() {
		return lIdReferenciaComercialActualForeignKeyParaPosibleAtras;
	}

	public void setlIdReferenciaComercialActualForeignKeyParaPosibleAtras(
			Long lIdReferenciaComercialActualForeignKeyParaPosibleAtras) {
		this.lIdReferenciaComercialActualForeignKeyParaPosibleAtras = lIdReferenciaComercialActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercialParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaReferenciaComercial() {
		return sUltimaBusquedaReferenciaComercial;
	}

	public void setsUltimaBusquedaReferenciaComercial(String sUltimaBusquedaReferenciaComercial) {
		this.sUltimaBusquedaReferenciaComercial = sUltimaBusquedaReferenciaComercial;
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
    
	public Long getidcliente() {
		return this.idcliente;
	}
    
	public Long getidvalorclientesectoreconomico() {
		return this.idvalorclientesectoreconomico;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getidciudad() {
		return this.idciudad;
	}
    
	public Long getid_tipo_valoracion() {
		return this.id_tipo_valoracion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna id");
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
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna idcliente");
					}
				}

				this.idcliente=newidcliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvalorclientesectoreconomico(Long newidvalorclientesectoreconomico)throws Exception
	{
		try {
			if(this.idvalorclientesectoreconomico!=newidvalorclientesectoreconomico) {
				if(newidvalorclientesectoreconomico==null) {
					//newidvalorclientesectoreconomico=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna idvalorclientesectoreconomico");
					}
				}

				this.idvalorclientesectoreconomico=newidvalorclientesectoreconomico;
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
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna id_pais");
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
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna idciudad");
					}
				}

				this.idciudad=newidciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_valoracion(Long newid_tipo_valoracion)throws Exception
	{
		try {
			if(this.id_tipo_valoracion!=newid_tipo_valoracion) {
				if(newid_tipo_valoracion==null) {
					//newid_tipo_valoracion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReferenciaComercial:Valor nulo no permitido en columna id_tipo_valoracion");
					}
				}

				this.id_tipo_valoracion=newid_tipo_valoracion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoSectorEcono() {
		return isBusquedaDesdeForeignKeySesionTipoSectorEcono;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoSectorEcono(
		Boolean isBusquedaDesdeForeignKeySesionTipoSectorEcono) {
		this.isBusquedaDesdeForeignKeySesionTipoSectorEcono = isBusquedaDesdeForeignKeySesionTipoSectorEcono;
	}

	public Long getlidTipoSectorEconoActual() {
		return lidTipoSectorEconoActual;
	}

	public void setlidTipoSectorEconoActual(Long lidTipoSectorEconoActual) {
		this.lidTipoSectorEconoActual = lidTipoSectorEconoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoValoracion() {
		return isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoValoracion(
		Boolean isBusquedaDesdeForeignKeySesionTipoValoracion) {
		this.isBusquedaDesdeForeignKeySesionTipoValoracion = isBusquedaDesdeForeignKeySesionTipoValoracion;
	}

	public Long getlidTipoValoracionActual() {
		return lidTipoValoracionActual;
	}

	public void setlidTipoValoracionActual(Long lidTipoValoracionActual) {
		this.lidTipoValoracionActual = lidTipoValoracionActual;
	}
	
	
		
	
}
