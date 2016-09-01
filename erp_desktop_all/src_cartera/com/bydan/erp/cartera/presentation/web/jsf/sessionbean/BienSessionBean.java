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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class BienSessionBean  extends BienSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBien;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBien;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBien;
	protected Long lIdBienActualForeignKey;	
	
	protected Long lIdBienActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras;
	protected String sUltimaBusquedaBien;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoBien;
	Long lidTipoBienActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_tipobien;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BienSessionBeanAdditional bienSessionBeanAdditional=null;
	
	public BienSessionBeanAdditional getBienSessionBeanAdditional() {
		return this.bienSessionBeanAdditional;
	}
	
	public void setBienSessionBeanAdditional(BienSessionBeanAdditional bienSessionBeanAdditional) {
		try {
			this.bienSessionBeanAdditional=bienSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BienSessionBean () {
		this.inicializarBienSessionBean();
	}
	
	public void inicializarBienSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBien=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBien="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBien=false;
		this.lIdBienActualForeignKey=0L;
		this.lIdBienActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras=false;
		this.sUltimaBusquedaBien ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoBien=false;
		lidTipoBienActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.id_tipobien=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBien() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBien;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBien(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBien) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBien= isPermiteNavegacionHaciaForeignKeyDesdeBien;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBien() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBien;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBien(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBien) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBien = sNombrePaginaNavegacionHaciaForeignKeyDesdeBien;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBien() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBien;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBien(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBien) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBien= isBusquedaDesdeForeignKeySesionForeignKeyBien;
	}
					
	public Long getlIdBienActualForeignKey() {
		return lIdBienActualForeignKey;
	}

	public void setlIdBienActualForeignKey(
			Long lIdBienActualForeignKey) {
		this.lIdBienActualForeignKey = lIdBienActualForeignKey;
	}
				    
	public Long getlIdBienActualForeignKeyParaPosibleAtras() {
		return lIdBienActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBienActualForeignKeyParaPosibleAtras(
			Long lIdBienActualForeignKeyParaPosibleAtras) {
		this.lIdBienActualForeignKeyParaPosibleAtras = lIdBienActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBienParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBien() {
		return sUltimaBusquedaBien;
	}

	public void setsUltimaBusquedaBien(String sUltimaBusquedaBien) {
		this.sUltimaBusquedaBien = sUltimaBusquedaBien;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipobien() {
		return this.id_tipobien;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bien:Valor nulo no permitido en columna id");
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
						System.out.println("Bien:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bien:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipobien(Long newid_tipobien)throws Exception
	{
		try {
			if(this.id_tipobien!=newid_tipobien) {
				if(newid_tipobien==null) {
					//newid_tipobien=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Bien:Valor nulo no permitido en columna id_tipobien");
					}
				}

				this.id_tipobien=newid_tipobien;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoBien() {
		return isBusquedaDesdeForeignKeySesionTipoBien;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoBien(
		Boolean isBusquedaDesdeForeignKeySesionTipoBien) {
		this.isBusquedaDesdeForeignKeySesionTipoBien = isBusquedaDesdeForeignKeySesionTipoBien;
	}

	public Long getlidTipoBienActual() {
		return lidTipoBienActual;
	}

	public void setlidTipoBienActual(Long lidTipoBienActual) {
		this.lidTipoBienActual = lidTipoBienActual;
	}
	
	
		
	
}
