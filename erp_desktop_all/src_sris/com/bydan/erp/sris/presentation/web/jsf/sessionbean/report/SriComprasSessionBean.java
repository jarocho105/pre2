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
package com.bydan.erp.sris.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.sris.business.entity.*;

@SuppressWarnings("unused")
public class SriComprasSessionBean  extends SriComprasSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSriCompras;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySriCompras;
	protected Long lIdSriComprasActualForeignKey;	
	
	protected Long lIdSriComprasActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras;
	protected String sUltimaBusquedaSriCompras;
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
	Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	Long lidPeriodoDeclaraActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIva;
	Long lidTipoIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	Long lidTipoRetencionIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	Long lidTipoRetencionIvaPrestaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_periodo_declara;
	private Long id_cliente;
	private String ruc;
	private Long id_tipo_iva;
	private Long id_tipo_retencion_iva;
	private Long id_tipo_retencion_iva_presta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SriComprasSessionBeanAdditional sricomprasSessionBeanAdditional=null;
	
	public SriComprasSessionBeanAdditional getSriComprasSessionBeanAdditional() {
		return this.sricomprasSessionBeanAdditional;
	}
	
	public void setSriComprasSessionBeanAdditional(SriComprasSessionBeanAdditional sricomprasSessionBeanAdditional) {
		try {
			this.sricomprasSessionBeanAdditional=sricomprasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SriComprasSessionBean () {
		this.inicializarSriComprasSessionBean();
	}
	
	public void inicializarSriComprasSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSriCompras=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySriCompras=false;
		this.lIdSriComprasActualForeignKey=0L;
		this.lIdSriComprasActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras=false;
		this.sUltimaBusquedaSriCompras ="";
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
		isBusquedaDesdeForeignKeySesionPeriodoDeclara=false;
		lidPeriodoDeclaraActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIva=false;
		lidTipoIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva=false;
		lidTipoRetencionIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta=false;
		lidTipoRetencionIvaPrestaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_periodo_declara=-1L;
 		this.id_cliente=-1L;
 		this.ruc="";
 		this.id_tipo_iva=-1L;
 		this.id_tipo_retencion_iva=-1L;
 		this.id_tipo_retencion_iva_presta=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSriCompras() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSriCompras;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSriCompras(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSriCompras) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSriCompras= isPermiteNavegacionHaciaForeignKeyDesdeSriCompras;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras = sNombrePaginaNavegacionHaciaForeignKeyDesdeSriCompras;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySriCompras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySriCompras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySriCompras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySriCompras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySriCompras= isBusquedaDesdeForeignKeySesionForeignKeySriCompras;
	}
					
	public Long getlIdSriComprasActualForeignKey() {
		return lIdSriComprasActualForeignKey;
	}

	public void setlIdSriComprasActualForeignKey(
			Long lIdSriComprasActualForeignKey) {
		this.lIdSriComprasActualForeignKey = lIdSriComprasActualForeignKey;
	}
				    
	public Long getlIdSriComprasActualForeignKeyParaPosibleAtras() {
		return lIdSriComprasActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSriComprasActualForeignKeyParaPosibleAtras(
			Long lIdSriComprasActualForeignKeyParaPosibleAtras) {
		this.lIdSriComprasActualForeignKeyParaPosibleAtras = lIdSriComprasActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySriComprasParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSriCompras() {
		return sUltimaBusquedaSriCompras;
	}

	public void setsUltimaBusquedaSriCompras(String sUltimaBusquedaSriCompras) {
		this.sUltimaBusquedaSriCompras = sUltimaBusquedaSriCompras;
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
    
	public Long getid_periodo_declara() {
		return this.id_periodo_declara;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public Long getid_tipo_iva() {
		return this.id_tipo_iva;
	}
    
	public Long getid_tipo_retencion_iva() {
		return this.id_tipo_retencion_iva;
	}
    
	public Long getid_tipo_retencion_iva_presta() {
		return this.id_tipo_retencion_iva_presta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna id");
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
						System.out.println("SriCompras:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo_declara(Long newid_periodo_declara)throws Exception
	{
		try {
			if(this.id_periodo_declara!=newid_periodo_declara) {
				if(newid_periodo_declara==null) {
					//newid_periodo_declara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna id_periodo_declara");
					}
				}

				this.id_periodo_declara=newid_periodo_declara;
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
						System.out.println("SriCompras:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setruc(String newruc)throws Exception
	{
		try {
			if(this.ruc!=newruc) {
				if(newruc==null) {
					//newruc="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>20) {
					newruc=newruc.substring(0,18);
					System.out.println("SriCompras:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ruc");
				}

				this.ruc=newruc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_iva(Long newid_tipo_iva)throws Exception
	{
		try {
			if(this.id_tipo_iva!=newid_tipo_iva) {
				if(newid_tipo_iva==null) {
					//newid_tipo_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna id_tipo_iva");
					}
				}

				this.id_tipo_iva=newid_tipo_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva(Long newid_tipo_retencion_iva)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva!=newid_tipo_retencion_iva) {
				if(newid_tipo_retencion_iva==null) {
					//newid_tipo_retencion_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna id_tipo_retencion_iva");
					}
				}

				this.id_tipo_retencion_iva=newid_tipo_retencion_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva_presta(Long newid_tipo_retencion_iva_presta)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva_presta!=newid_tipo_retencion_iva_presta) {
				if(newid_tipo_retencion_iva_presta==null) {
					//newid_tipo_retencion_iva_presta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SriCompras:Valor nulo no permitido en columna id_tipo_retencion_iva_presta");
					}
				}

				this.id_tipo_retencion_iva_presta=newid_tipo_retencion_iva_presta;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodoDeclara() {
		return isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodoDeclara(
		Boolean isBusquedaDesdeForeignKeySesionPeriodoDeclara) {
		this.isBusquedaDesdeForeignKeySesionPeriodoDeclara = isBusquedaDesdeForeignKeySesionPeriodoDeclara;
	}

	public Long getlidPeriodoDeclaraActual() {
		return lidPeriodoDeclaraActual;
	}

	public void setlidPeriodoDeclaraActual(Long lidPeriodoDeclaraActual) {
		this.lidPeriodoDeclaraActual = lidPeriodoDeclaraActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIva() {
		return isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoIva) {
		this.isBusquedaDesdeForeignKeySesionTipoIva = isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public Long getlidTipoIvaActual() {
		return lidTipoIvaActual;
	}

	public void setlidTipoIvaActual(Long lidTipoIvaActual) {
		this.lidTipoIvaActual = lidTipoIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIva() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIva = isBusquedaDesdeForeignKeySesionTipoRetencionIva;
	}

	public Long getlidTipoRetencionIvaActual() {
		return lidTipoRetencionIvaActual;
	}

	public void setlidTipoRetencionIvaActual(Long lidTipoRetencionIvaActual) {
		this.lidTipoRetencionIvaActual = lidTipoRetencionIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta = isBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta;
	}

	public Long getlidTipoRetencionIvaPrestaActual() {
		return lidTipoRetencionIvaPrestaActual;
	}

	public void setlidTipoRetencionIvaPrestaActual(Long lidTipoRetencionIvaPrestaActual) {
		this.lidTipoRetencionIvaPrestaActual = lidTipoRetencionIvaPrestaActual;
	}
	
	
		
	
}
