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
public class ModeloProductoSessionBean  extends ModeloProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto;
	protected Long lIdModeloProductoActualForeignKey;	
	
	protected Long lIdModeloProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras;
	protected String sUltimaBusquedaModeloProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoProducto;
	Long lidTipoProductoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_producto;
	private String codigo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ModeloProductoSessionBeanAdditional modeloproductoSessionBeanAdditional=null;
	
	public ModeloProductoSessionBeanAdditional getModeloProductoSessionBeanAdditional() {
		return this.modeloproductoSessionBeanAdditional;
	}
	
	public void setModeloProductoSessionBeanAdditional(ModeloProductoSessionBeanAdditional modeloproductoSessionBeanAdditional) {
		try {
			this.modeloproductoSessionBeanAdditional=modeloproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ModeloProductoSessionBean () {
		this.inicializarModeloProductoSessionBean();
	}
	
	public void inicializarModeloProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto=false;
		this.lIdModeloProductoActualForeignKey=0L;
		this.lIdModeloProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras=false;
		this.sUltimaBusquedaModeloProducto ="";
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
		isBusquedaDesdeForeignKeySesionTipoProducto=false;
		lidTipoProductoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_producto=-1L;
 		this.codigo="";
 		this.nombre="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeModeloProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeModeloProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto= isPermiteNavegacionHaciaForeignKeyDesdeModeloProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModeloProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModeloProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto= isBusquedaDesdeForeignKeySesionForeignKeyModeloProducto;
	}
					
	public Long getlIdModeloProductoActualForeignKey() {
		return lIdModeloProductoActualForeignKey;
	}

	public void setlIdModeloProductoActualForeignKey(
			Long lIdModeloProductoActualForeignKey) {
		this.lIdModeloProductoActualForeignKey = lIdModeloProductoActualForeignKey;
	}
				    
	public Long getlIdModeloProductoActualForeignKeyParaPosibleAtras() {
		return lIdModeloProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdModeloProductoActualForeignKeyParaPosibleAtras(
			Long lIdModeloProductoActualForeignKeyParaPosibleAtras) {
		this.lIdModeloProductoActualForeignKeyParaPosibleAtras = lIdModeloProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyModeloProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaModeloProducto() {
		return sUltimaBusquedaModeloProducto;
	}

	public void setsUltimaBusquedaModeloProducto(String sUltimaBusquedaModeloProducto) {
		this.sUltimaBusquedaModeloProducto = sUltimaBusquedaModeloProducto;
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
    
	public Long getid_tipo_producto() {
		return this.id_tipo_producto;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModeloProducto:Valor nulo no permitido en columna id");
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
						System.out.println("ModeloProducto:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto(Long newid_tipo_producto)throws Exception
	{
		try {
			if(this.id_tipo_producto!=newid_tipo_producto) {
				if(newid_tipo_producto==null) {
					//newid_tipo_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ModeloProducto:Valor nulo no permitido en columna id_tipo_producto");
					}
				}

				this.id_tipo_producto=newid_tipo_producto;
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
						System.out.println("ModeloProducto:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("ModeloProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("ModeloProducto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("ModeloProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProducto() {
		return isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProducto(
		Boolean isBusquedaDesdeForeignKeySesionTipoProducto) {
		this.isBusquedaDesdeForeignKeySesionTipoProducto = isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public Long getlidTipoProductoActual() {
		return lidTipoProductoActual;
	}

	public void setlidTipoProductoActual(Long lidTipoProductoActual) {
		this.lidTipoProductoActual = lidTipoProductoActual;
	}
	
	
		
	
}
