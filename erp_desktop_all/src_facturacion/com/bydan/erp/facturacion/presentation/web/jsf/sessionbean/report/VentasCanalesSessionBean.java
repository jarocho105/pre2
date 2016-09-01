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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class VentasCanalesSessionBean  extends VentasCanalesSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales;
	protected Long lIdVentasCanalesActualForeignKey;	
	
	protected Long lIdVentasCanalesActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras;
	protected String sUltimaBusquedaVentasCanales;
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
	Boolean isBusquedaDesdeForeignKeySesionTituloCliente;
	Long lidTituloClienteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_titulo_cliente;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected VentasCanalesSessionBeanAdditional ventascanalesSessionBeanAdditional=null;
	
	public VentasCanalesSessionBeanAdditional getVentasCanalesSessionBeanAdditional() {
		return this.ventascanalesSessionBeanAdditional;
	}
	
	public void setVentasCanalesSessionBeanAdditional(VentasCanalesSessionBeanAdditional ventascanalesSessionBeanAdditional) {
		try {
			this.ventascanalesSessionBeanAdditional=ventascanalesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public VentasCanalesSessionBean () {
		this.inicializarVentasCanalesSessionBean();
	}
	
	public void inicializarVentasCanalesSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales=false;
		this.lIdVentasCanalesActualForeignKey=0L;
		this.lIdVentasCanalesActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras=false;
		this.sUltimaBusquedaVentasCanales ="";
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
		isBusquedaDesdeForeignKeySesionTituloCliente=false;
		lidTituloClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_titulo_cliente=-1L;
 		this.fecha_emision_desde=new Date();
 		this.fecha_emision_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeVentasCanales() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeVentasCanales(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales= isPermiteNavegacionHaciaForeignKeyDesdeVentasCanales;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales(String sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales = sNombrePaginaNavegacionHaciaForeignKeyDesdeVentasCanales;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVentasCanales() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVentasCanales(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales= isBusquedaDesdeForeignKeySesionForeignKeyVentasCanales;
	}
					
	public Long getlIdVentasCanalesActualForeignKey() {
		return lIdVentasCanalesActualForeignKey;
	}

	public void setlIdVentasCanalesActualForeignKey(
			Long lIdVentasCanalesActualForeignKey) {
		this.lIdVentasCanalesActualForeignKey = lIdVentasCanalesActualForeignKey;
	}
				    
	public Long getlIdVentasCanalesActualForeignKeyParaPosibleAtras() {
		return lIdVentasCanalesActualForeignKeyParaPosibleAtras;
	}

	public void setlIdVentasCanalesActualForeignKeyParaPosibleAtras(
			Long lIdVentasCanalesActualForeignKeyParaPosibleAtras) {
		this.lIdVentasCanalesActualForeignKeyParaPosibleAtras = lIdVentasCanalesActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyVentasCanalesParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaVentasCanales() {
		return sUltimaBusquedaVentasCanales;
	}

	public void setsUltimaBusquedaVentasCanales(String sUltimaBusquedaVentasCanales) {
		this.sUltimaBusquedaVentasCanales = sUltimaBusquedaVentasCanales;
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
    
	public Long getid_titulo_cliente() {
		return this.id_titulo_cliente;
	}
    
	public Date getfecha_emision_desde() {
		return this.fecha_emision_desde;
	}
    
	public Date getfecha_emision_hasta() {
		return this.fecha_emision_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VentasCanales:Valor nulo no permitido en columna id");
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
						System.out.println("VentasCanales:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_titulo_cliente(Long newid_titulo_cliente)throws Exception
	{
		try {
			if(this.id_titulo_cliente!=newid_titulo_cliente) {
				if(newid_titulo_cliente==null) {
					//newid_titulo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("VentasCanales:Valor nulo no permitido en columna id_titulo_cliente");
					}
				}

				this.id_titulo_cliente=newid_titulo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_desde(Date newfecha_emision_desde)throws Exception
	{
		try {
			if(this.fecha_emision_desde!=newfecha_emision_desde) {
				if(newfecha_emision_desde==null) {
					//newfecha_emision_desde=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("VentasCanales:Valor nulo no permitido en columna fecha_emision_desde");
					}
				}

				this.fecha_emision_desde=newfecha_emision_desde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_hasta(Date newfecha_emision_hasta)throws Exception
	{
		try {
			if(this.fecha_emision_hasta!=newfecha_emision_hasta) {
				if(newfecha_emision_hasta==null) {
					//newfecha_emision_hasta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("VentasCanales:Valor nulo no permitido en columna fecha_emision_hasta");
					}
				}

				this.fecha_emision_hasta=newfecha_emision_hasta;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTituloCliente() {
		return isBusquedaDesdeForeignKeySesionTituloCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionTituloCliente(
		Boolean isBusquedaDesdeForeignKeySesionTituloCliente) {
		this.isBusquedaDesdeForeignKeySesionTituloCliente = isBusquedaDesdeForeignKeySesionTituloCliente;
	}

	public Long getlidTituloClienteActual() {
		return lidTituloClienteActual;
	}

	public void setlidTituloClienteActual(Long lidTituloClienteActual) {
		this.lidTituloClienteActual = lidTituloClienteActual;
	}
	
	
		
	
}
