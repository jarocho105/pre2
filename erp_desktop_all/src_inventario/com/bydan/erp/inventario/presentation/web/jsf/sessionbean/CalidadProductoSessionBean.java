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
public class CalidadProductoSessionBean  extends CalidadProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto;
	protected Long lIdCalidadProductoActualForeignKey;	
	
	protected Long lIdCalidadProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras;
	protected String sUltimaBusquedaCalidadProducto;
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
	
	
	
	private Long id;
	private String codigo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CalidadProductoSessionBeanAdditional calidadproductoSessionBeanAdditional=null;
	
	public CalidadProductoSessionBeanAdditional getCalidadProductoSessionBeanAdditional() {
		return this.calidadproductoSessionBeanAdditional;
	}
	
	public void setCalidadProductoSessionBeanAdditional(CalidadProductoSessionBeanAdditional calidadproductoSessionBeanAdditional) {
		try {
			this.calidadproductoSessionBeanAdditional=calidadproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CalidadProductoSessionBean () {
		this.inicializarCalidadProductoSessionBean();
	}
	
	public void inicializarCalidadProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto=false;
		this.lIdCalidadProductoActualForeignKey=0L;
		this.lIdCalidadProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras=false;
		this.sUltimaBusquedaCalidadProducto ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto= isPermiteNavegacionHaciaForeignKeyDesdeCalidadProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeCalidadProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto= isBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto;
	}
					
	public Long getlIdCalidadProductoActualForeignKey() {
		return lIdCalidadProductoActualForeignKey;
	}

	public void setlIdCalidadProductoActualForeignKey(
			Long lIdCalidadProductoActualForeignKey) {
		this.lIdCalidadProductoActualForeignKey = lIdCalidadProductoActualForeignKey;
	}
				    
	public Long getlIdCalidadProductoActualForeignKeyParaPosibleAtras() {
		return lIdCalidadProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCalidadProductoActualForeignKeyParaPosibleAtras(
			Long lIdCalidadProductoActualForeignKeyParaPosibleAtras) {
		this.lIdCalidadProductoActualForeignKeyParaPosibleAtras = lIdCalidadProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCalidadProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCalidadProducto() {
		return sUltimaBusquedaCalidadProducto;
	}

	public void setsUltimaBusquedaCalidadProducto(String sUltimaBusquedaCalidadProducto) {
		this.sUltimaBusquedaCalidadProducto = sUltimaBusquedaCalidadProducto;
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
						System.out.println("CalidadProducto:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("CalidadProducto:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("CalidadProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("CalidadProducto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("CalidadProducto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
