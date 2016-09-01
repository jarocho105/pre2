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
public class ResponsableSessionBean  extends ResponsableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeResponsable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyResponsable;
	protected Long lIdResponsableActualForeignKey;	
	
	protected Long lIdResponsableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras;
	protected String sUltimaBusquedaResponsable;
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
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_cliente;
	private Long id_usuario;
	private String identificacion;
	private String ruc;
	private String nombre_completo;
	private String telefono;
	private String telefono_celular;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ResponsableSessionBeanAdditional responsableSessionBeanAdditional=null;
	
	public ResponsableSessionBeanAdditional getResponsableSessionBeanAdditional() {
		return this.responsableSessionBeanAdditional;
	}
	
	public void setResponsableSessionBeanAdditional(ResponsableSessionBeanAdditional responsableSessionBeanAdditional) {
		try {
			this.responsableSessionBeanAdditional=responsableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ResponsableSessionBean () {
		this.inicializarResponsableSessionBean();
	}
	
	public void inicializarResponsableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeResponsable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyResponsable=false;
		this.lIdResponsableActualForeignKey=0L;
		this.lIdResponsableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras=false;
		this.sUltimaBusquedaResponsable ="";
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
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_cliente=-1L;
 		this.id_usuario=-1L;
 		this.identificacion="";
 		this.ruc="";
 		this.nombre_completo="";
 		this.telefono="";
 		this.telefono_celular="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeResponsable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeResponsable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeResponsable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeResponsable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeResponsable= isPermiteNavegacionHaciaForeignKeyDesdeResponsable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable = sNombrePaginaNavegacionHaciaForeignKeyDesdeResponsable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyResponsable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyResponsable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyResponsable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyResponsable= isBusquedaDesdeForeignKeySesionForeignKeyResponsable;
	}
					
	public Long getlIdResponsableActualForeignKey() {
		return lIdResponsableActualForeignKey;
	}

	public void setlIdResponsableActualForeignKey(
			Long lIdResponsableActualForeignKey) {
		this.lIdResponsableActualForeignKey = lIdResponsableActualForeignKey;
	}
				    
	public Long getlIdResponsableActualForeignKeyParaPosibleAtras() {
		return lIdResponsableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdResponsableActualForeignKeyParaPosibleAtras(
			Long lIdResponsableActualForeignKeyParaPosibleAtras) {
		this.lIdResponsableActualForeignKeyParaPosibleAtras = lIdResponsableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyResponsableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaResponsable() {
		return sUltimaBusquedaResponsable;
	}

	public void setsUltimaBusquedaResponsable(String sUltimaBusquedaResponsable) {
		this.sUltimaBusquedaResponsable = sUltimaBusquedaResponsable;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public String getidentificacion() {
		return this.identificacion;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public String getnombre_completo() {
		return this.nombre_completo;
	}
    
	public String gettelefono() {
		return this.telefono;
	}
    
	public String gettelefono_celular() {
		return this.telefono_celular;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna id");
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
						System.out.println("Responsable:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Responsable:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("Responsable:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("Responsable:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidentificacion(String newidentificacion)throws Exception
	{
		try {
			if(this.identificacion!=newidentificacion) {
				if(newidentificacion==null) {
					//newidentificacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna identificacion");
					}
				}

				if(newidentificacion!=null&&newidentificacion.length()>25) {
					newidentificacion=newidentificacion.substring(0,23);
					System.out.println("Responsable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna identificacion");
				}

				this.identificacion=newidentificacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setruc(String newruc)throws Exception
	{
		try {
			if(this.ruc!=newruc) {
				if(newruc==null) {
					//newruc="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>15) {
					newruc=newruc.substring(0,13);
					System.out.println("Responsable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna ruc");
				}

				this.ruc=newruc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_completo(String newnombre_completo)throws Exception
	{
		try {
			if(this.nombre_completo!=newnombre_completo) {
				if(newnombre_completo==null) {
					//newnombre_completo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna nombre_completo");
					}
				}

				if(newnombre_completo!=null&&newnombre_completo.length()>200) {
					newnombre_completo=newnombre_completo.substring(0,198);
					System.out.println("Responsable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre_completo");
				}

				this.nombre_completo=newnombre_completo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settelefono(String newtelefono)throws Exception
	{
		try {
			if(this.telefono!=newtelefono) {
				if(newtelefono==null) {
					//newtelefono="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna telefono");
					}
				}

				if(newtelefono!=null&&newtelefono.length()>50) {
					newtelefono=newtelefono.substring(0,48);
					System.out.println("Responsable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna telefono");
				}

				this.telefono=newtelefono;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settelefono_celular(String newtelefono_celular)throws Exception
	{
		try {
			if(this.telefono_celular!=newtelefono_celular) {
				if(newtelefono_celular==null) {
					//newtelefono_celular="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Responsable:Valor nulo no permitido en columna telefono_celular");
					}
				}

				if(newtelefono_celular!=null&&newtelefono_celular.length()>50) {
					newtelefono_celular=newtelefono_celular.substring(0,48);
					System.out.println("Responsable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna telefono_celular");
				}

				this.telefono_celular=newtelefono_celular;
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
