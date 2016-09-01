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
public class PresuTransferenciaSessionBean  extends PresuTransferenciaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia;
	protected Long lIdPresuTransferenciaActualForeignKey;	
	
	protected Long lIdPresuTransferenciaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras;
	protected String sUltimaBusquedaPresuTransferencia;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDestino;
	Long lidCuentaContableDestinoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_presu_proyecto;
	private Long id_cuenta_contable;
	private Long id_cuenta_contable_destino;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PresuTransferenciaSessionBeanAdditional presutransferenciaSessionBeanAdditional=null;
	
	public PresuTransferenciaSessionBeanAdditional getPresuTransferenciaSessionBeanAdditional() {
		return this.presutransferenciaSessionBeanAdditional;
	}
	
	public void setPresuTransferenciaSessionBeanAdditional(PresuTransferenciaSessionBeanAdditional presutransferenciaSessionBeanAdditional) {
		try {
			this.presutransferenciaSessionBeanAdditional=presutransferenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PresuTransferenciaSessionBean () {
		this.inicializarPresuTransferenciaSessionBean();
	}
	
	public void inicializarPresuTransferenciaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia=false;
		this.lIdPresuTransferenciaActualForeignKey=0L;
		this.lIdPresuTransferenciaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras=false;
		this.sUltimaBusquedaPresuTransferencia ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDestino=false;
		lidCuentaContableDestinoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_presu_proyecto=-1L;
 		this.id_cuenta_contable=-1L;
 		this.id_cuenta_contable_destino=-1L;
 		this.id_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia= isPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia(String sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia = sNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia= isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia;
	}
					
	public Long getlIdPresuTransferenciaActualForeignKey() {
		return lIdPresuTransferenciaActualForeignKey;
	}

	public void setlIdPresuTransferenciaActualForeignKey(
			Long lIdPresuTransferenciaActualForeignKey) {
		this.lIdPresuTransferenciaActualForeignKey = lIdPresuTransferenciaActualForeignKey;
	}
				    
	public Long getlIdPresuTransferenciaActualForeignKeyParaPosibleAtras() {
		return lIdPresuTransferenciaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPresuTransferenciaActualForeignKeyParaPosibleAtras(
			Long lIdPresuTransferenciaActualForeignKeyParaPosibleAtras) {
		this.lIdPresuTransferenciaActualForeignKeyParaPosibleAtras = lIdPresuTransferenciaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPresuTransferenciaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPresuTransferencia() {
		return sUltimaBusquedaPresuTransferencia;
	}

	public void setsUltimaBusquedaPresuTransferencia(String sUltimaBusquedaPresuTransferencia) {
		this.sUltimaBusquedaPresuTransferencia = sUltimaBusquedaPresuTransferencia;
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
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_cuenta_contable_destino() {
		return this.id_cuenta_contable_destino;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuTransferencia:Valor nulo no permitido en columna id");
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
						System.out.println("PresuTransferencia:Valor nulo no permitido en columna id_presu_proyecto");
					}
				}

				this.id_presu_proyecto=newid_presu_proyecto;
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
						System.out.println("PresuTransferencia:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_destino(Long newid_cuenta_contable_destino)throws Exception
	{
		try {
			if(this.id_cuenta_contable_destino!=newid_cuenta_contable_destino) {
				if(newid_cuenta_contable_destino==null) {
					//newid_cuenta_contable_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("PresuTransferencia:Valor nulo no permitido en columna id_cuenta_contable_destino");
					}
				}

				this.id_cuenta_contable_destino=newid_cuenta_contable_destino;
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
						System.out.println("PresuTransferencia:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDestino() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDestino(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDestino) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDestino = isBusquedaDesdeForeignKeySesionCuentaContableDestino;
	}

	public Long getlidCuentaContableDestinoActual() {
		return lidCuentaContableDestinoActual;
	}

	public void setlidCuentaContableDestinoActual(Long lidCuentaContableDestinoActual) {
		this.lidCuentaContableDestinoActual = lidCuentaContableDestinoActual;
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
	
	
		
	
}
