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
package com.bydan.erp.facturacion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.facturacion.business.entity.*;

@SuppressWarnings("unused")
public class TipoFormaPagoSessionBean  extends TipoFormaPagoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago;
	protected Long lIdTipoFormaPagoActualForeignKey;	
	
	protected Long lIdTipoFormaPagoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras;
	protected String sUltimaBusquedaTipoFormaPago;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	Long lidTipoGrupoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_modulo;
	private Long id_tipo_grupo_forma_pago;
	private String nombre;
	private String siglas;
	private Long id_tipo_transaccion_modulo;
	private Long id_transaccion;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoFormaPagoSessionBeanAdditional tipoformapagoSessionBeanAdditional=null;
	
	public TipoFormaPagoSessionBeanAdditional getTipoFormaPagoSessionBeanAdditional() {
		return this.tipoformapagoSessionBeanAdditional;
	}
	
	public void setTipoFormaPagoSessionBeanAdditional(TipoFormaPagoSessionBeanAdditional tipoformapagoSessionBeanAdditional) {
		try {
			this.tipoformapagoSessionBeanAdditional=tipoformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoFormaPagoSessionBean () {
		this.inicializarTipoFormaPagoSessionBean();
	}
	
	public void inicializarTipoFormaPagoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago=false;
		this.lIdTipoFormaPagoActualForeignKey=0L;
		this.lIdTipoFormaPagoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras=false;
		this.sUltimaBusquedaTipoFormaPago ="";
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
		isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago=false;
		lidTipoGrupoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_modulo=null;
 		this.id_tipo_grupo_forma_pago=-1L;
 		this.nombre="";
 		this.siglas="";
 		this.id_tipo_transaccion_modulo=null;
 		this.id_transaccion=null;
 		this.id_cuenta_contable=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago= isPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago= isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPago;
	}
					
	public Long getlIdTipoFormaPagoActualForeignKey() {
		return lIdTipoFormaPagoActualForeignKey;
	}

	public void setlIdTipoFormaPagoActualForeignKey(
			Long lIdTipoFormaPagoActualForeignKey) {
		this.lIdTipoFormaPagoActualForeignKey = lIdTipoFormaPagoActualForeignKey;
	}
				    
	public Long getlIdTipoFormaPagoActualForeignKeyParaPosibleAtras() {
		return lIdTipoFormaPagoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoFormaPagoActualForeignKeyParaPosibleAtras(
			Long lIdTipoFormaPagoActualForeignKeyParaPosibleAtras) {
		this.lIdTipoFormaPagoActualForeignKeyParaPosibleAtras = lIdTipoFormaPagoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoFormaPagoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoFormaPago() {
		return sUltimaBusquedaTipoFormaPago;
	}

	public void setsUltimaBusquedaTipoFormaPago(String sUltimaBusquedaTipoFormaPago) {
		this.sUltimaBusquedaTipoFormaPago = sUltimaBusquedaTipoFormaPago;
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
    
	public Long getid_tipo_grupo_forma_pago() {
		return this.id_tipo_grupo_forma_pago;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getsiglas() {
		return this.siglas;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
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
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna id");
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
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo) {
		if(this.id_modulo!=newid_modulo) {

			this.id_modulo=newid_modulo;
		}
	}
    
	public void setid_tipo_grupo_forma_pago(Long newid_tipo_grupo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_grupo_forma_pago!=newid_tipo_grupo_forma_pago) {
				if(newid_tipo_grupo_forma_pago==null) {
					//newid_tipo_grupo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna id_tipo_grupo_forma_pago");
					}
				}

				this.id_tipo_grupo_forma_pago=newid_tipo_grupo_forma_pago;
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
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("TipoFormaPago:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
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
						System.out.println("TipoFormaPago:Valor nulo no permitido en columna siglas");
					}
				}

				if(newsiglas!=null&&newsiglas.length()>20) {
					newsiglas=newsiglas.substring(0,18);
					System.out.println("TipoFormaPago:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna siglas");
				}

				this.siglas=newsiglas;
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
    
	public void setid_transaccion(Long newid_transaccion) {
		if(this.id_transaccion!=newid_transaccion) {

			this.id_transaccion=newid_transaccion;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable) {
		if(this.id_cuenta_contable!=newid_cuenta_contable) {

			this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago = isBusquedaDesdeForeignKeySesionTipoGrupoFormaPago;
	}

	public Long getlidTipoGrupoFormaPagoActual() {
		return lidTipoGrupoFormaPagoActual;
	}

	public void setlidTipoGrupoFormaPagoActual(Long lidTipoGrupoFormaPagoActual) {
		this.lidTipoGrupoFormaPagoActual = lidTipoGrupoFormaPagoActual;
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
