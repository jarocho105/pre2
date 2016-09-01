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
public class PresuProyectoCuentaSessionBean  extends PresuProyectoCuentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta;
	protected Long lIdPresuProyectoCuentaActualForeignKey;	
	
	protected Long lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras;
	protected String sUltimaBusquedaPresuProyectoCuenta;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionPresuProyecto;
	Long lidPresuProyectoActual;
	Boolean isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto;
	Long lidPresuTipoCuentaProyectoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionPresuEstado;
	Long lidPresuEstadoActual;
	
	private Long id;
	private Long id_presu_proyecto;
	private Long id_presu_tipo_cuenta_proyecto;
	private String codigo;
	private String nombre;
	private Long id_cuenta_contable;
	private Long id_empleado;
	private Long id_presu_estado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PresuProyectoCuentaSessionBeanAdditional presuproyectocuentaSessionBeanAdditional=null;
	
	public PresuProyectoCuentaSessionBeanAdditional getPresuProyectoCuentaSessionBeanAdditional() {
		return this.presuproyectocuentaSessionBeanAdditional;
	}
	
	public void setPresuProyectoCuentaSessionBeanAdditional(PresuProyectoCuentaSessionBeanAdditional presuproyectocuentaSessionBeanAdditional) {
		try {
			this.presuproyectocuentaSessionBeanAdditional=presuproyectocuentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PresuProyectoCuentaSessionBean () {
		this.inicializarPresuProyectoCuentaSessionBean();
	}
	
	public void inicializarPresuProyectoCuentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta=false;
		this.lIdPresuProyectoCuentaActualForeignKey=0L;
		this.lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras=false;
		this.sUltimaBusquedaPresuProyectoCuenta ="";
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
		
		
		isBusquedaDesdeForeignKeySesionPresuProyecto=false;
		lidPresuProyectoActual=0L;
		isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto=false;
		lidPresuTipoCuentaProyectoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionPresuEstado=false;
		lidPresuEstadoActual=0L; 
		
		
		
 		this.id_presu_proyecto=-1L;
 		this.id_presu_tipo_cuenta_proyecto=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_cuenta_contable=-1L;
 		this.id_empleado=-1L;
 		this.id_presu_estado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta= isPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta = sNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta= isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta;
	}
					
	public Long getlIdPresuProyectoCuentaActualForeignKey() {
		return lIdPresuProyectoCuentaActualForeignKey;
	}

	public void setlIdPresuProyectoCuentaActualForeignKey(
			Long lIdPresuProyectoCuentaActualForeignKey) {
		this.lIdPresuProyectoCuentaActualForeignKey = lIdPresuProyectoCuentaActualForeignKey;
	}
				    
	public Long getlIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras() {
		return lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras(
			Long lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras) {
		this.lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras = lIdPresuProyectoCuentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPresuProyectoCuenta() {
		return sUltimaBusquedaPresuProyectoCuenta;
	}

	public void setsUltimaBusquedaPresuProyectoCuenta(String sUltimaBusquedaPresuProyectoCuenta) {
		this.sUltimaBusquedaPresuProyectoCuenta = sUltimaBusquedaPresuProyectoCuenta;
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
    
	public Long getid_presu_proyecto() {
		return this.id_presu_proyecto;
	}
    
	public Long getid_presu_tipo_cuenta_proyecto() {
		return this.id_presu_tipo_cuenta_proyecto;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_presu_estado() {
		return this.id_presu_estado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_presu_proyecto(Long newid_presu_proyecto)throws Exception
	{
		try {
			if(this.id_presu_proyecto!=newid_presu_proyecto) {
				if(newid_presu_proyecto==null) {
					//newid_presu_proyecto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id_presu_proyecto");
					}
				}

				this.id_presu_proyecto=newid_presu_proyecto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_presu_tipo_cuenta_proyecto(Long newid_presu_tipo_cuenta_proyecto)throws Exception
	{
		try {
			if(this.id_presu_tipo_cuenta_proyecto!=newid_presu_tipo_cuenta_proyecto) {
				if(newid_presu_tipo_cuenta_proyecto==null) {
					//newid_presu_tipo_cuenta_proyecto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id_presu_tipo_cuenta_proyecto");
					}
				}

				this.id_presu_tipo_cuenta_proyecto=newid_presu_tipo_cuenta_proyecto;
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
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("PresuProyectoCuenta:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("PresuProyectoCuenta:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_presu_estado(Long newid_presu_estado)throws Exception
	{
		try {
			if(this.id_presu_estado!=newid_presu_estado) {
				if(newid_presu_estado==null) {
					//newid_presu_estado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuProyectoCuenta:Valor nulo no permitido en columna id_presu_estado");
					}
				}

				this.id_presu_estado=newid_presu_estado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionPresuProyecto() {
		return isBusquedaDesdeForeignKeySesionPresuProyecto;
	}

	public void setisBusquedaDesdeForeignKeySesionPresuProyecto(
		Boolean isBusquedaDesdeForeignKeySesionPresuProyecto) {
		this.isBusquedaDesdeForeignKeySesionPresuProyecto = isBusquedaDesdeForeignKeySesionPresuProyecto;
	}

	public Long getlidPresuProyectoActual() {
		return lidPresuProyectoActual;
	}

	public void setlidPresuProyectoActual(Long lidPresuProyectoActual) {
		this.lidPresuProyectoActual = lidPresuProyectoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto() {
		return isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto;
	}

	public void setisBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto(
		Boolean isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto) {
		this.isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto = isBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto;
	}

	public Long getlidPresuTipoCuentaProyectoActual() {
		return lidPresuTipoCuentaProyectoActual;
	}

	public void setlidPresuTipoCuentaProyectoActual(Long lidPresuTipoCuentaProyectoActual) {
		this.lidPresuTipoCuentaProyectoActual = lidPresuTipoCuentaProyectoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPresuEstado() {
		return isBusquedaDesdeForeignKeySesionPresuEstado;
	}

	public void setisBusquedaDesdeForeignKeySesionPresuEstado(
		Boolean isBusquedaDesdeForeignKeySesionPresuEstado) {
		this.isBusquedaDesdeForeignKeySesionPresuEstado = isBusquedaDesdeForeignKeySesionPresuEstado;
	}

	public Long getlidPresuEstadoActual() {
		return lidPresuEstadoActual;
	}

	public void setlidPresuEstadoActual(Long lidPresuEstadoActual) {
		this.lidPresuEstadoActual = lidPresuEstadoActual;
	}
	
	
		
	
}
