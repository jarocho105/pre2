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
public class TransportistaSessionBean  extends TransportistaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransportista;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransportista;
	protected Long lIdTransportistaActualForeignKey;	
	
	protected Long lIdTransportistaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras;
	protected String sUltimaBusquedaTransportista;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	Long lidTipoViaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_via_transporte;
	private String identificacion;
	private String ruc;
	private String nombre_completo;
	private String telefono;
	private Long id_cliente;
	private String placa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TransportistaSessionBeanAdditional transportistaSessionBeanAdditional=null;
	
	public TransportistaSessionBeanAdditional getTransportistaSessionBeanAdditional() {
		return this.transportistaSessionBeanAdditional;
	}
	
	public void setTransportistaSessionBeanAdditional(TransportistaSessionBeanAdditional transportistaSessionBeanAdditional) {
		try {
			this.transportistaSessionBeanAdditional=transportistaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TransportistaSessionBean () {
		this.inicializarTransportistaSessionBean();
	}
	
	public void inicializarTransportistaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransportista=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransportista=false;
		this.lIdTransportistaActualForeignKey=0L;
		this.lIdTransportistaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras=false;
		this.sUltimaBusquedaTransportista ="";
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
		isBusquedaDesdeForeignKeySesionTipoViaTransporte=false;
		lidTipoViaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_via_transporte=-1L;
 		this.identificacion="";
 		this.ruc="";
 		this.nombre_completo="";
 		this.telefono="";
 		this.id_cliente=-1L;
 		this.placa="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTransportista() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTransportista;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTransportista(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransportista) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransportista= isPermiteNavegacionHaciaForeignKeyDesdeTransportista;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista = sNombrePaginaNavegacionHaciaForeignKeyDesdeTransportista;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransportista() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransportista;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransportista(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransportista) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransportista= isBusquedaDesdeForeignKeySesionForeignKeyTransportista;
	}
					
	public Long getlIdTransportistaActualForeignKey() {
		return lIdTransportistaActualForeignKey;
	}

	public void setlIdTransportistaActualForeignKey(
			Long lIdTransportistaActualForeignKey) {
		this.lIdTransportistaActualForeignKey = lIdTransportistaActualForeignKey;
	}
				    
	public Long getlIdTransportistaActualForeignKeyParaPosibleAtras() {
		return lIdTransportistaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTransportistaActualForeignKeyParaPosibleAtras(
			Long lIdTransportistaActualForeignKeyParaPosibleAtras) {
		this.lIdTransportistaActualForeignKeyParaPosibleAtras = lIdTransportistaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTransportistaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTransportista() {
		return sUltimaBusquedaTransportista;
	}

	public void setsUltimaBusquedaTransportista(String sUltimaBusquedaTransportista) {
		this.sUltimaBusquedaTransportista = sUltimaBusquedaTransportista;
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
    
	public Long getid_tipo_via_transporte() {
		return this.id_tipo_via_transporte;
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
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public String getplaca() {
		return this.placa;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Transportista:Valor nulo no permitido en columna id");
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
						System.out.println("Transportista:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Transportista:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("Transportista:Valor nulo no permitido en columna id_tipo_via_transporte");
					}
				}

				this.id_tipo_via_transporte=newid_tipo_via_transporte;
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
						System.out.println("Transportista:Valor nulo no permitido en columna identificacion");
					}
				}

				if(newidentificacion!=null&&newidentificacion.length()>25) {
					newidentificacion=newidentificacion.substring(0,23);
					System.out.println("Transportista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna identificacion");
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
						System.out.println("Transportista:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>15) {
					newruc=newruc.substring(0,13);
					System.out.println("Transportista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna ruc");
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
						System.out.println("Transportista:Valor nulo no permitido en columna nombre_completo");
					}
				}

				if(newnombre_completo!=null&&newnombre_completo.length()>200) {
					newnombre_completo=newnombre_completo.substring(0,198);
					System.out.println("Transportista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre_completo");
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
						System.out.println("Transportista:Valor nulo no permitido en columna telefono");
					}
				}

				if(newtelefono!=null&&newtelefono.length()>50) {
					newtelefono=newtelefono.substring(0,48);
					System.out.println("Transportista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna telefono");
				}

				this.telefono=newtelefono;
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
						System.out.println("Transportista:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setplaca(String newplaca)throws Exception
	{
		try {
			if(this.placa!=newplaca) {
				if(newplaca==null) {
					//newplaca="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Transportista:Valor nulo no permitido en columna placa");
					}
				}

				if(newplaca!=null&&newplaca.length()>50) {
					newplaca=newplaca.substring(0,48);
					System.out.println("Transportista:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna placa");
				}

				this.placa=newplaca;
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
	
	
		
	
}
