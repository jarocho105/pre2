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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ProcesoPreciosPorcentajeConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoPreciosPorcentajeParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoPreciosPorcentajeParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoPreciosPorcentajeBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoPreciosPorcentajeBeanSwingJInternalFrame extends ProcesoPreciosPorcentajeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoPreciosPorcentaje> procesopreciosporcentajeValidator = new ClassValidator<ProcesoPreciosPorcentaje>(ProcesoPreciosPorcentaje.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoPreciosPorcentaje procesopreciosporcentaje;	
	public ProcesoPreciosPorcentaje procesopreciosporcentajeAux;
	public ProcesoPreciosPorcentaje procesopreciosporcentajeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoPreciosPorcentaje procesopreciosporcentajeTotales;
	public Long idProcesoPreciosPorcentajeActual;
	public Long iIdNuevoProcesoPreciosPorcentaje=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoProcesoPreciosPorcentaje;
	public Boolean isPermisoNuevoProcesoPreciosPorcentaje;
	public Boolean isPermisoActualizarProcesoPreciosPorcentaje;
	public Boolean isPermisoActualizarOriginalProcesoPreciosPorcentaje;
	public Boolean isPermisoEliminarProcesoPreciosPorcentaje;
	public Boolean isPermisoGuardarCambiosProcesoPreciosPorcentaje;
	public Boolean isPermisoConsultaProcesoPreciosPorcentaje;
	public Boolean isPermisoBusquedaProcesoPreciosPorcentaje;
	public Boolean isPermisoReporteProcesoPreciosPorcentaje;
	public Boolean isPermisoPaginacionMedioProcesoPreciosPorcentaje;
	public Boolean isPermisoPaginacionAltoProcesoPreciosPorcentaje;
	public Boolean isPermisoPaginacionTodoProcesoPreciosPorcentaje;
	public Boolean isPermisoCopiarProcesoPreciosPorcentaje;
	public Boolean isPermisoVerFormProcesoPreciosPorcentaje;
	public Boolean isPermisoDuplicarProcesoPreciosPorcentaje;
	public Boolean isPermisoOrdenProcesoPreciosPorcentaje;
	
	
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
	
	public ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeReturnGeneral;
	public ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoPreciosPorcentaje=false;
	public Boolean esParaAccionDesdeFormularioProcesoPreciosPorcentaje=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoPreciosPorcentajeSessionBeanAdditional procesopreciosporcentajeSessionBeanAdditional=null;
	
	public ProcesoPreciosPorcentajeSessionBeanAdditional getProcesoPreciosPorcentajeSessionBeanAdditional() {
		return this.procesopreciosporcentajeSessionBeanAdditional;
	}
	
	public void setProcesoPreciosPorcentajeSessionBeanAdditional(ProcesoPreciosPorcentajeSessionBeanAdditional procesopreciosporcentajeSessionBeanAdditional) {
		try {
			this.procesopreciosporcentajeSessionBeanAdditional=procesopreciosporcentajeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional procesopreciosporcentajeBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoPreciosPorcentajeBeanSwingJInternalFrame
	
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional getProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional() {
		return this.procesopreciosporcentajeBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional(ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional procesopreciosporcentajeBeanSwingJInternalFrameAdditional) {
		try {
			this.procesopreciosporcentajeBeanSwingJInternalFrameAdditional=procesopreciosporcentajeBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoPreciosPorcentajeLogic procesopreciosporcentajeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoPreciosPorcentaje procesopreciosporcentajeBean;
	public ProcesoPreciosPorcentajeConstantesFunciones procesopreciosporcentajeConstantesFunciones;
	//public ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeReturnGeneral;
	
	//FK
	
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoPreciosPorcentaje> procesopreciosporcentajes;	
	//public List<ProcesoPreciosPorcentaje> procesopreciosporcentajesEliminados;
	//public List<ProcesoPreciosPorcentaje> procesopreciosporcentajesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje=true;
	public Boolean isVisibilidadCeldaCopiarProcesoPreciosPorcentaje=true;
	public Boolean isVisibilidadCeldaVerFormProcesoPreciosPorcentaje=true;
	public Boolean isVisibilidadCeldaOrdenProcesoPreciosPorcentaje=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoPreciosPorcentaje=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoPreciosPorcentaje() {
		return this.iIdNuevoProcesoPreciosPorcentaje;
	}

	public void setiIdNuevoProcesoPreciosPorcentaje(Long iIdNuevoProcesoPreciosPorcentaje) {
		this.iIdNuevoProcesoPreciosPorcentaje = iIdNuevoProcesoPreciosPorcentaje;
	}
	
	public Long getidProcesoPreciosPorcentajeActual() {
		return this.idProcesoPreciosPorcentajeActual;
	}

	public void setidProcesoPreciosPorcentajeActual(Long idProcesoPreciosPorcentajeActual) {
		this.idProcesoPreciosPorcentajeActual = idProcesoPreciosPorcentajeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoPreciosPorcentaje getprocesopreciosporcentaje() {
		return this.procesopreciosporcentaje;
	}

	public void setprocesopreciosporcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje) {
		this.procesopreciosporcentaje = procesopreciosporcentaje;
	}
	
	public ProcesoPreciosPorcentaje getprocesopreciosporcentajeAux() {
		return this.procesopreciosporcentajeAux;
	}

	public void setprocesopreciosporcentajeAux(ProcesoPreciosPorcentaje procesopreciosporcentajeAux) {
		this.procesopreciosporcentajeAux = procesopreciosporcentajeAux;
	}				
	
	public ProcesoPreciosPorcentaje getprocesopreciosporcentajeAnterior() {
		return this.procesopreciosporcentajeAnterior;
	}

	public void setprocesopreciosporcentajeAnterior(ProcesoPreciosPorcentaje procesopreciosporcentajeAnterior) {
		this.procesopreciosporcentajeAnterior = procesopreciosporcentajeAnterior;
	}	
	
	public ProcesoPreciosPorcentaje getprocesopreciosporcentajeTotales() {
		return this.procesopreciosporcentajeTotales;
	}

	public void setprocesopreciosporcentajeTotales(ProcesoPreciosPorcentaje procesopreciosporcentajeTotales) {
		this.procesopreciosporcentajeTotales = procesopreciosporcentajeTotales;
	}	
	
	public ProcesoPreciosPorcentaje getprocesopreciosporcentajeBean() {
		return this.procesopreciosporcentajeBean;
	}

	public void setprocesopreciosporcentajeBean(ProcesoPreciosPorcentaje procesopreciosporcentajeBean) {
		this.procesopreciosporcentajeBean = procesopreciosporcentajeBean;
	}	
	
	public ProcesoPreciosPorcentajeParameterReturnGeneral getprocesopreciosporcentajeReturnGeneral() {
		return this.procesopreciosporcentajeReturnGeneral;
	}

	public void setprocesopreciosporcentajeReturnGeneral(ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeReturnGeneral) {
		this.procesopreciosporcentajeReturnGeneral = procesopreciosporcentajeReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_bodegaBusquedaProcesoPreciosPorcentaje() {
		return this.id_bodegaBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_bodegaBusquedaProcesoPreciosPorcentaje(Long id_bodegaBusquedaProcesoPreciosPorcentaje) {
		this.id_bodegaBusquedaProcesoPreciosPorcentaje = id_bodegaBusquedaProcesoPreciosPorcentaje;
	}

;
	public Long id_productoBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_productoBusquedaProcesoPreciosPorcentaje() {
		return this.id_productoBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_productoBusquedaProcesoPreciosPorcentaje(Long id_productoBusquedaProcesoPreciosPorcentaje) {
		this.id_productoBusquedaProcesoPreciosPorcentaje = id_productoBusquedaProcesoPreciosPorcentaje;
	}

;
	public Long id_lineaBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_lineaBusquedaProcesoPreciosPorcentaje() {
		return this.id_lineaBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_lineaBusquedaProcesoPreciosPorcentaje(Long id_lineaBusquedaProcesoPreciosPorcentaje) {
		this.id_lineaBusquedaProcesoPreciosPorcentaje = id_lineaBusquedaProcesoPreciosPorcentaje;
	}

;
	public Long id_linea_grupoBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_linea_grupoBusquedaProcesoPreciosPorcentaje() {
		return this.id_linea_grupoBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_linea_grupoBusquedaProcesoPreciosPorcentaje(Long id_linea_grupoBusquedaProcesoPreciosPorcentaje) {
		this.id_linea_grupoBusquedaProcesoPreciosPorcentaje = id_linea_grupoBusquedaProcesoPreciosPorcentaje;
	}

;
	public Long id_linea_categoriaBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_linea_categoriaBusquedaProcesoPreciosPorcentaje() {
		return this.id_linea_categoriaBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_linea_categoriaBusquedaProcesoPreciosPorcentaje(Long id_linea_categoriaBusquedaProcesoPreciosPorcentaje) {
		this.id_linea_categoriaBusquedaProcesoPreciosPorcentaje = id_linea_categoriaBusquedaProcesoPreciosPorcentaje;
	}

;
	public Long id_linea_marcaBusquedaProcesoPreciosPorcentaje=-1L;

	public Long getid_linea_marcaBusquedaProcesoPreciosPorcentaje() {
		return this.id_linea_marcaBusquedaProcesoPreciosPorcentaje;
	}

	public void setid_linea_marcaBusquedaProcesoPreciosPorcentaje(Long id_linea_marcaBusquedaProcesoPreciosPorcentaje) {
		this.id_linea_marcaBusquedaProcesoPreciosPorcentaje = id_linea_marcaBusquedaProcesoPreciosPorcentaje;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoPreciosPorcentajeLogic getProcesoPreciosPorcentajeLogic()	{		
		return procesopreciosporcentajeLogic;
	}

	public void setProcesoPreciosPorcentajeLogic(ProcesoPreciosPorcentajeLogic procesopreciosporcentajeLogic) {
		this.procesopreciosporcentajeLogic = procesopreciosporcentajeLogic;
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
	
	public Boolean getIsEsNuevoProcesoPreciosPorcentaje() {
		return isEsNuevoProcesoPreciosPorcentaje;
	}

	public void setIsEsNuevoProcesoPreciosPorcentaje(Boolean isEsNuevoProcesoPreciosPorcentaje) {
		this.isEsNuevoProcesoPreciosPorcentaje = isEsNuevoProcesoPreciosPorcentaje;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoPreciosPorcentaje() {
		return esParaAccionDesdeFormularioProcesoPreciosPorcentaje;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoPreciosPorcentaje(Boolean esParaAccionDesdeFormularioProcesoPreciosPorcentaje) {
		this.esParaAccionDesdeFormularioProcesoPreciosPorcentaje = esParaAccionDesdeFormularioProcesoPreciosPorcentaje;
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
	
	
	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

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
					productoLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidProductoActual());
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

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesopreciosporcentajeSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

	
	
	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProcesoPreciosPorcentajeGenerico)throws Exception
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
				jComboBoxid_productoProcesoPreciosPorcentajeGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_productoProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_productoProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
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

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoPreciosPorcentajeGenerico)throws Exception
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
				jComboBoxid_empresaProcesoPreciosPorcentajeGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_empresaProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaProcesoPreciosPorcentajeGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_lineaProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_lineaProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.procesopreciosporcentaje!=null) {
						this.procesopreciosporcentaje.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
						jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
							//jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico!=null && jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				procesopreciosporcentaje.setid_bodega(bodegaAux.getId());
				procesopreciosporcentaje.setbodega_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getBodegaDescripcion(bodegaAux));
				procesopreciosporcentaje.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_productoProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProcesoPreciosPorcentajeGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				procesopreciosporcentaje.setid_producto(productoAux.getId());
				procesopreciosporcentaje.setproducto_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getProductoDescripcion(productoAux));
				procesopreciosporcentaje.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_empresaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoPreciosPorcentajeGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesopreciosporcentaje.setid_empresa(empresaAux.getId());
				procesopreciosporcentaje.setempresa_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesopreciosporcentaje.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesopreciosporcentaje.setid_sucursal(sucursalAux.getId());
				procesopreciosporcentaje.setsucursal_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesopreciosporcentaje.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_lineaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProcesoPreciosPorcentajeGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosporcentaje.setid_linea(lineaAux.getId());
				procesopreciosporcentaje.setlinea_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getLineaDescripcion(lineaAux));
				procesopreciosporcentaje.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosporcentaje.setid_linea_grupo(lineaAux.getId());
				procesopreciosporcentaje.setlineagrupo_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				procesopreciosporcentaje.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosporcentaje.setid_linea_categoria(lineaAux.getId());
				procesopreciosporcentaje.setlineacategoria_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				procesopreciosporcentaje.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProcesoPreciosPorcentaje procesopreciosporcentaje,JComboBox jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProcesoPreciosPorcentajeGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosporcentaje.setid_linea_marca(lineaAux.getId());
				procesopreciosporcentaje.setlineamarca_descripcion(ProcesoPreciosPorcentajeConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				procesopreciosporcentaje.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(bodega);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(producto);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(linea);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(lineagrupo);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(lineacategoria);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { 
					}

					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addItem(lineamarca);
							}
						}

						if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoPreciosPorcentaje() throws Exception {
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
		
	public ProcesoPreciosPorcentajeParameterReturnGeneral getProcesoPreciosPorcentajeParameterGeneral() {
		return this.procesopreciosporcentajeParameterGeneral;
	}
	
	public void setProcesoPreciosPorcentajeParameterGeneral(ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeParameterGeneral) {
		this.procesopreciosporcentajeParameterGeneral = procesopreciosporcentajeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoPreciosPorcentaje() {
		return isPermisoTodoProcesoPreciosPorcentaje;
	}

	public void setIsPermisoTodoProcesoPreciosPorcentaje(Boolean isPermisoTodoProcesoPreciosPorcentaje) {
		this.isPermisoTodoProcesoPreciosPorcentaje = isPermisoTodoProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoNuevoProcesoPreciosPorcentaje() {
		return isPermisoNuevoProcesoPreciosPorcentaje;
	}

	public void setIsPermisoNuevoProcesoPreciosPorcentaje(Boolean isPermisoNuevoProcesoPreciosPorcentaje) {
		this.isPermisoNuevoProcesoPreciosPorcentaje = isPermisoNuevoProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoActualizarProcesoPreciosPorcentaje() {
		return isPermisoActualizarProcesoPreciosPorcentaje;
	}

	public void setIsPermisoActualizarProcesoPreciosPorcentaje(Boolean isPermisoActualizarProcesoPreciosPorcentaje) {
		this.isPermisoActualizarProcesoPreciosPorcentaje = isPermisoActualizarProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoEliminarProcesoPreciosPorcentaje() {
		return isPermisoEliminarProcesoPreciosPorcentaje;
	}

	public void setIsPermisoEliminarProcesoPreciosPorcentaje(Boolean isPermisoEliminarProcesoPreciosPorcentaje) {
		this.isPermisoEliminarProcesoPreciosPorcentaje = isPermisoEliminarProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoPreciosPorcentaje() {
		return isPermisoGuardarCambiosProcesoPreciosPorcentaje;
	}

	public void setIsPermisoGuardarCambiosProcesoPreciosPorcentaje(Boolean isPermisoGuardarCambiosProcesoPreciosPorcentaje) {
		this.isPermisoGuardarCambiosProcesoPreciosPorcentaje = isPermisoGuardarCambiosProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoConsultaProcesoPreciosPorcentaje() {
		return isPermisoConsultaProcesoPreciosPorcentaje;
	}

	public void setIsPermisoConsultaProcesoPreciosPorcentaje(Boolean isPermisoConsultaProcesoPreciosPorcentaje) {
		this.isPermisoConsultaProcesoPreciosPorcentaje = isPermisoConsultaProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoBusquedaProcesoPreciosPorcentaje() {
		return isPermisoBusquedaProcesoPreciosPorcentaje;
	}

	public void setIsPermisoBusquedaProcesoPreciosPorcentaje(Boolean isPermisoBusquedaProcesoPreciosPorcentaje) {
		this.isPermisoBusquedaProcesoPreciosPorcentaje = isPermisoBusquedaProcesoPreciosPorcentaje;
	}

	public Boolean getIsPermisoReporteProcesoPreciosPorcentaje() {
		return isPermisoReporteProcesoPreciosPorcentaje;
	}

	public void setIsPermisoReporteProcesoPreciosPorcentaje(Boolean isPermisoReporteProcesoPreciosPorcentaje) {
		this.isPermisoReporteProcesoPreciosPorcentaje = isPermisoReporteProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoPreciosPorcentaje() {
		return isPermisoPaginacionMedioProcesoPreciosPorcentaje;
	}

	public void setIsPermisoPaginacionMedioProcesoPreciosPorcentaje(Boolean isPermisoPaginacionMedioProcesoPreciosPorcentaje) {
		this.isPermisoPaginacionMedioProcesoPreciosPorcentaje = isPermisoPaginacionMedioProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoPreciosPorcentaje() {
		return isPermisoPaginacionTodoProcesoPreciosPorcentaje;
	}

	public void setIsPermisoPaginacionTodoProcesoPreciosPorcentaje(Boolean isPermisoPaginacionTodoProcesoPreciosPorcentaje) {
		this.isPermisoPaginacionTodoProcesoPreciosPorcentaje = isPermisoPaginacionTodoProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoPreciosPorcentaje() {
		return isPermisoPaginacionAltoProcesoPreciosPorcentaje;
	}

	public void setIsPermisoPaginacionAltoProcesoPreciosPorcentaje(Boolean isPermisoPaginacionAltoProcesoPreciosPorcentaje) {
		this.isPermisoPaginacionAltoProcesoPreciosPorcentaje = isPermisoPaginacionAltoProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoCopiarProcesoPreciosPorcentaje() {
		return isPermisoCopiarProcesoPreciosPorcentaje;
	}

	public void setIsPermisoCopiarProcesoPreciosPorcentaje(Boolean isPermisoCopiarProcesoPreciosPorcentaje) {
		this.isPermisoCopiarProcesoPreciosPorcentaje = isPermisoCopiarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoVerFormProcesoPreciosPorcentaje() {
		return isPermisoVerFormProcesoPreciosPorcentaje;
	}

	public void setIsPermisoVerFormProcesoPreciosPorcentaje(Boolean isPermisoVerFormProcesoPreciosPorcentaje) {
		this.isPermisoVerFormProcesoPreciosPorcentaje = isPermisoVerFormProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoDuplicarProcesoPreciosPorcentaje() {
		return isPermisoDuplicarProcesoPreciosPorcentaje;
	}

	public void setIsPermisoDuplicarProcesoPreciosPorcentaje(Boolean isPermisoDuplicarProcesoPreciosPorcentaje) {
		this.isPermisoDuplicarProcesoPreciosPorcentaje = isPermisoDuplicarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsPermisoOrdenProcesoPreciosPorcentaje() {
		return isPermisoOrdenProcesoPreciosPorcentaje;
	}

	public void setIsPermisoOrdenProcesoPreciosPorcentaje(Boolean isPermisoOrdenProcesoPreciosPorcentaje) {
		this.isPermisoOrdenProcesoPreciosPorcentaje = isPermisoOrdenProcesoPreciosPorcentaje;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaNuevoProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaNuevoProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaNuevoProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje = isVisibilidadCeldaNuevoProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje = isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaCopiarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaCopiarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaCopiarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje = isVisibilidadCeldaCopiarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaVerFormProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaVerFormProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaVerFormProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje = isVisibilidadCeldaVerFormProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaOrdenProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaOrdenProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaOrdenProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje = isVisibilidadCeldaOrdenProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje = isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaModificarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaModificarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaModificarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje = isVisibilidadCeldaModificarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaActualizarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaActualizarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaActualizarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje = isVisibilidadCeldaActualizarProcesoPreciosPorcentaje;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaEliminarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaEliminarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaEliminarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje = isVisibilidadCeldaEliminarProcesoPreciosPorcentaje;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaCancelarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaCancelarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaCancelarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje = isVisibilidadCeldaCancelarProcesoPreciosPorcentaje;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaGuardarProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaGuardarProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaGuardarProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje = isVisibilidadCeldaGuardarProcesoPreciosPorcentaje;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje() {
		return isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje(Boolean isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje) {
		this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje = isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje;
	}
		
	public ProcesoPreciosPorcentajeSessionBean getprocesopreciosporcentajeSessionBean() {
		return this.procesopreciosporcentajeSessionBean;
	}
	
	public void setprocesopreciosporcentajeSessionBean(ProcesoPreciosPorcentajeSessionBean procesopreciosporcentajeSessionBean) {
		this.procesopreciosporcentajeSessionBean=procesopreciosporcentajeSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoPreciosPorcentaje() {
		return this.isVisibilidadBusquedaProcesoPreciosPorcentaje;
	}

	public void setisVisibilidadBusquedaProcesoPreciosPorcentaje(Boolean isVisibilidadBusquedaProcesoPreciosPorcentaje) {
		this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isVisibilidadBusquedaProcesoPreciosPorcentaje;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarProductoForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarEmpresaForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarSucursalForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarLineaForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarLineaGrupoForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(procesopreciosporcentaje,null);
				this.setActualParaGuardarLineaMarcaForeignKey(procesopreciosporcentaje,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoPreciosPorcentaje procesopreciosporcentaje,ProcesoPreciosPorcentaje procesopreciosporcentajeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoPreciosPorcentaje(procesopreciosporcentaje);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesopreciosporcentajeAux.setId(procesopreciosporcentaje.getId());
		procesopreciosporcentajeAux.setVersionRow(procesopreciosporcentaje.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoPreciosPorcentaje procesopreciosporcentajeLocal) throws Exception {
		
		if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoPreciosPorcentaje procesopreciosporcentajeLocal) throws Exception {	
		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				procesopreciosporcentajeLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				procesopreciosporcentajeLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesopreciosporcentajeLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesopreciosporcentajeLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				procesopreciosporcentajeLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				procesopreciosporcentajeLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				procesopreciosporcentajeLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				procesopreciosporcentajeLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoPreciosPorcentajeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesopreciosporcentajeValidator.getInvalidValues(this.procesopreciosporcentaje);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoPreciosPorcentaje procesopreciosporcentaje,List<ProcesoPreciosPorcentaje> procesopreciosporcentajes) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoPreciosPorcentaje procesopreciosporcentaje,List<ProcesoPreciosPorcentaje> procesopreciosporcentajes) throws Exception {
		try	{			
			ProcesoPreciosPorcentajeConstantesFunciones.actualizarSelectedLista(procesopreciosporcentaje,procesopreciosporcentajes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoPreciosPorcentaje> procesopreciosporcentajesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesopreciosporcentajesLocal=this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesopreciosporcentajesLocal=this.procesopreciosporcentajes;
			}
			//ARCHITECTURE
		
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeLocal:procesopreciosporcentajesLocal) {
				if(this.permiteMantenimiento(procesopreciosporcentajeLocal) && procesopreciosporcentajeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.getProcesoPreciosPorcentajeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigoProcesoPreciosPorcentaje,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombreProcesoPreciosPorcentaje,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigo_productoProcesoPreciosPorcentaje,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombre_productoProcesoPreciosPorcentaje,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelprecioProcesoPreciosPorcentaje,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosPorcentajeConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelporcentajeProcesoPreciosPorcentaje,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigoProcesoPreciosPorcentaje,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombreProcesoPreciosPorcentaje,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigo_productoProcesoPreciosPorcentaje,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombre_productoProcesoPreciosPorcentaje,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelprecioProcesoPreciosPorcentaje,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelporcentajeProcesoPreciosPorcentaje,"");
		
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
		this.iIdNuevoProcesoPreciosPorcentaje--;	
		
		
		this.procesopreciosporcentajeAux=new ProcesoPreciosPorcentaje();
		
		this.procesopreciosporcentajeAux.setId(this.iIdNuevoProcesoPreciosPorcentaje);
		this.procesopreciosporcentajeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().add(this.procesopreciosporcentajeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesopreciosporcentajes.add(this.procesopreciosporcentajeAux);
		}
		//ARCHITECTURE
		
		this.procesopreciosporcentaje=this.procesopreciosporcentajeAux;
		
		if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
		}
				
		//this.setDefaultControlesProcesoPreciosPorcentaje();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoPreciosPorcentaje();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoPreciosPorcentaje();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosPorcentaje();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentajeBean,this.procesopreciosporcentaje,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral,this.procesopreciosporcentajeBean,false);
		
		if(this.procesopreciosporcentajeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje());
		}
		
		if(this.procesopreciosporcentajeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje(),classes);//this.procesopreciosporcentajeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoPreciosPorcentaje();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoPreciosPorcentaje();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.RecargarFormProcesoPreciosPorcentaje(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
						
			if(procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();
			}
			
			this.actualizarVisualTableDatosProcesoPreciosPorcentaje();
			
			this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosPorcentaje(), this.getIndiceNuevoProcesoPreciosPorcentaje());
			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
						
			this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoPreciosPorcentaje(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarcodigoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarnombreProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarcodigo_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarnombre_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarprecioProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarporcentajeProcesoPreciosPorcentaje);	
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_bodegaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_productoProcesoPreciosPorcentaje);//
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_empresaProcesoPreciosPorcentaje);//
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_sucursalProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_lineaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_linea_grupoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_linea_categoriaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setEnabled(isHabilitar && this.procesopreciosporcentajeConstantesFunciones.activarid_linea_marcaProcesoPreciosPorcentaje);
	};
	
	public void setDefaultControlesProcesoPreciosPorcentaje() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoPreciosPorcentaje(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(true);			
			this.procesopreciosporcentajeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setVisible(true);
			
					
		} else {
			//this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(false);			
			this.procesopreciosporcentajeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoPreciosPorcentaje() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				if(procesopreciosporcentajeAux.getId().equals(this.iIdNuevoProcesoPreciosPorcentaje)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajes) {
				if(procesopreciosporcentajeAux.getId().equals(this.iIdNuevoProcesoPreciosPorcentaje)) {
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
	
	public int getIndiceActualProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				if(procesopreciosporcentajeAux.getId().equals(procesopreciosporcentaje.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajes) {
				if(procesopreciosporcentajeAux.getId().equals(procesopreciosporcentaje.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentajeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				if(procesopreciosporcentajeAux.getProcesoPreciosPorcentajeOriginal().getId().equals(procesopreciosporcentajeOriginal.getId())) {
					existe=true;
					procesopreciosporcentajeOriginal.setId(procesopreciosporcentajeAux.getId());
					procesopreciosporcentajeOriginal.setVersionRow(procesopreciosporcentajeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajes) {
				if(procesopreciosporcentajeAux.getProcesoPreciosPorcentajeOriginal().getId().equals(procesopreciosporcentajeOriginal.getId())) {
					existe=true;
					procesopreciosporcentajeOriginal.setId(procesopreciosporcentajeAux.getId());
					procesopreciosporcentajeOriginal.setVersionRow(procesopreciosporcentajeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoPreciosPorcentaje(Boolean esParaCancelar) throws Exception {
		procesopreciosporcentajesAux=new ArrayList<ProcesoPreciosPorcentaje>();
		procesopreciosporcentajeAux=new ProcesoPreciosPorcentaje();
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
					if(procesopreciosporcentajeAux.getId()<0) {
						procesopreciosporcentajesAux.add(procesopreciosporcentajeAux);
					}		
				}
				this.iIdNuevoProcesoPreciosPorcentaje=0L;
				this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().removeAll(procesopreciosporcentajesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajes) {
					if(procesopreciosporcentajeAux.getId()<0) {
						procesopreciosporcentajesAux.add(procesopreciosporcentajeAux);
					}		
				}
				this.iIdNuevoProcesoPreciosPorcentaje=0L;
				this.procesopreciosporcentajes.removeAll(procesopreciosporcentajesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoPreciosPorcentaje 
					&& this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size()>0
					) {
					procesopreciosporcentajeAux=this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().get(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size() - 1);
				
					if(procesopreciosporcentajeAux.getId()<0) {
						this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().remove(procesopreciosporcentajeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoPreciosPorcentaje && this.procesopreciosporcentajes.size()>0) {
					procesopreciosporcentajeAux=this.procesopreciosporcentajes.get(this.procesopreciosporcentajes.size() - 1);
				
					if(procesopreciosporcentajeAux.getId()<0) {
						this.procesopreciosporcentajes.remove(procesopreciosporcentajeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoPreciosPorcentaje(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesopreciosporcentaje.getId()<0) {
				this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().remove(this.procesopreciosporcentaje);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesopreciosporcentaje.getId()<0) {
				this.procesopreciosporcentajes.remove(this.procesopreciosporcentaje);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoPreciosPorcentaje(List<ProcesoPreciosPorcentaje> procesopreciosporcentajesAux) throws Exception {
		ProcesoPreciosPorcentajeConstantesFunciones.setEstadosInicialesProcesoPreciosPorcentaje(procesopreciosporcentajesAux);
	}
	
	public void setEstadosInicialesProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentajeAux) throws Exception {
		ProcesoPreciosPorcentajeConstantesFunciones.setEstadosInicialesProcesoPreciosPorcentaje(procesopreciosporcentajeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoPreciosPorcentajeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoPreciosPorcentajeActual()) {
				if(!this.isEsNuevoProcesoPreciosPorcentaje) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoPreciosPorcentaje=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoPreciosPorcentajeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Precios Porcentaje ?", "MANTENIMIENTO DE Proceso Precios Porcentaje", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoPreciosPorcentaje procesopreciosporcentaje) throws Exception {
		ProcesoPreciosPorcentajeConstantesFunciones.seleccionarAsignar(this.procesopreciosporcentaje,procesopreciosporcentaje);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoPreciosPorcentaje=this.isPermisoActualizarOriginalProcesoPreciosPorcentaje;
			
			
			this.seleccionarAsignar(procesopreciosporcentaje);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesopreciosporcentajeSessionBean.setsFuncionBusquedaRapida(this.procesopreciosporcentajeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoPreciosPorcentaje) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoPreciosPorcentaje(esParaCancelar);				
				this.cancelarNuevoProcesoPreciosPorcentaje(esParaCancelar);								
			}
			
			this.procesopreciosporcentaje=new ProcesoPreciosPorcentaje();
			
			this.inicializarProcesoPreciosPorcentaje();
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoPreciosPorcentaje() throws Exception {
		try {
			ProcesoPreciosPorcentajeConstantesFunciones.inicializarProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoPreciosPorcentajes(String sAccionBusqueda,List<ProcesoPreciosPorcentaje> procesopreciosporcentajesParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoPreciosPorcentaje"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoPreciosPorcentajeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoPreciosPorcentajeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoPreciosPorcentaje"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Precios Porcentajes");		
		parameters.put("busquedapor", ProcesoPreciosPorcentajeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoPreciosPorcentaje=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoPreciosPorcentajeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoPreciosPorcentajeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoPreciosPorcentaje=new JRBeanArrayDataSource(ProcesoPreciosPorcentajeJInternalFrame.TraerProcesoPreciosPorcentajeBeans(procesopreciosporcentajesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoPreciosPorcentaje);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoPreciosPorcentajeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoPreciosPorcentajeBean.TraerProcesoPreciosPorcentajeBeans(procesopreciosporcentajesParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentajeActionPerformed(null);
					//this.generarExcelReporteProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoPreciosPorcentajes(sAccionBusqueda,sTipoArchivoReporte,procesopreciosporcentajesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoPreciosPorcentajes(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosPorcentaje> procesopreciosporcentajesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosPorcentajes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPreciosPorcentaje("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoPreciosPorcentaje procesopreciosporcentaje : procesopreciosporcentajesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoPreciosPorcentajeConstantesFunciones.generarExcelReporteDataProcesoPreciosPorcentaje("NORMAL",row,workbook,procesopreciosporcentaje,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoPreciosPorcentaje(String sTipo,Row row,Workbook workbook) {
		
		ProcesoPreciosPorcentajeConstantesFunciones.generarExcelReporteHeaderProcesoPreciosPorcentaje(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoPreciosPorcentajes(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosPorcentaje> procesopreciosporcentajesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosPorcentajes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoPreciosPorcentaje procesopreciosporcentaje : procesopreciosporcentajesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.getProcesoPreciosPorcentajeDescripcion(procesopreciosporcentaje));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosporcentaje.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoPreciosPorcentajes(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosPorcentaje> procesopreciosporcentajesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoPreciosPorcentaje> procesopreciosporcentajesRespaldo=null;
		
		classes=ProcesoPreciosPorcentajeConstantesFunciones.getClassesRelationshipsOfProcesoPreciosPorcentaje(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesopreciosporcentajeLogic.setDatosCliente(this.datosCliente);
		this.procesopreciosporcentajeLogic.setDatosDeep(this.datosDeep);
		this.procesopreciosporcentajeLogic.setIsConDeep(true);
		
		procesopreciosporcentajesRespaldo=this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes();
		
		this.procesopreciosporcentajeLogic.setProcesoPreciosPorcentajes(procesopreciosporcentajesParaReportes);	
		this.procesopreciosporcentajeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesopreciosporcentajesParaReportes=this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes();
		this.procesopreciosporcentajeLogic.setProcesoPreciosPorcentajes(procesopreciosporcentajesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosPorcentajes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPreciosPorcentaje("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoPreciosPorcentaje procesopreciosporcentaje : procesopreciosporcentajesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoPreciosPorcentaje("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoPreciosPorcentajeConstantesFunciones.generarExcelReporteDataProcesoPreciosPorcentaje("NORMAL",row,workbook,procesopreciosporcentaje,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.getProcesoPreciosPorcentajeDescripcion(procesopreciosporcentaje));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoPreciosPorcentaje() throws Exception {		
		this.startProcessProcesoPreciosPorcentaje(true);
	}
	
	public void startProcessProcesoPreciosPorcentaje(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoPreciosPorcentaje ,this.jPanelParametrosReportesProcesoPreciosPorcentaje, this.jScrollPanelDatosProcesoPreciosPorcentaje,this.jPanelPaginacionProcesoPreciosPorcentaje, this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje, this.jPanelAccionesProcesoPreciosPorcentaje,this.jPanelAccionesFormularioProcesoPreciosPorcentaje,this.jmenuBarProcesoPreciosPorcentaje,this.jmenuBarDetalleProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPreciosPorcentaje=this.jTabbedPaneBusquedasProcesoPreciosPorcentaje; 
		
		final JPanel jPanelParametrosReportesProcesoPreciosPorcentaje=this.jPanelParametrosReportesProcesoPreciosPorcentaje;
		//final JScrollPane jScrollPanelDatosProcesoPreciosPorcentaje=this.jScrollPanelDatosProcesoPreciosPorcentaje;
		final JTable jTableDatosProcesoPreciosPorcentaje=this.jTableDatosProcesoPreciosPorcentaje;		
		final JPanel jPanelPaginacionProcesoPreciosPorcentaje=this.jPanelPaginacionProcesoPreciosPorcentaje;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPreciosPorcentaje=this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje;
		final JPanel jPanelAccionesProcesoPreciosPorcentaje=this.jPanelAccionesProcesoPreciosPorcentaje;
		
		JPanel jPanelCamposAuxiliarProcesoPreciosPorcentaje=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			jPanelCamposAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelCamposProcesoPreciosPorcentaje;
			jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelAccionesFormularioProcesoPreciosPorcentaje;
		}
		
		final JPanel jPanelCamposProcesoPreciosPorcentaje=jPanelCamposAuxiliarProcesoPreciosPorcentaje;
		final JPanel jPanelAccionesFormularioProcesoPreciosPorcentaje=jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje;
		
		
		final JMenuBar jmenuBarProcesoPreciosPorcentaje=this.jmenuBarProcesoPreciosPorcentaje;
		final JToolBar jTtoolBarProcesoPreciosPorcentaje=this.jTtoolBarProcesoPreciosPorcentaje;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jmenuBarDetalleProcesoPreciosPorcentaje;
			jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTtoolBarDetalleProcesoPreciosPorcentaje;
		}
		
		final JMenuBar jmenuBarDetalleProcesoPreciosPorcentaje=jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje;
		final JToolBar jTtoolBarDetalleProcesoPreciosPorcentaje=jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPreciosPorcentaje;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPreciosPorcentaje;
			processRunnable.jTableDatos=jTableDatosProcesoPreciosPorcentaje;
			processRunnable.jPanelCampos=jPanelCamposProcesoPreciosPorcentaje;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPreciosPorcentaje;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPreciosPorcentaje;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPreciosPorcentaje;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPreciosPorcentaje;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPreciosPorcentaje;
			processRunnable.jTtoolBar=jTtoolBarProcesoPreciosPorcentaje;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPreciosPorcentaje;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPreciosPorcentaje ,jPanelParametrosReportesProcesoPreciosPorcentaje,jTableDatosProcesoPreciosPorcentaje, /*jScrollPanelDatosProcesoPreciosPorcentaje,*/jPanelCamposProcesoPreciosPorcentaje,jPanelPaginacionProcesoPreciosPorcentaje, /*jScrollPanelDatosEdicionProcesoPreciosPorcentaje,*/ jPanelAccionesProcesoPreciosPorcentaje,jPanelAccionesFormularioProcesoPreciosPorcentaje,jmenuBarProcesoPreciosPorcentaje,jmenuBarDetalleProcesoPreciosPorcentaje,jTtoolBarProcesoPreciosPorcentaje,jTtoolBarDetalleProcesoPreciosPorcentaje);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPreciosPorcentaje ,jPanelParametrosReportesProcesoPreciosPorcentaje, jScrollPanelDatosProcesoPreciosPorcentaje,jPanelPaginacionProcesoPreciosPorcentaje, jScrollPanelDatosEdicionProcesoPreciosPorcentaje, jPanelAccionesProcesoPreciosPorcentaje,jPanelAccionesFormularioProcesoPreciosPorcentaje,jmenuBarProcesoPreciosPorcentaje,jmenuBarDetalleProcesoPreciosPorcentaje,jTtoolBarProcesoPreciosPorcentaje,jTtoolBarDetalleProcesoPreciosPorcentaje);
						
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
	
	public void finishProcessProcesoPreciosPorcentaje() {// throws Exception 
		this.finishProcessProcesoPreciosPorcentaje(true);
	}
	
	public void finishProcessProcesoPreciosPorcentaje(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoPreciosPorcentaje ,this.jPanelParametrosReportesProcesoPreciosPorcentaje, this.jScrollPanelDatosProcesoPreciosPorcentaje,this.jPanelPaginacionProcesoPreciosPorcentaje, this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje, this.jPanelAccionesProcesoPreciosPorcentaje,this.jPanelAccionesFormularioProcesoPreciosPorcentaje,this.jmenuBarProcesoPreciosPorcentaje,this.jmenuBarDetalleProcesoPreciosPorcentaje,this.jTtoolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPreciosPorcentaje=this.jTabbedPaneBusquedasProcesoPreciosPorcentaje; 
		
		final JPanel jPanelParametrosReportesProcesoPreciosPorcentaje=this.jPanelParametrosReportesProcesoPreciosPorcentaje;
		//final JScrollPane jScrollPanelDatosProcesoPreciosPorcentaje=this.jScrollPanelDatosProcesoPreciosPorcentaje;
		final JTable jTableDatosProcesoPreciosPorcentaje=this.jTableDatosProcesoPreciosPorcentaje;		
		final JPanel jPanelPaginacionProcesoPreciosPorcentaje=this.jPanelPaginacionProcesoPreciosPorcentaje;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPreciosPorcentaje=this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje;
		final JPanel jPanelAccionesProcesoPreciosPorcentaje=this.jPanelAccionesProcesoPreciosPorcentaje;
		
		JPanel jPanelCamposAuxiliarProcesoPreciosPorcentaje=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			jPanelCamposAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelCamposProcesoPreciosPorcentaje;
			jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelAccionesFormularioProcesoPreciosPorcentaje;
		}
		
		final JPanel jPanelCamposProcesoPreciosPorcentaje=jPanelCamposAuxiliarProcesoPreciosPorcentaje;
		final JPanel jPanelAccionesFormularioProcesoPreciosPorcentaje=jPanelAccionesFormularioAuxiliarProcesoPreciosPorcentaje;
		
		
		final JMenuBar jmenuBarProcesoPreciosPorcentaje=this.jmenuBarProcesoPreciosPorcentaje;		
		final JToolBar jTtoolBarProcesoPreciosPorcentaje=this.jTtoolBarProcesoPreciosPorcentaje;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jmenuBarDetalleProcesoPreciosPorcentaje;
			jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTtoolBarDetalleProcesoPreciosPorcentaje;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoPreciosPorcentaje=jmenuBarDetalleAuxiliarProcesoPreciosPorcentaje;
		final JToolBar jTtoolBarDetalleProcesoPreciosPorcentaje=jTtoolBarDetalleAuxiliarProcesoPreciosPorcentaje;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPreciosPorcentaje;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPreciosPorcentaje;
			processRunnable.jTableDatos=jTableDatosProcesoPreciosPorcentaje;
			processRunnable.jPanelCampos=jPanelCamposProcesoPreciosPorcentaje;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPreciosPorcentaje;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPreciosPorcentaje;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPreciosPorcentaje;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPreciosPorcentaje;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPreciosPorcentaje;
			processRunnable.jTtoolBar=jTtoolBarProcesoPreciosPorcentaje;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPreciosPorcentaje;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoPreciosPorcentaje ,jPanelParametrosReportesProcesoPreciosPorcentaje, jTableDatosProcesoPreciosPorcentaje,/*jScrollPanelDatosProcesoPreciosPorcentaje,*/jPanelCamposProcesoPreciosPorcentaje,jPanelPaginacionProcesoPreciosPorcentaje, /*jScrollPanelDatosEdicionProcesoPreciosPorcentaje,*/ jPanelAccionesProcesoPreciosPorcentaje,jPanelAccionesFormularioProcesoPreciosPorcentaje,jmenuBarProcesoPreciosPorcentaje,jmenuBarDetalleProcesoPreciosPorcentaje,jTtoolBarProcesoPreciosPorcentaje,jTtoolBarDetalleProcesoPreciosPorcentaje));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoPreciosPorcentaje(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoPreciosPorcentaje(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoPreciosPorcentaje(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoPreciosPorcentaje(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoPreciosPorcentaje,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoPreciosPorcentaje,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoPreciosPorcentaje(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoPreciosPorcentaje,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoPreciosPorcentaje,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesopreciosporcentajeConstantesFunciones.getsFinalQueryProcesoPreciosPorcentaje();
		String  finalQueryPaginacionTodos=this.procesopreciosporcentajeConstantesFunciones.getsFinalQueryProcesoPreciosPorcentaje();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoPreciosPorcentajeConstantesFunciones.getArrayColumnasGlobalesNoProcesoPreciosPorcentaje(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoPreciosPorcentajeConstantesFunciones.getArrayColumnasGlobalesProcesoPreciosPorcentaje(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoPreciosPorcentajeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesopreciosporcentajesEliminados= new ArrayList<ProcesoPreciosPorcentaje>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoPreciosPorcentaje();
		
				///*ProcesoPreciosPorcentajeSessionBean*/this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			
			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
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
					this.iNumeroPaginacion=ProcesoPreciosPorcentajeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoPreciosPorcentajeConstantesFunciones.getClassesForeignKeysOfProcesoPreciosPorcentaje(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesopreciosporcentaje."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesopreciosporcentajesAux= new ArrayList<ProcesoPreciosPorcentaje>();
			
				
			procesopreciosporcentajeLogic.setDatosCliente(this.datosCliente);
			procesopreciosporcentajeLogic.setDatosDeep(this.datosDeep);
			procesopreciosporcentajeLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoPreciosPorcentaje")) {
				this.sDetalleReporte=ProcesoPreciosPorcentajeConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosPorcentaje(id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPreciosPorcentajeConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosPorcentaje(id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPreciosPorcentajeConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosPorcentaje(id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()==null||procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesopreciosporcentajes==null|| procesopreciosporcentajes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosporcentajesAux=new ArrayList<ProcesoPreciosPorcentaje>();
						procesopreciosporcentajesAux.addAll(procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosporcentajesAux=new ArrayList<ProcesoPreciosPorcentaje>();
							procesopreciosporcentajesAux.addAll(procesopreciosporcentajes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPreciosPorcentajeConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosPorcentaje(id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPreciosPorcentajeConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosPorcentaje(id_bodegaBusquedaProcesoPreciosPorcentaje,id_productoBusquedaProcesoPreciosPorcentaje,id_lineaBusquedaProcesoPreciosPorcentaje,id_linea_grupoBusquedaProcesoPreciosPorcentaje,id_linea_categoriaBusquedaProcesoPreciosPorcentaje,id_linea_marcaBusquedaProcesoPreciosPorcentaje);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoPreciosPorcentajes("BusquedaProcesoPreciosPorcentaje",procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoPreciosPorcentajes("BusquedaProcesoPreciosPorcentaje",procesopreciosporcentajes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosporcentajeLogic.setProcesoPreciosPorcentajes(new ArrayList<ProcesoPreciosPorcentaje>());
						procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().addAll(procesopreciosporcentajesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosporcentajes=new ArrayList<ProcesoPreciosPorcentaje>();
							procesopreciosporcentajes.addAll(procesopreciosporcentajesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoPreciosPorcentaje();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoPreciosPorcentaje();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosporcentajes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosporcentajes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoPreciosPorcentaje procesopreciosporcentaje) {
		Boolean permite=true;
		
		if(this.procesopreciosporcentaje.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoPreciosPorcentajeConstantesFunciones.getOrderByListaProcesoPreciosPorcentaje();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoPreciosPorcentajeConstantesFunciones.getOrderByListaProcesoPreciosPorcentaje();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				if(procesopreciosporcentaje.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosporcentajeTotales=procesopreciosporcentaje;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentaje:this.procesopreciosporcentajes) {
				if(procesopreciosporcentaje.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosporcentajeTotales=procesopreciosporcentaje;
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
			this.procesopreciosporcentajeAux=new ProcesoPreciosPorcentaje();
			this.procesopreciosporcentajeAux.setsType(Constantes2.S_TOTALES);
			this.procesopreciosporcentajeAux.setIsNew(false);
			this.procesopreciosporcentajeAux.setIsChanged(false);
			this.procesopreciosporcentajeAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoPreciosPorcentajeConstantesFunciones.TotalizarValoresFilaProcesoPreciosPorcentaje(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes(),this.procesopreciosporcentajeAux);
				
				//this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().add(this.procesopreciosporcentajeAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoPreciosPorcentajeConstantesFunciones.TotalizarValoresFilaProcesoPreciosPorcentaje(this.procesopreciosporcentajes,this.procesopreciosporcentajeAux);
				
				this.procesopreciosporcentajes.add(this.procesopreciosporcentajeAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesopreciosporcentajeTotales=new ProcesoPreciosPorcentaje();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().remove(procesopreciosporcentajeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopreciosporcentajes.remove(procesopreciosporcentajeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesopreciosporcentajeTotales=new ProcesoPreciosPorcentaje();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				if(procesopreciosporcentaje.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosporcentajeTotales=procesopreciosporcentaje;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPreciosPorcentajeConstantesFunciones.TotalizarValoresFilaProcesoPreciosPorcentaje(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes(),procesopreciosporcentajeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosPorcentaje procesopreciosporcentaje:this.procesopreciosporcentajes) {
				if(procesopreciosporcentaje.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosporcentajeTotales=procesopreciosporcentaje;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPreciosPorcentajeConstantesFunciones.TotalizarValoresFilaProcesoPreciosPorcentaje(this.procesopreciosporcentajes,procesopreciosporcentajeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoPreciosPorcentaje";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosPorcentajesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosporcentajeLogic.getProcesoPreciosPorcentajesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoPreciosPorcentaje() {
		this.isPermisoTodoProcesoPreciosPorcentaje=false;
		this.isPermisoNuevoProcesoPreciosPorcentaje=false;
		this.isPermisoActualizarProcesoPreciosPorcentaje=false;
		this.isPermisoActualizarOriginalProcesoPreciosPorcentaje=false;
		this.isPermisoEliminarProcesoPreciosPorcentaje=false;
		this.isPermisoGuardarCambiosProcesoPreciosPorcentaje=false;
		this.isPermisoConsultaProcesoPreciosPorcentaje=true;
		this.isPermisoBusquedaProcesoPreciosPorcentaje=true;
		this.isPermisoReporteProcesoPreciosPorcentaje=true;
		this.isPermisoOrdenProcesoPreciosPorcentaje=false;		
		this.isPermisoPaginacionMedioProcesoPreciosPorcentaje=false;		
		this.isPermisoPaginacionAltoProcesoPreciosPorcentaje=false;		
		this.isPermisoPaginacionTodoProcesoPreciosPorcentaje=false;		
		this.isPermisoCopiarProcesoPreciosPorcentaje=false;		
		this.isPermisoVerFormProcesoPreciosPorcentaje=false;		
		this.isPermisoDuplicarProcesoPreciosPorcentaje=false;
		this.isPermisoOrdenProcesoPreciosPorcentaje=false;
	}
	
	public void setPermisosUsuarioProcesoPreciosPorcentaje(Boolean isPermiso) {
		this.isPermisoTodoProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoNuevoProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoActualizarProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoActualizarOriginalProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoEliminarProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoGuardarCambiosProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoConsultaProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoBusquedaProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoReporteProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoOrdenProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoPaginacionMedioProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoPaginacionAltoProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoPaginacionTodoProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoCopiarProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoVerFormProcesoPreciosPorcentaje=isPermiso;		
		this.isPermisoDuplicarProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoOrdenProcesoPreciosPorcentaje=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoPreciosPorcentaje(Boolean isPermiso) {
		//this.isPermisoTodoProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoNuevoProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoActualizarProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoActualizarOriginalProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoEliminarProcesoPreciosPorcentaje=isPermiso;
		this.isPermisoGuardarCambiosProcesoPreciosPorcentaje=isPermiso;
		//this.isPermisoConsultaProcesoPreciosPorcentaje=isPermiso;
		//this.isPermisoBusquedaProcesoPreciosPorcentaje=isPermiso;
		//this.isPermisoReporteProcesoPreciosPorcentaje=isPermiso;
		//this.isPermisoOrdenProcesoPreciosPorcentaje=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoPreciosPorcentaje=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoPreciosPorcentaje=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoPreciosPorcentaje=isPermiso;		
		//this.isPermisoCopiarProcesoPreciosPorcentaje=isPermiso;		
		//this.isPermisoDuplicarProcesoPreciosPorcentaje=isPermiso;
		//this.isPermisoOrdenProcesoPreciosPorcentaje=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPreciosPorcentajeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoPreciosPorcentajeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPreciosPorcentajeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoPreciosPorcentajeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoPreciosPorcentajeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoPreciosPorcentajeClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoPreciosPorcentaje() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoPreciosPorcentajeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoPreciosPorcentajeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoPreciosPorcentaje=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoPreciosPorcentaje=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoPreciosPorcentaje=this.isPermisoActualizarProcesoPreciosPorcentaje;
			this.isPermisoEliminarProcesoPreciosPorcentaje=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoPreciosPorcentaje=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoPreciosPorcentaje=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoPreciosPorcentaje=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoPreciosPorcentaje=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoPreciosPorcentaje=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPreciosPorcentaje=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoPreciosPorcentaje=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoPreciosPorcentaje=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoPreciosPorcentaje=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoPreciosPorcentaje=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoPreciosPorcentaje=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoPreciosPorcentaje=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPreciosPorcentaje=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoPreciosPorcentaje.setToolTipText(this.jTableDatosProcesoPreciosPorcentaje.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoPreciosPorcentaje(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoPreciosPorcentaje(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoPreciosPorcentaje() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoPreciosPorcentajeListas()throws Exception {
		try	{						
			
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoPreciosPorcentajeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoPreciosPorcentajeJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoPreciosPorcentaje()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {
			if(this.procesopreciosporcentajeSessionBean==null) {
				this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
			}

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.procesopreciosporcentajeSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoPreciosPorcentaje()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoPreciosPorcentaje(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoPreciosPorcentaje()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosPorcentaje();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoPreciosPorcentaje()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosPorcentaje()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoPreciosPorcentaje()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoPreciosPorcentaje()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoPreciosPorcentaje()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoPreciosPorcentaje()throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoPreciosPorcentaje(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoPreciosPorcentaje()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean(); 
		this.procesopreciosporcentajeConstantesFunciones=new ProcesoPreciosPorcentajeConstantesFunciones(); 
		this.procesopreciosporcentajeBean=new ProcesoPreciosPorcentaje();//(this.procesopreciosporcentajeConstantesFunciones); 		
		this.procesopreciosporcentajeReturnGeneral=new ProcesoPreciosPorcentajeParameterReturnGeneral(); 
		
		this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosporcentajeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoPreciosPorcentajeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoPreciosPorcentaje(true);
			
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
			
			this.procesopreciosporcentajeConstantesFunciones=new ProcesoPreciosPorcentajeConstantesFunciones(); 
			this.procesopreciosporcentajeBean=new ProcesoPreciosPorcentaje();//this.procesopreciosporcentajeConstantesFunciones); 			
			this.procesopreciosporcentajeReturnGeneral=new ProcesoPreciosPorcentajeParameterReturnGeneral(); 
		
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Precios Porcentaje Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesopreciosporcentaje=new ProcesoPreciosPorcentaje();
			this.procesopreciosporcentajes = new ArrayList<ProcesoPreciosPorcentaje>();
			this.procesopreciosporcentajesAux = new ArrayList<ProcesoPreciosPorcentaje>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic=new ProcesoPreciosPorcentajeLogic();
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			//this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesopreciosporcentajeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje);	
					}
					
					if(this.jInternalFrameImportacionProcesoPreciosPorcentaje!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPreciosPorcentaje);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoPreciosPorcentaje!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoPreciosPorcentaje);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje);
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setVisible(false);
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje);
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoPreciosPorcentaje!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPreciosPorcentaje);
					this.jInternalFrameImportacionProcesoPreciosPorcentaje.setVisible(false);
					this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoPreciosPorcentaje!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPreciosPorcentaje);
					this.jInternalFrameOrderByProcesoPreciosPorcentaje.setVisible(false);
					this.jInternalFrameOrderByProcesoPreciosPorcentaje.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoPreciosPorcentajeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoPreciosPorcentajeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesopreciosporcentajeReturnGeneral=new ProcesoPreciosPorcentajeParameterReturnGeneral();
			
			this.procesopreciosporcentajeParameterGeneral=new ProcesoPreciosPorcentajeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesopreciosporcentajeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPreciosPorcentajeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPreciosPorcentajeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			
			
			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoPreciosPorcentaje();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoPreciosPorcentaje(false);
			
			this.setPermisosUsuarioProcesoPreciosPorcentaje();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() 
				|| (this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() && this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoPreciosPorcentajeClasesRelacionadas();
			}
			
			if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoPreciosPorcentajeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoPreciosPorcentaje();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoPreciosPorcentaje();
			}
			
			if(!this.isPermisoBusquedaProcesoPreciosPorcentaje) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoPreciosPorcentajeConstantesFunciones.getTiposSeleccionarProcesoPreciosPorcentaje());
				
				this.tiposColumnasSelect=ProcesoPreciosPorcentajeConstantesFunciones.getTiposSeleccionarProcesoPreciosPorcentaje(true);
				
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
			//if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoPreciosPorcentaje();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoPreciosPorcentaje(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoPreciosPorcentaje(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosPorcentaje() ;
			
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
			
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesopreciosporcentajeImplementable= (ProcesoPreciosPorcentajeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPreciosPorcentajeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesopreciosporcentajeImplementableHome= (ProcesoPreciosPorcentajeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPreciosPorcentajeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesopreciosporcentajes= new ArrayList<ProcesoPreciosPorcentaje>();
			this.procesopreciosporcentajesEliminados= new ArrayList<ProcesoPreciosPorcentaje>();
						
			this.isEsNuevoProcesoPreciosPorcentaje=false;
			this.esParaAccionDesdeFormularioProcesoPreciosPorcentaje=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoPreciosPorcentaje(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoPreciosPorcentaje();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoPreciosPorcentajeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoPreciosPorcentaje();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoPreciosPorcentaje();
			}
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoPreciosPorcentaje(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoPreciosPorcentaje: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoPreciosPorcentaje() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoPreciosPorcentaje")) {
				iIndex=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoPreciosPorcentaje();	
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
	
	public void cargarCombosForeignKeyProcesoPreciosPorcentaje(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoPreciosPorcentaje(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoPreciosPorcentaje(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoPreciosPorcentajeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoPreciosPorcentaje();
		
		this.cargarCombosFrameForeignKeyProcesoPreciosPorcentaje();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoPreciosPorcentaje();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoPreciosPorcentaje();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

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

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			
			if(jTableDatosProcesoPreciosPorcentaje.getRowCount()>=1) {
				jTableDatosProcesoPreciosPorcentaje.removeRowSelectionInterval(0, jTableDatosProcesoPreciosPorcentaje.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoPreciosPorcentaje=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoPreciosPorcentaje(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(true);			
			//this.procesopreciosporcentaje=new ProcesoPreciosPorcentaje();
			//this.procesopreciosporcentaje.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje() ;
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosPorcentaje(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesopreciosporcentaje);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);				
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoPreciosPorcentaje: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRows().length;			
			}
			
			procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoPreciosPorcentaje--;			
				//ProcesoPreciosPorcentaje procesopreciosporcentajeAux= new ProcesoPreciosPorcentaje();			
				//procesopreciosporcentajeAux.setId(this.iIdNuevoProcesoPreciosPorcentaje);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoPreciosPorcentaje procesopreciosporcentajeOrigen=new ProcesoPreciosPorcentaje();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeOrigen : procesopreciosporcentajesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesopreciosporcentajeOrigen =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosporcentajeOrigen =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoPreciosPorcentaje();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesopreciosporcentaje.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoPreciosPorcentaje(procesopreciosporcentajeOrigen,this.procesopreciosporcentaje,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().add(this.procesopreciosporcentajeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentajes.add(this.procesopreciosporcentajeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
				
				this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosPorcentaje(), this.getIndiceNuevoProcesoPreciosPorcentaje());
				
				int iLastRow =  this.jTableDatosProcesoPreciosPorcentaje.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPreciosPorcentaje.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPreciosPorcentaje.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();									
		
			ProcesoPreciosPorcentaje procesopreciosporcentajeOrigen=new ProcesoPreciosPorcentaje();
			ProcesoPreciosPorcentaje procesopreciosporcentajeDestino=new ProcesoPreciosPorcentaje();
				
			procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesopreciosporcentajesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoPreciosPorcentaje.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosporcentajeOrigen =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopreciosporcentajeOrigen =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosporcentajeDestino =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopreciosporcentajeDestino =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesopreciosporcentajeOrigen =procesopreciosporcentajesSeleccionados.get(0);
				procesopreciosporcentajeDestino =procesopreciosporcentajesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoPreciosPorcentaje(procesopreciosporcentajeOrigen,procesopreciosporcentajeDestino,true,false);
				
				procesopreciosporcentajeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesopreciosporcentajeDestino,procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesopreciosporcentajeDestino,procesopreciosporcentajes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
				
				//this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosPorcentaje(), this.getIndiceNuevoProcesoPreciosPorcentaje());
				
				int iLastRow =  this.jTableDatosProcesoPreciosPorcentaje.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPreciosPorcentaje.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPreciosPorcentaje.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoPreciosPorcentaje.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(!isVisible);
			this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(!isVisible);
			this.jPanelAccionesProcesoPreciosPorcentaje.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoPreciosPorcentaje();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoPreciosPorcentaje();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoPreciosPorcentaje();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoPreciosPorcentaje();
			
			this.abrirFrameOrderByProcesoPreciosPorcentaje();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoPreciosPorcentaje();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoPreciosPorcentaje(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPreciosPorcentaje);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSize(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.iWidthFormulario,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jContentPaneDetalleProcesoPreciosPorcentaje.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jContentPaneDetalleProcesoPreciosPorcentaje.getWidth(),ProcesoPreciosPorcentajeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jContentPaneDetalleProcesoPreciosPorcentaje.getWidth(),ProcesoPreciosPorcentajeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jContentPaneDetalleProcesoPreciosPorcentaje.getWidth(),ProcesoPreciosPorcentajeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoPreciosPorcentaje() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoPreciosPorcentaje==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoPreciosPorcentaje=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosPorcentaje,false,this);
				} else {
					this.jInternalFrameOrderByProcesoPreciosPorcentaje=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosPorcentaje,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPreciosPorcentaje);
				this.jInternalFrameOrderByProcesoPreciosPorcentaje.setVisible(false);
				this.jInternalFrameOrderByProcesoPreciosPorcentaje.setSelected(false);
				
				this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPreciosPorcentaje"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoPreciosPorcentaje();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoPreciosPorcentaje() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoPreciosPorcentaje==null) {
				
				this.jInternalFrameImportacionProcesoPreciosPorcentaje=new ImportacionJInternalFrame(ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPreciosPorcentaje);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPreciosPorcentaje);
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.setVisible(false);
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSelected(false);


				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPreciosPorcentaje"));
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPreciosPorcentaje"));
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPreciosPorcentaje"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoPreciosPorcentaje() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje==null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje=new ReporteDinamicoJInternalFrame(ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje);
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosPorcentaje"));
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosPorcentaje"));
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosPorcentaje"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosPorcentaje();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoPreciosPorcentaje() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPreciosPorcentaje);
			
	       	this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.dispose();
			//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoPreciosPorcentaje() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoPreciosPorcentaje() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoPreciosPorcentaje.setVisible(true);
	        this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoPreciosPorcentaje() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setVisible(true);
	        this.jInternalFrameOrderByProcesoPreciosPorcentaje.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoPreciosPorcentaje() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoPreciosPorcentaje.setVisible(false);
	        this.jInternalFrameOrderByProcesoPreciosPorcentaje.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoPreciosPorcentaje() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoPreciosPorcentaje() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoPreciosPorcentaje.setVisible(false);
	        this.jInternalFrameImportacionProcesoPreciosPorcentaje.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoPreciosPorcentaje(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoPreciosPorcentaje(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(true);
			//this.isEsNuevoProcesoPreciosPorcentaje=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false) ;
			
			if(procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosPorcentaje(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoPreciosPorcentajeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoPreciosPorcentaje(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(true);
			//this.isEsNuevoProcesoPreciosPorcentaje=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesopreciosporcentaje.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false) ;
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosPorcentaje(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoPreciosPorcentaje(false);
			
			//if(!this.isEsNuevoProcesoPreciosPorcentaje) {								
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				
			}
			
			if(this.permiteMantenimiento(this.procesopreciosporcentaje)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoPreciosPorcentaje=true;
					this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
					this.isEsNuevoProcesoPreciosPorcentaje=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoPreciosPorcentaje=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoPreciosPorcentaje=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(false);
				
				this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(false);
			
												
				
				if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoPreciosPorcentaje();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,procesopreciosporcentajeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesopreciosporcentajeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesopreciosporcentaje.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				this.procesopreciosporcentaje.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				this.procesopreciosporcentaje.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesopreciosporcentaje)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoPreciosPorcentajeModel) this.jTableDatosProcesoPreciosPorcentaje.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoPreciosPorcentaje=true;
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
				this.isEsNuevoProcesoPreciosPorcentaje=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(false);
				
				this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(false);
				
				
				
				if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoPreciosPorcentaje();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoPreciosPorcentaje.getRowCount()>=1) {
				jTableDatosProcesoPreciosPorcentaje.removeRowSelectionInterval(0, jTableDatosProcesoPreciosPorcentaje.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoPreciosPorcentaje(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(false) ;
			
			this.isEsNuevoProcesoPreciosPorcentaje=false;
			
			if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoPreciosPorcentaje();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				
				//SI ES MANUAL
				if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoPreciosPorcentaje--;			
			//ProcesoPreciosPorcentaje procesopreciosporcentajeAux= new ProcesoPreciosPorcentaje();			
			//procesopreciosporcentajeAux.setId(this.iIdNuevoProcesoPreciosPorcentaje);
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoPreciosPorcentaje();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
			
			this.procesopreciosporcentaje.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().add(this.procesopreciosporcentajeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesopreciosporcentajes.add(this.procesopreciosporcentajeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			
			this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosPorcentaje(), this.getIndiceNuevoProcesoPreciosPorcentaje());
			
			int iLastRow =  this.jTableDatosProcesoPreciosPorcentaje.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoPreciosPorcentaje.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoPreciosPorcentaje.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();
			}
			
			//this.abrirFrameTreeProcesoPreciosPorcentaje();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoPreciosPorcentaje.setFileImportacion(this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoPreciosPorcentaje.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoPreciosPorcentaje.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		

		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoPreciosPorcentajeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoPreciosPorcentajeBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoPreciosPorcentajes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProcesoPreciosPorcentaje procesopreciosporcentaje:procesopreciosporcentajesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosporcentaje.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelProcesoPreciosPorcentaje(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoPreciosPorcentaje(procesopreciosporcentajeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPreciosPorcentaje();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoPreciosPorcentaje() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoPreciosPorcentaje.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoPreciosPorcentaje.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoPreciosPorcentaje.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoPreciosPorcentaje.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoPreciosPorcentaje.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoPreciosPorcentaje.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoPreciosPorcentaje.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoPreciosPorcentaje(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoPreciosPorcentaje(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoPreciosPorcentaje(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoPreciosPorcentaje(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosPorcentaje(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoPreciosPorcentaje(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoPreciosPorcentaje() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje();
		
		this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPreciosPorcentaje();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosPorcentaje() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosPorcentaje(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosPorcentaje(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoPreciosPorcentaje.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoPreciosPorcentaje(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosPorcentaje(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosPorcentaje() throws Exception {
		try	{
			if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPreciosPorcentaje();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPreciosPorcentaje() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPreciosPorcentaje() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			
			if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoPreciosPorcentaje.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosPorcentaje();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosPorcentaje() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoPreciosPorcentajeConstantesFunciones.getTiposSeleccionarProcesoPreciosPorcentaje(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoPreciosPorcentajeConstantesFunciones.getTiposSeleccionarProcesoPreciosPorcentaje(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoPreciosPorcentajeConstantesFunciones.getTiposSeleccionarProcesoPreciosPorcentaje(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoPreciosPorcentaje()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_bodegaBusquedaProcesoPreciosPorcentaje=((Bodega)this.jComboBoxid_bodegaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_productoBusquedaProcesoPreciosPorcentaje=((Producto)this.jComboBoxid_productoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_lineaBusquedaProcesoPreciosPorcentaje=((Linea)this.jComboBoxid_lineaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_linea_grupoBusquedaProcesoPreciosPorcentaje=((Linea)this.jComboBoxid_linea_grupoBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProcesoPreciosPorcentaje=((Linea)this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()!=null){this.id_linea_marcaBusquedaProcesoPreciosPorcentaje=((Linea)this.jComboBoxid_linea_marcaBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoPreciosPorcentaje(Boolean esInicializar) throws Exception {				
		if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPreciosPorcentaje();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoPreciosPorcentaje() throws Exception {
		this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoPreciosPorcentaje() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoPreciosPorcentajeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentajeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoPreciosPorcentaje(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesopreciosporcentajes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoPreciosPorcentaje.setModel(new ProcesoPreciosPorcentajeModel(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoPreciosPorcentaje.setModel(new ProcesoPreciosPorcentajeModel(this.procesopreciosporcentajes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoPreciosPorcentaje!=null && this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoPreciosPorcentaje();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,procesopreciosporcentajeConstantesFunciones.resaltarSeleccionarProcesoPreciosPorcentaje,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO,procesopreciosporcentajeConstantesFunciones.resaltarSeleccionarProcesoPreciosPorcentaje,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID));

		if(this.procesopreciosporcentajeConstantesFunciones.mostraridProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltaridProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activaridProcesoPreciosPorcentaje,iSizeTabla,this,true,"idProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltaridProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activaridProcesoPreciosPorcentaje,this,true,"idProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigoProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarcodigoProcesoPreciosPorcentaje,iSizeTabla,this,true,"codigoProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarcodigoProcesoPreciosPorcentaje,this,true,"codigoProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarnombreProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarnombreProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarnombreProcesoPreciosPorcentaje,iSizeTabla,this,true,"nombreProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarnombreProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarnombreProcesoPreciosPorcentaje,this,true,"nombreProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigo_productoProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigo_productoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarcodigo_productoProcesoPreciosPorcentaje,iSizeTabla,this,true,"codigo_productoProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigo_productoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarcodigo_productoProcesoPreciosPorcentaje,this,true,"codigo_productoProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarnombre_productoProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarnombre_productoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarnombre_productoProcesoPreciosPorcentaje,iSizeTabla,this,true,"nombre_productoProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarnombre_productoProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarnombre_productoProcesoPreciosPorcentaje,this,true,"nombre_productoProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarprecioProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarprecioProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarprecioProcesoPreciosPorcentaje,iSizeTabla,this,true,"precioProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarprecioProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarprecioProcesoPreciosPorcentaje,this,true,"precioProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE));

		if(this.procesopreciosporcentajeConstantesFunciones.mostrarporcentajeProcesoPreciosPorcentaje && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarporcentajeProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarporcentajeProcesoPreciosPorcentaje,iSizeTabla,this,true,"porcentajeProcesoPreciosPorcentaje","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosporcentajeConstantesFunciones.resaltarporcentajeProcesoPreciosPorcentaje,this.procesopreciosporcentajeConstantesFunciones.activarporcentajeProcesoPreciosPorcentaje,this,true,"porcentajeProcesoPreciosPorcentaje","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosPorcentajePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPreciosPorcentaje.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPreciosPorcentaje.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoPreciosPorcentaje.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoPreciosPorcentaje.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoPreciosPorcentaje.moveColumn(this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoPreciosPorcentaje.moveColumn(this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoPreciosPorcentaje.moveColumn(this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoPreciosPorcentaje.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoPreciosPorcentaje.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoPreciosPorcentaje,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoPreciosPorcentaje.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoPreciosPorcentaje.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoPreciosPorcentaje.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesopreciosporcentajes.size()-1;
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
		//this.jTableDatosProcesoPreciosPorcentaje.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoPreciosPorcentaje.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoPreciosPorcentaje();
			
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
				
				//this.isEsNuevoProcesoPreciosPorcentaje=false;
					
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
				if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPreciosPorcentaje.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesopreciosporcentaje.getsType().equals("DUPLICADO")
				   || this.procesopreciosporcentaje.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoPreciosPorcentaje=true;
				
				} else {
					this.isEsNuevoProcesoPreciosPorcentaje=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
					if(this.procesopreciosporcentaje.getId()>=0 && !this.procesopreciosporcentaje.getIsNew()) {						
						this.isEsNuevoProcesoPreciosPorcentaje=false;
						
					} else {
						this.isEsNuevoProcesoPreciosPorcentaje=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoPreciosPorcentaje(esRelaciones);						
				
				this.seleccionarProcesoPreciosPorcentaje(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesopreciosporcentaje.getId()<0) {
					this.isEsNuevoProcesoPreciosPorcentaje=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoPreciosPorcentaje(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoPreciosPorcentaje(evt,rowIndex);
				}	
				
				if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoPreciosPorcentaje: " + this.dDif); 
					}
				}								
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoPreciosPorcentaje(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesopreciosporcentaje)) {
					if(this.procesopreciosporcentaje.getId()>0) {
						this.procesopreciosporcentaje.setIsDeleted(true);
						
						this.procesopreciosporcentajesEliminados.add(this.procesopreciosporcentaje);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().remove(this.procesopreciosporcentaje);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentajes.remove(this.procesopreciosporcentaje);				
					}
					
					
					((ProcesoPreciosPorcentajeModel) this.jTableDatosProcesoPreciosPorcentaje.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoPreciosPorcentaje(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoPreciosPorcentaje) {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPreciosPorcentaje.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoPreciosPorcentaje(procesopreciosporcentaje,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(procesopreciosporcentaje);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoPreciosPorcentaje(procesopreciosporcentaje,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosPorcentaje(procesopreciosporcentaje);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoPreciosPorcentaje procesopreciosporcentajeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesopreciosporcentajeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoPreciosPorcentaje procesopreciosporcentajeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesopreciosporcentajeLocal=this.procesopreciosporcentaje;
			} else {
				procesopreciosporcentajeLocal=this.procesopreciosporcentajeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesopreciosporcentajeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoPreciosPorcentaje(procesopreciosporcentajeLocal,true);
					
					if(procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesopreciosporcentajeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesopreciosporcentajeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(procesopreciosporcentaje,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(procesopreciosporcentaje);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(procesopreciosporcentaje,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.getText()==null || this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.getText()=="" || this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setText("0");
			}

			if(conColumnasBase) {procesopreciosporcentaje.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelIdProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setcodigo(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigoProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setnombre(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombreProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setcodigo_producto(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelcodigo_productoProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setnombre_producto(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelnombre_productoProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelprecioProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosporcentaje.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelporcentajeProcesoPreciosPorcentaje,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentajeBean,ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentajeOrigen,ProcesoPreciosPorcentaje procesopreciosporcentaje,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getId()!=null && !procesopreciosporcentajeOrigen.getId().equals(0L))) {procesopreciosporcentaje.setId(procesopreciosporcentajeOrigen.getId());}}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getcodigo()!=null && !procesopreciosporcentajeOrigen.getcodigo().equals(""))) {procesopreciosporcentaje.setcodigo(procesopreciosporcentajeOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getnombre()!=null && !procesopreciosporcentajeOrigen.getnombre().equals(""))) {procesopreciosporcentaje.setnombre(procesopreciosporcentajeOrigen.getnombre());}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getcodigo_producto()!=null && !procesopreciosporcentajeOrigen.getcodigo_producto().equals(""))) {procesopreciosporcentaje.setcodigo_producto(procesopreciosporcentajeOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getnombre_producto()!=null && !procesopreciosporcentajeOrigen.getnombre_producto().equals(""))) {procesopreciosporcentaje.setnombre_producto(procesopreciosporcentajeOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getprecio()!=null && !procesopreciosporcentajeOrigen.getprecio().equals(0.0))) {procesopreciosporcentaje.setprecio(procesopreciosporcentajeOrigen.getprecio());}
			if(conDefault || (!conDefault && procesopreciosporcentajeOrigen.getporcentaje()!=null && !procesopreciosporcentajeOrigen.getporcentaje().equals(0.0))) {procesopreciosporcentaje.setporcentaje(procesopreciosporcentajeOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setText(procesopreciosporcentaje.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPreciosPorcentaje(ProcesoPreciosPorcentajeBean procesopreciosporcentajeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setText(procesopreciosporcentajeBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoPreciosPorcentaje(ProcesoPreciosPorcentajeParameterReturnGeneral procesopreciosporcentajeReturnGeneral,ProcesoPreciosPorcentajeBean procesopreciosporcentajeBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoPreciosPorcentaje procesopreciosporcentajeLocal=new ProcesoPreciosPorcentaje();
			
			procesopreciosporcentajeLocal=procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getId()!=null && !procesopreciosporcentajeLocal.getId().equals(0L))) {procesopreciosporcentajeBean.setId(procesopreciosporcentajeLocal.getId());}}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getcodigo()!=null && !procesopreciosporcentajeLocal.getcodigo().equals(""))) {procesopreciosporcentajeBean.setcodigo(procesopreciosporcentajeLocal.getcodigo());}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getnombre()!=null && !procesopreciosporcentajeLocal.getnombre().equals(""))) {procesopreciosporcentajeBean.setnombre(procesopreciosporcentajeLocal.getnombre());}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getcodigo_producto()!=null && !procesopreciosporcentajeLocal.getcodigo_producto().equals(""))) {procesopreciosporcentajeBean.setcodigo_producto(procesopreciosporcentajeLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getnombre_producto()!=null && !procesopreciosporcentajeLocal.getnombre_producto().equals(""))) {procesopreciosporcentajeBean.setnombre_producto(procesopreciosporcentajeLocal.getnombre_producto());}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getprecio()!=null && !procesopreciosporcentajeLocal.getprecio().equals(0.0))) {procesopreciosporcentajeBean.setprecio(procesopreciosporcentajeLocal.getprecio());}
			if(conDefault || (!conDefault && procesopreciosporcentajeLocal.getporcentaje()!=null && !procesopreciosporcentajeLocal.getporcentaje().equals(0.0))) {procesopreciosporcentajeBean.setporcentaje(procesopreciosporcentajeLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoPreciosPorcentajeGenerico(Long idProcesoPreciosPorcentajeSeleccionado,JComboBox jComboBoxProcesoPreciosPorcentaje,List<ProcesoPreciosPorcentaje> procesopreciosporcentajesLocal)throws Exception {
		try {
			ProcesoPreciosPorcentaje  procesopreciosporcentajeTemp=null;

			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesLocal) {
				if(procesopreciosporcentajeAux.getId()!=null && procesopreciosporcentajeAux.getId().equals(idProcesoPreciosPorcentajeSeleccionado)) {
					procesopreciosporcentajeTemp=procesopreciosporcentajeAux;
					break;
				}
			}

			jComboBoxProcesoPreciosPorcentaje.setSelectedItem(procesopreciosporcentajeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoPreciosPorcentajeGenerico(JComboBox jComboBoxProcesoPreciosPorcentaje,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPreciosPorcentaje.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoPreciosPorcentaje.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPreciosPorcentaje.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoPreciosPorcentaje.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosporcentaje=(ProcesoPreciosPorcentaje) procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopreciosporcentaje =(ProcesoPreciosPorcentaje) procesopreciosporcentajes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!procesopreciosporcentaje.getIsNew() && !procesopreciosporcentaje.getIsChanged() && !procesopreciosporcentaje.getIsDeleted()) {
				sDescripcion=procesopreciosporcentaje.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosporcentaje.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoPreciosPorcentaje procesopreciosporcentajeRow=new ProcesoPreciosPorcentaje();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosporcentajeRow=(ProcesoPreciosPorcentaje) procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopreciosporcentajeRow=(ProcesoPreciosPorcentaje) procesopreciosporcentajes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));			
			this.jButtonDuplicarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje && this.isPermisoDuplicarProcesoPreciosPorcentaje));			
			this.jButtonCopiarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje && this.isPermisoCopiarProcesoPreciosPorcentaje));
			this.jButtonVerFormProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje && this.isPermisoVerFormProcesoPreciosPorcentaje));
			
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));			
			
			this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));			
			this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje && this.isPermisoEliminarProcesoPreciosPorcentaje));
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje);							
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));						
			this.jButtonDuplicarToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje && this.isPermisoDuplicarProcesoPreciosPorcentaje));						
			this.jButtonCopiarToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje && this.isPermisoCopiarProcesoPreciosPorcentaje));			
			this.jButtonVerFormToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje && this.isPermisoVerFormProcesoPreciosPorcentaje));			
			this.jButtonAbrirOrderByToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));
			this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));			
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje  && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje && this.isPermisoEliminarProcesoPreciosPorcentaje));
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarToolBarProcesoPreciosPorcentaje.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje);				
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));			
			this.jMenuItemDuplicarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje && this.isPermisoDuplicarProcesoPreciosPorcentaje));			
			this.jMenuItemCopiarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje && this.isPermisoCopiarProcesoPreciosPorcentaje));			
			this.jMenuItemVerFormProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje && this.isPermisoVerFormProcesoPreciosPorcentaje));			
			this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));			
			//this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));
			this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));			
			//this.jMenuItemDetalleMostrarOcultarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje && this.isPermisoOrdenProcesoPreciosPorcentaje));			
			this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje));			
			this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje && this.isPermisoNuevoProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));									
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemModificarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemActualizarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje && this.isPermisoActualizarProcesoPreciosPorcentaje));	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemEliminarProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje && this.isPermisoEliminarProcesoPreciosPorcentaje));
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemCancelarProcesoPreciosPorcentaje.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje);				
			}
			
			this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));						
			this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=this.jButtonNuevoProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje=this.jButtonDuplicarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje=this.jButtonCopiarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje=this.jButtonVerFormProcesoPreciosPorcentaje.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoPreciosPorcentaje=this.jButtonAbrirOrderByProcesoPreciosPorcentaje.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=this.jButtonModificarProcesoPreciosPorcentaje.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=this.jButtonNuevoToolBarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarToolBarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarToolBarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarToolBarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarToolBarProcesoPreciosPorcentaje.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=this.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=this.jMenuItemNuevoProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemModificarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemActualizarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemEliminarProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemCancelarProcesoPreciosPorcentaje.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoPreciosPorcentaje(Boolean esInicializar) {
		if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
				//if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPreciosPorcentaje();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoPreciosPorcentaje(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoPreciosPorcentaje() {
		this.jButtonNuevoProcesoPreciosPorcentaje.setVisible(this.isPermisoNuevoProcesoPreciosPorcentaje);			
		this.jButtonDuplicarProcesoPreciosPorcentaje.setVisible(this.isPermisoDuplicarProcesoPreciosPorcentaje);			
		this.jButtonCopiarProcesoPreciosPorcentaje.setVisible(this.isPermisoCopiarProcesoPreciosPorcentaje);			
		this.jButtonVerFormProcesoPreciosPorcentaje.setVisible(this.isPermisoVerFormProcesoPreciosPorcentaje);			
		
		this.jButtonAbrirOrderByProcesoPreciosPorcentaje.setVisible(this.isPermisoOrdenProcesoPreciosPorcentaje);					
		
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.setVisible(this.isPermisoNuevoProcesoPreciosPorcentaje);			
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarProcesoPreciosPorcentaje.setVisible(this.isPermisoActualizarProcesoPreciosPorcentaje);	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.setVisible(this.isPermisoActualizarProcesoPreciosPorcentaje);	
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.setVisible(this.isPermisoEliminarProcesoPreciosPorcentaje);
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje);						
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.setVisible(this.isPermisoGuardarCambiosProcesoPreciosPorcentaje);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setVisible(this.isPermisoActualizarProcesoPreciosPorcentaje);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPreciosPorcentaje() {
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarProcesoPreciosPorcentaje.setVisible(this.isPermisoActualizarProcesoPreciosPorcentaje);	
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.setVisible(this.isPermisoActualizarProcesoPreciosPorcentaje);	
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.setVisible(this.isPermisoEliminarProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje);							
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje && this.isPermisoGuardarCambiosProcesoPreciosPorcentaje));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoPreciosPorcentaje() {
		if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoPreciosPorcentaje();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoPreciosPorcentaje() {
	}
	
	public void jTableDatosProcesoPreciosPorcentajeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoPreciosPorcentaje(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesopreciosporcentaje.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.procesopreciosporcentaje.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.procesopreciosporcentaje.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesopreciosporcentaje.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesopreciosporcentaje.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.procesopreciosporcentaje.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.procesopreciosporcentaje.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.procesopreciosporcentaje.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProcesoPreciosPorcentajeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosPorcentaje(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosPorcentaje.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosPorcentaje.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosporcentajeLogic.getConnexion());

				if(this.procesopreciosporcentaje.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.procesopreciosporcentaje.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosPorcentaje=(TitledBorder)this.jScrollPanelDatosProcesoPreciosPorcentaje.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProcesoPreciosPorcentaje.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.procesopreciosporcentaje.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesopreciosporcentaje.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesopreciosporcentaje.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.procesopreciosporcentaje.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.procesopreciosporcentaje.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.procesopreciosporcentaje.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProcesoPreciosPorcentajeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.getprocesopreciosporcentaje(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosporcentaje==null) {
						this.procesopreciosporcentaje = new ProcesoPreciosPorcentaje();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);
				}

				if(this.procesopreciosporcentaje.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.procesopreciosporcentaje.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesBusquedaProcesoPreciosPorcentaje();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdBodega();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdLinea();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdLineaCategoria();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdLineaGrupo();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdLineaMarca();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdProducto();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoPreciosPorcentajeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);

			this.getProcesoPreciosPorcentajesFK_IdSucursal();

			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);

			//if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosporcentajeLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoPreciosPorcentaje() {
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.dispose();
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.dispose();
			this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje=null;
		}
		
		if(this.jInternalFrameImportacionProcesoPreciosPorcentaje!=null) {
			this.jInternalFrameImportacionProcesoPreciosPorcentaje.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoPreciosPorcentaje.dispose();
			this.jInternalFrameImportacionProcesoPreciosPorcentaje=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoPreciosPorcentaje();
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoPreciosPorcentaje")) {
				jButtonDuplicarProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoPreciosPorcentaje")) {
				jButtonCopiarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoPreciosPorcentaje")) {
				jButtonVerFormProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoPreciosPorcentaje")) {
				jButtonDuplicarProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoPreciosPorcentaje")) {
				jButtonDuplicarProcesoPreciosPorcentajeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoPreciosPorcentaje")) {
				jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoPreciosPorcentaje")) {
				jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoPreciosPorcentaje")) {
				jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoPreciosPorcentaje")) {
				jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoPreciosPorcentaje")) {
				jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoPreciosPorcentaje")) {
				jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoPreciosPorcentaje")) {
				jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoPreciosPorcentaje")) {
				jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoPreciosPorcentaje")) {
				jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoPreciosPorcentaje")) {
				jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoPreciosPorcentaje")) {
				jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoPreciosPorcentaje")) {
				jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoPreciosPorcentaje")) {
				jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoPreciosPorcentaje")) {
				jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoPreciosPorcentaje")) {
				jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoPreciosPorcentaje")) {
				jButtonMostrarOcultarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoPreciosPorcentaje")) {
				jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoPreciosPorcentaje")) {
				jButtonCopiarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoPreciosPorcentaje")) {
				jButtonVerFormProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoPreciosPorcentaje")) {
				jButtonCopiarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoPreciosPorcentaje")) {
				jButtonVerFormProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoPreciosPorcentaje")) {
				jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoPreciosPorcentaje")) {
				jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoPreciosPorcentaje")) {
				jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoPreciosPorcentaje")) {
				jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoPreciosPorcentaje")) {
				jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoPreciosPorcentaje")) {
				jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoPreciosPorcentaje")) {
				jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoPreciosPorcentaje")) {
				jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoPreciosPorcentaje")) {
				jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoPreciosPorcentaje") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje")) {
				jButtonAbrirOrderByProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoPreciosPorcentaje") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoPreciosPorcentaje")) {
				jButtonMostrarOcultarProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoPreciosPorcentaje")) {
				jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoPreciosPorcentaje")) {
				jButtonCerrarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoPreciosPorcentaje")) {
				jButtonGenerarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoPreciosPorcentaje")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoPreciosPorcentaje")) {
				jButtonCerrarImportacionProcesoPreciosPorcentajeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoPreciosPorcentaje")) {
				
				jButtonGenerarImportacionProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoPreciosPorcentaje")) {
				
				jButtonAbrirImportacionProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoPreciosPorcentaje")) {
				jComboBoxTiposAccionesProcesoPreciosPorcentajeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoPreciosPorcentaje")) {
				jComboBoxTiposRelacionesProcesoPreciosPorcentajeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoPreciosPorcentaje")) {
				jComboBoxTiposAccionesProcesoPreciosPorcentajeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoPreciosPorcentaje")) {
				
				jComboBoxTiposSeleccionarProcesoPreciosPorcentajeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoPreciosPorcentaje")) {
				jTextFieldValorCampoGeneralProcesoPreciosPorcentajeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoPreciosPorcentaje")) {
				jButtonAbrirOrderByProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoPreciosPorcentaje")) {
				jButtonAbrirOrderByProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoPreciosPorcentaje")) {
				jButtonCerrarOrderByProcesoPreciosPorcentajeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonidProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_bodegaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_bodegaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_productoProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_empresaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_empresaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_sucursalProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_sucursalProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_lineaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_lineaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtoncodigoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonnombreProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtoncodigo_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonnombre_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonprecioProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonporcentajeProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje")) {
				this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentajeActionPerformed(evt);
			}
			
			;
			
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoPreciosPorcentaje();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoPreciosPorcentaje procesopreciosporcentajeLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesopreciosporcentajeLocal=this.procesopreciosporcentaje;
			} else {
				procesopreciosporcentajeLocal=this.procesopreciosporcentajeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
							
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
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
			
			


			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
								
						
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
								
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
							
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
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
			
			


			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
								
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoPreciosPorcentaje")) {
					jCheckBoxSeleccionarTodosProcesoPreciosPorcentajeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoPreciosPorcentaje")) {
					jCheckBoxSeleccionadosProcesoPreciosPorcentajeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoPreciosPorcentaje")) {
					
				}
				
				


				
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
												
				
				


				
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
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
			
			


			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosporcentaje);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosporcentaje);
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
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
				
				


				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosPorcentaje.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosPorcentaje.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosPorcentajeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosporcentajeAnterior =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoPreciosPorcentaje")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoPreciosPorcentajeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoPreciosPorcentaje.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesopreciosporcentaje =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesopreciosporcentaje);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoPreciosPorcentaje")) {
				
				}
				
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoPreciosPorcentaje")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoPreciosPorcentaje.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoPreciosPorcentaje")) {
			
			}
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoPreciosPorcentaje();
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoPreciosPorcentaje")) {
				jButtonDuplicarProcesoPreciosPorcentajeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoPreciosPorcentaje")) {
				jButtonCopiarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoPreciosPorcentaje")) {
				jButtonVerFormProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoPreciosPorcentaje")) {
				jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoPreciosPorcentaje")) {
				jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoPreciosPorcentaje")) {
				jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoPreciosPorcentaje")) {
				jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoPreciosPorcentaje")) {
				jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoPreciosPorcentaje")) {
				jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPreciosPorcentaje")) {
				jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoPreciosPorcentaje")) {
				jButtonAbrirOrderByProcesoPreciosPorcentajeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoPreciosPorcentaje")) {
				jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoPreciosPorcentaje")) {
				jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoPreciosPorcentaje")) {
				jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonidProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_bodegaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_bodegaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_productoProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_empresaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_empresaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_sucursalProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_sucursalProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_lineaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_lineaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosPorcentajeUpdate")) {
				this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtoncodigoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonnombreProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtoncodigo_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonnombre_productoProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonprecioProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProcesoPreciosPorcentajeBusqueda")) {
				this.jButtonporcentajeProcesoPreciosPorcentajeBusquedaActionPerformed(evt);
			}
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoPreciosPorcentaje();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoPreciosPorcentaje")) {
				closingInternalFrameProcesoPreciosPorcentaje();
				
			} else if(sTipo.equals("jButtonCancelarProcesoPreciosPorcentaje")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoPreciosPorcentaje = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoPreciosPorcentajeBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPreciosPorcentajeBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPreciosPorcentaje.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoPreciosPorcentajeActionPerformed(null);
			}
			
			ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopreciosporcentaje,new Object(),this.procesopreciosporcentajeParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoPreciosPorcentaje(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoPreciosPorcentaje(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoPreciosPorcentaje(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesopreciosporcentaje)) {
			if(!esControlTabla) {
				if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);			
				}
				
				if(this.procesopreciosporcentajeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral,this.procesopreciosporcentajeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesopreciosporcentajeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPreciosPorcentaje(classes,this.procesopreciosporcentajeReturnGeneral,this.procesopreciosporcentajeBean,false);
					}
						
					if(this.procesopreciosporcentajeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje());	
					}
						
					if(this.procesopreciosporcentajeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje(),classes);//this.procesopreciosporcentajeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosPorcentaje(this.procesopreciosporcentaje,classes);//this.procesopreciosporcentajeBean);									
				}
			
				if(ProcesoPreciosPorcentajeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosPorcentaje(this.procesopreciosporcentaje,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosPorcentaje(this.procesopreciosporcentaje);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesopreciosporcentajeAnterior!=null) {
						this.procesopreciosporcentaje=this.procesopreciosporcentajeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesopreciosporcentajeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje(),procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentaje(),this.procesopreciosporcentajes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoPreciosPorcentaje.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoPreciosPorcentaje.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoPreciosPorcentaje();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoPreciosPorcentaje() throws Exception {
		
		ProcesoPreciosPorcentajeModel procesopreciosporcentajeModel=(ProcesoPreciosPorcentajeModel)this.jTableDatosProcesoPreciosPorcentaje.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosporcentajeModel.procesopreciosporcentajes=this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesopreciosporcentajeModel.procesopreciosporcentajes=this.procesopreciosporcentajes;
		}
		
		
		((ProcesoPreciosPorcentajeModel) this.jTableDatosProcesoPreciosPorcentaje.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoPreciosPorcentaje() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesopreciosporcentajeAnterior(),this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesopreciosporcentajeAnterior(),this.procesopreciosporcentajes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoPreciosPorcentaje();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
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
										
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopreciosporcentaje,new Object(),generalEntityParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoPreciosPorcentajeConstantesFunciones.getClassesRelationshipsOfProcesoPreciosPorcentaje(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoPreciosPorcentajeConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoPreciosPorcentaje(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoPreciosPorcentaje(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopreciosporcentaje,new Object(),generalEntityParameterGeneral,this.procesopreciosporcentajeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoPreciosPorcentaje(ProcesoPreciosPorcentajeBean procesopreciosporcentajeBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPreciosPorcentaje(ArrayList<Classe> classes,ProcesoPreciosPorcentajeReturnGeneral procesopreciosporcentajeReturnGeneral,ProcesoPreciosPorcentajeBean procesopreciosporcentajeBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesopreciosporcentaje)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje = new ProcesoPreciosPorcentajeDetalleFormJInternalFrame(jDesktopPane,this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones(),this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setVisible(false);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.procesopreciosporcentajeLogic=this.procesopreciosporcentajeLogic;
		
		this.cargarCombosFrameForeignKeyProcesoPreciosPorcentaje("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPreciosPorcentaje();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPreciosPorcentaje();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoPreciosPorcentaje("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoPreciosPorcentaje();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPreciosPorcentaje"));
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ModificarProcesoPreciosPorcentaje"));

		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPreciosPorcentaje"));
					
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemModificarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPreciosPorcentaje"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPreciosPorcentaje"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPreciosPorcentaje"));
						
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemActualizarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPreciosPorcentaje"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"EliminarProcesoPreciosPorcentaje"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPreciosPorcentaje"));
								
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemEliminarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPreciosPorcentaje"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CancelarProcesoPreciosPorcentaje"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPreciosPorcentaje"));
					
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemCancelarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPreciosPorcentaje"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemDetalleCerrarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPreciosPorcentaje"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosPorcentaje"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosPorcentaje"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPreciosPorcentaje"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonidProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombreProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonprecioProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoPreciosPorcentajeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPreciosPorcentaje"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoPreciosPorcentaje"));
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPreciosPorcentaje"));
		}
		
		this.jTableDatosProcesoPreciosPorcentaje.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoPreciosPorcentaje"));
		
		this.jTableDatosProcesoPreciosPorcentaje.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoPreciosPorcentaje"));
		
		this.jButtonNuevoProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"NuevoProcesoPreciosPorcentaje"));
		
		this.jButtonDuplicarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"DuplicarProcesoPreciosPorcentaje"));
		
		this.jButtonCopiarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"CopiarProcesoPreciosPorcentaje"));
		
		this.jButtonVerFormProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"VerFormProcesoPreciosPorcentaje"));
		
		
		this.jButtonNuevoToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoPreciosPorcentaje"));
			
		this.jButtonDuplicarToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemNuevoProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoPreciosPorcentaje"));
			
		this.jMenuItemDuplicarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoPreciosPorcentaje"));		
		
		
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoPreciosPorcentaje"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoPreciosPorcentaje"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ModificarProcesoPreciosPorcentaje"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonModificarToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPreciosPorcentaje"));
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemModificarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPreciosPorcentaje"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPreciosPorcentaje"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonActualizarToolBarProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPreciosPorcentaje"));
				
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemActualizarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPreciosPorcentaje"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"EliminarProcesoPreciosPorcentaje"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonEliminarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPreciosPorcentaje"));
						
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemEliminarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPreciosPorcentaje"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CancelarProcesoPreciosPorcentaje"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonCancelarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPreciosPorcentaje"));
			
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemCancelarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPreciosPorcentaje"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoPreciosPorcentaje"));		
		
		
		this.jButtonCerrarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CerrarProcesoPreciosPorcentaje"));
		
		
		this.jButtonCerrarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemCerrarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoPreciosPorcentaje"));
			
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jMenuItemDetalleCerrarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPreciosPorcentaje"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoPreciosPorcentaje"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosPorcentaje"));
		}
		
		this.jButtonCopiarToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoPreciosPorcentaje"));
			
		this.jButtonVerFormToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoPreciosPorcentaje"));
		
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoPreciosPorcentaje"));
			
		this.jMenuItemCopiarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoPreciosPorcentaje"));		
		
		this.jMenuItemVerFormProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoPreciosPorcentaje"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPreciosPorcentaje"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPreciosPorcentaje"));		
		
		
		
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoPreciosPorcentaje"));
					
		this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoPreciosPorcentaje"));
		
		this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoPreciosPorcentaje"));		
		
		
		
		this.jButtonAnterioresProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"AnterioresProcesoPreciosPorcentaje"));
		
		
		this.jButtonAnterioresToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoPreciosPorcentaje"));
		
		this.jMenuItemAnterioresProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoPreciosPorcentaje"));		
		
		
		this.jButtonSiguientesProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"SiguientesProcesoPreciosPorcentaje"));
		
		
		this.jButtonSiguientesToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemSiguientesProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoPreciosPorcentaje"));
			
		this.jMenuItemAbrirOrderByProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoPreciosPorcentaje"));
			
		this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoPreciosPorcentaje"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje"));
			
		this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoPreciosPorcentaje"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoPreciosPorcentaje"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoPreciosPorcentaje"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoPreciosPorcentaje"));

		this.jCheckBoxSeleccionadosProcesoPreciosPorcentaje.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoPreciosPorcentaje"));
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPreciosPorcentaje"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoPreciosPorcentaje"));
			
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoPreciosPorcentaje"));
					
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoPreciosPorcentaje"));
			
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoPreciosPorcentaje"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonidProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombreProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonprecioProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoPreciosPorcentajeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosPorcentaje"));
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosPorcentaje"));
				this.jInternalFrameReporteDinamicoProcesoPreciosPorcentaje.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosPorcentaje"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosPorcentaje"));				
			//this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosPorcentaje"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosPorcentaje"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPreciosPorcentaje"));
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPreciosPorcentaje"));
				this.jInternalFrameImportacionProcesoPreciosPorcentaje.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPreciosPorcentaje"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoPreciosPorcentaje"));
			
			this.jButtonAbrirOrderByToolBarProcesoPreciosPorcentaje.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoPreciosPorcentaje"));			
			
			if(this.jInternalFrameOrderByProcesoPreciosPorcentaje!=null) {
				this.jInternalFrameOrderByProcesoPreciosPorcentaje.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPreciosPorcentaje"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTabbedPaneRelacionesProcesoPreciosPorcentaje.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPreciosPorcentaje"));
		
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
            		closingInternalFrameProcesoPreciosPorcentaje();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoPreciosPorcentaje = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoPreciosPorcentajeBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPreciosPorcentajeBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPreciosPorcentaje.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoPreciosPorcentajeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoPreciosPorcentaje.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoPreciosPorcentajeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoPreciosPorcentaje.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoPreciosPorcentaje.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPreciosPorcentajeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoPreciosPorcentaje";
		inputMap = this.jButtonModificarProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoPreciosPorcentaje";
		inputMap = this.jButtonActualizarProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoPreciosPorcentaje";
		inputMap = this.jButtonEliminarProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCancelarProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCerrarProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoPreciosPorcentaje";
		inputMap = this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonGuardarCambiosProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoPreciosPorcentaje.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoPreciosPorcentajeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoPreciosPorcentajeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoPreciosPorcentajeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoPreciosPorcentajeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonidProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosPorcentajeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombreProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonprecioProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosPorcentajeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoPreciosPorcentajeBusqueda"));
		
		
		this.jButtonBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoPreciosPorcentaje.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoPreciosPorcentajeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoPreciosPorcentajeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoPreciosPorcentaje.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoPreciosPorcentaje(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
					procesopreciosporcentajeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajes) {
					procesopreciosporcentajeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoPreciosPorcentajeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
						procesopreciosporcentajeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajes) {
						procesopreciosporcentajeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPreciosPorcentaje.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPreciosPorcentaje.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoPreciosPorcentajeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoPreciosPorcentaje.getSelectedRows();
			
			ProcesoPreciosPorcentaje procesopreciosporcentajeLocal=new ProcesoPreciosPorcentaje();
			
			//this.seleccionarTodosProcesoPreciosPorcentaje(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesopreciosporcentajeLocal =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes().toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesopreciosporcentajeLocal =(ProcesoPreciosPorcentaje) this.procesopreciosporcentajes.toArray()[this.jTableDatosProcesoPreciosPorcentaje.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesopreciosporcentajeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
						procesopreciosporcentajeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajes) {
						procesopreciosporcentajeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPreciosPorcentaje.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPreciosPorcentaje.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosPorcentaje,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoPreciosPorcentajeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoPreciosPorcentajeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoPreciosPorcentajeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoPreciosPorcentaje.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
				
						if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopreciosporcentajeAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesopreciosporcentajeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesopreciosporcentajeAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesopreciosporcentajeAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesopreciosporcentajeAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							procesopreciosporcentajeAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajes) {
					
						if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopreciosporcentajeAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesopreciosporcentajeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesopreciosporcentajeAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesopreciosporcentajeAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesopreciosporcentajeAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							procesopreciosporcentajeAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoPreciosPorcentajeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoPreciosPorcentaje=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoPreciosPorcentaje) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoPreciosPorcentaje(conSplash);
				
					this.generarReporteProcesoPreciosPorcentajesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoPreciosPorcentajesSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPreciosPorcentajesSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPreciosPorcentajesSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPreciosPorcentaje();
				
				this.exportarProcesoPreciosPorcentajesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoPreciosPorcentajes();
				//this.importarProcesoPreciosPorcentajes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPreciosPorcentaje();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoPreciosPorcentajesSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Precios Porcentaje", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoPreciosPorcentaje();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoPreciosPorcentaje)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoPreciosPorcentaje(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoPreciosPorcentajeBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoPreciosPorcentaje) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoPreciosPorcentaje(conSplash);
					
						//this.actualizarParametrosGeneralProcesoPreciosPorcentaje();
						
						this.generarReporteProcesoAccionProcesoPreciosPorcentajesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Precios PorcentajeS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Precios Porcentaje", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoPreciosPorcentaje();
				
						this.actualizarParametrosGeneralProcesoPreciosPorcentaje();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesopreciosporcentajeReturnGeneral=procesopreciosporcentajeLogic.procesarAccionProcesoPreciosPorcentajesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes(),this.procesopreciosporcentajeParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoPreciosPorcentajeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoPreciosPorcentaje();
					
					ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoPreciosPorcentajeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoPreciosPorcentaje(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoPreciosPorcentajeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoPreciosPorcentaje();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
			ProcesoPreciosPorcentaje procesopreciosporcentaje=new ProcesoPreciosPorcentaje();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje.getSelectedItem();
			
			
			
			
			procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesopreciosporcentajesSeleccionados.size()==1) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
					procesopreciosporcentaje=procesopreciosporcentajeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoPreciosPorcentaje();
			
      		//this.finishProcessProcesoPreciosPorcentaje(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoPreciosPorcentajeReturnGeneral() throws Exception {
		if(this.procesopreciosporcentajeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesopreciosporcentajeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesopreciosporcentajeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesopreciosporcentajeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesopreciosporcentajeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesopreciosporcentajeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
		}
		
		if(this.procesopreciosporcentajeReturnGeneral.getConRetornoLista() || this.procesopreciosporcentajeReturnGeneral.getConRetornoObjeto()) {
			if(this.procesopreciosporcentajeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesopreciosporcentajeLogic.setProcesoPreciosPorcentajes(this.procesopreciosporcentajeReturnGeneral.getProcesoPreciosPorcentajes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoPreciosPorcentaje(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoPreciosPorcentaje() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoPreciosPorcentaje> getProcesoPreciosPorcentajesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoPreciosPorcentaje) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes()) {
					if(procesopreciosporcentajeAux.getIsSelected()) {
						procesopreciosporcentajesSeleccionados.add(procesopreciosporcentajeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:this.procesopreciosporcentajes) {
					if(procesopreciosporcentajeAux.getIsSelected()) {
						procesopreciosporcentajesSeleccionados.add(procesopreciosporcentajeAux);				
					}
				}
			}
			
			if(procesopreciosporcentajesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesopreciosporcentajesSeleccionados.addAll(this.procesopreciosporcentajeLogic.getProcesoPreciosPorcentajes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesopreciosporcentajesSeleccionados.addAll(this.procesopreciosporcentajes);				
					}
				}
			}
		} else {
			procesopreciosporcentajesSeleccionados.add(this.procesopreciosporcentaje);
		}
		
		return procesopreciosporcentajesSeleccionados;
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
	
	public void generarReporteProcesoPreciosPorcentajesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoPreciosPorcentajesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoPreciosPorcentajesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPreciosPorcentajesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPreciosPorcentajesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Precios Porcentaje",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoPreciosPorcentajesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoPreciosPorcentaje();
		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoPreciosPorcentaje();
		
		
		//this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados ,procesopreciosporcentajeImplementable,procesopreciosporcentajeImplementableHome);
	}
	
	public void mostrarImportacionProcesoPreciosPorcentajes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoPreciosPorcentaje();
		
		this.abrirFrameImportacionProcesoPreciosPorcentaje();		
		
			
		//this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados ,procesopreciosporcentajeImplementable,procesopreciosporcentajeImplementableHome);
	}
	
	public void importarProcesoPreciosPorcentajes() throws Exception {		
	
	}
	
	public void exportarProcesoPreciosPorcentajesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoPreciosPorcentajesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoPreciosPorcentajesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoPreciosPorcentajesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Precios Porcentaje",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoPreciosPorcentaje(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoPreciosPorcentaje(procesopreciosporcentajeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesopreciosporcentajeAux.setsDetalleGeneralEntityReporte(procesopreciosporcentajeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoPreciosPorcentaje(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesopreciosporcentaje.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosporcentaje.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoPreciosPorcentajes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoPreciosPorcentaje(row);				
				iRow++;
			}				
			
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoPreciosPorcentaje(procesopreciosporcentajeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoPreciosPorcentajesSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();		
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosporcentaje.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesopreciosporcentajes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesopreciosporcentaje");
			//elementRoot.appendChild(element);
		
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
				element = document.createElement("procesopreciosporcentaje");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoPreciosPorcentaje(procesopreciosporcentajeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Porcentaje",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoPreciosPorcentaje(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosporcentaje.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlProcesoPreciosPorcentaje(ProcesoPreciosPorcentaje procesopreciosporcentaje,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesopreciosporcentaje.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesopreciosporcentaje.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(procesopreciosporcentaje.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementcodigo = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesopreciosporcentaje.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesopreciosporcentaje.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_producto = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(procesopreciosporcentaje.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre_producto = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(procesopreciosporcentaje.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementprecio = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(procesopreciosporcentaje.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementporcentaje = document.createElement(ProcesoPreciosPorcentajeConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(procesopreciosporcentaje.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoProcesoPreciosPorcentajesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados=new ArrayList<ProcesoPreciosPorcentaje>();
		
		procesopreciosporcentajesSeleccionados=this.getProcesoPreciosPorcentajesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoPreciosPorcentaje(procesopreciosporcentajesSeleccionados);
		
		this.generarReporteProcesoPreciosPorcentajes("Todos",procesopreciosporcentajesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoPreciosPorcentaje(ArrayList<ProcesoPreciosPorcentaje> procesopreciosporcentajesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoPreciosPorcentaje procesopreciosporcentajeAux:procesopreciosporcentajesSeleccionados) {
				procesopreciosporcentajeAux.setsDetalleGeneralEntityReporte(procesopreciosporcentajeAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					procesopreciosporcentajeAux.setsDescripcionGeneralEntityReporte1(procesopreciosporcentajeAux.getnombre_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoPreciosPorcentaje(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=true;
		} else {
			this.actualizarEstadoPanelsProcesoPreciosPorcentaje(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoPreciosPorcentaje=false;
			//this.isVisibilidadCeldaVerFormProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaDuplicarProcesoPreciosPorcentaje=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			if(!procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;												
			}
			
			this.jButtonCerrarProcesoPreciosPorcentaje.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
		}
		
		if(!this.permiteMantenimiento(this.procesopreciosporcentaje)) {
			this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoPreciosPorcentaje=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosPorcentaje=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoPreciosPorcentaje=false;
		//this.isVisibilidadCeldaModificarProcesoPreciosPorcentaje=true;
		this.isVisibilidadCeldaActualizarProcesoPreciosPorcentaje=false;
		this.isVisibilidadCeldaEliminarProcesoPreciosPorcentaje=false;
		//this.isVisibilidadCeldaCancelarProcesoPreciosPorcentaje=true;			
		this.isVisibilidadCeldaGuardarProcesoPreciosPorcentaje=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPreciosPorcentaje() {
	}
	
	public void actualizarEstadoPanelsProcesoPreciosPorcentaje(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosPorcentaje!=null) {
				this.jScrollPanelDatosProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosPorcentaje!=null) {
				this.jPanelPaginacionProcesoPreciosPorcentaje.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
					this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosPorcentaje!=null) {
				this.jPanelParametrosReportesProcesoPreciosPorcentaje.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaBodega;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaProducto;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaLinea;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProcesoPreciosPorcentaje=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProcesoPreciosPorcentaje) {this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoPreciosPorcentaje(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoPreciosPorcentaje() {
		this.updateBorderResaltarBusquedasFormularioProcesoPreciosPorcentaje();
		this.updateVisibilidadBusquedasFormularioProcesoPreciosPorcentaje();
		this.updateHabilitarBusquedasFormularioProcesoPreciosPorcentaje();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoPreciosPorcentaje() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponents().length>0) {
	

		if(this.procesopreciosporcentajeConstantesFunciones.resaltarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje!=null) {
			index= this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.indexOfComponent(this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponent(index);
				jPanel.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoPreciosPorcentaje() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.indexOfComponent(this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			if(!this.procesopreciosporcentajeConstantesFunciones.mostrarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje && index>-1) {
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoPreciosPorcentaje() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.indexOfComponent(this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
				this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setEnabledAt(index,this.procesopreciosporcentajeConstantesFunciones.activarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoPreciosPorcentaje(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoPreciosPorcentaje")) {
			index= this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.indexOfComponent(this.jPanelBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);

			this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosPorcentaje.getComponent(index);

			this.procesopreciosporcentajeConstantesFunciones.setResaltarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje(resaltar);

			jPanel.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarBusquedaProcesoPreciosPorcentajeProcesoPreciosPorcentaje);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoPreciosPorcentaje.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoPreciosPorcentaje() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoPreciosPorcentaje();
		this.updateVisibilidadResaltarControlesFormularioProcesoPreciosPorcentaje();
		this.updateHabilitarResaltarControlesFormularioProcesoPreciosPorcentaje();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoPreciosPorcentaje() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesopreciosporcentajeConstantesFunciones.resaltaridProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltaridProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_bodegaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_bodegaProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_productoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_productoProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_empresaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_empresaProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_sucursalProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_sucursalProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_lineaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_lineaProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_grupoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_grupoProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_categoriaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_categoriaProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_marcaProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarid_linea_marcaProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigoProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarnombreProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarnombreProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigo_productoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarcodigo_productoProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarnombre_productoProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarnombre_productoProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarprecioProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarprecioProcesoPreciosPorcentaje);}
		if(this.procesopreciosporcentajeConstantesFunciones.resaltarporcentajeProcesoPreciosPorcentaje!=null && this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setBorder(this.procesopreciosporcentajeConstantesFunciones.resaltarporcentajeProcesoPreciosPorcentaje);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoPreciosPorcentaje() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
	
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostraridProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelidProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostraridProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_bodegaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_bodegaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_bodegaProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_productoProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_empresaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_empresaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_empresaProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_sucursalProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_sucursalProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_sucursalProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_lineaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_lineaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_lineaProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_grupoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_linea_grupoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_grupoProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_categoriaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_linea_categoriaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_categoriaProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_marcaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelid_linea_marcaProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarid_linea_marcaProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelcodigoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigoProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarnombreProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelnombreProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarnombreProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigo_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelcodigo_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarcodigo_productoProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarnombre_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelnombre_productoProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarnombre_productoProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarprecioProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelprecioProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarprecioProcesoPreciosPorcentaje);
		//this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarporcentajeProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jPanelporcentajeProcesoPreciosPorcentaje.setVisible(this.procesopreciosporcentajeConstantesFunciones.mostrarporcentajeProcesoPreciosPorcentaje);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoPreciosPorcentaje() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosPorcentaje!=null) {
	
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jLabelidProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activaridProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_bodegaProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_bodegaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_productoProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_empresaProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_empresaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_sucursalProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_sucursalProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_lineaProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_lineaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_linea_grupoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_linea_categoriaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarid_linea_marcaProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreacodigoProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarcodigoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombreProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarnombreProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldcodigo_productoProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarcodigo_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextAreanombre_productoProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarnombre_productoProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldprecioProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarprecioProcesoPreciosPorcentaje);
		this.jInternalFrameDetalleFormProcesoPreciosPorcentaje.jTextFieldporcentajeProcesoPreciosPorcentaje.setEnabled(this.procesopreciosporcentajeConstantesFunciones.activarporcentajeProcesoPreciosPorcentaje);
		}
	}
	
		
}