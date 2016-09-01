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
public class EstadoClienteSessionBean  extends EstadoClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente;
	protected Long lIdEstadoClienteActualForeignKey;	
	
	protected Long lIdEstadoClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras;
	protected String sUltimaBusquedaEstadoCliente;
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
	
	
	
	private Long id;
	private String codigo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EstadoClienteSessionBeanAdditional estadoclienteSessionBeanAdditional=null;
	
	public EstadoClienteSessionBeanAdditional getEstadoClienteSessionBeanAdditional() {
		return this.estadoclienteSessionBeanAdditional;
	}
	
	public void setEstadoClienteSessionBeanAdditional(EstadoClienteSessionBeanAdditional estadoclienteSessionBeanAdditional) {
		try {
			this.estadoclienteSessionBeanAdditional=estadoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EstadoClienteSessionBean () {
		this.inicializarEstadoClienteSessionBean();
	}
	
	public void inicializarEstadoClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente=false;
		this.lIdEstadoClienteActualForeignKey=0L;
		this.lIdEstadoClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras=false;
		this.sUltimaBusquedaEstadoCliente ="";
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
		
		 
		
		
		
 		this.codigo="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente= isPermiteNavegacionHaciaForeignKeyDesdeEstadoCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeEstadoCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente= isBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente;
	}
					
	public Long getlIdEstadoClienteActualForeignKey() {
		return lIdEstadoClienteActualForeignKey;
	}

	public void setlIdEstadoClienteActualForeignKey(
			Long lIdEstadoClienteActualForeignKey) {
		this.lIdEstadoClienteActualForeignKey = lIdEstadoClienteActualForeignKey;
	}
				    
	public Long getlIdEstadoClienteActualForeignKeyParaPosibleAtras() {
		return lIdEstadoClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEstadoClienteActualForeignKeyParaPosibleAtras(
			Long lIdEstadoClienteActualForeignKeyParaPosibleAtras) {
		this.lIdEstadoClienteActualForeignKeyParaPosibleAtras = lIdEstadoClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEstadoClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEstadoCliente() {
		return sUltimaBusquedaEstadoCliente;
	}

	public void setsUltimaBusquedaEstadoCliente(String sUltimaBusquedaEstadoCliente) {
		this.sUltimaBusquedaEstadoCliente = sUltimaBusquedaEstadoCliente;
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
    
	public String getcodigo() {
		return this.codigo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("EstadoCliente:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("EstadoCliente:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("EstadoCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
