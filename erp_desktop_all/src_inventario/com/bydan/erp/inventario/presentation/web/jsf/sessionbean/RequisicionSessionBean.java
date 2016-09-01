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
public class RequisicionSessionBean  extends RequisicionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRequisicion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRequisicion;
	protected Long lIdRequisicionActualForeignKey;	
	
	protected Long lIdRequisicionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras;
	protected String sUltimaBusquedaRequisicion;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRequisicion;
	Long lidTipoRequisicionActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoRequisicion;
	Long lidEstadoRequisicionActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaSolicitar;
	Long lidBodegaSolicitarActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaSolicita;
	Long lidBodegaSolicitaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private String numero_secuencial;
	private Long id_tipo_requisicion;
	private Long id_empleado;
	private Long id_estado_requisicion;
	private Long id_formato;
	private Long id_bodega_solicitar;
	private Long id_bodega_solicita;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RequisicionSessionBeanAdditional requisicionSessionBeanAdditional=null;
	
	public RequisicionSessionBeanAdditional getRequisicionSessionBeanAdditional() {
		return this.requisicionSessionBeanAdditional;
	}
	
	public void setRequisicionSessionBeanAdditional(RequisicionSessionBeanAdditional requisicionSessionBeanAdditional) {
		try {
			this.requisicionSessionBeanAdditional=requisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RequisicionSessionBean () {
		this.inicializarRequisicionSessionBean();
	}
	
	public void inicializarRequisicionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRequisicion=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRequisicion=false;
		this.lIdRequisicionActualForeignKey=0L;
		this.lIdRequisicionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras=false;
		this.sUltimaBusquedaRequisicion ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRequisicion=false;
		lidTipoRequisicionActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoRequisicion=false;
		lidEstadoRequisicionActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaSolicitar=false;
		lidBodegaSolicitarActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaSolicita=false;
		lidBodegaSolicitaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.numero_secuencial="";
 		this.id_tipo_requisicion=-1L;
 		this.id_empleado=-1L;
 		this.id_estado_requisicion=-1L;
 		this.id_formato=-1L;
 		this.id_bodega_solicitar=-1L;
 		this.id_bodega_solicita=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRequisicion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRequisicion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRequisicion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRequisicion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRequisicion= isPermiteNavegacionHaciaForeignKeyDesdeRequisicion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion = sNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRequisicion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRequisicion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRequisicion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRequisicion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRequisicion= isBusquedaDesdeForeignKeySesionForeignKeyRequisicion;
	}
					
	public Long getlIdRequisicionActualForeignKey() {
		return lIdRequisicionActualForeignKey;
	}

	public void setlIdRequisicionActualForeignKey(
			Long lIdRequisicionActualForeignKey) {
		this.lIdRequisicionActualForeignKey = lIdRequisicionActualForeignKey;
	}
				    
	public Long getlIdRequisicionActualForeignKeyParaPosibleAtras() {
		return lIdRequisicionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRequisicionActualForeignKeyParaPosibleAtras(
			Long lIdRequisicionActualForeignKeyParaPosibleAtras) {
		this.lIdRequisicionActualForeignKeyParaPosibleAtras = lIdRequisicionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRequisicionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRequisicion() {
		return sUltimaBusquedaRequisicion;
	}

	public void setsUltimaBusquedaRequisicion(String sUltimaBusquedaRequisicion) {
		this.sUltimaBusquedaRequisicion = sUltimaBusquedaRequisicion;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public String getnumero_secuencial() {
		return this.numero_secuencial;
	}
    
	public Long getid_tipo_requisicion() {
		return this.id_tipo_requisicion;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_estado_requisicion() {
		return this.id_estado_requisicion;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public Long getid_bodega_solicitar() {
		return this.id_bodega_solicitar;
	}
    
	public Long getid_bodega_solicita() {
		return this.id_bodega_solicita;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id");
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
						System.out.println("Requisicion:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_secuencial(String newnumero_secuencial)throws Exception
	{
		try {
			if(this.numero_secuencial!=newnumero_secuencial) {
				if(newnumero_secuencial==null) {
					//newnumero_secuencial="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna numero_secuencial");
					}
				}

				if(newnumero_secuencial!=null&&newnumero_secuencial.length()>50) {
					newnumero_secuencial=newnumero_secuencial.substring(0,48);
					System.out.println("Requisicion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_secuencial");
				}

				this.numero_secuencial=newnumero_secuencial;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_requisicion(Long newid_tipo_requisicion)throws Exception
	{
		try {
			if(this.id_tipo_requisicion!=newid_tipo_requisicion) {
				if(newid_tipo_requisicion==null) {
					//newid_tipo_requisicion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_tipo_requisicion");
					}
				}

				this.id_tipo_requisicion=newid_tipo_requisicion;
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
						System.out.println("Requisicion:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_requisicion(Long newid_estado_requisicion)throws Exception
	{
		try {
			if(this.id_estado_requisicion!=newid_estado_requisicion) {
				if(newid_estado_requisicion==null) {
					//newid_estado_requisicion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_estado_requisicion");
					}
				}

				this.id_estado_requisicion=newid_estado_requisicion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato)throws Exception
	{
		try {
			if(this.id_formato!=newid_formato) {
				if(newid_formato==null) {
					//newid_formato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_formato");
					}
				}

				this.id_formato=newid_formato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_solicitar(Long newid_bodega_solicitar)throws Exception
	{
		try {
			if(this.id_bodega_solicitar!=newid_bodega_solicitar) {
				if(newid_bodega_solicitar==null) {
					//newid_bodega_solicitar=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_bodega_solicitar");
					}
				}

				this.id_bodega_solicitar=newid_bodega_solicitar;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_solicita(Long newid_bodega_solicita)throws Exception
	{
		try {
			if(this.id_bodega_solicita!=newid_bodega_solicita) {
				if(newid_bodega_solicita==null) {
					//newid_bodega_solicita=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Requisicion:Valor nulo no permitido en columna id_bodega_solicita");
					}
				}

				this.id_bodega_solicita=newid_bodega_solicita;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRequisicion() {
		return isBusquedaDesdeForeignKeySesionTipoRequisicion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRequisicion(
		Boolean isBusquedaDesdeForeignKeySesionTipoRequisicion) {
		this.isBusquedaDesdeForeignKeySesionTipoRequisicion = isBusquedaDesdeForeignKeySesionTipoRequisicion;
	}

	public Long getlidTipoRequisicionActual() {
		return lidTipoRequisicionActual;
	}

	public void setlidTipoRequisicionActual(Long lidTipoRequisicionActual) {
		this.lidTipoRequisicionActual = lidTipoRequisicionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoRequisicion() {
		return isBusquedaDesdeForeignKeySesionEstadoRequisicion;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoRequisicion(
		Boolean isBusquedaDesdeForeignKeySesionEstadoRequisicion) {
		this.isBusquedaDesdeForeignKeySesionEstadoRequisicion = isBusquedaDesdeForeignKeySesionEstadoRequisicion;
	}

	public Long getlidEstadoRequisicionActual() {
		return lidEstadoRequisicionActual;
	}

	public void setlidEstadoRequisicionActual(Long lidEstadoRequisicionActual) {
		this.lidEstadoRequisicionActual = lidEstadoRequisicionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaSolicitar() {
		return isBusquedaDesdeForeignKeySesionBodegaSolicitar;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaSolicitar(
		Boolean isBusquedaDesdeForeignKeySesionBodegaSolicitar) {
		this.isBusquedaDesdeForeignKeySesionBodegaSolicitar = isBusquedaDesdeForeignKeySesionBodegaSolicitar;
	}

	public Long getlidBodegaSolicitarActual() {
		return lidBodegaSolicitarActual;
	}

	public void setlidBodegaSolicitarActual(Long lidBodegaSolicitarActual) {
		this.lidBodegaSolicitarActual = lidBodegaSolicitarActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaSolicita() {
		return isBusquedaDesdeForeignKeySesionBodegaSolicita;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaSolicita(
		Boolean isBusquedaDesdeForeignKeySesionBodegaSolicita) {
		this.isBusquedaDesdeForeignKeySesionBodegaSolicita = isBusquedaDesdeForeignKeySesionBodegaSolicita;
	}

	public Long getlidBodegaSolicitaActual() {
		return lidBodegaSolicitaActual;
	}

	public void setlidBodegaSolicitaActual(Long lidBodegaSolicitaActual) {
		this.lidBodegaSolicitaActual = lidBodegaSolicitaActual;
	}
	
	
		
	
}
