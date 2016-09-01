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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class TipoDocumentoGeneralSessionBean  extends TipoDocumentoGeneralSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral;
	protected Long lIdTipoDocumentoGeneralActualForeignKey;	
	
	protected Long lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras;
	protected String sUltimaBusquedaTipoDocumentoGeneral;
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
	
	
	
	private Long id;
	private String codigo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoDocumentoGeneralSessionBeanAdditional tipodocumentogeneralSessionBeanAdditional=null;
	
	public TipoDocumentoGeneralSessionBeanAdditional getTipoDocumentoGeneralSessionBeanAdditional() {
		return this.tipodocumentogeneralSessionBeanAdditional;
	}
	
	public void setTipoDocumentoGeneralSessionBeanAdditional(TipoDocumentoGeneralSessionBeanAdditional tipodocumentogeneralSessionBeanAdditional) {
		try {
			this.tipodocumentogeneralSessionBeanAdditional=tipodocumentogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoDocumentoGeneralSessionBean () {
		this.inicializarTipoDocumentoGeneralSessionBean();
	}
	
	public void inicializarTipoDocumentoGeneralSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral=false;
		this.lIdTipoDocumentoGeneralActualForeignKey=0L;
		this.lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras=false;
		this.sUltimaBusquedaTipoDocumentoGeneral ="";
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
		
		 
		
		
		
 		this.codigo="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral= isPermiteNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumentoGeneral;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral= isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneral;
	}
					
	public Long getlIdTipoDocumentoGeneralActualForeignKey() {
		return lIdTipoDocumentoGeneralActualForeignKey;
	}

	public void setlIdTipoDocumentoGeneralActualForeignKey(
			Long lIdTipoDocumentoGeneralActualForeignKey) {
		this.lIdTipoDocumentoGeneralActualForeignKey = lIdTipoDocumentoGeneralActualForeignKey;
	}
				    
	public Long getlIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras() {
		return lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras(
			Long lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras) {
		this.lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras = lIdTipoDocumentoGeneralActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoDocumentoGeneralParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoDocumentoGeneral() {
		return sUltimaBusquedaTipoDocumentoGeneral;
	}

	public void setsUltimaBusquedaTipoDocumentoGeneral(String sUltimaBusquedaTipoDocumentoGeneral) {
		this.sUltimaBusquedaTipoDocumentoGeneral = sUltimaBusquedaTipoDocumentoGeneral;
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
    
	public String getcodigo() {
		return this.codigo;
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
						System.out.println("TipoDocumentoGeneral:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("TipoDocumentoGeneral:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("TipoDocumentoGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("TipoDocumentoGeneral:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("TipoDocumentoGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
