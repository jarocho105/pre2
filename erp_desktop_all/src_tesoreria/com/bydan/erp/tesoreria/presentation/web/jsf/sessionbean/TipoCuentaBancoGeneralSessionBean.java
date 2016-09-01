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
package com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.tesoreria.business.entity.*;

@SuppressWarnings("unused")
public class TipoCuentaBancoGeneralSessionBean  extends TipoCuentaBancoGeneralSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral;
	protected Long lIdTipoCuentaBancoGeneralActualForeignKey;	
	
	protected Long lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras;
	protected String sUltimaBusquedaTipoCuentaBancoGeneral;
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
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	Long lidTipoCuentaBancoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_banco;
	private Long id_tipo_cuenta_banco;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoCuentaBancoGeneralSessionBeanAdditional tipocuentabancogeneralSessionBeanAdditional=null;
	
	public TipoCuentaBancoGeneralSessionBeanAdditional getTipoCuentaBancoGeneralSessionBeanAdditional() {
		return this.tipocuentabancogeneralSessionBeanAdditional;
	}
	
	public void setTipoCuentaBancoGeneralSessionBeanAdditional(TipoCuentaBancoGeneralSessionBeanAdditional tipocuentabancogeneralSessionBeanAdditional) {
		try {
			this.tipocuentabancogeneralSessionBeanAdditional=tipocuentabancogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoCuentaBancoGeneralSessionBean () {
		this.inicializarTipoCuentaBancoGeneralSessionBean();
	}
	
	public void inicializarTipoCuentaBancoGeneralSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral=false;
		this.lIdTipoCuentaBancoGeneralActualForeignKey=0L;
		this.lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras=false;
		this.sUltimaBusquedaTipoCuentaBancoGeneral ="";
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
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBanco=false;
		lidTipoCuentaBancoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_banco=-1L;
 		this.id_tipo_cuenta_banco=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral= isPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral= isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneral;
	}
					
	public Long getlIdTipoCuentaBancoGeneralActualForeignKey() {
		return lIdTipoCuentaBancoGeneralActualForeignKey;
	}

	public void setlIdTipoCuentaBancoGeneralActualForeignKey(
			Long lIdTipoCuentaBancoGeneralActualForeignKey) {
		this.lIdTipoCuentaBancoGeneralActualForeignKey = lIdTipoCuentaBancoGeneralActualForeignKey;
	}
				    
	public Long getlIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras() {
		return lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras(
			Long lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras) {
		this.lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras = lIdTipoCuentaBancoGeneralActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGeneralParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoCuentaBancoGeneral() {
		return sUltimaBusquedaTipoCuentaBancoGeneral;
	}

	public void setsUltimaBusquedaTipoCuentaBancoGeneral(String sUltimaBusquedaTipoCuentaBancoGeneral) {
		this.sUltimaBusquedaTipoCuentaBancoGeneral = sUltimaBusquedaTipoCuentaBancoGeneral;
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
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_tipo_cuenta_banco() {
		return this.id_tipo_cuenta_banco;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCuentaBancoGeneral:Valor nulo no permitido en columna id");
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
						System.out.println("TipoCuentaBancoGeneral:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_banco(Long newid_banco)throws Exception
	{
		try {
			if(this.id_banco!=newid_banco) {
				if(newid_banco==null) {
					//newid_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCuentaBancoGeneral:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_banco(Long newid_tipo_cuenta_banco)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_banco!=newid_tipo_cuenta_banco) {
				if(newid_tipo_cuenta_banco==null) {
					//newid_tipo_cuenta_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCuentaBancoGeneral:Valor nulo no permitido en columna id_tipo_cuenta_banco");
					}
				}

				this.id_tipo_cuenta_banco=newid_tipo_cuenta_banco;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBanco() {
		return isBusquedaDesdeForeignKeySesionBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionBanco(
		Boolean isBusquedaDesdeForeignKeySesionBanco) {
		this.isBusquedaDesdeForeignKeySesionBanco = isBusquedaDesdeForeignKeySesionBanco;
	}

	public Long getlidBancoActual() {
		return lidBancoActual;
	}

	public void setlidBancoActual(Long lidBancoActual) {
		this.lidBancoActual = lidBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBanco = isBusquedaDesdeForeignKeySesionTipoCuentaBanco;
	}

	public Long getlidTipoCuentaBancoActual() {
		return lidTipoCuentaBancoActual;
	}

	public void setlidTipoCuentaBancoActual(Long lidTipoCuentaBancoActual) {
		this.lidTipoCuentaBancoActual = lidTipoCuentaBancoActual;
	}
	
	
		
	
}
