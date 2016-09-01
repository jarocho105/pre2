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
package com.bydan.erp.produccion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.produccion.business.entity.*;

@SuppressWarnings("unused")
public class ParametroProduSessionBean  extends ParametroProduSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu;
	protected Long lIdParametroProduActualForeignKey;	
	
	protected Long lIdParametroProduActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras;
	protected String sUltimaBusquedaParametroProdu;
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
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaMateriaPrima;
	Long lidBodegaMateriaPrimaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionEgreso;
	Long lidTransaccionEgresoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_bodega_materia_prima;
	private Long id_transaccion;
	private Long id_transaccion_egreso;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroProduSessionBeanAdditional parametroproduSessionBeanAdditional=null;
	
	public ParametroProduSessionBeanAdditional getParametroProduSessionBeanAdditional() {
		return this.parametroproduSessionBeanAdditional;
	}
	
	public void setParametroProduSessionBeanAdditional(ParametroProduSessionBeanAdditional parametroproduSessionBeanAdditional) {
		try {
			this.parametroproduSessionBeanAdditional=parametroproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroProduSessionBean () {
		this.inicializarParametroProduSessionBean();
	}
	
	public void inicializarParametroProduSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu=false;
		this.lIdParametroProduActualForeignKey=0L;
		this.lIdParametroProduActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras=false;
		this.sUltimaBusquedaParametroProdu ="";
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
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaMateriaPrima=false;
		lidBodegaMateriaPrimaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionEgreso=false;
		lidTransaccionEgresoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_bodega_materia_prima=-1L;
 		this.id_transaccion=-1L;
 		this.id_transaccion_egreso=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroProdu() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroProdu(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu= isPermiteNavegacionHaciaForeignKeyDesdeParametroProdu;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroProdu;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroProdu() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroProdu(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu= isBusquedaDesdeForeignKeySesionForeignKeyParametroProdu;
	}
					
	public Long getlIdParametroProduActualForeignKey() {
		return lIdParametroProduActualForeignKey;
	}

	public void setlIdParametroProduActualForeignKey(
			Long lIdParametroProduActualForeignKey) {
		this.lIdParametroProduActualForeignKey = lIdParametroProduActualForeignKey;
	}
				    
	public Long getlIdParametroProduActualForeignKeyParaPosibleAtras() {
		return lIdParametroProduActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroProduActualForeignKeyParaPosibleAtras(
			Long lIdParametroProduActualForeignKeyParaPosibleAtras) {
		this.lIdParametroProduActualForeignKeyParaPosibleAtras = lIdParametroProduActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroProduParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroProdu() {
		return sUltimaBusquedaParametroProdu;
	}

	public void setsUltimaBusquedaParametroProdu(String sUltimaBusquedaParametroProdu) {
		this.sUltimaBusquedaParametroProdu = sUltimaBusquedaParametroProdu;
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
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_bodega_materia_prima() {
		return this.id_bodega_materia_prima;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_transaccion_egreso() {
		return this.id_transaccion_egreso;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_materia_prima(Long newid_bodega_materia_prima)throws Exception
	{
		try {
			if(this.id_bodega_materia_prima!=newid_bodega_materia_prima) {
				if(newid_bodega_materia_prima==null) {
					//newid_bodega_materia_prima=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_bodega_materia_prima");
					}
				}

				this.id_bodega_materia_prima=newid_bodega_materia_prima;
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
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_egreso(Long newid_transaccion_egreso)throws Exception
	{
		try {
			if(this.id_transaccion_egreso!=newid_transaccion_egreso) {
				if(newid_transaccion_egreso==null) {
					//newid_transaccion_egreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroProdu:Valor nulo no permitido en columna id_transaccion_egreso");
					}
				}

				this.id_transaccion_egreso=newid_transaccion_egreso;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBodega() {
		return isBusquedaDesdeForeignKeySesionBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionBodega(
		Boolean isBusquedaDesdeForeignKeySesionBodega) {
		this.isBusquedaDesdeForeignKeySesionBodega = isBusquedaDesdeForeignKeySesionBodega;
	}

	public Long getlidBodegaActual() {
		return lidBodegaActual;
	}

	public void setlidBodegaActual(Long lidBodegaActual) {
		this.lidBodegaActual = lidBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaMateriaPrima() {
		return isBusquedaDesdeForeignKeySesionBodegaMateriaPrima;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaMateriaPrima(
		Boolean isBusquedaDesdeForeignKeySesionBodegaMateriaPrima) {
		this.isBusquedaDesdeForeignKeySesionBodegaMateriaPrima = isBusquedaDesdeForeignKeySesionBodegaMateriaPrima;
	}

	public Long getlidBodegaMateriaPrimaActual() {
		return lidBodegaMateriaPrimaActual;
	}

	public void setlidBodegaMateriaPrimaActual(Long lidBodegaMateriaPrimaActual) {
		this.lidBodegaMateriaPrimaActual = lidBodegaMateriaPrimaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionEgreso() {
		return isBusquedaDesdeForeignKeySesionTransaccionEgreso;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionEgreso(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionEgreso) {
		this.isBusquedaDesdeForeignKeySesionTransaccionEgreso = isBusquedaDesdeForeignKeySesionTransaccionEgreso;
	}

	public Long getlidTransaccionEgresoActual() {
		return lidTransaccionEgresoActual;
	}

	public void setlidTransaccionEgresoActual(Long lidTransaccionEgresoActual) {
		this.lidTransaccionEgresoActual = lidTransaccionEgresoActual;
	}
	
	
		
	
}
