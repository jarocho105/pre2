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
public class BancoSessionBean  extends BancoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBanco;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBanco;
	protected Long lIdBancoActualForeignKey;	
	
	protected Long lIdBancoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras;
	protected String sUltimaBusquedaBanco;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoBanco;
	Long lidTipoBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato1;
	Long lidFormato1Actual;
	Boolean isBusquedaDesdeForeignKeySesionFormato2;
	Long lidFormato2Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private String codigo;
	private String codigo_institucion;
	private String nombre;
	private Long id_tipo_banco;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	private Long id_formato1;
	private Long id_formato2;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BancoSessionBeanAdditional bancoSessionBeanAdditional=null;
	
	public BancoSessionBeanAdditional getBancoSessionBeanAdditional() {
		return this.bancoSessionBeanAdditional;
	}
	
	public void setBancoSessionBeanAdditional(BancoSessionBeanAdditional bancoSessionBeanAdditional) {
		try {
			this.bancoSessionBeanAdditional=bancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BancoSessionBean () {
		this.inicializarBancoSessionBean();
	}
	
	public void inicializarBancoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBanco=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBanco=false;
		this.lIdBancoActualForeignKey=0L;
		this.lIdBancoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras=false;
		this.sUltimaBusquedaBanco ="";
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
		isBusquedaDesdeForeignKeySesionTipoBanco=false;
		lidTipoBancoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionFormato1=false;
		lidFormato1Actual=0L;
		isBusquedaDesdeForeignKeySesionFormato2=false;
		lidFormato2Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.codigo="";
 		this.codigo_institucion="";
 		this.nombre="";
 		this.id_tipo_banco=-1L;
 		this.id_cuenta_contable_debito=null;
 		this.id_cuenta_contable_credito=null;
 		this.id_formato1=null;
 		this.id_formato2=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBanco() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBanco;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBanco(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBanco) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBanco= isPermiteNavegacionHaciaForeignKeyDesdeBanco;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBanco() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBanco(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco = sNombrePaginaNavegacionHaciaForeignKeyDesdeBanco;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBanco() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBanco(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBanco) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBanco= isBusquedaDesdeForeignKeySesionForeignKeyBanco;
	}
					
	public Long getlIdBancoActualForeignKey() {
		return lIdBancoActualForeignKey;
	}

	public void setlIdBancoActualForeignKey(
			Long lIdBancoActualForeignKey) {
		this.lIdBancoActualForeignKey = lIdBancoActualForeignKey;
	}
				    
	public Long getlIdBancoActualForeignKeyParaPosibleAtras() {
		return lIdBancoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBancoActualForeignKeyParaPosibleAtras(
			Long lIdBancoActualForeignKeyParaPosibleAtras) {
		this.lIdBancoActualForeignKeyParaPosibleAtras = lIdBancoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBancoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBanco() {
		return sUltimaBusquedaBanco;
	}

	public void setsUltimaBusquedaBanco(String sUltimaBusquedaBanco) {
		this.sUltimaBusquedaBanco = sUltimaBusquedaBanco;
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
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getcodigo_institucion() {
		return this.codigo_institucion;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_tipo_banco() {
		return this.id_tipo_banco;
	}
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
    
	public Long getid_formato1() {
		return this.id_formato1;
	}
    
	public Long getid_formato2() {
		return this.id_formato2;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Banco:Valor nulo no permitido en columna id");
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
						System.out.println("Banco:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Banco:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("Banco:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>100) {
					newcodigo=newcodigo.substring(0,98);
					System.out.println("Banco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo_institucion(String newcodigo_institucion)throws Exception
	{
		try {
			if(this.codigo_institucion!=newcodigo_institucion) {
				if(newcodigo_institucion==null) {
					//newcodigo_institucion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Banco:Valor nulo no permitido en columna codigo_institucion");
					}
				}

				if(newcodigo_institucion!=null&&newcodigo_institucion.length()>50) {
					newcodigo_institucion=newcodigo_institucion.substring(0,48);
					System.out.println("Banco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo_institucion");
				}

				this.codigo_institucion=newcodigo_institucion;
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
						System.out.println("Banco:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Banco:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_banco(Long newid_tipo_banco)throws Exception
	{
		try {
			if(this.id_tipo_banco!=newid_tipo_banco) {
				if(newid_tipo_banco==null) {
					//newid_tipo_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Banco:Valor nulo no permitido en columna id_tipo_banco");
					}
				}

				this.id_tipo_banco=newid_tipo_banco;
			}
		} catch(Exception e) {
			throw e;
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
    
	public void setid_formato1(Long newid_formato1) {
		if(this.id_formato1!=newid_formato1) {

			this.id_formato1=newid_formato1;
		}
	}
    
	public void setid_formato2(Long newid_formato2) {
		if(this.id_formato2!=newid_formato2) {

			this.id_formato2=newid_formato2;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoBanco() {
		return isBusquedaDesdeForeignKeySesionTipoBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoBanco = isBusquedaDesdeForeignKeySesionTipoBanco;
	}

	public Long getlidTipoBancoActual() {
		return lidTipoBancoActual;
	}

	public void setlidTipoBancoActual(Long lidTipoBancoActual) {
		this.lidTipoBancoActual = lidTipoBancoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFormato1() {
		return isBusquedaDesdeForeignKeySesionFormato1;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato1(
		Boolean isBusquedaDesdeForeignKeySesionFormato1) {
		this.isBusquedaDesdeForeignKeySesionFormato1 = isBusquedaDesdeForeignKeySesionFormato1;
	}

	public Long getlidFormato1Actual() {
		return lidFormato1Actual;
	}

	public void setlidFormato1Actual(Long lidFormato1Actual) {
		this.lidFormato1Actual = lidFormato1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato2() {
		return isBusquedaDesdeForeignKeySesionFormato2;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato2(
		Boolean isBusquedaDesdeForeignKeySesionFormato2) {
		this.isBusquedaDesdeForeignKeySesionFormato2 = isBusquedaDesdeForeignKeySesionFormato2;
	}

	public Long getlidFormato2Actual() {
		return lidFormato2Actual;
	}

	public void setlidFormato2Actual(Long lidFormato2Actual) {
		this.lidFormato2Actual = lidFormato2Actual;
	}
	
	
		
	
}
