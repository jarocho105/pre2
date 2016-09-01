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
public class PuertoSessionBean  extends PuertoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePuerto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPuerto;
	protected Long lIdPuertoActualForeignKey;	
	
	protected Long lIdPuertoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras;
	protected String sUltimaBusquedaPuerto;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionTipoPuerto;
	Long lidTipoPuertoActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	
	private Long id;
	private Long id_tipo_puerto;
	private Long id_pais;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PuertoSessionBeanAdditional puertoSessionBeanAdditional=null;
	
	public PuertoSessionBeanAdditional getPuertoSessionBeanAdditional() {
		return this.puertoSessionBeanAdditional;
	}
	
	public void setPuertoSessionBeanAdditional(PuertoSessionBeanAdditional puertoSessionBeanAdditional) {
		try {
			this.puertoSessionBeanAdditional=puertoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PuertoSessionBean () {
		this.inicializarPuertoSessionBean();
	}
	
	public void inicializarPuertoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePuerto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPuerto=false;
		this.lIdPuertoActualForeignKey=0L;
		this.lIdPuertoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras=false;
		this.sUltimaBusquedaPuerto ="";
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
		
		
		isBusquedaDesdeForeignKeySesionTipoPuerto=false;
		lidTipoPuertoActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L; 
		
		
		
 		this.id_tipo_puerto=-1L;
 		this.id_pais=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePuerto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePuerto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePuerto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePuerto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePuerto= isPermiteNavegacionHaciaForeignKeyDesdePuerto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePuerto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePuerto(String sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto = sNombrePaginaNavegacionHaciaForeignKeyDesdePuerto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPuerto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPuerto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPuerto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPuerto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPuerto= isBusquedaDesdeForeignKeySesionForeignKeyPuerto;
	}
					
	public Long getlIdPuertoActualForeignKey() {
		return lIdPuertoActualForeignKey;
	}

	public void setlIdPuertoActualForeignKey(
			Long lIdPuertoActualForeignKey) {
		this.lIdPuertoActualForeignKey = lIdPuertoActualForeignKey;
	}
				    
	public Long getlIdPuertoActualForeignKeyParaPosibleAtras() {
		return lIdPuertoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPuertoActualForeignKeyParaPosibleAtras(
			Long lIdPuertoActualForeignKeyParaPosibleAtras) {
		this.lIdPuertoActualForeignKeyParaPosibleAtras = lIdPuertoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPuertoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPuerto() {
		return sUltimaBusquedaPuerto;
	}

	public void setsUltimaBusquedaPuerto(String sUltimaBusquedaPuerto) {
		this.sUltimaBusquedaPuerto = sUltimaBusquedaPuerto;
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
    
	public Long getid_tipo_puerto() {
		return this.id_tipo_puerto;
	}
    
	public Long getid_pais() {
		return this.id_pais;
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
						System.out.println("Puerto:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_puerto(Long newid_tipo_puerto)throws Exception
	{
		try {
			if(this.id_tipo_puerto!=newid_tipo_puerto) {
				if(newid_tipo_puerto==null) {
					//newid_tipo_puerto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Puerto:Valor nulo no permitido en columna id_tipo_puerto");
					}
				}

				this.id_tipo_puerto=newid_tipo_puerto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Puerto:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
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
						System.out.println("Puerto:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Puerto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPuerto() {
		return isBusquedaDesdeForeignKeySesionTipoPuerto;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPuerto(
		Boolean isBusquedaDesdeForeignKeySesionTipoPuerto) {
		this.isBusquedaDesdeForeignKeySesionTipoPuerto = isBusquedaDesdeForeignKeySesionTipoPuerto;
	}

	public Long getlidTipoPuertoActual() {
		return lidTipoPuertoActual;
	}

	public void setlidTipoPuertoActual(Long lidTipoPuertoActual) {
		this.lidTipoPuertoActual = lidTipoPuertoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	
	
		
	
}
