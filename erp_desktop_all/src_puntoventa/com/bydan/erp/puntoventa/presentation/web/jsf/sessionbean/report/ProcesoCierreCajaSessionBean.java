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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoCierreCajaSessionBean  extends ProcesoCierreCajaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja;
	protected Long lIdProcesoCierreCajaActualForeignKey;	
	
	protected Long lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras;
	protected String sUltimaBusquedaProcesoCierreCaja;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCaja;
	Long lidCajaActual;
	
	private Long id;
	private Long id_usuario;
	private Long id_caja;
	private Date fecha;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoCierreCajaSessionBeanAdditional procesocierrecajaSessionBeanAdditional=null;
	
	public ProcesoCierreCajaSessionBeanAdditional getProcesoCierreCajaSessionBeanAdditional() {
		return this.procesocierrecajaSessionBeanAdditional;
	}
	
	public void setProcesoCierreCajaSessionBeanAdditional(ProcesoCierreCajaSessionBeanAdditional procesocierrecajaSessionBeanAdditional) {
		try {
			this.procesocierrecajaSessionBeanAdditional=procesocierrecajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoCierreCajaSessionBean () {
		this.inicializarProcesoCierreCajaSessionBean();
	}
	
	public void inicializarProcesoCierreCajaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja=false;
		this.lIdProcesoCierreCajaActualForeignKey=0L;
		this.lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoCierreCaja ="";
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
		
		
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionCaja=false;
		lidCajaActual=0L; 
		
		
		
 		this.id_usuario=-1L;
 		this.id_caja=-1L;
 		this.fecha=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja= isPermiteNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoCierreCaja;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja= isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCaja;
	}
					
	public Long getlIdProcesoCierreCajaActualForeignKey() {
		return lIdProcesoCierreCajaActualForeignKey;
	}

	public void setlIdProcesoCierreCajaActualForeignKey(
			Long lIdProcesoCierreCajaActualForeignKey) {
		this.lIdProcesoCierreCajaActualForeignKey = lIdProcesoCierreCajaActualForeignKey;
	}
				    
	public Long getlIdProcesoCierreCajaActualForeignKeyParaPosibleAtras() {
		return lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoCierreCajaActualForeignKeyParaPosibleAtras(
			Long lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras = lIdProcesoCierreCajaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoCierreCajaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoCierreCaja() {
		return sUltimaBusquedaProcesoCierreCaja;
	}

	public void setsUltimaBusquedaProcesoCierreCaja(String sUltimaBusquedaProcesoCierreCaja) {
		this.sUltimaBusquedaProcesoCierreCaja = sUltimaBusquedaProcesoCierreCaja;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_caja() {
		return this.id_caja;
	}
    
	public Date getfecha() {
		return this.fecha;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreCaja:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreCaja:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_caja(Long newid_caja)throws Exception
	{
		try {
			if(this.id_caja!=newid_caja) {
				if(newid_caja==null) {
					//newid_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreCaja:Valor nulo no permitido en columna id_caja");
					}
				}

				this.id_caja=newid_caja;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha(Date newfecha)throws Exception
	{
		try {
			if(this.fecha!=newfecha) {
				if(newfecha==null) {
					//newfecha=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoCierreCaja:Valor nulo no permitido en columna fecha");
					}
				}

				this.fecha=newfecha;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCaja() {
		return isBusquedaDesdeForeignKeySesionCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionCaja(
		Boolean isBusquedaDesdeForeignKeySesionCaja) {
		this.isBusquedaDesdeForeignKeySesionCaja = isBusquedaDesdeForeignKeySesionCaja;
	}

	public Long getlidCajaActual() {
		return lidCajaActual;
	}

	public void setlidCajaActual(Long lidCajaActual) {
		this.lidCajaActual = lidCajaActual;
	}
	
	
		
	
}
