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
public class ClienteArchivoSessionBean  extends ClienteArchivoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo;
	protected Long lIdClienteArchivoActualForeignKey;	
	
	protected Long lIdClienteArchivoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras;
	protected String sUltimaBusquedaClienteArchivo;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoArchivo;
	Long lidTipoArchivoActual;
	
	private Long id;
	private Long id_cliente;
	private Long id_tipo_archivo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ClienteArchivoSessionBeanAdditional clientearchivoSessionBeanAdditional=null;
	
	public ClienteArchivoSessionBeanAdditional getClienteArchivoSessionBeanAdditional() {
		return this.clientearchivoSessionBeanAdditional;
	}
	
	public void setClienteArchivoSessionBeanAdditional(ClienteArchivoSessionBeanAdditional clientearchivoSessionBeanAdditional) {
		try {
			this.clientearchivoSessionBeanAdditional=clientearchivoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ClienteArchivoSessionBean () {
		this.inicializarClienteArchivoSessionBean();
	}
	
	public void inicializarClienteArchivoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo=false;
		this.lIdClienteArchivoActualForeignKey=0L;
		this.lIdClienteArchivoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras=false;
		this.sUltimaBusquedaClienteArchivo ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoArchivo=false;
		lidTipoArchivoActual=0L; 
		
		
		
 		this.id_cliente=-1L;
 		this.id_tipo_archivo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo= isPermiteNavegacionHaciaForeignKeyDesdeClienteArchivo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo = sNombrePaginaNavegacionHaciaForeignKeyDesdeClienteArchivo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo= isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivo;
	}
					
	public Long getlIdClienteArchivoActualForeignKey() {
		return lIdClienteArchivoActualForeignKey;
	}

	public void setlIdClienteArchivoActualForeignKey(
			Long lIdClienteArchivoActualForeignKey) {
		this.lIdClienteArchivoActualForeignKey = lIdClienteArchivoActualForeignKey;
	}
				    
	public Long getlIdClienteArchivoActualForeignKeyParaPosibleAtras() {
		return lIdClienteArchivoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdClienteArchivoActualForeignKeyParaPosibleAtras(
			Long lIdClienteArchivoActualForeignKeyParaPosibleAtras) {
		this.lIdClienteArchivoActualForeignKeyParaPosibleAtras = lIdClienteArchivoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyClienteArchivoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaClienteArchivo() {
		return sUltimaBusquedaClienteArchivo;
	}

	public void setsUltimaBusquedaClienteArchivo(String sUltimaBusquedaClienteArchivo) {
		this.sUltimaBusquedaClienteArchivo = sUltimaBusquedaClienteArchivo;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipo_archivo() {
		return this.id_tipo_archivo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ClienteArchivo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("ClienteArchivo:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_archivo(Long newid_tipo_archivo)throws Exception
	{
		try {
			if(this.id_tipo_archivo!=newid_tipo_archivo) {
				if(newid_tipo_archivo==null) {
					//newid_tipo_archivo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ClienteArchivo:Valor nulo no permitido en columna id_tipo_archivo");
					}
				}

				this.id_tipo_archivo=newid_tipo_archivo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoArchivo() {
		return isBusquedaDesdeForeignKeySesionTipoArchivo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoArchivo(
		Boolean isBusquedaDesdeForeignKeySesionTipoArchivo) {
		this.isBusquedaDesdeForeignKeySesionTipoArchivo = isBusquedaDesdeForeignKeySesionTipoArchivo;
	}

	public Long getlidTipoArchivoActual() {
		return lidTipoArchivoActual;
	}

	public void setlidTipoArchivoActual(Long lidTipoArchivoActual) {
		this.lidTipoArchivoActual = lidTipoArchivoActual;
	}
	
	
		
	
}
