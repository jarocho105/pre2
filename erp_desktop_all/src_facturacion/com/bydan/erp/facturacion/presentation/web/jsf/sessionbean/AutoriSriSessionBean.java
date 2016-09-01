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
public class AutoriSriSessionBean  extends AutoriSriSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri;
	protected Long lIdAutoriSriActualForeignKey;	
	
	protected Long lIdAutoriSriActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras;
	protected String sUltimaBusquedaAutoriSri;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral;
	Long lidTipoDocumentoGeneralActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_documento_general;
	private String numero_secuencial;
	private String numero_autor;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AutoriSriSessionBeanAdditional autorisriSessionBeanAdditional=null;
	
	public AutoriSriSessionBeanAdditional getAutoriSriSessionBeanAdditional() {
		return this.autorisriSessionBeanAdditional;
	}
	
	public void setAutoriSriSessionBeanAdditional(AutoriSriSessionBeanAdditional autorisriSessionBeanAdditional) {
		try {
			this.autorisriSessionBeanAdditional=autorisriSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AutoriSriSessionBean () {
		this.inicializarAutoriSriSessionBean();
	}
	
	public void inicializarAutoriSriSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri=false;
		this.lIdAutoriSriActualForeignKey=0L;
		this.lIdAutoriSriActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras=false;
		this.sUltimaBusquedaAutoriSri ="";
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
		isBusquedaDesdeForeignKeySesionTipoDocumentoGeneral=false;
		lidTipoDocumentoGeneralActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_documento_general=-1L;
 		this.numero_secuencial="";
 		this.numero_autor="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAutoriSri() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAutoriSri(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri= isPermiteNavegacionHaciaForeignKeyDesdeAutoriSri;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri = sNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriSri;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriSri() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriSri(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri= isBusquedaDesdeForeignKeySesionForeignKeyAutoriSri;
	}
					
	public Long getlIdAutoriSriActualForeignKey() {
		return lIdAutoriSriActualForeignKey;
	}

	public void setlIdAutoriSriActualForeignKey(
			Long lIdAutoriSriActualForeignKey) {
		this.lIdAutoriSriActualForeignKey = lIdAutoriSriActualForeignKey;
	}
				    
	public Long getlIdAutoriSriActualForeignKeyParaPosibleAtras() {
		return lIdAutoriSriActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAutoriSriActualForeignKeyParaPosibleAtras(
			Long lIdAutoriSriActualForeignKeyParaPosibleAtras) {
		this.lIdAutoriSriActualForeignKeyParaPosibleAtras = lIdAutoriSriActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAutoriSriParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAutoriSri() {
		return sUltimaBusquedaAutoriSri;
	}

	public void setsUltimaBusquedaAutoriSri(String sUltimaBusquedaAutoriSri) {
		this.sUltimaBusquedaAutoriSri = sUltimaBusquedaAutoriSri;
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
    
	public Long getid_tipo_documento_general() {
		return this.id_tipo_documento_general;
	}
    
	public String getnumero_secuencial() {
		return this.numero_secuencial;
	}
    
	public String getnumero_autor() {
		return this.numero_autor;
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna id");
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna id_tipo_documento_general");
					}
				}

				this.id_tipo_documento_general=newid_tipo_documento_general;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_secuencial(String newnumero_secuencial)throws Exception
	{
		try {
			if(this.numero_secuencial!=newnumero_secuencial) {
				if(newnumero_secuencial==null) {
					//newnumero_secuencial="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriSri:Valor nulo no permitido en columna numero_secuencial");
					}
				}

				if(newnumero_secuencial!=null&&newnumero_secuencial.length()>50) {
					newnumero_secuencial=newnumero_secuencial.substring(0,48);
					System.out.println("AutoriSri:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_secuencial");
				}

				this.numero_secuencial=newnumero_secuencial;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_autor(String newnumero_autor)throws Exception
	{
		try {
			if(this.numero_autor!=newnumero_autor) {
				if(newnumero_autor==null) {
					//newnumero_autor="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AutoriSri:Valor nulo no permitido en columna numero_autor");
					}
				}

				if(newnumero_autor!=null&&newnumero_autor.length()>50) {
					newnumero_autor=newnumero_autor.substring(0,48);
					System.out.println("AutoriSri:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_autor");
				}

				this.numero_autor=newnumero_autor;
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna fecha_inicio");
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
						System.out.println("AutoriSri:Valor nulo no permitido en columna fecha_fin");
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
