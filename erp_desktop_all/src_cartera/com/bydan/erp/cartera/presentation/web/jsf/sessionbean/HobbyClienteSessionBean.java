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
public class HobbyClienteSessionBean  extends HobbyClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente;
	protected Long lIdHobbyClienteActualForeignKey;	
	
	protected Long lIdHobbyClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras;
	protected String sUltimaBusquedaHobbyCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionHobby;
	Long lidHobbyActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_hobby;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected HobbyClienteSessionBeanAdditional hobbyclienteSessionBeanAdditional=null;
	
	public HobbyClienteSessionBeanAdditional getHobbyClienteSessionBeanAdditional() {
		return this.hobbyclienteSessionBeanAdditional;
	}
	
	public void setHobbyClienteSessionBeanAdditional(HobbyClienteSessionBeanAdditional hobbyclienteSessionBeanAdditional) {
		try {
			this.hobbyclienteSessionBeanAdditional=hobbyclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public HobbyClienteSessionBean () {
		this.inicializarHobbyClienteSessionBean();
	}
	
	public void inicializarHobbyClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente=false;
		this.lIdHobbyClienteActualForeignKey=0L;
		this.lIdHobbyClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras=false;
		this.sUltimaBusquedaHobbyCliente ="";
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
		isBusquedaDesdeForeignKeySesionHobby=false;
		lidHobbyActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.id_hobby=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente= isPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente= isBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente;
	}
					
	public Long getlIdHobbyClienteActualForeignKey() {
		return lIdHobbyClienteActualForeignKey;
	}

	public void setlIdHobbyClienteActualForeignKey(
			Long lIdHobbyClienteActualForeignKey) {
		this.lIdHobbyClienteActualForeignKey = lIdHobbyClienteActualForeignKey;
	}
				    
	public Long getlIdHobbyClienteActualForeignKeyParaPosibleAtras() {
		return lIdHobbyClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdHobbyClienteActualForeignKeyParaPosibleAtras(
			Long lIdHobbyClienteActualForeignKeyParaPosibleAtras) {
		this.lIdHobbyClienteActualForeignKeyParaPosibleAtras = lIdHobbyClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyHobbyClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaHobbyCliente() {
		return sUltimaBusquedaHobbyCliente;
	}

	public void setsUltimaBusquedaHobbyCliente(String sUltimaBusquedaHobbyCliente) {
		this.sUltimaBusquedaHobbyCliente = sUltimaBusquedaHobbyCliente;
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
    
	public Long getid_hobby() {
		return this.id_hobby;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HobbyCliente:Valor nulo no permitido en columna id");
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
						System.out.println("HobbyCliente:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("HobbyCliente:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_hobby(Long newid_hobby)throws Exception
	{
		try {
			if(this.id_hobby!=newid_hobby) {
				if(newid_hobby==null) {
					//newid_hobby=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HobbyCliente:Valor nulo no permitido en columna id_hobby");
					}
				}

				this.id_hobby=newid_hobby;
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
	public Boolean getisBusquedaDesdeForeignKeySesionHobby() {
		return isBusquedaDesdeForeignKeySesionHobby;
	}

	public void setisBusquedaDesdeForeignKeySesionHobby(
		Boolean isBusquedaDesdeForeignKeySesionHobby) {
		this.isBusquedaDesdeForeignKeySesionHobby = isBusquedaDesdeForeignKeySesionHobby;
	}

	public Long getlidHobbyActual() {
		return lidHobbyActual;
	}

	public void setlidHobbyActual(Long lidHobbyActual) {
		this.lidHobbyActual = lidHobbyActual;
	}
	
	
		
	
}
