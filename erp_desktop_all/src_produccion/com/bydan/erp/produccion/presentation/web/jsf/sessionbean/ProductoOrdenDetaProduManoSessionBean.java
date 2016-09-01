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
public class ProductoOrdenDetaProduManoSessionBean  extends ProductoOrdenDetaProduManoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano;
	protected Long lIdProductoOrdenDetaProduManoActualForeignKey;	
	
	protected Long lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras;
	protected String sUltimaBusquedaProductoOrdenDetaProduMano;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	Long lidOrdenDetaProduActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa;
	Long lidTipoManoProduEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu;
	Long lidTipoProcesoEmpresaProduActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	
	private Long id;
	private Long id_orden_deta_produ;
	private Long id_tipo_mano_produ_empresa;
	private Long id_tipo_proceso_empresa_produ;
	private Long id_unidad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoOrdenDetaProduManoSessionBeanAdditional productoordendetaprodumanoSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduManoSessionBeanAdditional getProductoOrdenDetaProduManoSessionBeanAdditional() {
		return this.productoordendetaprodumanoSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduManoSessionBeanAdditional(ProductoOrdenDetaProduManoSessionBeanAdditional productoordendetaprodumanoSessionBeanAdditional) {
		try {
			this.productoordendetaprodumanoSessionBeanAdditional=productoordendetaprodumanoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoOrdenDetaProduManoSessionBean () {
		this.inicializarProductoOrdenDetaProduManoSessionBean();
	}
	
	public void inicializarProductoOrdenDetaProduManoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano=false;
		this.lIdProductoOrdenDetaProduManoActualForeignKey=0L;
		this.lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras=false;
		this.sUltimaBusquedaProductoOrdenDetaProduMano ="";
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
		
		
		isBusquedaDesdeForeignKeySesionOrdenDetaProdu=false;
		lidOrdenDetaProduActual=0L;
		isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa=false;
		lidTipoManoProduEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu=false;
		lidTipoProcesoEmpresaProduActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L; 
		
		
		
 		this.id_orden_deta_produ=-1L;
 		this.id_tipo_mano_produ_empresa=-1L;
 		this.id_tipo_proceso_empresa_produ=-1L;
 		this.id_unidad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano= isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano= isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduMano;
	}
					
	public Long getlIdProductoOrdenDetaProduManoActualForeignKey() {
		return lIdProductoOrdenDetaProduManoActualForeignKey;
	}

	public void setlIdProductoOrdenDetaProduManoActualForeignKey(
			Long lIdProductoOrdenDetaProduManoActualForeignKey) {
		this.lIdProductoOrdenDetaProduManoActualForeignKey = lIdProductoOrdenDetaProduManoActualForeignKey;
	}
				    
	public Long getlIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras() {
		return lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras(
			Long lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras) {
		this.lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras = lIdProductoOrdenDetaProduManoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduManoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoOrdenDetaProduMano() {
		return sUltimaBusquedaProductoOrdenDetaProduMano;
	}

	public void setsUltimaBusquedaProductoOrdenDetaProduMano(String sUltimaBusquedaProductoOrdenDetaProduMano) {
		this.sUltimaBusquedaProductoOrdenDetaProduMano = sUltimaBusquedaProductoOrdenDetaProduMano;
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
    
	public Long getid_orden_deta_produ() {
		return this.id_orden_deta_produ;
	}
    
	public Long getid_tipo_mano_produ_empresa() {
		return this.id_tipo_mano_produ_empresa;
	}
    
	public Long getid_tipo_proceso_empresa_produ() {
		return this.id_tipo_proceso_empresa_produ;
	}
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduMano:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_orden_deta_produ(Long newid_orden_deta_produ)throws Exception
	{
		try {
			if(this.id_orden_deta_produ!=newid_orden_deta_produ) {
				if(newid_orden_deta_produ==null) {
					//newid_orden_deta_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduMano:Valor nulo no permitido en columna id_orden_deta_produ");
					}
				}

				this.id_orden_deta_produ=newid_orden_deta_produ;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_mano_produ_empresa(Long newid_tipo_mano_produ_empresa)throws Exception
	{
		try {
			if(this.id_tipo_mano_produ_empresa!=newid_tipo_mano_produ_empresa) {
				if(newid_tipo_mano_produ_empresa==null) {
					//newid_tipo_mano_produ_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduMano:Valor nulo no permitido en columna id_tipo_mano_produ_empresa");
					}
				}

				this.id_tipo_mano_produ_empresa=newid_tipo_mano_produ_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_proceso_empresa_produ(Long newid_tipo_proceso_empresa_produ)throws Exception
	{
		try {
			if(this.id_tipo_proceso_empresa_produ!=newid_tipo_proceso_empresa_produ) {
				if(newid_tipo_proceso_empresa_produ==null) {
					//newid_tipo_proceso_empresa_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduMano:Valor nulo no permitido en columna id_tipo_proceso_empresa_produ");
					}
				}

				this.id_tipo_proceso_empresa_produ=newid_tipo_proceso_empresa_produ;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad(Long newid_unidad)throws Exception
	{
		try {
			if(this.id_unidad!=newid_unidad) {
				if(newid_unidad==null) {
					//newid_unidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduMano:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionOrdenDetaProdu() {
		return isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(
		Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu) {
		this.isBusquedaDesdeForeignKeySesionOrdenDetaProdu = isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public Long getlidOrdenDetaProduActual() {
		return lidOrdenDetaProduActual;
	}

	public void setlidOrdenDetaProduActual(Long lidOrdenDetaProduActual) {
		this.lidOrdenDetaProduActual = lidOrdenDetaProduActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa = isBusquedaDesdeForeignKeySesionTipoManoProduEmpresa;
	}

	public Long getlidTipoManoProduEmpresaActual() {
		return lidTipoManoProduEmpresaActual;
	}

	public void setlidTipoManoProduEmpresaActual(Long lidTipoManoProduEmpresaActual) {
		this.lidTipoManoProduEmpresaActual = lidTipoManoProduEmpresaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu() {
		return isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(
		Boolean isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu) {
		this.isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu = isBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu;
	}

	public Long getlidTipoProcesoEmpresaProduActual() {
		return lidTipoProcesoEmpresaProduActual;
	}

	public void setlidTipoProcesoEmpresaProduActual(Long lidTipoProcesoEmpresaProduActual) {
		this.lidTipoProcesoEmpresaProduActual = lidTipoProcesoEmpresaProduActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionUnidad() {
		return isBusquedaDesdeForeignKeySesionUnidad;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidad(
		Boolean isBusquedaDesdeForeignKeySesionUnidad) {
		this.isBusquedaDesdeForeignKeySesionUnidad = isBusquedaDesdeForeignKeySesionUnidad;
	}

	public Long getlidUnidadActual() {
		return lidUnidadActual;
	}

	public void setlidUnidadActual(Long lidUnidadActual) {
		this.lidUnidadActual = lidUnidadActual;
	}
	
	
		
	
}
