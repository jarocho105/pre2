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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ListadosFormasPagosSessionBean  extends ListadosFormasPagosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos;
	protected Long lIdListadosFormasPagosActualForeignKey;	
	
	protected Long lIdListadosFormasPagosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras;
	protected String sUltimaBusquedaListadosFormasPagos;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	Long lidTipoGrupoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	
	private Long id;
	private Long id_tipo_grupo_forma_pago;
	private Long id_empresa;
	private Long id_sucursal;
	private Date fecha_desde;
	private Date fecha_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ListadosFormasPagosSessionBeanAdditional listadosformaspagosSessionBeanAdditional=null;
	
	public ListadosFormasPagosSessionBeanAdditional getListadosFormasPagosSessionBeanAdditional() {
		return this.listadosformaspagosSessionBeanAdditional;
	}
	
	public void setListadosFormasPagosSessionBeanAdditional(ListadosFormasPagosSessionBeanAdditional listadosformaspagosSessionBeanAdditional) {
		try {
			this.listadosformaspagosSessionBeanAdditional=listadosformaspagosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ListadosFormasPagosSessionBean () {
		this.inicializarListadosFormasPagosSessionBean();
	}
	
	public void inicializarListadosFormasPagosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos=false;
		this.lIdListadosFormasPagosActualForeignKey=0L;
		this.lIdListadosFormasPagosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras=false;
		this.sUltimaBusquedaListadosFormasPagos ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago=false;
		lidTipoGrupoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L; 
		
		
		
 		this.id_tipo_grupo_forma_pago=-1L;
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.fecha_desde=new Date();
 		this.fecha_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos= isPermiteNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos = sNombrePaginaNavegacionHaciaForeignKeyDesdeListadosFormasPagos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos= isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagos;
	}
					
	public Long getlIdListadosFormasPagosActualForeignKey() {
		return lIdListadosFormasPagosActualForeignKey;
	}

	public void setlIdListadosFormasPagosActualForeignKey(
			Long lIdListadosFormasPagosActualForeignKey) {
		this.lIdListadosFormasPagosActualForeignKey = lIdListadosFormasPagosActualForeignKey;
	}
				    
	public Long getlIdListadosFormasPagosActualForeignKeyParaPosibleAtras() {
		return lIdListadosFormasPagosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdListadosFormasPagosActualForeignKeyParaPosibleAtras(
			Long lIdListadosFormasPagosActualForeignKeyParaPosibleAtras) {
		this.lIdListadosFormasPagosActualForeignKeyParaPosibleAtras = lIdListadosFormasPagosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyListadosFormasPagosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaListadosFormasPagos() {
		return sUltimaBusquedaListadosFormasPagos;
	}

	public void setsUltimaBusquedaListadosFormasPagos(String sUltimaBusquedaListadosFormasPagos) {
		this.sUltimaBusquedaListadosFormasPagos = sUltimaBusquedaListadosFormasPagos;
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
    
	public Long getid_tipo_grupo_forma_pago() {
		return this.id_tipo_grupo_forma_pago;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Date getfecha_desde() {
		return this.fecha_desde;
	}
    
	public Date getfecha_hasta() {
		return this.fecha_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grupo_forma_pago(Long newid_tipo_grupo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_grupo_forma_pago!=newid_tipo_grupo_forma_pago) {
				if(newid_tipo_grupo_forma_pago==null) {
					//newid_tipo_grupo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna id_tipo_grupo_forma_pago");
					}
				}

				this.id_tipo_grupo_forma_pago=newid_tipo_grupo_forma_pago;
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
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_desde(Date newfecha_desde)throws Exception
	{
		try {
			if(this.fecha_desde!=newfecha_desde) {
				if(newfecha_desde==null) {
					//newfecha_desde=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna fecha_desde");
					}
				}

				this.fecha_desde=newfecha_desde;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_hasta(Date newfecha_hasta)throws Exception
	{
		try {
			if(this.fecha_hasta!=newfecha_hasta) {
				if(newfecha_hasta==null) {
					//newfecha_hasta=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ListadosFormasPagos:Valor nulo no permitido en columna fecha_hasta");
					}
				}

				this.fecha_hasta=newfecha_hasta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago = isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public Long getlidTipoGrupoFormaPagoActual() {
		return lidTipoGrupoFormaPagoActual;
	}

	public void setlidTipoGrupoFormaPagoActual(Long lidTipoGrupoFormaPagoActual) {
		this.lidTipoGrupoFormaPagoActual = lidTipoGrupoFormaPagoActual;
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
	
	
		
	
}
