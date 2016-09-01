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
public class FormularioRentaExtraSessionBean  extends FormularioRentaExtraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra;
	protected Long lIdFormularioRentaExtraActualForeignKey;	
	
	protected Long lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras;
	protected String sUltimaBusquedaFormularioRentaExtra;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	Long lidDatoFormularioRentaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormaPago;
	Long lidFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_dato_formulario_renta;
	private Long id_forma_pago;
	private Long id_banco;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormularioRentaExtraSessionBeanAdditional formulariorentaextraSessionBeanAdditional=null;
	
	public FormularioRentaExtraSessionBeanAdditional getFormularioRentaExtraSessionBeanAdditional() {
		return this.formulariorentaextraSessionBeanAdditional;
	}
	
	public void setFormularioRentaExtraSessionBeanAdditional(FormularioRentaExtraSessionBeanAdditional formulariorentaextraSessionBeanAdditional) {
		try {
			this.formulariorentaextraSessionBeanAdditional=formulariorentaextraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormularioRentaExtraSessionBean () {
		this.inicializarFormularioRentaExtraSessionBean();
	}
	
	public void inicializarFormularioRentaExtraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra=false;
		this.lIdFormularioRentaExtraActualForeignKey=0L;
		this.lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras=false;
		this.sUltimaBusquedaFormularioRentaExtra ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionDatoFormularioRenta=false;
		lidDatoFormularioRentaActual=0L;
		isBusquedaDesdeForeignKeySesionFormaPago=false;
		lidFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_dato_formulario_renta=-1L;
 		this.id_forma_pago=-1L;
 		this.id_banco=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra= isPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra= isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtra;
	}
					
	public Long getlIdFormularioRentaExtraActualForeignKey() {
		return lIdFormularioRentaExtraActualForeignKey;
	}

	public void setlIdFormularioRentaExtraActualForeignKey(
			Long lIdFormularioRentaExtraActualForeignKey) {
		this.lIdFormularioRentaExtraActualForeignKey = lIdFormularioRentaExtraActualForeignKey;
	}
				    
	public Long getlIdFormularioRentaExtraActualForeignKeyParaPosibleAtras() {
		return lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormularioRentaExtraActualForeignKeyParaPosibleAtras(
			Long lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras) {
		this.lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras = lIdFormularioRentaExtraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormularioRentaExtraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormularioRentaExtra() {
		return sUltimaBusquedaFormularioRentaExtra;
	}

	public void setsUltimaBusquedaFormularioRentaExtra(String sUltimaBusquedaFormularioRentaExtra) {
		this.sUltimaBusquedaFormularioRentaExtra = sUltimaBusquedaFormularioRentaExtra;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_dato_formulario_renta() {
		return this.id_dato_formulario_renta;
	}
    
	public Long getid_forma_pago() {
		return this.id_forma_pago;
	}
    
	public Long getid_banco() {
		return this.id_banco;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id");
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
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_dato_formulario_renta(Long newid_dato_formulario_renta)throws Exception
	{
		try {
			if(this.id_dato_formulario_renta!=newid_dato_formulario_renta) {
				if(newid_dato_formulario_renta==null) {
					//newid_dato_formulario_renta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_dato_formulario_renta");
					}
				}

				this.id_dato_formulario_renta=newid_dato_formulario_renta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_forma_pago(Long newid_forma_pago)throws Exception
	{
		try {
			if(this.id_forma_pago!=newid_forma_pago) {
				if(newid_forma_pago==null) {
					//newid_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_forma_pago");
					}
				}

				this.id_forma_pago=newid_forma_pago;
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
						System.out.println("FormularioRentaExtra:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDatoFormularioRenta() {
		return isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	}

	public void setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(
		Boolean isBusquedaDesdeForeignKeySesionDatoFormularioRenta) {
		this.isBusquedaDesdeForeignKeySesionDatoFormularioRenta = isBusquedaDesdeForeignKeySesionDatoFormularioRenta;
	}

	public Long getlidDatoFormularioRentaActual() {
		return lidDatoFormularioRentaActual;
	}

	public void setlidDatoFormularioRentaActual(Long lidDatoFormularioRentaActual) {
		this.lidDatoFormularioRentaActual = lidDatoFormularioRentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormaPago() {
		return isBusquedaDesdeForeignKeySesionFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionFormaPago) {
		this.isBusquedaDesdeForeignKeySesionFormaPago = isBusquedaDesdeForeignKeySesionFormaPago;
	}

	public Long getlidFormaPagoActual() {
		return lidFormaPagoActual;
	}

	public void setlidFormaPagoActual(Long lidFormaPagoActual) {
		this.lidFormaPagoActual = lidFormaPagoActual;
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
	
	
		
	
}
