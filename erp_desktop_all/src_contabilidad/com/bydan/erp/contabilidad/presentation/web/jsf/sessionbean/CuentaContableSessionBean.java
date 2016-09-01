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
public class CuentaContableSessionBean  extends CuentaContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable;
	protected Long lIdCuentaContableActualForeignKey;	
	
	protected Long lIdCuentaContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras;
	protected String sUltimaBusquedaCuentaContable;
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
	Boolean isBusquedaDesdeForeignKeySesionNivelCuenta;
	Long lidNivelCuentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo;
	Long lidTipoIntervaloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo;
	Long lidTipoFlujoEfectivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private String codigo;
	private String nombre;
	private Long id_nivel_cuenta;
	private Long id_cuenta_contable;
	private Long id_centro_costo;
	private Long id_modulo;
	private Long id_moneda;
	private Long id_tipo_intervalo;
	private Long id_tipo_flujo_efectivo;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaContableSessionBeanAdditional cuentacontableSessionBeanAdditional=null;
	
	public CuentaContableSessionBeanAdditional getCuentaContableSessionBeanAdditional() {
		return this.cuentacontableSessionBeanAdditional;
	}
	
	public void setCuentaContableSessionBeanAdditional(CuentaContableSessionBeanAdditional cuentacontableSessionBeanAdditional) {
		try {
			this.cuentacontableSessionBeanAdditional=cuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaContableSessionBean () {
		this.inicializarCuentaContableSessionBean();
	}
	
	public void inicializarCuentaContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable=false;
		this.lIdCuentaContableActualForeignKey=0L;
		this.lIdCuentaContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaContable ="";
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
		isBusquedaDesdeForeignKeySesionNivelCuenta=false;
		lidNivelCuentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIntervalo=false;
		lidTipoIntervaloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo=false;
		lidTipoFlujoEfectivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.id_nivel_cuenta=-1L;
 		this.id_cuenta_contable=null;
 		this.id_centro_costo=null;
 		this.id_modulo=-1L;
 		this.id_moneda=-1L;
 		this.id_tipo_intervalo=-1L;
 		this.id_tipo_flujo_efectivo=null;
 		this.id_cuenta_contable_debito=null;
 		this.id_cuenta_contable_credito=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable= isPermiteNavegacionHaciaForeignKeyDesdeCuentaContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable= isBusquedaDesdeForeignKeySesionForeignKeyCuentaContable;
	}
					
	public Long getlIdCuentaContableActualForeignKey() {
		return lIdCuentaContableActualForeignKey;
	}

	public void setlIdCuentaContableActualForeignKey(
			Long lIdCuentaContableActualForeignKey) {
		this.lIdCuentaContableActualForeignKey = lIdCuentaContableActualForeignKey;
	}
				    
	public Long getlIdCuentaContableActualForeignKeyParaPosibleAtras() {
		return lIdCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaContableActualForeignKeyParaPosibleAtras(
			Long lIdCuentaContableActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaContableActualForeignKeyParaPosibleAtras = lIdCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaContable() {
		return sUltimaBusquedaCuentaContable;
	}

	public void setsUltimaBusquedaCuentaContable(String sUltimaBusquedaCuentaContable) {
		this.sUltimaBusquedaCuentaContable = sUltimaBusquedaCuentaContable;
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
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_nivel_cuenta() {
		return this.id_nivel_cuenta;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_tipo_intervalo() {
		return this.id_tipo_intervalo;
	}
    
	public Long getid_tipo_flujo_efectivo() {
		return this.id_tipo_flujo_efectivo;
	}
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContable:Valor nulo no permitido en columna id");
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
						System.out.println("CuentaContable:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("CuentaContable:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("CuentaContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("CuentaContable:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("CuentaContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_nivel_cuenta(Long newid_nivel_cuenta)throws Exception
	{
		try {
			if(this.id_nivel_cuenta!=newid_nivel_cuenta) {
				if(newid_nivel_cuenta==null) {
					//newid_nivel_cuenta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContable:Valor nulo no permitido en columna id_nivel_cuenta");
					}
				}

				this.id_nivel_cuenta=newid_nivel_cuenta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable) {
		if(this.id_cuenta_contable!=newid_cuenta_contable) {

			this.id_cuenta_contable=newid_cuenta_contable;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContable:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContable:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_intervalo(Long newid_tipo_intervalo)throws Exception
	{
		try {
			if(this.id_tipo_intervalo!=newid_tipo_intervalo) {
				if(newid_tipo_intervalo==null) {
					//newid_tipo_intervalo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaContable:Valor nulo no permitido en columna id_tipo_intervalo");
					}
				}

				this.id_tipo_intervalo=newid_tipo_intervalo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_flujo_efectivo(Long newid_tipo_flujo_efectivo) {
		if(this.id_tipo_flujo_efectivo!=newid_tipo_flujo_efectivo) {

			this.id_tipo_flujo_efectivo=newid_tipo_flujo_efectivo;
		}
	}
    
	public void setid_cuenta_contable_debito(Long newid_cuenta_contable_debito) {
		if(this.id_cuenta_contable_debito!=newid_cuenta_contable_debito) {

			this.id_cuenta_contable_debito=newid_cuenta_contable_debito;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito) {
		if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {

			this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionNivelCuenta() {
		return isBusquedaDesdeForeignKeySesionNivelCuenta;
	}

	public void setisBusquedaDesdeForeignKeySesionNivelCuenta(
		Boolean isBusquedaDesdeForeignKeySesionNivelCuenta) {
		this.isBusquedaDesdeForeignKeySesionNivelCuenta = isBusquedaDesdeForeignKeySesionNivelCuenta;
	}

	public Long getlidNivelCuentaActual() {
		return lidNivelCuentaActual;
	}

	public void setlidNivelCuentaActual(Long lidNivelCuentaActual) {
		this.lidNivelCuentaActual = lidNivelCuentaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIntervalo() {
		return isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIntervalo(
		Boolean isBusquedaDesdeForeignKeySesionTipoIntervalo) {
		this.isBusquedaDesdeForeignKeySesionTipoIntervalo = isBusquedaDesdeForeignKeySesionTipoIntervalo;
	}

	public Long getlidTipoIntervaloActual() {
		return lidTipoIntervaloActual;
	}

	public void setlidTipoIntervaloActual(Long lidTipoIntervaloActual) {
		this.lidTipoIntervaloActual = lidTipoIntervaloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFlujoEfectivo() {
		return isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFlujoEfectivo(
		Boolean isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo) {
		this.isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo = isBusquedaDesdeForeignKeySesionTipoFlujoEfectivo;
	}

	public Long getlidTipoFlujoEfectivoActual() {
		return lidTipoFlujoEfectivoActual;
	}

	public void setlidTipoFlujoEfectivoActual(Long lidTipoFlujoEfectivoActual) {
		this.lidTipoFlujoEfectivoActual = lidTipoFlujoEfectivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDebito = isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public Long getlidCuentaContableDebitoActual() {
		return lidCuentaContableDebitoActual;
	}

	public void setlidCuentaContableDebitoActual(Long lidCuentaContableDebitoActual) {
		this.lidCuentaContableDebitoActual = lidCuentaContableDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCredito = isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public Long getlidCuentaContableCreditoActual() {
		return lidCuentaContableCreditoActual;
	}

	public void setlidCuentaContableCreditoActual(Long lidCuentaContableCreditoActual) {
		this.lidCuentaContableCreditoActual = lidCuentaContableCreditoActual;
	}
	
	
		
	
}
