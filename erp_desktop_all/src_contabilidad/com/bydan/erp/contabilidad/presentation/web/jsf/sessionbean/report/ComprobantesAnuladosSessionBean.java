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
public class ComprobantesAnuladosSessionBean  extends ComprobantesAnuladosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados;
	protected Long lIdComprobantesAnuladosActualForeignKey;	
	
	protected Long lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras;
	protected String sUltimaBusquedaComprobantesAnulados;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_tipo_documento;
	private Long id_tipo_movimiento;
	private String numero_mayor;
	private Date fecha_emision_desde;
	private Date fecha_emision_hasta;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ComprobantesAnuladosSessionBeanAdditional comprobantesanuladosSessionBeanAdditional=null;
	
	public ComprobantesAnuladosSessionBeanAdditional getComprobantesAnuladosSessionBeanAdditional() {
		return this.comprobantesanuladosSessionBeanAdditional;
	}
	
	public void setComprobantesAnuladosSessionBeanAdditional(ComprobantesAnuladosSessionBeanAdditional comprobantesanuladosSessionBeanAdditional) {
		try {
			this.comprobantesanuladosSessionBeanAdditional=comprobantesanuladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ComprobantesAnuladosSessionBean () {
		this.inicializarComprobantesAnuladosSessionBean();
	}
	
	public void inicializarComprobantesAnuladosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados=false;
		this.lIdComprobantesAnuladosActualForeignKey=0L;
		this.lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras=false;
		this.sUltimaBusquedaComprobantesAnulados ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_tipo_documento=-1L;
 		this.id_tipo_movimiento=-1L;
 		this.numero_mayor="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados= isPermiteNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados(String sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados = sNombrePaginaNavegacionHaciaForeignKeyDesdeComprobantesAnulados;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados= isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnulados;
	}
					
	public Long getlIdComprobantesAnuladosActualForeignKey() {
		return lIdComprobantesAnuladosActualForeignKey;
	}

	public void setlIdComprobantesAnuladosActualForeignKey(
			Long lIdComprobantesAnuladosActualForeignKey) {
		this.lIdComprobantesAnuladosActualForeignKey = lIdComprobantesAnuladosActualForeignKey;
	}
				    
	public Long getlIdComprobantesAnuladosActualForeignKeyParaPosibleAtras() {
		return lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdComprobantesAnuladosActualForeignKeyParaPosibleAtras(
			Long lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras) {
		this.lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras = lIdComprobantesAnuladosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyComprobantesAnuladosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaComprobantesAnulados() {
		return sUltimaBusquedaComprobantesAnulados;
	}

	public void setsUltimaBusquedaComprobantesAnulados(String sUltimaBusquedaComprobantesAnulados) {
		this.sUltimaBusquedaComprobantesAnulados = sUltimaBusquedaComprobantesAnulados;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public String getnumero_mayor() {
		return this.numero_mayor;
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id");
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_mayor(String newnumero_mayor)throws Exception
	{
		try {
			if(this.numero_mayor!=newnumero_mayor) {
				if(newnumero_mayor==null) {
					//newnumero_mayor="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna numero_mayor");
					}
				}

				if(newnumero_mayor!=null&&newnumero_mayor.length()>100) {
					newnumero_mayor=newnumero_mayor.substring(0,98);
					System.out.println("ComprobantesAnulados:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna numero_mayor");
				}

				this.numero_mayor=newnumero_mayor;
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna fecha_emision_desde");
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
						System.out.println("ComprobantesAnulados:Valor nulo no permitido en columna fecha_emision_hasta");
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
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
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
