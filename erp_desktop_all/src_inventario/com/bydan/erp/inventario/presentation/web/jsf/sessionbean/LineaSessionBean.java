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
public class LineaSessionBean  extends LineaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeLinea;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLinea;
	protected Long lIdLineaActualForeignKey;	
	
	protected Long lIdLineaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras;
	protected String sUltimaBusquedaLinea;
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
	Boolean isBusquedaDesdeForeignKeySesionNivelLinea;
	Long lidNivelLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_nivel_linea;
	private Long id_linea;
	private String codigo;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected LineaSessionBeanAdditional lineaSessionBeanAdditional=null;
	
	public LineaSessionBeanAdditional getLineaSessionBeanAdditional() {
		return this.lineaSessionBeanAdditional;
	}
	
	public void setLineaSessionBeanAdditional(LineaSessionBeanAdditional lineaSessionBeanAdditional) {
		try {
			this.lineaSessionBeanAdditional=lineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public LineaSessionBean () {
		this.inicializarLineaSessionBean();
	}
	
	public void inicializarLineaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeLinea=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyLinea=false;
		this.lIdLineaActualForeignKey=0L;
		this.lIdLineaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras=false;
		this.sUltimaBusquedaLinea ="";
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
		isBusquedaDesdeForeignKeySesionNivelLinea=false;
		lidNivelLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_nivel_linea=-1L;
 		this.id_linea=null;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeLinea() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeLinea;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeLinea(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeLinea) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeLinea= isPermiteNavegacionHaciaForeignKeyDesdeLinea;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeLinea() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeLinea(String sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea = sNombrePaginaNavegacionHaciaForeignKeyDesdeLinea;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLinea() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLinea(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLinea) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLinea= isBusquedaDesdeForeignKeySesionForeignKeyLinea;
	}
					
	public Long getlIdLineaActualForeignKey() {
		return lIdLineaActualForeignKey;
	}

	public void setlIdLineaActualForeignKey(
			Long lIdLineaActualForeignKey) {
		this.lIdLineaActualForeignKey = lIdLineaActualForeignKey;
	}
				    
	public Long getlIdLineaActualForeignKeyParaPosibleAtras() {
		return lIdLineaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdLineaActualForeignKeyParaPosibleAtras(
			Long lIdLineaActualForeignKeyParaPosibleAtras) {
		this.lIdLineaActualForeignKeyParaPosibleAtras = lIdLineaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyLineaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaLinea() {
		return sUltimaBusquedaLinea;
	}

	public void setsUltimaBusquedaLinea(String sUltimaBusquedaLinea) {
		this.sUltimaBusquedaLinea = sUltimaBusquedaLinea;
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
    
	public Long getid_nivel_linea() {
		return this.id_nivel_linea;
	}
    
	public Long getid_linea() {
		return this.id_linea;
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
						System.out.println("Linea:Valor nulo no permitido en columna id");
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
						System.out.println("Linea:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_nivel_linea(Long newid_nivel_linea)throws Exception
	{
		try {
			if(this.id_nivel_linea!=newid_nivel_linea) {
				if(newid_nivel_linea==null) {
					//newid_nivel_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Linea:Valor nulo no permitido en columna id_nivel_linea");
					}
				}

				this.id_nivel_linea=newid_nivel_linea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea(Long newid_linea) {
		if(this.id_linea!=newid_linea) {

			this.id_linea=newid_linea;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Linea:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Linea:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("Linea:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Linea:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
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
	public Boolean getisBusquedaDesdeForeignKeySesionNivelLinea() {
		return isBusquedaDesdeForeignKeySesionNivelLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionNivelLinea(
		Boolean isBusquedaDesdeForeignKeySesionNivelLinea) {
		this.isBusquedaDesdeForeignKeySesionNivelLinea = isBusquedaDesdeForeignKeySesionNivelLinea;
	}

	public Long getlidNivelLineaActual() {
		return lidNivelLineaActual;
	}

	public void setlidNivelLineaActual(Long lidNivelLineaActual) {
		this.lidNivelLineaActual = lidNivelLineaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLinea() {
		return isBusquedaDesdeForeignKeySesionLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionLinea(
		Boolean isBusquedaDesdeForeignKeySesionLinea) {
		this.isBusquedaDesdeForeignKeySesionLinea = isBusquedaDesdeForeignKeySesionLinea;
	}

	public Long getlidLineaActual() {
		return lidLineaActual;
	}

	public void setlidLineaActual(Long lidLineaActual) {
		this.lidLineaActual = lidLineaActual;
	}
	
	
		
	
}
