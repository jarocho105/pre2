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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ReporteTestConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ReporteTestParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ReporteTestParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ReporteTestBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
public class ReporteTestBeanSwingJInternalFrame extends ReporteTestJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReporteTestBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ReporteTest> reportetestValidator = new ClassValidator<ReporteTest>(ReporteTest.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ReporteTest reportetest;	
	public ReporteTest reportetestAux;
	public ReporteTest reportetestAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ReporteTest reportetestTotales;
	public Long idReporteTestActual;
	public Long iIdNuevoReporteTest=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
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
	
	public Boolean isPermisoTodoReporteTest;
	public Boolean isPermisoNuevoReporteTest;
	public Boolean isPermisoActualizarReporteTest;
	public Boolean isPermisoActualizarOriginalReporteTest;
	public Boolean isPermisoEliminarReporteTest;
	public Boolean isPermisoGuardarCambiosReporteTest;
	public Boolean isPermisoConsultaReporteTest;
	public Boolean isPermisoBusquedaReporteTest;
	public Boolean isPermisoReporteReporteTest;
	public Boolean isPermisoPaginacionMedioReporteTest;
	public Boolean isPermisoPaginacionAltoReporteTest;
	public Boolean isPermisoPaginacionTodoReporteTest;
	public Boolean isPermisoCopiarReporteTest;
	public Boolean isPermisoVerFormReporteTest;
	public Boolean isPermisoDuplicarReporteTest;
	public Boolean isPermisoOrdenReporteTest;
	
	
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
	
	public ReporteTestParameterReturnGeneral reportetestReturnGeneral;
	public ReporteTestParameterReturnGeneral reportetestParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReporteTest=false;
	public Boolean esParaAccionDesdeFormularioReporteTest=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReporteTestSessionBeanAdditional reportetestSessionBeanAdditional=null;
	
	public ReporteTestSessionBeanAdditional getReporteTestSessionBeanAdditional() {
		return this.reportetestSessionBeanAdditional;
	}
	
	public void setReporteTestSessionBeanAdditional(ReporteTestSessionBeanAdditional reportetestSessionBeanAdditional) {
		try {
			this.reportetestSessionBeanAdditional=reportetestSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReporteTestBeanSwingJInternalFrameAdditional reportetestBeanSwingJInternalFrameAdditional=null;
	//public class ReporteTestBeanSwingJInternalFrame
	
	public ReporteTestBeanSwingJInternalFrameAdditional getReporteTestBeanSwingJInternalFrameAdditional() {
		return this.reportetestBeanSwingJInternalFrameAdditional;
	}
	
	public void setReporteTestBeanSwingJInternalFrameAdditional(ReporteTestBeanSwingJInternalFrameAdditional reportetestBeanSwingJInternalFrameAdditional) {
		try {
			this.reportetestBeanSwingJInternalFrameAdditional=reportetestBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReporteTestLogic reportetestLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ReporteTest reportetestBean;
	public ReporteTestConstantesFunciones reportetestConstantesFunciones;
	//public ReporteTestParameterReturnGeneral reportetestReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<ReporteTest> reportetests;	
	//public List<ReporteTest> reportetestsEliminados;
	//public List<ReporteTest> reportetestsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReporteTest=false;
	public Boolean isVisibilidadCeldaDuplicarReporteTest=true;
	public Boolean isVisibilidadCeldaCopiarReporteTest=true;
	public Boolean isVisibilidadCeldaVerFormReporteTest=true;
	public Boolean isVisibilidadCeldaOrdenReporteTest=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReporteTest=false;
	public Boolean isVisibilidadCeldaModificarReporteTest=false;
	public Boolean isVisibilidadCeldaActualizarReporteTest=false;
	public Boolean isVisibilidadCeldaEliminarReporteTest=false;
	public Boolean isVisibilidadCeldaCancelarReporteTest=false;
	public Boolean isVisibilidadCeldaGuardarReporteTest=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReporteTest=false;	
	
	
	public Boolean isVisibilidadBusquedaReporteTest=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoReporteTest() {
		return this.iIdNuevoReporteTest;
	}

	public void setiIdNuevoReporteTest(Long iIdNuevoReporteTest) {
		this.iIdNuevoReporteTest = iIdNuevoReporteTest;
	}
	
	public Long getidReporteTestActual() {
		return this.idReporteTestActual;
	}

	public void setidReporteTestActual(Long idReporteTestActual) {
		this.idReporteTestActual = idReporteTestActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ReporteTest getreportetest() {
		return this.reportetest;
	}

	public void setreportetest(ReporteTest reportetest) {
		this.reportetest = reportetest;
	}
	
	public ReporteTest getreportetestAux() {
		return this.reportetestAux;
	}

	public void setreportetestAux(ReporteTest reportetestAux) {
		this.reportetestAux = reportetestAux;
	}				
	
	public ReporteTest getreportetestAnterior() {
		return this.reportetestAnterior;
	}

	public void setreportetestAnterior(ReporteTest reportetestAnterior) {
		this.reportetestAnterior = reportetestAnterior;
	}	
	
	public ReporteTest getreportetestTotales() {
		return this.reportetestTotales;
	}

	public void setreportetestTotales(ReporteTest reportetestTotales) {
		this.reportetestTotales = reportetestTotales;
	}	
	
	public ReporteTest getreportetestBean() {
		return this.reportetestBean;
	}

	public void setreportetestBean(ReporteTest reportetestBean) {
		this.reportetestBean = reportetestBean;
	}	
	
	public ReporteTestParameterReturnGeneral getreportetestReturnGeneral() {
		return this.reportetestReturnGeneral;
	}

	public void setreportetestReturnGeneral(ReporteTestParameterReturnGeneral reportetestReturnGeneral) {
		this.reportetestReturnGeneral = reportetestReturnGeneral;
	}	
	
	
	public Long id_empresaBusquedaReporteTest=-1L;

	public Long getid_empresaBusquedaReporteTest() {
		return this.id_empresaBusquedaReporteTest;
	}

	public void setid_empresaBusquedaReporteTest(Long id_empresaBusquedaReporteTest) {
		this.id_empresaBusquedaReporteTest = id_empresaBusquedaReporteTest;
	}

;
	public Long id_moduloBusquedaReporteTest=-1L;

	public Long getid_moduloBusquedaReporteTest() {
		return this.id_moduloBusquedaReporteTest;
	}

	public void setid_moduloBusquedaReporteTest(Long id_moduloBusquedaReporteTest) {
		this.id_moduloBusquedaReporteTest = id_moduloBusquedaReporteTest;
	}

;
	public String nombreBusquedaReporteTest="";

	public String getnombreBusquedaReporteTest() {
		return this.nombreBusquedaReporteTest;
	}

	public void setnombreBusquedaReporteTest(String nombreBusquedaReporteTest) {
		this.nombreBusquedaReporteTest = nombreBusquedaReporteTest;
	}

;
	public String ubicacionBusquedaReporteTest="";

	public String getubicacionBusquedaReporteTest() {
		return this.ubicacionBusquedaReporteTest;
	}

	public void setubicacionBusquedaReporteTest(String ubicacionBusquedaReporteTest) {
		this.ubicacionBusquedaReporteTest = ubicacionBusquedaReporteTest;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReporteTestLogic getReporteTestLogic()	{		
		return reportetestLogic;
	}

	public void setReporteTestLogic(ReporteTestLogic reportetestLogic) {
		this.reportetestLogic = reportetestLogic;
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
	
	public Boolean getIsEsNuevoReporteTest() {
		return isEsNuevoReporteTest;
	}

	public void setIsEsNuevoReporteTest(Boolean isEsNuevoReporteTest) {
		this.isEsNuevoReporteTest = isEsNuevoReporteTest;
	}

	public Boolean getEsParaAccionDesdeFormularioReporteTest() {
		return esParaAccionDesdeFormularioReporteTest;
	}
	
	public void setEsParaAccionDesdeFormularioReporteTest(Boolean esParaAccionDesdeFormularioReporteTest) {
		this.esParaAccionDesdeFormularioReporteTest = esParaAccionDesdeFormularioReporteTest;
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

			if(this.reportetestSessionBean==null) {
				this.reportetestSessionBean=new ReporteTestSessionBean();
			}

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(reportetestSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.reportetestSessionBean==null) {
				this.reportetestSessionBean=new ReporteTestSessionBean();
			}

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(reportetestSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.reportetestSessionBean==null) {
				this.reportetestSessionBean=new ReporteTestSessionBean();
			}

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(reportetestSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

					if(this.reportetest!=null) {
						this.reportetest.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaReporteTest.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.getItemCount()>0) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporteTest") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresaTemp!=null && jComboBoxid_empresaBusquedaReporteTestReporteTest!=null) {
						jComboBoxid_empresaBusquedaReporteTestReporteTest.setSelectedItem(empresaTemp);
					} else {
						if(jComboBoxid_empresaBusquedaReporteTestReporteTest!=null) {
							//jComboBoxid_empresaBusquedaReporteTestReporteTest.setSelectedItem(empresaTemp);
							if(jComboBoxid_empresaBusquedaReporteTestReporteTest.getItemCount()>0) {
								jComboBoxid_empresaBusquedaReporteTestReporteTest.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaReporteTestGenerico)throws Exception
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
				jComboBoxid_empresaReporteTestGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaReporteTestGenerico!=null && jComboBoxid_empresaReporteTestGenerico.getItemCount()>0) {
					jComboBoxid_empresaReporteTestGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.reportetest!=null) {
						this.reportetest.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloReporteTest.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.getItemCount()>0) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporteTest") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaReporteTestReporteTest!=null) {
						jComboBoxid_moduloBusquedaReporteTestReporteTest.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaReporteTestReporteTest!=null) {
							//jComboBoxid_moduloBusquedaReporteTestReporteTest.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaReporteTestReporteTest.getItemCount()>0) {
								jComboBoxid_moduloBusquedaReporteTestReporteTest.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloReporteTestGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloReporteTestGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloReporteTestGenerico!=null && jComboBoxid_moduloReporteTestGenerico.getItemCount()>0) {
					jComboBoxid_moduloReporteTestGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.reportetest!=null) {
						this.reportetest.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoReporteTest.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormReporteTest!=null) {
						if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.getItemCount()>0) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoReporteTestGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoReporteTestGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoReporteTestGenerico!=null && jComboBoxid_tipo_movimientoReporteTestGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoReporteTestGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ReporteTest reportetest,JComboBox jComboBoxid_empresaReporteTestGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaReporteTestGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaReporteTestGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				reportetest.setid_empresa(empresaAux.getId());
				reportetest.setempresa_descripcion(ReporteTestConstantesFunciones.getEmpresaDescripcion(empresaAux));
				reportetest.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(ReporteTest reportetest,JComboBox jComboBoxid_moduloReporteTestGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloReporteTestGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloReporteTestGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				reportetest.setid_modulo(moduloAux.getId());
				reportetest.setmodulo_descripcion(ReporteTestConstantesFunciones.getModuloDescripcion(moduloAux));
				reportetest.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(ReporteTest reportetest,JComboBox jComboBoxid_tipo_movimientoReporteTestGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoReporteTestGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoReporteTestGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				reportetest.setid_tipo_movimiento(tipomovimientoAux.getId());
				reportetest.settipomovimiento_descripcion(ReporteTestConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				reportetest.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) { 
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) { 
					}

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporteTest") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresaBusquedaReporteTestReporteTest.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jComboBoxid_empresaBusquedaReporteTestReporteTest.addItem(empresa);
							}
						}

						if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) { 
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) { 
					}

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporteTest") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaReporteTestReporteTest.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaReporteTestReporteTest.addItem(modulo);
							}
						}

						if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) { 
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReporteTest!=null) { 
					}

					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresaBusquedaReporteTestReporteTest.setSelectedItem(empresa);
						} else {
							this.jComboBoxid_empresaBusquedaReporteTestReporteTest.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaReporteTestReporteTest.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaReporteTestReporteTest.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormReporteTest!=null) {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesReporteTest() throws Exception {
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
		
	public ReporteTestParameterReturnGeneral getReporteTestParameterGeneral() {
		return this.reportetestParameterGeneral;
	}
	
	public void setReporteTestParameterGeneral(ReporteTestParameterReturnGeneral reportetestParameterGeneral) {
		this.reportetestParameterGeneral = reportetestParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReporteTest() {
		return isPermisoTodoReporteTest;
	}

	public void setIsPermisoTodoReporteTest(Boolean isPermisoTodoReporteTest) {
		this.isPermisoTodoReporteTest = isPermisoTodoReporteTest;
	}

	public Boolean getIsPermisoNuevoReporteTest() {
		return isPermisoNuevoReporteTest;
	}

	public void setIsPermisoNuevoReporteTest(Boolean isPermisoNuevoReporteTest) {
		this.isPermisoNuevoReporteTest = isPermisoNuevoReporteTest;
	}

	public Boolean getIsPermisoActualizarReporteTest() {
		return isPermisoActualizarReporteTest;
	}

	public void setIsPermisoActualizarReporteTest(Boolean isPermisoActualizarReporteTest) {
		this.isPermisoActualizarReporteTest = isPermisoActualizarReporteTest;
	}

	public Boolean getIsPermisoEliminarReporteTest() {
		return isPermisoEliminarReporteTest;
	}

	public void setIsPermisoEliminarReporteTest(Boolean isPermisoEliminarReporteTest) {
		this.isPermisoEliminarReporteTest = isPermisoEliminarReporteTest;
	}

	public Boolean getIsPermisoGuardarCambiosReporteTest() {
		return isPermisoGuardarCambiosReporteTest;
	}

	public void setIsPermisoGuardarCambiosReporteTest(Boolean isPermisoGuardarCambiosReporteTest) {
		this.isPermisoGuardarCambiosReporteTest = isPermisoGuardarCambiosReporteTest;
	}
	
	public Boolean getIsPermisoConsultaReporteTest() {
		return isPermisoConsultaReporteTest;
	}

	public void setIsPermisoConsultaReporteTest(Boolean isPermisoConsultaReporteTest) {
		this.isPermisoConsultaReporteTest = isPermisoConsultaReporteTest;
	}

	public Boolean getIsPermisoBusquedaReporteTest() {
		return isPermisoBusquedaReporteTest;
	}

	public void setIsPermisoBusquedaReporteTest(Boolean isPermisoBusquedaReporteTest) {
		this.isPermisoBusquedaReporteTest = isPermisoBusquedaReporteTest;
	}

	public Boolean getIsPermisoReporteReporteTest() {
		return isPermisoReporteReporteTest;
	}

	public void setIsPermisoReporteReporteTest(Boolean isPermisoReporteReporteTest) {
		this.isPermisoReporteReporteTest = isPermisoReporteReporteTest;
	}
	
	public Boolean getIsPermisoPaginacionMedioReporteTest() {
		return isPermisoPaginacionMedioReporteTest;
	}

	public void setIsPermisoPaginacionMedioReporteTest(Boolean isPermisoPaginacionMedioReporteTest) {
		this.isPermisoPaginacionMedioReporteTest = isPermisoPaginacionMedioReporteTest;
	}
	
	public Boolean getIsPermisoPaginacionTodoReporteTest() {
		return isPermisoPaginacionTodoReporteTest;
	}

	public void setIsPermisoPaginacionTodoReporteTest(Boolean isPermisoPaginacionTodoReporteTest) {
		this.isPermisoPaginacionTodoReporteTest = isPermisoPaginacionTodoReporteTest;
	}
	
	public Boolean getIsPermisoPaginacionAltoReporteTest() {
		return isPermisoPaginacionAltoReporteTest;
	}

	public void setIsPermisoPaginacionAltoReporteTest(Boolean isPermisoPaginacionAltoReporteTest) {
		this.isPermisoPaginacionAltoReporteTest = isPermisoPaginacionAltoReporteTest;
	}
	
	public Boolean getIsPermisoCopiarReporteTest() {
		return isPermisoCopiarReporteTest;
	}

	public void setIsPermisoCopiarReporteTest(Boolean isPermisoCopiarReporteTest) {
		this.isPermisoCopiarReporteTest = isPermisoCopiarReporteTest;
	}
	
	public Boolean getIsPermisoVerFormReporteTest() {
		return isPermisoVerFormReporteTest;
	}

	public void setIsPermisoVerFormReporteTest(Boolean isPermisoVerFormReporteTest) {
		this.isPermisoVerFormReporteTest = isPermisoVerFormReporteTest;
	}
	
	public Boolean getIsPermisoDuplicarReporteTest() {
		return isPermisoDuplicarReporteTest;
	}

	public void setIsPermisoDuplicarReporteTest(Boolean isPermisoDuplicarReporteTest) {
		this.isPermisoDuplicarReporteTest = isPermisoDuplicarReporteTest;
	}
	
	public Boolean getIsPermisoOrdenReporteTest() {
		return isPermisoOrdenReporteTest;
	}

	public void setIsPermisoOrdenReporteTest(Boolean isPermisoOrdenReporteTest) {
		this.isPermisoOrdenReporteTest = isPermisoOrdenReporteTest;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReporteTest() {
		return isVisibilidadCeldaNuevoReporteTest;
	}

	public void setIsVisibilidadCeldaNuevoReporteTest(Boolean isVisibilidadCeldaNuevoReporteTest) {
		this.isVisibilidadCeldaNuevoReporteTest = isVisibilidadCeldaNuevoReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReporteTest() {
		return isVisibilidadCeldaDuplicarReporteTest;
	}

	public void setIsVisibilidadCeldaDuplicarReporteTest(Boolean isVisibilidadCeldaDuplicarReporteTest) {
		this.isVisibilidadCeldaDuplicarReporteTest = isVisibilidadCeldaDuplicarReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReporteTest() {
		return isVisibilidadCeldaCopiarReporteTest;
	}

	public void setIsVisibilidadCeldaCopiarReporteTest(Boolean isVisibilidadCeldaCopiarReporteTest) {
		this.isVisibilidadCeldaCopiarReporteTest = isVisibilidadCeldaCopiarReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReporteTest() {
		return isVisibilidadCeldaVerFormReporteTest;
	}

	public void setIsVisibilidadCeldaVerFormReporteTest(Boolean isVisibilidadCeldaVerFormReporteTest) {
		this.isVisibilidadCeldaVerFormReporteTest = isVisibilidadCeldaVerFormReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReporteTest() {
		return isVisibilidadCeldaOrdenReporteTest;
	}

	public void setIsVisibilidadCeldaOrdenReporteTest(Boolean isVisibilidadCeldaOrdenReporteTest) {
		this.isVisibilidadCeldaOrdenReporteTest = isVisibilidadCeldaOrdenReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReporteTest() {
		return isVisibilidadCeldaNuevoRelacionesReporteTest;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReporteTest(Boolean isVisibilidadCeldaNuevoRelacionesReporteTest) {
		this.isVisibilidadCeldaNuevoRelacionesReporteTest = isVisibilidadCeldaNuevoRelacionesReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReporteTest() {
		return isVisibilidadCeldaModificarReporteTest;
	}

	public void setIsVisibilidadCeldaModificarReporteTest(Boolean isVisibilidadCeldaModificarReporteTest) {
		this.isVisibilidadCeldaModificarReporteTest = isVisibilidadCeldaModificarReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReporteTest() {
		return isVisibilidadCeldaActualizarReporteTest;
	}

	public void setIsVisibilidadCeldaActualizarReporteTest(Boolean isVisibilidadCeldaActualizarReporteTest) {
		this.isVisibilidadCeldaActualizarReporteTest = isVisibilidadCeldaActualizarReporteTest;
	}

	public Boolean getIsVisibilidadCeldaEliminarReporteTest() {
		return isVisibilidadCeldaEliminarReporteTest;
	}

	public void setIsVisibilidadCeldaEliminarReporteTest(Boolean isVisibilidadCeldaEliminarReporteTest) {
		this.isVisibilidadCeldaEliminarReporteTest = isVisibilidadCeldaEliminarReporteTest;
	}

	public Boolean getIsVisibilidadCeldaCancelarReporteTest() {
		return isVisibilidadCeldaCancelarReporteTest;
	}

	public void setIsVisibilidadCeldaCancelarReporteTest(Boolean isVisibilidadCeldaCancelarReporteTest) {
		this.isVisibilidadCeldaCancelarReporteTest = isVisibilidadCeldaCancelarReporteTest;
	}

	public Boolean getIsVisibilidadCeldaGuardarReporteTest() {
		return isVisibilidadCeldaGuardarReporteTest;
	}

	public void setIsVisibilidadCeldaGuardarReporteTest(Boolean isVisibilidadCeldaGuardarReporteTest) {
		this.isVisibilidadCeldaGuardarReporteTest = isVisibilidadCeldaGuardarReporteTest;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReporteTest() {
		return isVisibilidadCeldaGuardarCambiosReporteTest;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReporteTest(Boolean isVisibilidadCeldaGuardarCambiosReporteTest) {
		this.isVisibilidadCeldaGuardarCambiosReporteTest = isVisibilidadCeldaGuardarCambiosReporteTest;
	}
		
	public ReporteTestSessionBean getreportetestSessionBean() {
		return this.reportetestSessionBean;
	}
	
	public void setreportetestSessionBean(ReporteTestSessionBean reportetestSessionBean) {
		this.reportetestSessionBean=reportetestSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaReporteTest() {
		return this.isVisibilidadBusquedaReporteTest;
	}

	public void setisVisibilidadBusquedaReporteTest(Boolean isVisibilidadBusquedaReporteTest) {
		this.isVisibilidadBusquedaReporteTest=isVisibilidadBusquedaReporteTest;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReporteTest(ReporteTest reportetest)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(reportetest,null);
				this.setActualParaGuardarModuloForeignKey(reportetest,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(reportetest,null);
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
	
	public void bugActualizarReferenciaActual(ReporteTest reportetest,ReporteTest reportetestAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReporteTest(reportetest);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		reportetestAux.setId(reportetest.getId());
		reportetestAux.setVersionRow(reportetest.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ReporteTest reportetestLocal) throws Exception {
		
		if(this.reportetestSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ReporteTest reportetestLocal) throws Exception {	
		if(this.reportetestSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				reportetestLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				reportetestLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				reportetestLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReporteTestActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = reportetestValidator.getInvalidValues(this.reportetest);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ReporteTest reportetest,List<ReporteTest> reportetests) throws Exception {
	}		
	
	public void actualizarSelectedLista(ReporteTest reportetest,List<ReporteTest> reportetests) throws Exception {
		try	{			
			ReporteTestConstantesFunciones.actualizarSelectedLista(reportetest,reportetests);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ReporteTest> reportetestsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				reportetestsLocal=this.reportetestLogic.getReporteTests();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				reportetestsLocal=this.reportetests;
			}
			//ARCHITECTURE
		
			for(ReporteTest reportetestLocal:reportetestsLocal) {
				if(this.permiteMantenimiento(reportetestLocal) && reportetestLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReporteTestConstantesFunciones.getReporteTestLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReporteTestConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelid_tipo_movimientoReporteTest,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReporteTestConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelnombreReporteTest,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReporteTestConstantesFunciones.UBICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelubicacionReporteTest,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReporteTest.jLabelid_tipo_movimientoReporteTest,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReporteTest.jLabelnombreReporteTest,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReporteTest.jLabelubicacionReporteTest,"");
		
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
		this.iIdNuevoReporteTest--;	
		
		
		this.reportetestAux=new ReporteTest();
		
		this.reportetestAux.setId(this.iIdNuevoReporteTest);
		this.reportetestAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.reportetestLogic.getReporteTests().add(this.reportetestAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.reportetests.add(this.reportetestAux);
		}
		//ARCHITECTURE
		
		this.reportetest=this.reportetestAux;
		
		if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReporteTest(this.reportetest);
			this.setVariablesObjetoActualToFormularioForeignKeyReporteTest(this.reportetest);
		}
				
		//this.setDefaultControlesReporteTest();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReporteTest();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReporteTest();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReporteTest();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReporteTest(this.reportetestBean,this.reportetest,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReporteTest(this.reportetestReturnGeneral,this.reportetestBean,false);
		
		if(this.reportetestReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReporteTest(this.reportetestReturnGeneral.getReporteTest());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReporteTest(this.reportetestReturnGeneral.getReporteTest());
		}
		
		if(this.reportetestReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReporteTest(this.reportetestReturnGeneral.getReporteTest(),classes);//this.reportetestBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReporteTest();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReporteTest();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReporteTestBeanSwingJInternalFrameAdditional.RecargarFormReporteTest(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReporteTest(false);
						
			if(reportetestSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReporteTest();
			}
			
			this.actualizarVisualTableDatosReporteTest();
			
			this.jTableDatosReporteTest.setRowSelectionInterval(this.getIndiceNuevoReporteTest(), this.getIndiceNuevoReporteTest());
			
			this.seleccionarFilaTablaReporteTestActual();
						
			this.actualizarEstadoCeldasBotonesReporteTest("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReporteTest(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setEnabled(isHabilitar && this.reportetestConstantesFunciones.activarnombreReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setEnabled(isHabilitar && this.reportetestConstantesFunciones.activarubicacionReporteTest);	
		//
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setEnabled(isHabilitar && this.reportetestConstantesFunciones.activarid_empresaReporteTest);//
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setEnabled(isHabilitar && this.reportetestConstantesFunciones.activarid_moduloReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setEnabled(isHabilitar && this.reportetestConstantesFunciones.activarid_tipo_movimientoReporteTest);
	};
	
	public void setDefaultControlesReporteTest() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReporteTest(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.reportetestSessionBean.setConGuardarRelaciones(true);			
			this.reportetestSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.setVisible(true);
			
					
		} else {
			//this.reportetestSessionBean.setConGuardarRelaciones(false);			
			this.reportetestSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoReporteTest() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
				if(reportetestAux.getId().equals(this.iIdNuevoReporteTest)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReporteTest reportetestAux:this.reportetests) {
				if(reportetestAux.getId().equals(this.iIdNuevoReporteTest)) {
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
	
	public int getIndiceActualReporteTest(ReporteTest reportetest,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
				if(reportetestAux.getId().equals(reportetest.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReporteTest reportetestAux:this.reportetests) {
				if(reportetestAux.getId().equals(reportetest.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReporteTest(ReporteTest reportetestOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
				if(reportetestAux.getReporteTestOriginal().getId().equals(reportetestOriginal.getId())) {
					existe=true;
					reportetestOriginal.setId(reportetestAux.getId());
					reportetestOriginal.setVersionRow(reportetestAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReporteTest reportetestAux:this.reportetests) {
				if(reportetestAux.getReporteTestOriginal().getId().equals(reportetestOriginal.getId())) {
					existe=true;
					reportetestOriginal.setId(reportetestAux.getId());
					reportetestOriginal.setVersionRow(reportetestAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReporteTest(Boolean esParaCancelar) throws Exception {
		reportetestsAux=new ArrayList<ReporteTest>();
		reportetestAux=new ReporteTest();
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
					if(reportetestAux.getId()<0) {
						reportetestsAux.add(reportetestAux);
					}		
				}
				this.iIdNuevoReporteTest=0L;
				this.reportetestLogic.getReporteTests().removeAll(reportetestsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReporteTest reportetestAux:this.reportetests) {
					if(reportetestAux.getId()<0) {
						reportetestsAux.add(reportetestAux);
					}		
				}
				this.iIdNuevoReporteTest=0L;
				this.reportetests.removeAll(reportetestsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReporteTest 
					&& this.reportetestLogic.getReporteTests().size()>0
					) {
					reportetestAux=this.reportetestLogic.getReporteTests().get(this.reportetestLogic.getReporteTests().size() - 1);
				
					if(reportetestAux.getId()<0) {
						this.reportetestLogic.getReporteTests().remove(reportetestAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReporteTest && this.reportetests.size()>0) {
					reportetestAux=this.reportetests.get(this.reportetests.size() - 1);
				
					if(reportetestAux.getId()<0) {
						this.reportetests.remove(reportetestAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReporteTest(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(reportetest.getId()<0) {
				this.reportetestLogic.getReporteTests().remove(this.reportetest);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(reportetest.getId()<0) {
				this.reportetests.remove(this.reportetest);
			}
		}			
	}
	
	public void setEstadosInicialesReporteTest(List<ReporteTest> reportetestsAux) throws Exception {
		ReporteTestConstantesFunciones.setEstadosInicialesReporteTest(reportetestsAux);
	}
	
	public void setEstadosInicialesReporteTest(ReporteTest reportetestAux) throws Exception {
		ReporteTestConstantesFunciones.setEstadosInicialesReporteTest(reportetestAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReporteTestActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReporteTestActual()) {
				if(!this.isEsNuevoReporteTest) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReporteTest=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReporteTestActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Reporte Test ?", "MANTENIMIENTO DE Reporte Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ReporteTest reportetest) throws Exception {
		ReporteTestConstantesFunciones.seleccionarAsignar(this.reportetest,reportetest);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReporteTest=this.isPermisoActualizarOriginalReporteTest;
			
			
			this.seleccionarAsignar(reportetest);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesReporteTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.reportetestSessionBean.setsFuncionBusquedaRapida(this.reportetestSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoReporteTest) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReporteTest(esParaCancelar);				
				this.cancelarNuevoReporteTest(esParaCancelar);								
			}
			
			this.reportetest=new ReporteTest();
			
			this.inicializarReporteTest();
			
			this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReporteTest() throws Exception {
		try {
			ReporteTestConstantesFunciones.inicializarReporteTest(this.reportetest);
			
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
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.reportetestLogic.getReporteTests().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReporteTests(String sAccionBusqueda,List<ReporteTest> reportetestsParaReportes) throws Exception {
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
					sPathReporteFinal="ReporteTest"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReporteTestMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReporteTestMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ReporteTest"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Reporte Testes");		
		parameters.put("busquedapor", ReporteTestConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReporteTest=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReporteTestConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReporteTestConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReporteTest=new JRBeanArrayDataSource(ReporteTestJInternalFrame.TraerReporteTestBeans(reportetestsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReporteTest);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReporteTestConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReporteTestConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReporteTestBean.TraerReporteTestBeans(reportetestsParaReportes).toArray()));
							
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
				this.generarExcelReporteReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReporteTestActionPerformed(null);
					//this.generarExcelReporteReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReporteTests(sAccionBusqueda,sTipoArchivoReporte,reportetestsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReporteTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ReporteTest> reportetestsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReporteTests");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReporteTest("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ReporteTest reportetest : reportetestsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReporteTestConstantesFunciones.generarExcelReporteDataReporteTest("NORMAL",row,workbook,reportetest,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReporteTest(String sTipo,Row row,Workbook workbook) {
		
		ReporteTestConstantesFunciones.generarExcelReporteHeaderReporteTest(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReporteTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ReporteTest> reportetestsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReporteTests");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ReporteTest reportetest : reportetestsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReporteTestConstantesFunciones.getReporteTestDescripcion(reportetest));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReporteTestConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(reportetest.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReporteTestConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(reportetest.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(reportetest.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReporteTestConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReporteTestConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(reportetest.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReporteTestConstantesFunciones.LABEL_UBICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReporteTestConstantesFunciones.LABEL_UBICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(reportetest.getubicacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReporteTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ReporteTest> reportetestsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ReporteTest> reportetestsRespaldo=null;
		
		classes=ReporteTestConstantesFunciones.getClassesRelationshipsOfReporteTest(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.reportetestLogic.setDatosCliente(this.datosCliente);
		this.reportetestLogic.setDatosDeep(this.datosDeep);
		this.reportetestLogic.setIsConDeep(true);
		
		reportetestsRespaldo=this.reportetestLogic.getReporteTests();
		
		this.reportetestLogic.setReporteTests(reportetestsParaReportes);	
		this.reportetestLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		reportetestsParaReportes=this.reportetestLogic.getReporteTests();
		this.reportetestLogic.setReporteTests(reportetestsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReporteTests");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReporteTest("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ReporteTest reportetest : reportetestsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReporteTest("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReporteTestConstantesFunciones.generarExcelReporteDataReporteTest("NORMAL",row,workbook,reportetest,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ReporteTestConstantesFunciones.getReporteTestDescripcion(reportetest));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReporteTest.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReporteTest() throws Exception {		
		this.startProcessReporteTest(true);
	}
	
	public void startProcessReporteTest(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReporteTest ,this.jPanelParametrosReportesReporteTest, this.jScrollPanelDatosReporteTest,this.jPanelPaginacionReporteTest, this.jScrollPanelDatosEdicionReporteTest, this.jPanelAccionesReporteTest,this.jPanelAccionesFormularioReporteTest,this.jmenuBarReporteTest,this.jmenuBarDetalleReporteTest,this.jTtoolBarReporteTest,this.jTtoolBarDetalleReporteTest);		
		
		final JTabbedPane jTabbedPaneBusquedasReporteTest=this.jTabbedPaneBusquedasReporteTest; 
		
		final JPanel jPanelParametrosReportesReporteTest=this.jPanelParametrosReportesReporteTest;
		//final JScrollPane jScrollPanelDatosReporteTest=this.jScrollPanelDatosReporteTest;
		final JTable jTableDatosReporteTest=this.jTableDatosReporteTest;		
		final JPanel jPanelPaginacionReporteTest=this.jPanelPaginacionReporteTest;
		//final JScrollPane jScrollPanelDatosEdicionReporteTest=this.jScrollPanelDatosEdicionReporteTest;
		final JPanel jPanelAccionesReporteTest=this.jPanelAccionesReporteTest;
		
		JPanel jPanelCamposAuxiliarReporteTest=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReporteTest=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			jPanelCamposAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jPanelCamposReporteTest;
			jPanelAccionesFormularioAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jPanelAccionesFormularioReporteTest;
		}
		
		final JPanel jPanelCamposReporteTest=jPanelCamposAuxiliarReporteTest;
		final JPanel jPanelAccionesFormularioReporteTest=jPanelAccionesFormularioAuxiliarReporteTest;
		
		
		final JMenuBar jmenuBarReporteTest=this.jmenuBarReporteTest;
		final JToolBar jTtoolBarReporteTest=this.jTtoolBarReporteTest;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReporteTest=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReporteTest=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			jmenuBarDetalleAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jmenuBarDetalleReporteTest;
			jTtoolBarDetalleAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jTtoolBarDetalleReporteTest;
		}
		
		final JMenuBar jmenuBarDetalleReporteTest=jmenuBarDetalleAuxiliarReporteTest;
		final JToolBar jTtoolBarDetalleReporteTest=jTtoolBarDetalleAuxiliarReporteTest;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReporteTest;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReporteTest;
			processRunnable.jTableDatos=jTableDatosReporteTest;
			processRunnable.jPanelCampos=jPanelCamposReporteTest;
			processRunnable.jPanelPaginacion=jPanelPaginacionReporteTest;
			processRunnable.jPanelAcciones=jPanelAccionesReporteTest;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReporteTest;
			
			
			processRunnable.jmenuBar=jmenuBarReporteTest;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReporteTest;
			processRunnable.jTtoolBar=jTtoolBarReporteTest;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReporteTest;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReporteTest ,jPanelParametrosReportesReporteTest,jTableDatosReporteTest, /*jScrollPanelDatosReporteTest,*/jPanelCamposReporteTest,jPanelPaginacionReporteTest, /*jScrollPanelDatosEdicionReporteTest,*/ jPanelAccionesReporteTest,jPanelAccionesFormularioReporteTest,jmenuBarReporteTest,jmenuBarDetalleReporteTest,jTtoolBarReporteTest,jTtoolBarDetalleReporteTest);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReporteTest ,jPanelParametrosReportesReporteTest, jScrollPanelDatosReporteTest,jPanelPaginacionReporteTest, jScrollPanelDatosEdicionReporteTest, jPanelAccionesReporteTest,jPanelAccionesFormularioReporteTest,jmenuBarReporteTest,jmenuBarDetalleReporteTest,jTtoolBarReporteTest,jTtoolBarDetalleReporteTest);
						
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
	
	public void finishProcessReporteTest() {// throws Exception 
		this.finishProcessReporteTest(true);
	}
	
	public void finishProcessReporteTest(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReporteTest ,this.jPanelParametrosReportesReporteTest, this.jScrollPanelDatosReporteTest,this.jPanelPaginacionReporteTest, this.jScrollPanelDatosEdicionReporteTest, this.jPanelAccionesReporteTest,this.jPanelAccionesFormularioReporteTest,this.jmenuBarReporteTest,this.jmenuBarDetalleReporteTest,this.jTtoolBarReporteTest,this.jTtoolBarDetalleReporteTest);		
		
		final JTabbedPane jTabbedPaneBusquedasReporteTest=this.jTabbedPaneBusquedasReporteTest; 
		
		final JPanel jPanelParametrosReportesReporteTest=this.jPanelParametrosReportesReporteTest;
		//final JScrollPane jScrollPanelDatosReporteTest=this.jScrollPanelDatosReporteTest;
		final JTable jTableDatosReporteTest=this.jTableDatosReporteTest;		
		final JPanel jPanelPaginacionReporteTest=this.jPanelPaginacionReporteTest;
		//final JScrollPane jScrollPanelDatosEdicionReporteTest=this.jScrollPanelDatosEdicionReporteTest;
		final JPanel jPanelAccionesReporteTest=this.jPanelAccionesReporteTest;
		
		JPanel jPanelCamposAuxiliarReporteTest=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReporteTest=new JPanel();
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			jPanelCamposAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jPanelCamposReporteTest;
			jPanelAccionesFormularioAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jPanelAccionesFormularioReporteTest;
		}
		
		final JPanel jPanelCamposReporteTest=jPanelCamposAuxiliarReporteTest;
		final JPanel jPanelAccionesFormularioReporteTest=jPanelAccionesFormularioAuxiliarReporteTest;
		
		
		final JMenuBar jmenuBarReporteTest=this.jmenuBarReporteTest;		
		final JToolBar jTtoolBarReporteTest=this.jTtoolBarReporteTest;
				
		JMenuBar jmenuBarDetalleAuxiliarReporteTest=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReporteTest=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			jmenuBarDetalleAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jmenuBarDetalleReporteTest;
			jTtoolBarDetalleAuxiliarReporteTest=this.jInternalFrameDetalleFormReporteTest.jTtoolBarDetalleReporteTest;		
		}
		
		final JMenuBar jmenuBarDetalleReporteTest=jmenuBarDetalleAuxiliarReporteTest;
		final JToolBar jTtoolBarDetalleReporteTest=jTtoolBarDetalleAuxiliarReporteTest;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReporteTest;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReporteTest;
			processRunnable.jTableDatos=jTableDatosReporteTest;
			processRunnable.jPanelCampos=jPanelCamposReporteTest;
			processRunnable.jPanelPaginacion=jPanelPaginacionReporteTest;
			processRunnable.jPanelAcciones=jPanelAccionesReporteTest;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReporteTest;
			
			
			processRunnable.jmenuBar=jmenuBarReporteTest;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReporteTest;
			processRunnable.jTtoolBar=jTtoolBarReporteTest;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReporteTest;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReporteTest ,jPanelParametrosReportesReporteTest, jTableDatosReporteTest,/*jScrollPanelDatosReporteTest,*/jPanelCamposReporteTest,jPanelPaginacionReporteTest, /*jScrollPanelDatosEdicionReporteTest,*/ jPanelAccionesReporteTest,jPanelAccionesFormularioReporteTest,jmenuBarReporteTest,jmenuBarDetalleReporteTest,jTtoolBarReporteTest,jTtoolBarDetalleReporteTest));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReporteTest(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReporteTest(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReporteTest(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReporteTest(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReporteTest,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReporteTest,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReporteTest(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReporteTest,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReporteTest,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.reportetestConstantesFunciones.getsFinalQueryReporteTest();
		String  finalQueryPaginacionTodos=this.reportetestConstantesFunciones.getsFinalQueryReporteTest();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReporteTestConstantesFunciones.getArrayColumnasGlobalesNoReporteTest(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReporteTestConstantesFunciones.getArrayColumnasGlobalesReporteTest(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReporteTestConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.reportetestsEliminados= new ArrayList<ReporteTest>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReporteTest();
		
				///*ReporteTestSessionBean*/this.reportetestSessionBean=new ReporteTestSessionBean();
			
			if(this.reportetestSessionBean==null) {
				this.reportetestSessionBean=new ReporteTestSessionBean();
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
					this.iNumeroPaginacion=ReporteTestConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReporteTestConstantesFunciones.getClassesForeignKeysOfReporteTest(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/reportetest."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			reportetestsAux= new ArrayList<ReporteTest>();
			
				
			reportetestLogic.setDatosCliente(this.datosCliente);
			reportetestLogic.setDatosDeep(this.datosDeep);
			reportetestLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaReporteTest")) {
				this.sDetalleReporte=ReporteTestConstantesFunciones.getDetalleIndiceBusquedaReporteTest(id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					reportetestLogic.getReporteTestsBusquedaReporteTest(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReporteTestConstantesFunciones.getDetalleIndiceBusquedaReporteTest(id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReporteTestConstantesFunciones.getDetalleIndiceBusquedaReporteTest(id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=reportetestLogic.getReporteTests()==null||reportetestLogic.getReporteTests().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=reportetests==null|| reportetests.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						reportetestsAux=new ArrayList<ReporteTest>();
						reportetestsAux.addAll(reportetestLogic.getReporteTests());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							reportetestsAux=new ArrayList<ReporteTest>();
							reportetestsAux.addAll(reportetests);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							reportetestLogic.getReporteTestsBusquedaReporteTest(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReporteTestConstantesFunciones.getDetalleIndiceBusquedaReporteTest(id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReporteTestConstantesFunciones.getDetalleIndiceBusquedaReporteTest(id_empresaBusquedaReporteTest,id_moduloBusquedaReporteTest,nombreBusquedaReporteTest,ubicacionBusquedaReporteTest);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReporteTests("BusquedaReporteTest",reportetestLogic.getReporteTests());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReporteTests("BusquedaReporteTest",reportetests);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						reportetestLogic.setReporteTests(new ArrayList<ReporteTest>());
						reportetestLogic.getReporteTests().addAll(reportetestsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							reportetests=new ArrayList<ReporteTest>();
							reportetests.addAll(reportetestsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReporteTest();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReporteTest();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=reportetestLogic.getReporteTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=reportetests.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=reportetestLogic.getReporteTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=reportetests.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ReporteTest reportetest) {
		Boolean permite=true;
		
		if(this.reportetest.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReporteTestConstantesFunciones.getOrderByListaReporteTest();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReporteTestConstantesFunciones.getOrderByListaReporteTest();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReporteTest reportetest:reportetestLogic.getReporteTests()) {
				if(reportetest.getsType().equals(Constantes2.S_TOTALES)) {
					reportetestTotales=reportetest;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReporteTest reportetest:this.reportetests) {
				if(reportetest.getsType().equals(Constantes2.S_TOTALES)) {
					reportetestTotales=reportetest;
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
			this.reportetestAux=new ReporteTest();
			this.reportetestAux.setsType(Constantes2.S_TOTALES);
			this.reportetestAux.setIsNew(false);
			this.reportetestAux.setIsChanged(false);
			this.reportetestAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ReporteTestConstantesFunciones.TotalizarValoresFilaReporteTest(this.reportetestLogic.getReporteTests(),this.reportetestAux);
				
				//this.reportetestLogic.getReporteTests().add(this.reportetestAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReporteTestConstantesFunciones.TotalizarValoresFilaReporteTest(this.reportetests,this.reportetestAux);
				
				this.reportetests.add(this.reportetestAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		reportetestTotales=new ReporteTest();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.reportetestLogic.getReporteTests().remove(reportetestTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.reportetests.remove(reportetestTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		reportetestTotales=new ReporteTest();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReporteTest reportetest:reportetestLogic.getReporteTests()) {
				if(reportetest.getsType().equals(Constantes2.S_TOTALES)) {
					reportetestTotales=reportetest;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReporteTestConstantesFunciones.TotalizarValoresFilaReporteTest(this.reportetestLogic.getReporteTests(),reportetestTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReporteTest reportetest:this.reportetests) {
				if(reportetest.getsType().equals(Constantes2.S_TOTALES)) {
					reportetestTotales=reportetest;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReporteTestConstantesFunciones.TotalizarValoresFilaReporteTest(this.reportetests,reportetestTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReporteTestsBusquedaReporteTest()throws Exception {
		try {
			sAccionBusqueda="BusquedaReporteTest";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReporteTestsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReporteTestsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReporteTestsFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReporteTestsBusquedaReporteTest(String sFinalQuery,Long id_empresa,Long id_modulo,String nombre,String ubicacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//reportetestLogic.getReporteTestsBusquedaReporteTest(sFinalQuery,this.pagination,id_empresa,id_modulo,nombre,ubicacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReporteTestsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//reportetestLogic.getReporteTestsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReporteTestsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//reportetestLogic.getReporteTestsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReporteTestsFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//reportetestLogic.getReporteTestsFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosReporteTest() {
		this.isPermisoTodoReporteTest=false;
		this.isPermisoNuevoReporteTest=false;
		this.isPermisoActualizarReporteTest=false;
		this.isPermisoActualizarOriginalReporteTest=false;
		this.isPermisoEliminarReporteTest=false;
		this.isPermisoGuardarCambiosReporteTest=false;
		this.isPermisoConsultaReporteTest=true;
		this.isPermisoBusquedaReporteTest=true;
		this.isPermisoReporteReporteTest=true;
		this.isPermisoOrdenReporteTest=false;		
		this.isPermisoPaginacionMedioReporteTest=false;		
		this.isPermisoPaginacionAltoReporteTest=false;		
		this.isPermisoPaginacionTodoReporteTest=false;		
		this.isPermisoCopiarReporteTest=false;		
		this.isPermisoVerFormReporteTest=false;		
		this.isPermisoDuplicarReporteTest=false;
		this.isPermisoOrdenReporteTest=false;
	}
	
	public void setPermisosUsuarioReporteTest(Boolean isPermiso) {
		this.isPermisoTodoReporteTest=isPermiso;
		this.isPermisoNuevoReporteTest=isPermiso;
		this.isPermisoActualizarReporteTest=isPermiso;
		this.isPermisoActualizarOriginalReporteTest=isPermiso;
		this.isPermisoEliminarReporteTest=isPermiso;
		this.isPermisoGuardarCambiosReporteTest=isPermiso;
		this.isPermisoConsultaReporteTest=isPermiso;
		this.isPermisoBusquedaReporteTest=isPermiso;
		this.isPermisoReporteReporteTest=isPermiso;
		this.isPermisoOrdenReporteTest=isPermiso;		
		this.isPermisoPaginacionMedioReporteTest=isPermiso;		
		this.isPermisoPaginacionAltoReporteTest=isPermiso;		
		this.isPermisoPaginacionTodoReporteTest=isPermiso;		
		this.isPermisoCopiarReporteTest=isPermiso;		
		this.isPermisoVerFormReporteTest=isPermiso;		
		this.isPermisoDuplicarReporteTest=isPermiso;
		this.isPermisoOrdenReporteTest=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReporteTest(Boolean isPermiso) {
		//this.isPermisoTodoReporteTest=isPermiso;
		this.isPermisoNuevoReporteTest=isPermiso;
		this.isPermisoActualizarReporteTest=isPermiso;
		this.isPermisoActualizarOriginalReporteTest=isPermiso;
		this.isPermisoEliminarReporteTest=isPermiso;
		this.isPermisoGuardarCambiosReporteTest=isPermiso;
		//this.isPermisoConsultaReporteTest=isPermiso;
		//this.isPermisoBusquedaReporteTest=isPermiso;
		//this.isPermisoReporteReporteTest=isPermiso;
		//this.isPermisoOrdenReporteTest=isPermiso;		
		//this.isPermisoPaginacionMedioReporteTest=isPermiso;		
		//this.isPermisoPaginacionAltoReporteTest=isPermiso;		
		//this.isPermisoPaginacionTodoReporteTest=isPermiso;		
		//this.isPermisoCopiarReporteTest=isPermiso;		
		//this.isPermisoDuplicarReporteTest=isPermiso;
		//this.isPermisoOrdenReporteTest=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReporteTestClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ReporteTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebReporteTest(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReporteTestClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioReporteTestClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReporteTestClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReporteTestClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioReporteTest() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReporteTestJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.reportetestSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReporteTestConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReporteTest=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReporteTest=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReporteTest=this.isPermisoActualizarReporteTest;
			this.isPermisoEliminarReporteTest=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReporteTest=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReporteTest=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReporteTest=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReporteTest=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReporteTest=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReporteTest=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReporteTest=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReporteTest=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReporteTest=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReporteTest=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReporteTest=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReporteTest=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReporteTest=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.reportetestSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReporteTest.setToolTipText(this.jTableDatosReporteTest.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReporteTest(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReporteTest(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReporteTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReporteTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReporteTest() throws Exception {
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
	public void inicializarCombosForeignKeyReporteTestListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReporteTestListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReporteTestJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyReporteTest()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.reportetestSessionBean==null) {
				this.reportetestSessionBean=new ReporteTestSessionBean();
			}

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.reportetestSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyReporteTest()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReporteTest(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyReporteTest()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReporteTest();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReporteTest(ReporteTest reportetest)throws Exception {	
		try {
			
			this.setActualTipoMovimientoForeignKey(reportetest.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReporteTest(ReporteTest reportetest,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReporteTest()throws Exception {	
		try {
			
			this.setActualTipoMovimientoForeignKey(this.reportetestConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReporteTest()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReporteTest()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReporteTest()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReporteTest()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReporteTest()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReporteTest(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReporteTest()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest!=null && this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.getItemCount()>0) {
				this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest!=null && this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.getItemCount()>0) {
				this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest!=null && this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.getItemCount()>0) {
				this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ReporteTestBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReporteTestBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReporteTestBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.reportetestSessionBean=new ReporteTestSessionBean(); 
		this.reportetestConstantesFunciones=new ReporteTestConstantesFunciones(); 
		this.reportetestBean=new ReporteTest();//(this.reportetestConstantesFunciones); 		
		this.reportetestReturnGeneral=new ReporteTestParameterReturnGeneral(); 
		
		this.reportetestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.reportetestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReporteTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReporteTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReporteTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReporteTest(true);
			
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
			
			this.reportetestConstantesFunciones=new ReporteTestConstantesFunciones(); 
			this.reportetestBean=new ReporteTest();//this.reportetestConstantesFunciones); 			
			this.reportetestReturnGeneral=new ReporteTestParameterReturnGeneral(); 
		
			ReporteTestBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reporte Test Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.reportetest=new ReporteTest();
			this.reportetests = new ArrayList<ReporteTest>();
			this.reportetestsAux = new ArrayList<ReporteTest>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic=new ReporteTestLogic();
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			//this.reportetestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.reportetestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReporteTest);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReporteTest);	
					}
					
					if(this.jInternalFrameImportacionReporteTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReporteTest);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReporteTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReporteTest);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReporteTest!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReporteTest);
				this.jInternalFrameDetalleFormReporteTest.setVisible(false);
				this.jInternalFrameDetalleFormReporteTest.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReporteTest);
					this.jInternalFrameReporteDinamicoReporteTest.setVisible(false);
					this.jInternalFrameReporteDinamicoReporteTest.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReporteTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReporteTest);
					this.jInternalFrameImportacionReporteTest.setVisible(false);
					this.jInternalFrameImportacionReporteTest.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReporteTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReporteTest);
					this.jInternalFrameOrderByReporteTest.setVisible(false);
					this.jInternalFrameOrderByReporteTest.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReporteTestActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReporteTestConstantesFunciones.INUMEROPAGINACION;
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
			
			this.reportetestReturnGeneral=new ReporteTestParameterReturnGeneral();
			
			this.reportetestParameterGeneral=new ReporteTestParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.reportetestLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReporteTestJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.reportetestSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReporteTestConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.reportetestSessionBean.getEsGuardarRelacionado(),this.reportetestSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReporteTestConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.reportetestSessionBean.getEsGuardarRelacionado(),this.reportetestSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaDuplicarReporteTest=true;
			this.isVisibilidadCeldaCopiarReporteTest=true;
			this.isVisibilidadCeldaVerFormReporteTest=true;
			this.isVisibilidadCeldaOrdenReporteTest=true;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=false;
			this.isVisibilidadCeldaGuardarReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			
			
			this.isVisibilidadBusquedaReporteTest=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReporteTest();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReporteTest(false);
			
			this.setPermisosUsuarioReporteTest();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.reportetestSessionBean.getEsGuardarRelacionado() 
				|| (this.reportetestSessionBean.getEsGuardarRelacionado() && this.reportetestSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReporteTestClasesRelacionadas();
			}
			
			if(this.reportetestSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReporteTestClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReporteTest();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReporteTest();
			}
			
			if(!this.isPermisoBusquedaReporteTest) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReporteTest.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReporteTestConstantesFunciones.getTiposSeleccionarReporteTest());
				
				this.tiposColumnasSelect=ReporteTestConstantesFunciones.getTiposSeleccionarReporteTest(true);
				
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
			//if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReporteTest();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioReporteTest(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioReporteTest(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReporteTest() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				reportetestImplementable= (ReporteTestImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReporteTestConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				reportetestImplementableHome= (ReporteTestImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReporteTestConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.reportetests= new ArrayList<ReporteTest>();
			this.reportetestsEliminados= new ArrayList<ReporteTest>();
						
			this.isEsNuevoReporteTest=false;
			this.esParaAccionDesdeFormularioReporteTest=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReporteTest(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReporteTest();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReporteTestBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReporteTestConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReporteTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReporteTest(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReporteTest!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReporteTest();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReporteTest();
			}
			
			ReporteTestBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReporteTest.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReporteTest.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReporteTest.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReporteTest(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ReporteTest: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReporteTest() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReporteTest")) {
				iIndex=this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReporteTest();	
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
	
	public void cargarCombosForeignKeyReporteTest(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReporteTest(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReporteTest(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReporteTestListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReporteTest();
		
		this.cargarCombosFrameForeignKeyReporteTest();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReporteTest();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReporteTest();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoReporteTestActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.reportetestSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			
			if(jTableDatosReporteTest.getRowCount()>=1) {
				jTableDatosReporteTest.removeRowSelectionInterval(0, jTableDatosReporteTest.getRowCount()-1);						
			}
			
			this.isEsNuevoReporteTest=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReporteTest(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReporteTest(true);			
			//this.reportetest=new ReporteTest();
			//this.reportetest.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReporteTest(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReporteTest() ;
			
			if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReporteTest(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.reportetest);	
			this.actualizarInformacion("INFO_PADRE",false,this.reportetest);				
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			if(this.reportetestSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ReporteTest: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReporteTestActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReporteTest.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReporteTest.getSelectedRows().length;			
			}
			
			reportetestsSeleccionados=this.getReporteTestsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReporteTest--;			
				//ReporteTest reportetestAux= new ReporteTest();			
				//reportetestAux.setId(this.iIdNuevoReporteTest);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ReporteTest reportetestOrigen=new ReporteTest();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ReporteTest reportetestOrigen : reportetestsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							reportetestOrigen =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							reportetestOrigen =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReporteTest();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.reportetest.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReporteTest(reportetestOrigen,this.reportetest,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.reportetestLogic.getReporteTests().add(this.reportetestAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.reportetests.add(this.reportetestAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReporteTest(false);
				
				this.jTableDatosReporteTest.setRowSelectionInterval(this.getIndiceNuevoReporteTest(), this.getIndiceNuevoReporteTest());
				
				int iLastRow =  this.jTableDatosReporteTest.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReporteTest.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReporteTest.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReporteTest(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();									
		
			ReporteTest reportetestOrigen=new ReporteTest();
			ReporteTest reportetestDestino=new ReporteTest();
				
			reportetestsSeleccionados=this.getReporteTestsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReporteTest.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || reportetestsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReporteTest.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						reportetestOrigen =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						reportetestOrigen =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						reportetestDestino =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						reportetestDestino =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				reportetestOrigen =reportetestsSeleccionados.get(0);
				reportetestDestino =reportetestsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReporteTest(reportetestOrigen,reportetestDestino,true,false);
				
				reportetestDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(reportetestDestino,reportetestLogic.getReporteTests());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(reportetestDestino,reportetests);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReporteTest(false);
				
				//this.jTableDatosReporteTest.setRowSelectionInterval(this.getIndiceNuevoReporteTest(), this.getIndiceNuevoReporteTest());
				
				int iLastRow =  this.jTableDatosReporteTest.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReporteTest.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReporteTest.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReporteTest(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReporteTest.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReporteTest.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReporteTest.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReporteTest.setVisible(!isVisible);
			this.jPanelPaginacionReporteTest.setVisible(!isVisible);
			this.jPanelAccionesReporteTest.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReporteTest();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReporteTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReporteTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReporteTest();
			
			this.abrirFrameOrderByReporteTest();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReporteTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReporteTest(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReporteTest);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReporteTest.isMaximum()) {
					this.jInternalFrameDetalleFormReporteTest.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReporteTest.setSize(this.jInternalFrameDetalleFormReporteTest.iWidthFormulario,this.jInternalFrameDetalleFormReporteTest.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReporteTest.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReporteTest.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReporteTest.isMaximum()) {
						this.jInternalFrameDetalleFormReporteTest.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReporteTest.jContentPaneDetalleReporteTest.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReporteTest.jContentPaneDetalleReporteTest.getWidth(),ReporteTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReporteTest.jContentPaneDetalleReporteTest.getWidth(),ReporteTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReporteTest.jContentPaneDetalleReporteTest.getWidth(),ReporteTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReporteTest.setVisible(true);
	        this.jInternalFrameDetalleFormReporteTest.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReporteTest() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReporteTest==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReporteTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReporteTest,false,this);
				} else {
					this.jInternalFrameOrderByReporteTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReporteTest,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReporteTest);
				this.jInternalFrameOrderByReporteTest.setVisible(false);
				this.jInternalFrameOrderByReporteTest.setSelected(false);
				
				this.jInternalFrameOrderByReporteTest.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReporteTest"));
				
				this.inicializarActualizarBindingTablaOrderByReporteTest();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReporteTest() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReporteTest==null) {
				
				this.jInternalFrameImportacionReporteTest=new ImportacionJInternalFrame(ReporteTestConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReporteTest);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReporteTest);
				this.jInternalFrameImportacionReporteTest.setVisible(false);
				this.jInternalFrameImportacionReporteTest.setSelected(false);


				this.jInternalFrameImportacionReporteTest.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReporteTest"));
				this.jInternalFrameImportacionReporteTest.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReporteTest"));
				this.jInternalFrameImportacionReporteTest.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReporteTest"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReporteTest() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReporteTest==null) {
				this.jInternalFrameReporteDinamicoReporteTest=new ReporteDinamicoJInternalFrame(ReporteTestConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReporteTest);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReporteTest);
				this.jInternalFrameReporteDinamicoReporteTest.setVisible(false);
				this.jInternalFrameReporteDinamicoReporteTest.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReporteTest"));
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReporteTest"));
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReporteTest"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReporteTest();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleReporteTest() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReporteTest);
			
	       	this.jInternalFrameDetalleFormReporteTest.setVisible(false);
	        this.jInternalFrameDetalleFormReporteTest.setSelected(false);
			
			//this.jInternalFrameDetalleFormReporteTest.dispose();
			//this.jInternalFrameDetalleFormReporteTest=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReporteTest() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReporteTest.setVisible(true);
	        this.jInternalFrameReporteDinamicoReporteTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReporteTest() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReporteTest.setVisible(true);
	        this.jInternalFrameImportacionReporteTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReporteTest() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReporteTest.setVisible(true);
	        this.jInternalFrameOrderByReporteTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReporteTest() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReporteTest.setVisible(false);
	        this.jInternalFrameOrderByReporteTest.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReporteTest() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReporteTest.setVisible(false);
	        this.jInternalFrameReporteDinamicoReporteTest.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReporteTest() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReporteTest.setVisible(false);
	        this.jInternalFrameImportacionReporteTest.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReporteTest(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReporteTest(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReporteTest(true);
			//this.isEsNuevoReporteTest=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReporteTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReporteTest(false) ;
			
			if(reportetestSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReporteTest(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReporteTest(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReporteTestActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReporteTest(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReporteTest(true);
			//this.isEsNuevoReporteTest=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.reportetest.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReporteTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReporteTest(false) ;
			
			if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReporteTest(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReporteTest(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReporteTest.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReporteTest(false);
			
			//if(!this.isEsNuevoReporteTest) {								
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				
			}
			
			if(this.permiteMantenimiento(this.reportetest)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.reportetestSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReporteTest=true;
					this.inicializarActualizarBindingTablaReporteTest(false);
					this.isEsNuevoReporteTest=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReporteTest=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReporteTest=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReporteTest(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReporteTest(false);
				
				this.habilitarDeshabilitarControlesReporteTest(false);
			
												
				
				if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReporteTest();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReporteTestActionPerformed(evt,reportetestSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReporteTest(this.reportetest,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReporteTest.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,reportetestSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.reportetest.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReporteTestActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				this.reportetest.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				this.reportetest.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.reportetest)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.reportetestSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReporteTestModel) this.jTableDatosReporteTest.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReporteTest=true;
				this.inicializarActualizarBindingTablaReporteTest(false);
				this.isEsNuevoReporteTest=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReporteTest(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReporteTest(false);
				
				this.habilitarDeshabilitarControlesReporteTest(false);
				
				
				
				if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReporteTest();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReporteTestActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReporteTest.getRowCount()>=1) {
				jTableDatosReporteTest.removeRowSelectionInterval(0, jTableDatosReporteTest.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReporteTest(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReporteTest(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReporteTest(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReporteTest(false) ;
			
			this.isEsNuevoReporteTest=false;
			
			if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReporteTest();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReporteTest(false);
				
				//SI ES MANUAL
				if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReporteTest();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReporteTest--;			
			//ReporteTest reportetestAux= new ReporteTest();			
			//reportetestAux.setId(this.iIdNuevoReporteTest);
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReporteTest();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
			
			this.reportetest.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.reportetestLogic.getReporteTests().add(this.reportetestAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.reportetests.add(this.reportetestAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReporteTest(false);
			
			this.jTableDatosReporteTest.setRowSelectionInterval(this.getIndiceNuevoReporteTest(), this.getIndiceNuevoReporteTest());
			
			int iLastRow =  this.jTableDatosReporteTest.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReporteTest.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReporteTest.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReporteTest(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReporteTest(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReporteTest(false);
			
			//SI ES MANUAL
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReporteTest();
			}
			
			//this.abrirFrameTreeReporteTest();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReporteTestActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReporteTestActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReporteTest.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReporteTest.setFileImportacion(this.jInternalFrameImportacionReporteTest.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReporteTest.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReporteTest.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReporteTest.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReporteTest.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		

		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReporteTestBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReporteTestBaseDesign.jrxml";
			
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
			
			this.generarReporteReporteTests("Todos",reportetestsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReporteTestConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReporteTestConstantesFunciones.LABEL_UBICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_icacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_icacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_icacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_icacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoReporteTest.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case ReporteTestConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ReporteTestConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoria="ubicacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case ReporteTestConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ReporteTestConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoriaValor="ubicacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case ReporteTestConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ReporteTestConstantesFunciones.LABEL_UBICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ubicacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoReporteTestActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ReporteTests");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReporteTestConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ReporteTest reportetest:reportetestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(reportetest.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReporteTestConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(ReporteTest reportetest:reportetestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(reportetest.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(ReporteTest reportetest:reportetestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(reportetest.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReporteTestConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReporteTestConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ReporteTest reportetest:reportetestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(reportetest.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReporteTestConstantesFunciones.LABEL_UBICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReporteTestConstantesFunciones.LABEL_UBICACION);
					iRow++;

					for(ReporteTest reportetest:reportetestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(reportetest.getubicacion());
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
			//	this.getFilaCabeceraExportarExcelReporteTest(row);				
			//	iRow++;
			//}				
			
			//for(ReporteTest reportetestAux:reportetestsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReporteTest(reportetestAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
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
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReporteTest(false);
			
			//SI ES MANUAL
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReporteTest();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReporteTest(false);
			
			//SI ES MANUAL
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReporteTest();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReporteTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReporteTest(false);
			
			//SI ES MANUAL
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReporteTest();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReporteTest() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReporteTest.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReporteTest.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReporteTest.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReporteTest.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReporteTest.setMinimumSize(dimensionMinimum);
		this.jTableDatosReporteTest.setMaximumSize(dimensionMaximum);
		this.jTableDatosReporteTest.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReporteTest(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReporteTest(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReporteTest(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReporteTest(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReporteTest(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReporteTest(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReporteTest(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReporteTest(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReporteTestJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReporteTest() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReporteTest();
		
		this.inicializarActualizarBindingBotonesManualReporteTest(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReporteTest();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReporteTest() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReporteTest(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReporteTest(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReporteTest.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReporteTest.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReporteTest.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReporteTest!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionNuevoReporteTest.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionSinCerrarReporteTest.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionSinMensajeReporteTest.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReporteTest.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReporteTest.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReporteTest.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReporteTest!=null) {
				this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionNuevoReporteTest.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionSinCerrarReporteTest.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReporteTest.jCheckBoxPostAccionSinMensajeReporteTest.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReporteTest.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReporteTest.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReporteTest.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReporteTest.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReporteTest.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReporteTest.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReporteTest.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReporteTest.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReporteTest.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReporteTest(Boolean esInicializar) throws Exception {
		try	{	
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReporteTest(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReporteTest() throws Exception {
		try	{
			if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReporteTest();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReporteTest() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReporteTest() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReporteTest.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReporteTest.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReporteTest.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReporteTest.addItem(reporte);
			}
			
			
			if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReporteTest.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReporteTest.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReporteTest.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReporteTest.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReporteTest.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReporteTest.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReporteTest.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReporteTest();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReporteTest() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
				this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
				this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReporteTest.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
				
				if(this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReporteTest.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReporteTest.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReporteTest.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReporteTest.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReporteTest()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empresaBusquedaReporteTestReporteTest.getSelectedItem()!=null){this.id_empresaBusquedaReporteTest=((Empresa)this.jComboBoxid_empresaBusquedaReporteTestReporteTest.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaReporteTestReporteTest.getSelectedItem()!=null){this.id_moduloBusquedaReporteTest=((Modulo)this.jComboBoxid_moduloBusquedaReporteTestReporteTest.getSelectedItem()).getId();}
		this.nombreBusquedaReporteTest=this.jTextFieldnombreBusquedaReporteTestReporteTest.getText();
		this.ubicacionBusquedaReporteTest=this.jTextAreaubicacionBusquedaReporteTestReporteTest.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReporteTest(Boolean esInicializar) throws Exception {				
		if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReporteTest();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReporteTest() throws Exception {
		this.inicializarActualizarBindingTablaReporteTest(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReporteTest() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReporteTestOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTestOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReporteTest(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=reportetestLogic.getReporteTests().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=reportetests.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReporteTest.setModel(new ReporteTestModel(this.reportetestLogic.getReporteTests(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReporteTest.setModel(new ReporteTestModel(this.reportetests,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReporteTest!=null && this.jInternalFrameOrderByReporteTest.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReporteTest();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReporteTestConstantesFunciones.SCLASSWEBTITULO,reportetestConstantesFunciones.resaltarSeleccionarReporteTest,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReporteTestConstantesFunciones.SCLASSWEBTITULO,reportetestConstantesFunciones.resaltarSeleccionarReporteTest,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,ReporteTestConstantesFunciones.LABEL_ID));

		if(this.reportetestConstantesFunciones.mostraridReporteTest && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReporteTestConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.reportetestConstantesFunciones.resaltaridReporteTest,this.reportetestConstantesFunciones.activaridReporteTest,this,true,"idReporteTest","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.reportetestConstantesFunciones.resaltaridReporteTest,this.reportetestConstantesFunciones.activaridReporteTest,this,true,"idReporteTest","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.reportetestConstantesFunciones.mostrarid_tipo_movimientoReporteTest && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.reportetestConstantesFunciones.resaltarid_tipo_movimientoReporteTest,this,this.reportetestConstantesFunciones.activarid_tipo_movimientoReporteTest));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.reportetestConstantesFunciones.resaltarid_tipo_movimientoReporteTest,this,this.reportetestConstantesFunciones.activarid_tipo_movimientoReporteTest,true,"id_tipo_movimientoReporteTest","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,ReporteTestConstantesFunciones.LABEL_NOMBRE));

		if(this.reportetestConstantesFunciones.mostrarnombreReporteTest && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReporteTestConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.reportetestConstantesFunciones.resaltarnombreReporteTest,this.reportetestConstantesFunciones.activarnombreReporteTest,this,true,"nombreReporteTest","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.reportetestConstantesFunciones.resaltarnombreReporteTest,this.reportetestConstantesFunciones.activarnombreReporteTest,this,true,"nombreReporteTest","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,ReporteTestConstantesFunciones.LABEL_UBICACION));

		if(this.reportetestConstantesFunciones.mostrarubicacionReporteTest && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReporteTestConstantesFunciones.LABEL_UBICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.reportetestConstantesFunciones.resaltarubicacionReporteTest,this.reportetestConstantesFunciones.activarubicacionReporteTest,this,true,"ubicacionReporteTest","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.reportetestConstantesFunciones.resaltarubicacionReporteTest,this.reportetestConstantesFunciones.activarubicacionReporteTest,this,true,"ubicacionReporteTest","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReporteTestPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.reportetestSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.reportetestSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReporteTest.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.reportetestSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.reportetestSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReporteTest.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReporteTest && this.isPermisoGuardarCambiosReporteTest) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.reportetestSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.reportetestSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReporteTest.addColumn(tableColumn);
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
			
			this.jTableDatosReporteTest.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReporteTest && this.isPermisoGuardarCambiosReporteTest) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReporteTest && this.isPermisoGuardarCambiosReporteTest) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReporteTest.moveColumn(this.jTableDatosReporteTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReporteTest.moveColumn(this.jTableDatosReporteTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReporteTest.moveColumn(this.jTableDatosReporteTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReporteTest.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReporteTest.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReporteTest,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReporteTest.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReporteTest.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReporteTest.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReporteTest.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReporteTest.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=reportetestLogic.getReporteTests().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=reportetests.size()-1;
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
		//this.jTableDatosReporteTest.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReporteTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReporteTest();
			
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
				
				//this.isEsNuevoReporteTest=false;
					
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
				if(this.reportetestSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReporteTest==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReporteTest.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReporteTest.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.reportetest.getsType().equals("DUPLICADO")
				   || this.reportetest.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReporteTest=true;
				
				} else {
					this.isEsNuevoReporteTest=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
					if(this.reportetest.getId()>=0 && !this.reportetest.getIsNew()) {						
						this.isEsNuevoReporteTest=false;
						
					} else {
						this.isEsNuevoReporteTest=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReporteTest(esRelaciones);						
				
				this.seleccionarReporteTest(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.reportetest.getId()<0) {
					this.isEsNuevoReporteTest=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReporteTest(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReporteTest(evt,rowIndex);
				}	
				
				if(this.reportetestSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ReporteTest: " + this.dDif); 
					}
				}								
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReporteTest(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.reportetest)) {
					if(this.reportetest.getId()>0) {
						this.reportetest.setIsDeleted(true);
						
						this.reportetestsEliminados.add(this.reportetest);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.reportetestLogic.getReporteTests().remove(this.reportetest);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.reportetests.remove(this.reportetest);				
					}
					
					
					((ReporteTestModel) this.jTableDatosReporteTest.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReporteTest(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReporteTest(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReporteTest) {
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReporteTest.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReporteTest.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReporteTest(this.reportetest);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoMovimiento
					if(!this.reportetestConstantesFunciones.cargarid_tipo_movimientoReporteTest || this.reportetestConstantesFunciones.event_dependid_tipo_movimientoReporteTest) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.reportetest.getid_tipo_movimiento());
									//this.inicializarActualizarBindingReporteTest(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(reportetest.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(reportetest.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.reportetest.getid_tipo_movimiento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReporteTest("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReporteTest(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReporteTest() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReporteTest(ReporteTest reportetest) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReporteTest(reportetest,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReporteTest(ReporteTest reportetest,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReporteTest(reportetest);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReporteTest(reportetest,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReporteTest(reportetest);
	}
	
	public void setVariablesObjetoActualToFormularioReporteTest(ReporteTest reportetest) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setText(reportetest.getId().toString());
			this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setText(reportetest.getnombre());
			this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setText(reportetest.getubicacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ReporteTest reportetestLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,reportetestLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ReporteTest reportetestLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				reportetestLocal=this.reportetest;
			} else {
				reportetestLocal=this.reportetestAnterior;
			}
		}
		
		if(this.permiteMantenimiento(reportetestLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReporteTest(reportetestLocal,true);
					
					if(reportetestSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(reportetestLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.reportetestSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(reportetestLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReporteTest(ReporteTest reportetest,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReporteTest(reportetest,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(reportetest);
	}
	
	public void setVariablesFormularioToObjetoActualReporteTest(ReporteTest reportetest,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReporteTest(reportetest,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReporteTest(ReporteTest reportetest,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.getText()==null || this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.getText()=="" || this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.getText()=="Id") {
				this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setText("0");
			}

			if(conColumnasBase) {reportetest.setId(Long.parseLong(this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReporteTestConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelIdReporteTest,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			reportetest.setnombre(this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReporteTestConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelnombreReporteTest,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			reportetest.setubicacion(this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReporteTestConstantesFunciones.LABEL_UBICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReporteTest.jLabelubicacionReporteTest,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReporteTest(ReporteTest reportetestBean,ReporteTest reportetest,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && reportetestBean.getid_tipo_movimiento()!=null && !reportetestBean.getid_tipo_movimiento().equals(-1L))) {reportetest.setid_tipo_movimiento(reportetestBean.getid_tipo_movimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReporteTest(ReporteTest reportetestOrigen,ReporteTest reportetest,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && reportetestOrigen.getId()!=null && !reportetestOrigen.getId().equals(0L))) {reportetest.setId(reportetestOrigen.getId());}}
			if(conDefault || (!conDefault && reportetestOrigen.getid_tipo_movimiento()!=null && !reportetestOrigen.getid_tipo_movimiento().equals(-1L))) {reportetest.setid_tipo_movimiento(reportetestOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && reportetestOrigen.getnombre()!=null && !reportetestOrigen.getnombre().equals(""))) {reportetest.setnombre(reportetestOrigen.getnombre());}
			if(conDefault || (!conDefault && reportetestOrigen.getubicacion()!=null && !reportetestOrigen.getubicacion().equals(""))) {reportetest.setubicacion(reportetestOrigen.getubicacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReporteTest(ReporteTest reportetest) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setText(reportetest.getId().toString());
			this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setText(reportetest.getnombre());
			this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setText(reportetest.getubicacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReporteTest(ReporteTestBean reportetestBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setText(reportetestBean.getId().toString());
			this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setText(reportetestBean.getnombre());
			this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setText(reportetestBean.getubicacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReporteTest(ReporteTestParameterReturnGeneral reportetestReturnGeneral,ReporteTestBean reportetestBean,Boolean conDefault) throws Exception { 
		try {
			ReporteTest reportetestLocal=new ReporteTest();
			
			reportetestLocal=reportetestReturnGeneral.getReporteTest();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && reportetestLocal.getId()!=null && !reportetestLocal.getId().equals(0L))) {reportetestBean.setId(reportetestLocal.getId());}}
			if(conDefault || (!conDefault && reportetestLocal.getid_tipo_movimiento()!=null && !reportetestLocal.getid_tipo_movimiento().equals(-1L))) {reportetestBean.setid_tipo_movimiento(reportetestLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && reportetestLocal.getnombre()!=null && !reportetestLocal.getnombre().equals(""))) {reportetestBean.setnombre(reportetestLocal.getnombre());}
			if(conDefault || (!conDefault && reportetestLocal.getubicacion()!=null && !reportetestLocal.getubicacion().equals(""))) {reportetestBean.setubicacion(reportetestLocal.getubicacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReporteTestGenerico(Long idReporteTestSeleccionado,JComboBox jComboBoxReporteTest,List<ReporteTest> reportetestsLocal)throws Exception {
		try {
			ReporteTest  reportetestTemp=null;

			for(ReporteTest reportetestAux:reportetestsLocal) {
				if(reportetestAux.getId()!=null && reportetestAux.getId().equals(idReporteTestSeleccionado)) {
					reportetestTemp=reportetestAux;
					break;
				}
			}

			jComboBoxReporteTest.setSelectedItem(reportetestTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReporteTestGenerico(JComboBox jComboBoxReporteTest,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReporteTest.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReporteTest.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReporteTest.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReporteTest.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			reportetest=(ReporteTest) reportetestLogic.getReporteTests().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			reportetest =(ReporteTest) reportetests.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!reportetest.getIsNew() && !reportetest.getIsChanged() && !reportetest.getIsDeleted()) {
				sDescripcion=reportetest.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=reportetest.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!reportetest.getIsNew() && !reportetest.getIsChanged() && !reportetest.getIsDeleted()) {
				sDescripcion=reportetest.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=reportetest.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!reportetest.getIsNew() && !reportetest.getIsChanged() && !reportetest.getIsDeleted()) {
				sDescripcion=reportetest.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=reportetest.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ReporteTest reportetestRow=new ReporteTest();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			reportetestRow=(ReporteTest) reportetestLogic.getReporteTests().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			reportetestRow=(ReporteTest) reportetests.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReporteTest(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest));			
			this.jButtonDuplicarReporteTest.setVisible((this.isVisibilidadCeldaDuplicarReporteTest && this.isPermisoDuplicarReporteTest));			
			this.jButtonCopiarReporteTest.setVisible((this.isVisibilidadCeldaCopiarReporteTest && this.isPermisoCopiarReporteTest));
			this.jButtonVerFormReporteTest.setVisible((this.isVisibilidadCeldaVerFormReporteTest && this.isPermisoVerFormReporteTest));
			
			this.jButtonAbrirOrderByReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));			
			
			this.jButtonNuevoRelacionesReporteTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesReporteTest && this.isPermisoNuevoReporteTest));			
			this.jButtonNuevoGuardarCambiosReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest && this.isPermisoGuardarCambiosReporteTest));
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.jInternalFrameDetalleFormReporteTest.jButtonModificarReporteTest.setVisible((this.isVisibilidadCeldaModificarReporteTest && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.setVisible((this.isVisibilidadCeldaActualizarReporteTest && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.setVisible((this.isVisibilidadCeldaEliminarReporteTest && this.isPermisoEliminarReporteTest));
			this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.setVisible(this.isVisibilidadCeldaCancelarReporteTest);							
			this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.setVisible((this.isVisibilidadCeldaGuardarReporteTest && this.isPermisoGuardarCambiosReporteTest));			
			
			}
						
			this.jButtonGuardarCambiosTablaReporteTest.setVisible((this.isVisibilidadCeldaGuardarCambiosReporteTest && this.isPermisoGuardarCambiosReporteTest));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest));						
			this.jButtonDuplicarToolBarReporteTest.setVisible((this.isVisibilidadCeldaDuplicarReporteTest && this.isPermisoDuplicarReporteTest));						
			this.jButtonCopiarToolBarReporteTest.setVisible((this.isVisibilidadCeldaCopiarReporteTest && this.isPermisoCopiarReporteTest));			
			this.jButtonVerFormToolBarReporteTest.setVisible((this.isVisibilidadCeldaVerFormReporteTest && this.isPermisoVerFormReporteTest));			
			this.jButtonAbrirOrderByToolBarReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));
			this.jButtonNuevoRelacionesToolBarReporteTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesReporteTest && this.isPermisoNuevoReporteTest));			
			this.jButtonNuevoGuardarCambiosToolBarReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest && this.isPermisoGuardarCambiosReporteTest));			
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.jInternalFrameDetalleFormReporteTest.jButtonModificarToolBarReporteTest.setVisible((this.isVisibilidadCeldaModificarReporteTest && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jButtonActualizarToolBarReporteTest.setVisible((this.isVisibilidadCeldaActualizarReporteTest  && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jButtonEliminarToolBarReporteTest.setVisible((this.isVisibilidadCeldaEliminarReporteTest && this.isPermisoEliminarReporteTest));
			this.jInternalFrameDetalleFormReporteTest.jButtonCancelarToolBarReporteTest.setVisible(this.isVisibilidadCeldaCancelarReporteTest);				
			this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosToolBarReporteTest.setVisible((this.isVisibilidadCeldaGuardarReporteTest && this.isPermisoGuardarCambiosReporteTest));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReporteTest.setVisible((this.isVisibilidadCeldaGuardarCambiosReporteTest && this.isPermisoGuardarCambiosReporteTest));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest));			
			this.jMenuItemDuplicarReporteTest.setVisible((this.isVisibilidadCeldaDuplicarReporteTest && this.isPermisoDuplicarReporteTest));			
			this.jMenuItemCopiarReporteTest.setVisible((this.isVisibilidadCeldaCopiarReporteTest && this.isPermisoCopiarReporteTest));			
			this.jMenuItemVerFormReporteTest.setVisible((this.isVisibilidadCeldaVerFormReporteTest && this.isPermisoVerFormReporteTest));			
			this.jMenuItemAbrirOrderByReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));			
			//this.jMenuItemMostrarOcultarReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));
			this.jMenuItemDetalleAbrirOrderByReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));			
			//this.jMenuItemDetalleMostrarOcultarReporteTest.setVisible((this.isVisibilidadCeldaOrdenReporteTest && this.isPermisoOrdenReporteTest));			
			this.jMenuItemNuevoRelacionesReporteTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesReporteTest && this.isPermisoNuevoReporteTest));			
			this.jMenuItemNuevoGuardarCambiosReporteTest.setVisible((this.isVisibilidadCeldaNuevoReporteTest && this.isPermisoNuevoReporteTest && this.isPermisoGuardarCambiosReporteTest));									
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.jInternalFrameDetalleFormReporteTest.jMenuItemModificarReporteTest.setVisible((this.isVisibilidadCeldaModificarReporteTest && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jMenuItemActualizarReporteTest.setVisible((this.isVisibilidadCeldaActualizarReporteTest && this.isPermisoActualizarReporteTest));	
			this.jInternalFrameDetalleFormReporteTest.jMenuItemEliminarReporteTest.setVisible((this.isVisibilidadCeldaEliminarReporteTest && this.isPermisoEliminarReporteTest));
			this.jInternalFrameDetalleFormReporteTest.jMenuItemCancelarReporteTest.setVisible(this.isVisibilidadCeldaCancelarReporteTest);				
			}
			
			this.jMenuItemGuardarCambiosReporteTest.setVisible((this.isVisibilidadCeldaGuardarReporteTest && this.isPermisoGuardarCambiosReporteTest));						
			this.jMenuItemGuardarCambiosTablaReporteTest.setVisible((this.isVisibilidadCeldaGuardarCambiosReporteTest && this.isPermisoGuardarCambiosReporteTest));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReporteTest=this.jButtonNuevoReporteTest.isVisible();
			this.isVisibilidadCeldaDuplicarReporteTest=this.jButtonDuplicarReporteTest.isVisible();
			this.isVisibilidadCeldaCopiarReporteTest=this.jButtonCopiarReporteTest.isVisible();
			this.isVisibilidadCeldaVerFormReporteTest=this.jButtonVerFormReporteTest.isVisible();
			
			this.isVisibilidadCeldaOrdenReporteTest=this.jButtonAbrirOrderByReporteTest.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=this.jButtonNuevoRelacionesReporteTest.isVisible();
			this.isVisibilidadCeldaModificarReporteTest=this.jButtonModificarReporteTest.isVisible();
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.isVisibilidadCeldaActualizarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.isVisible();
			this.isVisibilidadCeldaEliminarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.isVisible();
			this.isVisibilidadCeldaCancelarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.isVisible();
			this.isVisibilidadCeldaGuardarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReporteTest=this.jButtonGuardarCambiosTablaReporteTest.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReporteTest=this.jButtonNuevoToolBarReporteTest.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=this.jButtonNuevoRelacionesToolBarReporteTest.isVisible();
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.isVisibilidadCeldaModificarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonModificarToolBarReporteTest.isVisible();
			this.isVisibilidadCeldaActualizarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonActualizarToolBarReporteTest.isVisible();
			this.isVisibilidadCeldaEliminarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonEliminarToolBarReporteTest.isVisible();
			this.isVisibilidadCeldaCancelarReporteTest=this.jInternalFrameDetalleFormReporteTest.jButtonCancelarToolBarReporteTest.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReporteTest=this.jButtonGuardarCambiosToolBarReporteTest.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReporteTest=this.jButtonGuardarCambiosTablaToolBarReporteTest.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReporteTest=this.jMenuItemNuevoReporteTest.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=this.jMenuItemNuevoRelacionesReporteTest.isVisible();
			
			if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.isVisibilidadCeldaModificarReporteTest=this.jInternalFrameDetalleFormReporteTest.jMenuItemModificarReporteTest.isVisible();
			this.isVisibilidadCeldaActualizarReporteTest=this.jInternalFrameDetalleFormReporteTest.jMenuItemActualizarReporteTest.isVisible();
			this.isVisibilidadCeldaEliminarReporteTest=this.jInternalFrameDetalleFormReporteTest.jMenuItemEliminarReporteTest.isVisible();
			this.isVisibilidadCeldaCancelarReporteTest=this.jInternalFrameDetalleFormReporteTest.jMenuItemCancelarReporteTest.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReporteTest=this.jMenuItemGuardarCambiosReporteTest.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReporteTest=this.jMenuItemGuardarCambiosTablaReporteTest.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReporteTest(Boolean esInicializar) {
		if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {			
			if(this.reportetestSessionBean.getConGuardarRelaciones()) {
				//if(this.reportetestSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReporteTest();
			}
			
			this.inicializarActualizarBindingBotonesManualReporteTest(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReporteTest() {
		this.jButtonNuevoReporteTest.setVisible(this.isPermisoNuevoReporteTest);			
		this.jButtonDuplicarReporteTest.setVisible(this.isPermisoDuplicarReporteTest);			
		this.jButtonCopiarReporteTest.setVisible(this.isPermisoCopiarReporteTest);			
		this.jButtonVerFormReporteTest.setVisible(this.isPermisoVerFormReporteTest);			
		
		this.jButtonAbrirOrderByReporteTest.setVisible(this.isPermisoOrdenReporteTest);					
		
		this.jButtonNuevoRelacionesReporteTest.setVisible(this.isPermisoNuevoReporteTest);			
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonModificarReporteTest.setVisible(this.isPermisoActualizarReporteTest);	
			this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.setVisible(this.isPermisoActualizarReporteTest);	
			this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.setVisible(this.isPermisoEliminarReporteTest);
			this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.setVisible(this.isVisibilidadCeldaCancelarReporteTest);						
			this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.setVisible(this.isPermisoGuardarCambiosReporteTest);							
		}
		
		this.jButtonGuardarCambiosTablaReporteTest.setVisible(this.isPermisoActualizarReporteTest);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReporteTest() {
		this.jInternalFrameDetalleFormReporteTest.jButtonModificarReporteTest.setVisible(this.isPermisoActualizarReporteTest);	
		this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.setVisible(this.isPermisoActualizarReporteTest);	
		this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.setVisible(this.isPermisoEliminarReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.setVisible(this.isVisibilidadCeldaCancelarReporteTest);							
		this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.setVisible((this.isVisibilidadCeldaGuardarReporteTest && this.isPermisoGuardarCambiosReporteTest));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReporteTest() {
		if(ReporteTestJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReporteTest();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReporteTest() {
	}
	
	public void jTableDatosReporteTestListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReporteTest(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.reportetest.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaReporteTestUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebReporteTest(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReporteTest.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReporteTest.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.reportetestLogic.getConnexion());

				if(this.reportetest.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.reportetest.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReporteTest=(TitledBorder)this.jScrollPanelDatosReporteTest.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderReporteTest.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.reportetest.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloReporteTestUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebReporteTest(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReporteTest.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReporteTest.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.reportetestLogic.getConnexion());

				if(this.reportetest.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.reportetest.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReporteTest=(TitledBorder)this.jScrollPanelDatosReporteTest.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderReporteTest.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.reportetest.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoReporteTestUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebReporteTest(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReporteTest.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReporteTest.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.reportetestLogic.getConnexion());

				if(this.reportetest.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.reportetest.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReporteTest=(TitledBorder)this.jScrollPanelDatosReporteTest.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderReporteTest.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.reportetest.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.reportetest.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonubicacionReporteTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.getreportetest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.reportetest==null) {
						this.reportetest = new ReporteTest();
					}

					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);
				}

				if(this.reportetest.getubicacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ubicacion like '%"+this.reportetest.getubicacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReporteTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaReporteTestReporteTestActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReporteTest(false,false);

			this.getReporteTestsBusquedaReporteTest();

			this.inicializarActualizarBindingReporteTest(false);

			//if(ReporteTestBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReporteTest(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaReporteTestActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReporteTest(false,false);

			this.getReporteTestsFK_IdEmpresa();

			this.inicializarActualizarBindingReporteTest(false);

			//if(ReporteTestBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReporteTest(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloReporteTestActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReporteTest(false,false);

			this.getReporteTestsFK_IdModulo();

			this.inicializarActualizarBindingReporteTest(false);

			//if(ReporteTestBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReporteTest(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoReporteTestActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReporteTest(false,false);

			this.getReporteTestsFK_IdTipoMovimiento();

			this.inicializarActualizarBindingReporteTest(false);

			//if(ReporteTestBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReporteTest(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.reportetestLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReporteTest() {
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
			this.jInternalFrameDetalleFormReporteTest.setVisible(false);	    			
			this.jInternalFrameDetalleFormReporteTest.dispose();
			this.jInternalFrameDetalleFormReporteTest=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
			this.jInternalFrameReporteDinamicoReporteTest.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReporteTest.dispose();
			this.jInternalFrameReporteDinamicoReporteTest=null;
		}
		
		if(this.jInternalFrameImportacionReporteTest!=null) {
			this.jInternalFrameImportacionReporteTest.setVisible(false);	    			
			this.jInternalFrameImportacionReporteTest.dispose();
			this.jInternalFrameImportacionReporteTest=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReporteTest();
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			
			if(sTipo.equals("NuevoReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReporteTest")) {
				jButtonDuplicarReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReporteTest")) {
				jButtonCopiarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("VerFormReporteTest")) {
				jButtonVerFormReporteTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReporteTest")) {
				jButtonDuplicarReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReporteTest")) {
				jButtonDuplicarReporteTestActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReporteTest")) {
				jButtonModificarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReporteTest")) {
				jButtonModificarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReporteTest")) {
				jButtonModificarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReporteTest")) {
				jButtonActualizarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReporteTest")) {
				jButtonActualizarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReporteTest")) {
				jButtonActualizarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("EliminarReporteTest")) {
				jButtonEliminarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReporteTest")) {
				jButtonEliminarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReporteTest")) {
				jButtonEliminarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("CancelarReporteTest")) {
				jButtonCancelarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReporteTest")) {
				jButtonCancelarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReporteTest")) {
				jButtonCancelarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("CerrarReporteTest")) {
				jButtonCerrarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReporteTest")) {
				jButtonCerrarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReporteTest")) {
				jButtonCerrarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReporteTest")) {
				jButtonMostrarOcultarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReporteTest")) {
				jButtonCancelarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReporteTest")) {
				jButtonCopiarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReporteTest")) {
				jButtonVerFormReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReporteTest")) {
				jButtonCopiarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReporteTest")) {
				jButtonVerFormReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReporteTest")) {
				jButtonRecargarInformacionReporteTestActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReporteTest")) {
				jButtonRecargarInformacionReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReporteTest")) {
				jButtonRecargarInformacionReporteTestActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReporteTest")) {
				jButtonAnterioresReporteTestActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReporteTest")) {
				jButtonAnterioresReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReporteTest")) {
				jButtonAnterioresReporteTestActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReporteTest")) {
				jButtonSiguientesReporteTestActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReporteTest")) {
				jButtonSiguientesReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReporteTest")) {
				jButtonSiguientesReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReporteTest") || sTipo.equals("MenuItemDetalleAbrirOrderByReporteTest")) {
				jButtonAbrirOrderByReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReporteTest") || sTipo.equals("MenuItemDetalleMostrarOcultarReporteTest")) {
				jButtonMostrarOcultarReporteTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReporteTest")) {
				jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReporteTest")) {
				jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReporteTest")) {
				jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReporteTest")) {
				jButtonCerrarReporteDinamicoReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReporteTest")) {
				jButtonGenerarReporteDinamicoReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReporteTest")) {
				
				jButtonGenerarExcelReporteDinamicoReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReporteTest")) {
				jButtonCerrarImportacionReporteTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReporteTest")) {
				
				jButtonGenerarImportacionReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReporteTest")) {
				
				jButtonAbrirImportacionReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReporteTest")) {
				jComboBoxTiposAccionesReporteTestActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReporteTest")) {
				jComboBoxTiposRelacionesReporteTestActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReporteTest")) {
				jComboBoxTiposAccionesReporteTestActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReporteTest")) {
				
				jComboBoxTiposSeleccionarReporteTestActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReporteTest")) {
				jTextFieldValorCampoGeneralReporteTestActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReporteTest")) {
				jButtonAbrirOrderByReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReporteTest")) {
				jButtonAbrirOrderByReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReporteTest")) {
				jButtonCerrarOrderByReporteTestActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReporteTestBusqueda")) {
				this.jButtonidReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReporteTestUpdate")) {
				this.jButtonid_empresaReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReporteTestBusqueda")) {
				this.jButtonid_empresaReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloReporteTestUpdate")) {
				this.jButtonid_moduloReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloReporteTestBusqueda")) {
				this.jButtonid_moduloReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoReporteTestUpdate")) {
				this.jButtonid_tipo_movimientoReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoReporteTestBusqueda")) {
				this.jButtonid_tipo_movimientoReporteTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReporteTestBusqueda")) {
				this.jButtonnombreReporteTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionReporteTestBusqueda")) {
				this.jButtonubicacionReporteTestBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaReporteTestReporteTest")) {
				this.jButtonBusquedaReporteTestReporteTestActionPerformed(evt);
			}
			
			;
			
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReporteTest();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ReporteTest reportetestLocal=null;
			
			if(!this.getEsControlTabla()) {
				reportetestLocal=this.reportetest;
			} else {
				reportetestLocal=this.reportetestAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
							
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
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
			
			


			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
								
						
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
								
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
							
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
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
			
			


			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
								
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReporteTest")) {
					jCheckBoxSeleccionarTodosReporteTestItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReporteTest")) {
					jCheckBoxSeleccionadosReporteTestItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReporteTest")) {
					
				}
				
				


				
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
												
				
				


				
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
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
			
			


			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReporteTestActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.reportetest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.reportetest);
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
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
				
				


				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReporteTest.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReporteTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReporteTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.reportetestAnterior =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.reportetestAnterior =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReporteTest")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReporteTestListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReporteTest.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.reportetest =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.reportetest =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.reportetest);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReporteTest")) {
				
				}
				
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReporteTest")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReporteTest.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReporteTest")) {
			
			}
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReporteTest();
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			if(sTipo.equals("NuevoReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReporteTest")) {
				jButtonDuplicarReporteTestActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReporteTest")) {
				jButtonCopiarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReporteTest")) {
				jButtonVerFormReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReporteTest")) {
				jButtonNuevoReporteTestActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReporteTest")) {
				jButtonModificarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReporteTest")) {
				jButtonActualizarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReporteTest")) {
				jButtonEliminarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReporteTest")) {
				jButtonCancelarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReporteTest")) {
				jButtonCerrarReporteTestActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReporteTest")) {
				jButtonGuardarCambiosReporteTestActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReporteTest")) {
				jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReporteTest")) {
				jButtonAbrirOrderByReporteTestActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReporteTest")) {
				jButtonRecargarInformacionReporteTestActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReporteTest")) {
				jButtonAnterioresReporteTestActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReporteTest")) {
				jButtonSiguientesReporteTestActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReporteTestBusqueda")) {
				this.jButtonidReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReporteTestUpdate")) {
				this.jButtonid_empresaReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReporteTestBusqueda")) {
				this.jButtonid_empresaReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloReporteTestUpdate")) {
				this.jButtonid_moduloReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloReporteTestBusqueda")) {
				this.jButtonid_moduloReporteTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoReporteTestUpdate")) {
				this.jButtonid_tipo_movimientoReporteTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoReporteTestBusqueda")) {
				this.jButtonid_tipo_movimientoReporteTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReporteTestBusqueda")) {
				this.jButtonnombreReporteTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionReporteTestBusqueda")) {
				this.jButtonubicacionReporteTestBusquedaActionPerformed(evt);
			}
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReporteTest();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReporteTest")) {
				closingInternalFrameReporteTest();
				
			} else if(sTipo.equals("jButtonCancelarReporteTest")) {
				JInternalFrameBase jInternalFrameDetalleFormReporteTest = (JInternalFrameBase)evt.getSource();
	            	
	            ReporteTestBeanSwingJInternalFrame jInternalFrameParent=(ReporteTestBeanSwingJInternalFrame)jInternalFrameDetalleFormReporteTest.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReporteTestActionPerformed(null);
			}
			
			ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.reportetest,new Object(),this.reportetestParameterGeneral,this.reportetestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReporteTest(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReporteTest(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReporteTest(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.reportetest)) {
			if(!esControlTabla) {
				if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);			
				}
				
				if(this.reportetestSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReporteTest(this.reportetest,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReporteTest(this.reportetestReturnGeneral,this.reportetestBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.reportetestSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReporteTest(classes,this.reportetestReturnGeneral,this.reportetestBean,false);
					}
						
					if(this.reportetestReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReporteTest(this.reportetestReturnGeneral.getReporteTest());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReporteTest(this.reportetestReturnGeneral.getReporteTest());	
					}
						
					if(this.reportetestReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReporteTest(this.reportetestReturnGeneral.getReporteTest(),classes);//this.reportetestBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReporteTest(this.reportetest,classes);//this.reportetestBean);									
				}
			
				if(ReporteTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReporteTest(this.reportetest,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReporteTest(this.reportetest);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.reportetestAnterior!=null) {
						this.reportetest=this.reportetestAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.reportetestSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.reportetestSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.reportetestReturnGeneral.getReporteTest(),reportetestLogic.getReporteTests());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.reportetestReturnGeneral.getReporteTest(),this.reportetests);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReporteTest.repaint();
				
				//((AbstractTableModel) this.jTableDatosReporteTest.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReporteTest();
			}
		}
	}
	
	public void actualizarVisualTableDatosReporteTest() throws Exception {
		
		ReporteTestModel reportetestModel=(ReporteTestModel)this.jTableDatosReporteTest.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			reportetestModel.reportetests=this.reportetestLogic.getReporteTests();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			reportetestModel.reportetests=this.reportetests;
		}
		
		
		((ReporteTestModel) this.jTableDatosReporteTest.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReporteTest() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreportetestAnterior(),this.reportetestLogic.getReporteTests());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreportetestAnterior(),this.reportetests);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReporteTest();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReporteTest(ReporteTest reportetest,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
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
										
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.reportetest,new Object(),generalEntityParameterGeneral,this.reportetestReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.reportetestSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReporteTestConstantesFunciones.getClassesRelationshipsOfReporteTest(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReporteTestConstantesFunciones.getClassesRelationshipsFromStringsOfReporteTest(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReporteTest(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReporteTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.reportetest,new Object(),generalEntityParameterGeneral,this.reportetestReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReporteTest(ReporteTestBean reportetestBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReporteTest(ArrayList<Classe> classes,ReporteTestReturnGeneral reportetestReturnGeneral,ReporteTestBean reportetestBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReporteTest(ReporteTest reportetest,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.reportetest)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReporteTest = new ReporteTestDetalleFormJInternalFrame(jDesktopPane,this.reportetestSessionBean.getConGuardarRelaciones(),this.reportetestSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReporteTest);
		this.jInternalFrameDetalleFormReporteTest.setVisible(false);
		this.jInternalFrameDetalleFormReporteTest.setSelected(false);						
		
		this.jInternalFrameDetalleFormReporteTest.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReporteTest.reportetestLogic=this.reportetestLogic;
		
		this.cargarCombosFrameForeignKeyReporteTest("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReporteTest();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReporteTest();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReporteTest("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReporteTest();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReporteTest.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReporteTest"));
		
		this.jInternalFrameDetalleFormReporteTest.jButtonModificarReporteTest.addActionListener(new ButtonActionListener(this,"ModificarReporteTest"));

		
		this.jInternalFrameDetalleFormReporteTest.jButtonModificarToolBarReporteTest.addActionListener(new ButtonActionListener(this,"ModificarToolBarReporteTest"));
					
		this.jInternalFrameDetalleFormReporteTest.jMenuItemModificarReporteTest.addActionListener(new ButtonActionListener(this,"MenuItemModificarReporteTest"));		
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.addActionListener (new ButtonActionListener(this,"ActualizarReporteTest"));
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonActualizarToolBarReporteTest.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReporteTest"));
						
		this.jInternalFrameDetalleFormReporteTest.jMenuItemActualizarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReporteTest"));		
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.addActionListener (new ButtonActionListener(this,"EliminarReporteTest"));
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonEliminarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"EliminarToolBarReporteTest"));
								
		this.jInternalFrameDetalleFormReporteTest.jMenuItemEliminarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReporteTest"));		
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.addActionListener (new ButtonActionListener(this,"CancelarReporteTest"));
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonCancelarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"CancelarToolBarReporteTest"));
					
		this.jInternalFrameDetalleFormReporteTest.jMenuItemCancelarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReporteTest"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jMenuItemDetalleCerrarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReporteTest"));		
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosToolBarReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReporteTest"));
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosToolBarReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReporteTest"));
		
		
		
		this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReporteTest"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonidReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"idReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonnombreReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonubicacionReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionReporteTestBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReporteTest"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReporteTest"));
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReporteTest"));
		}
		
		this.jTableDatosReporteTest.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReporteTest"));
		
		this.jTableDatosReporteTest.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReporteTest"));
		
		this.jButtonNuevoReporteTest.addActionListener(new ButtonActionListener(this,"NuevoReporteTest"));
		
		this.jButtonDuplicarReporteTest.addActionListener(new ButtonActionListener(this,"DuplicarReporteTest"));
		
		this.jButtonCopiarReporteTest.addActionListener(new ButtonActionListener(this,"CopiarReporteTest"));
		
		this.jButtonVerFormReporteTest.addActionListener(new ButtonActionListener(this,"VerFormReporteTest"));
		
		
		this.jButtonNuevoToolBarReporteTest.addActionListener(new ButtonActionListener(this,"NuevoToolBarReporteTest"));
			
		this.jButtonDuplicarToolBarReporteTest.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReporteTest"));
			
		this.jMenuItemNuevoReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReporteTest"));
			
		this.jMenuItemDuplicarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReporteTest"));		
		
		
		this.jButtonNuevoRelacionesReporteTest.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReporteTest"));
		
		
		this.jButtonNuevoRelacionesToolBarReporteTest.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReporteTest"));
			
		this.jMenuItemNuevoRelacionesReporteTest.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReporteTest"));		
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonModificarReporteTest.addActionListener(new ButtonActionListener(this,"ModificarReporteTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonModificarToolBarReporteTest.addActionListener(new ButtonActionListener(this,"ModificarToolBarReporteTest"));
			
			this.jInternalFrameDetalleFormReporteTest.jMenuItemModificarReporteTest.addActionListener(new ButtonActionListener(this,"MenuItemModificarReporteTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReporteTest.jButtonActualizarReporteTest.addActionListener (new ButtonActionListener(this,"ActualizarReporteTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonActualizarToolBarReporteTest.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReporteTest"));
				
			this.jInternalFrameDetalleFormReporteTest.jMenuItemActualizarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReporteTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonEliminarReporteTest.addActionListener (new ButtonActionListener(this,"EliminarReporteTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonEliminarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"EliminarToolBarReporteTest"));
						
			this.jInternalFrameDetalleFormReporteTest.jMenuItemEliminarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReporteTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonCancelarReporteTest.addActionListener (new ButtonActionListener(this,"CancelarReporteTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonCancelarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"CancelarToolBarReporteTest"));
			
			this.jInternalFrameDetalleFormReporteTest.jMenuItemCancelarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReporteTest"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReporteTest.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReporteTest"));		
		
		
		this.jButtonCerrarReporteTest.addActionListener (new ButtonActionListener(this,"CerrarReporteTest"));
		
		
		this.jButtonCerrarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"CerrarToolBarReporteTest"));
			
		this.jMenuItemCerrarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReporteTest"));
			
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jMenuItemDetalleCerrarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReporteTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosReporteTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosToolBarReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReporteTest"));
		}
		
		this.jButtonCopiarToolBarReporteTest.addActionListener (new ButtonActionListener(this,"CopiarToolBarReporteTest"));
			
		this.jButtonVerFormToolBarReporteTest.addActionListener (new ButtonActionListener(this,"VerFormToolBarReporteTest"));
		
		this.jMenuItemGuardarCambiosReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReporteTest"));
			
		this.jMenuItemCopiarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReporteTest"));		
		
		this.jMenuItemVerFormReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReporteTest"));		
		
		
		this.jButtonGuardarCambiosTablaReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReporteTest"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReporteTest"));
			
		this.jMenuItemGuardarCambiosTablaReporteTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReporteTest"));		
		
		
		
		this.jButtonRecargarInformacionReporteTest.addActionListener (new ButtonActionListener(this,"RecargarInformacionReporteTest"));
					
		this.jButtonRecargarInformacionToolBarReporteTest.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReporteTest"));
		
		this.jMenuItemRecargarInformacionReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReporteTest"));		
		
		
		
		this.jButtonAnterioresReporteTest.addActionListener (new ButtonActionListener(this,"AnterioresReporteTest"));
		
		
		this.jButtonAnterioresToolBarReporteTest.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReporteTest"));
		
		this.jMenuItemAnterioresReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReporteTest"));		
		
		
		this.jButtonSiguientesReporteTest.addActionListener (new ButtonActionListener(this,"SiguientesReporteTest"));
		
		
		this.jButtonSiguientesToolBarReporteTest.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReporteTest"));
			
		this.jMenuItemSiguientesReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReporteTest"));
			
		this.jMenuItemAbrirOrderByReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReporteTest"));
			
		this.jMenuItemMostrarOcultarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReporteTest"));
			
		this.jMenuItemDetalleAbrirOrderByReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReporteTest"));
			
		this.jMenuItemDetalleMostarOcultarReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReporteTest"));		
		
		
		this.jButtonNuevoGuardarCambiosReporteTest.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReporteTest"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReporteTest.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReporteTest"));
			
		this.jMenuItemNuevoGuardarCambiosReporteTest.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReporteTest"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReporteTest.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReporteTest"));

		this.jCheckBoxSeleccionadosReporteTest.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReporteTest"));
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReporteTest"));
		}
		
		
		this.jComboBoxTiposRelacionesReporteTest.addActionListener (new ButtonActionListener(this,"TiposRelacionesReporteTest"));
			
		this.jComboBoxTiposAccionesReporteTest.addActionListener (new ButtonActionListener(this,"TiposAccionesReporteTest"));
					
		this.jComboBoxTiposSeleccionarReporteTest.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReporteTest"));
			
		this.jTextFieldValorCampoGeneralReporteTest.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReporteTest"));		
		
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonidReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"idReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonnombreReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonubicacionReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionReporteTestBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaReporteTestReporteTest.addActionListener(new ButtonActionListener(this,"BusquedaReporteTestReporteTest"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReporteTest!=null) {
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReporteTest"));
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReporteTest"));
				this.jInternalFrameReporteDinamicoReporteTest.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReporteTest"));
			}
			
			//this.jButtonCerrarReporteDinamicoReporteTest.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReporteTest"));				
			//this.jButtonGenerarReporteDinamicoReporteTest.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReporteTest"));
			//this.jButtonGenerarExcelReporteDinamicoReporteTest.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReporteTest"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReporteTest!=null) {
				this.jInternalFrameImportacionReporteTest.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReporteTest"));
				this.jInternalFrameImportacionReporteTest.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReporteTest"));
				this.jInternalFrameImportacionReporteTest.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReporteTest"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReporteTest.addActionListener (new ButtonActionListener(this,"AbrirOrderByReporteTest"));
			
			this.jButtonAbrirOrderByToolBarReporteTest.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReporteTest"));			
			
			if(this.jInternalFrameOrderByReporteTest!=null) {
				this.jInternalFrameOrderByReporteTest.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReporteTest"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReporteTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReporteTest.jTabbedPaneRelacionesReporteTest.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReporteTest"));
		
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
            		closingInternalFrameReporteTest();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReporteTest.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReporteTest = (JInternalFrameBase)event.getSource();
	            	
	            ReporteTestBeanSwingJInternalFrame jInternalFrameParent=(ReporteTestBeanSwingJInternalFrame)jInternalFrameDetalleFormReporteTest.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReporteTestActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReporteTest.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReporteTestListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReporteTest.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReporteTest.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReporteTest";
		inputMap = this.jButtonNuevoReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReporteTestActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReporteTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReporteTest";
		inputMap = this.jButtonNuevoRelacionesReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReporteTestActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReporteTest";
		inputMap = this.jButtonModificarReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReporteTest";
		inputMap = this.jButtonActualizarReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReporteTest";
		inputMap = this.jButtonEliminarReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReporteTest";
		inputMap = this.jButtonCancelarReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReporteTest";
		inputMap = this.jButtonCerrarReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReporteTest";
		inputMap = this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReporteTest.jButtonGuardarCambiosReporteTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReporteTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReporteTest.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReporteTestItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReporteTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReporteTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReporteTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReporteTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReporteTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReporteTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonidReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"idReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_empresaReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_moduloReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloReporteTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonid_tipo_movimientoReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonnombreReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreReporteTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReporteTest.jButtonubicacionReporteTestBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionReporteTestBusqueda"));
		
		
		this.jButtonBusquedaReporteTestReporteTest.addActionListener(new ButtonActionListener(this,"BusquedaReporteTestReporteTest"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReporteTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReporteTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReporteTestActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReporteTest.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReporteTest(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
					reportetestAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReporteTest reportetestAux:reportetests) {
					reportetestAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReporteTestItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReporteTest(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
						reportetestAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReporteTest reportetestAux:reportetests) {
						reportetestAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReporteTest reportetestAux:reportetests) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReporteTest(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReporteTest.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReporteTest.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReporteTestItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReporteTest(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReporteTest.getSelectedRows();
			
			ReporteTest reportetestLocal=new ReporteTest();
			
			//this.seleccionarTodosReporteTest(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					reportetestLocal =(ReporteTest) this.reportetestLogic.getReporteTests().toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					reportetestLocal =(ReporteTest) this.reportetests.toArray()[this.jTableDatosReporteTest.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				reportetestLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
						reportetestAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReporteTest reportetestAux:reportetests) {
						reportetestAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReporteTest(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReporteTest.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReporteTest.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReporteTest,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReporteTestItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReporteTestParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReporteTestActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReporteTest(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReporteTest.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReporteTest reportetestAux:this.reportetestLogic.getReporteTests()) {
				
						if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							reportetestAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							reportetestAux.setubicacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReporteTest reportetestAux:reportetests) {
					
						if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							reportetestAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							reportetestAux.setubicacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReporteTest(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReporteTestActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReporteTest(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReporteTest=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReporteTest.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReporteTest) {				
					conSplash=true;//false;										
					
					//this.startProcessReporteTest(conSplash);
				
					this.generarReporteReporteTestsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReporteTestsSeleccionados();
				//this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReporteTestsSeleccionados(false);
				//this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReporteTestsSeleccionados(true);
				//this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReporteTest();
				
				this.exportarReporteTestsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReporteTests();
				//this.importarReporteTests();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReporteTest();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReporteTestsSeleccionados();
				//this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Reporte Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReporteTest();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReporteTest)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReporteTest(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
				}	
			} 			
			else if(ReporteTestBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReporteTest) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReporteTest(conSplash);
					
						//this.actualizarParametrosGeneralReporteTest();
						
						this.generarReporteProcesoAccionReporteTestsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReporteTestBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Reporte TestES SELECCIONADOS?", "MANTENIMIENTO DE Reporte Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReporteTest();
				
						this.actualizarParametrosGeneralReporteTest();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.reportetestReturnGeneral=reportetestLogic.procesarAccionReporteTestsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.reportetestLogic.getReporteTests(),this.reportetestParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReporteTestReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReporteTest();
					
					ReporteTestBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReporteTestReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReporteTest.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReporteTest.jComboBoxTiposAccionesFormularioReporteTest.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReporteTest(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReporteTestActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReporteTest();
			
			if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
			ReporteTest reportetest=new ReporteTest();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReporteTest(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReporteTest.getSelectedItem();
			
			
			
			
			reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
			//this.sTipoAccion;
			
			if(reportetestsSeleccionados.size()==1) {
				for(ReporteTest reportetestAux:reportetestsSeleccionados) {
					reportetest=reportetestAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReporteTest();
			
      		//this.finishProcessReporteTest(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReporteTestReturnGeneral() throws Exception {
		if(this.reportetestReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.reportetestReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.reportetestReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.reportetestReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.reportetestReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.reportetestReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReporteTest(false);
		}
		
		if(this.reportetestReturnGeneral.getConRetornoLista() || this.reportetestReturnGeneral.getConRetornoObjeto()) {
			if(this.reportetestReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.reportetestLogic.setReporteTests(this.reportetestReturnGeneral.getReporteTests());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingReporteTest(false);
		}
	}
	
	public void actualizarParametrosGeneralReporteTest() throws Exception {
		
		
	}
	
	public ArrayList<ReporteTest> getReporteTestsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReporteTest) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ReporteTest reportetestAux:reportetestLogic.getReporteTests()) {
					if(reportetestAux.getIsSelected()) {
						reportetestsSeleccionados.add(reportetestAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReporteTest reportetestAux:this.reportetests) {
					if(reportetestAux.getIsSelected()) {
						reportetestsSeleccionados.add(reportetestAux);				
					}
				}
			}
			
			if(reportetestsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						reportetestsSeleccionados.addAll(this.reportetestLogic.getReporteTests());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						reportetestsSeleccionados.addAll(this.reportetests);				
					}
				}
			}
		} else {
			reportetestsSeleccionados.add(this.reportetest);
		}
		
		return reportetestsSeleccionados;
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
	
	public void generarReporteReporteTestsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReporteTestsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReporteTestsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReporteTestsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReporteTestsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Reporte Test",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReporteTests("Todos",reportetestsSeleccionados);
		
	}	
	
	public void generarReporteNormalReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReporteTests("Todos",reportetestsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReporteTestsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReporteTests("Todos",reportetestsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReporteTest();
		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReporteTest();
		
		
		//this.generarReporteReporteTests("Todos",reportetestsSeleccionados ,reportetestImplementable,reportetestImplementableHome);
	}
	
	public void mostrarImportacionReporteTests() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReporteTest();
		
		this.abrirFrameImportacionReporteTest();		
		
			
		//this.generarReporteReporteTests("Todos",reportetestsSeleccionados ,reportetestImplementable,reportetestImplementableHome);
	}
	
	public void importarReporteTests() throws Exception {		
	
	}
	
	public void exportarReporteTestsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReporteTestsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReporteTestsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReporteTestsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Reporte Test",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReporteTest(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ReporteTest reportetestAux:reportetestsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReporteTest(reportetestAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//reportetestAux.setsDetalleGeneralEntityReporte(reportetestAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReporteTest(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReporteTestConstantesFunciones.LABEL_UBICACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReporteTest(ReporteTest reportetest,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=reportetest.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=reportetest.getubicacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ReporteTests");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReporteTest(row);				
				iRow++;
			}				
			
			for(ReporteTest reportetestAux:reportetestsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReporteTest(reportetestAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReporteTestsSeleccionados() throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();		
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"reportetest.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("reportetests");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("reportetest");
			//elementRoot.appendChild(element);
		
			for(ReporteTest reportetestAux:reportetestsSeleccionados) {
				element = document.createElement("reportetest");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReporteTest(reportetestAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reporte Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReporteTest(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReporteTestConstantesFunciones.LABEL_UBICACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReporteTest(ReporteTest reportetest,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(reportetest.getubicacion());				
	}
	
	public void setFilaDatosExportarXmlReporteTest(ReporteTest reportetest,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReporteTestConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(reportetest.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReporteTestConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(reportetest.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ReporteTestConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(reportetest.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(ReporteTestConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(reportetest.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(ReporteTestConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(reportetest.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementnombre = document.createElement(ReporteTestConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(reportetest.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementubicacion = document.createElement(ReporteTestConstantesFunciones.UBICACION);
		elementubicacion.appendChild(document.createTextNode(reportetest.getubicacion().trim()));
		element.appendChild(elementubicacion);
	}
	
	public void generarReporteGroupGenericoReporteTestsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ReporteTest> reportetestsSeleccionados=new ArrayList<ReporteTest>();
		
		reportetestsSeleccionados=this.getReporteTestsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReporteTest(reportetestsSeleccionados);
		
		this.generarReporteReporteTests("Todos",reportetestsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReporteTest(ArrayList<ReporteTest> reportetestsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ReporteTest reportetestAux:reportetestsSeleccionados) {
				reportetestAux.setsDetalleGeneralEntityReporte(reportetestAux.toString());
			
				if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					reportetestAux.setsDescripcionGeneralEntityReporte1(reportetestAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					reportetestAux.setsDescripcionGeneralEntityReporte1(reportetestAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					reportetestAux.setsDescripcionGeneralEntityReporte1(reportetestAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					reportetestAux.setsDescripcionGeneralEntityReporte1(reportetestAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ReporteTestConstantesFunciones.LABEL_UBICACION)) {
					existe=true;
					reportetestAux.setsDescripcionGeneralEntityReporte1(reportetestAux.getubicacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReporteTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReporteTest(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReporteTest=true;
				this.isVisibilidadCeldaNuevoRelacionesReporteTest=true;
				this.isVisibilidadCeldaGuardarCambiosReporteTest=true;
			}
			
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=true;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=true;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=true;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=true;
			this.isVisibilidadCeldaEliminarReporteTest=true;
			this.isVisibilidadCeldaCancelarReporteTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=true;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=true;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReporteTest=true;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=true;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=true;
			this.isVisibilidadCeldaModificarReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=true;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
			this.isVisibilidadCeldaModificarReporteTest=true;
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
			this.isVisibilidadCeldaCancelarReporteTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				} else {
					this.isVisibilidadCeldaGuardarReporteTest=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReporteTestJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReporteTest=true;
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=true;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=true;
		} else {
			this.actualizarEstadoPanelsReporteTest(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReporteTest=false;
			//this.isVisibilidadCeldaVerFormReporteTest=false;
			this.isVisibilidadCeldaDuplicarReporteTest=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!reportetestSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
		} else {
			this.isVisibilidadCeldaNuevoReporteTest=false;
			this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(reportetestSessionBean.getEsGuardarRelacionado()) {
			if(!reportetestSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;												
			}
			
			this.jButtonCerrarReporteTest.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
		}
		
		if(!this.permiteMantenimiento(this.reportetest)) {
			this.isVisibilidadCeldaActualizarReporteTest=false;
			this.isVisibilidadCeldaEliminarReporteTest=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoReporteTest=false;
		this.isVisibilidadCeldaNuevoRelacionesReporteTest=false;
		this.isVisibilidadCeldaGuardarCambiosReporteTest=false;
		//this.isVisibilidadCeldaModificarReporteTest=true;
		this.isVisibilidadCeldaActualizarReporteTest=false;
		this.isVisibilidadCeldaEliminarReporteTest=false;
		//this.isVisibilidadCeldaCancelarReporteTest=true;			
		this.isVisibilidadCeldaGuardarReporteTest=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReporteTest() {
	}
	
	public void actualizarEstadoPanelsReporteTest(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReporteTest!=null) {
				this.jScrollPanelDatosEdicionReporteTest.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReporteTest!=null) {
				this.jScrollPanelDatosReporteTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionReporteTest!=null) {
				this.jPanelPaginacionReporteTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.reportetestSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReporteTest!=null) {
					this.jTabbedPaneBusquedasReporteTest.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.reportetestSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReporteTest!=null) {
				this.jTabbedPaneBusquedasReporteTest.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReporteTest!=null) {
				this.jPanelParametrosReportesReporteTest.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaReporteTest=isParaEmpresa;
			if(!this.isVisibilidadBusquedaReporteTest) {this.jTabbedPaneBusquedasReporteTest.remove(jPanelBusquedaReporteTestReporteTest);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaReporteTest=isParaModulo;
			if(!this.isVisibilidadBusquedaReporteTest) {this.jTabbedPaneBusquedasReporteTest.remove(jPanelBusquedaReporteTestReporteTest);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaReporteTest=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaReporteTest) {this.jTabbedPaneBusquedasReporteTest.remove(jPanelBusquedaReporteTestReporteTest);}
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
			
			this.inicializarActualizarBindingTablaReporteTest(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReporteTest() {
		this.updateBorderResaltarBusquedasFormularioReporteTest();
		this.updateVisibilidadBusquedasFormularioReporteTest();
		this.updateHabilitarBusquedasFormularioReporteTest();
	}
	
	public void updateBorderResaltarBusquedasFormularioReporteTest() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReporteTest.getComponents().length>0) {
	

		if(this.reportetestConstantesFunciones.resaltarBusquedaReporteTestReporteTest!=null) {
			index= this.jTabbedPaneBusquedasReporteTest.indexOfComponent(this.jPanelBusquedaReporteTestReporteTest);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReporteTest.getComponent(index);
				jPanel.setBorder(this.reportetestConstantesFunciones.resaltarBusquedaReporteTestReporteTest);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReporteTest() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReporteTest.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReporteTest.indexOfComponent(this.jPanelBusquedaReporteTestReporteTest);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReporteTest.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.reportetestConstantesFunciones.mostrarBusquedaReporteTestReporteTest);
			if(!this.reportetestConstantesFunciones.mostrarBusquedaReporteTestReporteTest && index>-1) {
				this.jTabbedPaneBusquedasReporteTest.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReporteTest() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReporteTest.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReporteTest.indexOfComponent(this.jPanelBusquedaReporteTestReporteTest);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReporteTest.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.reportetestConstantesFunciones.activarBusquedaReporteTestReporteTest);
				this.jTabbedPaneBusquedasReporteTest.setEnabledAt(index,this.reportetestConstantesFunciones.activarBusquedaReporteTestReporteTest);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReporteTest(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaReporteTest")) {
			index= this.jTabbedPaneBusquedasReporteTest.indexOfComponent(this.jPanelBusquedaReporteTestReporteTest);

			this.jTabbedPaneBusquedasReporteTest.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReporteTest.getComponent(index);

			this.reportetestConstantesFunciones.setResaltarBusquedaReporteTestReporteTest(resaltar);

			jPanel.setBorder(this.reportetestConstantesFunciones.resaltarBusquedaReporteTestReporteTest);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReporteTest.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReporteTest() throws Exception {

		if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReporteTest();
		this.updateVisibilidadResaltarControlesFormularioReporteTest();
		this.updateHabilitarResaltarControlesFormularioReporteTest();
		
	}
	
	public void updateBorderResaltarControlesFormularioReporteTest() throws Exception {
		if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.reportetestConstantesFunciones.resaltaridReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setBorder(this.reportetestConstantesFunciones.resaltaridReporteTest);}
		if(this.reportetestConstantesFunciones.resaltarid_empresaReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setBorder(this.reportetestConstantesFunciones.resaltarid_empresaReporteTest);}
		if(this.reportetestConstantesFunciones.resaltarid_moduloReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setBorder(this.reportetestConstantesFunciones.resaltarid_moduloReporteTest);}
		if(this.reportetestConstantesFunciones.resaltarid_tipo_movimientoReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setBorder(this.reportetestConstantesFunciones.resaltarid_tipo_movimientoReporteTest);}
		if(this.reportetestConstantesFunciones.resaltarnombreReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setBorder(this.reportetestConstantesFunciones.resaltarnombreReporteTest);}
		if(this.reportetestConstantesFunciones.resaltarubicacionReporteTest!=null && this.jInternalFrameDetalleFormReporteTest!=null) {this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setBorder(this.reportetestConstantesFunciones.resaltarubicacionReporteTest);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReporteTest() throws Exception {		
		if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
	
		//this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setVisible(this.reportetestConstantesFunciones.mostraridReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelidReporteTest.setVisible(this.reportetestConstantesFunciones.mostraridReporteTest);
		//this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_empresaReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelid_empresaReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_empresaReporteTest);
		//this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_moduloReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelid_moduloReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_moduloReporteTest);
		//this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_tipo_movimientoReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelid_tipo_movimientoReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarid_tipo_movimientoReporteTest);
		//this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarnombreReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelnombreReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarnombreReporteTest);
		//this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarubicacionReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jPanelubicacionReporteTest.setVisible(this.reportetestConstantesFunciones.mostrarubicacionReporteTest);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReporteTest() throws Exception {
		if(this.jInternalFrameDetalleFormReporteTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReporteTest!=null) {
	
		this.jInternalFrameDetalleFormReporteTest.jLabelidReporteTest.setEnabled(this.reportetestConstantesFunciones.activaridReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_empresaReporteTest.setEnabled(this.reportetestConstantesFunciones.activarid_empresaReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_moduloReporteTest.setEnabled(this.reportetestConstantesFunciones.activarid_moduloReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jComboBoxid_tipo_movimientoReporteTest.setEnabled(this.reportetestConstantesFunciones.activarid_tipo_movimientoReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jTextFieldnombreReporteTest.setEnabled(this.reportetestConstantesFunciones.activarnombreReporteTest);
		this.jInternalFrameDetalleFormReporteTest.jTextAreaubicacionReporteTest.setEnabled(this.reportetestConstantesFunciones.activarubicacionReporteTest);
		}
	}
	
		
}