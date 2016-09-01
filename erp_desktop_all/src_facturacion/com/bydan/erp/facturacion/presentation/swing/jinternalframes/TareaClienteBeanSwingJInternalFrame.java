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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TareaClienteConstantesFunciones;
import com.bydan.erp.facturacion.util.TareaClienteParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TareaClienteParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TareaClienteBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TareaClienteBeanSwingJInternalFrame extends TareaClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TareaClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TareaCliente> tareaclienteValidator = new ClassValidator<TareaCliente>(TareaCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TareaCliente tareacliente;	
	public TareaCliente tareaclienteAux;
	public TareaCliente tareaclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TareaCliente tareaclienteTotales;
	public Long idTareaClienteActual;
	public Long iIdNuevoTareaCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
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

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
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
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
	}
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoTareaCliente;
	public Boolean isPermisoNuevoTareaCliente;
	public Boolean isPermisoActualizarTareaCliente;
	public Boolean isPermisoActualizarOriginalTareaCliente;
	public Boolean isPermisoEliminarTareaCliente;
	public Boolean isPermisoGuardarCambiosTareaCliente;
	public Boolean isPermisoConsultaTareaCliente;
	public Boolean isPermisoBusquedaTareaCliente;
	public Boolean isPermisoReporteTareaCliente;
	public Boolean isPermisoPaginacionMedioTareaCliente;
	public Boolean isPermisoPaginacionAltoTareaCliente;
	public Boolean isPermisoPaginacionTodoTareaCliente;
	public Boolean isPermisoCopiarTareaCliente;
	public Boolean isPermisoVerFormTareaCliente;
	public Boolean isPermisoDuplicarTareaCliente;
	public Boolean isPermisoOrdenTareaCliente;
	
	
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
	
	public TareaClienteParameterReturnGeneral tareaclienteReturnGeneral;
	public TareaClienteParameterReturnGeneral tareaclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTareaCliente=false;
	public Boolean esParaAccionDesdeFormularioTareaCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TareaClienteSessionBeanAdditional tareaclienteSessionBeanAdditional=null;
	
	public TareaClienteSessionBeanAdditional getTareaClienteSessionBeanAdditional() {
		return this.tareaclienteSessionBeanAdditional;
	}
	
	public void setTareaClienteSessionBeanAdditional(TareaClienteSessionBeanAdditional tareaclienteSessionBeanAdditional) {
		try {
			this.tareaclienteSessionBeanAdditional=tareaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TareaClienteBeanSwingJInternalFrameAdditional tareaclienteBeanSwingJInternalFrameAdditional=null;
	//public class TareaClienteBeanSwingJInternalFrame
	
	public TareaClienteBeanSwingJInternalFrameAdditional getTareaClienteBeanSwingJInternalFrameAdditional() {
		return this.tareaclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTareaClienteBeanSwingJInternalFrameAdditional(TareaClienteBeanSwingJInternalFrameAdditional tareaclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.tareaclienteBeanSwingJInternalFrameAdditional=tareaclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TareaClienteLogic tareaclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TareaCliente tareaclienteBean;
	public TareaClienteConstantesFunciones tareaclienteConstantesFunciones;
	//public TareaClienteParameterReturnGeneral tareaclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public FacturaLogic facturaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<TareaCliente> tareaclientes;	
	//public List<TareaCliente> tareaclientesEliminados;
	//public List<TareaCliente> tareaclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTareaCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTareaCliente=true;
	public Boolean isVisibilidadCeldaCopiarTareaCliente=true;
	public Boolean isVisibilidadCeldaVerFormTareaCliente=true;
	public Boolean isVisibilidadCeldaOrdenTareaCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
	public Boolean isVisibilidadCeldaModificarTareaCliente=false;
	public Boolean isVisibilidadCeldaActualizarTareaCliente=false;
	public Boolean isVisibilidadCeldaEliminarTareaCliente=false;
	public Boolean isVisibilidadCeldaCancelarTareaCliente=false;
	public Boolean isVisibilidadCeldaGuardarTareaCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTareaCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoTareaCliente() {
		return this.iIdNuevoTareaCliente;
	}

	public void setiIdNuevoTareaCliente(Long iIdNuevoTareaCliente) {
		this.iIdNuevoTareaCliente = iIdNuevoTareaCliente;
	}
	
	public Long getidTareaClienteActual() {
		return this.idTareaClienteActual;
	}

	public void setidTareaClienteActual(Long idTareaClienteActual) {
		this.idTareaClienteActual = idTareaClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TareaCliente gettareacliente() {
		return this.tareacliente;
	}

	public void settareacliente(TareaCliente tareacliente) {
		this.tareacliente = tareacliente;
	}
	
	public TareaCliente gettareaclienteAux() {
		return this.tareaclienteAux;
	}

	public void settareaclienteAux(TareaCliente tareaclienteAux) {
		this.tareaclienteAux = tareaclienteAux;
	}				
	
	public TareaCliente gettareaclienteAnterior() {
		return this.tareaclienteAnterior;
	}

	public void settareaclienteAnterior(TareaCliente tareaclienteAnterior) {
		this.tareaclienteAnterior = tareaclienteAnterior;
	}	
	
	public TareaCliente gettareaclienteTotales() {
		return this.tareaclienteTotales;
	}

	public void settareaclienteTotales(TareaCliente tareaclienteTotales) {
		this.tareaclienteTotales = tareaclienteTotales;
	}	
	
	public TareaCliente gettareaclienteBean() {
		return this.tareaclienteBean;
	}

	public void settareaclienteBean(TareaCliente tareaclienteBean) {
		this.tareaclienteBean = tareaclienteBean;
	}	
	
	public TareaClienteParameterReturnGeneral gettareaclienteReturnGeneral() {
		return this.tareaclienteReturnGeneral;
	}

	public void settareaclienteReturnGeneral(TareaClienteParameterReturnGeneral tareaclienteReturnGeneral) {
		this.tareaclienteReturnGeneral = tareaclienteReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
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
	
	
	public TareaClienteLogic getTareaClienteLogic()	{		
		return tareaclienteLogic;
	}

	public void setTareaClienteLogic(TareaClienteLogic tareaclienteLogic) {
		this.tareaclienteLogic = tareaclienteLogic;
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
	
	public Boolean getIsEsNuevoTareaCliente() {
		return isEsNuevoTareaCliente;
	}

	public void setIsEsNuevoTareaCliente(Boolean isEsNuevoTareaCliente) {
		this.isEsNuevoTareaCliente = isEsNuevoTareaCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTareaCliente() {
		return esParaAccionDesdeFormularioTareaCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTareaCliente(Boolean esParaAccionDesdeFormularioTareaCliente) {
		this.esParaAccionDesdeFormularioTareaCliente = esParaAccionDesdeFormularioTareaCliente;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(tareaclienteSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(tareaclienteSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

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
					facturaLogic.getEntityWithConnection(tareaclienteSessionBean.getlidFacturaActual());
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

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(tareaclienteSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

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
					unidadLogic.getEntityWithConnection(tareaclienteSessionBean.getlidUnidadActual());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.tareacliente!=null) {
						this.tareacliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTareaCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTareaClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTareaClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTareaClienteGenerico!=null && jComboBoxid_empresaTareaClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTareaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.tareacliente!=null) {
						this.tareacliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteTareaCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteTareaCliente!=null) {
						jComboBoxid_clienteFK_IdClienteTareaCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteTareaCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteTareaCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteTareaCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteTareaCliente.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteTareaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteTareaClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteTareaClienteGenerico!=null && jComboBoxid_clienteTareaClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteTareaClienteGenerico.setSelectedIndex(0);
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

					if(this.tareacliente!=null) {
						this.tareacliente.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaTareaCliente.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaTareaCliente!=null) {
						jComboBoxid_facturaFK_IdFacturaTareaCliente.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaTareaCliente!=null) {
							//jComboBoxid_facturaFK_IdFacturaTareaCliente.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaTareaCliente.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaTareaCliente.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaTareaClienteGenerico)throws Exception
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
				jComboBoxid_facturaTareaClienteGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaTareaClienteGenerico!=null && jComboBoxid_facturaTareaClienteGenerico.getItemCount()>0) {
					jComboBoxid_facturaTareaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.tareacliente!=null) {
						this.tareacliente.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoTareaCliente.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoTareaCliente!=null) {
						jComboBoxid_productoFK_IdProductoTareaCliente.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoTareaCliente!=null) {
							//jComboBoxid_productoFK_IdProductoTareaCliente.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoTareaCliente.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoTareaCliente.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoTareaClienteGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoTareaClienteGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoTareaClienteGenerico!=null && jComboBoxid_productoTareaClienteGenerico.getItemCount()>0) {
					jComboBoxid_productoTareaClienteGenerico.setSelectedIndex(0);
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

					if(this.tareacliente!=null) {
						this.tareacliente.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadTareaCliente.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormTareaCliente!=null) {
						if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadTareaCliente!=null) {
						jComboBoxid_unidadFK_IdUnidadTareaCliente.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadTareaCliente!=null) {
							//jComboBoxid_unidadFK_IdUnidadTareaCliente.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadTareaCliente.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadTareaCliente.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadTareaClienteGenerico)throws Exception
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
				jComboBoxid_unidadTareaClienteGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadTareaClienteGenerico!=null && jComboBoxid_unidadTareaClienteGenerico.getItemCount()>0) {
					jComboBoxid_unidadTareaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TareaCliente tareacliente,JComboBox jComboBoxid_empresaTareaClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTareaClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTareaClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tareacliente.setid_empresa(empresaAux.getId());
				tareacliente.setempresa_descripcion(TareaClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tareacliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(TareaCliente tareacliente,JComboBox jComboBoxid_clienteTareaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteTareaClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteTareaClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				tareacliente.setid_cliente(clienteAux.getId());
				tareacliente.setcliente_descripcion(TareaClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				tareacliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(TareaCliente tareacliente,JComboBox jComboBoxid_facturaTareaClienteGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaTareaClienteGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaTareaClienteGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				tareacliente.setid_factura(facturaAux.getId());
				tareacliente.setfactura_descripcion(TareaClienteConstantesFunciones.getFacturaDescripcion(facturaAux));
				tareacliente.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(TareaCliente tareacliente,JComboBox jComboBoxid_productoTareaClienteGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoTareaClienteGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoTareaClienteGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				tareacliente.setid_producto(productoAux.getId());
				tareacliente.setproducto_descripcion(TareaClienteConstantesFunciones.getProductoDescripcion(productoAux));
				tareacliente.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(TareaCliente tareacliente,JComboBox jComboBoxid_unidadTareaClienteGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadTareaClienteGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadTareaClienteGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				tareacliente.setid_unidad(unidadAux.getId());
				tareacliente.setunidad_descripcion(TareaClienteConstantesFunciones.getUnidadDescripcion(unidadAux));
				tareacliente.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
					}

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
					}

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteTareaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteTareaCliente.addItem(cliente);
							}
						}

						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
					}

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTareaCliente.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaTareaCliente.addItem(factura);
							}
						}

						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
					}

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoTareaCliente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoTareaCliente.addItem(producto);
							}
						}

						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTareaCliente!=null) { 
					}

					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadTareaCliente.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadTareaCliente.addItem(unidad);
							}
						}

						if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteTareaCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteTareaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaTareaCliente.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTareaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoTareaCliente.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoTareaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormTareaCliente!=null) {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadTareaCliente.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadTareaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTareaCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TareaClienteConstantesFunciones.refrescarForeignKeysDescripcionesTareaCliente(this.tareaclienteLogic.getTareaClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TareaClienteConstantesFunciones.refrescarForeignKeysDescripcionesTareaCliente(this.tareaclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tareaclienteLogic.setTareaClientes(this.tareaclientes);
			tareaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TareaClienteParameterReturnGeneral getTareaClienteParameterGeneral() {
		return this.tareaclienteParameterGeneral;
	}
	
	public void setTareaClienteParameterGeneral(TareaClienteParameterReturnGeneral tareaclienteParameterGeneral) {
		this.tareaclienteParameterGeneral = tareaclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTareaCliente() {
		return isPermisoTodoTareaCliente;
	}

	public void setIsPermisoTodoTareaCliente(Boolean isPermisoTodoTareaCliente) {
		this.isPermisoTodoTareaCliente = isPermisoTodoTareaCliente;
	}

	public Boolean getIsPermisoNuevoTareaCliente() {
		return isPermisoNuevoTareaCliente;
	}

	public void setIsPermisoNuevoTareaCliente(Boolean isPermisoNuevoTareaCliente) {
		this.isPermisoNuevoTareaCliente = isPermisoNuevoTareaCliente;
	}

	public Boolean getIsPermisoActualizarTareaCliente() {
		return isPermisoActualizarTareaCliente;
	}

	public void setIsPermisoActualizarTareaCliente(Boolean isPermisoActualizarTareaCliente) {
		this.isPermisoActualizarTareaCliente = isPermisoActualizarTareaCliente;
	}

	public Boolean getIsPermisoEliminarTareaCliente() {
		return isPermisoEliminarTareaCliente;
	}

	public void setIsPermisoEliminarTareaCliente(Boolean isPermisoEliminarTareaCliente) {
		this.isPermisoEliminarTareaCliente = isPermisoEliminarTareaCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTareaCliente() {
		return isPermisoGuardarCambiosTareaCliente;
	}

	public void setIsPermisoGuardarCambiosTareaCliente(Boolean isPermisoGuardarCambiosTareaCliente) {
		this.isPermisoGuardarCambiosTareaCliente = isPermisoGuardarCambiosTareaCliente;
	}
	
	public Boolean getIsPermisoConsultaTareaCliente() {
		return isPermisoConsultaTareaCliente;
	}

	public void setIsPermisoConsultaTareaCliente(Boolean isPermisoConsultaTareaCliente) {
		this.isPermisoConsultaTareaCliente = isPermisoConsultaTareaCliente;
	}

	public Boolean getIsPermisoBusquedaTareaCliente() {
		return isPermisoBusquedaTareaCliente;
	}

	public void setIsPermisoBusquedaTareaCliente(Boolean isPermisoBusquedaTareaCliente) {
		this.isPermisoBusquedaTareaCliente = isPermisoBusquedaTareaCliente;
	}

	public Boolean getIsPermisoReporteTareaCliente() {
		return isPermisoReporteTareaCliente;
	}

	public void setIsPermisoReporteTareaCliente(Boolean isPermisoReporteTareaCliente) {
		this.isPermisoReporteTareaCliente = isPermisoReporteTareaCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTareaCliente() {
		return isPermisoPaginacionMedioTareaCliente;
	}

	public void setIsPermisoPaginacionMedioTareaCliente(Boolean isPermisoPaginacionMedioTareaCliente) {
		this.isPermisoPaginacionMedioTareaCliente = isPermisoPaginacionMedioTareaCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTareaCliente() {
		return isPermisoPaginacionTodoTareaCliente;
	}

	public void setIsPermisoPaginacionTodoTareaCliente(Boolean isPermisoPaginacionTodoTareaCliente) {
		this.isPermisoPaginacionTodoTareaCliente = isPermisoPaginacionTodoTareaCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTareaCliente() {
		return isPermisoPaginacionAltoTareaCliente;
	}

	public void setIsPermisoPaginacionAltoTareaCliente(Boolean isPermisoPaginacionAltoTareaCliente) {
		this.isPermisoPaginacionAltoTareaCliente = isPermisoPaginacionAltoTareaCliente;
	}
	
	public Boolean getIsPermisoCopiarTareaCliente() {
		return isPermisoCopiarTareaCliente;
	}

	public void setIsPermisoCopiarTareaCliente(Boolean isPermisoCopiarTareaCliente) {
		this.isPermisoCopiarTareaCliente = isPermisoCopiarTareaCliente;
	}
	
	public Boolean getIsPermisoVerFormTareaCliente() {
		return isPermisoVerFormTareaCliente;
	}

	public void setIsPermisoVerFormTareaCliente(Boolean isPermisoVerFormTareaCliente) {
		this.isPermisoVerFormTareaCliente = isPermisoVerFormTareaCliente;
	}
	
	public Boolean getIsPermisoDuplicarTareaCliente() {
		return isPermisoDuplicarTareaCliente;
	}

	public void setIsPermisoDuplicarTareaCliente(Boolean isPermisoDuplicarTareaCliente) {
		this.isPermisoDuplicarTareaCliente = isPermisoDuplicarTareaCliente;
	}
	
	public Boolean getIsPermisoOrdenTareaCliente() {
		return isPermisoOrdenTareaCliente;
	}

	public void setIsPermisoOrdenTareaCliente(Boolean isPermisoOrdenTareaCliente) {
		this.isPermisoOrdenTareaCliente = isPermisoOrdenTareaCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTareaCliente() {
		return isVisibilidadCeldaNuevoTareaCliente;
	}

	public void setIsVisibilidadCeldaNuevoTareaCliente(Boolean isVisibilidadCeldaNuevoTareaCliente) {
		this.isVisibilidadCeldaNuevoTareaCliente = isVisibilidadCeldaNuevoTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTareaCliente() {
		return isVisibilidadCeldaDuplicarTareaCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTareaCliente(Boolean isVisibilidadCeldaDuplicarTareaCliente) {
		this.isVisibilidadCeldaDuplicarTareaCliente = isVisibilidadCeldaDuplicarTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTareaCliente() {
		return isVisibilidadCeldaCopiarTareaCliente;
	}

	public void setIsVisibilidadCeldaCopiarTareaCliente(Boolean isVisibilidadCeldaCopiarTareaCliente) {
		this.isVisibilidadCeldaCopiarTareaCliente = isVisibilidadCeldaCopiarTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTareaCliente() {
		return isVisibilidadCeldaVerFormTareaCliente;
	}

	public void setIsVisibilidadCeldaVerFormTareaCliente(Boolean isVisibilidadCeldaVerFormTareaCliente) {
		this.isVisibilidadCeldaVerFormTareaCliente = isVisibilidadCeldaVerFormTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTareaCliente() {
		return isVisibilidadCeldaOrdenTareaCliente;
	}

	public void setIsVisibilidadCeldaOrdenTareaCliente(Boolean isVisibilidadCeldaOrdenTareaCliente) {
		this.isVisibilidadCeldaOrdenTareaCliente = isVisibilidadCeldaOrdenTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTareaCliente() {
		return isVisibilidadCeldaNuevoRelacionesTareaCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTareaCliente(Boolean isVisibilidadCeldaNuevoRelacionesTareaCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTareaCliente = isVisibilidadCeldaNuevoRelacionesTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTareaCliente() {
		return isVisibilidadCeldaModificarTareaCliente;
	}

	public void setIsVisibilidadCeldaModificarTareaCliente(Boolean isVisibilidadCeldaModificarTareaCliente) {
		this.isVisibilidadCeldaModificarTareaCliente = isVisibilidadCeldaModificarTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTareaCliente() {
		return isVisibilidadCeldaActualizarTareaCliente;
	}

	public void setIsVisibilidadCeldaActualizarTareaCliente(Boolean isVisibilidadCeldaActualizarTareaCliente) {
		this.isVisibilidadCeldaActualizarTareaCliente = isVisibilidadCeldaActualizarTareaCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTareaCliente() {
		return isVisibilidadCeldaEliminarTareaCliente;
	}

	public void setIsVisibilidadCeldaEliminarTareaCliente(Boolean isVisibilidadCeldaEliminarTareaCliente) {
		this.isVisibilidadCeldaEliminarTareaCliente = isVisibilidadCeldaEliminarTareaCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTareaCliente() {
		return isVisibilidadCeldaCancelarTareaCliente;
	}

	public void setIsVisibilidadCeldaCancelarTareaCliente(Boolean isVisibilidadCeldaCancelarTareaCliente) {
		this.isVisibilidadCeldaCancelarTareaCliente = isVisibilidadCeldaCancelarTareaCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTareaCliente() {
		return isVisibilidadCeldaGuardarTareaCliente;
	}

	public void setIsVisibilidadCeldaGuardarTareaCliente(Boolean isVisibilidadCeldaGuardarTareaCliente) {
		this.isVisibilidadCeldaGuardarTareaCliente = isVisibilidadCeldaGuardarTareaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTareaCliente() {
		return isVisibilidadCeldaGuardarCambiosTareaCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTareaCliente(Boolean isVisibilidadCeldaGuardarCambiosTareaCliente) {
		this.isVisibilidadCeldaGuardarCambiosTareaCliente = isVisibilidadCeldaGuardarCambiosTareaCliente;
	}
		
	public TareaClienteSessionBean gettareaclienteSessionBean() {
		return this.tareaclienteSessionBean;
	}
	
	public void settareaclienteSessionBean(TareaClienteSessionBean tareaclienteSessionBean) {
		this.tareaclienteSessionBean=tareaclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTareaCliente(TareaCliente tareacliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tareacliente,null);
				this.setActualParaGuardarClienteForeignKey(tareacliente,null);
				this.setActualParaGuardarFacturaForeignKey(tareacliente,null);
				this.setActualParaGuardarProductoForeignKey(tareacliente,null);
				this.setActualParaGuardarUnidadForeignKey(tareacliente,null);
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
	
	public void bugActualizarReferenciaActual(TareaCliente tareacliente,TareaCliente tareaclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTareaCliente(tareacliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tareaclienteAux.setId(tareacliente.getId());
		tareaclienteAux.setVersionRow(tareacliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTareaCliente();
		
			int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tareaclienteValidator.getInvalidValues(this.tareacliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tareaclienteLogic.setDatosCliente(datosCliente);
			tareaclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tareaclienteAux=new  TareaCliente();
				
				tareaclienteAux.setIsNew(true);
				tareaclienteAux.setIsChanged(true);
				
				tareaclienteAux.setTareaClienteOriginal(this.tareacliente);
				
				tareaclienteAux.setId(this.tareacliente.getId());	
				tareaclienteAux.setVersionRow(this.tareacliente.getVersionRow());	
				tareaclienteAux.setid_empresa(this.tareacliente.getid_empresa());	
				tareaclienteAux.setid_cliente(this.tareacliente.getid_cliente());	
				tareaclienteAux.setid_factura(this.tareacliente.getid_factura());	
				tareaclienteAux.setid_producto(this.tareacliente.getid_producto());	
				tareaclienteAux.setid_unidad(this.tareacliente.getid_unidad());	
				tareaclienteAux.setprecio(this.tareacliente.getprecio());	
				tareaclienteAux.setnumero_metros(this.tareacliente.getnumero_metros());	
				tareaclienteAux.setnumero_litros(this.tareacliente.getnumero_litros());	
				tareaclienteAux.settarea(this.tareacliente.gettarea());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tareaclienteAux,tareaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.saveTareaClientes();//WithConnection
						//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);
					
					this.refrescarForeignKeysDescripcionesTareaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tareaclienteLogic.saveTareaClienteRelaciones(tareaclienteAux);//WithConnection
								//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tareaclienteAux,tareaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tareaclienteAux=new  TareaCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tareaclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tareaclienteSessionBean.getEsGuardarRelacionado() && this.tareacliente.getId()>=0)) {
						
					tareaclienteAux.setIsNew(false);
				}
				
				tareaclienteAux.setIsDeleted(false);
			
				tareaclienteAux.setId(this.tareacliente.getId());	
				tareaclienteAux.setVersionRow(this.tareacliente.getVersionRow());	
				tareaclienteAux.setid_empresa(this.tareacliente.getid_empresa());	
				tareaclienteAux.setid_cliente(this.tareacliente.getid_cliente());	
				tareaclienteAux.setid_factura(this.tareacliente.getid_factura());	
				tareaclienteAux.setid_producto(this.tareacliente.getid_producto());	
				tareaclienteAux.setid_unidad(this.tareacliente.getid_unidad());	
				tareaclienteAux.setprecio(this.tareacliente.getprecio());	
				tareaclienteAux.setnumero_metros(this.tareacliente.getnumero_metros());	
				tareaclienteAux.setnumero_litros(this.tareacliente.getnumero_litros());	
				tareaclienteAux.settarea(this.tareacliente.gettarea());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tareaclienteAux,tareaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.saveTareaClientes();//WithConnection
						//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);
					
					this.refrescarForeignKeysDescripcionesTareaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tareaclienteLogic.saveTareaClienteRelaciones(tareaclienteAux);//WithConnection
								//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tareaclienteAux,tareaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tareacliente,tareaclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tareaclienteAux=new  TareaCliente();
				
				tareaclienteAux.setIsNew(false);
				tareaclienteAux.setIsChanged(false);
				
				tareaclienteAux.setIsDeleted(true);
				
				tareaclienteAux.setId(this.tareacliente.getId());	
				tareaclienteAux.setVersionRow(this.tareacliente.getVersionRow());	
				tareaclienteAux.setid_empresa(this.tareacliente.getid_empresa());	
				tareaclienteAux.setid_cliente(this.tareacliente.getid_cliente());	
				tareaclienteAux.setid_factura(this.tareacliente.getid_factura());	
				tareaclienteAux.setid_producto(this.tareacliente.getid_producto());	
				tareaclienteAux.setid_unidad(this.tareacliente.getid_unidad());	
				tareaclienteAux.setprecio(this.tareacliente.getprecio());	
				tareaclienteAux.setnumero_metros(this.tareacliente.getnumero_metros());	
				tareaclienteAux.setnumero_litros(this.tareacliente.getnumero_litros());	
				tareaclienteAux.settarea(this.tareacliente.gettarea());	
				
				if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tareaclienteAux.getId()>=0) {	
						this.tareaclientesEliminados.add(tareaclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tareaclienteAux,tareaclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.saveTareaClientes();//WithConnection
						//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tareaclienteLogic.saveTareaClienteRelaciones(tareaclienteAux);//WithConnection
								//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
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
							if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tareaclienteAux,tareaclienteLogic.getTareaClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tareaclienteAux,tareaclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getTareaClientes().addAll(this.tareaclientesEliminados);
					
					tareaclienteLogic.saveTareaClientes();//WithConnection
					//tareaclienteLogic.getSetVersionRowTareaClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTareaCliente();
				
				this.tareaclientesEliminados= new ArrayList<TareaCliente>();		
			}
			
			if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tarea Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tareacliente=tareaclienteAux;
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
      		//this.finishProcessTareaCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TareaCliente tareaclienteLocal) throws Exception {
		
		if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TareaCliente tareaclienteLocal) throws Exception {	
		if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tareaclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				tareaclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				tareaclienteLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				tareaclienteLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				tareaclienteLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTareaClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tareaclienteValidator.getInvalidValues(this.tareacliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TareaCliente tareacliente,List<TareaCliente> tareaclientes) throws Exception {
		try	{		
			TareaClienteConstantesFunciones.actualizarLista(tareacliente,tareaclientes,this.tareaclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TareaCliente tareacliente,List<TareaCliente> tareaclientes) throws Exception {
		try	{			
			TareaClienteConstantesFunciones.actualizarSelectedLista(tareacliente,tareaclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TareaCliente> tareaclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tareaclientesLocal=this.tareaclienteLogic.getTareaClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tareaclientesLocal=this.tareaclientes;
			}
			//ARCHITECTURE
		
			for(TareaCliente tareaclienteLocal:tareaclientesLocal) {
				if(this.permiteMantenimiento(tareaclienteLocal) && tareaclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TareaClienteConstantesFunciones.getTareaClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelid_empresaTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelid_clienteTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelid_facturaTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelid_productoTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelid_unidadTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelprecioTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.NUMEROMETROS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_metrosTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.NUMEROLITROS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_litrosTareaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TareaClienteConstantesFunciones.TAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabeltareaTareaCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelid_empresaTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelid_clienteTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelid_facturaTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelid_productoTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelid_unidadTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelprecioTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_metrosTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_litrosTareaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTareaCliente.jLabeltareaTareaCliente,"");
		
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
		this.iIdNuevoTareaCliente--;	
		
		
		this.tareaclienteAux=new TareaCliente();
		
		this.tareaclienteAux.setId(this.iIdNuevoTareaCliente);
		this.tareaclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tareaclienteLogic.getTareaClientes().add(this.tareaclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tareaclientes.add(this.tareaclienteAux);
		}
		//ARCHITECTURE
		
		this.tareacliente=this.tareaclienteAux;
		
		if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTareaCliente(this.tareacliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTareaCliente(this.tareacliente);
		}
				
		//this.setDefaultControlesTareaCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTareaCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTareaCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTareaCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTareaCliente(this.tareaclienteBean,this.tareacliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TareaClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
			classes=TareaClienteConstantesFunciones.getClassesRelationshipsOfTareaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tareaclienteReturnGeneral=tareaclienteLogic.procesarEventosTareaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tareaclienteLogic.getTareaClientes(),this.tareacliente,this.tareaclienteParameterGeneral,this.isEsNuevoTareaCliente,classes);//this.tareaclienteLogic.getTareaCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTareaCliente(this.tareaclienteReturnGeneral,this.tareaclienteBean,false);
		
		if(this.tareaclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente());
		}
		
		if(this.tareaclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente(),classes);//this.tareaclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTareaCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTareaCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TareaClienteBeanSwingJInternalFrameAdditional.RecargarFormTareaCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTareaCliente(false);
						
			if(tareaclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTareaCliente();
			}
			
			this.actualizarVisualTableDatosTareaCliente();
			
			this.jTableDatosTareaCliente.setRowSelectionInterval(this.getIndiceNuevoTareaCliente(), this.getIndiceNuevoTareaCliente());
			
			this.seleccionarFilaTablaTareaClienteActual();
						
			this.actualizarEstadoCeldasBotonesTareaCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTareaCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarprecioTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarnumero_metrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarnumero_litrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activartareaTareaCliente);	
		//
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarid_empresaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarid_clienteTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarid_facturaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarid_productoTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setEnabled(isHabilitar && this.tareaclienteConstantesFunciones.activarid_unidadTareaCliente);
	};
	
	public void setDefaultControlesTareaCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTareaCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tareaclienteSessionBean.setConGuardarRelaciones(true);			
			this.tareaclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.setVisible(true);
			
					
		} else {
			//this.tareaclienteSessionBean.setConGuardarRelaciones(false);			
			this.tareaclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTareaCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
				if(tareaclienteAux.getId().equals(this.iIdNuevoTareaCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TareaCliente tareaclienteAux:this.tareaclientes) {
				if(tareaclienteAux.getId().equals(this.iIdNuevoTareaCliente)) {
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
	
	public int getIndiceActualTareaCliente(TareaCliente tareacliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
				if(tareaclienteAux.getId().equals(tareacliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TareaCliente tareaclienteAux:this.tareaclientes) {
				if(tareaclienteAux.getId().equals(tareacliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTareaCliente(TareaCliente tareaclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
				if(tareaclienteAux.getTareaClienteOriginal().getId().equals(tareaclienteOriginal.getId())) {
					existe=true;
					tareaclienteOriginal.setId(tareaclienteAux.getId());
					tareaclienteOriginal.setVersionRow(tareaclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TareaCliente tareaclienteAux:this.tareaclientes) {
				if(tareaclienteAux.getTareaClienteOriginal().getId().equals(tareaclienteOriginal.getId())) {
					existe=true;
					tareaclienteOriginal.setId(tareaclienteAux.getId());
					tareaclienteOriginal.setVersionRow(tareaclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTareaCliente(Boolean esParaCancelar) throws Exception {
		tareaclientesAux=new ArrayList<TareaCliente>();
		tareaclienteAux=new TareaCliente();
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
					if(tareaclienteAux.getId()<0) {
						tareaclientesAux.add(tareaclienteAux);
					}		
				}
				this.iIdNuevoTareaCliente=0L;
				this.tareaclienteLogic.getTareaClientes().removeAll(tareaclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TareaCliente tareaclienteAux:this.tareaclientes) {
					if(tareaclienteAux.getId()<0) {
						tareaclientesAux.add(tareaclienteAux);
					}		
				}
				this.iIdNuevoTareaCliente=0L;
				this.tareaclientes.removeAll(tareaclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTareaCliente 
					&& this.tareaclienteLogic.getTareaClientes().size()>0
					) {
					tareaclienteAux=this.tareaclienteLogic.getTareaClientes().get(this.tareaclienteLogic.getTareaClientes().size() - 1);
				
					if(tareaclienteAux.getId()<0) {
						this.tareaclienteLogic.getTareaClientes().remove(tareaclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTareaCliente && this.tareaclientes.size()>0) {
					tareaclienteAux=this.tareaclientes.get(this.tareaclientes.size() - 1);
				
					if(tareaclienteAux.getId()<0) {
						this.tareaclientes.remove(tareaclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTareaCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tareacliente.getId()<0) {
				this.tareaclienteLogic.getTareaClientes().remove(this.tareacliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tareacliente.getId()<0) {
				this.tareaclientes.remove(this.tareacliente);
			}
		}			
	}
	
	public void setEstadosInicialesTareaCliente(List<TareaCliente> tareaclientesAux) throws Exception {
		TareaClienteConstantesFunciones.setEstadosInicialesTareaCliente(tareaclientesAux);
	}
	
	public void setEstadosInicialesTareaCliente(TareaCliente tareaclienteAux) throws Exception {
		TareaClienteConstantesFunciones.setEstadosInicialesTareaCliente(tareaclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTareaClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTareaClienteActual()) {
				if(!this.isEsNuevoTareaCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTareaCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTareaClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tarea Cliente ?", "MANTENIMIENTO DE Tarea Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TareaCliente tareacliente) throws Exception {
		TareaClienteConstantesFunciones.seleccionarAsignar(this.tareacliente,tareacliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTareaCliente=this.isPermisoActualizarOriginalTareaCliente;
			
			
			this.seleccionarAsignar(tareacliente);
			
			

			idClienteActual=tareacliente.getid_cliente();
			this.seleccionarClienteActual();

			idFacturaActual=tareacliente.getid_factura();
			this.seleccionarFacturaActual();

			idProductoActual=tareacliente.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TareaClienteConstantesFunciones.quitarEspaciosTareaCliente(this.tareacliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTareaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tareaclienteSessionBean.setsFuncionBusquedaRapida(this.tareaclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
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
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
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
			if(this.isEsNuevoTareaCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTareaCliente(esParaCancelar);				
				this.cancelarNuevoTareaCliente(esParaCancelar);								
			}
			
			this.tareacliente=new TareaCliente();
			
			this.inicializarTareaCliente();
			
			this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTareaCliente() throws Exception {
		try {
			TareaClienteConstantesFunciones.inicializarTareaCliente(this.tareacliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tareaclienteLogic.getTareaClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTareaClientes(String sAccionBusqueda,List<TareaCliente> tareaclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TareaCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TareaClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TareaClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TareaCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tarea Clientes");		
		parameters.put("busquedapor", TareaClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTareaCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TareaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TareaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTareaCliente=new JRBeanArrayDataSource(TareaClienteJInternalFrame.TraerTareaClienteBeans(tareaclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTareaCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TareaClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TareaClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TareaClienteBean.TraerTareaClienteBeans(tareaclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTareaClienteActionPerformed(null);
					//this.generarExcelReporteTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTareaClientes(sAccionBusqueda,sTipoArchivoReporte,tareaclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTareaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TareaCliente> tareaclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TareaClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTareaCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TareaCliente tareacliente : tareaclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TareaClienteConstantesFunciones.generarExcelReporteDataTareaCliente("NORMAL",row,workbook,tareacliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTareaCliente(String sTipo,Row row,Workbook workbook) {
		
		TareaClienteConstantesFunciones.generarExcelReporteHeaderTareaCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTareaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TareaCliente> tareaclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TareaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TareaCliente tareacliente : tareaclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TareaClienteConstantesFunciones.getTareaClienteDescripcion(tareacliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getnumero_metros());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.getnumero_litros());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TareaClienteConstantesFunciones.LABEL_TAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TareaClienteConstantesFunciones.LABEL_TAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tareacliente.gettarea());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTareaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TareaCliente> tareaclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TareaCliente> tareaclientesRespaldo=null;
		
		classes=TareaClienteConstantesFunciones.getClassesRelationshipsOfTareaCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tareaclienteLogic.setDatosCliente(this.datosCliente);
		this.tareaclienteLogic.setDatosDeep(this.datosDeep);
		this.tareaclienteLogic.setIsConDeep(true);
		
		tareaclientesRespaldo=this.tareaclienteLogic.getTareaClientes();
		
		this.tareaclienteLogic.setTareaClientes(tareaclientesParaReportes);	
		this.tareaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tareaclientesParaReportes=this.tareaclienteLogic.getTareaClientes();
		this.tareaclienteLogic.setTareaClientes(tareaclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TareaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTareaCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TareaCliente tareacliente : tareaclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTareaCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TareaClienteConstantesFunciones.generarExcelReporteDataTareaCliente("NORMAL",row,workbook,tareacliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TareaClienteConstantesFunciones.getTareaClienteDescripcion(tareacliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTareaCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTareaCliente() throws Exception {		
		this.startProcessTareaCliente(true);
	}
	
	public void startProcessTareaCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTareaCliente ,this.jPanelParametrosReportesTareaCliente, this.jScrollPanelDatosTareaCliente,this.jPanelPaginacionTareaCliente, this.jScrollPanelDatosEdicionTareaCliente, this.jPanelAccionesTareaCliente,this.jPanelAccionesFormularioTareaCliente,this.jmenuBarTareaCliente,this.jmenuBarDetalleTareaCliente,this.jTtoolBarTareaCliente,this.jTtoolBarDetalleTareaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTareaCliente=this.jTabbedPaneBusquedasTareaCliente; 
		
		final JPanel jPanelParametrosReportesTareaCliente=this.jPanelParametrosReportesTareaCliente;
		//final JScrollPane jScrollPanelDatosTareaCliente=this.jScrollPanelDatosTareaCliente;
		final JTable jTableDatosTareaCliente=this.jTableDatosTareaCliente;		
		final JPanel jPanelPaginacionTareaCliente=this.jPanelPaginacionTareaCliente;
		//final JScrollPane jScrollPanelDatosEdicionTareaCliente=this.jScrollPanelDatosEdicionTareaCliente;
		final JPanel jPanelAccionesTareaCliente=this.jPanelAccionesTareaCliente;
		
		JPanel jPanelCamposAuxiliarTareaCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTareaCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			jPanelCamposAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jPanelCamposTareaCliente;
			jPanelAccionesFormularioAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jPanelAccionesFormularioTareaCliente;
		}
		
		final JPanel jPanelCamposTareaCliente=jPanelCamposAuxiliarTareaCliente;
		final JPanel jPanelAccionesFormularioTareaCliente=jPanelAccionesFormularioAuxiliarTareaCliente;
		
		
		final JMenuBar jmenuBarTareaCliente=this.jmenuBarTareaCliente;
		final JToolBar jTtoolBarTareaCliente=this.jTtoolBarTareaCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTareaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTareaCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			jmenuBarDetalleAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jmenuBarDetalleTareaCliente;
			jTtoolBarDetalleAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jTtoolBarDetalleTareaCliente;
		}
		
		final JMenuBar jmenuBarDetalleTareaCliente=jmenuBarDetalleAuxiliarTareaCliente;
		final JToolBar jTtoolBarDetalleTareaCliente=jTtoolBarDetalleAuxiliarTareaCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTareaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTareaCliente;
			processRunnable.jTableDatos=jTableDatosTareaCliente;
			processRunnable.jPanelCampos=jPanelCamposTareaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTareaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTareaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTareaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTareaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTareaCliente;
			processRunnable.jTtoolBar=jTtoolBarTareaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTareaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTareaCliente ,jPanelParametrosReportesTareaCliente,jTableDatosTareaCliente, /*jScrollPanelDatosTareaCliente,*/jPanelCamposTareaCliente,jPanelPaginacionTareaCliente, /*jScrollPanelDatosEdicionTareaCliente,*/ jPanelAccionesTareaCliente,jPanelAccionesFormularioTareaCliente,jmenuBarTareaCliente,jmenuBarDetalleTareaCliente,jTtoolBarTareaCliente,jTtoolBarDetalleTareaCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTareaCliente ,jPanelParametrosReportesTareaCliente, jScrollPanelDatosTareaCliente,jPanelPaginacionTareaCliente, jScrollPanelDatosEdicionTareaCliente, jPanelAccionesTareaCliente,jPanelAccionesFormularioTareaCliente,jmenuBarTareaCliente,jmenuBarDetalleTareaCliente,jTtoolBarTareaCliente,jTtoolBarDetalleTareaCliente);
						
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
	
	public void finishProcessTareaCliente() {// throws Exception 
		this.finishProcessTareaCliente(true);
	}
	
	public void finishProcessTareaCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTareaCliente ,this.jPanelParametrosReportesTareaCliente, this.jScrollPanelDatosTareaCliente,this.jPanelPaginacionTareaCliente, this.jScrollPanelDatosEdicionTareaCliente, this.jPanelAccionesTareaCliente,this.jPanelAccionesFormularioTareaCliente,this.jmenuBarTareaCliente,this.jmenuBarDetalleTareaCliente,this.jTtoolBarTareaCliente,this.jTtoolBarDetalleTareaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTareaCliente=this.jTabbedPaneBusquedasTareaCliente; 
		
		final JPanel jPanelParametrosReportesTareaCliente=this.jPanelParametrosReportesTareaCliente;
		//final JScrollPane jScrollPanelDatosTareaCliente=this.jScrollPanelDatosTareaCliente;
		final JTable jTableDatosTareaCliente=this.jTableDatosTareaCliente;		
		final JPanel jPanelPaginacionTareaCliente=this.jPanelPaginacionTareaCliente;
		//final JScrollPane jScrollPanelDatosEdicionTareaCliente=this.jScrollPanelDatosEdicionTareaCliente;
		final JPanel jPanelAccionesTareaCliente=this.jPanelAccionesTareaCliente;
		
		JPanel jPanelCamposAuxiliarTareaCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTareaCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			jPanelCamposAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jPanelCamposTareaCliente;
			jPanelAccionesFormularioAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jPanelAccionesFormularioTareaCliente;
		}
		
		final JPanel jPanelCamposTareaCliente=jPanelCamposAuxiliarTareaCliente;
		final JPanel jPanelAccionesFormularioTareaCliente=jPanelAccionesFormularioAuxiliarTareaCliente;
		
		
		final JMenuBar jmenuBarTareaCliente=this.jmenuBarTareaCliente;		
		final JToolBar jTtoolBarTareaCliente=this.jTtoolBarTareaCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTareaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTareaCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			jmenuBarDetalleAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jmenuBarDetalleTareaCliente;
			jTtoolBarDetalleAuxiliarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jTtoolBarDetalleTareaCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTareaCliente=jmenuBarDetalleAuxiliarTareaCliente;
		final JToolBar jTtoolBarDetalleTareaCliente=jTtoolBarDetalleAuxiliarTareaCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTareaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTareaCliente;
			processRunnable.jTableDatos=jTableDatosTareaCliente;
			processRunnable.jPanelCampos=jPanelCamposTareaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTareaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTareaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTareaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTareaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTareaCliente;
			processRunnable.jTtoolBar=jTtoolBarTareaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTareaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTareaCliente ,jPanelParametrosReportesTareaCliente, jTableDatosTareaCliente,/*jScrollPanelDatosTareaCliente,*/jPanelCamposTareaCliente,jPanelPaginacionTareaCliente, /*jScrollPanelDatosEdicionTareaCliente,*/ jPanelAccionesTareaCliente,jPanelAccionesFormularioTareaCliente,jmenuBarTareaCliente,jmenuBarDetalleTareaCliente,jTtoolBarTareaCliente,jTtoolBarDetalleTareaCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTareaCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTareaCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTareaCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTareaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTareaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTareaCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTareaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTareaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTareaCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tareaclienteConstantesFunciones.getsFinalQueryTareaCliente();
		String  finalQueryPaginacionTodos=this.tareaclienteConstantesFunciones.getsFinalQueryTareaCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TareaClienteConstantesFunciones.getArrayColumnasGlobalesNoTareaCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TareaClienteConstantesFunciones.getArrayColumnasGlobalesTareaCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TareaClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tareaclientesEliminados= new ArrayList<TareaCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTareaCliente();
		
				///*TareaClienteSessionBean*/this.tareaclienteSessionBean=new TareaClienteSessionBean();
			
			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
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
					this.iNumeroPaginacion=TareaClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TareaClienteConstantesFunciones.getClassesForeignKeysOfTareaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tareacliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tareaclientesAux= new ArrayList<TareaCliente>();
			
				
			tareaclienteLogic.setDatosCliente(this.datosCliente);
			tareaclienteLogic.setDatosDeep(this.datosDeep);
			tareaclienteLogic.setIsConDeep(true);
			
			
			tareaclienteLogic.getTareaClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tareaclienteLogic.getTodosTareaClientes(finalQueryGlobal,pagination);
					
					//tareaclienteLogic.getTodosTareaClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tareaclienteLogic.getTareaClientes()==null|| tareaclienteLogic.getTareaClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tareaclientesAux= new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux= new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tareaclienteLogic.getTodosTareaClientes(finalQueryGlobal+"",this.pagination);												
							
							//tareaclienteLogic.getTodosTareaClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTareaClientes("Todos",tareaclienteLogic.getTareaClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());					
							tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTareaCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTareaCliente=this.idActual;
				
				} else if(this.idTareaClienteActual!=null && this.idTareaClienteActual!=0L) {
					idTareaCliente=idTareaClienteActual;
				}
				
					
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndicePorId(idTareaCliente);
				
				this.tareaclientes=new ArrayList<TareaCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tareaclienteLogic.getEntity(idTareaCliente);
					
					//tareaclienteLogic.getEntityWithConnection(idTareaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
					tareaclienteLogic.getTareaClientes().add(tareaclienteLogic.getTareaCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareaclientes=new ArrayList<TareaCliente>();
					this.tareaclientes.add(tareacliente);
				}
				
				if(tareaclienteLogic.getTareaCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tareaclienteLogic.getTareaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tareaclienteLogic.getTareaClientes()==null||tareaclienteLogic.getTareaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tareaclientes==null|| tareaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclientesAux=new ArrayList<TareaCliente>();
						tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux=new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tareaclienteLogic.getTareaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTareaClientes("FK_IdCliente",tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTareaClientes("FK_IdCliente",tareaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
						tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tareaclienteLogic.getTareaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tareaclienteLogic.getTareaClientes()==null||tareaclienteLogic.getTareaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tareaclientes==null|| tareaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclientesAux=new ArrayList<TareaCliente>();
						tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux=new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tareaclienteLogic.getTareaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTareaClientes("FK_IdEmpresa",tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTareaClientes("FK_IdEmpresa",tareaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
						tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tareaclienteLogic.getTareaClientesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tareaclienteLogic.getTareaClientes()==null||tareaclienteLogic.getTareaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tareaclientes==null|| tareaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclientesAux=new ArrayList<TareaCliente>();
						tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux=new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tareaclienteLogic.getTareaClientesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTareaClientes("FK_IdFactura",tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTareaClientes("FK_IdFactura",tareaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
						tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tareaclienteLogic.getTareaClientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tareaclienteLogic.getTareaClientes()==null||tareaclienteLogic.getTareaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tareaclientes==null|| tareaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclientesAux=new ArrayList<TareaCliente>();
						tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux=new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tareaclienteLogic.getTareaClientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTareaClientes("FK_IdProducto",tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTareaClientes("FK_IdProducto",tareaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
						tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tareaclienteLogic.getTareaClientesFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tareaclienteLogic.getTareaClientes()==null||tareaclienteLogic.getTareaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tareaclientes==null|| tareaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclientesAux=new ArrayList<TareaCliente>();
						tareaclientesAux.addAll(tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientesAux=new ArrayList<TareaCliente>();
							tareaclientesAux.addAll(tareaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tareaclienteLogic.getTareaClientesFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TareaClienteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTareaClientes("FK_IdUnidad",tareaclienteLogic.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTareaClientes("FK_IdUnidad",tareaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteLogic.setTareaClientes(new ArrayList<TareaCliente>());
						tareaclienteLogic.getTareaClientes().addAll(tareaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclientes=new ArrayList<TareaCliente>();
							tareaclientes.addAll(tareaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTareaCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTareaCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tareaclienteLogic.getTareaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tareaclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tareaclienteLogic.getTareaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tareaclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TareaCliente tareacliente) {
		Boolean permite=true;
		
		if(this.tareacliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TareaClienteConstantesFunciones.getOrderByListaTareaCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TareaClienteConstantesFunciones.getOrderByListaTareaCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TareaCliente tareacliente:tareaclienteLogic.getTareaClientes()) {
				if(tareacliente.getsType().equals(Constantes2.S_TOTALES)) {
					tareaclienteTotales=tareacliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TareaCliente tareacliente:this.tareaclientes) {
				if(tareacliente.getsType().equals(Constantes2.S_TOTALES)) {
					tareaclienteTotales=tareacliente;
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
			this.tareaclienteAux=new TareaCliente();
			this.tareaclienteAux.setsType(Constantes2.S_TOTALES);
			this.tareaclienteAux.setIsNew(false);
			this.tareaclienteAux.setIsChanged(false);
			this.tareaclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TareaClienteConstantesFunciones.TotalizarValoresFilaTareaCliente(this.tareaclienteLogic.getTareaClientes(),this.tareaclienteAux);
				
				this.tareaclienteLogic.getTareaClientes().add(this.tareaclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TareaClienteConstantesFunciones.TotalizarValoresFilaTareaCliente(this.tareaclientes,this.tareaclienteAux);
				
				this.tareaclientes.add(this.tareaclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tareaclienteTotales=new TareaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tareaclienteLogic.getTareaClientes().remove(tareaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tareaclientes.remove(tareaclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tareaclienteTotales=new TareaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TareaCliente tareacliente:tareaclienteLogic.getTareaClientes()) {
				if(tareacliente.getsType().equals(Constantes2.S_TOTALES)) {
					tareaclienteTotales=tareacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TareaClienteConstantesFunciones.TotalizarValoresFilaTareaCliente(this.tareaclienteLogic.getTareaClientes(),tareaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TareaCliente tareacliente:this.tareaclientes) {
				if(tareacliente.getsType().equals(Constantes2.S_TOTALES)) {
					tareaclienteTotales=tareacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TareaClienteConstantesFunciones.TotalizarValoresFilaTareaCliente(this.tareaclientes,tareaclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTareaClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTareaClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTareaClientesFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTareaClientesFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTareaClientesFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTareaClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.getTareaClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTareaClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.getTareaClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTareaClientesFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.getTareaClientesFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTareaClientesFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.getTareaClientesFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTareaClientesFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLogic.getTareaClientesFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosTareaCliente() {
		this.isPermisoTodoTareaCliente=false;
		this.isPermisoNuevoTareaCliente=false;
		this.isPermisoActualizarTareaCliente=false;
		this.isPermisoActualizarOriginalTareaCliente=false;
		this.isPermisoEliminarTareaCliente=false;
		this.isPermisoGuardarCambiosTareaCliente=false;
		this.isPermisoConsultaTareaCliente=false;
		this.isPermisoBusquedaTareaCliente=false;
		this.isPermisoReporteTareaCliente=false;		
		this.isPermisoOrdenTareaCliente=false;		
		this.isPermisoPaginacionMedioTareaCliente=false;		
		this.isPermisoPaginacionAltoTareaCliente=false;
		this.isPermisoPaginacionTodoTareaCliente=false;
		this.isPermisoCopiarTareaCliente=false;		
		this.isPermisoVerFormTareaCliente=false;		
		this.isPermisoDuplicarTareaCliente=false;		
		this.isPermisoOrdenTareaCliente=false;		
	}
	
	public void setPermisosUsuarioTareaCliente(Boolean isPermiso) {
		this.isPermisoTodoTareaCliente=isPermiso;
		this.isPermisoNuevoTareaCliente=isPermiso;
		this.isPermisoActualizarTareaCliente=isPermiso;
		this.isPermisoActualizarOriginalTareaCliente=isPermiso;
		this.isPermisoEliminarTareaCliente=isPermiso;
		this.isPermisoGuardarCambiosTareaCliente=isPermiso;
		this.isPermisoConsultaTareaCliente=isPermiso;
		this.isPermisoBusquedaTareaCliente=isPermiso;
		this.isPermisoReporteTareaCliente=isPermiso;
		this.isPermisoOrdenTareaCliente=isPermiso;		
		this.isPermisoPaginacionMedioTareaCliente=isPermiso;		
		this.isPermisoPaginacionAltoTareaCliente=isPermiso;		
		this.isPermisoPaginacionTodoTareaCliente=isPermiso;		
		this.isPermisoCopiarTareaCliente=isPermiso;		
		this.isPermisoVerFormTareaCliente=isPermiso;		
		this.isPermisoDuplicarTareaCliente=isPermiso;
		this.isPermisoOrdenTareaCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTareaCliente(Boolean isPermiso) {
		//this.isPermisoTodoTareaCliente=isPermiso;
		this.isPermisoNuevoTareaCliente=isPermiso;
		this.isPermisoActualizarTareaCliente=isPermiso;
		this.isPermisoActualizarOriginalTareaCliente=isPermiso;
		this.isPermisoEliminarTareaCliente=isPermiso;
		this.isPermisoGuardarCambiosTareaCliente=isPermiso;
		//this.isPermisoConsultaTareaCliente=isPermiso;
		//this.isPermisoBusquedaTareaCliente=isPermiso;
		//this.isPermisoReporteTareaCliente=isPermiso;
		//this.isPermisoOrdenTareaCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTareaCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTareaCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTareaCliente=isPermiso;		
		//this.isPermisoCopiarTareaCliente=isPermiso;		
		//this.isPermisoDuplicarTareaCliente=isPermiso;
		//this.isPermisoOrdenTareaCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTareaClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TareaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTareaCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTareaClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTareaClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTareaClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTareaClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTareaCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TareaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TareaClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTareaCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTareaCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTareaCliente=this.isPermisoActualizarTareaCliente;
			this.isPermisoEliminarTareaCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTareaCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTareaCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTareaCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTareaCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTareaCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTareaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTareaCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTareaCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTareaCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTareaCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTareaCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTareaCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTareaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTareaCliente.setToolTipText(this.jTableDatosTareaCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTareaCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTareaCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TareaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TareaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTareaCliente() throws Exception {
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
	public void inicializarCombosForeignKeyTareaClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTareaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TareaClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTareaClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyTareaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TareaClienteParameterReturnGeneral tareaclienteReturnGeneral=new TareaClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tareaclienteConstantesFunciones.cargarid_empresaTareaCliente)
					 || (this.esRecargarFks && this.tareaclienteConstantesFunciones.cargarid_empresaTareaCliente)) {

					if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tareaclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.tareaclienteConstantesFunciones.cargarid_clienteTareaCliente)
					 || (this.esRecargarFks && this.tareaclienteConstantesFunciones.cargarid_clienteTareaCliente)) {

					if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+tareaclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.tareaclienteConstantesFunciones.cargarid_facturaTareaCliente)
					 || (this.esRecargarFks && this.tareaclienteConstantesFunciones.cargarid_facturaTareaCliente)) {

					if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+tareaclienteSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.tareaclienteConstantesFunciones.cargarid_productoTareaCliente)
					 || (this.esRecargarFks && this.tareaclienteConstantesFunciones.cargarid_productoTareaCliente)) {

					if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+tareaclienteSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.tareaclienteConstantesFunciones.cargarid_unidadTareaCliente)
					 || (this.esRecargarFks && this.tareaclienteConstantesFunciones.cargarid_unidadTareaCliente)) {

					if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+tareaclienteSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tareaclienteReturnGeneral=tareaclienteLogic.cargarCombosLoteForeignKeyTareaCliente(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalFactura,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tareaclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=tareaclienteReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=tareaclienteReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=tareaclienteReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=tareaclienteReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTareaCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tareaclienteSessionBean==null) {
				this.tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.tareaclienteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyTareaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTareaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTareaCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTareaCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTareaCliente(TareaCliente tareacliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(tareacliente.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(tareacliente.getid_factura(),false,"Formulario");
			this.setActualProductoForeignKey(tareacliente.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(tareacliente.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTareaCliente(TareaCliente tareacliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tareacliente.getCliente()!=null && !sTipoEvento.equals("id_clienteTareaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(tareacliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(tareacliente.getFactura()!=null && !sTipoEvento.equals("id_facturaTareaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(tareacliente.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				if(tareacliente.getProducto()!=null && !sTipoEvento.equals("id_productoTareaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(tareacliente.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTareaCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.tareaclienteConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(this.tareaclienteConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualProductoForeignKey(this.tareaclienteConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.tareaclienteConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTareaCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTareaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTareaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTareaCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTareaCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTareaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTareaCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public TareaClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TareaClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TareaClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tareaclienteSessionBean=new TareaClienteSessionBean(); 
		this.tareaclienteConstantesFunciones=new TareaClienteConstantesFunciones(); 
		this.tareaclienteBean=new TareaCliente();//(this.tareaclienteConstantesFunciones); 		
		this.tareaclienteReturnGeneral=new TareaClienteParameterReturnGeneral(); 
		
		this.tareaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tareaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TareaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TareaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TareaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTareaCliente(true);
			
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
			
			this.tareaclienteConstantesFunciones=new TareaClienteConstantesFunciones(); 
			this.tareaclienteBean=new TareaCliente();//this.tareaclienteConstantesFunciones); 			
			this.tareaclienteReturnGeneral=new TareaClienteParameterReturnGeneral(); 
		
			TareaClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarea Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tareacliente=new TareaCliente();
			this.tareaclientes = new ArrayList<TareaCliente>();
			this.tareaclientesAux = new ArrayList<TareaCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic=new TareaClienteLogic();
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tareaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tareaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTareaCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTareaCliente);	
					}
					
					if(this.jInternalFrameImportacionTareaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTareaCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTareaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTareaCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTareaCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTareaCliente);
				this.jInternalFrameDetalleFormTareaCliente.setVisible(false);
				this.jInternalFrameDetalleFormTareaCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTareaCliente);
					this.jInternalFrameReporteDinamicoTareaCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTareaCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTareaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTareaCliente);
					this.jInternalFrameImportacionTareaCliente.setVisible(false);
					this.jInternalFrameImportacionTareaCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTareaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTareaCliente);
					this.jInternalFrameOrderByTareaCliente.setVisible(false);
					this.jInternalFrameOrderByTareaCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTareaClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TareaClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tareaclienteReturnGeneral=new TareaClienteParameterReturnGeneral();
			
			this.tareaclienteParameterGeneral=new TareaClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tareaclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TareaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TareaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tareaclienteSessionBean.getEsGuardarRelacionado(),this.tareaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TareaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tareaclienteSessionBean.getEsGuardarRelacionado(),this.tareaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaDuplicarTareaCliente=true;
			this.isVisibilidadCeldaCopiarTareaCliente=true;
			this.isVisibilidadCeldaVerFormTareaCliente=true;
			this.isVisibilidadCeldaOrdenTareaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=false;
			this.isVisibilidadCeldaGuardarTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTareaCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTareaCliente(false);
			
			this.setPermisosUsuarioTareaCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tareaclienteSessionBean.getEsGuardarRelacionado() && this.tareaclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTareaClienteClasesRelacionadas();
			}
			
			if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTareaClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTareaCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTareaCliente();
			}
			
			if(!this.isPermisoBusquedaTareaCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTareaCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTareaCliente,this.isPermisoPaginacionMedioTareaCliente,this.isPermisoPaginacionTodoTareaCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TareaClienteConstantesFunciones.getTiposSeleccionarTareaCliente());
				
				this.tiposColumnasSelect=TareaClienteConstantesFunciones.getTiposSeleccionarTareaCliente(true);
				
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
			//if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTareaCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTareaCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTareaCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTareaCliente() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.clienteLogic=new ClienteLogic();
			this.facturaLogic=new FacturaLogic();
			this.productoLogic=new ProductoLogic();
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
				tareaclienteImplementable= (TareaClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TareaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tareaclienteImplementableHome= (TareaClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TareaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tareaclientes= new ArrayList<TareaCliente>();
			this.tareaclientesEliminados= new ArrayList<TareaCliente>();
						
			this.isEsNuevoTareaCliente=false;
			this.esParaAccionDesdeFormularioTareaCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idFacturaActual=0L;
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTareaCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTareaCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TareaClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TareaClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTareaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTareaCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTareaCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTareaCliente();
			}
			
			TareaClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTareaCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTareaCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TareaCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTareaCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTareaCliente")) {
				iIndex=this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTareaCliente();	
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
	
	public void cargarCombosForeignKeyTareaCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTareaCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTareaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTareaClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTareaCliente();
		
		this.cargarCombosFrameForeignKeyTareaCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTareaCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTareaCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

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

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

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
	
	public void jButtonNuevoTareaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			
			if(jTableDatosTareaCliente.getRowCount()>=1) {
				jTableDatosTareaCliente.removeRowSelectionInterval(0, jTableDatosTareaCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTareaCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTareaCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTareaCliente(true);			
			//this.tareacliente=new TareaCliente();
			//this.tareacliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTareaCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTareaCliente() ;
			
			if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTareaCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tareacliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);				
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TareaCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTareaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTareaCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTareaCliente.getSelectedRows().length;			
			}
			
			tareaclientesSeleccionados=this.getTareaClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTareaCliente--;			
				//TareaCliente tareaclienteAux= new TareaCliente();			
				//tareaclienteAux.setId(this.iIdNuevoTareaCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TareaCliente tareaclienteOrigen=new TareaCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TareaCliente tareaclienteOrigen : tareaclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tareaclienteOrigen =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tareaclienteOrigen =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTareaCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tareacliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTareaCliente(tareaclienteOrigen,this.tareacliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tareaclienteLogic.getTareaClientes().add(this.tareaclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tareaclientes.add(this.tareaclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTareaCliente(false);
				
				this.jTableDatosTareaCliente.setRowSelectionInterval(this.getIndiceNuevoTareaCliente(), this.getIndiceNuevoTareaCliente());
				
				int iLastRow =  this.jTableDatosTareaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTareaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTareaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTareaCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();									
		
			TareaCliente tareaclienteOrigen=new TareaCliente();
			TareaCliente tareaclienteDestino=new TareaCliente();
				
			tareaclientesSeleccionados=this.getTareaClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTareaCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tareaclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTareaCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteOrigen =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tareaclienteOrigen =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tareaclienteDestino =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tareaclienteDestino =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tareaclienteOrigen =tareaclientesSeleccionados.get(0);
				tareaclienteDestino =tareaclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTareaCliente(tareaclienteOrigen,tareaclienteDestino,true,false);
				
				tareaclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tareaclienteDestino,tareaclienteLogic.getTareaClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tareaclienteDestino,tareaclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTareaCliente(false);
				
				//this.jTableDatosTareaCliente.setRowSelectionInterval(this.getIndiceNuevoTareaCliente(), this.getIndiceNuevoTareaCliente());
				
				int iLastRow =  this.jTableDatosTareaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTareaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTareaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTareaCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTareaCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTareaCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTareaCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTareaCliente.setVisible(!isVisible);
			this.jPanelPaginacionTareaCliente.setVisible(!isVisible);
			this.jPanelAccionesTareaCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTareaCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTareaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTareaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTareaCliente();
			
			this.abrirFrameOrderByTareaCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTareaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTareaCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTareaCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTareaCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTareaCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTareaCliente.setSize(this.jInternalFrameDetalleFormTareaCliente.iWidthFormulario,this.jInternalFrameDetalleFormTareaCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTareaCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTareaCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTareaCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTareaCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTareaCliente.jContentPaneDetalleTareaCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTareaCliente.jContentPaneDetalleTareaCliente.getWidth(),TareaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTareaCliente.jContentPaneDetalleTareaCliente.getWidth(),TareaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTareaCliente.jContentPaneDetalleTareaCliente.getWidth(),TareaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTareaCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTareaCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTareaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTareaCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTareaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTareaCliente,false,this);
				} else {
					this.jInternalFrameOrderByTareaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTareaCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTareaCliente);
				this.jInternalFrameOrderByTareaCliente.setVisible(false);
				this.jInternalFrameOrderByTareaCliente.setSelected(false);
				
				this.jInternalFrameOrderByTareaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTareaCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTareaCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTareaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTareaCliente==null) {
				
				this.jInternalFrameImportacionTareaCliente=new ImportacionJInternalFrame(TareaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTareaCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTareaCliente);
				this.jInternalFrameImportacionTareaCliente.setVisible(false);
				this.jInternalFrameImportacionTareaCliente.setSelected(false);


				this.jInternalFrameImportacionTareaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTareaCliente"));
				this.jInternalFrameImportacionTareaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTareaCliente"));
				this.jInternalFrameImportacionTareaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTareaCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTareaCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTareaCliente==null) {
				this.jInternalFrameReporteDinamicoTareaCliente=new ReporteDinamicoJInternalFrame(TareaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTareaCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTareaCliente);
				this.jInternalFrameReporteDinamicoTareaCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTareaCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTareaCliente"));
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTareaCliente"));
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTareaCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTareaCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTareaCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTareaCliente);
			
	       	this.jInternalFrameDetalleFormTareaCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTareaCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTareaCliente.dispose();
			//this.jInternalFrameDetalleFormTareaCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTareaCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTareaCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTareaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTareaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTareaCliente.setVisible(true);
	        this.jInternalFrameImportacionTareaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTareaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTareaCliente.setVisible(true);
	        this.jInternalFrameOrderByTareaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTareaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTareaCliente.setVisible(false);
	        this.jInternalFrameOrderByTareaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTareaCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTareaCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTareaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTareaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTareaCliente.setVisible(false);
	        this.jInternalFrameImportacionTareaCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTareaCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTareaCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTareaCliente(true);
			//this.isEsNuevoTareaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTareaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTareaCliente(false) ;
			
			if(tareaclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTareaCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTareaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTareaClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTareaCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTareaCliente(true);
			//this.isEsNuevoTareaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tareacliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTareaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTareaCliente(false) ;
			
			if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTareaCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTareaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.tareaclienteConstantesFunciones.cargarid_clienteTareaCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTareaCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.tareaclienteConstantesFunciones.cargarid_facturaTareaCliente) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTareaCliente(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
			
			if(sType.equals("Producto")) {
				if(!this.tareaclienteConstantesFunciones.cargarid_productoTareaCliente) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTareaCliente(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTareaCliente(false);
			
			//if(!this.isEsNuevoTareaCliente) {								
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				
			}
			
			if(this.permiteMantenimiento(this.tareacliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTareaCliente=true;
					this.inicializarActualizarBindingTablaTareaCliente(false);
					this.isEsNuevoTareaCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTareaCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTareaCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTareaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTareaCliente(false);
				
				this.habilitarDeshabilitarControlesTareaCliente(false);
			
												
				
				if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTareaCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTareaClienteActionPerformed(evt,tareaclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTareaCliente(this.tareacliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tareaclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tareacliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTareaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				this.tareacliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				this.tareacliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tareacliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TareaClienteModel) this.jTableDatosTareaCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTareaCliente=true;
				this.inicializarActualizarBindingTablaTareaCliente(false);
				this.isEsNuevoTareaCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTareaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTareaCliente(false);
				
				this.habilitarDeshabilitarControlesTareaCliente(false);
				
				
				
				if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTareaCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTareaClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTareaCliente.getRowCount()>=1) {
				jTableDatosTareaCliente.removeRowSelectionInterval(0, jTableDatosTareaCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTareaCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTareaCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTareaCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTareaCliente(false) ;
			
			this.isEsNuevoTareaCliente=false;
			
			if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTareaCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTareaCliente(false);
				
				//SI ES MANUAL
				if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTareaCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTareaCliente--;			
			//TareaCliente tareaclienteAux= new TareaCliente();			
			//tareaclienteAux.setId(this.iIdNuevoTareaCliente);
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTareaCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
			
			this.tareacliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tareaclienteLogic.getTareaClientes().add(this.tareaclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tareaclientes.add(this.tareaclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTareaCliente(false);
			
			this.jTableDatosTareaCliente.setRowSelectionInterval(this.getIndiceNuevoTareaCliente(), this.getIndiceNuevoTareaCliente());
			
			int iLastRow =  this.jTableDatosTareaCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTareaCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTareaCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTareaCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTareaCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTareaCliente(false);
			
			//SI ES MANUAL
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTareaCliente();
			}
			
			//this.abrirFrameTreeTareaCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTareaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tarea ClienteS ?", "MANTENIMIENTO DE Tarea Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTareaCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTareaCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tareaclienteReturnGeneral=tareaclienteLogic.procesarImportacionTareaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tareaclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTareaClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTareaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTareaCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTareaCliente.setFileImportacion(this.jInternalFrameImportacionTareaCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTareaCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTareaCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTareaCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTareaCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		

		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TareaClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TareaClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TareaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROMETROS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMetros_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMetros_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMetros_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMetros_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROLITROS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroLitros_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroLitros_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroLitros_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroLitros_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TareaClienteConstantesFunciones.LABEL_TAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rea_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTareaCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TareaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case TareaClienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROMETROS:
					sNombreCampoCategoria="numero_metros";
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROLITROS:
					sNombreCampoCategoria="numero_litros";
					break;

				case TareaClienteConstantesFunciones.LABEL_TAREA:
					sNombreCampoCategoria="tarea";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TareaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case TareaClienteConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case TareaClienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROMETROS:
					sNombreCampoCategoriaValor="numero_metros";
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROLITROS:
					sNombreCampoCategoriaValor="numero_litros";
					break;

				case TareaClienteConstantesFunciones.LABEL_TAREA:
					sNombreCampoCategoriaValor="tarea";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TareaClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TareaClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case TareaClienteConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case TareaClienteConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case TareaClienteConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case TareaClienteConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROMETROS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Metros",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_metros");
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROLITROS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Litros",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_litros");
					break;

				case TareaClienteConstantesFunciones.LABEL_TAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tarea");
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
	
	public void jButtonGenerarExcelReporteDinamicoTareaClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TareaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TareaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROMETROS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getnumero_metros());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_NUMEROLITROS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.getnumero_litros());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TareaClienteConstantesFunciones.LABEL_TAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TareaClienteConstantesFunciones.LABEL_TAREA);
					iRow++;

					for(TareaCliente tareacliente:tareaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tareacliente.gettarea());
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
			//	this.getFilaCabeceraExportarExcelTareaCliente(row);				
			//	iRow++;
			//}				
			
			//for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTareaCliente(tareaclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTareaCliente(false);
			
			//SI ES MANUAL
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTareaCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTareaCliente(false);
			
			//SI ES MANUAL
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTareaCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTareaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTareaCliente(false);
			
			//SI ES MANUAL
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTareaCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTareaCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTareaCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTareaCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTareaCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTareaCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTareaCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTareaCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTareaCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTareaCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTareaCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTareaCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTareaCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTareaCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTareaCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTareaCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTareaCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TareaClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTareaCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTareaCliente();
		
		this.inicializarActualizarBindingBotonesManualTareaCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTareaCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTareaCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTareaCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTareaCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTareaCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTareaCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTareaCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTareaCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionNuevoTareaCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionSinCerrarTareaCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionSinMensajeTareaCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTareaCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTareaCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTareaCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTareaCliente!=null) {
				this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionNuevoTareaCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionSinCerrarTareaCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTareaCliente.jCheckBoxPostAccionSinMensajeTareaCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTareaCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTareaCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTareaCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTareaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTareaCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTareaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTareaCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTareaCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTareaCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTareaCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTareaCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTareaCliente() throws Exception {
		try	{
			if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTareaCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTareaCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTareaCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTareaCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTareaCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTareaCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTareaCliente.addItem(reporte);
			}
			
			
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTareaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTareaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTareaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTareaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTareaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTareaCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTareaCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTareaCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTareaCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
				this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
				this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTareaCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TareaClienteConstantesFunciones.getTiposSeleccionarTareaCliente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TareaClienteConstantesFunciones.getTiposSeleccionarTareaCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TareaClienteConstantesFunciones.getTiposSeleccionarTareaCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTareaCliente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTareaCliente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTareaCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteTareaCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteTareaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaTareaCliente.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaTareaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoTareaCliente.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoTareaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadTareaCliente.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadTareaCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTareaCliente(Boolean esInicializar) throws Exception {				
		if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTareaCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTareaCliente() throws Exception {
		this.inicializarActualizarBindingTablaTareaCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTareaCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTareaClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTareaCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tareaclienteLogic.getTareaClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tareaclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTareaCliente.setModel(new TareaClienteModel(this.tareaclienteLogic.getTareaClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTareaCliente.setModel(new TareaClienteModel(this.tareaclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTareaCliente!=null && this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTareaCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TareaClienteConstantesFunciones.SCLASSWEBTITULO,tareaclienteConstantesFunciones.resaltarSeleccionarTareaCliente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TareaClienteConstantesFunciones.SCLASSWEBTITULO,tareaclienteConstantesFunciones.resaltarSeleccionarTareaCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_ID));

		if(this.tareaclienteConstantesFunciones.mostraridTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tareaclienteConstantesFunciones.resaltaridTareaCliente,this.tareaclienteConstantesFunciones.activaridTareaCliente,iSizeTabla,this,true,"idTareaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tareaclienteConstantesFunciones.resaltaridTareaCliente,this.tareaclienteConstantesFunciones.activaridTareaCliente,this,true,"idTareaCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tareaclienteConstantesFunciones.mostrarid_empresaTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tareaclienteConstantesFunciones.resaltarid_empresaTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_empresaTareaCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tareaclienteConstantesFunciones.resaltarid_empresaTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_empresaTareaCliente,false,"id_empresaTareaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.tareaclienteConstantesFunciones.mostrarid_clienteTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.tareaclienteConstantesFunciones.resaltarid_clienteTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_clienteTareaCliente,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.tareaclienteConstantesFunciones.resaltarid_clienteTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_clienteTareaCliente,true,"id_clienteTareaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDFACTURA));

		if(this.tareaclienteConstantesFunciones.mostrarid_facturaTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.tareaclienteConstantesFunciones.resaltarid_facturaTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_facturaTareaCliente,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.tareaclienteConstantesFunciones.resaltarid_facturaTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_facturaTareaCliente,true,"id_facturaTareaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.tareaclienteConstantesFunciones.mostrarid_productoTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.tareaclienteConstantesFunciones.resaltarid_productoTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_productoTareaCliente,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.tareaclienteConstantesFunciones.resaltarid_productoTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_productoTareaCliente,true,"id_productoTareaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_IDUNIDAD));

		if(this.tareaclienteConstantesFunciones.mostrarid_unidadTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.tareaclienteConstantesFunciones.resaltarid_unidadTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_unidadTareaCliente,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.tareaclienteConstantesFunciones.resaltarid_unidadTareaCliente,this,this.tareaclienteConstantesFunciones.activarid_unidadTareaCliente,true,"id_unidadTareaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_PRECIO));

		if(this.tareaclienteConstantesFunciones.mostrarprecioTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tareaclienteConstantesFunciones.resaltarprecioTareaCliente,this.tareaclienteConstantesFunciones.activarprecioTareaCliente,iSizeTabla,this,true,"precioTareaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tareaclienteConstantesFunciones.resaltarprecioTareaCliente,this.tareaclienteConstantesFunciones.activarprecioTareaCliente,this,true,"precioTareaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_NUMEROMETROS));

		if(this.tareaclienteConstantesFunciones.mostrarnumero_metrosTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_NUMEROMETROS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tareaclienteConstantesFunciones.resaltarnumero_metrosTareaCliente,this.tareaclienteConstantesFunciones.activarnumero_metrosTareaCliente,iSizeTabla,this,true,"numero_metrosTareaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tareaclienteConstantesFunciones.resaltarnumero_metrosTareaCliente,this.tareaclienteConstantesFunciones.activarnumero_metrosTareaCliente,this,true,"numero_metrosTareaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_NUMEROLITROS));

		if(this.tareaclienteConstantesFunciones.mostrarnumero_litrosTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_NUMEROLITROS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tareaclienteConstantesFunciones.resaltarnumero_litrosTareaCliente,this.tareaclienteConstantesFunciones.activarnumero_litrosTareaCliente,iSizeTabla,this,true,"numero_litrosTareaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tareaclienteConstantesFunciones.resaltarnumero_litrosTareaCliente,this.tareaclienteConstantesFunciones.activarnumero_litrosTareaCliente,this,true,"numero_litrosTareaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,TareaClienteConstantesFunciones.LABEL_TAREA));

		if(this.tareaclienteConstantesFunciones.mostrartareaTareaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TareaClienteConstantesFunciones.LABEL_TAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tareaclienteConstantesFunciones.resaltartareaTareaCliente,this.tareaclienteConstantesFunciones.activartareaTareaCliente,iSizeTabla,this,true,"tareaTareaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tareaclienteConstantesFunciones.resaltartareaTareaCliente,this.tareaclienteConstantesFunciones.activartareaTareaCliente,this,true,"tareaTareaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TareaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTareaCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTareaCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTareaCliente && this.isPermisoGuardarCambiosTareaCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tareaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTareaCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTareaCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTareaCliente && this.isPermisoGuardarCambiosTareaCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTareaCliente && this.isPermisoGuardarCambiosTareaCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTareaCliente.moveColumn(this.jTableDatosTareaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTareaCliente.moveColumn(this.jTableDatosTareaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTareaCliente.moveColumn(this.jTableDatosTareaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTareaCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTareaCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTareaCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTareaCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTareaCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTareaCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTareaCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTareaCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tareaclienteLogic.getTareaClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tareaclientes.size()-1;
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
		//this.jTableDatosTareaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTareaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTareaCliente();
			
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
				
				//this.isEsNuevoTareaCliente=false;
					
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
				if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTareaCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTareaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tareacliente.getsType().equals("DUPLICADO")
				   || this.tareacliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTareaCliente=true;
				
				} else {
					this.isEsNuevoTareaCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.tareacliente.getId()>=0 && !this.tareacliente.getIsNew()) {						
						this.isEsNuevoTareaCliente=false;
						
					} else {
						this.isEsNuevoTareaCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTareaCliente(esRelaciones);						
				
				this.seleccionarTareaCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tareacliente.getId()<0) {
					this.isEsNuevoTareaCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTareaCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTareaCliente(evt,rowIndex);
				}	
				
				if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TareaCliente: " + this.dDif); 
					}
				}								
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTareaCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tareacliente)) {
					if(this.tareacliente.getId()>0) {
						this.tareacliente.setIsDeleted(true);
						
						this.tareaclientesEliminados.add(this.tareacliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tareaclienteLogic.getTareaClientes().remove(this.tareacliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tareaclientes.remove(this.tareacliente);				
					}
					
					
					((TareaClienteModel) this.jTableDatosTareaCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTareaCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTareaCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTareaCliente) {
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTareaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTareaCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTareaCliente(this.tareacliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tareaclienteConstantesFunciones.cargarid_empresaTareaCliente || this.tareaclienteConstantesFunciones.event_dependid_empresaTareaCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tareacliente.getid_empresa());
									//this.inicializarActualizarBindingTareaCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tareacliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(tareacliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tareacliente.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.tareaclienteConstantesFunciones.cargarid_clienteTareaCliente || this.tareaclienteConstantesFunciones.event_dependid_clienteTareaCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.tareacliente.getid_cliente());
									//this.inicializarActualizarBindingTareaCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(tareacliente.getCliente()!=null) {
							this.clientesForeignKey.add(tareacliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.tareacliente.getid_cliente(),false,"Formulario");

					//Factura
					if(!this.tareaclienteConstantesFunciones.cargarid_facturaTareaCliente || this.tareaclienteConstantesFunciones.event_dependid_facturaTareaCliente) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.tareacliente.getid_factura());
									//this.inicializarActualizarBindingTareaCliente(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(tareacliente.getFactura()!=null) {
							this.facturasForeignKey.add(tareacliente.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.tareacliente.getid_factura(),false,"Formulario");

					//Producto
					if(!this.tareaclienteConstantesFunciones.cargarid_productoTareaCliente || this.tareaclienteConstantesFunciones.event_dependid_productoTareaCliente) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.tareacliente.getid_producto());
									//this.inicializarActualizarBindingTareaCliente(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(tareacliente.getProducto()!=null) {
							this.productosForeignKey.add(tareacliente.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.tareacliente.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.tareaclienteConstantesFunciones.cargarid_unidadTareaCliente || this.tareaclienteConstantesFunciones.event_dependid_unidadTareaCliente) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.tareacliente.getid_unidad());
									//this.inicializarActualizarBindingTareaCliente(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(tareacliente.getUnidad()!=null) {
							this.unidadsForeignKey.add(tareacliente.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.tareacliente.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTareaCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTareaCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTareaCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTareaCliente(TareaCliente tareacliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTareaCliente(tareacliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTareaCliente(TareaCliente tareacliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTareaCliente(tareacliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTareaCliente(tareacliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTareaCliente(tareacliente);
	}
	
	public void setVariablesObjetoActualToFormularioTareaCliente(TareaCliente tareacliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setText(tareacliente.getId().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setText(tareacliente.getprecio().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setText(tareacliente.getnumero_metros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setText(tareacliente.getnumero_litros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setText(tareacliente.gettarea());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TareaCliente tareaclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tareaclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TareaCliente tareaclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tareaclienteLocal=this.tareacliente;
			} else {
				tareaclienteLocal=this.tareaclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tareaclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTareaCliente(tareaclienteLocal,true);
					
					if(tareaclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tareaclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tareaclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTareaCliente(TareaCliente tareacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTareaCliente(tareacliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(tareacliente);
	}
	
	public void setVariablesFormularioToObjetoActualTareaCliente(TareaCliente tareacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTareaCliente(tareacliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTareaCliente(TareaCliente tareacliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.getText()==null || this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.getText()=="" || this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setText("0");
			}

			if(conColumnasBase) {tareacliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TareaClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelIdTareaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tareacliente.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TareaClienteConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelprecioTareaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tareacliente.setnumero_metros(Double.parseDouble(this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TareaClienteConstantesFunciones.LABEL_NUMEROMETROS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_metrosTareaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tareacliente.setnumero_litros(Double.parseDouble(this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TareaClienteConstantesFunciones.LABEL_NUMEROLITROS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabelnumero_litrosTareaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tareacliente.settarea(this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TareaClienteConstantesFunciones.LABEL_TAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTareaCliente.jLabeltareaTareaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTareaCliente(TareaCliente tareaclienteBean,TareaCliente tareacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tareaclienteBean.getid_cliente()!=null && !tareaclienteBean.getid_cliente().equals(-1L))) {tareacliente.setid_cliente(tareaclienteBean.getid_cliente());}
			if(conDefault || (!conDefault && tareaclienteBean.getid_factura()!=null && !tareaclienteBean.getid_factura().equals(-1L))) {tareacliente.setid_factura(tareaclienteBean.getid_factura());}
			if(conDefault || (!conDefault && tareaclienteBean.getid_producto()!=null && !tareaclienteBean.getid_producto().equals(-1L))) {tareacliente.setid_producto(tareaclienteBean.getid_producto());}
			if(conDefault || (!conDefault && tareaclienteBean.getid_unidad()!=null && !tareaclienteBean.getid_unidad().equals(-1L))) {tareacliente.setid_unidad(tareaclienteBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTareaCliente(TareaCliente tareaclienteOrigen,TareaCliente tareacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tareaclienteOrigen.getId()!=null && !tareaclienteOrigen.getId().equals(0L))) {tareacliente.setId(tareaclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tareaclienteOrigen.getid_cliente()!=null && !tareaclienteOrigen.getid_cliente().equals(-1L))) {tareacliente.setid_cliente(tareaclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getid_factura()!=null && !tareaclienteOrigen.getid_factura().equals(-1L))) {tareacliente.setid_factura(tareaclienteOrigen.getid_factura());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getid_producto()!=null && !tareaclienteOrigen.getid_producto().equals(-1L))) {tareacliente.setid_producto(tareaclienteOrigen.getid_producto());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getid_unidad()!=null && !tareaclienteOrigen.getid_unidad().equals(-1L))) {tareacliente.setid_unidad(tareaclienteOrigen.getid_unidad());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getprecio()!=null && !tareaclienteOrigen.getprecio().equals(0.0))) {tareacliente.setprecio(tareaclienteOrigen.getprecio());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getnumero_metros()!=null && !tareaclienteOrigen.getnumero_metros().equals(0.0))) {tareacliente.setnumero_metros(tareaclienteOrigen.getnumero_metros());}
			if(conDefault || (!conDefault && tareaclienteOrigen.getnumero_litros()!=null && !tareaclienteOrigen.getnumero_litros().equals(0.0))) {tareacliente.setnumero_litros(tareaclienteOrigen.getnumero_litros());}
			if(conDefault || (!conDefault && tareaclienteOrigen.gettarea()!=null && !tareaclienteOrigen.gettarea().equals(""))) {tareacliente.settarea(tareaclienteOrigen.gettarea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTareaCliente(TareaCliente tareacliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setText(tareacliente.getId().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setText(tareacliente.getprecio().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setText(tareacliente.getnumero_metros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setText(tareacliente.getnumero_litros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setText(tareacliente.gettarea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTareaCliente(TareaClienteBean tareaclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setText(tareaclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setText(tareaclienteBean.getprecio().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setText(tareaclienteBean.getnumero_metros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setText(tareaclienteBean.getnumero_litros().toString());
			this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setText(tareaclienteBean.gettarea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTareaCliente(TareaClienteParameterReturnGeneral tareaclienteReturnGeneral,TareaClienteBean tareaclienteBean,Boolean conDefault) throws Exception { 
		try {
			TareaCliente tareaclienteLocal=new TareaCliente();
			
			tareaclienteLocal=tareaclienteReturnGeneral.getTareaCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tareaclienteLocal.getId()!=null && !tareaclienteLocal.getId().equals(0L))) {tareaclienteBean.setId(tareaclienteLocal.getId());}}
			if(conDefault || (!conDefault && tareaclienteLocal.getid_cliente()!=null && !tareaclienteLocal.getid_cliente().equals(-1L))) {tareaclienteBean.setid_cliente(tareaclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && tareaclienteLocal.getid_factura()!=null && !tareaclienteLocal.getid_factura().equals(-1L))) {tareaclienteBean.setid_factura(tareaclienteLocal.getid_factura());}
			if(conDefault || (!conDefault && tareaclienteLocal.getid_producto()!=null && !tareaclienteLocal.getid_producto().equals(-1L))) {tareaclienteBean.setid_producto(tareaclienteLocal.getid_producto());}
			if(conDefault || (!conDefault && tareaclienteLocal.getid_unidad()!=null && !tareaclienteLocal.getid_unidad().equals(-1L))) {tareaclienteBean.setid_unidad(tareaclienteLocal.getid_unidad());}
			if(conDefault || (!conDefault && tareaclienteLocal.getprecio()!=null && !tareaclienteLocal.getprecio().equals(0.0))) {tareaclienteBean.setprecio(tareaclienteLocal.getprecio());}
			if(conDefault || (!conDefault && tareaclienteLocal.getnumero_metros()!=null && !tareaclienteLocal.getnumero_metros().equals(0.0))) {tareaclienteBean.setnumero_metros(tareaclienteLocal.getnumero_metros());}
			if(conDefault || (!conDefault && tareaclienteLocal.getnumero_litros()!=null && !tareaclienteLocal.getnumero_litros().equals(0.0))) {tareaclienteBean.setnumero_litros(tareaclienteLocal.getnumero_litros());}
			if(conDefault || (!conDefault && tareaclienteLocal.gettarea()!=null && !tareaclienteLocal.gettarea().equals(""))) {tareaclienteBean.settarea(tareaclienteLocal.gettarea());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTareaClienteGenerico(Long idTareaClienteSeleccionado,JComboBox jComboBoxTareaCliente,List<TareaCliente> tareaclientesLocal)throws Exception {
		try {
			TareaCliente  tareaclienteTemp=null;

			for(TareaCliente tareaclienteAux:tareaclientesLocal) {
				if(tareaclienteAux.getId()!=null && tareaclienteAux.getId().equals(idTareaClienteSeleccionado)) {
					tareaclienteTemp=tareaclienteAux;
					break;
				}
			}

			jComboBoxTareaCliente.setSelectedItem(tareaclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTareaClienteGenerico(JComboBox jComboBoxTareaCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTareaCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTareaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTareaCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTareaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tareacliente=(TareaCliente) tareaclienteLogic.getTareaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tareacliente =(TareaCliente) tareaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tareacliente.getIsNew() && !tareacliente.getIsChanged() && !tareacliente.getIsDeleted()) {
				sDescripcion=tareacliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tareacliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!tareacliente.getIsNew() && !tareacliente.getIsChanged() && !tareacliente.getIsDeleted()) {
				sDescripcion=tareacliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=tareacliente.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!tareacliente.getIsNew() && !tareacliente.getIsChanged() && !tareacliente.getIsDeleted()) {
				sDescripcion=tareacliente.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=tareacliente.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!tareacliente.getIsNew() && !tareacliente.getIsChanged() && !tareacliente.getIsDeleted()) {
				sDescripcion=tareacliente.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=tareacliente.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!tareacliente.getIsNew() && !tareacliente.getIsChanged() && !tareacliente.getIsDeleted()) {
				sDescripcion=tareacliente.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=tareacliente.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TareaCliente tareaclienteRow=new TareaCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tareaclienteRow=(TareaCliente) tareaclienteLogic.getTareaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tareaclienteRow=(TareaCliente) tareaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTareaCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente));			
			this.jButtonDuplicarTareaCliente.setVisible((this.isVisibilidadCeldaDuplicarTareaCliente && this.isPermisoDuplicarTareaCliente));			
			this.jButtonCopiarTareaCliente.setVisible((this.isVisibilidadCeldaCopiarTareaCliente && this.isPermisoCopiarTareaCliente));
			this.jButtonVerFormTareaCliente.setVisible((this.isVisibilidadCeldaVerFormTareaCliente && this.isPermisoVerFormTareaCliente));
			
			this.jButtonAbrirOrderByTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));			
			
			this.jButtonNuevoRelacionesTareaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTareaCliente && this.isPermisoNuevoTareaCliente));			
			this.jButtonNuevoGuardarCambiosTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente && this.isPermisoGuardarCambiosTareaCliente));
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonModificarTareaCliente.setVisible((this.isVisibilidadCeldaModificarTareaCliente && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.setVisible((this.isVisibilidadCeldaActualizarTareaCliente && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.setVisible((this.isVisibilidadCeldaEliminarTareaCliente && this.isPermisoEliminarTareaCliente));
			this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.setVisible(this.isVisibilidadCeldaCancelarTareaCliente);							
			this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.setVisible((this.isVisibilidadCeldaGuardarTareaCliente && this.isPermisoGuardarCambiosTareaCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTareaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTareaCliente && this.isPermisoGuardarCambiosTareaCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente));						
			this.jButtonDuplicarToolBarTareaCliente.setVisible((this.isVisibilidadCeldaDuplicarTareaCliente && this.isPermisoDuplicarTareaCliente));						
			this.jButtonCopiarToolBarTareaCliente.setVisible((this.isVisibilidadCeldaCopiarTareaCliente && this.isPermisoCopiarTareaCliente));			
			this.jButtonVerFormToolBarTareaCliente.setVisible((this.isVisibilidadCeldaVerFormTareaCliente && this.isPermisoVerFormTareaCliente));			
			this.jButtonAbrirOrderByToolBarTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));
			this.jButtonNuevoRelacionesToolBarTareaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTareaCliente && this.isPermisoNuevoTareaCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente && this.isPermisoGuardarCambiosTareaCliente));			
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonModificarToolBarTareaCliente.setVisible((this.isVisibilidadCeldaModificarTareaCliente && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarToolBarTareaCliente.setVisible((this.isVisibilidadCeldaActualizarTareaCliente  && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarToolBarTareaCliente.setVisible((this.isVisibilidadCeldaEliminarTareaCliente && this.isPermisoEliminarTareaCliente));
			this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarToolBarTareaCliente.setVisible(this.isVisibilidadCeldaCancelarTareaCliente);				
			this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosToolBarTareaCliente.setVisible((this.isVisibilidadCeldaGuardarTareaCliente && this.isPermisoGuardarCambiosTareaCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTareaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTareaCliente && this.isPermisoGuardarCambiosTareaCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente));			
			this.jMenuItemDuplicarTareaCliente.setVisible((this.isVisibilidadCeldaDuplicarTareaCliente && this.isPermisoDuplicarTareaCliente));			
			this.jMenuItemCopiarTareaCliente.setVisible((this.isVisibilidadCeldaCopiarTareaCliente && this.isPermisoCopiarTareaCliente));			
			this.jMenuItemVerFormTareaCliente.setVisible((this.isVisibilidadCeldaVerFormTareaCliente && this.isPermisoVerFormTareaCliente));			
			this.jMenuItemAbrirOrderByTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));			
			//this.jMenuItemMostrarOcultarTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));
			this.jMenuItemDetalleAbrirOrderByTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));			
			//this.jMenuItemDetalleMostrarOcultarTareaCliente.setVisible((this.isVisibilidadCeldaOrdenTareaCliente && this.isPermisoOrdenTareaCliente));			
			this.jMenuItemNuevoRelacionesTareaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTareaCliente && this.isPermisoNuevoTareaCliente));			
			this.jMenuItemNuevoGuardarCambiosTareaCliente.setVisible((this.isVisibilidadCeldaNuevoTareaCliente && this.isPermisoNuevoTareaCliente && this.isPermisoGuardarCambiosTareaCliente));									
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemModificarTareaCliente.setVisible((this.isVisibilidadCeldaModificarTareaCliente && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemActualizarTareaCliente.setVisible((this.isVisibilidadCeldaActualizarTareaCliente && this.isPermisoActualizarTareaCliente));	
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemEliminarTareaCliente.setVisible((this.isVisibilidadCeldaEliminarTareaCliente && this.isPermisoEliminarTareaCliente));
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemCancelarTareaCliente.setVisible(this.isVisibilidadCeldaCancelarTareaCliente);				
			}
			
			this.jMenuItemGuardarCambiosTareaCliente.setVisible((this.isVisibilidadCeldaGuardarTareaCliente && this.isPermisoGuardarCambiosTareaCliente));						
			this.jMenuItemGuardarCambiosTablaTareaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTareaCliente && this.isPermisoGuardarCambiosTareaCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTareaCliente=this.jButtonNuevoTareaCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTareaCliente=this.jButtonDuplicarTareaCliente.isVisible();
			this.isVisibilidadCeldaCopiarTareaCliente=this.jButtonCopiarTareaCliente.isVisible();
			this.isVisibilidadCeldaVerFormTareaCliente=this.jButtonVerFormTareaCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTareaCliente=this.jButtonAbrirOrderByTareaCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=this.jButtonNuevoRelacionesTareaCliente.isVisible();
			this.isVisibilidadCeldaModificarTareaCliente=this.jButtonModificarTareaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.isVisibilidadCeldaActualizarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.isVisible();
			this.isVisibilidadCeldaEliminarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.isVisible();
			this.isVisibilidadCeldaCancelarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.isVisible();
			this.isVisibilidadCeldaGuardarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=this.jButtonGuardarCambiosTablaTareaCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTareaCliente=this.jButtonNuevoToolBarTareaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=this.jButtonNuevoRelacionesToolBarTareaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.isVisibilidadCeldaModificarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonModificarToolBarTareaCliente.isVisible();
			this.isVisibilidadCeldaActualizarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarToolBarTareaCliente.isVisible();
			this.isVisibilidadCeldaEliminarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarToolBarTareaCliente.isVisible();
			this.isVisibilidadCeldaCancelarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarToolBarTareaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTareaCliente=this.jButtonGuardarCambiosToolBarTareaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=this.jButtonGuardarCambiosTablaToolBarTareaCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTareaCliente=this.jMenuItemNuevoTareaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=this.jMenuItemNuevoRelacionesTareaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.isVisibilidadCeldaModificarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jMenuItemModificarTareaCliente.isVisible();
			this.isVisibilidadCeldaActualizarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jMenuItemActualizarTareaCliente.isVisible();
			this.isVisibilidadCeldaEliminarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jMenuItemEliminarTareaCliente.isVisible();
			this.isVisibilidadCeldaCancelarTareaCliente=this.jInternalFrameDetalleFormTareaCliente.jMenuItemCancelarTareaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTareaCliente=this.jMenuItemGuardarCambiosTareaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=this.jMenuItemGuardarCambiosTablaTareaCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTareaCliente(Boolean esInicializar) {
		if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTareaCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTareaCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTareaCliente() {
		this.jButtonNuevoTareaCliente.setVisible(this.isPermisoNuevoTareaCliente);			
		this.jButtonDuplicarTareaCliente.setVisible(this.isPermisoDuplicarTareaCliente);			
		this.jButtonCopiarTareaCliente.setVisible(this.isPermisoCopiarTareaCliente);			
		this.jButtonVerFormTareaCliente.setVisible(this.isPermisoVerFormTareaCliente);			
		
		this.jButtonAbrirOrderByTareaCliente.setVisible(this.isPermisoOrdenTareaCliente);					
		
		this.jButtonNuevoRelacionesTareaCliente.setVisible(this.isPermisoNuevoTareaCliente);			
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonModificarTareaCliente.setVisible(this.isPermisoActualizarTareaCliente);	
			this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.setVisible(this.isPermisoActualizarTareaCliente);	
			this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.setVisible(this.isPermisoEliminarTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.setVisible(this.isVisibilidadCeldaCancelarTareaCliente);						
			this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.setVisible(this.isPermisoGuardarCambiosTareaCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTareaCliente.setVisible(this.isPermisoActualizarTareaCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTareaCliente() {
		this.jInternalFrameDetalleFormTareaCliente.jButtonModificarTareaCliente.setVisible(this.isPermisoActualizarTareaCliente);	
		this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.setVisible(this.isPermisoActualizarTareaCliente);	
		this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.setVisible(this.isPermisoEliminarTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.setVisible(this.isVisibilidadCeldaCancelarTareaCliente);							
		this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.setVisible((this.isVisibilidadCeldaGuardarTareaCliente && this.isPermisoGuardarCambiosTareaCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTareaCliente() {
		if(TareaClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTareaCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTareaCliente() {
	}
	
	public void jTableDatosTareaClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTareaCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tareacliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTareaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTareaCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTareaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tareaclienteLogic.getConnexion());

				if(this.tareacliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tareacliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTareaCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tareacliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteTareaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTareaCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosTareaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTareaCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteTareaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebTareaCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTareaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tareaclienteLogic.getConnexion());

				if(this.tareacliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.tareacliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTareaCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.tareacliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaTareaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTareaCliente=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosTareaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTareaCliente.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaTareaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebTareaCliente(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTareaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.tareaclienteLogic.getConnexion());

				if(this.tareacliente.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.tareacliente.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTareaCliente.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.tareacliente.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoTareaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTareaCliente=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosTareaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderTareaCliente.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoTareaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebTareaCliente(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTareaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.tareaclienteLogic.getConnexion());

				if(this.tareacliente.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.tareacliente.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderTareaCliente.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.tareacliente.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadTareaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebTareaCliente(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTareaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTareaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.tareaclienteLogic.getConnexion());

				if(this.tareacliente.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.tareacliente.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTareaCliente=(TitledBorder)this.jScrollPanelDatosTareaCliente.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderTareaCliente.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.tareacliente.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.tareacliente.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_metrosTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getnumero_metros()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_metros = "+this.tareacliente.getnumero_metros().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_litrosTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.getnumero_litros()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_litros = "+this.tareacliente.getnumero_litros().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontareaTareaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.gettareacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tareacliente==null) {
						this.tareacliente = new TareaCliente();
					}

					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);
				}

				if(this.tareacliente.gettarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tarea like '%"+this.tareacliente.gettarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTareaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteTareaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTareaCliente(false,false);

			this.getTareaClientesFK_IdCliente();

			this.inicializarActualizarBindingTareaCliente(false);

			//if(TareaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTareaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTareaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTareaCliente(false,false);

			this.getTareaClientesFK_IdEmpresa();

			this.inicializarActualizarBindingTareaCliente(false);

			//if(TareaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTareaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaTareaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTareaCliente(false,false);

			this.getTareaClientesFK_IdFactura();

			this.inicializarActualizarBindingTareaCliente(false);

			//if(TareaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTareaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoTareaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTareaCliente(false,false);

			this.getTareaClientesFK_IdProducto();

			this.inicializarActualizarBindingTareaCliente(false);

			//if(TareaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTareaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadTareaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTareaCliente(false,false);

			this.getTareaClientesFK_IdUnidad();

			this.inicializarActualizarBindingTareaCliente(false);

			//if(TareaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTareaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tareaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTareaCliente() {
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
			this.jInternalFrameDetalleFormTareaCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTareaCliente.dispose();
			this.jInternalFrameDetalleFormTareaCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
			this.jInternalFrameReporteDinamicoTareaCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTareaCliente.dispose();
			this.jInternalFrameReporteDinamicoTareaCliente=null;
		}
		
		if(this.jInternalFrameImportacionTareaCliente!=null) {
			this.jInternalFrameImportacionTareaCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTareaCliente.dispose();
			this.jInternalFrameImportacionTareaCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTareaCliente();
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTareaCliente")) {
				jButtonDuplicarTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTareaCliente")) {
				jButtonCopiarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTareaCliente")) {
				jButtonVerFormTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTareaCliente")) {
				jButtonDuplicarTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTareaCliente")) {
				jButtonDuplicarTareaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTareaCliente")) {
				jButtonModificarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTareaCliente")) {
				jButtonModificarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTareaCliente")) {
				jButtonModificarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTareaCliente")) {
				jButtonActualizarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTareaCliente")) {
				jButtonActualizarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTareaCliente")) {
				jButtonActualizarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTareaCliente")) {
				jButtonEliminarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTareaCliente")) {
				jButtonEliminarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTareaCliente")) {
				jButtonEliminarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTareaCliente")) {
				jButtonCancelarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTareaCliente")) {
				jButtonCancelarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTareaCliente")) {
				jButtonCancelarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTareaCliente")) {
				jButtonCerrarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTareaCliente")) {
				jButtonCerrarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTareaCliente")) {
				jButtonCerrarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTareaCliente")) {
				jButtonMostrarOcultarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTareaCliente")) {
				jButtonCancelarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTareaCliente")) {
				jButtonCopiarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTareaCliente")) {
				jButtonVerFormTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTareaCliente")) {
				jButtonCopiarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTareaCliente")) {
				jButtonVerFormTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTareaCliente")) {
				jButtonRecargarInformacionTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTareaCliente")) {
				jButtonRecargarInformacionTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTareaCliente")) {
				jButtonRecargarInformacionTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTareaCliente")) {
				jButtonAnterioresTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTareaCliente")) {
				jButtonAnterioresTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTareaCliente")) {
				jButtonAnterioresTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTareaCliente")) {
				jButtonSiguientesTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTareaCliente")) {
				jButtonSiguientesTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTareaCliente")) {
				jButtonSiguientesTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTareaCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTareaCliente")) {
				jButtonAbrirOrderByTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTareaCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTareaCliente")) {
				jButtonMostrarOcultarTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTareaCliente")) {
				jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTareaCliente")) {
				jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTareaCliente")) {
				jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTareaCliente")) {
				jButtonCerrarReporteDinamicoTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTareaCliente")) {
				jButtonGenerarReporteDinamicoTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTareaCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTareaCliente")) {
				jButtonCerrarImportacionTareaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTareaCliente")) {
				
				jButtonGenerarImportacionTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTareaCliente")) {
				
				jButtonAbrirImportacionTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTareaCliente")) {
				jComboBoxTiposAccionesTareaClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTareaCliente")) {
				jComboBoxTiposRelacionesTareaClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTareaCliente")) {
				jComboBoxTiposAccionesTareaClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTareaCliente")) {
				
				jComboBoxTiposSeleccionarTareaClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTareaCliente")) {
				jTextFieldValorCampoGeneralTareaClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTareaCliente")) {
				jButtonAbrirOrderByTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTareaCliente")) {
				jButtonAbrirOrderByTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTareaCliente")) {
				jButtonCerrarOrderByTareaClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTareaClienteBusqueda")) {
				this.jButtonidTareaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTareaClienteUpdate")) {
				this.jButtonid_empresaTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTareaClienteBusqueda")) {
				this.jButtonid_empresaTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTareaCliente")) {
				this.jButtonid_clienteTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTareaClienteUpdate")) {
				this.jButtonid_clienteTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTareaClienteBusqueda")) {
				this.jButtonid_clienteTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTareaCliente")) {
				this.jButtonid_facturaTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTareaClienteUpdate")) {
				this.jButtonid_facturaTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTareaClienteBusqueda")) {
				this.jButtonid_facturaTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoTareaCliente")) {
				this.jButtonid_productoTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoTareaClienteUpdate")) {
				this.jButtonid_productoTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoTareaClienteBusqueda")) {
				this.jButtonid_productoTareaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadTareaClienteUpdate")) {
				this.jButtonid_unidadTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadTareaClienteBusqueda")) {
				this.jButtonid_unidadTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioTareaClienteBusqueda")) {
				this.jButtonprecioTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_metrosTareaClienteBusqueda")) {
				this.jButtonnumero_metrosTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_litrosTareaClienteBusqueda")) {
				this.jButtonnumero_litrosTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tareaTareaClienteBusqueda")) {
				this.jButtontareaTareaClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteTareaCliente")) {
				this.jButtonid_clienteTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaTareaCliente")) {
				this.jButtonid_facturaTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoTareaCliente")) {
				this.jButtonid_productoTareaClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteTareaCliente")) {
				this.jButtonFK_IdClienteTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaTareaCliente")) {
				this.jButtonFK_IdFacturaTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoTareaCliente")) {
				this.jButtonFK_IdProductoTareaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadTareaCliente")) {
				this.jButtonFK_IdUnidadTareaClienteActionPerformed(evt);
			}
			
			;
			
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTareaCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TareaCliente tareaclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tareaclienteLocal=this.tareacliente;
			} else {
				tareaclienteLocal=this.tareaclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
							
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
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
			
			


			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
								
						
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
								
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
							
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
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
			
			


			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
								
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTareaCliente")) {
					jCheckBoxSeleccionarTodosTareaClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTareaCliente")) {
					jCheckBoxSeleccionadosTareaClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTareaCliente")) {
					
				}
				
				


				
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
												
				
				


				
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
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
			
			


			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTareaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tareacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tareacliente);
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
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
				
				


				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TareaCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TareaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTareaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tareaclienteAnterior =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTareaCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTareaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTareaCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tareacliente =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tareacliente =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tareacliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTareaCliente")) {
				
				}
				
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTareaCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTareaCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTareaCliente")) {
			
			}
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTareaCliente();
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTareaCliente")) {
				jButtonDuplicarTareaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTareaCliente")) {
				jButtonCopiarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTareaCliente")) {
				jButtonVerFormTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTareaCliente")) {
				jButtonNuevoTareaClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTareaCliente")) {
				jButtonModificarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTareaCliente")) {
				jButtonActualizarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTareaCliente")) {
				jButtonEliminarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTareaCliente")) {
				jButtonCancelarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTareaCliente")) {
				jButtonCerrarTareaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTareaCliente")) {
				jButtonGuardarCambiosTareaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTareaCliente")) {
				jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTareaCliente")) {
				jButtonAbrirOrderByTareaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTareaCliente")) {
				jButtonRecargarInformacionTareaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTareaCliente")) {
				jButtonAnterioresTareaClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTareaCliente")) {
				jButtonSiguientesTareaClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTareaClienteBusqueda")) {
				this.jButtonidTareaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTareaClienteUpdate")) {
				this.jButtonid_empresaTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTareaClienteBusqueda")) {
				this.jButtonid_empresaTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTareaCliente")) {
				this.jButtonid_clienteTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTareaClienteUpdate")) {
				this.jButtonid_clienteTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTareaClienteBusqueda")) {
				this.jButtonid_clienteTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTareaCliente")) {
				this.jButtonid_facturaTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTareaClienteUpdate")) {
				this.jButtonid_facturaTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTareaClienteBusqueda")) {
				this.jButtonid_facturaTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoTareaCliente")) {
				this.jButtonid_productoTareaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoTareaClienteUpdate")) {
				this.jButtonid_productoTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoTareaClienteBusqueda")) {
				this.jButtonid_productoTareaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadTareaClienteUpdate")) {
				this.jButtonid_unidadTareaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadTareaClienteBusqueda")) {
				this.jButtonid_unidadTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioTareaClienteBusqueda")) {
				this.jButtonprecioTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_metrosTareaClienteBusqueda")) {
				this.jButtonnumero_metrosTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_litrosTareaClienteBusqueda")) {
				this.jButtonnumero_litrosTareaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tareaTareaClienteBusqueda")) {
				this.jButtontareaTareaClienteBusquedaActionPerformed(evt);
			}
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTareaCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTareaCliente")) {
				closingInternalFrameTareaCliente();
				
			} else if(sTipo.equals("jButtonCancelarTareaCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTareaCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TareaClienteBeanSwingJInternalFrame jInternalFrameParent=(TareaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTareaCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTareaClienteActionPerformed(null);
			}
			
			TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tareacliente,new Object(),this.tareaclienteParameterGeneral,this.tareaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTareaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTareaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTareaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tareacliente)) {
			if(!esControlTabla) {
				if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);			
				}
				
				if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTareaCliente(this.tareacliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tareaclienteReturnGeneral=tareaclienteLogic.procesarEventosTareaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tareaclienteLogic.getTareaClientes(),this.tareacliente,this.tareaclienteParameterGeneral,this.isEsNuevoTareaCliente,classes);//this.tareaclienteLogic.getTareaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTareaCliente(this.tareaclienteReturnGeneral,this.tareaclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTareaCliente(classes,this.tareaclienteReturnGeneral,this.tareaclienteBean,false);
					}
						
					if(this.tareaclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente());	
					}
						
					if(this.tareaclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente(),classes);//this.tareaclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTareaCliente(this.tareacliente,classes);//this.tareaclienteBean);									
				}
			
				if(TareaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTareaCliente(this.tareacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTareaCliente(this.tareacliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tareaclienteAnterior!=null) {
						this.tareacliente=this.tareaclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tareaclienteReturnGeneral=tareaclienteLogic.procesarEventosTareaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tareaclienteLogic.getTareaClientes(),this.tareacliente,this.tareaclienteParameterGeneral,this.isEsNuevoTareaCliente,classes);//this.tareaclienteLogic.getTareaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tareaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tareaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tareaclienteReturnGeneral.getTareaCliente(),tareaclienteLogic.getTareaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tareaclienteReturnGeneral.getTareaCliente(),this.tareaclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTareaCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTareaCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTareaCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTareaCliente() throws Exception {
		
		TareaClienteModel tareaclienteModel=(TareaClienteModel)this.jTableDatosTareaCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tareaclienteModel.tareaclientes=this.tareaclienteLogic.getTareaClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tareaclienteModel.tareaclientes=this.tareaclientes;
		}
		
		
		((TareaClienteModel) this.jTableDatosTareaCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTareaCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettareaclienteAnterior(),this.tareaclienteLogic.getTareaClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettareaclienteAnterior(),this.tareaclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTareaCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTareaCliente(TareaCliente tareacliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
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
										
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tareacliente,new Object(),generalEntityParameterGeneral,this.tareaclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TareaClienteConstantesFunciones.getClassesRelationshipsOfTareaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TareaClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTareaCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTareaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TareaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tareacliente,new Object(),generalEntityParameterGeneral,this.tareaclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTareaCliente(TareaClienteBean tareaclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTareaCliente(ArrayList<Classe> classes,TareaClienteReturnGeneral tareaclienteReturnGeneral,TareaClienteBean tareaclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTareaCliente(TareaCliente tareacliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tareacliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTareaCliente = new TareaClienteDetalleFormJInternalFrame(jDesktopPane,this.tareaclienteSessionBean.getConGuardarRelaciones(),this.tareaclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.setVisible(false);
		this.jInternalFrameDetalleFormTareaCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTareaCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTareaCliente.tareaclienteLogic=this.tareaclienteLogic;
		
		this.cargarCombosFrameForeignKeyTareaCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTareaCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTareaCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTareaCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTareaCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTareaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTareaCliente"));
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonModificarTareaCliente.addActionListener(new ButtonActionListener(this,"ModificarTareaCliente"));

		
		this.jInternalFrameDetalleFormTareaCliente.jButtonModificarToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTareaCliente"));
					
		this.jInternalFrameDetalleFormTareaCliente.jMenuItemModificarTareaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTareaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.addActionListener (new ButtonActionListener(this,"ActualizarTareaCliente"));
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTareaCliente"));
						
		this.jInternalFrameDetalleFormTareaCliente.jMenuItemActualizarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTareaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.addActionListener (new ButtonActionListener(this,"EliminarTareaCliente"));
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTareaCliente"));
								
		this.jInternalFrameDetalleFormTareaCliente.jMenuItemEliminarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTareaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.addActionListener (new ButtonActionListener(this,"CancelarTareaCliente"));
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTareaCliente"));
					
		this.jInternalFrameDetalleFormTareaCliente.jMenuItemCancelarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTareaCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jMenuItemDetalleCerrarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTareaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTareaCliente"));
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTareaCliente"));
		
		
		
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTareaCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonidTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteBusqueda"));
		//jButtonid_clienteTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaCliente.addActionListener(new ButtonActionListener(this,"id_clienteTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteBusqueda"));
		//jButtonid_facturaTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaCliente.addActionListener(new ButtonActionListener(this,"id_facturaTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteBusqueda"));
		//jButtonid_productoTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaCliente.addActionListener(new ButtonActionListener(this,"id_productoTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonprecioTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_metrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_metrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_litrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_litrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtontareaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"tareaTareaClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTareaCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTareaCliente"));
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTareaCliente"));
		}
		
		this.jTableDatosTareaCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTareaCliente"));
		
		this.jTableDatosTareaCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTareaCliente"));
		
		this.jButtonNuevoTareaCliente.addActionListener(new ButtonActionListener(this,"NuevoTareaCliente"));
		
		this.jButtonDuplicarTareaCliente.addActionListener(new ButtonActionListener(this,"DuplicarTareaCliente"));
		
		this.jButtonCopiarTareaCliente.addActionListener(new ButtonActionListener(this,"CopiarTareaCliente"));
		
		this.jButtonVerFormTareaCliente.addActionListener(new ButtonActionListener(this,"VerFormTareaCliente"));
		
		
		this.jButtonNuevoToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTareaCliente"));
			
		this.jButtonDuplicarToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTareaCliente"));
			
		this.jMenuItemNuevoTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTareaCliente"));
			
		this.jMenuItemDuplicarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTareaCliente"));		
		
		
		this.jButtonNuevoRelacionesTareaCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTareaCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTareaCliente"));
			
		this.jMenuItemNuevoRelacionesTareaCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTareaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonModificarTareaCliente.addActionListener(new ButtonActionListener(this,"ModificarTareaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonModificarToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTareaCliente"));
			
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemModificarTareaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTareaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarTareaCliente.addActionListener (new ButtonActionListener(this,"ActualizarTareaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonActualizarToolBarTareaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTareaCliente"));
				
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemActualizarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTareaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarTareaCliente.addActionListener (new ButtonActionListener(this,"EliminarTareaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonEliminarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTareaCliente"));
						
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemEliminarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTareaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarTareaCliente.addActionListener (new ButtonActionListener(this,"CancelarTareaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonCancelarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTareaCliente"));
			
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemCancelarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTareaCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTareaCliente"));		
		
		
		this.jButtonCerrarTareaCliente.addActionListener (new ButtonActionListener(this,"CerrarTareaCliente"));
		
		
		this.jButtonCerrarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTareaCliente"));
			
		this.jMenuItemCerrarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTareaCliente"));
			
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jMenuItemDetalleCerrarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTareaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTareaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTareaCliente"));
		}
		
		this.jButtonCopiarToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTareaCliente"));
			
		this.jButtonVerFormToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTareaCliente"));
		
		this.jMenuItemGuardarCambiosTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTareaCliente"));
			
		this.jMenuItemCopiarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTareaCliente"));		
		
		this.jMenuItemVerFormTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTareaCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTareaCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTareaCliente"));
			
		this.jMenuItemGuardarCambiosTablaTareaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTareaCliente"));		
		
		
		
		this.jButtonRecargarInformacionTareaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTareaCliente"));
					
		this.jButtonRecargarInformacionToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTareaCliente"));
		
		this.jMenuItemRecargarInformacionTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTareaCliente"));		
		
		
		
		this.jButtonAnterioresTareaCliente.addActionListener (new ButtonActionListener(this,"AnterioresTareaCliente"));
		
		
		this.jButtonAnterioresToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTareaCliente"));
		
		this.jMenuItemAnterioresTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTareaCliente"));		
		
		
		this.jButtonSiguientesTareaCliente.addActionListener (new ButtonActionListener(this,"SiguientesTareaCliente"));
		
		
		this.jButtonSiguientesToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTareaCliente"));
			
		this.jMenuItemSiguientesTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTareaCliente"));
			
		this.jMenuItemAbrirOrderByTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTareaCliente"));
			
		this.jMenuItemMostrarOcultarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTareaCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTareaCliente"));
			
		this.jMenuItemDetalleMostarOcultarTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTareaCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTareaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTareaCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTareaCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTareaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTareaCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTareaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTareaCliente"));

		this.jCheckBoxSeleccionadosTareaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTareaCliente"));
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTareaCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTareaCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTareaCliente"));
			
		this.jComboBoxTiposAccionesTareaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTareaCliente"));
					
		this.jComboBoxTiposSeleccionarTareaCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTareaCliente"));
			
		this.jTextFieldValorCampoGeneralTareaCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTareaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonidTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteBusqueda"));
		//jButtonid_clienteTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaCliente.addActionListener(new ButtonActionListener(this,"id_clienteTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteBusqueda"));
		//jButtonid_facturaTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaCliente.addActionListener(new ButtonActionListener(this,"id_facturaTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteBusqueda"));
		//jButtonid_productoTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaCliente.addActionListener(new ButtonActionListener(this,"id_productoTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonprecioTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_metrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_metrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_litrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_litrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtontareaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"tareaTareaClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteTareaCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.addActionListener(new ButtonActionListener(this,"id_clienteTareaCliente"));

			this.jButtonFK_IdFacturaTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTareaCliente"));

			this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.addActionListener(new ButtonActionListener(this,"id_facturaTareaCliente"));

			this.jButtonFK_IdProductoTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdProductoTareaCliente"));

			this.jButtonBuscarFK_IdProductoid_productoTareaCliente.addActionListener(new ButtonActionListener(this,"id_productoTareaCliente"));

			this.jButtonFK_IdUnidadTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdUnidadTareaCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTareaCliente!=null) {
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTareaCliente"));
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTareaCliente"));
				this.jInternalFrameReporteDinamicoTareaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTareaCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTareaCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTareaCliente"));				
			//this.jButtonGenerarReporteDinamicoTareaCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTareaCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTareaCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTareaCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTareaCliente!=null) {
				this.jInternalFrameImportacionTareaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTareaCliente"));
				this.jInternalFrameImportacionTareaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTareaCliente"));
				this.jInternalFrameImportacionTareaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTareaCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTareaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTareaCliente"));
			
			this.jButtonAbrirOrderByToolBarTareaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTareaCliente"));			
			
			if(this.jInternalFrameOrderByTareaCliente!=null) {
				this.jInternalFrameOrderByTareaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTareaCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTareaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTareaCliente.jTabbedPaneRelacionesTareaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTareaCliente"));
		
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
            		closingInternalFrameTareaCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTareaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTareaCliente = (JInternalFrameBase)event.getSource();
	            	
	            TareaClienteBeanSwingJInternalFrame jInternalFrameParent=(TareaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTareaCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTareaClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTareaCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTareaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTareaCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTareaCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTareaCliente";
		inputMap = this.jButtonNuevoTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTareaClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTareaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTareaCliente";
		inputMap = this.jButtonNuevoRelacionesTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTareaClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTareaCliente";
		inputMap = this.jButtonModificarTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTareaCliente";
		inputMap = this.jButtonActualizarTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTareaCliente";
		inputMap = this.jButtonEliminarTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTareaCliente";
		inputMap = this.jButtonCancelarTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTareaCliente";
		inputMap = this.jButtonCerrarTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTareaCliente";
		inputMap = this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTareaCliente.jButtonGuardarCambiosTareaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTareaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTareaCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTareaClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTareaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTareaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTareaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTareaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTareaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTareaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonidTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_empresaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTareaClienteBusqueda"));
		//jButtonid_clienteTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaCliente.addActionListener(new ButtonActionListener(this,"id_clienteTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTareaClienteBusqueda"));
		//jButtonid_facturaTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaCliente.addActionListener(new ButtonActionListener(this,"id_facturaTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTareaClienteBusqueda"));
		//jButtonid_productoTareaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoTareaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaCliente.addActionListener(new ButtonActionListener(this,"id_productoTareaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTareaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonid_unidadTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonprecioTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_metrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_metrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtonnumero_litrosTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"numero_litrosTareaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTareaCliente.jButtontareaTareaClienteBusqueda.addActionListener(new ButtonActionListener(this,"tareaTareaClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteTareaCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.addActionListener(new ButtonActionListener(this,"id_clienteTareaCliente"));

		this.jButtonFK_IdFacturaTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTareaCliente"));

		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.addActionListener(new ButtonActionListener(this,"id_facturaTareaCliente"));

		this.jButtonFK_IdProductoTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdProductoTareaCliente"));

		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.addActionListener(new ButtonActionListener(this,"id_productoTareaCliente"));

		this.jButtonFK_IdUnidadTareaCliente.addActionListener(new ButtonActionListener(this,"FK_IdUnidadTareaCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTareaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTareaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTareaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTareaCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTareaCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
					tareaclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TareaCliente tareaclienteAux:tareaclientes) {
					tareaclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTareaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTareaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
						tareaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TareaCliente tareaclienteAux:tareaclientes) {
						tareaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TareaCliente tareaclienteAux:tareaclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTareaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTareaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTareaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTareaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTareaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTareaCliente.getSelectedRows();
			
			TareaCliente tareaclienteLocal=new TareaCliente();
			
			//this.seleccionarTodosTareaCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tareaclienteLocal =(TareaCliente) this.tareaclienteLogic.getTareaClientes().toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tareaclienteLocal =(TareaCliente) this.tareaclientes.toArray()[this.jTableDatosTareaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tareaclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
						tareaclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TareaCliente tareaclienteAux:tareaclientes) {
						tareaclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTareaCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTareaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTareaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTareaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTareaClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTareaClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTareaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTareaCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTareaCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TareaCliente tareaclienteAux:this.tareaclienteLogic.getTareaClientes()) {
				
						if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							tareaclienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS)) {
							existe=true;
							tareaclienteAux.setnumero_metros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS)) {
							existe=true;
							tareaclienteAux.setnumero_litros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_TAREA)) {
							existe=true;
							tareaclienteAux.settarea(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TareaCliente tareaclienteAux:tareaclientes) {
					
						if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							tareaclienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS)) {
							existe=true;
							tareaclienteAux.setnumero_metros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS)) {
							existe=true;
							tareaclienteAux.setnumero_litros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_TAREA)) {
							existe=true;
							tareaclienteAux.settarea(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTareaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTareaClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTareaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTareaCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTareaCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTareaCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTareaCliente(conSplash);
				
					this.generarReporteTareaClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTareaClientesSeleccionados();
				//this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTareaClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTareaClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTareaCliente();
				
				this.exportarTareaClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTareaClientes();
				//this.importarTareaClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTareaCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTareaClientesSeleccionados();
				//this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tarea Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTareaCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTareaCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTareaCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(TareaClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTareaCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTareaCliente(conSplash);
					
						//this.actualizarParametrosGeneralTareaCliente();
						
						this.generarReporteProcesoAccionTareaClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TareaClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tarea ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Tarea Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTareaCliente();
				
						this.actualizarParametrosGeneralTareaCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tareaclienteReturnGeneral=tareaclienteLogic.procesarAccionTareaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tareaclienteLogic.getTareaClientes(),this.tareaclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTareaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTareaCliente();
					
					TareaClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTareaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTareaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTareaCliente.jComboBoxTiposAccionesFormularioTareaCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTareaCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTareaClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTareaCliente();
			
			if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
			TareaCliente tareacliente=new TareaCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTareaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTareaCliente.getSelectedItem();
			
			
			
			
			tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tareaclientesSeleccionados.size()==1) {
				for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
					tareacliente=tareaclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTareaCliente();
			
      		//this.finishProcessTareaCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTareaClienteReturnGeneral() throws Exception {
		if(this.tareaclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tareaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tareaclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tareaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tareaclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tareaclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTareaCliente(false);
		}
		
		if(this.tareaclienteReturnGeneral.getConRetornoLista() || this.tareaclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tareaclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tareaclienteLogic.setTareaClientes(this.tareaclienteReturnGeneral.getTareaClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tareaclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tareaclienteLogic.setTareaCliente(this.tareaclienteReturnGeneral.getTareaCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTareaCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTareaCliente() throws Exception {
		
		
	}
	
	public ArrayList<TareaCliente> getTareaClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTareaCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TareaCliente tareaclienteAux:tareaclienteLogic.getTareaClientes()) {
					if(tareaclienteAux.getIsSelected()) {
						tareaclientesSeleccionados.add(tareaclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TareaCliente tareaclienteAux:this.tareaclientes) {
					if(tareaclienteAux.getIsSelected()) {
						tareaclientesSeleccionados.add(tareaclienteAux);				
					}
				}
			}
			
			if(tareaclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tareaclientesSeleccionados.addAll(this.tareaclienteLogic.getTareaClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tareaclientesSeleccionados.addAll(this.tareaclientes);				
					}
				}
			}
		} else {
			tareaclientesSeleccionados.add(this.tareacliente);
		}
		
		return tareaclientesSeleccionados;
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
	
	public void generarReporteTareaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTareaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTareaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTareaClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTareaClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tarea Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTareaClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTareaCliente();
		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTareaCliente();
		
		
		//this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados ,tareaclienteImplementable,tareaclienteImplementableHome);
	}
	
	public void mostrarImportacionTareaClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTareaCliente();
		
		this.abrirFrameImportacionTareaCliente();		
		
			
		//this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados ,tareaclienteImplementable,tareaclienteImplementableHome);
	}
	
	public void importarTareaClientes() throws Exception {		
	
	}
	
	public void exportarTareaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTareaClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTareaClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTareaClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tarea Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTareaCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTareaCliente(tareaclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tareaclienteAux.setsDetalleGeneralEntityReporte(tareaclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTareaCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_NUMEROMETROS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_NUMEROLITROS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TareaClienteConstantesFunciones.LABEL_TAREA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTareaCliente(TareaCliente tareacliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tareacliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getnumero_metros().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.getnumero_litros().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tareacliente.gettarea();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TareaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTareaCliente(row);				
				iRow++;
			}				
			
			for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTareaCliente(tareaclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTareaClientesSeleccionados() throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();		
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tareacliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tareaclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tareacliente");
			//elementRoot.appendChild(element);
		
			for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
				element = document.createElement("tareacliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTareaCliente(tareaclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarea Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTareaCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS);
		cell = row.createCell(iColumn++);cell.setCellValue(TareaClienteConstantesFunciones.LABEL_TAREA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTareaCliente(TareaCliente tareacliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getnumero_metros());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.getnumero_litros());
		cell = row.createCell(iColumn++);cell.setCellValue(tareacliente.gettarea());				
	}
	
	public void setFilaDatosExportarXmlTareaCliente(TareaCliente tareacliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TareaClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tareacliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TareaClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tareacliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TareaClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tareacliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(TareaClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(tareacliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfactura_descripcion = document.createElement(TareaClienteConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(tareacliente.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementproducto_descripcion = document.createElement(TareaClienteConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(tareacliente.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(TareaClienteConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(tareacliente.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementprecio = document.createElement(TareaClienteConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(tareacliente.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementnumero_metros = document.createElement(TareaClienteConstantesFunciones.NUMEROMETROS);
		elementnumero_metros.appendChild(document.createTextNode(tareacliente.getnumero_metros().toString().trim()));
		element.appendChild(elementnumero_metros);

		Element elementnumero_litros = document.createElement(TareaClienteConstantesFunciones.NUMEROLITROS);
		elementnumero_litros.appendChild(document.createTextNode(tareacliente.getnumero_litros().toString().trim()));
		element.appendChild(elementnumero_litros);

		Element elementtarea = document.createElement(TareaClienteConstantesFunciones.TAREA);
		elementtarea.appendChild(document.createTextNode(tareacliente.gettarea().trim()));
		element.appendChild(elementtarea);
	}
	
	public void generarReporteGroupGenericoTareaClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TareaCliente> tareaclientesSeleccionados=new ArrayList<TareaCliente>();
		
		tareaclientesSeleccionados=this.getTareaClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTareaCliente(tareaclientesSeleccionados);
		
		this.generarReporteTareaClientes("Todos",tareaclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTareaCliente(ArrayList<TareaCliente> tareaclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TareaCliente tareaclienteAux:tareaclientesSeleccionados) {
				tareaclienteAux.setsDetalleGeneralEntityReporte(tareaclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TareaClienteConstantesFunciones.LABEL_TAREA)) {
					existe=true;
					tareaclienteAux.setsDescripcionGeneralEntityReporte1(tareaclienteAux.gettarea());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TareaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTareaCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTareaCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTareaCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTareaCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=true;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=true;
			this.isVisibilidadCeldaEliminarTareaCliente=true;
			this.isVisibilidadCeldaCancelarTareaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=true;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTareaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=true;
			this.isVisibilidadCeldaModificarTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
			this.isVisibilidadCeldaModificarTareaCliente=true;
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
			this.isVisibilidadCeldaCancelarTareaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTareaCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TareaClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTareaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=true;
		} else {
			this.actualizarEstadoPanelsTareaCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTareaCliente=false;
			//this.isVisibilidadCeldaVerFormTareaCliente=false;
			this.isVisibilidadCeldaDuplicarTareaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tareaclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTareaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTareaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tareaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tareaclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;												
			}
			
			this.jButtonCerrarTareaCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTareaCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.tareacliente)) {
			this.isVisibilidadCeldaActualizarTareaCliente=false;
			this.isVisibilidadCeldaEliminarTareaCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTareaCliente() {
	}
	
	public void actualizarEstadoPanelsTareaCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTareaCliente!=null) {
				this.jScrollPanelDatosEdicionTareaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTareaCliente!=null) {
				this.jScrollPanelDatosTareaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTareaCliente!=null) {
				this.jPanelPaginacionTareaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTareaCliente!=null) {
					this.jTabbedPaneBusquedasTareaCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTareaCliente!=null) {
				this.jTabbedPaneBusquedasTareaCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTareaCliente!=null) {
				this.jPanelParametrosReportesTareaCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdClienteTareaCliente);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdFacturaTareaCliente);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdProductoTareaCliente);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdUnidadTareaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdClienteTareaCliente);}

			this.isVisibilidadFK_IdFactura=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdFacturaTareaCliente);}

			this.isVisibilidadFK_IdProducto=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdProductoTareaCliente);}

			this.isVisibilidadFK_IdUnidad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdUnidadTareaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdCliente=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdClienteTareaCliente);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdFacturaTareaCliente);}

			this.isVisibilidadFK_IdProducto=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdProductoTareaCliente);}

			this.isVisibilidadFK_IdUnidad=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdUnidadTareaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdCliente=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdClienteTareaCliente);}

			this.isVisibilidadFK_IdFactura=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdFacturaTareaCliente);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdProductoTareaCliente);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdUnidadTareaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdCliente=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdClienteTareaCliente);}

			this.isVisibilidadFK_IdFactura=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdFacturaTareaCliente);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdProductoTareaCliente);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasTareaCliente.remove(jPanelFK_IdUnidadTareaCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionTareaClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(tareaclienteSessionBean==null) {
				tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(tareaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.tareaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TareaClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionTareaCliente(true);
			//clienteSessionBean.setlidTareaClienteActual(this.idTareaClienteActual);

			tareaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTareaCliente(true);
			tareaclienteSessionBean.setlIdTareaClienteActualForeignKey(this.idTareaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionTareaClienteParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(tareaclienteSessionBean==null) {
				tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(tareaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.tareaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(TareaClienteConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionTareaCliente(true);
			//facturaSessionBean.setlidTareaClienteActual(this.idTareaClienteActual);

			tareaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTareaCliente(true);
			tareaclienteSessionBean.setlIdTareaClienteActualForeignKey(this.idTareaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionTareaClienteParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(tareaclienteSessionBean==null) {
				tareaclienteSessionBean=new TareaClienteSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(tareaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.tareaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(TareaClienteConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionTareaCliente(true);
			//productoSessionBean.setlidTareaClienteActual(this.idTareaClienteActual);

			tareaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTareaCliente(true);
			tareaclienteSessionBean.setlIdTareaClienteActualForeignKey(this.idTareaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TareaClienteSessionBean tareaclienteSessionBean=new TareaClienteSessionBean();
		
		if(this.tareaclienteSessionBean==null) {
			this.tareaclienteSessionBean=new TareaClienteSessionBean();
		}
		
		this.tareaclienteSessionBean.setsUltimaBusquedaTareaCliente(this.getsAccionBusqueda());
		this.tareaclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tareaclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			tareaclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tareaclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			tareaclienteSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			tareaclienteSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			tareaclienteSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TareaClienteSessionBean tareaclienteSessionBean=new TareaClienteSessionBean();
		
		if(this.tareaclienteSessionBean==null) {
			this.tareaclienteSessionBean=new TareaClienteSessionBean();
		}
		
		if(this.tareaclienteSessionBean.getsUltimaBusquedaTareaCliente()!=null&&!this.tareaclienteSessionBean.getsUltimaBusquedaTareaCliente().equals("")) {
			this.setsAccionBusqueda(tareaclienteSessionBean.getsUltimaBusquedaTareaCliente());
			this.setiNumeroPaginacion(tareaclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tareaclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(tareaclienteSessionBean.getid_cliente());
				tareaclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tareaclienteSessionBean.getid_empresa());
				tareaclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(tareaclienteSessionBean.getid_factura());
				tareaclienteSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(tareaclienteSessionBean.getid_producto());
				tareaclienteSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(tareaclienteSessionBean.getid_unidad());
				tareaclienteSessionBean.setid_unidad(-1L);
			}
		}
		
		this.tareaclienteSessionBean.setsUltimaBusquedaTareaCliente("");
		this.tareaclienteSessionBean.setiNumeroPaginacion(TareaClienteConstantesFunciones.INUMEROPAGINACION);
		this.tareaclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTareaCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTareaCliente() {
		this.updateBorderResaltarBusquedasFormularioTareaCliente();
		this.updateVisibilidadBusquedasFormularioTareaCliente();
		this.updateHabilitarBusquedasFormularioTareaCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTareaCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTareaCliente.getComponents().length>0) {
	

		if(this.tareaclienteConstantesFunciones.resaltarFK_IdClienteTareaCliente!=null) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdClienteTareaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdClienteTareaCliente);
			}
		}

		if(this.tareaclienteConstantesFunciones.resaltarFK_IdFacturaTareaCliente!=null) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdFacturaTareaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdFacturaTareaCliente);
			}
		}

		if(this.tareaclienteConstantesFunciones.resaltarFK_IdProductoTareaCliente!=null) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdProductoTareaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdProductoTareaCliente);
			}
		}

		if(this.tareaclienteConstantesFunciones.resaltarFK_IdUnidadTareaCliente!=null) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdUnidadTareaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdUnidadTareaCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTareaCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTareaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdClienteTareaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tareaclienteConstantesFunciones.mostrarFK_IdClienteTareaCliente);
			if(!this.tareaclienteConstantesFunciones.mostrarFK_IdClienteTareaCliente && index>-1) {
				this.jTabbedPaneBusquedasTareaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdFacturaTareaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tareaclienteConstantesFunciones.mostrarFK_IdFacturaTareaCliente);
			if(!this.tareaclienteConstantesFunciones.mostrarFK_IdFacturaTareaCliente && index>-1) {
				this.jTabbedPaneBusquedasTareaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdProductoTareaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tareaclienteConstantesFunciones.mostrarFK_IdProductoTareaCliente);
			if(!this.tareaclienteConstantesFunciones.mostrarFK_IdProductoTareaCliente && index>-1) {
				this.jTabbedPaneBusquedasTareaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdUnidadTareaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tareaclienteConstantesFunciones.mostrarFK_IdUnidadTareaCliente);
			if(!this.tareaclienteConstantesFunciones.mostrarFK_IdUnidadTareaCliente && index>-1) {
				this.jTabbedPaneBusquedasTareaCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTareaCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTareaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdClienteTareaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tareaclienteConstantesFunciones.activarFK_IdClienteTareaCliente);
				this.jTabbedPaneBusquedasTareaCliente.setEnabledAt(index,this.tareaclienteConstantesFunciones.activarFK_IdClienteTareaCliente);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdFacturaTareaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tareaclienteConstantesFunciones.activarFK_IdFacturaTareaCliente);
				this.jTabbedPaneBusquedasTareaCliente.setEnabledAt(index,this.tareaclienteConstantesFunciones.activarFK_IdFacturaTareaCliente);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdProductoTareaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tareaclienteConstantesFunciones.activarFK_IdProductoTareaCliente);
				this.jTabbedPaneBusquedasTareaCliente.setEnabledAt(index,this.tareaclienteConstantesFunciones.activarFK_IdProductoTareaCliente);
			}

			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdUnidadTareaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tareaclienteConstantesFunciones.activarFK_IdUnidadTareaCliente);
				this.jTabbedPaneBusquedasTareaCliente.setEnabledAt(index,this.tareaclienteConstantesFunciones.activarFK_IdUnidadTareaCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTareaCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdClienteTareaCliente);

			this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);

			this.tareaclienteConstantesFunciones.setResaltarFK_IdClienteTareaCliente(resaltar);

			jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdClienteTareaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdFacturaTareaCliente);

			this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);

			this.tareaclienteConstantesFunciones.setResaltarFK_IdFacturaTareaCliente(resaltar);

			jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdFacturaTareaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdProductoTareaCliente);

			this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);

			this.tareaclienteConstantesFunciones.setResaltarFK_IdProductoTareaCliente(resaltar);

			jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdProductoTareaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasTareaCliente.indexOfComponent(this.jPanelFK_IdUnidadTareaCliente);

			this.jTabbedPaneBusquedasTareaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTareaCliente.getComponent(index);

			this.tareaclienteConstantesFunciones.setResaltarFK_IdUnidadTareaCliente(resaltar);

			jPanel.setBorder(this.tareaclienteConstantesFunciones.resaltarFK_IdUnidadTareaCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTareaCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTareaCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTareaCliente();
		this.updateVisibilidadResaltarControlesFormularioTareaCliente();
		this.updateHabilitarResaltarControlesFormularioTareaCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTareaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tareaclienteConstantesFunciones.resaltaridTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltaridTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarid_empresaTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarid_empresaTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarid_clienteTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarid_clienteTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarid_facturaTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarid_facturaTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarid_productoTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarid_productoTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarid_unidadTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarid_unidadTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarprecioTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarprecioTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarnumero_metrosTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarnumero_metrosTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltarnumero_litrosTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltarnumero_litrosTareaCliente);}
		if(this.tareaclienteConstantesFunciones.resaltartareaTareaCliente!=null && this.jInternalFrameDetalleFormTareaCliente!=null) {this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setBorder(this.tareaclienteConstantesFunciones.resaltartareaTareaCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTareaCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
	
		//this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostraridTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelidTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostraridTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_empresaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelid_empresaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_empresaTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_clienteTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelid_clienteTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_clienteTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_clienteTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_facturaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelid_facturaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_facturaTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_facturaTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_productoTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelid_productoTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_productoTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_productoTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_unidadTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelid_unidadTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarid_unidadTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarprecioTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelprecioTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarprecioTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarnumero_metrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelnumero_metrosTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarnumero_metrosTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarnumero_litrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPanelnumero_litrosTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrarnumero_litrosTareaCliente);
		//this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrartareaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jPaneltareaTareaCliente.setVisible(this.tareaclienteConstantesFunciones.mostrartareaTareaCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTareaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTareaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTareaCliente!=null) {
	
		this.jInternalFrameDetalleFormTareaCliente.jLabelidTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activaridTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_empresaTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_empresaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_clienteTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_clienteTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_clienteTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_clienteTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_facturaTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_facturaTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_facturaTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_facturaTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_productoTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_productoTareaCliente);
			this.jInternalFrameDetalleFormTareaCliente.jButtonid_productoTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_productoTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jComboBoxid_unidadTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarid_unidadTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldprecioTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarprecioTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_metrosTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarnumero_metrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextFieldnumero_litrosTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activarnumero_litrosTareaCliente);
		this.jInternalFrameDetalleFormTareaCliente.jTextAreatareaTareaCliente.setEnabled(this.tareaclienteConstantesFunciones.activartareaTareaCliente);
		}
	}
	
		
}