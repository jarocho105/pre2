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
public class CuentaFlujoCajaSessionBean  extends CuentaFlujoCajaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja;
	protected Long lIdCuentaFlujoCajaActualForeignKey;	
	
	protected Long lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras;
	protected String sUltimaBusquedaCuentaFlujoCaja;
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
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionDia;
	Long lidDiaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private String nombre;
	private Long id_mes;
	private Long id_dia;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaFlujoCajaSessionBeanAdditional cuentaflujocajaSessionBeanAdditional=null;
	
	public CuentaFlujoCajaSessionBeanAdditional getCuentaFlujoCajaSessionBeanAdditional() {
		return this.cuentaflujocajaSessionBeanAdditional;
	}
	
	public void setCuentaFlujoCajaSessionBeanAdditional(CuentaFlujoCajaSessionBeanAdditional cuentaflujocajaSessionBeanAdditional) {
		try {
			this.cuentaflujocajaSessionBeanAdditional=cuentaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaFlujoCajaSessionBean () {
		this.inicializarCuentaFlujoCajaSessionBean();
	}
	
	public void inicializarCuentaFlujoCajaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja=false;
		this.lIdCuentaFlujoCajaActualForeignKey=0L;
		this.lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaFlujoCaja ="";
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
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionDia=false;
		lidDiaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.nombre="";
 		this.id_mes=null;
 		this.id_dia=-1L;
 		this.id_cuenta_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja= isPermiteNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaFlujoCaja;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja= isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja;
	}
					
	public Long getlIdCuentaFlujoCajaActualForeignKey() {
		return lIdCuentaFlujoCajaActualForeignKey;
	}

	public void setlIdCuentaFlujoCajaActualForeignKey(
			Long lIdCuentaFlujoCajaActualForeignKey) {
		this.lIdCuentaFlujoCajaActualForeignKey = lIdCuentaFlujoCajaActualForeignKey;
	}
				    
	public Long getlIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras() {
		return lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras(
			Long lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras = lIdCuentaFlujoCajaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCajaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaFlujoCaja() {
		return sUltimaBusquedaCuentaFlujoCaja;
	}

	public void setsUltimaBusquedaCuentaFlujoCaja(String sUltimaBusquedaCuentaFlujoCaja) {
		this.sUltimaBusquedaCuentaFlujoCaja = sUltimaBusquedaCuentaFlujoCaja;
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
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_dia() {
		return this.id_dia;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaFlujoCaja:Valor nulo no permitido en columna id");
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
						System.out.println("CuentaFlujoCaja:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CuentaFlujoCaja:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("CuentaFlujoCaja:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_dia(Long newid_dia)throws Exception
	{
		try {
			if(this.id_dia!=newid_dia) {
				if(newid_dia==null) {
					//newid_dia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaFlujoCaja:Valor nulo no permitido en columna id_dia");
					}
				}

				this.id_dia=newid_dia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaFlujoCaja:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionDia() {
		return isBusquedaDesdeForeignKeySesionDia;
	}

	public void setisBusquedaDesdeForeignKeySesionDia(
		Boolean isBusquedaDesdeForeignKeySesionDia) {
		this.isBusquedaDesdeForeignKeySesionDia = isBusquedaDesdeForeignKeySesionDia;
	}

	public Long getlidDiaActual() {
		return lidDiaActual;
	}

	public void setlidDiaActual(Long lidDiaActual) {
		this.lidDiaActual = lidDiaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	
	
		
	
}
