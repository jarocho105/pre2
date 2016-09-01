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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class EmpresaSessionBean  extends EmpresaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpresa;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpresa;
	protected Long lIdEmpresaActualForeignKey;	
	
	protected Long lIdEmpresaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras;
	protected String sUltimaBusquedaEmpresa;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoEmpresa;
	Long lidTipoEmpresaActual;
	
	private Long id;
	private Long id_pais;
	private Long id_ciudad;
	private Long id_tipo_empresa;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmpresaSessionBeanAdditional empresaSessionBeanAdditional=null;
	
	public EmpresaSessionBeanAdditional getEmpresaSessionBeanAdditional() {
		return this.empresaSessionBeanAdditional;
	}
	
	public void setEmpresaSessionBeanAdditional(EmpresaSessionBeanAdditional empresaSessionBeanAdditional) {
		try {
			this.empresaSessionBeanAdditional=empresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmpresaSessionBean () {
		this.inicializarEmpresaSessionBean();
	}
	
	public void inicializarEmpresaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpresa=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpresa=false;
		this.lIdEmpresaActualForeignKey=0L;
		this.lIdEmpresaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras=false;
		this.sUltimaBusquedaEmpresa ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoEmpresa=false;
		lidTipoEmpresaActual=0L; 
		
		
		
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
 		this.id_tipo_empresa=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmpresa() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmpresa;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmpresa(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmpresa) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmpresa= isPermiteNavegacionHaciaForeignKeyDesdeEmpresa;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmpresa;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpresa() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpresa(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpresa) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpresa= isBusquedaDesdeForeignKeySesionForeignKeyEmpresa;
	}
					
	public Long getlIdEmpresaActualForeignKey() {
		return lIdEmpresaActualForeignKey;
	}

	public void setlIdEmpresaActualForeignKey(
			Long lIdEmpresaActualForeignKey) {
		this.lIdEmpresaActualForeignKey = lIdEmpresaActualForeignKey;
	}
				    
	public Long getlIdEmpresaActualForeignKeyParaPosibleAtras() {
		return lIdEmpresaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmpresaActualForeignKeyParaPosibleAtras(
			Long lIdEmpresaActualForeignKeyParaPosibleAtras) {
		this.lIdEmpresaActualForeignKeyParaPosibleAtras = lIdEmpresaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmpresaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmpresa() {
		return sUltimaBusquedaEmpresa;
	}

	public void setsUltimaBusquedaEmpresa(String sUltimaBusquedaEmpresa) {
		this.sUltimaBusquedaEmpresa = sUltimaBusquedaEmpresa;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_tipo_empresa() {
		return this.id_tipo_empresa;
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
						System.out.println("Empresa:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empresa:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empresa:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_empresa(Long newid_tipo_empresa)throws Exception
	{
		try {
			if(this.id_tipo_empresa!=newid_tipo_empresa) {
				if(newid_tipo_empresa==null) {
					//newid_tipo_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Empresa:Valor nulo no permitido en columna id_tipo_empresa");
					}
				}

				this.id_tipo_empresa=newid_tipo_empresa;
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
						System.out.println("Empresa:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Empresa:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoEmpresa = isBusquedaDesdeForeignKeySesionTipoEmpresa;
	}

	public Long getlidTipoEmpresaActual() {
		return lidTipoEmpresaActual;
	}

	public void setlidTipoEmpresaActual(Long lidTipoEmpresaActual) {
		this.lidTipoEmpresaActual = lidTipoEmpresaActual;
	}
	
	
		
	
}
