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
package com.bydan.erp.comisiones.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.comisiones.business.entity.*;

@SuppressWarnings("unused")
public class ComisionMarcaSessionBean  extends ComisionMarcaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca;
	protected Long lIdComisionMarcaActualForeignKey;	
	
	protected Long lIdComisionMarcaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras;
	protected String sUltimaBusquedaComisionMarca;
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
	Boolean isBusquedaDesdeForeignKeySesionComisionConfig;
	Long lidComisionConfigActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarca;
	Long lidLineaMarcaActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoComision;
	Long lidEstadoComisionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_comision_config;
	private Long id_vendedor;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	private Long id_estado_comision;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ComisionMarcaSessionBeanAdditional comisionmarcaSessionBeanAdditional=null;
	
	public ComisionMarcaSessionBeanAdditional getComisionMarcaSessionBeanAdditional() {
		return this.comisionmarcaSessionBeanAdditional;
	}
	
	public void setComisionMarcaSessionBeanAdditional(ComisionMarcaSessionBeanAdditional comisionmarcaSessionBeanAdditional) {
		try {
			this.comisionmarcaSessionBeanAdditional=comisionmarcaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ComisionMarcaSessionBean () {
		this.inicializarComisionMarcaSessionBean();
	}
	
	public void inicializarComisionMarcaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca=false;
		this.lIdComisionMarcaActualForeignKey=0L;
		this.lIdComisionMarcaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras=false;
		this.sUltimaBusquedaComisionMarca ="";
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
		isBusquedaDesdeForeignKeySesionComisionConfig=false;
		lidComisionConfigActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarca=false;
		lidLineaMarcaActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoComision=false;
		lidEstadoComisionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_comision_config=-1L;
 		this.id_vendedor=-1L;
 		this.id_linea=-1L;
 		this.id_linea_grupo=-1L;
 		this.id_linea_categoria=-1L;
 		this.id_linea_marca=-1L;
 		this.id_estado_comision=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeComisionMarca() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeComisionMarca(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca= isPermiteNavegacionHaciaForeignKeyDesdeComisionMarca;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca(String sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca = sNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionMarca() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionMarca(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca= isBusquedaDesdeForeignKeySesionForeignKeyComisionMarca;
	}
					
	public Long getlIdComisionMarcaActualForeignKey() {
		return lIdComisionMarcaActualForeignKey;
	}

	public void setlIdComisionMarcaActualForeignKey(
			Long lIdComisionMarcaActualForeignKey) {
		this.lIdComisionMarcaActualForeignKey = lIdComisionMarcaActualForeignKey;
	}
				    
	public Long getlIdComisionMarcaActualForeignKeyParaPosibleAtras() {
		return lIdComisionMarcaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdComisionMarcaActualForeignKeyParaPosibleAtras(
			Long lIdComisionMarcaActualForeignKeyParaPosibleAtras) {
		this.lIdComisionMarcaActualForeignKeyParaPosibleAtras = lIdComisionMarcaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyComisionMarcaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaComisionMarca() {
		return sUltimaBusquedaComisionMarca;
	}

	public void setsUltimaBusquedaComisionMarca(String sUltimaBusquedaComisionMarca) {
		this.sUltimaBusquedaComisionMarca = sUltimaBusquedaComisionMarca;
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
    
	public Long getid_comision_config() {
		return this.id_comision_config;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_linea() {
		return this.id_linea;
	}
    
	public Long getid_linea_grupo() {
		return this.id_linea_grupo;
	}
    
	public Long getid_linea_categoria() {
		return this.id_linea_categoria;
	}
    
	public Long getid_linea_marca() {
		return this.id_linea_marca;
	}
    
	public Long getid_estado_comision() {
		return this.id_estado_comision;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id");
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
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_comision_config(Long newid_comision_config)throws Exception
	{
		try {
			if(this.id_comision_config!=newid_comision_config) {
				if(newid_comision_config==null) {
					//newid_comision_config=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_comision_config");
					}
				}

				this.id_comision_config=newid_comision_config;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor)throws Exception
	{
		try {
			if(this.id_vendedor!=newid_vendedor) {
				if(newid_vendedor==null) {
					//newid_vendedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_vendedor");
					}
				}

				this.id_vendedor=newid_vendedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea(Long newid_linea)throws Exception
	{
		try {
			if(this.id_linea!=newid_linea) {
				if(newid_linea==null) {
					//newid_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_linea");
					}
				}

				this.id_linea=newid_linea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_grupo(Long newid_linea_grupo)throws Exception
	{
		try {
			if(this.id_linea_grupo!=newid_linea_grupo) {
				if(newid_linea_grupo==null) {
					//newid_linea_grupo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_linea_grupo");
					}
				}

				this.id_linea_grupo=newid_linea_grupo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_categoria(Long newid_linea_categoria)throws Exception
	{
		try {
			if(this.id_linea_categoria!=newid_linea_categoria) {
				if(newid_linea_categoria==null) {
					//newid_linea_categoria=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_linea_categoria");
					}
				}

				this.id_linea_categoria=newid_linea_categoria;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_marca(Long newid_linea_marca)throws Exception
	{
		try {
			if(this.id_linea_marca!=newid_linea_marca) {
				if(newid_linea_marca==null) {
					//newid_linea_marca=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_linea_marca");
					}
				}

				this.id_linea_marca=newid_linea_marca;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_comision(Long newid_estado_comision)throws Exception
	{
		try {
			if(this.id_estado_comision!=newid_estado_comision) {
				if(newid_estado_comision==null) {
					//newid_estado_comision=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComisionMarca:Valor nulo no permitido en columna id_estado_comision");
					}
				}

				this.id_estado_comision=newid_estado_comision;
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
	public Boolean getisBusquedaDesdeForeignKeySesionComisionConfig() {
		return isBusquedaDesdeForeignKeySesionComisionConfig;
	}

	public void setisBusquedaDesdeForeignKeySesionComisionConfig(
		Boolean isBusquedaDesdeForeignKeySesionComisionConfig) {
		this.isBusquedaDesdeForeignKeySesionComisionConfig = isBusquedaDesdeForeignKeySesionComisionConfig;
	}

	public Long getlidComisionConfigActual() {
		return lidComisionConfigActual;
	}

	public void setlidComisionConfigActual(Long lidComisionConfigActual) {
		this.lidComisionConfigActual = lidComisionConfigActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionVendedor() {
		return isBusquedaDesdeForeignKeySesionVendedor;
	}

	public void setisBusquedaDesdeForeignKeySesionVendedor(
		Boolean isBusquedaDesdeForeignKeySesionVendedor) {
		this.isBusquedaDesdeForeignKeySesionVendedor = isBusquedaDesdeForeignKeySesionVendedor;
	}

	public Long getlidVendedorActual() {
		return lidVendedorActual;
	}

	public void setlidVendedorActual(Long lidVendedorActual) {
		this.lidVendedorActual = lidVendedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLinea() {
		return isBusquedaDesdeForeignKeySesionLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionLinea(
		Boolean isBusquedaDesdeForeignKeySesionLinea) {
		this.isBusquedaDesdeForeignKeySesionLinea = isBusquedaDesdeForeignKeySesionLinea;
	}

	public Long getlidLineaActual() {
		return lidLineaActual;
	}

	public void setlidLineaActual(Long lidLineaActual) {
		this.lidLineaActual = lidLineaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaGrupo() {
		return isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaGrupo(
		Boolean isBusquedaDesdeForeignKeySesionLineaGrupo) {
		this.isBusquedaDesdeForeignKeySesionLineaGrupo = isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public Long getlidLineaGrupoActual() {
		return lidLineaGrupoActual;
	}

	public void setlidLineaGrupoActual(Long lidLineaGrupoActual) {
		this.lidLineaGrupoActual = lidLineaGrupoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaCategoria() {
		return isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaCategoria(
		Boolean isBusquedaDesdeForeignKeySesionLineaCategoria) {
		this.isBusquedaDesdeForeignKeySesionLineaCategoria = isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public Long getlidLineaCategoriaActual() {
		return lidLineaCategoriaActual;
	}

	public void setlidLineaCategoriaActual(Long lidLineaCategoriaActual) {
		this.lidLineaCategoriaActual = lidLineaCategoriaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaMarca() {
		return isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaMarca(
		Boolean isBusquedaDesdeForeignKeySesionLineaMarca) {
		this.isBusquedaDesdeForeignKeySesionLineaMarca = isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public Long getlidLineaMarcaActual() {
		return lidLineaMarcaActual;
	}

	public void setlidLineaMarcaActual(Long lidLineaMarcaActual) {
		this.lidLineaMarcaActual = lidLineaMarcaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoComision() {
		return isBusquedaDesdeForeignKeySesionEstadoComision;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoComision(
		Boolean isBusquedaDesdeForeignKeySesionEstadoComision) {
		this.isBusquedaDesdeForeignKeySesionEstadoComision = isBusquedaDesdeForeignKeySesionEstadoComision;
	}

	public Long getlidEstadoComisionActual() {
		return lidEstadoComisionActual;
	}

	public void setlidEstadoComisionActual(Long lidEstadoComisionActual) {
		this.lidEstadoComisionActual = lidEstadoComisionActual;
	}
	
	
		
	
}
