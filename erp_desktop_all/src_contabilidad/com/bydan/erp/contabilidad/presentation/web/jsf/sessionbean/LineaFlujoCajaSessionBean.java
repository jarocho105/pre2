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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class LineaFlujoCajaSessionBean  extends LineaFlujoCajaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja;
	protected Long lIdLineaFlujoCajaActualForeignKey;	
	
	protected Long lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras;
	protected String sUltimaBusquedaLineaFlujoCaja;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja;
	Long lidTipoGrupoFlujoCajaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja;
	Long lidTipoLineaFlujoCajaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_grupo_flujo_caja;
	private String codigo;
	private String nombre;
	private Long id_tipo_linea_flujo_caja;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected LineaFlujoCajaSessionBeanAdditional lineaflujocajaSessionBeanAdditional=null;
	
	public LineaFlujoCajaSessionBeanAdditional getLineaFlujoCajaSessionBeanAdditional() {
		return this.lineaflujocajaSessionBeanAdditional;
	}
	
	public void setLineaFlujoCajaSessionBeanAdditional(LineaFlujoCajaSessionBeanAdditional lineaflujocajaSessionBeanAdditional) {
		try {
			this.lineaflujocajaSessionBeanAdditional=lineaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public LineaFlujoCajaSessionBean () {
		this.inicializarLineaFlujoCajaSessionBean();
	}
	
	public void inicializarLineaFlujoCajaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja=false;
		this.lIdLineaFlujoCajaActualForeignKey=0L;
		this.lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras=false;
		this.sUltimaBusquedaLineaFlujoCaja ="";
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
		isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja=false;
		lidTipoGrupoFlujoCajaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja=false;
		lidTipoLineaFlujoCajaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_grupo_flujo_caja=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_tipo_linea_flujo_caja=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja= isPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(String sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja = sNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja= isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCaja;
	}
					
	public Long getlIdLineaFlujoCajaActualForeignKey() {
		return lIdLineaFlujoCajaActualForeignKey;
	}

	public void setlIdLineaFlujoCajaActualForeignKey(
			Long lIdLineaFlujoCajaActualForeignKey) {
		this.lIdLineaFlujoCajaActualForeignKey = lIdLineaFlujoCajaActualForeignKey;
	}
				    
	public Long getlIdLineaFlujoCajaActualForeignKeyParaPosibleAtras() {
		return lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdLineaFlujoCajaActualForeignKeyParaPosibleAtras(
			Long lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras) {
		this.lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras = lIdLineaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyLineaFlujoCajaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaLineaFlujoCaja() {
		return sUltimaBusquedaLineaFlujoCaja;
	}

	public void setsUltimaBusquedaLineaFlujoCaja(String sUltimaBusquedaLineaFlujoCaja) {
		this.sUltimaBusquedaLineaFlujoCaja = sUltimaBusquedaLineaFlujoCaja;
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
    
	public Long getid_tipo_grupo_flujo_caja() {
		return this.id_tipo_grupo_flujo_caja;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_tipo_linea_flujo_caja() {
		return this.id_tipo_linea_flujo_caja;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna id");
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
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grupo_flujo_caja(Long newid_tipo_grupo_flujo_caja)throws Exception
	{
		try {
			if(this.id_tipo_grupo_flujo_caja!=newid_tipo_grupo_flujo_caja) {
				if(newid_tipo_grupo_flujo_caja==null) {
					//newid_tipo_grupo_flujo_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna id_tipo_grupo_flujo_caja");
					}
				}

				this.id_tipo_grupo_flujo_caja=newid_tipo_grupo_flujo_caja;
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
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("LineaFlujoCaja:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("LineaFlujoCaja:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_linea_flujo_caja(Long newid_tipo_linea_flujo_caja)throws Exception
	{
		try {
			if(this.id_tipo_linea_flujo_caja!=newid_tipo_linea_flujo_caja) {
				if(newid_tipo_linea_flujo_caja==null) {
					//newid_tipo_linea_flujo_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("LineaFlujoCaja:Valor nulo no permitido en columna id_tipo_linea_flujo_caja");
					}
				}

				this.id_tipo_linea_flujo_caja=newid_tipo_linea_flujo_caja;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja = isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja;
	}

	public Long getlidTipoGrupoFlujoCajaActual() {
		return lidTipoGrupoFlujoCajaActual;
	}

	public void setlidTipoGrupoFlujoCajaActual(Long lidTipoGrupoFlujoCajaActual) {
		this.lidTipoGrupoFlujoCajaActual = lidTipoGrupoFlujoCajaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja(
		Boolean isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja = isBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja;
	}

	public Long getlidTipoLineaFlujoCajaActual() {
		return lidTipoLineaFlujoCajaActual;
	}

	public void setlidTipoLineaFlujoCajaActual(Long lidTipoLineaFlujoCajaActual) {
		this.lidTipoLineaFlujoCajaActual = lidTipoLineaFlujoCajaActual;
	}
	
	
		
	
}
