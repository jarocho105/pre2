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
public class SecuencialUsuarioSessionBean  extends SecuencialUsuarioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario;
	protected Long lIdSecuencialUsuarioActualForeignKey;	
	
	protected Long lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras;
	protected String sUltimaBusquedaSecuencialUsuario;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	Long lidTipoDocumentoGeneralActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_usuario;
	private Long id_tipo_documento_general;
	private String serie;
	private String autorizacion;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SecuencialUsuarioSessionBeanAdditional secuencialusuarioSessionBeanAdditional=null;
	
	public SecuencialUsuarioSessionBeanAdditional getSecuencialUsuarioSessionBeanAdditional() {
		return this.secuencialusuarioSessionBeanAdditional;
	}
	
	public void setSecuencialUsuarioSessionBeanAdditional(SecuencialUsuarioSessionBeanAdditional secuencialusuarioSessionBeanAdditional) {
		try {
			this.secuencialusuarioSessionBeanAdditional=secuencialusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SecuencialUsuarioSessionBean () {
		this.inicializarSecuencialUsuarioSessionBean();
	}
	
	public void inicializarSecuencialUsuarioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario=false;
		this.lIdSecuencialUsuarioActualForeignKey=0L;
		this.lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras=false;
		this.sUltimaBusquedaSecuencialUsuario ="";
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
		isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral=false;
		lidTipoDocumentoGeneralActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_usuario=-1L;
 		this.id_tipo_documento_general=-1L;
 		this.serie="";
 		this.autorizacion="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario= isPermiteNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario = sNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencialUsuario;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario() {
		return isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario= isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuario;
	}
					
	public Long getlIdSecuencialUsuarioActualForeignKey() {
		return lIdSecuencialUsuarioActualForeignKey;
	}

	public void setlIdSecuencialUsuarioActualForeignKey(
			Long lIdSecuencialUsuarioActualForeignKey) {
		this.lIdSecuencialUsuarioActualForeignKey = lIdSecuencialUsuarioActualForeignKey;
	}
				    
	public Long getlIdSecuencialUsuarioActualForeignKeyParaPosibleAtras() {
		return lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSecuencialUsuarioActualForeignKeyParaPosibleAtras(
			Long lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras) {
		this.lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras = lIdSecuencialUsuarioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySecuencialUsuarioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSecuencialUsuario() {
		return sUltimaBusquedaSecuencialUsuario;
	}

	public void setsUltimaBusquedaSecuencialUsuario(String sUltimaBusquedaSecuencialUsuario) {
		this.sUltimaBusquedaSecuencialUsuario = sUltimaBusquedaSecuencialUsuario;
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
    
	public Long getid_tipo_documento_general() {
		return this.id_tipo_documento_general;
	}
    
	public String getserie() {
		return this.serie;
	}
    
	public String getautorizacion() {
		return this.autorizacion;
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna id");
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_general(Long newid_tipo_documento_general)throws Exception
	{
		try {
			if(this.id_tipo_documento_general!=newid_tipo_documento_general) {
				if(newid_tipo_documento_general==null) {
					//newid_tipo_documento_general=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna id_tipo_documento_general");
					}
				}

				this.id_tipo_documento_general=newid_tipo_documento_general;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setserie(String newserie)throws Exception
	{
		try {
			if(this.serie!=newserie) {
				if(newserie==null) {
					//newserie="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna serie");
					}
				}

				if(newserie!=null&&newserie.length()>50) {
					newserie=newserie.substring(0,48);
					System.out.println("SecuencialUsuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna serie");
				}

				this.serie=newserie;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setautorizacion(String newautorizacion)throws Exception
	{
		try {
			if(this.autorizacion!=newautorizacion) {
				if(newautorizacion==null) {
					//newautorizacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna autorizacion");
					}
				}

				if(newautorizacion!=null&&newautorizacion.length()>50) {
					newautorizacion=newautorizacion.substring(0,48);
					System.out.println("SecuencialUsuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna autorizacion");
				}

				this.autorizacion=newautorizacion;
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna fecha_inicio");
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
						System.out.println("SecuencialUsuario:Valor nulo no permitido en columna fecha_fin");
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral = isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	}

	public Long getlidTipoDocumentoGeneralActual() {
		return lidTipoDocumentoGeneralActual;
	}

	public void setlidTipoDocumentoGeneralActual(Long lidTipoDocumentoGeneralActual) {
		this.lidTipoDocumentoGeneralActual = lidTipoDocumentoGeneralActual;
	}
	
	
		
	
}
