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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class ConsumosBodegasSessionBean  extends ConsumosBodegasSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas;
	protected Long lIdConsumosBodegasActualForeignKey;	
	
	protected Long lIdConsumosBodegasActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras;
	protected String sUltimaBusquedaConsumosBodegas;
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
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarca;
	Long lidLineaMarcaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_transaccion;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ConsumosBodegasSessionBeanAdditional consumosbodegasSessionBeanAdditional=null;
	
	public ConsumosBodegasSessionBeanAdditional getConsumosBodegasSessionBeanAdditional() {
		return this.consumosbodegasSessionBeanAdditional;
	}
	
	public void setConsumosBodegasSessionBeanAdditional(ConsumosBodegasSessionBeanAdditional consumosbodegasSessionBeanAdditional) {
		try {
			this.consumosbodegasSessionBeanAdditional=consumosbodegasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ConsumosBodegasSessionBean () {
		this.inicializarConsumosBodegasSessionBean();
	}
	
	public void inicializarConsumosBodegasSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas=false;
		this.lIdConsumosBodegasActualForeignKey=0L;
		this.lIdConsumosBodegasActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras=false;
		this.sUltimaBusquedaConsumosBodegas ="";
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
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarca=false;
		lidLineaMarcaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_transaccion=-1L;
 		this.id_linea=-1L;
 		this.id_linea_grupo=-1L;
 		this.id_linea_categoria=-1L;
 		this.id_linea_marca=-1L;
 		this.fecha_emision_desde=new Date();
 		this.fecha_emision_hasta=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas= isPermiteNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas(String sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas = sNombrePaginaNavegacionHaciaForeignKeyDesdeConsumosBodegas;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas= isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegas;
	}
					
	public Long getlIdConsumosBodegasActualForeignKey() {
		return lIdConsumosBodegasActualForeignKey;
	}

	public void setlIdConsumosBodegasActualForeignKey(
			Long lIdConsumosBodegasActualForeignKey) {
		this.lIdConsumosBodegasActualForeignKey = lIdConsumosBodegasActualForeignKey;
	}
				    
	public Long getlIdConsumosBodegasActualForeignKeyParaPosibleAtras() {
		return lIdConsumosBodegasActualForeignKeyParaPosibleAtras;
	}

	public void setlIdConsumosBodegasActualForeignKeyParaPosibleAtras(
			Long lIdConsumosBodegasActualForeignKeyParaPosibleAtras) {
		this.lIdConsumosBodegasActualForeignKeyParaPosibleAtras = lIdConsumosBodegasActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyConsumosBodegasParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaConsumosBodegas() {
		return sUltimaBusquedaConsumosBodegas;
	}

	public void setsUltimaBusquedaConsumosBodegas(String sUltimaBusquedaConsumosBodegas) {
		this.sUltimaBusquedaConsumosBodegas = sUltimaBusquedaConsumosBodegas;
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
    
	public Date getfecha_emision_desde() {
		return this.fecha_emision_desde;
	}
    
	public Date getfecha_emision_hasta() {
		return this.fecha_emision_hasta;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_linea");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_linea_grupo");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_linea_categoria");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna id_linea_marca");
					}
				}

				this.id_linea_marca=newid_linea_marca;
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna fecha_emision_desde");
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
						System.out.println("ConsumosBodegas:Valor nulo no permitido en columna fecha_emision_hasta");
					}
				}

				this.fecha_emision_hasta=newfecha_emision_hasta;
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
	
	
		
	
}
