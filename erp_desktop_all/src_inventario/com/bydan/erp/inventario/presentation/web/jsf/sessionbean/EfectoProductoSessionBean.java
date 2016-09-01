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
public class EfectoProductoSessionBean  extends EfectoProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto;
	protected Long lIdEfectoProductoActualForeignKey;	
	
	protected Long lIdEfectoProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras;
	protected String sUltimaBusquedaEfectoProducto;
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
	
					
	 	
		
	
	protected EfectoProductoSessionBeanAdditional efectoproductoSessionBeanAdditional=null;
	
	public EfectoProductoSessionBeanAdditional getEfectoProductoSessionBeanAdditional() {
		return this.efectoproductoSessionBeanAdditional;
	}
	
	public void setEfectoProductoSessionBeanAdditional(EfectoProductoSessionBeanAdditional efectoproductoSessionBeanAdditional) {
		try {
			this.efectoproductoSessionBeanAdditional=efectoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EfectoProductoSessionBean () {
		this.inicializarEfectoProductoSessionBean();
	}
	
	public void inicializarEfectoProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto=false;
		this.lIdEfectoProductoActualForeignKey=0L;
		this.lIdEfectoProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras=false;
		this.sUltimaBusquedaEfectoProducto ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto= isPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto= isBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto;
	}
					
	public Long getlIdEfectoProductoActualForeignKey() {
		return lIdEfectoProductoActualForeignKey;
	}

	public void setlIdEfectoProductoActualForeignKey(
			Long lIdEfectoProductoActualForeignKey) {
		this.lIdEfectoProductoActualForeignKey = lIdEfectoProductoActualForeignKey;
	}
				    
	public Long getlIdEfectoProductoActualForeignKeyParaPosibleAtras() {
		return lIdEfectoProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEfectoProductoActualForeignKeyParaPosibleAtras(
			Long lIdEfectoProductoActualForeignKeyParaPosibleAtras) {
		this.lIdEfectoProductoActualForeignKeyParaPosibleAtras = lIdEfectoProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEfectoProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEfectoProducto() {
		return sUltimaBusquedaEfectoProducto;
	}

	public void setsUltimaBusquedaEfectoProducto(String sUltimaBusquedaEfectoProducto) {
		this.sUltimaBusquedaEfectoProducto = sUltimaBusquedaEfectoProducto;
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
						System.out.println("EfectoProducto:Valor nulo no permitido en columna id");
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
						System.out.println("EfectoProducto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("EfectoProducto:Valor nulo no permitido en columna id_tipo_producto");
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
						System.out.println("EfectoProducto:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("EfectoProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("EfectoProducto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("EfectoProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
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
