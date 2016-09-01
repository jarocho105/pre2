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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class AutoriConsepSessionBean  extends AutoriConsepSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep;
	protected Long lIdAutoriConsepActualForeignKey;	
	
	protected Long lIdAutoriConsepActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras;
	protected String sUltimaBusquedaAutoriConsep;
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
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoAutoriConsep;
	Long lidTipoAutoriConsepActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_usuario;
	private Long id_cliente;
	private String numero_autorizacion;
	private Long id_tipo_autori_consep;
	private Long id_empleado;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AutoriConsepSessionBeanAdditional autoriconsepSessionBeanAdditional=null;
	
	public AutoriConsepSessionBeanAdditional getAutoriConsepSessionBeanAdditional() {
		return this.autoriconsepSessionBeanAdditional;
	}
	
	public void setAutoriConsepSessionBeanAdditional(AutoriConsepSessionBeanAdditional autoriconsepSessionBeanAdditional) {
		try {
			this.autoriconsepSessionBeanAdditional=autoriconsepSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AutoriConsepSessionBean () {
		this.inicializarAutoriConsepSessionBean();
	}
	
	public void inicializarAutoriConsepSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep=false;
		this.lIdAutoriConsepActualForeignKey=0L;
		this.lIdAutoriConsepActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras=false;
		this.sUltimaBusquedaAutoriConsep ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoAutoriConsep=false;
		lidTipoAutoriConsepActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_usuario=-1L;
 		this.id_cliente=-1L;
 		this.numero_autorizacion="";
 		this.id_tipo_autori_consep=-1L;
 		this.id_empleado=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep= isPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep = sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep= isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep;
	}
					
	public Long getlIdAutoriConsepActualForeignKey() {
		return lIdAutoriConsepActualForeignKey;
	}

	public void setlIdAutoriConsepActualForeignKey(
			Long lIdAutoriConsepActualForeignKey) {
		this.lIdAutoriConsepActualForeignKey = lIdAutoriConsepActualForeignKey;
	}
				    
	public Long getlIdAutoriConsepActualForeignKeyParaPosibleAtras() {
		return lIdAutoriConsepActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAutoriConsepActualForeignKeyParaPosibleAtras(
			Long lIdAutoriConsepActualForeignKeyParaPosibleAtras) {
		this.lIdAutoriConsepActualForeignKeyParaPosibleAtras = lIdAutoriConsepActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAutoriConsepParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAutoriConsep() {
		return sUltimaBusquedaAutoriConsep;
	}

	public void setsUltimaBusquedaAutoriConsep(String sUltimaBusquedaAutoriConsep) {
		this.sUltimaBusquedaAutoriConsep = sUltimaBusquedaAutoriConsep;
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
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public String getnumero_autorizacion() {
		return this.numero_autorizacion;
	}
    
	public Long getid_tipo_autori_consep() {
		return this.id_tipo_autori_consep;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id");
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
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
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
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_autorizacion(String newnumero_autorizacion)throws Exception
	{
		try {
			if(this.numero_autorizacion!=newnumero_autorizacion) {
				if(newnumero_autorizacion==null) {
					//newnumero_autorizacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriConsep:Valor nulo no permitido en columna numero_autorizacion");
					}
				}

				if(newnumero_autorizacion!=null&&newnumero_autorizacion.length()>50) {
					newnumero_autorizacion=newnumero_autorizacion.substring(0,48);
					System.out.println("AutoriConsep:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_autorizacion");
				}

				this.numero_autorizacion=newnumero_autorizacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_autori_consep(Long newid_tipo_autori_consep)throws Exception
	{
		try {
			if(this.id_tipo_autori_consep!=newid_tipo_autori_consep) {
				if(newid_tipo_autori_consep==null) {
					//newid_tipo_autori_consep=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id_tipo_autori_consep");
					}
				}

				this.id_tipo_autori_consep=newid_tipo_autori_consep;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriConsep:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoAutoriConsep() {
		return isBusquedaDesdeForeignKeySesionTipoAutoriConsep;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoAutoriConsep(
		Boolean isBusquedaDesdeForeignKeySesionTipoAutoriConsep) {
		this.isBusquedaDesdeForeignKeySesionTipoAutoriConsep = isBusquedaDesdeForeignKeySesionTipoAutoriConsep;
	}

	public Long getlidTipoAutoriConsepActual() {
		return lidTipoAutoriConsepActual;
	}

	public void setlidTipoAutoriConsepActual(Long lidTipoAutoriConsepActual) {
		this.lidTipoAutoriConsepActual = lidTipoAutoriConsepActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	
	
		
	
}
