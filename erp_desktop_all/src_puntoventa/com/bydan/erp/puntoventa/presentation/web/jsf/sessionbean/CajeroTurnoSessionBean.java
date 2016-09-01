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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class CajeroTurnoSessionBean  extends CajeroTurnoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno;
	protected Long lIdCajeroTurnoActualForeignKey;	
	
	protected Long lIdCajeroTurnoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras;
	protected String sUltimaBusquedaCajeroTurno;
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
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionVendedor;
	Long lidVendedorActual;
	Boolean isBusquedaDesdeForeignKeySesionCaja;
	Long lidCajaActual;
	Boolean isBusquedaDesdeForeignKeySesionMesa;
	Long lidMesaActual;
	Boolean isBusquedaDesdeForeignKeySesionTurnoPunVen;
	Long lidTurnoPunVenActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_vendedor;
	private Long id_caja;
	private Long id_mesa;
	private Long id_turno_pun_ven;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CajeroTurnoSessionBeanAdditional cajeroturnoSessionBeanAdditional=null;
	
	public CajeroTurnoSessionBeanAdditional getCajeroTurnoSessionBeanAdditional() {
		return this.cajeroturnoSessionBeanAdditional;
	}
	
	public void setCajeroTurnoSessionBeanAdditional(CajeroTurnoSessionBeanAdditional cajeroturnoSessionBeanAdditional) {
		try {
			this.cajeroturnoSessionBeanAdditional=cajeroturnoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CajeroTurnoSessionBean () {
		this.inicializarCajeroTurnoSessionBean();
	}
	
	public void inicializarCajeroTurnoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno=false;
		this.lIdCajeroTurnoActualForeignKey=0L;
		this.lIdCajeroTurnoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras=false;
		this.sUltimaBusquedaCajeroTurno ="";
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
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionVendedor=false;
		lidVendedorActual=0L;
		isBusquedaDesdeForeignKeySesionCaja=false;
		lidCajaActual=0L;
		isBusquedaDesdeForeignKeySesionMesa=false;
		lidMesaActual=0L;
		isBusquedaDesdeForeignKeySesionTurnoPunVen=false;
		lidTurnoPunVenActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_vendedor=-1L;
 		this.id_caja=-1L;
 		this.id_mesa=-1L;
 		this.id_turno_pun_ven=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno= isPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno = sNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno= isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurno;
	}
					
	public Long getlIdCajeroTurnoActualForeignKey() {
		return lIdCajeroTurnoActualForeignKey;
	}

	public void setlIdCajeroTurnoActualForeignKey(
			Long lIdCajeroTurnoActualForeignKey) {
		this.lIdCajeroTurnoActualForeignKey = lIdCajeroTurnoActualForeignKey;
	}
				    
	public Long getlIdCajeroTurnoActualForeignKeyParaPosibleAtras() {
		return lIdCajeroTurnoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCajeroTurnoActualForeignKeyParaPosibleAtras(
			Long lIdCajeroTurnoActualForeignKeyParaPosibleAtras) {
		this.lIdCajeroTurnoActualForeignKeyParaPosibleAtras = lIdCajeroTurnoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCajeroTurnoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCajeroTurno() {
		return sUltimaBusquedaCajeroTurno;
	}

	public void setsUltimaBusquedaCajeroTurno(String sUltimaBusquedaCajeroTurno) {
		this.sUltimaBusquedaCajeroTurno = sUltimaBusquedaCajeroTurno;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_vendedor() {
		return this.id_vendedor;
	}
    
	public Long getid_caja() {
		return this.id_caja;
	}
    
	public Long getid_mesa() {
		return this.id_mesa;
	}
    
	public Long getid_turno_pun_ven() {
		return this.id_turno_pun_ven;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id");
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
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_vendedor(Long newid_vendedor)throws Exception
	{
		try {
			if(this.id_vendedor!=newid_vendedor) {
				if(newid_vendedor==null) {
					//newid_vendedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_vendedor");
					}
				}

				this.id_vendedor=newid_vendedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_caja(Long newid_caja)throws Exception
	{
		try {
			if(this.id_caja!=newid_caja) {
				if(newid_caja==null) {
					//newid_caja=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_caja");
					}
				}

				this.id_caja=newid_caja;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_mesa(Long newid_mesa)throws Exception
	{
		try {
			if(this.id_mesa!=newid_mesa) {
				if(newid_mesa==null) {
					//newid_mesa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_mesa");
					}
				}

				this.id_mesa=newid_mesa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_turno_pun_ven(Long newid_turno_pun_ven)throws Exception
	{
		try {
			if(this.id_turno_pun_ven!=newid_turno_pun_ven) {
				if(newid_turno_pun_ven==null) {
					//newid_turno_pun_ven=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajeroTurno:Valor nulo no permitido en columna id_turno_pun_ven");
					}
				}

				this.id_turno_pun_ven=newid_turno_pun_ven;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionVendedor() {
		return isBusquedaDesdeForeignKeySesionVendedor;
	}

	public void setisBusquedaDesdeForeignKeySesionVendedor(
		Boolean isBusquedaDesdeForeignKeySesionVendedor) {
		this.isBusquedaDesdeForeignKeySesionVendedor = isBusquedaDesdeForeignKeySesionVendedor;
	}

	public Long getlidVendedorActual() {
		return lidVendedorActual;
	}

	public void setlidVendedorActual(Long lidVendedorActual) {
		this.lidVendedorActual = lidVendedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCaja() {
		return isBusquedaDesdeForeignKeySesionCaja;
	}

	public void setisBusquedaDesdeForeignKeySesionCaja(
		Boolean isBusquedaDesdeForeignKeySesionCaja) {
		this.isBusquedaDesdeForeignKeySesionCaja = isBusquedaDesdeForeignKeySesionCaja;
	}

	public Long getlidCajaActual() {
		return lidCajaActual;
	}

	public void setlidCajaActual(Long lidCajaActual) {
		this.lidCajaActual = lidCajaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMesa() {
		return isBusquedaDesdeForeignKeySesionMesa;
	}

	public void setisBusquedaDesdeForeignKeySesionMesa(
		Boolean isBusquedaDesdeForeignKeySesionMesa) {
		this.isBusquedaDesdeForeignKeySesionMesa = isBusquedaDesdeForeignKeySesionMesa;
	}

	public Long getlidMesaActual() {
		return lidMesaActual;
	}

	public void setlidMesaActual(Long lidMesaActual) {
		this.lidMesaActual = lidMesaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTurnoPunVen() {
		return isBusquedaDesdeForeignKeySesionTurnoPunVen;
	}

	public void setisBusquedaDesdeForeignKeySesionTurnoPunVen(
		Boolean isBusquedaDesdeForeignKeySesionTurnoPunVen) {
		this.isBusquedaDesdeForeignKeySesionTurnoPunVen = isBusquedaDesdeForeignKeySesionTurnoPunVen;
	}

	public Long getlidTurnoPunVenActual() {
		return lidTurnoPunVenActual;
	}

	public void setlidTurnoPunVenActual(Long lidTurnoPunVenActual) {
		this.lidTurnoPunVenActual = lidTurnoPunVenActual;
	}
	
	
		
	
}
