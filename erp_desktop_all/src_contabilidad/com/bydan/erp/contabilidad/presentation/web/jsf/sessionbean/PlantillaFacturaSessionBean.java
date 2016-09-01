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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class PlantillaFacturaSessionBean  extends PlantillaFacturaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura;
	protected Long lIdPlantillaFacturaActualForeignKey;	
	
	protected Long lIdPlantillaFacturaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras;
	protected String sUltimaBusquedaPlantillaFactura;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableAplicada;
	Long lidCuentaContableAplicadaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien;
	Long lidCuentaContableCreditoBienActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio;
	Long lidCuentaContableCreditoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien;
	Long lidTipoRetencionFuenteBienActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio;
	Long lidTipoRetencionFuenteServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	Long lidTipoRetencionIvaBienActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	Long lidTipoRetencionIvaServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	Long lidCuentaContableGastoActual;
	
	private Long id;
	private Long id_empresa;
	private String codigo;
	private String nombre;
	private Long id_cuenta_contable_aplicada;
	private Long id_cuenta_contable_credito_bien;
	private Long id_cuenta_contable_credito_servicio;
	private Long id_tipo_retencion_fuente_bien;
	private Long id_tipo_retencion_fuente_servicio;
	private Long id_tipo_retencion_iva_bien;
	private Long id_tipo_retencion_iva_servicio;
	private Long id_cuenta_contable_gasto;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PlantillaFacturaSessionBeanAdditional plantillafacturaSessionBeanAdditional=null;
	
	public PlantillaFacturaSessionBeanAdditional getPlantillaFacturaSessionBeanAdditional() {
		return this.plantillafacturaSessionBeanAdditional;
	}
	
	public void setPlantillaFacturaSessionBeanAdditional(PlantillaFacturaSessionBeanAdditional plantillafacturaSessionBeanAdditional) {
		try {
			this.plantillafacturaSessionBeanAdditional=plantillafacturaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PlantillaFacturaSessionBean () {
		this.inicializarPlantillaFacturaSessionBean();
	}
	
	public void inicializarPlantillaFacturaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura=false;
		this.lIdPlantillaFacturaActualForeignKey=0L;
		this.lIdPlantillaFacturaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras=false;
		this.sUltimaBusquedaPlantillaFactura ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableAplicada=false;
		lidCuentaContableAplicadaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien=false;
		lidCuentaContableCreditoBienActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio=false;
		lidCuentaContableCreditoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien=false;
		lidTipoRetencionFuenteBienActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio=false;
		lidTipoRetencionFuenteServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien=false;
		lidTipoRetencionIvaBienActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio=false;
		lidTipoRetencionIvaServicioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableGasto=false;
		lidCuentaContableGastoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_cuenta_contable_aplicada=null;
 		this.id_cuenta_contable_credito_bien=null;
 		this.id_cuenta_contable_credito_servicio=null;
 		this.id_tipo_retencion_fuente_bien=null;
 		this.id_tipo_retencion_fuente_servicio=null;
 		this.id_tipo_retencion_iva_bien=null;
 		this.id_tipo_retencion_iva_servicio=null;
 		this.id_cuenta_contable_gasto=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura= isPermiteNavegacionHaciaForeignKeyDesdePlantillaFactura;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura(String sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura = sNombrePaginaNavegacionHaciaForeignKeyDesdePlantillaFactura;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura= isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFactura;
	}
					
	public Long getlIdPlantillaFacturaActualForeignKey() {
		return lIdPlantillaFacturaActualForeignKey;
	}

	public void setlIdPlantillaFacturaActualForeignKey(
			Long lIdPlantillaFacturaActualForeignKey) {
		this.lIdPlantillaFacturaActualForeignKey = lIdPlantillaFacturaActualForeignKey;
	}
				    
	public Long getlIdPlantillaFacturaActualForeignKeyParaPosibleAtras() {
		return lIdPlantillaFacturaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPlantillaFacturaActualForeignKeyParaPosibleAtras(
			Long lIdPlantillaFacturaActualForeignKeyParaPosibleAtras) {
		this.lIdPlantillaFacturaActualForeignKeyParaPosibleAtras = lIdPlantillaFacturaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPlantillaFacturaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPlantillaFactura() {
		return sUltimaBusquedaPlantillaFactura;
	}

	public void setsUltimaBusquedaPlantillaFactura(String sUltimaBusquedaPlantillaFactura) {
		this.sUltimaBusquedaPlantillaFactura = sUltimaBusquedaPlantillaFactura;
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
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_cuenta_contable_aplicada() {
		return this.id_cuenta_contable_aplicada;
	}
    
	public Long getid_cuenta_contable_credito_bien() {
		return this.id_cuenta_contable_credito_bien;
	}
    
	public Long getid_cuenta_contable_credito_servicio() {
		return this.id_cuenta_contable_credito_servicio;
	}
    
	public Long getid_tipo_retencion_fuente_bien() {
		return this.id_tipo_retencion_fuente_bien;
	}
    
	public Long getid_tipo_retencion_fuente_servicio() {
		return this.id_tipo_retencion_fuente_servicio;
	}
    
	public Long getid_tipo_retencion_iva_bien() {
		return this.id_tipo_retencion_iva_bien;
	}
    
	public Long getid_tipo_retencion_iva_servicio() {
		return this.id_tipo_retencion_iva_servicio;
	}
    
	public Long getid_cuenta_contable_gasto() {
		return this.id_cuenta_contable_gasto;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlantillaFactura:Valor nulo no permitido en columna id");
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
						System.out.println("PlantillaFactura:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("PlantillaFactura:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("PlantillaFactura:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("PlantillaFactura:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("PlantillaFactura:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_aplicada(Long newid_cuenta_contable_aplicada) {
		if(this.id_cuenta_contable_aplicada!=newid_cuenta_contable_aplicada) {

			this.id_cuenta_contable_aplicada=newid_cuenta_contable_aplicada;
		}
	}
    
	public void setid_cuenta_contable_credito_bien(Long newid_cuenta_contable_credito_bien) {
		if(this.id_cuenta_contable_credito_bien!=newid_cuenta_contable_credito_bien) {

			this.id_cuenta_contable_credito_bien=newid_cuenta_contable_credito_bien;
		}
	}
    
	public void setid_cuenta_contable_credito_servicio(Long newid_cuenta_contable_credito_servicio) {
		if(this.id_cuenta_contable_credito_servicio!=newid_cuenta_contable_credito_servicio) {

			this.id_cuenta_contable_credito_servicio=newid_cuenta_contable_credito_servicio;
		}
	}
    
	public void setid_tipo_retencion_fuente_bien(Long newid_tipo_retencion_fuente_bien) {
		if(this.id_tipo_retencion_fuente_bien!=newid_tipo_retencion_fuente_bien) {

			this.id_tipo_retencion_fuente_bien=newid_tipo_retencion_fuente_bien;
		}
	}
    
	public void setid_tipo_retencion_fuente_servicio(Long newid_tipo_retencion_fuente_servicio) {
		if(this.id_tipo_retencion_fuente_servicio!=newid_tipo_retencion_fuente_servicio) {

			this.id_tipo_retencion_fuente_servicio=newid_tipo_retencion_fuente_servicio;
		}
	}
    
	public void setid_tipo_retencion_iva_bien(Long newid_tipo_retencion_iva_bien) {
		if(this.id_tipo_retencion_iva_bien!=newid_tipo_retencion_iva_bien) {

			this.id_tipo_retencion_iva_bien=newid_tipo_retencion_iva_bien;
		}
	}
    
	public void setid_tipo_retencion_iva_servicio(Long newid_tipo_retencion_iva_servicio) {
		if(this.id_tipo_retencion_iva_servicio!=newid_tipo_retencion_iva_servicio) {

			this.id_tipo_retencion_iva_servicio=newid_tipo_retencion_iva_servicio;
		}
	}
    
	public void setid_cuenta_contable_gasto(Long newid_cuenta_contable_gasto) {
		if(this.id_cuenta_contable_gasto!=newid_cuenta_contable_gasto) {

			this.id_cuenta_contable_gasto=newid_cuenta_contable_gasto;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableAplicada() {
		return isBusquedaDesdeForeignKeySesionCuentaContableAplicada;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableAplicada(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableAplicada) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableAplicada = isBusquedaDesdeForeignKeySesionCuentaContableAplicada;
	}

	public Long getlidCuentaContableAplicadaActual() {
		return lidCuentaContableAplicadaActual;
	}

	public void setlidCuentaContableAplicadaActual(Long lidCuentaContableAplicadaActual) {
		this.lidCuentaContableAplicadaActual = lidCuentaContableAplicadaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoBien() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoBien(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien = isBusquedaDesdeForeignKeySesionCuentaContableCreditoBien;
	}

	public Long getlidCuentaContableCreditoBienActual() {
		return lidCuentaContableCreditoBienActual;
	}

	public void setlidCuentaContableCreditoBienActual(Long lidCuentaContableCreditoBienActual) {
		this.lidCuentaContableCreditoBienActual = lidCuentaContableCreditoBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio = isBusquedaDesdeForeignKeySesionCuentaContableCreditoServicio;
	}

	public Long getlidCuentaContableCreditoServicioActual() {
		return lidCuentaContableCreditoServicioActual;
	}

	public void setlidCuentaContableCreditoServicioActual(Long lidCuentaContableCreditoServicioActual) {
		this.lidCuentaContableCreditoServicioActual = lidCuentaContableCreditoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien = isBusquedaDesdeForeignKeySesionTipoRetencionFuenteBien;
	}

	public Long getlidTipoRetencionFuenteBienActual() {
		return lidTipoRetencionFuenteBienActual;
	}

	public void setlidTipoRetencionFuenteBienActual(Long lidTipoRetencionFuenteBienActual) {
		this.lidTipoRetencionFuenteBienActual = lidTipoRetencionFuenteBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio = isBusquedaDesdeForeignKeySesionTipoRetencionFuenteServicio;
	}

	public Long getlidTipoRetencionFuenteServicioActual() {
		return lidTipoRetencionFuenteServicioActual;
	}

	public void setlidTipoRetencionFuenteServicioActual(Long lidTipoRetencionFuenteServicioActual) {
		this.lidTipoRetencionFuenteServicioActual = lidTipoRetencionFuenteServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaBien() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaBien(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien = isBusquedaDesdeForeignKeySesionTipoRetencionIvaBien;
	}

	public Long getlidTipoRetencionIvaBienActual() {
		return lidTipoRetencionIvaBienActual;
	}

	public void setlidTipoRetencionIvaBienActual(Long lidTipoRetencionIvaBienActual) {
		this.lidTipoRetencionIvaBienActual = lidTipoRetencionIvaBienActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio = isBusquedaDesdeForeignKeySesionTipoRetencionIvaServicio;
	}

	public Long getlidTipoRetencionIvaServicioActual() {
		return lidTipoRetencionIvaServicioActual;
	}

	public void setlidTipoRetencionIvaServicioActual(Long lidTipoRetencionIvaServicioActual) {
		this.lidTipoRetencionIvaServicioActual = lidTipoRetencionIvaServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableGasto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableGasto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableGasto = isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public Long getlidCuentaContableGastoActual() {
		return lidCuentaContableGastoActual;
	}

	public void setlidCuentaContableGastoActual(Long lidCuentaContableGastoActual) {
		this.lidCuentaContableGastoActual = lidCuentaContableGastoActual;
	}
	
	
		
	
}
