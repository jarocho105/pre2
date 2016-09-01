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
public class CentroActividadSessionBean  extends CentroActividadSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad;
	protected Long lIdCentroActividadActualForeignKey;	
	
	protected Long lIdCentroActividadActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras;
	protected String sUltimaBusquedaCentroActividad;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja;
	Long lidTipoGrupoFlujoCajaActual;
	
	private Long id;
	private Long id_empresa;
	private String codigo;
	private String nombre;
	private Long id_tipo_movimiento;
	private Long id_tipo_grupo_flujo_caja;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CentroActividadSessionBeanAdditional centroactividadSessionBeanAdditional=null;
	
	public CentroActividadSessionBeanAdditional getCentroActividadSessionBeanAdditional() {
		return this.centroactividadSessionBeanAdditional;
	}
	
	public void setCentroActividadSessionBeanAdditional(CentroActividadSessionBeanAdditional centroactividadSessionBeanAdditional) {
		try {
			this.centroactividadSessionBeanAdditional=centroactividadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CentroActividadSessionBean () {
		this.inicializarCentroActividadSessionBean();
	}
	
	public void inicializarCentroActividadSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad=false;
		this.lIdCentroActividadActualForeignKey=0L;
		this.lIdCentroActividadActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras=false;
		this.sUltimaBusquedaCentroActividad ="";
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
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja=false;
		lidTipoGrupoFlujoCajaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_tipo_movimiento=-1L;
 		this.id_tipo_grupo_flujo_caja=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCentroActividad() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCentroActividad(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad= isPermiteNavegacionHaciaForeignKeyDesdeCentroActividad;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad = sNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCentroActividad() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCentroActividad(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad= isBusquedaDesdeForeignKeySesionForeignKeyCentroActividad;
	}
					
	public Long getlIdCentroActividadActualForeignKey() {
		return lIdCentroActividadActualForeignKey;
	}

	public void setlIdCentroActividadActualForeignKey(
			Long lIdCentroActividadActualForeignKey) {
		this.lIdCentroActividadActualForeignKey = lIdCentroActividadActualForeignKey;
	}
				    
	public Long getlIdCentroActividadActualForeignKeyParaPosibleAtras() {
		return lIdCentroActividadActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCentroActividadActualForeignKeyParaPosibleAtras(
			Long lIdCentroActividadActualForeignKeyParaPosibleAtras) {
		this.lIdCentroActividadActualForeignKeyParaPosibleAtras = lIdCentroActividadActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCentroActividadParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCentroActividad() {
		return sUltimaBusquedaCentroActividad;
	}

	public void setsUltimaBusquedaCentroActividad(String sUltimaBusquedaCentroActividad) {
		this.sUltimaBusquedaCentroActividad = sUltimaBusquedaCentroActividad;
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
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public Long getid_tipo_grupo_flujo_caja() {
		return this.id_tipo_grupo_flujo_caja;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CentroActividad:Valor nulo no permitido en columna id");
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
						System.out.println("CentroActividad:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CentroActividad:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("CentroActividad:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("CentroActividad:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("CentroActividad:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento)throws Exception
	{
		try {
			if(this.id_tipo_movimiento!=newid_tipo_movimiento) {
				if(newid_tipo_movimiento==null) {
					//newid_tipo_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CentroActividad:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
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
						System.out.println("CentroActividad:Valor nulo no permitido en columna id_tipo_grupo_flujo_caja");
					}
				}

				this.id_tipo_grupo_flujo_caja=newid_tipo_grupo_flujo_caja;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
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
	
	
		
	
}
