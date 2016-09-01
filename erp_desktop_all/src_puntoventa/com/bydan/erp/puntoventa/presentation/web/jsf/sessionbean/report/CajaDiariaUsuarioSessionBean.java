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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class CajaDiariaUsuarioSessionBean  extends CajaDiariaUsuarioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario;
	protected Long lIdCajaDiariaUsuarioActualForeignKey;	
	
	protected Long lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras;
	protected String sUltimaBusquedaCajaDiariaUsuario;
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
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionCaja;
	Long lidCajaActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_caja;
	private Long id_usuario;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CajaDiariaUsuarioSessionBeanAdditional cajadiariausuarioSessionBeanAdditional=null;
	
	public CajaDiariaUsuarioSessionBeanAdditional getCajaDiariaUsuarioSessionBeanAdditional() {
		return this.cajadiariausuarioSessionBeanAdditional;
	}
	
	public void setCajaDiariaUsuarioSessionBeanAdditional(CajaDiariaUsuarioSessionBeanAdditional cajadiariausuarioSessionBeanAdditional) {
		try {
			this.cajadiariausuarioSessionBeanAdditional=cajadiariausuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CajaDiariaUsuarioSessionBean () {
		this.inicializarCajaDiariaUsuarioSessionBean();
	}
	
	public void inicializarCajaDiariaUsuarioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario=false;
		this.lIdCajaDiariaUsuarioActualForeignKey=0L;
		this.lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras=false;
		this.sUltimaBusquedaCajaDiariaUsuario ="";
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
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionCaja=false;
		lidCajaActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.id_caja=-1L;
 		this.id_usuario=-1L;
 		this.fecha_inicio=new Date();
 		this.fecha_fin=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario= isPermiteNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario = sNombrePaginaNavegacionHaciaForeignKeyDesdeCajaDiariaUsuario;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario= isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario;
	}
					
	public Long getlIdCajaDiariaUsuarioActualForeignKey() {
		return lIdCajaDiariaUsuarioActualForeignKey;
	}

	public void setlIdCajaDiariaUsuarioActualForeignKey(
			Long lIdCajaDiariaUsuarioActualForeignKey) {
		this.lIdCajaDiariaUsuarioActualForeignKey = lIdCajaDiariaUsuarioActualForeignKey;
	}
				    
	public Long getlIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras() {
		return lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras(
			Long lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras) {
		this.lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras = lIdCajaDiariaUsuarioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuarioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCajaDiariaUsuario() {
		return sUltimaBusquedaCajaDiariaUsuario;
	}

	public void setsUltimaBusquedaCajaDiariaUsuario(String sUltimaBusquedaCajaDiariaUsuario) {
		this.sUltimaBusquedaCajaDiariaUsuario = sUltimaBusquedaCajaDiariaUsuario;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_caja() {
		return this.id_caja;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Date getfecha_inicio() {
		return this.fecha_inicio;
	}
    
	public Date getfecha_fin() {
		return this.fecha_fin;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna id");
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
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna id_caja");
					}
				}

				this.id_caja=newid_caja;
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
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_inicio(Date newfecha_inicio)throws Exception
	{
		try {
			if(this.fecha_inicio!=newfecha_inicio) {
				if(newfecha_inicio==null) {
					//newfecha_inicio=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna fecha_inicio");
					}
				}

				this.fecha_inicio=newfecha_inicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_fin(Date newfecha_fin)throws Exception
	{
		try {
			if(this.fecha_fin!=newfecha_fin) {
				if(newfecha_fin==null) {
					//newfecha_fin=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CajaDiariaUsuario:Valor nulo no permitido en columna fecha_fin");
					}
				}

				this.fecha_fin=newfecha_fin;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
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
	
	
		
	
}
