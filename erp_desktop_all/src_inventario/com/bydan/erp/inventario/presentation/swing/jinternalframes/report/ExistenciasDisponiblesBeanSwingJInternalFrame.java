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

//import com.bydan.erp.inventario.util.ExistenciasDisponiblesConstantesFunciones;
import com.bydan.erp.inventario.util.report.ExistenciasDisponiblesParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ExistenciasDisponiblesParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ExistenciasDisponiblesBean;
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
public class ExistenciasDisponiblesBeanSwingJInternalFrame extends ExistenciasDisponiblesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ExistenciasDisponiblesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ExistenciasDisponibles> existenciasdisponiblesValidator = new ClassValidator<ExistenciasDisponibles>(ExistenciasDisponibles.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ExistenciasDisponibles existenciasdisponibles;	
	public ExistenciasDisponibles existenciasdisponiblesAux;
	public ExistenciasDisponibles existenciasdisponiblesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ExistenciasDisponibles existenciasdisponiblesTotales;
	public Long idExistenciasDisponiblesActual;
	public Long iIdNuevoExistenciasDisponibles=0L;
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
	
	public Boolean isPermisoTodoExistenciasDisponibles;
	public Boolean isPermisoNuevoExistenciasDisponibles;
	public Boolean isPermisoActualizarExistenciasDisponibles;
	public Boolean isPermisoActualizarOriginalExistenciasDisponibles;
	public Boolean isPermisoEliminarExistenciasDisponibles;
	public Boolean isPermisoGuardarCambiosExistenciasDisponibles;
	public Boolean isPermisoConsultaExistenciasDisponibles;
	public Boolean isPermisoBusquedaExistenciasDisponibles;
	public Boolean isPermisoReporteExistenciasDisponibles;
	public Boolean isPermisoPaginacionMedioExistenciasDisponibles;
	public Boolean isPermisoPaginacionAltoExistenciasDisponibles;
	public Boolean isPermisoPaginacionTodoExistenciasDisponibles;
	public Boolean isPermisoCopiarExistenciasDisponibles;
	public Boolean isPermisoVerFormExistenciasDisponibles;
	public Boolean isPermisoDuplicarExistenciasDisponibles;
	public Boolean isPermisoOrdenExistenciasDisponibles;
	
	
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
	
	public ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesReturnGeneral;
	public ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoExistenciasDisponibles=false;
	public Boolean esParaAccionDesdeFormularioExistenciasDisponibles=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ExistenciasDisponiblesSessionBeanAdditional existenciasdisponiblesSessionBeanAdditional=null;
	
	public ExistenciasDisponiblesSessionBeanAdditional getExistenciasDisponiblesSessionBeanAdditional() {
		return this.existenciasdisponiblesSessionBeanAdditional;
	}
	
	public void setExistenciasDisponiblesSessionBeanAdditional(ExistenciasDisponiblesSessionBeanAdditional existenciasdisponiblesSessionBeanAdditional) {
		try {
			this.existenciasdisponiblesSessionBeanAdditional=existenciasdisponiblesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ExistenciasDisponiblesBeanSwingJInternalFrameAdditional existenciasdisponiblesBeanSwingJInternalFrameAdditional=null;
	//public class ExistenciasDisponiblesBeanSwingJInternalFrame
	
	public ExistenciasDisponiblesBeanSwingJInternalFrameAdditional getExistenciasDisponiblesBeanSwingJInternalFrameAdditional() {
		return this.existenciasdisponiblesBeanSwingJInternalFrameAdditional;
	}
	
	public void setExistenciasDisponiblesBeanSwingJInternalFrameAdditional(ExistenciasDisponiblesBeanSwingJInternalFrameAdditional existenciasdisponiblesBeanSwingJInternalFrameAdditional) {
		try {
			this.existenciasdisponiblesBeanSwingJInternalFrameAdditional=existenciasdisponiblesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ExistenciasDisponiblesLogic existenciasdisponiblesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ExistenciasDisponibles existenciasdisponiblesBean;
	public ExistenciasDisponiblesConstantesFunciones existenciasdisponiblesConstantesFunciones;
	//public ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesReturnGeneral;
	
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
	
	
	//public List<ExistenciasDisponibles> existenciasdisponibless;	
	//public List<ExistenciasDisponibles> existenciasdisponiblessEliminados;
	//public List<ExistenciasDisponibles> existenciasdisponiblessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaDuplicarExistenciasDisponibles=true;
	public Boolean isVisibilidadCeldaCopiarExistenciasDisponibles=true;
	public Boolean isVisibilidadCeldaVerFormExistenciasDisponibles=true;
	public Boolean isVisibilidadCeldaOrdenExistenciasDisponibles=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaModificarExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaActualizarExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaEliminarExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaCancelarExistenciasDisponibles=false;
	public Boolean isVisibilidadCeldaGuardarExistenciasDisponibles=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;	
	
	
	public Boolean isVisibilidadBusquedaExistenciasDisponibles=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoExistenciasDisponibles() {
		return this.iIdNuevoExistenciasDisponibles;
	}

	public void setiIdNuevoExistenciasDisponibles(Long iIdNuevoExistenciasDisponibles) {
		this.iIdNuevoExistenciasDisponibles = iIdNuevoExistenciasDisponibles;
	}
	
	public Long getidExistenciasDisponiblesActual() {
		return this.idExistenciasDisponiblesActual;
	}

	public void setidExistenciasDisponiblesActual(Long idExistenciasDisponiblesActual) {
		this.idExistenciasDisponiblesActual = idExistenciasDisponiblesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ExistenciasDisponibles getexistenciasdisponibles() {
		return this.existenciasdisponibles;
	}

	public void setexistenciasdisponibles(ExistenciasDisponibles existenciasdisponibles) {
		this.existenciasdisponibles = existenciasdisponibles;
	}
	
	public ExistenciasDisponibles getexistenciasdisponiblesAux() {
		return this.existenciasdisponiblesAux;
	}

	public void setexistenciasdisponiblesAux(ExistenciasDisponibles existenciasdisponiblesAux) {
		this.existenciasdisponiblesAux = existenciasdisponiblesAux;
	}				
	
	public ExistenciasDisponibles getexistenciasdisponiblesAnterior() {
		return this.existenciasdisponiblesAnterior;
	}

	public void setexistenciasdisponiblesAnterior(ExistenciasDisponibles existenciasdisponiblesAnterior) {
		this.existenciasdisponiblesAnterior = existenciasdisponiblesAnterior;
	}	
	
	public ExistenciasDisponibles getexistenciasdisponiblesTotales() {
		return this.existenciasdisponiblesTotales;
	}

	public void setexistenciasdisponiblesTotales(ExistenciasDisponibles existenciasdisponiblesTotales) {
		this.existenciasdisponiblesTotales = existenciasdisponiblesTotales;
	}	
	
	public ExistenciasDisponibles getexistenciasdisponiblesBean() {
		return this.existenciasdisponiblesBean;
	}

	public void setexistenciasdisponiblesBean(ExistenciasDisponibles existenciasdisponiblesBean) {
		this.existenciasdisponiblesBean = existenciasdisponiblesBean;
	}	
	
	public ExistenciasDisponiblesParameterReturnGeneral getexistenciasdisponiblesReturnGeneral() {
		return this.existenciasdisponiblesReturnGeneral;
	}

	public void setexistenciasdisponiblesReturnGeneral(ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesReturnGeneral) {
		this.existenciasdisponiblesReturnGeneral = existenciasdisponiblesReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaExistenciasDisponibles=-1L;

	public Long getid_bodegaBusquedaExistenciasDisponibles() {
		return this.id_bodegaBusquedaExistenciasDisponibles;
	}

	public void setid_bodegaBusquedaExistenciasDisponibles(Long id_bodegaBusquedaExistenciasDisponibles) {
		this.id_bodegaBusquedaExistenciasDisponibles = id_bodegaBusquedaExistenciasDisponibles;
	}

;
	public Long id_productoBusquedaExistenciasDisponibles=-1L;

	public Long getid_productoBusquedaExistenciasDisponibles() {
		return this.id_productoBusquedaExistenciasDisponibles;
	}

	public void setid_productoBusquedaExistenciasDisponibles(Long id_productoBusquedaExistenciasDisponibles) {
		this.id_productoBusquedaExistenciasDisponibles = id_productoBusquedaExistenciasDisponibles;
	}

;
	public Long id_lineaBusquedaExistenciasDisponibles=-1L;

	public Long getid_lineaBusquedaExistenciasDisponibles() {
		return this.id_lineaBusquedaExistenciasDisponibles;
	}

	public void setid_lineaBusquedaExistenciasDisponibles(Long id_lineaBusquedaExistenciasDisponibles) {
		this.id_lineaBusquedaExistenciasDisponibles = id_lineaBusquedaExistenciasDisponibles;
	}

;
	public Long id_linea_grupoBusquedaExistenciasDisponibles=-1L;

	public Long getid_linea_grupoBusquedaExistenciasDisponibles() {
		return this.id_linea_grupoBusquedaExistenciasDisponibles;
	}

	public void setid_linea_grupoBusquedaExistenciasDisponibles(Long id_linea_grupoBusquedaExistenciasDisponibles) {
		this.id_linea_grupoBusquedaExistenciasDisponibles = id_linea_grupoBusquedaExistenciasDisponibles;
	}

;
	public Long id_linea_categoriaBusquedaExistenciasDisponibles=-1L;

	public Long getid_linea_categoriaBusquedaExistenciasDisponibles() {
		return this.id_linea_categoriaBusquedaExistenciasDisponibles;
	}

	public void setid_linea_categoriaBusquedaExistenciasDisponibles(Long id_linea_categoriaBusquedaExistenciasDisponibles) {
		this.id_linea_categoriaBusquedaExistenciasDisponibles = id_linea_categoriaBusquedaExistenciasDisponibles;
	}

;
	public Long id_linea_marcaBusquedaExistenciasDisponibles=-1L;

	public Long getid_linea_marcaBusquedaExistenciasDisponibles() {
		return this.id_linea_marcaBusquedaExistenciasDisponibles;
	}

	public void setid_linea_marcaBusquedaExistenciasDisponibles(Long id_linea_marcaBusquedaExistenciasDisponibles) {
		this.id_linea_marcaBusquedaExistenciasDisponibles = id_linea_marcaBusquedaExistenciasDisponibles;
	}

;
	public Date fecha_ultima_venta_hastaBusquedaExistenciasDisponibles=new Date();

	public Date getfecha_ultima_venta_hastaBusquedaExistenciasDisponibles() {
		return this.fecha_ultima_venta_hastaBusquedaExistenciasDisponibles;
	}

	public void setfecha_ultima_venta_hastaBusquedaExistenciasDisponibles(Date fecha_ultima_venta_hastaBusquedaExistenciasDisponibles) {
		this.fecha_ultima_venta_hastaBusquedaExistenciasDisponibles = fecha_ultima_venta_hastaBusquedaExistenciasDisponibles;
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
	
	
	public ExistenciasDisponiblesLogic getExistenciasDisponiblesLogic()	{		
		return existenciasdisponiblesLogic;
	}

	public void setExistenciasDisponiblesLogic(ExistenciasDisponiblesLogic existenciasdisponiblesLogic) {
		this.existenciasdisponiblesLogic = existenciasdisponiblesLogic;
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
	
	public Boolean getIsEsNuevoExistenciasDisponibles() {
		return isEsNuevoExistenciasDisponibles;
	}

	public void setIsEsNuevoExistenciasDisponibles(Boolean isEsNuevoExistenciasDisponibles) {
		this.isEsNuevoExistenciasDisponibles = isEsNuevoExistenciasDisponibles;
	}

	public Boolean getEsParaAccionDesdeFormularioExistenciasDisponibles() {
		return esParaAccionDesdeFormularioExistenciasDisponibles;
	}
	
	public void setEsParaAccionDesdeFormularioExistenciasDisponibles(Boolean esParaAccionDesdeFormularioExistenciasDisponibles) {
		this.esParaAccionDesdeFormularioExistenciasDisponibles = esParaAccionDesdeFormularioExistenciasDisponibles;
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidBodegaActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidProductoActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidEmpresaActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidSucursalActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidLineaActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidLineaGrupoActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidLineaCategoriaActual());
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

			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(existenciasdisponiblesSessionBean.getlidLineaMarcaActual());
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaExistenciasDisponibles.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_bodegaExistenciasDisponiblesGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaExistenciasDisponiblesGenerico!=null && jComboBoxid_bodegaExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_bodegaExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoExistenciasDisponibles.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_productoExistenciasDisponiblesGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoExistenciasDisponiblesGenerico!=null && jComboBoxid_productoExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_productoExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaExistenciasDisponibles.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_empresaExistenciasDisponiblesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaExistenciasDisponiblesGenerico!=null && jComboBoxid_empresaExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_empresaExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalExistenciasDisponibles.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_sucursalExistenciasDisponiblesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalExistenciasDisponiblesGenerico!=null && jComboBoxid_sucursalExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaExistenciasDisponibles.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_lineaExistenciasDisponiblesGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaExistenciasDisponiblesGenerico!=null && jComboBoxid_lineaExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_lineaExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_grupoExistenciasDisponiblesGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoExistenciasDisponiblesGenerico!=null && jComboBoxid_linea_grupoExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico!=null && jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.existenciasdisponibles!=null) {
						this.existenciasdisponibles.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
						jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
							//jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaExistenciasDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_marcaExistenciasDisponiblesGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaExistenciasDisponiblesGenerico!=null && jComboBoxid_linea_marcaExistenciasDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaExistenciasDisponiblesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_bodegaExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaExistenciasDisponiblesGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				existenciasdisponibles.setid_bodega(bodegaAux.getId());
				existenciasdisponibles.setbodega_descripcion(ExistenciasDisponiblesConstantesFunciones.getBodegaDescripcion(bodegaAux));
				existenciasdisponibles.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_productoExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoExistenciasDisponiblesGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				existenciasdisponibles.setid_producto(productoAux.getId());
				existenciasdisponibles.setproducto_descripcion(ExistenciasDisponiblesConstantesFunciones.getProductoDescripcion(productoAux));
				existenciasdisponibles.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_empresaExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaExistenciasDisponiblesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				existenciasdisponibles.setid_empresa(empresaAux.getId());
				existenciasdisponibles.setempresa_descripcion(ExistenciasDisponiblesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				existenciasdisponibles.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_sucursalExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalExistenciasDisponiblesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				existenciasdisponibles.setid_sucursal(sucursalAux.getId());
				existenciasdisponibles.setsucursal_descripcion(ExistenciasDisponiblesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				existenciasdisponibles.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_lineaExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaExistenciasDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciasdisponibles.setid_linea(lineaAux.getId());
				existenciasdisponibles.setlinea_descripcion(ExistenciasDisponiblesConstantesFunciones.getLineaDescripcion(lineaAux));
				existenciasdisponibles.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_linea_grupoExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoExistenciasDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciasdisponibles.setid_linea_grupo(lineaAux.getId());
				existenciasdisponibles.setlineagrupo_descripcion(ExistenciasDisponiblesConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				existenciasdisponibles.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciasdisponibles.setid_linea_categoria(lineaAux.getId());
				existenciasdisponibles.setlineacategoria_descripcion(ExistenciasDisponiblesConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				existenciasdisponibles.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ExistenciasDisponibles existenciasdisponibles,JComboBox jComboBoxid_linea_marcaExistenciasDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaExistenciasDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaExistenciasDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciasdisponibles.setid_linea_marca(lineaAux.getId());
				existenciasdisponibles.setlineamarca_descripcion(ExistenciasDisponiblesConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				existenciasdisponibles.setLineaMarca(lineaAux);			}
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(bodega);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(producto);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(linea);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(lineagrupo);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(lineacategoria);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { 
					}

					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.addItem(lineamarca);
							}
						}

						if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesExistenciasDisponibles() throws Exception {
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
		
	public ExistenciasDisponiblesParameterReturnGeneral getExistenciasDisponiblesParameterGeneral() {
		return this.existenciasdisponiblesParameterGeneral;
	}
	
	public void setExistenciasDisponiblesParameterGeneral(ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesParameterGeneral) {
		this.existenciasdisponiblesParameterGeneral = existenciasdisponiblesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoExistenciasDisponibles() {
		return isPermisoTodoExistenciasDisponibles;
	}

	public void setIsPermisoTodoExistenciasDisponibles(Boolean isPermisoTodoExistenciasDisponibles) {
		this.isPermisoTodoExistenciasDisponibles = isPermisoTodoExistenciasDisponibles;
	}

	public Boolean getIsPermisoNuevoExistenciasDisponibles() {
		return isPermisoNuevoExistenciasDisponibles;
	}

	public void setIsPermisoNuevoExistenciasDisponibles(Boolean isPermisoNuevoExistenciasDisponibles) {
		this.isPermisoNuevoExistenciasDisponibles = isPermisoNuevoExistenciasDisponibles;
	}

	public Boolean getIsPermisoActualizarExistenciasDisponibles() {
		return isPermisoActualizarExistenciasDisponibles;
	}

	public void setIsPermisoActualizarExistenciasDisponibles(Boolean isPermisoActualizarExistenciasDisponibles) {
		this.isPermisoActualizarExistenciasDisponibles = isPermisoActualizarExistenciasDisponibles;
	}

	public Boolean getIsPermisoEliminarExistenciasDisponibles() {
		return isPermisoEliminarExistenciasDisponibles;
	}

	public void setIsPermisoEliminarExistenciasDisponibles(Boolean isPermisoEliminarExistenciasDisponibles) {
		this.isPermisoEliminarExistenciasDisponibles = isPermisoEliminarExistenciasDisponibles;
	}

	public Boolean getIsPermisoGuardarCambiosExistenciasDisponibles() {
		return isPermisoGuardarCambiosExistenciasDisponibles;
	}

	public void setIsPermisoGuardarCambiosExistenciasDisponibles(Boolean isPermisoGuardarCambiosExistenciasDisponibles) {
		this.isPermisoGuardarCambiosExistenciasDisponibles = isPermisoGuardarCambiosExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoConsultaExistenciasDisponibles() {
		return isPermisoConsultaExistenciasDisponibles;
	}

	public void setIsPermisoConsultaExistenciasDisponibles(Boolean isPermisoConsultaExistenciasDisponibles) {
		this.isPermisoConsultaExistenciasDisponibles = isPermisoConsultaExistenciasDisponibles;
	}

	public Boolean getIsPermisoBusquedaExistenciasDisponibles() {
		return isPermisoBusquedaExistenciasDisponibles;
	}

	public void setIsPermisoBusquedaExistenciasDisponibles(Boolean isPermisoBusquedaExistenciasDisponibles) {
		this.isPermisoBusquedaExistenciasDisponibles = isPermisoBusquedaExistenciasDisponibles;
	}

	public Boolean getIsPermisoReporteExistenciasDisponibles() {
		return isPermisoReporteExistenciasDisponibles;
	}

	public void setIsPermisoReporteExistenciasDisponibles(Boolean isPermisoReporteExistenciasDisponibles) {
		this.isPermisoReporteExistenciasDisponibles = isPermisoReporteExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionMedioExistenciasDisponibles() {
		return isPermisoPaginacionMedioExistenciasDisponibles;
	}

	public void setIsPermisoPaginacionMedioExistenciasDisponibles(Boolean isPermisoPaginacionMedioExistenciasDisponibles) {
		this.isPermisoPaginacionMedioExistenciasDisponibles = isPermisoPaginacionMedioExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionTodoExistenciasDisponibles() {
		return isPermisoPaginacionTodoExistenciasDisponibles;
	}

	public void setIsPermisoPaginacionTodoExistenciasDisponibles(Boolean isPermisoPaginacionTodoExistenciasDisponibles) {
		this.isPermisoPaginacionTodoExistenciasDisponibles = isPermisoPaginacionTodoExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionAltoExistenciasDisponibles() {
		return isPermisoPaginacionAltoExistenciasDisponibles;
	}

	public void setIsPermisoPaginacionAltoExistenciasDisponibles(Boolean isPermisoPaginacionAltoExistenciasDisponibles) {
		this.isPermisoPaginacionAltoExistenciasDisponibles = isPermisoPaginacionAltoExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoCopiarExistenciasDisponibles() {
		return isPermisoCopiarExistenciasDisponibles;
	}

	public void setIsPermisoCopiarExistenciasDisponibles(Boolean isPermisoCopiarExistenciasDisponibles) {
		this.isPermisoCopiarExistenciasDisponibles = isPermisoCopiarExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoVerFormExistenciasDisponibles() {
		return isPermisoVerFormExistenciasDisponibles;
	}

	public void setIsPermisoVerFormExistenciasDisponibles(Boolean isPermisoVerFormExistenciasDisponibles) {
		this.isPermisoVerFormExistenciasDisponibles = isPermisoVerFormExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoDuplicarExistenciasDisponibles() {
		return isPermisoDuplicarExistenciasDisponibles;
	}

	public void setIsPermisoDuplicarExistenciasDisponibles(Boolean isPermisoDuplicarExistenciasDisponibles) {
		this.isPermisoDuplicarExistenciasDisponibles = isPermisoDuplicarExistenciasDisponibles;
	}
	
	public Boolean getIsPermisoOrdenExistenciasDisponibles() {
		return isPermisoOrdenExistenciasDisponibles;
	}

	public void setIsPermisoOrdenExistenciasDisponibles(Boolean isPermisoOrdenExistenciasDisponibles) {
		this.isPermisoOrdenExistenciasDisponibles = isPermisoOrdenExistenciasDisponibles;
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
	
	public Boolean getIsVisibilidadCeldaNuevoExistenciasDisponibles() {
		return isVisibilidadCeldaNuevoExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaNuevoExistenciasDisponibles(Boolean isVisibilidadCeldaNuevoExistenciasDisponibles) {
		this.isVisibilidadCeldaNuevoExistenciasDisponibles = isVisibilidadCeldaNuevoExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarExistenciasDisponibles() {
		return isVisibilidadCeldaDuplicarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaDuplicarExistenciasDisponibles(Boolean isVisibilidadCeldaDuplicarExistenciasDisponibles) {
		this.isVisibilidadCeldaDuplicarExistenciasDisponibles = isVisibilidadCeldaDuplicarExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarExistenciasDisponibles() {
		return isVisibilidadCeldaCopiarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaCopiarExistenciasDisponibles(Boolean isVisibilidadCeldaCopiarExistenciasDisponibles) {
		this.isVisibilidadCeldaCopiarExistenciasDisponibles = isVisibilidadCeldaCopiarExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormExistenciasDisponibles() {
		return isVisibilidadCeldaVerFormExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaVerFormExistenciasDisponibles(Boolean isVisibilidadCeldaVerFormExistenciasDisponibles) {
		this.isVisibilidadCeldaVerFormExistenciasDisponibles = isVisibilidadCeldaVerFormExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenExistenciasDisponibles() {
		return isVisibilidadCeldaOrdenExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaOrdenExistenciasDisponibles(Boolean isVisibilidadCeldaOrdenExistenciasDisponibles) {
		this.isVisibilidadCeldaOrdenExistenciasDisponibles = isVisibilidadCeldaOrdenExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesExistenciasDisponibles() {
		return isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesExistenciasDisponibles(Boolean isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles) {
		this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles = isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaModificarExistenciasDisponibles() {
		return isVisibilidadCeldaModificarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaModificarExistenciasDisponibles(Boolean isVisibilidadCeldaModificarExistenciasDisponibles) {
		this.isVisibilidadCeldaModificarExistenciasDisponibles = isVisibilidadCeldaModificarExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarExistenciasDisponibles() {
		return isVisibilidadCeldaActualizarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaActualizarExistenciasDisponibles(Boolean isVisibilidadCeldaActualizarExistenciasDisponibles) {
		this.isVisibilidadCeldaActualizarExistenciasDisponibles = isVisibilidadCeldaActualizarExistenciasDisponibles;
	}

	public Boolean getIsVisibilidadCeldaEliminarExistenciasDisponibles() {
		return isVisibilidadCeldaEliminarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaEliminarExistenciasDisponibles(Boolean isVisibilidadCeldaEliminarExistenciasDisponibles) {
		this.isVisibilidadCeldaEliminarExistenciasDisponibles = isVisibilidadCeldaEliminarExistenciasDisponibles;
	}

	public Boolean getIsVisibilidadCeldaCancelarExistenciasDisponibles() {
		return isVisibilidadCeldaCancelarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaCancelarExistenciasDisponibles(Boolean isVisibilidadCeldaCancelarExistenciasDisponibles) {
		this.isVisibilidadCeldaCancelarExistenciasDisponibles = isVisibilidadCeldaCancelarExistenciasDisponibles;
	}

	public Boolean getIsVisibilidadCeldaGuardarExistenciasDisponibles() {
		return isVisibilidadCeldaGuardarExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaGuardarExistenciasDisponibles(Boolean isVisibilidadCeldaGuardarExistenciasDisponibles) {
		this.isVisibilidadCeldaGuardarExistenciasDisponibles = isVisibilidadCeldaGuardarExistenciasDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosExistenciasDisponibles() {
		return isVisibilidadCeldaGuardarCambiosExistenciasDisponibles;
	}

	public void setIsVisibilidadCeldaGuardarCambiosExistenciasDisponibles(Boolean isVisibilidadCeldaGuardarCambiosExistenciasDisponibles) {
		this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles = isVisibilidadCeldaGuardarCambiosExistenciasDisponibles;
	}
		
	public ExistenciasDisponiblesSessionBean getexistenciasdisponiblesSessionBean() {
		return this.existenciasdisponiblesSessionBean;
	}
	
	public void setexistenciasdisponiblesSessionBean(ExistenciasDisponiblesSessionBean existenciasdisponiblesSessionBean) {
		this.existenciasdisponiblesSessionBean=existenciasdisponiblesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaExistenciasDisponibles() {
		return this.isVisibilidadBusquedaExistenciasDisponibles;
	}

	public void setisVisibilidadBusquedaExistenciasDisponibles(Boolean isVisibilidadBusquedaExistenciasDisponibles) {
		this.isVisibilidadBusquedaExistenciasDisponibles=isVisibilidadBusquedaExistenciasDisponibles;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarProductoForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarEmpresaForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarSucursalForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarLineaForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarLineaGrupoForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(existenciasdisponibles,null);
				this.setActualParaGuardarLineaMarcaForeignKey(existenciasdisponibles,null);
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
	
	public void bugActualizarReferenciaActual(ExistenciasDisponibles existenciasdisponibles,ExistenciasDisponibles existenciasdisponiblesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalExistenciasDisponibles(existenciasdisponibles);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		existenciasdisponiblesAux.setId(existenciasdisponibles.getId());
		existenciasdisponiblesAux.setVersionRow(existenciasdisponibles.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ExistenciasDisponibles existenciasdisponiblesLocal) throws Exception {
		
		if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ExistenciasDisponibles existenciasdisponiblesLocal) throws Exception {	
		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				existenciasdisponiblesLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				existenciasdisponiblesLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				existenciasdisponiblesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				existenciasdisponiblesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				existenciasdisponiblesLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				existenciasdisponiblesLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				existenciasdisponiblesLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				existenciasdisponiblesLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarExistenciasDisponiblesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = existenciasdisponiblesValidator.getInvalidValues(this.existenciasdisponibles);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ExistenciasDisponibles existenciasdisponibles,List<ExistenciasDisponibles> existenciasdisponibless) throws Exception {
	}		
	
	public void actualizarSelectedLista(ExistenciasDisponibles existenciasdisponibles,List<ExistenciasDisponibles> existenciasdisponibless) throws Exception {
		try	{			
			ExistenciasDisponiblesConstantesFunciones.actualizarSelectedLista(existenciasdisponibles,existenciasdisponibless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ExistenciasDisponibles> existenciasdisponiblessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				existenciasdisponiblessLocal=this.existenciasdisponiblesLogic.getExistenciasDisponibless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				existenciasdisponiblessLocal=this.existenciasdisponibless;
			}
			//ARCHITECTURE
		
			for(ExistenciasDisponibles existenciasdisponiblesLocal:existenciasdisponiblessLocal) {
				if(this.permiteMantenimiento(existenciasdisponiblesLocal) && existenciasdisponiblesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ExistenciasDisponiblesConstantesFunciones.getExistenciasDisponiblesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigoExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombre_unidadExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_disponibleExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.CANTIDADFISICA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_fisicaExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigo_productoExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombreExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.INGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelingresosExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.EGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelegresosExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.DISPONIBLECORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldisponible_corteExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.DIFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldiferenciaExistenciasDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasDisponiblesConstantesFunciones.DESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldestinoExistenciasDisponibles,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigoExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombre_unidadExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_disponibleExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_fisicaExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigo_productoExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombreExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelingresosExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelegresosExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldisponible_corteExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldiferenciaExistenciasDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldestinoExistenciasDisponibles,"");
		
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
		this.iIdNuevoExistenciasDisponibles--;	
		
		
		this.existenciasdisponiblesAux=new ExistenciasDisponibles();
		
		this.existenciasdisponiblesAux.setId(this.iIdNuevoExistenciasDisponibles);
		this.existenciasdisponiblesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.existenciasdisponiblesLogic.getExistenciasDisponibless().add(this.existenciasdisponiblesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.existenciasdisponibless.add(this.existenciasdisponiblesAux);
		}
		//ARCHITECTURE
		
		this.existenciasdisponibles=this.existenciasdisponiblesAux;
		
		if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponibles);
			this.setVariablesObjetoActualToFormularioForeignKeyExistenciasDisponibles(this.existenciasdisponibles);
		}
				
		//this.setDefaultControlesExistenciasDisponibles();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyExistenciasDisponibles();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyExistenciasDisponibles();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasDisponibles();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualExistenciasDisponibles(this.existenciasdisponiblesBean,this.existenciasdisponibles,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral,this.existenciasdisponiblesBean,false);
		
		if(this.existenciasdisponiblesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles());
		}
		
		if(this.existenciasdisponiblesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles(),classes);//this.existenciasdisponiblesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyExistenciasDisponibles();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyExistenciasDisponibles();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.RecargarFormExistenciasDisponibles(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingExistenciasDisponibles(false);
						
			if(existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasDisponibles();
			}
			
			this.actualizarVisualTableDatosExistenciasDisponibles();
			
			this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(this.getIndiceNuevoExistenciasDisponibles(), this.getIndiceNuevoExistenciasDisponibles());
			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
						
			this.actualizarEstadoCeldasBotonesExistenciasDisponibles("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesExistenciasDisponibles(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarfecha_ultima_venta_hastaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarcodigoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarnombre_unidadExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarcantidad_disponibleExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarcantidad_fisicaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarcodigo_productoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarnombreExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activaringresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activaregresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activardisponible_corteExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activardiferenciaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activardestinoExistenciasDisponibles);	
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_bodegaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_productoExistenciasDisponibles);//
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_empresaExistenciasDisponibles);//
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_sucursalExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_lineaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_linea_grupoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_linea_categoriaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setEnabled(isHabilitar && this.existenciasdisponiblesConstantesFunciones.activarid_linea_marcaExistenciasDisponibles);
	};
	
	public void setDefaultControlesExistenciasDisponibles() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoExistenciasDisponibles(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(true);			
			this.existenciasdisponiblesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.setVisible(true);
			
					
		} else {
			//this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(false);			
			this.existenciasdisponiblesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoExistenciasDisponibles() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				if(existenciasdisponiblesAux.getId().equals(this.iIdNuevoExistenciasDisponibles)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponibless) {
				if(existenciasdisponiblesAux.getId().equals(this.iIdNuevoExistenciasDisponibles)) {
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
	
	public int getIndiceActualExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				if(existenciasdisponiblesAux.getId().equals(existenciasdisponibles.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponibless) {
				if(existenciasdisponiblesAux.getId().equals(existenciasdisponibles.getId())) {
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
	
	public void setCamposBaseDesdeOriginalExistenciasDisponibles(ExistenciasDisponibles existenciasdisponiblesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				if(existenciasdisponiblesAux.getExistenciasDisponiblesOriginal().getId().equals(existenciasdisponiblesOriginal.getId())) {
					existe=true;
					existenciasdisponiblesOriginal.setId(existenciasdisponiblesAux.getId());
					existenciasdisponiblesOriginal.setVersionRow(existenciasdisponiblesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponibless) {
				if(existenciasdisponiblesAux.getExistenciasDisponiblesOriginal().getId().equals(existenciasdisponiblesOriginal.getId())) {
					existe=true;
					existenciasdisponiblesOriginal.setId(existenciasdisponiblesAux.getId());
					existenciasdisponiblesOriginal.setVersionRow(existenciasdisponiblesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosExistenciasDisponibles(Boolean esParaCancelar) throws Exception {
		existenciasdisponiblessAux=new ArrayList<ExistenciasDisponibles>();
		existenciasdisponiblesAux=new ExistenciasDisponibles();
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
					if(existenciasdisponiblesAux.getId()<0) {
						existenciasdisponiblessAux.add(existenciasdisponiblesAux);
					}		
				}
				this.iIdNuevoExistenciasDisponibles=0L;
				this.existenciasdisponiblesLogic.getExistenciasDisponibless().removeAll(existenciasdisponiblessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponibless) {
					if(existenciasdisponiblesAux.getId()<0) {
						existenciasdisponiblessAux.add(existenciasdisponiblesAux);
					}		
				}
				this.iIdNuevoExistenciasDisponibles=0L;
				this.existenciasdisponibless.removeAll(existenciasdisponiblessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoExistenciasDisponibles 
					&& this.existenciasdisponiblesLogic.getExistenciasDisponibless().size()>0
					) {
					existenciasdisponiblesAux=this.existenciasdisponiblesLogic.getExistenciasDisponibless().get(this.existenciasdisponiblesLogic.getExistenciasDisponibless().size() - 1);
				
					if(existenciasdisponiblesAux.getId()<0) {
						this.existenciasdisponiblesLogic.getExistenciasDisponibless().remove(existenciasdisponiblesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoExistenciasDisponibles && this.existenciasdisponibless.size()>0) {
					existenciasdisponiblesAux=this.existenciasdisponibless.get(this.existenciasdisponibless.size() - 1);
				
					if(existenciasdisponiblesAux.getId()<0) {
						this.existenciasdisponibless.remove(existenciasdisponiblesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoExistenciasDisponibles(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(existenciasdisponibles.getId()<0) {
				this.existenciasdisponiblesLogic.getExistenciasDisponibless().remove(this.existenciasdisponibles);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(existenciasdisponibles.getId()<0) {
				this.existenciasdisponibless.remove(this.existenciasdisponibles);
			}
		}			
	}
	
	public void setEstadosInicialesExistenciasDisponibles(List<ExistenciasDisponibles> existenciasdisponiblessAux) throws Exception {
		ExistenciasDisponiblesConstantesFunciones.setEstadosInicialesExistenciasDisponibles(existenciasdisponiblessAux);
	}
	
	public void setEstadosInicialesExistenciasDisponibles(ExistenciasDisponibles existenciasdisponiblesAux) throws Exception {
		ExistenciasDisponiblesConstantesFunciones.setEstadosInicialesExistenciasDisponibles(existenciasdisponiblesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarExistenciasDisponiblesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarExistenciasDisponiblesActual()) {
				if(!this.isEsNuevoExistenciasDisponibles) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoExistenciasDisponibles=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarExistenciasDisponiblesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Existencias Disponibles ?", "MANTENIMIENTO DE Existencias Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ExistenciasDisponibles existenciasdisponibles) throws Exception {
		ExistenciasDisponiblesConstantesFunciones.seleccionarAsignar(this.existenciasdisponibles,existenciasdisponibles);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarExistenciasDisponibles=this.isPermisoActualizarOriginalExistenciasDisponibles;
			
			
			this.seleccionarAsignar(existenciasdisponibles);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesExistenciasDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.existenciasdisponiblesSessionBean.setsFuncionBusquedaRapida(this.existenciasdisponiblesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoExistenciasDisponibles) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosExistenciasDisponibles(esParaCancelar);				
				this.cancelarNuevoExistenciasDisponibles(esParaCancelar);								
			}
			
			this.existenciasdisponibles=new ExistenciasDisponibles();
			
			this.inicializarExistenciasDisponibles();
			
			this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarExistenciasDisponibles() throws Exception {
		try {
			ExistenciasDisponiblesConstantesFunciones.inicializarExistenciasDisponibles(this.existenciasdisponibles);
			
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
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.existenciasdisponiblesLogic.getExistenciasDisponibless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteExistenciasDisponibless(String sAccionBusqueda,List<ExistenciasDisponibles> existenciasdisponiblessParaReportes) throws Exception {
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
					sPathReporteFinal="ExistenciasDisponibles"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ExistenciasDisponiblesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ExistenciasDisponiblesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ExistenciasDisponibles"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Existencias Disponibleses");		
		parameters.put("busquedapor", ExistenciasDisponiblesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceExistenciasDisponibles=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ExistenciasDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ExistenciasDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceExistenciasDisponibles=new JRBeanArrayDataSource(ExistenciasDisponiblesJInternalFrame.TraerExistenciasDisponiblesBeans(existenciasdisponiblessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceExistenciasDisponibles);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ExistenciasDisponiblesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ExistenciasDisponiblesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ExistenciasDisponiblesBean.TraerExistenciasDisponiblesBeans(existenciasdisponiblessParaReportes).toArray()));
							
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
				this.generarExcelReporteExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoExistenciasDisponiblesActionPerformed(null);
					//this.generarExcelReporteExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesExistenciasDisponibless(sAccionBusqueda,sTipoArchivoReporte,existenciasdisponiblessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteExistenciasDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasDisponibles> existenciasdisponiblessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasDisponibless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderExistenciasDisponibles("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ExistenciasDisponibles existenciasdisponibles : existenciasdisponiblessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ExistenciasDisponiblesConstantesFunciones.generarExcelReporteDataExistenciasDisponibles("NORMAL",row,workbook,existenciasdisponibles,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderExistenciasDisponibles(String sTipo,Row row,Workbook workbook) {
		
		ExistenciasDisponiblesConstantesFunciones.generarExcelReporteHeaderExistenciasDisponibles(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalExistenciasDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasDisponibles> existenciasdisponiblessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasDisponibless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ExistenciasDisponibles existenciasdisponibles : existenciasdisponiblessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.getExistenciasDisponiblesDescripcion(existenciasdisponibles));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getfecha_ultima_venta_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getcantidad_fisica());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getegresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getdisponible_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getdiferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciasdisponibles.getdestino());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesExistenciasDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasDisponibles> existenciasdisponiblessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ExistenciasDisponibles> existenciasdisponiblessRespaldo=null;
		
		classes=ExistenciasDisponiblesConstantesFunciones.getClassesRelationshipsOfExistenciasDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.existenciasdisponiblesLogic.setDatosCliente(this.datosCliente);
		this.existenciasdisponiblesLogic.setDatosDeep(this.datosDeep);
		this.existenciasdisponiblesLogic.setIsConDeep(true);
		
		existenciasdisponiblessRespaldo=this.existenciasdisponiblesLogic.getExistenciasDisponibless();
		
		this.existenciasdisponiblesLogic.setExistenciasDisponibless(existenciasdisponiblessParaReportes);	
		this.existenciasdisponiblesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		existenciasdisponiblessParaReportes=this.existenciasdisponiblesLogic.getExistenciasDisponibless();
		this.existenciasdisponiblesLogic.setExistenciasDisponibless(existenciasdisponiblessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasDisponibless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderExistenciasDisponibles("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ExistenciasDisponibles existenciasdisponibles : existenciasdisponiblessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderExistenciasDisponibles("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ExistenciasDisponiblesConstantesFunciones.generarExcelReporteDataExistenciasDisponibles("NORMAL",row,workbook,existenciasdisponibles,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.getExistenciasDisponiblesDescripcion(existenciasdisponibles));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessExistenciasDisponibles() throws Exception {		
		this.startProcessExistenciasDisponibles(true);
	}
	
	public void startProcessExistenciasDisponibles(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasExistenciasDisponibles ,this.jPanelParametrosReportesExistenciasDisponibles, this.jScrollPanelDatosExistenciasDisponibles,this.jPanelPaginacionExistenciasDisponibles, this.jScrollPanelDatosEdicionExistenciasDisponibles, this.jPanelAccionesExistenciasDisponibles,this.jPanelAccionesFormularioExistenciasDisponibles,this.jmenuBarExistenciasDisponibles,this.jmenuBarDetalleExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles);		
		
		final JTabbedPane jTabbedPaneBusquedasExistenciasDisponibles=this.jTabbedPaneBusquedasExistenciasDisponibles; 
		
		final JPanel jPanelParametrosReportesExistenciasDisponibles=this.jPanelParametrosReportesExistenciasDisponibles;
		//final JScrollPane jScrollPanelDatosExistenciasDisponibles=this.jScrollPanelDatosExistenciasDisponibles;
		final JTable jTableDatosExistenciasDisponibles=this.jTableDatosExistenciasDisponibles;		
		final JPanel jPanelPaginacionExistenciasDisponibles=this.jPanelPaginacionExistenciasDisponibles;
		//final JScrollPane jScrollPanelDatosEdicionExistenciasDisponibles=this.jScrollPanelDatosEdicionExistenciasDisponibles;
		final JPanel jPanelAccionesExistenciasDisponibles=this.jPanelAccionesExistenciasDisponibles;
		
		JPanel jPanelCamposAuxiliarExistenciasDisponibles=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarExistenciasDisponibles=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			jPanelCamposAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelCamposExistenciasDisponibles;
			jPanelAccionesFormularioAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelAccionesFormularioExistenciasDisponibles;
		}
		
		final JPanel jPanelCamposExistenciasDisponibles=jPanelCamposAuxiliarExistenciasDisponibles;
		final JPanel jPanelAccionesFormularioExistenciasDisponibles=jPanelAccionesFormularioAuxiliarExistenciasDisponibles;
		
		
		final JMenuBar jmenuBarExistenciasDisponibles=this.jmenuBarExistenciasDisponibles;
		final JToolBar jTtoolBarExistenciasDisponibles=this.jTtoolBarExistenciasDisponibles;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarExistenciasDisponibles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarExistenciasDisponibles=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			jmenuBarDetalleAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jmenuBarDetalleExistenciasDisponibles;
			jTtoolBarDetalleAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jTtoolBarDetalleExistenciasDisponibles;
		}
		
		final JMenuBar jmenuBarDetalleExistenciasDisponibles=jmenuBarDetalleAuxiliarExistenciasDisponibles;
		final JToolBar jTtoolBarDetalleExistenciasDisponibles=jTtoolBarDetalleAuxiliarExistenciasDisponibles;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasExistenciasDisponibles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesExistenciasDisponibles;
			processRunnable.jTableDatos=jTableDatosExistenciasDisponibles;
			processRunnable.jPanelCampos=jPanelCamposExistenciasDisponibles;
			processRunnable.jPanelPaginacion=jPanelPaginacionExistenciasDisponibles;
			processRunnable.jPanelAcciones=jPanelAccionesExistenciasDisponibles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioExistenciasDisponibles;
			
			
			processRunnable.jmenuBar=jmenuBarExistenciasDisponibles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleExistenciasDisponibles;
			processRunnable.jTtoolBar=jTtoolBarExistenciasDisponibles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleExistenciasDisponibles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasExistenciasDisponibles ,jPanelParametrosReportesExistenciasDisponibles,jTableDatosExistenciasDisponibles, /*jScrollPanelDatosExistenciasDisponibles,*/jPanelCamposExistenciasDisponibles,jPanelPaginacionExistenciasDisponibles, /*jScrollPanelDatosEdicionExistenciasDisponibles,*/ jPanelAccionesExistenciasDisponibles,jPanelAccionesFormularioExistenciasDisponibles,jmenuBarExistenciasDisponibles,jmenuBarDetalleExistenciasDisponibles,jTtoolBarExistenciasDisponibles,jTtoolBarDetalleExistenciasDisponibles);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasExistenciasDisponibles ,jPanelParametrosReportesExistenciasDisponibles, jScrollPanelDatosExistenciasDisponibles,jPanelPaginacionExistenciasDisponibles, jScrollPanelDatosEdicionExistenciasDisponibles, jPanelAccionesExistenciasDisponibles,jPanelAccionesFormularioExistenciasDisponibles,jmenuBarExistenciasDisponibles,jmenuBarDetalleExistenciasDisponibles,jTtoolBarExistenciasDisponibles,jTtoolBarDetalleExistenciasDisponibles);
						
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
	
	public void finishProcessExistenciasDisponibles() {// throws Exception 
		this.finishProcessExistenciasDisponibles(true);
	}
	
	public void finishProcessExistenciasDisponibles(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasExistenciasDisponibles ,this.jPanelParametrosReportesExistenciasDisponibles, this.jScrollPanelDatosExistenciasDisponibles,this.jPanelPaginacionExistenciasDisponibles, this.jScrollPanelDatosEdicionExistenciasDisponibles, this.jPanelAccionesExistenciasDisponibles,this.jPanelAccionesFormularioExistenciasDisponibles,this.jmenuBarExistenciasDisponibles,this.jmenuBarDetalleExistenciasDisponibles,this.jTtoolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles);		
		
		final JTabbedPane jTabbedPaneBusquedasExistenciasDisponibles=this.jTabbedPaneBusquedasExistenciasDisponibles; 
		
		final JPanel jPanelParametrosReportesExistenciasDisponibles=this.jPanelParametrosReportesExistenciasDisponibles;
		//final JScrollPane jScrollPanelDatosExistenciasDisponibles=this.jScrollPanelDatosExistenciasDisponibles;
		final JTable jTableDatosExistenciasDisponibles=this.jTableDatosExistenciasDisponibles;		
		final JPanel jPanelPaginacionExistenciasDisponibles=this.jPanelPaginacionExistenciasDisponibles;
		//final JScrollPane jScrollPanelDatosEdicionExistenciasDisponibles=this.jScrollPanelDatosEdicionExistenciasDisponibles;
		final JPanel jPanelAccionesExistenciasDisponibles=this.jPanelAccionesExistenciasDisponibles;
		
		JPanel jPanelCamposAuxiliarExistenciasDisponibles=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarExistenciasDisponibles=new JPanel();
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			jPanelCamposAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelCamposExistenciasDisponibles;
			jPanelAccionesFormularioAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelAccionesFormularioExistenciasDisponibles;
		}
		
		final JPanel jPanelCamposExistenciasDisponibles=jPanelCamposAuxiliarExistenciasDisponibles;
		final JPanel jPanelAccionesFormularioExistenciasDisponibles=jPanelAccionesFormularioAuxiliarExistenciasDisponibles;
		
		
		final JMenuBar jmenuBarExistenciasDisponibles=this.jmenuBarExistenciasDisponibles;		
		final JToolBar jTtoolBarExistenciasDisponibles=this.jTtoolBarExistenciasDisponibles;
				
		JMenuBar jmenuBarDetalleAuxiliarExistenciasDisponibles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarExistenciasDisponibles=new JToolBar();
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			jmenuBarDetalleAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jmenuBarDetalleExistenciasDisponibles;
			jTtoolBarDetalleAuxiliarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jTtoolBarDetalleExistenciasDisponibles;		
		}
		
		final JMenuBar jmenuBarDetalleExistenciasDisponibles=jmenuBarDetalleAuxiliarExistenciasDisponibles;
		final JToolBar jTtoolBarDetalleExistenciasDisponibles=jTtoolBarDetalleAuxiliarExistenciasDisponibles;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasExistenciasDisponibles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesExistenciasDisponibles;
			processRunnable.jTableDatos=jTableDatosExistenciasDisponibles;
			processRunnable.jPanelCampos=jPanelCamposExistenciasDisponibles;
			processRunnable.jPanelPaginacion=jPanelPaginacionExistenciasDisponibles;
			processRunnable.jPanelAcciones=jPanelAccionesExistenciasDisponibles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioExistenciasDisponibles;
			
			
			processRunnable.jmenuBar=jmenuBarExistenciasDisponibles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleExistenciasDisponibles;
			processRunnable.jTtoolBar=jTtoolBarExistenciasDisponibles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleExistenciasDisponibles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasExistenciasDisponibles ,jPanelParametrosReportesExistenciasDisponibles, jTableDatosExistenciasDisponibles,/*jScrollPanelDatosExistenciasDisponibles,*/jPanelCamposExistenciasDisponibles,jPanelPaginacionExistenciasDisponibles, /*jScrollPanelDatosEdicionExistenciasDisponibles,*/ jPanelAccionesExistenciasDisponibles,jPanelAccionesFormularioExistenciasDisponibles,jmenuBarExistenciasDisponibles,jmenuBarDetalleExistenciasDisponibles,jTtoolBarExistenciasDisponibles,jTtoolBarDetalleExistenciasDisponibles));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesExistenciasDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarExistenciasDisponibles(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuExistenciasDisponibles(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarExistenciasDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarExistenciasDisponibles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleExistenciasDisponibles,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuExistenciasDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarExistenciasDisponibles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleExistenciasDisponibles,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.existenciasdisponiblesConstantesFunciones.getsFinalQueryExistenciasDisponibles();
		String  finalQueryPaginacionTodos=this.existenciasdisponiblesConstantesFunciones.getsFinalQueryExistenciasDisponibles();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ExistenciasDisponiblesConstantesFunciones.getArrayColumnasGlobalesNoExistenciasDisponibles(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ExistenciasDisponiblesConstantesFunciones.getArrayColumnasGlobalesExistenciasDisponibles(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ExistenciasDisponiblesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.existenciasdisponiblessEliminados= new ArrayList<ExistenciasDisponibles>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessExistenciasDisponibles();
		
				///*ExistenciasDisponiblesSessionBean*/this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			
			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
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
					this.iNumeroPaginacion=ExistenciasDisponiblesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ExistenciasDisponiblesConstantesFunciones.getClassesForeignKeysOfExistenciasDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/existenciasdisponibles."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			existenciasdisponiblessAux= new ArrayList<ExistenciasDisponibles>();
			
				
			existenciasdisponiblesLogic.setDatosCliente(this.datosCliente);
			existenciasdisponiblesLogic.setDatosDeep(this.datosDeep);
			existenciasdisponiblesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaExistenciasDisponibles")) {
				this.sDetalleReporte=ExistenciasDisponiblesConstantesFunciones.getDetalleIndiceBusquedaExistenciasDisponibles(id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					existenciasdisponiblesLogic.getExistenciasDisponiblessBusquedaExistenciasDisponibles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ExistenciasDisponiblesConstantesFunciones.getDetalleIndiceBusquedaExistenciasDisponibles(id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ExistenciasDisponiblesConstantesFunciones.getDetalleIndiceBusquedaExistenciasDisponibles(id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=existenciasdisponiblesLogic.getExistenciasDisponibless()==null||existenciasdisponiblesLogic.getExistenciasDisponibless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=existenciasdisponibless==null|| existenciasdisponibless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciasdisponiblessAux=new ArrayList<ExistenciasDisponibles>();
						existenciasdisponiblessAux.addAll(existenciasdisponiblesLogic.getExistenciasDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciasdisponiblessAux=new ArrayList<ExistenciasDisponibles>();
							existenciasdisponiblessAux.addAll(existenciasdisponibless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							existenciasdisponiblesLogic.getExistenciasDisponiblessBusquedaExistenciasDisponibles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ExistenciasDisponiblesConstantesFunciones.getDetalleIndiceBusquedaExistenciasDisponibles(id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ExistenciasDisponiblesConstantesFunciones.getDetalleIndiceBusquedaExistenciasDisponibles(id_bodegaBusquedaExistenciasDisponibles,id_productoBusquedaExistenciasDisponibles,id_lineaBusquedaExistenciasDisponibles,id_linea_grupoBusquedaExistenciasDisponibles,id_linea_categoriaBusquedaExistenciasDisponibles,id_linea_marcaBusquedaExistenciasDisponibles,fecha_ultima_venta_hastaBusquedaExistenciasDisponibles);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteExistenciasDisponibless("BusquedaExistenciasDisponibles",existenciasdisponiblesLogic.getExistenciasDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteExistenciasDisponibless("BusquedaExistenciasDisponibles",existenciasdisponibless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciasdisponiblesLogic.setExistenciasDisponibless(new ArrayList<ExistenciasDisponibles>());
						existenciasdisponiblesLogic.getExistenciasDisponibless().addAll(existenciasdisponiblessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciasdisponibless=new ArrayList<ExistenciasDisponibles>();
							existenciasdisponibless.addAll(existenciasdisponiblessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesExistenciasDisponibles();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessExistenciasDisponibles();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=existenciasdisponiblesLogic.getExistenciasDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciasdisponibless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=existenciasdisponiblesLogic.getExistenciasDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciasdisponibless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ExistenciasDisponibles existenciasdisponibles) {
		Boolean permite=true;
		
		if(this.existenciasdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ExistenciasDisponiblesConstantesFunciones.getOrderByListaExistenciasDisponibles();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ExistenciasDisponiblesConstantesFunciones.getOrderByListaExistenciasDisponibles();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				if(existenciasdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					existenciasdisponiblesTotales=existenciasdisponibles;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasDisponibles existenciasdisponibles:this.existenciasdisponibless) {
				if(existenciasdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					existenciasdisponiblesTotales=existenciasdisponibles;
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
			this.existenciasdisponiblesAux=new ExistenciasDisponibles();
			this.existenciasdisponiblesAux.setsType(Constantes2.S_TOTALES);
			this.existenciasdisponiblesAux.setIsNew(false);
			this.existenciasdisponiblesAux.setIsChanged(false);
			this.existenciasdisponiblesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ExistenciasDisponiblesConstantesFunciones.TotalizarValoresFilaExistenciasDisponibles(this.existenciasdisponiblesLogic.getExistenciasDisponibless(),this.existenciasdisponiblesAux);
				
				//this.existenciasdisponiblesLogic.getExistenciasDisponibless().add(this.existenciasdisponiblesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ExistenciasDisponiblesConstantesFunciones.TotalizarValoresFilaExistenciasDisponibles(this.existenciasdisponibless,this.existenciasdisponiblesAux);
				
				this.existenciasdisponibless.add(this.existenciasdisponiblesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		existenciasdisponiblesTotales=new ExistenciasDisponibles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.existenciasdisponiblesLogic.getExistenciasDisponibless().remove(existenciasdisponiblesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.existenciasdisponibless.remove(existenciasdisponiblesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		existenciasdisponiblesTotales=new ExistenciasDisponibles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				if(existenciasdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					existenciasdisponiblesTotales=existenciasdisponibles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ExistenciasDisponiblesConstantesFunciones.TotalizarValoresFilaExistenciasDisponibles(this.existenciasdisponiblesLogic.getExistenciasDisponibless(),existenciasdisponiblesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasDisponibles existenciasdisponibles:this.existenciasdisponibless) {
				if(existenciasdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					existenciasdisponiblesTotales=existenciasdisponibles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ExistenciasDisponiblesConstantesFunciones.TotalizarValoresFilaExistenciasDisponibles(this.existenciasdisponibless,existenciasdisponiblesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getExistenciasDisponiblessBusquedaExistenciasDisponibles()throws Exception {
		try {
			sAccionBusqueda="BusquedaExistenciasDisponibles";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasDisponiblessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getExistenciasDisponiblessBusquedaExistenciasDisponibles(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_ultima_venta_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessBusquedaExistenciasDisponibles(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_ultima_venta_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasDisponiblessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciasdisponiblesLogic.getExistenciasDisponiblessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosExistenciasDisponibles() {
		this.isPermisoTodoExistenciasDisponibles=false;
		this.isPermisoNuevoExistenciasDisponibles=false;
		this.isPermisoActualizarExistenciasDisponibles=false;
		this.isPermisoActualizarOriginalExistenciasDisponibles=false;
		this.isPermisoEliminarExistenciasDisponibles=false;
		this.isPermisoGuardarCambiosExistenciasDisponibles=false;
		this.isPermisoConsultaExistenciasDisponibles=true;
		this.isPermisoBusquedaExistenciasDisponibles=true;
		this.isPermisoReporteExistenciasDisponibles=true;
		this.isPermisoOrdenExistenciasDisponibles=false;		
		this.isPermisoPaginacionMedioExistenciasDisponibles=false;		
		this.isPermisoPaginacionAltoExistenciasDisponibles=false;		
		this.isPermisoPaginacionTodoExistenciasDisponibles=false;		
		this.isPermisoCopiarExistenciasDisponibles=false;		
		this.isPermisoVerFormExistenciasDisponibles=false;		
		this.isPermisoDuplicarExistenciasDisponibles=false;
		this.isPermisoOrdenExistenciasDisponibles=false;
	}
	
	public void setPermisosUsuarioExistenciasDisponibles(Boolean isPermiso) {
		this.isPermisoTodoExistenciasDisponibles=isPermiso;
		this.isPermisoNuevoExistenciasDisponibles=isPermiso;
		this.isPermisoActualizarExistenciasDisponibles=isPermiso;
		this.isPermisoActualizarOriginalExistenciasDisponibles=isPermiso;
		this.isPermisoEliminarExistenciasDisponibles=isPermiso;
		this.isPermisoGuardarCambiosExistenciasDisponibles=isPermiso;
		this.isPermisoConsultaExistenciasDisponibles=isPermiso;
		this.isPermisoBusquedaExistenciasDisponibles=isPermiso;
		this.isPermisoReporteExistenciasDisponibles=isPermiso;
		this.isPermisoOrdenExistenciasDisponibles=isPermiso;		
		this.isPermisoPaginacionMedioExistenciasDisponibles=isPermiso;		
		this.isPermisoPaginacionAltoExistenciasDisponibles=isPermiso;		
		this.isPermisoPaginacionTodoExistenciasDisponibles=isPermiso;		
		this.isPermisoCopiarExistenciasDisponibles=isPermiso;		
		this.isPermisoVerFormExistenciasDisponibles=isPermiso;		
		this.isPermisoDuplicarExistenciasDisponibles=isPermiso;
		this.isPermisoOrdenExistenciasDisponibles=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioExistenciasDisponibles(Boolean isPermiso) {
		//this.isPermisoTodoExistenciasDisponibles=isPermiso;
		this.isPermisoNuevoExistenciasDisponibles=isPermiso;
		this.isPermisoActualizarExistenciasDisponibles=isPermiso;
		this.isPermisoActualizarOriginalExistenciasDisponibles=isPermiso;
		this.isPermisoEliminarExistenciasDisponibles=isPermiso;
		this.isPermisoGuardarCambiosExistenciasDisponibles=isPermiso;
		//this.isPermisoConsultaExistenciasDisponibles=isPermiso;
		//this.isPermisoBusquedaExistenciasDisponibles=isPermiso;
		//this.isPermisoReporteExistenciasDisponibles=isPermiso;
		//this.isPermisoOrdenExistenciasDisponibles=isPermiso;		
		//this.isPermisoPaginacionMedioExistenciasDisponibles=isPermiso;		
		//this.isPermisoPaginacionAltoExistenciasDisponibles=isPermiso;		
		//this.isPermisoPaginacionTodoExistenciasDisponibles=isPermiso;		
		//this.isPermisoCopiarExistenciasDisponibles=isPermiso;		
		//this.isPermisoDuplicarExistenciasDisponibles=isPermiso;
		//this.isPermisoOrdenExistenciasDisponibles=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioExistenciasDisponiblesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ExistenciasDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioExistenciasDisponiblesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioExistenciasDisponiblesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionExistenciasDisponiblesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioExistenciasDisponiblesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioExistenciasDisponibles() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ExistenciasDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ExistenciasDisponiblesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoExistenciasDisponibles=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarExistenciasDisponibles=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalExistenciasDisponibles=this.isPermisoActualizarExistenciasDisponibles;
			this.isPermisoEliminarExistenciasDisponibles=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosExistenciasDisponibles=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaExistenciasDisponibles=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaExistenciasDisponibles=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoExistenciasDisponibles=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteExistenciasDisponibles=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenExistenciasDisponibles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioExistenciasDisponibles=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoExistenciasDisponibles=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoExistenciasDisponibles=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarExistenciasDisponibles=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormExistenciasDisponibles=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarExistenciasDisponibles=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenExistenciasDisponibles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosExistenciasDisponibles.setToolTipText(this.jTableDatosExistenciasDisponibles.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioExistenciasDisponibles(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioExistenciasDisponibles(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ExistenciasDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ExistenciasDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioExistenciasDisponibles() throws Exception {
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
	public void inicializarCombosForeignKeyExistenciasDisponiblesListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyExistenciasDisponiblesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ExistenciasDisponiblesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyExistenciasDisponibles()throws Exception {
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
			if(this.existenciasdisponiblesSessionBean==null) {
				this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
			}

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.existenciasdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyExistenciasDisponibles()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyExistenciasDisponibles(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyExistenciasDisponibles()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasDisponibles();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyExistenciasDisponibles()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasDisponibles()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyExistenciasDisponibles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyExistenciasDisponibles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroExistenciasDisponibles()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyExistenciasDisponibles()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyExistenciasDisponibles(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyExistenciasDisponibles()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ExistenciasDisponiblesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ExistenciasDisponiblesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ExistenciasDisponiblesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean(); 
		this.existenciasdisponiblesConstantesFunciones=new ExistenciasDisponiblesConstantesFunciones(); 
		this.existenciasdisponiblesBean=new ExistenciasDisponibles();//(this.existenciasdisponiblesConstantesFunciones); 		
		this.existenciasdisponiblesReturnGeneral=new ExistenciasDisponiblesParameterReturnGeneral(); 
		
		this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciasdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ExistenciasDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ExistenciasDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ExistenciasDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessExistenciasDisponibles(true);
			
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
			
			this.existenciasdisponiblesConstantesFunciones=new ExistenciasDisponiblesConstantesFunciones(); 
			this.existenciasdisponiblesBean=new ExistenciasDisponibles();//this.existenciasdisponiblesConstantesFunciones); 			
			this.existenciasdisponiblesReturnGeneral=new ExistenciasDisponiblesParameterReturnGeneral(); 
		
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Existencias Disponibles Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.existenciasdisponibles=new ExistenciasDisponibles();
			this.existenciasdisponibless = new ArrayList<ExistenciasDisponibles>();
			this.existenciasdisponiblessAux = new ArrayList<ExistenciasDisponibles>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic=new ExistenciasDisponiblesLogic();
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			//this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.existenciasdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormExistenciasDisponibles);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoExistenciasDisponibles);	
					}
					
					if(this.jInternalFrameImportacionExistenciasDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionExistenciasDisponibles);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByExistenciasDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByExistenciasDisponibles);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormExistenciasDisponibles);
				this.jInternalFrameDetalleFormExistenciasDisponibles.setVisible(false);
				this.jInternalFrameDetalleFormExistenciasDisponibles.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoExistenciasDisponibles);
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.setVisible(false);
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionExistenciasDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionExistenciasDisponibles);
					this.jInternalFrameImportacionExistenciasDisponibles.setVisible(false);
					this.jInternalFrameImportacionExistenciasDisponibles.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByExistenciasDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByExistenciasDisponibles);
					this.jInternalFrameOrderByExistenciasDisponibles.setVisible(false);
					this.jInternalFrameOrderByExistenciasDisponibles.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idExistenciasDisponiblesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ExistenciasDisponiblesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.existenciasdisponiblesReturnGeneral=new ExistenciasDisponiblesParameterReturnGeneral();
			
			this.existenciasdisponiblesParameterGeneral=new ExistenciasDisponiblesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.existenciasdisponiblesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ExistenciasDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ExistenciasDisponiblesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),this.existenciasdisponiblesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ExistenciasDisponiblesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),this.existenciasdisponiblesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaDuplicarExistenciasDisponibles=true;
			this.isVisibilidadCeldaCopiarExistenciasDisponibles=true;
			this.isVisibilidadCeldaVerFormExistenciasDisponibles=true;
			this.isVisibilidadCeldaOrdenExistenciasDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			
			
			this.isVisibilidadBusquedaExistenciasDisponibles=true;
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
			
			//this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosExistenciasDisponibles();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioExistenciasDisponibles(false);
			
			this.setPermisosUsuarioExistenciasDisponibles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() 
				|| (this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() && this.existenciasdisponiblesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioExistenciasDisponiblesClasesRelacionadas();
			}
			
			if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioExistenciasDisponiblesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosExistenciasDisponibles();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualExistenciasDisponibles();
			}
			
			if(!this.isPermisoBusquedaExistenciasDisponibles) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ExistenciasDisponiblesConstantesFunciones.getTiposSeleccionarExistenciasDisponibles());
				
				this.tiposColumnasSelect=ExistenciasDisponiblesConstantesFunciones.getTiposSeleccionarExistenciasDisponibles(true);
				
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
			//if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioExistenciasDisponibles();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioExistenciasDisponibles(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioExistenciasDisponibles(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasDisponibles() ;
			
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
				existenciasdisponiblesImplementable= (ExistenciasDisponiblesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ExistenciasDisponiblesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				existenciasdisponiblesImplementableHome= (ExistenciasDisponiblesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ExistenciasDisponiblesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.existenciasdisponibless= new ArrayList<ExistenciasDisponibles>();
			this.existenciasdisponiblessEliminados= new ArrayList<ExistenciasDisponibles>();
						
			this.isEsNuevoExistenciasDisponibles=false;
			this.esParaAccionDesdeFormularioExistenciasDisponibles=false;
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
				this.cargarCombosForeignKeyExistenciasDisponibles(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroExistenciasDisponibles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ExistenciasDisponiblesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesExistenciasDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingExistenciasDisponibles(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioExistenciasDisponibles();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioExistenciasDisponibles();
			}
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasExistenciasDisponibles.getTabCount(); i++) {
					this.jTabbedPaneBusquedasExistenciasDisponibles.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasExistenciasDisponibles.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessExistenciasDisponibles(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ExistenciasDisponibles: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectExistenciasDisponibles() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesExistenciasDisponibles")) {
				iIndex=this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessExistenciasDisponibles();	
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
	
	public void cargarCombosForeignKeyExistenciasDisponibles(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyExistenciasDisponibles(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyExistenciasDisponibles(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyExistenciasDisponiblesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyExistenciasDisponibles();
		
		this.cargarCombosFrameForeignKeyExistenciasDisponibles();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyExistenciasDisponibles();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyExistenciasDisponibles();
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
	
	public void jButtonNuevoExistenciasDisponiblesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			
			if(jTableDatosExistenciasDisponibles.getRowCount()>=1) {
				jTableDatosExistenciasDisponibles.removeRowSelectionInterval(0, jTableDatosExistenciasDisponibles.getRowCount()-1);						
			}
			
			this.isEsNuevoExistenciasDisponibles=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoExistenciasDisponibles(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesExistenciasDisponibles(true);			
			//this.existenciasdisponibles=new ExistenciasDisponibles();
			//this.existenciasdisponibles.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasDisponibles(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles() ;
			
			if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasDisponibles(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.existenciasdisponibles);	
			this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);				
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ExistenciasDisponibles: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarExistenciasDisponiblesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosExistenciasDisponibles.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosExistenciasDisponibles.getSelectedRows().length;			
			}
			
			existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoExistenciasDisponibles--;			
				//ExistenciasDisponibles existenciasdisponiblesAux= new ExistenciasDisponibles();			
				//existenciasdisponiblesAux.setId(this.iIdNuevoExistenciasDisponibles);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ExistenciasDisponibles existenciasdisponiblesOrigen=new ExistenciasDisponibles();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ExistenciasDisponibles existenciasdisponiblesOrigen : existenciasdisponiblessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							existenciasdisponiblesOrigen =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciasdisponiblesOrigen =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaExistenciasDisponibles();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.existenciasdisponibles.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosExistenciasDisponibles(existenciasdisponiblesOrigen,this.existenciasdisponibles,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.existenciasdisponiblesLogic.getExistenciasDisponibless().add(this.existenciasdisponiblesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibless.add(this.existenciasdisponiblesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
				
				this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(this.getIndiceNuevoExistenciasDisponibles(), this.getIndiceNuevoExistenciasDisponibles());
				
				int iLastRow =  this.jTableDatosExistenciasDisponibles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosExistenciasDisponibles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosExistenciasDisponibles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();									
		
			ExistenciasDisponibles existenciasdisponiblesOrigen=new ExistenciasDisponibles();
			ExistenciasDisponibles existenciasdisponiblesDestino=new ExistenciasDisponibles();
				
			existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosExistenciasDisponibles.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || existenciasdisponiblessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosExistenciasDisponibles.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciasdisponiblesOrigen =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						existenciasdisponiblesOrigen =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciasdisponiblesDestino =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						existenciasdisponiblesDestino =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				existenciasdisponiblesOrigen =existenciasdisponiblessSeleccionados.get(0);
				existenciasdisponiblesDestino =existenciasdisponiblessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosExistenciasDisponibles(existenciasdisponiblesOrigen,existenciasdisponiblesDestino,true,false);
				
				existenciasdisponiblesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(existenciasdisponiblesDestino,existenciasdisponiblesLogic.getExistenciasDisponibless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(existenciasdisponiblesDestino,existenciasdisponibless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
				
				//this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(this.getIndiceNuevoExistenciasDisponibles(), this.getIndiceNuevoExistenciasDisponibles());
				
				int iLastRow =  this.jTableDatosExistenciasDisponibles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosExistenciasDisponibles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosExistenciasDisponibles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesExistenciasDisponibles.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesExistenciasDisponibles.setVisible(!isVisible);
			this.jPanelPaginacionExistenciasDisponibles.setVisible(!isVisible);
			this.jPanelAccionesExistenciasDisponibles.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameExistenciasDisponibles();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoExistenciasDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionExistenciasDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByExistenciasDisponibles();
			
			this.abrirFrameOrderByExistenciasDisponibles();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByExistenciasDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleExistenciasDisponibles(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormExistenciasDisponibles);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormExistenciasDisponibles.isMaximum()) {
					this.jInternalFrameDetalleFormExistenciasDisponibles.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormExistenciasDisponibles.setSize(this.jInternalFrameDetalleFormExistenciasDisponibles.iWidthFormulario,this.jInternalFrameDetalleFormExistenciasDisponibles.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormExistenciasDisponibles.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormExistenciasDisponibles.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormExistenciasDisponibles.isMaximum()) {
						this.jInternalFrameDetalleFormExistenciasDisponibles.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormExistenciasDisponibles.jContentPaneDetalleExistenciasDisponibles.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormExistenciasDisponibles.jContentPaneDetalleExistenciasDisponibles.getWidth(),ExistenciasDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormExistenciasDisponibles.jContentPaneDetalleExistenciasDisponibles.getWidth(),ExistenciasDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormExistenciasDisponibles.jContentPaneDetalleExistenciasDisponibles.getWidth(),ExistenciasDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormExistenciasDisponibles.setVisible(true);
	        this.jInternalFrameDetalleFormExistenciasDisponibles.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByExistenciasDisponibles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByExistenciasDisponibles==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByExistenciasDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasDisponibles,false,this);
				} else {
					this.jInternalFrameOrderByExistenciasDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasDisponibles,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByExistenciasDisponibles);
				this.jInternalFrameOrderByExistenciasDisponibles.setVisible(false);
				this.jInternalFrameOrderByExistenciasDisponibles.setSelected(false);
				
				this.jInternalFrameOrderByExistenciasDisponibles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByExistenciasDisponibles"));
				
				this.inicializarActualizarBindingTablaOrderByExistenciasDisponibles();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionExistenciasDisponibles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionExistenciasDisponibles==null) {
				
				this.jInternalFrameImportacionExistenciasDisponibles=new ImportacionJInternalFrame(ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionExistenciasDisponibles);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionExistenciasDisponibles);
				this.jInternalFrameImportacionExistenciasDisponibles.setVisible(false);
				this.jInternalFrameImportacionExistenciasDisponibles.setSelected(false);


				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionExistenciasDisponibles"));
				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionExistenciasDisponibles"));
				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionExistenciasDisponibles"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoExistenciasDisponibles() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoExistenciasDisponibles==null) {
				this.jInternalFrameReporteDinamicoExistenciasDisponibles=new ReporteDinamicoJInternalFrame(ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoExistenciasDisponibles);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoExistenciasDisponibles);
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.setVisible(false);
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasDisponibles"));
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasDisponibles"));
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasDisponibles"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasDisponibles();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleExistenciasDisponibles() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormExistenciasDisponibles);
			
	       	this.jInternalFrameDetalleFormExistenciasDisponibles.setVisible(false);
	        this.jInternalFrameDetalleFormExistenciasDisponibles.setSelected(false);
			
			//this.jInternalFrameDetalleFormExistenciasDisponibles.dispose();
			//this.jInternalFrameDetalleFormExistenciasDisponibles=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoExistenciasDisponibles() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoExistenciasDisponibles.setVisible(true);
	        this.jInternalFrameReporteDinamicoExistenciasDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionExistenciasDisponibles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionExistenciasDisponibles.setVisible(true);
	        this.jInternalFrameImportacionExistenciasDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByExistenciasDisponibles() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByExistenciasDisponibles.setVisible(true);
	        this.jInternalFrameOrderByExistenciasDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByExistenciasDisponibles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByExistenciasDisponibles.setVisible(false);
	        this.jInternalFrameOrderByExistenciasDisponibles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoExistenciasDisponibles() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoExistenciasDisponibles.setVisible(false);
	        this.jInternalFrameReporteDinamicoExistenciasDisponibles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionExistenciasDisponibles() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionExistenciasDisponibles.setVisible(false);
	        this.jInternalFrameImportacionExistenciasDisponibles.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarExistenciasDisponibles(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarExistenciasDisponibles(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesExistenciasDisponibles(true);
			//this.isEsNuevoExistenciasDisponibles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesExistenciasDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasDisponibles(false) ;
			
			if(existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasDisponibles(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaExistenciasDisponiblesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarExistenciasDisponibles(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesExistenciasDisponibles(true);
			//this.isEsNuevoExistenciasDisponibles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.existenciasdisponibles.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesExistenciasDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesExistenciasDisponibles(false) ;
			
			if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasDisponibles(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesExistenciasDisponibles(false);
			
			//if(!this.isEsNuevoExistenciasDisponibles) {								
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				
			}
			
			if(this.permiteMantenimiento(this.existenciasdisponibles)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoExistenciasDisponibles=true;
					this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
					this.isEsNuevoExistenciasDisponibles=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoExistenciasDisponibles=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoExistenciasDisponibles=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesExistenciasDisponibles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(false);
				
				this.habilitarDeshabilitarControlesExistenciasDisponibles(false);
			
												
				
				if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleExistenciasDisponibles();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoExistenciasDisponiblesActionPerformed(evt,existenciasdisponiblesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualExistenciasDisponibles(this.existenciasdisponibles,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,existenciasdisponiblesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.existenciasdisponibles.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				this.existenciasdisponibles.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				this.existenciasdisponibles.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.existenciasdisponibles)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ExistenciasDisponiblesModel) this.jTableDatosExistenciasDisponibles.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoExistenciasDisponibles=true;
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
				this.isEsNuevoExistenciasDisponibles=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesExistenciasDisponibles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(false);
				
				this.habilitarDeshabilitarControlesExistenciasDisponibles(false);
				
				
				
				if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleExistenciasDisponibles();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosExistenciasDisponibles.getRowCount()>=1) {
				jTableDatosExistenciasDisponibles.removeRowSelectionInterval(0, jTableDatosExistenciasDisponibles.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesExistenciasDisponibles(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasDisponibles(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(false) ;
			
			this.isEsNuevoExistenciasDisponibles=false;
			
			if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleExistenciasDisponibles();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingExistenciasDisponibles(false);
				
				//SI ES MANUAL
				if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualExistenciasDisponibles();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoExistenciasDisponibles--;			
			//ExistenciasDisponibles existenciasdisponiblesAux= new ExistenciasDisponibles();			
			//existenciasdisponiblesAux.setId(this.iIdNuevoExistenciasDisponibles);
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaExistenciasDisponibles();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
			
			this.existenciasdisponibles.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.existenciasdisponiblesLogic.getExistenciasDisponibless().add(this.existenciasdisponiblesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.existenciasdisponibless.add(this.existenciasdisponiblesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			
			this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(this.getIndiceNuevoExistenciasDisponibles(), this.getIndiceNuevoExistenciasDisponibles());
			
			int iLastRow =  this.jTableDatosExistenciasDisponibles.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosExistenciasDisponibles.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosExistenciasDisponibles.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasDisponibles(false);
			
			//SI ES MANUAL
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasDisponibles();
			}
			
			//this.abrirFrameTreeExistenciasDisponibles();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionExistenciasDisponibles.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionExistenciasDisponibles.setFileImportacion(this.jInternalFrameImportacionExistenciasDisponibles.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionExistenciasDisponibles.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionExistenciasDisponibles.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionExistenciasDisponibles.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionExistenciasDisponibles.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		

		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ExistenciasDisponiblesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ExistenciasDisponiblesBaseDesign.jrxml";
			
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
			
			this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadFisica_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadFisica_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadFisica_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadFisica_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_resos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_resos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_resos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_resos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponibleCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponibleCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponibleCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponibleCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stino_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoria="cantidad_fisica";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoria="ingresos";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoria="egresos";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoria="disponible_corte";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA:
					sNombreCampoCategoria="diferencia";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoria="destino";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoriaValor="cantidad_fisica";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoriaValor="ingresos";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoriaValor="egresos";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoriaValor="disponible_corte";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA:
					sNombreCampoCategoriaValor="diferencia";
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoriaValor="destino";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Fisica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_fisica");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingresos");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Egresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"egresos");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Disponible Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"disponible_corte");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Diferencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"diferencia");
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"destino");
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
	
	public void jButtonGenerarExcelReporteDinamicoExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ExistenciasDisponibless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getfecha_ultima_venta_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getcantidad_fisica());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getegresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getdisponible_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getdiferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO);
					iRow++;

					for(ExistenciasDisponibles existenciasdisponibles:existenciasdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciasdisponibles.getdestino());
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
			//	this.getFilaCabeceraExportarExcelExistenciasDisponibles(row);				
			//	iRow++;
			//}				
			
			//for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelExistenciasDisponibles(existenciasdisponiblesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
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
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasDisponibles(false);
			
			//SI ES MANUAL
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasDisponibles();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasDisponibles(false);
			
			//SI ES MANUAL
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualExistenciasDisponibles();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasDisponibles(false);
			
			//SI ES MANUAL
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualExistenciasDisponibles();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaExistenciasDisponibles() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosExistenciasDisponibles.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosExistenciasDisponibles.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosExistenciasDisponibles.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosExistenciasDisponibles.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosExistenciasDisponibles.setMinimumSize(dimensionMinimum);
		this.jTableDatosExistenciasDisponibles.setMaximumSize(dimensionMaximum);
		this.jTableDatosExistenciasDisponibles.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingExistenciasDisponibles(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingExistenciasDisponibles(esInicializar,true);
	}
	
	public void inicializarActualizarBindingExistenciasDisponibles(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaExistenciasDisponibles(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesExistenciasDisponibles(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasExistenciasDisponibles(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasDisponibles(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesExistenciasDisponibles(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualExistenciasDisponibles() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaExistenciasDisponibles();
		
		this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualExistenciasDisponibles();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasDisponibles() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasDisponibles(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasDisponibles(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosExistenciasDisponibles.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosExistenciasDisponibles.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteExistenciasDisponibles.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionNuevoExistenciasDisponibles.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionSinCerrarExistenciasDisponibles.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionSinMensajeExistenciasDisponibles.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosExistenciasDisponibles.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosExistenciasDisponibles.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteExistenciasDisponibles.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionNuevoExistenciasDisponibles.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionSinCerrarExistenciasDisponibles.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormExistenciasDisponibles.jCheckBoxPostAccionSinMensajeExistenciasDisponibles.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionExistenciasDisponibles.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionExistenciasDisponibles.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesExistenciasDisponibles.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesExistenciasDisponibles.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesExistenciasDisponibles.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarExistenciasDisponibles.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesExistenciasDisponibles.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesExistenciasDisponibles.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralExistenciasDisponibles.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesExistenciasDisponibles(Boolean esInicializar) throws Exception {
		try	{	
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasDisponibles(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasDisponibles() throws Exception {
		try	{
			if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualExistenciasDisponibles();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleExistenciasDisponibles() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualExistenciasDisponibles() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesExistenciasDisponibles.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesExistenciasDisponibles.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesExistenciasDisponibles.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionExistenciasDisponibles.addItem(reporte);
			}
			
			
			if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionExistenciasDisponibles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionExistenciasDisponibles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesExistenciasDisponibles.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesExistenciasDisponibles.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarExistenciasDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarExistenciasDisponibles.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarExistenciasDisponibles.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasDisponibles();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasDisponibles() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
				
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ExistenciasDisponiblesConstantesFunciones.getTiposSeleccionarExistenciasDisponibles(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ExistenciasDisponiblesConstantesFunciones.getTiposSeleccionarExistenciasDisponibles(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ExistenciasDisponiblesConstantesFunciones.getTiposSeleccionarExistenciasDisponibles(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualExistenciasDisponibles()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_bodegaBusquedaExistenciasDisponibles=((Bodega)this.jComboBoxid_bodegaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_productoBusquedaExistenciasDisponibles=((Producto)this.jComboBoxid_productoBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_lineaBusquedaExistenciasDisponibles=((Linea)this.jComboBoxid_lineaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_linea_grupoBusquedaExistenciasDisponibles=((Linea)this.jComboBoxid_linea_grupoBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_linea_categoriaBusquedaExistenciasDisponibles=((Linea)this.jComboBoxid_linea_categoriaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()!=null){this.id_linea_marcaBusquedaExistenciasDisponibles=((Linea)this.jComboBoxid_linea_marcaBusquedaExistenciasDisponiblesExistenciasDisponibles.getSelectedItem()).getId();}
		this.fecha_ultima_venta_hastaBusquedaExistenciasDisponibles=new Date(this.jDateChooserfecha_ultima_venta_hastaBusquedaExistenciasDisponiblesExistenciasDisponibles.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasExistenciasDisponibles(Boolean esInicializar) throws Exception {				
		if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualExistenciasDisponibles();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaExistenciasDisponibles() throws Exception {
		this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByExistenciasDisponibles() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosExistenciasDisponiblesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponiblesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaExistenciasDisponibles(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=existenciasdisponiblesLogic.getExistenciasDisponibless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=existenciasdisponibless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosExistenciasDisponibles.setModel(new ExistenciasDisponiblesModel(this.existenciasdisponiblesLogic.getExistenciasDisponibless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosExistenciasDisponibles.setModel(new ExistenciasDisponiblesModel(this.existenciasdisponibless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByExistenciasDisponibles!=null && this.jInternalFrameOrderByExistenciasDisponibles.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByExistenciasDisponibles();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,existenciasdisponiblesConstantesFunciones.resaltarSeleccionarExistenciasDisponibles,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO,existenciasdisponiblesConstantesFunciones.resaltarSeleccionarExistenciasDisponibles,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_ID));

		if(this.existenciasdisponiblesConstantesFunciones.mostraridExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaridExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaridExistenciasDisponibles,iSizeTabla,this,true,"idExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaridExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaridExistenciasDisponibles,this,true,"idExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarcodigoExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcodigoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcodigoExistenciasDisponibles,iSizeTabla,this,true,"codigoExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcodigoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcodigoExistenciasDisponibles,this,true,"codigoExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarnombre_unidadExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarnombre_unidadExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarnombre_unidadExistenciasDisponibles,iSizeTabla,this,true,"nombre_unidadExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarnombre_unidadExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarnombre_unidadExistenciasDisponibles,this,true,"nombre_unidadExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_disponibleExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_disponibleExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcantidad_disponibleExistenciasDisponibles,iSizeTabla,this,true,"cantidad_disponibleExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_disponibleExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcantidad_disponibleExistenciasDisponibles,this,true,"cantidad_disponibleExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_fisicaExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_fisicaExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcantidad_fisicaExistenciasDisponibles,iSizeTabla,this,true,"cantidad_fisicaExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_fisicaExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcantidad_fisicaExistenciasDisponibles,this,true,"cantidad_fisicaExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarcodigo_productoExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcodigo_productoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcodigo_productoExistenciasDisponibles,iSizeTabla,this,true,"codigo_productoExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarcodigo_productoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarcodigo_productoExistenciasDisponibles,this,true,"codigo_productoExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE));

		if(this.existenciasdisponiblesConstantesFunciones.mostrarnombreExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarnombreExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarnombreExistenciasDisponibles,iSizeTabla,this,true,"nombreExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltarnombreExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activarnombreExistenciasDisponibles,this,true,"nombreExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS));

		if(this.existenciasdisponiblesConstantesFunciones.mostraringresosExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaringresosExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaringresosExistenciasDisponibles,iSizeTabla,this,true,"ingresosExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaringresosExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaringresosExistenciasDisponibles,this,true,"ingresosExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS));

		if(this.existenciasdisponiblesConstantesFunciones.mostraregresosExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaregresosExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaregresosExistenciasDisponibles,iSizeTabla,this,true,"egresosExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltaregresosExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activaregresosExistenciasDisponibles,this,true,"egresosExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE));

		if(this.existenciasdisponiblesConstantesFunciones.mostrardisponible_corteExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardisponible_corteExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardisponible_corteExistenciasDisponibles,iSizeTabla,this,true,"disponible_corteExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardisponible_corteExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardisponible_corteExistenciasDisponibles,this,true,"disponible_corteExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA));

		if(this.existenciasdisponiblesConstantesFunciones.mostrardiferenciaExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardiferenciaExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardiferenciaExistenciasDisponibles,iSizeTabla,this,true,"diferenciaExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardiferenciaExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardiferenciaExistenciasDisponibles,this,true,"diferenciaExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO));

		if(this.existenciasdisponiblesConstantesFunciones.mostrardestinoExistenciasDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardestinoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardestinoExistenciasDisponibles,iSizeTabla,this,true,"destinoExistenciasDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciasdisponiblesConstantesFunciones.resaltardestinoExistenciasDisponibles,this.existenciasdisponiblesConstantesFunciones.activardestinoExistenciasDisponibles,this,true,"destinoExistenciasDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosExistenciasDisponibles.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosExistenciasDisponibles.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosExistenciasDisponibles.addColumn(tableColumn);
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
			
			this.jTableDatosExistenciasDisponibles.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosExistenciasDisponibles.moveColumn(this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosExistenciasDisponibles.moveColumn(this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosExistenciasDisponibles.moveColumn(this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosExistenciasDisponibles.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosExistenciasDisponibles.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosExistenciasDisponibles,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosExistenciasDisponibles.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosExistenciasDisponibles.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosExistenciasDisponibles.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosExistenciasDisponibles.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=existenciasdisponiblesLogic.getExistenciasDisponibless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=existenciasdisponibless.size()-1;
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
		//this.jTableDatosExistenciasDisponibles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosExistenciasDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosExistenciasDisponibles();
			
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
				
				//this.isEsNuevoExistenciasDisponibles=false;
					
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
				if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosExistenciasDisponibles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.existenciasdisponibles.getsType().equals("DUPLICADO")
				   || this.existenciasdisponibles.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoExistenciasDisponibles=true;
				
				} else {
					this.isEsNuevoExistenciasDisponibles=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
					if(this.existenciasdisponibles.getId()>=0 && !this.existenciasdisponibles.getIsNew()) {						
						this.isEsNuevoExistenciasDisponibles=false;
						
					} else {
						this.isEsNuevoExistenciasDisponibles=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoExistenciasDisponibles(esRelaciones);						
				
				this.seleccionarExistenciasDisponibles(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.existenciasdisponibles.getId()<0) {
					this.isEsNuevoExistenciasDisponibles=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarExistenciasDisponibles(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarExistenciasDisponibles(evt,rowIndex);
				}	
				
				if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ExistenciasDisponibles: " + this.dDif); 
					}
				}								
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarExistenciasDisponibles(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.existenciasdisponibles)) {
					if(this.existenciasdisponibles.getId()>0) {
						this.existenciasdisponibles.setIsDeleted(true);
						
						this.existenciasdisponiblessEliminados.add(this.existenciasdisponibles);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.existenciasdisponiblesLogic.getExistenciasDisponibless().remove(this.existenciasdisponibles);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibless.remove(this.existenciasdisponibles);				
					}
					
					
					((ExistenciasDisponiblesModel) this.jTableDatosExistenciasDisponibles.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasDisponibles(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarExistenciasDisponibles(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoExistenciasDisponibles) {
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosExistenciasDisponibles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosExistenciasDisponibles.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponibles);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesExistenciasDisponibles("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesExistenciasDisponibles(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasDisponibles() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoExistenciasDisponibles(existenciasdisponibles,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioExistenciasDisponibles(existenciasdisponibles);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyExistenciasDisponibles(existenciasdisponibles,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyExistenciasDisponibles(existenciasdisponibles);
	}
	
	public void setVariablesObjetoActualToFormularioExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setText(existenciasdisponibles.getId().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setText(existenciasdisponibles.getcodigo());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setText(existenciasdisponibles.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setText(existenciasdisponibles.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setText(existenciasdisponibles.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setText(existenciasdisponibles.getcodigo_producto());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setText(existenciasdisponibles.getnombre());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setText(existenciasdisponibles.getingresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setText(existenciasdisponibles.getegresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setText(existenciasdisponibles.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setText(existenciasdisponibles.getdiferencia().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setText(existenciasdisponibles.getdestino().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ExistenciasDisponibles existenciasdisponiblesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,existenciasdisponiblesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ExistenciasDisponibles existenciasdisponiblesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				existenciasdisponiblesLocal=this.existenciasdisponibles;
			} else {
				existenciasdisponiblesLocal=this.existenciasdisponiblesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(existenciasdisponiblesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoExistenciasDisponibles(existenciasdisponiblesLocal,true);
					
					if(existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(existenciasdisponiblesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(existenciasdisponiblesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualExistenciasDisponibles(existenciasdisponibles,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(existenciasdisponibles);
	}
	
	public void setVariablesFormularioToObjetoActualExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualExistenciasDisponibles(existenciasdisponibles,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.getText()==null || this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.getText()=="" || this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.getText()=="Id") {
				this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setText("0");
			}

			if(conColumnasBase) {existenciasdisponibles.setId(Long.parseLong(this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelIdExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setcodigo(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigoExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setnombre_unidad(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombre_unidadExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_disponibleExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setcantidad_fisica(Integer.parseInt(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcantidad_fisicaExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setcodigo_producto(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelcodigo_productoExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setnombre(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelnombreExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setingresos(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelingresosExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setegresos(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelegresosExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setdisponible_corte(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldisponible_corteExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setdiferencia(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldiferenciaExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciasdisponibles.setdestino(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasDisponibles.jLabeldestinoExistenciasDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualExistenciasDisponibles(ExistenciasDisponibles existenciasdisponiblesBean,ExistenciasDisponibles existenciasdisponibles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosExistenciasDisponibles(ExistenciasDisponibles existenciasdisponiblesOrigen,ExistenciasDisponibles existenciasdisponibles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getId()!=null && !existenciasdisponiblesOrigen.getId().equals(0L))) {existenciasdisponibles.setId(existenciasdisponiblesOrigen.getId());}}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getfecha_ultima_venta_hasta()!=null && !existenciasdisponiblesOrigen.getfecha_ultima_venta_hasta().equals(new Date()))) {existenciasdisponibles.setfecha_ultima_venta_hasta(existenciasdisponiblesOrigen.getfecha_ultima_venta_hasta());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getcodigo()!=null && !existenciasdisponiblesOrigen.getcodigo().equals(""))) {existenciasdisponibles.setcodigo(existenciasdisponiblesOrigen.getcodigo());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getnombre_unidad()!=null && !existenciasdisponiblesOrigen.getnombre_unidad().equals(""))) {existenciasdisponibles.setnombre_unidad(existenciasdisponiblesOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getcantidad_disponible()!=null && !existenciasdisponiblesOrigen.getcantidad_disponible().equals(0))) {existenciasdisponibles.setcantidad_disponible(existenciasdisponiblesOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getcantidad_fisica()!=null && !existenciasdisponiblesOrigen.getcantidad_fisica().equals(0))) {existenciasdisponibles.setcantidad_fisica(existenciasdisponiblesOrigen.getcantidad_fisica());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getcodigo_producto()!=null && !existenciasdisponiblesOrigen.getcodigo_producto().equals(""))) {existenciasdisponibles.setcodigo_producto(existenciasdisponiblesOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getnombre()!=null && !existenciasdisponiblesOrigen.getnombre().equals(""))) {existenciasdisponibles.setnombre(existenciasdisponiblesOrigen.getnombre());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getingresos()!=null && !existenciasdisponiblesOrigen.getingresos().equals(0.0))) {existenciasdisponibles.setingresos(existenciasdisponiblesOrigen.getingresos());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getegresos()!=null && !existenciasdisponiblesOrigen.getegresos().equals(0.0))) {existenciasdisponibles.setegresos(existenciasdisponiblesOrigen.getegresos());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getdisponible_corte()!=null && !existenciasdisponiblesOrigen.getdisponible_corte().equals(0.0))) {existenciasdisponibles.setdisponible_corte(existenciasdisponiblesOrigen.getdisponible_corte());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getdiferencia()!=null && !existenciasdisponiblesOrigen.getdiferencia().equals(0.0))) {existenciasdisponibles.setdiferencia(existenciasdisponiblesOrigen.getdiferencia());}
			if(conDefault || (!conDefault && existenciasdisponiblesOrigen.getdestino()!=null && !existenciasdisponiblesOrigen.getdestino().equals(0.0))) {existenciasdisponibles.setdestino(existenciasdisponiblesOrigen.getdestino());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setText(existenciasdisponibles.getId().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setText(existenciasdisponibles.getcodigo());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setText(existenciasdisponibles.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setText(existenciasdisponibles.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setText(existenciasdisponibles.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setText(existenciasdisponibles.getcodigo_producto());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setText(existenciasdisponibles.getnombre());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setText(existenciasdisponibles.getingresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setText(existenciasdisponibles.getegresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setText(existenciasdisponibles.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setText(existenciasdisponibles.getdiferencia().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setText(existenciasdisponibles.getdestino().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioExistenciasDisponibles(ExistenciasDisponiblesBean existenciasdisponiblesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setText(existenciasdisponiblesBean.getId().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setText(existenciasdisponiblesBean.getcodigo());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setText(existenciasdisponiblesBean.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setText(existenciasdisponiblesBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setText(existenciasdisponiblesBean.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setText(existenciasdisponiblesBean.getcodigo_producto());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setText(existenciasdisponiblesBean.getnombre());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setText(existenciasdisponiblesBean.getingresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setText(existenciasdisponiblesBean.getegresos().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setText(existenciasdisponiblesBean.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setText(existenciasdisponiblesBean.getdiferencia().toString());
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setText(existenciasdisponiblesBean.getdestino().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanExistenciasDisponibles(ExistenciasDisponiblesParameterReturnGeneral existenciasdisponiblesReturnGeneral,ExistenciasDisponiblesBean existenciasdisponiblesBean,Boolean conDefault) throws Exception { 
		try {
			ExistenciasDisponibles existenciasdisponiblesLocal=new ExistenciasDisponibles();
			
			existenciasdisponiblesLocal=existenciasdisponiblesReturnGeneral.getExistenciasDisponibles();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && existenciasdisponiblesLocal.getId()!=null && !existenciasdisponiblesLocal.getId().equals(0L))) {existenciasdisponiblesBean.setId(existenciasdisponiblesLocal.getId());}}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getcodigo()!=null && !existenciasdisponiblesLocal.getcodigo().equals(""))) {existenciasdisponiblesBean.setcodigo(existenciasdisponiblesLocal.getcodigo());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getnombre_unidad()!=null && !existenciasdisponiblesLocal.getnombre_unidad().equals(""))) {existenciasdisponiblesBean.setnombre_unidad(existenciasdisponiblesLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getcantidad_disponible()!=null && !existenciasdisponiblesLocal.getcantidad_disponible().equals(0))) {existenciasdisponiblesBean.setcantidad_disponible(existenciasdisponiblesLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getcantidad_fisica()!=null && !existenciasdisponiblesLocal.getcantidad_fisica().equals(0))) {existenciasdisponiblesBean.setcantidad_fisica(existenciasdisponiblesLocal.getcantidad_fisica());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getcodigo_producto()!=null && !existenciasdisponiblesLocal.getcodigo_producto().equals(""))) {existenciasdisponiblesBean.setcodigo_producto(existenciasdisponiblesLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getnombre()!=null && !existenciasdisponiblesLocal.getnombre().equals(""))) {existenciasdisponiblesBean.setnombre(existenciasdisponiblesLocal.getnombre());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getingresos()!=null && !existenciasdisponiblesLocal.getingresos().equals(0.0))) {existenciasdisponiblesBean.setingresos(existenciasdisponiblesLocal.getingresos());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getegresos()!=null && !existenciasdisponiblesLocal.getegresos().equals(0.0))) {existenciasdisponiblesBean.setegresos(existenciasdisponiblesLocal.getegresos());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getdisponible_corte()!=null && !existenciasdisponiblesLocal.getdisponible_corte().equals(0.0))) {existenciasdisponiblesBean.setdisponible_corte(existenciasdisponiblesLocal.getdisponible_corte());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getdiferencia()!=null && !existenciasdisponiblesLocal.getdiferencia().equals(0.0))) {existenciasdisponiblesBean.setdiferencia(existenciasdisponiblesLocal.getdiferencia());}
			if(conDefault || (!conDefault && existenciasdisponiblesLocal.getdestino()!=null && !existenciasdisponiblesLocal.getdestino().equals(0.0))) {existenciasdisponiblesBean.setdestino(existenciasdisponiblesLocal.getdestino());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxExistenciasDisponiblesGenerico(Long idExistenciasDisponiblesSeleccionado,JComboBox jComboBoxExistenciasDisponibles,List<ExistenciasDisponibles> existenciasdisponiblessLocal)throws Exception {
		try {
			ExistenciasDisponibles  existenciasdisponiblesTemp=null;

			for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessLocal) {
				if(existenciasdisponiblesAux.getId()!=null && existenciasdisponiblesAux.getId().equals(idExistenciasDisponiblesSeleccionado)) {
					existenciasdisponiblesTemp=existenciasdisponiblesAux;
					break;
				}
			}

			jComboBoxExistenciasDisponibles.setSelectedItem(existenciasdisponiblesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxExistenciasDisponiblesGenerico(JComboBox jComboBoxExistenciasDisponibles,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxExistenciasDisponibles.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxExistenciasDisponibles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxExistenciasDisponibles.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxExistenciasDisponibles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciasdisponibles=(ExistenciasDisponibles) existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			existenciasdisponibles =(ExistenciasDisponibles) existenciasdisponibless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!existenciasdisponibles.getIsNew() && !existenciasdisponibles.getIsChanged() && !existenciasdisponibles.getIsDeleted()) {
				sDescripcion=existenciasdisponibles.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciasdisponibles.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ExistenciasDisponibles existenciasdisponiblesRow=new ExistenciasDisponibles();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciasdisponiblesRow=(ExistenciasDisponibles) existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			existenciasdisponiblesRow=(ExistenciasDisponibles) existenciasdisponibless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualExistenciasDisponibles(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));			
			this.jButtonDuplicarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaDuplicarExistenciasDisponibles && this.isPermisoDuplicarExistenciasDisponibles));			
			this.jButtonCopiarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaCopiarExistenciasDisponibles && this.isPermisoCopiarExistenciasDisponibles));
			this.jButtonVerFormExistenciasDisponibles.setVisible((this.isVisibilidadCeldaVerFormExistenciasDisponibles && this.isPermisoVerFormExistenciasDisponibles));
			
			this.jButtonAbrirOrderByExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));			
			
			this.jButtonNuevoRelacionesExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));			
			this.jButtonNuevoGuardarCambiosExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaModificarExistenciasDisponibles && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaActualizarExistenciasDisponibles && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaEliminarExistenciasDisponibles && this.isPermisoEliminarExistenciasDisponibles));
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.setVisible(this.isVisibilidadCeldaCancelarExistenciasDisponibles);							
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));			
			
			}
						
			this.jButtonGuardarCambiosTablaExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));						
			this.jButtonDuplicarToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaDuplicarExistenciasDisponibles && this.isPermisoDuplicarExistenciasDisponibles));						
			this.jButtonCopiarToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaCopiarExistenciasDisponibles && this.isPermisoCopiarExistenciasDisponibles));			
			this.jButtonVerFormToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaVerFormExistenciasDisponibles && this.isPermisoVerFormExistenciasDisponibles));			
			this.jButtonAbrirOrderByToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));
			this.jButtonNuevoRelacionesToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));			
			this.jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));			
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaModificarExistenciasDisponibles && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaActualizarExistenciasDisponibles  && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaEliminarExistenciasDisponibles && this.isPermisoEliminarExistenciasDisponibles));
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarToolBarExistenciasDisponibles.setVisible(this.isVisibilidadCeldaCancelarExistenciasDisponibles);				
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));			
			this.jMenuItemDuplicarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaDuplicarExistenciasDisponibles && this.isPermisoDuplicarExistenciasDisponibles));			
			this.jMenuItemCopiarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaCopiarExistenciasDisponibles && this.isPermisoCopiarExistenciasDisponibles));			
			this.jMenuItemVerFormExistenciasDisponibles.setVisible((this.isVisibilidadCeldaVerFormExistenciasDisponibles && this.isPermisoVerFormExistenciasDisponibles));			
			this.jMenuItemAbrirOrderByExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));			
			//this.jMenuItemMostrarOcultarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));
			this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));			
			//this.jMenuItemDetalleMostrarOcultarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaOrdenExistenciasDisponibles && this.isPermisoOrdenExistenciasDisponibles));			
			this.jMenuItemNuevoRelacionesExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles));			
			this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles.setVisible((this.isVisibilidadCeldaNuevoExistenciasDisponibles && this.isPermisoNuevoExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));									
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemModificarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaModificarExistenciasDisponibles && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemActualizarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaActualizarExistenciasDisponibles && this.isPermisoActualizarExistenciasDisponibles));	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemEliminarExistenciasDisponibles.setVisible((this.isVisibilidadCeldaEliminarExistenciasDisponibles && this.isPermisoEliminarExistenciasDisponibles));
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemCancelarExistenciasDisponibles.setVisible(this.isVisibilidadCeldaCancelarExistenciasDisponibles);				
			}
			
			this.jMenuItemGuardarCambiosExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));						
			this.jMenuItemGuardarCambiosTablaExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=this.jButtonNuevoExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaDuplicarExistenciasDisponibles=this.jButtonDuplicarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaCopiarExistenciasDisponibles=this.jButtonCopiarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaVerFormExistenciasDisponibles=this.jButtonVerFormExistenciasDisponibles.isVisible();
			
			this.isVisibilidadCeldaOrdenExistenciasDisponibles=this.jButtonAbrirOrderByExistenciasDisponibles.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=this.jButtonNuevoRelacionesExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaModificarExistenciasDisponibles=this.jButtonModificarExistenciasDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=this.jButtonGuardarCambiosTablaExistenciasDisponibles.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=this.jButtonNuevoToolBarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=this.jButtonNuevoRelacionesToolBarExistenciasDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.isVisibilidadCeldaModificarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarToolBarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarToolBarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarToolBarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarToolBarExistenciasDisponibles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarExistenciasDisponibles=this.jButtonGuardarCambiosToolBarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=this.jMenuItemNuevoExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=this.jMenuItemNuevoRelacionesExistenciasDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.isVisibilidadCeldaModificarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemModificarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemActualizarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemEliminarExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemCancelarExistenciasDisponibles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarExistenciasDisponibles=this.jMenuItemGuardarCambiosExistenciasDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=this.jMenuItemGuardarCambiosTablaExistenciasDisponibles.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesExistenciasDisponibles(Boolean esInicializar) {
		if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
				//if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesExistenciasDisponibles();
			}
			
			this.inicializarActualizarBindingBotonesManualExistenciasDisponibles(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualExistenciasDisponibles() {
		this.jButtonNuevoExistenciasDisponibles.setVisible(this.isPermisoNuevoExistenciasDisponibles);			
		this.jButtonDuplicarExistenciasDisponibles.setVisible(this.isPermisoDuplicarExistenciasDisponibles);			
		this.jButtonCopiarExistenciasDisponibles.setVisible(this.isPermisoCopiarExistenciasDisponibles);			
		this.jButtonVerFormExistenciasDisponibles.setVisible(this.isPermisoVerFormExistenciasDisponibles);			
		
		this.jButtonAbrirOrderByExistenciasDisponibles.setVisible(this.isPermisoOrdenExistenciasDisponibles);					
		
		this.jButtonNuevoRelacionesExistenciasDisponibles.setVisible(this.isPermisoNuevoExistenciasDisponibles);			
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarExistenciasDisponibles.setVisible(this.isPermisoActualizarExistenciasDisponibles);	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.setVisible(this.isPermisoActualizarExistenciasDisponibles);	
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.setVisible(this.isPermisoEliminarExistenciasDisponibles);
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.setVisible(this.isVisibilidadCeldaCancelarExistenciasDisponibles);						
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.setVisible(this.isPermisoGuardarCambiosExistenciasDisponibles);							
		}
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.setVisible(this.isPermisoActualizarExistenciasDisponibles);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleExistenciasDisponibles() {
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarExistenciasDisponibles.setVisible(this.isPermisoActualizarExistenciasDisponibles);	
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.setVisible(this.isPermisoActualizarExistenciasDisponibles);	
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.setVisible(this.isPermisoEliminarExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.setVisible(this.isVisibilidadCeldaCancelarExistenciasDisponibles);							
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.setVisible((this.isVisibilidadCeldaGuardarExistenciasDisponibles && this.isPermisoGuardarCambiosExistenciasDisponibles));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosExistenciasDisponibles() {
		if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualExistenciasDisponibles();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesExistenciasDisponibles() {
	}
	
	public void jTableDatosExistenciasDisponiblesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarExistenciasDisponibles(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.existenciasdisponibles.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.existenciasdisponibles.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.existenciasdisponibles.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.existenciasdisponibles.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.existenciasdisponibles.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.existenciasdisponibles.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.existenciasdisponibles.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.existenciasdisponibles.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaExistenciasDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebExistenciasDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciasdisponiblesLogic.getConnexion());

				if(this.existenciasdisponibles.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.existenciasdisponibles.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasDisponibles=(TitledBorder)this.jScrollPanelDatosExistenciasDisponibles.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderExistenciasDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.existenciasdisponibles.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getfecha_ultima_venta_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta_hasta = '"+Funciones2.getStringPostgresDate(this.existenciasdisponibles.getfecha_ultima_venta_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.existenciasdisponibles.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.existenciasdisponibles.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.existenciasdisponibles.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_fisicaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getcantidad_fisica()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_fisica = "+this.existenciasdisponibles.getcantidad_fisica().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.existenciasdisponibles.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.existenciasdisponibles.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresosExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingresos = "+this.existenciasdisponibles.getingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonegresosExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getegresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where egresos = "+this.existenciasdisponibles.getegresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondisponible_corteExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getdisponible_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where disponible_corte = "+this.existenciasdisponibles.getdisponible_corte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiferenciaExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getdiferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where diferencia = "+this.existenciasdisponibles.getdiferencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondestinoExistenciasDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.getexistenciasdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciasdisponibles==null) {
						this.existenciasdisponibles = new ExistenciasDisponibles();
					}

					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);
				}

				if(this.existenciasdisponibles.getdestino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where destino = "+this.existenciasdisponibles.getdestino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaExistenciasDisponiblesExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessBusquedaExistenciasDisponibles();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdBodega();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdEmpresa();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdLinea();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdLineaCategoria();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdLineaGrupo();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdLineaMarca();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdProducto();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalExistenciasDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);

			this.getExistenciasDisponiblessFK_IdSucursal();

			this.inicializarActualizarBindingExistenciasDisponibles(false);

			//if(ExistenciasDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciasdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameExistenciasDisponibles() {
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.setVisible(false);	    			
			this.jInternalFrameDetalleFormExistenciasDisponibles.dispose();
			this.jInternalFrameDetalleFormExistenciasDisponibles=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
			this.jInternalFrameReporteDinamicoExistenciasDisponibles.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoExistenciasDisponibles.dispose();
			this.jInternalFrameReporteDinamicoExistenciasDisponibles=null;
		}
		
		if(this.jInternalFrameImportacionExistenciasDisponibles!=null) {
			this.jInternalFrameImportacionExistenciasDisponibles.setVisible(false);	    			
			this.jInternalFrameImportacionExistenciasDisponibles.dispose();
			this.jInternalFrameImportacionExistenciasDisponibles=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessExistenciasDisponibles();
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			
			if(sTipo.equals("NuevoExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarExistenciasDisponibles")) {
				jButtonDuplicarExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarExistenciasDisponibles")) {
				jButtonCopiarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("VerFormExistenciasDisponibles")) {
				jButtonVerFormExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarExistenciasDisponibles")) {
				jButtonDuplicarExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarExistenciasDisponibles")) {
				jButtonDuplicarExistenciasDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarExistenciasDisponibles")) {
				jButtonModificarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarExistenciasDisponibles")) {
				jButtonModificarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarExistenciasDisponibles")) {
				jButtonModificarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarExistenciasDisponibles")) {
				jButtonActualizarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarExistenciasDisponibles")) {
				jButtonActualizarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarExistenciasDisponibles")) {
				jButtonActualizarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("EliminarExistenciasDisponibles")) {
				jButtonEliminarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarExistenciasDisponibles")) {
				jButtonEliminarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarExistenciasDisponibles")) {
				jButtonEliminarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CancelarExistenciasDisponibles")) {
				jButtonCancelarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarExistenciasDisponibles")) {
				jButtonCancelarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarExistenciasDisponibles")) {
				jButtonCancelarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CerrarExistenciasDisponibles")) {
				jButtonCerrarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarExistenciasDisponibles")) {
				jButtonCerrarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarExistenciasDisponibles")) {
				jButtonCerrarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarExistenciasDisponibles")) {
				jButtonMostrarOcultarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarExistenciasDisponibles")) {
				jButtonCancelarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarExistenciasDisponibles")) {
				jButtonCopiarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarExistenciasDisponibles")) {
				jButtonVerFormExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarExistenciasDisponibles")) {
				jButtonCopiarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormExistenciasDisponibles")) {
				jButtonVerFormExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionExistenciasDisponibles")) {
				jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarExistenciasDisponibles")) {
				jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionExistenciasDisponibles")) {
				jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresExistenciasDisponibles")) {
				jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarExistenciasDisponibles")) {
				jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreExistenciasDisponibles")) {
				jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesExistenciasDisponibles")) {
				jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarExistenciasDisponibles")) {
				jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesExistenciasDisponibles")) {
				jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByExistenciasDisponibles") || sTipo.equals("MenuItemDetalleAbrirOrderByExistenciasDisponibles")) {
				jButtonAbrirOrderByExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarExistenciasDisponibles") || sTipo.equals("MenuItemDetalleMostrarOcultarExistenciasDisponibles")) {
				jButtonMostrarOcultarExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosExistenciasDisponibles")) {
				jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarExistenciasDisponibles")) {
				jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosExistenciasDisponibles")) {
				jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoExistenciasDisponibles")) {
				jButtonCerrarReporteDinamicoExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoExistenciasDisponibles")) {
				jButtonGenerarReporteDinamicoExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoExistenciasDisponibles")) {
				
				jButtonGenerarExcelReporteDinamicoExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionExistenciasDisponibles")) {
				jButtonCerrarImportacionExistenciasDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionExistenciasDisponibles")) {
				
				jButtonGenerarImportacionExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionExistenciasDisponibles")) {
				
				jButtonAbrirImportacionExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesExistenciasDisponibles")) {
				jComboBoxTiposAccionesExistenciasDisponiblesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesExistenciasDisponibles")) {
				jComboBoxTiposRelacionesExistenciasDisponiblesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioExistenciasDisponibles")) {
				jComboBoxTiposAccionesExistenciasDisponiblesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarExistenciasDisponibles")) {
				
				jComboBoxTiposSeleccionarExistenciasDisponiblesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralExistenciasDisponibles")) {
				jTextFieldValorCampoGeneralExistenciasDisponiblesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByExistenciasDisponibles")) {
				jButtonAbrirOrderByExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarExistenciasDisponibles")) {
				jButtonAbrirOrderByExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByExistenciasDisponibles")) {
				jButtonCerrarOrderByExistenciasDisponiblesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idExistenciasDisponiblesBusqueda")) {
				this.jButtonidExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaExistenciasDisponiblesUpdate")) {
				this.jButtonid_bodegaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_bodegaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoExistenciasDisponiblesUpdate")) {
				this.jButtonid_productoExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoExistenciasDisponiblesBusqueda")) {
				this.jButtonid_productoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaExistenciasDisponiblesUpdate")) {
				this.jButtonid_empresaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_empresaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalExistenciasDisponiblesUpdate")) {
				this.jButtonid_sucursalExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalExistenciasDisponiblesBusqueda")) {
				this.jButtonid_sucursalExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaExistenciasDisponiblesUpdate")) {
				this.jButtonid_lineaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_lineaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_grupoExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_grupoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_categoriaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_categoriaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_marcaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_marcaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoExistenciasDisponiblesBusqueda")) {
				this.jButtoncodigoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadExistenciasDisponiblesBusqueda")) {
				this.jButtonnombre_unidadExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleExistenciasDisponiblesBusqueda")) {
				this.jButtoncantidad_disponibleExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaExistenciasDisponiblesBusqueda")) {
				this.jButtoncantidad_fisicaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoExistenciasDisponiblesBusqueda")) {
				this.jButtoncodigo_productoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreExistenciasDisponiblesBusqueda")) {
				this.jButtonnombreExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosExistenciasDisponiblesBusqueda")) {
				this.jButtoningresosExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosExistenciasDisponiblesBusqueda")) {
				this.jButtonegresosExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteExistenciasDisponiblesBusqueda")) {
				this.jButtondisponible_corteExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diferenciaExistenciasDisponiblesBusqueda")) {
				this.jButtondiferenciaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoExistenciasDisponiblesBusqueda")) {
				this.jButtondestinoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaExistenciasDisponiblesExistenciasDisponibles")) {
				this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponiblesActionPerformed(evt);
			}
			
			;
			
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessExistenciasDisponibles();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ExistenciasDisponibles existenciasdisponiblesLocal=null;
			
			if(!this.getEsControlTabla()) {
				existenciasdisponiblesLocal=this.existenciasdisponibles;
			} else {
				existenciasdisponiblesLocal=this.existenciasdisponiblesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
							
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
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
			
			


			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
								
						
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
								
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
							
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
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
			
			


			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
								
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosExistenciasDisponibles")) {
					jCheckBoxSeleccionarTodosExistenciasDisponiblesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosExistenciasDisponibles")) {
					jCheckBoxSeleccionadosExistenciasDisponiblesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarExistenciasDisponibles")) {
					
				}
				
				


				
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
												
				
				


				
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
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
			
			


			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciasdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciasdisponibles);
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
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
				
				


				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasDisponibles.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciasdisponiblesAnterior =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarExistenciasDisponibles")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosExistenciasDisponiblesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosExistenciasDisponibles.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.existenciasdisponibles =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.existenciasdisponibles);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarExistenciasDisponibles")) {
				
				}
				
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarExistenciasDisponibles")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosExistenciasDisponibles.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarExistenciasDisponibles")) {
			
			}
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessExistenciasDisponibles();
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			if(sTipo.equals("NuevoExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarExistenciasDisponibles")) {
				jButtonDuplicarExistenciasDisponiblesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarExistenciasDisponibles")) {
				jButtonCopiarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormExistenciasDisponibles")) {
				jButtonVerFormExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesExistenciasDisponibles")) {
				jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarExistenciasDisponibles")) {
				jButtonModificarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarExistenciasDisponibles")) {
				jButtonActualizarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarExistenciasDisponibles")) {
				jButtonEliminarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarExistenciasDisponibles")) {
				jButtonCancelarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarExistenciasDisponibles")) {
				jButtonCerrarExistenciasDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosExistenciasDisponibles")) {
				jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosExistenciasDisponibles")) {
				jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByExistenciasDisponibles")) {
				jButtonAbrirOrderByExistenciasDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionExistenciasDisponibles")) {
				jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresExistenciasDisponibles")) {
				jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesExistenciasDisponibles")) {
				jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idExistenciasDisponiblesBusqueda")) {
				this.jButtonidExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaExistenciasDisponiblesUpdate")) {
				this.jButtonid_bodegaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_bodegaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoExistenciasDisponiblesUpdate")) {
				this.jButtonid_productoExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoExistenciasDisponiblesBusqueda")) {
				this.jButtonid_productoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaExistenciasDisponiblesUpdate")) {
				this.jButtonid_empresaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_empresaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalExistenciasDisponiblesUpdate")) {
				this.jButtonid_sucursalExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalExistenciasDisponiblesBusqueda")) {
				this.jButtonid_sucursalExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaExistenciasDisponiblesUpdate")) {
				this.jButtonid_lineaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_lineaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_grupoExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_grupoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_categoriaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_categoriaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasDisponiblesUpdate")) {
				this.jButtonid_linea_marcaExistenciasDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasDisponiblesBusqueda")) {
				this.jButtonid_linea_marcaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoExistenciasDisponiblesBusqueda")) {
				this.jButtoncodigoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadExistenciasDisponiblesBusqueda")) {
				this.jButtonnombre_unidadExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleExistenciasDisponiblesBusqueda")) {
				this.jButtoncantidad_disponibleExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaExistenciasDisponiblesBusqueda")) {
				this.jButtoncantidad_fisicaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoExistenciasDisponiblesBusqueda")) {
				this.jButtoncodigo_productoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreExistenciasDisponiblesBusqueda")) {
				this.jButtonnombreExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosExistenciasDisponiblesBusqueda")) {
				this.jButtoningresosExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosExistenciasDisponiblesBusqueda")) {
				this.jButtonegresosExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteExistenciasDisponiblesBusqueda")) {
				this.jButtondisponible_corteExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diferenciaExistenciasDisponiblesBusqueda")) {
				this.jButtondiferenciaExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoExistenciasDisponiblesBusqueda")) {
				this.jButtondestinoExistenciasDisponiblesBusquedaActionPerformed(evt);
			}
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessExistenciasDisponibles();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameExistenciasDisponibles")) {
				closingInternalFrameExistenciasDisponibles();
				
			} else if(sTipo.equals("jButtonCancelarExistenciasDisponibles")) {
				JInternalFrameBase jInternalFrameDetalleFormExistenciasDisponibles = (JInternalFrameBase)evt.getSource();
	            	
	            ExistenciasDisponiblesBeanSwingJInternalFrame jInternalFrameParent=(ExistenciasDisponiblesBeanSwingJInternalFrame)jInternalFrameDetalleFormExistenciasDisponibles.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarExistenciasDisponiblesActionPerformed(null);
			}
			
			ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.existenciasdisponibles,new Object(),this.existenciasdisponiblesParameterGeneral,this.existenciasdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormExistenciasDisponibles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormExistenciasDisponibles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormExistenciasDisponibles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.existenciasdisponibles)) {
			if(!esControlTabla) {
				if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);			
				}
				
				if(this.existenciasdisponiblesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral,this.existenciasdisponiblesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.existenciasdisponiblesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanExistenciasDisponibles(classes,this.existenciasdisponiblesReturnGeneral,this.existenciasdisponiblesBean,false);
					}
						
					if(this.existenciasdisponiblesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles());	
					}
						
					if(this.existenciasdisponiblesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles(),classes);//this.existenciasdisponiblesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioExistenciasDisponibles(this.existenciasdisponibles,classes);//this.existenciasdisponiblesBean);									
				}
			
				if(ExistenciasDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualExistenciasDisponibles(this.existenciasdisponibles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasDisponibles(this.existenciasdisponibles);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.existenciasdisponiblesAnterior!=null) {
						this.existenciasdisponibles=this.existenciasdisponiblesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.existenciasdisponiblesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles(),existenciasdisponiblesLogic.getExistenciasDisponibless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibles(),this.existenciasdisponibless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosExistenciasDisponibles.repaint();
				
				//((AbstractTableModel) this.jTableDatosExistenciasDisponibles.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosExistenciasDisponibles();
			}
		}
	}
	
	public void actualizarVisualTableDatosExistenciasDisponibles() throws Exception {
		
		ExistenciasDisponiblesModel existenciasdisponiblesModel=(ExistenciasDisponiblesModel)this.jTableDatosExistenciasDisponibles.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciasdisponiblesModel.existenciasdisponibless=this.existenciasdisponiblesLogic.getExistenciasDisponibless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			existenciasdisponiblesModel.existenciasdisponibless=this.existenciasdisponibless;
		}
		
		
		((ExistenciasDisponiblesModel) this.jTableDatosExistenciasDisponibles.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaExistenciasDisponibles() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getexistenciasdisponiblesAnterior(),this.existenciasdisponiblesLogic.getExistenciasDisponibless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getexistenciasdisponiblesAnterior(),this.existenciasdisponibless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosExistenciasDisponibles();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
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
										
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.existenciasdisponibles,new Object(),generalEntityParameterGeneral,this.existenciasdisponiblesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ExistenciasDisponiblesConstantesFunciones.getClassesRelationshipsOfExistenciasDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ExistenciasDisponiblesConstantesFunciones.getClassesRelationshipsFromStringsOfExistenciasDisponibles(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormExistenciasDisponibles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.existenciasdisponibles,new Object(),generalEntityParameterGeneral,this.existenciasdisponiblesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioExistenciasDisponibles(ExistenciasDisponiblesBean existenciasdisponiblesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanExistenciasDisponibles(ArrayList<Classe> classes,ExistenciasDisponiblesReturnGeneral existenciasdisponiblesReturnGeneral,ExistenciasDisponiblesBean existenciasdisponiblesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.existenciasdisponibles)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormExistenciasDisponibles = new ExistenciasDisponiblesDetalleFormJInternalFrame(jDesktopPane,this.existenciasdisponiblesSessionBean.getConGuardarRelaciones(),this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.setVisible(false);
		this.jInternalFrameDetalleFormExistenciasDisponibles.setSelected(false);						
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.existenciasdisponiblesLogic=this.existenciasdisponiblesLogic;
		
		this.cargarCombosFrameForeignKeyExistenciasDisponibles("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleExistenciasDisponibles();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleExistenciasDisponibles();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyExistenciasDisponibles("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyExistenciasDisponibles();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarExistenciasDisponibles"));
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ModificarExistenciasDisponibles"));

		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ModificarToolBarExistenciasDisponibles"));
					
		this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemModificarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemModificarExistenciasDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"ActualizarExistenciasDisponibles"));
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarExistenciasDisponibles"));
						
		this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemActualizarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarExistenciasDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"EliminarExistenciasDisponibles"));
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"EliminarToolBarExistenciasDisponibles"));
								
		this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemEliminarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarExistenciasDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CancelarExistenciasDisponibles"));
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CancelarToolBarExistenciasDisponibles"));
					
		this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemCancelarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarExistenciasDisponibles"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemDetalleCerrarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarExistenciasDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasDisponibles"));
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasDisponibles"));
		
		
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioExistenciasDisponibles"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonidExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombre_unidadExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigo_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombreExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoningresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"ingresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonegresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"egresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondisponible_corteExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondiferenciaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondestinoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"destinoExistenciasDisponiblesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesExistenciasDisponibles"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameExistenciasDisponibles"));
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarExistenciasDisponibles"));
		}
		
		this.jTableDatosExistenciasDisponibles.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarExistenciasDisponibles"));
		
		this.jTableDatosExistenciasDisponibles.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarExistenciasDisponibles"));
		
		this.jButtonNuevoExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"NuevoExistenciasDisponibles"));
		
		this.jButtonDuplicarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"DuplicarExistenciasDisponibles"));
		
		this.jButtonCopiarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"CopiarExistenciasDisponibles"));
		
		this.jButtonVerFormExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"VerFormExistenciasDisponibles"));
		
		
		this.jButtonNuevoToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"NuevoToolBarExistenciasDisponibles"));
			
		this.jButtonDuplicarToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"DuplicarToolBarExistenciasDisponibles"));
			
		this.jMenuItemNuevoExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoExistenciasDisponibles"));
			
		this.jMenuItemDuplicarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarExistenciasDisponibles"));		
		
		
		this.jButtonNuevoRelacionesExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"NuevoRelacionesExistenciasDisponibles"));
		
		
		this.jButtonNuevoRelacionesToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarExistenciasDisponibles"));
			
		this.jMenuItemNuevoRelacionesExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesExistenciasDisponibles"));		
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ModificarExistenciasDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonModificarToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ModificarToolBarExistenciasDisponibles"));
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemModificarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemModificarExistenciasDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"ActualizarExistenciasDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonActualizarToolBarExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarExistenciasDisponibles"));
				
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemActualizarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarExistenciasDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"EliminarExistenciasDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonEliminarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"EliminarToolBarExistenciasDisponibles"));
						
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemEliminarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarExistenciasDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CancelarExistenciasDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonCancelarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CancelarToolBarExistenciasDisponibles"));
			
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemCancelarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarExistenciasDisponibles"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarExistenciasDisponibles"));		
		
		
		this.jButtonCerrarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CerrarExistenciasDisponibles"));
		
		
		this.jButtonCerrarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CerrarToolBarExistenciasDisponibles"));
			
		this.jMenuItemCerrarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCerrarExistenciasDisponibles"));
			
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jMenuItemDetalleCerrarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarExistenciasDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosExistenciasDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasDisponibles"));
		}
		
		this.jButtonCopiarToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CopiarToolBarExistenciasDisponibles"));
			
		this.jButtonVerFormToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"VerFormToolBarExistenciasDisponibles"));
		
		this.jMenuItemGuardarCambiosExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosExistenciasDisponibles"));
			
		this.jMenuItemCopiarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCopiarExistenciasDisponibles"));		
		
		this.jMenuItemVerFormExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemVerFormExistenciasDisponibles"));		
		
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaExistenciasDisponibles"));
		
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarExistenciasDisponibles"));
			
		this.jMenuItemGuardarCambiosTablaExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaExistenciasDisponibles"));		
		
		
		
		this.jButtonRecargarInformacionExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"RecargarInformacionExistenciasDisponibles"));
					
		this.jButtonRecargarInformacionToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarExistenciasDisponibles"));
		
		this.jMenuItemRecargarInformacionExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionExistenciasDisponibles"));		
		
		
		
		this.jButtonAnterioresExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"AnterioresExistenciasDisponibles"));
		
		
		this.jButtonAnterioresToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"AnterioresToolBarExistenciasDisponibles"));
		
		this.jMenuItemAnterioresExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresExistenciasDisponibles"));		
		
		
		this.jButtonSiguientesExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"SiguientesExistenciasDisponibles"));
		
		
		this.jButtonSiguientesToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"SiguientesToolBarExistenciasDisponibles"));
			
		this.jMenuItemSiguientesExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesExistenciasDisponibles"));
			
		this.jMenuItemAbrirOrderByExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByExistenciasDisponibles"));
			
		this.jMenuItemMostrarOcultarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarExistenciasDisponibles"));
			
		this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByExistenciasDisponibles"));
			
		this.jMenuItemDetalleMostarOcultarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarExistenciasDisponibles"));		
		
		
		this.jButtonNuevoGuardarCambiosExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosExistenciasDisponibles"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarExistenciasDisponibles"));
			
		this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosExistenciasDisponibles"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosExistenciasDisponibles"));

		this.jCheckBoxSeleccionadosExistenciasDisponibles.addItemListener(new CheckBoxItemListener(this,"SeleccionadosExistenciasDisponibles"));
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioExistenciasDisponibles"));
		}
		
		
		this.jComboBoxTiposRelacionesExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"TiposRelacionesExistenciasDisponibles"));
			
		this.jComboBoxTiposAccionesExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesExistenciasDisponibles"));
					
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"TiposSeleccionarExistenciasDisponibles"));
			
		this.jTextFieldValorCampoGeneralExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralExistenciasDisponibles"));		
		
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonidExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombre_unidadExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigo_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombreExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoningresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"ingresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonegresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"egresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondisponible_corteExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondiferenciaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondestinoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"destinoExistenciasDisponiblesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"BusquedaExistenciasDisponiblesExistenciasDisponibles"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoExistenciasDisponibles!=null) {
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasDisponibles"));
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasDisponibles"));
				this.jInternalFrameReporteDinamicoExistenciasDisponibles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasDisponibles"));
			}
			
			//this.jButtonCerrarReporteDinamicoExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasDisponibles"));				
			//this.jButtonGenerarReporteDinamicoExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasDisponibles"));
			//this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasDisponibles"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionExistenciasDisponibles!=null) {
				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionExistenciasDisponibles"));
				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionExistenciasDisponibles"));
				this.jInternalFrameImportacionExistenciasDisponibles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionExistenciasDisponibles"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"AbrirOrderByExistenciasDisponibles"));
			
			this.jButtonAbrirOrderByToolBarExistenciasDisponibles.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarExistenciasDisponibles"));			
			
			if(this.jInternalFrameOrderByExistenciasDisponibles!=null) {
				this.jInternalFrameOrderByExistenciasDisponibles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByExistenciasDisponibles"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasDisponibles.jTabbedPaneRelacionesExistenciasDisponibles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesExistenciasDisponibles"));
		
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
            		closingInternalFrameExistenciasDisponibles();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormExistenciasDisponibles = (JInternalFrameBase)event.getSource();
	            	
	            ExistenciasDisponiblesBeanSwingJInternalFrame jInternalFrameParent=(ExistenciasDisponiblesBeanSwingJInternalFrame)jInternalFrameDetalleFormExistenciasDisponibles.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarExistenciasDisponiblesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosExistenciasDisponibles.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosExistenciasDisponiblesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosExistenciasDisponibles.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosExistenciasDisponibles.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoExistenciasDisponibles";
		inputMap = this.jButtonNuevoExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesExistenciasDisponibles";
		inputMap = this.jButtonNuevoRelacionesExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoExistenciasDisponiblesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarExistenciasDisponibles";
		inputMap = this.jButtonModificarExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarExistenciasDisponibles";
		inputMap = this.jButtonActualizarExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarExistenciasDisponibles";
		inputMap = this.jButtonEliminarExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarExistenciasDisponibles";
		inputMap = this.jButtonCancelarExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarExistenciasDisponibles";
		inputMap = this.jButtonCerrarExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosExistenciasDisponibles";
		inputMap = this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonGuardarCambiosExistenciasDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosExistenciasDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosExistenciasDisponibles.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosExistenciasDisponiblesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesExistenciasDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesExistenciasDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarExistenciasDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarExistenciasDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralExistenciasDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralExistenciasDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonidExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_bodegaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_empresaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_sucursalExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_lineaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombre_unidadExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoncodigo_productoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonnombreExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtoningresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"ingresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtonegresosExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"egresosExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondisponible_corteExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondiferenciaExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaExistenciasDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasDisponibles.jButtondestinoExistenciasDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"destinoExistenciasDisponiblesBusqueda"));
		
		
		this.jButtonBusquedaExistenciasDisponiblesExistenciasDisponibles.addActionListener(new ButtonActionListener(this,"BusquedaExistenciasDisponiblesExistenciasDisponibles"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionExistenciasDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionExistenciasDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarExistenciasDisponiblesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarExistenciasDisponibles.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosExistenciasDisponibles(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
					existenciasdisponiblesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponibless) {
					existenciasdisponiblesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosExistenciasDisponiblesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
						existenciasdisponiblesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponibless) {
						existenciasdisponiblesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponibless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosExistenciasDisponibles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosExistenciasDisponibles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosExistenciasDisponiblesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosExistenciasDisponibles.getSelectedRows();
			
			ExistenciasDisponibles existenciasdisponiblesLocal=new ExistenciasDisponibles();
			
			//this.seleccionarTodosExistenciasDisponibles(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					existenciasdisponiblesLocal =(ExistenciasDisponibles) this.existenciasdisponiblesLogic.getExistenciasDisponibless().toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					existenciasdisponiblesLocal =(ExistenciasDisponibles) this.existenciasdisponibless.toArray()[this.jTableDatosExistenciasDisponibles.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				existenciasdisponiblesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
						existenciasdisponiblesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponibless) {
						existenciasdisponiblesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosExistenciasDisponibles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosExistenciasDisponibles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosExistenciasDisponibles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualExistenciasDisponiblesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarExistenciasDisponiblesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralExistenciasDisponiblesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralExistenciasDisponibles.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponiblesLogic.getExistenciasDisponibless()) {
				
						if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							existenciasdisponiblesAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							existenciasdisponiblesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							existenciasdisponiblesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							existenciasdisponiblesAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							existenciasdisponiblesAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							existenciasdisponiblesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							existenciasdisponiblesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							existenciasdisponiblesAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							existenciasdisponiblesAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							existenciasdisponiblesAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA)) {
							existe=true;
							existenciasdisponiblesAux.setdiferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							existenciasdisponiblesAux.setdestino(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponibless) {
					
						if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							existenciasdisponiblesAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							existenciasdisponiblesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							existenciasdisponiblesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							existenciasdisponiblesAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							existenciasdisponiblesAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							existenciasdisponiblesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							existenciasdisponiblesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							existenciasdisponiblesAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							existenciasdisponiblesAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							existenciasdisponiblesAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA)) {
							existe=true;
							existenciasdisponiblesAux.setdiferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							existenciasdisponiblesAux.setdestino(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesExistenciasDisponiblesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioExistenciasDisponibles=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesExistenciasDisponibles.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteExistenciasDisponibles) {				
					conSplash=true;//false;										
					
					//this.startProcessExistenciasDisponibles(conSplash);
				
					this.generarReporteExistenciasDisponiblessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoExistenciasDisponiblessSeleccionados();
				//this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoExistenciasDisponiblessSeleccionados(false);
				//this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoExistenciasDisponiblessSeleccionados(true);
				//this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessExistenciasDisponibles();
				
				this.exportarExistenciasDisponiblessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionExistenciasDisponibless();
				//this.importarExistenciasDisponibless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessExistenciasDisponibles();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelExistenciasDisponiblessSeleccionados();
				//this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Existencias Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessExistenciasDisponibles();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoExistenciasDisponibles)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyExistenciasDisponibles(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
				}	
			} 			
			else if(ExistenciasDisponiblesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteExistenciasDisponibles) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessExistenciasDisponibles(conSplash);
					
						//this.actualizarParametrosGeneralExistenciasDisponibles();
						
						this.generarReporteProcesoAccionExistenciasDisponiblessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Existencias DisponiblesES SELECCIONADOS?", "MANTENIMIENTO DE Existencias Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessExistenciasDisponibles();
				
						this.actualizarParametrosGeneralExistenciasDisponibles();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.existenciasdisponiblesReturnGeneral=existenciasdisponiblesLogic.procesarAccionExistenciasDisponiblessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.existenciasdisponiblesLogic.getExistenciasDisponibless(),this.existenciasdisponiblesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarExistenciasDisponiblesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralExistenciasDisponibles();
					
					ExistenciasDisponiblesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarExistenciasDisponiblesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesExistenciasDisponibles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessExistenciasDisponibles(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesExistenciasDisponiblesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessExistenciasDisponibles();
			
			if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
			ExistenciasDisponibles existenciasdisponibles=new ExistenciasDisponibles();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingExistenciasDisponibles(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesExistenciasDisponibles.getSelectedItem();
			
			
			
			
			existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
			//this.sTipoAccion;
			
			if(existenciasdisponiblessSeleccionados.size()==1) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
					existenciasdisponibles=existenciasdisponiblesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessExistenciasDisponibles();
			
      		//this.finishProcessExistenciasDisponibles(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarExistenciasDisponiblesReturnGeneral() throws Exception {
		if(this.existenciasdisponiblesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.existenciasdisponiblesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.existenciasdisponiblesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.existenciasdisponiblesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.existenciasdisponiblesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.existenciasdisponiblesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingExistenciasDisponibles(false);
		}
		
		if(this.existenciasdisponiblesReturnGeneral.getConRetornoLista() || this.existenciasdisponiblesReturnGeneral.getConRetornoObjeto()) {
			if(this.existenciasdisponiblesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.existenciasdisponiblesLogic.setExistenciasDisponibless(this.existenciasdisponiblesReturnGeneral.getExistenciasDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingExistenciasDisponibles(false);
		}
	}
	
	public void actualizarParametrosGeneralExistenciasDisponibles() throws Exception {
		
		
	}
	
	public ArrayList<ExistenciasDisponibles> getExistenciasDisponiblessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioExistenciasDisponibles) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblesLogic.getExistenciasDisponibless()) {
					if(existenciasdisponiblesAux.getIsSelected()) {
						existenciasdisponiblessSeleccionados.add(existenciasdisponiblesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasDisponibles existenciasdisponiblesAux:this.existenciasdisponibless) {
					if(existenciasdisponiblesAux.getIsSelected()) {
						existenciasdisponiblessSeleccionados.add(existenciasdisponiblesAux);				
					}
				}
			}
			
			if(existenciasdisponiblessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						existenciasdisponiblessSeleccionados.addAll(this.existenciasdisponiblesLogic.getExistenciasDisponibless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						existenciasdisponiblessSeleccionados.addAll(this.existenciasdisponibless);				
					}
				}
			}
		} else {
			existenciasdisponiblessSeleccionados.add(this.existenciasdisponibles);
		}
		
		return existenciasdisponiblessSeleccionados;
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
	
	public void generarReporteExistenciasDisponiblessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalExistenciasDisponiblessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoExistenciasDisponiblessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoExistenciasDisponiblessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoExistenciasDisponiblessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Existencias Disponibles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados);
		
	}	
	
	public void generarReporteNormalExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionExistenciasDisponiblessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		
		this.abrirInicializarFrameReporteDinamicoExistenciasDisponibles();
		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoExistenciasDisponibles();
		
		
		//this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados ,existenciasdisponiblesImplementable,existenciasdisponiblesImplementableHome);
	}
	
	public void mostrarImportacionExistenciasDisponibless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionExistenciasDisponibles();
		
		this.abrirFrameImportacionExistenciasDisponibles();		
		
			
		//this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados ,existenciasdisponiblesImplementable,existenciasdisponiblesImplementableHome);
	}
	
	public void importarExistenciasDisponibless() throws Exception {		
	
	}
	
	public void exportarExistenciasDisponiblessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelExistenciasDisponiblessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoExistenciasDisponiblessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlExistenciasDisponiblessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Existencias Disponibles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarExistenciasDisponibles(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarExistenciasDisponibles(existenciasdisponiblesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//existenciasdisponiblesAux.setsDetalleGeneralEntityReporte(existenciasdisponiblesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarExistenciasDisponibles(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=existenciasdisponibles.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getfecha_ultima_venta_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getcantidad_fisica().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getegresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getdisponible_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getdiferencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciasdisponibles.getdestino().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ExistenciasDisponibless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelExistenciasDisponibles(row);				
				iRow++;
			}				
			
			for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelExistenciasDisponibles(existenciasdisponiblesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlExistenciasDisponiblessSeleccionados() throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();		
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciasdisponibles.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("existenciasdisponibless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("existenciasdisponibles");
			//elementRoot.appendChild(element);
		
			for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
				element = document.createElement("existenciasdisponibles");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlExistenciasDisponibles(existenciasdisponiblesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelExistenciasDisponibles(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getfecha_ultima_venta_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getcantidad_fisica());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getegresos());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getdisponible_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getdiferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciasdisponibles.getdestino());				
	}
	
	public void setFilaDatosExportarXmlExistenciasDisponibles(ExistenciasDisponibles existenciasdisponibles,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ExistenciasDisponiblesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(existenciasdisponibles.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ExistenciasDisponiblesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(existenciasdisponibles.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ExistenciasDisponiblesConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(existenciasdisponibles.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_ultima_venta_hasta = document.createElement(ExistenciasDisponiblesConstantesFunciones.FECHAULTIMAVENTAHASTA);
		elementfecha_ultima_venta_hasta.appendChild(document.createTextNode(existenciasdisponibles.getfecha_ultima_venta_hasta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta_hasta);

		Element elementcodigo = document.createElement(ExistenciasDisponiblesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(existenciasdisponibles.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_unidad = document.createElement(ExistenciasDisponiblesConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(existenciasdisponibles.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(ExistenciasDisponiblesConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(existenciasdisponibles.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementcantidad_fisica = document.createElement(ExistenciasDisponiblesConstantesFunciones.CANTIDADFISICA);
		elementcantidad_fisica.appendChild(document.createTextNode(existenciasdisponibles.getcantidad_fisica().toString().trim()));
		element.appendChild(elementcantidad_fisica);

		Element elementcodigo_producto = document.createElement(ExistenciasDisponiblesConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(existenciasdisponibles.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre = document.createElement(ExistenciasDisponiblesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(existenciasdisponibles.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementingresos = document.createElement(ExistenciasDisponiblesConstantesFunciones.INGRESOS);
		elementingresos.appendChild(document.createTextNode(existenciasdisponibles.getingresos().toString().trim()));
		element.appendChild(elementingresos);

		Element elementegresos = document.createElement(ExistenciasDisponiblesConstantesFunciones.EGRESOS);
		elementegresos.appendChild(document.createTextNode(existenciasdisponibles.getegresos().toString().trim()));
		element.appendChild(elementegresos);

		Element elementdisponible_corte = document.createElement(ExistenciasDisponiblesConstantesFunciones.DISPONIBLECORTE);
		elementdisponible_corte.appendChild(document.createTextNode(existenciasdisponibles.getdisponible_corte().toString().trim()));
		element.appendChild(elementdisponible_corte);

		Element elementdiferencia = document.createElement(ExistenciasDisponiblesConstantesFunciones.DIFERENCIA);
		elementdiferencia.appendChild(document.createTextNode(existenciasdisponibles.getdiferencia().toString().trim()));
		element.appendChild(elementdiferencia);

		Element elementdestino = document.createElement(ExistenciasDisponiblesConstantesFunciones.DESTINO);
		elementdestino.appendChild(document.createTextNode(existenciasdisponibles.getdestino().toString().trim()));
		element.appendChild(elementdestino);
	}
	
	public void generarReporteGroupGenericoExistenciasDisponiblessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados=new ArrayList<ExistenciasDisponibles>();
		
		existenciasdisponiblessSeleccionados=this.getExistenciasDisponiblessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoExistenciasDisponibles(existenciasdisponiblessSeleccionados);
		
		this.generarReporteExistenciasDisponibless("Todos",existenciasdisponiblessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoExistenciasDisponibles(ArrayList<ExistenciasDisponibles> existenciasdisponiblessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ExistenciasDisponibles existenciasdisponiblesAux:existenciasdisponiblessSeleccionados) {
				existenciasdisponiblesAux.setsDetalleGeneralEntityReporte(existenciasdisponiblesAux.toString());
			
				if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(existenciasdisponiblesAux.getfecha_ultima_venta_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getcantidad_fisica().toString());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					existenciasdisponiblesAux.setsDescripcionGeneralEntityReporte1(existenciasdisponiblesAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesExistenciasDisponibles(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoExistenciasDisponibles=true;
				this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=true;
				this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=true;
			}
			
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=true;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=true;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=true;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=true;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=true;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=true;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
			this.isVisibilidadCeldaModificarExistenciasDisponibles=true;
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
			this.isVisibilidadCeldaCancelarExistenciasDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=true;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=true;
		} else {
			this.actualizarEstadoPanelsExistenciasDisponibles(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarExistenciasDisponibles=false;
			//this.isVisibilidadCeldaVerFormExistenciasDisponibles=false;
			this.isVisibilidadCeldaDuplicarExistenciasDisponibles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
		} else {
			this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(!existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;												
			}
			
			this.jButtonCerrarExistenciasDisponibles.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
		}
		
		if(!this.permiteMantenimiento(this.existenciasdisponibles)) {
			this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
			this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoExistenciasDisponibles=false;
		this.isVisibilidadCeldaNuevoRelacionesExistenciasDisponibles=false;
		this.isVisibilidadCeldaGuardarCambiosExistenciasDisponibles=false;
		//this.isVisibilidadCeldaModificarExistenciasDisponibles=true;
		this.isVisibilidadCeldaActualizarExistenciasDisponibles=false;
		this.isVisibilidadCeldaEliminarExistenciasDisponibles=false;
		//this.isVisibilidadCeldaCancelarExistenciasDisponibles=true;			
		this.isVisibilidadCeldaGuardarExistenciasDisponibles=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesExistenciasDisponibles() {
	}
	
	public void actualizarEstadoPanelsExistenciasDisponibles(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionExistenciasDisponibles!=null) {
				this.jScrollPanelDatosEdicionExistenciasDisponibles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasDisponibles!=null) {
				this.jScrollPanelDatosExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasDisponibles!=null) {
				this.jPanelPaginacionExistenciasDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
					this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasDisponibles!=null) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesExistenciasDisponibles!=null) {
				this.jPanelParametrosReportesExistenciasDisponibles.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaBodega;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaProducto;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaLinea;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaExistenciasDisponibles=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaExistenciasDisponibles) {this.jTabbedPaneBusquedasExistenciasDisponibles.remove(jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);}
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
			
			this.inicializarActualizarBindingTablaExistenciasDisponibles(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioExistenciasDisponibles() {
		this.updateBorderResaltarBusquedasFormularioExistenciasDisponibles();
		this.updateVisibilidadBusquedasFormularioExistenciasDisponibles();
		this.updateHabilitarBusquedasFormularioExistenciasDisponibles();
	}
	
	public void updateBorderResaltarBusquedasFormularioExistenciasDisponibles() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasExistenciasDisponibles.getComponents().length>0) {
	

		if(this.existenciasdisponiblesConstantesFunciones.resaltarBusquedaExistenciasDisponiblesExistenciasDisponibles!=null) {
			index= this.jTabbedPaneBusquedasExistenciasDisponibles.indexOfComponent(this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasDisponibles.getComponent(index);
				jPanel.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarBusquedaExistenciasDisponiblesExistenciasDisponibles);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioExistenciasDisponibles() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasExistenciasDisponibles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasExistenciasDisponibles.indexOfComponent(this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);
			jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasDisponibles.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarBusquedaExistenciasDisponiblesExistenciasDisponibles);
			if(!this.existenciasdisponiblesConstantesFunciones.mostrarBusquedaExistenciasDisponiblesExistenciasDisponibles && index>-1) {
				this.jTabbedPaneBusquedasExistenciasDisponibles.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioExistenciasDisponibles() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasExistenciasDisponibles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasExistenciasDisponibles.indexOfComponent(this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasDisponibles.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarBusquedaExistenciasDisponiblesExistenciasDisponibles);
				this.jTabbedPaneBusquedasExistenciasDisponibles.setEnabledAt(index,this.existenciasdisponiblesConstantesFunciones.activarBusquedaExistenciasDisponiblesExistenciasDisponibles);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaExistenciasDisponibles(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaExistenciasDisponibles")) {
			index= this.jTabbedPaneBusquedasExistenciasDisponibles.indexOfComponent(this.jPanelBusquedaExistenciasDisponiblesExistenciasDisponibles);

			this.jTabbedPaneBusquedasExistenciasDisponibles.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasDisponibles.getComponent(index);

			this.existenciasdisponiblesConstantesFunciones.setResaltarBusquedaExistenciasDisponiblesExistenciasDisponibles(resaltar);

			jPanel.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarBusquedaExistenciasDisponiblesExistenciasDisponibles);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarExistenciasDisponibles.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioExistenciasDisponibles() throws Exception {

		if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioExistenciasDisponibles();
		this.updateVisibilidadResaltarControlesFormularioExistenciasDisponibles();
		this.updateHabilitarResaltarControlesFormularioExistenciasDisponibles();
		
	}
	
	public void updateBorderResaltarControlesFormularioExistenciasDisponibles() throws Exception {
		if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.existenciasdisponiblesConstantesFunciones.resaltaridExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltaridExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_bodegaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_bodegaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_productoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_productoExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_empresaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_empresaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_sucursalExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_sucursalExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_lineaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_lineaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_grupoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_grupoExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_categoriaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_categoriaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_marcaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarid_linea_marcaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarfecha_ultima_venta_hastaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarfecha_ultima_venta_hastaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarcodigoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarcodigoExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarnombre_unidadExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarnombre_unidadExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_disponibleExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_disponibleExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_fisicaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarcantidad_fisicaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarcodigo_productoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarcodigo_productoExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltarnombreExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltarnombreExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltaringresosExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltaringresosExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltaregresosExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltaregresosExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltardisponible_corteExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltardisponible_corteExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltardiferenciaExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltardiferenciaExistenciasDisponibles);}
		if(this.existenciasdisponiblesConstantesFunciones.resaltardestinoExistenciasDisponibles!=null && this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setBorder(this.existenciasdisponiblesConstantesFunciones.resaltardestinoExistenciasDisponibles);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioExistenciasDisponibles() throws Exception {		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
	
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraridExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelidExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraridExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_bodegaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_bodegaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_bodegaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_productoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_productoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_productoExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_empresaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_empresaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_empresaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_sucursalExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_sucursalExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_sucursalExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_lineaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_lineaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_lineaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_grupoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_linea_grupoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_grupoExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_categoriaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_linea_categoriaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_categoriaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_marcaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelid_linea_marcaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarid_linea_marcaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarfecha_ultima_venta_hastaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarfecha_ultima_venta_hastaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcodigoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelcodigoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcodigoExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarnombre_unidadExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelnombre_unidadExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarnombre_unidadExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_disponibleExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelcantidad_disponibleExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_disponibleExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_fisicaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelcantidad_fisicaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcantidad_fisicaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcodigo_productoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelcodigo_productoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarcodigo_productoExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarnombreExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelnombreExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrarnombreExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraringresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelingresosExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraringresosExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraregresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPanelegresosExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostraregresosExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardisponible_corteExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPaneldisponible_corteExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardisponible_corteExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardiferenciaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPaneldiferenciaExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardiferenciaExistenciasDisponibles);
		//this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardestinoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jPaneldestinoExistenciasDisponibles.setVisible(this.existenciasdisponiblesConstantesFunciones.mostrardestinoExistenciasDisponibles);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioExistenciasDisponibles() throws Exception {
		if(this.jInternalFrameDetalleFormExistenciasDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormExistenciasDisponibles!=null) {
	
		this.jInternalFrameDetalleFormExistenciasDisponibles.jLabelidExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activaridExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_bodegaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_bodegaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_productoExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_productoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_empresaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_empresaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_sucursalExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_sucursalExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_lineaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_lineaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_grupoExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_linea_grupoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_categoriaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_linea_categoriaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jComboBoxid_linea_marcaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarid_linea_marcaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarfecha_ultima_venta_hastaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreacodigoExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarcodigoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldnombre_unidadExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarnombre_unidadExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_disponibleExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarcantidad_disponibleExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcantidad_fisicaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarcantidad_fisicaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldcodigo_productoExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarcodigo_productoExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextAreanombreExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activarnombreExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldingresosExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activaringresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFieldegresosExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activaregresosExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddisponible_corteExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activardisponible_corteExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddiferenciaExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activardiferenciaExistenciasDisponibles);
		this.jInternalFrameDetalleFormExistenciasDisponibles.jTextFielddestinoExistenciasDisponibles.setEnabled(this.existenciasdisponiblesConstantesFunciones.activardestinoExistenciasDisponibles);
		}
	}
	
		
}