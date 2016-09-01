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
package com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.nomina.business.entity.*;

@SuppressWarnings("unused")
public class ProcesoBancoNominaSessionBean  extends ProcesoBancoNominaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina;
	protected Long lIdProcesoBancoNominaActualForeignKey;	
	
	protected Long lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras;
	protected String sUltimaBusquedaProcesoBancoNomina;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaBanco;
	Long lidCuentaBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoContrato;
	Long lidTipoContratoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoBancoDisco;
	Long lidTipoBancoDiscoActual;
	
	private Long id;
	private Long id_banco;
	private Long id_cuenta_banco;
	private Long id_tipo_contrato;
	private Long id_tipo_banco_disco;
	private Boolean con_otros;
	private Boolean con_internet;
	private Date fecha;
	private Integer numero_secuenciales;
	private Boolean genera_texto;
	private Boolean genera_excel;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProcesoBancoNominaSessionBeanAdditional procesobanconominaSessionBeanAdditional=null;
	
	public ProcesoBancoNominaSessionBeanAdditional getProcesoBancoNominaSessionBeanAdditional() {
		return this.procesobanconominaSessionBeanAdditional;
	}
	
	public void setProcesoBancoNominaSessionBeanAdditional(ProcesoBancoNominaSessionBeanAdditional procesobanconominaSessionBeanAdditional) {
		try {
			this.procesobanconominaSessionBeanAdditional=procesobanconominaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProcesoBancoNominaSessionBean () {
		this.inicializarProcesoBancoNominaSessionBean();
	}
	
	public void inicializarProcesoBancoNominaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina=false;
		this.lIdProcesoBancoNominaActualForeignKey=0L;
		this.lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras=false;
		this.sUltimaBusquedaProcesoBancoNomina ="";
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
		
		
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaBanco=false;
		lidCuentaBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoContrato=false;
		lidTipoContratoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoBancoDisco=false;
		lidTipoBancoDiscoActual=0L; 
		
		
		
 		this.id_banco=-1L;
 		this.id_cuenta_banco=-1L;
 		this.id_tipo_contrato=-1L;
 		this.id_tipo_banco_disco=-1L;
 		this.con_otros=false;
 		this.con_internet=false;
 		this.fecha=new Date();
 		this.numero_secuenciales=0;
 		this.genera_texto=false;
 		this.genera_excel=false;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina= isPermiteNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina = sNombrePaginaNavegacionHaciaForeignKeyDesdeProcesoBancoNomina;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina= isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNomina;
	}
					
	public Long getlIdProcesoBancoNominaActualForeignKey() {
		return lIdProcesoBancoNominaActualForeignKey;
	}

	public void setlIdProcesoBancoNominaActualForeignKey(
			Long lIdProcesoBancoNominaActualForeignKey) {
		this.lIdProcesoBancoNominaActualForeignKey = lIdProcesoBancoNominaActualForeignKey;
	}
				    
	public Long getlIdProcesoBancoNominaActualForeignKeyParaPosibleAtras() {
		return lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProcesoBancoNominaActualForeignKeyParaPosibleAtras(
			Long lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras) {
		this.lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras = lIdProcesoBancoNominaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProcesoBancoNominaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProcesoBancoNomina() {
		return sUltimaBusquedaProcesoBancoNomina;
	}

	public void setsUltimaBusquedaProcesoBancoNomina(String sUltimaBusquedaProcesoBancoNomina) {
		this.sUltimaBusquedaProcesoBancoNomina = sUltimaBusquedaProcesoBancoNomina;
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
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_cuenta_banco() {
		return this.id_cuenta_banco;
	}
    
	public Long getid_tipo_contrato() {
		return this.id_tipo_contrato;
	}
    
	public Long getid_tipo_banco_disco() {
		return this.id_tipo_banco_disco;
	}
    
	public Boolean getcon_otros() {
		return this.con_otros;
	}
    
	public Boolean getcon_internet() {
		return this.con_internet;
	}
    
	public Date getfecha() {
		return this.fecha;
	}
    
	public Integer getnumero_secuenciales() {
		return this.numero_secuenciales;
	}
    
	public Boolean getgenera_texto() {
		return this.genera_texto;
	}
    
	public Boolean getgenera_excel() {
		return this.genera_excel;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_banco(Long newid_cuenta_banco)throws Exception
	{
		try {
			if(this.id_cuenta_banco!=newid_cuenta_banco) {
				if(newid_cuenta_banco==null) {
					//newid_cuenta_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna id_cuenta_banco");
					}
				}

				this.id_cuenta_banco=newid_cuenta_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_contrato(Long newid_tipo_contrato)throws Exception
	{
		try {
			if(this.id_tipo_contrato!=newid_tipo_contrato) {
				if(newid_tipo_contrato==null) {
					//newid_tipo_contrato=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna id_tipo_contrato");
					}
				}

				this.id_tipo_contrato=newid_tipo_contrato;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_banco_disco(Long newid_tipo_banco_disco)throws Exception
	{
		try {
			if(this.id_tipo_banco_disco!=newid_tipo_banco_disco) {
				if(newid_tipo_banco_disco==null) {
					//newid_tipo_banco_disco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna id_tipo_banco_disco");
					}
				}

				this.id_tipo_banco_disco=newid_tipo_banco_disco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_otros(Boolean newcon_otros)throws Exception
	{
		try {
			if(this.con_otros!=newcon_otros) {
				if(newcon_otros==null) {
					//newcon_otros=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna con_otros");
					}
				}

				this.con_otros=newcon_otros;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_internet(Boolean newcon_internet)throws Exception
	{
		try {
			if(this.con_internet!=newcon_internet) {
				if(newcon_internet==null) {
					//newcon_internet=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna con_internet");
					}
				}

				this.con_internet=newcon_internet;
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
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna fecha");
					}
				}

				this.fecha=newfecha;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_secuenciales(Integer newnumero_secuenciales)throws Exception
	{
		try {
			if(this.numero_secuenciales!=newnumero_secuenciales) {
				if(newnumero_secuenciales==null) {
					//newnumero_secuenciales=0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna numero_secuenciales");
					}
				}

				this.numero_secuenciales=newnumero_secuenciales;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setgenera_texto(Boolean newgenera_texto)throws Exception
	{
		try {
			if(this.genera_texto!=newgenera_texto) {
				if(newgenera_texto==null) {
					//newgenera_texto=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna genera_texto");
					}
				}

				this.genera_texto=newgenera_texto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setgenera_excel(Boolean newgenera_excel)throws Exception
	{
		try {
			if(this.genera_excel!=newgenera_excel) {
				if(newgenera_excel==null) {
					//newgenera_excel=false;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoBancoNomina:Valor nulo no permitido en columna genera_excel");
					}
				}

				this.genera_excel=newgenera_excel;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaBanco(
		Boolean isBusquedaDesdeForeignKeySesionCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionCuentaBanco = isBusquedaDesdeForeignKeySesionCuentaBanco;
	}

	public Long getlidCuentaBancoActual() {
		return lidCuentaBancoActual;
	}

	public void setlidCuentaBancoActual(Long lidCuentaBancoActual) {
		this.lidCuentaBancoActual = lidCuentaBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoContrato() {
		return isBusquedaDesdeForeignKeySesionTipoContrato;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoContrato(
		Boolean isBusquedaDesdeForeignKeySesionTipoContrato) {
		this.isBusquedaDesdeForeignKeySesionTipoContrato = isBusquedaDesdeForeignKeySesionTipoContrato;
	}

	public Long getlidTipoContratoActual() {
		return lidTipoContratoActual;
	}

	public void setlidTipoContratoActual(Long lidTipoContratoActual) {
		this.lidTipoContratoActual = lidTipoContratoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoBancoDisco() {
		return isBusquedaDesdeForeignKeySesionTipoBancoDisco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoBancoDisco(
		Boolean isBusquedaDesdeForeignKeySesionTipoBancoDisco) {
		this.isBusquedaDesdeForeignKeySesionTipoBancoDisco = isBusquedaDesdeForeignKeySesionTipoBancoDisco;
	}

	public Long getlidTipoBancoDiscoActual() {
		return lidTipoBancoDiscoActual;
	}

	public void setlidTipoBancoDiscoActual(Long lidTipoBancoDiscoActual) {
		this.lidTipoBancoDiscoActual = lidTipoBancoDiscoActual;
	}
	
	
		
	
}
