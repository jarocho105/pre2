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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class ServicioSessionBean  extends ServicioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeServicio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicio;
	protected Long lIdServicioActualForeignKey;	
	
	protected Long lIdServicioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras;
	protected String sUltimaBusquedaServicio;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoServicio;
	Long lidTipoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoServicio;
	Long lidEstadoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	Long lidCuentaContableGastoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscal;
	Long lidCuentaContableFiscalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscal2;
	Long lidCuentaContableFiscal2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencion;
	Long lidCuentaContableRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencion2;
	Long lidCuentaContableRetencion2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIva;
	Long lidCuentaContableIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIva2;
	Long lidCuentaContableIva2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_servicio;
	private String codigo;
	private String nombre;
	private Long id_estado_servicio;
	private Long id_cuenta_contable_gasto;
	private Long id_cuenta_contable_fiscal;
	private Long id_cuenta_contable_fiscal2;
	private Long id_cuenta_contable_retencion;
	private Long id_cuenta_contable_retencion2;
	private Long id_cuenta_contable_iva;
	private Long id_cuenta_contable_iva2;
	private Long id_cuenta_contable_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ServicioSessionBeanAdditional servicioSessionBeanAdditional=null;
	
	public ServicioSessionBeanAdditional getServicioSessionBeanAdditional() {
		return this.servicioSessionBeanAdditional;
	}
	
	public void setServicioSessionBeanAdditional(ServicioSessionBeanAdditional servicioSessionBeanAdditional) {
		try {
			this.servicioSessionBeanAdditional=servicioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ServicioSessionBean () {
		this.inicializarServicioSessionBean();
	}
	
	public void inicializarServicioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeServicio=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicio=false;
		this.lIdServicioActualForeignKey=0L;
		this.lIdServicioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras=false;
		this.sUltimaBusquedaServicio ="";
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
		isBusquedaDesdeForeignKeySesionTipoServicio=false;
		lidTipoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoServicio=false;
		lidEstadoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableGasto=false;
		lidCuentaContableGastoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFiscal=false;
		lidCuentaContableFiscalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableFiscal2=false;
		lidCuentaContableFiscal2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableRetencion=false;
		lidCuentaContableRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableRetencion2=false;
		lidCuentaContableRetencion2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIva=false;
		lidCuentaContableIvaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIva2=false;
		lidCuentaContableIva2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_servicio=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_estado_servicio=-1L;
 		this.id_cuenta_contable_gasto=-1L;
 		this.id_cuenta_contable_fiscal=-1L;
 		this.id_cuenta_contable_fiscal2=null;
 		this.id_cuenta_contable_retencion=-1L;
 		this.id_cuenta_contable_retencion2=null;
 		this.id_cuenta_contable_iva=-1L;
 		this.id_cuenta_contable_iva2=null;
 		this.id_cuenta_contable_credito=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeServicio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeServicio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeServicio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeServicio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeServicio= isPermiteNavegacionHaciaForeignKeyDesdeServicio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeServicio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeServicio(String sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio = sNombrePaginaNavegacionHaciaForeignKeyDesdeServicio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyServicio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyServicio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicio= isBusquedaDesdeForeignKeySesionForeignKeyServicio;
	}
					
	public Long getlIdServicioActualForeignKey() {
		return lIdServicioActualForeignKey;
	}

	public void setlIdServicioActualForeignKey(
			Long lIdServicioActualForeignKey) {
		this.lIdServicioActualForeignKey = lIdServicioActualForeignKey;
	}
				    
	public Long getlIdServicioActualForeignKeyParaPosibleAtras() {
		return lIdServicioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdServicioActualForeignKeyParaPosibleAtras(
			Long lIdServicioActualForeignKeyParaPosibleAtras) {
		this.lIdServicioActualForeignKeyParaPosibleAtras = lIdServicioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyServicioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaServicio() {
		return sUltimaBusquedaServicio;
	}

	public void setsUltimaBusquedaServicio(String sUltimaBusquedaServicio) {
		this.sUltimaBusquedaServicio = sUltimaBusquedaServicio;
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
    
	public Long getid_tipo_servicio() {
		return this.id_tipo_servicio;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_estado_servicio() {
		return this.id_estado_servicio;
	}
    
	public Long getid_cuenta_contable_gasto() {
		return this.id_cuenta_contable_gasto;
	}
    
	public Long getid_cuenta_contable_fiscal() {
		return this.id_cuenta_contable_fiscal;
	}
    
	public Long getid_cuenta_contable_fiscal2() {
		return this.id_cuenta_contable_fiscal2;
	}
    
	public Long getid_cuenta_contable_retencion() {
		return this.id_cuenta_contable_retencion;
	}
    
	public Long getid_cuenta_contable_retencion2() {
		return this.id_cuenta_contable_retencion2;
	}
    
	public Long getid_cuenta_contable_iva() {
		return this.id_cuenta_contable_iva;
	}
    
	public Long getid_cuenta_contable_iva2() {
		return this.id_cuenta_contable_iva2;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id");
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
						System.out.println("Servicio:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_servicio(Long newid_tipo_servicio)throws Exception
	{
		try {
			if(this.id_tipo_servicio!=newid_tipo_servicio) {
				if(newid_tipo_servicio==null) {
					//newid_tipo_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_tipo_servicio");
					}
				}

				this.id_tipo_servicio=newid_tipo_servicio;
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
						System.out.println("Servicio:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>100) {
					newcodigo=newcodigo.substring(0,98);
					System.out.println("Servicio:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna codigo");
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
						System.out.println("Servicio:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Servicio:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_servicio(Long newid_estado_servicio)throws Exception
	{
		try {
			if(this.id_estado_servicio!=newid_estado_servicio) {
				if(newid_estado_servicio==null) {
					//newid_estado_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_estado_servicio");
					}
				}

				this.id_estado_servicio=newid_estado_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_gasto(Long newid_cuenta_contable_gasto)throws Exception
	{
		try {
			if(this.id_cuenta_contable_gasto!=newid_cuenta_contable_gasto) {
				if(newid_cuenta_contable_gasto==null) {
					//newid_cuenta_contable_gasto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_cuenta_contable_gasto");
					}
				}

				this.id_cuenta_contable_gasto=newid_cuenta_contable_gasto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_fiscal(Long newid_cuenta_contable_fiscal)throws Exception
	{
		try {
			if(this.id_cuenta_contable_fiscal!=newid_cuenta_contable_fiscal) {
				if(newid_cuenta_contable_fiscal==null) {
					//newid_cuenta_contable_fiscal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_cuenta_contable_fiscal");
					}
				}

				this.id_cuenta_contable_fiscal=newid_cuenta_contable_fiscal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_fiscal2(Long newid_cuenta_contable_fiscal2) {
		if(this.id_cuenta_contable_fiscal2!=newid_cuenta_contable_fiscal2) {

			this.id_cuenta_contable_fiscal2=newid_cuenta_contable_fiscal2;
		}
	}
    
	public void setid_cuenta_contable_retencion(Long newid_cuenta_contable_retencion)throws Exception
	{
		try {
			if(this.id_cuenta_contable_retencion!=newid_cuenta_contable_retencion) {
				if(newid_cuenta_contable_retencion==null) {
					//newid_cuenta_contable_retencion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_cuenta_contable_retencion");
					}
				}

				this.id_cuenta_contable_retencion=newid_cuenta_contable_retencion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_retencion2(Long newid_cuenta_contable_retencion2) {
		if(this.id_cuenta_contable_retencion2!=newid_cuenta_contable_retencion2) {

			this.id_cuenta_contable_retencion2=newid_cuenta_contable_retencion2;
		}
	}
    
	public void setid_cuenta_contable_iva(Long newid_cuenta_contable_iva)throws Exception
	{
		try {
			if(this.id_cuenta_contable_iva!=newid_cuenta_contable_iva) {
				if(newid_cuenta_contable_iva==null) {
					//newid_cuenta_contable_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Servicio:Valor nulo no permitido en columna id_cuenta_contable_iva");
					}
				}

				this.id_cuenta_contable_iva=newid_cuenta_contable_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_iva2(Long newid_cuenta_contable_iva2) {
		if(this.id_cuenta_contable_iva2!=newid_cuenta_contable_iva2) {

			this.id_cuenta_contable_iva2=newid_cuenta_contable_iva2;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito) {
		if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {

			this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoServicio() {
		return isBusquedaDesdeForeignKeySesionTipoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoServicio = isBusquedaDesdeForeignKeySesionTipoServicio;
	}

	public Long getlidTipoServicioActual() {
		return lidTipoServicioActual;
	}

	public void setlidTipoServicioActual(Long lidTipoServicioActual) {
		this.lidTipoServicioActual = lidTipoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoServicio() {
		return isBusquedaDesdeForeignKeySesionEstadoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoServicio(
		Boolean isBusquedaDesdeForeignKeySesionEstadoServicio) {
		this.isBusquedaDesdeForeignKeySesionEstadoServicio = isBusquedaDesdeForeignKeySesionEstadoServicio;
	}

	public Long getlidEstadoServicioActual() {
		return lidEstadoServicioActual;
	}

	public void setlidEstadoServicioActual(Long lidEstadoServicioActual) {
		this.lidEstadoServicioActual = lidEstadoServicioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFiscal() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFiscal;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFiscal(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscal) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFiscal = isBusquedaDesdeForeignKeySesionCuentaContableFiscal;
	}

	public Long getlidCuentaContableFiscalActual() {
		return lidCuentaContableFiscalActual;
	}

	public void setlidCuentaContableFiscalActual(Long lidCuentaContableFiscalActual) {
		this.lidCuentaContableFiscalActual = lidCuentaContableFiscalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableFiscal2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableFiscal2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableFiscal2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableFiscal2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableFiscal2 = isBusquedaDesdeForeignKeySesionCuentaContableFiscal2;
	}

	public Long getlidCuentaContableFiscal2Actual() {
		return lidCuentaContableFiscal2Actual;
	}

	public void setlidCuentaContableFiscal2Actual(Long lidCuentaContableFiscal2Actual) {
		this.lidCuentaContableFiscal2Actual = lidCuentaContableFiscal2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableRetencion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableRetencion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableRetencion = isBusquedaDesdeForeignKeySesionCuentaContableRetencion;
	}

	public Long getlidCuentaContableRetencionActual() {
		return lidCuentaContableRetencionActual;
	}

	public void setlidCuentaContableRetencionActual(Long lidCuentaContableRetencionActual) {
		this.lidCuentaContableRetencionActual = lidCuentaContableRetencionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableRetencion2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableRetencion2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableRetencion2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableRetencion2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableRetencion2 = isBusquedaDesdeForeignKeySesionCuentaContableRetencion2;
	}

	public Long getlidCuentaContableRetencion2Actual() {
		return lidCuentaContableRetencion2Actual;
	}

	public void setlidCuentaContableRetencion2Actual(Long lidCuentaContableRetencion2Actual) {
		this.lidCuentaContableRetencion2Actual = lidCuentaContableRetencion2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIva() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIva;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIva(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIva) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIva = isBusquedaDesdeForeignKeySesionCuentaContableIva;
	}

	public Long getlidCuentaContableIvaActual() {
		return lidCuentaContableIvaActual;
	}

	public void setlidCuentaContableIvaActual(Long lidCuentaContableIvaActual) {
		this.lidCuentaContableIvaActual = lidCuentaContableIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIva2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIva2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIva2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIva2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIva2 = isBusquedaDesdeForeignKeySesionCuentaContableIva2;
	}

	public Long getlidCuentaContableIva2Actual() {
		return lidCuentaContableIva2Actual;
	}

	public void setlidCuentaContableIva2Actual(Long lidCuentaContableIva2Actual) {
		this.lidCuentaContableIva2Actual = lidCuentaContableIva2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCredito = isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public Long getlidCuentaContableCreditoActual() {
		return lidCuentaContableCreditoActual;
	}

	public void setlidCuentaContableCreditoActual(Long lidCuentaContableCreditoActual) {
		this.lidCuentaContableCreditoActual = lidCuentaContableCreditoActual;
	}
	
	
		
	
}
