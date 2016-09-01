/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class AsistenciaSessionBean {
	private Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsistencia;
	private Boolean isPermiteRecargarInformacion;
	private String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistencia;
	private Long lIdAsistenciaActualForeignKey;	
	
	private Long lIdAsistenciaActualForeignKeyParaPosibleAtras;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras;
	private String sUltimaBusquedaAsistencia;
	private String sServletGenerarHtmlReporte;
	
	private Integer iNumeroPaginacion;
	private Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAsistencia;
	Long lidTipoAsistenciaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	private Long id_tipo_asistencia;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	
					
	 	
		
	public AsistenciaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsistencia=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistencia=false;
		this.lIdAsistenciaActualForeignKey=0L;
		this.lIdAsistenciaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras=false;
		this.sUltimaBusquedaAsistencia ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		
		this.sStyleDivArbol="display:table-row";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAsistencia=false;
		lidTipoAsistenciaActual=0L; 
		
		
		
 		this.id_empresa=0L;
 		this.id_empleado=0L;
 		this.id_tipo_asistencia=0L;
		
		
		
		
		
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
				this.sStyleDivArbol="display:table-row";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAsistencia() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAsistencia;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAsistencia(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsistencia) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsistencia= isPermiteNavegacionHaciaForeignKeyDesdeAsistencia;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia = sNombrePaginaNavegacionHaciaForeignKeyDesdeAsistencia;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsistencia() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsistencia;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsistencia(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistencia) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistencia= isBusquedaDesdeForeignKeySesionForeignKeyAsistencia;
	}
					
	public Long getlIdAsistenciaActualForeignKey() {
		return lIdAsistenciaActualForeignKey;
	}

	public void setlIdAsistenciaActualForeignKey(
			Long lIdAsistenciaActualForeignKey) {
		this.lIdAsistenciaActualForeignKey = lIdAsistenciaActualForeignKey;
	}
				    
	public Long getlIdAsistenciaActualForeignKeyParaPosibleAtras() {
		return lIdAsistenciaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAsistenciaActualForeignKeyParaPosibleAtras(
			Long lIdAsistenciaActualForeignKeyParaPosibleAtras) {
		this.lIdAsistenciaActualForeignKeyParaPosibleAtras = lIdAsistenciaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAsistenciaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAsistencia() {
		return sUltimaBusquedaAsistencia;
	}

	public void setsUltimaBusquedaAsistencia(String sUltimaBusquedaAsistencia) {
		this.sUltimaBusquedaAsistencia = sUltimaBusquedaAsistencia;
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
			
    
	public Long getid() {
		return this.id;
	}
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_asistencia() {
		return this.id_tipo_asistencia;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("Asistencia:Valor nulo no permitido en columna id");
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
					newid_empresa=0L;
					System.out.println("Asistencia:Valor nulo no permitido en columna id_empresa");
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
					newid_empleado=0L;
					System.out.println("Asistencia:Valor nulo no permitido en columna id_empleado");
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_asistencia(Long newid_tipo_asistencia)throws Exception
	{
		try {
			if(this.id_tipo_asistencia!=newid_tipo_asistencia) {
				if(newid_tipo_asistencia==null) {
					newid_tipo_asistencia=0L;
					System.out.println("Asistencia:Valor nulo no permitido en columna id_tipo_asistencia");
				}

				this.id_tipo_asistencia=newid_tipo_asistencia;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAsistencia() {
		return isBusquedaDesdeForeignKeySesionTipoAsistencia;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAsistencia(
		Boolean isBusquedaDesdeForeignKeySesionTipoAsistencia) {
		this.isBusquedaDesdeForeignKeySesionTipoAsistencia = isBusquedaDesdeForeignKeySesionTipoAsistencia;
	}

	public Long getlidTipoAsistenciaActual() {
		return lidTipoAsistenciaActual;
	}

	public void setlidTipoAsistenciaActual(Long lidTipoAsistenciaActual) {
		this.lidTipoAsistenciaActual = lidTipoAsistenciaActual;
	}
	
	
		
	
}
