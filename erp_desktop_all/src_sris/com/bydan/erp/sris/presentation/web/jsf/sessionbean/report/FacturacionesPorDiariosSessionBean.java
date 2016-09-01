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
public class FacturacionesPorDiariosSessionBean  extends FacturacionesPorDiariosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios;
	protected Long lIdFacturacionesPorDiariosActualForeignKey;	
	
	protected Long lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras;
	protected String sUltimaBusquedaFacturacionesPorDiarios;
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
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_transaccion;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	private Long id_tipo_transaccion_modulo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FacturacionesPorDiariosSessionBeanAdditional facturacionespordiariosSessionBeanAdditional=null;
	
	public FacturacionesPorDiariosSessionBeanAdditional getFacturacionesPorDiariosSessionBeanAdditional() {
		return this.facturacionespordiariosSessionBeanAdditional;
	}
	
	public void setFacturacionesPorDiariosSessionBeanAdditional(FacturacionesPorDiariosSessionBeanAdditional facturacionespordiariosSessionBeanAdditional) {
		try {
			this.facturacionespordiariosSessionBeanAdditional=facturacionespordiariosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FacturacionesPorDiariosSessionBean () {
		this.inicializarFacturacionesPorDiariosSessionBean();
	}
	
	public void inicializarFacturacionesPorDiariosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios=false;
		this.lIdFacturacionesPorDiariosActualForeignKey=0L;
		this.lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras=false;
		this.sUltimaBusquedaFacturacionesPorDiarios ="";
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
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_transaccion=-1L;
 		this.fecha_emision_desde=new Date();
 		this.fecha_emision_hasta=new Date();
 		this.id_tipo_transaccion_modulo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios= isPermiteNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios = sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturacionesPorDiarios;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios= isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiarios;
	}
					
	public Long getlIdFacturacionesPorDiariosActualForeignKey() {
		return lIdFacturacionesPorDiariosActualForeignKey;
	}

	public void setlIdFacturacionesPorDiariosActualForeignKey(
			Long lIdFacturacionesPorDiariosActualForeignKey) {
		this.lIdFacturacionesPorDiariosActualForeignKey = lIdFacturacionesPorDiariosActualForeignKey;
	}
				    
	public Long getlIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras() {
		return lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras(
			Long lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras) {
		this.lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras = lIdFacturacionesPorDiariosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFacturacionesPorDiariosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFacturacionesPorDiarios() {
		return sUltimaBusquedaFacturacionesPorDiarios;
	}

	public void setsUltimaBusquedaFacturacionesPorDiarios(String sUltimaBusquedaFacturacionesPorDiarios) {
		this.sUltimaBusquedaFacturacionesPorDiarios = sUltimaBusquedaFacturacionesPorDiarios;
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
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Date getfecha_emision_desde() {
		return this.fecha_emision_desde;
	}
    
	public Date getfecha_emision_hasta() {
		return this.fecha_emision_hasta;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna id");
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
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion(Long newid_transaccion)throws Exception
	{
		try {
			if(this.id_transaccion!=newid_transaccion) {
				if(newid_transaccion==null) {
					//newid_transaccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
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
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna fecha_emision_desde");
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
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna fecha_emision_hasta");
					}
				}

				this.fecha_emision_hasta=newfecha_emision_hasta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo)throws Exception
	{
		try {
			if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {
				if(newid_tipo_transaccion_modulo==null) {
					//newid_tipo_transaccion_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturacionesPorDiarios:Valor nulo no permitido en columna id_tipo_transaccion_modulo");
					}
				}

				this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion() {
		return isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion) {
		this.isBusquedaDesdeForeignKeySesionTransaccion = isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public Long getlidTransaccionActual() {
		return lidTransaccionActual;
	}

	public void setlidTransaccionActual(Long lidTransaccionActual) {
		this.lidTransaccionActual = lidTransaccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo() {
		return isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTransaccionModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoTransaccionModulo = isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public Long getlidTipoTransaccionModuloActual() {
		return lidTipoTransaccionModuloActual;
	}

	public void setlidTipoTransaccionModuloActual(Long lidTipoTransaccionModuloActual) {
		this.lidTipoTransaccionModuloActual = lidTipoTransaccionModuloActual;
	}
	
	
		
	
}
