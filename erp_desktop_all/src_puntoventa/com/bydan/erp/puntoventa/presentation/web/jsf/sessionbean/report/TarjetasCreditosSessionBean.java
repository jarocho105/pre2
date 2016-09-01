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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class TarjetasCreditosSessionBean  extends TarjetasCreditosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos;
	protected Long lIdTarjetasCreditosActualForeignKey;	
	
	protected Long lIdTarjetasCreditosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras;
	protected String sUltimaBusquedaTarjetasCreditos;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTarjetaCredito;
	Long lidTarjetaCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tarjeta_credito;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TarjetasCreditosSessionBeanAdditional tarjetascreditosSessionBeanAdditional=null;
	
	public TarjetasCreditosSessionBeanAdditional getTarjetasCreditosSessionBeanAdditional() {
		return this.tarjetascreditosSessionBeanAdditional;
	}
	
	public void setTarjetasCreditosSessionBeanAdditional(TarjetasCreditosSessionBeanAdditional tarjetascreditosSessionBeanAdditional) {
		try {
			this.tarjetascreditosSessionBeanAdditional=tarjetascreditosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TarjetasCreditosSessionBean () {
		this.inicializarTarjetasCreditosSessionBean();
	}
	
	public void inicializarTarjetasCreditosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos=false;
		this.lIdTarjetasCreditosActualForeignKey=0L;
		this.lIdTarjetasCreditosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras=false;
		this.sUltimaBusquedaTarjetasCreditos ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTarjetaCredito=false;
		lidTarjetaCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tarjeta_credito=-1L;
 		this.fecha_inicio=new Date();
 		this.fecha_fin=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos= isPermiteNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos = sNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetasCreditos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos= isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditos;
	}
					
	public Long getlIdTarjetasCreditosActualForeignKey() {
		return lIdTarjetasCreditosActualForeignKey;
	}

	public void setlIdTarjetasCreditosActualForeignKey(
			Long lIdTarjetasCreditosActualForeignKey) {
		this.lIdTarjetasCreditosActualForeignKey = lIdTarjetasCreditosActualForeignKey;
	}
				    
	public Long getlIdTarjetasCreditosActualForeignKeyParaPosibleAtras() {
		return lIdTarjetasCreditosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTarjetasCreditosActualForeignKeyParaPosibleAtras(
			Long lIdTarjetasCreditosActualForeignKeyParaPosibleAtras) {
		this.lIdTarjetasCreditosActualForeignKeyParaPosibleAtras = lIdTarjetasCreditosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTarjetasCreditosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTarjetasCreditos() {
		return sUltimaBusquedaTarjetasCreditos;
	}

	public void setsUltimaBusquedaTarjetasCreditos(String sUltimaBusquedaTarjetasCreditos) {
		this.sUltimaBusquedaTarjetasCreditos = sUltimaBusquedaTarjetasCreditos;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_tarjeta_credito() {
		return this.id_tarjeta_credito;
	}
    
	public Date getfecha_inicio() {
		return this.fecha_inicio;
	}
    
	public Date getfecha_fin() {
		return this.fecha_fin;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna id");
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
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tarjeta_credito(Long newid_tarjeta_credito)throws Exception
	{
		try {
			if(this.id_tarjeta_credito!=newid_tarjeta_credito) {
				if(newid_tarjeta_credito==null) {
					//newid_tarjeta_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna id_tarjeta_credito");
					}
				}

				this.id_tarjeta_credito=newid_tarjeta_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_inicio(Date newfecha_inicio)throws Exception
	{
		try {
			if(this.fecha_inicio!=newfecha_inicio) {
				if(newfecha_inicio==null) {
					//newfecha_inicio=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna fecha_inicio");
					}
				}

				this.fecha_inicio=newfecha_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_fin(Date newfecha_fin)throws Exception
	{
		try {
			if(this.fecha_fin!=newfecha_fin) {
				if(newfecha_fin==null) {
					//newfecha_fin=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("TarjetasCreditos:Valor nulo no permitido en columna fecha_fin");
					}
				}

				this.fecha_fin=newfecha_fin;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTarjetaCredito() {
		return isBusquedaDesdeForeignKeySesionTarjetaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTarjetaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTarjetaCredito) {
		this.isBusquedaDesdeForeignKeySesionTarjetaCredito = isBusquedaDesdeForeignKeySesionTarjetaCredito;
	}

	public Long getlidTarjetaCreditoActual() {
		return lidTarjetaCreditoActual;
	}

	public void setlidTarjetaCreditoActual(Long lidTarjetaCreditoActual) {
		this.lidTarjetaCreditoActual = lidTarjetaCreditoActual;
	}
	
	
		
	
}
