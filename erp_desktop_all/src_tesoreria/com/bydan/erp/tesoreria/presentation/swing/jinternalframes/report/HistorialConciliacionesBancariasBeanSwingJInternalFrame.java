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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.HistorialConciliacionesBancariasConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.HistorialConciliacionesBancariasParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.HistorialConciliacionesBancariasParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.HistorialConciliacionesBancariasBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HistorialConciliacionesBancariasBeanSwingJInternalFrame extends HistorialConciliacionesBancariasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialConciliacionesBancariasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialConciliacionesBancarias> historialconciliacionesbancariasValidator = new ClassValidator<HistorialConciliacionesBancarias>(HistorialConciliacionesBancarias.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialConciliacionesBancarias historialconciliacionesbancarias;	
	public HistorialConciliacionesBancarias historialconciliacionesbancariasAux;
	public HistorialConciliacionesBancarias historialconciliacionesbancariasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialConciliacionesBancarias historialconciliacionesbancariasTotales;
	public Long idHistorialConciliacionesBancariasActual;
	public Long iIdNuevoHistorialConciliacionesBancarias=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
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
	
	public Boolean isPermisoTodoHistorialConciliacionesBancarias;
	public Boolean isPermisoNuevoHistorialConciliacionesBancarias;
	public Boolean isPermisoActualizarHistorialConciliacionesBancarias;
	public Boolean isPermisoActualizarOriginalHistorialConciliacionesBancarias;
	public Boolean isPermisoEliminarHistorialConciliacionesBancarias;
	public Boolean isPermisoGuardarCambiosHistorialConciliacionesBancarias;
	public Boolean isPermisoConsultaHistorialConciliacionesBancarias;
	public Boolean isPermisoBusquedaHistorialConciliacionesBancarias;
	public Boolean isPermisoReporteHistorialConciliacionesBancarias;
	public Boolean isPermisoPaginacionMedioHistorialConciliacionesBancarias;
	public Boolean isPermisoPaginacionAltoHistorialConciliacionesBancarias;
	public Boolean isPermisoPaginacionTodoHistorialConciliacionesBancarias;
	public Boolean isPermisoCopiarHistorialConciliacionesBancarias;
	public Boolean isPermisoVerFormHistorialConciliacionesBancarias;
	public Boolean isPermisoDuplicarHistorialConciliacionesBancarias;
	public Boolean isPermisoOrdenHistorialConciliacionesBancarias;
	
	
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
	
	public HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasReturnGeneral;
	public HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialConciliacionesBancarias=false;
	public Boolean esParaAccionDesdeFormularioHistorialConciliacionesBancarias=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialConciliacionesBancariasSessionBeanAdditional historialconciliacionesbancariasSessionBeanAdditional=null;
	
	public HistorialConciliacionesBancariasSessionBeanAdditional getHistorialConciliacionesBancariasSessionBeanAdditional() {
		return this.historialconciliacionesbancariasSessionBeanAdditional;
	}
	
	public void setHistorialConciliacionesBancariasSessionBeanAdditional(HistorialConciliacionesBancariasSessionBeanAdditional historialconciliacionesbancariasSessionBeanAdditional) {
		try {
			this.historialconciliacionesbancariasSessionBeanAdditional=historialconciliacionesbancariasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional historialconciliacionesbancariasBeanSwingJInternalFrameAdditional=null;
	//public class HistorialConciliacionesBancariasBeanSwingJInternalFrame
	
	public HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional getHistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional() {
		return this.historialconciliacionesbancariasBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional(HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional historialconciliacionesbancariasBeanSwingJInternalFrameAdditional) {
		try {
			this.historialconciliacionesbancariasBeanSwingJInternalFrameAdditional=historialconciliacionesbancariasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialConciliacionesBancariasLogic historialconciliacionesbancariasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialConciliacionesBancarias historialconciliacionesbancariasBean;
	public HistorialConciliacionesBancariasConstantesFunciones historialconciliacionesbancariasConstantesFunciones;
	//public HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialConciliacionesBancarias> historialconciliacionesbancariass;	
	//public List<HistorialConciliacionesBancarias> historialconciliacionesbancariassEliminados;
	//public List<HistorialConciliacionesBancarias> historialconciliacionesbancariassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaCopiarHistorialConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaVerFormHistorialConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaOrdenHistorialConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;	
	
	
	public Boolean isVisibilidadBusquedaHistorialConciliacionesBancarias=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoHistorialConciliacionesBancarias() {
		return this.iIdNuevoHistorialConciliacionesBancarias;
	}

	public void setiIdNuevoHistorialConciliacionesBancarias(Long iIdNuevoHistorialConciliacionesBancarias) {
		this.iIdNuevoHistorialConciliacionesBancarias = iIdNuevoHistorialConciliacionesBancarias;
	}
	
	public Long getidHistorialConciliacionesBancariasActual() {
		return this.idHistorialConciliacionesBancariasActual;
	}

	public void setidHistorialConciliacionesBancariasActual(Long idHistorialConciliacionesBancariasActual) {
		this.idHistorialConciliacionesBancariasActual = idHistorialConciliacionesBancariasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialConciliacionesBancarias gethistorialconciliacionesbancarias() {
		return this.historialconciliacionesbancarias;
	}

	public void sethistorialconciliacionesbancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias) {
		this.historialconciliacionesbancarias = historialconciliacionesbancarias;
	}
	
	public HistorialConciliacionesBancarias gethistorialconciliacionesbancariasAux() {
		return this.historialconciliacionesbancariasAux;
	}

	public void sethistorialconciliacionesbancariasAux(HistorialConciliacionesBancarias historialconciliacionesbancariasAux) {
		this.historialconciliacionesbancariasAux = historialconciliacionesbancariasAux;
	}				
	
	public HistorialConciliacionesBancarias gethistorialconciliacionesbancariasAnterior() {
		return this.historialconciliacionesbancariasAnterior;
	}

	public void sethistorialconciliacionesbancariasAnterior(HistorialConciliacionesBancarias historialconciliacionesbancariasAnterior) {
		this.historialconciliacionesbancariasAnterior = historialconciliacionesbancariasAnterior;
	}	
	
	public HistorialConciliacionesBancarias gethistorialconciliacionesbancariasTotales() {
		return this.historialconciliacionesbancariasTotales;
	}

	public void sethistorialconciliacionesbancariasTotales(HistorialConciliacionesBancarias historialconciliacionesbancariasTotales) {
		this.historialconciliacionesbancariasTotales = historialconciliacionesbancariasTotales;
	}	
	
	public HistorialConciliacionesBancarias gethistorialconciliacionesbancariasBean() {
		return this.historialconciliacionesbancariasBean;
	}

	public void sethistorialconciliacionesbancariasBean(HistorialConciliacionesBancarias historialconciliacionesbancariasBean) {
		this.historialconciliacionesbancariasBean = historialconciliacionesbancariasBean;
	}	
	
	public HistorialConciliacionesBancariasParameterReturnGeneral gethistorialconciliacionesbancariasReturnGeneral() {
		return this.historialconciliacionesbancariasReturnGeneral;
	}

	public void sethistorialconciliacionesbancariasReturnGeneral(HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasReturnGeneral) {
		this.historialconciliacionesbancariasReturnGeneral = historialconciliacionesbancariasReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableBusquedaHistorialConciliacionesBancarias=-1L;

	public Long getid_cuenta_contableBusquedaHistorialConciliacionesBancarias() {
		return this.id_cuenta_contableBusquedaHistorialConciliacionesBancarias;
	}

	public void setid_cuenta_contableBusquedaHistorialConciliacionesBancarias(Long id_cuenta_contableBusquedaHistorialConciliacionesBancarias) {
		this.id_cuenta_contableBusquedaHistorialConciliacionesBancarias = id_cuenta_contableBusquedaHistorialConciliacionesBancarias;
	}

;
	public Date fecha_desdeBusquedaHistorialConciliacionesBancarias=new Date();

	public Date getfecha_desdeBusquedaHistorialConciliacionesBancarias() {
		return this.fecha_desdeBusquedaHistorialConciliacionesBancarias;
	}

	public void setfecha_desdeBusquedaHistorialConciliacionesBancarias(Date fecha_desdeBusquedaHistorialConciliacionesBancarias) {
		this.fecha_desdeBusquedaHistorialConciliacionesBancarias = fecha_desdeBusquedaHistorialConciliacionesBancarias;
	}

;
	public Date fecha_hastaBusquedaHistorialConciliacionesBancarias=new Date();

	public Date getfecha_hastaBusquedaHistorialConciliacionesBancarias() {
		return this.fecha_hastaBusquedaHistorialConciliacionesBancarias;
	}

	public void setfecha_hastaBusquedaHistorialConciliacionesBancarias(Date fecha_hastaBusquedaHistorialConciliacionesBancarias) {
		this.fecha_hastaBusquedaHistorialConciliacionesBancarias = fecha_hastaBusquedaHistorialConciliacionesBancarias;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HistorialConciliacionesBancariasLogic getHistorialConciliacionesBancariasLogic()	{		
		return historialconciliacionesbancariasLogic;
	}

	public void setHistorialConciliacionesBancariasLogic(HistorialConciliacionesBancariasLogic historialconciliacionesbancariasLogic) {
		this.historialconciliacionesbancariasLogic = historialconciliacionesbancariasLogic;
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
	
	public Boolean getIsEsNuevoHistorialConciliacionesBancarias() {
		return isEsNuevoHistorialConciliacionesBancarias;
	}

	public void setIsEsNuevoHistorialConciliacionesBancarias(Boolean isEsNuevoHistorialConciliacionesBancarias) {
		this.isEsNuevoHistorialConciliacionesBancarias = isEsNuevoHistorialConciliacionesBancarias;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialConciliacionesBancarias() {
		return esParaAccionDesdeFormularioHistorialConciliacionesBancarias;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialConciliacionesBancarias(Boolean esParaAccionDesdeFormularioHistorialConciliacionesBancarias) {
		this.esParaAccionDesdeFormularioHistorialConciliacionesBancarias = esParaAccionDesdeFormularioHistorialConciliacionesBancarias;
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

			if(this.historialconciliacionesbancariasSessionBean==null) {
				this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
			}

			if(!this.historialconciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(historialconciliacionesbancariasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.historialconciliacionesbancariasSessionBean==null) {
				this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
			}

			if(!this.historialconciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(historialconciliacionesbancariasSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.historialconciliacionesbancarias!=null) {
						this.historialconciliacionesbancarias.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
						this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHistorialConciliacionesBancariasGenerico)throws Exception
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
				jComboBoxid_empresaHistorialConciliacionesBancariasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHistorialConciliacionesBancariasGenerico!=null && jComboBoxid_empresaHistorialConciliacionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_empresaHistorialConciliacionesBancariasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.historialconciliacionesbancarias!=null) {
						this.historialconciliacionesbancarias.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
						this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaHistorialConciliacionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias!=null) {
						jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias!=null) {
							//jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.getItemCount()>0) {
								jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico!=null && jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HistorialConciliacionesBancarias historialconciliacionesbancarias,JComboBox jComboBoxid_empresaHistorialConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHistorialConciliacionesBancariasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHistorialConciliacionesBancariasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				historialconciliacionesbancarias.setid_empresa(empresaAux.getId());
				historialconciliacionesbancarias.setempresa_descripcion(HistorialConciliacionesBancariasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				historialconciliacionesbancarias.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(HistorialConciliacionesBancarias historialconciliacionesbancarias,JComboBox jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableHistorialConciliacionesBancariasGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				historialconciliacionesbancarias.setid_cuenta_contable(cuentacontableAux.getId());
				historialconciliacionesbancarias.setcuentacontable_descripcion(HistorialConciliacionesBancariasConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				historialconciliacionesbancarias.setCuentaContable(cuentacontableAux);			}
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

					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { 
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { 
					}

					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { 
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { 
					}

					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaHistorialConciliacionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.addItem(cuentacontable);
							}
						}

						if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesHistorialConciliacionesBancarias() throws Exception {
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
		
	public HistorialConciliacionesBancariasParameterReturnGeneral getHistorialConciliacionesBancariasParameterGeneral() {
		return this.historialconciliacionesbancariasParameterGeneral;
	}
	
	public void setHistorialConciliacionesBancariasParameterGeneral(HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasParameterGeneral) {
		this.historialconciliacionesbancariasParameterGeneral = historialconciliacionesbancariasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialConciliacionesBancarias() {
		return isPermisoTodoHistorialConciliacionesBancarias;
	}

	public void setIsPermisoTodoHistorialConciliacionesBancarias(Boolean isPermisoTodoHistorialConciliacionesBancarias) {
		this.isPermisoTodoHistorialConciliacionesBancarias = isPermisoTodoHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoNuevoHistorialConciliacionesBancarias() {
		return isPermisoNuevoHistorialConciliacionesBancarias;
	}

	public void setIsPermisoNuevoHistorialConciliacionesBancarias(Boolean isPermisoNuevoHistorialConciliacionesBancarias) {
		this.isPermisoNuevoHistorialConciliacionesBancarias = isPermisoNuevoHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoActualizarHistorialConciliacionesBancarias() {
		return isPermisoActualizarHistorialConciliacionesBancarias;
	}

	public void setIsPermisoActualizarHistorialConciliacionesBancarias(Boolean isPermisoActualizarHistorialConciliacionesBancarias) {
		this.isPermisoActualizarHistorialConciliacionesBancarias = isPermisoActualizarHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoEliminarHistorialConciliacionesBancarias() {
		return isPermisoEliminarHistorialConciliacionesBancarias;
	}

	public void setIsPermisoEliminarHistorialConciliacionesBancarias(Boolean isPermisoEliminarHistorialConciliacionesBancarias) {
		this.isPermisoEliminarHistorialConciliacionesBancarias = isPermisoEliminarHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialConciliacionesBancarias() {
		return isPermisoGuardarCambiosHistorialConciliacionesBancarias;
	}

	public void setIsPermisoGuardarCambiosHistorialConciliacionesBancarias(Boolean isPermisoGuardarCambiosHistorialConciliacionesBancarias) {
		this.isPermisoGuardarCambiosHistorialConciliacionesBancarias = isPermisoGuardarCambiosHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoConsultaHistorialConciliacionesBancarias() {
		return isPermisoConsultaHistorialConciliacionesBancarias;
	}

	public void setIsPermisoConsultaHistorialConciliacionesBancarias(Boolean isPermisoConsultaHistorialConciliacionesBancarias) {
		this.isPermisoConsultaHistorialConciliacionesBancarias = isPermisoConsultaHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoBusquedaHistorialConciliacionesBancarias() {
		return isPermisoBusquedaHistorialConciliacionesBancarias;
	}

	public void setIsPermisoBusquedaHistorialConciliacionesBancarias(Boolean isPermisoBusquedaHistorialConciliacionesBancarias) {
		this.isPermisoBusquedaHistorialConciliacionesBancarias = isPermisoBusquedaHistorialConciliacionesBancarias;
	}

	public Boolean getIsPermisoReporteHistorialConciliacionesBancarias() {
		return isPermisoReporteHistorialConciliacionesBancarias;
	}

	public void setIsPermisoReporteHistorialConciliacionesBancarias(Boolean isPermisoReporteHistorialConciliacionesBancarias) {
		this.isPermisoReporteHistorialConciliacionesBancarias = isPermisoReporteHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialConciliacionesBancarias() {
		return isPermisoPaginacionMedioHistorialConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionMedioHistorialConciliacionesBancarias(Boolean isPermisoPaginacionMedioHistorialConciliacionesBancarias) {
		this.isPermisoPaginacionMedioHistorialConciliacionesBancarias = isPermisoPaginacionMedioHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialConciliacionesBancarias() {
		return isPermisoPaginacionTodoHistorialConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionTodoHistorialConciliacionesBancarias(Boolean isPermisoPaginacionTodoHistorialConciliacionesBancarias) {
		this.isPermisoPaginacionTodoHistorialConciliacionesBancarias = isPermisoPaginacionTodoHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialConciliacionesBancarias() {
		return isPermisoPaginacionAltoHistorialConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionAltoHistorialConciliacionesBancarias(Boolean isPermisoPaginacionAltoHistorialConciliacionesBancarias) {
		this.isPermisoPaginacionAltoHistorialConciliacionesBancarias = isPermisoPaginacionAltoHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoCopiarHistorialConciliacionesBancarias() {
		return isPermisoCopiarHistorialConciliacionesBancarias;
	}

	public void setIsPermisoCopiarHistorialConciliacionesBancarias(Boolean isPermisoCopiarHistorialConciliacionesBancarias) {
		this.isPermisoCopiarHistorialConciliacionesBancarias = isPermisoCopiarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoVerFormHistorialConciliacionesBancarias() {
		return isPermisoVerFormHistorialConciliacionesBancarias;
	}

	public void setIsPermisoVerFormHistorialConciliacionesBancarias(Boolean isPermisoVerFormHistorialConciliacionesBancarias) {
		this.isPermisoVerFormHistorialConciliacionesBancarias = isPermisoVerFormHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoDuplicarHistorialConciliacionesBancarias() {
		return isPermisoDuplicarHistorialConciliacionesBancarias;
	}

	public void setIsPermisoDuplicarHistorialConciliacionesBancarias(Boolean isPermisoDuplicarHistorialConciliacionesBancarias) {
		this.isPermisoDuplicarHistorialConciliacionesBancarias = isPermisoDuplicarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoOrdenHistorialConciliacionesBancarias() {
		return isPermisoOrdenHistorialConciliacionesBancarias;
	}

	public void setIsPermisoOrdenHistorialConciliacionesBancarias(Boolean isPermisoOrdenHistorialConciliacionesBancarias) {
		this.isPermisoOrdenHistorialConciliacionesBancarias = isPermisoOrdenHistorialConciliacionesBancarias;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaNuevoHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaNuevoHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias = isVisibilidadCeldaNuevoHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias = isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaCopiarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaCopiarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaCopiarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias = isVisibilidadCeldaCopiarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaVerFormHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaVerFormHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaVerFormHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias = isVisibilidadCeldaVerFormHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaOrdenHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaOrdenHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaOrdenHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias = isVisibilidadCeldaOrdenHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias = isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaModificarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaModificarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaModificarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias = isVisibilidadCeldaModificarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaActualizarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaActualizarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaActualizarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias = isVisibilidadCeldaActualizarHistorialConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaEliminarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaEliminarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaEliminarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias = isVisibilidadCeldaEliminarHistorialConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaCancelarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaCancelarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaCancelarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias = isVisibilidadCeldaCancelarHistorialConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaGuardarHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaGuardarHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias = isVisibilidadCeldaGuardarHistorialConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias() {
		return isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias(Boolean isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias) {
		this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias = isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias;
	}
		
	public HistorialConciliacionesBancariasSessionBean gethistorialconciliacionesbancariasSessionBean() {
		return this.historialconciliacionesbancariasSessionBean;
	}
	
	public void sethistorialconciliacionesbancariasSessionBean(HistorialConciliacionesBancariasSessionBean historialconciliacionesbancariasSessionBean) {
		this.historialconciliacionesbancariasSessionBean=historialconciliacionesbancariasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaHistorialConciliacionesBancarias() {
		return this.isVisibilidadBusquedaHistorialConciliacionesBancarias;
	}

	public void setisVisibilidadBusquedaHistorialConciliacionesBancarias(Boolean isVisibilidadBusquedaHistorialConciliacionesBancarias) {
		this.isVisibilidadBusquedaHistorialConciliacionesBancarias=isVisibilidadBusquedaHistorialConciliacionesBancarias;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(historialconciliacionesbancarias,null);
				this.setActualParaGuardarCuentaContableForeignKey(historialconciliacionesbancarias,null);
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
	
	public void bugActualizarReferenciaActual(HistorialConciliacionesBancarias historialconciliacionesbancarias,HistorialConciliacionesBancarias historialconciliacionesbancariasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialConciliacionesBancarias(historialconciliacionesbancarias);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialconciliacionesbancariasAux.setId(historialconciliacionesbancarias.getId());
		historialconciliacionesbancariasAux.setVersionRow(historialconciliacionesbancarias.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(HistorialConciliacionesBancarias historialconciliacionesbancariasLocal) throws Exception {
		
		if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialConciliacionesBancarias historialconciliacionesbancariasLocal) throws Exception {	
		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				historialconciliacionesbancariasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				historialconciliacionesbancariasLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialConciliacionesBancariasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialconciliacionesbancariasValidator.getInvalidValues(this.historialconciliacionesbancarias);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialConciliacionesBancarias historialconciliacionesbancarias,List<HistorialConciliacionesBancarias> historialconciliacionesbancariass) throws Exception {
	}		
	
	public void actualizarSelectedLista(HistorialConciliacionesBancarias historialconciliacionesbancarias,List<HistorialConciliacionesBancarias> historialconciliacionesbancariass) throws Exception {
		try	{			
			HistorialConciliacionesBancariasConstantesFunciones.actualizarSelectedLista(historialconciliacionesbancarias,historialconciliacionesbancariass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialConciliacionesBancarias> historialconciliacionesbancariassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialconciliacionesbancariassLocal=this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialconciliacionesbancariassLocal=this.historialconciliacionesbancariass;
			}
			//ARCHITECTURE
		
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasLocal:historialconciliacionesbancariassLocal) {
				if(this.permiteMantenimiento(historialconciliacionesbancariasLocal) && historialconciliacionesbancariasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.getHistorialConciliacionesBancariasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldebito_localHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcredito_localHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_chequeHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcodigoHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelbeneficiarioHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldetalleHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.CUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcuentaHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.TIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_documentoHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_mayorHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.FECHAFINALIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfecha_finalizacionHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_movimientoHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.SALDOLIBROS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelsaldo_librosHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfechaHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_cuentaHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialConciliacionesBancariasConstantesFunciones.ANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelanteriorHistorialConciliacionesBancarias,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldebito_localHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcredito_localHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_chequeHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcodigoHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelbeneficiarioHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldetalleHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcuentaHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_documentoHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_mayorHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfecha_finalizacionHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_movimientoHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelsaldo_librosHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfechaHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_cuentaHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelanteriorHistorialConciliacionesBancarias,"");
		
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
		this.iIdNuevoHistorialConciliacionesBancarias--;	
		
		
		this.historialconciliacionesbancariasAux=new HistorialConciliacionesBancarias();
		
		this.historialconciliacionesbancariasAux.setId(this.iIdNuevoHistorialConciliacionesBancarias);
		this.historialconciliacionesbancariasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().add(this.historialconciliacionesbancariasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialconciliacionesbancariass.add(this.historialconciliacionesbancariasAux);
		}
		//ARCHITECTURE
		
		this.historialconciliacionesbancarias=this.historialconciliacionesbancariasAux;
		
		if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
		}
				
		//this.setDefaultControlesHistorialConciliacionesBancarias();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialConciliacionesBancarias();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialConciliacionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialConciliacionesBancarias();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancariasBean,this.historialconciliacionesbancarias,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral,this.historialconciliacionesbancariasBean,false);
		
		if(this.historialconciliacionesbancariasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias());
		}
		
		if(this.historialconciliacionesbancariasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias(),classes);//this.historialconciliacionesbancariasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialConciliacionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialConciliacionesBancarias();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.RecargarFormHistorialConciliacionesBancarias(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
						
			if(historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();
			}
			
			this.actualizarVisualTableDatosHistorialConciliacionesBancarias();
			
			this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoHistorialConciliacionesBancarias(), this.getIndiceNuevoHistorialConciliacionesBancarias());
			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
						
			this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialConciliacionesBancarias(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_desdeHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarfecha_desdeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_hastaHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarfecha_hastaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activardebito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarcredito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarnumero_chequeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarcodigoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarbeneficiarioHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activardetalleHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarcuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activartipo_documentoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarnumero_mayorHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarfecha_finalizacionHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activartipo_movimientoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarsaldo_librosHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarfechaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarnumero_cuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarnombre_cuenta_contableHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activaranteriorHistorialConciliacionesBancarias);	
		//
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarid_empresaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setEnabled(isHabilitar && this.historialconciliacionesbancariasConstantesFunciones.activarid_cuenta_contableHistorialConciliacionesBancarias);
	};
	
	public void setDefaultControlesHistorialConciliacionesBancarias() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialConciliacionesBancarias(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(true);			
			this.historialconciliacionesbancariasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setVisible(true);
			
					
		} else {
			//this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(false);			
			this.historialconciliacionesbancariasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialConciliacionesBancarias() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				if(historialconciliacionesbancariasAux.getId().equals(this.iIdNuevoHistorialConciliacionesBancarias)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariass) {
				if(historialconciliacionesbancariasAux.getId().equals(this.iIdNuevoHistorialConciliacionesBancarias)) {
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
	
	public int getIndiceActualHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				if(historialconciliacionesbancariasAux.getId().equals(historialconciliacionesbancarias.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariass) {
				if(historialconciliacionesbancariasAux.getId().equals(historialconciliacionesbancarias.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancariasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				if(historialconciliacionesbancariasAux.getHistorialConciliacionesBancariasOriginal().getId().equals(historialconciliacionesbancariasOriginal.getId())) {
					existe=true;
					historialconciliacionesbancariasOriginal.setId(historialconciliacionesbancariasAux.getId());
					historialconciliacionesbancariasOriginal.setVersionRow(historialconciliacionesbancariasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariass) {
				if(historialconciliacionesbancariasAux.getHistorialConciliacionesBancariasOriginal().getId().equals(historialconciliacionesbancariasOriginal.getId())) {
					existe=true;
					historialconciliacionesbancariasOriginal.setId(historialconciliacionesbancariasAux.getId());
					historialconciliacionesbancariasOriginal.setVersionRow(historialconciliacionesbancariasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialConciliacionesBancarias(Boolean esParaCancelar) throws Exception {
		historialconciliacionesbancariassAux=new ArrayList<HistorialConciliacionesBancarias>();
		historialconciliacionesbancariasAux=new HistorialConciliacionesBancarias();
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
					if(historialconciliacionesbancariasAux.getId()<0) {
						historialconciliacionesbancariassAux.add(historialconciliacionesbancariasAux);
					}		
				}
				this.iIdNuevoHistorialConciliacionesBancarias=0L;
				this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().removeAll(historialconciliacionesbancariassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariass) {
					if(historialconciliacionesbancariasAux.getId()<0) {
						historialconciliacionesbancariassAux.add(historialconciliacionesbancariasAux);
					}		
				}
				this.iIdNuevoHistorialConciliacionesBancarias=0L;
				this.historialconciliacionesbancariass.removeAll(historialconciliacionesbancariassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialConciliacionesBancarias 
					&& this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size()>0
					) {
					historialconciliacionesbancariasAux=this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().get(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size() - 1);
				
					if(historialconciliacionesbancariasAux.getId()<0) {
						this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().remove(historialconciliacionesbancariasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialConciliacionesBancarias && this.historialconciliacionesbancariass.size()>0) {
					historialconciliacionesbancariasAux=this.historialconciliacionesbancariass.get(this.historialconciliacionesbancariass.size() - 1);
				
					if(historialconciliacionesbancariasAux.getId()<0) {
						this.historialconciliacionesbancariass.remove(historialconciliacionesbancariasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialConciliacionesBancarias(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialconciliacionesbancarias.getId()<0) {
				this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().remove(this.historialconciliacionesbancarias);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialconciliacionesbancarias.getId()<0) {
				this.historialconciliacionesbancariass.remove(this.historialconciliacionesbancarias);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialConciliacionesBancarias(List<HistorialConciliacionesBancarias> historialconciliacionesbancariassAux) throws Exception {
		HistorialConciliacionesBancariasConstantesFunciones.setEstadosInicialesHistorialConciliacionesBancarias(historialconciliacionesbancariassAux);
	}
	
	public void setEstadosInicialesHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancariasAux) throws Exception {
		HistorialConciliacionesBancariasConstantesFunciones.setEstadosInicialesHistorialConciliacionesBancarias(historialconciliacionesbancariasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialConciliacionesBancariasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialConciliacionesBancariasActual()) {
				if(!this.isEsNuevoHistorialConciliacionesBancarias) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialConciliacionesBancarias=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialConciliacionesBancariasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Conciliaciones Bancarias ?", "MANTENIMIENTO DE Historial Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialConciliacionesBancarias historialconciliacionesbancarias) throws Exception {
		HistorialConciliacionesBancariasConstantesFunciones.seleccionarAsignar(this.historialconciliacionesbancarias,historialconciliacionesbancarias);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialConciliacionesBancarias=this.isPermisoActualizarOriginalHistorialConciliacionesBancarias;
			
			
			this.seleccionarAsignar(historialconciliacionesbancarias);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialconciliacionesbancariasSessionBean.setsFuncionBusquedaRapida(this.historialconciliacionesbancariasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHistorialConciliacionesBancarias) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialConciliacionesBancarias(esParaCancelar);				
				this.cancelarNuevoHistorialConciliacionesBancarias(esParaCancelar);								
			}
			
			this.historialconciliacionesbancarias=new HistorialConciliacionesBancarias();
			
			this.inicializarHistorialConciliacionesBancarias();
			
			this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialConciliacionesBancarias() throws Exception {
		try {
			HistorialConciliacionesBancariasConstantesFunciones.inicializarHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialConciliacionesBancariass(String sAccionBusqueda,List<HistorialConciliacionesBancarias> historialconciliacionesbancariassParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialConciliacionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialConciliacionesBancariasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialConciliacionesBancariasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialConciliacionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Conciliaciones Bancariases");		
		parameters.put("busquedapor", HistorialConciliacionesBancariasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialConciliacionesBancarias=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialConciliacionesBancarias=new JRBeanArrayDataSource(HistorialConciliacionesBancariasJInternalFrame.TraerHistorialConciliacionesBancariasBeans(historialconciliacionesbancariassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialConciliacionesBancarias);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialConciliacionesBancariasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialConciliacionesBancariasBean.TraerHistorialConciliacionesBancariasBeans(historialconciliacionesbancariassParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancariasActionPerformed(null);
					//this.generarExcelReporteHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,historialconciliacionesbancariassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialConciliacionesBancarias> historialconciliacionesbancariassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialConciliacionesBancariass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialConciliacionesBancarias("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialConciliacionesBancarias historialconciliacionesbancarias : historialconciliacionesbancariassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialConciliacionesBancariasConstantesFunciones.generarExcelReporteDataHistorialConciliacionesBancarias("NORMAL",row,workbook,historialconciliacionesbancarias,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialConciliacionesBancarias(String sTipo,Row row,Workbook workbook) {
		
		HistorialConciliacionesBancariasConstantesFunciones.generarExcelReporteHeaderHistorialConciliacionesBancarias(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialConciliacionesBancarias> historialconciliacionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialConciliacionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialConciliacionesBancarias historialconciliacionesbancarias : historialconciliacionesbancariassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.getHistorialConciliacionesBancariasDescripcion(historialconciliacionesbancarias));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getcuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.gettipo_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getfecha_finalizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getsaldo_libros());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialconciliacionesbancarias.getanterior());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialConciliacionesBancarias> historialconciliacionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialConciliacionesBancarias> historialconciliacionesbancariassRespaldo=null;
		
		classes=HistorialConciliacionesBancariasConstantesFunciones.getClassesRelationshipsOfHistorialConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialconciliacionesbancariasLogic.setDatosCliente(this.datosCliente);
		this.historialconciliacionesbancariasLogic.setDatosDeep(this.datosDeep);
		this.historialconciliacionesbancariasLogic.setIsConDeep(true);
		
		historialconciliacionesbancariassRespaldo=this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass();
		
		this.historialconciliacionesbancariasLogic.setHistorialConciliacionesBancariass(historialconciliacionesbancariassParaReportes);	
		this.historialconciliacionesbancariasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialconciliacionesbancariassParaReportes=this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass();
		this.historialconciliacionesbancariasLogic.setHistorialConciliacionesBancariass(historialconciliacionesbancariassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialConciliacionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialConciliacionesBancarias("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialConciliacionesBancarias historialconciliacionesbancarias : historialconciliacionesbancariassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialConciliacionesBancarias("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialConciliacionesBancariasConstantesFunciones.generarExcelReporteDataHistorialConciliacionesBancarias("NORMAL",row,workbook,historialconciliacionesbancarias,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.getHistorialConciliacionesBancariasDescripcion(historialconciliacionesbancarias));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialConciliacionesBancarias() throws Exception {		
		this.startProcessHistorialConciliacionesBancarias(true);
	}
	
	public void startProcessHistorialConciliacionesBancarias(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialConciliacionesBancarias ,this.jPanelParametrosReportesHistorialConciliacionesBancarias, this.jScrollPanelDatosHistorialConciliacionesBancarias,this.jPanelPaginacionHistorialConciliacionesBancarias, this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias, this.jPanelAccionesHistorialConciliacionesBancarias,this.jPanelAccionesFormularioHistorialConciliacionesBancarias,this.jmenuBarHistorialConciliacionesBancarias,this.jmenuBarDetalleHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialConciliacionesBancarias=this.jTabbedPaneBusquedasHistorialConciliacionesBancarias; 
		
		final JPanel jPanelParametrosReportesHistorialConciliacionesBancarias=this.jPanelParametrosReportesHistorialConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosHistorialConciliacionesBancarias=this.jScrollPanelDatosHistorialConciliacionesBancarias;
		final JTable jTableDatosHistorialConciliacionesBancarias=this.jTableDatosHistorialConciliacionesBancarias;		
		final JPanel jPanelPaginacionHistorialConciliacionesBancarias=this.jPanelPaginacionHistorialConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionHistorialConciliacionesBancarias=this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias;
		final JPanel jPanelAccionesHistorialConciliacionesBancarias=this.jPanelAccionesHistorialConciliacionesBancarias;
		
		JPanel jPanelCamposAuxiliarHistorialConciliacionesBancarias=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			jPanelCamposAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelCamposHistorialConciliacionesBancarias;
			jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelAccionesFormularioHistorialConciliacionesBancarias;
		}
		
		final JPanel jPanelCamposHistorialConciliacionesBancarias=jPanelCamposAuxiliarHistorialConciliacionesBancarias;
		final JPanel jPanelAccionesFormularioHistorialConciliacionesBancarias=jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias;
		
		
		final JMenuBar jmenuBarHistorialConciliacionesBancarias=this.jmenuBarHistorialConciliacionesBancarias;
		final JToolBar jTtoolBarHistorialConciliacionesBancarias=this.jTtoolBarHistorialConciliacionesBancarias;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jmenuBarDetalleHistorialConciliacionesBancarias;
			jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTtoolBarDetalleHistorialConciliacionesBancarias;
		}
		
		final JMenuBar jmenuBarDetalleHistorialConciliacionesBancarias=jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias;
		final JToolBar jTtoolBarDetalleHistorialConciliacionesBancarias=jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialConciliacionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialConciliacionesBancarias;
			processRunnable.jTableDatos=jTableDatosHistorialConciliacionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposHistorialConciliacionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialConciliacionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialConciliacionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialConciliacionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialConciliacionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialConciliacionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarHistorialConciliacionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialConciliacionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialConciliacionesBancarias ,jPanelParametrosReportesHistorialConciliacionesBancarias,jTableDatosHistorialConciliacionesBancarias, /*jScrollPanelDatosHistorialConciliacionesBancarias,*/jPanelCamposHistorialConciliacionesBancarias,jPanelPaginacionHistorialConciliacionesBancarias, /*jScrollPanelDatosEdicionHistorialConciliacionesBancarias,*/ jPanelAccionesHistorialConciliacionesBancarias,jPanelAccionesFormularioHistorialConciliacionesBancarias,jmenuBarHistorialConciliacionesBancarias,jmenuBarDetalleHistorialConciliacionesBancarias,jTtoolBarHistorialConciliacionesBancarias,jTtoolBarDetalleHistorialConciliacionesBancarias);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialConciliacionesBancarias ,jPanelParametrosReportesHistorialConciliacionesBancarias, jScrollPanelDatosHistorialConciliacionesBancarias,jPanelPaginacionHistorialConciliacionesBancarias, jScrollPanelDatosEdicionHistorialConciliacionesBancarias, jPanelAccionesHistorialConciliacionesBancarias,jPanelAccionesFormularioHistorialConciliacionesBancarias,jmenuBarHistorialConciliacionesBancarias,jmenuBarDetalleHistorialConciliacionesBancarias,jTtoolBarHistorialConciliacionesBancarias,jTtoolBarDetalleHistorialConciliacionesBancarias);
						
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
	
	public void finishProcessHistorialConciliacionesBancarias() {// throws Exception 
		this.finishProcessHistorialConciliacionesBancarias(true);
	}
	
	public void finishProcessHistorialConciliacionesBancarias(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialConciliacionesBancarias ,this.jPanelParametrosReportesHistorialConciliacionesBancarias, this.jScrollPanelDatosHistorialConciliacionesBancarias,this.jPanelPaginacionHistorialConciliacionesBancarias, this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias, this.jPanelAccionesHistorialConciliacionesBancarias,this.jPanelAccionesFormularioHistorialConciliacionesBancarias,this.jmenuBarHistorialConciliacionesBancarias,this.jmenuBarDetalleHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialConciliacionesBancarias=this.jTabbedPaneBusquedasHistorialConciliacionesBancarias; 
		
		final JPanel jPanelParametrosReportesHistorialConciliacionesBancarias=this.jPanelParametrosReportesHistorialConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosHistorialConciliacionesBancarias=this.jScrollPanelDatosHistorialConciliacionesBancarias;
		final JTable jTableDatosHistorialConciliacionesBancarias=this.jTableDatosHistorialConciliacionesBancarias;		
		final JPanel jPanelPaginacionHistorialConciliacionesBancarias=this.jPanelPaginacionHistorialConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionHistorialConciliacionesBancarias=this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias;
		final JPanel jPanelAccionesHistorialConciliacionesBancarias=this.jPanelAccionesHistorialConciliacionesBancarias;
		
		JPanel jPanelCamposAuxiliarHistorialConciliacionesBancarias=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			jPanelCamposAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelCamposHistorialConciliacionesBancarias;
			jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelAccionesFormularioHistorialConciliacionesBancarias;
		}
		
		final JPanel jPanelCamposHistorialConciliacionesBancarias=jPanelCamposAuxiliarHistorialConciliacionesBancarias;
		final JPanel jPanelAccionesFormularioHistorialConciliacionesBancarias=jPanelAccionesFormularioAuxiliarHistorialConciliacionesBancarias;
		
		
		final JMenuBar jmenuBarHistorialConciliacionesBancarias=this.jmenuBarHistorialConciliacionesBancarias;		
		final JToolBar jTtoolBarHistorialConciliacionesBancarias=this.jTtoolBarHistorialConciliacionesBancarias;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jmenuBarDetalleHistorialConciliacionesBancarias;
			jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTtoolBarDetalleHistorialConciliacionesBancarias;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialConciliacionesBancarias=jmenuBarDetalleAuxiliarHistorialConciliacionesBancarias;
		final JToolBar jTtoolBarDetalleHistorialConciliacionesBancarias=jTtoolBarDetalleAuxiliarHistorialConciliacionesBancarias;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialConciliacionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialConciliacionesBancarias;
			processRunnable.jTableDatos=jTableDatosHistorialConciliacionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposHistorialConciliacionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialConciliacionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialConciliacionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialConciliacionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialConciliacionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialConciliacionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarHistorialConciliacionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialConciliacionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialConciliacionesBancarias ,jPanelParametrosReportesHistorialConciliacionesBancarias, jTableDatosHistorialConciliacionesBancarias,/*jScrollPanelDatosHistorialConciliacionesBancarias,*/jPanelCamposHistorialConciliacionesBancarias,jPanelPaginacionHistorialConciliacionesBancarias, /*jScrollPanelDatosEdicionHistorialConciliacionesBancarias,*/ jPanelAccionesHistorialConciliacionesBancarias,jPanelAccionesFormularioHistorialConciliacionesBancarias,jmenuBarHistorialConciliacionesBancarias,jmenuBarDetalleHistorialConciliacionesBancarias,jTtoolBarHistorialConciliacionesBancarias,jTtoolBarDetalleHistorialConciliacionesBancarias));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialConciliacionesBancarias(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialConciliacionesBancarias(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialConciliacionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialConciliacionesBancarias,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialConciliacionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialConciliacionesBancarias,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialconciliacionesbancariasConstantesFunciones.getsFinalQueryHistorialConciliacionesBancarias();
		String  finalQueryPaginacionTodos=this.historialconciliacionesbancariasConstantesFunciones.getsFinalQueryHistorialConciliacionesBancarias();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialConciliacionesBancariasConstantesFunciones.getArrayColumnasGlobalesNoHistorialConciliacionesBancarias(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialConciliacionesBancariasConstantesFunciones.getArrayColumnasGlobalesHistorialConciliacionesBancarias(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialConciliacionesBancariasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialconciliacionesbancariassEliminados= new ArrayList<HistorialConciliacionesBancarias>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialConciliacionesBancarias();
		
				///*HistorialConciliacionesBancariasSessionBean*/this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
			
			if(this.historialconciliacionesbancariasSessionBean==null) {
				this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
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
					this.iNumeroPaginacion=HistorialConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialConciliacionesBancariasConstantesFunciones.getClassesForeignKeysOfHistorialConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialconciliacionesbancarias."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialconciliacionesbancariassAux= new ArrayList<HistorialConciliacionesBancarias>();
			
				
			historialconciliacionesbancariasLogic.setDatosCliente(this.datosCliente);
			historialconciliacionesbancariasLogic.setDatosDeep(this.datosDeep);
			historialconciliacionesbancariasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaHistorialConciliacionesBancarias")) {
				this.sDetalleReporte=HistorialConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaHistorialConciliacionesBancarias(id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaHistorialConciliacionesBancarias(id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaHistorialConciliacionesBancarias(id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()==null||historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialconciliacionesbancariass==null|| historialconciliacionesbancariass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialconciliacionesbancariassAux=new ArrayList<HistorialConciliacionesBancarias>();
						historialconciliacionesbancariassAux.addAll(historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialconciliacionesbancariassAux=new ArrayList<HistorialConciliacionesBancarias>();
							historialconciliacionesbancariassAux.addAll(historialconciliacionesbancariass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaHistorialConciliacionesBancarias(id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaHistorialConciliacionesBancarias(id_cuenta_contableBusquedaHistorialConciliacionesBancarias,fecha_desdeBusquedaHistorialConciliacionesBancarias,fecha_hastaBusquedaHistorialConciliacionesBancarias);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialConciliacionesBancariass("BusquedaHistorialConciliacionesBancarias",historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialConciliacionesBancariass("BusquedaHistorialConciliacionesBancarias",historialconciliacionesbancariass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialconciliacionesbancariasLogic.setHistorialConciliacionesBancariass(new ArrayList<HistorialConciliacionesBancarias>());
						historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().addAll(historialconciliacionesbancariassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialconciliacionesbancariass=new ArrayList<HistorialConciliacionesBancarias>();
							historialconciliacionesbancariass.addAll(historialconciliacionesbancariassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialConciliacionesBancarias();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialConciliacionesBancarias();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialconciliacionesbancariass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialconciliacionesbancariass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialConciliacionesBancarias historialconciliacionesbancarias) {
		Boolean permite=true;
		
		if(this.historialconciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialConciliacionesBancariasConstantesFunciones.getOrderByListaHistorialConciliacionesBancarias();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialConciliacionesBancariasConstantesFunciones.getOrderByListaHistorialConciliacionesBancarias();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				if(historialconciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					historialconciliacionesbancariasTotales=historialconciliacionesbancarias;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancarias:this.historialconciliacionesbancariass) {
				if(historialconciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					historialconciliacionesbancariasTotales=historialconciliacionesbancarias;
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
			this.historialconciliacionesbancariasAux=new HistorialConciliacionesBancarias();
			this.historialconciliacionesbancariasAux.setsType(Constantes2.S_TOTALES);
			this.historialconciliacionesbancariasAux.setIsNew(false);
			this.historialconciliacionesbancariasAux.setIsChanged(false);
			this.historialconciliacionesbancariasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//HistorialConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaHistorialConciliacionesBancarias(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass(),this.historialconciliacionesbancariasAux);
				
				//this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().add(this.historialconciliacionesbancariasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaHistorialConciliacionesBancarias(this.historialconciliacionesbancariass,this.historialconciliacionesbancariasAux);
				
				this.historialconciliacionesbancariass.add(this.historialconciliacionesbancariasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialconciliacionesbancariasTotales=new HistorialConciliacionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().remove(historialconciliacionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialconciliacionesbancariass.remove(historialconciliacionesbancariasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialconciliacionesbancariasTotales=new HistorialConciliacionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				if(historialconciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					historialconciliacionesbancariasTotales=historialconciliacionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaHistorialConciliacionesBancarias(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass(),historialconciliacionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialConciliacionesBancarias historialconciliacionesbancarias:this.historialconciliacionesbancariass) {
				if(historialconciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					historialconciliacionesbancariasTotales=historialconciliacionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaHistorialConciliacionesBancarias(this.historialconciliacionesbancariass,historialconciliacionesbancariasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias()throws Exception {
		try {
			sAccionBusqueda="BusquedaHistorialConciliacionesBancarias";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialConciliacionesBancariassFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialConciliacionesBancariassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias(String sFinalQuery,Long id_cuenta_contable,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias(sFinalQuery,this.pagination,id_cuenta_contable,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialConciliacionesBancariassFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariassFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialConciliacionesBancariassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosHistorialConciliacionesBancarias() {
		this.isPermisoTodoHistorialConciliacionesBancarias=false;
		this.isPermisoNuevoHistorialConciliacionesBancarias=false;
		this.isPermisoActualizarHistorialConciliacionesBancarias=false;
		this.isPermisoActualizarOriginalHistorialConciliacionesBancarias=false;
		this.isPermisoEliminarHistorialConciliacionesBancarias=false;
		this.isPermisoGuardarCambiosHistorialConciliacionesBancarias=false;
		this.isPermisoConsultaHistorialConciliacionesBancarias=true;
		this.isPermisoBusquedaHistorialConciliacionesBancarias=true;
		this.isPermisoReporteHistorialConciliacionesBancarias=true;
		this.isPermisoOrdenHistorialConciliacionesBancarias=false;		
		this.isPermisoPaginacionMedioHistorialConciliacionesBancarias=false;		
		this.isPermisoPaginacionAltoHistorialConciliacionesBancarias=false;		
		this.isPermisoPaginacionTodoHistorialConciliacionesBancarias=false;		
		this.isPermisoCopiarHistorialConciliacionesBancarias=false;		
		this.isPermisoVerFormHistorialConciliacionesBancarias=false;		
		this.isPermisoDuplicarHistorialConciliacionesBancarias=false;
		this.isPermisoOrdenHistorialConciliacionesBancarias=false;
	}
	
	public void setPermisosUsuarioHistorialConciliacionesBancarias(Boolean isPermiso) {
		this.isPermisoTodoHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoNuevoHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoEliminarHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoConsultaHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoBusquedaHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoReporteHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoOrdenHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionMedioHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionAltoHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionTodoHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoCopiarHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoVerFormHistorialConciliacionesBancarias=isPermiso;		
		this.isPermisoDuplicarHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoOrdenHistorialConciliacionesBancarias=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialConciliacionesBancarias(Boolean isPermiso) {
		//this.isPermisoTodoHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoNuevoHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoEliminarHistorialConciliacionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosHistorialConciliacionesBancarias=isPermiso;
		//this.isPermisoConsultaHistorialConciliacionesBancarias=isPermiso;
		//this.isPermisoBusquedaHistorialConciliacionesBancarias=isPermiso;
		//this.isPermisoReporteHistorialConciliacionesBancarias=isPermiso;
		//this.isPermisoOrdenHistorialConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialConciliacionesBancarias=isPermiso;		
		//this.isPermisoCopiarHistorialConciliacionesBancarias=isPermiso;		
		//this.isPermisoDuplicarHistorialConciliacionesBancarias=isPermiso;
		//this.isPermisoOrdenHistorialConciliacionesBancarias=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialConciliacionesBancariasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialConciliacionesBancarias(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialConciliacionesBancariasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialConciliacionesBancariasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialConciliacionesBancariasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialConciliacionesBancariasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialConciliacionesBancarias() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialConciliacionesBancarias=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialConciliacionesBancarias=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialConciliacionesBancarias=this.isPermisoActualizarHistorialConciliacionesBancarias;
			this.isPermisoEliminarHistorialConciliacionesBancarias=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialConciliacionesBancarias=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialConciliacionesBancarias=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialConciliacionesBancarias=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialConciliacionesBancarias=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialConciliacionesBancarias=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialConciliacionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialConciliacionesBancarias=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialConciliacionesBancarias=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialConciliacionesBancarias=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialConciliacionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialConciliacionesBancarias.setToolTipText(this.jTableDatosHistorialConciliacionesBancarias.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialConciliacionesBancarias(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialConciliacionesBancarias(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialConciliacionesBancarias() throws Exception {
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
	public void inicializarCombosForeignKeyHistorialConciliacionesBancariasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialConciliacionesBancariasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialConciliacionesBancariasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyHistorialConciliacionesBancarias()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.historialconciliacionesbancariasSessionBean==null) {
				this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
			}

			if(!this.historialconciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.historialconciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyHistorialConciliacionesBancarias()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialConciliacionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialConciliacionesBancarias()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialConciliacionesBancarias();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialConciliacionesBancarias()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialConciliacionesBancarias()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialConciliacionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialConciliacionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialConciliacionesBancarias()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialConciliacionesBancarias()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialConciliacionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialConciliacionesBancarias()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public HistorialConciliacionesBancariasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialConciliacionesBancariasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialConciliacionesBancariasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean(); 
		this.historialconciliacionesbancariasConstantesFunciones=new HistorialConciliacionesBancariasConstantesFunciones(); 
		this.historialconciliacionesbancariasBean=new HistorialConciliacionesBancarias();//(this.historialconciliacionesbancariasConstantesFunciones); 		
		this.historialconciliacionesbancariasReturnGeneral=new HistorialConciliacionesBancariasParameterReturnGeneral(); 
		
		this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialconciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialConciliacionesBancarias(true);
			
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
			
			this.historialconciliacionesbancariasConstantesFunciones=new HistorialConciliacionesBancariasConstantesFunciones(); 
			this.historialconciliacionesbancariasBean=new HistorialConciliacionesBancarias();//this.historialconciliacionesbancariasConstantesFunciones); 			
			this.historialconciliacionesbancariasReturnGeneral=new HistorialConciliacionesBancariasParameterReturnGeneral(); 
		
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Conciliaciones Bancarias Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.historialconciliacionesbancarias=new HistorialConciliacionesBancarias();
			this.historialconciliacionesbancariass = new ArrayList<HistorialConciliacionesBancarias>();
			this.historialconciliacionesbancariassAux = new ArrayList<HistorialConciliacionesBancarias>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic=new HistorialConciliacionesBancariasLogic();
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialconciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias);	
					}
					
					if(this.jInternalFrameImportacionHistorialConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialConciliacionesBancarias);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialConciliacionesBancarias);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias);
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setVisible(false);
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias);
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialConciliacionesBancarias);
					this.jInternalFrameImportacionHistorialConciliacionesBancarias.setVisible(false);
					this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialConciliacionesBancarias);
					this.jInternalFrameOrderByHistorialConciliacionesBancarias.setVisible(false);
					this.jInternalFrameOrderByHistorialConciliacionesBancarias.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialConciliacionesBancariasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialconciliacionesbancariasReturnGeneral=new HistorialConciliacionesBancariasParameterReturnGeneral();
			
			this.historialconciliacionesbancariasParameterGeneral=new HistorialConciliacionesBancariasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialconciliacionesbancariasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			
			
			this.isVisibilidadBusquedaHistorialConciliacionesBancarias=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialConciliacionesBancarias();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialConciliacionesBancarias(false);
			
			this.setPermisosUsuarioHistorialConciliacionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() 
				|| (this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() && this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialConciliacionesBancariasClasesRelacionadas();
			}
			
			if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialConciliacionesBancariasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialConciliacionesBancarias();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialConciliacionesBancarias();
			}
			
			if(!this.isPermisoBusquedaHistorialConciliacionesBancarias) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialConciliacionesBancariasConstantesFunciones.getTiposSeleccionarHistorialConciliacionesBancarias());
				
				this.tiposColumnasSelect=HistorialConciliacionesBancariasConstantesFunciones.getTiposSeleccionarHistorialConciliacionesBancarias(true);
				
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
			//if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialConciliacionesBancarias();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioHistorialConciliacionesBancarias(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioHistorialConciliacionesBancarias(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialConciliacionesBancarias() ;
			
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
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				historialconciliacionesbancariasImplementable= (HistorialConciliacionesBancariasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialConciliacionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialconciliacionesbancariasImplementableHome= (HistorialConciliacionesBancariasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialConciliacionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialconciliacionesbancariass= new ArrayList<HistorialConciliacionesBancarias>();
			this.historialconciliacionesbancariassEliminados= new ArrayList<HistorialConciliacionesBancarias>();
						
			this.isEsNuevoHistorialConciliacionesBancarias=false;
			this.esParaAccionDesdeFormularioHistorialConciliacionesBancarias=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialConciliacionesBancarias(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialConciliacionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialConciliacionesBancarias();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialConciliacionesBancarias();
			}
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialConciliacionesBancarias(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialConciliacionesBancarias: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialConciliacionesBancarias() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialConciliacionesBancarias")) {
				iIndex=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialConciliacionesBancarias();	
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
	
	public void cargarCombosForeignKeyHistorialConciliacionesBancarias(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialConciliacionesBancarias(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialConciliacionesBancarias(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialConciliacionesBancariasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialConciliacionesBancarias();
		
		this.cargarCombosFrameForeignKeyHistorialConciliacionesBancarias();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialConciliacionesBancarias();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialConciliacionesBancarias();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoHistorialConciliacionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			
			if(jTableDatosHistorialConciliacionesBancarias.getRowCount()>=1) {
				jTableDatosHistorialConciliacionesBancarias.removeRowSelectionInterval(0, jTableDatosHistorialConciliacionesBancarias.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialConciliacionesBancarias=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialConciliacionesBancarias(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(true);			
			//this.historialconciliacionesbancarias=new HistorialConciliacionesBancarias();
			//this.historialconciliacionesbancarias.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias() ;
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialConciliacionesBancarias(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialconciliacionesbancarias);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);				
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialConciliacionesBancarias: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRows().length;			
			}
			
			historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialConciliacionesBancarias--;			
				//HistorialConciliacionesBancarias historialconciliacionesbancariasAux= new HistorialConciliacionesBancarias();			
				//historialconciliacionesbancariasAux.setId(this.iIdNuevoHistorialConciliacionesBancarias);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialConciliacionesBancarias historialconciliacionesbancariasOrigen=new HistorialConciliacionesBancarias();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasOrigen : historialconciliacionesbancariassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialconciliacionesbancariasOrigen =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialconciliacionesbancariasOrigen =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialConciliacionesBancarias();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialconciliacionesbancarias.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialConciliacionesBancarias(historialconciliacionesbancariasOrigen,this.historialconciliacionesbancarias,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().add(this.historialconciliacionesbancariasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancariass.add(this.historialconciliacionesbancariasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
				
				this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoHistorialConciliacionesBancarias(), this.getIndiceNuevoHistorialConciliacionesBancarias());
				
				int iLastRow =  this.jTableDatosHistorialConciliacionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialConciliacionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialConciliacionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();									
		
			HistorialConciliacionesBancarias historialconciliacionesbancariasOrigen=new HistorialConciliacionesBancarias();
			HistorialConciliacionesBancarias historialconciliacionesbancariasDestino=new HistorialConciliacionesBancarias();
				
			historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialconciliacionesbancariassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialConciliacionesBancarias.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialconciliacionesbancariasOrigen =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialconciliacionesbancariasOrigen =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialconciliacionesbancariasDestino =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialconciliacionesbancariasDestino =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialconciliacionesbancariasOrigen =historialconciliacionesbancariassSeleccionados.get(0);
				historialconciliacionesbancariasDestino =historialconciliacionesbancariassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialConciliacionesBancarias(historialconciliacionesbancariasOrigen,historialconciliacionesbancariasDestino,true,false);
				
				historialconciliacionesbancariasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialconciliacionesbancariasDestino,historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialconciliacionesbancariasDestino,historialconciliacionesbancariass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
				
				//this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoHistorialConciliacionesBancarias(), this.getIndiceNuevoHistorialConciliacionesBancarias());
				
				int iLastRow =  this.jTableDatosHistorialConciliacionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialConciliacionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialConciliacionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialConciliacionesBancarias.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(!isVisible);
			this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(!isVisible);
			this.jPanelAccionesHistorialConciliacionesBancarias.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialConciliacionesBancarias();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialConciliacionesBancarias();
			
			this.abrirFrameOrderByHistorialConciliacionesBancarias();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialConciliacionesBancarias(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialConciliacionesBancarias);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSize(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.iWidthFormulario,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jContentPaneDetalleHistorialConciliacionesBancarias.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jContentPaneDetalleHistorialConciliacionesBancarias.getWidth(),HistorialConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jContentPaneDetalleHistorialConciliacionesBancarias.getWidth(),HistorialConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jContentPaneDetalleHistorialConciliacionesBancarias.getWidth(),HistorialConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialConciliacionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialConciliacionesBancarias==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialConciliacionesBancarias,false,this);
				} else {
					this.jInternalFrameOrderByHistorialConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialConciliacionesBancarias,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialConciliacionesBancarias);
				this.jInternalFrameOrderByHistorialConciliacionesBancarias.setVisible(false);
				this.jInternalFrameOrderByHistorialConciliacionesBancarias.setSelected(false);
				
				this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialConciliacionesBancarias"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialConciliacionesBancarias();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialConciliacionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialConciliacionesBancarias==null) {
				
				this.jInternalFrameImportacionHistorialConciliacionesBancarias=new ImportacionJInternalFrame(HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialConciliacionesBancarias);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialConciliacionesBancarias);
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.setVisible(false);
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSelected(false);


				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialConciliacionesBancarias"));
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialConciliacionesBancarias"));
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialConciliacionesBancarias"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialConciliacionesBancarias() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias==null) {
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias=new ReporteDinamicoJInternalFrame(HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias);
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialConciliacionesBancarias"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialConciliacionesBancarias();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialConciliacionesBancarias() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialConciliacionesBancarias);
			
	       	this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.dispose();
			//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialConciliacionesBancarias() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialConciliacionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialConciliacionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameOrderByHistorialConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialConciliacionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameOrderByHistorialConciliacionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialConciliacionesBancarias() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialConciliacionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialConciliacionesBancarias(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialConciliacionesBancarias(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(true);
			//this.isEsNuevoHistorialConciliacionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false) ;
			
			if(historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialConciliacionesBancarias(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialConciliacionesBancariasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialConciliacionesBancarias(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(true);
			//this.isEsNuevoHistorialConciliacionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialconciliacionesbancarias.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false) ;
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialConciliacionesBancarias(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialConciliacionesBancarias(false);
			
			//if(!this.isEsNuevoHistorialConciliacionesBancarias) {								
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				
			}
			
			if(this.permiteMantenimiento(this.historialconciliacionesbancarias)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialConciliacionesBancarias=true;
					this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
					this.isEsNuevoHistorialConciliacionesBancarias=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialConciliacionesBancarias=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialConciliacionesBancarias=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(false);
				
				this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(false);
			
												
				
				if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialConciliacionesBancarias();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,historialconciliacionesbancariasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialconciliacionesbancariasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialconciliacionesbancarias.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.historialconciliacionesbancarias.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.historialconciliacionesbancarias.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialconciliacionesbancarias)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialConciliacionesBancariasModel) this.jTableDatosHistorialConciliacionesBancarias.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialConciliacionesBancarias=true;
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
				this.isEsNuevoHistorialConciliacionesBancarias=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(false);
				
				this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(false);
				
				
				
				if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialConciliacionesBancarias();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialConciliacionesBancarias.getRowCount()>=1) {
				jTableDatosHistorialConciliacionesBancarias.removeRowSelectionInterval(0, jTableDatosHistorialConciliacionesBancarias.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialConciliacionesBancarias(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(false) ;
			
			this.isEsNuevoHistorialConciliacionesBancarias=false;
			
			if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialConciliacionesBancarias();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				
				//SI ES MANUAL
				if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialConciliacionesBancarias--;			
			//HistorialConciliacionesBancarias historialconciliacionesbancariasAux= new HistorialConciliacionesBancarias();			
			//historialconciliacionesbancariasAux.setId(this.iIdNuevoHistorialConciliacionesBancarias);
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialConciliacionesBancarias();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
			
			this.historialconciliacionesbancarias.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().add(this.historialconciliacionesbancariasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialconciliacionesbancariass.add(this.historialconciliacionesbancariasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			
			this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoHistorialConciliacionesBancarias(), this.getIndiceNuevoHistorialConciliacionesBancarias());
			
			int iLastRow =  this.jTableDatosHistorialConciliacionesBancarias.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialConciliacionesBancarias.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialConciliacionesBancarias.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();
			}
			
			//this.abrirFrameTreeHistorialConciliacionesBancarias();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialConciliacionesBancarias.setFileImportacion(this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialConciliacionesBancarias.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialConciliacionesBancarias.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		

		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialConciliacionesBancariasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialConciliacionesBancariasBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_enta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_enta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_enta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_enta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFinalizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFinalizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFinalizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFinalizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoLibros_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoLibros_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoLibros_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoLibros_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_terior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_terior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_terior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_terior_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoria="cuenta";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					sNombreCampoCategoria="tipo_documento";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION:
					sNombreCampoCategoria="fecha_finalizacion";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS:
					sNombreCampoCategoria="saldo_libros";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR:
					sNombreCampoCategoria="anterior";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoriaValor="cuenta";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					sNombreCampoCategoriaValor="tipo_documento";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION:
					sNombreCampoCategoriaValor="fecha_finalizacion";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS:
					sNombreCampoCategoriaValor="saldo_libros";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR:
					sNombreCampoCategoriaValor="anterior";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cuenta");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_documento");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Finalizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_finalizacion");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Libros",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_libros");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"anterior");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialConciliacionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getcuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.gettipo_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getfecha_finalizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getsaldo_libros());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR);
					iRow++;

					for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialconciliacionesbancarias.getanterior());
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
			//	this.getFilaCabeceraExportarExcelHistorialConciliacionesBancarias(row);				
			//	iRow++;
			//}				
			
			//for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialConciliacionesBancarias(historialconciliacionesbancariasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialConciliacionesBancarias();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialConciliacionesBancarias() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialConciliacionesBancarias.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialConciliacionesBancarias.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialConciliacionesBancarias.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialConciliacionesBancarias.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialConciliacionesBancarias.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialConciliacionesBancarias.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialConciliacionesBancarias.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialConciliacionesBancarias(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialConciliacionesBancarias(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialConciliacionesBancarias(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialConciliacionesBancarias(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialConciliacionesBancarias(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialConciliacionesBancarias(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialConciliacionesBancarias() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias();
		
		this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialConciliacionesBancarias();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialConciliacionesBancarias() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialConciliacionesBancarias(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialConciliacionesBancarias(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialConciliacionesBancarias(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialConciliacionesBancarias(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialConciliacionesBancarias() throws Exception {
		try	{
			if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialConciliacionesBancarias();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialConciliacionesBancarias() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialConciliacionesBancarias() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialConciliacionesBancarias();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialConciliacionesBancarias() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=HistorialConciliacionesBancariasConstantesFunciones.getTiposSeleccionarHistorialConciliacionesBancarias(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=HistorialConciliacionesBancariasConstantesFunciones.getTiposSeleccionarHistorialConciliacionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=HistorialConciliacionesBancariasConstantesFunciones.getTiposSeleccionarHistorialConciliacionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialConciliacionesBancarias()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.getSelectedItem()!=null){this.id_cuenta_contableBusquedaHistorialConciliacionesBancarias=((CuentaContable)this.jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaHistorialConciliacionesBancarias=new Date(this.jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.getDate().getTime());
		this.fecha_hastaBusquedaHistorialConciliacionesBancarias=new Date(this.jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialConciliacionesBancarias(Boolean esInicializar) throws Exception {				
		if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialConciliacionesBancarias();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialConciliacionesBancarias() throws Exception {
		this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialConciliacionesBancarias() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialConciliacionesBancariasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancariasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialConciliacionesBancarias(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialconciliacionesbancariass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialConciliacionesBancarias.setModel(new HistorialConciliacionesBancariasModel(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialConciliacionesBancarias.setModel(new HistorialConciliacionesBancariasModel(this.historialconciliacionesbancariass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialConciliacionesBancarias!=null && this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialConciliacionesBancarias();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,historialconciliacionesbancariasConstantesFunciones.resaltarSeleccionarHistorialConciliacionesBancarias,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,historialconciliacionesbancariasConstantesFunciones.resaltarSeleccionarHistorialConciliacionesBancarias,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostraridHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltaridHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activaridHistorialConciliacionesBancarias,iSizeTabla,this,true,"idHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltaridHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activaridHistorialConciliacionesBancarias,this,true,"idHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrardebito_localHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltardebito_localHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activardebito_localHistorialConciliacionesBancarias,iSizeTabla,this,true,"debito_localHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltardebito_localHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activardebito_localHistorialConciliacionesBancarias,this,true,"debito_localHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarcredito_localHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcredito_localHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcredito_localHistorialConciliacionesBancarias,iSizeTabla,this,true,"credito_localHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcredito_localHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcredito_localHistorialConciliacionesBancarias,this,true,"credito_localHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_chequeHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_chequeHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_chequeHistorialConciliacionesBancarias,iSizeTabla,this,true,"numero_chequeHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_chequeHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_chequeHistorialConciliacionesBancarias,this,true,"numero_chequeHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarcodigoHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcodigoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcodigoHistorialConciliacionesBancarias,iSizeTabla,this,true,"codigoHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcodigoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcodigoHistorialConciliacionesBancarias,this,true,"codigoHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarbeneficiarioHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarbeneficiarioHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarbeneficiarioHistorialConciliacionesBancarias,iSizeTabla,this,true,"beneficiarioHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarbeneficiarioHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarbeneficiarioHistorialConciliacionesBancarias,this,true,"beneficiarioHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrardetalleHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltardetalleHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activardetalleHistorialConciliacionesBancarias,iSizeTabla,this,true,"detalleHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltardetalleHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activardetalleHistorialConciliacionesBancarias,this,true,"detalleHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarcuentaHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcuentaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcuentaHistorialConciliacionesBancarias,iSizeTabla,this,true,"cuentaHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarcuentaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarcuentaHistorialConciliacionesBancarias,this,true,"cuentaHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_documentoHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_documentoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activartipo_documentoHistorialConciliacionesBancarias,iSizeTabla,this,true,"tipo_documentoHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_documentoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activartipo_documentoHistorialConciliacionesBancarias,this,true,"tipo_documentoHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_mayorHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_mayorHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_mayorHistorialConciliacionesBancarias,iSizeTabla,this,true,"numero_mayorHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_mayorHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_mayorHistorialConciliacionesBancarias,this,true,"numero_mayorHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_finalizacionHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_finalizacionHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarfecha_finalizacionHistorialConciliacionesBancarias,iSizeTabla,this,true,"fecha_finalizacionHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_finalizacionHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarfecha_finalizacionHistorialConciliacionesBancarias,this,true,"fecha_finalizacionHistorialConciliacionesBancarias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_movimientoHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_movimientoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activartipo_movimientoHistorialConciliacionesBancarias,iSizeTabla,this,true,"tipo_movimientoHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_movimientoHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activartipo_movimientoHistorialConciliacionesBancarias,this,true,"tipo_movimientoHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarsaldo_librosHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarsaldo_librosHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarsaldo_librosHistorialConciliacionesBancarias,iSizeTabla,this,true,"saldo_librosHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarsaldo_librosHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarsaldo_librosHistorialConciliacionesBancarias,this,true,"saldo_librosHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarfechaHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarfechaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarfechaHistorialConciliacionesBancarias,iSizeTabla,this,true,"fechaHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarfechaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarfechaHistorialConciliacionesBancarias,this,true,"fechaHistorialConciliacionesBancarias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_cuentaHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_cuentaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_cuentaHistorialConciliacionesBancarias,iSizeTabla,this,true,"numero_cuentaHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_cuentaHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnumero_cuentaHistorialConciliacionesBancarias,this,true,"numero_cuentaHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostrarnombre_cuenta_contableHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnombre_cuenta_contableHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnombre_cuenta_contableHistorialConciliacionesBancarias,iSizeTabla,this,true,"nombre_cuenta_contableHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltarnombre_cuenta_contableHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activarnombre_cuenta_contableHistorialConciliacionesBancarias,this,true,"nombre_cuenta_contableHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR));

		if(this.historialconciliacionesbancariasConstantesFunciones.mostraranteriorHistorialConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltaranteriorHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activaranteriorHistorialConciliacionesBancarias,iSizeTabla,this,true,"anteriorHistorialConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialconciliacionesbancariasConstantesFunciones.resaltaranteriorHistorialConciliacionesBancarias,this.historialconciliacionesbancariasConstantesFunciones.activaranteriorHistorialConciliacionesBancarias,this,true,"anteriorHistorialConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialConciliacionesBancarias.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialConciliacionesBancarias.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialConciliacionesBancarias.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialConciliacionesBancarias.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialConciliacionesBancarias.moveColumn(this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialConciliacionesBancarias.moveColumn(this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialConciliacionesBancarias.moveColumn(this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialConciliacionesBancarias.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialConciliacionesBancarias.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialConciliacionesBancarias,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialConciliacionesBancarias.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialConciliacionesBancarias.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialConciliacionesBancarias.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialconciliacionesbancariass.size()-1;
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
		//this.jTableDatosHistorialConciliacionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialConciliacionesBancarias();
			
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
				
				//this.isEsNuevoHistorialConciliacionesBancarias=false;
					
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
				if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialConciliacionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialconciliacionesbancarias.getsType().equals("DUPLICADO")
				   || this.historialconciliacionesbancarias.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialConciliacionesBancarias=true;
				
				} else {
					this.isEsNuevoHistorialConciliacionesBancarias=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					if(this.historialconciliacionesbancarias.getId()>=0 && !this.historialconciliacionesbancarias.getIsNew()) {						
						this.isEsNuevoHistorialConciliacionesBancarias=false;
						
					} else {
						this.isEsNuevoHistorialConciliacionesBancarias=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialConciliacionesBancarias(esRelaciones);						
				
				this.seleccionarHistorialConciliacionesBancarias(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialconciliacionesbancarias.getId()<0) {
					this.isEsNuevoHistorialConciliacionesBancarias=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialConciliacionesBancarias(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialConciliacionesBancarias(evt,rowIndex);
				}	
				
				if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialConciliacionesBancarias: " + this.dDif); 
					}
				}								
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialConciliacionesBancarias(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialconciliacionesbancarias)) {
					if(this.historialconciliacionesbancarias.getId()>0) {
						this.historialconciliacionesbancarias.setIsDeleted(true);
						
						this.historialconciliacionesbancariassEliminados.add(this.historialconciliacionesbancarias);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().remove(this.historialconciliacionesbancarias);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancariass.remove(this.historialconciliacionesbancarias);				
					}
					
					
					((HistorialConciliacionesBancariasModel) this.jTableDatosHistorialConciliacionesBancarias.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialConciliacionesBancarias(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialConciliacionesBancarias) {
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialConciliacionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialConciliacionesBancarias(historialconciliacionesbancarias,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(historialconciliacionesbancarias);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialConciliacionesBancarias(historialconciliacionesbancarias,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialConciliacionesBancarias(historialconciliacionesbancarias);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_cheque());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcodigo());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getbeneficiario());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.gettipo_documento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setDate(historialconciliacionesbancarias.getfecha_finalizacion());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.gettipo_movimiento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getsaldo_libros().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setDate(historialconciliacionesbancarias.getfecha());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_cuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getanterior().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialConciliacionesBancarias historialconciliacionesbancariasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialconciliacionesbancariasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialConciliacionesBancarias historialconciliacionesbancariasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialconciliacionesbancariasLocal=this.historialconciliacionesbancarias;
			} else {
				historialconciliacionesbancariasLocal=this.historialconciliacionesbancariasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialconciliacionesbancariasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialConciliacionesBancarias(historialconciliacionesbancariasLocal,true);
					
					if(historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialconciliacionesbancariasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialconciliacionesbancariasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(historialconciliacionesbancarias,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(historialconciliacionesbancarias);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(historialconciliacionesbancarias,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.getText()==null || this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.getText()=="" || this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setText("0");
			}

			if(conColumnasBase) {historialconciliacionesbancarias.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelIdHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldebito_localHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcredito_localHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setnumero_cheque(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_chequeHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setcodigo(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcodigoHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setbeneficiario(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelbeneficiarioHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setdetalle(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeldetalleHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setcuenta(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelcuentaHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.settipo_documento(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_documentoHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setnumero_mayor(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_mayorHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setfecha_finalizacion(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfecha_finalizacionHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.settipo_movimiento(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabeltipo_movimientoHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setsaldo_libros(Double.parseDouble(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelsaldo_librosHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setfecha(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelfechaHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setnumero_cuenta(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnumero_cuentaHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setnombre_cuenta_contable(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialconciliacionesbancarias.setanterior(Double.parseDouble(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelanteriorHistorialConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancariasBean,HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancariasOrigen,HistorialConciliacionesBancarias historialconciliacionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getId()!=null && !historialconciliacionesbancariasOrigen.getId().equals(0L))) {historialconciliacionesbancarias.setId(historialconciliacionesbancariasOrigen.getId());}}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getfecha_desde()!=null && !historialconciliacionesbancariasOrigen.getfecha_desde().equals(new Date()))) {historialconciliacionesbancarias.setfecha_desde(historialconciliacionesbancariasOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getfecha_hasta()!=null && !historialconciliacionesbancariasOrigen.getfecha_hasta().equals(new Date()))) {historialconciliacionesbancarias.setfecha_hasta(historialconciliacionesbancariasOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getdebito_local()!=null && !historialconciliacionesbancariasOrigen.getdebito_local().equals(0.0))) {historialconciliacionesbancarias.setdebito_local(historialconciliacionesbancariasOrigen.getdebito_local());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getcredito_local()!=null && !historialconciliacionesbancariasOrigen.getcredito_local().equals(0.0))) {historialconciliacionesbancarias.setcredito_local(historialconciliacionesbancariasOrigen.getcredito_local());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getnumero_cheque()!=null && !historialconciliacionesbancariasOrigen.getnumero_cheque().equals(""))) {historialconciliacionesbancarias.setnumero_cheque(historialconciliacionesbancariasOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getcodigo()!=null && !historialconciliacionesbancariasOrigen.getcodigo().equals(""))) {historialconciliacionesbancarias.setcodigo(historialconciliacionesbancariasOrigen.getcodigo());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getbeneficiario()!=null && !historialconciliacionesbancariasOrigen.getbeneficiario().equals(""))) {historialconciliacionesbancarias.setbeneficiario(historialconciliacionesbancariasOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getdetalle()!=null && !historialconciliacionesbancariasOrigen.getdetalle().equals(""))) {historialconciliacionesbancarias.setdetalle(historialconciliacionesbancariasOrigen.getdetalle());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getcuenta()!=null && !historialconciliacionesbancariasOrigen.getcuenta().equals(""))) {historialconciliacionesbancarias.setcuenta(historialconciliacionesbancariasOrigen.getcuenta());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.gettipo_documento()!=null && !historialconciliacionesbancariasOrigen.gettipo_documento().equals(""))) {historialconciliacionesbancarias.settipo_documento(historialconciliacionesbancariasOrigen.gettipo_documento());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getnumero_mayor()!=null && !historialconciliacionesbancariasOrigen.getnumero_mayor().equals(""))) {historialconciliacionesbancarias.setnumero_mayor(historialconciliacionesbancariasOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getfecha_finalizacion()!=null && !historialconciliacionesbancariasOrigen.getfecha_finalizacion().equals(new Date()))) {historialconciliacionesbancarias.setfecha_finalizacion(historialconciliacionesbancariasOrigen.getfecha_finalizacion());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.gettipo_movimiento()!=null && !historialconciliacionesbancariasOrigen.gettipo_movimiento().equals(""))) {historialconciliacionesbancarias.settipo_movimiento(historialconciliacionesbancariasOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getsaldo_libros()!=null && !historialconciliacionesbancariasOrigen.getsaldo_libros().equals(0.0))) {historialconciliacionesbancarias.setsaldo_libros(historialconciliacionesbancariasOrigen.getsaldo_libros());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getfecha()!=null && !historialconciliacionesbancariasOrigen.getfecha().equals(new Date()))) {historialconciliacionesbancarias.setfecha(historialconciliacionesbancariasOrigen.getfecha());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getnumero_cuenta()!=null && !historialconciliacionesbancariasOrigen.getnumero_cuenta().equals(""))) {historialconciliacionesbancarias.setnumero_cuenta(historialconciliacionesbancariasOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getnombre_cuenta_contable()!=null && !historialconciliacionesbancariasOrigen.getnombre_cuenta_contable().equals(""))) {historialconciliacionesbancarias.setnombre_cuenta_contable(historialconciliacionesbancariasOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasOrigen.getanterior()!=null && !historialconciliacionesbancariasOrigen.getanterior().equals(0.0))) {historialconciliacionesbancarias.setanterior(historialconciliacionesbancariasOrigen.getanterior());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_cheque());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcodigo());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getbeneficiario());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getcuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.gettipo_documento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setDate(historialconciliacionesbancarias.getfecha_finalizacion());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.gettipo_movimiento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getsaldo_libros().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setDate(historialconciliacionesbancarias.getfecha());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnumero_cuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setText(historialconciliacionesbancarias.getanterior().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialConciliacionesBancarias(HistorialConciliacionesBancariasBean historialconciliacionesbancariasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getId().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getnumero_cheque());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getcodigo());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getbeneficiario());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getdetalle());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getcuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.gettipo_documento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getnumero_mayor());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setDate(historialconciliacionesbancariasBean.getfecha_finalizacion());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getsaldo_libros().toString());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setDate(historialconciliacionesbancariasBean.getfecha());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setText(historialconciliacionesbancariasBean.getanterior().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialConciliacionesBancarias(HistorialConciliacionesBancariasParameterReturnGeneral historialconciliacionesbancariasReturnGeneral,HistorialConciliacionesBancariasBean historialconciliacionesbancariasBean,Boolean conDefault) throws Exception { 
		try {
			HistorialConciliacionesBancarias historialconciliacionesbancariasLocal=new HistorialConciliacionesBancarias();
			
			historialconciliacionesbancariasLocal=historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getId()!=null && !historialconciliacionesbancariasLocal.getId().equals(0L))) {historialconciliacionesbancariasBean.setId(historialconciliacionesbancariasLocal.getId());}}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getdebito_local()!=null && !historialconciliacionesbancariasLocal.getdebito_local().equals(0.0))) {historialconciliacionesbancariasBean.setdebito_local(historialconciliacionesbancariasLocal.getdebito_local());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getcredito_local()!=null && !historialconciliacionesbancariasLocal.getcredito_local().equals(0.0))) {historialconciliacionesbancariasBean.setcredito_local(historialconciliacionesbancariasLocal.getcredito_local());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getnumero_cheque()!=null && !historialconciliacionesbancariasLocal.getnumero_cheque().equals(""))) {historialconciliacionesbancariasBean.setnumero_cheque(historialconciliacionesbancariasLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getcodigo()!=null && !historialconciliacionesbancariasLocal.getcodigo().equals(""))) {historialconciliacionesbancariasBean.setcodigo(historialconciliacionesbancariasLocal.getcodigo());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getbeneficiario()!=null && !historialconciliacionesbancariasLocal.getbeneficiario().equals(""))) {historialconciliacionesbancariasBean.setbeneficiario(historialconciliacionesbancariasLocal.getbeneficiario());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getdetalle()!=null && !historialconciliacionesbancariasLocal.getdetalle().equals(""))) {historialconciliacionesbancariasBean.setdetalle(historialconciliacionesbancariasLocal.getdetalle());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getcuenta()!=null && !historialconciliacionesbancariasLocal.getcuenta().equals(""))) {historialconciliacionesbancariasBean.setcuenta(historialconciliacionesbancariasLocal.getcuenta());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.gettipo_documento()!=null && !historialconciliacionesbancariasLocal.gettipo_documento().equals(""))) {historialconciliacionesbancariasBean.settipo_documento(historialconciliacionesbancariasLocal.gettipo_documento());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getnumero_mayor()!=null && !historialconciliacionesbancariasLocal.getnumero_mayor().equals(""))) {historialconciliacionesbancariasBean.setnumero_mayor(historialconciliacionesbancariasLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getfecha_finalizacion()!=null && !historialconciliacionesbancariasLocal.getfecha_finalizacion().equals(new Date()))) {historialconciliacionesbancariasBean.setfecha_finalizacion(historialconciliacionesbancariasLocal.getfecha_finalizacion());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.gettipo_movimiento()!=null && !historialconciliacionesbancariasLocal.gettipo_movimiento().equals(""))) {historialconciliacionesbancariasBean.settipo_movimiento(historialconciliacionesbancariasLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getsaldo_libros()!=null && !historialconciliacionesbancariasLocal.getsaldo_libros().equals(0.0))) {historialconciliacionesbancariasBean.setsaldo_libros(historialconciliacionesbancariasLocal.getsaldo_libros());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getfecha()!=null && !historialconciliacionesbancariasLocal.getfecha().equals(new Date()))) {historialconciliacionesbancariasBean.setfecha(historialconciliacionesbancariasLocal.getfecha());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getnumero_cuenta()!=null && !historialconciliacionesbancariasLocal.getnumero_cuenta().equals(""))) {historialconciliacionesbancariasBean.setnumero_cuenta(historialconciliacionesbancariasLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getnombre_cuenta_contable()!=null && !historialconciliacionesbancariasLocal.getnombre_cuenta_contable().equals(""))) {historialconciliacionesbancariasBean.setnombre_cuenta_contable(historialconciliacionesbancariasLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && historialconciliacionesbancariasLocal.getanterior()!=null && !historialconciliacionesbancariasLocal.getanterior().equals(0.0))) {historialconciliacionesbancariasBean.setanterior(historialconciliacionesbancariasLocal.getanterior());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialConciliacionesBancariasGenerico(Long idHistorialConciliacionesBancariasSeleccionado,JComboBox jComboBoxHistorialConciliacionesBancarias,List<HistorialConciliacionesBancarias> historialconciliacionesbancariassLocal)throws Exception {
		try {
			HistorialConciliacionesBancarias  historialconciliacionesbancariasTemp=null;

			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassLocal) {
				if(historialconciliacionesbancariasAux.getId()!=null && historialconciliacionesbancariasAux.getId().equals(idHistorialConciliacionesBancariasSeleccionado)) {
					historialconciliacionesbancariasTemp=historialconciliacionesbancariasAux;
					break;
				}
			}

			jComboBoxHistorialConciliacionesBancarias.setSelectedItem(historialconciliacionesbancariasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialConciliacionesBancariasGenerico(JComboBox jComboBoxHistorialConciliacionesBancarias,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialConciliacionesBancarias.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialConciliacionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialConciliacionesBancarias.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialConciliacionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialconciliacionesbancarias=(HistorialConciliacionesBancarias) historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialconciliacionesbancarias =(HistorialConciliacionesBancarias) historialconciliacionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!historialconciliacionesbancarias.getIsNew() && !historialconciliacionesbancarias.getIsChanged() && !historialconciliacionesbancarias.getIsDeleted()) {
				sDescripcion=historialconciliacionesbancarias.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=historialconciliacionesbancarias.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!historialconciliacionesbancarias.getIsNew() && !historialconciliacionesbancarias.getIsChanged() && !historialconciliacionesbancarias.getIsDeleted()) {
				sDescripcion=historialconciliacionesbancarias.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=historialconciliacionesbancarias.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialConciliacionesBancarias historialconciliacionesbancariasRow=new HistorialConciliacionesBancarias();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialconciliacionesbancariasRow=(HistorialConciliacionesBancarias) historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialconciliacionesbancariasRow=(HistorialConciliacionesBancarias) historialconciliacionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));			
			this.jButtonDuplicarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias && this.isPermisoDuplicarHistorialConciliacionesBancarias));			
			this.jButtonCopiarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias && this.isPermisoCopiarHistorialConciliacionesBancarias));
			this.jButtonVerFormHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias && this.isPermisoVerFormHistorialConciliacionesBancarias));
			
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));			
			
			this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));			
			this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias && this.isPermisoEliminarHistorialConciliacionesBancarias));
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias);							
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));						
			this.jButtonDuplicarToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias && this.isPermisoDuplicarHistorialConciliacionesBancarias));						
			this.jButtonCopiarToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias && this.isPermisoCopiarHistorialConciliacionesBancarias));			
			this.jButtonVerFormToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias && this.isPermisoVerFormHistorialConciliacionesBancarias));			
			this.jButtonAbrirOrderByToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));
			this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));			
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias  && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias && this.isPermisoEliminarHistorialConciliacionesBancarias));
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarToolBarHistorialConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias);				
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));			
			this.jMenuItemDuplicarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias && this.isPermisoDuplicarHistorialConciliacionesBancarias));			
			this.jMenuItemCopiarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias && this.isPermisoCopiarHistorialConciliacionesBancarias));			
			this.jMenuItemVerFormHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias && this.isPermisoVerFormHistorialConciliacionesBancarias));			
			this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));			
			//this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));
			this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));			
			//this.jMenuItemDetalleMostrarOcultarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias && this.isPermisoOrdenHistorialConciliacionesBancarias));			
			this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias));			
			this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias && this.isPermisoNuevoHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));									
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemModificarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemActualizarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias && this.isPermisoActualizarHistorialConciliacionesBancarias));	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemEliminarHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias && this.isPermisoEliminarHistorialConciliacionesBancarias));
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemCancelarHistorialConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias);				
			}
			
			this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));						
			this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=this.jButtonNuevoHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias=this.jButtonDuplicarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias=this.jButtonCopiarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias=this.jButtonVerFormHistorialConciliacionesBancarias.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialConciliacionesBancarias=this.jButtonAbrirOrderByHistorialConciliacionesBancarias.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=this.jButtonModificarHistorialConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=this.jButtonNuevoToolBarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarToolBarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarToolBarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarToolBarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarToolBarHistorialConciliacionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=this.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=this.jMenuItemNuevoHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemModificarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemActualizarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemEliminarHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemCancelarHistorialConciliacionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialConciliacionesBancarias(Boolean esInicializar) {
		if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				//if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialConciliacionesBancarias();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialConciliacionesBancarias(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialConciliacionesBancarias() {
		this.jButtonNuevoHistorialConciliacionesBancarias.setVisible(this.isPermisoNuevoHistorialConciliacionesBancarias);			
		this.jButtonDuplicarHistorialConciliacionesBancarias.setVisible(this.isPermisoDuplicarHistorialConciliacionesBancarias);			
		this.jButtonCopiarHistorialConciliacionesBancarias.setVisible(this.isPermisoCopiarHistorialConciliacionesBancarias);			
		this.jButtonVerFormHistorialConciliacionesBancarias.setVisible(this.isPermisoVerFormHistorialConciliacionesBancarias);			
		
		this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setVisible(this.isPermisoOrdenHistorialConciliacionesBancarias);					
		
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.setVisible(this.isPermisoNuevoHistorialConciliacionesBancarias);			
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarHistorialConciliacionesBancarias.setVisible(this.isPermisoActualizarHistorialConciliacionesBancarias);	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.setVisible(this.isPermisoActualizarHistorialConciliacionesBancarias);	
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.setVisible(this.isPermisoEliminarHistorialConciliacionesBancarias);
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias);						
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.setVisible(this.isPermisoGuardarCambiosHistorialConciliacionesBancarias);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setVisible(this.isPermisoActualizarHistorialConciliacionesBancarias);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialConciliacionesBancarias() {
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarHistorialConciliacionesBancarias.setVisible(this.isPermisoActualizarHistorialConciliacionesBancarias);	
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.setVisible(this.isPermisoActualizarHistorialConciliacionesBancarias);	
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.setVisible(this.isPermisoEliminarHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias);							
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias && this.isPermisoGuardarCambiosHistorialConciliacionesBancarias));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialConciliacionesBancarias() {
		if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialConciliacionesBancarias();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialConciliacionesBancarias() {
	}
	
	public void jTableDatosHistorialConciliacionesBancariasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialConciliacionesBancarias(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialconciliacionesbancarias.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHistorialConciliacionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHistorialConciliacionesBancarias(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialConciliacionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.historialconciliacionesbancariasLogic.getConnexion());

				if(this.historialconciliacionesbancarias.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.historialconciliacionesbancarias.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialConciliacionesBancarias=(TitledBorder)this.jScrollPanelDatosHistorialConciliacionesBancarias.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHistorialConciliacionesBancarias.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.historialconciliacionesbancarias.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebHistorialConciliacionesBancarias(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialConciliacionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.historialconciliacionesbancariasLogic.getConnexion());

				if(this.historialconciliacionesbancarias.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.historialconciliacionesbancarias.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialConciliacionesBancarias=(TitledBorder)this.jScrollPanelDatosHistorialConciliacionesBancarias.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderHistorialConciliacionesBancarias.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.historialconciliacionesbancarias.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.historialconciliacionesbancarias.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.historialconciliacionesbancarias.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.historialconciliacionesbancarias.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.historialconciliacionesbancarias.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.historialconciliacionesbancarias.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.historialconciliacionesbancarias.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.historialconciliacionesbancarias.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.historialconciliacionesbancarias.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncuentaHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getcuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cuenta like '%"+this.historialconciliacionesbancarias.getcuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_documentoHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.gettipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_documento like '%"+this.historialconciliacionesbancarias.gettipo_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.historialconciliacionesbancarias.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finalizacionHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getfecha_finalizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_finalizacion = '"+Funciones2.getStringPostgresDate(this.historialconciliacionesbancarias.getfecha_finalizacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.historialconciliacionesbancarias.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_librosHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getsaldo_libros()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_libros = "+this.historialconciliacionesbancarias.getsaldo_libros().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.historialconciliacionesbancarias.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.historialconciliacionesbancarias.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.historialconciliacionesbancarias.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonanteriorHistorialConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.gethistorialconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialconciliacionesbancarias==null) {
						this.historialconciliacionesbancarias = new HistorialConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);
				}

				if(this.historialconciliacionesbancarias.getanterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where anterior = "+this.historialconciliacionesbancarias.getanterior().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);

			this.getHistorialConciliacionesBancariassBusquedaHistorialConciliacionesBancarias();

			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);

			//if(HistorialConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);

			this.getHistorialConciliacionesBancariassFK_IdCuentaContable();

			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);

			//if(HistorialConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHistorialConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);

			this.getHistorialConciliacionesBancariassFK_IdEmpresa();

			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);

			//if(HistorialConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialconciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialConciliacionesBancarias() {
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.dispose();
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.dispose();
			this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias=null;
		}
		
		if(this.jInternalFrameImportacionHistorialConciliacionesBancarias!=null) {
			this.jInternalFrameImportacionHistorialConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialConciliacionesBancarias.dispose();
			this.jInternalFrameImportacionHistorialConciliacionesBancarias=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialConciliacionesBancarias();
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialConciliacionesBancarias")) {
				jButtonDuplicarHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialConciliacionesBancarias")) {
				jButtonCopiarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialConciliacionesBancarias")) {
				jButtonVerFormHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialConciliacionesBancarias")) {
				jButtonDuplicarHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialConciliacionesBancarias")) {
				jButtonDuplicarHistorialConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialConciliacionesBancarias")) {
				jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialConciliacionesBancarias")) {
				jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialConciliacionesBancarias")) {
				jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialConciliacionesBancarias")) {
				jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialConciliacionesBancarias")) {
				jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialConciliacionesBancarias")) {
				jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialConciliacionesBancarias")) {
				jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialConciliacionesBancarias")) {
				jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialConciliacionesBancarias")) {
				jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialConciliacionesBancarias")) {
				jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialConciliacionesBancarias")) {
				jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialConciliacionesBancarias")) {
				jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialConciliacionesBancarias")) {
				jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialConciliacionesBancarias")) {
				jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialConciliacionesBancarias")) {
				jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialConciliacionesBancarias")) {
				jButtonMostrarOcultarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialConciliacionesBancarias")) {
				jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialConciliacionesBancarias")) {
				jButtonCopiarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialConciliacionesBancarias")) {
				jButtonVerFormHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialConciliacionesBancarias")) {
				jButtonCopiarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialConciliacionesBancarias")) {
				jButtonVerFormHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialConciliacionesBancarias")) {
				jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialConciliacionesBancarias")) {
				jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialConciliacionesBancarias")) {
				jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialConciliacionesBancarias")) {
				jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialConciliacionesBancarias")) {
				jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialConciliacionesBancarias")) {
				jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialConciliacionesBancarias")) {
				jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialConciliacionesBancarias")) {
				jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialConciliacionesBancarias")) {
				jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialConciliacionesBancarias") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias")) {
				jButtonAbrirOrderByHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialConciliacionesBancarias") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialConciliacionesBancarias")) {
				jButtonMostrarOcultarHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialConciliacionesBancarias")) {
				jButtonCerrarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialConciliacionesBancarias")) {
				jButtonGenerarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialConciliacionesBancarias")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialConciliacionesBancarias")) {
				jButtonCerrarImportacionHistorialConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialConciliacionesBancarias")) {
				
				jButtonGenerarImportacionHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialConciliacionesBancarias")) {
				
				jButtonAbrirImportacionHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialConciliacionesBancarias")) {
				jComboBoxTiposAccionesHistorialConciliacionesBancariasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialConciliacionesBancarias")) {
				jComboBoxTiposRelacionesHistorialConciliacionesBancariasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialConciliacionesBancarias")) {
				jComboBoxTiposAccionesHistorialConciliacionesBancariasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialConciliacionesBancarias")) {
				
				jComboBoxTiposSeleccionarHistorialConciliacionesBancariasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialConciliacionesBancarias")) {
				jTextFieldValorCampoGeneralHistorialConciliacionesBancariasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialConciliacionesBancarias")) {
				jButtonAbrirOrderByHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialConciliacionesBancarias")) {
				jButtonAbrirOrderByHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialConciliacionesBancarias")) {
				jButtonCerrarOrderByHistorialConciliacionesBancariasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonidHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialConciliacionesBancariasUpdate")) {
				this.jButtonid_empresaHistorialConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonid_empresaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialConciliacionesBancariasUpdate")) {
				this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_desdeHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_hastaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localHistorialConciliacionesBancariasBusqueda")) {
				this.jButtondebito_localHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_localHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_chequeHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncodigoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonbeneficiarioHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleHistorialConciliacionesBancariasBusqueda")) {
				this.jButtondetalleHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncuentaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_documentoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtontipo_documentoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_mayorHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalizacionHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtontipo_movimientoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_librosHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonsaldo_librosHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfechaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anteriorHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonanteriorHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias")) {
				this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasActionPerformed(evt);
			}
			
			;
			
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialConciliacionesBancarias();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialConciliacionesBancarias historialconciliacionesbancariasLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialconciliacionesbancariasLocal=this.historialconciliacionesbancarias;
			} else {
				historialconciliacionesbancariasLocal=this.historialconciliacionesbancariasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
							
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
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
			
			


			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
								
						
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
								
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
							
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
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
			
			


			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
								
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialConciliacionesBancarias")) {
					jCheckBoxSeleccionarTodosHistorialConciliacionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialConciliacionesBancarias")) {
					jCheckBoxSeleccionadosHistorialConciliacionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialConciliacionesBancarias")) {
					
				}
				
				


				
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
												
				
				


				
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
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
			
			


			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialconciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialconciliacionesbancarias);
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
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
				
				


				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialConciliacionesBancarias.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialconciliacionesbancariasAnterior =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialConciliacionesBancarias")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialConciliacionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialConciliacionesBancarias.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialconciliacionesbancarias =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialconciliacionesbancarias);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialConciliacionesBancarias")) {
				
				}
				
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialConciliacionesBancarias")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialConciliacionesBancarias.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialConciliacionesBancarias")) {
			
			}
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialConciliacionesBancarias();
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialConciliacionesBancarias")) {
				jButtonDuplicarHistorialConciliacionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialConciliacionesBancarias")) {
				jButtonCopiarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialConciliacionesBancarias")) {
				jButtonVerFormHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialConciliacionesBancarias")) {
				jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialConciliacionesBancarias")) {
				jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialConciliacionesBancarias")) {
				jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialConciliacionesBancarias")) {
				jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialConciliacionesBancarias")) {
				jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialConciliacionesBancarias")) {
				jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialConciliacionesBancarias")) {
				jButtonAbrirOrderByHistorialConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialConciliacionesBancarias")) {
				jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialConciliacionesBancarias")) {
				jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialConciliacionesBancarias")) {
				jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonidHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialConciliacionesBancariasUpdate")) {
				this.jButtonid_empresaHistorialConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonid_empresaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialConciliacionesBancariasUpdate")) {
				this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_desdeHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_hastaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localHistorialConciliacionesBancariasBusqueda")) {
				this.jButtondebito_localHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_localHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_chequeHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncodigoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonbeneficiarioHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleHistorialConciliacionesBancariasBusqueda")) {
				this.jButtondetalleHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtoncuentaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_documentoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtontipo_documentoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_mayorHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalizacionHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoHistorialConciliacionesBancariasBusqueda")) {
				this.jButtontipo_movimientoHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_librosHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonsaldo_librosHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonfechaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anteriorHistorialConciliacionesBancariasBusqueda")) {
				this.jButtonanteriorHistorialConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialConciliacionesBancarias();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialConciliacionesBancarias")) {
				closingInternalFrameHistorialConciliacionesBancarias();
				
			} else if(sTipo.equals("jButtonCancelarHistorialConciliacionesBancarias")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialConciliacionesBancarias = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialConciliacionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(HistorialConciliacionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialConciliacionesBancarias.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialConciliacionesBancariasActionPerformed(null);
			}
			
			HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialconciliacionesbancarias,new Object(),this.historialconciliacionesbancariasParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialConciliacionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialConciliacionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialConciliacionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialconciliacionesbancarias)) {
			if(!esControlTabla) {
				if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);			
				}
				
				if(this.historialconciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral,this.historialconciliacionesbancariasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialconciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialConciliacionesBancarias(classes,this.historialconciliacionesbancariasReturnGeneral,this.historialconciliacionesbancariasBean,false);
					}
						
					if(this.historialconciliacionesbancariasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias());	
					}
						
					if(this.historialconciliacionesbancariasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias(),classes);//this.historialconciliacionesbancariasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,classes);//this.historialconciliacionesbancariasBean);									
				}
			
				if(HistorialConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialConciliacionesBancarias(this.historialconciliacionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialConciliacionesBancarias(this.historialconciliacionesbancarias);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialconciliacionesbancariasAnterior!=null) {
						this.historialconciliacionesbancarias=this.historialconciliacionesbancariasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialconciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias(),historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancarias(),this.historialconciliacionesbancariass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialConciliacionesBancarias.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialConciliacionesBancarias.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialConciliacionesBancarias();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialConciliacionesBancarias() throws Exception {
		
		HistorialConciliacionesBancariasModel historialconciliacionesbancariasModel=(HistorialConciliacionesBancariasModel)this.jTableDatosHistorialConciliacionesBancarias.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialconciliacionesbancariasModel.historialconciliacionesbancariass=this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialconciliacionesbancariasModel.historialconciliacionesbancariass=this.historialconciliacionesbancariass;
		}
		
		
		((HistorialConciliacionesBancariasModel) this.jTableDatosHistorialConciliacionesBancarias.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialConciliacionesBancarias() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialconciliacionesbancariasAnterior(),this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialconciliacionesbancariasAnterior(),this.historialconciliacionesbancariass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialConciliacionesBancarias();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
										
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialconciliacionesbancarias,new Object(),generalEntityParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialConciliacionesBancariasConstantesFunciones.getClassesRelationshipsOfHistorialConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialConciliacionesBancariasConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialConciliacionesBancarias(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialConciliacionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialconciliacionesbancarias,new Object(),generalEntityParameterGeneral,this.historialconciliacionesbancariasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialConciliacionesBancarias(HistorialConciliacionesBancariasBean historialconciliacionesbancariasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialConciliacionesBancarias(ArrayList<Classe> classes,HistorialConciliacionesBancariasReturnGeneral historialconciliacionesbancariasReturnGeneral,HistorialConciliacionesBancariasBean historialconciliacionesbancariasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialconciliacionesbancarias)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias = new HistorialConciliacionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones(),this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setVisible(false);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.historialconciliacionesbancariasLogic=this.historialconciliacionesbancariasLogic;
		
		this.cargarCombosFrameForeignKeyHistorialConciliacionesBancarias("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialConciliacionesBancarias();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialConciliacionesBancarias();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialConciliacionesBancarias("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialConciliacionesBancarias();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialConciliacionesBancarias"));
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarHistorialConciliacionesBancarias"));

		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialConciliacionesBancarias"));
					
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemModificarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarHistorialConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialConciliacionesBancarias"));
						
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemActualizarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarHistorialConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialConciliacionesBancarias"));
								
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemEliminarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarHistorialConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialConciliacionesBancarias"));
					
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemCancelarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialConciliacionesBancarias"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemDetalleCerrarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialConciliacionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialConciliacionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialConciliacionesBancarias"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonidHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondebito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncodigoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondetalleHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_librosHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfechaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonanteriorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"anteriorHistorialConciliacionesBancariasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialConciliacionesBancarias"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialConciliacionesBancarias"));
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialConciliacionesBancarias"));
		}
		
		this.jTableDatosHistorialConciliacionesBancarias.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialConciliacionesBancarias"));
		
		this.jTableDatosHistorialConciliacionesBancarias.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialConciliacionesBancarias"));
		
		this.jButtonNuevoHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoHistorialConciliacionesBancarias"));
		
		this.jButtonDuplicarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarHistorialConciliacionesBancarias"));
		
		this.jButtonCopiarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"CopiarHistorialConciliacionesBancarias"));
		
		this.jButtonVerFormHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"VerFormHistorialConciliacionesBancarias"));
		
		
		this.jButtonNuevoToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialConciliacionesBancarias"));
			
		this.jButtonDuplicarToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemNuevoHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialConciliacionesBancarias"));
			
		this.jMenuItemDuplicarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialConciliacionesBancarias"));		
		
		
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialConciliacionesBancarias"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialConciliacionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarHistorialConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonModificarToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialConciliacionesBancarias"));
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemModificarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarHistorialConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonActualizarToolBarHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialConciliacionesBancarias"));
				
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemActualizarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarHistorialConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonEliminarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialConciliacionesBancarias"));
						
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemEliminarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarHistorialConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonCancelarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialConciliacionesBancarias"));
			
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemCancelarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialConciliacionesBancarias"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialConciliacionesBancarias"));		
		
		
		this.jButtonCerrarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarHistorialConciliacionesBancarias"));
		
		
		this.jButtonCerrarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemCerrarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialConciliacionesBancarias"));
			
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jMenuItemDetalleCerrarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialConciliacionesBancarias"));
		}
		
		this.jButtonCopiarToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialConciliacionesBancarias"));
			
		this.jButtonVerFormToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialConciliacionesBancarias"));
		
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialConciliacionesBancarias"));
			
		this.jMenuItemCopiarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialConciliacionesBancarias"));		
		
		this.jMenuItemVerFormHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialConciliacionesBancarias"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialConciliacionesBancarias"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialConciliacionesBancarias"));		
		
		
		
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialConciliacionesBancarias"));
					
		this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialConciliacionesBancarias"));
		
		this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialConciliacionesBancarias"));		
		
		
		
		this.jButtonAnterioresHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresHistorialConciliacionesBancarias"));
		
		
		this.jButtonAnterioresToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialConciliacionesBancarias"));
		
		this.jMenuItemAnterioresHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialConciliacionesBancarias"));		
		
		
		this.jButtonSiguientesHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesHistorialConciliacionesBancarias"));
		
		
		this.jButtonSiguientesToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemSiguientesHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialConciliacionesBancarias"));
			
		this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialConciliacionesBancarias"));
			
		this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialConciliacionesBancarias"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias"));
			
		this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialConciliacionesBancarias"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialConciliacionesBancarias"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialConciliacionesBancarias"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialConciliacionesBancarias"));

		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialConciliacionesBancarias"));
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialConciliacionesBancarias"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialConciliacionesBancarias"));
			
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialConciliacionesBancarias"));
					
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialConciliacionesBancarias"));
			
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialConciliacionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonidHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondebito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncodigoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondetalleHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_librosHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfechaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonanteriorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"anteriorHistorialConciliacionesBancariasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialConciliacionesBancarias"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialConciliacionesBancarias"));				
			//this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialConciliacionesBancarias"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialConciliacionesBancarias"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialConciliacionesBancarias"));
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialConciliacionesBancarias"));
				this.jInternalFrameImportacionHistorialConciliacionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialConciliacionesBancarias"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialConciliacionesBancarias"));
			
			this.jButtonAbrirOrderByToolBarHistorialConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialConciliacionesBancarias"));			
			
			if(this.jInternalFrameOrderByHistorialConciliacionesBancarias!=null) {
				this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialConciliacionesBancarias"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTabbedPaneRelacionesHistorialConciliacionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialConciliacionesBancarias"));
		
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
            		closingInternalFrameHistorialConciliacionesBancarias();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialConciliacionesBancarias = (JInternalFrameBase)event.getSource();
	            	
	            HistorialConciliacionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(HistorialConciliacionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialConciliacionesBancarias.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialConciliacionesBancariasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialConciliacionesBancarias.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialConciliacionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialConciliacionesBancarias.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialConciliacionesBancarias.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialConciliacionesBancariasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialConciliacionesBancarias";
		inputMap = this.jButtonModificarHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialConciliacionesBancarias";
		inputMap = this.jButtonActualizarHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialConciliacionesBancarias";
		inputMap = this.jButtonEliminarHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCancelarHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCerrarHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialConciliacionesBancarias";
		inputMap = this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonGuardarCambiosHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialConciliacionesBancariasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonidHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondebito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncodigoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtondetalleHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtoncuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_librosHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonfechaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jButtonanteriorHistorialConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"anteriorHistorialConciliacionesBancariasBusqueda"));
		
		
		this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialConciliacionesBancarias(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
					historialconciliacionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariass) {
					historialconciliacionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialConciliacionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
						historialconciliacionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariass) {
						historialconciliacionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialConciliacionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialConciliacionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialConciliacionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialConciliacionesBancarias.getSelectedRows();
			
			HistorialConciliacionesBancarias historialconciliacionesbancariasLocal=new HistorialConciliacionesBancarias();
			
			//this.seleccionarTodosHistorialConciliacionesBancarias(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialconciliacionesbancariasLocal =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialconciliacionesbancariasLocal =(HistorialConciliacionesBancarias) this.historialconciliacionesbancariass.toArray()[this.jTableDatosHistorialConciliacionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialconciliacionesbancariasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
						historialconciliacionesbancariasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariass) {
						historialconciliacionesbancariasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialConciliacionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialConciliacionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialConciliacionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialConciliacionesBancariasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialConciliacionesBancariasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
				
						if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							historialconciliacionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							historialconciliacionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							historialconciliacionesbancariasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							historialconciliacionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							historialconciliacionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
							existe=true;
							historialconciliacionesbancariasAux.settipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_finalizacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							historialconciliacionesbancariasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS)) {
							existe=true;
							historialconciliacionesbancariasAux.setsaldo_libros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							historialconciliacionesbancariasAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR)) {
							existe=true;
							historialconciliacionesbancariasAux.setanterior(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariass) {
					
						if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							historialconciliacionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							historialconciliacionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							historialconciliacionesbancariasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							historialconciliacionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							historialconciliacionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
							existe=true;
							historialconciliacionesbancariasAux.settipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha_finalizacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							historialconciliacionesbancariasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS)) {
							existe=true;
							historialconciliacionesbancariasAux.setsaldo_libros(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialconciliacionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							historialconciliacionesbancariasAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							historialconciliacionesbancariasAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR)) {
							existe=true;
							historialconciliacionesbancariasAux.setanterior(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialConciliacionesBancariasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialConciliacionesBancarias=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialConciliacionesBancarias) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialConciliacionesBancarias(conSplash);
				
					this.generarReporteHistorialConciliacionesBancariassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialConciliacionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialConciliacionesBancariassSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialConciliacionesBancariassSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialConciliacionesBancarias();
				
				this.exportarHistorialConciliacionesBancariassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialConciliacionesBancariass();
				//this.importarHistorialConciliacionesBancariass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialConciliacionesBancarias();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialConciliacionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialConciliacionesBancarias();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialConciliacionesBancarias)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialConciliacionesBancarias(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialConciliacionesBancariasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialConciliacionesBancarias) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialConciliacionesBancarias(conSplash);
					
						//this.actualizarParametrosGeneralHistorialConciliacionesBancarias();
						
						this.generarReporteProcesoAccionHistorialConciliacionesBancariassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Conciliaciones BancariasES SELECCIONADOS?", "MANTENIMIENTO DE Historial Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialConciliacionesBancarias();
				
						this.actualizarParametrosGeneralHistorialConciliacionesBancarias();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialconciliacionesbancariasReturnGeneral=historialconciliacionesbancariasLogic.procesarAccionHistorialConciliacionesBancariassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass(),this.historialconciliacionesbancariasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialConciliacionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialConciliacionesBancarias();
					
					HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialConciliacionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialConciliacionesBancarias(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialConciliacionesBancarias();
			
			if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
			HistorialConciliacionesBancarias historialconciliacionesbancarias=new HistorialConciliacionesBancarias();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.getSelectedItem();
			
			
			
			
			historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialconciliacionesbancariassSeleccionados.size()==1) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
					historialconciliacionesbancarias=historialconciliacionesbancariasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialConciliacionesBancarias();
			
      		//this.finishProcessHistorialConciliacionesBancarias(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialConciliacionesBancariasReturnGeneral() throws Exception {
		if(this.historialconciliacionesbancariasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialconciliacionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialconciliacionesbancariasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialconciliacionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialconciliacionesbancariasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialconciliacionesbancariasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
		}
		
		if(this.historialconciliacionesbancariasReturnGeneral.getConRetornoLista() || this.historialconciliacionesbancariasReturnGeneral.getConRetornoObjeto()) {
			if(this.historialconciliacionesbancariasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialconciliacionesbancariasLogic.setHistorialConciliacionesBancariass(this.historialconciliacionesbancariasReturnGeneral.getHistorialConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingHistorialConciliacionesBancarias(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialConciliacionesBancarias() throws Exception {
		
		
	}
	
	public ArrayList<HistorialConciliacionesBancarias> getHistorialConciliacionesBancariassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialConciliacionesBancarias) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass()) {
					if(historialconciliacionesbancariasAux.getIsSelected()) {
						historialconciliacionesbancariassSeleccionados.add(historialconciliacionesbancariasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:this.historialconciliacionesbancariass) {
					if(historialconciliacionesbancariasAux.getIsSelected()) {
						historialconciliacionesbancariassSeleccionados.add(historialconciliacionesbancariasAux);				
					}
				}
			}
			
			if(historialconciliacionesbancariassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialconciliacionesbancariassSeleccionados.addAll(this.historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialconciliacionesbancariassSeleccionados.addAll(this.historialconciliacionesbancariass);				
					}
				}
			}
		} else {
			historialconciliacionesbancariassSeleccionados.add(this.historialconciliacionesbancarias);
		}
		
		return historialconciliacionesbancariassSeleccionados;
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
	
	public void generarReporteHistorialConciliacionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialConciliacionesBancariassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialConciliacionesBancariassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Conciliaciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialConciliacionesBancariassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialConciliacionesBancarias();
		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialConciliacionesBancarias();
		
		
		//this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados ,historialconciliacionesbancariasImplementable,historialconciliacionesbancariasImplementableHome);
	}
	
	public void mostrarImportacionHistorialConciliacionesBancariass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialConciliacionesBancarias();
		
		this.abrirFrameImportacionHistorialConciliacionesBancarias();		
		
			
		//this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados ,historialconciliacionesbancariasImplementable,historialconciliacionesbancariasImplementableHome);
	}
	
	public void importarHistorialConciliacionesBancariass() throws Exception {		
	
	}
	
	public void exportarHistorialConciliacionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialConciliacionesBancariassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialConciliacionesBancariassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Conciliaciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialConciliacionesBancarias(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialConciliacionesBancarias(historialconciliacionesbancariasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialconciliacionesbancariasAux.setsDetalleGeneralEntityReporte(historialconciliacionesbancariasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialConciliacionesBancarias(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialconciliacionesbancarias.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getcuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.gettipo_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getfecha_finalizacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getsaldo_libros().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialconciliacionesbancarias.getanterior().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialConciliacionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialConciliacionesBancarias(row);				
				iRow++;
			}				
			
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialConciliacionesBancarias(historialconciliacionesbancariasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();		
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialconciliacionesbancarias.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialconciliacionesbancariass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialconciliacionesbancarias");
			//elementRoot.appendChild(element);
		
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
				element = document.createElement("historialconciliacionesbancarias");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialConciliacionesBancarias(historialconciliacionesbancariasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialConciliacionesBancarias(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getcuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.gettipo_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getfecha_finalizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getsaldo_libros());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(historialconciliacionesbancarias.getanterior());				
	}
	
	public void setFilaDatosExportarXmlHistorialConciliacionesBancarias(HistorialConciliacionesBancarias historialconciliacionesbancarias,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialconciliacionesbancarias.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialconciliacionesbancarias.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(historialconciliacionesbancarias.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(historialconciliacionesbancarias.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementfecha_desde = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(historialconciliacionesbancarias.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(historialconciliacionesbancarias.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementdebito_local = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(historialconciliacionesbancarias.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(historialconciliacionesbancarias.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementnumero_cheque = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(historialconciliacionesbancarias.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementcodigo = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(historialconciliacionesbancarias.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementbeneficiario = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(historialconciliacionesbancarias.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementdetalle = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(historialconciliacionesbancarias.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementcuenta = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.CUENTA);
		elementcuenta.appendChild(document.createTextNode(historialconciliacionesbancarias.getcuenta().trim()));
		element.appendChild(elementcuenta);

		Element elementtipo_documento = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.TIPODOCUMENTO);
		elementtipo_documento.appendChild(document.createTextNode(historialconciliacionesbancarias.gettipo_documento().trim()));
		element.appendChild(elementtipo_documento);

		Element elementnumero_mayor = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(historialconciliacionesbancarias.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementfecha_finalizacion = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.FECHAFINALIZACION);
		elementfecha_finalizacion.appendChild(document.createTextNode(historialconciliacionesbancarias.getfecha_finalizacion().toString().trim()));
		element.appendChild(elementfecha_finalizacion);

		Element elementtipo_movimiento = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(historialconciliacionesbancarias.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementsaldo_libros = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.SALDOLIBROS);
		elementsaldo_libros.appendChild(document.createTextNode(historialconciliacionesbancarias.getsaldo_libros().toString().trim()));
		element.appendChild(elementsaldo_libros);

		Element elementfecha = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(historialconciliacionesbancarias.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnumero_cuenta = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(historialconciliacionesbancarias.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementnombre_cuenta_contable = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(historialconciliacionesbancarias.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementanterior = document.createElement(HistorialConciliacionesBancariasConstantesFunciones.ANTERIOR);
		elementanterior.appendChild(document.createTextNode(historialconciliacionesbancarias.getanterior().toString().trim()));
		element.appendChild(elementanterior);
	}
	
	public void generarReporteGroupGenericoHistorialConciliacionesBancariassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados=new ArrayList<HistorialConciliacionesBancarias>();
		
		historialconciliacionesbancariassSeleccionados=this.getHistorialConciliacionesBancariassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialConciliacionesBancarias(historialconciliacionesbancariassSeleccionados);
		
		this.generarReporteHistorialConciliacionesBancariass("Todos",historialconciliacionesbancariassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialConciliacionesBancarias(ArrayList<HistorialConciliacionesBancarias> historialconciliacionesbancariassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialConciliacionesBancarias historialconciliacionesbancariasAux:historialconciliacionesbancariassSeleccionados) {
				historialconciliacionesbancariasAux.setsDetalleGeneralEntityReporte(historialconciliacionesbancariasAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialconciliacionesbancariasAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialconciliacionesbancariasAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getcuenta());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.gettipo_documento());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialconciliacionesbancariasAux.getfecha_finalizacion()));
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialconciliacionesbancariasAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					historialconciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(historialconciliacionesbancariasAux.getnombre_cuenta_contable());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialConciliacionesBancarias(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=true;
		} else {
			this.actualizarEstadoPanelsHistorialConciliacionesBancarias(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialConciliacionesBancarias=false;
			//this.isVisibilidadCeldaVerFormHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaDuplicarHistorialConciliacionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;												
			}
			
			this.jButtonCerrarHistorialConciliacionesBancarias.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
		}
		
		if(!this.permiteMantenimiento(this.historialconciliacionesbancarias)) {
			this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoHistorialConciliacionesBancarias=false;
		this.isVisibilidadCeldaNuevoRelacionesHistorialConciliacionesBancarias=false;
		this.isVisibilidadCeldaGuardarCambiosHistorialConciliacionesBancarias=false;
		//this.isVisibilidadCeldaModificarHistorialConciliacionesBancarias=true;
		this.isVisibilidadCeldaActualizarHistorialConciliacionesBancarias=false;
		this.isVisibilidadCeldaEliminarHistorialConciliacionesBancarias=false;
		//this.isVisibilidadCeldaCancelarHistorialConciliacionesBancarias=true;			
		this.isVisibilidadCeldaGuardarHistorialConciliacionesBancarias=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialConciliacionesBancarias() {
	}
	
	public void actualizarEstadoPanelsHistorialConciliacionesBancarias(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialConciliacionesBancarias!=null) {
				this.jScrollPanelDatosHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialConciliacionesBancarias!=null) {
				this.jPanelPaginacionHistorialConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
					this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaHistorialConciliacionesBancarias=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaHistorialConciliacionesBancarias) {this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.remove(jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaHistorialConciliacionesBancarias=isParaCuentaContable;
			if(!this.isVisibilidadBusquedaHistorialConciliacionesBancarias) {this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.remove(jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);}
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
			
			this.inicializarActualizarBindingTablaHistorialConciliacionesBancarias(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialConciliacionesBancarias() {
		this.updateBorderResaltarBusquedasFormularioHistorialConciliacionesBancarias();
		this.updateVisibilidadBusquedasFormularioHistorialConciliacionesBancarias();
		this.updateHabilitarBusquedasFormularioHistorialConciliacionesBancarias();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialConciliacionesBancarias() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponents().length>0) {
	

		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias!=null) {
			index= this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponent(index);
				jPanel.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialConciliacionesBancarias() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			if(!this.historialconciliacionesbancariasConstantesFunciones.mostrarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias && index>-1) {
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialConciliacionesBancarias() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
				this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setEnabledAt(index,this.historialconciliacionesbancariasConstantesFunciones.activarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialConciliacionesBancarias(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaHistorialConciliacionesBancarias")) {
			index= this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);

			this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.getComponent(index);

			this.historialconciliacionesbancariasConstantesFunciones.setResaltarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias(resaltar);

			jPanel.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialConciliacionesBancarias.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHistorialConciliacionesBancarias() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialConciliacionesBancarias();
		this.updateVisibilidadResaltarControlesFormularioHistorialConciliacionesBancarias();
		this.updateHabilitarResaltarControlesFormularioHistorialConciliacionesBancarias();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialConciliacionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltaridHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltaridHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarid_empresaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarid_empresaHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarid_cuenta_contableHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarid_cuenta_contableHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_desdeHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_desdeHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_desdeHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_hastaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_hastaHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_hastaHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltardebito_localHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltardebito_localHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarcredito_localHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarcredito_localHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_chequeHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_chequeHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarcodigoHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarcodigoHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarbeneficiarioHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarbeneficiarioHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltardetalleHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltardetalleHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarcuentaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarcuentaHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_documentoHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_documentoHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_mayorHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_mayorHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_finalizacionHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarfecha_finalizacionHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_movimientoHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltartipo_movimientoHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarsaldo_librosHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarsaldo_librosHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarfechaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarfechaHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_cuentaHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarnumero_cuentaHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltarnombre_cuenta_contableHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltarnombre_cuenta_contableHistorialConciliacionesBancarias);}
		if(this.historialconciliacionesbancariasConstantesFunciones.resaltaranteriorHistorialConciliacionesBancarias!=null && this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setBorder(this.historialconciliacionesbancariasConstantesFunciones.resaltaranteriorHistorialConciliacionesBancarias);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialConciliacionesBancarias() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
	
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostraridHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelidHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostraridHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarid_empresaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelid_empresaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarid_empresaHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarid_cuenta_contableHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelid_cuenta_contableHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarid_cuenta_contableHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_desdeHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_desdeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelfecha_desdeHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_desdeHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_hastaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_hastaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelfecha_hastaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_hastaHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrardebito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPaneldebito_localHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrardebito_localHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcredito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelcredito_localHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcredito_localHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_chequeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelnumero_chequeHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_chequeHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcodigoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelcodigoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcodigoHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarbeneficiarioHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelbeneficiarioHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarbeneficiarioHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrardetalleHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPaneldetalleHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrardetalleHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelcuentaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarcuentaHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_documentoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPaneltipo_documentoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_documentoHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_mayorHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelnumero_mayorHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_mayorHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_finalizacionHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelfecha_finalizacionHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfecha_finalizacionHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_movimientoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPaneltipo_movimientoHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrartipo_movimientoHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarsaldo_librosHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelsaldo_librosHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarsaldo_librosHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfechaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelfechaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarfechaHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_cuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelnumero_cuentaHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnumero_cuentaHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnombre_cuenta_contableHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostrarnombre_cuenta_contableHistorialConciliacionesBancarias);
		//this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostraranteriorHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jPanelanteriorHistorialConciliacionesBancarias.setVisible(this.historialconciliacionesbancariasConstantesFunciones.mostraranteriorHistorialConciliacionesBancarias);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialConciliacionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialConciliacionesBancarias!=null) {
	
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jLabelidHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activaridHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_empresaHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarid_empresaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarid_cuenta_contableHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_desdeHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarfecha_desdeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_hastaHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarfecha_hastaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFielddebito_localHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activardebito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcredito_localHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarcredito_localHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_chequeHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarnumero_chequeHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcodigoHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarcodigoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreabeneficiarioHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarbeneficiarioHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreadetalleHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activardetalleHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldcuentaHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarcuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_documentoHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activartipo_documentoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanumero_mayorHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarnumero_mayorHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarfecha_finalizacionHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreatipo_movimientoHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activartipo_movimientoHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldsaldo_librosHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarsaldo_librosHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jDateChooserfechaHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarfechaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarnumero_cuentaHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activarnombre_cuenta_contableHistorialConciliacionesBancarias);
		this.jInternalFrameDetalleFormHistorialConciliacionesBancarias.jTextFieldanteriorHistorialConciliacionesBancarias.setEnabled(this.historialconciliacionesbancariasConstantesFunciones.activaranteriorHistorialConciliacionesBancarias);
		}
	}
	
		
}