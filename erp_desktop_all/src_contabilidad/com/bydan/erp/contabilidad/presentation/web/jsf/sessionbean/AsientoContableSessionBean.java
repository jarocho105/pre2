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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class AsientoContableSessionBean  extends AsientoContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable;
	protected Long lIdAsientoContableActualForeignKey;	
	
	protected Long lIdAsientoContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras;
	protected String sUltimaBusquedaAsientoContable;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento;
	Long lidTipoDescripcionAsientoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormato;
	Long lidFormatoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	Long lidEstadoAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	Long lidTipoMovimientoModuloActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_modulo;
	private Long id_usuario;
	private Long id_tipo_documento;
	private String codigo;
	private Long id_tipo_movimiento;
	private String numero_mayor;
	private Long id_moneda;
	private String numero_retencion;
	private Double valor;
	private Double valorFinal;
	private Long id_cliente;
	private Long id_tipo_descripcion_asiento;
	private Long id_formato;
	private String beneficiario;
	private Date fecha_emision;
	private Date fecha_emisionFinal;
	private Long id_estado_asiento_contable;
	private Long id_tipo_movimiento_modulo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AsientoContableSessionBeanAdditional asientocontableSessionBeanAdditional=null;
	
	public AsientoContableSessionBeanAdditional getAsientoContableSessionBeanAdditional() {
		return this.asientocontableSessionBeanAdditional;
	}
	
	public void setAsientoContableSessionBeanAdditional(AsientoContableSessionBeanAdditional asientocontableSessionBeanAdditional) {
		try {
			this.asientocontableSessionBeanAdditional=asientocontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AsientoContableSessionBean () {
		this.inicializarAsientoContableSessionBean();
	}
	
	public void inicializarAsientoContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable=false;
		this.lIdAsientoContableActualForeignKey=0L;
		this.lIdAsientoContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras=false;
		this.sUltimaBusquedaAsientoContable ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento=false;
		lidTipoDescripcionAsientoActual=0L;
		isBusquedaDesdeForeignKeySesionFormato=false;
		lidFormatoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoAsientoContable=false;
		lidEstadoAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimientoModulo=false;
		lidTipoMovimientoModuloActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_modulo=-1L;
 		this.id_usuario=-1L;
 		this.id_tipo_documento=-1L;
 		this.codigo="";
 		this.id_tipo_movimiento=-1L;
 		this.numero_mayor="";
 		this.id_moneda=-1L;
 		this.numero_retencion="";
 		this.valor=0.0;
		this.valorFinal=0.0;
 		this.id_cliente=null;
 		this.id_tipo_descripcion_asiento=-1L;
 		this.id_formato=null;
 		this.beneficiario="";
 		this.fecha_emision=new Date();
		this.fecha_emisionFinal=new Date();
 		this.id_estado_asiento_contable=1L;
 		this.id_tipo_movimiento_modulo=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable= isPermiteNavegacionHaciaForeignKeyDesdeAsientoContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsientoContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsientoContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable= isBusquedaDesdeForeignKeySesionForeignKeyAsientoContable;
	}
					
	public Long getlIdAsientoContableActualForeignKey() {
		return lIdAsientoContableActualForeignKey;
	}

	public void setlIdAsientoContableActualForeignKey(
			Long lIdAsientoContableActualForeignKey) {
		this.lIdAsientoContableActualForeignKey = lIdAsientoContableActualForeignKey;
	}
				    
	public Long getlIdAsientoContableActualForeignKeyParaPosibleAtras() {
		return lIdAsientoContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAsientoContableActualForeignKeyParaPosibleAtras(
			Long lIdAsientoContableActualForeignKeyParaPosibleAtras) {
		this.lIdAsientoContableActualForeignKeyParaPosibleAtras = lIdAsientoContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAsientoContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAsientoContable() {
		return sUltimaBusquedaAsientoContable;
	}

	public void setsUltimaBusquedaAsientoContable(String sUltimaBusquedaAsientoContable) {
		this.sUltimaBusquedaAsientoContable = sUltimaBusquedaAsientoContable;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public String getcodigo() {
		return this.codigo;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public String getnumero_mayor() {
		return this.numero_mayor;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public String getnumero_retencion() {
		return this.numero_retencion;
	}
    
	public Double getvalor() {
		return this.valor;
	}
		
	public Double getvalorFinal() {
		return this.valorFinal;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipo_descripcion_asiento() {
		return this.id_tipo_descripcion_asiento;
	}
    
	public Long getid_formato() {
		return this.id_formato;
	}
    
	public String getbeneficiario() {
		return this.beneficiario;
	}
    
	public Date getfecha_emision() {
		return this.fecha_emision;
	}
		
	public Date getfecha_emisionFinal() {
		return this.fecha_emisionFinal;
	}
    
	public Long getid_estado_asiento_contable() {
		return this.id_estado_asiento_contable;
	}
    
	public Long getid_tipo_movimiento_modulo() {
		return this.id_tipo_movimiento_modulo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id");
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
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
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
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
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
						System.out.println("AsientoContable:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("AsientoContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento)throws Exception
	{
		try {
			if(this.id_tipo_movimiento!=newid_tipo_movimiento) {
				if(newid_tipo_movimiento==null) {
					//newid_tipo_movimiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_tipo_movimiento");
					}
				}

				this.id_tipo_movimiento=newid_tipo_movimiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_mayor(String newnumero_mayor)throws Exception
	{
		try {
			if(this.numero_mayor!=newnumero_mayor) {
				if(newnumero_mayor==null) {
					//newnumero_mayor="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna numero_mayor");
					}
				}

				if(newnumero_mayor!=null&&newnumero_mayor.length()>100) {
					newnumero_mayor=newnumero_mayor.substring(0,98);
					System.out.println("AsientoContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna numero_mayor");
				}

				this.numero_mayor=newnumero_mayor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_retencion(String newnumero_retencion)throws Exception
	{
		try {
			if(this.numero_retencion!=newnumero_retencion) {
				if(newnumero_retencion==null) {
					//newnumero_retencion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna numero_retencion");
					}
				}

				if(newnumero_retencion!=null&&newnumero_retencion.length()>50) {
					newnumero_retencion=newnumero_retencion.substring(0,48);
					System.out.println("AsientoContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_retencion");
				}

				this.numero_retencion=newnumero_retencion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setvalor(Double newvalor)throws Exception
	{
		try {
			if(this.valor!=newvalor) {
				if(newvalor==null) {
					//newvalor=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna valor");
					}
				}

				this.valor=newvalor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setvalorFinal(Double newvalorFinal)throws Exception
	{
		try {
			if(this.valorFinal!=newvalorFinal) {
				if(newvalorFinal==null) {
					//newvalorFinal=0.0;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContableFinal:Valor nulo no permitido en columna valorFinal");
					}
				}

				this.valorFinal=newvalorFinal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente) {
		if(this.id_cliente!=newid_cliente) {

			this.id_cliente=newid_cliente;
		}
	}
    
	public void setid_tipo_descripcion_asiento(Long newid_tipo_descripcion_asiento)throws Exception
	{
		try {
			if(this.id_tipo_descripcion_asiento!=newid_tipo_descripcion_asiento) {
				if(newid_tipo_descripcion_asiento==null) {
					//newid_tipo_descripcion_asiento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_tipo_descripcion_asiento");
					}
				}

				this.id_tipo_descripcion_asiento=newid_tipo_descripcion_asiento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato(Long newid_formato) {
		if(this.id_formato!=newid_formato) {

			this.id_formato=newid_formato;
		}
	}
    
	public void setbeneficiario(String newbeneficiario)throws Exception
	{
		try {
			if(this.beneficiario!=newbeneficiario) {
				if(newbeneficiario==null) {
					//newbeneficiario="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna beneficiario");
					}
				}

				if(newbeneficiario!=null&&newbeneficiario.length()>200) {
					newbeneficiario=newbeneficiario.substring(0,198);
					System.out.println("AsientoContable:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna beneficiario");
				}

				this.beneficiario=newbeneficiario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_emision(Date newfecha_emision)throws Exception
	{
		try {
			if(this.fecha_emision!=newfecha_emision) {
				if(newfecha_emision==null) {
					//newfecha_emision=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna fecha_emision");
					}
				}

				this.fecha_emision=newfecha_emision;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setfecha_emisionFinal(Date newfecha_emisionFinal)throws Exception
	{
		try {
			if(this.fecha_emisionFinal!=newfecha_emisionFinal) {
				if(newfecha_emisionFinal==null) {
					//newfecha_emisionFinal=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContableFinal:Valor nulo no permitido en columna fecha_emisionFinal");
					}
				}

				this.fecha_emisionFinal=newfecha_emisionFinal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_asiento_contable(Long newid_estado_asiento_contable)throws Exception
	{
		try {
			if(this.id_estado_asiento_contable!=newid_estado_asiento_contable) {
				if(newid_estado_asiento_contable==null) {
					//newid_estado_asiento_contable=1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_estado_asiento_contable");
					}
				}

				this.id_estado_asiento_contable=newid_estado_asiento_contable;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_movimiento_modulo(Long newid_tipo_movimiento_modulo)throws Exception
	{
		try {
			if(this.id_tipo_movimiento_modulo!=newid_tipo_movimiento_modulo) {
				if(newid_tipo_movimiento_modulo==null) {
					//newid_tipo_movimiento_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("AsientoContable:Valor nulo no permitido en columna id_tipo_movimiento_modulo");
					}
				}

				this.id_tipo_movimiento_modulo=newid_tipo_movimiento_modulo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDescripcionAsiento() {
		return isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDescripcionAsiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento) {
		this.isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento = isBusquedaDesdeForeignKeySesionTipoDescripcionAsiento;
	}

	public Long getlidTipoDescripcionAsientoActual() {
		return lidTipoDescripcionAsientoActual;
	}

	public void setlidTipoDescripcionAsientoActual(Long lidTipoDescripcionAsientoActual) {
		this.lidTipoDescripcionAsientoActual = lidTipoDescripcionAsientoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormato() {
		return isBusquedaDesdeForeignKeySesionFormato;
	}

	public void setisBusquedaDesdeForeignKeySesionFormato(
		Boolean isBusquedaDesdeForeignKeySesionFormato) {
		this.isBusquedaDesdeForeignKeySesionFormato = isBusquedaDesdeForeignKeySesionFormato;
	}

	public Long getlidFormatoActual() {
		return lidFormatoActual;
	}

	public void setlidFormatoActual(Long lidFormatoActual) {
		this.lidFormatoActual = lidFormatoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoAsientoContable() {
		return isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionEstadoAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionEstadoAsientoContable = isBusquedaDesdeForeignKeySesionEstadoAsientoContable;
	}

	public Long getlidEstadoAsientoContableActual() {
		return lidEstadoAsientoContableActual;
	}

	public void setlidEstadoAsientoContableActual(Long lidEstadoAsientoContableActual) {
		this.lidEstadoAsientoContableActual = lidEstadoAsientoContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo() {
		return isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimientoModulo = isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public Long getlidTipoMovimientoModuloActual() {
		return lidTipoMovimientoModuloActual;
	}

	public void setlidTipoMovimientoModuloActual(Long lidTipoMovimientoModuloActual) {
		this.lidTipoMovimientoModuloActual = lidTipoMovimientoModuloActual;
	}
	
	
		
	
}
