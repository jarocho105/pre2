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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class FacturasProveedoresSessionBean  extends FacturasProveedoresSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores;
	protected Long lIdFacturasProveedoresActualForeignKey;	
	
	protected Long lIdFacturasProveedoresActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras;
	protected String sUltimaBusquedaFacturasProveedores;
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
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Date fecha_emision_inicio;
	private Date fecha_emision_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FacturasProveedoresSessionBeanAdditional facturasproveedoresSessionBeanAdditional=null;
	
	public FacturasProveedoresSessionBeanAdditional getFacturasProveedoresSessionBeanAdditional() {
		return this.facturasproveedoresSessionBeanAdditional;
	}
	
	public void setFacturasProveedoresSessionBeanAdditional(FacturasProveedoresSessionBeanAdditional facturasproveedoresSessionBeanAdditional) {
		try {
			this.facturasproveedoresSessionBeanAdditional=facturasproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FacturasProveedoresSessionBean () {
		this.inicializarFacturasProveedoresSessionBean();
	}
	
	public void inicializarFacturasProveedoresSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores=false;
		this.lIdFacturasProveedoresActualForeignKey=0L;
		this.lIdFacturasProveedoresActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras=false;
		this.sUltimaBusquedaFacturasProveedores ="";
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
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.fecha_emision_inicio=new Date();
 		this.fecha_emision_fin=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores= isPermiteNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores = sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturasProveedores;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores= isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedores;
	}
					
	public Long getlIdFacturasProveedoresActualForeignKey() {
		return lIdFacturasProveedoresActualForeignKey;
	}

	public void setlIdFacturasProveedoresActualForeignKey(
			Long lIdFacturasProveedoresActualForeignKey) {
		this.lIdFacturasProveedoresActualForeignKey = lIdFacturasProveedoresActualForeignKey;
	}
				    
	public Long getlIdFacturasProveedoresActualForeignKeyParaPosibleAtras() {
		return lIdFacturasProveedoresActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFacturasProveedoresActualForeignKeyParaPosibleAtras(
			Long lIdFacturasProveedoresActualForeignKeyParaPosibleAtras) {
		this.lIdFacturasProveedoresActualForeignKeyParaPosibleAtras = lIdFacturasProveedoresActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFacturasProveedoresParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFacturasProveedores() {
		return sUltimaBusquedaFacturasProveedores;
	}

	public void setsUltimaBusquedaFacturasProveedores(String sUltimaBusquedaFacturasProveedores) {
		this.sUltimaBusquedaFacturasProveedores = sUltimaBusquedaFacturasProveedores;
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
    
	public Date getfecha_emision_inicio() {
		return this.fecha_emision_inicio;
	}
    
	public Date getfecha_emision_fin() {
		return this.fecha_emision_fin;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturasProveedores:Valor nulo no permitido en columna id");
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
						System.out.println("FacturasProveedores:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FacturasProveedores:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_inicio(Date newfecha_emision_inicio)throws Exception
	{
		try {
			if(this.fecha_emision_inicio!=newfecha_emision_inicio) {
				if(newfecha_emision_inicio==null) {
					//newfecha_emision_inicio=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturasProveedores:Valor nulo no permitido en columna fecha_emision_inicio");
					}
				}

				this.fecha_emision_inicio=newfecha_emision_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision_fin(Date newfecha_emision_fin)throws Exception
	{
		try {
			if(this.fecha_emision_fin!=newfecha_emision_fin) {
				if(newfecha_emision_fin==null) {
					//newfecha_emision_fin=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturasProveedores:Valor nulo no permitido en columna fecha_emision_fin");
					}
				}

				this.fecha_emision_fin=newfecha_emision_fin;
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
	
	
		
	
}
