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

import com.bydan.erp.produccion.util.ProductoOrdenDetaProduGastoConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduGastoParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoOrdenDetaProduGastoParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoOrdenDetaProduGastoBean;
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
public class ProductoOrdenDetaProduGastoBeanSwingJInternalFrame extends ProductoOrdenDetaProduGastoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoOrdenDetaProduGasto> productoordendetaprodugastoValidator = new ClassValidator<ProductoOrdenDetaProduGasto>(ProductoOrdenDetaProduGasto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoOrdenDetaProduGasto productoordendetaprodugasto;	
	public ProductoOrdenDetaProduGasto productoordendetaprodugastoAux;
	public ProductoOrdenDetaProduGasto productoordendetaprodugastoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoOrdenDetaProduGasto productoordendetaprodugastoTotales;
	public Long idProductoOrdenDetaProduGastoActual;
	public Long iIdNuevoProductoOrdenDetaProduGasto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboOrdenDetaProdu="";

	public List<OrdenDetaProdu> ordendetaprodusForeignKey;

	public List<OrdenDetaProdu> getordendetaprodusForeignKey() {
		return ordendetaprodusForeignKey;
	}

	public void setordendetaprodusForeignKey(List<OrdenDetaProdu> ordendetaprodusForeignKey) {
		this.ordendetaprodusForeignKey = ordendetaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public OrdenDetaProdu ordendetaproduForeignKey;

	public OrdenDetaProdu getordendetaproduForeignKey() {
		return ordendetaproduForeignKey;
	}

	public void setordendetaproduForeignKey(OrdenDetaProdu ordendetaproduForeignKey) {
		this.ordendetaproduForeignKey = ordendetaproduForeignKey;
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
	
	public Boolean isPermisoTodoProductoOrdenDetaProduGasto;
	public Boolean isPermisoNuevoProductoOrdenDetaProduGasto;
	public Boolean isPermisoActualizarProductoOrdenDetaProduGasto;
	public Boolean isPermisoActualizarOriginalProductoOrdenDetaProduGasto;
	public Boolean isPermisoEliminarProductoOrdenDetaProduGasto;
	public Boolean isPermisoGuardarCambiosProductoOrdenDetaProduGasto;
	public Boolean isPermisoConsultaProductoOrdenDetaProduGasto;
	public Boolean isPermisoBusquedaProductoOrdenDetaProduGasto;
	public Boolean isPermisoReporteProductoOrdenDetaProduGasto;
	public Boolean isPermisoPaginacionMedioProductoOrdenDetaProduGasto;
	public Boolean isPermisoPaginacionAltoProductoOrdenDetaProduGasto;
	public Boolean isPermisoPaginacionTodoProductoOrdenDetaProduGasto;
	public Boolean isPermisoCopiarProductoOrdenDetaProduGasto;
	public Boolean isPermisoVerFormProductoOrdenDetaProduGasto;
	public Boolean isPermisoDuplicarProductoOrdenDetaProduGasto;
	public Boolean isPermisoOrdenProductoOrdenDetaProduGasto;
	
	
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
	
	public ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoReturnGeneral;
	public ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoOrdenDetaProduGasto=false;
	public Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduGasto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoOrdenDetaProduGastoSessionBeanAdditional productoordendetaprodugastoSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduGastoSessionBeanAdditional getProductoOrdenDetaProduGastoSessionBeanAdditional() {
		return this.productoordendetaprodugastoSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduGastoSessionBeanAdditional(ProductoOrdenDetaProduGastoSessionBeanAdditional productoordendetaprodugastoSessionBeanAdditional) {
		try {
			this.productoordendetaprodugastoSessionBeanAdditional=productoordendetaprodugastoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional productoordendetaprodugastoBeanSwingJInternalFrameAdditional=null;
	//public class ProductoOrdenDetaProduGastoBeanSwingJInternalFrame
	
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional getProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional() {
		return this.productoordendetaprodugastoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional(ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional productoordendetaprodugastoBeanSwingJInternalFrameAdditional) {
		try {
			this.productoordendetaprodugastoBeanSwingJInternalFrameAdditional=productoordendetaprodugastoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoOrdenDetaProduGastoLogic productoordendetaprodugastoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoOrdenDetaProduGasto productoordendetaprodugastoBean;
	public ProductoOrdenDetaProduGastoConstantesFunciones productoordendetaprodugastoConstantesFunciones;
	//public ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoReturnGeneral;
	
	//FK
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	public TipoGastoProduEmpresaLogic tipogastoproduempresaLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	public ClienteLogic clienteproveedorLogic;
	public FacturaLogic facturaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos;	
	//public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosEliminados;
	//public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto=true;
	public Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto=true;
	public Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto=true;
	public Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=false;
	public Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;	
	
	
	public Boolean isVisibilidadFK_IdClienteProveedor=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdOrdenDetaProdu=false;
	public Boolean isVisibilidadFK_IdTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoOrdenDetaProduGasto() {
		return this.iIdNuevoProductoOrdenDetaProduGasto;
	}

	public void setiIdNuevoProductoOrdenDetaProduGasto(Long iIdNuevoProductoOrdenDetaProduGasto) {
		this.iIdNuevoProductoOrdenDetaProduGasto = iIdNuevoProductoOrdenDetaProduGasto;
	}
	
	public Long getidProductoOrdenDetaProduGastoActual() {
		return this.idProductoOrdenDetaProduGastoActual;
	}

	public void setidProductoOrdenDetaProduGastoActual(Long idProductoOrdenDetaProduGastoActual) {
		this.idProductoOrdenDetaProduGastoActual = idProductoOrdenDetaProduGastoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoOrdenDetaProduGasto getproductoordendetaprodugasto() {
		return this.productoordendetaprodugasto;
	}

	public void setproductoordendetaprodugasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto) {
		this.productoordendetaprodugasto = productoordendetaprodugasto;
	}
	
	public ProductoOrdenDetaProduGasto getproductoordendetaprodugastoAux() {
		return this.productoordendetaprodugastoAux;
	}

	public void setproductoordendetaprodugastoAux(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux) {
		this.productoordendetaprodugastoAux = productoordendetaprodugastoAux;
	}				
	
	public ProductoOrdenDetaProduGasto getproductoordendetaprodugastoAnterior() {
		return this.productoordendetaprodugastoAnterior;
	}

	public void setproductoordendetaprodugastoAnterior(ProductoOrdenDetaProduGasto productoordendetaprodugastoAnterior) {
		this.productoordendetaprodugastoAnterior = productoordendetaprodugastoAnterior;
	}	
	
	public ProductoOrdenDetaProduGasto getproductoordendetaprodugastoTotales() {
		return this.productoordendetaprodugastoTotales;
	}

	public void setproductoordendetaprodugastoTotales(ProductoOrdenDetaProduGasto productoordendetaprodugastoTotales) {
		this.productoordendetaprodugastoTotales = productoordendetaprodugastoTotales;
	}	
	
	public ProductoOrdenDetaProduGasto getproductoordendetaprodugastoBean() {
		return this.productoordendetaprodugastoBean;
	}

	public void setproductoordendetaprodugastoBean(ProductoOrdenDetaProduGasto productoordendetaprodugastoBean) {
		this.productoordendetaprodugastoBean = productoordendetaprodugastoBean;
	}	
	
	public ProductoOrdenDetaProduGastoParameterReturnGeneral getproductoordendetaprodugastoReturnGeneral() {
		return this.productoordendetaprodugastoReturnGeneral;
	}

	public void setproductoordendetaprodugastoReturnGeneral(ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoReturnGeneral) {
		this.productoordendetaprodugastoReturnGeneral = productoordendetaprodugastoReturnGeneral;
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

	public Long id_orden_deta_produFK_IdOrdenDetaProdu=-1L;

	public Long getid_orden_deta_produFK_IdOrdenDetaProdu() {
		return this.id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public void setid_orden_deta_produFK_IdOrdenDetaProdu(Long id_orden_deta_produFK_IdOrdenDetaProdu) {
		this.id_orden_deta_produFK_IdOrdenDetaProdu = id_orden_deta_produFK_IdOrdenDetaProdu;
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
	
	
	public ProductoOrdenDetaProduGastoLogic getProductoOrdenDetaProduGastoLogic()	{		
		return productoordendetaprodugastoLogic;
	}

	public void setProductoOrdenDetaProduGastoLogic(ProductoOrdenDetaProduGastoLogic productoordendetaprodugastoLogic) {
		this.productoordendetaprodugastoLogic = productoordendetaprodugastoLogic;
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
	
	public Boolean getIsEsNuevoProductoOrdenDetaProduGasto() {
		return isEsNuevoProductoOrdenDetaProduGasto;
	}

	public void setIsEsNuevoProductoOrdenDetaProduGasto(Boolean isEsNuevoProductoOrdenDetaProduGasto) {
		this.isEsNuevoProductoOrdenDetaProduGasto = isEsNuevoProductoOrdenDetaProduGasto;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoOrdenDetaProduGasto() {
		return esParaAccionDesdeFormularioProductoOrdenDetaProduGasto;
	}
	
	public void setEsParaAccionDesdeFormularioProductoOrdenDetaProduGasto(Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduGasto) {
		this.esParaAccionDesdeFormularioProductoOrdenDetaProduGasto = esParaAccionDesdeFormularioProductoOrdenDetaProduGasto;
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
	
	
	public void cargarCombosOrdenDetaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OrdenDetaProduLogic ordendetaproduLogic=new OrdenDetaProduLogic();

			ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

					ordendetaproduLogic.getTodosOrdenDetaProdusWithConnection(sFinalQuery,new Pagination());

					this.ordendetaprodusForeignKey=ordendetaproduLogic.getOrdenDetaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOrdenDetaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidOrdenDetaProduActual());
					this.ordendetaprodusForeignKey.add(ordendetaproduLogic.getOrdenDetaProdu());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {
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
					tipogastoproduempresaLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidTipoGastoProduEmpresaActual());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
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
					cuentacontableLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidCuentaContableDebitoActual());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
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
					cuentacontableLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidCuentaContableCreditoActual());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {
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
					clienteLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidClienteProveedorActual());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
					facturaLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidFacturaActual());
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

			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoordendetaprodugastoSessionBean.getlidUnidadActual());
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

	
	
	public void setActualOrdenDetaProduForeignKey(Long idOrdenDetaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ordendetaproduTemp!=null) {

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setOrdenDetaProdu(ordendetaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedItem(ordendetaproduTemp);
					}
				} else {
					//jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedItem(ordendetaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(ordendetaproduTemp!=null && jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setSelectedItem(ordendetaproduTemp);
					} else {
						if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setSelectedItem(ordendetaproduTemp);
							if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setSelectedIndex(0);
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

	public String getActualOrdenDetaProduForeignKeyDescripcion(Long idOrdenDetaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}


			sDescripcion=OrdenDetaProduConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOrdenDetaProduForeignKeyGenerico(Long idOrdenDetaProduSeleccionado,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(ordendetaproduTemp!=null) {
				jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico.setSelectedItem(ordendetaproduTemp);
			} else {
				if(jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setTipoGastoProduEmpresa(tipogastoproduempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogastoproduempresaTemp!=null && jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresaTemp);
					} else {
						if(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresaTemp);
							if(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualTipoGastoProduEmpresaForeignKeyGenerico(Long idTipoGastoProduEmpresaSeleccionado,JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico.setSelectedItem(tipogastoproduempresaTemp);
			} else {
				if(jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledebitoTemp!=null && jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebitoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebitoTemp);
							if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setClienteProveedor(clienteproveedorTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedorTemp);
					}
				} else {
					//jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedorTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdClienteProveedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteproveedorTemp!=null && jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedorTemp);
					} else {
						if(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedorTemp);
							if(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualClienteProveedorForeignKeyGenerico(Long idClienteProveedorSeleccionado,JComboBox jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico.setSelectedItem(clienteproveedorTemp);
			} else {
				if(jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodugasto!=null) {
						this.productoordendetaprodugasto.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico)throws Exception
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
				jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico!=null && jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOrdenDetaProduForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduAux=new OrdenDetaProdu();

			if(jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico==null) {
				ordendetaproduAux=(OrdenDetaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				ordendetaproduAux=(OrdenDetaProdu)jComboBoxid_orden_deta_produProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(ordendetaproduAux!=null && ordendetaproduAux.getId()!=null) {
				productoordendetaprodugasto.setid_orden_deta_produ(ordendetaproduAux.getId());
				productoordendetaprodugasto.setordendetaprodu_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduAux));
				productoordendetaprodugasto.setOrdenDetaProdu(ordendetaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGastoProduEmpresaForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			TipoGastoProduEmpresa  tipogastoproduempresaAux=new TipoGastoProduEmpresa();

			if(jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico==null) {
				tipogastoproduempresaAux=(TipoGastoProduEmpresa)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				tipogastoproduempresaAux=(TipoGastoProduEmpresa)jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(tipogastoproduempresaAux!=null && tipogastoproduempresaAux.getId()!=null) {
				productoordendetaprodugasto.setid_tipo_gasto_produ_empresa(tipogastoproduempresaAux.getId());
				productoordendetaprodugasto.settipogastoproduempresa_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresaAux));
				productoordendetaprodugasto.setTipoGastoProduEmpresa(tipogastoproduempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				productoordendetaprodugasto.setid_cuenta_contable_debito(cuentacontableAux.getId());
				productoordendetaprodugasto.setcuentacontabledebito_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				productoordendetaprodugasto.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				productoordendetaprodugasto.setid_cuenta_contable_credito(cuentacontableAux.getId());
				productoordendetaprodugasto.setcuentacontablecredito_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				productoordendetaprodugasto.setCuentaContableCredito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteProveedorForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_cliente_proveedorProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				productoordendetaprodugasto.setid_cliente_proveedor(clienteAux.getId());
				productoordendetaprodugasto.setclienteproveedor_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getClienteProveedorDescripcion(clienteAux));
				productoordendetaprodugasto.setClienteProveedor(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				productoordendetaprodugasto.setid_factura(facturaAux.getId());
				productoordendetaprodugasto.setfactura_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getFacturaDescripcion(facturaAux));
				productoordendetaprodugasto.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoOrdenDetaProduGasto productoordendetaprodugasto,JComboBox jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoOrdenDetaProduGastoGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoordendetaprodugasto.setid_unidad(unidadAux.getId());
				productoordendetaprodugasto.setunidad_descripcion(ProductoOrdenDetaProduGastoConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoordendetaprodugasto.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOrdenDetaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOrdenDetaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.addItem(ordendetaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.addItem(ordendetaprodu);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.removeAllItems();

							for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.addItem(tipogastoproduempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.removeAllItems();

							for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresasForeignKey) {
								this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.addItem(tipogastoproduempresa);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.addItem(cuentacontabledebito);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.addItem(cuentacontablecredito);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.removeAllItems();

							for(Cliente clienteproveedor:this.clienteproveedorsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.addItem(clienteproveedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdClienteProveedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.removeAllItems();

							for(Cliente clienteproveedor:this.clienteproveedorsForeignKey) {
								this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.addItem(clienteproveedor);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.addItem(factura);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { 
					}

					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.addItem(unidad);
							}
						}

						if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameOrdenDetaProduForeignKey(OrdenDetaProdu ordendetaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedItem(ordendetaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setSelectedItem(ordendetaprodu);
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setSelectedItem(tipogastoproduempresa);
						} else {
							this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontabledebito);
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setSelectedItem(clienteproveedor);
						} else {
							this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoOrdenDetaProduGastoConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoOrdenDetaProduGastoConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto(this.productoordendetaprodugastos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(OrdenDetaProdu.class));
		classes.add(new Classe(TipoGastoProduEmpresa.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(this.productoordendetaprodugastos);
			productoordendetaprodugastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoOrdenDetaProduGastoParameterReturnGeneral getProductoOrdenDetaProduGastoParameterGeneral() {
		return this.productoordendetaprodugastoParameterGeneral;
	}
	
	public void setProductoOrdenDetaProduGastoParameterGeneral(ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoParameterGeneral) {
		this.productoordendetaprodugastoParameterGeneral = productoordendetaprodugastoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoOrdenDetaProduGasto() {
		return isPermisoTodoProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoTodoProductoOrdenDetaProduGasto(Boolean isPermisoTodoProductoOrdenDetaProduGasto) {
		this.isPermisoTodoProductoOrdenDetaProduGasto = isPermisoTodoProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoNuevoProductoOrdenDetaProduGasto() {
		return isPermisoNuevoProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoNuevoProductoOrdenDetaProduGasto(Boolean isPermisoNuevoProductoOrdenDetaProduGasto) {
		this.isPermisoNuevoProductoOrdenDetaProduGasto = isPermisoNuevoProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoActualizarProductoOrdenDetaProduGasto() {
		return isPermisoActualizarProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoActualizarProductoOrdenDetaProduGasto(Boolean isPermisoActualizarProductoOrdenDetaProduGasto) {
		this.isPermisoActualizarProductoOrdenDetaProduGasto = isPermisoActualizarProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoEliminarProductoOrdenDetaProduGasto() {
		return isPermisoEliminarProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoEliminarProductoOrdenDetaProduGasto(Boolean isPermisoEliminarProductoOrdenDetaProduGasto) {
		this.isPermisoEliminarProductoOrdenDetaProduGasto = isPermisoEliminarProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoGuardarCambiosProductoOrdenDetaProduGasto() {
		return isPermisoGuardarCambiosProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoGuardarCambiosProductoOrdenDetaProduGasto(Boolean isPermisoGuardarCambiosProductoOrdenDetaProduGasto) {
		this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto = isPermisoGuardarCambiosProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoConsultaProductoOrdenDetaProduGasto() {
		return isPermisoConsultaProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoConsultaProductoOrdenDetaProduGasto(Boolean isPermisoConsultaProductoOrdenDetaProduGasto) {
		this.isPermisoConsultaProductoOrdenDetaProduGasto = isPermisoConsultaProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoBusquedaProductoOrdenDetaProduGasto() {
		return isPermisoBusquedaProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoBusquedaProductoOrdenDetaProduGasto(Boolean isPermisoBusquedaProductoOrdenDetaProduGasto) {
		this.isPermisoBusquedaProductoOrdenDetaProduGasto = isPermisoBusquedaProductoOrdenDetaProduGasto;
	}

	public Boolean getIsPermisoReporteProductoOrdenDetaProduGasto() {
		return isPermisoReporteProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoReporteProductoOrdenDetaProduGasto(Boolean isPermisoReporteProductoOrdenDetaProduGasto) {
		this.isPermisoReporteProductoOrdenDetaProduGasto = isPermisoReporteProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoOrdenDetaProduGasto() {
		return isPermisoPaginacionMedioProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoPaginacionMedioProductoOrdenDetaProduGasto(Boolean isPermisoPaginacionMedioProductoOrdenDetaProduGasto) {
		this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto = isPermisoPaginacionMedioProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoOrdenDetaProduGasto() {
		return isPermisoPaginacionTodoProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoPaginacionTodoProductoOrdenDetaProduGasto(Boolean isPermisoPaginacionTodoProductoOrdenDetaProduGasto) {
		this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto = isPermisoPaginacionTodoProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoOrdenDetaProduGasto() {
		return isPermisoPaginacionAltoProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoPaginacionAltoProductoOrdenDetaProduGasto(Boolean isPermisoPaginacionAltoProductoOrdenDetaProduGasto) {
		this.isPermisoPaginacionAltoProductoOrdenDetaProduGasto = isPermisoPaginacionAltoProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoCopiarProductoOrdenDetaProduGasto() {
		return isPermisoCopiarProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoCopiarProductoOrdenDetaProduGasto(Boolean isPermisoCopiarProductoOrdenDetaProduGasto) {
		this.isPermisoCopiarProductoOrdenDetaProduGasto = isPermisoCopiarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoVerFormProductoOrdenDetaProduGasto() {
		return isPermisoVerFormProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoVerFormProductoOrdenDetaProduGasto(Boolean isPermisoVerFormProductoOrdenDetaProduGasto) {
		this.isPermisoVerFormProductoOrdenDetaProduGasto = isPermisoVerFormProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoDuplicarProductoOrdenDetaProduGasto() {
		return isPermisoDuplicarProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoDuplicarProductoOrdenDetaProduGasto(Boolean isPermisoDuplicarProductoOrdenDetaProduGasto) {
		this.isPermisoDuplicarProductoOrdenDetaProduGasto = isPermisoDuplicarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsPermisoOrdenProductoOrdenDetaProduGasto() {
		return isPermisoOrdenProductoOrdenDetaProduGasto;
	}

	public void setIsPermisoOrdenProductoOrdenDetaProduGasto(Boolean isPermisoOrdenProductoOrdenDetaProduGasto) {
		this.isPermisoOrdenProductoOrdenDetaProduGasto = isPermisoOrdenProductoOrdenDetaProduGasto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaNuevoProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto = isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto = isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaCopiarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto = isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaVerFormProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto = isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaOrdenProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto = isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto = isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaModificarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaModificarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto = isVisibilidadCeldaModificarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaActualizarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto = isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaEliminarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto = isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaCancelarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto = isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaGuardarProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto = isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto() {
		return isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto(Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto) {
		this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto = isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto;
	}
		
	public ProductoOrdenDetaProduGastoSessionBean getproductoordendetaprodugastoSessionBean() {
		return this.productoordendetaprodugastoSessionBean;
	}
	
	public void setproductoordendetaprodugastoSessionBean(ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean) {
		this.productoordendetaprodugastoSessionBean=productoordendetaprodugastoSessionBean;
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

	public Boolean getisVisibilidadFK_IdOrdenDetaProdu() {
		return this.isVisibilidadFK_IdOrdenDetaProdu;
	}

	public void setisVisibilidadFK_IdOrdenDetaProdu(Boolean isVisibilidadFK_IdOrdenDetaProdu) {
		this.isVisibilidadFK_IdOrdenDetaProdu=isVisibilidadFK_IdOrdenDetaProdu;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto)throws Exception {
		try {
			
				this.setActualParaGuardarOrdenDetaProduForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarTipoGastoProduEmpresaForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarClienteProveedorForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarFacturaForeignKey(productoordendetaprodugasto,null);
				this.setActualParaGuardarUnidadForeignKey(productoordendetaprodugasto,null);
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
	
	public void bugActualizarReferenciaActual(ProductoOrdenDetaProduGasto productoordendetaprodugasto,ProductoOrdenDetaProduGasto productoordendetaprodugastoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoOrdenDetaProduGasto(productoordendetaprodugasto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoordendetaprodugastoAux.setId(productoordendetaprodugasto.getId());
		productoordendetaprodugastoAux.setVersionRow(productoordendetaprodugasto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoOrdenDetaProduGasto();
		
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoordendetaprodugastoValidator.getInvalidValues(this.productoordendetaprodugasto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoordendetaprodugastoLogic.setDatosCliente(datosCliente);
			productoordendetaprodugastoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoordendetaprodugastoAux=new  ProductoOrdenDetaProduGasto();
				
				productoordendetaprodugastoAux.setIsNew(true);
				productoordendetaprodugastoAux.setIsChanged(true);
				
				productoordendetaprodugastoAux.setProductoOrdenDetaProduGastoOriginal(this.productoordendetaprodugasto);
				
				productoordendetaprodugastoAux.setId(this.productoordendetaprodugasto.getId());	
				productoordendetaprodugastoAux.setVersionRow(this.productoordendetaprodugasto.getVersionRow());	
				productoordendetaprodugastoAux.setid_orden_deta_produ(this.productoordendetaprodugasto.getid_orden_deta_produ());	
				productoordendetaprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa());	
				productoordendetaprodugastoAux.setid_cuenta_contable_debito(this.productoordendetaprodugasto.getid_cuenta_contable_debito());	
				productoordendetaprodugastoAux.setid_cuenta_contable_credito(this.productoordendetaprodugasto.getid_cuenta_contable_credito());	
				productoordendetaprodugastoAux.setid_cliente_proveedor(this.productoordendetaprodugasto.getid_cliente_proveedor());	
				productoordendetaprodugastoAux.setid_factura(this.productoordendetaprodugasto.getid_factura());	
				productoordendetaprodugastoAux.setid_unidad(this.productoordendetaprodugasto.getid_unidad());	
				productoordendetaprodugastoAux.setcantidad(this.productoordendetaprodugasto.getcantidad());	
				productoordendetaprodugastoAux.setcosto(this.productoordendetaprodugasto.getcosto());	
				productoordendetaprodugastoAux.setcosto_total(this.productoordendetaprodugasto.getcosto_total());	
				productoordendetaprodugastoAux.setdescripcion(this.productoordendetaprodugasto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastos();//WithConnection
						//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastoRelaciones(productoordendetaprodugastoAux);//WithConnection
								//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoordendetaprodugastoAux=new  ProductoOrdenDetaProduGasto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() 
					|| (this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodugasto.getId()>=0)) {
						
					productoordendetaprodugastoAux.setIsNew(false);
				}
				
				productoordendetaprodugastoAux.setIsDeleted(false);
			
				productoordendetaprodugastoAux.setId(this.productoordendetaprodugasto.getId());	
				productoordendetaprodugastoAux.setVersionRow(this.productoordendetaprodugasto.getVersionRow());	
				productoordendetaprodugastoAux.setid_orden_deta_produ(this.productoordendetaprodugasto.getid_orden_deta_produ());	
				productoordendetaprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa());	
				productoordendetaprodugastoAux.setid_cuenta_contable_debito(this.productoordendetaprodugasto.getid_cuenta_contable_debito());	
				productoordendetaprodugastoAux.setid_cuenta_contable_credito(this.productoordendetaprodugasto.getid_cuenta_contable_credito());	
				productoordendetaprodugastoAux.setid_cliente_proveedor(this.productoordendetaprodugasto.getid_cliente_proveedor());	
				productoordendetaprodugastoAux.setid_factura(this.productoordendetaprodugasto.getid_factura());	
				productoordendetaprodugastoAux.setid_unidad(this.productoordendetaprodugasto.getid_unidad());	
				productoordendetaprodugastoAux.setcantidad(this.productoordendetaprodugasto.getcantidad());	
				productoordendetaprodugastoAux.setcosto(this.productoordendetaprodugasto.getcosto());	
				productoordendetaprodugastoAux.setcosto_total(this.productoordendetaprodugasto.getcosto_total());	
				productoordendetaprodugastoAux.setdescripcion(this.productoordendetaprodugasto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastos();//WithConnection
						//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastoRelaciones(productoordendetaprodugastoAux);//WithConnection
								//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodugasto,productoordendetaprodugastoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoordendetaprodugastoAux=new  ProductoOrdenDetaProduGasto();
				
				productoordendetaprodugastoAux.setIsNew(false);
				productoordendetaprodugastoAux.setIsChanged(false);
				
				productoordendetaprodugastoAux.setIsDeleted(true);
				
				productoordendetaprodugastoAux.setId(this.productoordendetaprodugasto.getId());	
				productoordendetaprodugastoAux.setVersionRow(this.productoordendetaprodugasto.getVersionRow());	
				productoordendetaprodugastoAux.setid_orden_deta_produ(this.productoordendetaprodugasto.getid_orden_deta_produ());	
				productoordendetaprodugastoAux.setid_tipo_gasto_produ_empresa(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa());	
				productoordendetaprodugastoAux.setid_cuenta_contable_debito(this.productoordendetaprodugasto.getid_cuenta_contable_debito());	
				productoordendetaprodugastoAux.setid_cuenta_contable_credito(this.productoordendetaprodugasto.getid_cuenta_contable_credito());	
				productoordendetaprodugastoAux.setid_cliente_proveedor(this.productoordendetaprodugasto.getid_cliente_proveedor());	
				productoordendetaprodugastoAux.setid_factura(this.productoordendetaprodugasto.getid_factura());	
				productoordendetaprodugastoAux.setid_unidad(this.productoordendetaprodugasto.getid_unidad());	
				productoordendetaprodugastoAux.setcantidad(this.productoordendetaprodugasto.getcantidad());	
				productoordendetaprodugastoAux.setcosto(this.productoordendetaprodugasto.getcosto());	
				productoordendetaprodugastoAux.setcosto_total(this.productoordendetaprodugasto.getcosto_total());	
				productoordendetaprodugastoAux.setdescripcion(this.productoordendetaprodugasto.getdescripcion());	
				
				if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoordendetaprodugastoAux.getId()>=0) {	
						this.productoordendetaprodugastosEliminados.add(productoordendetaprodugastoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastos();//WithConnection
						//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastoRelaciones(productoordendetaprodugastoAux);//WithConnection
								//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
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
							if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoordendetaprodugastoAux,productoordendetaprodugastos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(this.productoordendetaprodugastosEliminados);
					
					productoordendetaprodugastoLogic.saveProductoOrdenDetaProduGastos();//WithConnection
					//productoordendetaprodugastoLogic.getSetVersionRowProductoOrdenDetaProduGastos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto();
				
				this.productoordendetaprodugastosEliminados= new ArrayList<ProductoOrdenDetaProduGasto>();		
			}
			
			if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden  Gasto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoordendetaprodugasto=productoordendetaprodugastoAux;
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
      		//this.finishProcessProductoOrdenDetaProduGasto();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal) throws Exception {
		
		if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal) throws Exception {	
		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OrdenDetaProduDetalleFormJInternalFrame.class)) {
				OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrameLocal=(OrdenDetaProduBeanSwingJInternalFrame) ((OrdenDetaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ordendetaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.getordendetaprodu(),true);
				ordendetaproduBeanSwingJInternalFrameLocal.actualizarLista(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu,this.ordendetaprodusForeignKey);

				ordendetaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				productoordendetaprodugastoLocal.setOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey("Formulario");
				this.setActualOrdenDetaProduForeignKey(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGastoProduEmpresaDetalleFormJInternalFrame.class)) {
				TipoGastoProduEmpresaBeanSwingJInternalFrame tipogastoproduempresaBeanSwingJInternalFrameLocal=(TipoGastoProduEmpresaBeanSwingJInternalFrame) ((TipoGastoProduEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogastoproduempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGastoProduEmpresa(tipogastoproduempresaBeanSwingJInternalFrameLocal.gettipogastoproduempresa(),true);
				tipogastoproduempresaBeanSwingJInternalFrameLocal.actualizarLista(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa,this.tipogastoproduempresasForeignKey);

				tipogastoproduempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa);

				productoordendetaprodugastoLocal.setTipoGastoProduEmpresa(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa);

				this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
				this.cargarCombosFrameTipoGastoProduEmpresasForeignKey("Formulario");
				this.setActualTipoGastoProduEmpresaForeignKey(tipogastoproduempresaBeanSwingJInternalFrameLocal.tipogastoproduempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				productoordendetaprodugastoLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				productoordendetaprodugastoLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteproveedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteproveedorBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteproveedorBeanSwingJInternalFrameLocal.actualizarLista(clienteproveedorBeanSwingJInternalFrameLocal.cliente,this.clienteproveedorsForeignKey);

				clienteproveedorBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteproveedorBeanSwingJInternalFrameLocal.cliente);

				productoordendetaprodugastoLocal.setClienteProveedor(clienteproveedorBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyClienteProveedor();
				this.cargarCombosFrameClienteProveedorsForeignKey("Formulario");
				this.setActualClienteProveedorForeignKey(clienteproveedorBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				productoordendetaprodugastoLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoordendetaprodugastoLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoOrdenDetaProduGastoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoordendetaprodugastoValidator.getInvalidValues(this.productoordendetaprodugasto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoOrdenDetaProduGasto productoordendetaprodugasto,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos) throws Exception {
		try	{		
			ProductoOrdenDetaProduGastoConstantesFunciones.actualizarLista(productoordendetaprodugasto,productoordendetaprodugastos,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoOrdenDetaProduGasto productoordendetaprodugasto,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos) throws Exception {
		try	{			
			ProductoOrdenDetaProduGastoConstantesFunciones.actualizarSelectedLista(productoordendetaprodugasto,productoordendetaprodugastos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoordendetaprodugastosLocal=this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoordendetaprodugastosLocal=this.productoordendetaprodugastos;
			}
			//ARCHITECTURE
		
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal:productoordendetaprodugastosLocal) {
				if(this.permiteMantenimiento(productoordendetaprodugastoLocal) && productoordendetaprodugastoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.getProductoOrdenDetaProduGastoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDORDENDETAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_orden_deta_produProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDTIPOGASTOPRODUEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDCLIENTEPROVEEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_facturaProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_unidadProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcantidadProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcostoProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcosto_totalProductoOrdenDetaProduGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduGastoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabeldescripcionProductoOrdenDetaProduGasto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_orden_deta_produProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_facturaProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelid_unidadProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcantidadProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcostoProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcosto_totalProductoOrdenDetaProduGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabeldescripcionProductoOrdenDetaProduGasto,"");
		
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
		this.iIdNuevoProductoOrdenDetaProduGasto--;	
		
		
		this.productoordendetaprodugastoAux=new ProductoOrdenDetaProduGasto();
		
		this.productoordendetaprodugastoAux.setId(this.iIdNuevoProductoOrdenDetaProduGasto);
		this.productoordendetaprodugastoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().add(this.productoordendetaprodugastoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodugastos.add(this.productoordendetaprodugastoAux);
		}
		//ARCHITECTURE
		
		this.productoordendetaprodugasto=this.productoordendetaprodugastoAux;
		
		if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
		}
				
		//this.setDefaultControlesProductoOrdenDetaProduGasto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoOrdenDetaProduGasto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduGasto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduGasto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugastoBean,this.productoordendetaprodugasto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
			classes=ProductoOrdenDetaProduGastoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.procesarEventosProductoOrdenDetaProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this.productoordendetaprodugasto,this.productoordendetaprodugastoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduGasto,classes);//this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGasto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral,this.productoordendetaprodugastoBean,false);
		
		if(this.productoordendetaprodugastoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto());
		}
		
		if(this.productoordendetaprodugastoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto(),classes);//this.productoordendetaprodugastoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduGasto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoOrdenDetaProduGasto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.RecargarFormProductoOrdenDetaProduGasto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
						
			if(productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();
			}
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduGasto();
			
			this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduGasto(), this.getIndiceNuevoProductoOrdenDetaProduGasto());
			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
						
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarcantidadProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarcostoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activardescripcionProductoOrdenDetaProduGasto);	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_cliente_proveedorProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_facturaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setEnabled(isHabilitar && this.productoordendetaprodugastoConstantesFunciones.activarid_unidadProductoOrdenDetaProduGasto);
	};
	
	public void setDefaultControlesProductoOrdenDetaProduGasto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduGasto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(true);			
			this.productoordendetaprodugastoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setVisible(true);
			
					
		} else {
			//this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(false);			
			this.productoordendetaprodugastoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoOrdenDetaProduGasto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				if(productoordendetaprodugastoAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduGasto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastos) {
				if(productoordendetaprodugastoAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduGasto)) {
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
	
	public int getIndiceActualProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				if(productoordendetaprodugastoAux.getId().equals(productoordendetaprodugasto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastos) {
				if(productoordendetaprodugastoAux.getId().equals(productoordendetaprodugasto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugastoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				if(productoordendetaprodugastoAux.getProductoOrdenDetaProduGastoOriginal().getId().equals(productoordendetaprodugastoOriginal.getId())) {
					existe=true;
					productoordendetaprodugastoOriginal.setId(productoordendetaprodugastoAux.getId());
					productoordendetaprodugastoOriginal.setVersionRow(productoordendetaprodugastoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastos) {
				if(productoordendetaprodugastoAux.getProductoOrdenDetaProduGastoOriginal().getId().equals(productoordendetaprodugastoOriginal.getId())) {
					existe=true;
					productoordendetaprodugastoOriginal.setId(productoordendetaprodugastoAux.getId());
					productoordendetaprodugastoOriginal.setVersionRow(productoordendetaprodugastoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoOrdenDetaProduGasto(Boolean esParaCancelar) throws Exception {
		productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
		productoordendetaprodugastoAux=new ProductoOrdenDetaProduGasto();
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
					if(productoordendetaprodugastoAux.getId()<0) {
						productoordendetaprodugastosAux.add(productoordendetaprodugastoAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduGasto=0L;
				this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().removeAll(productoordendetaprodugastosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastos) {
					if(productoordendetaprodugastoAux.getId()<0) {
						productoordendetaprodugastosAux.add(productoordendetaprodugastoAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduGasto=0L;
				this.productoordendetaprodugastos.removeAll(productoordendetaprodugastosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduGasto 
					&& this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()>0
					) {
					productoordendetaprodugastoAux=this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().get(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size() - 1);
				
					if(productoordendetaprodugastoAux.getId()<0) {
						this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().remove(productoordendetaprodugastoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduGasto && this.productoordendetaprodugastos.size()>0) {
					productoordendetaprodugastoAux=this.productoordendetaprodugastos.get(this.productoordendetaprodugastos.size() - 1);
				
					if(productoordendetaprodugastoAux.getId()<0) {
						this.productoordendetaprodugastos.remove(productoordendetaprodugastoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoOrdenDetaProduGasto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoordendetaprodugasto.getId()<0) {
				this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().remove(this.productoordendetaprodugasto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoordendetaprodugasto.getId()<0) {
				this.productoordendetaprodugastos.remove(this.productoordendetaprodugasto);
			}
		}			
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduGasto(List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosAux) throws Exception {
		ProductoOrdenDetaProduGastoConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduGasto(productoordendetaprodugastosAux);
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux) throws Exception {
		ProductoOrdenDetaProduGastoConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduGasto(productoordendetaprodugastoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoOrdenDetaProduGastoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoOrdenDetaProduGastoActual()) {
				if(!this.isEsNuevoProductoOrdenDetaProduGasto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoOrdenDetaProduGasto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoOrdenDetaProduGastoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden  Gasto ?", "MANTENIMIENTO DE Orden  Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoOrdenDetaProduGasto productoordendetaprodugasto) throws Exception {
		ProductoOrdenDetaProduGastoConstantesFunciones.seleccionarAsignar(this.productoordendetaprodugasto,productoordendetaprodugasto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoOrdenDetaProduGasto=this.isPermisoActualizarOriginalProductoOrdenDetaProduGasto;
			
			
			this.seleccionarAsignar(productoordendetaprodugasto);
			
			

			idClienteProveedorActual=productoordendetaprodugasto.getid_cliente_proveedor();
			this.seleccionarClienteProveedorActual();

			idFacturaActual=productoordendetaprodugasto.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduGastoConstantesFunciones.quitarEspaciosProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoordendetaprodugastoSessionBean.setsFuncionBusquedaRapida(this.productoordendetaprodugastoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoOrdenDetaProduGasto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoOrdenDetaProduGasto(esParaCancelar);				
				this.cancelarNuevoProductoOrdenDetaProduGasto(esParaCancelar);								
			}
			
			this.productoordendetaprodugasto=new ProductoOrdenDetaProduGasto();
			
			this.inicializarProductoOrdenDetaProduGasto();
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoOrdenDetaProduGasto() throws Exception {
		try {
			ProductoOrdenDetaProduGastoConstantesFunciones.inicializarProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoOrdenDetaProduGastos(String sAccionBusqueda,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoOrdenDetaProduGasto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoOrdenDetaProduGastoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoOrdenDetaProduGastoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoOrdenDetaProduGasto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden  Gastoes");		
		parameters.put("busquedapor", ProductoOrdenDetaProduGastoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoOrdenDetaProduGasto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoOrdenDetaProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoOrdenDetaProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoOrdenDetaProduGasto=new JRBeanArrayDataSource(ProductoOrdenDetaProduGastoJInternalFrame.TraerProductoOrdenDetaProduGastoBeans(productoordendetaprodugastosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoOrdenDetaProduGasto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoOrdenDetaProduGastoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoOrdenDetaProduGastoBean.TraerProductoOrdenDetaProduGastoBeans(productoordendetaprodugastosParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(null);
					//this.generarExcelReporteProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoOrdenDetaProduGastos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodugastosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoOrdenDetaProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduGastos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduGasto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoOrdenDetaProduGasto productoordendetaprodugasto : productoordendetaprodugastosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoOrdenDetaProduGastoConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduGasto("NORMAL",row,workbook,productoordendetaprodugasto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoOrdenDetaProduGasto(String sTipo,Row row,Workbook workbook) {
		
		ProductoOrdenDetaProduGastoConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduGasto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoOrdenDetaProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoOrdenDetaProduGasto productoordendetaprodugasto : productoordendetaprodugastosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.getProductoOrdenDetaProduGastoDescripcion(productoordendetaprodugasto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getordendetaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.gettipogastoproduempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getclienteproveedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodugasto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoOrdenDetaProduGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosRespaldo=null;
		
		classes=ProductoOrdenDetaProduGastoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoordendetaprodugastoLogic.setDatosCliente(this.datosCliente);
		this.productoordendetaprodugastoLogic.setDatosDeep(this.datosDeep);
		this.productoordendetaprodugastoLogic.setIsConDeep(true);
		
		productoordendetaprodugastosRespaldo=this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos();
		
		this.productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(productoordendetaprodugastosParaReportes);	
		this.productoordendetaprodugastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoordendetaprodugastosParaReportes=this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos();
		this.productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(productoordendetaprodugastosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduGasto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoOrdenDetaProduGasto productoordendetaprodugasto : productoordendetaprodugastosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoOrdenDetaProduGasto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoOrdenDetaProduGastoConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduGasto("NORMAL",row,workbook,productoordendetaprodugasto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.getProductoOrdenDetaProduGastoDescripcion(productoordendetaprodugasto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoOrdenDetaProduGasto() throws Exception {		
		this.startProcessProductoOrdenDetaProduGasto(true);
	}
	
	public void startProcessProductoOrdenDetaProduGasto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto ,this.jPanelParametrosReportesProductoOrdenDetaProduGasto, this.jScrollPanelDatosProductoOrdenDetaProduGasto,this.jPanelPaginacionProductoOrdenDetaProduGasto, this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto, this.jPanelAccionesProductoOrdenDetaProduGasto,this.jPanelAccionesFormularioProductoOrdenDetaProduGasto,this.jmenuBarProductoOrdenDetaProduGasto,this.jmenuBarDetalleProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduGasto=this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduGasto=this.jPanelParametrosReportesProductoOrdenDetaProduGasto;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduGasto=this.jScrollPanelDatosProductoOrdenDetaProduGasto;
		final JTable jTableDatosProductoOrdenDetaProduGasto=this.jTableDatosProductoOrdenDetaProduGasto;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduGasto=this.jPanelPaginacionProductoOrdenDetaProduGasto;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduGasto=this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto;
		final JPanel jPanelAccionesProductoOrdenDetaProduGasto=this.jPanelAccionesProductoOrdenDetaProduGasto;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduGasto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelCamposProductoOrdenDetaProduGasto;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelAccionesFormularioProductoOrdenDetaProduGasto;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduGasto=jPanelCamposAuxiliarProductoOrdenDetaProduGasto;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduGasto=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduGasto=this.jmenuBarProductoOrdenDetaProduGasto;
		final JToolBar jTtoolBarProductoOrdenDetaProduGasto=this.jTtoolBarProductoOrdenDetaProduGasto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jmenuBarDetalleProductoOrdenDetaProduGasto;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTtoolBarDetalleProductoOrdenDetaProduGasto;
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduGasto=jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduGasto=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduGasto;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduGasto;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduGasto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduGasto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduGasto;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduGasto ,jPanelParametrosReportesProductoOrdenDetaProduGasto,jTableDatosProductoOrdenDetaProduGasto, /*jScrollPanelDatosProductoOrdenDetaProduGasto,*/jPanelCamposProductoOrdenDetaProduGasto,jPanelPaginacionProductoOrdenDetaProduGasto, /*jScrollPanelDatosEdicionProductoOrdenDetaProduGasto,*/ jPanelAccionesProductoOrdenDetaProduGasto,jPanelAccionesFormularioProductoOrdenDetaProduGasto,jmenuBarProductoOrdenDetaProduGasto,jmenuBarDetalleProductoOrdenDetaProduGasto,jTtoolBarProductoOrdenDetaProduGasto,jTtoolBarDetalleProductoOrdenDetaProduGasto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduGasto ,jPanelParametrosReportesProductoOrdenDetaProduGasto, jScrollPanelDatosProductoOrdenDetaProduGasto,jPanelPaginacionProductoOrdenDetaProduGasto, jScrollPanelDatosEdicionProductoOrdenDetaProduGasto, jPanelAccionesProductoOrdenDetaProduGasto,jPanelAccionesFormularioProductoOrdenDetaProduGasto,jmenuBarProductoOrdenDetaProduGasto,jmenuBarDetalleProductoOrdenDetaProduGasto,jTtoolBarProductoOrdenDetaProduGasto,jTtoolBarDetalleProductoOrdenDetaProduGasto);
						
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
	
	public void finishProcessProductoOrdenDetaProduGasto() {// throws Exception 
		this.finishProcessProductoOrdenDetaProduGasto(true);
	}
	
	public void finishProcessProductoOrdenDetaProduGasto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto ,this.jPanelParametrosReportesProductoOrdenDetaProduGasto, this.jScrollPanelDatosProductoOrdenDetaProduGasto,this.jPanelPaginacionProductoOrdenDetaProduGasto, this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto, this.jPanelAccionesProductoOrdenDetaProduGasto,this.jPanelAccionesFormularioProductoOrdenDetaProduGasto,this.jmenuBarProductoOrdenDetaProduGasto,this.jmenuBarDetalleProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduGasto=this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduGasto=this.jPanelParametrosReportesProductoOrdenDetaProduGasto;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduGasto=this.jScrollPanelDatosProductoOrdenDetaProduGasto;
		final JTable jTableDatosProductoOrdenDetaProduGasto=this.jTableDatosProductoOrdenDetaProduGasto;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduGasto=this.jPanelPaginacionProductoOrdenDetaProduGasto;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduGasto=this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto;
		final JPanel jPanelAccionesProductoOrdenDetaProduGasto=this.jPanelAccionesProductoOrdenDetaProduGasto;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduGasto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelCamposProductoOrdenDetaProduGasto;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelAccionesFormularioProductoOrdenDetaProduGasto;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduGasto=jPanelCamposAuxiliarProductoOrdenDetaProduGasto;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduGasto=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduGasto;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduGasto=this.jmenuBarProductoOrdenDetaProduGasto;		
		final JToolBar jTtoolBarProductoOrdenDetaProduGasto=this.jTtoolBarProductoOrdenDetaProduGasto;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jmenuBarDetalleProductoOrdenDetaProduGasto;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTtoolBarDetalleProductoOrdenDetaProduGasto;		
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduGasto=jmenuBarDetalleAuxiliarProductoOrdenDetaProduGasto;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduGasto=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduGasto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduGasto;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduGasto;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduGasto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduGasto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduGasto;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoOrdenDetaProduGasto ,jPanelParametrosReportesProductoOrdenDetaProduGasto, jTableDatosProductoOrdenDetaProduGasto,/*jScrollPanelDatosProductoOrdenDetaProduGasto,*/jPanelCamposProductoOrdenDetaProduGasto,jPanelPaginacionProductoOrdenDetaProduGasto, /*jScrollPanelDatosEdicionProductoOrdenDetaProduGasto,*/ jPanelAccionesProductoOrdenDetaProduGasto,jPanelAccionesFormularioProductoOrdenDetaProduGasto,jmenuBarProductoOrdenDetaProduGasto,jmenuBarDetalleProductoOrdenDetaProduGasto,jTtoolBarProductoOrdenDetaProduGasto,jTtoolBarDetalleProductoOrdenDetaProduGasto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoOrdenDetaProduGasto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoOrdenDetaProduGasto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoOrdenDetaProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoOrdenDetaProduGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoOrdenDetaProduGasto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoOrdenDetaProduGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoOrdenDetaProduGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoOrdenDetaProduGasto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoordendetaprodugastoConstantesFunciones.getsFinalQueryProductoOrdenDetaProduGasto();
		String  finalQueryPaginacionTodos=this.productoordendetaprodugastoConstantesFunciones.getsFinalQueryProductoOrdenDetaProduGasto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoOrdenDetaProduGastoConstantesFunciones.getArrayColumnasGlobalesNoProductoOrdenDetaProduGasto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoOrdenDetaProduGastoConstantesFunciones.getArrayColumnasGlobalesProductoOrdenDetaProduGasto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoOrdenDetaProduGastoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoordendetaprodugastosEliminados= new ArrayList<ProductoOrdenDetaProduGasto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoOrdenDetaProduGasto();
		
				///*ProductoOrdenDetaProduGastoSessionBean*/this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			
			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
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
					this.iNumeroPaginacion=ProductoOrdenDetaProduGastoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoOrdenDetaProduGastoConstantesFunciones.getClassesForeignKeysOfProductoOrdenDetaProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoordendetaprodugasto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoordendetaprodugastosAux= new ArrayList<ProductoOrdenDetaProduGasto>();
			
				
			productoordendetaprodugastoLogic.setDatosCliente(this.datosCliente);
			productoordendetaprodugastoLogic.setDatosDeep(this.datosDeep);
			productoordendetaprodugastoLogic.setIsConDeep(true);
			
			
			productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoordendetaprodugastoLogic.getTodosProductoOrdenDetaProduGastos(finalQueryGlobal,pagination);
					
					//productoordendetaprodugastoLogic.getTodosProductoOrdenDetaProduGastosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null|| productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodugastosAux= new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux= new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodugastoLogic.getTodosProductoOrdenDetaProduGastos(finalQueryGlobal+"",this.pagination);												
							
							//productoordendetaprodugastoLogic.getTodosProductoOrdenDetaProduGastosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());					
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoOrdenDetaProduGasto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoOrdenDetaProduGasto=this.idActual;
				
				} else if(this.idProductoOrdenDetaProduGastoActual!=null && this.idProductoOrdenDetaProduGastoActual!=0L) {
					idProductoOrdenDetaProduGasto=idProductoOrdenDetaProduGastoActual;
				}
				
					
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndicePorId(idProductoOrdenDetaProduGasto);
				
				this.productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoordendetaprodugastoLogic.getEntity(idProductoOrdenDetaProduGasto);
					
					//productoordendetaprodugastoLogic.getEntityWithConnection(idProductoOrdenDetaProduGasto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().add(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGasto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
					this.productoordendetaprodugastos.add(productoordendetaprodugasto);
				}
				
				if(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGasto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdClienteProveedor")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdClienteProveedor(finalQueryGlobal,pagination,id_cliente_proveedorFK_IdClienteProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdClienteProveedor(finalQueryGlobal,pagination,id_cliente_proveedorFK_IdClienteProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdClienteProveedor(id_cliente_proveedorFK_IdClienteProveedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdClienteProveedor",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdClienteProveedor",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdCuentaContableCredito",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdCuentaContableCredito",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDebito")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdCuentaContableDebito",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdCuentaContableDebito",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdFactura",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdFactura",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdOrdenDetaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdOrdenDetaProdu",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdOrdenDetaProdu",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGastoProduEmpresa")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa(finalQueryGlobal,pagination,id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa(finalQueryGlobal,pagination,id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdTipoGastoProduEmpresa(id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdTipoGastoProduEmpresa",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdTipoGastoProduEmpresa",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()==null||productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodugastos==null|| productoordendetaprodugastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
						productoordendetaprodugastosAux.addAll(productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastosAux=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastosAux.addAll(productoordendetaprodugastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduGastoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdUnidad",productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduGastos("FK_IdUnidad",productoordendetaprodugastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(new ArrayList<ProductoOrdenDetaProduGasto>());
						productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().addAll(productoordendetaprodugastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastos=new ArrayList<ProductoOrdenDetaProduGasto>();
							productoordendetaprodugastos.addAll(productoordendetaprodugastosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduGasto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoOrdenDetaProduGasto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodugastos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodugastos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoOrdenDetaProduGasto productoordendetaprodugasto) {
		Boolean permite=true;
		
		if(this.productoordendetaprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoOrdenDetaProduGastoConstantesFunciones.getOrderByListaProductoOrdenDetaProduGasto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoOrdenDetaProduGastoConstantesFunciones.getOrderByListaProductoOrdenDetaProduGasto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				if(productoordendetaprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodugastoTotales=productoordendetaprodugasto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:this.productoordendetaprodugastos) {
				if(productoordendetaprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodugastoTotales=productoordendetaprodugasto;
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
			this.productoordendetaprodugastoAux=new ProductoOrdenDetaProduGasto();
			this.productoordendetaprodugastoAux.setsType(Constantes2.S_TOTALES);
			this.productoordendetaprodugastoAux.setIsNew(false);
			this.productoordendetaprodugastoAux.setIsChanged(false);
			this.productoordendetaprodugastoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoOrdenDetaProduGastoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduGasto(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this.productoordendetaprodugastoAux);
				
				this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().add(this.productoordendetaprodugastoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoOrdenDetaProduGastoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduGasto(this.productoordendetaprodugastos,this.productoordendetaprodugastoAux);
				
				this.productoordendetaprodugastos.add(this.productoordendetaprodugastoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoordendetaprodugastoTotales=new ProductoOrdenDetaProduGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().remove(productoordendetaprodugastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodugastos.remove(productoordendetaprodugastoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoordendetaprodugastoTotales=new ProductoOrdenDetaProduGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				if(productoordendetaprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodugastoTotales=productoordendetaprodugasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduGastoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduGasto(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),productoordendetaprodugastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:this.productoordendetaprodugastos) {
				if(productoordendetaprodugasto.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodugastoTotales=productoordendetaprodugasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduGastoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduGasto(this.productoordendetaprodugastos,productoordendetaprodugastoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoOrdenDetaProduGastosFK_IdClienteProveedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdClienteProveedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdOrdenDetaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGastoProduEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoOrdenDetaProduGastosFK_IdClienteProveedor(String sFinalQuery,Long id_cliente_proveedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdClienteProveedor(sFinalQuery,this.pagination,id_cliente_proveedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu(String sFinalQuery,Long id_orden_deta_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu(sFinalQuery,this.pagination,id_orden_deta_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa(String sFinalQuery,Long id_tipo_gasto_produ_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa(sFinalQuery,this.pagination,id_tipo_gasto_produ_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduGastosFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastosFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoOrdenDetaProduGasto() {
		this.isPermisoTodoProductoOrdenDetaProduGasto=false;
		this.isPermisoNuevoProductoOrdenDetaProduGasto=false;
		this.isPermisoActualizarProductoOrdenDetaProduGasto=false;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduGasto=false;
		this.isPermisoEliminarProductoOrdenDetaProduGasto=false;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto=false;
		this.isPermisoConsultaProductoOrdenDetaProduGasto=false;
		this.isPermisoBusquedaProductoOrdenDetaProduGasto=false;
		this.isPermisoReporteProductoOrdenDetaProduGasto=false;		
		this.isPermisoOrdenProductoOrdenDetaProduGasto=false;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto=false;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduGasto=false;
		this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto=false;
		this.isPermisoCopiarProductoOrdenDetaProduGasto=false;		
		this.isPermisoVerFormProductoOrdenDetaProduGasto=false;		
		this.isPermisoDuplicarProductoOrdenDetaProduGasto=false;		
		this.isPermisoOrdenProductoOrdenDetaProduGasto=false;		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduGasto(Boolean isPermiso) {
		this.isPermisoTodoProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoConsultaProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoBusquedaProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoReporteProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoCopiarProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoVerFormProductoOrdenDetaProduGasto=isPermiso;		
		this.isPermisoDuplicarProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduGasto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoOrdenDetaProduGasto(Boolean isPermiso) {
		//this.isPermisoTodoProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduGasto=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto=isPermiso;
		//this.isPermisoConsultaProductoOrdenDetaProduGasto=isPermiso;
		//this.isPermisoBusquedaProductoOrdenDetaProduGasto=isPermiso;
		//this.isPermisoReporteProductoOrdenDetaProduGasto=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduGasto=isPermiso;		
		//this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto=isPermiso;		
		//this.isPermisoPaginacionAltoProductoOrdenDetaProduGasto=isPermiso;		
		//this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto=isPermiso;		
		//this.isPermisoCopiarProductoOrdenDetaProduGasto=isPermiso;		
		//this.isPermisoDuplicarProductoOrdenDetaProduGasto=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduGasto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduGastoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoOrdenDetaProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduGastoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoOrdenDetaProduGastoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoOrdenDetaProduGastoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduGastoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduGasto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoOrdenDetaProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoOrdenDetaProduGastoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoOrdenDetaProduGasto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoOrdenDetaProduGasto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoOrdenDetaProduGasto=this.isPermisoActualizarProductoOrdenDetaProduGasto;
			this.isPermisoEliminarProductoOrdenDetaProduGasto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoOrdenDetaProduGasto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoOrdenDetaProduGasto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoOrdenDetaProduGasto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoOrdenDetaProduGasto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoOrdenDetaProduGasto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoOrdenDetaProduGasto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoOrdenDetaProduGasto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoOrdenDetaProduGasto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoOrdenDetaProduGasto.setToolTipText(this.jTableDatosProductoOrdenDetaProduGasto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoOrdenDetaProduGasto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoOrdenDetaProduGasto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoOrdenDetaProduGasto() throws Exception {
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
	public void inicializarCombosForeignKeyProductoOrdenDetaProduGastoListas()throws Exception {
		try	{						
			
				this.ordendetaprodusForeignKey=new ArrayList();
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
	
	public void cargarCombosTodosForeignKeyProductoOrdenDetaProduGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoOrdenDetaProduGastoListas(false);
			} else {
			
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	

	public void cargarCombosForeignKeyOrdenDetaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoOrdenDetaProduGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoReturnGeneral=new ProductoOrdenDetaProduGastoParameterReturnGeneral();
						
			


				String finalQueryGlobalOrdenDetaProdu="";

				if(((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOrdenDetaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalOrdenDetaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalOrdenDetaProdu, "");
						finalQueryGlobalOrdenDetaProdu+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOrdenDetaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidOrdenDetaProduActual();
					}
				} else {
					finalQueryGlobalOrdenDetaProdu="NONE";
				}


				String finalQueryGlobalTipoGastoProduEmpresa="";

				if(((this.tipogastoproduempresasForeignKey==null||this.tipogastoproduempresasForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGastoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGastoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGastoProduEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGastoProduEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGastoProduEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGastoProduEmpresa, "");
						finalQueryGlobalTipoGastoProduEmpresa+=TipoGastoProduEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGastoProduEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGastoProduEmpresa=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidTipoGastoProduEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoGastoProduEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}


				String finalQueryGlobalClienteProveedor="";

				if(((this.clienteproveedorsForeignKey==null||this.clienteproveedorsForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalClienteProveedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalClienteProveedor=Funciones.GetFinalQueryAppend(finalQueryGlobalClienteProveedor, "");
						finalQueryGlobalClienteProveedor+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClienteProveedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalClienteProveedor=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidClienteProveedorActual();
					}
				} else {
					finalQueryGlobalClienteProveedor="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_facturaProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_facturaProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoordendetaprodugastoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduGasto)
					 || (this.esRecargarFks && this.productoordendetaprodugastoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduGasto)) {

					if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodugastoSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.cargarCombosLoteForeignKeyProductoOrdenDetaProduGasto(finalQueryGlobalOrdenDetaProdu,finalQueryGlobalTipoGastoProduEmpresa,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito,finalQueryGlobalClienteProveedor,finalQueryGlobalFactura,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOrdenDetaProdu.equals("NONE")) {
				this.ordendetaprodusForeignKey=productoordendetaprodugastoReturnGeneral.getordendetaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoGastoProduEmpresa.equals("NONE")) {
				this.tipogastoproduempresasForeignKey=productoordendetaprodugastoReturnGeneral.gettipogastoproduempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=productoordendetaprodugastoReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=productoordendetaprodugastoReturnGeneral.getcuentacontablecreditosForeignKey();
			}

			if(!finalQueryGlobalClienteProveedor.equals("NONE")) {
				this.clienteproveedorsForeignKey=productoordendetaprodugastoReturnGeneral.getclienteproveedorsForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=productoordendetaprodugastoReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoordendetaprodugastoReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduGasto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
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
	
	



	public void addItemDefectoCombosForeignKeyOrdenDetaProdu()throws Exception {
		try {
			if(this.productoordendetaprodugastoSessionBean==null) {
				this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				OrdenDetaProdu ordendetaprodu=new OrdenDetaProdu();
				OrdenDetaProduConstantesFunciones.setOrdenDetaProduDescripcion(ordendetaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				ordendetaprodu.setId(null);

				if(!OrdenDetaProduConstantesFunciones.ExisteEnLista(this.ordendetaprodusForeignKey,ordendetaprodu,true)) {

					this.ordendetaprodusForeignKey.add(0,ordendetaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa()) {
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

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
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

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
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

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionClienteProveedor()) {
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

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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

			if(!this.productoordendetaprodugastoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduGasto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduGasto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduGasto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto)throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(productoordendetaprodugasto.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoGastoProduEmpresaForeignKey(productoordendetaprodugasto.getid_tipo_gasto_produ_empresa(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(productoordendetaprodugasto.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(productoordendetaprodugasto.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualClienteProveedorForeignKey(productoordendetaprodugasto.getid_cliente_proveedor(),false,"Formulario");
			this.setActualFacturaForeignKey(productoordendetaprodugasto.getid_factura(),false,"Formulario");
			this.setActualUnidadForeignKey(productoordendetaprodugasto.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoordendetaprodugasto.getClienteProveedor()!=null && !sTipoEvento.equals("id_cliente_proveedorProductoOrdenDetaProduGasto")) { //sTipoEvento Evita Bucle Infinito

					this.clienteproveedorsForeignKey=new ArrayList<Cliente>();
					this.clienteproveedorsForeignKey.add(productoordendetaprodugasto.getClienteProveedor());

					this.addItemDefectoCombosForeignKeyClienteProveedor();
					this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
				}

				if(productoordendetaprodugasto.getFactura()!=null && !sTipoEvento.equals("id_facturaProductoOrdenDetaProduGasto")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(productoordendetaprodugasto.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoOrdenDetaProduGasto()throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoGastoProduEmpresaForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_tipo_gasto_produ_empresa(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualClienteProveedorForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_cliente_proveedor(),false,"Formulario");
			this.setActualFacturaForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoordendetaprodugastoConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduGasto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoOrdenDetaProduGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoOrdenDetaProduGasto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduGasto()throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
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
	
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);
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
	
	public void setItemDefectoCombosForeignKeyProductoOrdenDetaProduGasto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean(); 
		this.productoordendetaprodugastoConstantesFunciones=new ProductoOrdenDetaProduGastoConstantesFunciones(); 
		this.productoordendetaprodugastoBean=new ProductoOrdenDetaProduGasto();//(this.productoordendetaprodugastoConstantesFunciones); 		
		this.productoordendetaprodugastoReturnGeneral=new ProductoOrdenDetaProduGastoParameterReturnGeneral(); 
		
		this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoOrdenDetaProduGasto(true);
			
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
			
			this.productoordendetaprodugastoConstantesFunciones=new ProductoOrdenDetaProduGastoConstantesFunciones(); 
			this.productoordendetaprodugastoBean=new ProductoOrdenDetaProduGasto();//this.productoordendetaprodugastoConstantesFunciones); 			
			this.productoordendetaprodugastoReturnGeneral=new ProductoOrdenDetaProduGastoParameterReturnGeneral(); 
		
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden  Gasto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoordendetaprodugasto=new ProductoOrdenDetaProduGasto();
			this.productoordendetaprodugastos = new ArrayList<ProductoOrdenDetaProduGasto>();
			this.productoordendetaprodugastosAux = new ArrayList<ProductoOrdenDetaProduGasto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic=new ProductoOrdenDetaProduGastoLogic();
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			//this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto);	
					}
					
					if(this.jInternalFrameImportacionProductoOrdenDetaProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduGasto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoOrdenDetaProduGasto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setVisible(false);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoOrdenDetaProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduGasto);
					this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setVisible(false);
					this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduGasto);
					this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setVisible(false);
					this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoOrdenDetaProduGastoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoOrdenDetaProduGastoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoordendetaprodugastoReturnGeneral=new ProductoOrdenDetaProduGastoParameterReturnGeneral();
			
			this.productoordendetaprodugastoParameterGeneral=new ProductoOrdenDetaProduGastoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoordendetaprodugastoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			
			
			this.isVisibilidadFK_IdClienteProveedor=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdOrdenDetaProdu=true;
			this.isVisibilidadFK_IdTipoGastoProduEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoOrdenDetaProduGasto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoOrdenDetaProduGasto(false);
			
			this.setPermisosUsuarioProductoOrdenDetaProduGasto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() 
				|| (this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoOrdenDetaProduGastoClasesRelacionadas();
			}
			
			if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduGastoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduGasto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduGasto();
			}
			
			if(!this.isPermisoBusquedaProductoOrdenDetaProduGasto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto,this.isPermisoPaginacionMedioProductoOrdenDetaProduGasto,this.isPermisoPaginacionTodoProductoOrdenDetaProduGasto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoOrdenDetaProduGastoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduGasto());
				
				this.tiposColumnasSelect=ProductoOrdenDetaProduGastoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduGasto(true);
				
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
			//if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoOrdenDetaProduGasto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoOrdenDetaProduGasto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoOrdenDetaProduGasto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduGasto() ;
			
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
			
			this.ordendetaproduLogic=new OrdenDetaProduLogic();
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
				productoordendetaprodugastoImplementable= (ProductoOrdenDetaProduGastoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoordendetaprodugastoImplementableHome= (ProductoOrdenDetaProduGastoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoordendetaprodugastos= new ArrayList<ProductoOrdenDetaProduGasto>();
			this.productoordendetaprodugastosEliminados= new ArrayList<ProductoOrdenDetaProduGasto>();
						
			this.isEsNuevoProductoOrdenDetaProduGasto=false;
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduGasto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteProveedorActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>() ;
			this.tipogastoproduempresasForeignKey=new ArrayList<TipoGastoProduEmpresa>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			this.clienteproveedorsForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoOrdenDetaProduGasto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoOrdenDetaProduGasto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoOrdenDetaProduGastoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoOrdenDetaProduGasto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoOrdenDetaProduGasto();
			}
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoOrdenDetaProduGasto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoOrdenDetaProduGasto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoOrdenDetaProduGasto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoOrdenDetaProduGasto")) {
				iIndex=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoOrdenDetaProduGasto();	
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
	
	public void cargarCombosForeignKeyProductoOrdenDetaProduGasto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoOrdenDetaProduGasto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoOrdenDetaProduGasto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoOrdenDetaProduGastoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduGasto();
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduGasto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduGasto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduGasto();
		}
	}
	
	

	public void cargarCombosForeignKeyOrdenDetaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOrdenDetaProdu(this.ordendetaprodusForeignKey);

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
	
	public void jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			
			if(jTableDatosProductoOrdenDetaProduGasto.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduGasto.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduGasto.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoOrdenDetaProduGasto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduGasto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(true);			
			//this.productoordendetaprodugasto=new ProductoOrdenDetaProduGasto();
			//this.productoordendetaprodugasto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto() ;
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduGasto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoordendetaprodugasto);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);				
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoOrdenDetaProduGasto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRows().length;			
			}
			
			productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoOrdenDetaProduGasto--;			
				//ProductoOrdenDetaProduGasto productoordendetaprodugastoAux= new ProductoOrdenDetaProduGasto();			
				//productoordendetaprodugastoAux.setId(this.iIdNuevoProductoOrdenDetaProduGasto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoOrdenDetaProduGasto productoordendetaprodugastoOrigen=new ProductoOrdenDetaProduGasto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoOrigen : productoordendetaprodugastosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoordendetaprodugastoOrigen =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodugastoOrigen =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduGasto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoordendetaprodugasto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoOrdenDetaProduGasto(productoordendetaprodugastoOrigen,this.productoordendetaprodugasto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().add(this.productoordendetaprodugastoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugastos.add(this.productoordendetaprodugastoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
				
				this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduGasto(), this.getIndiceNuevoProductoOrdenDetaProduGasto());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();									
		
			ProductoOrdenDetaProduGasto productoordendetaprodugastoOrigen=new ProductoOrdenDetaProduGasto();
			ProductoOrdenDetaProduGasto productoordendetaprodugastoDestino=new ProductoOrdenDetaProduGasto();
				
			productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoordendetaprodugastosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoOrigen =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodugastoOrigen =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodugastoDestino =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodugastoDestino =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoordendetaprodugastoOrigen =productoordendetaprodugastosSeleccionados.get(0);
				productoordendetaprodugastoDestino =productoordendetaprodugastosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoOrdenDetaProduGasto(productoordendetaprodugastoOrigen,productoordendetaprodugastoDestino,true,false);
				
				productoordendetaprodugastoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodugastoDestino,productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodugastoDestino,productoordendetaprodugastos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
				
				//this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduGasto(), this.getIndiceNuevoProductoOrdenDetaProduGasto());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoOrdenDetaProduGasto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(!isVisible);
			this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(!isVisible);
			this.jPanelAccionesProductoOrdenDetaProduGasto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoOrdenDetaProduGasto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoOrdenDetaProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoOrdenDetaProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoOrdenDetaProduGasto();
			
			this.abrirFrameOrderByProductoOrdenDetaProduGasto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoOrdenDetaProduGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoOrdenDetaProduGasto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduGasto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.isMaximum()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSize(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.iWidthFormulario,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.isMaximum()) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jContentPaneDetalleProductoOrdenDetaProduGasto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jContentPaneDetalleProductoOrdenDetaProduGasto.getWidth(),ProductoOrdenDetaProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jContentPaneDetalleProductoOrdenDetaProduGasto.getWidth(),ProductoOrdenDetaProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jContentPaneDetalleProductoOrdenDetaProduGasto.getWidth(),ProductoOrdenDetaProduGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setVisible(true);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoOrdenDetaProduGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoOrdenDetaProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,false,this);
				} else {
					this.jInternalFrameOrderByProductoOrdenDetaProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduGasto);
				this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setVisible(false);
				this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setSelected(false);
				
				this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduGasto"));
				
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduGasto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoOrdenDetaProduGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoOrdenDetaProduGasto==null) {
				
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto=new ImportacionJInternalFrame(ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduGasto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduGasto);
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setVisible(false);
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSelected(false);


				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduGasto"));
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduGasto"));
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduGasto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduGasto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto==null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduGasto"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduGasto"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduGasto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduGasto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoOrdenDetaProduGasto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduGasto);
			
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setVisible(false);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.dispose();
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoOrdenDetaProduGasto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoOrdenDetaProduGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setVisible(true);
	        this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoOrdenDetaProduGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setVisible(true);
	        this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoOrdenDetaProduGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setVisible(false);
	        this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoOrdenDetaProduGasto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoOrdenDetaProduGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setVisible(false);
	        this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cuenta Contable");


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
						TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoOrdenDetaProduGasto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoOrdenDetaProduGasto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(true);
			//this.isEsNuevoProductoOrdenDetaProduGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false) ;
			
			if(productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduGasto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoOrdenDetaProduGastoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoOrdenDetaProduGasto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(true);
			//this.isEsNuevoProductoOrdenDetaProduGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoordendetaprodugasto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false) ;
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduGasto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("ClienteProveedor")) {
				if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoOrdenDetaProduGasto) {
					this.cargarCombosClienteProveedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
					this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente_proveedor (id);

				this.recargarComboTablaClienteProveedor(this.clienteproveedorsForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_facturaProductoOrdenDetaProduGasto) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOrdenDetaProdu(List<OrdenDetaProdu> ordendetaprodusForeignKey)throws Exception{
		TableColumn tableColumnOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU));
		TableCellEditor tableCellEditorOrdenDetaProdu =tableColumnOrdenDetaProdu.getCellEditor();

		OrdenDetaProduTableCell ordendetaproduTableCellFk=(OrdenDetaProduTableCell)tableCellEditorOrdenDetaProdu;

		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.setordendetaprodusForeignKey(ordendetaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ordendetaproduTableCellFk.setRowActual(intSelectedRow);
			//ordendetaproduTableCellFk.setordendetaprodusForeignKeyActual(ordendetaprodusForeignKey);
		//}


		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.RecargarOrdenDetaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGastoProduEmpresa(List<TipoGastoProduEmpresa> tipogastoproduempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoGastoProduEmpresa=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA));
		TableCellEditor tableCellEditorTipoGastoProduEmpresa =tableColumnTipoGastoProduEmpresa.getCellEditor();

		TipoGastoProduEmpresaTableCell tipogastoproduempresaTableCellFk=(TipoGastoProduEmpresaTableCell)tableCellEditorTipoGastoProduEmpresa;

		if(tipogastoproduempresaTableCellFk!=null) {
			tipogastoproduempresaTableCellFk.settipogastoproduempresasForeignKey(tipogastoproduempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
		TableColumn tableColumnClienteProveedor=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR));
		TableCellEditor tableCellEditorClienteProveedor =tableColumnClienteProveedor.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorClienteProveedor;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clienteproveedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
		TableColumn tableColumnFactura=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

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
	
	public void jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduGasto(false);
			
			//if(!this.isEsNuevoProductoOrdenDetaProduGasto) {								
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				
			}
			
			if(this.permiteMantenimiento(this.productoordendetaprodugasto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoOrdenDetaProduGasto=true;
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
					this.isEsNuevoProductoOrdenDetaProduGasto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoOrdenDetaProduGasto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoOrdenDetaProduGasto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(false);
			
												
				
				if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoOrdenDetaProduGasto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,productoordendetaprodugastoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoordendetaprodugastoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoordendetaprodugasto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodugasto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodugasto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoordendetaprodugasto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoOrdenDetaProduGastoModel) this.jTableDatosProductoOrdenDetaProduGasto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoOrdenDetaProduGasto=true;
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
				this.isEsNuevoProductoOrdenDetaProduGasto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(false);
				
				
				
				if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoOrdenDetaProduGasto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoOrdenDetaProduGasto.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduGasto.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduGasto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduGasto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(false) ;
			
			this.isEsNuevoProductoOrdenDetaProduGasto=false;
			
			if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoOrdenDetaProduGasto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				
				//SI ES MANUAL
				if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoOrdenDetaProduGasto--;			
			//ProductoOrdenDetaProduGasto productoordendetaprodugastoAux= new ProductoOrdenDetaProduGasto();			
			//productoordendetaprodugastoAux.setId(this.iIdNuevoProductoOrdenDetaProduGasto);
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduGasto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
			
			this.productoordendetaprodugasto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().add(this.productoordendetaprodugastoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoordendetaprodugastos.add(this.productoordendetaprodugastoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			
			this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduGasto(), this.getIndiceNuevoProductoOrdenDetaProduGasto());
			
			int iLastRow =  this.jTableDatosProductoOrdenDetaProduGasto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduGasto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoOrdenDetaProduGasto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();
			}
			
			//this.abrirFrameTreeProductoOrdenDetaProduGasto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden  GastoES ?", "MANTENIMIENTO DE Orden  Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoOrdenDetaProduGasto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.procesarImportacionProductoOrdenDetaProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoordendetaprodugastoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoOrdenDetaProduGastoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setFileImportacion(this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoOrdenDetaProduGasto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		

		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduGastoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoOrdenDetaProduGastoBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_OrdenDetaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_OrdenDetaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_OrdenDetaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_OrdenDetaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGastoProduEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGastoProduEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGastoProduEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGastoProduEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ClienteProveedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ClienteProveedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ClienteProveedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ClienteProveedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoria="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					sNombreCampoCategoria="id_tipo_gasto_produ_empresa";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					sNombreCampoCategoria="id_cliente_proveedor";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoriaValor="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_gasto_produ_empresa";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					sNombreCampoCategoriaValor="id_cliente_proveedor";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden Deta Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_orden_deta_produ");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Gasto Produ Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_gasto_produ_empresa");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente Proveedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente_proveedor");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getordendetaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.gettipogastoproduempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getclienteproveedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodugasto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoOrdenDetaProduGasto(row);				
			//	iRow++;
			//}				
			
			//for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoOrdenDetaProduGasto(productoordendetaprodugastoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduGasto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduGasto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoOrdenDetaProduGasto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoOrdenDetaProduGasto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoOrdenDetaProduGasto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoOrdenDetaProduGasto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoOrdenDetaProduGasto.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoOrdenDetaProduGasto.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoOrdenDetaProduGasto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduGasto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoOrdenDetaProduGasto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduGasto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoOrdenDetaProduGasto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduGasto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduGasto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoOrdenDetaProduGasto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto();
		
		this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduGasto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduGasto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduGasto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduGasto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduGasto(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduGasto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduGasto() throws Exception {
		try	{
			if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduGasto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduGasto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduGasto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduGasto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduGasto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoOrdenDetaProduGastoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduGasto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoOrdenDetaProduGastoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduGasto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoOrdenDetaProduGastoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduGasto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduGasto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_cliente_proveedorFK_IdClienteProveedor=((Cliente)this.jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_cuenta_contable_debitoFK_IdCuentaContableDebito=((CuentaContable)this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_orden_deta_produFK_IdOrdenDetaProdu=((OrdenDetaProdu)this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa=((TipoGastoProduEmpresa)this.jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoOrdenDetaProduGasto(Boolean esInicializar) throws Exception {				
		if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduGasto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduGasto() throws Exception {
		this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduGasto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoOrdenDetaProduGastoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGastoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoordendetaprodugastos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoOrdenDetaProduGasto.setModel(new ProductoOrdenDetaProduGastoModel(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoOrdenDetaProduGasto.setModel(new ProductoOrdenDetaProduGastoModel(this.productoordendetaprodugastos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto!=null && this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduGasto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodugastoConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduGasto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodugastoConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduGasto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID));

		if(this.productoordendetaprodugastoConstantesFunciones.mostraridProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltaridProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activaridProductoOrdenDetaProduGasto,iSizeTabla,this,true,"idProductoOrdenDetaProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltaridProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activaridProductoOrdenDetaProduGasto,this,true,"idProductoOrdenDetaProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduGasto,true,"id_orden_deta_produProductoOrdenDetaProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGastoProduEmpresaTableCell(this.tipogastoproduempresasForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new TipoGastoProduEmpresaTableCell(this.tipogastoproduempresasForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,true,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoOrdenDetaProduGasto,true,"id_cuenta_contable_debitoProductoOrdenDetaProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoOrdenDetaProduGasto,true,"id_cuenta_contable_creditoProductoOrdenDetaProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clienteproveedorsForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cliente_proveedorProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clienteproveedorsForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_cliente_proveedorProductoOrdenDetaProduGasto,true,"id_cliente_proveedorProductoOrdenDetaProduGasto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_facturaProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_facturaProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_facturaProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_facturaProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_facturaProductoOrdenDetaProduGasto,true,"id_facturaProductoOrdenDetaProduGasto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_unidadProductoOrdenDetaProduGasto,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodugastoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduGasto,this,this.productoordendetaprodugastoConstantesFunciones.activarid_unidadProductoOrdenDetaProduGasto,true,"id_unidadProductoOrdenDetaProduGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcantidadProductoOrdenDetaProduGasto,iSizeTabla,this,true,"cantidadProductoOrdenDetaProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcantidadProductoOrdenDetaProduGasto,this,true,"cantidadProductoOrdenDetaProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarcostoProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcostoProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcostoProductoOrdenDetaProduGasto,iSizeTabla,this,true,"costoProductoOrdenDetaProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcostoProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcostoProductoOrdenDetaProduGasto,this,true,"costoProductoOrdenDetaProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduGasto,iSizeTabla,this,true,"costo_totalProductoOrdenDetaProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduGasto,this,true,"costo_totalProductoOrdenDetaProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoordendetaprodugastoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activardescripcionProductoOrdenDetaProduGasto,iSizeTabla,this,true,"descripcionProductoOrdenDetaProduGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodugastoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduGasto,this.productoordendetaprodugastoConstantesFunciones.activardescripcionProductoOrdenDetaProduGasto,this,true,"descripcionProductoOrdenDetaProduGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduGasto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduGasto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoOrdenDetaProduGasto.addColumn(tableColumn);
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
			
			this.jTableDatosProductoOrdenDetaProduGasto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoOrdenDetaProduGasto.moveColumn(this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoOrdenDetaProduGasto.moveColumn(this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoOrdenDetaProduGasto.moveColumn(this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoOrdenDetaProduGasto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoOrdenDetaProduGasto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoOrdenDetaProduGasto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoOrdenDetaProduGasto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoOrdenDetaProduGasto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoOrdenDetaProduGasto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoordendetaprodugastos.size()-1;
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
		//this.jTableDatosProductoOrdenDetaProduGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduGasto();
			
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
				
				//this.isEsNuevoProductoOrdenDetaProduGasto=false;
					
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
				if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoordendetaprodugasto.getsType().equals("DUPLICADO")
				   || this.productoordendetaprodugasto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoOrdenDetaProduGasto=true;
				
				} else {
					this.isEsNuevoProductoOrdenDetaProduGasto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					if(this.productoordendetaprodugasto.getId()>=0 && !this.productoordendetaprodugasto.getIsNew()) {						
						this.isEsNuevoProductoOrdenDetaProduGasto=false;
						
					} else {
						this.isEsNuevoProductoOrdenDetaProduGasto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduGasto(esRelaciones);						
				
				this.seleccionarProductoOrdenDetaProduGasto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoordendetaprodugasto.getId()<0) {
					this.isEsNuevoProductoOrdenDetaProduGasto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoOrdenDetaProduGasto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoOrdenDetaProduGasto(evt,rowIndex);
				}	
				
				if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoOrdenDetaProduGasto: " + this.dDif); 
					}
				}								
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoOrdenDetaProduGasto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoordendetaprodugasto)) {
					if(this.productoordendetaprodugasto.getId()>0) {
						this.productoordendetaprodugasto.setIsDeleted(true);
						
						this.productoordendetaprodugastosEliminados.add(this.productoordendetaprodugasto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().remove(this.productoordendetaprodugasto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugastos.remove(this.productoordendetaprodugasto);				
					}
					
					
					((ProductoOrdenDetaProduGastoModel) this.jTableDatosProductoOrdenDetaProduGasto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoOrdenDetaProduGasto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoOrdenDetaProduGasto) {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}
				
				//ARCHITECTURE
				try {
					

					//OrdenDetaProdu
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_orden_deta_produProductoOrdenDetaProduGasto) {
						//this.cargarCombosOrdenDetaProdusForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_orden_deta_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

						if(productoordendetaprodugasto.getOrdenDetaProdu()!=null) {
							this.ordendetaprodusForeignKey.add(productoordendetaprodugasto.getOrdenDetaProdu());
						}

						this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
						this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
					}
					this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodugasto.getid_orden_deta_produ(),false,"Formulario");

					//TipoGastoProduEmpresa
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto) {
						//this.cargarCombosTipoGastoProduEmpresasForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.tipogastoproduempresasForeignKey=new ArrayList<TipoGastoProduEmpresa>();

						if(productoordendetaprodugasto.getTipoGastoProduEmpresa()!=null) {
							this.tipogastoproduempresasForeignKey.add(productoordendetaprodugasto.getTipoGastoProduEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
						this.cargarCombosFrameTipoGastoProduEmpresasForeignKey("Todos");
					}
					this.setActualTipoGastoProduEmpresaForeignKey(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa(),false,"Formulario");

					//CuentaContableDebito
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_debitoProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_cuenta_contable_debitoProductoOrdenDetaProduGasto) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(productoordendetaprodugasto.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(productoordendetaprodugasto.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.productoordendetaprodugasto.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_cuenta_contable_creditoProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_cuenta_contable_creditoProductoOrdenDetaProduGasto) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(productoordendetaprodugasto.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(productoordendetaprodugasto.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.productoordendetaprodugasto.getid_cuenta_contable_credito(),false,"Formulario");

					//ClienteProveedor
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_cliente_proveedorProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_cliente_proveedorProductoOrdenDetaProduGasto) {
						//this.cargarCombosClienteProveedorsForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_cliente_proveedor());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.clienteproveedorsForeignKey=new ArrayList<Cliente>();

						if(productoordendetaprodugasto.getClienteProveedor()!=null) {
							this.clienteproveedorsForeignKey.add(productoordendetaprodugasto.getClienteProveedor());
						}

						this.addItemDefectoCombosForeignKeyClienteProveedor();
						this.cargarCombosFrameClienteProveedorsForeignKey("Todos");
					}
					this.setActualClienteProveedorForeignKey(this.productoordendetaprodugasto.getid_cliente_proveedor(),false,"Formulario");

					//Factura
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_facturaProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_facturaProductoOrdenDetaProduGasto) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_factura());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(productoordendetaprodugasto.getFactura()!=null) {
							this.facturasForeignKey.add(productoordendetaprodugasto.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.productoordendetaprodugasto.getid_factura(),false,"Formulario");

					//Unidad
					if(!this.productoordendetaprodugastoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduGasto || this.productoordendetaprodugastoConstantesFunciones.event_dependid_unidadProductoOrdenDetaProduGasto) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoordendetaprodugasto.getid_unidad());
									//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoordendetaprodugasto.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoordendetaprodugasto.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoordendetaprodugasto.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduGasto(productoordendetaprodugasto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(productoordendetaprodugasto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduGasto(productoordendetaprodugasto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduGasto(productoordendetaprodugasto);
	}
	
	public void setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoordendetaprodugastoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoordendetaprodugastoLocal=this.productoordendetaprodugasto;
			} else {
				productoordendetaprodugastoLocal=this.productoordendetaprodugastoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoordendetaprodugastoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduGasto(productoordendetaprodugastoLocal,true);
					
					if(productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoordendetaprodugastoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoordendetaprodugastoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(productoordendetaprodugasto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(productoordendetaprodugasto);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(productoordendetaprodugasto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.getText()==null || this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.getText()=="" || this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setText("0");
			}

			if(conColumnasBase) {productoordendetaprodugasto.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelIdProductoOrdenDetaProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodugasto.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcantidadProductoOrdenDetaProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodugasto.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcostoProductoOrdenDetaProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodugasto.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelcosto_totalProductoOrdenDetaProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodugasto.setdescripcion(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabeldescripcionProductoOrdenDetaProduGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugastoBean,ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_orden_deta_produ()!=null && !productoordendetaprodugastoBean.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodugasto.setid_orden_deta_produ(productoordendetaprodugastoBean.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_tipo_gasto_produ_empresa()!=null && !productoordendetaprodugastoBean.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoordendetaprodugasto.setid_tipo_gasto_produ_empresa(productoordendetaprodugastoBean.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_cuenta_contable_debito()!=null && !productoordendetaprodugastoBean.getid_cuenta_contable_debito().equals(-1L))) {productoordendetaprodugasto.setid_cuenta_contable_debito(productoordendetaprodugastoBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_cuenta_contable_credito()!=null && !productoordendetaprodugastoBean.getid_cuenta_contable_credito().equals(-1L))) {productoordendetaprodugasto.setid_cuenta_contable_credito(productoordendetaprodugastoBean.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_cliente_proveedor()!=null && !productoordendetaprodugastoBean.getid_cliente_proveedor().equals(-1L))) {productoordendetaprodugasto.setid_cliente_proveedor(productoordendetaprodugastoBean.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_factura()!=null && !productoordendetaprodugastoBean.getid_factura().equals(-1L))) {productoordendetaprodugasto.setid_factura(productoordendetaprodugastoBean.getid_factura());}
			if(conDefault || (!conDefault && productoordendetaprodugastoBean.getid_unidad()!=null && !productoordendetaprodugastoBean.getid_unidad().equals(-1L))) {productoordendetaprodugasto.setid_unidad(productoordendetaprodugastoBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugastoOrigen,ProductoOrdenDetaProduGasto productoordendetaprodugasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getId()!=null && !productoordendetaprodugastoOrigen.getId().equals(0L))) {productoordendetaprodugasto.setId(productoordendetaprodugastoOrigen.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_orden_deta_produ()!=null && !productoordendetaprodugastoOrigen.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodugasto.setid_orden_deta_produ(productoordendetaprodugastoOrigen.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_tipo_gasto_produ_empresa()!=null && !productoordendetaprodugastoOrigen.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoordendetaprodugasto.setid_tipo_gasto_produ_empresa(productoordendetaprodugastoOrigen.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_cuenta_contable_debito()!=null && !productoordendetaprodugastoOrigen.getid_cuenta_contable_debito().equals(-1L))) {productoordendetaprodugasto.setid_cuenta_contable_debito(productoordendetaprodugastoOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_cuenta_contable_credito()!=null && !productoordendetaprodugastoOrigen.getid_cuenta_contable_credito().equals(-1L))) {productoordendetaprodugasto.setid_cuenta_contable_credito(productoordendetaprodugastoOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_cliente_proveedor()!=null && !productoordendetaprodugastoOrigen.getid_cliente_proveedor().equals(-1L))) {productoordendetaprodugasto.setid_cliente_proveedor(productoordendetaprodugastoOrigen.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_factura()!=null && !productoordendetaprodugastoOrigen.getid_factura().equals(-1L))) {productoordendetaprodugasto.setid_factura(productoordendetaprodugastoOrigen.getid_factura());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getid_unidad()!=null && !productoordendetaprodugastoOrigen.getid_unidad().equals(-1L))) {productoordendetaprodugasto.setid_unidad(productoordendetaprodugastoOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getcantidad()!=null && !productoordendetaprodugastoOrigen.getcantidad().equals(0))) {productoordendetaprodugasto.setcantidad(productoordendetaprodugastoOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getcosto()!=null && !productoordendetaprodugastoOrigen.getcosto().equals(0.0))) {productoordendetaprodugasto.setcosto(productoordendetaprodugastoOrigen.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getcosto_total()!=null && !productoordendetaprodugastoOrigen.getcosto_total().equals(0.0))) {productoordendetaprodugasto.setcosto_total(productoordendetaprodugastoOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodugastoOrigen.getdescripcion()!=null && !productoordendetaprodugastoOrigen.getdescripcion().equals(""))) {productoordendetaprodugasto.setdescripcion(productoordendetaprodugastoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setText(productoordendetaprodugasto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGastoBean productoordendetaprodugastoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setText(productoordendetaprodugastoBean.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setText(productoordendetaprodugastoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setText(productoordendetaprodugastoBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setText(productoordendetaprodugastoBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setText(productoordendetaprodugastoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGastoParameterReturnGeneral productoordendetaprodugastoReturnGeneral,ProductoOrdenDetaProduGastoBean productoordendetaprodugastoBean,Boolean conDefault) throws Exception { 
		try {
			ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal=new ProductoOrdenDetaProduGasto();
			
			productoordendetaprodugastoLocal=productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getId()!=null && !productoordendetaprodugastoLocal.getId().equals(0L))) {productoordendetaprodugastoBean.setId(productoordendetaprodugastoLocal.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_orden_deta_produ()!=null && !productoordendetaprodugastoLocal.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodugastoBean.setid_orden_deta_produ(productoordendetaprodugastoLocal.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_tipo_gasto_produ_empresa()!=null && !productoordendetaprodugastoLocal.getid_tipo_gasto_produ_empresa().equals(-1L))) {productoordendetaprodugastoBean.setid_tipo_gasto_produ_empresa(productoordendetaprodugastoLocal.getid_tipo_gasto_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_cuenta_contable_debito()!=null && !productoordendetaprodugastoLocal.getid_cuenta_contable_debito().equals(-1L))) {productoordendetaprodugastoBean.setid_cuenta_contable_debito(productoordendetaprodugastoLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_cuenta_contable_credito()!=null && !productoordendetaprodugastoLocal.getid_cuenta_contable_credito().equals(-1L))) {productoordendetaprodugastoBean.setid_cuenta_contable_credito(productoordendetaprodugastoLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_cliente_proveedor()!=null && !productoordendetaprodugastoLocal.getid_cliente_proveedor().equals(-1L))) {productoordendetaprodugastoBean.setid_cliente_proveedor(productoordendetaprodugastoLocal.getid_cliente_proveedor());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_factura()!=null && !productoordendetaprodugastoLocal.getid_factura().equals(-1L))) {productoordendetaprodugastoBean.setid_factura(productoordendetaprodugastoLocal.getid_factura());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getid_unidad()!=null && !productoordendetaprodugastoLocal.getid_unidad().equals(-1L))) {productoordendetaprodugastoBean.setid_unidad(productoordendetaprodugastoLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getcantidad()!=null && !productoordendetaprodugastoLocal.getcantidad().equals(0))) {productoordendetaprodugastoBean.setcantidad(productoordendetaprodugastoLocal.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getcosto()!=null && !productoordendetaprodugastoLocal.getcosto().equals(0.0))) {productoordendetaprodugastoBean.setcosto(productoordendetaprodugastoLocal.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getcosto_total()!=null && !productoordendetaprodugastoLocal.getcosto_total().equals(0.0))) {productoordendetaprodugastoBean.setcosto_total(productoordendetaprodugastoLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodugastoLocal.getdescripcion()!=null && !productoordendetaprodugastoLocal.getdescripcion().equals(""))) {productoordendetaprodugastoBean.setdescripcion(productoordendetaprodugastoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoOrdenDetaProduGastoGenerico(Long idProductoOrdenDetaProduGastoSeleccionado,JComboBox jComboBoxProductoOrdenDetaProduGasto,List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosLocal)throws Exception {
		try {
			ProductoOrdenDetaProduGasto  productoordendetaprodugastoTemp=null;

			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosLocal) {
				if(productoordendetaprodugastoAux.getId()!=null && productoordendetaprodugastoAux.getId().equals(idProductoOrdenDetaProduGastoSeleccionado)) {
					productoordendetaprodugastoTemp=productoordendetaprodugastoAux;
					break;
				}
			}

			jComboBoxProductoOrdenDetaProduGasto.setSelectedItem(productoordendetaprodugastoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoOrdenDetaProduGastoGenerico(JComboBox jComboBoxProductoOrdenDetaProduGasto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduGasto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoOrdenDetaProduGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduGasto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoOrdenDetaProduGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodugasto=(ProductoOrdenDetaProduGasto) productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) productoordendetaprodugastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("OrdenDetaProdu")) {
			//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getordendetaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getordendetaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoGastoProduEmpresa")) {
			//sDescripcion=this.getActualTipoGastoProduEmpresaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.gettipogastoproduempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGastoProduEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.gettipogastoproduempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getcuentacontablecredito_descripcion();
			}
		}

		if(sTipo.equals("ClienteProveedor")) {
			//sDescripcion=this.getActualClienteProveedorForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getclienteproveedor_descripcion();
			} else {
				//sDescripcion=this.getActualClienteProveedorForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getclienteproveedor_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodugasto.getIsNew() && !productoordendetaprodugasto.getIsChanged() && !productoordendetaprodugasto.getIsDeleted()) {
				sDescripcion=productoordendetaprodugasto.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodugasto.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoOrdenDetaProduGasto productoordendetaprodugastoRow=new ProductoOrdenDetaProduGasto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodugastoRow=(ProductoOrdenDetaProduGasto) productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodugastoRow=(ProductoOrdenDetaProduGasto) productoordendetaprodugastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));			
			this.jButtonDuplicarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto && this.isPermisoDuplicarProductoOrdenDetaProduGasto));			
			this.jButtonCopiarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto && this.isPermisoCopiarProductoOrdenDetaProduGasto));
			this.jButtonVerFormProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto && this.isPermisoVerFormProductoOrdenDetaProduGasto));
			
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));			
			
			this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));			
			this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto && this.isPermisoEliminarProductoOrdenDetaProduGasto));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto);							
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));						
			this.jButtonDuplicarToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto && this.isPermisoDuplicarProductoOrdenDetaProduGasto));						
			this.jButtonCopiarToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto && this.isPermisoCopiarProductoOrdenDetaProduGasto));			
			this.jButtonVerFormToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto && this.isPermisoVerFormProductoOrdenDetaProduGasto));			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));
			this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));			
			this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto  && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto && this.isPermisoEliminarProductoOrdenDetaProduGasto));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarToolBarProductoOrdenDetaProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));			
			this.jMenuItemDuplicarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto && this.isPermisoDuplicarProductoOrdenDetaProduGasto));			
			this.jMenuItemCopiarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto && this.isPermisoCopiarProductoOrdenDetaProduGasto));			
			this.jMenuItemVerFormProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto && this.isPermisoVerFormProductoOrdenDetaProduGasto));			
			this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));			
			//this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));
			this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));			
			//this.jMenuItemDetalleMostrarOcultarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto && this.isPermisoOrdenProductoOrdenDetaProduGasto));			
			this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto));			
			this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto && this.isPermisoNuevoProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));									
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemModificarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemActualizarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto && this.isPermisoActualizarProductoOrdenDetaProduGasto));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemEliminarProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto && this.isPermisoEliminarProductoOrdenDetaProduGasto));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemCancelarProductoOrdenDetaProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto);				
			}
			
			this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));						
			this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=this.jButtonNuevoProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto=this.jButtonDuplicarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto=this.jButtonCopiarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto=this.jButtonVerFormProductoOrdenDetaProduGasto.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduGasto=this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=this.jButtonModificarProductoOrdenDetaProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=this.jButtonNuevoToolBarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarToolBarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarToolBarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarToolBarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarToolBarProductoOrdenDetaProduGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=this.jMenuItemNuevoProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemModificarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemActualizarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemEliminarProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemCancelarProductoOrdenDetaProduGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoOrdenDetaProduGasto(Boolean esInicializar) {
		if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
				//if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduGasto();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduGasto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduGasto() {
		this.jButtonNuevoProductoOrdenDetaProduGasto.setVisible(this.isPermisoNuevoProductoOrdenDetaProduGasto);			
		this.jButtonDuplicarProductoOrdenDetaProduGasto.setVisible(this.isPermisoDuplicarProductoOrdenDetaProduGasto);			
		this.jButtonCopiarProductoOrdenDetaProduGasto.setVisible(this.isPermisoCopiarProductoOrdenDetaProduGasto);			
		this.jButtonVerFormProductoOrdenDetaProduGasto.setVisible(this.isPermisoVerFormProductoOrdenDetaProduGasto);			
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setVisible(this.isPermisoOrdenProductoOrdenDetaProduGasto);					
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.setVisible(this.isPermisoNuevoProductoOrdenDetaProduGasto);			
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarProductoOrdenDetaProduGasto.setVisible(this.isPermisoActualizarProductoOrdenDetaProduGasto);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.setVisible(this.isPermisoActualizarProductoOrdenDetaProduGasto);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.setVisible(this.isPermisoEliminarProductoOrdenDetaProduGasto);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.setVisible(this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto);							
		}
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setVisible(this.isPermisoActualizarProductoOrdenDetaProduGasto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduGasto() {
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarProductoOrdenDetaProduGasto.setVisible(this.isPermisoActualizarProductoOrdenDetaProduGasto);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.setVisible(this.isPermisoActualizarProductoOrdenDetaProduGasto);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.setVisible(this.isPermisoEliminarProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto);							
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto && this.isPermisoGuardarCambiosProductoOrdenDetaProduGasto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduGasto() {
		if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduGasto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoOrdenDetaProduGasto() {
	}
	
	public void jTableDatosProductoOrdenDetaProduGastoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoOrdenDetaProduGasto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoordendetaprodugasto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoordendetaprodu=true;

			idTienePermisoordendetaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(OrdenDetaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoordendetaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_orden_deta_produ()!=null) {
					this.ordendetaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ordendetaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_orden_deta_produ());
					this.ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu();
				}

				JInternalFrameBase jinternalFrame =this.ordendetaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBorderordendetaprodu=(TitledBorder)this.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

				titledBorderordendetaprodu.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Orden Detalle Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_orden_deta_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_orden_deta_produ = "+this.productoordendetaprodugasto.getid_orden_deta_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogastoproduempresa=true;

			idTienePermisotipogastoproduempresa=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogastoproduempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.tipogastoproduempresaBeanSwingJInternalFrame=new TipoGastoProduEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogastoproduempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogastoproduempresaBeanSwingJInternalFrame.getTipoGastoProduEmpresaLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa()!=null) {
					this.tipogastoproduempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogastoproduempresaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa());
					this.tipogastoproduempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogastoproduempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogastoproduempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGastoProduEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipogastoproduempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBordertipogastoproduempresa=(TitledBorder)this.tipogastoproduempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoGastoProduEmpresa.getBorder();

				titledBordertipogastoproduempresa.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Tipo Gasto Produccion Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_gasto_produ_empresa = "+this.productoordendetaprodugasto.getid_tipo_gasto_produ_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.productoordendetaprodugasto.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.productoordendetaprodugasto.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoOrdenDetaProduGasto=null;
			TitledBorder titledBorderclienteproveedor=null;

			if(!this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				titledBorderclienteproveedor=(TitledBorder)this.clienteproveedorBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBorderclienteproveedor.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoclienteproveedor=true;

			idTienePermisoclienteproveedor=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisoclienteproveedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.clienteproveedorBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteproveedorBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_cliente_proveedor()!=null) {
					this.clienteproveedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteproveedorBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_cliente_proveedor());
					this.clienteproveedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteproveedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteproveedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBorderclienteproveedor=(TitledBorder)this.clienteproveedorBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBorderclienteproveedor.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_cliente_proveedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente_proveedor = "+this.productoordendetaprodugasto.getid_cliente_proveedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoOrdenDetaProduGasto=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.productoordendetaprodugasto.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoOrdenDetaProduGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduGasto(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoordendetaprodugastoLogic.getConnexion());

				if(this.productoordendetaprodugasto.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodugasto.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduGasto=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduGasto.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoOrdenDetaProduGasto.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoordendetaprodugasto.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoordendetaprodugasto.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoordendetaprodugasto.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoordendetaprodugasto.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoOrdenDetaProduGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.getproductoordendetaprodugasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodugasto==null) {
						this.productoordendetaprodugasto = new ProductoOrdenDetaProduGasto();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);
				}

				if(this.productoordendetaprodugasto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoordendetaprodugasto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteProveedorProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdClienteProveedor();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdFactura();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdOrdenDetaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdTipoGastoProduEmpresa();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoOrdenDetaProduGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);

			this.getProductoOrdenDetaProduGastosFK_IdUnidad();

			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);

			//if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodugastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoOrdenDetaProduGasto() {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.dispose();
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.dispose();
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto=null;
		}
		
		if(this.jInternalFrameImportacionProductoOrdenDetaProduGasto!=null) {
			this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setVisible(false);	    			
			this.jInternalFrameImportacionProductoOrdenDetaProduGasto.dispose();
			this.jInternalFrameImportacionProductoOrdenDetaProduGasto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoOrdenDetaProduGasto();
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduGasto")) {
				jButtonDuplicarProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduGasto")) {
				jButtonCopiarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduGasto")) {
				jButtonVerFormProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoOrdenDetaProduGasto")) {
				jButtonDuplicarProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoOrdenDetaProduGasto")) {
				jButtonDuplicarProductoOrdenDetaProduGastoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduGasto")) {
				jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoOrdenDetaProduGasto")) {
				jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoOrdenDetaProduGasto")) {
				jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduGasto")) {
				jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoOrdenDetaProduGasto")) {
				jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoOrdenDetaProduGasto")) {
				jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduGasto")) {
				jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoOrdenDetaProduGasto")) {
				jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoOrdenDetaProduGasto")) {
				jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduGasto")) {
				jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoOrdenDetaProduGasto")) {
				jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoOrdenDetaProduGasto")) {
				jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduGasto")) {
				jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoOrdenDetaProduGasto")) {
				jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoOrdenDetaProduGasto")) {
				jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoOrdenDetaProduGasto")) {
				jButtonMostrarOcultarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoOrdenDetaProduGasto")) {
				jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoOrdenDetaProduGasto")) {
				jButtonCopiarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoOrdenDetaProduGasto")) {
				jButtonVerFormProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoOrdenDetaProduGasto")) {
				jButtonCopiarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoOrdenDetaProduGasto")) {
				jButtonVerFormProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduGasto")) {
				jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoOrdenDetaProduGasto")) {
				jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoOrdenDetaProduGasto")) {
				jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoOrdenDetaProduGasto")) {
				jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoOrdenDetaProduGasto")) {
				jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoOrdenDetaProduGasto")) {
				jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoOrdenDetaProduGasto")) {
				jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoOrdenDetaProduGasto")) {
				jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoOrdenDetaProduGasto")) {
				jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoOrdenDetaProduGasto") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto")) {
				jButtonAbrirOrderByProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoOrdenDetaProduGasto") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoOrdenDetaProduGasto")) {
				jButtonMostrarOcultarProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoOrdenDetaProduGasto")) {
				jButtonCerrarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoOrdenDetaProduGasto")) {
				jButtonGenerarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoOrdenDetaProduGasto")) {
				
				jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoOrdenDetaProduGasto")) {
				jButtonCerrarImportacionProductoOrdenDetaProduGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoOrdenDetaProduGasto")) {
				
				jButtonGenerarImportacionProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoOrdenDetaProduGasto")) {
				
				jButtonAbrirImportacionProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoOrdenDetaProduGasto")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduGastoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoOrdenDetaProduGasto")) {
				jComboBoxTiposRelacionesProductoOrdenDetaProduGastoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoOrdenDetaProduGasto")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduGastoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoOrdenDetaProduGasto")) {
				
				jComboBoxTiposSeleccionarProductoOrdenDetaProduGastoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoOrdenDetaProduGasto")) {
				jTextFieldValorCampoGeneralProductoOrdenDetaProduGastoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduGasto")) {
				jButtonAbrirOrderByProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoOrdenDetaProduGasto")) {
				jButtonAbrirOrderByProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoOrdenDetaProduGasto")) {
				jButtonCerrarOrderByProductoOrdenDetaProduGastoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonidProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGasto")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGasto")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGasto")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGasto")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteProveedorProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDebitoProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdFacturaProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdOrdenDetaProduProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoOrdenDetaProduGasto")) {
				this.jButtonFK_IdUnidadProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			
			;
			
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoOrdenDetaProduGasto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoordendetaprodugastoLocal=this.productoordendetaprodugasto;
			} else {
				productoordendetaprodugastoLocal=this.productoordendetaprodugastoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
								
						
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoOrdenDetaProduGasto")) {
					jCheckBoxSeleccionarTodosProductoOrdenDetaProduGastoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoOrdenDetaProduGasto")) {
					jCheckBoxSeleccionadosProductoOrdenDetaProduGastoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduGasto")) {
					
				}
				
				


				
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
												
				
				


				
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
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
			
			


			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodugasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodugasto);
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
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
				
				


				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduGasto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodugastoAnterior =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoOrdenDetaProduGasto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoOrdenDetaProduGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoordendetaprodugasto =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoordendetaprodugasto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduGasto")) {
				
				}
				
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoOrdenDetaProduGasto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduGasto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduGasto")) {
			
			}
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoOrdenDetaProduGasto();
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduGasto")) {
				jButtonDuplicarProductoOrdenDetaProduGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduGasto")) {
				jButtonCopiarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduGasto")) {
				jButtonVerFormProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduGasto")) {
				jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduGasto")) {
				jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduGasto")) {
				jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduGasto")) {
				jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduGasto")) {
				jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduGasto")) {
				jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduGasto")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduGasto")) {
				jButtonAbrirOrderByProductoOrdenDetaProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduGasto")) {
				jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoOrdenDetaProduGasto")) {
				jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoOrdenDetaProduGasto")) {
				jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonidProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGasto")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGasto")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_facturaProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduGastoUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduGastoBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduGastoBusquedaActionPerformed(evt);
			}
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoOrdenDetaProduGasto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoOrdenDetaProduGasto")) {
				closingInternalFrameProductoOrdenDetaProduGasto();
				
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduGasto")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduGasto = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoOrdenDetaProduGastoBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduGasto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(null);
			}
			
			ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodugasto,new Object(),this.productoordendetaprodugastoParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoOrdenDetaProduGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoOrdenDetaProduGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoOrdenDetaProduGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoordendetaprodugasto)) {
			if(!esControlTabla) {
				if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);			
				}
				
				if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.procesarEventosProductoOrdenDetaProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this.productoordendetaprodugasto,this.productoordendetaprodugastoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduGasto,classes);//this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral,this.productoordendetaprodugastoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduGasto(classes,this.productoordendetaprodugastoReturnGeneral,this.productoordendetaprodugastoBean,false);
					}
						
					if(this.productoordendetaprodugastoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto());	
					}
						
					if(this.productoordendetaprodugastoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto(),classes);//this.productoordendetaprodugastoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,classes);//this.productoordendetaprodugastoBean);									
				}
			
				if(ProductoOrdenDetaProduGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduGasto(this.productoordendetaprodugasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduGasto(this.productoordendetaprodugasto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoordendetaprodugastoAnterior!=null) {
						this.productoordendetaprodugasto=this.productoordendetaprodugastoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.procesarEventosProductoOrdenDetaProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this.productoordendetaprodugasto,this.productoordendetaprodugastoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduGasto,classes);//this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto(),productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto(),this.productoordendetaprodugastos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoOrdenDetaProduGasto.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoOrdenDetaProduGasto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoOrdenDetaProduGasto();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoOrdenDetaProduGasto() throws Exception {
		
		ProductoOrdenDetaProduGastoModel productoordendetaprodugastoModel=(ProductoOrdenDetaProduGastoModel)this.jTableDatosProductoOrdenDetaProduGasto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodugastoModel.productoordendetaprodugastos=this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoordendetaprodugastoModel.productoordendetaprodugastos=this.productoordendetaprodugastos;
		}
		
		
		((ProductoOrdenDetaProduGastoModel) this.jTableDatosProductoOrdenDetaProduGasto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoOrdenDetaProduGasto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoordendetaprodugastoAnterior(),this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoordendetaprodugastoAnterior(),this.productoordendetaprodugastos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoOrdenDetaProduGasto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
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
										
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodugasto,new Object(),generalEntityParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoOrdenDetaProduGastoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoOrdenDetaProduGastoConstantesFunciones.getClassesRelationshipsFromStringsOfProductoOrdenDetaProduGasto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoOrdenDetaProduGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodugasto,new Object(),generalEntityParameterGeneral,this.productoordendetaprodugastoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGastoBean productoordendetaprodugastoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduGasto(ArrayList<Classe> classes,ProductoOrdenDetaProduGastoReturnGeneral productoordendetaprodugastoReturnGeneral,ProductoOrdenDetaProduGastoBean productoordendetaprodugastoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoordendetaprodugasto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto = new ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones(),this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setVisible(false);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.productoordendetaprodugastoLogic=this.productoordendetaprodugastoLogic;
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduGasto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduGasto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduGasto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduGasto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduGasto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduGasto"));
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduGasto"));

		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduGasto"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemModificarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduGasto"));
						
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemActualizarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduGasto"));
								
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemEliminarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduGasto"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduGasto"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemCancelarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduGasto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduGasto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduGasto"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduGasto"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduGasto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonidProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncostoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduGastoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduGasto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoOrdenDetaProduGasto"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduGasto"));
		}
		
		this.jTableDatosProductoOrdenDetaProduGasto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoOrdenDetaProduGasto"));
		
		this.jTableDatosProductoOrdenDetaProduGasto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoOrdenDetaProduGasto"));
		
		this.jButtonNuevoProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"NuevoProductoOrdenDetaProduGasto"));
		
		this.jButtonDuplicarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"DuplicarProductoOrdenDetaProduGasto"));
		
		this.jButtonCopiarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"CopiarProductoOrdenDetaProduGasto"));
		
		this.jButtonVerFormProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"VerFormProductoOrdenDetaProduGasto"));
		
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoOrdenDetaProduGasto"));
			
		this.jButtonDuplicarToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemNuevoProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoOrdenDetaProduGasto"));
			
		this.jMenuItemDuplicarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoOrdenDetaProduGasto"));		
		
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoOrdenDetaProduGasto"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoOrdenDetaProduGasto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonModificarToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduGasto"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemModificarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonActualizarToolBarProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduGasto"));
				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemActualizarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonEliminarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduGasto"));
						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemEliminarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonCancelarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduGasto"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemCancelarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduGasto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoOrdenDetaProduGasto"));		
		
		
		this.jButtonCerrarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CerrarProductoOrdenDetaProduGasto"));
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemCerrarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoOrdenDetaProduGasto"));
			
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoOrdenDetaProduGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduGasto"));
		}
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoOrdenDetaProduGasto"));
			
		this.jButtonVerFormToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoOrdenDetaProduGasto"));
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoOrdenDetaProduGasto"));
			
		this.jMenuItemCopiarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoOrdenDetaProduGasto"));		
		
		this.jMenuItemVerFormProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoOrdenDetaProduGasto"));		
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduGasto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduGasto"));		
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoOrdenDetaProduGasto"));
					
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoOrdenDetaProduGasto"));
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoOrdenDetaProduGasto"));		
		
		
		
		this.jButtonAnterioresProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"AnterioresProductoOrdenDetaProduGasto"));
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoOrdenDetaProduGasto"));
		
		this.jMenuItemAnterioresProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoOrdenDetaProduGasto"));		
		
		
		this.jButtonSiguientesProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"SiguientesProductoOrdenDetaProduGasto"));
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemSiguientesProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoOrdenDetaProduGasto"));
			
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoOrdenDetaProduGasto"));
			
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto"));
			
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoOrdenDetaProduGasto"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoOrdenDetaProduGasto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto"));
			
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoOrdenDetaProduGasto"));

		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoOrdenDetaProduGasto"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduGasto"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoOrdenDetaProduGasto"));
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoOrdenDetaProduGasto"));
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoOrdenDetaProduGasto"));
			
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoOrdenDetaProduGasto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonidProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncostoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduGastoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProductoOrdenDetaProduGasto"));

			this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdFacturaProductoOrdenDetaProduGasto"));

			this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto"));

			this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduGasto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduGasto"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduGasto"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduGasto"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduGasto"));				
			//this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduGasto"));
			//this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduGasto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduGasto"));
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduGasto"));
				this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduGasto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoOrdenDetaProduGasto"));
			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoOrdenDetaProduGasto"));			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto!=null) {
				this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduGasto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduGasto"));
		
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
            		closingInternalFrameProductoOrdenDetaProduGasto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduGasto = (JInternalFrameBase)event.getSource();
	            	
	            ProductoOrdenDetaProduGastoBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduGasto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoOrdenDetaProduGasto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoOrdenDetaProduGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoOrdenDetaProduGasto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduGasto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduGastoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonModificarProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoOrdenDetaProduGasto";
		inputMap = this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonGuardarCambiosProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoOrdenDetaProduGastoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoOrdenDetaProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoOrdenDetaProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoOrdenDetaProduGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonidProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cliente_proveedorProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda"));
		//jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaProductoOrdenDetaProduGastoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGasto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncostoProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduGastoBusqueda"));
		
		
		this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProductoOrdenDetaProduGasto"));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdFacturaProductoOrdenDetaProduGasto"));

		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"id_facturaProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto"));

		this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduGasto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoOrdenDetaProduGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoOrdenDetaProduGastoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoOrdenDetaProduGasto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
					productoordendetaprodugastoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastos) {
					productoordendetaprodugastoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoOrdenDetaProduGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
						productoordendetaprodugastoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastos) {
						productoordendetaprodugastoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoOrdenDetaProduGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduGasto.getSelectedRows();
			
			ProductoOrdenDetaProduGasto productoordendetaprodugastoLocal=new ProductoOrdenDetaProduGasto();
			
			//this.seleccionarTodosProductoOrdenDetaProduGasto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodugastoLocal =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoordendetaprodugastoLocal =(ProductoOrdenDetaProduGasto) this.productoordendetaprodugastos.toArray()[this.jTableDatosProductoOrdenDetaProduGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoordendetaprodugastoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
						productoordendetaprodugastoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastos) {
						productoordendetaprodugastoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoOrdenDetaProduGastoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoOrdenDetaProduGastoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoOrdenDetaProduGastoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
				
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodugastoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodugastoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodugastoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodugastoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastos) {
					
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodugastoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodugastoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodugastoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodugastoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoOrdenDetaProduGastoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduGasto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoOrdenDetaProduGasto) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoOrdenDetaProduGasto(conSplash);
				
					this.generarReporteProductoOrdenDetaProduGastosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoOrdenDetaProduGastosSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduGastosSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduGastosSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduGasto();
				
				this.exportarProductoOrdenDetaProduGastosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoOrdenDetaProduGastos();
				//this.importarProductoOrdenDetaProduGastos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduGasto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoOrdenDetaProduGastosSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden  Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoOrdenDetaProduGasto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoOrdenDetaProduGasto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoOrdenDetaProduGasto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoOrdenDetaProduGasto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoOrdenDetaProduGasto(conSplash);
					
						//this.actualizarParametrosGeneralProductoOrdenDetaProduGasto();
						
						this.generarReporteProcesoAccionProductoOrdenDetaProduGastosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden  GastoES SELECCIONADOS?", "MANTENIMIENTO DE Orden  Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoOrdenDetaProduGasto();
				
						this.actualizarParametrosGeneralProductoOrdenDetaProduGasto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoordendetaprodugastoReturnGeneral=productoordendetaprodugastoLogic.procesarAccionProductoOrdenDetaProduGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos(),this.productoordendetaprodugastoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoOrdenDetaProduGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoOrdenDetaProduGasto();
					
					ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoOrdenDetaProduGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoOrdenDetaProduGasto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoOrdenDetaProduGastoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoOrdenDetaProduGasto();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
			ProductoOrdenDetaProduGasto productoordendetaprodugasto=new ProductoOrdenDetaProduGasto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.getSelectedItem();
			
			
			
			
			productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoordendetaprodugastosSeleccionados.size()==1) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
					productoordendetaprodugasto=productoordendetaprodugastoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoOrdenDetaProduGasto();
			
      		//this.finishProcessProductoOrdenDetaProduGasto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoOrdenDetaProduGastoReturnGeneral() throws Exception {
		if(this.productoordendetaprodugastoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodugastoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoordendetaprodugastoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodugastoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoordendetaprodugastoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoordendetaprodugastoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
		}
		
		if(this.productoordendetaprodugastoReturnGeneral.getConRetornoLista() || this.productoordendetaprodugastoReturnGeneral.getConRetornoObjeto()) {
			if(this.productoordendetaprodugastoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodugastoLogic.setProductoOrdenDetaProduGastos(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGastos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoordendetaprodugastoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodugastoLogic.setProductoOrdenDetaProduGasto(this.productoordendetaprodugastoReturnGeneral.getProductoOrdenDetaProduGasto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduGasto(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoOrdenDetaProduGasto() throws Exception {
		
		
	}
	
	public ArrayList<ProductoOrdenDetaProduGasto> getProductoOrdenDetaProduGastosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoOrdenDetaProduGasto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos()) {
					if(productoordendetaprodugastoAux.getIsSelected()) {
						productoordendetaprodugastosSeleccionados.add(productoordendetaprodugastoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:this.productoordendetaprodugastos) {
					if(productoordendetaprodugastoAux.getIsSelected()) {
						productoordendetaprodugastosSeleccionados.add(productoordendetaprodugastoAux);				
					}
				}
			}
			
			if(productoordendetaprodugastosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoordendetaprodugastosSeleccionados.addAll(this.productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoordendetaprodugastosSeleccionados.addAll(this.productoordendetaprodugastos);				
					}
				}
			}
		} else {
			productoordendetaprodugastosSeleccionados.add(this.productoordendetaprodugasto);
		}
		
		return productoordendetaprodugastosSeleccionados;
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
	
	public void generarReporteProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoOrdenDetaProduGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoOrdenDetaProduGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduGastosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduGastosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden  Gasto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoOrdenDetaProduGastosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduGasto();
		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoOrdenDetaProduGasto();
		
		
		//this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados ,productoordendetaprodugastoImplementable,productoordendetaprodugastoImplementableHome);
	}
	
	public void mostrarImportacionProductoOrdenDetaProduGastos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoOrdenDetaProduGasto();
		
		this.abrirFrameImportacionProductoOrdenDetaProduGasto();		
		
			
		//this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados ,productoordendetaprodugastoImplementable,productoordendetaprodugastoImplementableHome);
	}
	
	public void importarProductoOrdenDetaProduGastos() throws Exception {		
	
	}
	
	public void exportarProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoOrdenDetaProduGastosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoOrdenDetaProduGastosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoOrdenDetaProduGastosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden  Gasto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoOrdenDetaProduGasto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoOrdenDetaProduGasto(productoordendetaprodugastoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoordendetaprodugastoAux.setsDetalleGeneralEntityReporte(productoordendetaprodugastoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoOrdenDetaProduGasto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoordendetaprodugasto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getordendetaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.gettipogastoproduempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getclienteproveedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodugasto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoOrdenDetaProduGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoOrdenDetaProduGasto(row);				
				iRow++;
			}				
			
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoOrdenDetaProduGasto(productoordendetaprodugastoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoOrdenDetaProduGastosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();		
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodugasto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoordendetaprodugastos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoordendetaprodugasto");
			//elementRoot.appendChild(element);
		
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
				element = document.createElement("productoordendetaprodugasto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoOrdenDetaProduGasto(productoordendetaprodugastoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoOrdenDetaProduGasto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getordendetaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.gettipogastoproduempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getclienteproveedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodugasto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoOrdenDetaProduGasto(ProductoOrdenDetaProduGasto productoordendetaprodugasto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoordendetaprodugasto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoordendetaprodugasto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementordendetaprodu_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDORDENDETAPRODU);
		elementordendetaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getordendetaprodu_descripcion()));
		element.appendChild(elementordendetaprodu_descripcion);

		Element elementtipogastoproduempresa_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDTIPOGASTOPRODUEMPRESA);
		elementtipogastoproduempresa_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.gettipogastoproduempresa_descripcion()));
		element.appendChild(elementtipogastoproduempresa_descripcion);

		Element elementcuentacontabledebito_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementclienteproveedor_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDCLIENTEPROVEEDOR);
		elementclienteproveedor_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getclienteproveedor_descripcion()));
		element.appendChild(elementclienteproveedor_descripcion);

		Element elementfactura_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoordendetaprodugasto.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoordendetaprodugasto.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoordendetaprodugasto.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoOrdenDetaProduGastoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoordendetaprodugasto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoOrdenDetaProduGastosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados=new ArrayList<ProductoOrdenDetaProduGasto>();
		
		productoordendetaprodugastosSeleccionados=this.getProductoOrdenDetaProduGastosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduGasto(productoordendetaprodugastosSeleccionados);
		
		this.generarReporteProductoOrdenDetaProduGastos("Todos",productoordendetaprodugastosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduGasto(ArrayList<ProductoOrdenDetaProduGasto> productoordendetaprodugastosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoOrdenDetaProduGasto productoordendetaprodugastoAux:productoordendetaprodugastosSeleccionados) {
				productoordendetaprodugastoAux.setsDetalleGeneralEntityReporte(productoordendetaprodugastoAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getordendetaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.gettipogastoproduempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getclienteproveedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoordendetaprodugastoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodugastoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=true;
				this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=true;
			}
			
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduGasto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=true;
		} else {
			this.actualizarEstadoPanelsProductoOrdenDetaProduGasto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduGasto=false;
			//this.isVisibilidadCeldaVerFormProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(!productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;												
			}
			
			this.jButtonCerrarProductoOrdenDetaProduGasto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduGasto=false;
		}
		
		if(!this.permiteMantenimiento(this.productoordendetaprodugasto)) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduGasto=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduGasto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduGasto() {
	}
	
	public void actualizarEstadoPanelsProductoOrdenDetaProduGasto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduGasto!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduGasto!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduGasto!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOrdenDetaProdu(Boolean isParaOrdenDetaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOrdenDetaProduNegation=!isParaOrdenDetaProdu;

			this.isVisibilidadFK_IdClienteProveedor=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaOrdenDetaProdu;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGastoProduEmpresa(Boolean isParaTipoGastoProduEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGastoProduEmpresaNegation=!isParaTipoGastoProduEmpresa;

			this.isVisibilidadFK_IdClienteProveedor=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaTipoGastoProduEmpresa;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaTipoGastoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadFK_IdClienteProveedor=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableDebito;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadFK_IdClienteProveedor=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaClienteProveedor(Boolean isParaClienteProveedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteProveedorNegation=!isParaClienteProveedor;

			this.isVisibilidadFK_IdClienteProveedor=isParaClienteProveedor;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaClienteProveedorNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdClienteProveedor=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdClienteProveedor=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdClienteProveedor) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdFactura=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdFacturaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdTipoGastoProduEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoGastoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(jPanelFK_IdUnidadProductoOrdenDetaProduGasto);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoOrdenDetaProduGastoParaBusquedaClienteProveedors() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(productoordendetaprodugastoSessionBean==null) {
				productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(clienteproveedorSessionBean==null) {
				clienteproveedorSessionBean=new ClienteSessionBean();
			}

			clienteproveedorSessionBean.setsPathNavegacionActual(productoordendetaprodugastoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteproveedorSessionBean.setisPermiteRecargarInformacion(false);
			clienteproveedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteproveedorSessionBean.getisPaginaPopup();
			clienteproveedorSessionBean.setisPaginaPopup(false);
			clienteproveedorSessionBean.setEstaModoBusqueda(true);
			clienteproveedorSessionBean.setsFuncionBusquedaRapida("window.opener.productoordendetaprodugastoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente_proveedor(TO_REPLACE);");
			clienteproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProductoOrdenDetaProduGastoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionProductoOrdenDetaProduGasto(true);
			//clienteSessionBean.setlidProductoOrdenDetaProduGastoActual(this.idProductoOrdenDetaProduGastoActual);

			productoordendetaprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto(true);
			productoordendetaprodugastoSessionBean.setlIdProductoOrdenDetaProduGastoActualForeignKey(this.idProductoOrdenDetaProduGastoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionProductoOrdenDetaProduGastoParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(productoordendetaprodugastoSessionBean==null) {
				productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(productoordendetaprodugastoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.productoordendetaprodugastoFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(ProductoOrdenDetaProduGastoConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionProductoOrdenDetaProduGasto(true);
			//facturaSessionBean.setlidProductoOrdenDetaProduGastoActual(this.idProductoOrdenDetaProduGastoActual);

			productoordendetaprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto(true);
			productoordendetaprodugastoSessionBean.setlIdProductoOrdenDetaProduGastoActualForeignKey(this.idProductoOrdenDetaProduGastoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		
		if(this.productoordendetaprodugastoSessionBean==null) {
			this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		}
		
		this.productoordendetaprodugastoSessionBean.setsUltimaBusquedaProductoOrdenDetaProduGasto(this.getsAccionBusqueda());
		this.productoordendetaprodugastoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoordendetaprodugastoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdClienteProveedor")) {
			productoordendetaprodugastoSessionBean.setid_cliente_proveedor(this.getid_cliente_proveedorFK_IdClienteProveedor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			productoordendetaprodugastoSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
			productoordendetaprodugastoSessionBean.setid_cuenta_contable_debito(this.getid_cuenta_contable_debitoFK_IdCuentaContableDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			productoordendetaprodugastoSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
			productoordendetaprodugastoSessionBean.setid_orden_deta_produ(this.getid_orden_deta_produFK_IdOrdenDetaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGastoProduEmpresa")) {
			productoordendetaprodugastoSessionBean.setid_tipo_gasto_produ_empresa(this.getid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoordendetaprodugastoSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		
		if(this.productoordendetaprodugastoSessionBean==null) {
			this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		}
		
		if(this.productoordendetaprodugastoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduGasto()!=null&&!this.productoordendetaprodugastoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduGasto().equals("")) {
			this.setsAccionBusqueda(productoordendetaprodugastoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduGasto());
			this.setiNumeroPaginacion(productoordendetaprodugastoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoordendetaprodugastoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdClienteProveedor")) {
				this.setid_cliente_proveedorFK_IdClienteProveedor(productoordendetaprodugastoSessionBean.getid_cliente_proveedor());
				productoordendetaprodugastoSessionBean.setid_cliente_proveedor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(productoordendetaprodugastoSessionBean.getid_cuenta_contable_credito());
				productoordendetaprodugastoSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
				this.setid_cuenta_contable_debitoFK_IdCuentaContableDebito(productoordendetaprodugastoSessionBean.getid_cuenta_contable_debito());
				productoordendetaprodugastoSessionBean.setid_cuenta_contable_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(productoordendetaprodugastoSessionBean.getid_factura());
				productoordendetaprodugastoSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
				this.setid_orden_deta_produFK_IdOrdenDetaProdu(productoordendetaprodugastoSessionBean.getid_orden_deta_produ());
				productoordendetaprodugastoSessionBean.setid_orden_deta_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGastoProduEmpresa")) {
				this.setid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresa(productoordendetaprodugastoSessionBean.getid_tipo_gasto_produ_empresa());
				productoordendetaprodugastoSessionBean.setid_tipo_gasto_produ_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoordendetaprodugastoSessionBean.getid_unidad());
				productoordendetaprodugastoSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoordendetaprodugastoSessionBean.setsUltimaBusquedaProductoOrdenDetaProduGasto("");
		this.productoordendetaprodugastoSessionBean.setiNumeroPaginacion(ProductoOrdenDetaProduGastoConstantesFunciones.INUMEROPAGINACION);
		this.productoordendetaprodugastoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoOrdenDetaProduGasto() {
		this.updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduGasto();
		this.updateVisibilidadBusquedasFormularioProductoOrdenDetaProduGasto();
		this.updateHabilitarBusquedasFormularioProductoOrdenDetaProduGasto();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduGasto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponents().length>0) {
	

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			}
		}

		if(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduGasto!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduGasto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoOrdenDetaProduGasto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdClienteProveedorProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdFacturaProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdFacturaProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduGasto);
			if(!this.productoordendetaprodugastoConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduGasto && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoOrdenDetaProduGasto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdClienteProveedorProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdFacturaProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdFacturaProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduGasto);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setEnabledAt(index,this.productoordendetaprodugastoConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduGasto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoOrdenDetaProduGasto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdClienteProveedor")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdClienteProveedorProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdClienteProveedorProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDebito")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdFacturaProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdFacturaProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdOrdenDetaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGastoProduEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.getComponent(index);

			this.productoordendetaprodugastoConstantesFunciones.setResaltarFK_IdUnidadProductoOrdenDetaProduGasto(resaltar);

			jPanel.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduGasto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoOrdenDetaProduGasto() throws Exception {

		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoOrdenDetaProduGasto();
		this.updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduGasto();
		this.updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduGasto();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoOrdenDetaProduGasto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoordendetaprodugastoConstantesFunciones.resaltaridProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltaridProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_debitoProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cuenta_contable_creditoProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_cliente_proveedorProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_facturaProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_facturaProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarcostoProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarcostoProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduGasto);}
		if(this.productoordendetaprodugastoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduGasto!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setBorder(this.productoordendetaprodugastoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduGasto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduGasto() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
	
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostraridProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelidProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostraridProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_debitoProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cuenta_contable_creditoProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoOrdenDetaProduGasto);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_cliente_proveedorProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_facturaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_facturaProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_facturaProductoOrdenDetaProduGasto);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_facturaProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelid_unidadProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelcantidadProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcostoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelcostoProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcostoProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPanelcosto_totalProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduGasto);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jPaneldescripcionProductoOrdenDetaProduGasto.setVisible(this.productoordendetaprodugastoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduGasto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduGasto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto!=null) {
	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jLabelidProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activaridProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_debitoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_cuenta_contable_creditoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_cliente_proveedorProductoOrdenDetaProduGasto);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_cliente_proveedorProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_facturaProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_facturaProductoOrdenDetaProduGasto);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jButtonid_facturaProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_facturaProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jComboBoxid_unidadProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarid_unidadProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcantidadProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarcantidadProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcostoProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarcostoProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextFieldcosto_totalProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduGasto);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto.jTextAreadescripcionProductoOrdenDetaProduGasto.setEnabled(this.productoordendetaprodugastoConstantesFunciones.activardescripcionProductoOrdenDetaProduGasto);
		}
	}
	
		
}