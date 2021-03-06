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
public class TransaccionClienteSessionBean  extends TransaccionClienteSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente;
	protected Long lIdTransaccionClienteActualForeignKey;	
	
	protected Long lIdTransaccionClienteActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras;
	protected String sUltimaBusquedaTransaccionCliente;
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
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion1;
	Long lidTransaccion1Actual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion2;
	Long lidTransaccion2Actual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion3;
	Long lidTransaccion3Actual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion4;
	Long lidTransaccion4Actual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion5;
	Long lidTransaccion5Actual;
	
	private Long id;
	private Long id_empresa;
	private Long id_modulo;
	private String nombre;
	private Long id_transaccion1;
	private Long id_transaccion2;
	private Long id_transaccion3;
	private Long id_transaccion4;
	private Long id_transaccion5;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TransaccionClienteSessionBeanAdditional transaccionclienteSessionBeanAdditional=null;
	
	public TransaccionClienteSessionBeanAdditional getTransaccionClienteSessionBeanAdditional() {
		return this.transaccionclienteSessionBeanAdditional;
	}
	
	public void setTransaccionClienteSessionBeanAdditional(TransaccionClienteSessionBeanAdditional transaccionclienteSessionBeanAdditional) {
		try {
			this.transaccionclienteSessionBeanAdditional=transaccionclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TransaccionClienteSessionBean () {
		this.inicializarTransaccionClienteSessionBean();
	}
	
	public void inicializarTransaccionClienteSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente=false;
		this.lIdTransaccionClienteActualForeignKey=0L;
		this.lIdTransaccionClienteActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras=false;
		this.sUltimaBusquedaTransaccionCliente ="";
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
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion1=false;
		lidTransaccion1Actual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion2=false;
		lidTransaccion2Actual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion3=false;
		lidTransaccion3Actual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion4=false;
		lidTransaccion4Actual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion5=false;
		lidTransaccion5Actual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_modulo=-1L;
 		this.nombre="";
 		this.id_transaccion1=-1L;
 		this.id_transaccion2=null;
 		this.id_transaccion3=null;
 		this.id_transaccion4=null;
 		this.id_transaccion5=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente= isPermiteNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente = sNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionCliente;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente= isBusquedaDesdeForeignKeySesionForeignKeyTransaccionCliente;
	}
					
	public Long getlIdTransaccionClienteActualForeignKey() {
		return lIdTransaccionClienteActualForeignKey;
	}

	public void setlIdTransaccionClienteActualForeignKey(
			Long lIdTransaccionClienteActualForeignKey) {
		this.lIdTransaccionClienteActualForeignKey = lIdTransaccionClienteActualForeignKey;
	}
				    
	public Long getlIdTransaccionClienteActualForeignKeyParaPosibleAtras() {
		return lIdTransaccionClienteActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTransaccionClienteActualForeignKeyParaPosibleAtras(
			Long lIdTransaccionClienteActualForeignKeyParaPosibleAtras) {
		this.lIdTransaccionClienteActualForeignKeyParaPosibleAtras = lIdTransaccionClienteActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTransaccionClienteParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTransaccionCliente() {
		return sUltimaBusquedaTransaccionCliente;
	}

	public void setsUltimaBusquedaTransaccionCliente(String sUltimaBusquedaTransaccionCliente) {
		this.sUltimaBusquedaTransaccionCliente = sUltimaBusquedaTransaccionCliente;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public String getnombre() {
		return this.nombre;
	}
    
	public Long getid_transaccion1() {
		return this.id_transaccion1;
	}
    
	public Long getid_transaccion2() {
		return this.id_transaccion2;
	}
    
	public Long getid_transaccion3() {
		return this.id_transaccion3;
	}
    
	public Long getid_transaccion4() {
		return this.id_transaccion4;
	}
    
	public Long getid_transaccion5() {
		return this.id_transaccion5;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionCliente:Valor nulo no permitido en columna id");
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
						System.out.println("TransaccionCliente:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionCliente:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("TransaccionCliente:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("TransaccionCliente:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion1(Long newid_transaccion1)throws Exception
	{
		try {
			if(this.id_transaccion1!=newid_transaccion1) {
				if(newid_transaccion1==null) {
					//newid_transaccion1=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TransaccionCliente:Valor nulo no permitido en columna id_transaccion1");
					}
				}

				this.id_transaccion1=newid_transaccion1;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion2(Long newid_transaccion2) {
		if(this.id_transaccion2!=newid_transaccion2) {

			this.id_transaccion2=newid_transaccion2;
		}
	}
    
	public void setid_transaccion3(Long newid_transaccion3) {
		if(this.id_transaccion3!=newid_transaccion3) {

			this.id_transaccion3=newid_transaccion3;
		}
	}
    
	public void setid_transaccion4(Long newid_transaccion4) {
		if(this.id_transaccion4!=newid_transaccion4) {

			this.id_transaccion4=newid_transaccion4;
		}
	}
    
	public void setid_transaccion5(Long newid_transaccion5) {
		if(this.id_transaccion5!=newid_transaccion5) {

			this.id_transaccion5=newid_transaccion5;
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
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion1() {
		return isBusquedaDesdeForeignKeySesionTransaccion1;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion1(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion1) {
		this.isBusquedaDesdeForeignKeySesionTransaccion1 = isBusquedaDesdeForeignKeySesionTransaccion1;
	}

	public Long getlidTransaccion1Actual() {
		return lidTransaccion1Actual;
	}

	public void setlidTransaccion1Actual(Long lidTransaccion1Actual) {
		this.lidTransaccion1Actual = lidTransaccion1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion2() {
		return isBusquedaDesdeForeignKeySesionTransaccion2;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion2(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion2) {
		this.isBusquedaDesdeForeignKeySesionTransaccion2 = isBusquedaDesdeForeignKeySesionTransaccion2;
	}

	public Long getlidTransaccion2Actual() {
		return lidTransaccion2Actual;
	}

	public void setlidTransaccion2Actual(Long lidTransaccion2Actual) {
		this.lidTransaccion2Actual = lidTransaccion2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion3() {
		return isBusquedaDesdeForeignKeySesionTransaccion3;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion3(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion3) {
		this.isBusquedaDesdeForeignKeySesionTransaccion3 = isBusquedaDesdeForeignKeySesionTransaccion3;
	}

	public Long getlidTransaccion3Actual() {
		return lidTransaccion3Actual;
	}

	public void setlidTransaccion3Actual(Long lidTransaccion3Actual) {
		this.lidTransaccion3Actual = lidTransaccion3Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion4() {
		return isBusquedaDesdeForeignKeySesionTransaccion4;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion4(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion4) {
		this.isBusquedaDesdeForeignKeySesionTransaccion4 = isBusquedaDesdeForeignKeySesionTransaccion4;
	}

	public Long getlidTransaccion4Actual() {
		return lidTransaccion4Actual;
	}

	public void setlidTransaccion4Actual(Long lidTransaccion4Actual) {
		this.lidTransaccion4Actual = lidTransaccion4Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion5() {
		return isBusquedaDesdeForeignKeySesionTransaccion5;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion5(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion5) {
		this.isBusquedaDesdeForeignKeySesionTransaccion5 = isBusquedaDesdeForeignKeySesionTransaccion5;
	}

	public Long getlidTransaccion5Actual() {
		return lidTransaccion5Actual;
	}

	public void setlidTransaccion5Actual(Long lidTransaccion5Actual) {
		this.lidTransaccion5Actual = lidTransaccion5Actual;
	}
	
	
		
	
}
