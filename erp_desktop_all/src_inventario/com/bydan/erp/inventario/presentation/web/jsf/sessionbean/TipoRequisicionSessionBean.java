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
public class TipoRequisicionSessionBean  extends TipoRequisicionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion;
	protected Long lIdTipoRequisicionActualForeignKey;	
	
	protected Long lIdTipoRequisicionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras;
	protected String sUltimaBusquedaTipoRequisicion;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoPeriodo;
	Long lidTipoPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionDia;
	Long lidDiaActual;
	
	private Long id;
	private Long id_empresa;
	private String codigo;
	private String nombre;
	private Long id_tipo_periodo;
	private Long id_dia;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoRequisicionSessionBeanAdditional tiporequisicionSessionBeanAdditional=null;
	
	public TipoRequisicionSessionBeanAdditional getTipoRequisicionSessionBeanAdditional() {
		return this.tiporequisicionSessionBeanAdditional;
	}
	
	public void setTipoRequisicionSessionBeanAdditional(TipoRequisicionSessionBeanAdditional tiporequisicionSessionBeanAdditional) {
		try {
			this.tiporequisicionSessionBeanAdditional=tiporequisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoRequisicionSessionBean () {
		this.inicializarTipoRequisicionSessionBean();
	}
	
	public void inicializarTipoRequisicionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion=false;
		this.lIdTipoRequisicionActualForeignKey=0L;
		this.lIdTipoRequisicionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras=false;
		this.sUltimaBusquedaTipoRequisicion ="";
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
		isBusquedaDesdeForeignKeySesionTipoPeriodo=false;
		lidTipoPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionDia=false;
		lidDiaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_tipo_periodo=-1L;
 		this.id_dia=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion= isPermiteNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRequisicion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion= isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicion;
	}
					
	public Long getlIdTipoRequisicionActualForeignKey() {
		return lIdTipoRequisicionActualForeignKey;
	}

	public void setlIdTipoRequisicionActualForeignKey(
			Long lIdTipoRequisicionActualForeignKey) {
		this.lIdTipoRequisicionActualForeignKey = lIdTipoRequisicionActualForeignKey;
	}
				    
	public Long getlIdTipoRequisicionActualForeignKeyParaPosibleAtras() {
		return lIdTipoRequisicionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoRequisicionActualForeignKeyParaPosibleAtras(
			Long lIdTipoRequisicionActualForeignKeyParaPosibleAtras) {
		this.lIdTipoRequisicionActualForeignKeyParaPosibleAtras = lIdTipoRequisicionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoRequisicionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoRequisicion() {
		return sUltimaBusquedaTipoRequisicion;
	}

	public void setsUltimaBusquedaTipoRequisicion(String sUltimaBusquedaTipoRequisicion) {
		this.sUltimaBusquedaTipoRequisicion = sUltimaBusquedaTipoRequisicion;
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
    
	public Long getid_tipo_periodo() {
		return this.id_tipo_periodo;
	}
    
	public Long getid_dia() {
		return this.id_dia;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna id");
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
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("TipoRequisicion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("TipoRequisicion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_periodo(Long newid_tipo_periodo)throws Exception
	{
		try {
			if(this.id_tipo_periodo!=newid_tipo_periodo) {
				if(newid_tipo_periodo==null) {
					//newid_tipo_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna id_tipo_periodo");
					}
				}

				this.id_tipo_periodo=newid_tipo_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_dia(Long newid_dia)throws Exception
	{
		try {
			if(this.id_dia!=newid_dia) {
				if(newid_dia==null) {
					//newid_dia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoRequisicion:Valor nulo no permitido en columna id_dia");
					}
				}

				this.id_dia=newid_dia;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPeriodo() {
		return isBusquedaDesdeForeignKeySesionTipoPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionTipoPeriodo) {
		this.isBusquedaDesdeForeignKeySesionTipoPeriodo = isBusquedaDesdeForeignKeySesionTipoPeriodo;
	}

	public Long getlidTipoPeriodoActual() {
		return lidTipoPeriodoActual;
	}

	public void setlidTipoPeriodoActual(Long lidTipoPeriodoActual) {
		this.lidTipoPeriodoActual = lidTipoPeriodoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDia() {
		return isBusquedaDesdeForeignKeySesionDia;
	}

	public void setisBusquedaDesdeForeignKeySesionDia(
		Boolean isBusquedaDesdeForeignKeySesionDia) {
		this.isBusquedaDesdeForeignKeySesionDia = isBusquedaDesdeForeignKeySesionDia;
	}

	public Long getlidDiaActual() {
		return lidDiaActual;
	}

	public void setlidDiaActual(Long lidDiaActual) {
		this.lidDiaActual = lidDiaActual;
	}
	
	
		
	
}
