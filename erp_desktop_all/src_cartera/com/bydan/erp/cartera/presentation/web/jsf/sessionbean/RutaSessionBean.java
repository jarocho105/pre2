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
public class RutaSessionBean  extends RutaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeRuta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRuta;
	protected Long lIdRutaActualForeignKey;	
	
	protected Long lIdRutaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras;
	protected String sUltimaBusquedaRuta;
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
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionSectorOrigen;
	Long lidSectorOrigenActual;
	Boolean isBusquedaDesdeForeignKeySesionSectorDestino;
	Long lidSectorDestinoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_pais;
	private Long id_ciudad;
	private Long id_sector_origen;
	private Long id_sector_destino;
	private String nombre;
	private String origen;
	private String destino;
	private Double precio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected RutaSessionBeanAdditional rutaSessionBeanAdditional=null;
	
	public RutaSessionBeanAdditional getRutaSessionBeanAdditional() {
		return this.rutaSessionBeanAdditional;
	}
	
	public void setRutaSessionBeanAdditional(RutaSessionBeanAdditional rutaSessionBeanAdditional) {
		try {
			this.rutaSessionBeanAdditional=rutaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public RutaSessionBean () {
		this.inicializarRutaSessionBean();
	}
	
	public void inicializarRutaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeRuta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyRuta=false;
		this.lIdRutaActualForeignKey=0L;
		this.lIdRutaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras=false;
		this.sUltimaBusquedaRuta ="";
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
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionSectorOrigen=false;
		lidSectorOrigenActual=0L;
		isBusquedaDesdeForeignKeySesionSectorDestino=false;
		lidSectorDestinoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
 		this.id_sector_origen=-1L;
 		this.id_sector_destino=-1L;
 		this.nombre="";
 		this.origen="";
 		this.destino="";
 		this.precio=0.0;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeRuta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeRuta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeRuta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeRuta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeRuta= isPermiteNavegacionHaciaForeignKeyDesdeRuta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeRuta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeRuta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta = sNombrePaginaNavegacionHaciaForeignKeyDesdeRuta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRuta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRuta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRuta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRuta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRuta= isBusquedaDesdeForeignKeySesionForeignKeyRuta;
	}
					
	public Long getlIdRutaActualForeignKey() {
		return lIdRutaActualForeignKey;
	}

	public void setlIdRutaActualForeignKey(
			Long lIdRutaActualForeignKey) {
		this.lIdRutaActualForeignKey = lIdRutaActualForeignKey;
	}
				    
	public Long getlIdRutaActualForeignKeyParaPosibleAtras() {
		return lIdRutaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdRutaActualForeignKeyParaPosibleAtras(
			Long lIdRutaActualForeignKeyParaPosibleAtras) {
		this.lIdRutaActualForeignKeyParaPosibleAtras = lIdRutaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyRutaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaRuta() {
		return sUltimaBusquedaRuta;
	}

	public void setsUltimaBusquedaRuta(String sUltimaBusquedaRuta) {
		this.sUltimaBusquedaRuta = sUltimaBusquedaRuta;
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
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_sector_origen() {
		return this.id_sector_origen;
	}
    
	public Long getid_sector_destino() {
		return this.id_sector_destino;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public String getorigen() {
		return this.origen;
	}
    
	public String getdestino() {
		return this.destino;
	}
    
	public Double getprecio() {
		return this.precio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna id");
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
						System.out.println("Ruta:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("Ruta:Valor nulo no permitido en columna id_pais");
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
						System.out.println("Ruta:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sector_origen(Long newid_sector_origen)throws Exception
	{
		try {
			if(this.id_sector_origen!=newid_sector_origen) {
				if(newid_sector_origen==null) {
					//newid_sector_origen=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna id_sector_origen");
					}
				}

				this.id_sector_origen=newid_sector_origen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sector_destino(Long newid_sector_destino)throws Exception
	{
		try {
			if(this.id_sector_destino!=newid_sector_destino) {
				if(newid_sector_destino==null) {
					//newid_sector_destino=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna id_sector_destino");
					}
				}

				this.id_sector_destino=newid_sector_destino;
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
						System.out.println("Ruta:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Ruta:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setorigen(String neworigen)throws Exception
	{
		try {
			if(this.origen!=neworigen) {
				if(neworigen==null) {
					//neworigen="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna origen");
					}
				}

				if(neworigen!=null&&neworigen.length()>150) {
					neworigen=neworigen.substring(0,148);
					System.out.println("Ruta:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna origen");
				}

				this.origen=neworigen;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setdestino(String newdestino)throws Exception
	{
		try {
			if(this.destino!=newdestino) {
				if(newdestino==null) {
					//newdestino="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna destino");
					}
				}

				if(newdestino!=null&&newdestino.length()>150) {
					newdestino=newdestino.substring(0,148);
					System.out.println("Ruta:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna destino");
				}

				this.destino=newdestino;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setprecio(Double newprecio)throws Exception
	{
		try {
			if(this.precio!=newprecio) {
				if(newprecio==null) {
					//newprecio=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Ruta:Valor nulo no permitido en columna precio");
					}
				}

				this.precio=newprecio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSectorOrigen() {
		return isBusquedaDesdeForeignKeySesionSectorOrigen;
	}

	public void setisBusquedaDesdeForeignKeySesionSectorOrigen(
		Boolean isBusquedaDesdeForeignKeySesionSectorOrigen) {
		this.isBusquedaDesdeForeignKeySesionSectorOrigen = isBusquedaDesdeForeignKeySesionSectorOrigen;
	}

	public Long getlidSectorOrigenActual() {
		return lidSectorOrigenActual;
	}

	public void setlidSectorOrigenActual(Long lidSectorOrigenActual) {
		this.lidSectorOrigenActual = lidSectorOrigenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSectorDestino() {
		return isBusquedaDesdeForeignKeySesionSectorDestino;
	}

	public void setisBusquedaDesdeForeignKeySesionSectorDestino(
		Boolean isBusquedaDesdeForeignKeySesionSectorDestino) {
		this.isBusquedaDesdeForeignKeySesionSectorDestino = isBusquedaDesdeForeignKeySesionSectorDestino;
	}

	public Long getlidSectorDestinoActual() {
		return lidSectorDestinoActual;
	}

	public void setlidSectorDestinoActual(Long lidSectorDestinoActual) {
		this.lidSectorDestinoActual = lidSectorDestinoActual;
	}
	
	
		
	
}
