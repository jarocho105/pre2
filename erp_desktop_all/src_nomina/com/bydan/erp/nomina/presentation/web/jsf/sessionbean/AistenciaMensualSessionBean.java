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
public class AistenciaMensualSessionBean {
	private Boolean isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	private Boolean isPermiteRecargarInformacion;
	private String sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual;
	private Long lIdAistenciaMensualActualForeignKey;	
	
	private Long lIdAistenciaMensualActualForeignKeyParaPosibleAtras;
	private Boolean isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras;
	private String sUltimaBusquedaAistenciaMensual;
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
	
	private Long id;
	private Long id_empresa;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	
					
	 	
		
	public AistenciaMensualSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual=false;
		this.lIdAistenciaMensualActualForeignKey=0L;
		this.lIdAistenciaMensualActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras=false;
		this.sUltimaBusquedaAistenciaMensual ="";
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
		
		
		
 		this.id_empresa=0L;
 		this.id_empleado=0L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual= isPermiteNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual = sNombrePaginaNavegacionHaciaForeignKeyDesdeAistenciaMensual;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual= isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensual;
	}
					
	public Long getlIdAistenciaMensualActualForeignKey() {
		return lIdAistenciaMensualActualForeignKey;
	}

	public void setlIdAistenciaMensualActualForeignKey(
			Long lIdAistenciaMensualActualForeignKey) {
		this.lIdAistenciaMensualActualForeignKey = lIdAistenciaMensualActualForeignKey;
	}
				    
	public Long getlIdAistenciaMensualActualForeignKeyParaPosibleAtras() {
		return lIdAistenciaMensualActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAistenciaMensualActualForeignKeyParaPosibleAtras(
			Long lIdAistenciaMensualActualForeignKeyParaPosibleAtras) {
		this.lIdAistenciaMensualActualForeignKeyParaPosibleAtras = lIdAistenciaMensualActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAistenciaMensualParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAistenciaMensual() {
		return sUltimaBusquedaAistenciaMensual;
	}

	public void setsUltimaBusquedaAistenciaMensual(String sUltimaBusquedaAistenciaMensual) {
		this.sUltimaBusquedaAistenciaMensual = sUltimaBusquedaAistenciaMensual;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					newid=0L;
					System.out.println("AistenciaMensual:Valor nulo no permitido en columna id");
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
					System.out.println("AistenciaMensual:Valor nulo no permitido en columna id_empresa");
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
					System.out.println("AistenciaMensual:Valor nulo no permitido en columna id_empleado");
				}

				this.id_empleado=newid_empleado;
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
	
	
		
	
}
