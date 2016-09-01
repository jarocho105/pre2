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
public class CuentaBancoSessionBean  extends CuentaBancoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco;
	protected Long lIdCuentaBancoActualForeignKey;	
	
	protected Long lIdCuentaBancoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras;
	protected String sUltimaBusquedaCuentaBanco;
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
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	Long lidTipoCuentaBancoGlobalActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCuentaBanco;
	Long lidEstadoCuentaBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoIngreso;
	Long lidFormatoIngresoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoEgreso;
	Long lidFormatoEgresoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoDiario;
	Long lidFormatoDiarioActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoCheque;
	Long lidFormatoChequeActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoRetencion;
	Long lidFormatoRetencionActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoRetencionIva;
	Long lidFormatoRetencionIvaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_banco;
	private Long id_tipo_cuenta_banco_global;
	private String codigo;
	private String numero_cuenta;
	private String numero_cheque;
	private String procedencia;
	private Long id_cuenta_contable;
	private Long id_estado_cuenta_banco;
	private Long id_formato_ingreso;
	private Long id_formato_egreso;
	private Long id_formato_diario;
	private Long id_formato_cheque;
	private Long id_formato_retencion;
	private Long id_formato_retencion_iva;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentaBancoSessionBeanAdditional cuentabancoSessionBeanAdditional=null;
	
	public CuentaBancoSessionBeanAdditional getCuentaBancoSessionBeanAdditional() {
		return this.cuentabancoSessionBeanAdditional;
	}
	
	public void setCuentaBancoSessionBeanAdditional(CuentaBancoSessionBeanAdditional cuentabancoSessionBeanAdditional) {
		try {
			this.cuentabancoSessionBeanAdditional=cuentabancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentaBancoSessionBean () {
		this.inicializarCuentaBancoSessionBean();
	}
	
	public void inicializarCuentaBancoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco=false;
		this.lIdCuentaBancoActualForeignKey=0L;
		this.lIdCuentaBancoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras=false;
		this.sUltimaBusquedaCuentaBanco ="";
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
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal=false;
		lidTipoCuentaBancoGlobalActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCuentaBanco=false;
		lidEstadoCuentaBancoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoIngreso=false;
		lidFormatoIngresoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoEgreso=false;
		lidFormatoEgresoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoDiario=false;
		lidFormatoDiarioActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoCheque=false;
		lidFormatoChequeActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoRetencion=false;
		lidFormatoRetencionActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoRetencionIva=false;
		lidFormatoRetencionIvaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_banco=-1L;
 		this.id_tipo_cuenta_banco_global=-1L;
 		this.codigo="";
 		this.numero_cuenta="";
 		this.numero_cheque="";
 		this.procedencia="";
 		this.id_cuenta_contable=-1L;
 		this.id_estado_cuenta_banco=-1L;
 		this.id_formato_ingreso=-1L;
 		this.id_formato_egreso=-1L;
 		this.id_formato_diario=-1L;
 		this.id_formato_cheque=-1L;
 		this.id_formato_retencion=null;
 		this.id_formato_retencion_iva=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco= isPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco= isBusquedaDesdeForeignKeySesionForeignKeyCuentaBanco;
	}
					
	public Long getlIdCuentaBancoActualForeignKey() {
		return lIdCuentaBancoActualForeignKey;
	}

	public void setlIdCuentaBancoActualForeignKey(
			Long lIdCuentaBancoActualForeignKey) {
		this.lIdCuentaBancoActualForeignKey = lIdCuentaBancoActualForeignKey;
	}
				    
	public Long getlIdCuentaBancoActualForeignKeyParaPosibleAtras() {
		return lIdCuentaBancoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentaBancoActualForeignKeyParaPosibleAtras(
			Long lIdCuentaBancoActualForeignKeyParaPosibleAtras) {
		this.lIdCuentaBancoActualForeignKeyParaPosibleAtras = lIdCuentaBancoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentaBanco() {
		return sUltimaBusquedaCuentaBanco;
	}

	public void setsUltimaBusquedaCuentaBanco(String sUltimaBusquedaCuentaBanco) {
		this.sUltimaBusquedaCuentaBanco = sUltimaBusquedaCuentaBanco;
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
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_tipo_cuenta_banco_global() {
		return this.id_tipo_cuenta_banco_global;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnumero_cuenta() {
		return this.numero_cuenta;
	}
    
	public String getnumero_cheque() {
		return this.numero_cheque;
	}
    
	public String getprocedencia() {
		return this.procedencia;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_estado_cuenta_banco() {
		return this.id_estado_cuenta_banco;
	}
    
	public Long getid_formato_ingreso() {
		return this.id_formato_ingreso;
	}
    
	public Long getid_formato_egreso() {
		return this.id_formato_egreso;
	}
    
	public Long getid_formato_diario() {
		return this.id_formato_diario;
	}
    
	public Long getid_formato_cheque() {
		return this.id_formato_cheque;
	}
    
	public Long getid_formato_retencion() {
		return this.id_formato_retencion;
	}
    
	public Long getid_formato_retencion_iva() {
		return this.id_formato_retencion_iva;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id");
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
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_banco");
					}
				}

				this.id_banco=newid_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_cuenta_banco_global(Long newid_tipo_cuenta_banco_global)throws Exception
	{
		try {
			if(this.id_tipo_cuenta_banco_global!=newid_tipo_cuenta_banco_global) {
				if(newid_tipo_cuenta_banco_global==null) {
					//newid_tipo_cuenta_banco_global=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_tipo_cuenta_banco_global");
					}
				}

				this.id_tipo_cuenta_banco_global=newid_tipo_cuenta_banco_global;
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
						System.out.println("CuentaBanco:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>100) {
					newcodigo=newcodigo.substring(0,98);
					System.out.println("CuentaBanco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_cuenta(String newnumero_cuenta)throws Exception
	{
		try {
			if(this.numero_cuenta!=newnumero_cuenta) {
				if(newnumero_cuenta==null) {
					//newnumero_cuenta="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna numero_cuenta");
					}
				}

				if(newnumero_cuenta!=null&&newnumero_cuenta.length()>50) {
					newnumero_cuenta=newnumero_cuenta.substring(0,48);
					System.out.println("CuentaBanco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_cuenta");
				}

				this.numero_cuenta=newnumero_cuenta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_cheque(String newnumero_cheque)throws Exception
	{
		try {
			if(this.numero_cheque!=newnumero_cheque) {
				if(newnumero_cheque==null) {
					//newnumero_cheque="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna numero_cheque");
					}
				}

				if(newnumero_cheque!=null&&newnumero_cheque.length()>50) {
					newnumero_cheque=newnumero_cheque.substring(0,48);
					System.out.println("CuentaBanco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_cheque");
				}

				this.numero_cheque=newnumero_cheque;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setprocedencia(String newprocedencia)throws Exception
	{
		try {
			if(this.procedencia!=newprocedencia) {
				if(newprocedencia==null) {
					//newprocedencia="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna procedencia");
					}
				}

				if(newprocedencia!=null&&newprocedencia.length()>100) {
					newprocedencia=newprocedencia.substring(0,98);
					System.out.println("CuentaBanco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna procedencia");
				}

				this.procedencia=newprocedencia;
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
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_cuenta_banco(Long newid_estado_cuenta_banco)throws Exception
	{
		try {
			if(this.id_estado_cuenta_banco!=newid_estado_cuenta_banco) {
				if(newid_estado_cuenta_banco==null) {
					//newid_estado_cuenta_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_estado_cuenta_banco");
					}
				}

				this.id_estado_cuenta_banco=newid_estado_cuenta_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_ingreso(Long newid_formato_ingreso)throws Exception
	{
		try {
			if(this.id_formato_ingreso!=newid_formato_ingreso) {
				if(newid_formato_ingreso==null) {
					//newid_formato_ingreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_formato_ingreso");
					}
				}

				this.id_formato_ingreso=newid_formato_ingreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_egreso(Long newid_formato_egreso)throws Exception
	{
		try {
			if(this.id_formato_egreso!=newid_formato_egreso) {
				if(newid_formato_egreso==null) {
					//newid_formato_egreso=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_formato_egreso");
					}
				}

				this.id_formato_egreso=newid_formato_egreso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_diario(Long newid_formato_diario)throws Exception
	{
		try {
			if(this.id_formato_diario!=newid_formato_diario) {
				if(newid_formato_diario==null) {
					//newid_formato_diario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_formato_diario");
					}
				}

				this.id_formato_diario=newid_formato_diario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_cheque(Long newid_formato_cheque)throws Exception
	{
		try {
			if(this.id_formato_cheque!=newid_formato_cheque) {
				if(newid_formato_cheque==null) {
					//newid_formato_cheque=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentaBanco:Valor nulo no permitido en columna id_formato_cheque");
					}
				}

				this.id_formato_cheque=newid_formato_cheque;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_retencion(Long newid_formato_retencion) {
		if(this.id_formato_retencion!=newid_formato_retencion) {

			this.id_formato_retencion=newid_formato_retencion;
		}
	}
    
	public void setid_formato_retencion_iva(Long newid_formato_retencion_iva) {
		if(this.id_formato_retencion_iva!=newid_formato_retencion_iva) {

			this.id_formato_retencion_iva=newid_formato_retencion_iva;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal() {
		return isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(
		Boolean isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal) {
		this.isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal = isBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal;
	}

	public Long getlidTipoCuentaBancoGlobalActual() {
		return lidTipoCuentaBancoGlobalActual;
	}

	public void setlidTipoCuentaBancoGlobalActual(Long lidTipoCuentaBancoGlobalActual) {
		this.lidTipoCuentaBancoGlobalActual = lidTipoCuentaBancoGlobalActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCuentaBanco() {
		return isBusquedaDesdeForeignKeySesionEstadoCuentaBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCuentaBanco(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCuentaBanco) {
		this.isBusquedaDesdeForeignKeySesionEstadoCuentaBanco = isBusquedaDesdeForeignKeySesionEstadoCuentaBanco;
	}

	public Long getlidEstadoCuentaBancoActual() {
		return lidEstadoCuentaBancoActual;
	}

	public void setlidEstadoCuentaBancoActual(Long lidEstadoCuentaBancoActual) {
		this.lidEstadoCuentaBancoActual = lidEstadoCuentaBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoIngreso() {
		return isBusquedaDesdeForeignKeySesionFormatoIngreso;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoIngreso(
		Boolean isBusquedaDesdeForeignKeySesionFormatoIngreso) {
		this.isBusquedaDesdeForeignKeySesionFormatoIngreso = isBusquedaDesdeForeignKeySesionFormatoIngreso;
	}

	public Long getlidFormatoIngresoActual() {
		return lidFormatoIngresoActual;
	}

	public void setlidFormatoIngresoActual(Long lidFormatoIngresoActual) {
		this.lidFormatoIngresoActual = lidFormatoIngresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoEgreso() {
		return isBusquedaDesdeForeignKeySesionFormatoEgreso;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoEgreso(
		Boolean isBusquedaDesdeForeignKeySesionFormatoEgreso) {
		this.isBusquedaDesdeForeignKeySesionFormatoEgreso = isBusquedaDesdeForeignKeySesionFormatoEgreso;
	}

	public Long getlidFormatoEgresoActual() {
		return lidFormatoEgresoActual;
	}

	public void setlidFormatoEgresoActual(Long lidFormatoEgresoActual) {
		this.lidFormatoEgresoActual = lidFormatoEgresoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoDiario() {
		return isBusquedaDesdeForeignKeySesionFormatoDiario;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoDiario(
		Boolean isBusquedaDesdeForeignKeySesionFormatoDiario) {
		this.isBusquedaDesdeForeignKeySesionFormatoDiario = isBusquedaDesdeForeignKeySesionFormatoDiario;
	}

	public Long getlidFormatoDiarioActual() {
		return lidFormatoDiarioActual;
	}

	public void setlidFormatoDiarioActual(Long lidFormatoDiarioActual) {
		this.lidFormatoDiarioActual = lidFormatoDiarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoCheque() {
		return isBusquedaDesdeForeignKeySesionFormatoCheque;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoCheque(
		Boolean isBusquedaDesdeForeignKeySesionFormatoCheque) {
		this.isBusquedaDesdeForeignKeySesionFormatoCheque = isBusquedaDesdeForeignKeySesionFormatoCheque;
	}

	public Long getlidFormatoChequeActual() {
		return lidFormatoChequeActual;
	}

	public void setlidFormatoChequeActual(Long lidFormatoChequeActual) {
		this.lidFormatoChequeActual = lidFormatoChequeActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoRetencion() {
		return isBusquedaDesdeForeignKeySesionFormatoRetencion;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoRetencion(
		Boolean isBusquedaDesdeForeignKeySesionFormatoRetencion) {
		this.isBusquedaDesdeForeignKeySesionFormatoRetencion = isBusquedaDesdeForeignKeySesionFormatoRetencion;
	}

	public Long getlidFormatoRetencionActual() {
		return lidFormatoRetencionActual;
	}

	public void setlidFormatoRetencionActual(Long lidFormatoRetencionActual) {
		this.lidFormatoRetencionActual = lidFormatoRetencionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoRetencionIva() {
		return isBusquedaDesdeForeignKeySesionFormatoRetencionIva;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoRetencionIva(
		Boolean isBusquedaDesdeForeignKeySesionFormatoRetencionIva) {
		this.isBusquedaDesdeForeignKeySesionFormatoRetencionIva = isBusquedaDesdeForeignKeySesionFormatoRetencionIva;
	}

	public Long getlidFormatoRetencionIvaActual() {
		return lidFormatoRetencionIvaActual;
	}

	public void setlidFormatoRetencionIvaActual(Long lidFormatoRetencionIvaActual) {
		this.lidFormatoRetencionIvaActual = lidFormatoRetencionIvaActual;
	}
	
	
		
	
}
