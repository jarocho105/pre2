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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class SubClienteSessionBean  extends SubClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeSubCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySubCliente;
	protected Long lIdSubClienteActualForeignKey;	
	
	protected Long lIdSubClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras;
	protected String sUltimaBusquedaSubCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	Long lidTipoIdentificacionActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionZona;
	Long lidZonaActual;
	Boolean isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	Long lidPaisNacionalidadActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGenero;
	Long lidTipoGeneroActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoCivil;
	Long lidEstadoCivilActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoLegal;
	Long lidEstadoLegalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	Long lidTipoNivelEduActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_cliente;
	private Long id_sucursal;
	private Long id_tipo_identificacion;
	private String identificacion;
	private String ruc;
	private String nombre_completo;
	private Long id_pais;
	private Long id_ciudad;
	private Long id_zona;
	private Long id_pais_nacionalidad;
	private Long id_tipo_genero;
	private Long id_estado_civil;
	private Long id_estado_legal;
	private Long id_tipo_nivel_edu;
	private Long id_cuenta_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected SubClienteSessionBeanAdditional subclienteSessionBeanAdditional=null;
	
	public SubClienteSessionBeanAdditional getSubClienteSessionBeanAdditional() {
		return this.subclienteSessionBeanAdditional;
	}
	
	public void setSubClienteSessionBeanAdditional(SubClienteSessionBeanAdditional subclienteSessionBeanAdditional) {
		try {
			this.subclienteSessionBeanAdditional=subclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public SubClienteSessionBean () {
		this.inicializarSubClienteSessionBean();
	}
	
	public void inicializarSubClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeSubCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeySubCliente=false;
		this.lIdSubClienteActualForeignKey=0L;
		this.lIdSubClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras=false;
		this.sUltimaBusquedaSubCliente ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIdentificacion=false;
		lidTipoIdentificacionActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionZona=false;
		lidZonaActual=0L;
		isBusquedaDesdeForeignKeySesionPaisNacionalidad=false;
		lidPaisNacionalidadActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGenero=false;
		lidTipoGeneroActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoCivil=false;
		lidEstadoCivilActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoLegal=false;
		lidEstadoLegalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoNivelEdu=false;
		lidTipoNivelEduActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_cliente=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_identificacion=-1L;
 		this.identificacion="";
 		this.ruc="";
 		this.nombre_completo="";
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
 		this.id_zona=-1L;
 		this.id_pais_nacionalidad=-1L;
 		this.id_tipo_genero=-1L;
 		this.id_estado_civil=-1L;
 		this.id_estado_legal=-1L;
 		this.id_tipo_nivel_edu=-1L;
 		this.id_cuenta_contable=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeSubCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeSubCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeSubCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeSubCliente= isPermiteNavegacionHaciaForeignKeyDesdeSubCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySubCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeySubCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySubCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySubCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySubCliente= isBusquedaDesdeForeignKeySesionForeignKeySubCliente;
	}
					
	public Long getlIdSubClienteActualForeignKey() {
		return lIdSubClienteActualForeignKey;
	}

	public void setlIdSubClienteActualForeignKey(
			Long lIdSubClienteActualForeignKey) {
		this.lIdSubClienteActualForeignKey = lIdSubClienteActualForeignKey;
	}
				    
	public Long getlIdSubClienteActualForeignKeyParaPosibleAtras() {
		return lIdSubClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdSubClienteActualForeignKeyParaPosibleAtras(
			Long lIdSubClienteActualForeignKeyParaPosibleAtras) {
		this.lIdSubClienteActualForeignKeyParaPosibleAtras = lIdSubClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeySubClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaSubCliente() {
		return sUltimaBusquedaSubCliente;
	}

	public void setsUltimaBusquedaSubCliente(String sUltimaBusquedaSubCliente) {
		this.sUltimaBusquedaSubCliente = sUltimaBusquedaSubCliente;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_tipo_identificacion() {
		return this.id_tipo_identificacion;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_zona() {
		return this.id_zona;
	}
    
	public Long getid_pais_nacionalidad() {
		return this.id_pais_nacionalidad;
	}
    
	public Long getid_tipo_genero() {
		return this.id_tipo_genero;
	}
    
	public Long getid_estado_civil() {
		return this.id_estado_civil;
	}
    
	public Long getid_estado_legal() {
		return this.id_estado_legal;
	}
    
	public Long getid_tipo_nivel_edu() {
		return this.id_tipo_nivel_edu;
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id");
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_identificacion(Long newid_tipo_identificacion)throws Exception
	{
		try {
			if(this.id_tipo_identificacion!=newid_tipo_identificacion) {
				if(newid_tipo_identificacion==null) {
					//newid_tipo_identificacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_tipo_identificacion");
					}
				}

				this.id_tipo_identificacion=newid_tipo_identificacion;
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
						System.out.println("SubCliente:Valor nulo no permitido en columna identificacion");
					}
				}

				if(newidentificacion!=null&&newidentificacion.length()>25) {
					newidentificacion=newidentificacion.substring(0,23);
					System.out.println("SubCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna identificacion");
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
						System.out.println("SubCliente:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>15) {
					newruc=newruc.substring(0,13);
					System.out.println("SubCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna ruc");
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
						System.out.println("SubCliente:Valor nulo no permitido en columna nombre_completo");
					}
				}

				if(newnombre_completo!=null&&newnombre_completo.length()>200) {
					newnombre_completo=newnombre_completo.substring(0,198);
					System.out.println("SubCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre_completo");
				}

				this.nombre_completo=newnombre_completo;
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_zona(Long newid_zona)throws Exception
	{
		try {
			if(this.id_zona!=newid_zona) {
				if(newid_zona==null) {
					//newid_zona=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_zona");
					}
				}

				this.id_zona=newid_zona;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais_nacionalidad(Long newid_pais_nacionalidad)throws Exception
	{
		try {
			if(this.id_pais_nacionalidad!=newid_pais_nacionalidad) {
				if(newid_pais_nacionalidad==null) {
					//newid_pais_nacionalidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_pais_nacionalidad");
					}
				}

				this.id_pais_nacionalidad=newid_pais_nacionalidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_genero(Long newid_tipo_genero)throws Exception
	{
		try {
			if(this.id_tipo_genero!=newid_tipo_genero) {
				if(newid_tipo_genero==null) {
					//newid_tipo_genero=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_tipo_genero");
					}
				}

				this.id_tipo_genero=newid_tipo_genero;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_civil(Long newid_estado_civil)throws Exception
	{
		try {
			if(this.id_estado_civil!=newid_estado_civil) {
				if(newid_estado_civil==null) {
					//newid_estado_civil=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_estado_civil");
					}
				}

				this.id_estado_civil=newid_estado_civil;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_legal(Long newid_estado_legal)throws Exception
	{
		try {
			if(this.id_estado_legal!=newid_estado_legal) {
				if(newid_estado_legal==null) {
					//newid_estado_legal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_estado_legal");
					}
				}

				this.id_estado_legal=newid_estado_legal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_nivel_edu(Long newid_tipo_nivel_edu)throws Exception
	{
		try {
			if(this.id_tipo_nivel_edu!=newid_tipo_nivel_edu) {
				if(newid_tipo_nivel_edu==null) {
					//newid_tipo_nivel_edu=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("SubCliente:Valor nulo no permitido en columna id_tipo_nivel_edu");
					}
				}

				this.id_tipo_nivel_edu=newid_tipo_nivel_edu;
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
						System.out.println("SubCliente:Valor nulo no permitido en columna id_cuenta_contable");
					}
				}

				this.id_cuenta_contable=newid_cuenta_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIdentificacion() {
		return isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIdentificacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoIdentificacion) {
		this.isBusquedaDesdeForeignKeySesionTipoIdentificacion = isBusquedaDesdeForeignKeySesionTipoIdentificacion;
	}

	public Long getlidTipoIdentificacionActual() {
		return lidTipoIdentificacionActual;
	}

	public void setlidTipoIdentificacionActual(Long lidTipoIdentificacionActual) {
		this.lidTipoIdentificacionActual = lidTipoIdentificacionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionZona() {
		return isBusquedaDesdeForeignKeySesionZona;
	}

	public void setisBusquedaDesdeForeignKeySesionZona(
		Boolean isBusquedaDesdeForeignKeySesionZona) {
		this.isBusquedaDesdeForeignKeySesionZona = isBusquedaDesdeForeignKeySesionZona;
	}

	public Long getlidZonaActual() {
		return lidZonaActual;
	}

	public void setlidZonaActual(Long lidZonaActual) {
		this.lidZonaActual = lidZonaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPaisNacionalidad() {
		return isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	}

	public void setisBusquedaDesdeForeignKeySesionPaisNacionalidad(
		Boolean isBusquedaDesdeForeignKeySesionPaisNacionalidad) {
		this.isBusquedaDesdeForeignKeySesionPaisNacionalidad = isBusquedaDesdeForeignKeySesionPaisNacionalidad;
	}

	public Long getlidPaisNacionalidadActual() {
		return lidPaisNacionalidadActual;
	}

	public void setlidPaisNacionalidadActual(Long lidPaisNacionalidadActual) {
		this.lidPaisNacionalidadActual = lidPaisNacionalidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGenero() {
		return isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGenero(
		Boolean isBusquedaDesdeForeignKeySesionTipoGenero) {
		this.isBusquedaDesdeForeignKeySesionTipoGenero = isBusquedaDesdeForeignKeySesionTipoGenero;
	}

	public Long getlidTipoGeneroActual() {
		return lidTipoGeneroActual;
	}

	public void setlidTipoGeneroActual(Long lidTipoGeneroActual) {
		this.lidTipoGeneroActual = lidTipoGeneroActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoCivil() {
		return isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoCivil(
		Boolean isBusquedaDesdeForeignKeySesionEstadoCivil) {
		this.isBusquedaDesdeForeignKeySesionEstadoCivil = isBusquedaDesdeForeignKeySesionEstadoCivil;
	}

	public Long getlidEstadoCivilActual() {
		return lidEstadoCivilActual;
	}

	public void setlidEstadoCivilActual(Long lidEstadoCivilActual) {
		this.lidEstadoCivilActual = lidEstadoCivilActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoLegal() {
		return isBusquedaDesdeForeignKeySesionEstadoLegal;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoLegal(
		Boolean isBusquedaDesdeForeignKeySesionEstadoLegal) {
		this.isBusquedaDesdeForeignKeySesionEstadoLegal = isBusquedaDesdeForeignKeySesionEstadoLegal;
	}

	public Long getlidEstadoLegalActual() {
		return lidEstadoLegalActual;
	}

	public void setlidEstadoLegalActual(Long lidEstadoLegalActual) {
		this.lidEstadoLegalActual = lidEstadoLegalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoNivelEdu() {
		return isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoNivelEdu(
		Boolean isBusquedaDesdeForeignKeySesionTipoNivelEdu) {
		this.isBusquedaDesdeForeignKeySesionTipoNivelEdu = isBusquedaDesdeForeignKeySesionTipoNivelEdu;
	}

	public Long getlidTipoNivelEduActual() {
		return lidTipoNivelEduActual;
	}

	public void setlidTipoNivelEduActual(Long lidTipoNivelEduActual) {
		this.lidTipoNivelEduActual = lidTipoNivelEduActual;
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
