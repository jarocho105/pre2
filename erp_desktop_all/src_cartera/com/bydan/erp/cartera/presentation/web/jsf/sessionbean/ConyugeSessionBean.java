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
public class ConyugeSessionBean  extends ConyugeSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeConyuge;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConyuge;
	protected Long lIdConyugeActualForeignKey;	
	
	protected Long lIdConyugeActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras;
	protected String sUltimaBusquedaConyuge;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	Long lidTipoIdentificacionActual;
	
	private Long id_cliente;
	private Long idvaloridentificacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ConyugeSessionBeanAdditional conyugeSessionBeanAdditional=null;
	
	public ConyugeSessionBeanAdditional getConyugeSessionBeanAdditional() {
		return this.conyugeSessionBeanAdditional;
	}
	
	public void setConyugeSessionBeanAdditional(ConyugeSessionBeanAdditional conyugeSessionBeanAdditional) {
		try {
			this.conyugeSessionBeanAdditional=conyugeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ConyugeSessionBean () {
		this.inicializarConyugeSessionBean();
	}
	
	public void inicializarConyugeSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeConyuge=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyConyuge=false;
		this.lIdConyugeActualForeignKey=0L;
		this.lIdConyugeActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras=false;
		this.sUltimaBusquedaConyuge ="";
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
		isBusquedaDesdeForeignKeySesionTipoIdentificacion=false;
		lidTipoIdentificacionActual=0L; 
		
		
		
 		this.idvaloridentificacion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeConyuge() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeConyuge;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeConyuge(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeConyuge) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeConyuge= isPermiteNavegacionHaciaForeignKeyDesdeConyuge;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge(String sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge = sNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConyuge() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConyuge;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConyuge(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConyuge) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConyuge= isBusquedaDesdeForeignKeySesionForeignKeyConyuge;
	}
					
	public Long getlIdConyugeActualForeignKey() {
		return lIdConyugeActualForeignKey;
	}

	public void setlIdConyugeActualForeignKey(
			Long lIdConyugeActualForeignKey) {
		this.lIdConyugeActualForeignKey = lIdConyugeActualForeignKey;
	}
				    
	public Long getlIdConyugeActualForeignKeyParaPosibleAtras() {
		return lIdConyugeActualForeignKeyParaPosibleAtras;
	}

	public void setlIdConyugeActualForeignKeyParaPosibleAtras(
			Long lIdConyugeActualForeignKeyParaPosibleAtras) {
		this.lIdConyugeActualForeignKeyParaPosibleAtras = lIdConyugeActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyConyugeParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaConyuge() {
		return sUltimaBusquedaConyuge;
	}

	public void setsUltimaBusquedaConyuge(String sUltimaBusquedaConyuge) {
		this.sUltimaBusquedaConyuge = sUltimaBusquedaConyuge;
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
	
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getidvaloridentificacion() {
		return this.idvaloridentificacion;
	}
	
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Conyuge:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidvaloridentificacion(Long newidvaloridentificacion)throws Exception
	{
		try {
			if(this.idvaloridentificacion!=newidvaloridentificacion) {
				if(newidvaloridentificacion==null) {
					//newidvaloridentificacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Conyuge:Valor nulo no permitido en columna idvaloridentificacion");
					}
				}

				this.idvaloridentificacion=newidvaloridentificacion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIdentificacion() {
		return isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIdentificacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion) {
		this.isBusquedaDesdeForeignKeySesionTipoIdentificacion = isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public Long getlidTipoIdentificacionActual() {
		return lidTipoIdentificacionActual;
	}

	public void setlidTipoIdentificacionActual(Long lidTipoIdentificacionActual) {
		this.lidTipoIdentificacionActual = lidTipoIdentificacionActual;
	}
	
	
		
	
}
