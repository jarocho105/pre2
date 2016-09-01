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
public class ControlVehiculoSessionBean  extends ControlVehiculoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo;
	protected Long lIdControlVehiculoActualForeignKey;	
	
	protected Long lIdControlVehiculoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras;
	protected String sUltimaBusquedaControlVehiculo;
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
	
	private Long id;
	private Long id_empresa;
	private String nombre_conductor;
	private String numero_placa;
	private Date fecha_entrada;
	private Date fecha_salida;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ControlVehiculoSessionBeanAdditional controlvehiculoSessionBeanAdditional=null;
	
	public ControlVehiculoSessionBeanAdditional getControlVehiculoSessionBeanAdditional() {
		return this.controlvehiculoSessionBeanAdditional;
	}
	
	public void setControlVehiculoSessionBeanAdditional(ControlVehiculoSessionBeanAdditional controlvehiculoSessionBeanAdditional) {
		try {
			this.controlvehiculoSessionBeanAdditional=controlvehiculoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ControlVehiculoSessionBean () {
		this.inicializarControlVehiculoSessionBean();
	}
	
	public void inicializarControlVehiculoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo=false;
		this.lIdControlVehiculoActualForeignKey=0L;
		this.lIdControlVehiculoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras=false;
		this.sUltimaBusquedaControlVehiculo ="";
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
		
		
		
 		this.id_empresa=-1L;
 		this.nombre_conductor="";
 		this.numero_placa="";
 		this.fecha_entrada=new Date();
 		this.fecha_salida=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo= isPermiteNavegacionHaciaForeignKeyDesdeControlVehiculo;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo(String sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo = sNombrePaginaNavegacionHaciaForeignKeyDesdeControlVehiculo;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo() {
		return isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo= isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculo;
	}
					
	public Long getlIdControlVehiculoActualForeignKey() {
		return lIdControlVehiculoActualForeignKey;
	}

	public void setlIdControlVehiculoActualForeignKey(
			Long lIdControlVehiculoActualForeignKey) {
		this.lIdControlVehiculoActualForeignKey = lIdControlVehiculoActualForeignKey;
	}
				    
	public Long getlIdControlVehiculoActualForeignKeyParaPosibleAtras() {
		return lIdControlVehiculoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdControlVehiculoActualForeignKeyParaPosibleAtras(
			Long lIdControlVehiculoActualForeignKeyParaPosibleAtras) {
		this.lIdControlVehiculoActualForeignKeyParaPosibleAtras = lIdControlVehiculoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyControlVehiculoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaControlVehiculo() {
		return sUltimaBusquedaControlVehiculo;
	}

	public void setsUltimaBusquedaControlVehiculo(String sUltimaBusquedaControlVehiculo) {
		this.sUltimaBusquedaControlVehiculo = sUltimaBusquedaControlVehiculo;
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
    
	public String getnombre_conductor() {
		return this.nombre_conductor;
	}
    
	public String getnumero_placa() {
		return this.numero_placa;
	}
    
	public Date getfecha_entrada() {
		return this.fecha_entrada;
	}
    
	public Date getfecha_salida() {
		return this.fecha_salida;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna id");
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
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_conductor(String newnombre_conductor)throws Exception
	{
		try {
			if(this.nombre_conductor!=newnombre_conductor) {
				if(newnombre_conductor==null) {
					//newnombre_conductor="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna nombre_conductor");
					}
				}

				if(newnombre_conductor!=null&&newnombre_conductor.length()>150) {
					newnombre_conductor=newnombre_conductor.substring(0,148);
					System.out.println("ControlVehiculo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_conductor");
				}

				this.nombre_conductor=newnombre_conductor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_placa(String newnumero_placa)throws Exception
	{
		try {
			if(this.numero_placa!=newnumero_placa) {
				if(newnumero_placa==null) {
					//newnumero_placa="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna numero_placa");
					}
				}

				if(newnumero_placa!=null&&newnumero_placa.length()>150) {
					newnumero_placa=newnumero_placa.substring(0,148);
					System.out.println("ControlVehiculo:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna numero_placa");
				}

				this.numero_placa=newnumero_placa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_entrada(Date newfecha_entrada)throws Exception
	{
		try {
			if(this.fecha_entrada!=newfecha_entrada) {
				if(newfecha_entrada==null) {
					//newfecha_entrada=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna fecha_entrada");
					}
				}

				this.fecha_entrada=newfecha_entrada;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_salida(Date newfecha_salida)throws Exception
	{
		try {
			if(this.fecha_salida!=newfecha_salida) {
				if(newfecha_salida==null) {
					//newfecha_salida=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ControlVehiculo:Valor nulo no permitido en columna fecha_salida");
					}
				}

				this.fecha_salida=newfecha_salida;
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
	
	
		
	
}
