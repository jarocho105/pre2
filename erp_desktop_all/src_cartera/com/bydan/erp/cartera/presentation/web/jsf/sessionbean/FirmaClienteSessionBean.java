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
public class FirmaClienteSessionBean  extends FirmaClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente;
	protected Long lIdFirmaClienteActualForeignKey;	
	
	protected Long lIdFirmaClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras;
	protected String sUltimaBusquedaFirmaCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoImagen;
	Long lidTipoImagenActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_tipo_imagen;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FirmaClienteSessionBeanAdditional firmaclienteSessionBeanAdditional=null;
	
	public FirmaClienteSessionBeanAdditional getFirmaClienteSessionBeanAdditional() {
		return this.firmaclienteSessionBeanAdditional;
	}
	
	public void setFirmaClienteSessionBeanAdditional(FirmaClienteSessionBeanAdditional firmaclienteSessionBeanAdditional) {
		try {
			this.firmaclienteSessionBeanAdditional=firmaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FirmaClienteSessionBean () {
		this.inicializarFirmaClienteSessionBean();
	}
	
	public void inicializarFirmaClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente=false;
		this.lIdFirmaClienteActualForeignKey=0L;
		this.lIdFirmaClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras=false;
		this.sUltimaBusquedaFirmaCliente ="";
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
		isBusquedaDesdeForeignKeySesionTipoImagen=false;
		lidTipoImagenActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.id_tipo_imagen=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente= isPermiteNavegacionHaciaForeignKeyDesdeFirmaCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeFirmaCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente= isBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente;
	}
					
	public Long getlIdFirmaClienteActualForeignKey() {
		return lIdFirmaClienteActualForeignKey;
	}

	public void setlIdFirmaClienteActualForeignKey(
			Long lIdFirmaClienteActualForeignKey) {
		this.lIdFirmaClienteActualForeignKey = lIdFirmaClienteActualForeignKey;
	}
				    
	public Long getlIdFirmaClienteActualForeignKeyParaPosibleAtras() {
		return lIdFirmaClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFirmaClienteActualForeignKeyParaPosibleAtras(
			Long lIdFirmaClienteActualForeignKeyParaPosibleAtras) {
		this.lIdFirmaClienteActualForeignKeyParaPosibleAtras = lIdFirmaClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFirmaClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFirmaCliente() {
		return sUltimaBusquedaFirmaCliente;
	}

	public void setsUltimaBusquedaFirmaCliente(String sUltimaBusquedaFirmaCliente) {
		this.sUltimaBusquedaFirmaCliente = sUltimaBusquedaFirmaCliente;
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
    
	public Long getid_tipo_imagen() {
		return this.id_tipo_imagen;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FirmaCliente:Valor nulo no permitido en columna id");
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
						System.out.println("FirmaCliente:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FirmaCliente:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_imagen(Long newid_tipo_imagen)throws Exception
	{
		try {
			if(this.id_tipo_imagen!=newid_tipo_imagen) {
				if(newid_tipo_imagen==null) {
					//newid_tipo_imagen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FirmaCliente:Valor nulo no permitido en columna id_tipo_imagen");
					}
				}

				this.id_tipo_imagen=newid_tipo_imagen;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoImagen() {
		return isBusquedaDesdeForeignKeySesionTipoImagen;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoImagen(
		Boolean isBusquedaDesdeForeignKeySesionTipoImagen) {
		this.isBusquedaDesdeForeignKeySesionTipoImagen = isBusquedaDesdeForeignKeySesionTipoImagen;
	}

	public Long getlidTipoImagenActual() {
		return lidTipoImagenActual;
	}

	public void setlidTipoImagenActual(Long lidTipoImagenActual) {
		this.lidTipoImagenActual = lidTipoImagenActual;
	}
	
	
		
	
}
