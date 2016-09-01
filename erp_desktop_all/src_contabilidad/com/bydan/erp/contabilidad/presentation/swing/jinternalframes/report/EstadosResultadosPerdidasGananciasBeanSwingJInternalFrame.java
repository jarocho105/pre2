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

//import com.bydan.erp.contabilidad.util.EstadosResultadosPerdidasGananciasConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.EstadosResultadosPerdidasGananciasParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.EstadosResultadosPerdidasGananciasParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.EstadosResultadosPerdidasGananciasBean;
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
public class EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame extends EstadosResultadosPerdidasGananciasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciasValidator = new ClassValidator<EstadosResultadosPerdidasGanancias>(EstadosResultadosPerdidasGanancias.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias;	
	public EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux;
	public EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasTotales;
	public Long idEstadosResultadosPerdidasGananciasActual;
	public Long iIdNuevoEstadosResultadosPerdidasGanancias=0L;
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

	public String sFinalQueryComboNivelCuenta="";

	public List<NivelCuenta> nivelcuentasForeignKey;

	public List<NivelCuenta> getnivelcuentasForeignKey() {
		return nivelcuentasForeignKey;
	}

	public void setnivelcuentasForeignKey(List<NivelCuenta> nivelcuentasForeignKey) {
		this.nivelcuentasForeignKey = nivelcuentasForeignKey;
	}

	//OBJETO FK ACTUAL
	public NivelCuenta nivelcuentaForeignKey;

	public NivelCuenta getnivelcuentaForeignKey() {
		return nivelcuentaForeignKey;
	}

	public void setnivelcuentaForeignKey(NivelCuenta nivelcuentaForeignKey) {
		this.nivelcuentaForeignKey = nivelcuentaForeignKey;
	}

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
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
	
	public Boolean isPermisoTodoEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoNuevoEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoActualizarEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoEliminarEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoConsultaEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoBusquedaEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoReporteEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoCopiarEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoVerFormEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoDuplicarEstadosResultadosPerdidasGanancias;
	public Boolean isPermisoOrdenEstadosResultadosPerdidasGanancias;
	
	
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
	
	public EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasReturnGeneral;
	public EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadosResultadosPerdidasGanancias=false;
	public Boolean esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadosResultadosPerdidasGananciasSessionBeanAdditional estadosresultadosperdidasgananciasSessionBeanAdditional=null;
	
	public EstadosResultadosPerdidasGananciasSessionBeanAdditional getEstadosResultadosPerdidasGananciasSessionBeanAdditional() {
		return this.estadosresultadosperdidasgananciasSessionBeanAdditional;
	}
	
	public void setEstadosResultadosPerdidasGananciasSessionBeanAdditional(EstadosResultadosPerdidasGananciasSessionBeanAdditional estadosresultadosperdidasgananciasSessionBeanAdditional) {
		try {
			this.estadosresultadosperdidasgananciasSessionBeanAdditional=estadosresultadosperdidasgananciasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional estadosresultadosperdidasgananciasBeanSwingJInternalFrameAdditional=null;
	//public class EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame
	
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional getEstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional() {
		return this.estadosresultadosperdidasgananciasBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional estadosresultadosperdidasgananciasBeanSwingJInternalFrameAdditional) {
		try {
			this.estadosresultadosperdidasgananciasBeanSwingJInternalFrameAdditional=estadosresultadosperdidasgananciasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadosResultadosPerdidasGananciasLogic estadosresultadosperdidasgananciasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasBean;
	public EstadosResultadosPerdidasGananciasConstantesFunciones estadosresultadosperdidasgananciasConstantesFunciones;
	//public EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public NivelCuentaLogic nivelcuentaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass;	
	//public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassEliminados;
	//public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias=true;
	public Boolean isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias=true;
	public Boolean isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias=true;
	public Boolean isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;	
	
	
	public Boolean isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdNivelCuenta=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoEstadosResultadosPerdidasGanancias() {
		return this.iIdNuevoEstadosResultadosPerdidasGanancias;
	}

	public void setiIdNuevoEstadosResultadosPerdidasGanancias(Long iIdNuevoEstadosResultadosPerdidasGanancias) {
		this.iIdNuevoEstadosResultadosPerdidasGanancias = iIdNuevoEstadosResultadosPerdidasGanancias;
	}
	
	public Long getidEstadosResultadosPerdidasGananciasActual() {
		return this.idEstadosResultadosPerdidasGananciasActual;
	}

	public void setidEstadosResultadosPerdidasGananciasActual(Long idEstadosResultadosPerdidasGananciasActual) {
		this.idEstadosResultadosPerdidasGananciasActual = idEstadosResultadosPerdidasGananciasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadosResultadosPerdidasGanancias getestadosresultadosperdidasganancias() {
		return this.estadosresultadosperdidasganancias;
	}

	public void setestadosresultadosperdidasganancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) {
		this.estadosresultadosperdidasganancias = estadosresultadosperdidasganancias;
	}
	
	public EstadosResultadosPerdidasGanancias getestadosresultadosperdidasgananciasAux() {
		return this.estadosresultadosperdidasgananciasAux;
	}

	public void setestadosresultadosperdidasgananciasAux(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux) {
		this.estadosresultadosperdidasgananciasAux = estadosresultadosperdidasgananciasAux;
	}				
	
	public EstadosResultadosPerdidasGanancias getestadosresultadosperdidasgananciasAnterior() {
		return this.estadosresultadosperdidasgananciasAnterior;
	}

	public void setestadosresultadosperdidasgananciasAnterior(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAnterior) {
		this.estadosresultadosperdidasgananciasAnterior = estadosresultadosperdidasgananciasAnterior;
	}	
	
	public EstadosResultadosPerdidasGanancias getestadosresultadosperdidasgananciasTotales() {
		return this.estadosresultadosperdidasgananciasTotales;
	}

	public void setestadosresultadosperdidasgananciasTotales(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasTotales) {
		this.estadosresultadosperdidasgananciasTotales = estadosresultadosperdidasgananciasTotales;
	}	
	
	public EstadosResultadosPerdidasGanancias getestadosresultadosperdidasgananciasBean() {
		return this.estadosresultadosperdidasgananciasBean;
	}

	public void setestadosresultadosperdidasgananciasBean(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasBean) {
		this.estadosresultadosperdidasgananciasBean = estadosresultadosperdidasgananciasBean;
	}	
	
	public EstadosResultadosPerdidasGananciasParameterReturnGeneral getestadosresultadosperdidasgananciasReturnGeneral() {
		return this.estadosresultadosperdidasgananciasReturnGeneral;
	}

	public void setestadosresultadosperdidasgananciasReturnGeneral(EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasReturnGeneral) {
		this.estadosresultadosperdidasgananciasReturnGeneral = estadosresultadosperdidasgananciasReturnGeneral;
	}	
	
	
	public Long id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias=-1L;

	public Long getid_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias() {
		return this.id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias;
	}

	public void setid_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias(Long id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias) {
		this.id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias = id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias;
	}

;
	public Long id_ejercicioBusquedaEstadosResultadosPerdidasGanancias=-1L;

	public Long getid_ejercicioBusquedaEstadosResultadosPerdidasGanancias() {
		return this.id_ejercicioBusquedaEstadosResultadosPerdidasGanancias;
	}

	public void setid_ejercicioBusquedaEstadosResultadosPerdidasGanancias(Long id_ejercicioBusquedaEstadosResultadosPerdidasGanancias) {
		this.id_ejercicioBusquedaEstadosResultadosPerdidasGanancias = id_ejercicioBusquedaEstadosResultadosPerdidasGanancias;
	}

;
	public Long id_periodoBusquedaEstadosResultadosPerdidasGanancias=-1L;

	public Long getid_periodoBusquedaEstadosResultadosPerdidasGanancias() {
		return this.id_periodoBusquedaEstadosResultadosPerdidasGanancias;
	}

	public void setid_periodoBusquedaEstadosResultadosPerdidasGanancias(Long id_periodoBusquedaEstadosResultadosPerdidasGanancias) {
		this.id_periodoBusquedaEstadosResultadosPerdidasGanancias = id_periodoBusquedaEstadosResultadosPerdidasGanancias;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_nivel_cuentaFK_IdNivelCuenta=-1L;

	public Long getid_nivel_cuentaFK_IdNivelCuenta() {
		return this.id_nivel_cuentaFK_IdNivelCuenta;
	}

	public void setid_nivel_cuentaFK_IdNivelCuenta(Long id_nivel_cuentaFK_IdNivelCuenta) {
		this.id_nivel_cuentaFK_IdNivelCuenta = id_nivel_cuentaFK_IdNivelCuenta;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadosResultadosPerdidasGananciasLogic getEstadosResultadosPerdidasGananciasLogic()	{		
		return estadosresultadosperdidasgananciasLogic;
	}

	public void setEstadosResultadosPerdidasGananciasLogic(EstadosResultadosPerdidasGananciasLogic estadosresultadosperdidasgananciasLogic) {
		this.estadosresultadosperdidasgananciasLogic = estadosresultadosperdidasgananciasLogic;
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
	
	public Boolean getIsEsNuevoEstadosResultadosPerdidasGanancias() {
		return isEsNuevoEstadosResultadosPerdidasGanancias;
	}

	public void setIsEsNuevoEstadosResultadosPerdidasGanancias(Boolean isEsNuevoEstadosResultadosPerdidasGanancias) {
		this.isEsNuevoEstadosResultadosPerdidasGanancias = isEsNuevoEstadosResultadosPerdidasGanancias;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias() {
		return esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias;
	}
	
	public void setEsParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias(Boolean esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias) {
		this.esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias = esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias;
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

			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			}

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(estadosresultadosperdidasgananciasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosNivelCuentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.nivelcuentasForeignKey=new ArrayList<NivelCuenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NivelCuentaLogic nivelcuentaLogic=new NivelCuentaLogic();

			//nivelcuentaLogic.getNivelCuentaDataAccess().setIsForForeingKeyData(true);

			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			}

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionNivelCuenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//nivelcuentaLogic.getNivelCuentaDataAccess().setIsForForeingKeyData(true);

					nivelcuentaLogic.getTodosNivelCuentasWithConnection(sFinalQuery,new Pagination());

					this.nivelcuentasForeignKey=nivelcuentaLogic.getNivelCuentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNivelCuenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentaLogic.getEntityWithConnection(estadosresultadosperdidasgananciasSessionBean.getlidNivelCuentaActual());
					this.nivelcuentasForeignKey.add(nivelcuentaLogic.getNivelCuenta());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			}

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(estadosresultadosperdidasgananciasSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			}

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(estadosresultadosperdidasgananciasSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

					if(this.estadosresultadosperdidasganancias!=null) {
						this.estadosresultadosperdidasganancias.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico)throws Exception
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
				jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico!=null && jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNivelCuentaForeignKey(Long idNivelCuentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NivelCuenta  nivelcuentaTemp=null;

			for(NivelCuenta nivelcuentaAux:nivelcuentasForeignKey) {
				if(nivelcuentaAux.getId()!=null && nivelcuentaAux.getId().equals(idNivelCuentaSeleccionado)) {
					nivelcuentaTemp=nivelcuentaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(nivelcuentaTemp!=null) {

					if(this.estadosresultadosperdidasganancias!=null) {
						this.estadosresultadosperdidasganancias.setNivelCuenta(nivelcuentaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuentaTemp);
					}
				} else {
					//jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuentaTemp);
					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){
					if(nivelcuentaTemp!=null && jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
						jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuentaTemp);
					} else {
						if(jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
							//jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuentaTemp);
							if(jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getItemCount()>0) {
								jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
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

	public String getActualNivelCuentaForeignKeyDescripcion(Long idNivelCuentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NivelCuenta  nivelcuentaTemp=null;

			for(NivelCuenta nivelcuentaAux:nivelcuentasForeignKey) {
				if(nivelcuentaAux.getId()!=null && nivelcuentaAux.getId().equals(idNivelCuentaSeleccionado)) {
					nivelcuentaTemp=nivelcuentaAux;
					break;
				}
			}


			sDescripcion=NivelCuentaConstantesFunciones.getNivelCuentaDescripcion(nivelcuentaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNivelCuentaForeignKeyGenerico(Long idNivelCuentaSeleccionado,JComboBox jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			NivelCuenta  nivelcuentaTemp=null;

			for(NivelCuenta nivelcuentaAux:nivelcuentasForeignKey) {
				if(nivelcuentaAux.getId()!=null && nivelcuentaAux.getId().equals(idNivelCuentaSeleccionado)) {
					nivelcuentaTemp=nivelcuentaAux;
					break;
				}
			}

			if(nivelcuentaTemp!=null) {
				jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico.setSelectedItem(nivelcuentaTemp);
			} else {
				if(jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico!=null && jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico.getItemCount()>0) {
					jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.estadosresultadosperdidasganancias!=null) {
						this.estadosresultadosperdidasganancias.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
						jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
							//jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico!=null && jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.estadosresultadosperdidasganancias!=null) {
						this.estadosresultadosperdidasganancias.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
						jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
							//jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getItemCount()>0) {
								jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico!=null && jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico.getItemCount()>0) {
					jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,JComboBox jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadosResultadosPerdidasGananciasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadosresultadosperdidasganancias.setid_empresa(empresaAux.getId());
				estadosresultadosperdidasganancias.setempresa_descripcion(EstadosResultadosPerdidasGananciasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadosresultadosperdidasganancias.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNivelCuentaForeignKey(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,JComboBox jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			NivelCuenta  nivelcuentaAux=new NivelCuenta();

			if(jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico==null) {
				nivelcuentaAux=(NivelCuenta)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getSelectedItem();
			} else {
				nivelcuentaAux=(NivelCuenta)jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGananciasGenerico.getSelectedItem();
			}

			if(nivelcuentaAux!=null && nivelcuentaAux.getId()!=null) {
				estadosresultadosperdidasganancias.setid_nivel_cuenta(nivelcuentaAux.getId());
				estadosresultadosperdidasganancias.setnivelcuenta_descripcion(EstadosResultadosPerdidasGananciasConstantesFunciones.getNivelCuentaDescripcion(nivelcuentaAux));
				estadosresultadosperdidasganancias.setNivelCuenta(nivelcuentaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,JComboBox jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioEstadosResultadosPerdidasGananciasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				estadosresultadosperdidasganancias.setid_ejercicio(ejercicioAux.getId());
				estadosresultadosperdidasganancias.setejercicio_descripcion(EstadosResultadosPerdidasGananciasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				estadosresultadosperdidasganancias.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,JComboBox jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoEstadosResultadosPerdidasGananciasGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				estadosresultadosperdidasganancias.setid_periodo(periodoAux.getId());
				estadosresultadosperdidasganancias.setperiodo_descripcion(EstadosResultadosPerdidasGananciasConstantesFunciones.getPeriodoDescripcion(periodoAux));
				estadosresultadosperdidasganancias.setPeriodo(periodoAux);			}
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

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
					}

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNivelCuentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNivelCuenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.removeAllItems();

							for(NivelCuenta nivelcuenta:this.nivelcuentasForeignKey) {
								this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.addItem(nivelcuenta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
					}

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.removeAllItems();

							for(NivelCuenta nivelcuenta:this.nivelcuentasForeignKey) {
								this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.addItem(nivelcuenta);
							}
						}

						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
					}

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.addItem(ejercicio);
							}
						}

						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { 
					}

					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.addItem(periodo);
							}
						}

						if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameNivelCuentaForeignKey(NivelCuenta nivelcuenta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuenta);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(nivelcuenta);
						} else {
							this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadosResultadosPerdidasGanancias() throws Exception {
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
		
	public EstadosResultadosPerdidasGananciasParameterReturnGeneral getEstadosResultadosPerdidasGananciasParameterGeneral() {
		return this.estadosresultadosperdidasgananciasParameterGeneral;
	}
	
	public void setEstadosResultadosPerdidasGananciasParameterGeneral(EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasParameterGeneral) {
		this.estadosresultadosperdidasgananciasParameterGeneral = estadosresultadosperdidasgananciasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadosResultadosPerdidasGanancias() {
		return isPermisoTodoEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoTodoEstadosResultadosPerdidasGanancias(Boolean isPermisoTodoEstadosResultadosPerdidasGanancias) {
		this.isPermisoTodoEstadosResultadosPerdidasGanancias = isPermisoTodoEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoNuevoEstadosResultadosPerdidasGanancias() {
		return isPermisoNuevoEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoNuevoEstadosResultadosPerdidasGanancias(Boolean isPermisoNuevoEstadosResultadosPerdidasGanancias) {
		this.isPermisoNuevoEstadosResultadosPerdidasGanancias = isPermisoNuevoEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoActualizarEstadosResultadosPerdidasGanancias() {
		return isPermisoActualizarEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoActualizarEstadosResultadosPerdidasGanancias(Boolean isPermisoActualizarEstadosResultadosPerdidasGanancias) {
		this.isPermisoActualizarEstadosResultadosPerdidasGanancias = isPermisoActualizarEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoEliminarEstadosResultadosPerdidasGanancias() {
		return isPermisoEliminarEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoEliminarEstadosResultadosPerdidasGanancias(Boolean isPermisoEliminarEstadosResultadosPerdidasGanancias) {
		this.isPermisoEliminarEstadosResultadosPerdidasGanancias = isPermisoEliminarEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoGuardarCambiosEstadosResultadosPerdidasGanancias() {
		return isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoGuardarCambiosEstadosResultadosPerdidasGanancias(Boolean isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias) {
		this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias = isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoConsultaEstadosResultadosPerdidasGanancias() {
		return isPermisoConsultaEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoConsultaEstadosResultadosPerdidasGanancias(Boolean isPermisoConsultaEstadosResultadosPerdidasGanancias) {
		this.isPermisoConsultaEstadosResultadosPerdidasGanancias = isPermisoConsultaEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoBusquedaEstadosResultadosPerdidasGanancias() {
		return isPermisoBusquedaEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoBusquedaEstadosResultadosPerdidasGanancias(Boolean isPermisoBusquedaEstadosResultadosPerdidasGanancias) {
		this.isPermisoBusquedaEstadosResultadosPerdidasGanancias = isPermisoBusquedaEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsPermisoReporteEstadosResultadosPerdidasGanancias() {
		return isPermisoReporteEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoReporteEstadosResultadosPerdidasGanancias(Boolean isPermisoReporteEstadosResultadosPerdidasGanancias) {
		this.isPermisoReporteEstadosResultadosPerdidasGanancias = isPermisoReporteEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadosResultadosPerdidasGanancias() {
		return isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoPaginacionMedioEstadosResultadosPerdidasGanancias(Boolean isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias) {
		this.isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias = isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadosResultadosPerdidasGanancias() {
		return isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoPaginacionTodoEstadosResultadosPerdidasGanancias(Boolean isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias) {
		this.isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias = isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadosResultadosPerdidasGanancias() {
		return isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoPaginacionAltoEstadosResultadosPerdidasGanancias(Boolean isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias) {
		this.isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias = isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoCopiarEstadosResultadosPerdidasGanancias() {
		return isPermisoCopiarEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoCopiarEstadosResultadosPerdidasGanancias(Boolean isPermisoCopiarEstadosResultadosPerdidasGanancias) {
		this.isPermisoCopiarEstadosResultadosPerdidasGanancias = isPermisoCopiarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoVerFormEstadosResultadosPerdidasGanancias() {
		return isPermisoVerFormEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoVerFormEstadosResultadosPerdidasGanancias(Boolean isPermisoVerFormEstadosResultadosPerdidasGanancias) {
		this.isPermisoVerFormEstadosResultadosPerdidasGanancias = isPermisoVerFormEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoDuplicarEstadosResultadosPerdidasGanancias() {
		return isPermisoDuplicarEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoDuplicarEstadosResultadosPerdidasGanancias(Boolean isPermisoDuplicarEstadosResultadosPerdidasGanancias) {
		this.isPermisoDuplicarEstadosResultadosPerdidasGanancias = isPermisoDuplicarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsPermisoOrdenEstadosResultadosPerdidasGanancias() {
		return isPermisoOrdenEstadosResultadosPerdidasGanancias;
	}

	public void setIsPermisoOrdenEstadosResultadosPerdidasGanancias(Boolean isPermisoOrdenEstadosResultadosPerdidasGanancias) {
		this.isPermisoOrdenEstadosResultadosPerdidasGanancias = isPermisoOrdenEstadosResultadosPerdidasGanancias;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias = isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias = isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias = isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias = isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias = isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias() {
		return isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias(Boolean isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias = isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias;
	}
		
	public EstadosResultadosPerdidasGananciasSessionBean getestadosresultadosperdidasgananciasSessionBean() {
		return this.estadosresultadosperdidasgananciasSessionBean;
	}
	
	public void setestadosresultadosperdidasgananciasSessionBean(EstadosResultadosPerdidasGananciasSessionBean estadosresultadosperdidasgananciasSessionBean) {
		this.estadosresultadosperdidasgananciasSessionBean=estadosresultadosperdidasgananciasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEstadosResultadosPerdidasGanancias() {
		return this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias;
	}

	public void setisVisibilidadBusquedaEstadosResultadosPerdidasGanancias(Boolean isVisibilidadBusquedaEstadosResultadosPerdidasGanancias) {
		this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=isVisibilidadBusquedaEstadosResultadosPerdidasGanancias;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdNivelCuenta() {
		return this.isVisibilidadFK_IdNivelCuenta;
	}

	public void setisVisibilidadFK_IdNivelCuenta(Boolean isVisibilidadFK_IdNivelCuenta) {
		this.isVisibilidadFK_IdNivelCuenta=isVisibilidadFK_IdNivelCuenta;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadosresultadosperdidasganancias,null);
				this.setActualParaGuardarNivelCuentaForeignKey(estadosresultadosperdidasganancias,null);
				this.setActualParaGuardarEjercicioForeignKey(estadosresultadosperdidasganancias,null);
				this.setActualParaGuardarPeriodoForeignKey(estadosresultadosperdidasganancias,null);
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
	
	public void bugActualizarReferenciaActual(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadosresultadosperdidasgananciasAux.setId(estadosresultadosperdidasganancias.getId());
		estadosresultadosperdidasgananciasAux.setVersionRow(estadosresultadosperdidasganancias.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal) throws Exception {
		
		if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal) throws Exception {	
		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadosresultadosperdidasgananciasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NivelCuentaDetalleFormJInternalFrame.class)) {
				NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrameLocal=(NivelCuentaBeanSwingJInternalFrame) ((NivelCuentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				nivelcuentaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNivelCuenta(nivelcuentaBeanSwingJInternalFrameLocal.getnivelcuenta(),true);
				nivelcuentaBeanSwingJInternalFrameLocal.actualizarLista(nivelcuentaBeanSwingJInternalFrameLocal.nivelcuenta,this.nivelcuentasForeignKey);

				nivelcuentaBeanSwingJInternalFrameLocal.actualizarRelaciones(nivelcuentaBeanSwingJInternalFrameLocal.nivelcuenta);

				estadosresultadosperdidasgananciasLocal.setNivelCuenta(nivelcuentaBeanSwingJInternalFrameLocal.nivelcuenta);

				this.addItemDefectoCombosForeignKeyNivelCuenta();
				this.cargarCombosFrameNivelCuentasForeignKey("Formulario");
				this.setActualNivelCuentaForeignKey(nivelcuentaBeanSwingJInternalFrameLocal.nivelcuenta.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				estadosresultadosperdidasgananciasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				estadosresultadosperdidasgananciasLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadosResultadosPerdidasGananciasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadosresultadosperdidasgananciasValidator.getInvalidValues(this.estadosresultadosperdidasganancias);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass) throws Exception {
	}		
	
	public void actualizarSelectedLista(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass) throws Exception {
		try	{			
			EstadosResultadosPerdidasGananciasConstantesFunciones.actualizarSelectedLista(estadosresultadosperdidasganancias,estadosresultadosperdidasgananciass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadosresultadosperdidasgananciassLocal=this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadosresultadosperdidasgananciassLocal=this.estadosresultadosperdidasgananciass;
			}
			//ARCHITECTURE
		
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal:estadosresultadosperdidasgananciassLocal) {
				if(this.permiteMantenimiento(estadosresultadosperdidasgananciasLocal) && estadosresultadosperdidasgananciasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.getEstadosResultadosPerdidasGananciasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcodigoEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombreEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.NOMBRENIVELCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.DEBITOINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabeldebito_inicialEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.CREDITOINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcredito_inicialEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosResultadosPerdidasGananciasConstantesFunciones.SALDOINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcodigoEstadosResultadosPerdidasGanancias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombreEstadosResultadosPerdidasGanancias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabeldebito_inicialEstadosResultadosPerdidasGanancias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcredito_inicialEstadosResultadosPerdidasGanancias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias,"");
		
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
		this.iIdNuevoEstadosResultadosPerdidasGanancias--;	
		
		
		this.estadosresultadosperdidasgananciasAux=new EstadosResultadosPerdidasGanancias();
		
		this.estadosresultadosperdidasgananciasAux.setId(this.iIdNuevoEstadosResultadosPerdidasGanancias);
		this.estadosresultadosperdidasgananciasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().add(this.estadosresultadosperdidasgananciasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadosresultadosperdidasgananciass.add(this.estadosresultadosperdidasgananciasAux);
		}
		//ARCHITECTURE
		
		this.estadosresultadosperdidasganancias=this.estadosresultadosperdidasgananciasAux;
		
		if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
		}
				
		//this.setDefaultControlesEstadosResultadosPerdidasGanancias();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasBean,this.estadosresultadosperdidasganancias,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral,this.estadosresultadosperdidasgananciasBean,false);
		
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias());
		}
		
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias(),classes);//this.estadosresultadosperdidasgananciasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadosResultadosPerdidasGanancias();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.RecargarFormEstadosResultadosPerdidasGanancias(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
						
			if(estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();
			}
			
			this.actualizarVisualTableDatosEstadosResultadosPerdidasGanancias();
			
			this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(this.getIndiceNuevoEstadosResultadosPerdidasGanancias(), this.getIndiceNuevoEstadosResultadosPerdidasGanancias());
			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
						
			this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarcodigoEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombreEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activardebito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarcredito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarsaldo_inicialEstadosResultadosPerdidasGanancias);	
		//
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_empresaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_nivel_cuentaEstadosResultadosPerdidasGanancias);//
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_ejercicioEstadosResultadosPerdidasGanancias);//
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setEnabled(isHabilitar && this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_periodoEstadosResultadosPerdidasGanancias);
	};
	
	public void setDefaultControlesEstadosResultadosPerdidasGanancias() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadosResultadosPerdidasGanancias(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(true);			
			this.estadosresultadosperdidasgananciasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setVisible(true);
			
					
		} else {
			//this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(false);			
			this.estadosresultadosperdidasgananciasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadosResultadosPerdidasGanancias() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				if(estadosresultadosperdidasgananciasAux.getId().equals(this.iIdNuevoEstadosResultadosPerdidasGanancias)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciass) {
				if(estadosresultadosperdidasgananciasAux.getId().equals(this.iIdNuevoEstadosResultadosPerdidasGanancias)) {
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
	
	public int getIndiceActualEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				if(estadosresultadosperdidasgananciasAux.getId().equals(estadosresultadosperdidasganancias.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciass) {
				if(estadosresultadosperdidasgananciasAux.getId().equals(estadosresultadosperdidasganancias.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				if(estadosresultadosperdidasgananciasAux.getEstadosResultadosPerdidasGananciasOriginal().getId().equals(estadosresultadosperdidasgananciasOriginal.getId())) {
					existe=true;
					estadosresultadosperdidasgananciasOriginal.setId(estadosresultadosperdidasgananciasAux.getId());
					estadosresultadosperdidasgananciasOriginal.setVersionRow(estadosresultadosperdidasgananciasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciass) {
				if(estadosresultadosperdidasgananciasAux.getEstadosResultadosPerdidasGananciasOriginal().getId().equals(estadosresultadosperdidasgananciasOriginal.getId())) {
					existe=true;
					estadosresultadosperdidasgananciasOriginal.setId(estadosresultadosperdidasgananciasAux.getId());
					estadosresultadosperdidasgananciasOriginal.setVersionRow(estadosresultadosperdidasgananciasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadosResultadosPerdidasGanancias(Boolean esParaCancelar) throws Exception {
		estadosresultadosperdidasgananciassAux=new ArrayList<EstadosResultadosPerdidasGanancias>();
		estadosresultadosperdidasgananciasAux=new EstadosResultadosPerdidasGanancias();
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
					if(estadosresultadosperdidasgananciasAux.getId()<0) {
						estadosresultadosperdidasgananciassAux.add(estadosresultadosperdidasgananciasAux);
					}		
				}
				this.iIdNuevoEstadosResultadosPerdidasGanancias=0L;
				this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().removeAll(estadosresultadosperdidasgananciassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciass) {
					if(estadosresultadosperdidasgananciasAux.getId()<0) {
						estadosresultadosperdidasgananciassAux.add(estadosresultadosperdidasgananciasAux);
					}		
				}
				this.iIdNuevoEstadosResultadosPerdidasGanancias=0L;
				this.estadosresultadosperdidasgananciass.removeAll(estadosresultadosperdidasgananciassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadosResultadosPerdidasGanancias 
					&& this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size()>0
					) {
					estadosresultadosperdidasgananciasAux=this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().get(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size() - 1);
				
					if(estadosresultadosperdidasgananciasAux.getId()<0) {
						this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().remove(estadosresultadosperdidasgananciasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadosResultadosPerdidasGanancias && this.estadosresultadosperdidasgananciass.size()>0) {
					estadosresultadosperdidasgananciasAux=this.estadosresultadosperdidasgananciass.get(this.estadosresultadosperdidasgananciass.size() - 1);
				
					if(estadosresultadosperdidasgananciasAux.getId()<0) {
						this.estadosresultadosperdidasgananciass.remove(estadosresultadosperdidasgananciasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadosResultadosPerdidasGanancias(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadosresultadosperdidasganancias.getId()<0) {
				this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().remove(this.estadosresultadosperdidasganancias);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadosresultadosperdidasganancias.getId()<0) {
				this.estadosresultadosperdidasgananciass.remove(this.estadosresultadosperdidasganancias);
			}
		}			
	}
	
	public void setEstadosInicialesEstadosResultadosPerdidasGanancias(List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassAux) throws Exception {
		EstadosResultadosPerdidasGananciasConstantesFunciones.setEstadosInicialesEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciassAux);
	}
	
	public void setEstadosInicialesEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux) throws Exception {
		EstadosResultadosPerdidasGananciasConstantesFunciones.setEstadosInicialesEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadosResultadosPerdidasGananciasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadosResultadosPerdidasGananciasActual()) {
				if(!this.isEsNuevoEstadosResultadosPerdidasGanancias) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadosResultadosPerdidasGananciasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estados Resultados Perdidas Ganancias ?", "MANTENIMIENTO DE Estados Resultados Perdidas Ganancias", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) throws Exception {
		EstadosResultadosPerdidasGananciasConstantesFunciones.seleccionarAsignar(this.estadosresultadosperdidasganancias,estadosresultadosperdidasganancias);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadosResultadosPerdidasGanancias=this.isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias;
			
			
			this.seleccionarAsignar(estadosresultadosperdidasganancias);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadosresultadosperdidasgananciasSessionBean.setsFuncionBusquedaRapida(this.estadosresultadosperdidasgananciasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadosResultadosPerdidasGanancias) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadosResultadosPerdidasGanancias(esParaCancelar);				
				this.cancelarNuevoEstadosResultadosPerdidasGanancias(esParaCancelar);								
			}
			
			this.estadosresultadosperdidasganancias=new EstadosResultadosPerdidasGanancias();
			
			this.inicializarEstadosResultadosPerdidasGanancias();
			
			this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadosResultadosPerdidasGanancias() throws Exception {
		try {
			EstadosResultadosPerdidasGananciasConstantesFunciones.inicializarEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadosResultadosPerdidasGananciass(String sAccionBusqueda,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassParaReportes) throws Exception {
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
					sPathReporteFinal="EstadosResultadosPerdidasGanancias"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadosResultadosPerdidasGananciasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadosResultadosPerdidasGananciasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadosResultadosPerdidasGanancias"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estados Resultados Perdidas Gananciases");		
		parameters.put("busquedapor", EstadosResultadosPerdidasGananciasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadosResultadosPerdidasGanancias=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadosResultadosPerdidasGananciasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadosResultadosPerdidasGananciasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadosResultadosPerdidasGanancias=new JRBeanArrayDataSource(EstadosResultadosPerdidasGananciasJInternalFrame.TraerEstadosResultadosPerdidasGananciasBeans(estadosresultadosperdidasgananciassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadosResultadosPerdidasGanancias);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadosResultadosPerdidasGananciasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadosResultadosPerdidasGananciasBean.TraerEstadosResultadosPerdidasGananciasBeans(estadosresultadosperdidasgananciassParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(null);
					//this.generarExcelReporteEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadosResultadosPerdidasGananciass(sAccionBusqueda,sTipoArchivoReporte,estadosresultadosperdidasgananciassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadosResultadosPerdidasGananciass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosResultadosPerdidasGananciass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadosResultadosPerdidasGanancias("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias : estadosresultadosperdidasgananciassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadosResultadosPerdidasGananciasConstantesFunciones.generarExcelReporteDataEstadosResultadosPerdidasGanancias("NORMAL",row,workbook,estadosresultadosperdidasganancias,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadosResultadosPerdidasGanancias(String sTipo,Row row,Workbook workbook) {
		
		EstadosResultadosPerdidasGananciasConstantesFunciones.generarExcelReporteHeaderEstadosResultadosPerdidasGanancias(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadosResultadosPerdidasGananciass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosResultadosPerdidasGananciass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias : estadosresultadosperdidasgananciassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.getEstadosResultadosPerdidasGananciasDescripcion(estadosresultadosperdidasganancias));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getnivelcuenta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getnombre_nivel_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getdebito_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getcredito_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosresultadosperdidasganancias.getsaldo_inicial());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadosResultadosPerdidasGananciass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassRespaldo=null;
		
		classes=EstadosResultadosPerdidasGananciasConstantesFunciones.getClassesRelationshipsOfEstadosResultadosPerdidasGanancias(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadosresultadosperdidasgananciasLogic.setDatosCliente(this.datosCliente);
		this.estadosresultadosperdidasgananciasLogic.setDatosDeep(this.datosDeep);
		this.estadosresultadosperdidasgananciasLogic.setIsConDeep(true);
		
		estadosresultadosperdidasgananciassRespaldo=this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass();
		
		this.estadosresultadosperdidasgananciasLogic.setEstadosResultadosPerdidasGananciass(estadosresultadosperdidasgananciassParaReportes);	
		this.estadosresultadosperdidasgananciasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadosresultadosperdidasgananciassParaReportes=this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass();
		this.estadosresultadosperdidasgananciasLogic.setEstadosResultadosPerdidasGananciass(estadosresultadosperdidasgananciassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosResultadosPerdidasGananciass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadosResultadosPerdidasGanancias("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias : estadosresultadosperdidasgananciassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadosResultadosPerdidasGanancias("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadosResultadosPerdidasGananciasConstantesFunciones.generarExcelReporteDataEstadosResultadosPerdidasGanancias("NORMAL",row,workbook,estadosresultadosperdidasganancias,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.getEstadosResultadosPerdidasGananciasDescripcion(estadosresultadosperdidasganancias));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadosResultadosPerdidasGanancias() throws Exception {		
		this.startProcessEstadosResultadosPerdidasGanancias(true);
	}
	
	public void startProcessEstadosResultadosPerdidasGanancias(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias ,this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias, this.jScrollPanelDatosEstadosResultadosPerdidasGanancias,this.jPanelPaginacionEstadosResultadosPerdidasGanancias, this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias, this.jPanelAccionesEstadosResultadosPerdidasGanancias,this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias,this.jmenuBarEstadosResultadosPerdidasGanancias,this.jmenuBarDetalleEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias=this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias; 
		
		final JPanel jPanelParametrosReportesEstadosResultadosPerdidasGanancias=this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias;
		//final JScrollPane jScrollPanelDatosEstadosResultadosPerdidasGanancias=this.jScrollPanelDatosEstadosResultadosPerdidasGanancias;
		final JTable jTableDatosEstadosResultadosPerdidasGanancias=this.jTableDatosEstadosResultadosPerdidasGanancias;		
		final JPanel jPanelPaginacionEstadosResultadosPerdidasGanancias=this.jPanelPaginacionEstadosResultadosPerdidasGanancias;
		//final JScrollPane jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias=this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias;
		final JPanel jPanelAccionesEstadosResultadosPerdidasGanancias=this.jPanelAccionesEstadosResultadosPerdidasGanancias;
		
		JPanel jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelCamposEstadosResultadosPerdidasGanancias;
			jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias;
		}
		
		final JPanel jPanelCamposEstadosResultadosPerdidasGanancias=jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias;
		final JPanel jPanelAccionesFormularioEstadosResultadosPerdidasGanancias=jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias;
		
		
		final JMenuBar jmenuBarEstadosResultadosPerdidasGanancias=this.jmenuBarEstadosResultadosPerdidasGanancias;
		final JToolBar jTtoolBarEstadosResultadosPerdidasGanancias=this.jTtoolBarEstadosResultadosPerdidasGanancias;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jmenuBarDetalleEstadosResultadosPerdidasGanancias;
			jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTtoolBarDetalleEstadosResultadosPerdidasGanancias;
		}
		
		final JMenuBar jmenuBarDetalleEstadosResultadosPerdidasGanancias=jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias;
		final JToolBar jTtoolBarDetalleEstadosResultadosPerdidasGanancias=jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadosResultadosPerdidasGanancias;
			processRunnable.jTableDatos=jTableDatosEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelCampos=jPanelCamposEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelAcciones=jPanelAccionesEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadosResultadosPerdidasGanancias;
			
			
			processRunnable.jmenuBar=jmenuBarEstadosResultadosPerdidasGanancias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadosResultadosPerdidasGanancias;
			processRunnable.jTtoolBar=jTtoolBarEstadosResultadosPerdidasGanancias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadosResultadosPerdidasGanancias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias ,jPanelParametrosReportesEstadosResultadosPerdidasGanancias,jTableDatosEstadosResultadosPerdidasGanancias, /*jScrollPanelDatosEstadosResultadosPerdidasGanancias,*/jPanelCamposEstadosResultadosPerdidasGanancias,jPanelPaginacionEstadosResultadosPerdidasGanancias, /*jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias,*/ jPanelAccionesEstadosResultadosPerdidasGanancias,jPanelAccionesFormularioEstadosResultadosPerdidasGanancias,jmenuBarEstadosResultadosPerdidasGanancias,jmenuBarDetalleEstadosResultadosPerdidasGanancias,jTtoolBarEstadosResultadosPerdidasGanancias,jTtoolBarDetalleEstadosResultadosPerdidasGanancias);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias ,jPanelParametrosReportesEstadosResultadosPerdidasGanancias, jScrollPanelDatosEstadosResultadosPerdidasGanancias,jPanelPaginacionEstadosResultadosPerdidasGanancias, jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias, jPanelAccionesEstadosResultadosPerdidasGanancias,jPanelAccionesFormularioEstadosResultadosPerdidasGanancias,jmenuBarEstadosResultadosPerdidasGanancias,jmenuBarDetalleEstadosResultadosPerdidasGanancias,jTtoolBarEstadosResultadosPerdidasGanancias,jTtoolBarDetalleEstadosResultadosPerdidasGanancias);
						
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
	
	public void finishProcessEstadosResultadosPerdidasGanancias() {// throws Exception 
		this.finishProcessEstadosResultadosPerdidasGanancias(true);
	}
	
	public void finishProcessEstadosResultadosPerdidasGanancias(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias ,this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias, this.jScrollPanelDatosEstadosResultadosPerdidasGanancias,this.jPanelPaginacionEstadosResultadosPerdidasGanancias, this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias, this.jPanelAccionesEstadosResultadosPerdidasGanancias,this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias,this.jmenuBarEstadosResultadosPerdidasGanancias,this.jmenuBarDetalleEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias=this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias; 
		
		final JPanel jPanelParametrosReportesEstadosResultadosPerdidasGanancias=this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias;
		//final JScrollPane jScrollPanelDatosEstadosResultadosPerdidasGanancias=this.jScrollPanelDatosEstadosResultadosPerdidasGanancias;
		final JTable jTableDatosEstadosResultadosPerdidasGanancias=this.jTableDatosEstadosResultadosPerdidasGanancias;		
		final JPanel jPanelPaginacionEstadosResultadosPerdidasGanancias=this.jPanelPaginacionEstadosResultadosPerdidasGanancias;
		//final JScrollPane jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias=this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias;
		final JPanel jPanelAccionesEstadosResultadosPerdidasGanancias=this.jPanelAccionesEstadosResultadosPerdidasGanancias;
		
		JPanel jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelCamposEstadosResultadosPerdidasGanancias;
			jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias;
		}
		
		final JPanel jPanelCamposEstadosResultadosPerdidasGanancias=jPanelCamposAuxiliarEstadosResultadosPerdidasGanancias;
		final JPanel jPanelAccionesFormularioEstadosResultadosPerdidasGanancias=jPanelAccionesFormularioAuxiliarEstadosResultadosPerdidasGanancias;
		
		
		final JMenuBar jmenuBarEstadosResultadosPerdidasGanancias=this.jmenuBarEstadosResultadosPerdidasGanancias;		
		final JToolBar jTtoolBarEstadosResultadosPerdidasGanancias=this.jTtoolBarEstadosResultadosPerdidasGanancias;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jmenuBarDetalleEstadosResultadosPerdidasGanancias;
			jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTtoolBarDetalleEstadosResultadosPerdidasGanancias;		
		}
		
		final JMenuBar jmenuBarDetalleEstadosResultadosPerdidasGanancias=jmenuBarDetalleAuxiliarEstadosResultadosPerdidasGanancias;
		final JToolBar jTtoolBarDetalleEstadosResultadosPerdidasGanancias=jTtoolBarDetalleAuxiliarEstadosResultadosPerdidasGanancias;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadosResultadosPerdidasGanancias;
			processRunnable.jTableDatos=jTableDatosEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelCampos=jPanelCamposEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelAcciones=jPanelAccionesEstadosResultadosPerdidasGanancias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadosResultadosPerdidasGanancias;
			
			
			processRunnable.jmenuBar=jmenuBarEstadosResultadosPerdidasGanancias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadosResultadosPerdidasGanancias;
			processRunnable.jTtoolBar=jTtoolBarEstadosResultadosPerdidasGanancias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadosResultadosPerdidasGanancias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias ,jPanelParametrosReportesEstadosResultadosPerdidasGanancias, jTableDatosEstadosResultadosPerdidasGanancias,/*jScrollPanelDatosEstadosResultadosPerdidasGanancias,*/jPanelCamposEstadosResultadosPerdidasGanancias,jPanelPaginacionEstadosResultadosPerdidasGanancias, /*jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias,*/ jPanelAccionesEstadosResultadosPerdidasGanancias,jPanelAccionesFormularioEstadosResultadosPerdidasGanancias,jmenuBarEstadosResultadosPerdidasGanancias,jmenuBarDetalleEstadosResultadosPerdidasGanancias,jTtoolBarEstadosResultadosPerdidasGanancias,jTtoolBarDetalleEstadosResultadosPerdidasGanancias));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadosResultadosPerdidasGanancias(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadosResultadosPerdidasGanancias(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadosResultadosPerdidasGanancias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadosResultadosPerdidasGanancias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadosResultadosPerdidasGanancias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadosResultadosPerdidasGanancias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadosResultadosPerdidasGanancias,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadosresultadosperdidasgananciasConstantesFunciones.getsFinalQueryEstadosResultadosPerdidasGanancias();
		String  finalQueryPaginacionTodos=this.estadosresultadosperdidasgananciasConstantesFunciones.getsFinalQueryEstadosResultadosPerdidasGanancias();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadosResultadosPerdidasGananciasConstantesFunciones.getArrayColumnasGlobalesNoEstadosResultadosPerdidasGanancias(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadosResultadosPerdidasGananciasConstantesFunciones.getArrayColumnasGlobalesEstadosResultadosPerdidasGanancias(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadosResultadosPerdidasGananciasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadosresultadosperdidasgananciassEliminados= new ArrayList<EstadosResultadosPerdidasGanancias>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadosResultadosPerdidasGanancias();
		
				///*EstadosResultadosPerdidasGananciasSessionBean*/this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			
			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
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
					this.iNumeroPaginacion=EstadosResultadosPerdidasGananciasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadosResultadosPerdidasGananciasConstantesFunciones.getClassesForeignKeysOfEstadosResultadosPerdidasGanancias(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadosresultadosperdidasganancias."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadosresultadosperdidasgananciassAux= new ArrayList<EstadosResultadosPerdidasGanancias>();
			
				
			estadosresultadosperdidasgananciasLogic.setDatosCliente(this.datosCliente);
			estadosresultadosperdidasgananciasLogic.setDatosDeep(this.datosDeep);
			estadosresultadosperdidasgananciasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias")) {
				this.sDetalleReporte=EstadosResultadosPerdidasGananciasConstantesFunciones.getDetalleIndiceBusquedaEstadosResultadosPerdidasGanancias(id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadosResultadosPerdidasGananciasConstantesFunciones.getDetalleIndiceBusquedaEstadosResultadosPerdidasGanancias(id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadosResultadosPerdidasGananciasConstantesFunciones.getDetalleIndiceBusquedaEstadosResultadosPerdidasGanancias(id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()==null||estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadosresultadosperdidasgananciass==null|| estadosresultadosperdidasgananciass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosresultadosperdidasgananciassAux=new ArrayList<EstadosResultadosPerdidasGanancias>();
						estadosresultadosperdidasgananciassAux.addAll(estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosresultadosperdidasgananciassAux=new ArrayList<EstadosResultadosPerdidasGanancias>();
							estadosresultadosperdidasgananciassAux.addAll(estadosresultadosperdidasgananciass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadosResultadosPerdidasGananciasConstantesFunciones.getDetalleIndiceBusquedaEstadosResultadosPerdidasGanancias(id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadosResultadosPerdidasGananciasConstantesFunciones.getDetalleIndiceBusquedaEstadosResultadosPerdidasGanancias(id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias,id_ejercicioBusquedaEstadosResultadosPerdidasGanancias,id_periodoBusquedaEstadosResultadosPerdidasGanancias);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadosResultadosPerdidasGananciass("BusquedaEstadosResultadosPerdidasGanancias",estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadosResultadosPerdidasGananciass("BusquedaEstadosResultadosPerdidasGanancias",estadosresultadosperdidasgananciass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosresultadosperdidasgananciasLogic.setEstadosResultadosPerdidasGananciass(new ArrayList<EstadosResultadosPerdidasGanancias>());
						estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().addAll(estadosresultadosperdidasgananciassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosresultadosperdidasgananciass=new ArrayList<EstadosResultadosPerdidasGanancias>();
							estadosresultadosperdidasgananciass.addAll(estadosresultadosperdidasgananciassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadosResultadosPerdidasGanancias();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadosResultadosPerdidasGanancias();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosresultadosperdidasgananciass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosresultadosperdidasgananciass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) {
		Boolean permite=true;
		
		if(this.estadosresultadosperdidasganancias.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadosResultadosPerdidasGananciasConstantesFunciones.getOrderByListaEstadosResultadosPerdidasGanancias();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadosResultadosPerdidasGananciasConstantesFunciones.getOrderByListaEstadosResultadosPerdidasGanancias();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				if(estadosresultadosperdidasganancias.getsType().equals(Constantes2.S_TOTALES)) {
					estadosresultadosperdidasgananciasTotales=estadosresultadosperdidasganancias;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:this.estadosresultadosperdidasgananciass) {
				if(estadosresultadosperdidasganancias.getsType().equals(Constantes2.S_TOTALES)) {
					estadosresultadosperdidasgananciasTotales=estadosresultadosperdidasganancias;
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
			this.estadosresultadosperdidasgananciasAux=new EstadosResultadosPerdidasGanancias();
			this.estadosresultadosperdidasgananciasAux.setsType(Constantes2.S_TOTALES);
			this.estadosresultadosperdidasgananciasAux.setIsNew(false);
			this.estadosresultadosperdidasgananciasAux.setIsChanged(false);
			this.estadosresultadosperdidasgananciasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EstadosResultadosPerdidasGananciasConstantesFunciones.TotalizarValoresFilaEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass(),this.estadosresultadosperdidasgananciasAux);
				
				//this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().add(this.estadosresultadosperdidasgananciasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadosResultadosPerdidasGananciasConstantesFunciones.TotalizarValoresFilaEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciass,this.estadosresultadosperdidasgananciasAux);
				
				this.estadosresultadosperdidasgananciass.add(this.estadosresultadosperdidasgananciasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadosresultadosperdidasgananciasTotales=new EstadosResultadosPerdidasGanancias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().remove(estadosresultadosperdidasgananciasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosresultadosperdidasgananciass.remove(estadosresultadosperdidasgananciasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadosresultadosperdidasgananciasTotales=new EstadosResultadosPerdidasGanancias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				if(estadosresultadosperdidasganancias.getsType().equals(Constantes2.S_TOTALES)) {
					estadosresultadosperdidasgananciasTotales=estadosresultadosperdidasganancias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadosResultadosPerdidasGananciasConstantesFunciones.TotalizarValoresFilaEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass(),estadosresultadosperdidasgananciasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:this.estadosresultadosperdidasgananciass) {
				if(estadosresultadosperdidasganancias.getsType().equals(Constantes2.S_TOTALES)) {
					estadosresultadosperdidasgananciasTotales=estadosresultadosperdidasganancias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadosResultadosPerdidasGananciasConstantesFunciones.TotalizarValoresFilaEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciass,estadosresultadosperdidasgananciasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias()throws Exception {
		try {
			sAccionBusqueda="BusquedaEstadosResultadosPerdidasGanancias";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdNivelCuenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdNivelCuenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias(String sFinalQuery,Long id_nivel_cuenta,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias(sFinalQuery,this.pagination,id_nivel_cuenta,id_ejercicio,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdNivelCuenta(String sFinalQuery,Long id_nivel_cuenta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassFK_IdNivelCuenta(sFinalQuery,this.pagination,id_nivel_cuenta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosResultadosPerdidasGananciassFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciassFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosEstadosResultadosPerdidasGanancias() {
		this.isPermisoTodoEstadosResultadosPerdidasGanancias=false;
		this.isPermisoNuevoEstadosResultadosPerdidasGanancias=false;
		this.isPermisoActualizarEstadosResultadosPerdidasGanancias=false;
		this.isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias=false;
		this.isPermisoEliminarEstadosResultadosPerdidasGanancias=false;
		this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias=false;
		this.isPermisoConsultaEstadosResultadosPerdidasGanancias=true;
		this.isPermisoBusquedaEstadosResultadosPerdidasGanancias=true;
		this.isPermisoReporteEstadosResultadosPerdidasGanancias=true;
		this.isPermisoOrdenEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoCopiarEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoVerFormEstadosResultadosPerdidasGanancias=false;		
		this.isPermisoDuplicarEstadosResultadosPerdidasGanancias=false;
		this.isPermisoOrdenEstadosResultadosPerdidasGanancias=false;
	}
	
	public void setPermisosUsuarioEstadosResultadosPerdidasGanancias(Boolean isPermiso) {
		this.isPermisoTodoEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoNuevoEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoActualizarEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoEliminarEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoConsultaEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoBusquedaEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoReporteEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoOrdenEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoCopiarEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoVerFormEstadosResultadosPerdidasGanancias=isPermiso;		
		this.isPermisoDuplicarEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoOrdenEstadosResultadosPerdidasGanancias=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadosResultadosPerdidasGanancias(Boolean isPermiso) {
		//this.isPermisoTodoEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoNuevoEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoActualizarEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoEliminarEstadosResultadosPerdidasGanancias=isPermiso;
		this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias=isPermiso;
		//this.isPermisoConsultaEstadosResultadosPerdidasGanancias=isPermiso;
		//this.isPermisoBusquedaEstadosResultadosPerdidasGanancias=isPermiso;
		//this.isPermisoReporteEstadosResultadosPerdidasGanancias=isPermiso;
		//this.isPermisoOrdenEstadosResultadosPerdidasGanancias=isPermiso;		
		//this.isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias=isPermiso;		
		//this.isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias=isPermiso;		
		//this.isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias=isPermiso;		
		//this.isPermisoCopiarEstadosResultadosPerdidasGanancias=isPermiso;		
		//this.isPermisoDuplicarEstadosResultadosPerdidasGanancias=isPermiso;
		//this.isPermisoOrdenEstadosResultadosPerdidasGanancias=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadosResultadosPerdidasGananciasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadosResultadosPerdidasGanancias(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadosResultadosPerdidasGananciasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadosResultadosPerdidasGananciasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadosResultadosPerdidasGananciasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadosResultadosPerdidasGananciasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadosResultadosPerdidasGanancias() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadosResultadosPerdidasGananciasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadosResultadosPerdidasGanancias=this.isPermisoActualizarEstadosResultadosPerdidasGanancias;
			this.isPermisoEliminarEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadosResultadosPerdidasGanancias=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadosResultadosPerdidasGanancias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.setToolTipText(this.jTableDatosEstadosResultadosPerdidasGanancias.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadosResultadosPerdidasGanancias(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadosResultadosPerdidasGanancias(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadosResultadosPerdidasGanancias() throws Exception {
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
	public void inicializarCombosForeignKeyEstadosResultadosPerdidasGananciasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.nivelcuentasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadosResultadosPerdidasGananciasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNivelCuentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyNivelCuentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.nivelcuentasForeignKey==null||this.nivelcuentasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NivelCuentaConstantesFunciones.getArrayColumnasGlobalesNivelCuenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NivelCuentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NivelCuentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosNivelCuentasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyNivelCuenta();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadosresultadosperdidasgananciasSessionBean==null) {
				this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
			}

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyNivelCuenta()throws Exception {
		try {

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionNivelCuenta()) {
				NivelCuenta nivelcuenta=new NivelCuenta();
				NivelCuentaConstantesFunciones.setNivelCuentaDescripcion(nivelcuenta,Constantes.SMENSAJE_ESCOJA_OPCION);
				nivelcuenta.setId(null);

				if(!NivelCuentaConstantesFunciones.ExisteEnLista(this.nivelcuentasForeignKey,nivelcuenta,true)) {

					this.nivelcuentasForeignKey.add(0,nivelcuenta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.estadosresultadosperdidasgananciasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadosResultadosPerdidasGanancias(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadosResultadosPerdidasGanancias()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameNivelCuentasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadosResultadosPerdidasGanancias(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNivelCuentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadosResultadosPerdidasGanancias()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean(); 
		this.estadosresultadosperdidasgananciasConstantesFunciones=new EstadosResultadosPerdidasGananciasConstantesFunciones(); 
		this.estadosresultadosperdidasgananciasBean=new EstadosResultadosPerdidasGanancias();//(this.estadosresultadosperdidasgananciasConstantesFunciones); 		
		this.estadosresultadosperdidasgananciasReturnGeneral=new EstadosResultadosPerdidasGananciasParameterReturnGeneral(); 
		
		this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosresultadosperdidasgananciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadosResultadosPerdidasGanancias(true);
			
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
			
			this.estadosresultadosperdidasgananciasConstantesFunciones=new EstadosResultadosPerdidasGananciasConstantesFunciones(); 
			this.estadosresultadosperdidasgananciasBean=new EstadosResultadosPerdidasGanancias();//this.estadosresultadosperdidasgananciasConstantesFunciones); 			
			this.estadosresultadosperdidasgananciasReturnGeneral=new EstadosResultadosPerdidasGananciasParameterReturnGeneral(); 
		
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estados Resultados Perdidas Ganancias Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.estadosresultadosperdidasganancias=new EstadosResultadosPerdidasGanancias();
			this.estadosresultadosperdidasgananciass = new ArrayList<EstadosResultadosPerdidasGanancias>();
			this.estadosresultadosperdidasgananciassAux = new ArrayList<EstadosResultadosPerdidasGanancias>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic=new EstadosResultadosPerdidasGananciasLogic();
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			//this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadosresultadosperdidasgananciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias);	
					}
					
					if(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias);
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setVisible(false);
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias);
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias);
					this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setVisible(false);
					this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias);
					this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setVisible(false);
					this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadosResultadosPerdidasGananciasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadosResultadosPerdidasGananciasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadosresultadosperdidasgananciasReturnGeneral=new EstadosResultadosPerdidasGananciasParameterReturnGeneral();
			
			this.estadosresultadosperdidasgananciasParameterGeneral=new EstadosResultadosPerdidasGananciasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadosresultadosperdidasgananciasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadosResultadosPerdidasGananciasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadosResultadosPerdidasGananciasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			
			
			this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdNivelCuenta=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadosResultadosPerdidasGanancias();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadosResultadosPerdidasGanancias(false);
			
			this.setPermisosUsuarioEstadosResultadosPerdidasGanancias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() 
				|| (this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() && this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadosResultadosPerdidasGananciasClasesRelacionadas();
			}
			
			if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadosResultadosPerdidasGananciasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadosResultadosPerdidasGanancias();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadosResultadosPerdidasGanancias();
			}
			
			if(!this.isPermisoBusquedaEstadosResultadosPerdidasGanancias) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadosResultadosPerdidasGananciasConstantesFunciones.getTiposSeleccionarEstadosResultadosPerdidasGanancias());
				
				this.tiposColumnasSelect=EstadosResultadosPerdidasGananciasConstantesFunciones.getTiposSeleccionarEstadosResultadosPerdidasGanancias(true);
				
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
			//if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadosResultadosPerdidasGanancias();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEstadosResultadosPerdidasGanancias(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEstadosResultadosPerdidasGanancias(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosResultadosPerdidasGanancias() ;
			
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
			this.nivelcuentaLogic=new NivelCuentaLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadosresultadosperdidasgananciasImplementable= (EstadosResultadosPerdidasGananciasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadosResultadosPerdidasGananciasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadosresultadosperdidasgananciasImplementableHome= (EstadosResultadosPerdidasGananciasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadosResultadosPerdidasGananciasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadosresultadosperdidasgananciass= new ArrayList<EstadosResultadosPerdidasGanancias>();
			this.estadosresultadosperdidasgananciassEliminados= new ArrayList<EstadosResultadosPerdidasGanancias>();
						
			this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
			this.esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.nivelcuentasForeignKey=new ArrayList<NivelCuenta>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadosResultadosPerdidasGanancias(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadosResultadosPerdidasGanancias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadosResultadosPerdidasGananciasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadosResultadosPerdidasGanancias();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadosResultadosPerdidasGanancias();
			}
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadosResultadosPerdidasGanancias(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadosResultadosPerdidasGanancias: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadosResultadosPerdidasGanancias() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadosResultadosPerdidasGanancias")) {
				iIndex=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadosResultadosPerdidasGanancias();	
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
	
	public void cargarCombosForeignKeyEstadosResultadosPerdidasGanancias(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadosResultadosPerdidasGanancias(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadosResultadosPerdidasGanancias(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadosResultadosPerdidasGananciasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadosResultadosPerdidasGanancias();
		
		this.cargarCombosFrameForeignKeyEstadosResultadosPerdidasGanancias();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadosResultadosPerdidasGanancias();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadosResultadosPerdidasGanancias();
		}
	}
	
	

	public void cargarCombosForeignKeyNivelCuenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNivelCuentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNivelCuenta();
				this.cargarCombosFrameNivelCuentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNivelCuenta(this.nivelcuentasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			
			if(jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>=1) {
				jTableDatosEstadosResultadosPerdidasGanancias.removeRowSelectionInterval(0, jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadosResultadosPerdidasGanancias(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(true);			
			//this.estadosresultadosperdidasganancias=new EstadosResultadosPerdidasGanancias();
			//this.estadosresultadosperdidasganancias.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias() ;
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosResultadosPerdidasGanancias(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadosresultadosperdidasganancias);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);				
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadosResultadosPerdidasGanancias: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRows().length;			
			}
			
			estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadosResultadosPerdidasGanancias--;			
				//EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux= new EstadosResultadosPerdidasGanancias();			
				//estadosresultadosperdidasgananciasAux.setId(this.iIdNuevoEstadosResultadosPerdidasGanancias);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasOrigen=new EstadosResultadosPerdidasGanancias();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasOrigen : estadosresultadosperdidasgananciassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadosresultadosperdidasgananciasOrigen =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosresultadosperdidasgananciasOrigen =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadosResultadosPerdidasGanancias();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadosresultadosperdidasganancias.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasOrigen,this.estadosresultadosperdidasganancias,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().add(this.estadosresultadosperdidasgananciasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasgananciass.add(this.estadosresultadosperdidasgananciasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(this.getIndiceNuevoEstadosResultadosPerdidasGanancias(), this.getIndiceNuevoEstadosResultadosPerdidasGanancias());
				
				int iLastRow =  this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadosResultadosPerdidasGanancias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();									
		
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasOrigen=new EstadosResultadosPerdidasGanancias();
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasDestino=new EstadosResultadosPerdidasGanancias();
				
			estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadosresultadosperdidasgananciassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosresultadosperdidasgananciasOrigen =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosresultadosperdidasgananciasOrigen =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosresultadosperdidasgananciasDestino =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosresultadosperdidasgananciasDestino =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadosresultadosperdidasgananciasOrigen =estadosresultadosperdidasgananciassSeleccionados.get(0);
				estadosresultadosperdidasgananciasDestino =estadosresultadosperdidasgananciassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasOrigen,estadosresultadosperdidasgananciasDestino,true,false);
				
				estadosresultadosperdidasgananciasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadosresultadosperdidasgananciasDestino,estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosresultadosperdidasgananciasDestino,estadosresultadosperdidasgananciass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
				
				//this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(this.getIndiceNuevoEstadosResultadosPerdidasGanancias(), this.getIndiceNuevoEstadosResultadosPerdidasGanancias());
				
				int iLastRow =  this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadosResultadosPerdidasGanancias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(!isVisible);
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(!isVisible);
			this.jPanelAccionesEstadosResultadosPerdidasGanancias.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadosResultadosPerdidasGanancias();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadosResultadosPerdidasGanancias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadosResultadosPerdidasGanancias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadosResultadosPerdidasGanancias();
			
			this.abrirFrameOrderByEstadosResultadosPerdidasGanancias();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadosResultadosPerdidasGanancias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadosResultadosPerdidasGanancias(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.isMaximum()) {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSize(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.iWidthFormulario,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.isMaximum()) {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jContentPaneDetalleEstadosResultadosPerdidasGanancias.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jContentPaneDetalleEstadosResultadosPerdidasGanancias.getWidth(),EstadosResultadosPerdidasGananciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jContentPaneDetalleEstadosResultadosPerdidasGanancias.getWidth(),EstadosResultadosPerdidasGananciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jContentPaneDetalleEstadosResultadosPerdidasGanancias.getWidth(),EstadosResultadosPerdidasGananciasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setVisible(true);
	        this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadosResultadosPerdidasGanancias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,false,this);
				} else {
					this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias);
				this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setVisible(false);
				this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setSelected(false);
				
				this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadosResultadosPerdidasGanancias"));
				
				this.inicializarActualizarBindingTablaOrderByEstadosResultadosPerdidasGanancias();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadosResultadosPerdidasGanancias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias==null) {
				
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias=new ImportacionJInternalFrame(EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias);
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setVisible(false);
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSelected(false);


				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadosResultadosPerdidasGanancias"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadosResultadosPerdidasGanancias() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias==null) {
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias=new ReporteDinamicoJInternalFrame(EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias);
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosResultadosPerdidasGanancias();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadosResultadosPerdidasGanancias() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias);
			
	       	this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setVisible(false);
	        this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.dispose();
			//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadosResultadosPerdidasGanancias() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadosResultadosPerdidasGanancias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setVisible(true);
	        this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadosResultadosPerdidasGanancias() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setVisible(true);
	        this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadosResultadosPerdidasGanancias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setVisible(false);
	        this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadosResultadosPerdidasGanancias() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadosResultadosPerdidasGanancias() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setVisible(false);
	        this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadosResultadosPerdidasGanancias(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadosResultadosPerdidasGanancias(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(true);
			//this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false) ;
			
			if(estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosResultadosPerdidasGanancias(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadosResultadosPerdidasGanancias(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(true);
			//this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadosresultadosperdidasganancias.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false) ;
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosResultadosPerdidasGanancias(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaNivelCuenta(List<NivelCuenta> nivelcuentasForeignKey)throws Exception{
		TableColumn tableColumnNivelCuenta=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA));
		TableCellEditor tableCellEditorNivelCuenta =tableColumnNivelCuenta.getCellEditor();

		NivelCuentaTableCell nivelcuentaTableCellFk=(NivelCuentaTableCell)tableCellEditorNivelCuenta;

		if(nivelcuentaTableCellFk!=null) {
			nivelcuentaTableCellFk.setnivelcuentasForeignKey(nivelcuentasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

		//if(intSelectedRow<=0) {
			//nivelcuentaTableCellFk.setRowActual(intSelectedRow);
			//nivelcuentaTableCellFk.setnivelcuentasForeignKeyActual(nivelcuentasForeignKey);
		//}


		if(nivelcuentaTableCellFk!=null) {
			nivelcuentaTableCellFk.RecargarNivelCuentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadosResultadosPerdidasGanancias(false);
			
			//if(!this.isEsNuevoEstadosResultadosPerdidasGanancias) {								
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				
			}
			
			if(this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
					this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
					this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(false);
				
				this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(false);
			
												
				
				if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadosResultadosPerdidasGanancias();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadosresultadosperdidasganancias.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				this.estadosresultadosperdidasganancias.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				this.estadosresultadosperdidasganancias.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadosResultadosPerdidasGananciasModel) this.jTableDatosEstadosResultadosPerdidasGanancias.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
				this.isEsNuevoEstadosResultadosPerdidasGanancias=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(false);
				
				this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(false);
				
				
				
				if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadosResultadosPerdidasGanancias();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>=1) {
				jTableDatosEstadosResultadosPerdidasGanancias.removeRowSelectionInterval(0, jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadosResultadosPerdidasGanancias(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(false) ;
			
			this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
			
			if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadosResultadosPerdidasGanancias();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				
				//SI ES MANUAL
				if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadosResultadosPerdidasGanancias--;			
			//EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux= new EstadosResultadosPerdidasGanancias();			
			//estadosresultadosperdidasgananciasAux.setId(this.iIdNuevoEstadosResultadosPerdidasGanancias);
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadosResultadosPerdidasGanancias();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
			
			this.estadosresultadosperdidasganancias.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().add(this.estadosresultadosperdidasgananciasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadosresultadosperdidasgananciass.add(this.estadosresultadosperdidasgananciasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			
			this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(this.getIndiceNuevoEstadosResultadosPerdidasGanancias(), this.getIndiceNuevoEstadosResultadosPerdidasGanancias());
			
			int iLastRow =  this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadosResultadosPerdidasGanancias.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadosResultadosPerdidasGanancias.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
			
			//SI ES MANUAL
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();
			}
			
			//this.abrirFrameTreeEstadosResultadosPerdidasGanancias();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setFileImportacion(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadosResultadosPerdidasGanancias.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		

		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadosResultadosPerdidasGananciasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadosResultadosPerdidasGananciasBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreNivelCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreNivelCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreNivelCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreNivelCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoInicial_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					sNombreCampoCategoria="nombre_nivel_cuenta";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL:
					sNombreCampoCategoria="debito_inicial";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL:
					sNombreCampoCategoria="credito_inicial";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL:
					sNombreCampoCategoria="saldo_inicial";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					sNombreCampoCategoriaValor="nombre_nivel_cuenta";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL:
					sNombreCampoCategoriaValor="debito_inicial";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL:
					sNombreCampoCategoriaValor="credito_inicial";
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL:
					sNombreCampoCategoriaValor="saldo_inicial";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Nivel Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_nivel_cuenta");
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_inicial");
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_inicial");
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_inicial");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadosResultadosPerdidasGananciass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getnivelcuenta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getnombre_nivel_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getdebito_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getcredito_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL);
					iRow++;

					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosresultadosperdidasganancias.getsaldo_inicial());
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
			//	this.getFilaCabeceraExportarExcelEstadosResultadosPerdidasGanancias(row);				
			//	iRow++;
			//}				
			
			//for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
			
			//SI ES MANUAL
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
			
			//SI ES MANUAL
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
			
			//SI ES MANUAL
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadosResultadosPerdidasGanancias() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadosResultadosPerdidasGanancias.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadosResultadosPerdidasGanancias.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadosResultadosPerdidasGanancias.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadosResultadosPerdidasGanancias.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadosResultadosPerdidasGanancias(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadosResultadosPerdidasGanancias(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadosResultadosPerdidasGanancias(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosResultadosPerdidasGanancias(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadosResultadosPerdidasGanancias(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadosResultadosPerdidasGanancias() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias();
		
		this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadosResultadosPerdidasGanancias();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosResultadosPerdidasGanancias() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosResultadosPerdidasGanancias(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosResultadosPerdidasGanancias(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadosResultadosPerdidasGanancias(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosResultadosPerdidasGanancias(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadosResultadosPerdidasGanancias() throws Exception {
		try	{
			if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadosResultadosPerdidasGanancias();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadosResultadosPerdidasGanancias() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadosResultadosPerdidasGanancias() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosResultadosPerdidasGanancias();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosResultadosPerdidasGanancias() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EstadosResultadosPerdidasGananciasConstantesFunciones.getTiposSeleccionarEstadosResultadosPerdidasGanancias(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EstadosResultadosPerdidasGananciasConstantesFunciones.getTiposSeleccionarEstadosResultadosPerdidasGanancias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EstadosResultadosPerdidasGananciasConstantesFunciones.getTiposSeleccionarEstadosResultadosPerdidasGanancias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadosResultadosPerdidasGanancias()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()!=null){this.id_nivel_cuentaBusquedaEstadosResultadosPerdidasGanancias=((NivelCuenta)this.jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()).getId();}
		if(this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()!=null){this.id_ejercicioBusquedaEstadosResultadosPerdidasGanancias=((Ejercicio)this.jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()!=null){this.id_periodoBusquedaEstadosResultadosPerdidasGanancias=((Periodo)this.jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadosResultadosPerdidasGanancias(Boolean esInicializar) throws Exception {				
		if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadosResultadosPerdidasGanancias();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias() throws Exception {
		this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadosResultadosPerdidasGanancias() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadosresultadosperdidasgananciass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadosResultadosPerdidasGanancias.setModel(new EstadosResultadosPerdidasGananciasModel(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadosResultadosPerdidasGanancias.setModel(new EstadosResultadosPerdidasGananciasModel(this.estadosresultadosperdidasgananciass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadosResultadosPerdidasGanancias();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,estadosresultadosperdidasgananciasConstantesFunciones.resaltarSeleccionarEstadosResultadosPerdidasGanancias,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,estadosresultadosperdidasgananciasConstantesFunciones.resaltarSeleccionarEstadosResultadosPerdidasGanancias,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostraridEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltaridEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activaridEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"idEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltaridEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activaridEstadosResultadosPerdidasGanancias,this,true,"idEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcodigoEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcodigoEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarcodigoEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"codigoEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcodigoEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarcodigoEstadosResultadosPerdidasGanancias,this,true,"codigoEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombreEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombreEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombreEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"nombreEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombreEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombreEstadosResultadosPerdidasGanancias,this,true,"nombreEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"nombre_nivel_cuentaEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,this,true,"nombre_nivel_cuentaEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrardebito_inicialEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltardebito_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activardebito_inicialEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"debito_inicialEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltardebito_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activardebito_inicialEstadosResultadosPerdidasGanancias,this,true,"debito_inicialEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcredito_inicialEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcredito_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarcredito_inicialEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"credito_inicialEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcredito_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarcredito_inicialEstadosResultadosPerdidasGanancias,this,true,"credito_inicialEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL));

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarsaldo_inicialEstadosResultadosPerdidasGanancias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarsaldo_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarsaldo_inicialEstadosResultadosPerdidasGanancias,iSizeTabla,this,true,"saldo_inicialEstadosResultadosPerdidasGanancias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarsaldo_inicialEstadosResultadosPerdidasGanancias,this.estadosresultadosperdidasgananciasConstantesFunciones.activarsaldo_inicialEstadosResultadosPerdidasGanancias,this,true,"saldo_inicialEstadosResultadosPerdidasGanancias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadosResultadosPerdidasGananciasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadosResultadosPerdidasGanancias.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadosResultadosPerdidasGanancias.addColumn(tableColumn);
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
			
			this.jTableDatosEstadosResultadosPerdidasGanancias.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadosResultadosPerdidasGanancias.moveColumn(this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadosResultadosPerdidasGanancias.moveColumn(this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadosResultadosPerdidasGanancias.moveColumn(this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadosResultadosPerdidasGanancias.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadosResultadosPerdidasGanancias,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadosResultadosPerdidasGanancias.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadosResultadosPerdidasGanancias.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadosresultadosperdidasgananciass.size()-1;
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
		//this.jTableDatosEstadosResultadosPerdidasGanancias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadosResultadosPerdidasGanancias();
			
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
				
				//this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
					
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
				if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadosresultadosperdidasganancias.getsType().equals("DUPLICADO")
				   || this.estadosresultadosperdidasganancias.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
				
				} else {
					this.isEsNuevoEstadosResultadosPerdidasGanancias=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
					if(this.estadosresultadosperdidasganancias.getId()>=0 && !this.estadosresultadosperdidasganancias.getIsNew()) {						
						this.isEsNuevoEstadosResultadosPerdidasGanancias=false;
						
					} else {
						this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadosResultadosPerdidasGanancias(esRelaciones);						
				
				this.seleccionarEstadosResultadosPerdidasGanancias(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadosresultadosperdidasganancias.getId()<0) {
					this.isEsNuevoEstadosResultadosPerdidasGanancias=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadosResultadosPerdidasGanancias(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadosResultadosPerdidasGanancias(evt,rowIndex);
				}	
				
				if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadosResultadosPerdidasGanancias: " + this.dDif); 
					}
				}								
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadosResultadosPerdidasGanancias(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {
					if(this.estadosresultadosperdidasganancias.getId()>0) {
						this.estadosresultadosperdidasganancias.setIsDeleted(true);
						
						this.estadosresultadosperdidasgananciassEliminados.add(this.estadosresultadosperdidasganancias);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().remove(this.estadosresultadosperdidasganancias);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasgananciass.remove(this.estadosresultadosperdidasganancias);				
					}
					
					
					((EstadosResultadosPerdidasGananciasModel) this.jTableDatosEstadosResultadosPerdidasGanancias.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadosResultadosPerdidasGanancias(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadosResultadosPerdidasGanancias) {
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias);
	}
	
	public void setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getId().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getcodigo());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getnombre());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getdebito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getcredito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getsaldo_inicial().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadosresultadosperdidasgananciasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadosresultadosperdidasgananciasLocal=this.estadosresultadosperdidasganancias;
			} else {
				estadosresultadosperdidasgananciasLocal=this.estadosresultadosperdidasgananciasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadosresultadosperdidasgananciasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasLocal,true);
					
					if(estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadosresultadosperdidasgananciasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadosresultadosperdidasgananciasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias);
	}
	
	public void setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(estadosresultadosperdidasganancias,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.getText()==null || this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.getText()=="" || this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setText("0");
			}

			if(conColumnasBase) {estadosresultadosperdidasganancias.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelIdEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setcodigo(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcodigoEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setnombre(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombreEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setnombre_nivel_cuenta(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setdebito_inicial(Double.parseDouble(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabeldebito_inicialEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setcredito_inicial(Double.parseDouble(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelcredito_inicialEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosresultadosperdidasganancias.setsaldo_inicial(Double.parseDouble(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasBean,EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasOrigen,EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getId()!=null && !estadosresultadosperdidasgananciasOrigen.getId().equals(0L))) {estadosresultadosperdidasganancias.setId(estadosresultadosperdidasgananciasOrigen.getId());}}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getcodigo()!=null && !estadosresultadosperdidasgananciasOrigen.getcodigo().equals(""))) {estadosresultadosperdidasganancias.setcodigo(estadosresultadosperdidasgananciasOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getnombre()!=null && !estadosresultadosperdidasgananciasOrigen.getnombre().equals(""))) {estadosresultadosperdidasganancias.setnombre(estadosresultadosperdidasgananciasOrigen.getnombre());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getnombre_nivel_cuenta()!=null && !estadosresultadosperdidasgananciasOrigen.getnombre_nivel_cuenta().equals(""))) {estadosresultadosperdidasganancias.setnombre_nivel_cuenta(estadosresultadosperdidasgananciasOrigen.getnombre_nivel_cuenta());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getdebito_inicial()!=null && !estadosresultadosperdidasgananciasOrigen.getdebito_inicial().equals(0.0))) {estadosresultadosperdidasganancias.setdebito_inicial(estadosresultadosperdidasgananciasOrigen.getdebito_inicial());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getcredito_inicial()!=null && !estadosresultadosperdidasgananciasOrigen.getcredito_inicial().equals(0.0))) {estadosresultadosperdidasganancias.setcredito_inicial(estadosresultadosperdidasgananciasOrigen.getcredito_inicial());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasOrigen.getsaldo_inicial()!=null && !estadosresultadosperdidasgananciasOrigen.getsaldo_inicial().equals(0.0))) {estadosresultadosperdidasganancias.setsaldo_inicial(estadosresultadosperdidasgananciasOrigen.getsaldo_inicial());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getId().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getcodigo());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getnombre());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getdebito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getcredito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasganancias.getsaldo_inicial().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGananciasBean estadosresultadosperdidasgananciasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getId().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getcodigo());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getnombre());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getdebito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getcredito_inicial().toString());
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setText(estadosresultadosperdidasgananciasBean.getsaldo_inicial().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGananciasParameterReturnGeneral estadosresultadosperdidasgananciasReturnGeneral,EstadosResultadosPerdidasGananciasBean estadosresultadosperdidasgananciasBean,Boolean conDefault) throws Exception { 
		try {
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal=new EstadosResultadosPerdidasGanancias();
			
			estadosresultadosperdidasgananciasLocal=estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getId()!=null && !estadosresultadosperdidasgananciasLocal.getId().equals(0L))) {estadosresultadosperdidasgananciasBean.setId(estadosresultadosperdidasgananciasLocal.getId());}}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getcodigo()!=null && !estadosresultadosperdidasgananciasLocal.getcodigo().equals(""))) {estadosresultadosperdidasgananciasBean.setcodigo(estadosresultadosperdidasgananciasLocal.getcodigo());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getnombre()!=null && !estadosresultadosperdidasgananciasLocal.getnombre().equals(""))) {estadosresultadosperdidasgananciasBean.setnombre(estadosresultadosperdidasgananciasLocal.getnombre());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getnombre_nivel_cuenta()!=null && !estadosresultadosperdidasgananciasLocal.getnombre_nivel_cuenta().equals(""))) {estadosresultadosperdidasgananciasBean.setnombre_nivel_cuenta(estadosresultadosperdidasgananciasLocal.getnombre_nivel_cuenta());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getdebito_inicial()!=null && !estadosresultadosperdidasgananciasLocal.getdebito_inicial().equals(0.0))) {estadosresultadosperdidasgananciasBean.setdebito_inicial(estadosresultadosperdidasgananciasLocal.getdebito_inicial());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getcredito_inicial()!=null && !estadosresultadosperdidasgananciasLocal.getcredito_inicial().equals(0.0))) {estadosresultadosperdidasgananciasBean.setcredito_inicial(estadosresultadosperdidasgananciasLocal.getcredito_inicial());}
			if(conDefault || (!conDefault && estadosresultadosperdidasgananciasLocal.getsaldo_inicial()!=null && !estadosresultadosperdidasgananciasLocal.getsaldo_inicial().equals(0.0))) {estadosresultadosperdidasgananciasBean.setsaldo_inicial(estadosresultadosperdidasgananciasLocal.getsaldo_inicial());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadosResultadosPerdidasGananciasGenerico(Long idEstadosResultadosPerdidasGananciasSeleccionado,JComboBox jComboBoxEstadosResultadosPerdidasGanancias,List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassLocal)throws Exception {
		try {
			EstadosResultadosPerdidasGanancias  estadosresultadosperdidasgananciasTemp=null;

			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassLocal) {
				if(estadosresultadosperdidasgananciasAux.getId()!=null && estadosresultadosperdidasgananciasAux.getId().equals(idEstadosResultadosPerdidasGananciasSeleccionado)) {
					estadosresultadosperdidasgananciasTemp=estadosresultadosperdidasgananciasAux;
					break;
				}
			}

			jComboBoxEstadosResultadosPerdidasGanancias.setSelectedItem(estadosresultadosperdidasgananciasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadosResultadosPerdidasGananciasGenerico(JComboBox jComboBoxEstadosResultadosPerdidasGanancias,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadosResultadosPerdidasGanancias.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadosResultadosPerdidasGanancias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadosResultadosPerdidasGanancias.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadosResultadosPerdidasGanancias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosresultadosperdidasganancias=(EstadosResultadosPerdidasGanancias) estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) estadosresultadosperdidasgananciass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadosresultadosperdidasganancias.getIsNew() && !estadosresultadosperdidasganancias.getIsChanged() && !estadosresultadosperdidasganancias.getIsDeleted()) {
				sDescripcion=estadosresultadosperdidasganancias.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadosresultadosperdidasganancias.getempresa_descripcion();
			}
		}

		if(sTipo.equals("NivelCuenta")) {
			//sDescripcion=this.getActualNivelCuentaForeignKeyDescripcion((Long)value);
			if(!estadosresultadosperdidasganancias.getIsNew() && !estadosresultadosperdidasganancias.getIsChanged() && !estadosresultadosperdidasganancias.getIsDeleted()) {
				sDescripcion=estadosresultadosperdidasganancias.getnivelcuenta_descripcion();
			} else {
				//sDescripcion=this.getActualNivelCuentaForeignKeyDescripcion((Long)value);
				sDescripcion=estadosresultadosperdidasganancias.getnivelcuenta_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!estadosresultadosperdidasganancias.getIsNew() && !estadosresultadosperdidasganancias.getIsChanged() && !estadosresultadosperdidasganancias.getIsDeleted()) {
				sDescripcion=estadosresultadosperdidasganancias.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=estadosresultadosperdidasganancias.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!estadosresultadosperdidasganancias.getIsNew() && !estadosresultadosperdidasganancias.getIsChanged() && !estadosresultadosperdidasganancias.getIsDeleted()) {
				sDescripcion=estadosresultadosperdidasganancias.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=estadosresultadosperdidasganancias.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasRow=new EstadosResultadosPerdidasGanancias();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosresultadosperdidasgananciasRow=(EstadosResultadosPerdidasGanancias) estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosresultadosperdidasgananciasRow=(EstadosResultadosPerdidasGanancias) estadosresultadosperdidasgananciass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));			
			this.jButtonDuplicarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias && this.isPermisoDuplicarEstadosResultadosPerdidasGanancias));			
			this.jButtonCopiarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias && this.isPermisoCopiarEstadosResultadosPerdidasGanancias));
			this.jButtonVerFormEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias && this.isPermisoVerFormEstadosResultadosPerdidasGanancias));
			
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));			
			
			this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));			
			this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias && this.isPermisoEliminarEstadosResultadosPerdidasGanancias));
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.setVisible(this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias);							
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));						
			this.jButtonDuplicarToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias && this.isPermisoDuplicarEstadosResultadosPerdidasGanancias));						
			this.jButtonCopiarToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias && this.isPermisoCopiarEstadosResultadosPerdidasGanancias));			
			this.jButtonVerFormToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias && this.isPermisoVerFormEstadosResultadosPerdidasGanancias));			
			this.jButtonAbrirOrderByToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));
			this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));			
			this.jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));			
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias  && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias && this.isPermisoEliminarEstadosResultadosPerdidasGanancias));
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias.setVisible(this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias);				
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));			
			this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias && this.isPermisoDuplicarEstadosResultadosPerdidasGanancias));			
			this.jMenuItemCopiarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias && this.isPermisoCopiarEstadosResultadosPerdidasGanancias));			
			this.jMenuItemVerFormEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias && this.isPermisoVerFormEstadosResultadosPerdidasGanancias));			
			this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));			
			//this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));
			this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));			
			//this.jMenuItemDetalleMostrarOcultarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias && this.isPermisoOrdenEstadosResultadosPerdidasGanancias));			
			this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias));			
			this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias && this.isPermisoNuevoEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));									
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemModificarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemActualizarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias && this.isPermisoActualizarEstadosResultadosPerdidasGanancias));	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemEliminarEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias && this.isPermisoEliminarEstadosResultadosPerdidasGanancias));
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemCancelarEstadosResultadosPerdidasGanancias.setVisible(this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias);				
			}
			
			this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));						
			this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=this.jButtonNuevoEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias=this.jButtonDuplicarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias=this.jButtonCopiarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias=this.jButtonVerFormEstadosResultadosPerdidasGanancias.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadosResultadosPerdidasGanancias=this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=this.jButtonModificarEstadosResultadosPerdidasGanancias.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarToolBarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=this.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemModificarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemActualizarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemEliminarEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemCancelarEstadosResultadosPerdidasGanancias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadosResultadosPerdidasGanancias(Boolean esInicializar) {
		if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
				//if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadosResultadosPerdidasGanancias();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadosResultadosPerdidasGanancias(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadosResultadosPerdidasGanancias() {
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoNuevoEstadosResultadosPerdidasGanancias);			
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoDuplicarEstadosResultadosPerdidasGanancias);			
		this.jButtonCopiarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoCopiarEstadosResultadosPerdidasGanancias);			
		this.jButtonVerFormEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoVerFormEstadosResultadosPerdidasGanancias);			
		
		this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoOrdenEstadosResultadosPerdidasGanancias);					
		
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoNuevoEstadosResultadosPerdidasGanancias);			
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoActualizarEstadosResultadosPerdidasGanancias);	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoActualizarEstadosResultadosPerdidasGanancias);	
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoEliminarEstadosResultadosPerdidasGanancias);
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.setVisible(this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias);						
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias);							
		}
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoActualizarEstadosResultadosPerdidasGanancias);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadosResultadosPerdidasGanancias() {
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoActualizarEstadosResultadosPerdidasGanancias);	
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoActualizarEstadosResultadosPerdidasGanancias);	
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.setVisible(this.isPermisoEliminarEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.setVisible(this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias);							
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.setVisible((this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias && this.isPermisoGuardarCambiosEstadosResultadosPerdidasGanancias));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadosResultadosPerdidasGanancias() {
		if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadosResultadosPerdidasGanancias();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadosResultadosPerdidasGanancias() {
	}
	
	public void jTableDatosEstadosResultadosPerdidasGananciasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadosResultadosPerdidasGanancias(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadosresultadosperdidasganancias.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadosResultadosPerdidasGananciasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadosResultadosPerdidasGanancias(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadosresultadosperdidasgananciasLogic.getConnexion());

				if(this.estadosresultadosperdidasganancias.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadosresultadosperdidasganancias.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosResultadosPerdidasGanancias=(TitledBorder)this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadosResultadosPerdidasGanancias.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadosresultadosperdidasganancias.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonivelcuenta=true;

			idTienePermisonivelcuenta=this.tienePermisosUsuarioEnPaginaWebEstadosResultadosPerdidasGanancias(NivelCuentaConstantesFunciones.CLASSNAME);

			if(idTienePermisonivelcuenta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);

				this.nivelcuentaBeanSwingJInternalFrame=new NivelCuentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.nivelcuentaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.nivelcuentaBeanSwingJInternalFrame.getNivelCuentaLogic().setConnexion(this.estadosresultadosperdidasgananciasLogic.getConnexion());

				if(this.estadosresultadosperdidasganancias.getid_nivel_cuenta()!=null) {
					this.nivelcuentaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.nivelcuentaBeanSwingJInternalFrame.setIdActual(this.estadosresultadosperdidasganancias.getid_nivel_cuenta());
					this.nivelcuentaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.nivelcuentaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.nivelcuentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNivelCuenta();
				}

				JInternalFrameBase jinternalFrame =this.nivelcuentaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosResultadosPerdidasGanancias=(TitledBorder)this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.getBorder();
				TitledBorder titledBordernivelcuenta=(TitledBorder)this.nivelcuentaBeanSwingJInternalFrame.jScrollPanelDatosNivelCuenta.getBorder();

				titledBordernivelcuenta.setTitle(titledBorderEstadosResultadosPerdidasGanancias.getTitle() + " -> NIVELCUENTA");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getid_nivel_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_nivel_cuenta = "+this.estadosresultadosperdidasganancias.getid_nivel_cuenta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebEstadosResultadosPerdidasGanancias(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.estadosresultadosperdidasgananciasLogic.getConnexion());

				if(this.estadosresultadosperdidasganancias.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.estadosresultadosperdidasganancias.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosResultadosPerdidasGanancias=(TitledBorder)this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderEstadosResultadosPerdidasGanancias.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.estadosresultadosperdidasganancias.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoEstadosResultadosPerdidasGananciasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebEstadosResultadosPerdidasGanancias(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.estadosresultadosperdidasgananciasLogic.getConnexion());

				if(this.estadosresultadosperdidasganancias.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.estadosresultadosperdidasganancias.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosResultadosPerdidasGanancias=(TitledBorder)this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderEstadosResultadosPerdidasGanancias.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.estadosresultadosperdidasganancias.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadosresultadosperdidasganancias.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadosresultadosperdidasganancias.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getnombre_nivel_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_nivel_cuenta like '%"+this.estadosresultadosperdidasganancias.getnombre_nivel_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getdebito_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_inicial = "+this.estadosresultadosperdidasganancias.getdebito_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getcredito_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_inicial = "+this.estadosresultadosperdidasganancias.getcredito_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.getestadosresultadosperdidasganancias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosresultadosperdidasganancias==null) {
						this.estadosresultadosperdidasganancias = new EstadosResultadosPerdidasGanancias();
					}

					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);
				}

				if(this.estadosresultadosperdidasganancias.getsaldo_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_inicial = "+this.estadosresultadosperdidasganancias.getsaldo_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);

			this.getEstadosResultadosPerdidasGananciassBusquedaEstadosResultadosPerdidasGanancias();

			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);

			//if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);

			this.getEstadosResultadosPerdidasGananciassFK_IdEjercicio();

			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);

			//if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);

			this.getEstadosResultadosPerdidasGananciassFK_IdEmpresa();

			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);

			//if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNivelCuentaEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);

			this.getEstadosResultadosPerdidasGananciassFK_IdNivelCuenta();

			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);

			//if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoEstadosResultadosPerdidasGananciasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);

			this.getEstadosResultadosPerdidasGananciassFK_IdPeriodo();

			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);

			//if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosresultadosperdidasgananciasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadosResultadosPerdidasGanancias() {
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.dispose();
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.dispose();
			this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias=null;
		}
		
		if(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias!=null) {
			this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setVisible(false);	    			
			this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.dispose();
			this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadosResultadosPerdidasGanancias();
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadosResultadosPerdidasGanancias")) {
				jButtonDuplicarEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadosResultadosPerdidasGanancias")) {
				jButtonCopiarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadosResultadosPerdidasGanancias")) {
				jButtonVerFormEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonDuplicarEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadosResultadosPerdidasGanancias")) {
				jButtonDuplicarEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadosResultadosPerdidasGanancias")) {
				jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadosResultadosPerdidasGanancias")) {
				jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadosResultadosPerdidasGanancias")) {
				jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadosResultadosPerdidasGanancias")) {
				jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadosResultadosPerdidasGanancias")) {
				jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadosResultadosPerdidasGanancias")) {
				jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadosResultadosPerdidasGanancias")) {
				jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadosResultadosPerdidasGanancias")) {
				jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonMostrarOcultarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadosResultadosPerdidasGanancias")) {
				jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonCopiarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonVerFormEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadosResultadosPerdidasGanancias")) {
				jButtonCopiarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadosResultadosPerdidasGanancias")) {
				jButtonVerFormEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadosResultadosPerdidasGanancias")) {
				jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadosResultadosPerdidasGanancias")) {
				jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadosResultadosPerdidasGanancias")) {
				jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadosResultadosPerdidasGanancias")) {
				jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadosResultadosPerdidasGanancias")) {
				jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadosResultadosPerdidasGanancias")) {
				jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadosResultadosPerdidasGanancias") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias")) {
				jButtonAbrirOrderByEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadosResultadosPerdidasGanancias") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadosResultadosPerdidasGanancias")) {
				jButtonMostrarOcultarEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadosResultadosPerdidasGanancias")) {
				jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias")) {
				
				jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadosResultadosPerdidasGanancias")) {
				
				jButtonGenerarImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadosResultadosPerdidasGanancias")) {
				
				jButtonAbrirImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadosResultadosPerdidasGanancias")) {
				jComboBoxTiposAccionesEstadosResultadosPerdidasGananciasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadosResultadosPerdidasGanancias")) {
				jComboBoxTiposRelacionesEstadosResultadosPerdidasGananciasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadosResultadosPerdidasGanancias")) {
				jComboBoxTiposAccionesEstadosResultadosPerdidasGananciasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadosResultadosPerdidasGanancias")) {
				
				jComboBoxTiposSeleccionarEstadosResultadosPerdidasGananciasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadosResultadosPerdidasGanancias")) {
				jTextFieldValorCampoGeneralEstadosResultadosPerdidasGananciasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadosResultadosPerdidasGanancias")) {
				jButtonAbrirOrderByEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadosResultadosPerdidasGanancias")) {
				jButtonAbrirOrderByEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarOrderByEstadosResultadosPerdidasGananciasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonidEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtoncodigoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonnombreEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias")) {
				this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasActionPerformed(evt);
			}
			
			;
			
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadosResultadosPerdidasGanancias();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadosresultadosperdidasgananciasLocal=this.estadosresultadosperdidasganancias;
			} else {
				estadosresultadosperdidasgananciasLocal=this.estadosresultadosperdidasgananciasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
							
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
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
			
			


			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
								
						
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
								
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
							
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
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
			
			


			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
								
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadosResultadosPerdidasGanancias")) {
					jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGananciasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadosResultadosPerdidasGanancias")) {
					jCheckBoxSeleccionadosEstadosResultadosPerdidasGananciasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadosResultadosPerdidasGanancias")) {
					
				}
				
				


				
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
												
				
				


				
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
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
			
			


			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosresultadosperdidasganancias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosresultadosperdidasganancias);
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
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
				
				


				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosResultadosPerdidasGanancias.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosResultadosPerdidasGanancias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosResultadosPerdidasGananciasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosresultadosperdidasgananciasAnterior =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadosResultadosPerdidasGanancias")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadosResultadosPerdidasGananciasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadosresultadosperdidasganancias =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadosresultadosperdidasganancias);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadosResultadosPerdidasGanancias")) {
				
				}
				
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadosResultadosPerdidasGanancias")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadosResultadosPerdidasGanancias")) {
			
			}
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadosResultadosPerdidasGanancias();
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			if(sTipo.equals("NuevoEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadosResultadosPerdidasGanancias")) {
				jButtonDuplicarEstadosResultadosPerdidasGananciasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadosResultadosPerdidasGanancias")) {
				jButtonCopiarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadosResultadosPerdidasGanancias")) {
				jButtonVerFormEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadosResultadosPerdidasGanancias")) {
				jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadosResultadosPerdidasGanancias")) {
				jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadosResultadosPerdidasGanancias")) {
				jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadosResultadosPerdidasGanancias")) {
				jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadosResultadosPerdidasGanancias")) {
				jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadosResultadosPerdidasGanancias")) {
				jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadosResultadosPerdidasGanancias")) {
				jButtonAbrirOrderByEstadosResultadosPerdidasGananciasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadosResultadosPerdidasGanancias")) {
				jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadosResultadosPerdidasGanancias")) {
				jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadosResultadosPerdidasGanancias")) {
				jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonidEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEstadosResultadosPerdidasGananciasUpdate")) {
				this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtoncodigoEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonnombreEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_inicialEstadosResultadosPerdidasGananciasBusqueda")) {
				this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusquedaActionPerformed(evt);
			}
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadosResultadosPerdidasGanancias();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadosResultadosPerdidasGanancias")) {
				closingInternalFrameEstadosResultadosPerdidasGanancias();
				
			} else if(sTipo.equals("jButtonCancelarEstadosResultadosPerdidasGanancias")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias = (JInternalFrameBase)evt.getSource();
	            	
	            EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame jInternalFrameParent=(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(null);
			}
			
			EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosresultadosperdidasganancias,new Object(),this.estadosresultadosperdidasgananciasParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadosResultadosPerdidasGanancias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadosResultadosPerdidasGanancias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadosResultadosPerdidasGanancias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {
			if(!esControlTabla) {
				if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);			
				}
				
				if(this.estadosresultadosperdidasgananciasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral,this.estadosresultadosperdidasgananciasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadosresultadosperdidasgananciasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadosResultadosPerdidasGanancias(classes,this.estadosresultadosperdidasgananciasReturnGeneral,this.estadosresultadosperdidasgananciasBean,false);
					}
						
					if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias());	
					}
						
					if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias(),classes);//this.estadosresultadosperdidasgananciasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,classes);//this.estadosresultadosperdidasgananciasBean);									
				}
			
				if(EstadosResultadosPerdidasGananciasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosResultadosPerdidasGanancias(this.estadosresultadosperdidasganancias);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadosresultadosperdidasgananciasAnterior!=null) {
						this.estadosresultadosperdidasganancias=this.estadosresultadosperdidasgananciasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadosresultadosperdidasgananciasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias(),estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGanancias(),this.estadosresultadosperdidasgananciass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadosResultadosPerdidasGanancias.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadosResultadosPerdidasGanancias.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadosResultadosPerdidasGanancias();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadosResultadosPerdidasGanancias() throws Exception {
		
		EstadosResultadosPerdidasGananciasModel estadosresultadosperdidasgananciasModel=(EstadosResultadosPerdidasGananciasModel)this.jTableDatosEstadosResultadosPerdidasGanancias.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosresultadosperdidasgananciasModel.estadosresultadosperdidasgananciass=this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadosresultadosperdidasgananciasModel.estadosresultadosperdidasgananciass=this.estadosresultadosperdidasgananciass;
		}
		
		
		((EstadosResultadosPerdidasGananciasModel) this.jTableDatosEstadosResultadosPerdidasGanancias.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadosResultadosPerdidasGanancias() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadosresultadosperdidasgananciasAnterior(),this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadosresultadosperdidasgananciasAnterior(),this.estadosresultadosperdidasgananciass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadosResultadosPerdidasGanancias();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
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
										
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosresultadosperdidasganancias,new Object(),generalEntityParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadosResultadosPerdidasGananciasConstantesFunciones.getClassesRelationshipsOfEstadosResultadosPerdidasGanancias(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadosResultadosPerdidasGananciasConstantesFunciones.getClassesRelationshipsFromStringsOfEstadosResultadosPerdidasGanancias(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadosResultadosPerdidasGanancias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosresultadosperdidasganancias,new Object(),generalEntityParameterGeneral,this.estadosresultadosperdidasgananciasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGananciasBean estadosresultadosperdidasgananciasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadosResultadosPerdidasGanancias(ArrayList<Classe> classes,EstadosResultadosPerdidasGananciasReturnGeneral estadosresultadosperdidasgananciasReturnGeneral,EstadosResultadosPerdidasGananciasBean estadosresultadosperdidasgananciasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias = new EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(jDesktopPane,this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones(),this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setVisible(false);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.estadosresultadosperdidasgananciasLogic=this.estadosresultadosperdidasgananciasLogic;
		
		this.cargarCombosFrameForeignKeyEstadosResultadosPerdidasGanancias("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadosResultadosPerdidasGanancias();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadosResultadosPerdidasGanancias();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadosResultadosPerdidasGanancias("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadosResultadosPerdidasGanancias();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadosResultadosPerdidasGanancias"));
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ModificarEstadosResultadosPerdidasGanancias"));

		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadosResultadosPerdidasGanancias"));
					
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemModificarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"ActualizarEstadosResultadosPerdidasGanancias"));
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadosResultadosPerdidasGanancias"));
						
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemActualizarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"EliminarEstadosResultadosPerdidasGanancias"));
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadosResultadosPerdidasGanancias"));
								
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemEliminarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CancelarEstadosResultadosPerdidasGanancias"));
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadosResultadosPerdidasGanancias"));
					
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemCancelarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadosResultadosPerdidasGanancias"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosResultadosPerdidasGanancias"));
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosResultadosPerdidasGanancias"));
		
		
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadosResultadosPerdidasGanancias"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonidEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"debito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"credito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadosResultadosPerdidasGanancias"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadosResultadosPerdidasGanancias"));
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadosResultadosPerdidasGanancias"));
		}
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadosResultadosPerdidasGanancias"));
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadosResultadosPerdidasGanancias"));
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"NuevoEstadosResultadosPerdidasGanancias"));
		
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"DuplicarEstadosResultadosPerdidasGanancias"));
		
		this.jButtonCopiarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"CopiarEstadosResultadosPerdidasGanancias"));
		
		this.jButtonVerFormEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"VerFormEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jButtonDuplicarToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadosResultadosPerdidasGanancias"));		
		
		
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias"));		
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ModificarEstadosResultadosPerdidasGanancias"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonModificarToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadosResultadosPerdidasGanancias"));
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemModificarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadosResultadosPerdidasGanancias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"ActualizarEstadosResultadosPerdidasGanancias"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadosResultadosPerdidasGanancias"));
				
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemActualizarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadosResultadosPerdidasGanancias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"EliminarEstadosResultadosPerdidasGanancias"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadosResultadosPerdidasGanancias"));
						
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemEliminarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadosResultadosPerdidasGanancias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CancelarEstadosResultadosPerdidasGanancias"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadosResultadosPerdidasGanancias"));
			
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemCancelarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadosResultadosPerdidasGanancias"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadosResultadosPerdidasGanancias"));		
		
		
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CerrarEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonCerrarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadosResultadosPerdidasGanancias"));
			
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadosResultadosPerdidasGanancias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadosResultadosPerdidasGanancias"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosResultadosPerdidasGanancias"));
		}
		
		this.jButtonCopiarToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jButtonVerFormToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadosResultadosPerdidasGanancias"));
		
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemCopiarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadosResultadosPerdidasGanancias"));		
		
		this.jMenuItemVerFormEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadosResultadosPerdidasGanancias"));		
		
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadosResultadosPerdidasGanancias"));
					
		this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadosResultadosPerdidasGanancias"));
		
		this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadosResultadosPerdidasGanancias"));		
		
		
		
		this.jButtonAnterioresEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"AnterioresEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonAnterioresToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadosResultadosPerdidasGanancias"));
		
		this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadosResultadosPerdidasGanancias"));		
		
		
		this.jButtonSiguientesEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"SiguientesEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonSiguientesToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadosResultadosPerdidasGanancias"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadosResultadosPerdidasGanancias"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias"));
			
		this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadosResultadosPerdidasGanancias"));

		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadosResultadosPerdidasGanancias"));
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadosResultadosPerdidasGanancias"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadosResultadosPerdidasGanancias"));
			
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadosResultadosPerdidasGanancias"));
					
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadosResultadosPerdidasGanancias"));
			
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadosResultadosPerdidasGanancias"));		
		
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonidEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"debito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"credito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"BusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosResultadosPerdidasGanancias"));				
			//this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosResultadosPerdidasGanancias"));
			//this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadosResultadosPerdidasGanancias"));
				this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadosResultadosPerdidasGanancias"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadosResultadosPerdidasGanancias"));
			
			this.jButtonAbrirOrderByToolBarEstadosResultadosPerdidasGanancias.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadosResultadosPerdidasGanancias"));			
			
			if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias!=null) {
				this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadosResultadosPerdidasGanancias"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadosResultadosPerdidasGanancias"));
		
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
            		closingInternalFrameEstadosResultadosPerdidasGanancias();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias = (JInternalFrameBase)event.getSource();
	            	
	            EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame jInternalFrameParent=(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadosResultadosPerdidasGananciasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadosResultadosPerdidasGananciasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonModificarEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonActualizarEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonEliminarEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCancelarEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCerrarEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadosResultadosPerdidasGanancias";
		inputMap = this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGananciasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadosResultadosPerdidasGananciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadosResultadosPerdidasGananciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadosResultadosPerdidasGananciasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonidEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosResultadosPerdidasGananciasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"debito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"credito_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.addActionListener(new ButtonActionListener(this,"saldo_inicialEstadosResultadosPerdidasGananciasBusqueda"));
		
		
		this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.addActionListener(new ButtonActionListener(this,"BusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadosResultadosPerdidasGananciasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadosResultadosPerdidasGananciasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadosResultadosPerdidasGanancias(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
					estadosresultadosperdidasgananciasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciass) {
					estadosresultadosperdidasgananciasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGananciasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
						estadosresultadosperdidasgananciasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciass) {
						estadosresultadosperdidasgananciasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadosResultadosPerdidasGanancias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadosResultadosPerdidasGananciasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadosResultadosPerdidasGanancias.getSelectedRows();
			
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasLocal=new EstadosResultadosPerdidasGanancias();
			
			//this.seleccionarTodosEstadosResultadosPerdidasGanancias(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosresultadosperdidasgananciasLocal =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadosresultadosperdidasgananciasLocal =(EstadosResultadosPerdidasGanancias) this.estadosresultadosperdidasgananciass.toArray()[this.jTableDatosEstadosResultadosPerdidasGanancias.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadosresultadosperdidasgananciasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
						estadosresultadosperdidasgananciasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciass) {
						estadosresultadosperdidasgananciasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadosResultadosPerdidasGanancias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadosResultadosPerdidasGanancias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadosResultadosPerdidasGanancias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadosResultadosPerdidasGananciasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadosResultadosPerdidasGananciasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadosResultadosPerdidasGananciasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
				
						if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setnombre_nivel_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setdebito_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setcredito_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setsaldo_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciass) {
					
						if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setnombre_nivel_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setdebito_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setcredito_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL)) {
							existe=true;
							estadosresultadosperdidasgananciasAux.setsaldo_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadosResultadosPerdidasGananciasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadosResultadosPerdidasGanancias) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadosResultadosPerdidasGanancias(conSplash);
				
					this.generarReporteEstadosResultadosPerdidasGananciassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadosResultadosPerdidasGananciassSeleccionados();
				//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadosResultadosPerdidasGananciassSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadosResultadosPerdidasGananciassSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadosResultadosPerdidasGanancias();
				
				this.exportarEstadosResultadosPerdidasGananciassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadosResultadosPerdidasGananciass();
				//this.importarEstadosResultadosPerdidasGananciass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadosResultadosPerdidasGanancias();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadosResultadosPerdidasGananciassSeleccionados();
				//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estados Resultados Perdidas Ganancias", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadosResultadosPerdidasGanancias();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadosResultadosPerdidasGanancias)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadosResultadosPerdidasGanancias(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadosResultadosPerdidasGanancias) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadosResultadosPerdidasGanancias(conSplash);
					
						//this.actualizarParametrosGeneralEstadosResultadosPerdidasGanancias();
						
						this.generarReporteProcesoAccionEstadosResultadosPerdidasGananciassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estados Resultados Perdidas GananciasES SELECCIONADOS?", "MANTENIMIENTO DE Estados Resultados Perdidas Ganancias", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadosResultadosPerdidasGanancias();
				
						this.actualizarParametrosGeneralEstadosResultadosPerdidasGanancias();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadosresultadosperdidasgananciasReturnGeneral=estadosresultadosperdidasgananciasLogic.procesarAccionEstadosResultadosPerdidasGananciassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass(),this.estadosresultadosperdidasgananciasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadosResultadosPerdidasGananciasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadosResultadosPerdidasGanancias();
					
					EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadosResultadosPerdidasGananciasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadosResultadosPerdidasGanancias(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadosResultadosPerdidasGananciasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadosResultadosPerdidasGanancias();
			
			if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
			EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias=new EstadosResultadosPerdidasGanancias();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.getSelectedItem();
			
			
			
			
			estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadosresultadosperdidasgananciassSeleccionados.size()==1) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
					estadosresultadosperdidasganancias=estadosresultadosperdidasgananciasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadosResultadosPerdidasGanancias();
			
      		//this.finishProcessEstadosResultadosPerdidasGanancias(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadosResultadosPerdidasGananciasReturnGeneral() throws Exception {
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadosresultadosperdidasgananciasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadosresultadosperdidasgananciasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadosresultadosperdidasgananciasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
		}
		
		if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRetornoLista() || this.estadosresultadosperdidasgananciasReturnGeneral.getConRetornoObjeto()) {
			if(this.estadosresultadosperdidasgananciasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadosresultadosperdidasgananciasLogic.setEstadosResultadosPerdidasGananciass(this.estadosresultadosperdidasgananciasReturnGeneral.getEstadosResultadosPerdidasGananciass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEstadosResultadosPerdidasGanancias(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadosResultadosPerdidasGanancias() throws Exception {
		
		
	}
	
	public ArrayList<EstadosResultadosPerdidasGanancias> getEstadosResultadosPerdidasGananciassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadosResultadosPerdidasGanancias) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass()) {
					if(estadosresultadosperdidasgananciasAux.getIsSelected()) {
						estadosresultadosperdidasgananciassSeleccionados.add(estadosresultadosperdidasgananciasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:this.estadosresultadosperdidasgananciass) {
					if(estadosresultadosperdidasgananciasAux.getIsSelected()) {
						estadosresultadosperdidasgananciassSeleccionados.add(estadosresultadosperdidasgananciasAux);				
					}
				}
			}
			
			if(estadosresultadosperdidasgananciassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadosresultadosperdidasgananciassSeleccionados.addAll(this.estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadosresultadosperdidasgananciassSeleccionados.addAll(this.estadosresultadosperdidasgananciass);				
					}
				}
			}
		} else {
			estadosresultadosperdidasgananciassSeleccionados.add(this.estadosresultadosperdidasganancias);
		}
		
		return estadosresultadosperdidasgananciassSeleccionados;
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
	
	public void generarReporteEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadosResultadosPerdidasGananciassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadosResultadosPerdidasGananciassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadosResultadosPerdidasGananciassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadosResultadosPerdidasGananciassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estados Resultados Perdidas Ganancias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadosResultadosPerdidasGananciassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadosResultadosPerdidasGanancias();
		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadosResultadosPerdidasGanancias();
		
		
		//this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados ,estadosresultadosperdidasgananciasImplementable,estadosresultadosperdidasgananciasImplementableHome);
	}
	
	public void mostrarImportacionEstadosResultadosPerdidasGananciass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadosResultadosPerdidasGanancias();
		
		this.abrirFrameImportacionEstadosResultadosPerdidasGanancias();		
		
			
		//this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados ,estadosresultadosperdidasgananciasImplementable,estadosresultadosperdidasgananciasImplementableHome);
	}
	
	public void importarEstadosResultadosPerdidasGananciass() throws Exception {		
	
	}
	
	public void exportarEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadosResultadosPerdidasGananciassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadosResultadosPerdidasGananciassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadosResultadosPerdidasGananciassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estados Resultados Perdidas Ganancias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadosResultadosPerdidasGanancias(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadosresultadosperdidasgananciasAux.setsDetalleGeneralEntityReporte(estadosresultadosperdidasgananciasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadosResultadosPerdidasGanancias(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadosresultadosperdidasganancias.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getnivelcuenta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getnombre_nivel_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getdebito_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getcredito_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosresultadosperdidasganancias.getsaldo_inicial().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadosResultadosPerdidasGananciass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadosResultadosPerdidasGanancias(row);				
				iRow++;
			}				
			
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadosResultadosPerdidasGananciassSeleccionados() throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();		
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosresultadosperdidasganancias.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadosresultadosperdidasgananciass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadosresultadosperdidasganancias");
			//elementRoot.appendChild(element);
		
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
				element = document.createElement("estadosresultadosperdidasganancias");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Resultados Perdidas Ganancias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadosResultadosPerdidasGanancias(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getnivelcuenta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getnombre_nivel_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getdebito_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getcredito_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosresultadosperdidasganancias.getsaldo_inicial());				
	}
	
	public void setFilaDatosExportarXmlEstadosResultadosPerdidasGanancias(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnivelcuenta_descripcion = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.IDNIVELCUENTA);
		elementnivelcuenta_descripcion.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getnivelcuenta_descripcion()));
		element.appendChild(elementnivelcuenta_descripcion);

		Element elementejercicio_descripcion = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcodigo = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_nivel_cuenta = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.NOMBRENIVELCUENTA);
		elementnombre_nivel_cuenta.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getnombre_nivel_cuenta().trim()));
		element.appendChild(elementnombre_nivel_cuenta);

		Element elementdebito_inicial = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.DEBITOINICIAL);
		elementdebito_inicial.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getdebito_inicial().toString().trim()));
		element.appendChild(elementdebito_inicial);

		Element elementcredito_inicial = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.CREDITOINICIAL);
		elementcredito_inicial.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getcredito_inicial().toString().trim()));
		element.appendChild(elementcredito_inicial);

		Element elementsaldo_inicial = document.createElement(EstadosResultadosPerdidasGananciasConstantesFunciones.SALDOINICIAL);
		elementsaldo_inicial.appendChild(document.createTextNode(estadosresultadosperdidasganancias.getsaldo_inicial().toString().trim()));
		element.appendChild(elementsaldo_inicial);
	}
	
	public void generarReporteGroupGenericoEstadosResultadosPerdidasGananciassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados=new ArrayList<EstadosResultadosPerdidasGanancias>();
		
		estadosresultadosperdidasgananciassSeleccionados=this.getEstadosResultadosPerdidasGananciassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadosResultadosPerdidasGanancias(estadosresultadosperdidasgananciassSeleccionados);
		
		this.generarReporteEstadosResultadosPerdidasGananciass("Todos",estadosresultadosperdidasgananciassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadosResultadosPerdidasGanancias(ArrayList<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasgananciasAux:estadosresultadosperdidasgananciassSeleccionados) {
				estadosresultadosperdidasgananciasAux.setsDetalleGeneralEntityReporte(estadosresultadosperdidasgananciasAux.toString());
			
				if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getnivelcuenta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
					existe=true;
					estadosresultadosperdidasgananciasAux.setsDescripcionGeneralEntityReporte1(estadosresultadosperdidasgananciasAux.getnombre_nivel_cuenta());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadosResultadosPerdidasGanancias(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=true;
				this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=true;
			}
			
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=true;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=true;
		} else {
			this.actualizarEstadoPanelsEstadosResultadosPerdidasGanancias(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadosResultadosPerdidasGanancias=false;
			//this.isVisibilidadCeldaVerFormEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaDuplicarEstadosResultadosPerdidasGanancias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			if(!estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;												
			}
			
			this.jButtonCerrarEstadosResultadosPerdidasGanancias.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
		}
		
		if(!this.permiteMantenimiento(this.estadosresultadosperdidasganancias)) {
			this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
			this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEstadosResultadosPerdidasGanancias=false;
		this.isVisibilidadCeldaNuevoRelacionesEstadosResultadosPerdidasGanancias=false;
		this.isVisibilidadCeldaGuardarCambiosEstadosResultadosPerdidasGanancias=false;
		//this.isVisibilidadCeldaModificarEstadosResultadosPerdidasGanancias=true;
		this.isVisibilidadCeldaActualizarEstadosResultadosPerdidasGanancias=false;
		this.isVisibilidadCeldaEliminarEstadosResultadosPerdidasGanancias=false;
		//this.isVisibilidadCeldaCancelarEstadosResultadosPerdidasGanancias=true;			
		this.isVisibilidadCeldaGuardarEstadosResultadosPerdidasGanancias=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadosResultadosPerdidasGanancias() {
	}
	
	public void actualizarEstadoPanelsEstadosResultadosPerdidasGanancias(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias!=null) {
				this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
					this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias!=null) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias!=null) {
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias) {this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.remove(jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);}
		}
		
	}

	public void setVisibilidadBusquedasParaNivelCuenta(Boolean isParaNivelCuenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNivelCuentaNegation=!isParaNivelCuenta;

			this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=isParaNivelCuenta;
			if(!this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias) {this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.remove(jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=isParaEjercicio;
			if(!this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias) {this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.remove(jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias=isParaPeriodo;
			if(!this.isVisibilidadBusquedaEstadosResultadosPerdidasGanancias) {this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.remove(jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);}
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
			
			this.inicializarActualizarBindingTablaEstadosResultadosPerdidasGanancias(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadosResultadosPerdidasGanancias() {
		this.updateBorderResaltarBusquedasFormularioEstadosResultadosPerdidasGanancias();
		this.updateVisibilidadBusquedasFormularioEstadosResultadosPerdidasGanancias();
		this.updateHabilitarBusquedasFormularioEstadosResultadosPerdidasGanancias();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadosResultadosPerdidasGanancias() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponents().length>0) {
	

		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias!=null) {
			index= this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.indexOfComponent(this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponent(index);
				jPanel.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadosResultadosPerdidasGanancias() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.indexOfComponent(this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			if(!this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias && index>-1) {
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadosResultadosPerdidasGanancias() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.indexOfComponent(this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
				this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setEnabledAt(index,this.estadosresultadosperdidasgananciasConstantesFunciones.activarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadosResultadosPerdidasGanancias(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEstadosResultadosPerdidasGanancias")) {
			index= this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.indexOfComponent(this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);

			this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.getComponent(index);

			this.estadosresultadosperdidasgananciasConstantesFunciones.setResaltarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias(resaltar);

			jPanel.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadosResultadosPerdidasGanancias() throws Exception {

		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadosResultadosPerdidasGanancias();
		this.updateVisibilidadResaltarControlesFormularioEstadosResultadosPerdidasGanancias();
		this.updateHabilitarResaltarControlesFormularioEstadosResultadosPerdidasGanancias();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadosResultadosPerdidasGanancias() throws Exception {
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltaridEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltaridEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_empresaEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_empresaEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_nivel_cuentaEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_nivel_cuentaEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_ejercicioEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_ejercicioEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_periodoEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarid_periodoEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcodigoEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcodigoEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombreEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombreEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltardebito_inicialEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltardebito_inicialEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcredito_inicialEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarcredito_inicialEstadosResultadosPerdidasGanancias);}
		if(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarsaldo_inicialEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setBorder(this.estadosresultadosperdidasgananciasConstantesFunciones.resaltarsaldo_inicialEstadosResultadosPerdidasGanancias);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadosResultadosPerdidasGanancias() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
	
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostraridEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelidEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostraridEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_empresaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelid_empresaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_empresaEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_nivel_cuentaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_nivel_cuentaEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_ejercicioEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_ejercicioEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_periodoEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelid_periodoEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarid_periodoEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcodigoEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelcodigoEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcodigoEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombreEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelnombreEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombreEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrardebito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrardebito_inicialEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcredito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarcredito_inicialEstadosResultadosPerdidasGanancias);
		//this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarsaldo_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.setVisible(this.estadosresultadosperdidasgananciasConstantesFunciones.mostrarsaldo_inicialEstadosResultadosPerdidasGanancias);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadosResultadosPerdidasGanancias() throws Exception {
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias!=null) {
	
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jLabelidEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activaridEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_empresaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_nivel_cuentaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_ejercicioEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarid_periodoEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcodigoEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarcodigoEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombreEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombreEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarnombre_nivel_cuentaEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activardebito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarcredito_inicialEstadosResultadosPerdidasGanancias);
		this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias.jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setEnabled(this.estadosresultadosperdidasgananciasConstantesFunciones.activarsaldo_inicialEstadosResultadosPerdidasGanancias);
		}
	}
	
		
}