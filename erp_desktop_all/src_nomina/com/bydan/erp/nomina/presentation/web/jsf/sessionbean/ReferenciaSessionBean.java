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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ReferenciaSessionBean  extends ReferenciaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferencia;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferencia;
	protected Long lIdReferenciaActualForeignKey;	
	
	protected Long lIdReferenciaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras;
	protected String sUltimaBusquedaReferencia;
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
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionParentezco;
	Long lidParentezcoActual;
	Boolean isBusquedaDesdeForeignKeySesionProfesion;
	Long lidProfesionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_parentezco;
	private Long id_profesion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ReferenciaSessionBeanAdditional referenciaSessionBeanAdditional=null;
	
	public ReferenciaSessionBeanAdditional getReferenciaSessionBeanAdditional() {
		return this.referenciaSessionBeanAdditional;
	}
	
	public void setReferenciaSessionBeanAdditional(ReferenciaSessionBeanAdditional referenciaSessionBeanAdditional) {
		try {
			this.referenciaSessionBeanAdditional=referenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ReferenciaSessionBean () {
		this.inicializarReferenciaSessionBean();
	}
	
	public void inicializarReferenciaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferencia=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferencia=false;
		this.lIdReferenciaActualForeignKey=0L;
		this.lIdReferenciaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras=false;
		this.sUltimaBusquedaReferencia ="";
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
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionParentezco=false;
		lidParentezcoActual=0L;
		isBusquedaDesdeForeignKeySesionProfesion=false;
		lidProfesionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_empleado=-1L;
 		this.id_parentezco=-1L;
 		this.id_profesion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeReferencia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeReferencia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeReferencia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeReferencia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeReferencia= isPermiteNavegacionHaciaForeignKeyDesdeReferencia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia(String sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia = sNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferencia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferencia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferencia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferencia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferencia= isBusquedaDesdeForeignKeySesionForeignKeyReferencia;
	}
					
	public Long getlIdReferenciaActualForeignKey() {
		return lIdReferenciaActualForeignKey;
	}

	public void setlIdReferenciaActualForeignKey(
			Long lIdReferenciaActualForeignKey) {
		this.lIdReferenciaActualForeignKey = lIdReferenciaActualForeignKey;
	}
				    
	public Long getlIdReferenciaActualForeignKeyParaPosibleAtras() {
		return lIdReferenciaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdReferenciaActualForeignKeyParaPosibleAtras(
			Long lIdReferenciaActualForeignKeyParaPosibleAtras) {
		this.lIdReferenciaActualForeignKeyParaPosibleAtras = lIdReferenciaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyReferenciaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaReferencia() {
		return sUltimaBusquedaReferencia;
	}

	public void setsUltimaBusquedaReferencia(String sUltimaBusquedaReferencia) {
		this.sUltimaBusquedaReferencia = sUltimaBusquedaReferencia;
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
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_parentezco() {
		return this.id_parentezco;
	}
    
	public Long getid_profesion() {
		return this.id_profesion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Referencia:Valor nulo no permitido en columna id");
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
						System.out.println("Referencia:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("Referencia:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_parentezco(Long newid_parentezco)throws Exception
	{
		try {
			if(this.id_parentezco!=newid_parentezco) {
				if(newid_parentezco==null) {
					//newid_parentezco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Referencia:Valor nulo no permitido en columna id_parentezco");
					}
				}

				this.id_parentezco=newid_parentezco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_profesion(Long newid_profesion)throws Exception
	{
		try {
			if(this.id_profesion!=newid_profesion) {
				if(newid_profesion==null) {
					//newid_profesion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Referencia:Valor nulo no permitido en columna id_profesion");
					}
				}

				this.id_profesion=newid_profesion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionParentezco() {
		return isBusquedaDesdeForeignKeySesionParentezco;
	}

	public void setisBusquedaDesdeForeignKeySesionParentezco(
		Boolean isBusquedaDesdeForeignKeySesionParentezco) {
		this.isBusquedaDesdeForeignKeySesionParentezco = isBusquedaDesdeForeignKeySesionParentezco;
	}

	public Long getlidParentezcoActual() {
		return lidParentezcoActual;
	}

	public void setlidParentezcoActual(Long lidParentezcoActual) {
		this.lidParentezcoActual = lidParentezcoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProfesion() {
		return isBusquedaDesdeForeignKeySesionProfesion;
	}

	public void setisBusquedaDesdeForeignKeySesionProfesion(
		Boolean isBusquedaDesdeForeignKeySesionProfesion) {
		this.isBusquedaDesdeForeignKeySesionProfesion = isBusquedaDesdeForeignKeySesionProfesion;
	}

	public Long getlidProfesionActual() {
		return lidProfesionActual;
	}

	public void setlidProfesionActual(Long lidProfesionActual) {
		this.lidProfesionActual = lidProfesionActual;
	}
	
	
		
	
}
