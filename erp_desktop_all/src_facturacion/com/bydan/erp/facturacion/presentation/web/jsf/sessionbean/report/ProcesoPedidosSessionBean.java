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
public class ProcesoPedidosSessionBean  extends ProcesoPedidosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos;
	protected Long lIdProcesoPedidosActualForeignKey;	
	
	protected Long lIdProcesoPedidosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras;
	protected String sUltimaBusquedaProcesoPedidos;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionZona;
	Long lidZonaActual;
	Boolean isBusquedaDesdeForeignKeySesionGrupoCliente;
	Long lidGrupoClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	
	private Long id;
	private Long id_ciudad;
	private Long id_zona;
	private Long id_grupo_cliente;
	private Long id_vendedor;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoPedidosSessionBeanAdditional procesopedidosSessionBeanAdditional=null;
	
	public ProcesoPedidosSessionBeanAdditional getProcesoPedidosSessionBeanAdditional() {
		return this.procesopedidosSessionBeanAdditional;
	}
	
	public void setProcesoPedidosSessionBeanAdditional(ProcesoPedidosSessionBeanAdditional procesopedidosSessionBeanAdditional) {
		try {
			this.procesopedidosSessionBeanAdditional=procesopedidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoPedidosSessionBean () {
		this.inicializarProcesoPedidosSessionBean();
	}
	
	public void inicializarProcesoPedidosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos=false;
		this.lIdProcesoPedidosActualForeignKey=0L;
		this.lIdProcesoPedidosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoPedidos ="";
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
		
		
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionZona=false;
		lidZonaActual=0L;
		isBusquedaDesdeForeignKeySesionGrupoCliente=false;
		lidGrupoClienteActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L; 
		
		
		
 		this.id_ciudad=-1L;
 		this.id_zona=-1L;
 		this.id_grupo_cliente=-1L;
 		this.id_vendedor=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos= isPermiteNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoPedidos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos= isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidos;
	}
					
	public Long getlIdProcesoPedidosActualForeignKey() {
		return lIdProcesoPedidosActualForeignKey;
	}

	public void setlIdProcesoPedidosActualForeignKey(
			Long lIdProcesoPedidosActualForeignKey) {
		this.lIdProcesoPedidosActualForeignKey = lIdProcesoPedidosActualForeignKey;
	}
				    
	public Long getlIdProcesoPedidosActualForeignKeyParaPosibleAtras() {
		return lIdProcesoPedidosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoPedidosActualForeignKeyParaPosibleAtras(
			Long lIdProcesoPedidosActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoPedidosActualForeignKeyParaPosibleAtras = lIdProcesoPedidosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoPedidosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoPedidos() {
		return sUltimaBusquedaProcesoPedidos;
	}

	public void setsUltimaBusquedaProcesoPedidos(String sUltimaBusquedaProcesoPedidos) {
		this.sUltimaBusquedaProcesoPedidos = sUltimaBusquedaProcesoPedidos;
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
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_zona() {
		return this.id_zona;
	}
    
	public Long getid_grupo_cliente() {
		return this.id_grupo_cliente;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoPedidos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoPedidos:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_zona(Long newid_zona)throws Exception
	{
		try {
			if(this.id_zona!=newid_zona) {
				if(newid_zona==null) {
					//newid_zona=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoPedidos:Valor nulo no permitido en columna id_zona");
					}
				}

				this.id_zona=newid_zona;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_cliente(Long newid_grupo_cliente)throws Exception
	{
		try {
			if(this.id_grupo_cliente!=newid_grupo_cliente) {
				if(newid_grupo_cliente==null) {
					//newid_grupo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoPedidos:Valor nulo no permitido en columna id_grupo_cliente");
					}
				}

				this.id_grupo_cliente=newid_grupo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor)throws Exception
	{
		try {
			if(this.id_vendedor!=newid_vendedor) {
				if(newid_vendedor==null) {
					//newid_vendedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoPedidos:Valor nulo no permitido en columna id_vendedor");
					}
				}

				this.id_vendedor=newid_vendedor;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionZona() {
		return isBusquedaDesdeForeignKeySesionZona;
	}

	public void setisBusquedaDesdeForeignKeySesionZona(
		Boolean isBusquedaDesdeForeignKeySesionZona) {
		this.isBusquedaDesdeForeignKeySesionZona = isBusquedaDesdeForeignKeySesionZona;
	}

	public Long getlidZonaActual() {
		return lidZonaActual;
	}

	public void setlidZonaActual(Long lidZonaActual) {
		this.lidZonaActual = lidZonaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoCliente() {
		return isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoCliente(
		Boolean isBusquedaDesdeForeignKeySesionGrupoCliente) {
		this.isBusquedaDesdeForeignKeySesionGrupoCliente = isBusquedaDesdeForeignKeySesionGrupoCliente;
	}

	public Long getlidGrupoClienteActual() {
		return lidGrupoClienteActual;
	}

	public void setlidGrupoClienteActual(Long lidGrupoClienteActual) {
		this.lidGrupoClienteActual = lidGrupoClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionVendedor() {
		return isBusquedaDesdeForeignKeySesionVendedor;
	}

	public void setisBusquedaDesdeForeignKeySesionVendedor(
		Boolean isBusquedaDesdeForeignKeySesionVendedor) {
		this.isBusquedaDesdeForeignKeySesionVendedor = isBusquedaDesdeForeignKeySesionVendedor;
	}

	public Long getlidVendedorActual() {
		return lidVendedorActual;
	}

	public void setlidVendedorActual(Long lidVendedorActual) {
		this.lidVendedorActual = lidVendedorActual;
	}
	
	
		
	
}
