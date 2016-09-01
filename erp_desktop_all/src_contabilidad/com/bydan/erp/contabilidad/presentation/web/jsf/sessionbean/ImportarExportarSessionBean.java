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
public class ImportarExportarSessionBean  extends ImportarExportarSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar;
	protected Long lIdImportarExportarActualForeignKey;	
	
	protected Long lIdImportarExportarActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras;
	protected String sUltimaBusquedaImportarExportar;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodoImportExport;
	Long lidPeriodoImportExportActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionConta;
	Long lidTransaccionContaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoImportacion;
	Long lidTipoImportacionActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoComprobante;
	Long lidTipoComprobanteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTributario;
	Long lidTipoTributarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIva;
	Long lidTipoIvaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoIce;
	Long lidTipoIceActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoBanco;
	Long lidTipoBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoComprobanteBanco;
	Long lidTipoComprobanteBancoActual;
	
	private Long id;
	private Long id_modulo;
	private Long id_asiento_contable;
	private String ruc;
	private Long id_periodo_import_export;
	private Long id_transaccion_conta;
	private Long id_tipo_importacion;
	private Long id_tipo_comprobante;
	private String numero_comprobante;
	private Long id_tipo_tributario;
	private Long id_cliente;
	private Long id_tipo_iva;
	private Long id_tipo_ice;
	private Long id_tipo_banco;
	private Long id_tipo_comprobante_banco;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ImportarExportarSessionBeanAdditional importarexportarSessionBeanAdditional=null;
	
	public ImportarExportarSessionBeanAdditional getImportarExportarSessionBeanAdditional() {
		return this.importarexportarSessionBeanAdditional;
	}
	
	public void setImportarExportarSessionBeanAdditional(ImportarExportarSessionBeanAdditional importarexportarSessionBeanAdditional) {
		try {
			this.importarexportarSessionBeanAdditional=importarexportarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ImportarExportarSessionBean () {
		this.inicializarImportarExportarSessionBean();
	}
	
	public void inicializarImportarExportarSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar=false;
		this.lIdImportarExportarActualForeignKey=0L;
		this.lIdImportarExportarActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras=false;
		this.sUltimaBusquedaImportarExportar ="";
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
		
		
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodoImportExport=false;
		lidPeriodoImportExportActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionConta=false;
		lidTransaccionContaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoImportacion=false;
		lidTipoImportacionActual=0L;
		isBusquedaDesdeForeignKeySesionTipoComprobante=false;
		lidTipoComprobanteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTributario=false;
		lidTipoTributarioActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIva=false;
		lidTipoIvaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoIce=false;
		lidTipoIceActual=0L;
		isBusquedaDesdeForeignKeySesionTipoBanco=false;
		lidTipoBancoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoComprobanteBanco=false;
		lidTipoComprobanteBancoActual=0L; 
		
		
		
 		this.id_modulo=-1L;
 		this.id_asiento_contable=-1L;
 		this.ruc="";
 		this.id_periodo_import_export=-1L;
 		this.id_transaccion_conta=-1L;
 		this.id_tipo_importacion=-1L;
 		this.id_tipo_comprobante=-1L;
 		this.numero_comprobante="";
 		this.id_tipo_tributario=-1L;
 		this.id_cliente=-1L;
 		this.id_tipo_iva=-1L;
 		this.id_tipo_ice=-1L;
 		this.id_tipo_banco=-1L;
 		this.id_tipo_comprobante_banco=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeImportarExportar() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeImportarExportar(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar= isPermiteNavegacionHaciaForeignKeyDesdeImportarExportar;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar(String sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar = sNombrePaginaNavegacionHaciaForeignKeyDesdeImportarExportar;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyImportarExportar() {
		return isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyImportarExportar(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar= isBusquedaDesdeForeignKeySesionForeignKeyImportarExportar;
	}
					
	public Long getlIdImportarExportarActualForeignKey() {
		return lIdImportarExportarActualForeignKey;
	}

	public void setlIdImportarExportarActualForeignKey(
			Long lIdImportarExportarActualForeignKey) {
		this.lIdImportarExportarActualForeignKey = lIdImportarExportarActualForeignKey;
	}
				    
	public Long getlIdImportarExportarActualForeignKeyParaPosibleAtras() {
		return lIdImportarExportarActualForeignKeyParaPosibleAtras;
	}

	public void setlIdImportarExportarActualForeignKeyParaPosibleAtras(
			Long lIdImportarExportarActualForeignKeyParaPosibleAtras) {
		this.lIdImportarExportarActualForeignKeyParaPosibleAtras = lIdImportarExportarActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyImportarExportarParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaImportarExportar() {
		return sUltimaBusquedaImportarExportar;
	}

	public void setsUltimaBusquedaImportarExportar(String sUltimaBusquedaImportarExportar) {
		this.sUltimaBusquedaImportarExportar = sUltimaBusquedaImportarExportar;
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
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
    
	public String getruc() {
		return this.ruc;
	}
    
	public Long getid_periodo_import_export() {
		return this.id_periodo_import_export;
	}
    
	public Long getid_transaccion_conta() {
		return this.id_transaccion_conta;
	}
    
	public Long getid_tipo_importacion() {
		return this.id_tipo_importacion;
	}
    
	public Long getid_tipo_comprobante() {
		return this.id_tipo_comprobante;
	}
    
	public String getnumero_comprobante() {
		return this.numero_comprobante;
	}
    
	public Long getid_tipo_tributario() {
		return this.id_tipo_tributario;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_tipo_iva() {
		return this.id_tipo_iva;
	}
    
	public Long getid_tipo_ice() {
		return this.id_tipo_ice;
	}
    
	public Long getid_tipo_banco() {
		return this.id_tipo_banco;
	}
    
	public Long getid_tipo_comprobante_banco() {
		return this.id_tipo_comprobante_banco;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable)throws Exception
	{
		try {
			if(this.id_asiento_contable!=newid_asiento_contable) {
				if(newid_asiento_contable==null) {
					//newid_asiento_contable=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_asiento_contable");
					}
				}

				this.id_asiento_contable=newid_asiento_contable;
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
						System.out.println("ImportarExportar:Valor nulo no permitido en columna ruc");
					}
				}

				if(newruc!=null&&newruc.length()>20) {
					newruc=newruc.substring(0,18);
					System.out.println("ImportarExportar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ruc");
				}

				this.ruc=newruc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo_import_export(Long newid_periodo_import_export)throws Exception
	{
		try {
			if(this.id_periodo_import_export!=newid_periodo_import_export) {
				if(newid_periodo_import_export==null) {
					//newid_periodo_import_export=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_periodo_import_export");
					}
				}

				this.id_periodo_import_export=newid_periodo_import_export;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_conta(Long newid_transaccion_conta)throws Exception
	{
		try {
			if(this.id_transaccion_conta!=newid_transaccion_conta) {
				if(newid_transaccion_conta==null) {
					//newid_transaccion_conta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_transaccion_conta");
					}
				}

				this.id_transaccion_conta=newid_transaccion_conta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_importacion(Long newid_tipo_importacion)throws Exception
	{
		try {
			if(this.id_tipo_importacion!=newid_tipo_importacion) {
				if(newid_tipo_importacion==null) {
					//newid_tipo_importacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_importacion");
					}
				}

				this.id_tipo_importacion=newid_tipo_importacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_comprobante(Long newid_tipo_comprobante)throws Exception
	{
		try {
			if(this.id_tipo_comprobante!=newid_tipo_comprobante) {
				if(newid_tipo_comprobante==null) {
					//newid_tipo_comprobante=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_comprobante");
					}
				}

				this.id_tipo_comprobante=newid_tipo_comprobante;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnumero_comprobante(String newnumero_comprobante)throws Exception
	{
		try {
			if(this.numero_comprobante!=newnumero_comprobante) {
				if(newnumero_comprobante==null) {
					//newnumero_comprobante="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna numero_comprobante");
					}
				}

				if(newnumero_comprobante!=null&&newnumero_comprobante.length()>50) {
					newnumero_comprobante=newnumero_comprobante.substring(0,48);
					System.out.println("ImportarExportar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_comprobante");
				}

				this.numero_comprobante=newnumero_comprobante;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tributario(Long newid_tipo_tributario)throws Exception
	{
		try {
			if(this.id_tipo_tributario!=newid_tipo_tributario) {
				if(newid_tipo_tributario==null) {
					//newid_tipo_tributario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_tributario");
					}
				}

				this.id_tipo_tributario=newid_tipo_tributario;
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
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_iva(Long newid_tipo_iva)throws Exception
	{
		try {
			if(this.id_tipo_iva!=newid_tipo_iva) {
				if(newid_tipo_iva==null) {
					//newid_tipo_iva=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_iva");
					}
				}

				this.id_tipo_iva=newid_tipo_iva;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_ice(Long newid_tipo_ice)throws Exception
	{
		try {
			if(this.id_tipo_ice!=newid_tipo_ice) {
				if(newid_tipo_ice==null) {
					//newid_tipo_ice=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_ice");
					}
				}

				this.id_tipo_ice=newid_tipo_ice;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_banco(Long newid_tipo_banco)throws Exception
	{
		try {
			if(this.id_tipo_banco!=newid_tipo_banco) {
				if(newid_tipo_banco==null) {
					//newid_tipo_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_banco");
					}
				}

				this.id_tipo_banco=newid_tipo_banco;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_comprobante_banco(Long newid_tipo_comprobante_banco)throws Exception
	{
		try {
			if(this.id_tipo_comprobante_banco!=newid_tipo_comprobante_banco) {
				if(newid_tipo_comprobante_banco==null) {
					//newid_tipo_comprobante_banco=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ImportarExportar:Valor nulo no permitido en columna id_tipo_comprobante_banco");
					}
				}

				this.id_tipo_comprobante_banco=newid_tipo_comprobante_banco;
			}
		} catch(Exception e) {
			throw e;
		}
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
	public Boolean getisBusquedaDesdeForeignKeySesionAsientoContable() {
		return isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionAsientoContable = isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public Long getlidAsientoContableActual() {
		return lidAsientoContableActual;
	}

	public void setlidAsientoContableActual(Long lidAsientoContableActual) {
		this.lidAsientoContableActual = lidAsientoContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodoImportExport() {
		return isBusquedaDesdeForeignKeySesionPeriodoImportExport;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodoImportExport(
		Boolean isBusquedaDesdeForeignKeySesionPeriodoImportExport) {
		this.isBusquedaDesdeForeignKeySesionPeriodoImportExport = isBusquedaDesdeForeignKeySesionPeriodoImportExport;
	}

	public Long getlidPeriodoImportExportActual() {
		return lidPeriodoImportExportActual;
	}

	public void setlidPeriodoImportExportActual(Long lidPeriodoImportExportActual) {
		this.lidPeriodoImportExportActual = lidPeriodoImportExportActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionConta() {
		return isBusquedaDesdeForeignKeySesionTransaccionConta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionConta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionConta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionConta = isBusquedaDesdeForeignKeySesionTransaccionConta;
	}

	public Long getlidTransaccionContaActual() {
		return lidTransaccionContaActual;
	}

	public void setlidTransaccionContaActual(Long lidTransaccionContaActual) {
		this.lidTransaccionContaActual = lidTransaccionContaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoImportacion() {
		return isBusquedaDesdeForeignKeySesionTipoImportacion;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoImportacion(
		Boolean isBusquedaDesdeForeignKeySesionTipoImportacion) {
		this.isBusquedaDesdeForeignKeySesionTipoImportacion = isBusquedaDesdeForeignKeySesionTipoImportacion;
	}

	public Long getlidTipoImportacionActual() {
		return lidTipoImportacionActual;
	}

	public void setlidTipoImportacionActual(Long lidTipoImportacionActual) {
		this.lidTipoImportacionActual = lidTipoImportacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoComprobante() {
		return isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoComprobante(
		Boolean isBusquedaDesdeForeignKeySesionTipoComprobante) {
		this.isBusquedaDesdeForeignKeySesionTipoComprobante = isBusquedaDesdeForeignKeySesionTipoComprobante;
	}

	public Long getlidTipoComprobanteActual() {
		return lidTipoComprobanteActual;
	}

	public void setlidTipoComprobanteActual(Long lidTipoComprobanteActual) {
		this.lidTipoComprobanteActual = lidTipoComprobanteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTributario() {
		return isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTributario(
		Boolean isBusquedaDesdeForeignKeySesionTipoTributario) {
		this.isBusquedaDesdeForeignKeySesionTipoTributario = isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public Long getlidTipoTributarioActual() {
		return lidTipoTributarioActual;
	}

	public void setlidTipoTributarioActual(Long lidTipoTributarioActual) {
		this.lidTipoTributarioActual = lidTipoTributarioActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIva() {
		return isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIva(
		Boolean isBusquedaDesdeForeignKeySesionTipoIva) {
		this.isBusquedaDesdeForeignKeySesionTipoIva = isBusquedaDesdeForeignKeySesionTipoIva;
	}

	public Long getlidTipoIvaActual() {
		return lidTipoIvaActual;
	}

	public void setlidTipoIvaActual(Long lidTipoIvaActual) {
		this.lidTipoIvaActual = lidTipoIvaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoIce() {
		return isBusquedaDesdeForeignKeySesionTipoIce;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoIce(
		Boolean isBusquedaDesdeForeignKeySesionTipoIce) {
		this.isBusquedaDesdeForeignKeySesionTipoIce = isBusquedaDesdeForeignKeySesionTipoIce;
	}

	public Long getlidTipoIceActual() {
		return lidTipoIceActual;
	}

	public void setlidTipoIceActual(Long lidTipoIceActual) {
		this.lidTipoIceActual = lidTipoIceActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoBanco() {
		return isBusquedaDesdeForeignKeySesionTipoBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoBanco = isBusquedaDesdeForeignKeySesionTipoBanco;
	}

	public Long getlidTipoBancoActual() {
		return lidTipoBancoActual;
	}

	public void setlidTipoBancoActual(Long lidTipoBancoActual) {
		this.lidTipoBancoActual = lidTipoBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoComprobanteBanco() {
		return isBusquedaDesdeForeignKeySesionTipoComprobanteBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoComprobanteBanco(
		Boolean isBusquedaDesdeForeignKeySesionTipoComprobanteBanco) {
		this.isBusquedaDesdeForeignKeySesionTipoComprobanteBanco = isBusquedaDesdeForeignKeySesionTipoComprobanteBanco;
	}

	public Long getlidTipoComprobanteBancoActual() {
		return lidTipoComprobanteBancoActual;
	}

	public void setlidTipoComprobanteBancoActual(Long lidTipoComprobanteBancoActual) {
		this.lidTipoComprobanteBancoActual = lidTipoComprobanteBancoActual;
	}
	
	
		
	
}
