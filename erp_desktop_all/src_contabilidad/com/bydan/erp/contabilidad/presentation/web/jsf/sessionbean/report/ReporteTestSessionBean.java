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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class ReporteTestSessionBean  extends ReporteTestSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeReporteTest;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReporteTest;
	protected Long lIdReporteTestActualForeignKey;	
	
	protected Long lIdReporteTestActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras;
	protected String sUltimaBusquedaReporteTest;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_modulo;
	private Long id_tipo_movimiento;
	private String nombre;
	private String ubicacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ReporteTestSessionBeanAdditional reportetestSessionBeanAdditional=null;
	
	public ReporteTestSessionBeanAdditional getReporteTestSessionBeanAdditional() {
		return this.reportetestSessionBeanAdditional;
	}
	
	public void setReporteTestSessionBeanAdditional(ReporteTestSessionBeanAdditional reportetestSessionBeanAdditional) {
		try {
			this.reportetestSessionBeanAdditional=reportetestSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ReporteTestSessionBean () {
		this.inicializarReporteTestSessionBean();
	}
	
	public void inicializarReporteTestSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeReporteTest=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyReporteTest=false;
		this.lIdReporteTestActualForeignKey=0L;
		this.lIdReporteTestActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras=false;
		this.sUltimaBusquedaReporteTest ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_modulo=-1L;
 		this.id_tipo_movimiento=-1L;
 		this.nombre="";
 		this.ubicacion="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeReporteTest() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeReporteTest;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeReporteTest(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeReporteTest) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeReporteTest= isPermiteNavegacionHaciaForeignKeyDesdeReporteTest;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest(String sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest = sNombrePaginaNavegacionHaciaForeignKeyDesdeReporteTest;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReporteTest() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReporteTest;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReporteTest(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReporteTest) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReporteTest= isBusquedaDesdeForeignKeySesionForeignKeyReporteTest;
	}
					
	public Long getlIdReporteTestActualForeignKey() {
		return lIdReporteTestActualForeignKey;
	}

	public void setlIdReporteTestActualForeignKey(
			Long lIdReporteTestActualForeignKey) {
		this.lIdReporteTestActualForeignKey = lIdReporteTestActualForeignKey;
	}
				    
	public Long getlIdReporteTestActualForeignKeyParaPosibleAtras() {
		return lIdReporteTestActualForeignKeyParaPosibleAtras;
	}

	public void setlIdReporteTestActualForeignKeyParaPosibleAtras(
			Long lIdReporteTestActualForeignKeyParaPosibleAtras) {
		this.lIdReporteTestActualForeignKeyParaPosibleAtras = lIdReporteTestActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyReporteTestParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaReporteTest() {
		return sUltimaBusquedaReporteTest;
	}

	public void setsUltimaBusquedaReporteTest(String sUltimaBusquedaReporteTest) {
		this.sUltimaBusquedaReporteTest = sUltimaBusquedaReporteTest;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getubicacion() {
		return this.ubicacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReporteTest:Valor nulo no permitido en columna id");
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
						System.out.println("ReporteTest:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReporteTest:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("ReporteTest:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
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
						System.out.println("ReporteTest:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("ReporteTest:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setubicacion(String newubicacion)throws Exception
	{
		try {
			if(this.ubicacion!=newubicacion) {
				if(newubicacion==null) {
					//newubicacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ReporteTest:Valor nulo no permitido en columna ubicacion");
					}
				}

				if(newubicacion!=null&&newubicacion.length()>100) {
					newubicacion=newubicacion.substring(0,98);
					System.out.println("ReporteTest:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna ubicacion");
				}

				this.ubicacion=newubicacion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
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
	
	
		
	
}
