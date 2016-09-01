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
public class EmbarcadorSessionBean  extends EmbarcadorSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador;
	protected Long lIdEmbarcadorActualForeignKey;	
	
	protected Long lIdEmbarcadorActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras;
	protected String sUltimaBusquedaEmbarcador;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	Long lidTipoViaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionPuerto;
	Long lidPuertoActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	
	private Long id;
	private Long id_empresa;
	private String nombre;
	private String ruc;
	private String telefono;
	private String contacto;
	private String e_mail;
	private Long id_tipo_via_transporte;
	private Long id_puerto;
	private Long id_empleado;
	private Long id_pais;
	private Long id_ciudad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected EmbarcadorSessionBeanAdditional embarcadorSessionBeanAdditional=null;
	
	public EmbarcadorSessionBeanAdditional getEmbarcadorSessionBeanAdditional() {
		return this.embarcadorSessionBeanAdditional;
	}
	
	public void setEmbarcadorSessionBeanAdditional(EmbarcadorSessionBeanAdditional embarcadorSessionBeanAdditional) {
		try {
			this.embarcadorSessionBeanAdditional=embarcadorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public EmbarcadorSessionBean () {
		this.inicializarEmbarcadorSessionBean();
	}
	
	public void inicializarEmbarcadorSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador=false;
		this.lIdEmbarcadorActualForeignKey=0L;
		this.lIdEmbarcadorActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras=false;
		this.sUltimaBusquedaEmbarcador ="";
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
		isBusquedaDesdeForeignKeySesionTipoViaTransporte=false;
		lidTipoViaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionPuerto=false;
		lidPuertoActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.nombre="";
 		this.ruc="";
 		this.telefono="";
 		this.contacto="";
 		this.e_mail="";
 		this.id_tipo_via_transporte=-1L;
 		this.id_puerto=-1L;
 		this.id_empleado=-1L;
 		this.id_pais=-1L;
 		this.id_ciudad=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeEmbarcador() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeEmbarcador(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador= isPermiteNavegacionHaciaForeignKeyDesdeEmbarcador;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador(String sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador = sNombrePaginaNavegacionHaciaForeignKeyDesdeEmbarcador;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmbarcador() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmbarcador(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador= isBusquedaDesdeForeignKeySesionForeignKeyEmbarcador;
	}
					
	public Long getlIdEmbarcadorActualForeignKey() {
		return lIdEmbarcadorActualForeignKey;
	}

	public void setlIdEmbarcadorActualForeignKey(
			Long lIdEmbarcadorActualForeignKey) {
		this.lIdEmbarcadorActualForeignKey = lIdEmbarcadorActualForeignKey;
	}
				    
	public Long getlIdEmbarcadorActualForeignKeyParaPosibleAtras() {
		return lIdEmbarcadorActualForeignKeyParaPosibleAtras;
	}

	public void setlIdEmbarcadorActualForeignKeyParaPosibleAtras(
			Long lIdEmbarcadorActualForeignKeyParaPosibleAtras) {
		this.lIdEmbarcadorActualForeignKeyParaPosibleAtras = lIdEmbarcadorActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyEmbarcadorParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaEmbarcador() {
		return sUltimaBusquedaEmbarcador;
	}

	public void setsUltimaBusquedaEmbarcador(String sUltimaBusquedaEmbarcador) {
		this.sUltimaBusquedaEmbarcador = sUltimaBusquedaEmbarcador;
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
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public String gettelefono() {
		return this.telefono;
	}
    
	public String getcontacto() {
		return this.contacto;
	}
    
	public String gete_mail() {
		return this.e_mail;
	}
    
	public Long getid_tipo_via_transporte() {
		return this.id_tipo_via_transporte;
	}
    
	public Long getid_puerto() {
		return this.id_puerto;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna id");
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
						System.out.println("Embarcador:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("Embarcador:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Embarcador:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
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
						System.out.println("Embarcador:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>20) {
					newruc=newruc.substring(0,18);
					System.out.println("Embarcador:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ruc");
				}

				this.ruc=newruc;
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
						System.out.println("Embarcador:Valor nulo no permitido en columna telefono");
					}
				}

				if(newtelefono!=null&&newtelefono.length()>50) {
					newtelefono=newtelefono.substring(0,48);
					System.out.println("Embarcador:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna telefono");
				}

				this.telefono=newtelefono;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcontacto(String newcontacto)throws Exception
	{
		try {
			if(this.contacto!=newcontacto) {
				if(newcontacto==null) {
					//newcontacto="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna contacto");
					}
				}

				if(newcontacto!=null&&newcontacto.length()>100) {
					newcontacto=newcontacto.substring(0,98);
					System.out.println("Embarcador:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna contacto");
				}

				this.contacto=newcontacto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void sete_mail(String newe_mail)throws Exception
	{
		try {
			if(this.e_mail!=newe_mail) {
				if(newe_mail==null) {
					//newe_mail="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna e_mail");
					}
				}

				if(newe_mail!=null&&newe_mail.length()>50) {
					newe_mail=newe_mail.substring(0,48);
					System.out.println("Embarcador:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna e_mail");
				}

				this.e_mail=newe_mail;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_via_transporte(Long newid_tipo_via_transporte)throws Exception
	{
		try {
			if(this.id_tipo_via_transporte!=newid_tipo_via_transporte) {
				if(newid_tipo_via_transporte==null) {
					//newid_tipo_via_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna id_tipo_via_transporte");
					}
				}

				this.id_tipo_via_transporte=newid_tipo_via_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_puerto(Long newid_puerto)throws Exception
	{
		try {
			if(this.id_puerto!=newid_puerto) {
				if(newid_puerto==null) {
					//newid_puerto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna id_puerto");
					}
				}

				this.id_puerto=newid_puerto;
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
						System.out.println("Embarcador:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Embarcador:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad) {
		if(this.id_ciudad!=newid_ciudad) {

			this.id_ciudad=newid_ciudad;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoViaTransporte() {
		return isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoViaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte) {
		this.isBusquedaDesdeForeignKeySesionTipoViaTransporte = isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public Long getlidTipoViaTransporteActual() {
		return lidTipoViaTransporteActual;
	}

	public void setlidTipoViaTransporteActual(Long lidTipoViaTransporteActual) {
		this.lidTipoViaTransporteActual = lidTipoViaTransporteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPuerto() {
		return isBusquedaDesdeForeignKeySesionPuerto;
	}

	public void setisBusquedaDesdeForeignKeySesionPuerto(
		Boolean isBusquedaDesdeForeignKeySesionPuerto) {
		this.isBusquedaDesdeForeignKeySesionPuerto = isBusquedaDesdeForeignKeySesionPuerto;
	}

	public Long getlidPuertoActual() {
		return lidPuertoActual;
	}

	public void setlidPuertoActual(Long lidPuertoActual) {
		this.lidPuertoActual = lidPuertoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	
	
		
	
}
