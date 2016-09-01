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
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class ModuloSessionBean  extends ModuloSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeModulo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModulo;
	protected Long lIdModuloActualForeignKey;	
	
	protected Long lIdModuloActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras;
	protected String sUltimaBusquedaModulo;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionSistema;
	Long lidSistemaActual;
	Boolean isBusquedaDesdeForeignKeySesionPaquete;
	Long lidPaqueteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	Long lidTipoTeclaMascaraActual;
	
	private Long id;
	private Long id_sistema;
	private Long id_paquete;
	private String nombre;
	private Long id_tipo_tecla_mascara;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ModuloSessionBeanAdditional moduloSessionBeanAdditional=null;
	
	public ModuloSessionBeanAdditional getModuloSessionBeanAdditional() {
		return this.moduloSessionBeanAdditional;
	}
	
	public void setModuloSessionBeanAdditional(ModuloSessionBeanAdditional moduloSessionBeanAdditional) {
		try {
			this.moduloSessionBeanAdditional=moduloSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ModuloSessionBean () {
		this.inicializarModuloSessionBean();
	}
	
	public void inicializarModuloSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeModulo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyModulo=false;
		this.lIdModuloActualForeignKey=0L;
		this.lIdModuloActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras=false;
		this.sUltimaBusquedaModulo ="";
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
		
		
		isBusquedaDesdeForeignKeySesionSistema=false;
		lidSistemaActual=0L;
		isBusquedaDesdeForeignKeySesionPaquete=false;
		lidPaqueteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTeclaMascara=false;
		lidTipoTeclaMascaraActual=0L; 
		
		
		
 		this.id_sistema=-1L;
 		this.id_paquete=-1L;
 		this.nombre="";
 		this.id_tipo_tecla_mascara=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeModulo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeModulo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeModulo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeModulo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeModulo= isPermiteNavegacionHaciaForeignKeyDesdeModulo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeModulo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeModulo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo = sNombrePaginaNavegacionHaciaForeignKeyDesdeModulo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModulo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModulo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModulo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModulo= isBusquedaDesdeForeignKeySesionForeignKeyModulo;
	}
					
	public Long getlIdModuloActualForeignKey() {
		return lIdModuloActualForeignKey;
	}

	public void setlIdModuloActualForeignKey(
			Long lIdModuloActualForeignKey) {
		this.lIdModuloActualForeignKey = lIdModuloActualForeignKey;
	}
				    
	public Long getlIdModuloActualForeignKeyParaPosibleAtras() {
		return lIdModuloActualForeignKeyParaPosibleAtras;
	}

	public void setlIdModuloActualForeignKeyParaPosibleAtras(
			Long lIdModuloActualForeignKeyParaPosibleAtras) {
		this.lIdModuloActualForeignKeyParaPosibleAtras = lIdModuloActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyModuloParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaModulo() {
		return sUltimaBusquedaModulo;
	}

	public void setsUltimaBusquedaModulo(String sUltimaBusquedaModulo) {
		this.sUltimaBusquedaModulo = sUltimaBusquedaModulo;
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
    
	public Long getid_sistema() {
		return this.id_sistema;
	}
    
	public Long getid_paquete() {
		return this.id_paquete;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_tipo_tecla_mascara() {
		return this.id_tipo_tecla_mascara;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Modulo:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sistema(Long newid_sistema)throws Exception
	{
		try {
			if(this.id_sistema!=newid_sistema) {
				if(newid_sistema==null) {
					//newid_sistema=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Modulo:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_paquete(Long newid_paquete)throws Exception
	{
		try {
			if(this.id_paquete!=newid_paquete) {
				if(newid_paquete==null) {
					//newid_paquete=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Modulo:Valor nulo no permitido en columna id_paquete");
					}
				}

				this.id_paquete=newid_paquete;
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
						System.out.println("Modulo:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Modulo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tecla_mascara(Long newid_tipo_tecla_mascara)throws Exception
	{
		try {
			if(this.id_tipo_tecla_mascara!=newid_tipo_tecla_mascara) {
				if(newid_tipo_tecla_mascara==null) {
					//newid_tipo_tecla_mascara=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Modulo:Valor nulo no permitido en columna id_tipo_tecla_mascara");
					}
				}

				this.id_tipo_tecla_mascara=newid_tipo_tecla_mascara;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionSistema() {
		return isBusquedaDesdeForeignKeySesionSistema;
	}

	public void setisBusquedaDesdeForeignKeySesionSistema(
		Boolean isBusquedaDesdeForeignKeySesionSistema) {
		this.isBusquedaDesdeForeignKeySesionSistema = isBusquedaDesdeForeignKeySesionSistema;
	}

	public Long getlidSistemaActual() {
		return lidSistemaActual;
	}

	public void setlidSistemaActual(Long lidSistemaActual) {
		this.lidSistemaActual = lidSistemaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPaquete() {
		return isBusquedaDesdeForeignKeySesionPaquete;
	}

	public void setisBusquedaDesdeForeignKeySesionPaquete(
		Boolean isBusquedaDesdeForeignKeySesionPaquete) {
		this.isBusquedaDesdeForeignKeySesionPaquete = isBusquedaDesdeForeignKeySesionPaquete;
	}

	public Long getlidPaqueteActual() {
		return lidPaqueteActual;
	}

	public void setlidPaqueteActual(Long lidPaqueteActual) {
		this.lidPaqueteActual = lidPaqueteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTeclaMascara() {
		return isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTeclaMascara(
		Boolean isBusquedaDesdeForeignKeySesionTipoTeclaMascara) {
		this.isBusquedaDesdeForeignKeySesionTipoTeclaMascara = isBusquedaDesdeForeignKeySesionTipoTeclaMascara;
	}

	public Long getlidTipoTeclaMascaraActual() {
		return lidTipoTeclaMascaraActual;
	}

	public void setlidTipoTeclaMascaraActual(Long lidTipoTeclaMascaraActual) {
		this.lidTipoTeclaMascaraActual = lidTipoTeclaMascaraActual;
	}
	
	
		
	
}
