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
public class SubGrupoParametroFormularioIvaSessionBean  {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva;
	protected Long lIdSubGrupoParametroFormularioIvaActualForeignKey;	
	
	protected Long lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras;
	protected String sUltimaBusquedaSubGrupoParametroFormularioIva;
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
	
	private Long id;
	private Long id_empresa;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	public SubGrupoParametroFormularioIvaSessionBean () {
		this.inicializarSubGrupoParametroFormularioIvaSessionBean();
	}
	
	public void inicializarSubGrupoParametroFormularioIvaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva=false;
		this.lIdSubGrupoParametroFormularioIvaActualForeignKey=0L;
		this.lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras=false;
		this.sUltimaBusquedaSubGrupoParametroFormularioIva ="";
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
		
		
		
 		this.id_empresa=-1L;
 		this.nombre="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva= isPermiteNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva = sNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoParametroFormularioIva;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva() {
		return isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva= isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva;
	}
					
	public Long getlIdSubGrupoParametroFormularioIvaActualForeignKey() {
		return lIdSubGrupoParametroFormularioIvaActualForeignKey;
	}

	public void setlIdSubGrupoParametroFormularioIvaActualForeignKey(
			Long lIdSubGrupoParametroFormularioIvaActualForeignKey) {
		this.lIdSubGrupoParametroFormularioIvaActualForeignKey = lIdSubGrupoParametroFormularioIvaActualForeignKey;
	}
				    
	public Long getlIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras() {
		return lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras(
			Long lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras) {
		this.lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras = lIdSubGrupoParametroFormularioIvaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIvaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSubGrupoParametroFormularioIva() {
		return sUltimaBusquedaSubGrupoParametroFormularioIva;
	}

	public void setsUltimaBusquedaSubGrupoParametroFormularioIva(String sUltimaBusquedaSubGrupoParametroFormularioIva) {
		this.sUltimaBusquedaSubGrupoParametroFormularioIva = sUltimaBusquedaSubGrupoParametroFormularioIva;
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
    
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubGrupoParametroFormularioIva:Valor nulo no permitido en columna id");
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
						System.out.println("SubGrupoParametroFormularioIva:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("SubGrupoParametroFormularioIva:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("SubGrupoParametroFormularioIva:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
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
	
	
		
	
}
