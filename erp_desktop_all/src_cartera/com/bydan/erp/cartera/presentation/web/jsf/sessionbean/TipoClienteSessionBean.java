/*
*AVISO LEGAL
? Copyright
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
public class TipoClienteSessionBean  {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente;
	protected Long lIdTipoClienteActualForeignKey;	
	
	protected Long lIdTipoClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras;
	protected String sUltimaBusquedaTipoCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoTituloCliente;
	Long lidTipoTituloClienteActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_tipo_titulo_cliente;
	private String codigo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	public TipoClienteSessionBean () {
		this.inicializarTipoClienteSessionBean();
	}
	
	public void inicializarTipoClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente=false;
		this.lIdTipoClienteActualForeignKey=0L;
		this.lIdTipoClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras=false;
		this.sUltimaBusquedaTipoCliente ="";
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
		isBusquedaDesdeForeignKeySesionTipoTituloCliente=false;
		lidTipoTituloClienteActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_tipo_titulo_cliente=-1L;
 		this.codigo="";
 		this.nombre="";
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente= isPermiteNavegacionHaciaForeignKeyDesdeTipoCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente= isBusquedaDesdeForeignKeySesionForeignKeyTipoCliente;
	}
					
	public Long getlIdTipoClienteActualForeignKey() {
		return lIdTipoClienteActualForeignKey;
	}

	public void setlIdTipoClienteActualForeignKey(
			Long lIdTipoClienteActualForeignKey) {
		this.lIdTipoClienteActualForeignKey = lIdTipoClienteActualForeignKey;
	}
				    
	public Long getlIdTipoClienteActualForeignKeyParaPosibleAtras() {
		return lIdTipoClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoClienteActualForeignKeyParaPosibleAtras(
			Long lIdTipoClienteActualForeignKeyParaPosibleAtras) {
		this.lIdTipoClienteActualForeignKeyParaPosibleAtras = lIdTipoClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoCliente() {
		return sUltimaBusquedaTipoCliente;
	}

	public void setsUltimaBusquedaTipoCliente(String sUltimaBusquedaTipoCliente) {
		this.sUltimaBusquedaTipoCliente = sUltimaBusquedaTipoCliente;
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
    
	public Long getid_tipo_titulo_cliente() {
		return this.id_tipo_titulo_cliente;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCliente:Valor nulo no permitido en columna id");
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
						System.out.println("TipoCliente:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_titulo_cliente(Long newid_tipo_titulo_cliente)throws Exception
	{
		try {
			if(this.id_tipo_titulo_cliente!=newid_tipo_titulo_cliente) {
				if(newid_tipo_titulo_cliente==null) {
					//newid_tipo_titulo_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCliente:Valor nulo no permitido en columna id_tipo_titulo_cliente");
					}
				}

				this.id_tipo_titulo_cliente=newid_tipo_titulo_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoCliente:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("TipoCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
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
						System.out.println("TipoCliente:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("TipoCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTituloCliente() {
		return isBusquedaDesdeForeignKeySesionTipoTituloCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTituloCliente(
		Boolean isBusquedaDesdeForeignKeySesionTipoTituloCliente) {
		this.isBusquedaDesdeForeignKeySesionTipoTituloCliente = isBusquedaDesdeForeignKeySesionTipoTituloCliente;
	}

	public Long getlidTipoTituloClienteActual() {
		return lidTipoTituloClienteActual;
	}

	public void setlidTipoTituloClienteActual(Long lidTipoTituloClienteActual) {
		this.lidTipoTituloClienteActual = lidTipoTituloClienteActual;
	}
	
	
		
	
}
