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
public class FormaPagoSessionBean  extends FormaPagoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPago;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPago;
	protected Long lIdFormaPagoActualForeignKey;	
	
	protected Long lIdFormaPagoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras;
	protected String sUltimaBusquedaFormaPago;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago;
	Long lidTipoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableRete;
	Long lidCuentaContableReteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_tipo_forma_pago;
	private String nombre;
	private String siglas;
	private Long id_transaccion;
	private Long id_tipo_transaccion_modulo;
	private Long id_cuenta_contable;
	private Long id_cuenta_contable_rete;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormaPagoSessionBeanAdditional formapagoSessionBeanAdditional=null;
	
	public FormaPagoSessionBeanAdditional getFormaPagoSessionBeanAdditional() {
		return this.formapagoSessionBeanAdditional;
	}
	
	public void setFormaPagoSessionBeanAdditional(FormaPagoSessionBeanAdditional formapagoSessionBeanAdditional) {
		try {
			this.formapagoSessionBeanAdditional=formapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormaPagoSessionBean () {
		this.inicializarFormaPagoSessionBean();
	}
	
	public void inicializarFormaPagoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPago=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPago=false;
		this.lIdFormaPagoActualForeignKey=0L;
		this.lIdFormaPagoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras=false;
		this.sUltimaBusquedaFormaPago ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFormaPago=false;
		lidTipoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableRete=false;
		lidCuentaContableReteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_tipo_forma_pago=-1L;
 		this.nombre="";
 		this.siglas="";
 		this.id_transaccion=-1L;
 		this.id_tipo_transaccion_modulo=null;
 		this.id_cuenta_contable=-1L;
 		this.id_cuenta_contable_rete=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormaPago() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPago;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormaPago(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPago) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPago= isPermiteNavegacionHaciaForeignKeyDesdeFormaPago;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPago;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPago() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPago(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPago) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPago= isBusquedaDesdeForeignKeySesionForeignKeyFormaPago;
	}
					
	public Long getlIdFormaPagoActualForeignKey() {
		return lIdFormaPagoActualForeignKey;
	}

	public void setlIdFormaPagoActualForeignKey(
			Long lIdFormaPagoActualForeignKey) {
		this.lIdFormaPagoActualForeignKey = lIdFormaPagoActualForeignKey;
	}
				    
	public Long getlIdFormaPagoActualForeignKeyParaPosibleAtras() {
		return lIdFormaPagoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormaPagoActualForeignKeyParaPosibleAtras(
			Long lIdFormaPagoActualForeignKeyParaPosibleAtras) {
		this.lIdFormaPagoActualForeignKeyParaPosibleAtras = lIdFormaPagoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormaPago() {
		return sUltimaBusquedaFormaPago;
	}

	public void setsUltimaBusquedaFormaPago(String sUltimaBusquedaFormaPago) {
		this.sUltimaBusquedaFormaPago = sUltimaBusquedaFormaPago;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_tipo_forma_pago() {
		return this.id_tipo_forma_pago;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getsiglas() {
		return this.siglas;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_cuenta_contable_rete() {
		return this.id_cuenta_contable_rete;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id");
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
						System.out.println("FormaPago:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("FormaPago:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("FormaPago:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_tipo_forma_pago(Long newid_tipo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_forma_pago!=newid_tipo_forma_pago) {
				if(newid_tipo_forma_pago==null) {
					//newid_tipo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id_tipo_forma_pago");
					}
				}

				this.id_tipo_forma_pago=newid_tipo_forma_pago;
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
						System.out.println("FormaPago:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("FormaPago:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setsiglas(String newsiglas)throws Exception
	{
		try {
			if(this.siglas!=newsiglas) {
				if(newsiglas==null) {
					//newsiglas="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna siglas");
					}
				}

				if(newsiglas!=null&&newsiglas.length()>10) {
					newsiglas=newsiglas.substring(0,8);
					System.out.println("FormaPago:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna siglas");
				}

				this.siglas=newsiglas;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion(Long newid_transaccion)throws Exception
	{
		try {
			if(this.id_transaccion!=newid_transaccion) {
				if(newid_transaccion==null) {
					//newid_transaccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo) {
		if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {

			this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable)throws Exception
	{
		try {
			if(this.id_cuenta_contable!=newid_cuenta_contable) {
				if(newid_cuenta_contable==null) {
					//newid_cuenta_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPago:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_rete(Long newid_cuenta_contable_rete) {
		if(this.id_cuenta_contable_rete!=newid_cuenta_contable_rete) {

			this.id_cuenta_contable_rete=newid_cuenta_contable_rete;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoFormaPago = isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public Long getlidTipoFormaPagoActual() {
		return lidTipoFormaPagoActual;
	}

	public void setlidTipoFormaPagoActual(Long lidTipoFormaPagoActual) {
		this.lidTipoFormaPagoActual = lidTipoFormaPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion() {
		return isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion) {
		this.isBusquedaDesdeForeignKeySesionTransaccion = isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public Long getlidTransaccionActual() {
		return lidTransaccionActual;
	}

	public void setlidTransaccionActual(Long lidTransaccionActual) {
		this.lidTransaccionActual = lidTransaccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo() {
		return isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTransaccionModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoTransaccionModulo = isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public Long getlidTipoTransaccionModuloActual() {
		return lidTipoTransaccionModuloActual;
	}

	public void setlidTipoTransaccionModuloActual(Long lidTipoTransaccionModuloActual) {
		this.lidTipoTransaccionModuloActual = lidTipoTransaccionModuloActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableRete() {
		return isBusquedaDesdeForeignKeySesionCuentaContableRete;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableRete(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableRete) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableRete = isBusquedaDesdeForeignKeySesionCuentaContableRete;
	}

	public Long getlidCuentaContableReteActual() {
		return lidCuentaContableReteActual;
	}

	public void setlidCuentaContableReteActual(Long lidCuentaContableReteActual) {
		this.lidCuentaContableReteActual = lidCuentaContableReteActual;
	}
	
	
		
	
}
