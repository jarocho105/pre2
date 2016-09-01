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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.produccion.util.ProductoProduGastoConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduGastoParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduGastoParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoProduGastoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoProduGastoBeanSwingJInternalFrame extends ProductoProduGastoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProduGastoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProduGasto> productoprodugastoValidator = new ClassValidator<ProductoProduGasto>(ProductoProduGasto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProduGasto productoprodugasto;	
	public ProductoProduGasto productoprodugastoAux;
	public ProductoProduGasto productoprodugastoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProduGasto productoprodugastoTotales;
	public Long idProductoProduGastoActual;
	public Long iIdNuevoProductoProduGasto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProductoDefiProdu="";

	public List<ProductoDefiProdu> productodefiprodusForeignKey;

	public List<ProductoDefiProdu> getproductodefiprodusForeignKey() {
		return productodefiprodusForeignKey;
	}

	public void setproductodefiprodusForeignKey(List<ProductoDefiProdu> productodefiprodusForeignKey) {
		this.productodefiprodusForeignKey = productodefiprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public ProductoDefiProdu productodefiproduForeignKey;

	public ProductoDefiProdu getproductodefiproduForeignKey() {
		return productodefiproduForeignKey;
	}

	public void setproductodefiproduForeignKey(ProductoDefiProdu productodefiproduForeignKey) {
		this.productodefiproduForeignKey = productodefiproduForeignKey;
	}

	public String sFinalQueryComboTipoGastoProduEmpresa="";

	public List<TipoGastoProduEmpresa> tipogastoproduempresasForeignKey;

	public List<TipoGastoProduEmpresa> gettipogastoproduempresasForeignKey() {
		return tipogastoproduempresasForeignKey;
	}

	public void settipogastoproduempresasForeignKey(List<TipoGastoProduEmpresa> tipogastoproduempresasForeignKey) {
		this.tipogastoproduempresasForeignKey = tipogastoproduempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGastoProduEmpresa tipogastoproduempresaForeignKey;

	public TipoGastoProduEmpresa gettipogastoproduempresaForeignKey() {
		return tipogastoproduempresaForeignKey;
	}

	public void settipogastoproduempresaForeignKey(TipoGastoProduEmpresa tipogastoproduempresaForeignKey) {
		this.tipogastoproduempresaForeignKey = tipogastoproduempresaForeignKey;
	}

	public String sFinalQueryComboCuentaContableDebito="";

	public List<CuentaContable> cuentacontabledebitosForeignKey;

	public List<CuentaContable> getcuentacontabledebitosForeignKey() {
		return cuentacontabledebitosForeignKey;
	}

	public void setcuentacontabledebitosForeignKey(List<CuentaContable> cuentacontabledebitosForeignKey) {
		this.cuentacontabledebitosForeignKey = cuentacontabledebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledebitoForeignKey;

	public CuentaContable getcuentacontabledebitoForeignKey() {
		return cuentacontabledebitoForeignKey;
	}

	public void setcuentacontabledebitoForeignKey(CuentaContable cuentacontabledebitoForeignKey) {
		this.cuentacontabledebitoForeignKey = cuentacontabledebitoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

	public String sFinalQueryComboClienteProveedor="";

	public List<Cliente> clienteproveedorsForeignKey;

	public List<Cliente> getclienteproveedorsForeignKey() {
		return clienteproveedorsForeignKey;
	}

	public void setclienteproveedorsForeignKey(List<Cliente> clienteproveedorsForeignKey) {
		this.clienteproveedorsForeignKey = clienteproveedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteproveedorForeignKey;

	public Cliente getclienteproveedorForeignKey() {
		return clienteproveedorForeignKey;
	}

	public void setclienteproveedorForeignKey(Cliente clienteproveedorForeignKey) {
		this.clienteproveedorForeignKey = clienteproveedorForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteProveedorActual=0L;

	public Long getidClienteProveedorActual() {
		return idClienteProveedorActual;
	}

	public void setidClienteProveedorActual(Long idClienteProveedorActual) {
		this.idClienteProveedorActual= idClienteProveedorActual;
	}
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoProductoProduGasto;
	public Boolean isPermisoNuevoProductoProduGasto;
	public Boolean isPermisoActualizarProductoProduGasto;
	public Boolean isPermisoActualizarOriginalProductoProduGasto;
	public Boolean isPermisoEliminarProductoProduGasto;
	public Boolean isPermisoGuardarCambiosProductoProduGasto;
	public Boolean isPermisoConsultaProductoProduGasto;
	public Boolean isPermisoBusquedaProductoProduGasto;
	public Boolean isPermisoReporteProductoProduGasto;
	public Boolean isPermisoPaginacionMedioProductoProduGasto;
	public Boolean isPermisoPaginacionAltoProductoProduGasto;
	public Boolean isPermisoPaginacionTodoProductoProduGasto;
	public Boolean isPermisoCopiarProductoProduGasto;
	public Boolean isPermisoVerFormProductoProduGasto;
	public Boolean isPermisoDuplicarProductoProduGasto;
	public Boolean isPermisoOrdenProductoProduGasto;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public ProductoProduGastoParameterReturnGeneral productoprodugastoReturnGeneral;
	public ProductoProduGastoParameterReturnGeneral productoprodugastoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProduGasto=false;
	public Boolean esParaAccionDesdeFormularioProductoProduGasto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProduGastoSessionBeanAdditional productoprodugastoSessionBeanAdditional=null;
	
	public ProductoProduGastoSessionBeanAdditional getProductoProduGastoSessionBeanAdditional() {
		return this.productoprodugastoSessionBeanAdditional;
	}
	
	public void setProductoProduGastoSessionBeanAdditional(ProductoProduGastoSessionBeanAdditional productoprodugastoSessionBeanAdditional) {
		try {
			this.productoprodugastoSessionBeanAdditional=productoprodugastoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProduGastoBeanSwingJInternalFrameAdditional productoprodugastoBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProduGastoBeanSwingJInternalFrame
	
	public ProductoProduGastoBeanSwingJInternalFrameAdditional getProductoProduGastoBeanSwingJInternalFrameAdditional() {
		return this.productoprodugastoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProduGastoBeanSwingJInternalFrameAdditional(ProductoProduGastoBeanSwingJInternalFrameAdditional productoprodugastoBeanSwingJInternalFrameAdditional) {
		try {
			this.productoprodugastoBeanSwingJInternalFrameAdditional=productoprodugastoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProduGastoLogic productoprodugastoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProduGasto productoprodugastoBean;
	public ProductoProduGastoConstantesFunciones productoprodugastoConstantesFunciones;
	//public ProductoProduGastoParameterReturnGeneral productoprodugastoReturnGeneral;
	
	//FK
	
	public ProductoDefiProduLogic productodefiproduLogic;
	public TipoGastoProduEmpresaLogic tipogastoproduempresaLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	public ClienteLogic clienteproveedorLogic;
	public FacturaLogic facturaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProduGasto> productoprodugastos;	
	//public List<ProductoProduGasto> productoprodugastosEliminados;
	//public List<ProductoProduGasto> productoprodugastosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProduGasto=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProduGasto=true;
	public Boolean isVisibilidadCeldaCopiarProductoProduGasto=true;
	public Boolean isVisibilidadCeldaVerFormProductoProduGasto=true;
	public Boolean isVisibilidadCeldaOrdenProductoProduGasto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
	public Boolean isVisibilidadCeldaModificarProductoProduGasto=false;
	public Boolean isVisibilidadCeldaActualizarProductoProduGasto=false;
	public Boolean isVisibilidadCeldaEliminarProductoProduGasto=false;
	public Boolean isVisibilidadCeldaCancelarProductoProduGasto=false;
	public Boolean isVisibilidadCeldaGuardarProductoProduGasto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;	
	
	
	public Boolean isVisibilidadFK_IdClienteProveedor=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdProductoDefiProdu=false;
	public Boolean isVisibilidadFK_IdTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoProduGasto() {
		return this.iIdNuevoProductoProduGasto;
	}

	public void setiIdNuevoProductoProduGasto(Long iIdNuevoProductoProduGasto) {
		this.iIdNuevoProductoProduGasto = iIdNuevoProductoProduGasto;
	}
	
	public Long getidProductoProduGastoActual() {
		return this.idProductoProduGastoActual;
	}

	public void setidProductoProduGastoActual(Long idProductoProduGastoActual) {
		this.idProductoProduGastoActual = idProductoProduGastoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProduGasto getproductoprodugasto() {
		return this.productoprodugasto;
	}

	public void setproductoprodugasto(ProductoProduGasto productoprodugasto) {
		this.productoprodugasto = productoprodugasto;
	}
	
	public ProductoProduGasto getproductoprodugastoAux() {
		return this.productoprodugastoAux;
	}

	public void setproductoprodugastoAux(ProductoProduGasto productoprodugastoAux) {
		this.productoprodugastoAux = productoprodugastoAux;
	}				
	
	public ProductoProduGasto getproductoprodugastoAnterior() {
		return this.productoprodugastoAnterior;
	}

	public void setproductoprodugastoAnterior(ProductoProduGasto productoprodugastoAnterior) {
		this.productoprodugastoAnterior = productoprodugastoAnterior;
	}	
	
	public ProductoProduGasto getproductoprodugastoTotales() {
		return this.productoprodugastoTotales;
	}

	public void setproductoprodugastoTotales(ProductoProduGasto productoprodugastoTotales) {
		this.productoprodugastoTotales = productoprodugastoTotales;
	}	
	
	public ProductoProduGasto getproductoprodugastoBean() {
		return this.productoprodugastoBean;
	}

	public void setproductoprodugastoBean(ProductoProduGasto productoprodugastoBean) {
		this.productoprodugastoBean = productoprodugastoBean;
	}	
	
	public ProductoProduGastoParameterReturnGeneral getproductoprodugastoReturnGeneral() {
		return this.productoprodugastoReturnGeneral;
	}

	public void setproductoprodugastoReturnGeneral(ProductoProduGastoParameterReturnGeneral productoprodugastoReturnGeneral) {
		this.productoprodugastoReturnGeneral = productoprodugastoReturnGeneral;
	}	
	
	
	public Long id_cliente_proveedorFK_IdClienteProveedor=-1L;

	public Long getid_cliente_proveedorFK_IdClienteProveedor() {
		return this.id_cliente_proveedorFK_IdClienteProveedor;
	}

	public void setid_cliente_proveedorFK_IdClienteProveedor(Long id_cliente_proveedorFK_IdClienteProveedor) {
		this.id_cliente_proveedorFK_IdClienteProveedor = id_cliente_proveedorFK_IdClienteProveedor;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=-1L;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_cuenta_contable_debitoFK_IdCuentaContableDebito=-1L;

	public Long getid_cuenta_contable_debitoFK_IdCuentaContableDebito() {
		return this.id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public void setid_cuenta_contable_debitoFK_IdCuentaContableDebito(Long id_cuenta_contable_debitoFK_IdCuentaContableDebito) {
		this.id_cuenta_contable_debitoFK_IdCuentaContableDebito = id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_producto_defi_produFK_IdProductoDefiProdu=-1L;

	public Long getid_producto_defi_produFK_IdProductoDefiProdu() {
		return this.id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public void setid_producto_defi_produFK_IdProductoDefiProdu(Long id_producto_defi_produFK_IdProductoDefiProdu) {
		this.id_producto_defi_produFK_IdProductoDefiProdu = id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public Long id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa=-1L;

	public Long getid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa() {
		return this.id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa;
	}

	public void setid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa(Long id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa) {
		this.id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa = id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductoProduGastoLogic getProductoProduGastoLogic()	{		
		return productoprodugastoLogic;
	}

	public void setProductoProduGastoLogic(ProductoProduGastoLogic productoprodugastoLogic) {
		this.productoprodugastoLogic = productoprodugastoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoProductoProduGasto() {
		return isEsNuevoProductoProduGasto;
	}

	public void setIsEsNuevoProductoProduGasto(Boolean isEsNuevoProductoProduGasto) {
		this.isEsNuevoProductoProduGasto = isEsNuevoProductoProduGasto;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProduGasto() {
		return esParaAccionDesdeFormularioProductoProduGasto;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProduGasto(Boolean esParaAccionDesdeFormularioProductoProduGasto) {
		this.esParaAccionDesdeFormularioProductoProduGasto = esParaAccionDesdeFormularioProductoProduGasto;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosProductoDefiProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoDefiProduLogic productodefiproduLogic=new ProductoDefiProduLogic();

			productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

					productodefiproduLogic.getTodosProductoDefiProdusWithConnection(sFinalQuery,new Pagination());

					this.productodefiprodusForeignKey=productodefiproduLogic.getProductoDefiProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoDefiProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidProductoDefiProduActual());
					this.productodefiprodusForeignKey.add(productodefiproduLogic.getProductoDefiProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoGastoProduEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogastoproduempresasForeignKey=new ArrayList<TipoGastoProduEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGastoProduEmpresaLogic tipogastoproduempresaLogic=new TipoGastoProduEmpresaLogic();

			tipogastoproduempresaLogic.getTipoGastoProduEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduempresaLogic.getTipoGastoProduEmpresaDataAccess().setIsForForeingKeyData(true);

					tipogastoproduempresaLogic.getTodosTipoGastoProduEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipogastoproduempresasForeignKey=tipogastoproduempresaLogic.getTipoGastoProduEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGastoProduEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduempresaLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidTipoGastoProduEmpresaActual());
					this.tipogastoproduempresasForeignKey.add(tipogastoproduempresaLogic.getTipoGastoProduEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCuentaContableDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledebitoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledebitosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidCuentaContableDebitoActual());
					this.cuentacontabledebitosForeignKey.add(cuentacontableLogic.getCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClienteProveedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clienteproveedorsForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteproveedorLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clienteproveedorsForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaClienteProveedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidClienteProveedorActual());
					this.clienteproveedorsForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(productoprodugastoSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualProductoDefiProduForeignKey(Long idProductoDefiProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productodefiproduTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setProductoDefiProdu(productodefiproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setSelectedItem(productodefiproduTemp);
					}
				} else {
					//jComboBoxid_producto_defi_produProductoProduGasto.setSelectedItem(productodefiproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(productodefiproduTemp!=null && jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto!=null) {
						jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setSelectedItem(productodefiproduTemp);
					} else {
						if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto!=null) {
							//jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setSelectedItem(productodefiproduTemp);
							if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.getItemCount()>0) {
								jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualProductoDefiProduForeignKeyDescripcion(Long idProductoDefiProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}


			sDescripcion=ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoDefiProduForeignKeyGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxid_producto_defi_produProductoProduGastoGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(productodefiproduTemp!=null) {
				jComboBoxid_producto_defi_produProductoProduGastoGenerico.setSelectedItem(productodefiproduTemp);
			} else {
				if(jComboBoxid_producto_defi_produProductoProduGastoGenerico!=null && jComboBoxid_producto_defi_produProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_producto_defi_produProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGastoProduEmpresaForeignKey(Long idTipoGastoProduEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGastoProduEmpresa  tipogastoproduempresaTemp=null;

			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasForeignKey) {
				if(tipogastoproduempresaAux.getId()!=null && tipogastoproduempresaAux.getId().equals(idTipoGastoProduEmpresaSeleccionado)) {
					tipogastoproduempresaTemp=tipogastoproduempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogastoproduempresaTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setTipoGastoProduEmpresa(tipogastoproduempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogastoproduempresaTemp!=null && jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto!=null) {
						jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					} else {
						if(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto!=null) {
							//jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setSelectedItem(tipogastoproduempresaTemp);
							if(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.getItemCount()>0) {
								jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoGastoProduEmpresaForeignKeyDescripcion(Long idTipoGastoProduEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGastoProduEmpresa  tipogastoproduempresaTemp=null;

			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasForeignKey) {
				if(tipogastoproduempresaAux.getId()!=null && tipogastoproduempresaAux.getId().equals(idTipoGastoProduEmpresaSeleccionado)) {
					tipogastoproduempresaTemp=tipogastoproduempresaAux;
					break;
				}
			}


			sDescripcion=TipoGastoProduEmpresaConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGastoProduEmpresaForeignKeyGenerico(Long idTipoGastoProduEmpresaSeleccionado,JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico)throws Exception
	{
		try
		{
			TipoGastoProduEmpresa  tipogastoproduempresaTemp=null;

			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasForeignKey) {
				if(tipogastoproduempresaAux.getId()!=null && tipogastoproduempresaAux.getId().equals(idTipoGastoProduEmpresaSeleccionado)) {
					tipogastoproduempresaTemp=tipogastoproduempresaAux;
					break;
				}
			}

			if(tipogastoproduempresaTemp!=null) {
				jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico.setSelectedItem(tipogastoproduempresaTemp);
			} else {
				if(jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico!=null && jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDebitoForeignKey(Long idCuentaContableDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledebitoTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledebitoTemp!=null && jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto!=null) {
						jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto!=null) {
							//jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setSelectedItem(cuentacontabledebitoTemp);
							if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.getItemCount()>0) {
								jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCuentaContableDebitoForeignKeyDescripcion(Long idCuentaContableDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(cuentacontabledebitoTemp!=null) {
				jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico!=null && jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico!=null && jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteProveedorForeignKey(Long idClienteProveedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteproveedorTemp=null;

			for(Cliente clienteproveedorAux:clienteproveedorsForeignKey) {
				if(clienteproveedorAux.getId()!=null && clienteproveedorAux.getId().equals(idClienteProveedorSeleccionado)) {
					clienteproveedorTemp=clienteproveedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteproveedorTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setClienteProveedor(clienteproveedorTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedItem(clienteproveedorTemp);
					}
				} else {
					//jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedItem(clienteproveedorTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdClienteProveedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteproveedorTemp!=null && jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto!=null) {
						jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setSelectedItem(clienteproveedorTemp);
					} else {
						if(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto!=null) {
							//jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setSelectedItem(clienteproveedorTemp);
							if(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.getItemCount()>0) {
								jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteProveedorForeignKeyDescripcion(Long idClienteProveedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteproveedorTemp=null;

			for(Cliente clienteproveedorAux:clienteproveedorsForeignKey) {
				if(clienteproveedorAux.getId()!=null && clienteproveedorAux.getId().equals(idClienteProveedorSeleccionado)) {
					clienteproveedorTemp=clienteproveedorAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteproveedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteProveedorForeignKeyGenerico(Long idClienteProveedorSeleccionado,JComboBox jComboBoxid_cliente_proveedorProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteproveedorTemp=null;

			for(Cliente clienteproveedorAux:clienteproveedorsForeignKey) {
				if(clienteproveedorAux.getId()!=null && clienteproveedorAux.getId().equals(idClienteProveedorSeleccionado)) {
					clienteproveedorTemp=clienteproveedorAux;
					break;
				}
			}

			if(clienteproveedorTemp!=null) {
				jComboBoxid_cliente_proveedorProductoProduGastoGenerico.setSelectedItem(clienteproveedorTemp);
			} else {
				if(jComboBoxid_cliente_proveedorProductoProduGastoGenerico!=null && jComboBoxid_cliente_proveedorProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cliente_proveedorProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaProductoProduGasto.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaProductoProduGasto!=null) {
						jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaProductoProduGasto!=null) {
							//jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaProductoProduGasto.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaProductoProduGastoGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaProductoProduGastoGenerico!=null && jComboBoxid_facturaProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_facturaProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.productoprodugasto!=null) {
						this.productoprodugasto.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoProduGasto.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoProduGasto!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoProduGasto!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoProduGasto.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadProductoProduGastoGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoProduGastoGenerico!=null && jComboBoxid_unidadProductoProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoDefiProduForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_producto_defi_produProductoProduGastoGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduAux=new ProductoDefiProdu();

			if(jComboBoxid_producto_defi_produProductoProduGastoGenerico==null) {
				productodefiproduAux=(ProductoDefiProdu)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.getSelectedItem();
			} else {
				productodefiproduAux=(ProductoDefiProdu)jComboBoxid_producto_defi_produProductoProduGastoGenerico.getSelectedItem();
			}

			if(productodefiproduAux!=null && productodefiproduAux.getId()!=null) {
				productoprodugasto.setid_producto_defi_produ(productodefiproduAux.getId());
				productoprodugasto.setproductodefiprodu_descripcion(ProductoProduGastoConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduAux));
				productoprodugasto.setProductoDefiProdu(productodefiproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGastoProduEmpresaForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico)throws Exception
	{
		try
		{
			TipoGastoProduEmpresa  tipogastoproduempresaAux=new TipoGastoProduEmpresa();

			if(jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico==null) {
				tipogastoproduempresaAux=(TipoGastoProduEmpresa)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getSelectedItem();
			} else {
				tipogastoproduempresaAux=(TipoGastoProduEmpresa)jComboBoxid_tipo_gasto_produ_empresaProductoProduGastoGenerico.getSelectedItem();
			}

			if(tipogastoproduempresaAux!=null && tipogastoproduempresaAux.getId()!=null) {
				productoprodugasto.setid_tipo_gasto_produ_empresa(tipogastoproduempresaAux.getId());
				productoprodugasto.settipogastoproduempresa_descripcion(ProductoProduGastoConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresaAux));
				productoprodugasto.setTipoGastoProduEmpresa(tipogastoproduempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoProductoProduGastoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				productoprodugasto.setid_cuenta_contable_debito(cuentacontableAux.getId());
				productoprodugasto.setcuentacontabledebito_descripcion(ProductoProduGastoConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				productoprodugasto.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoProductoProduGastoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				productoprodugasto.setid_cuenta_contable_credito(cuentacontableAux.getId());
				productoprodugasto.setcuentacontablecredito_descripcion(ProductoProduGastoConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				productoprodugasto.setCuentaContableCredito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteProveedorForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_cliente_proveedorProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_cliente_proveedorProductoProduGastoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_cliente_proveedorProductoProduGastoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				productoprodugasto.setid_cliente_proveedor(clienteAux.getId());
				productoprodugasto.setclienteproveedor_descripcion(ProductoProduGastoConstantesFunciones.getClienteProveedorDescripcion(clienteAux));
				productoprodugasto.setClienteProveedor(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_facturaProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaProductoProduGastoGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaProductoProduGastoGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				productoprodugasto.setid_factura(facturaAux.getId());
				productoprodugasto.setfactura_descripcion(ProductoProduGastoConstantesFunciones.getFacturaDescripcion(facturaAux));
				productoprodugasto.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoProduGasto productoprodugasto,JComboBox jComboBoxid_unidadProductoProduGastoGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoProduGastoGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoProduGastoGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoprodugasto.setid_unidad(unidadAux.getId());
				productoprodugasto.setunidad_descripcion(ProductoProduGastoConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoprodugasto.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoDefiProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProductoDefiProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.addItem(productodefiprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.addItem(productodefiprodu);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGastoProduEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGastoProduEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.removeAllItems();

							for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.addItem(tipogastoproduempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.removeAllItems();

							for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresasForeignKey) {
								this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.addItem(tipogastoproduempresa);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.addItem(cuentacontabledebito);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.addItem(cuentacontablecredito);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClienteProveedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.removeAllItems();

							for(Cliente clienteproveedor:this.clienteproveedorsForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.addItem(clienteproveedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdClienteProveedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.removeAllItems();

							for(Cliente clienteproveedor:this.clienteproveedorsForeignKey) {
								this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.addItem(clienteproveedor);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.addItem(factura);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { 
					}

					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.addItem(unidad);
							}
						}

						if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoDefiProduForeignKey(ProductoDefiProdu productodefiprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setSelectedItem(productodefiprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setSelectedItem(productodefiprodu);
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGastoProduEmpresaForeignKey(TipoGastoProduEmpresa tipogastoproduempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedItem(tipogastoproduempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setSelectedItem(tipogastoproduempresa);
						} else {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDebitoForeignKey(CuentaContable cuentacontabledebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setSelectedItem(cuentacontabledebito);
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteProveedorForeignKey(Cliente clienteproveedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedItem(clienteproveedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setSelectedItem(clienteproveedor);
						} else {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProduGasto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProduGastoConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduGasto(this.productoprodugastoLogic.getProductoProduGastos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProduGastoConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduGasto(this.productoprodugastos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ProductoDefiProdu.class));
		classes.add(new Classe(TipoGastoProduEmpresa.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoprodugastoLogic.setProductoProduGastos(this.productoprodugastos);
			productoprodugastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
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
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public ProductoProduGastoParameterReturnGeneral getProductoProduGastoParameterGeneral() {
		return this.productoprodugastoParameterGeneral;
	}
	
	public void setProductoProduGastoParameterGeneral(ProductoProduGastoParameterReturnGeneral productoprodugastoParameterGeneral) {
		this.productoprodugastoParameterGeneral = productoprodugastoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoProductoProduGasto() {
		return isPermisoTodoProductoProduGasto;
	}

	public void setIsPermisoTodoProductoProduGasto(Boolean isPermisoTodoProductoProduGasto) {
		this.isPermisoTodoProductoProduGasto = isPermisoTodoProductoProduGasto;
	}

	public Boolean getIsPermisoNuevoProductoProduGasto() {
		return isPermisoNuevoProductoProduGasto;
	}

	public void setIsPermisoNuevoProductoProduGasto(Boolean isPermisoNuevoProductoProduGasto) {
		this.isPermisoNuevoProductoProduGasto = isPermisoNuevoProductoProduGasto;
	}

	public Boolean getIsPermisoActualizarProductoProduGasto() {
		return isPermisoActualizarProductoProduGasto;
	}

	public void setIsPermisoActualizarProductoProduGasto(Boolean isPermisoActualizarProductoProduGasto) {
		this.isPermisoActualizarProductoProduGasto = isPermisoActualizarProductoProduGasto;
	}

	public Boolean getIsPermisoEliminarProductoProduGasto() {
		return isPermisoEliminarProductoProduGasto;
	}

	public void setIsPermisoEliminarProductoProduGasto(Boolean isPermisoEliminarProductoProduGasto) {
		this.isPermisoEliminarProductoProduGasto = isPermisoEliminarProductoProduGasto;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProduGasto() {
		return isPermisoGuardarCambiosProductoProduGasto;
	}

	public void setIsPermisoGuardarCambiosProductoProduGasto(Boolean isPermisoGuardarCambiosProductoProduGasto) {
		this.isPermisoGuardarCambiosProductoProduGasto = isPermisoGuardarCambiosProductoProduGasto;
	}
	
	public Boolean getIsPermisoConsultaProductoProduGasto() {
		return isPermisoConsultaProductoProduGasto;
	}

	public void setIsPermisoConsultaProductoProduGasto(Boolean isPermisoConsultaProductoProduGasto) {
		this.isPermisoConsultaProductoProduGasto = isPermisoConsultaProductoProduGasto;
	}

	public Boolean getIsPermisoBusquedaProductoProduGasto() {
		return isPermisoBusquedaProductoProduGasto;
	}

	public void setIsPermisoBusquedaProductoProduGasto(Boolean isPermisoBusquedaProductoProduGasto) {
		this.isPermisoBusquedaProductoProduGasto = isPermisoBusquedaProductoProduGasto;
	}

	public Boolean getIsPermisoReporteProductoProduGasto() {
		return isPermisoReporteProductoProduGasto;
	}

	public void setIsPermisoReporteProductoProduGasto(Boolean isPermisoReporteProductoProduGasto) {
		this.isPermisoReporteProductoProduGasto = isPermisoReporteProductoProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProduGasto() {
		return isPermisoPaginacionMedioProductoProduGasto;
	}

	public void setIsPermisoPaginacionMedioProductoProduGasto(Boolean isPermisoPaginacionMedioProductoProduGasto) {
		this.isPermisoPaginacionMedioProductoProduGasto = isPermisoPaginacionMedioProductoProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProduGasto() {
		return isPermisoPaginacionTodoProductoProduGasto;
	}

	public void setIsPermisoPaginacionTodoProductoProduGasto(Boolean isPermisoPaginacionTodoProductoProduGasto) {
		this.isPermisoPaginacionTodoProductoProduGasto = isPermisoPaginacionTodoProductoProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProduGasto() {
		return isPermisoPaginacionAltoProductoProduGasto;
	}

	public void setIsPermisoPaginacionAltoProductoProduGasto(Boolean isPermisoPaginacionAltoProductoProduGasto) {
		this.isPermisoPaginacionAltoProductoProduGasto = isPermisoPaginacionAltoProductoProduGasto;
	}
	
	public Boolean getIsPermisoCopiarProductoProduGasto() {
		return isPermisoCopiarProductoProduGasto;
	}

	public void setIsPermisoCopiarProductoProduGasto(Boolean isPermisoCopiarProductoProduGasto) {
		this.isPermisoCopiarProductoProduGasto = isPermisoCopiarProductoProduGasto;
	}
	
	public Boolean getIsPermisoVerFormProductoProduGasto() {
		return isPermisoVerFormProductoProduGasto;
	}

	public void setIsPermisoVerFormProductoProduGasto(Boolean isPermisoVerFormProductoProduGasto) {
		this.isPermisoVerFormProductoProduGasto = isPermisoVerFormProductoProduGasto;
	}
	
	public Boolean getIsPermisoDuplicarProductoProduGasto() {
		return isPermisoDuplicarProductoProduGasto;
	}

	public void setIsPermisoDuplicarProductoProduGasto(Boolean isPermisoDuplicarProductoProduGasto) {
		this.isPermisoDuplicarProductoProduGasto = isPermisoDuplicarProductoProduGasto;
	}
	
	public Boolean getIsPermisoOrdenProductoProduGasto() {
		return isPermisoOrdenProductoProduGasto;
	}

	public void setIsPermisoOrdenProductoProduGasto(Boolean isPermisoOrdenProductoProduGasto) {
		this.isPermisoOrdenProductoProduGasto = isPermisoOrdenProductoProduGasto;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProduGasto() {
		return isVisibilidadCeldaNuevoProductoProduGasto;
	}

	public void setIsVisibilidadCeldaNuevoProductoProduGasto(Boolean isVisibilidadCeldaNuevoProductoProduGasto) {
		this.isVisibilidadCeldaNuevoProductoProduGasto = isVisibilidadCeldaNuevoProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProduGasto() {
		return isVisibilidadCeldaDuplicarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProduGasto(Boolean isVisibilidadCeldaDuplicarProductoProduGasto) {
		this.isVisibilidadCeldaDuplicarProductoProduGasto = isVisibilidadCeldaDuplicarProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProduGasto() {
		return isVisibilidadCeldaCopiarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaCopiarProductoProduGasto(Boolean isVisibilidadCeldaCopiarProductoProduGasto) {
		this.isVisibilidadCeldaCopiarProductoProduGasto = isVisibilidadCeldaCopiarProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProduGasto() {
		return isVisibilidadCeldaVerFormProductoProduGasto;
	}

	public void setIsVisibilidadCeldaVerFormProductoProduGasto(Boolean isVisibilidadCeldaVerFormProductoProduGasto) {
		this.isVisibilidadCeldaVerFormProductoProduGasto = isVisibilidadCeldaVerFormProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProduGasto() {
		return isVisibilidadCeldaOrdenProductoProduGasto;
	}

	public void setIsVisibilidadCeldaOrdenProductoProduGasto(Boolean isVisibilidadCeldaOrdenProductoProduGasto) {
		this.isVisibilidadCeldaOrdenProductoProduGasto = isVisibilidadCeldaOrdenProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProduGasto() {
		return isVisibilidadCeldaNuevoRelacionesProductoProduGasto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProduGasto(Boolean isVisibilidadCeldaNuevoRelacionesProductoProduGasto) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto = isVisibilidadCeldaNuevoRelacionesProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProduGasto() {
		return isVisibilidadCeldaModificarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaModificarProductoProduGasto(Boolean isVisibilidadCeldaModificarProductoProduGasto) {
		this.isVisibilidadCeldaModificarProductoProduGasto = isVisibilidadCeldaModificarProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProduGasto() {
		return isVisibilidadCeldaActualizarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaActualizarProductoProduGasto(Boolean isVisibilidadCeldaActualizarProductoProduGasto) {
		this.isVisibilidadCeldaActualizarProductoProduGasto = isVisibilidadCeldaActualizarProductoProduGasto;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProduGasto() {
		return isVisibilidadCeldaEliminarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaEliminarProductoProduGasto(Boolean isVisibilidadCeldaEliminarProductoProduGasto) {
		this.isVisibilidadCeldaEliminarProductoProduGasto = isVisibilidadCeldaEliminarProductoProduGasto;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProduGasto() {
		return isVisibilidadCeldaCancelarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaCancelarProductoProduGasto(Boolean isVisibilidadCeldaCancelarProductoProduGasto) {
		this.isVisibilidadCeldaCancelarProductoProduGasto = isVisibilidadCeldaCancelarProductoProduGasto;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProduGasto() {
		return isVisibilidadCeldaGuardarProductoProduGasto;
	}

	public void setIsVisibilidadCeldaGuardarProductoProduGasto(Boolean isVisibilidadCeldaGuardarProductoProduGasto) {
		this.isVisibilidadCeldaGuardarProductoProduGasto = isVisibilidadCeldaGuardarProductoProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProduGasto() {
		return isVisibilidadCeldaGuardarCambiosProductoProduGasto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProduGasto(Boolean isVisibilidadCeldaGuardarCambiosProductoProduGasto) {
		this.isVisibilidadCeldaGuardarCambiosProductoProduGasto = isVisibilidadCeldaGuardarCambiosProductoProduGasto;
	}
		
	public ProductoProduGastoSessionBean getproductoprodugastoSessionBean() {
		return this.productoprodugastoSessionBean;
	}
	
	public void setproductoprodugastoSessionBean(ProductoProduGastoSessionBean productoprodugastoSessionBean) {
		this.productoprodugastoSessionBean=productoprodugastoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdClienteProveedor() {
		return this.isVisibilidadFK_IdClienteProveedor;
	}

	public void setisVisibilidadFK_IdClienteProveedor(Boolean isVisibilidadFK_IdClienteProveedor) {
		this.isVisibilidadFK_IdClienteProveedor=isVisibilidadFK_IdClienteProveedor;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDebito() {
		return this.isVisibilidadFK_IdCuentaContableDebito;
	}

	public void setisVisibilidadFK_IdCuentaContableDebito(Boolean isVisibilidadFK_IdCuentaContableDebito) {
		this.isVisibilidadFK_IdCuentaContableDebito=isVisibilidadFK_IdCuentaContableDebito;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdProductoDefiProdu() {
		return this.isVisibilidadFK_IdProductoDefiProdu;
	}

	public void setisVisibilidadFK_IdProductoDefiProdu(Boolean isVisibilidadFK_IdProductoDefiProdu) {
		this.isVisibilidadFK_IdProductoDefiProdu=isVisibilidadFK_IdProductoDefiProdu;
	}

	public Boolean getisVisibilidadFK_IdTipoGastoProduEmpresa() {
		return this.isVisibilidadFK_IdTipoGastoProduEmpresa;
	}

	public void setisVisibilidadFK_IdTipoGastoProduEmpresa(Boolean isVisibilidadFK_IdTipoGastoProduEmpresa) {
		this.isVisibilidadFK_IdTipoGastoProduEmpresa=isVisibilidadFK_IdTipoGastoProduEmpresa;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(ProductoProduGasto productoprodugasto)throws Exception {
		try {
			
				this.setActualParaGuardarProductoDefiProduForeignKey(productoprodugasto,null);
				this.setActualParaGuardarTipoGastoProduEmpresaForeignKey(productoprodugasto,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(productoprodugasto,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(productoprodugasto,null);
				this.setActualParaGuardarClienteProveedorForeignKey(productoprodugasto,null);
				this.setActualParaGuardarFacturaForeignKey(productoprodugasto,null);
				this.setActualParaGuardarUnidadForeignKey(productoprodugasto,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(ProductoProduGasto productoprodugasto,ProductoProduGasto productoprodugastoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProduGasto(productoprodugasto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoprodugastoAux.setId(productoprodugasto.getId());
		productoprodugastoAux.setVersionRow(productoprodugasto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProduGasto();
		
			int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoprodugastoValidator.getInvalidValues(this.productoprodugasto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoprodugastoLogic.setDatosCliente(datosCliente);
			productoprodugastoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoprodugastoAux=new  ProductoProduGasto();
				
				productoprodugastoAux.setIsNew(true);
				productoprodugastoAux.setIsChanged(true);
				
				productoprodugastoAux.setProductoProduGastoOriginal(this.productoprodugasto);
				
				productoprodugastoAux.setId(this.productoprodugasto.getId());	
				productoprodugastoAux.setVersionRow(this.productoprodugasto.getVersionRow());	
				productoprodugastoAux.setid_producto_defi_produ(this.productoprodugasto.getid_producto_defi_produ());	
				productoprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoprodugasto.getid_tipo_gasto_produ_empresa());	
				productoprodugastoAux.setid_cuenta_contable_debito(this.productoprodugasto.getid_cuenta_contable_debito());	
				productoprodugastoAux.setid_cuenta_contable_credito(this.productoprodugasto.getid_cuenta_contable_credito());	
				productoprodugastoAux.setid_cliente_proveedor(this.productoprodugasto.getid_cliente_proveedor());	
				productoprodugastoAux.setid_factura(this.productoprodugasto.getid_factura());	
				productoprodugastoAux.setid_unidad(this.productoprodugasto.getid_unidad());	
				productoprodugastoAux.setcanitdad(this.productoprodugasto.getcanitdad());	
				productoprodugastoAux.setcosto(this.productoprodugasto.getcosto());	
				productoprodugastoAux.setcosto_total(this.productoprodugasto.getcosto_total());	
				productoprodugastoAux.setdescripcion(this.productoprodugasto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodugastoAux,productoprodugastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.saveProductoProduGastos();//WithConnection
						//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodugastoLogic.saveProductoProduGastoRelaciones(productoprodugastoAux);//WithConnection
								//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodugastoAux,productoprodugastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoprodugastoAux=new  ProductoProduGasto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado() 
					|| (this.productoprodugastoSessionBean.getEsGuardarRelacionado() && this.productoprodugasto.getId()>=0)) {
						
					productoprodugastoAux.setIsNew(false);
				}
				
				productoprodugastoAux.setIsDeleted(false);
			
				productoprodugastoAux.setId(this.productoprodugasto.getId());	
				productoprodugastoAux.setVersionRow(this.productoprodugasto.getVersionRow());	
				productoprodugastoAux.setid_producto_defi_produ(this.productoprodugasto.getid_producto_defi_produ());	
				productoprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoprodugasto.getid_tipo_gasto_produ_empresa());	
				productoprodugastoAux.setid_cuenta_contable_debito(this.productoprodugasto.getid_cuenta_contable_debito());	
				productoprodugastoAux.setid_cuenta_contable_credito(this.productoprodugasto.getid_cuenta_contable_credito());	
				productoprodugastoAux.setid_cliente_proveedor(this.productoprodugasto.getid_cliente_proveedor());	
				productoprodugastoAux.setid_factura(this.productoprodugasto.getid_factura());	
				productoprodugastoAux.setid_unidad(this.productoprodugasto.getid_unidad());	
				productoprodugastoAux.setcanitdad(this.productoprodugasto.getcanitdad());	
				productoprodugastoAux.setcosto(this.productoprodugasto.getcosto());	
				productoprodugastoAux.setcosto_total(this.productoprodugasto.getcosto_total());	
				productoprodugastoAux.setdescripcion(this.productoprodugasto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodugastoAux,productoprodugastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.saveProductoProduGastos();//WithConnection
						//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodugastoLogic.saveProductoProduGastoRelaciones(productoprodugastoAux);//WithConnection
								//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodugastoAux,productoprodugastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodugasto,productoprodugastoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoprodugastoAux=new  ProductoProduGasto();
				
				productoprodugastoAux.setIsNew(false);
				productoprodugastoAux.setIsChanged(false);
				
				productoprodugastoAux.setIsDeleted(true);
				
				productoprodugastoAux.setId(this.productoprodugasto.getId());	
				productoprodugastoAux.setVersionRow(this.productoprodugasto.getVersionRow());	
				productoprodugastoAux.setid_producto_defi_produ(this.productoprodugasto.getid_producto_defi_produ());	
				productoprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoprodugasto.getid_tipo_gasto_produ_empresa());	
				productoprodugastoAux.setid_cuenta_contable_debito(this.productoprodugasto.getid_cuenta_contable_debito());	
				productoprodugastoAux.setid_cuenta_contable_credito(this.productoprodugasto.getid_cuenta_contable_credito());	
				productoprodugastoAux.setid_cliente_proveedor(this.productoprodugasto.getid_cliente_proveedor());	
				productoprodugastoAux.setid_factura(this.productoprodugasto.getid_factura());	
				productoprodugastoAux.setid_unidad(this.productoprodugasto.getid_unidad());	
				productoprodugastoAux.setcanitdad(this.productoprodugasto.getcanitdad());	
				productoprodugastoAux.setcosto(this.productoprodugasto.getcosto());	
				productoprodugastoAux.setcosto_total(this.productoprodugasto.getcosto_total());	
				productoprodugastoAux.setdescripcion(this.productoprodugasto.getdescripcion());	
				
				if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoprodugastoAux.getId()>=0) {	
						this.productoprodugastosEliminados.add(productoprodugastoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodugastoAux,productoprodugastos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.saveProductoProduGastos();//WithConnection
						//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodugastoLogic.saveProductoProduGastoRelaciones(productoprodugastoAux);//WithConnection
								//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoprodugastoAux,productoprodugastoLogic.getProductoProduGastos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoprodugastoAux,productoprodugastos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getProductoProduGastos().addAll(this.productoprodugastosEliminados);
					
					productoprodugastoLogic.saveProductoProduGastos();//WithConnection
					//productoprodugastoLogic.getSetVersionRowProductoProduGastos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProduGasto();
				
				this.productoprodugastosEliminados= new ArrayList<ProductoProduGasto>();		
			}
			
			if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Gasto Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoprodugasto=productoprodugastoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessProductoProduGasto();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProduGasto productoprodugastoLocal) throws Exception {
		
		if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProduGasto productoprodugastoLocal) throws Exception {	
		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDefiProduDetalleFormJInternalFrame.class)) {
				ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrameLocal=(ProductoDefiProduBeanSwingJInternalFrame) ((ProductoDefiProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productodefiproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.getproductodefiprodu(),true);
				productodefiproduBeanSwingJInternalFrameLocal.actualizarLista(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu,this.productodefiprodusForeignKey);

				productodefiproduBeanSwingJInternalFrameLocal.actualizarRelaciones(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				productoprodugastoLocal.setProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey("Formulario");
				this.setActualProductoDefiProduForeignKey(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGastoProduEmpresaDetalleFormJInternalFrame.class)) {
				TipoGastoProduEmpresaBeanSwingJInternalFrame tipogastoproduempresaBeanSwingJInternalFrameLocal=(TipoGastoProduEmpresaBeanSwingJInternalFrame) ((TipoGastoProduEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogastoproduempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGastoProduEmpresa(tipogastoproduempresaBeanSwingJInternalFrameLocal.gettipogastoproduempresa(),true);
				tipogastoproduempresaBeanSwingJInternalFrameLocal.actualizarLista(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa,this.tipogastoproduempresasForeignKey);

				tipogastoproduempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa);

				productoprodugastoLocal.setTipoGastoProduEmpresa(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa);

				this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
				this.cargarCombosFrameTipoGastoProduEmpresasForeignKey("Formulario");
				this.setActualTipoGastoProduEmpresaForeignKey(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				productoprodugastoLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				productoprodugastoLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteproveedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteproveedorBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteproveedorBeanSwingJInternalFrameLocal.actualizarLista(clienteproveedorBeanSwingJInternalFrameLocal.cliente,this.clienteproveedorsForeignKey);

				clienteproveedorBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteproveedorBeanSwingJInternalFrameLocal.cliente);

				productoprodugastoLocal.setClienteProveedor(clienteproveedorBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyClienteProveedor();
				this.cargarCombosFrameClienteProveedorsForeignKey("Formulario");
				this.setActualClienteProveedorForeignKey(clienteproveedorBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				productoprodugastoLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoprodugastoLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProduGastoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoprodugastoValidator.getInvalidValues(this.productoprodugasto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProduGasto productoprodugasto,List<ProductoProduGasto> productoprodugastos) throws Exception {
		try	{		
			ProductoProduGastoConstantesFunciones.actualizarLista(productoprodugasto,productoprodugastos,this.productoprodugastoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProduGasto productoprodugasto,List<ProductoProduGasto> productoprodugastos) throws Exception {
		try	{			
			ProductoProduGastoConstantesFunciones.actualizarSelectedLista(productoprodugasto,productoprodugastos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProduGasto> productoprodugastosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoprodugastosLocal=this.productoprodugastoLogic.getProductoProduGastos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoprodugastosLocal=this.productoprodugastos;
			}
			//ARCHITECTURE
		
			for(ProductoProduGasto productoprodugastoLocal:productoprodugastosLocal) {
				if(this.permiteMantenimiento(productoprodugastoLocal) && productoprodugastoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+ProductoProduGastoConstantesFunciones.getProductoProduGastoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDPRODUCTODEFIPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_producto_defi_produProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDTIPOGASTOPRODUEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_tipo_gasto_produ_empresaProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cuenta_contable_debitoProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cuenta_contable_creditoProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDCLIENTEPROVEEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cliente_proveedorProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_facturaProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_unidadProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcanitdadProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcostoProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcosto_totalProductoProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduGastoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabeldescripcionProductoProduGasto,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_producto_defi_produProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_tipo_gasto_produ_empresaProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cuenta_contable_debitoProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cuenta_contable_creditoProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_cliente_proveedorProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_facturaProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelid_unidadProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcanitdadProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcostoProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcosto_totalProductoProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduGasto.jLabeldescripcionProductoProduGasto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProductoProduGasto--;	
		
		
		this.productoprodugastoAux=new ProductoProduGasto();
		
		this.productoprodugastoAux.setId(this.iIdNuevoProductoProduGasto);
		this.productoprodugastoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodugastoLogic.getProductoProduGastos().add(this.productoprodugastoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoprodugastos.add(this.productoprodugastoAux);
		}
		//ARCHITECTURE
		
		this.productoprodugasto=this.productoprodugastoAux;
		
		if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProduGasto(this.productoprodugasto);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduGasto(this.productoprodugasto);
		}
				
		//this.setDefaultControlesProductoProduGasto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProduGasto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProduGasto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduGasto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduGasto(this.productoprodugastoBean,this.productoprodugasto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProduGastoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProduGastoConstantesFunciones.getClassesRelationshipsOfProductoProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoprodugastoReturnGeneral=productoprodugastoLogic.procesarEventosProductoProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodugastoLogic.getProductoProduGastos(),this.productoprodugasto,this.productoprodugastoParameterGeneral,this.isEsNuevoProductoProduGasto,classes);//this.productoprodugastoLogic.getProductoProduGasto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProduGasto(this.productoprodugastoReturnGeneral,this.productoprodugastoBean,false);
		
		if(this.productoprodugastoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto());
		}
		
		if(this.productoprodugastoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto(),classes);//this.productoprodugastoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProduGasto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProduGasto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.RecargarFormProductoProduGasto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProduGasto(false);
						
			if(productoprodugastoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduGasto();
			}
			
			this.actualizarVisualTableDatosProductoProduGasto();
			
			this.jTableDatosProductoProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoProduGasto(), this.getIndiceNuevoProductoProduGasto());
			
			this.seleccionarFilaTablaProductoProduGastoActual();
						
			this.actualizarEstadoCeldasBotonesProductoProduGasto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProduGasto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarcanitdadProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarcostoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarcosto_totalProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activardescripcionProductoProduGasto);	
		
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_producto_defi_produProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_cliente_proveedorProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_facturaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setEnabled(isHabilitar && this.productoprodugastoConstantesFunciones.activarid_unidadProductoProduGasto);
	};
	
	public void setDefaultControlesProductoProduGasto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProduGasto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoprodugastoSessionBean.setConGuardarRelaciones(true);			
			this.productoprodugastoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.setVisible(true);
			
					
		} else {
			//this.productoprodugastoSessionBean.setConGuardarRelaciones(false);			
			this.productoprodugastoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProduGasto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
				if(productoprodugastoAux.getId().equals(this.iIdNuevoProductoProduGasto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastos) {
				if(productoprodugastoAux.getId().equals(this.iIdNuevoProductoProduGasto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualProductoProduGasto(ProductoProduGasto productoprodugasto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
				if(productoprodugastoAux.getId().equals(productoprodugasto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastos) {
				if(productoprodugastoAux.getId().equals(productoprodugasto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalProductoProduGasto(ProductoProduGasto productoprodugastoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
				if(productoprodugastoAux.getProductoProduGastoOriginal().getId().equals(productoprodugastoOriginal.getId())) {
					existe=true;
					productoprodugastoOriginal.setId(productoprodugastoAux.getId());
					productoprodugastoOriginal.setVersionRow(productoprodugastoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduGasto productoprodugastoAux:this.productoprodugastos) {
				if(productoprodugastoAux.getProductoProduGastoOriginal().getId().equals(productoprodugastoOriginal.getId())) {
					existe=true;
					productoprodugastoOriginal.setId(productoprodugastoAux.getId());
					productoprodugastoOriginal.setVersionRow(productoprodugastoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProduGasto(Boolean esParaCancelar) throws Exception {
		productoprodugastosAux=new ArrayList<ProductoProduGasto>();
		productoprodugastoAux=new ProductoProduGasto();
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
					if(productoprodugastoAux.getId()<0) {
						productoprodugastosAux.add(productoprodugastoAux);
					}		
				}
				this.iIdNuevoProductoProduGasto=0L;
				this.productoprodugastoLogic.getProductoProduGastos().removeAll(productoprodugastosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduGasto productoprodugastoAux:this.productoprodugastos) {
					if(productoprodugastoAux.getId()<0) {
						productoprodugastosAux.add(productoprodugastoAux);
					}		
				}
				this.iIdNuevoProductoProduGasto=0L;
				this.productoprodugastos.removeAll(productoprodugastosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProduGasto 
					&& this.productoprodugastoLogic.getProductoProduGastos().size()>0
					) {
					productoprodugastoAux=this.productoprodugastoLogic.getProductoProduGastos().get(this.productoprodugastoLogic.getProductoProduGastos().size() - 1);
				
					if(productoprodugastoAux.getId()<0) {
						this.productoprodugastoLogic.getProductoProduGastos().remove(productoprodugastoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProduGasto && this.productoprodugastos.size()>0) {
					productoprodugastoAux=this.productoprodugastos.get(this.productoprodugastos.size() - 1);
				
					if(productoprodugastoAux.getId()<0) {
						this.productoprodugastos.remove(productoprodugastoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProduGasto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoprodugasto.getId()<0) {
				this.productoprodugastoLogic.getProductoProduGastos().remove(this.productoprodugasto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoprodugasto.getId()<0) {
				this.productoprodugastos.remove(this.productoprodugasto);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProduGasto(List<ProductoProduGasto> productoprodugastosAux) throws Exception {
		ProductoProduGastoConstantesFunciones.setEstadosInicialesProductoProduGasto(productoprodugastosAux);
	}
	
	public void setEstadosInicialesProductoProduGasto(ProductoProduGasto productoprodugastoAux) throws Exception {
		ProductoProduGastoConstantesFunciones.setEstadosInicialesProductoProduGasto(productoprodugastoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProduGastoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProduGastoActual()) {
				if(!this.isEsNuevoProductoProduGasto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProduGasto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProduGastoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Gasto Produccion ?", "MANTENIMIENTO DE Producto Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProduGasto productoprodugasto) throws Exception {
		ProductoProduGastoConstantesFunciones.seleccionarAsignar(this.productoprodugasto,productoprodugasto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProduGasto=this.isPermisoActualizarOriginalProductoProduGasto;
			
			
			this.seleccionarAsignar(productoprodugasto);
			
			

			idClienteProveedorActual=productoprodugasto.getid_cliente_proveedor();
			this.seleccionarClienteProveedorActual();

			idFacturaActual=productoprodugasto.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduGastoConstantesFunciones.quitarEspaciosProductoProduGasto(this.productoprodugasto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoprodugastoSessionBean.setsFuncionBusquedaRapida(this.productoprodugastoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteProveedorActual() throws Exception {
		try	{
			Cliente clienteproveedorAux=new Cliente();

			if(this.idClienteProveedorActual != null && this.idClienteProveedorActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteproveedorLogic.getEntityWithConnection(this.idClienteProveedorActual);
					clienteproveedorAux= clienteproveedorLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clienteproveedorsForeignKey=new ArrayList<Cliente>();
				clienteproveedorsForeignKey.add(clienteproveedorAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoProduGasto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProduGasto(esParaCancelar);				
				this.cancelarNuevoProductoProduGasto(esParaCancelar);								
			}
			
			this.productoprodugasto=new ProductoProduGasto();
			
			this.inicializarProductoProduGasto();
			
			this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProduGasto() throws Exception {
		try {
			ProductoProduGastoConstantesFunciones.inicializarProductoProduGasto(this.productoprodugasto);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoprodugastoLogic.getProductoProduGastos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProduGastos(String sAccionBusqueda,List<ProductoProduGasto> productoprodugastosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="ProductoProduGasto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProduGastoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProduGastoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProduGasto"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Producto Gasto Producciones");		
		parameters.put("busquedapor", ProductoProduGastoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProduGasto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProduGasto=new JRBeanArrayDataSource(ProductoProduGastoJInternalFrame.TraerProductoProduGastoBeans(productoprodugastosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProduGasto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProduGastoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProduGastoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProduGastoBean.TraerProductoProduGastoBeans(productoprodugastosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProduGastoActionPerformed(null);
					//this.generarExcelReporteProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoprodugastosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduGasto> productoprodugastosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduGastos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduGasto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProduGasto productoprodugasto : productoprodugastosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProduGastoConstantesFunciones.generarExcelReporteDataProductoProduGasto("NORMAL",row,workbook,productoprodugasto,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProduGasto(String sTipo,Row row,Workbook workbook) {
		
		ProductoProduGastoConstantesFunciones.generarExcelReporteHeaderProductoProduGasto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduGasto> productoprodugastosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProduGasto productoprodugasto : productoprodugastosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProduGastoConstantesFunciones.getProductoProduGastoDescripcion(productoprodugasto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getproductodefiprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.gettipogastoproduempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getclienteproveedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getcanitdad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodugasto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduGasto> productoprodugastosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProduGasto> productoprodugastosRespaldo=null;
		
		classes=ProductoProduGastoConstantesFunciones.getClassesRelationshipsOfProductoProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoprodugastoLogic.setDatosCliente(this.datosCliente);
		this.productoprodugastoLogic.setDatosDeep(this.datosDeep);
		this.productoprodugastoLogic.setIsConDeep(true);
		
		productoprodugastosRespaldo=this.productoprodugastoLogic.getProductoProduGastos();
		
		this.productoprodugastoLogic.setProductoProduGastos(productoprodugastosParaReportes);	
		this.productoprodugastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoprodugastosParaReportes=this.productoprodugastoLogic.getProductoProduGastos();
		this.productoprodugastoLogic.setProductoProduGastos(productoprodugastosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduGasto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProduGasto productoprodugasto : productoprodugastosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProduGasto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProduGastoConstantesFunciones.generarExcelReporteDataProductoProduGasto("NORMAL",row,workbook,productoprodugasto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProduGastoConstantesFunciones.getProductoProduGastoDescripcion(productoprodugasto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduGasto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProduGasto() throws Exception {		
		this.startProcessProductoProduGasto(true);
	}
	
	public void startProcessProductoProduGasto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProduGasto ,this.jPanelParametrosReportesProductoProduGasto, this.jScrollPanelDatosProductoProduGasto,this.jPanelPaginacionProductoProduGasto, this.jScrollPanelDatosEdicionProductoProduGasto, this.jPanelAccionesProductoProduGasto,this.jPanelAccionesFormularioProductoProduGasto,this.jmenuBarProductoProduGasto,this.jmenuBarDetalleProductoProduGasto,this.jTtoolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduGasto=this.jTabbedPaneBusquedasProductoProduGasto; 
		
		final JPanel jPanelParametrosReportesProductoProduGasto=this.jPanelParametrosReportesProductoProduGasto;
		//final JScrollPane jScrollPanelDatosProductoProduGasto=this.jScrollPanelDatosProductoProduGasto;
		final JTable jTableDatosProductoProduGasto=this.jTableDatosProductoProduGasto;		
		final JPanel jPanelPaginacionProductoProduGasto=this.jPanelPaginacionProductoProduGasto;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduGasto=this.jScrollPanelDatosEdicionProductoProduGasto;
		final JPanel jPanelAccionesProductoProduGasto=this.jPanelAccionesProductoProduGasto;
		
		JPanel jPanelCamposAuxiliarProductoProduGasto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduGasto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			jPanelCamposAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jPanelCamposProductoProduGasto;
			jPanelAccionesFormularioAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jPanelAccionesFormularioProductoProduGasto;
		}
		
		final JPanel jPanelCamposProductoProduGasto=jPanelCamposAuxiliarProductoProduGasto;
		final JPanel jPanelAccionesFormularioProductoProduGasto=jPanelAccionesFormularioAuxiliarProductoProduGasto;
		
		
		final JMenuBar jmenuBarProductoProduGasto=this.jmenuBarProductoProduGasto;
		final JToolBar jTtoolBarProductoProduGasto=this.jTtoolBarProductoProduGasto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProduGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduGasto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			jmenuBarDetalleAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jmenuBarDetalleProductoProduGasto;
			jTtoolBarDetalleAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jTtoolBarDetalleProductoProduGasto;
		}
		
		final JMenuBar jmenuBarDetalleProductoProduGasto=jmenuBarDetalleAuxiliarProductoProduGasto;
		final JToolBar jTtoolBarDetalleProductoProduGasto=jTtoolBarDetalleAuxiliarProductoProduGasto;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduGasto;
			processRunnable.jTableDatos=jTableDatosProductoProduGasto;
			processRunnable.jPanelCampos=jPanelCamposProductoProduGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduGasto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduGasto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduGasto;
			processRunnable.jTtoolBar=jTtoolBarProductoProduGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduGasto ,jPanelParametrosReportesProductoProduGasto,jTableDatosProductoProduGasto, /*jScrollPanelDatosProductoProduGasto,*/jPanelCamposProductoProduGasto,jPanelPaginacionProductoProduGasto, /*jScrollPanelDatosEdicionProductoProduGasto,*/ jPanelAccionesProductoProduGasto,jPanelAccionesFormularioProductoProduGasto,jmenuBarProductoProduGasto,jmenuBarDetalleProductoProduGasto,jTtoolBarProductoProduGasto,jTtoolBarDetalleProductoProduGasto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduGasto ,jPanelParametrosReportesProductoProduGasto, jScrollPanelDatosProductoProduGasto,jPanelPaginacionProductoProduGasto, jScrollPanelDatosEdicionProductoProduGasto, jPanelAccionesProductoProduGasto,jPanelAccionesFormularioProductoProduGasto,jmenuBarProductoProduGasto,jmenuBarDetalleProductoProduGasto,jTtoolBarProductoProduGasto,jTtoolBarDetalleProductoProduGasto);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessProductoProduGasto() {// throws Exception 
		this.finishProcessProductoProduGasto(true);
	}
	
	public void finishProcessProductoProduGasto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProduGasto ,this.jPanelParametrosReportesProductoProduGasto, this.jScrollPanelDatosProductoProduGasto,this.jPanelPaginacionProductoProduGasto, this.jScrollPanelDatosEdicionProductoProduGasto, this.jPanelAccionesProductoProduGasto,this.jPanelAccionesFormularioProductoProduGasto,this.jmenuBarProductoProduGasto,this.jmenuBarDetalleProductoProduGasto,this.jTtoolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduGasto=this.jTabbedPaneBusquedasProductoProduGasto; 
		
		final JPanel jPanelParametrosReportesProductoProduGasto=this.jPanelParametrosReportesProductoProduGasto;
		//final JScrollPane jScrollPanelDatosProductoProduGasto=this.jScrollPanelDatosProductoProduGasto;
		final JTable jTableDatosProductoProduGasto=this.jTableDatosProductoProduGasto;		
		final JPanel jPanelPaginacionProductoProduGasto=this.jPanelPaginacionProductoProduGasto;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduGasto=this.jScrollPanelDatosEdicionProductoProduGasto;
		final JPanel jPanelAccionesProductoProduGasto=this.jPanelAccionesProductoProduGasto;
		
		JPanel jPanelCamposAuxiliarProductoProduGasto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduGasto=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			jPanelCamposAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jPanelCamposProductoProduGasto;
			jPanelAccionesFormularioAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jPanelAccionesFormularioProductoProduGasto;
		}
		
		final JPanel jPanelCamposProductoProduGasto=jPanelCamposAuxiliarProductoProduGasto;
		final JPanel jPanelAccionesFormularioProductoProduGasto=jPanelAccionesFormularioAuxiliarProductoProduGasto;
		
		
		final JMenuBar jmenuBarProductoProduGasto=this.jmenuBarProductoProduGasto;		
		final JToolBar jTtoolBarProductoProduGasto=this.jTtoolBarProductoProduGasto;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProduGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduGasto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			jmenuBarDetalleAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jmenuBarDetalleProductoProduGasto;
			jTtoolBarDetalleAuxiliarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jTtoolBarDetalleProductoProduGasto;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProduGasto=jmenuBarDetalleAuxiliarProductoProduGasto;
		final JToolBar jTtoolBarDetalleProductoProduGasto=jTtoolBarDetalleAuxiliarProductoProduGasto;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduGasto;
			processRunnable.jTableDatos=jTableDatosProductoProduGasto;
			processRunnable.jPanelCampos=jPanelCamposProductoProduGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduGasto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduGasto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduGasto;
			processRunnable.jTtoolBar=jTtoolBarProductoProduGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProduGasto ,jPanelParametrosReportesProductoProduGasto, jTableDatosProductoProduGasto,/*jScrollPanelDatosProductoProduGasto,*/jPanelCamposProductoProduGasto,jPanelPaginacionProductoProduGasto, /*jScrollPanelDatosEdicionProductoProduGasto,*/ jPanelAccionesProductoProduGasto,jPanelAccionesFormularioProductoProduGasto,jmenuBarProductoProduGasto,jmenuBarDetalleProductoProduGasto,jTtoolBarProductoProduGasto,jTtoolBarDetalleProductoProduGasto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProduGasto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProduGasto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProduGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProduGasto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProduGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProduGasto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoprodugastoConstantesFunciones.getsFinalQueryProductoProduGasto();
		String  finalQueryPaginacionTodos=this.productoprodugastoConstantesFunciones.getsFinalQueryProductoProduGasto();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProduGastoConstantesFunciones.getArrayColumnasGlobalesNoProductoProduGasto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProduGastoConstantesFunciones.getArrayColumnasGlobalesProductoProduGasto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProduGastoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoprodugastosEliminados= new ArrayList<ProductoProduGasto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProduGasto();
		
				///*ProductoProduGastoSessionBean*/this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			
			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=ProductoProduGastoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProduGastoConstantesFunciones.getClassesForeignKeysOfProductoProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoprodugasto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoprodugastosAux= new ArrayList<ProductoProduGasto>();
			
				
			productoprodugastoLogic.setDatosCliente(this.datosCliente);
			productoprodugastoLogic.setDatosDeep(this.datosDeep);
			productoprodugastoLogic.setIsConDeep(true);
			
			
			productoprodugastoLogic.getProductoProduGastoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoprodugastoLogic.getTodosProductoProduGastos(finalQueryGlobal,pagination);
					
					//productoprodugastoLogic.getTodosProductoProduGastosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoprodugastoLogic.getProductoProduGastos()==null|| productoprodugastoLogic.getProductoProduGastos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodugastosAux= new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux= new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodugastoLogic.getTodosProductoProduGastos(finalQueryGlobal+"",this.pagination);												
							
							//productoprodugastoLogic.getTodosProductoProduGastosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProduGastos("Todos",productoprodugastoLogic.getProductoProduGastos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());					
							productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProduGasto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProduGasto=this.idActual;
				
				} else if(this.idProductoProduGastoActual!=null && this.idProductoProduGastoActual!=0L) {
					idProductoProduGasto=idProductoProduGastoActual;
				}
				
					
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndicePorId(idProductoProduGasto);
				
				this.productoprodugastos=new ArrayList<ProductoProduGasto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoprodugastoLogic.getEntity(idProductoProduGasto);
					
					//productoprodugastoLogic.getEntityWithConnection(idProductoProduGasto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
					productoprodugastoLogic.getProductoProduGastos().add(productoprodugastoLogic.getProductoProduGasto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugastos=new ArrayList<ProductoProduGasto>();
					this.productoprodugastos.add(productoprodugasto);
				}
				
				if(productoprodugastoLogic.getProductoProduGasto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdClienteProveedor")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdClienteProveedor(finalQueryGlobal,pagination,id_cliente_proveedorFK_IdClienteProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdClienteProveedor(finalQueryGlobal,pagination,id_cliente_proveedorFK_IdClienteProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdClienteProveedor",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdClienteProveedor",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdCuentaContableCredito",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdCuentaContableCredito",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDebito")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdCuentaContableDebito",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdCuentaContableDebito",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdFactura",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdFactura",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProductoDefiProdu")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdProductoDefiProdu",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdProductoDefiProdu",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGastoProduEmpresa")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdTipoGastoProduEmpresa(finalQueryGlobal,pagination,id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdTipoGastoProduEmpresa(finalQueryGlobal,pagination,id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdTipoGastoProduEmpresa",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdTipoGastoProduEmpresa",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodugastoLogic.getProductoProduGastosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodugastoLogic.getProductoProduGastos()==null||productoprodugastoLogic.getProductoProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodugastos==null|| productoprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastosAux=new ArrayList<ProductoProduGasto>();
						productoprodugastosAux.addAll(productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastosAux=new ArrayList<ProductoProduGasto>();
							productoprodugastosAux.addAll(productoprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodugastoLogic.getProductoProduGastosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduGastos("FK_IdUnidad",productoprodugastoLogic.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduGastos("FK_IdUnidad",productoprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
						productoprodugastoLogic.getProductoProduGastos().addAll(productoprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastos=new ArrayList<ProductoProduGasto>();
							productoprodugastos.addAll(productoprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProduGasto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProduGasto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodugastoLogic.getProductoProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodugastos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodugastoLogic.getProductoProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodugastos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProduGasto productoprodugasto) {
		Boolean permite=true;
		
		if(this.productoprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProduGastoConstantesFunciones.getOrderByListaProductoProduGasto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProduGastoConstantesFunciones.getOrderByListaProductoProduGasto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduGasto productoprodugasto:productoprodugastoLogic.getProductoProduGastos()) {
				if(productoprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodugastoTotales=productoprodugasto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduGasto productoprodugasto:this.productoprodugastos) {
				if(productoprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodugastoTotales=productoprodugasto;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.productoprodugastoAux=new ProductoProduGasto();
			this.productoprodugastoAux.setsType(Constantes2.S_TOTALES);
			this.productoprodugastoAux.setIsNew(false);
			this.productoprodugastoAux.setIsChanged(false);
			this.productoprodugastoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProduGastoConstantesFunciones.TotalizarValoresFilaProductoProduGasto(this.productoprodugastoLogic.getProductoProduGastos(),this.productoprodugastoAux);
				
				this.productoprodugastoLogic.getProductoProduGastos().add(this.productoprodugastoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProduGastoConstantesFunciones.TotalizarValoresFilaProductoProduGasto(this.productoprodugastos,this.productoprodugastoAux);
				
				this.productoprodugastos.add(this.productoprodugastoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoprodugastoTotales=new ProductoProduGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodugastoLogic.getProductoProduGastos().remove(productoprodugastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodugastos.remove(productoprodugastoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoprodugastoTotales=new ProductoProduGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduGasto productoprodugasto:productoprodugastoLogic.getProductoProduGastos()) {
				if(productoprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodugastoTotales=productoprodugasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduGastoConstantesFunciones.TotalizarValoresFilaProductoProduGasto(this.productoprodugastoLogic.getProductoProduGastos(),productoprodugastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduGasto productoprodugasto:this.productoprodugastos) {
				if(productoprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodugastoTotales=productoprodugasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduGastoConstantesFunciones.TotalizarValoresFilaProductoProduGasto(this.productoprodugastos,productoprodugastoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProduGastosFK_IdClienteProveedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdClienteProveedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdProductoDefiProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoDefiProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdTipoGastoProduEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGastoProduEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduGastosFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProduGastosFK_IdClienteProveedor(String sFinalQuery,Long id_cliente_proveedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdClienteProveedor(sFinalQuery,this.pagination,id_cliente_proveedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdProductoDefiProdu(String sFinalQuery,Long id_producto_defi_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdProductoDefiProdu(sFinalQuery,this.pagination,id_producto_defi_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdTipoGastoProduEmpresa(String sFinalQuery,Long id_tipo_gasto_produ_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdTipoGastoProduEmpresa(sFinalQuery,this.pagination,id_tipo_gasto_produ_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduGastosFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLogic.getProductoProduGastosFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProductoProduGasto() {
		this.isPermisoTodoProductoProduGasto=false;
		this.isPermisoNuevoProductoProduGasto=false;
		this.isPermisoActualizarProductoProduGasto=false;
		this.isPermisoActualizarOriginalProductoProduGasto=false;
		this.isPermisoEliminarProductoProduGasto=false;
		this.isPermisoGuardarCambiosProductoProduGasto=false;
		this.isPermisoConsultaProductoProduGasto=false;
		this.isPermisoBusquedaProductoProduGasto=false;
		this.isPermisoReporteProductoProduGasto=false;		
		this.isPermisoOrdenProductoProduGasto=false;		
		this.isPermisoPaginacionMedioProductoProduGasto=false;		
		this.isPermisoPaginacionAltoProductoProduGasto=false;
		this.isPermisoPaginacionTodoProductoProduGasto=false;
		this.isPermisoCopiarProductoProduGasto=false;		
		this.isPermisoVerFormProductoProduGasto=false;		
		this.isPermisoDuplicarProductoProduGasto=false;		
		this.isPermisoOrdenProductoProduGasto=false;		
	}
	
	public void setPermisosUsuarioProductoProduGasto(Boolean isPermiso) {
		this.isPermisoTodoProductoProduGasto=isPermiso;
		this.isPermisoNuevoProductoProduGasto=isPermiso;
		this.isPermisoActualizarProductoProduGasto=isPermiso;
		this.isPermisoActualizarOriginalProductoProduGasto=isPermiso;
		this.isPermisoEliminarProductoProduGasto=isPermiso;
		this.isPermisoGuardarCambiosProductoProduGasto=isPermiso;
		this.isPermisoConsultaProductoProduGasto=isPermiso;
		this.isPermisoBusquedaProductoProduGasto=isPermiso;
		this.isPermisoReporteProductoProduGasto=isPermiso;
		this.isPermisoOrdenProductoProduGasto=isPermiso;		
		this.isPermisoPaginacionMedioProductoProduGasto=isPermiso;		
		this.isPermisoPaginacionAltoProductoProduGasto=isPermiso;		
		this.isPermisoPaginacionTodoProductoProduGasto=isPermiso;		
		this.isPermisoCopiarProductoProduGasto=isPermiso;		
		this.isPermisoVerFormProductoProduGasto=isPermiso;		
		this.isPermisoDuplicarProductoProduGasto=isPermiso;
		this.isPermisoOrdenProductoProduGasto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProduGasto(Boolean isPermiso) {
		//this.isPermisoTodoProductoProduGasto=isPermiso;
		this.isPermisoNuevoProductoProduGasto=isPermiso;
		this.isPermisoActualizarProductoProduGasto=isPermiso;
		this.isPermisoActualizarOriginalProductoProduGasto=isPermiso;
		this.isPermisoEliminarProductoProduGasto=isPermiso;
		this.isPermisoGuardarCambiosProductoProduGasto=isPermiso;
		//this.isPermisoConsultaProductoProduGasto=isPermiso;
		//this.isPermisoBusquedaProductoProduGasto=isPermiso;
		//this.isPermisoReporteProductoProduGasto=isPermiso;
		//this.isPermisoOrdenProductoProduGasto=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProduGasto=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProduGasto=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProduGasto=isPermiso;		
		//this.isPermisoCopiarProductoProduGasto=isPermiso;		
		//this.isPermisoDuplicarProductoProduGasto=isPermiso;
		//this.isPermisoOrdenProductoProduGasto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduGastoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProduGasto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduGastoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProduGastoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProduGastoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProduGastoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProduGasto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProduGastoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProduGasto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProduGasto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProduGasto=this.isPermisoActualizarProductoProduGasto;
			this.isPermisoEliminarProductoProduGasto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProduGasto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProduGasto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProduGasto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProduGasto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProduGasto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProduGasto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProduGasto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProduGasto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProduGasto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProduGasto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProduGasto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProduGasto.setToolTipText(this.jTableDatosProductoProduGasto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProduGasto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProduGasto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(ProductoProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioProductoProduGasto() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyProductoProduGastoListas()throws Exception {
		try	{						
			
				this.productodefiprodusForeignKey=new ArrayList();
				this.tipogastoproduempresasForeignKey=new ArrayList();
				this.cuentacontabledebitosForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
				this.clienteproveedorsForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProduGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProduGastoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProduGastoListas(false);
			} else {
			
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGastoProduEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteProveedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProductoDefiProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGastoProduEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogastoproduempresasForeignKey==null||this.tipogastoproduempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGastoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGastoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGastoProduEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGastoProduEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGastoProduEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteProveedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clienteproveedorsForeignKey==null||this.clienteproveedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClienteProveedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProductoProduGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProduGastoParameterReturnGeneral productoprodugastoReturnGeneral=new ProductoProduGastoParameterReturnGeneral();
						
			


				String finalQueryGlobalProductoDefiProdu="";

				if(((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_producto_defi_produProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_producto_defi_produProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoDefiProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoDefiProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoDefiProdu, "");
						finalQueryGlobalProductoDefiProdu+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoDefiProdu=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidProductoDefiProduActual();
					}
				} else {
					finalQueryGlobalProductoDefiProdu="NONE";
				}


				String finalQueryGlobalTipoGastoProduEmpresa="";

				if(((this.tipogastoproduempresasForeignKey==null||this.tipogastoproduempresasForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGastoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGastoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGastoProduEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGastoProduEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGastoProduEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGastoProduEmpresa, "");
						finalQueryGlobalTipoGastoProduEmpresa+=TipoGastoProduEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGastoProduEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGastoProduEmpresa=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidTipoGastoProduEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoGastoProduEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}


				String finalQueryGlobalClienteProveedor="";

				if(((this.clienteproveedorsForeignKey==null||this.clienteproveedorsForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalClienteProveedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalClienteProveedor=Funciones.GetFinalQueryAppend(finalQueryGlobalClienteProveedor, "");
						finalQueryGlobalClienteProveedor+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClienteProveedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalClienteProveedor=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidClienteProveedorActual();
					}
				} else {
					finalQueryGlobalClienteProveedor="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_facturaProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_facturaProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoprodugastoConstantesFunciones.cargarid_unidadProductoProduGasto)
					 || (this.esRecargarFks && this.productoprodugastoConstantesFunciones.cargarid_unidadProductoProduGasto)) {

					if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoprodugastoSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoprodugastoReturnGeneral=productoprodugastoLogic.cargarCombosLoteForeignKeyProductoProduGasto(finalQueryGlobalProductoDefiProdu,finalQueryGlobalTipoGastoProduEmpresa,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito,finalQueryGlobalClienteProveedor,finalQueryGlobalFactura,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProductoDefiProdu.equals("NONE")) {
				this.productodefiprodusForeignKey=productoprodugastoReturnGeneral.getproductodefiprodusForeignKey();
			}

			if(!finalQueryGlobalTipoGastoProduEmpresa.equals("NONE")) {
				this.tipogastoproduempresasForeignKey=productoprodugastoReturnGeneral.gettipogastoproduempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=productoprodugastoReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=productoprodugastoReturnGeneral.getcuentacontablecreditosForeignKey();
			}

			if(!finalQueryGlobalClienteProveedor.equals("NONE")) {
				this.clienteproveedorsForeignKey=productoprodugastoReturnGeneral.getclienteproveedorsForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=productoprodugastoReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoprodugastoReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProduGasto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProductoDefiProdu();
			this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContableDebito();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
			this.addItemDefectoCombosForeignKeyClienteProveedor();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			if(this.productoprodugastoSessionBean==null) {
				this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				ProductoDefiProdu productodefiprodu=new ProductoDefiProdu();
				ProductoDefiProduConstantesFunciones.setProductoDefiProduDescripcion(productodefiprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				productodefiprodu.setId(null);

				if(!ProductoDefiProduConstantesFunciones.ExisteEnLista(this.productodefiprodusForeignKey,productodefiprodu,true)) {

					this.productodefiprodusForeignKey.add(0,productodefiprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {
				TipoGastoProduEmpresa tipogastoproduempresa=new TipoGastoProduEmpresa();
				TipoGastoProduEmpresaConstantesFunciones.setTipoGastoProduEmpresaDescripcion(tipogastoproduempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogastoproduempresa.setId(null);

				if(!TipoGastoProduEmpresaConstantesFunciones.ExisteEnLista(this.tipogastoproduempresasForeignKey,tipogastoproduempresa,true)) {

					this.tipogastoproduempresasForeignKey.add(0,tipogastoproduempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDebito()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				CuentaContable cuentacontabledebito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledebito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledebitosForeignKey,cuentacontabledebito,true)) {

					this.cuentacontabledebitosForeignKey.add(0,cuentacontabledebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyClienteProveedor()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {
				Cliente clienteproveedor=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(clienteproveedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				clienteproveedor.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clienteproveedorsForeignKey,clienteproveedor,true)) {

					this.clienteproveedorsForeignKey.add(0,clienteproveedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.productoprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductoProduGasto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProduGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoProduGasto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduGasto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProduGasto(ProductoProduGasto productoprodugasto)throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(productoprodugasto.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoGastoProduEmpresaForeignKey(productoprodugasto.getid_tipo_gasto_produ_empresa(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(productoprodugasto.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(productoprodugasto.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualClienteProveedorForeignKey(productoprodugasto.getid_cliente_proveedor(),false,"Formulario");
			this.setActualFacturaForeignKey(productoprodugasto.getid_factura(),false,"Formulario");
			this.setActualUnidadForeignKey(productoprodugasto.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProduGasto(ProductoProduGasto productoprodugasto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoprodugasto.getClienteProveedor()!=null && !sTipoEvento.equals("id_cliente_proveedorProductoProduGasto")) { //sTipoEvento Evita Bucle Infinito

					this.clienteproveedorsForeignKey=new ArrayList<Cliente>();
					this.clienteproveedorsForeignKey.add(productoprodugasto.getClienteProveedor());

					this.addItemDefectoCombosForeignKeyClienteProveedor();
					this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
				}

				if(productoprodugasto.getFactura()!=null && !sTipoEvento.equals("id_facturaProductoProduGasto")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(productoprodugasto.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProduGasto()throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(this.productoprodugastoConstantesFunciones.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoGastoProduEmpresaForeignKey(this.productoprodugastoConstantesFunciones.getid_tipo_gasto_produ_empresa(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(this.productoprodugastoConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.productoprodugastoConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualClienteProveedorForeignKey(this.productoprodugastoConstantesFunciones.getid_cliente_proveedor(),false,"Formulario");
			this.setActualFacturaForeignKey(this.productoprodugastoConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoprodugastoConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduGasto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProduGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProduGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProduGasto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProduGasto()throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
			this.cargarCombosFrameTipoGastoProduEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
			this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProduGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGastoProduEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClienteProveedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProduGasto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProductoProduGastoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProduGastoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProduGastoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean(); 
		this.productoprodugastoConstantesFunciones=new ProductoProduGastoConstantesFunciones(); 
		this.productoprodugastoBean=new ProductoProduGasto();//(this.productoprodugastoConstantesFunciones); 		
		this.productoprodugastoReturnGeneral=new ProductoProduGastoParameterReturnGeneral(); 
		
		this.productoprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProduGasto(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.productoprodugastoConstantesFunciones=new ProductoProduGastoConstantesFunciones(); 
			this.productoprodugastoBean=new ProductoProduGasto();//this.productoprodugastoConstantesFunciones); 			
			this.productoprodugastoReturnGeneral=new ProductoProduGastoParameterReturnGeneral(); 
		
			ProductoProduGastoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Gasto Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoprodugasto=new ProductoProduGasto();
			this.productoprodugastos = new ArrayList<ProductoProduGasto>();
			this.productoprodugastosAux = new ArrayList<ProductoProduGasto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic=new ProductoProduGastoLogic();
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			//this.productoprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProduGasto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduGasto);	
					}
					
					if(this.jInternalFrameImportacionProductoProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduGasto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProduGasto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduGasto);
				this.jInternalFrameDetalleFormProductoProduGasto.setVisible(false);
				this.jInternalFrameDetalleFormProductoProduGasto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduGasto);
					this.jInternalFrameReporteDinamicoProductoProduGasto.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProduGasto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduGasto);
					this.jInternalFrameImportacionProductoProduGasto.setVisible(false);
					this.jInternalFrameImportacionProductoProduGasto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduGasto);
					this.jInternalFrameOrderByProductoProduGasto.setVisible(false);
					this.jInternalFrameOrderByProductoProduGasto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProduGastoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProduGastoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.productoprodugastoReturnGeneral=new ProductoProduGastoParameterReturnGeneral();
			
			this.productoprodugastoParameterGeneral=new ProductoProduGastoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoprodugastoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(ProductoProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),this.productoprodugastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),this.productoprodugastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaDuplicarProductoProduGasto=true;
			this.isVisibilidadCeldaCopiarProductoProduGasto=true;
			this.isVisibilidadCeldaVerFormProductoProduGasto=true;
			this.isVisibilidadCeldaOrdenProductoProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			
			
			this.isVisibilidadFK_IdClienteProveedor=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdProductoDefiProdu=true;
			this.isVisibilidadFK_IdTipoGastoProduEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProduGasto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProduGasto(false);
			
			this.setPermisosUsuarioProductoProduGasto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado() 
				|| (this.productoprodugastoSessionBean.getEsGuardarRelacionado() && this.productoprodugastoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProduGastoClasesRelacionadas();
			}
			
			if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProduGastoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProduGasto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProduGasto();
			}
			
			if(!this.isPermisoBusquedaProductoProduGasto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProduGasto,this.isPermisoPaginacionMedioProductoProduGasto,this.isPermisoPaginacionTodoProductoProduGasto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProduGastoConstantesFunciones.getTiposSeleccionarProductoProduGasto());
				
				this.tiposColumnasSelect=ProductoProduGastoConstantesFunciones.getTiposSeleccionarProductoProduGasto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProduGasto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProduGasto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProduGasto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduGasto() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.productodefiproduLogic=new ProductoDefiProduLogic();
			this.tipogastoproduempresaLogic=new TipoGastoProduEmpresaLogic();
			this.cuentacontabledebitoLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			this.clienteproveedorLogic=new ClienteLogic();
			this.facturaLogic=new FacturaLogic();
			this.unidadLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productoprodugastoImplementable= (ProductoProduGastoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoprodugastoImplementableHome= (ProductoProduGastoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoprodugastos= new ArrayList<ProductoProduGasto>();
			this.productoprodugastosEliminados= new ArrayList<ProductoProduGasto>();
						
			this.isEsNuevoProductoProduGasto=false;
			this.esParaAccionDesdeFormularioProductoProduGasto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteProveedorActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>() ;
			this.tipogastoproduempresasForeignKey=new ArrayList<TipoGastoProduEmpresa>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			this.clienteproveedorsForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProduGasto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProduGasto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProduGastoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProduGastoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProduGasto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProduGasto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProduGasto();
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProduGasto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProduGasto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProduGasto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProduGasto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProduGasto")) {
				iIndex=this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProduGasto();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyProductoProduGasto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProduGasto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProduGasto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProduGastoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProduGasto();
		
		this.cargarCombosFrameForeignKeyProductoProduGasto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProduGasto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProduGasto();
		}
	}
	
	

	public void cargarCombosForeignKeyProductoDefiProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoDefiProdu(this.productodefiprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGastoProduEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGastoProduEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
				this.cargarCombosFrameTipoGastoProduEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGastoProduEmpresa(this.tipogastoproduempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteProveedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteProveedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyClienteProveedor();
				this.cargarCombosFrameClienteProveedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaClienteProveedor(this.clienteproveedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoProduGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			
			if(jTableDatosProductoProduGasto.getRowCount()>=1) {
				jTableDatosProductoProduGasto.removeRowSelectionInterval(0, jTableDatosProductoProduGasto.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProduGasto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProduGasto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProduGasto(true);			
			//this.productoprodugasto=new ProductoProduGasto();
			//this.productoprodugasto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduGasto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduGasto() ;
			
			if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduGasto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoprodugasto);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);				
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProduGasto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProduGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProduGasto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProduGasto.getSelectedRows().length;			
			}
			
			productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProduGasto--;			
				//ProductoProduGasto productoprodugastoAux= new ProductoProduGasto();			
				//productoprodugastoAux.setId(this.iIdNuevoProductoProduGasto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProduGasto productoprodugastoOrigen=new ProductoProduGasto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProduGasto productoprodugastoOrigen : productoprodugastosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoprodugastoOrigen =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodugastoOrigen =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProduGasto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoprodugasto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProduGasto(productoprodugastoOrigen,this.productoprodugasto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodugastoLogic.getProductoProduGastos().add(this.productoprodugastoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodugastos.add(this.productoprodugastoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
				
				this.jTableDatosProductoProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoProduGasto(), this.getIndiceNuevoProductoProduGasto());
				
				int iLastRow =  this.jTableDatosProductoProduGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduGasto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();									
		
			ProductoProduGasto productoprodugastoOrigen=new ProductoProduGasto();
			ProductoProduGasto productoprodugastoDestino=new ProductoProduGasto();
				
			productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProduGasto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoprodugastosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProduGasto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoOrigen =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodugastoOrigen =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodugastoDestino =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodugastoDestino =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoprodugastoOrigen =productoprodugastosSeleccionados.get(0);
				productoprodugastoDestino =productoprodugastosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProduGasto(productoprodugastoOrigen,productoprodugastoDestino,true,false);
				
				productoprodugastoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodugastoDestino,productoprodugastoLogic.getProductoProduGastos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodugastoDestino,productoprodugastos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
				
				//this.jTableDatosProductoProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoProduGasto(), this.getIndiceNuevoProductoProduGasto());
				
				int iLastRow =  this.jTableDatosProductoProduGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduGasto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProduGasto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProduGasto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProduGasto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProduGasto.setVisible(!isVisible);
			this.jPanelPaginacionProductoProduGasto.setVisible(!isVisible);
			this.jPanelAccionesProductoProduGasto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProduGasto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProduGasto();
			
			this.abrirFrameOrderByProductoProduGasto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProduGasto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduGasto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProduGasto.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProduGasto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProduGasto.setSize(this.jInternalFrameDetalleFormProductoProduGasto.iWidthFormulario,this.jInternalFrameDetalleFormProductoProduGasto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProduGasto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProduGasto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProduGasto.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProduGasto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProduGasto.jContentPaneDetalleProductoProduGasto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduGasto.jContentPaneDetalleProductoProduGasto.getWidth(),ProductoProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduGasto.jContentPaneDetalleProductoProduGasto.getWidth(),ProductoProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProduGasto.jContentPaneDetalleProductoProduGasto.getWidth(),ProductoProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProduGasto.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProduGasto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProduGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProduGasto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduGasto,false,this);
				} else {
					this.jInternalFrameOrderByProductoProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduGasto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduGasto);
				this.jInternalFrameOrderByProductoProduGasto.setVisible(false);
				this.jInternalFrameOrderByProductoProduGasto.setSelected(false);
				
				this.jInternalFrameOrderByProductoProduGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduGasto"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProduGasto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProduGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProduGasto==null) {
				
				this.jInternalFrameImportacionProductoProduGasto=new ImportacionJInternalFrame(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduGasto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduGasto);
				this.jInternalFrameImportacionProductoProduGasto.setVisible(false);
				this.jInternalFrameImportacionProductoProduGasto.setSelected(false);


				this.jInternalFrameImportacionProductoProduGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduGasto"));
				this.jInternalFrameImportacionProductoProduGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduGasto"));
				this.jInternalFrameImportacionProductoProduGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduGasto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProduGasto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProduGasto==null) {
				this.jInternalFrameReporteDinamicoProductoProduGasto=new ReporteDinamicoJInternalFrame(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduGasto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduGasto);
				this.jInternalFrameReporteDinamicoProductoProduGasto.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProduGasto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduGasto"));
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduGasto"));
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduGasto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduGasto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProduGasto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduGasto);
			
	       	this.jInternalFrameDetalleFormProductoProduGasto.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProduGasto.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProduGasto.dispose();
			//this.jInternalFrameDetalleFormProductoProduGasto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProduGasto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProduGasto.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProduGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProduGasto.setVisible(true);
	        this.jInternalFrameImportacionProductoProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProduGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProduGasto.setVisible(true);
	        this.jInternalFrameOrderByProductoProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProduGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProduGasto.setVisible(false);
	        this.jInternalFrameOrderByProductoProduGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProduGasto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProduGasto.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProduGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProduGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProduGasto.setVisible(false);
	        this.jInternalFrameImportacionProductoProduGasto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableDebito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDebito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDebito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProduGasto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProduGasto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProduGasto(true);
			//this.isEsNuevoProductoProduGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduGasto(false) ;
			
			if(productoprodugastoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduGasto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProduGastoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProduGasto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProduGasto(true);
			//this.isEsNuevoProductoProduGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoprodugasto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProduGasto(false) ;
			
			if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduGasto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("ClienteProveedor")) {
				if(!this.productoprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoProduGasto) {
					this.cargarCombosClienteProveedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoProduGasto(false,false);
					this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente_proveedor (id);

				this.recargarComboTablaClienteProveedor(this.clienteproveedorsForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.productoprodugastoConstantesFunciones.cargarid_facturaProductoProduGasto) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoProduGasto(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusForeignKey)throws Exception{
		TableColumn tableColumnProductoDefiProdu=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));
		TableCellEditor tableCellEditorProductoDefiProdu =tableColumnProductoDefiProdu.getCellEditor();

		ProductoDefiProduTableCell productodefiproduTableCellFk=(ProductoDefiProduTableCell)tableCellEditorProductoDefiProdu;

		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.setproductodefiprodusForeignKey(productodefiprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productodefiproduTableCellFk.setRowActual(intSelectedRow);
			//productodefiproduTableCellFk.setproductodefiprodusForeignKeyActual(productodefiprodusForeignKey);
		//}


		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.RecargarProductoDefiProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGastoProduEmpresa(List<TipoGastoProduEmpresa> tipogastoproduempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoGastoProduEmpresa=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA));
		TableCellEditor tableCellEditorTipoGastoProduEmpresa =tableColumnTipoGastoProduEmpresa.getCellEditor();

		TipoGastoProduEmpresaTableCell tipogastoproduempresaTableCellFk=(TipoGastoProduEmpresaTableCell)tableCellEditorTipoGastoProduEmpresa;

		if(tipogastoproduempresaTableCellFk!=null) {
			tipogastoproduempresaTableCellFk.settipogastoproduempresasForeignKey(tipogastoproduempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogastoproduempresaTableCellFk.setRowActual(intSelectedRow);
			//tipogastoproduempresaTableCellFk.settipogastoproduempresasForeignKeyActual(tipogastoproduempresasForeignKey);
		//}


		if(tipogastoproduempresaTableCellFk!=null) {
			tipogastoproduempresaTableCellFk.RecargarTipoGastoProduEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDebito(List<CuentaContable> cuentacontabledebitosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledebitosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaClienteProveedor(List<Cliente> clienteproveedorsForeignKey)throws Exception{
		TableColumn tableColumnClienteProveedor=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR));
		TableCellEditor tableCellEditorClienteProveedor =tableColumnClienteProveedor.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorClienteProveedor;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clienteproveedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clienteproveedorsForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente_proveedor (Long id) throws Exception {
		this.setActualClienteProveedorForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProduGasto(false);
			
			//if(!this.isEsNuevoProductoProduGasto) {								
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				
			}
			
			if(this.permiteMantenimiento(this.productoprodugasto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProduGasto=true;
					this.inicializarActualizarBindingTablaProductoProduGasto(false);
					this.isEsNuevoProductoProduGasto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProduGasto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProduGasto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduGasto(false);
				
				this.habilitarDeshabilitarControlesProductoProduGasto(false);
			
												
				
				if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProduGasto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProduGastoActionPerformed(evt,productoprodugastoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProduGasto(this.productoprodugasto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoprodugastoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoprodugasto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				this.productoprodugasto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				this.productoprodugasto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoprodugasto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProduGastoModel) this.jTableDatosProductoProduGasto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProduGasto=true;
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
				this.isEsNuevoProductoProduGasto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduGasto(false);
				
				this.habilitarDeshabilitarControlesProductoProduGasto(false);
				
				
				
				if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProduGasto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProduGasto.getRowCount()>=1) {
				jTableDatosProductoProduGasto.removeRowSelectionInterval(0, jTableDatosProductoProduGasto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProduGasto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProduGasto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduGasto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduGasto(false) ;
			
			this.isEsNuevoProductoProduGasto=false;
			
			if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProduGasto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProduGasto(false);
				
				//SI ES MANUAL
				if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProduGasto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProduGasto--;			
			//ProductoProduGasto productoprodugastoAux= new ProductoProduGasto();			
			//productoprodugastoAux.setId(this.iIdNuevoProductoProduGasto);
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProduGasto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
			
			this.productoprodugasto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoprodugastoLogic.getProductoProduGastos().add(this.productoprodugastoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoprodugastos.add(this.productoprodugastoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProduGasto(false);
			
			this.jTableDatosProductoProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoProduGasto(), this.getIndiceNuevoProductoProduGasto());
			
			int iLastRow =  this.jTableDatosProductoProduGasto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProduGasto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProduGasto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduGasto();
			}
			
			//this.abrirFrameTreeProductoProduGasto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Gasto ProduccionES ?", "MANTENIMIENTO DE Producto Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProduGasto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProduGasto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoprodugastoReturnGeneral=productoprodugastoLogic.procesarImportacionProductoProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoprodugastoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProduGastoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProduGasto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProduGasto.setFileImportacion(this.jInternalFrameImportacionProductoProduGasto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProduGasto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProduGasto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProduGasto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProduGasto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		

		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProduGastoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProduGastoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoDefiProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoDefiProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoDefiProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoDefiProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGastoProduEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGastoProduEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGastoProduEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGastoProduEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ClienteProveedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ClienteProveedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ClienteProveedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ClienteProveedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoria="id_producto_defi_produ";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					sNombreCampoCategoria="id_tipo_gasto_produ_empresa";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					sNombreCampoCategoria="id_cliente_proveedor";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="canitdad";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoriaValor="id_producto_defi_produ";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_gasto_produ_empresa";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					sNombreCampoCategoriaValor="id_cliente_proveedor";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="canitdad";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Defi Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_defi_produ");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Gasto Produ Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_gasto_produ_empresa");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente Proveedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente_proveedor");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"canitdad");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("ProductoProduGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getproductodefiprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.gettipogastoproduempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getclienteproveedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getcanitdad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoProduGasto productoprodugasto:productoprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodugasto.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelProductoProduGasto(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProduGasto(productoprodugastoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduGasto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduGasto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduGasto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProduGasto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProduGasto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProduGasto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProduGasto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProduGasto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProduGasto.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProduGasto.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProduGasto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProduGasto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProduGasto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProduGasto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProduGasto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProduGasto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProduGasto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduGasto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProduGasto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProduGasto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProduGasto();
		
		this.inicializarActualizarBindingBotonesManualProductoProduGasto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduGasto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduGasto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduGasto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduGasto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProduGasto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProduGasto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProduGasto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionNuevoProductoProduGasto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionSinCerrarProductoProduGasto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionSinMensajeProductoProduGasto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProduGasto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProduGasto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProduGasto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
				this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionNuevoProductoProduGasto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionSinCerrarProductoProduGasto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProduGasto.jCheckBoxPostAccionSinMensajeProductoProduGasto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProduGasto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProduGasto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProduGasto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProduGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProduGasto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProduGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProduGasto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProduGasto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProduGasto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProduGasto(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduGasto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduGasto() throws Exception {
		try	{
			if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduGasto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduGasto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduGasto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProduGasto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProduGasto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProduGasto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProduGasto.addItem(reporte);
			}
			
			
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProduGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProduGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProduGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProduGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProduGasto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProduGasto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduGasto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduGasto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProduGastoConstantesFunciones.getTiposSeleccionarProductoProduGasto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProduGastoConstantesFunciones.getTiposSeleccionarProductoProduGasto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProduGastoConstantesFunciones.getTiposSeleccionarProductoProduGasto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProduGasto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProduGasto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.getSelectedItem()!=null){this.id_cliente_proveedorFK_IdClienteProveedor=((Cliente)this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.getSelectedItem()!=null){this.id_cuenta_contable_debitoFK_IdCuentaContableDebito=((CuentaContable)this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.getSelectedItem()!=null){this.id_producto_defi_produFK_IdProductoDefiProdu=((ProductoDefiProdu)this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.getSelectedItem()!=null){this.id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa=((TipoGastoProduEmpresa)this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoProduGasto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProduGasto(Boolean esInicializar) throws Exception {				
		if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduGasto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProduGasto() throws Exception {
		this.inicializarActualizarBindingTablaProductoProduGasto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProduGasto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProduGastoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGastoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProduGasto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoprodugastoLogic.getProductoProduGastos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoprodugastos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProduGasto.setModel(new ProductoProduGastoModel(this.productoprodugastoLogic.getProductoProduGastos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProduGasto.setModel(new ProductoProduGastoModel(this.productoprodugastos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProduGasto!=null && this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProduGasto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,productoprodugastoConstantesFunciones.resaltarSeleccionarProductoProduGasto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,productoprodugastoConstantesFunciones.resaltarSeleccionarProductoProduGasto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_ID));

		if(this.productoprodugastoConstantesFunciones.mostraridProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodugastoConstantesFunciones.resaltaridProductoProduGasto,this.productoprodugastoConstantesFunciones.activaridProductoProduGasto,iSizeTabla,this,true,"idProductoProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodugastoConstantesFunciones.resaltaridProductoProduGasto,this.productoprodugastoConstantesFunciones.activaridProductoProduGasto,this,true,"idProductoProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));

		if(this.productoprodugastoConstantesFunciones.mostrarid_producto_defi_produProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_producto_defi_produProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_producto_defi_produProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_producto_defi_produProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_producto_defi_produProductoProduGasto,true,"id_producto_defi_produProductoProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA));

		if(this.productoprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGastoProduEmpresaTableCell(this.tipogastoproduempresasForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new TipoGastoProduEmpresaTableCell(this.tipogastoproduempresasForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoProduGasto,true,"id_tipo_gasto_produ_empresaProductoProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoProduGasto,true,"id_cuenta_contable_debitoProductoProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoProduGasto,true,"id_cuenta_contable_creditoProductoProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR));

		if(this.productoprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clienteproveedorsForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cliente_proveedorProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clienteproveedorsForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_cliente_proveedorProductoProduGasto,true,"id_cliente_proveedorProductoProduGasto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA));

		if(this.productoprodugastoConstantesFunciones.mostrarid_facturaProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_facturaProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_facturaProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_facturaProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_facturaProductoProduGasto,true,"id_facturaProductoProduGasto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoprodugastoConstantesFunciones.mostrarid_unidadProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_unidadProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_unidadProductoProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoprodugastoConstantesFunciones.resaltarid_unidadProductoProduGasto,this,this.productoprodugastoConstantesFunciones.activarid_unidadProductoProduGasto,true,"id_unidadProductoProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoprodugastoConstantesFunciones.mostrarcanitdadProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodugastoConstantesFunciones.resaltarcanitdadProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcanitdadProductoProduGasto,iSizeTabla,this,true,"canitdadProductoProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodugastoConstantesFunciones.resaltarcanitdadProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcanitdadProductoProduGasto,this,true,"canitdadProductoProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_COSTO));

		if(this.productoprodugastoConstantesFunciones.mostrarcostoProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodugastoConstantesFunciones.resaltarcostoProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcostoProductoProduGasto,iSizeTabla,this,true,"costoProductoProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodugastoConstantesFunciones.resaltarcostoProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcostoProductoProduGasto,this,true,"costoProductoProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoprodugastoConstantesFunciones.mostrarcosto_totalProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodugastoConstantesFunciones.resaltarcosto_totalProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcosto_totalProductoProduGasto,iSizeTabla,this,true,"costo_totalProductoProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodugastoConstantesFunciones.resaltarcosto_totalProductoProduGasto,this.productoprodugastoConstantesFunciones.activarcosto_totalProductoProduGasto,this,true,"costo_totalProductoProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoprodugastoConstantesFunciones.mostrardescripcionProductoProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoprodugastoConstantesFunciones.resaltardescripcionProductoProduGasto,this.productoprodugastoConstantesFunciones.activardescripcionProductoProduGasto,iSizeTabla,this,true,"descripcionProductoProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodugastoConstantesFunciones.resaltardescripcionProductoProduGasto,this.productoprodugastoConstantesFunciones.activardescripcionProductoProduGasto,this,true,"descripcionProductoProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduGasto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduGasto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProduGasto.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosProductoProduGasto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProduGasto.moveColumn(this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProduGasto.moveColumn(this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProduGasto.moveColumn(this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProduGasto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProduGasto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProduGasto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProduGasto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProduGasto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProduGasto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProduGasto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=productoprodugastoLogic.getProductoProduGastos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoprodugastos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosProductoProduGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProduGasto();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoProductoProduGasto=false;
					
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
				if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProduGasto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoprodugasto.getsType().equals("DUPLICADO")
				   || this.productoprodugasto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProduGasto=true;
				
				} else {
					this.isEsNuevoProductoProduGasto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					if(this.productoprodugasto.getId()>=0 && !this.productoprodugasto.getIsNew()) {						
						this.isEsNuevoProductoProduGasto=false;
						
					} else {
						this.isEsNuevoProductoProduGasto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProduGasto(esRelaciones);						
				
				this.seleccionarProductoProduGasto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoprodugasto.getId()<0) {
					this.isEsNuevoProductoProduGasto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProduGasto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProduGasto(evt,rowIndex);
				}	
				
				if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProduGasto: " + this.dDif); 
					}
				}								
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProduGasto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoprodugasto)) {
					if(this.productoprodugasto.getId()>0) {
						this.productoprodugasto.setIsDeleted(true);
						
						this.productoprodugastosEliminados.add(this.productoprodugasto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodugastoLogic.getProductoProduGastos().remove(this.productoprodugasto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodugastos.remove(this.productoprodugasto);				
					}
					
					
					((ProductoProduGastoModel) this.jTableDatosProductoProduGasto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduGasto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProduGasto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProduGasto) {
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduGasto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProduGasto(this.productoprodugasto);
				}
				
				//ARCHITECTURE
				try {
					

					//ProductoDefiProdu
					if(!this.productoprodugastoConstantesFunciones.cargarid_producto_defi_produProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_producto_defi_produProductoProduGasto) {
						//this.cargarCombosProductoDefiProdusForeignKeyLista(" where id="+this.productoprodugasto.getid_producto_defi_produ());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

						if(productoprodugasto.getProductoDefiProdu()!=null) {
							this.productodefiprodusForeignKey.add(productoprodugasto.getProductoDefiProdu());
						}

						this.addItemDefectoCombosForeignKeyProductoDefiProdu();
						this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
					}
					this.setActualProductoDefiProduForeignKey(this.productoprodugasto.getid_producto_defi_produ(),false,"Formulario");

					//TipoGastoProduEmpresa
					if(!this.productoprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_tipo_gasto_produ_empresaProductoProduGasto) {
						//this.cargarCombosTipoGastoProduEmpresasForeignKeyLista(" where id="+this.productoprodugasto.getid_tipo_gasto_produ_empresa());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.tipogastoproduempresasForeignKey=new ArrayList<TipoGastoProduEmpresa>();

						if(productoprodugasto.getTipoGastoProduEmpresa()!=null) {
							this.tipogastoproduempresasForeignKey.add(productoprodugasto.getTipoGastoProduEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
						this.cargarCombosFrameTipoGastoProduEmpresasForeignKey("Todos");
					}
					this.setActualTipoGastoProduEmpresaForeignKey(this.productoprodugasto.getid_tipo_gasto_produ_empresa(),false,"Formulario");

					//CuentaContableDebito
					if(!this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_cuenta_contable_debitoProductoProduGasto) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.productoprodugasto.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(productoprodugasto.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(productoprodugasto.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.productoprodugasto.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.productoprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_cuenta_contable_creditoProductoProduGasto) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.productoprodugasto.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(productoprodugasto.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(productoprodugasto.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.productoprodugasto.getid_cuenta_contable_credito(),false,"Formulario");

					//ClienteProveedor
					if(!this.productoprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_cliente_proveedorProductoProduGasto) {
						//this.cargarCombosClienteProveedorsForeignKeyLista(" where id="+this.productoprodugasto.getid_cliente_proveedor());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.clienteproveedorsForeignKey=new ArrayList<Cliente>();

						if(productoprodugasto.getClienteProveedor()!=null) {
							this.clienteproveedorsForeignKey.add(productoprodugasto.getClienteProveedor());
						}

						this.addItemDefectoCombosForeignKeyClienteProveedor();
						this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
					}
					this.setActualClienteProveedorForeignKey(this.productoprodugasto.getid_cliente_proveedor(),false,"Formulario");

					//Factura
					if(!this.productoprodugastoConstantesFunciones.cargarid_facturaProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_facturaProductoProduGasto) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.productoprodugasto.getid_factura());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(productoprodugasto.getFactura()!=null) {
							this.facturasForeignKey.add(productoprodugasto.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.productoprodugasto.getid_factura(),false,"Formulario");

					//Unidad
					if(!this.productoprodugastoConstantesFunciones.cargarid_unidadProductoProduGasto || this.productoprodugastoConstantesFunciones.event_dependid_unidadProductoProduGasto) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoprodugasto.getid_unidad());
									//this.inicializarActualizarBindingProductoProduGasto(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoprodugasto.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoprodugasto.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoprodugasto.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProduGasto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProduGasto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduGasto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduGasto(ProductoProduGasto productoprodugasto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProduGasto(productoprodugasto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduGasto(ProductoProduGasto productoprodugasto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProduGasto(productoprodugasto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProduGasto(productoprodugasto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProduGasto(productoprodugasto);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProduGasto(ProductoProduGasto productoprodugasto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setText(productoprodugasto.getId().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setText(productoprodugasto.getcanitdad().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setText(productoprodugasto.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setText(productoprodugasto.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setText(productoprodugasto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProduGasto productoprodugastoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoprodugastoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProduGasto productoprodugastoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoprodugastoLocal=this.productoprodugasto;
			} else {
				productoprodugastoLocal=this.productoprodugastoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoprodugastoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProduGasto(productoprodugastoLocal,true);
					
					if(productoprodugastoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoprodugastoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoprodugastoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProduGasto(ProductoProduGasto productoprodugasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduGasto(productoprodugasto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(productoprodugasto);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduGasto(ProductoProduGasto productoprodugasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduGasto(productoprodugasto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduGasto(ProductoProduGasto productoprodugasto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.getText()==null || this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.getText()=="" || this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setText("0");
			}

			if(conColumnasBase) {productoprodugasto.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduGastoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelIdProductoProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodugasto.setcanitdad(Integer.parseInt(this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcanitdadProductoProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodugasto.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduGastoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcostoProductoProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodugasto.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabelcosto_totalProductoProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodugasto.setdescripcion(this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduGasto.jLabeldescripcionProductoProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduGasto(ProductoProduGasto productoprodugastoBean,ProductoProduGasto productoprodugasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoprodugastoBean.getid_producto_defi_produ()!=null && !productoprodugastoBean.getid_producto_defi_produ().equals(-1L))) {productoprodugasto.setid_producto_defi_produ(productoprodugastoBean.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_tipo_gasto_produ_empresa()!=null && !productoprodugastoBean.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoprodugasto.setid_tipo_gasto_produ_empresa(productoprodugastoBean.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_cuenta_contable_debito()!=null && !productoprodugastoBean.getid_cuenta_contable_debito().equals(-1L))) {productoprodugasto.setid_cuenta_contable_debito(productoprodugastoBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_cuenta_contable_credito()!=null && !productoprodugastoBean.getid_cuenta_contable_credito().equals(-1L))) {productoprodugasto.setid_cuenta_contable_credito(productoprodugastoBean.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_cliente_proveedor()!=null && !productoprodugastoBean.getid_cliente_proveedor().equals(-1L))) {productoprodugasto.setid_cliente_proveedor(productoprodugastoBean.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_factura()!=null && !productoprodugastoBean.getid_factura().equals(-1L))) {productoprodugasto.setid_factura(productoprodugastoBean.getid_factura());}
			if(conDefault || (!conDefault && productoprodugastoBean.getid_unidad()!=null && !productoprodugastoBean.getid_unidad().equals(-1L))) {productoprodugasto.setid_unidad(productoprodugastoBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProduGasto(ProductoProduGasto productoprodugastoOrigen,ProductoProduGasto productoprodugasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodugastoOrigen.getId()!=null && !productoprodugastoOrigen.getId().equals(0L))) {productoprodugasto.setId(productoprodugastoOrigen.getId());}}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_producto_defi_produ()!=null && !productoprodugastoOrigen.getid_producto_defi_produ().equals(-1L))) {productoprodugasto.setid_producto_defi_produ(productoprodugastoOrigen.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_tipo_gasto_produ_empresa()!=null && !productoprodugastoOrigen.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoprodugasto.setid_tipo_gasto_produ_empresa(productoprodugastoOrigen.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_cuenta_contable_debito()!=null && !productoprodugastoOrigen.getid_cuenta_contable_debito().equals(-1L))) {productoprodugasto.setid_cuenta_contable_debito(productoprodugastoOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_cuenta_contable_credito()!=null && !productoprodugastoOrigen.getid_cuenta_contable_credito().equals(-1L))) {productoprodugasto.setid_cuenta_contable_credito(productoprodugastoOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_cliente_proveedor()!=null && !productoprodugastoOrigen.getid_cliente_proveedor().equals(-1L))) {productoprodugasto.setid_cliente_proveedor(productoprodugastoOrigen.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_factura()!=null && !productoprodugastoOrigen.getid_factura().equals(-1L))) {productoprodugasto.setid_factura(productoprodugastoOrigen.getid_factura());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getid_unidad()!=null && !productoprodugastoOrigen.getid_unidad().equals(-1L))) {productoprodugasto.setid_unidad(productoprodugastoOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getcanitdad()!=null && !productoprodugastoOrigen.getcanitdad().equals(0))) {productoprodugasto.setcanitdad(productoprodugastoOrigen.getcanitdad());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getcosto()!=null && !productoprodugastoOrigen.getcosto().equals(0.0))) {productoprodugasto.setcosto(productoprodugastoOrigen.getcosto());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getcosto_total()!=null && !productoprodugastoOrigen.getcosto_total().equals(0.0))) {productoprodugasto.setcosto_total(productoprodugastoOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoprodugastoOrigen.getdescripcion()!=null && !productoprodugastoOrigen.getdescripcion().equals(""))) {productoprodugasto.setdescripcion(productoprodugastoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduGasto(ProductoProduGasto productoprodugasto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setText(productoprodugasto.getId().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setText(productoprodugasto.getcanitdad().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setText(productoprodugasto.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setText(productoprodugasto.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setText(productoprodugasto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduGasto(ProductoProduGastoBean productoprodugastoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setText(productoprodugastoBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setText(productoprodugastoBean.getcanitdad().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setText(productoprodugastoBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setText(productoprodugastoBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setText(productoprodugastoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProduGasto(ProductoProduGastoParameterReturnGeneral productoprodugastoReturnGeneral,ProductoProduGastoBean productoprodugastoBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProduGasto productoprodugastoLocal=new ProductoProduGasto();
			
			productoprodugastoLocal=productoprodugastoReturnGeneral.getProductoProduGasto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodugastoLocal.getId()!=null && !productoprodugastoLocal.getId().equals(0L))) {productoprodugastoBean.setId(productoprodugastoLocal.getId());}}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_producto_defi_produ()!=null && !productoprodugastoLocal.getid_producto_defi_produ().equals(-1L))) {productoprodugastoBean.setid_producto_defi_produ(productoprodugastoLocal.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_tipo_gasto_produ_empresa()!=null && !productoprodugastoLocal.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoprodugastoBean.setid_tipo_gasto_produ_empresa(productoprodugastoLocal.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_cuenta_contable_debito()!=null && !productoprodugastoLocal.getid_cuenta_contable_debito().equals(-1L))) {productoprodugastoBean.setid_cuenta_contable_debito(productoprodugastoLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_cuenta_contable_credito()!=null && !productoprodugastoLocal.getid_cuenta_contable_credito().equals(-1L))) {productoprodugastoBean.setid_cuenta_contable_credito(productoprodugastoLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_cliente_proveedor()!=null && !productoprodugastoLocal.getid_cliente_proveedor().equals(-1L))) {productoprodugastoBean.setid_cliente_proveedor(productoprodugastoLocal.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_factura()!=null && !productoprodugastoLocal.getid_factura().equals(-1L))) {productoprodugastoBean.setid_factura(productoprodugastoLocal.getid_factura());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getid_unidad()!=null && !productoprodugastoLocal.getid_unidad().equals(-1L))) {productoprodugastoBean.setid_unidad(productoprodugastoLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getcanitdad()!=null && !productoprodugastoLocal.getcanitdad().equals(0))) {productoprodugastoBean.setcanitdad(productoprodugastoLocal.getcanitdad());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getcosto()!=null && !productoprodugastoLocal.getcosto().equals(0.0))) {productoprodugastoBean.setcosto(productoprodugastoLocal.getcosto());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getcosto_total()!=null && !productoprodugastoLocal.getcosto_total().equals(0.0))) {productoprodugastoBean.setcosto_total(productoprodugastoLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoprodugastoLocal.getdescripcion()!=null && !productoprodugastoLocal.getdescripcion().equals(""))) {productoprodugastoBean.setdescripcion(productoprodugastoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProduGastoGenerico(Long idProductoProduGastoSeleccionado,JComboBox jComboBoxProductoProduGasto,List<ProductoProduGasto> productoprodugastosLocal)throws Exception {
		try {
			ProductoProduGasto  productoprodugastoTemp=null;

			for(ProductoProduGasto productoprodugastoAux:productoprodugastosLocal) {
				if(productoprodugastoAux.getId()!=null && productoprodugastoAux.getId().equals(idProductoProduGastoSeleccionado)) {
					productoprodugastoTemp=productoprodugastoAux;
					break;
				}
			}

			jComboBoxProductoProduGasto.setSelectedItem(productoprodugastoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProduGastoGenerico(JComboBox jComboBoxProductoProduGasto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduGasto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProduGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduGasto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProduGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodugasto=(ProductoProduGasto) productoprodugastoLogic.getProductoProduGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodugasto =(ProductoProduGasto) productoprodugastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ProductoDefiProdu")) {
			//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getproductodefiprodu_descripcion();
			} else {
				//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getproductodefiprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoGastoProduEmpresa")) {
			//sDescripcion=this.getActualTipoGastoProduEmpresaForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.gettipogastoproduempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGastoProduEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.gettipogastoproduempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getcuentacontablecredito_descripcion();
			}
		}

		if(sTipo.equals("ClienteProveedor")) {
			//sDescripcion=this.getActualClienteProveedorForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getclienteproveedor_descripcion();
			} else {
				//sDescripcion=this.getActualClienteProveedorForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getclienteproveedor_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoprodugasto.getIsNew() && !productoprodugasto.getIsChanged() && !productoprodugasto.getIsDeleted()) {
				sDescripcion=productoprodugasto.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodugasto.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProduGasto productoprodugastoRow=new ProductoProduGasto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodugastoRow=(ProductoProduGasto) productoprodugastoLogic.getProductoProduGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodugastoRow=(ProductoProduGasto) productoprodugastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProduGasto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto));			
			this.jButtonDuplicarProductoProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoProduGasto && this.isPermisoDuplicarProductoProduGasto));			
			this.jButtonCopiarProductoProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoProduGasto && this.isPermisoCopiarProductoProduGasto));
			this.jButtonVerFormProductoProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoProduGasto && this.isPermisoVerFormProductoProduGasto));
			
			this.jButtonAbrirOrderByProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));			
			
			this.jButtonNuevoRelacionesProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto && this.isPermisoNuevoProductoProduGasto));			
			this.jButtonNuevoGuardarCambiosProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarProductoProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoProduGasto && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoProduGasto && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoProduGasto && this.isPermisoEliminarProductoProduGasto));
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoProduGasto);							
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto));						
			this.jButtonDuplicarToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoProduGasto && this.isPermisoDuplicarProductoProduGasto));						
			this.jButtonCopiarToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoProduGasto && this.isPermisoCopiarProductoProduGasto));			
			this.jButtonVerFormToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoProduGasto && this.isPermisoVerFormProductoProduGasto));			
			this.jButtonAbrirOrderByToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));
			this.jButtonNuevoRelacionesToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto && this.isPermisoNuevoProductoProduGasto));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));			
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoProduGasto && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoProduGasto  && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoProduGasto && this.isPermisoEliminarProductoProduGasto));
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarToolBarProductoProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoProduGasto);				
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto));			
			this.jMenuItemDuplicarProductoProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoProduGasto && this.isPermisoDuplicarProductoProduGasto));			
			this.jMenuItemCopiarProductoProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoProduGasto && this.isPermisoCopiarProductoProduGasto));			
			this.jMenuItemVerFormProductoProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoProduGasto && this.isPermisoVerFormProductoProduGasto));			
			this.jMenuItemAbrirOrderByProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));			
			//this.jMenuItemMostrarOcultarProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));
			this.jMenuItemDetalleAbrirOrderByProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));			
			//this.jMenuItemDetalleMostrarOcultarProductoProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoProduGasto && this.isPermisoOrdenProductoProduGasto));			
			this.jMenuItemNuevoRelacionesProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto && this.isPermisoNuevoProductoProduGasto));			
			this.jMenuItemNuevoGuardarCambiosProductoProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoProduGasto && this.isPermisoNuevoProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));									
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemModificarProductoProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoProduGasto && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemActualizarProductoProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoProduGasto && this.isPermisoActualizarProductoProduGasto));	
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemEliminarProductoProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoProduGasto && this.isPermisoEliminarProductoProduGasto));
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemCancelarProductoProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoProduGasto);				
			}
			
			this.jMenuItemGuardarCambiosProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));						
			this.jMenuItemGuardarCambiosTablaProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProduGasto=this.jButtonNuevoProductoProduGasto.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProduGasto=this.jButtonDuplicarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaCopiarProductoProduGasto=this.jButtonCopiarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaVerFormProductoProduGasto=this.jButtonVerFormProductoProduGasto.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProduGasto=this.jButtonAbrirOrderByProductoProduGasto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=this.jButtonNuevoRelacionesProductoProduGasto.isVisible();
			this.isVisibilidadCeldaModificarProductoProduGasto=this.jButtonModificarProductoProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.isVisibilidadCeldaActualizarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=this.jButtonGuardarCambiosTablaProductoProduGasto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProduGasto=this.jButtonNuevoToolBarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=this.jButtonNuevoRelacionesToolBarProductoProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.isVisibilidadCeldaModificarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarToolBarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarToolBarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarToolBarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarToolBarProductoProduGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduGasto=this.jButtonGuardarCambiosToolBarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=this.jButtonGuardarCambiosTablaToolBarProductoProduGasto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProduGasto=this.jMenuItemNuevoProductoProduGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=this.jMenuItemNuevoRelacionesProductoProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.isVisibilidadCeldaModificarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemModificarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemActualizarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemEliminarProductoProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduGasto=this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemCancelarProductoProduGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduGasto=this.jMenuItemGuardarCambiosProductoProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=this.jMenuItemGuardarCambiosTablaProductoProduGasto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProduGasto(Boolean esInicializar) {
		if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
				//if(this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduGasto();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProduGasto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProduGasto() {
		this.jButtonNuevoProductoProduGasto.setVisible(this.isPermisoNuevoProductoProduGasto);			
		this.jButtonDuplicarProductoProduGasto.setVisible(this.isPermisoDuplicarProductoProduGasto);			
		this.jButtonCopiarProductoProduGasto.setVisible(this.isPermisoCopiarProductoProduGasto);			
		this.jButtonVerFormProductoProduGasto.setVisible(this.isPermisoVerFormProductoProduGasto);			
		
		this.jButtonAbrirOrderByProductoProduGasto.setVisible(this.isPermisoOrdenProductoProduGasto);					
		
		this.jButtonNuevoRelacionesProductoProduGasto.setVisible(this.isPermisoNuevoProductoProduGasto);			
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarProductoProduGasto.setVisible(this.isPermisoActualizarProductoProduGasto);	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.setVisible(this.isPermisoActualizarProductoProduGasto);	
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.setVisible(this.isPermisoEliminarProductoProduGasto);
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoProduGasto);						
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.setVisible(this.isPermisoGuardarCambiosProductoProduGasto);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.setVisible(this.isPermisoActualizarProductoProduGasto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduGasto() {
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarProductoProduGasto.setVisible(this.isPermisoActualizarProductoProduGasto);	
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.setVisible(this.isPermisoActualizarProductoProduGasto);	
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.setVisible(this.isPermisoEliminarProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoProduGasto);							
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoProduGasto && this.isPermisoGuardarCambiosProductoProduGasto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProduGasto() {
		if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProduGasto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProduGasto() {
	}
	
	public void jTableDatosProductoProduGastoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProduGasto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoprodugasto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_defi_produProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductodefiprodu=true;

			idTienePermisoproductodefiprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(ProductoDefiProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductodefiprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productodefiproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productodefiproduBeanSwingJInternalFrame.getProductoDefiProduLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_producto_defi_produ()!=null) {
					this.productodefiproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productodefiproduBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_producto_defi_produ());
					this.productodefiproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoDefiProdu();
				}

				JInternalFrameBase jinternalFrame =this.productodefiproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBorderproductodefiprodu=(TitledBorder)this.productodefiproduBeanSwingJInternalFrame.jScrollPanelDatosProductoDefiProdu.getBorder();

				titledBorderproductodefiprodu.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Producto Definicion Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_defi_produProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_producto_defi_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_defi_produ = "+this.productoprodugasto.getid_producto_defi_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogastoproduempresa=true;

			idTienePermisotipogastoproduempresa=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogastoproduempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.tipogastoproduempresaBeanSwingJInternalFrame=new TipoGastoProduEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogastoproduempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogastoproduempresaBeanSwingJInternalFrame.getTipoGastoProduEmpresaLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_tipo_gasto_produ_empresa()!=null) {
					this.tipogastoproduempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogastoproduempresaBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_tipo_gasto_produ_empresa());
					this.tipogastoproduempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogastoproduempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogastoproduempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGastoProduEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipogastoproduempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBordertipogastoproduempresa=(TitledBorder)this.tipogastoproduempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoGastoProduEmpresa.getBorder();

				titledBordertipogastoproduempresa.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Tipo Gasto Produccion Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_tipo_gasto_produ_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_gasto_produ_empresa = "+this.productoprodugasto.getid_tipo_gasto_produ_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.productoprodugasto.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.productoprodugasto.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cliente_proveedorProductoProduGastoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteproveedorBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteproveedorBeanSwingJInternalFrame.sTipoBusqueda="ClienteProveedor";

			if(!this.sFinalQueryGeneral_clienteproveedor.equals("")) {
				this.clienteproveedorBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_clienteproveedor);
				this.clienteproveedorBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteproveedorBeanSwingJInternalFrame.procesarBusqueda(this.clienteproveedorBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteproveedorBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboClienteProveedor.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteproveedorBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderProductoProduGasto=null;
			TitledBorder titledBorderclienteproveedor=null;

			if(!this.jScrollPanelDatosProductoProduGasto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				titledBorderclienteproveedor=(TitledBorder)this.clienteproveedorBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBorderclienteproveedor.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cliente_proveedorProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoclienteproveedor=true;

			idTienePermisoclienteproveedor=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisoclienteproveedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.clienteproveedorBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteproveedorBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_cliente_proveedor()!=null) {
					this.clienteproveedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteproveedorBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_cliente_proveedor());
					this.clienteproveedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteproveedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteproveedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBorderclienteproveedor=(TitledBorder)this.clienteproveedorBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBorderclienteproveedor.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cliente_proveedorProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_cliente_proveedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente_proveedor = "+this.productoprodugasto.getid_cliente_proveedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaProductoProduGastoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderProductoProduGasto=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosProductoProduGasto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.productoprodugasto.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoProduGasto(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoprodugastoLogic.getConnexion());

				if(this.productoprodugasto.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoprodugasto.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduGasto=(TitledBorder)this.jScrollPanelDatosProductoProduGasto.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoProduGasto.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoprodugasto.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncanitdadProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getcanitdad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where canitdad = "+this.productoprodugasto.getcanitdad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoprodugasto.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoprodugasto.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.getproductoprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodugasto==null) {
						this.productoprodugasto = new ProductoProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);
				}

				if(this.productoprodugasto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoprodugasto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteProveedorProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdClienteProveedor();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdFactura();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDefiProduProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdProductoDefiProdu();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGastoProduEmpresaProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdTipoGastoProduEmpresa();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduGasto(false,false);

			this.getProductoProduGastosFK_IdUnidad();

			this.inicializarActualizarBindingProductoProduGasto(false);

			//if(ProductoProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProduGasto() {
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoProduGasto.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProduGasto.dispose();
			this.jInternalFrameDetalleFormProductoProduGasto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
			this.jInternalFrameReporteDinamicoProductoProduGasto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProduGasto.dispose();
			this.jInternalFrameReporteDinamicoProductoProduGasto=null;
		}
		
		if(this.jInternalFrameImportacionProductoProduGasto!=null) {
			this.jInternalFrameImportacionProductoProduGasto.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProduGasto.dispose();
			this.jInternalFrameImportacionProductoProduGasto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProduGasto();
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProduGasto")) {
				jButtonDuplicarProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProduGasto")) {
				jButtonCopiarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProduGasto")) {
				jButtonVerFormProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProduGasto")) {
				jButtonDuplicarProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProduGasto")) {
				jButtonDuplicarProductoProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProduGasto")) {
				jButtonModificarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProduGasto")) {
				jButtonModificarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProduGasto")) {
				jButtonModificarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProduGasto")) {
				jButtonActualizarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProduGasto")) {
				jButtonActualizarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProduGasto")) {
				jButtonActualizarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProduGasto")) {
				jButtonEliminarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProduGasto")) {
				jButtonEliminarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProduGasto")) {
				jButtonEliminarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProduGasto")) {
				jButtonCancelarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProduGasto")) {
				jButtonCancelarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProduGasto")) {
				jButtonCancelarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProduGasto")) {
				jButtonCerrarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProduGasto")) {
				jButtonCerrarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProduGasto")) {
				jButtonCerrarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProduGasto")) {
				jButtonMostrarOcultarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProduGasto")) {
				jButtonCancelarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProduGasto")) {
				jButtonCopiarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProduGasto")) {
				jButtonVerFormProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProduGasto")) {
				jButtonCopiarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProduGasto")) {
				jButtonVerFormProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProduGasto")) {
				jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProduGasto")) {
				jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProduGasto")) {
				jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProduGasto")) {
				jButtonAnterioresProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProduGasto")) {
				jButtonAnterioresProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProduGasto")) {
				jButtonAnterioresProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProduGasto")) {
				jButtonSiguientesProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProduGasto")) {
				jButtonSiguientesProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProduGasto")) {
				jButtonSiguientesProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProduGasto") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProduGasto")) {
				jButtonAbrirOrderByProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProduGasto") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProduGasto")) {
				jButtonMostrarOcultarProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduGasto")) {
				jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProduGasto")) {
				jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProduGasto")) {
				jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProduGasto")) {
				jButtonCerrarReporteDinamicoProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProduGasto")) {
				jButtonGenerarReporteDinamicoProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProduGasto")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProduGasto")) {
				jButtonCerrarImportacionProductoProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProduGasto")) {
				
				jButtonGenerarImportacionProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProduGasto")) {
				
				jButtonAbrirImportacionProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProduGasto")) {
				jComboBoxTiposAccionesProductoProduGastoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProduGasto")) {
				jComboBoxTiposRelacionesProductoProduGastoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProduGasto")) {
				jComboBoxTiposAccionesProductoProduGastoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProduGasto")) {
				
				jComboBoxTiposSeleccionarProductoProduGastoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProduGasto")) {
				jTextFieldValorCampoGeneralProductoProduGastoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProduGasto")) {
				jButtonAbrirOrderByProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProduGasto")) {
				jButtonAbrirOrderByProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProduGasto")) {
				jButtonCerrarOrderByProductoProduGastoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduGastoBusqueda")) {
				this.jButtonidProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduGastoUpdate")) {
				this.jButtonid_producto_defi_produProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduGastoBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoProduGastoUpdate")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoProduGastoBusqueda")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGasto")) {
				this.jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGastoUpdate")) {
				this.jButtonid_cliente_proveedorProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGastoBusqueda")) {
				this.jButtonid_cliente_proveedorProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaProductoProduGasto")) {
				this.jButtonid_facturaProductoProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaProductoProduGastoUpdate")) {
				this.jButtonid_facturaProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaProductoProduGastoBusqueda")) {
				this.jButtonid_facturaProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduGastoUpdate")) {
				this.jButtonid_unidadProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduGastoBusqueda")) {
				this.jButtonid_unidadProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("canitdadProductoProduGastoBusqueda")) {
				this.jButtoncanitdadProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduGastoBusqueda")) {
				this.jButtoncostoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduGastoBusqueda")) {
				this.jButtoncosto_totalProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduGastoBusqueda")) {
				this.jButtondescripcionProductoProduGastoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cliente_proveedorProductoProduGasto")) {
				this.jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaProductoProduGasto")) {
				this.jButtonid_facturaProductoProduGastoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteProveedorProductoProduGasto")) {
				this.jButtonFK_IdClienteProveedorProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoProductoProduGasto")) {
				this.jButtonFK_IdCuentaContableCreditoProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDebitoProductoProduGasto")) {
				this.jButtonFK_IdCuentaContableDebitoProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaProductoProduGasto")) {
				this.jButtonFK_IdFacturaProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDefiProduProductoProduGasto")) {
				this.jButtonFK_IdProductoDefiProduProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGastoProduEmpresaProductoProduGasto")) {
				this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoProduGasto")) {
				this.jButtonFK_IdUnidadProductoProduGastoActionPerformed(evt);
			}
			
			;
			
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProduGasto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProduGasto productoprodugastoLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoprodugastoLocal=this.productoprodugasto;
			} else {
				productoprodugastoLocal=this.productoprodugastoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
							
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
								
						
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
								
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
							
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
								
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProduGasto")) {
					jCheckBoxSeleccionarTodosProductoProduGastoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProduGasto")) {
					jCheckBoxSeleccionadosProductoProduGastoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProduGasto")) {
					
				}
				
				


				
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
												
				
				


				
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduGastoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodugasto);
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduGasto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodugastoAnterior =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProduGasto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProduGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProduGasto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoprodugasto =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoprodugasto =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoprodugasto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProduGasto")) {
				
				}
				
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProduGasto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProduGasto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProduGasto")) {
			
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProduGasto();
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProduGasto")) {
				jButtonDuplicarProductoProduGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProduGasto")) {
				jButtonCopiarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProduGasto")) {
				jButtonVerFormProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProduGasto")) {
				jButtonNuevoProductoProduGastoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProduGasto")) {
				jButtonModificarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProduGasto")) {
				jButtonActualizarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProduGasto")) {
				jButtonEliminarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProduGasto")) {
				jButtonCancelarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProduGasto")) {
				jButtonCerrarProductoProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProduGasto")) {
				jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduGasto")) {
				jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProduGasto")) {
				jButtonAbrirOrderByProductoProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProduGasto")) {
				jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProduGasto")) {
				jButtonAnterioresProductoProduGastoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProduGasto")) {
				jButtonSiguientesProductoProduGastoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduGastoBusqueda")) {
				this.jButtonidProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduGastoUpdate")) {
				this.jButtonid_producto_defi_produProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduGastoBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoProduGastoUpdate")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoProduGastoBusqueda")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGasto")) {
				this.jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGastoUpdate")) {
				this.jButtonid_cliente_proveedorProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoProduGastoBusqueda")) {
				this.jButtonid_cliente_proveedorProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaProductoProduGasto")) {
				this.jButtonid_facturaProductoProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaProductoProduGastoUpdate")) {
				this.jButtonid_facturaProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaProductoProduGastoBusqueda")) {
				this.jButtonid_facturaProductoProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduGastoUpdate")) {
				this.jButtonid_unidadProductoProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduGastoBusqueda")) {
				this.jButtonid_unidadProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("canitdadProductoProduGastoBusqueda")) {
				this.jButtoncanitdadProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduGastoBusqueda")) {
				this.jButtoncostoProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduGastoBusqueda")) {
				this.jButtoncosto_totalProductoProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduGastoBusqueda")) {
				this.jButtondescripcionProductoProduGastoBusquedaActionPerformed(evt);
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProduGasto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProduGasto")) {
				closingInternalFrameProductoProduGasto();
				
			} else if(sTipo.equals("jButtonCancelarProductoProduGasto")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProduGasto = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProduGastoBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduGasto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProduGastoActionPerformed(null);
			}
			
			ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodugasto,new Object(),this.productoprodugastoParameterGeneral,this.productoprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProduGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProduGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProduGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoprodugasto)) {
			if(!esControlTabla) {
				if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);			
				}
				
				if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProduGasto(this.productoprodugasto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodugastoReturnGeneral=productoprodugastoLogic.procesarEventosProductoProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodugastoLogic.getProductoProduGastos(),this.productoprodugasto,this.productoprodugastoParameterGeneral,this.isEsNuevoProductoProduGasto,classes);//this.productoprodugastoLogic.getProductoProduGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProduGasto(this.productoprodugastoReturnGeneral,this.productoprodugastoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduGasto(classes,this.productoprodugastoReturnGeneral,this.productoprodugastoBean,false);
					}
						
					if(this.productoprodugastoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto());	
					}
						
					if(this.productoprodugastoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto(),classes);//this.productoprodugastoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProduGasto(this.productoprodugasto,classes);//this.productoprodugastoBean);									
				}
			
				if(ProductoProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProduGasto(this.productoprodugasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduGasto(this.productoprodugasto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoprodugastoAnterior!=null) {
						this.productoprodugasto=this.productoprodugastoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodugastoReturnGeneral=productoprodugastoLogic.procesarEventosProductoProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodugastoLogic.getProductoProduGastos(),this.productoprodugasto,this.productoprodugastoParameterGeneral,this.isEsNuevoProductoProduGasto,classes);//this.productoprodugastoLogic.getProductoProduGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodugastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoprodugastoReturnGeneral.getProductoProduGasto(),productoprodugastoLogic.getProductoProduGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoprodugastoReturnGeneral.getProductoProduGasto(),this.productoprodugastos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProduGasto.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProduGasto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProduGasto();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProduGasto() throws Exception {
		
		ProductoProduGastoModel productoprodugastoModel=(ProductoProduGastoModel)this.jTableDatosProductoProduGasto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodugastoModel.productoprodugastos=this.productoprodugastoLogic.getProductoProduGastos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoprodugastoModel.productoprodugastos=this.productoprodugastos;
		}
		
		
		((ProductoProduGastoModel) this.jTableDatosProductoProduGasto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProduGasto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoprodugastoAnterior(),this.productoprodugastoLogic.getProductoProduGastos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoprodugastoAnterior(),this.productoprodugastos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProduGasto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProduGasto(ProductoProduGasto productoprodugasto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodugasto,new Object(),generalEntityParameterGeneral,this.productoprodugastoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProduGastoConstantesFunciones.getClassesRelationshipsOfProductoProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProduGastoConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProduGasto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProduGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodugasto,new Object(),generalEntityParameterGeneral,this.productoprodugastoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProduGasto(ProductoProduGastoBean productoprodugastoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduGasto(ArrayList<Classe> classes,ProductoProduGastoReturnGeneral productoprodugastoReturnGeneral,ProductoProduGastoBean productoprodugastoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProduGasto(ProductoProduGasto productoprodugasto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoprodugasto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduGasto = new ProductoProduGastoDetalleFormJInternalFrame(jDesktopPane,this.productoprodugastoSessionBean.getConGuardarRelaciones(),this.productoprodugastoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.setVisible(false);
		this.jInternalFrameDetalleFormProductoProduGasto.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProduGasto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProduGasto.productoprodugastoLogic=this.productoprodugastoLogic;
		
		this.cargarCombosFrameForeignKeyProductoProduGasto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduGasto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduGasto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProduGasto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProduGasto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProduGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduGasto"));
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ModificarProductoProduGasto"));

		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduGasto"));
					
		this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemModificarProductoProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduGasto"));
						
		this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemActualizarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.addActionListener (new ButtonActionListener(this,"EliminarProductoProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduGasto"));
								
		this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemEliminarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CancelarProductoProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduGasto"));
					
		this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemCancelarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduGasto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemDetalleCerrarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduGasto"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduGasto"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduGasto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonidProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoBusqueda"));
		//jButtonid_facturaProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncanitdadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"canitdadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncostoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncosto_totalProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtondescripcionProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduGastoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduGasto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProduGasto"));
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduGasto"));
		}
		
		this.jTableDatosProductoProduGasto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProduGasto"));
		
		this.jTableDatosProductoProduGasto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProduGasto"));
		
		this.jButtonNuevoProductoProduGasto.addActionListener(new ButtonActionListener(this,"NuevoProductoProduGasto"));
		
		this.jButtonDuplicarProductoProduGasto.addActionListener(new ButtonActionListener(this,"DuplicarProductoProduGasto"));
		
		this.jButtonCopiarProductoProduGasto.addActionListener(new ButtonActionListener(this,"CopiarProductoProduGasto"));
		
		this.jButtonVerFormProductoProduGasto.addActionListener(new ButtonActionListener(this,"VerFormProductoProduGasto"));
		
		
		this.jButtonNuevoToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProduGasto"));
			
		this.jButtonDuplicarToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProduGasto"));
			
		this.jMenuItemNuevoProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProduGasto"));
			
		this.jMenuItemDuplicarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProduGasto"));		
		
		
		this.jButtonNuevoRelacionesProductoProduGasto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProduGasto"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProduGasto"));
			
		this.jMenuItemNuevoRelacionesProductoProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProduGasto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ModificarProductoProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonModificarToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduGasto"));
			
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemModificarProductoProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarProductoProduGasto.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonActualizarToolBarProductoProduGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduGasto"));
				
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemActualizarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarProductoProduGasto.addActionListener (new ButtonActionListener(this,"EliminarProductoProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonEliminarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduGasto"));
						
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemEliminarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CancelarProductoProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonCancelarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduGasto"));
			
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemCancelarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduGasto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProduGasto"));		
		
		
		this.jButtonCerrarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CerrarProductoProduGasto"));
		
		
		this.jButtonCerrarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProduGasto"));
			
		this.jMenuItemCerrarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProduGasto"));
			
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jMenuItemDetalleCerrarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduGasto"));
		}
		
		this.jButtonCopiarToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProduGasto"));
			
		this.jButtonVerFormToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProduGasto"));
		
		this.jMenuItemGuardarCambiosProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProduGasto"));
			
		this.jMenuItemCopiarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProduGasto"));		
		
		this.jMenuItemVerFormProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProduGasto"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduGasto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProduGasto"));
			
		this.jMenuItemGuardarCambiosTablaProductoProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduGasto"));		
		
		
		
		this.jButtonRecargarInformacionProductoProduGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProduGasto"));
					
		this.jButtonRecargarInformacionToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProduGasto"));
		
		this.jMenuItemRecargarInformacionProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProduGasto"));		
		
		
		
		this.jButtonAnterioresProductoProduGasto.addActionListener (new ButtonActionListener(this,"AnterioresProductoProduGasto"));
		
		
		this.jButtonAnterioresToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProduGasto"));
		
		this.jMenuItemAnterioresProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProduGasto"));		
		
		
		this.jButtonSiguientesProductoProduGasto.addActionListener (new ButtonActionListener(this,"SiguientesProductoProduGasto"));
		
		
		this.jButtonSiguientesToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProduGasto"));
			
		this.jMenuItemSiguientesProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProduGasto"));
			
		this.jMenuItemAbrirOrderByProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProduGasto"));
			
		this.jMenuItemMostrarOcultarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProduGasto"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProduGasto"));
			
		this.jMenuItemDetalleMostarOcultarProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProduGasto"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProduGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProduGasto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProduGasto"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProduGasto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProduGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProduGasto"));

		this.jCheckBoxSeleccionadosProductoProduGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProduGasto"));
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduGasto"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProduGasto.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProduGasto"));
			
		this.jComboBoxTiposAccionesProductoProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProduGasto"));
					
		this.jComboBoxTiposSeleccionarProductoProduGasto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProduGasto"));
			
		this.jTextFieldValorCampoGeneralProductoProduGasto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProduGasto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonidProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoBusqueda"));
		//jButtonid_facturaProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncanitdadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"canitdadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncostoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncosto_totalProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtondescripcionProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduGastoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteProveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProductoProduGasto"));

			this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGasto"));

			this.jButtonFK_IdCuentaContableCreditoProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoProductoProduGasto"));

			this.jButtonFK_IdCuentaContableDebitoProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoProductoProduGasto"));

			this.jButtonFK_IdFacturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdFacturaProductoProduGasto"));

			this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGasto"));

			this.jButtonFK_IdProductoDefiProduProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduGasto"));

			this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdTipoGastoProduEmpresaProductoProduGasto"));

			this.jButtonFK_IdUnidadProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduGasto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduGasto"));
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduGasto"));
				this.jInternalFrameReporteDinamicoProductoProduGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduGasto"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProduGasto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduGasto"));				
			//this.jButtonGenerarReporteDinamicoProductoProduGasto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduGasto"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProduGasto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduGasto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProduGasto!=null) {
				this.jInternalFrameImportacionProductoProduGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduGasto"));
				this.jInternalFrameImportacionProductoProduGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduGasto"));
				this.jInternalFrameImportacionProductoProduGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduGasto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProduGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProduGasto"));
			
			this.jButtonAbrirOrderByToolBarProductoProduGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProduGasto"));			
			
			if(this.jInternalFrameOrderByProductoProduGasto!=null) {
				this.jInternalFrameOrderByProductoProduGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduGasto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduGasto.jTabbedPaneRelacionesProductoProduGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduGasto"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameProductoProduGasto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProduGasto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProduGasto = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProduGastoBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduGasto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProduGastoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProduGasto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProduGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProduGasto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProduGasto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProduGasto";
		inputMap = this.jButtonNuevoProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduGastoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProduGasto";
		inputMap = this.jButtonNuevoRelacionesProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduGastoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProduGasto";
		inputMap = this.jButtonModificarProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProduGasto";
		inputMap = this.jButtonActualizarProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProduGasto";
		inputMap = this.jButtonEliminarProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProduGasto";
		inputMap = this.jButtonCancelarProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProduGasto";
		inputMap = this.jButtonCerrarProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProduGasto";
		inputMap = this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonGuardarCambiosProductoProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProduGasto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProduGastoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonidProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_producto_defi_produProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGastoBusqueda"));
		//jButtonid_facturaProductoProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_unidadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncanitdadProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"canitdadProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncostoProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtoncosto_totalProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduGasto.jButtondescripcionProductoProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduGastoBusqueda"));
		
		
		this.jButtonFK_IdClienteProveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProductoProduGasto"));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoProduGasto"));

		this.jButtonFK_IdCuentaContableCreditoProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoProductoProduGasto"));

		this.jButtonFK_IdCuentaContableDebitoProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoProductoProduGasto"));

		this.jButtonFK_IdFacturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdFacturaProductoProduGasto"));

		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoProduGasto"));

		this.jButtonFK_IdProductoDefiProduProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduGasto"));

		this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdTipoGastoProduEmpresaProductoProduGasto"));

		this.jButtonFK_IdUnidadProductoProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduGasto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProduGastoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProduGasto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProduGasto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
					productoprodugastoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduGasto productoprodugastoAux:productoprodugastos) {
					productoprodugastoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProduGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
						productoprodugastoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduGasto productoprodugastoAux:productoprodugastos) {
						productoprodugastoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduGasto productoprodugastoAux:productoprodugastos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProduGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProduGasto.getSelectedRows();
			
			ProductoProduGasto productoprodugastoLocal=new ProductoProduGasto();
			
			//this.seleccionarTodosProductoProduGasto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodugastoLocal =(ProductoProduGasto) this.productoprodugastoLogic.getProductoProduGastos().toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoprodugastoLocal =(ProductoProduGasto) this.productoprodugastos.toArray()[this.jTableDatosProductoProduGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoprodugastoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
						productoprodugastoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduGasto productoprodugastoAux:productoprodugastos) {
						productoprodugastoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProduGastoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProduGastoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProduGastoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProduGasto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduGasto productoprodugastoAux:this.productoprodugastoLogic.getProductoProduGastos()) {
				
						if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodugastoAux.setcanitdad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodugastoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodugastoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodugastoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduGasto productoprodugastoAux:productoprodugastos) {
					
						if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodugastoAux.setcanitdad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodugastoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodugastoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodugastoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProduGastoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProduGasto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProduGasto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProduGasto) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProduGasto(conSplash);
				
					this.generarReporteProductoProduGastosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProduGastosSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduGastosSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduGastosSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduGasto();
				
				this.exportarProductoProduGastosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProduGastos();
				//this.importarProductoProduGastos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduGasto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProduGastosSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProduGasto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProduGasto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProduGasto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProduGastoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProduGasto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProduGasto(conSplash);
					
						//this.actualizarParametrosGeneralProductoProduGasto();
						
						this.generarReporteProcesoAccionProductoProduGastosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProduGastoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Gasto ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Gasto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProduGasto();
				
						this.actualizarParametrosGeneralProductoProduGasto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoprodugastoReturnGeneral=productoprodugastoLogic.procesarAccionProductoProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoprodugastoLogic.getProductoProduGastos(),this.productoprodugastoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProduGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProduGasto();
					
					ProductoProduGastoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProduGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxTiposAccionesFormularioProductoProduGasto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProduGasto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProduGastoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProduGasto();
			
			if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
			ProductoProduGasto productoprodugasto=new ProductoProduGasto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProduGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProduGasto.getSelectedItem();
			
			
			
			
			productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoprodugastosSeleccionados.size()==1) {
				for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
					productoprodugasto=productoprodugastoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProduGasto();
			
      		//this.finishProcessProductoProduGasto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProduGastoReturnGeneral() throws Exception {
		if(this.productoprodugastoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoprodugastoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoprodugastoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoprodugastoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoprodugastoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoprodugastoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProduGasto(false);
		}
		
		if(this.productoprodugastoReturnGeneral.getConRetornoLista() || this.productoprodugastoReturnGeneral.getConRetornoObjeto()) {
			if(this.productoprodugastoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodugastoLogic.setProductoProduGastos(this.productoprodugastoReturnGeneral.getProductoProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoprodugastoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodugastoLogic.setProductoProduGasto(this.productoprodugastoReturnGeneral.getProductoProduGasto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProduGasto(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProduGasto() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProduGasto> getProductoProduGastosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProduGasto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProduGasto productoprodugastoAux:productoprodugastoLogic.getProductoProduGastos()) {
					if(productoprodugastoAux.getIsSelected()) {
						productoprodugastosSeleccionados.add(productoprodugastoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduGasto productoprodugastoAux:this.productoprodugastos) {
					if(productoprodugastoAux.getIsSelected()) {
						productoprodugastosSeleccionados.add(productoprodugastoAux);				
					}
				}
			}
			
			if(productoprodugastosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoprodugastosSeleccionados.addAll(this.productoprodugastoLogic.getProductoProduGastos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoprodugastosSeleccionados.addAll(this.productoprodugastos);				
					}
				}
			}
		} else {
			productoprodugastosSeleccionados.add(this.productoprodugasto);
		}
		
		return productoprodugastosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteProductoProduGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProduGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProduGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduGastosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduGastosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Gasto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProduGastosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProduGasto();
		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProduGasto();
		
		
		//this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados ,productoprodugastoImplementable,productoprodugastoImplementableHome);
	}
	
	public void mostrarImportacionProductoProduGastos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProduGasto();
		
		this.abrirFrameImportacionProductoProduGasto();		
		
			
		//this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados ,productoprodugastoImplementable,productoprodugastoImplementableHome);
	}
	
	public void importarProductoProduGastos() throws Exception {		
	
	}
	
	public void exportarProductoProduGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProduGastosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProduGastosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProduGastosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Gasto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProduGasto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProduGasto(productoprodugastoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoprodugastoAux.setsDetalleGeneralEntityReporte(productoprodugastoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProduGasto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProduGasto(ProductoProduGasto productoprodugasto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoprodugasto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getproductodefiprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.gettipogastoproduempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getclienteproveedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getcanitdad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodugasto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProduGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProduGasto(row);				
				iRow++;
			}				
			
			for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProduGasto(productoprodugastoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();		
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodugasto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoprodugastos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoprodugasto");
			//elementRoot.appendChild(element);
		
			for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
				element = document.createElement("productoprodugasto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProduGasto(productoprodugastoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Gasto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProduGasto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProduGasto(ProductoProduGasto productoprodugasto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getproductodefiprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.gettipogastoproduempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getclienteproveedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getcanitdad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodugasto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoProduGasto(ProductoProduGasto productoprodugasto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProduGastoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoprodugasto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProduGastoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoprodugasto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproductodefiprodu_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDPRODUCTODEFIPRODU);
		elementproductodefiprodu_descripcion.appendChild(document.createTextNode(productoprodugasto.getproductodefiprodu_descripcion()));
		element.appendChild(elementproductodefiprodu_descripcion);

		Element elementtipogastoproduempresa_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDTIPOGASTOPRODUEMPRESA);
		elementtipogastoproduempresa_descripcion.appendChild(document.createTextNode(productoprodugasto.gettipogastoproduempresa_descripcion()));
		element.appendChild(elementtipogastoproduempresa_descripcion);

		Element elementcuentacontabledebito_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(productoprodugasto.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(productoprodugasto.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementclienteproveedor_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDCLIENTEPROVEEDOR);
		elementclienteproveedor_descripcion.appendChild(document.createTextNode(productoprodugasto.getclienteproveedor_descripcion()));
		element.appendChild(elementclienteproveedor_descripcion);

		Element elementfactura_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(productoprodugasto.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoProduGastoConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoprodugasto.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcanitdad = document.createElement(ProductoProduGastoConstantesFunciones.CANTIDAD);
		elementcanitdad.appendChild(document.createTextNode(productoprodugasto.getcanitdad().toString().trim()));
		element.appendChild(elementcanitdad);

		Element elementcosto = document.createElement(ProductoProduGastoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoprodugasto.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoProduGastoConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoprodugasto.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoProduGastoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoprodugasto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoProduGastosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProduGasto> productoprodugastosSeleccionados=new ArrayList<ProductoProduGasto>();
		
		productoprodugastosSeleccionados=this.getProductoProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProduGasto(productoprodugastosSeleccionados);
		
		this.generarReporteProductoProduGastos("Todos",productoprodugastosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProduGasto(ArrayList<ProductoProduGasto> productoprodugastosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProduGasto productoprodugastoAux:productoprodugastosSeleccionados) {
				productoprodugastoAux.setsDetalleGeneralEntityReporte(productoprodugastoAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getproductodefiprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.gettipogastoproduempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getclienteproveedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getcanitdad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoprodugastoAux.setsDescripcionGeneralEntityReporte1(productoprodugastoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProduGasto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProduGasto=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoProduGasto=true;
			this.isVisibilidadCeldaCancelarProductoProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=true;
			this.isVisibilidadCeldaModificarProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
			this.isVisibilidadCeldaModificarProductoProduGasto=true;
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduGasto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=true;
		} else {
			this.actualizarEstadoPanelsProductoProduGasto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProduGasto=false;
			//this.isVisibilidadCeldaVerFormProductoProduGasto=false;
			this.isVisibilidadCeldaDuplicarProductoProduGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoprodugastoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(!productoprodugastoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;												
			}
			
			this.jButtonCerrarProductoProduGasto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduGasto=false;
		}
		
		if(!this.permiteMantenimiento(this.productoprodugasto)) {
			this.isVisibilidadCeldaActualizarProductoProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoProduGasto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduGasto() {
	}
	
	public void actualizarEstadoPanelsProductoProduGasto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoProduGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduGasto!=null) {
				this.jScrollPanelDatosProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduGasto!=null) {
				this.jPanelPaginacionProductoProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
					this.jTabbedPaneBusquedasProductoProduGasto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoProduGasto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProduGasto!=null) {
				this.jPanelParametrosReportesProductoProduGasto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProductoDefiProdu(Boolean isParaProductoDefiProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoDefiProduNegation=!isParaProductoDefiProdu;

			this.isVisibilidadFK_IdClienteProveedor=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoDefiProdu;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGastoProduEmpresa(Boolean isParaTipoGastoProduEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGastoProduEmpresaNegation=!isParaTipoGastoProduEmpresa;

			this.isVisibilidadFK_IdClienteProveedor=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaTipoGastoProduEmpresa;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadFK_IdClienteProveedor=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableDebito;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadFK_IdClienteProveedor=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaClienteProveedor(Boolean isParaClienteProveedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteProveedorNegation=!isParaClienteProveedor;

			this.isVisibilidadFK_IdClienteProveedor=isParaClienteProveedor;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdClienteProveedor=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdClienteProveedor=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdClienteProveedorProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdFacturaProductoProduGasto);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdProductoDefiProduProductoProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduGasto.remove(jPanelFK_IdUnidadProductoProduGasto);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoProduGastoParaBusquedaClienteProveedors() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(productoprodugastoSessionBean==null) {
				productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(clienteproveedorSessionBean==null) {
				clienteproveedorSessionBean=new ClienteSessionBean();
			}

			clienteproveedorSessionBean.setsPathNavegacionActual(productoprodugastoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteproveedorSessionBean.setisPermiteRecargarInformacion(false);
			clienteproveedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteproveedorSessionBean.getisPaginaPopup();
			clienteproveedorSessionBean.setisPaginaPopup(false);
			clienteproveedorSessionBean.setEstaModoBusqueda(true);
			clienteproveedorSessionBean.setsFuncionBusquedaRapida("window.opener.productoprodugastoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente_proveedor(TO_REPLACE);");
			clienteproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProductoProduGastoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionProductoProduGasto(true);
			//clienteSessionBean.setlidProductoProduGastoActual(this.idProductoProduGastoActual);

			productoprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto(true);
			productoprodugastoSessionBean.setlIdProductoProduGastoActualForeignKey(this.idProductoProduGastoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionProductoProduGastoParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(productoprodugastoSessionBean==null) {
				productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(productoprodugastoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.productoprodugastoFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(ProductoProduGastoConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionProductoProduGasto(true);
			//facturaSessionBean.setlidProductoProduGastoActual(this.idProductoProduGastoActual);

			productoprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto(true);
			productoprodugastoSessionBean.setlIdProductoProduGastoActualForeignKey(this.idProductoProduGastoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProduGastoSessionBean productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		
		if(this.productoprodugastoSessionBean==null) {
			this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		}
		
		this.productoprodugastoSessionBean.setsUltimaBusquedaProductoProduGasto(this.getsAccionBusqueda());
		this.productoprodugastoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoprodugastoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdClienteProveedor")) {
			productoprodugastoSessionBean.setid_cliente_proveedor(this.getid_cliente_proveedorFK_IdClienteProveedor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			productoprodugastoSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
			productoprodugastoSessionBean.setid_cuenta_contable_debito(this.getid_cuenta_contable_debitoFK_IdCuentaContableDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			productoprodugastoSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
			productoprodugastoSessionBean.setid_producto_defi_produ(this.getid_producto_defi_produFK_IdProductoDefiProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGastoProduEmpresa")) {
			productoprodugastoSessionBean.setid_tipo_gasto_produ_empresa(this.getid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoprodugastoSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProduGastoSessionBean productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		
		if(this.productoprodugastoSessionBean==null) {
			this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		}
		
		if(this.productoprodugastoSessionBean.getsUltimaBusquedaProductoProduGasto()!=null&&!this.productoprodugastoSessionBean.getsUltimaBusquedaProductoProduGasto().equals("")) {
			this.setsAccionBusqueda(productoprodugastoSessionBean.getsUltimaBusquedaProductoProduGasto());
			this.setiNumeroPaginacion(productoprodugastoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoprodugastoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdClienteProveedor")) {
				this.setid_cliente_proveedorFK_IdClienteProveedor(productoprodugastoSessionBean.getid_cliente_proveedor());
				productoprodugastoSessionBean.setid_cliente_proveedor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(productoprodugastoSessionBean.getid_cuenta_contable_credito());
				productoprodugastoSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
				this.setid_cuenta_contable_debitoFK_IdCuentaContableDebito(productoprodugastoSessionBean.getid_cuenta_contable_debito());
				productoprodugastoSessionBean.setid_cuenta_contable_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(productoprodugastoSessionBean.getid_factura());
				productoprodugastoSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
				this.setid_producto_defi_produFK_IdProductoDefiProdu(productoprodugastoSessionBean.getid_producto_defi_produ());
				productoprodugastoSessionBean.setid_producto_defi_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGastoProduEmpresa")) {
				this.setid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa(productoprodugastoSessionBean.getid_tipo_gasto_produ_empresa());
				productoprodugastoSessionBean.setid_tipo_gasto_produ_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoprodugastoSessionBean.getid_unidad());
				productoprodugastoSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoprodugastoSessionBean.setsUltimaBusquedaProductoProduGasto("");
		this.productoprodugastoSessionBean.setiNumeroPaginacion(ProductoProduGastoConstantesFunciones.INUMEROPAGINACION);
		this.productoprodugastoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProduGasto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProduGasto() {
		this.updateBorderResaltarBusquedasFormularioProductoProduGasto();
		this.updateVisibilidadBusquedasFormularioProductoProduGasto();
		this.updateHabilitarBusquedasFormularioProductoProduGasto();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProduGasto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProduGasto.getComponents().length>0) {
	

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoProduGasto);
			}
		}

		if(this.productoprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoProduGasto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProduGasto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProduGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdClienteProveedorProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdClienteProveedorProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdCuentaContableCreditoProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdCuentaContableCreditoProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdCuentaContableDebitoProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdCuentaContableDebitoProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdFacturaProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdFacturaProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdTipoGastoProduEmpresaProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdTipoGastoProduEmpresaProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodugastoConstantesFunciones.mostrarFK_IdUnidadProductoProduGasto);
			if(!this.productoprodugastoConstantesFunciones.mostrarFK_IdUnidadProductoProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoProduGasto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProduGasto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProduGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdClienteProveedorProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdClienteProveedorProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdCuentaContableCreditoProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdCuentaContableCreditoProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdCuentaContableDebitoProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdCuentaContableDebitoProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdFacturaProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdFacturaProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdProductoDefiProduProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdProductoDefiProduProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdTipoGastoProduEmpresaProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdTipoGastoProduEmpresaProductoProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodugastoConstantesFunciones.activarFK_IdUnidadProductoProduGasto);
				this.jTabbedPaneBusquedasProductoProduGasto.setEnabledAt(index,this.productoprodugastoConstantesFunciones.activarFK_IdUnidadProductoProduGasto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProduGasto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdClienteProveedor")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdClienteProveedorProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdCuentaContableCreditoProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDebito")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdCuentaContableDebitoProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdFacturaProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProductoDefiProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdProductoDefiProduProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdTipoGastoProduEmpresaProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoProduGasto);

			this.jTabbedPaneBusquedasProductoProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduGasto.getComponent(index);

			this.productoprodugastoConstantesFunciones.setResaltarFK_IdUnidadProductoProduGasto(resaltar);

			jPanel.setBorder(this.productoprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoProduGasto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProduGasto.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioProductoProduGasto() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProduGasto();
		this.updateVisibilidadResaltarControlesFormularioProductoProduGasto();
		this.updateHabilitarResaltarControlesFormularioProductoProduGasto();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProduGasto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoprodugastoConstantesFunciones.resaltaridProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltaridProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_producto_defi_produProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_producto_defi_produProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_facturaProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_facturaProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarid_unidadProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarid_unidadProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarcanitdadProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarcanitdadProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarcostoProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarcostoProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltarcosto_totalProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltarcosto_totalProductoProduGasto);}
		if(this.productoprodugastoConstantesFunciones.resaltardescripcionProductoProduGasto!=null && this.jInternalFrameDetalleFormProductoProduGasto!=null) {this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setBorder(this.productoprodugastoConstantesFunciones.resaltardescripcionProductoProduGasto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProduGasto() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
	
		//this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostraridProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelidProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostraridProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_producto_defi_produProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_producto_defi_produProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_producto_defi_produProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_cuenta_contable_debitoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_cuenta_contable_creditoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_cliente_proveedorProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoProduGasto);
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_facturaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_facturaProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_facturaProductoProduGasto);
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_facturaProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_unidadProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelid_unidadProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarid_unidadProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcanitdadProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelcanitdadProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcanitdadProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcostoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelcostoProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcostoProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcosto_totalProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPanelcosto_totalProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrarcosto_totalProductoProduGasto);
		//this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrardescripcionProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jPaneldescripcionProductoProduGasto.setVisible(this.productoprodugastoConstantesFunciones.mostrardescripcionProductoProduGasto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProduGasto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduGasto!=null) {
	
		this.jInternalFrameDetalleFormProductoProduGasto.jLabelidProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activaridProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_producto_defi_produProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_producto_defi_produProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_debitoProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cuenta_contable_creditoProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_cliente_proveedorProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_cliente_proveedorProductoProduGasto);
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_cliente_proveedorProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_cliente_proveedorProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_facturaProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_facturaProductoProduGasto);
			this.jInternalFrameDetalleFormProductoProduGasto.jButtonid_facturaProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_facturaProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jComboBoxid_unidadProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarid_unidadProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcanitdadProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarcanitdadProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcostoProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarcostoProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextFieldcosto_totalProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activarcosto_totalProductoProduGasto);
		this.jInternalFrameDetalleFormProductoProduGasto.jTextAreadescripcionProductoProduGasto.setEnabled(this.productoprodugastoConstantesFunciones.activardescripcionProductoProduGasto);
		}
	}
	
		
}