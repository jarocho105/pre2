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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.DetalleEvaluacionProveedorConstantesFunciones;
import com.bydan.erp.cartera.util.DetalleEvaluacionProveedorParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DetalleEvaluacionProveedorParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.DetalleEvaluacionProveedorBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class DetalleEvaluacionProveedorBeanSwingJInternalFrame extends DetalleEvaluacionProveedorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleEvaluacionProveedorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleEvaluacionProveedor> detalleevaluacionproveedorValidator = new ClassValidator<DetalleEvaluacionProveedor>(DetalleEvaluacionProveedor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleEvaluacionProveedor detalleevaluacionproveedor;	
	public DetalleEvaluacionProveedor detalleevaluacionproveedorAux;
	public DetalleEvaluacionProveedor detalleevaluacionproveedorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleEvaluacionProveedor detalleevaluacionproveedorTotales;
	public Long idDetalleEvaluacionProveedorActual;
	public Long iIdNuevoDetalleEvaluacionProveedor=0L;
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

	public String sFinalQueryComboEvaluacionProveedor="";

	public List<EvaluacionProveedor> evaluacionproveedorsForeignKey;

	public List<EvaluacionProveedor> getevaluacionproveedorsForeignKey() {
		return evaluacionproveedorsForeignKey;
	}

	public void setevaluacionproveedorsForeignKey(List<EvaluacionProveedor> evaluacionproveedorsForeignKey) {
		this.evaluacionproveedorsForeignKey = evaluacionproveedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EvaluacionProveedor evaluacionproveedorForeignKey;

	public EvaluacionProveedor getevaluacionproveedorForeignKey() {
		return evaluacionproveedorForeignKey;
	}

	public void setevaluacionproveedorForeignKey(EvaluacionProveedor evaluacionproveedorForeignKey) {
		this.evaluacionproveedorForeignKey = evaluacionproveedorForeignKey;
	}

	public String sFinalQueryComboPreguntaEvaluacion="";

	public List<PreguntaEvaluacion> preguntaevaluacionsForeignKey;

	public List<PreguntaEvaluacion> getpreguntaevaluacionsForeignKey() {
		return preguntaevaluacionsForeignKey;
	}

	public void setpreguntaevaluacionsForeignKey(List<PreguntaEvaluacion> preguntaevaluacionsForeignKey) {
		this.preguntaevaluacionsForeignKey = preguntaevaluacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public PreguntaEvaluacion preguntaevaluacionForeignKey;

	public PreguntaEvaluacion getpreguntaevaluacionForeignKey() {
		return preguntaevaluacionForeignKey;
	}

	public void setpreguntaevaluacionForeignKey(PreguntaEvaluacion preguntaevaluacionForeignKey) {
		this.preguntaevaluacionForeignKey = preguntaevaluacionForeignKey;
	}

	public String sFinalQueryComboSubPreguntaEvaluacion="";

	public List<SubPreguntaEvaluacion> subpreguntaevaluacionsForeignKey;

	public List<SubPreguntaEvaluacion> getsubpreguntaevaluacionsForeignKey() {
		return subpreguntaevaluacionsForeignKey;
	}

	public void setsubpreguntaevaluacionsForeignKey(List<SubPreguntaEvaluacion> subpreguntaevaluacionsForeignKey) {
		this.subpreguntaevaluacionsForeignKey = subpreguntaevaluacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public SubPreguntaEvaluacion subpreguntaevaluacionForeignKey;

	public SubPreguntaEvaluacion getsubpreguntaevaluacionForeignKey() {
		return subpreguntaevaluacionForeignKey;
	}

	public void setsubpreguntaevaluacionForeignKey(SubPreguntaEvaluacion subpreguntaevaluacionForeignKey) {
		this.subpreguntaevaluacionForeignKey = subpreguntaevaluacionForeignKey;
	}

	public String sFinalQueryComboSiNo="";

	public List<SiNo> sinosForeignKey;

	public List<SiNo> getsinosForeignKey() {
		return sinosForeignKey;
	}

	public void setsinosForeignKey(List<SiNo> sinosForeignKey) {
		this.sinosForeignKey = sinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public SiNo sinoForeignKey;

	public SiNo getsinoForeignKey() {
		return sinoForeignKey;
	}

	public void setsinoForeignKey(SiNo sinoForeignKey) {
		this.sinoForeignKey = sinoForeignKey;
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
	
	public Boolean isPermisoTodoDetalleEvaluacionProveedor;
	public Boolean isPermisoNuevoDetalleEvaluacionProveedor;
	public Boolean isPermisoActualizarDetalleEvaluacionProveedor;
	public Boolean isPermisoActualizarOriginalDetalleEvaluacionProveedor;
	public Boolean isPermisoEliminarDetalleEvaluacionProveedor;
	public Boolean isPermisoGuardarCambiosDetalleEvaluacionProveedor;
	public Boolean isPermisoConsultaDetalleEvaluacionProveedor;
	public Boolean isPermisoBusquedaDetalleEvaluacionProveedor;
	public Boolean isPermisoReporteDetalleEvaluacionProveedor;
	public Boolean isPermisoPaginacionMedioDetalleEvaluacionProveedor;
	public Boolean isPermisoPaginacionAltoDetalleEvaluacionProveedor;
	public Boolean isPermisoPaginacionTodoDetalleEvaluacionProveedor;
	public Boolean isPermisoCopiarDetalleEvaluacionProveedor;
	public Boolean isPermisoVerFormDetalleEvaluacionProveedor;
	public Boolean isPermisoDuplicarDetalleEvaluacionProveedor;
	public Boolean isPermisoOrdenDetalleEvaluacionProveedor;
	
	
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
	
	public DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorReturnGeneral;
	public DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleEvaluacionProveedor=false;
	public Boolean esParaAccionDesdeFormularioDetalleEvaluacionProveedor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleEvaluacionProveedorSessionBeanAdditional detalleevaluacionproveedorSessionBeanAdditional=null;
	
	public DetalleEvaluacionProveedorSessionBeanAdditional getDetalleEvaluacionProveedorSessionBeanAdditional() {
		return this.detalleevaluacionproveedorSessionBeanAdditional;
	}
	
	public void setDetalleEvaluacionProveedorSessionBeanAdditional(DetalleEvaluacionProveedorSessionBeanAdditional detalleevaluacionproveedorSessionBeanAdditional) {
		try {
			this.detalleevaluacionproveedorSessionBeanAdditional=detalleevaluacionproveedorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional detalleevaluacionproveedorBeanSwingJInternalFrameAdditional=null;
	//public class DetalleEvaluacionProveedorBeanSwingJInternalFrame
	
	public DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional getDetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional() {
		return this.detalleevaluacionproveedorBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional(DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional detalleevaluacionproveedorBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleevaluacionproveedorBeanSwingJInternalFrameAdditional=detalleevaluacionproveedorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleEvaluacionProveedor detalleevaluacionproveedorBean;
	public DetalleEvaluacionProveedorConstantesFunciones detalleevaluacionproveedorConstantesFunciones;
	//public DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public EvaluacionProveedorLogic evaluacionproveedorLogic;
	public PreguntaEvaluacionLogic preguntaevaluacionLogic;
	public SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic;
	public SiNoLogic sinoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleEvaluacionProveedor> detalleevaluacionproveedors;	
	//public List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsEliminados;
	//public List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaCopiarDetalleEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaVerFormDetalleEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaOrdenDetalleEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEvaluacionProveedor=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdPreguntaEvaluacion=false;
	public Boolean isVisibilidadFK_IdSiNo=false;
	public Boolean isVisibilidadFK_IdSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleEvaluacionProveedor() {
		return this.iIdNuevoDetalleEvaluacionProveedor;
	}

	public void setiIdNuevoDetalleEvaluacionProveedor(Long iIdNuevoDetalleEvaluacionProveedor) {
		this.iIdNuevoDetalleEvaluacionProveedor = iIdNuevoDetalleEvaluacionProveedor;
	}
	
	public Long getidDetalleEvaluacionProveedorActual() {
		return this.idDetalleEvaluacionProveedorActual;
	}

	public void setidDetalleEvaluacionProveedorActual(Long idDetalleEvaluacionProveedorActual) {
		this.idDetalleEvaluacionProveedorActual = idDetalleEvaluacionProveedorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleEvaluacionProveedor getdetalleevaluacionproveedor() {
		return this.detalleevaluacionproveedor;
	}

	public void setdetalleevaluacionproveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor) {
		this.detalleevaluacionproveedor = detalleevaluacionproveedor;
	}
	
	public DetalleEvaluacionProveedor getdetalleevaluacionproveedorAux() {
		return this.detalleevaluacionproveedorAux;
	}

	public void setdetalleevaluacionproveedorAux(DetalleEvaluacionProveedor detalleevaluacionproveedorAux) {
		this.detalleevaluacionproveedorAux = detalleevaluacionproveedorAux;
	}				
	
	public DetalleEvaluacionProveedor getdetalleevaluacionproveedorAnterior() {
		return this.detalleevaluacionproveedorAnterior;
	}

	public void setdetalleevaluacionproveedorAnterior(DetalleEvaluacionProveedor detalleevaluacionproveedorAnterior) {
		this.detalleevaluacionproveedorAnterior = detalleevaluacionproveedorAnterior;
	}	
	
	public DetalleEvaluacionProveedor getdetalleevaluacionproveedorTotales() {
		return this.detalleevaluacionproveedorTotales;
	}

	public void setdetalleevaluacionproveedorTotales(DetalleEvaluacionProveedor detalleevaluacionproveedorTotales) {
		this.detalleevaluacionproveedorTotales = detalleevaluacionproveedorTotales;
	}	
	
	public DetalleEvaluacionProveedor getdetalleevaluacionproveedorBean() {
		return this.detalleevaluacionproveedorBean;
	}

	public void setdetalleevaluacionproveedorBean(DetalleEvaluacionProveedor detalleevaluacionproveedorBean) {
		this.detalleevaluacionproveedorBean = detalleevaluacionproveedorBean;
	}	
	
	public DetalleEvaluacionProveedorParameterReturnGeneral getdetalleevaluacionproveedorReturnGeneral() {
		return this.detalleevaluacionproveedorReturnGeneral;
	}

	public void setdetalleevaluacionproveedorReturnGeneral(DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorReturnGeneral) {
		this.detalleevaluacionproveedorReturnGeneral = detalleevaluacionproveedorReturnGeneral;
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

	public Long id_evaluacion_proveedorFK_IdEvaluacionProveedor=-1L;

	public Long getid_evaluacion_proveedorFK_IdEvaluacionProveedor() {
		return this.id_evaluacion_proveedorFK_IdEvaluacionProveedor;
	}

	public void setid_evaluacion_proveedorFK_IdEvaluacionProveedor(Long id_evaluacion_proveedorFK_IdEvaluacionProveedor) {
		this.id_evaluacion_proveedorFK_IdEvaluacionProveedor = id_evaluacion_proveedorFK_IdEvaluacionProveedor;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_pregunta_evaluacionFK_IdPreguntaEvaluacion=-1L;

	public Long getid_pregunta_evaluacionFK_IdPreguntaEvaluacion() {
		return this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion;
	}

	public void setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(Long id_pregunta_evaluacionFK_IdPreguntaEvaluacion) {
		this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion = id_pregunta_evaluacionFK_IdPreguntaEvaluacion;
	}

	public Long id_si_noFK_IdSiNo=-1L;

	public Long getid_si_noFK_IdSiNo() {
		return this.id_si_noFK_IdSiNo;
	}

	public void setid_si_noFK_IdSiNo(Long id_si_noFK_IdSiNo) {
		this.id_si_noFK_IdSiNo = id_si_noFK_IdSiNo;
	}

	public Long id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion=-1L;

	public Long getid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion() {
		return this.id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion;
	}

	public void setid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion(Long id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion) {
		this.id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion = id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion;
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
	
	
	public DetalleEvaluacionProveedorLogic getDetalleEvaluacionProveedorLogic()	{		
		return detalleevaluacionproveedorLogic;
	}

	public void setDetalleEvaluacionProveedorLogic(DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic) {
		this.detalleevaluacionproveedorLogic = detalleevaluacionproveedorLogic;
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
	
	public Boolean getIsEsNuevoDetalleEvaluacionProveedor() {
		return isEsNuevoDetalleEvaluacionProveedor;
	}

	public void setIsEsNuevoDetalleEvaluacionProveedor(Boolean isEsNuevoDetalleEvaluacionProveedor) {
		this.isEsNuevoDetalleEvaluacionProveedor = isEsNuevoDetalleEvaluacionProveedor;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleEvaluacionProveedor() {
		return esParaAccionDesdeFormularioDetalleEvaluacionProveedor;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleEvaluacionProveedor(Boolean esParaAccionDesdeFormularioDetalleEvaluacionProveedor) {
		this.esParaAccionDesdeFormularioDetalleEvaluacionProveedor = esParaAccionDesdeFormularioDetalleEvaluacionProveedor;
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

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidEmpresaActual());
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

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidSucursalActual());
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

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidEjercicioActual());
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

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidPeriodoActual());
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

	public void cargarCombosEvaluacionProveedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.evaluacionproveedorsForeignKey=new ArrayList<EvaluacionProveedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EvaluacionProveedorLogic evaluacionproveedorLogic=new EvaluacionProveedorLogic();

			//evaluacionproveedorLogic.getEvaluacionProveedorDataAccess().setIsForForeingKeyData(true);

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionProveedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionproveedorLogic.getEvaluacionProveedorDataAccess().setIsForForeingKeyData(true);

					evaluacionproveedorLogic.getTodosEvaluacionProveedorsWithConnection(sFinalQuery,new Pagination());

					this.evaluacionproveedorsForeignKey=evaluacionproveedorLogic.getEvaluacionProveedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEvaluacionProveedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidEvaluacionProveedorActual());
					this.evaluacionproveedorsForeignKey.add(evaluacionproveedorLogic.getEvaluacionProveedor());
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

	public void cargarCombosPreguntaEvaluacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PreguntaEvaluacionLogic preguntaevaluacionLogic=new PreguntaEvaluacionLogic();

			//preguntaevaluacionLogic.getPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//preguntaevaluacionLogic.getPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

					preguntaevaluacionLogic.getTodosPreguntaEvaluacionsWithConnection(sFinalQuery,new Pagination());

					this.preguntaevaluacionsForeignKey=preguntaevaluacionLogic.getPreguntaEvaluacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPreguntaEvaluacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidPreguntaEvaluacionActual());
					this.preguntaevaluacionsForeignKey.add(preguntaevaluacionLogic.getPreguntaEvaluacion());
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

	public void cargarCombosSubPreguntaEvaluacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.subpreguntaevaluacionsForeignKey=new ArrayList<SubPreguntaEvaluacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic=new SubPreguntaEvaluacionLogic();

			//subpreguntaevaluacionLogic.getSubPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSubPreguntaEvaluacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//subpreguntaevaluacionLogic.getSubPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

					subpreguntaevaluacionLogic.getTodosSubPreguntaEvaluacionsWithConnection(sFinalQuery,new Pagination());

					this.subpreguntaevaluacionsForeignKey=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSubPreguntaEvaluacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidSubPreguntaEvaluacionActual());
					this.subpreguntaevaluacionsForeignKey.add(subpreguntaevaluacionLogic.getSubPreguntaEvaluacion());
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

	public void cargarCombosSiNosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sinosForeignKey=new ArrayList<SiNo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SiNoLogic sinoLogic=new SiNoLogic();

			//sinoLogic.getSiNoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSiNo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sinoLogic.getSiNoDataAccess().setIsForForeingKeyData(true);

					sinoLogic.getTodosSiNosWithConnection(sFinalQuery,new Pagination());

					this.sinosForeignKey=sinoLogic.getSiNos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSiNo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sinoLogic.getEntityWithConnection(detalleevaluacionproveedorSessionBean.getlidSiNoActual());
					this.sinosForeignKey.add(sinoLogic.getSiNo());
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

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_empresaDetalleEvaluacionProveedorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_empresaDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
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

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
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

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
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

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetalleEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_periodoDetalleEvaluacionProveedorGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_periodoDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEvaluacionProveedorForeignKey(Long idEvaluacionProveedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EvaluacionProveedor  evaluacionproveedorTemp=null;

			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsForeignKey) {
				if(evaluacionproveedorAux.getId()!=null && evaluacionproveedorAux.getId().equals(idEvaluacionProveedorSeleccionado)) {
					evaluacionproveedorTemp=evaluacionproveedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(evaluacionproveedorTemp!=null) {

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setEvaluacionProveedor(evaluacionproveedorTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedorTemp);
					}
				} else {
					//jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedorTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionProveedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(evaluacionproveedorTemp!=null && jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor!=null) {
						jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedorTemp);
					} else {
						if(jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor!=null) {
							//jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedorTemp);
							if(jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.getItemCount()>0) {
								jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualEvaluacionProveedorForeignKeyDescripcion(Long idEvaluacionProveedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EvaluacionProveedor  evaluacionproveedorTemp=null;

			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsForeignKey) {
				if(evaluacionproveedorAux.getId()!=null && evaluacionproveedorAux.getId().equals(idEvaluacionProveedorSeleccionado)) {
					evaluacionproveedorTemp=evaluacionproveedorAux;
					break;
				}
			}


			sDescripcion=EvaluacionProveedorConstantesFunciones.getEvaluacionProveedorDescripcion(evaluacionproveedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEvaluacionProveedorForeignKeyGenerico(Long idEvaluacionProveedorSeleccionado,JComboBox jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			EvaluacionProveedor  evaluacionproveedorTemp=null;

			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsForeignKey) {
				if(evaluacionproveedorAux.getId()!=null && evaluacionproveedorAux.getId().equals(idEvaluacionProveedorSeleccionado)) {
					evaluacionproveedorTemp=evaluacionproveedorAux;
					break;
				}
			}

			if(evaluacionproveedorTemp!=null) {
				jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico.setSelectedItem(evaluacionproveedorTemp);
			} else {
				if(jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPreguntaEvaluacionForeignKey(Long idPreguntaEvaluacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(preguntaevaluacionTemp!=null) {

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setPreguntaEvaluacion(preguntaevaluacionTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacionTemp);
					}
				} else {
					//jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacionTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(preguntaevaluacionTemp!=null && jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
						jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacionTemp);
					} else {
						if(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
							//jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacionTemp);
							if(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
								jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualPreguntaEvaluacionForeignKeyDescripcion(Long idPreguntaEvaluacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}


			sDescripcion=PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPreguntaEvaluacionForeignKeyGenerico(Long idPreguntaEvaluacionSeleccionado,JComboBox jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}

			if(preguntaevaluacionTemp!=null) {
				jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.setSelectedItem(preguntaevaluacionTemp);
			} else {
				if(jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSubPreguntaEvaluacionForeignKey(Long idSubPreguntaEvaluacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			SubPreguntaEvaluacion  subpreguntaevaluacionTemp=null;

			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsForeignKey) {
				if(subpreguntaevaluacionAux.getId()!=null && subpreguntaevaluacionAux.getId().equals(idSubPreguntaEvaluacionSeleccionado)) {
					subpreguntaevaluacionTemp=subpreguntaevaluacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(subpreguntaevaluacionTemp!=null) {

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setSubPreguntaEvaluacion(subpreguntaevaluacionTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacionTemp);
					}
				} else {
					//jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacionTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSubPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(subpreguntaevaluacionTemp!=null && jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
						jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacionTemp);
					} else {
						if(jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
							//jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacionTemp);
							if(jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
								jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualSubPreguntaEvaluacionForeignKeyDescripcion(Long idSubPreguntaEvaluacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			SubPreguntaEvaluacion  subpreguntaevaluacionTemp=null;

			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsForeignKey) {
				if(subpreguntaevaluacionAux.getId()!=null && subpreguntaevaluacionAux.getId().equals(idSubPreguntaEvaluacionSeleccionado)) {
					subpreguntaevaluacionTemp=subpreguntaevaluacionAux;
					break;
				}
			}


			sDescripcion=SubPreguntaEvaluacionConstantesFunciones.getSubPreguntaEvaluacionDescripcion(subpreguntaevaluacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSubPreguntaEvaluacionForeignKeyGenerico(Long idSubPreguntaEvaluacionSeleccionado,JComboBox jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			SubPreguntaEvaluacion  subpreguntaevaluacionTemp=null;

			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsForeignKey) {
				if(subpreguntaevaluacionAux.getId()!=null && subpreguntaevaluacionAux.getId().equals(idSubPreguntaEvaluacionSeleccionado)) {
					subpreguntaevaluacionTemp=subpreguntaevaluacionAux;
					break;
				}
			}

			if(subpreguntaevaluacionTemp!=null) {
				jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.setSelectedItem(subpreguntaevaluacionTemp);
			} else {
				if(jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSiNoForeignKey(Long idSiNoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			SiNo  sinoTemp=null;

			for(SiNo sinoAux:sinosForeignKey) {
				if(sinoAux.getId()!=null && sinoAux.getId().equals(idSiNoSeleccionado)) {
					sinoTemp=sinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sinoTemp!=null) {

					if(this.detalleevaluacionproveedor!=null) {
						this.detalleevaluacionproveedor.setSiNo(sinoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedItem(sinoTemp);
					}
				} else {
					//jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedItem(sinoTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSiNo") || sFormularioTipoBusqueda.equals("Todos")){
					if(sinoTemp!=null && jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor!=null) {
						jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setSelectedItem(sinoTemp);
					} else {
						if(jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor!=null) {
							//jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setSelectedItem(sinoTemp);
							if(jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.getItemCount()>0) {
								jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualSiNoForeignKeyDescripcion(Long idSiNoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			SiNo  sinoTemp=null;

			for(SiNo sinoAux:sinosForeignKey) {
				if(sinoAux.getId()!=null && sinoAux.getId().equals(idSiNoSeleccionado)) {
					sinoTemp=sinoAux;
					break;
				}
			}


			sDescripcion=SiNoConstantesFunciones.getSiNoDescripcion(sinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSiNoForeignKeyGenerico(Long idSiNoSeleccionado,JComboBox jComboBoxid_si_noDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			SiNo  sinoTemp=null;

			for(SiNo sinoAux:sinosForeignKey) {
				if(sinoAux.getId()!=null && sinoAux.getId().equals(idSiNoSeleccionado)) {
					sinoTemp=sinoAux;
					break;
				}
			}

			if(sinoTemp!=null) {
				jComboBoxid_si_noDetalleEvaluacionProveedorGenerico.setSelectedItem(sinoTemp);
			} else {
				if(jComboBoxid_si_noDetalleEvaluacionProveedorGenerico!=null && jComboBoxid_si_noDetalleEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_si_noDetalleEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_empresaDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleEvaluacionProveedorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleevaluacionproveedor.setid_empresa(empresaAux.getId());
				detalleevaluacionproveedor.setempresa_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleevaluacionproveedor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleevaluacionproveedor.setid_sucursal(sucursalAux.getId());
				detalleevaluacionproveedor.setsucursal_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleevaluacionproveedor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detalleevaluacionproveedor.setid_ejercicio(ejercicioAux.getId());
				detalleevaluacionproveedor.setejercicio_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detalleevaluacionproveedor.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_periodoDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetalleEvaluacionProveedorGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detalleevaluacionproveedor.setid_periodo(periodoAux.getId());
				detalleevaluacionproveedor.setperiodo_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detalleevaluacionproveedor.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEvaluacionProveedorForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			EvaluacionProveedor  evaluacionproveedorAux=new EvaluacionProveedor();

			if(jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico==null) {
				evaluacionproveedorAux=(EvaluacionProveedor)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				evaluacionproveedorAux=(EvaluacionProveedor)jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(evaluacionproveedorAux!=null && evaluacionproveedorAux.getId()!=null) {
				detalleevaluacionproveedor.setid_evaluacion_proveedor(evaluacionproveedorAux.getId());
				detalleevaluacionproveedor.setevaluacionproveedor_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getEvaluacionProveedorDescripcion(evaluacionproveedorAux));
				detalleevaluacionproveedor.setEvaluacionProveedor(evaluacionproveedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPreguntaEvaluacionForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionAux=new PreguntaEvaluacion();

			if(jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico==null) {
				preguntaevaluacionAux=(PreguntaEvaluacion)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				preguntaevaluacionAux=(PreguntaEvaluacion)jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(preguntaevaluacionAux!=null && preguntaevaluacionAux.getId()!=null) {
				detalleevaluacionproveedor.setid_pregunta_evaluacion(preguntaevaluacionAux.getId());
				detalleevaluacionproveedor.setpreguntaevaluacion_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacionAux));
				detalleevaluacionproveedor.setPreguntaEvaluacion(preguntaevaluacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSubPreguntaEvaluacionForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			SubPreguntaEvaluacion  subpreguntaevaluacionAux=new SubPreguntaEvaluacion();

			if(jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico==null) {
				subpreguntaevaluacionAux=(SubPreguntaEvaluacion)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				subpreguntaevaluacionAux=(SubPreguntaEvaluacion)jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(subpreguntaevaluacionAux!=null && subpreguntaevaluacionAux.getId()!=null) {
				detalleevaluacionproveedor.setid_sub_pregunta_evaluacion(subpreguntaevaluacionAux.getId());
				detalleevaluacionproveedor.setsubpreguntaevaluacion_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getSubPreguntaEvaluacionDescripcion(subpreguntaevaluacionAux));
				detalleevaluacionproveedor.setSubPreguntaEvaluacion(subpreguntaevaluacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSiNoForeignKey(DetalleEvaluacionProveedor detalleevaluacionproveedor,JComboBox jComboBoxid_si_noDetalleEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			SiNo  sinoAux=new SiNo();

			if(jComboBoxid_si_noDetalleEvaluacionProveedorGenerico==null) {
				sinoAux=(SiNo)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.getSelectedItem();
			} else {
				sinoAux=(SiNo)jComboBoxid_si_noDetalleEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(sinoAux!=null && sinoAux.getId()!=null) {
				detalleevaluacionproveedor.setid_si_no(sinoAux.getId());
				detalleevaluacionproveedor.setsino_descripcion(DetalleEvaluacionProveedorConstantesFunciones.getSiNoDescripcion(sinoAux));
				detalleevaluacionproveedor.setSiNo(sinoAux);			}
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

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEvaluacionProveedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEvaluacionProveedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.removeAllItems();

							for(EvaluacionProveedor evaluacionproveedor:this.evaluacionproveedorsForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.addItem(evaluacionproveedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionProveedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.removeAllItems();

							for(EvaluacionProveedor evaluacionproveedor:this.evaluacionproveedorsForeignKey) {
								this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.addItem(evaluacionproveedor);
							}
						}

						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePreguntaEvaluacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPreguntaEvaluacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.removeAllItems();

							for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacionsForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.addItem(preguntaevaluacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.removeAllItems();

							for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacionsForeignKey) {
								this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.addItem(preguntaevaluacion);
							}
						}

						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSubPreguntaEvaluacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSubPreguntaEvaluacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.removeAllItems();

							for(SubPreguntaEvaluacion subpreguntaevaluacion:this.subpreguntaevaluacionsForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.addItem(subpreguntaevaluacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSubPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.removeAllItems();

							for(SubPreguntaEvaluacion subpreguntaevaluacion:this.subpreguntaevaluacionsForeignKey) {
								this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.addItem(subpreguntaevaluacion);
							}
						}

						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSiNosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSiNo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.removeAllItems();

							for(SiNo sino:this.sinosForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.addItem(sino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { 
					}

					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSiNo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.removeAllItems();

							for(SiNo sino:this.sinosForeignKey) {
								this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.addItem(sino);
							}
						}

						if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEvaluacionProveedorForeignKey(EvaluacionProveedor evaluacionproveedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setSelectedItem(evaluacionproveedor);
						} else {
							this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePreguntaEvaluacionForeignKey(PreguntaEvaluacion preguntaevaluacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(preguntaevaluacion);
						} else {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSubPreguntaEvaluacionForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedItem(subpreguntaevaluacion);
						} else {
							this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSiNoForeignKey(SiNo sino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedItem(sino);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setSelectedItem(sino);
						} else {
							this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleEvaluacionProveedorConstantesFunciones.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleEvaluacionProveedorConstantesFunciones.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor(this.detalleevaluacionproveedors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(EvaluacionProveedor.class));
		classes.add(new Classe(PreguntaEvaluacion.class));
		classes.add(new Classe(SubPreguntaEvaluacion.class));
		classes.add(new Classe(SiNo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(this.detalleevaluacionproveedors);
			detalleevaluacionproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleEvaluacionProveedorParameterReturnGeneral getDetalleEvaluacionProveedorParameterGeneral() {
		return this.detalleevaluacionproveedorParameterGeneral;
	}
	
	public void setDetalleEvaluacionProveedorParameterGeneral(DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorParameterGeneral) {
		this.detalleevaluacionproveedorParameterGeneral = detalleevaluacionproveedorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleEvaluacionProveedor() {
		return isPermisoTodoDetalleEvaluacionProveedor;
	}

	public void setIsPermisoTodoDetalleEvaluacionProveedor(Boolean isPermisoTodoDetalleEvaluacionProveedor) {
		this.isPermisoTodoDetalleEvaluacionProveedor = isPermisoTodoDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoNuevoDetalleEvaluacionProveedor() {
		return isPermisoNuevoDetalleEvaluacionProveedor;
	}

	public void setIsPermisoNuevoDetalleEvaluacionProveedor(Boolean isPermisoNuevoDetalleEvaluacionProveedor) {
		this.isPermisoNuevoDetalleEvaluacionProveedor = isPermisoNuevoDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoActualizarDetalleEvaluacionProveedor() {
		return isPermisoActualizarDetalleEvaluacionProveedor;
	}

	public void setIsPermisoActualizarDetalleEvaluacionProveedor(Boolean isPermisoActualizarDetalleEvaluacionProveedor) {
		this.isPermisoActualizarDetalleEvaluacionProveedor = isPermisoActualizarDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoEliminarDetalleEvaluacionProveedor() {
		return isPermisoEliminarDetalleEvaluacionProveedor;
	}

	public void setIsPermisoEliminarDetalleEvaluacionProveedor(Boolean isPermisoEliminarDetalleEvaluacionProveedor) {
		this.isPermisoEliminarDetalleEvaluacionProveedor = isPermisoEliminarDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleEvaluacionProveedor() {
		return isPermisoGuardarCambiosDetalleEvaluacionProveedor;
	}

	public void setIsPermisoGuardarCambiosDetalleEvaluacionProveedor(Boolean isPermisoGuardarCambiosDetalleEvaluacionProveedor) {
		this.isPermisoGuardarCambiosDetalleEvaluacionProveedor = isPermisoGuardarCambiosDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoConsultaDetalleEvaluacionProveedor() {
		return isPermisoConsultaDetalleEvaluacionProveedor;
	}

	public void setIsPermisoConsultaDetalleEvaluacionProveedor(Boolean isPermisoConsultaDetalleEvaluacionProveedor) {
		this.isPermisoConsultaDetalleEvaluacionProveedor = isPermisoConsultaDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoBusquedaDetalleEvaluacionProveedor() {
		return isPermisoBusquedaDetalleEvaluacionProveedor;
	}

	public void setIsPermisoBusquedaDetalleEvaluacionProveedor(Boolean isPermisoBusquedaDetalleEvaluacionProveedor) {
		this.isPermisoBusquedaDetalleEvaluacionProveedor = isPermisoBusquedaDetalleEvaluacionProveedor;
	}

	public Boolean getIsPermisoReporteDetalleEvaluacionProveedor() {
		return isPermisoReporteDetalleEvaluacionProveedor;
	}

	public void setIsPermisoReporteDetalleEvaluacionProveedor(Boolean isPermisoReporteDetalleEvaluacionProveedor) {
		this.isPermisoReporteDetalleEvaluacionProveedor = isPermisoReporteDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleEvaluacionProveedor() {
		return isPermisoPaginacionMedioDetalleEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionMedioDetalleEvaluacionProveedor(Boolean isPermisoPaginacionMedioDetalleEvaluacionProveedor) {
		this.isPermisoPaginacionMedioDetalleEvaluacionProveedor = isPermisoPaginacionMedioDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleEvaluacionProveedor() {
		return isPermisoPaginacionTodoDetalleEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionTodoDetalleEvaluacionProveedor(Boolean isPermisoPaginacionTodoDetalleEvaluacionProveedor) {
		this.isPermisoPaginacionTodoDetalleEvaluacionProveedor = isPermisoPaginacionTodoDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleEvaluacionProveedor() {
		return isPermisoPaginacionAltoDetalleEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionAltoDetalleEvaluacionProveedor(Boolean isPermisoPaginacionAltoDetalleEvaluacionProveedor) {
		this.isPermisoPaginacionAltoDetalleEvaluacionProveedor = isPermisoPaginacionAltoDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoCopiarDetalleEvaluacionProveedor() {
		return isPermisoCopiarDetalleEvaluacionProveedor;
	}

	public void setIsPermisoCopiarDetalleEvaluacionProveedor(Boolean isPermisoCopiarDetalleEvaluacionProveedor) {
		this.isPermisoCopiarDetalleEvaluacionProveedor = isPermisoCopiarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoVerFormDetalleEvaluacionProveedor() {
		return isPermisoVerFormDetalleEvaluacionProveedor;
	}

	public void setIsPermisoVerFormDetalleEvaluacionProveedor(Boolean isPermisoVerFormDetalleEvaluacionProveedor) {
		this.isPermisoVerFormDetalleEvaluacionProveedor = isPermisoVerFormDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoDuplicarDetalleEvaluacionProveedor() {
		return isPermisoDuplicarDetalleEvaluacionProveedor;
	}

	public void setIsPermisoDuplicarDetalleEvaluacionProveedor(Boolean isPermisoDuplicarDetalleEvaluacionProveedor) {
		this.isPermisoDuplicarDetalleEvaluacionProveedor = isPermisoDuplicarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoOrdenDetalleEvaluacionProveedor() {
		return isPermisoOrdenDetalleEvaluacionProveedor;
	}

	public void setIsPermisoOrdenDetalleEvaluacionProveedor(Boolean isPermisoOrdenDetalleEvaluacionProveedor) {
		this.isPermisoOrdenDetalleEvaluacionProveedor = isPermisoOrdenDetalleEvaluacionProveedor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaNuevoDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaNuevoDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaNuevoDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor = isVisibilidadCeldaNuevoDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor = isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaCopiarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaCopiarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaCopiarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor = isVisibilidadCeldaCopiarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaVerFormDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaVerFormDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaVerFormDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor = isVisibilidadCeldaVerFormDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaOrdenDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaOrdenDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaOrdenDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor = isVisibilidadCeldaOrdenDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor = isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaModificarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaModificarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaModificarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor = isVisibilidadCeldaModificarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaActualizarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaActualizarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaActualizarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor = isVisibilidadCeldaActualizarDetalleEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaEliminarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaEliminarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaEliminarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor = isVisibilidadCeldaEliminarDetalleEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaCancelarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaCancelarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaCancelarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor = isVisibilidadCeldaCancelarDetalleEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaGuardarDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaGuardarDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaGuardarDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor = isVisibilidadCeldaGuardarDetalleEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor() {
		return isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor(Boolean isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor) {
		this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor = isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor;
	}
		
	public DetalleEvaluacionProveedorSessionBean getdetalleevaluacionproveedorSessionBean() {
		return this.detalleevaluacionproveedorSessionBean;
	}
	
	public void setdetalleevaluacionproveedorSessionBean(DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean) {
		this.detalleevaluacionproveedorSessionBean=detalleevaluacionproveedorSessionBean;
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

	public Boolean getisVisibilidadFK_IdEvaluacionProveedor() {
		return this.isVisibilidadFK_IdEvaluacionProveedor;
	}

	public void setisVisibilidadFK_IdEvaluacionProveedor(Boolean isVisibilidadFK_IdEvaluacionProveedor) {
		this.isVisibilidadFK_IdEvaluacionProveedor=isVisibilidadFK_IdEvaluacionProveedor;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdPreguntaEvaluacion() {
		return this.isVisibilidadFK_IdPreguntaEvaluacion;
	}

	public void setisVisibilidadFK_IdPreguntaEvaluacion(Boolean isVisibilidadFK_IdPreguntaEvaluacion) {
		this.isVisibilidadFK_IdPreguntaEvaluacion=isVisibilidadFK_IdPreguntaEvaluacion;
	}

	public Boolean getisVisibilidadFK_IdSiNo() {
		return this.isVisibilidadFK_IdSiNo;
	}

	public void setisVisibilidadFK_IdSiNo(Boolean isVisibilidadFK_IdSiNo) {
		this.isVisibilidadFK_IdSiNo=isVisibilidadFK_IdSiNo;
	}

	public Boolean getisVisibilidadFK_IdSubPreguntaEvaluacion() {
		return this.isVisibilidadFK_IdSubPreguntaEvaluacion;
	}

	public void setisVisibilidadFK_IdSubPreguntaEvaluacion(Boolean isVisibilidadFK_IdSubPreguntaEvaluacion) {
		this.isVisibilidadFK_IdSubPreguntaEvaluacion=isVisibilidadFK_IdSubPreguntaEvaluacion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarSucursalForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarEjercicioForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarPeriodoForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarEvaluacionProveedorForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarPreguntaEvaluacionForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarSubPreguntaEvaluacionForeignKey(detalleevaluacionproveedor,null);
				this.setActualParaGuardarSiNoForeignKey(detalleevaluacionproveedor,null);
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
	
	public void bugActualizarReferenciaActual(DetalleEvaluacionProveedor detalleevaluacionproveedor,DetalleEvaluacionProveedor detalleevaluacionproveedorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleEvaluacionProveedor(detalleevaluacionproveedor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleevaluacionproveedorAux.setId(detalleevaluacionproveedor.getId());
		detalleevaluacionproveedorAux.setVersionRow(detalleevaluacionproveedor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleEvaluacionProveedor();
		
			int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleevaluacionproveedorValidator.getInvalidValues(this.detalleevaluacionproveedor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleevaluacionproveedorLogic.setDatosCliente(datosCliente);
			detalleevaluacionproveedorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleevaluacionproveedorAux=new  DetalleEvaluacionProveedor();
				
				detalleevaluacionproveedorAux.setIsNew(true);
				detalleevaluacionproveedorAux.setIsChanged(true);
				
				detalleevaluacionproveedorAux.setDetalleEvaluacionProveedorOriginal(this.detalleevaluacionproveedor);
				
				detalleevaluacionproveedorAux.setId(this.detalleevaluacionproveedor.getId());	
				detalleevaluacionproveedorAux.setVersionRow(this.detalleevaluacionproveedor.getVersionRow());	
				detalleevaluacionproveedorAux.setid_empresa(this.detalleevaluacionproveedor.getid_empresa());	
				detalleevaluacionproveedorAux.setid_sucursal(this.detalleevaluacionproveedor.getid_sucursal());	
				detalleevaluacionproveedorAux.setid_ejercicio(this.detalleevaluacionproveedor.getid_ejercicio());	
				detalleevaluacionproveedorAux.setid_periodo(this.detalleevaluacionproveedor.getid_periodo());	
				detalleevaluacionproveedorAux.setid_evaluacion_proveedor(this.detalleevaluacionproveedor.getid_evaluacion_proveedor());	
				detalleevaluacionproveedorAux.setid_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_sub_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_si_no(this.detalleevaluacionproveedor.getid_si_no());	
				detalleevaluacionproveedorAux.setdescripcion(this.detalleevaluacionproveedor.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedors();//WithConnection
						//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);
					
					this.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedorRelaciones(detalleevaluacionproveedorAux);//WithConnection
								//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleevaluacionproveedorAux=new  DetalleEvaluacionProveedor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && this.detalleevaluacionproveedor.getId()>=0)) {
						
					detalleevaluacionproveedorAux.setIsNew(false);
				}
				
				detalleevaluacionproveedorAux.setIsDeleted(false);
			
				detalleevaluacionproveedorAux.setId(this.detalleevaluacionproveedor.getId());	
				detalleevaluacionproveedorAux.setVersionRow(this.detalleevaluacionproveedor.getVersionRow());	
				detalleevaluacionproveedorAux.setid_empresa(this.detalleevaluacionproveedor.getid_empresa());	
				detalleevaluacionproveedorAux.setid_sucursal(this.detalleevaluacionproveedor.getid_sucursal());	
				detalleevaluacionproveedorAux.setid_ejercicio(this.detalleevaluacionproveedor.getid_ejercicio());	
				detalleevaluacionproveedorAux.setid_periodo(this.detalleevaluacionproveedor.getid_periodo());	
				detalleevaluacionproveedorAux.setid_evaluacion_proveedor(this.detalleevaluacionproveedor.getid_evaluacion_proveedor());	
				detalleevaluacionproveedorAux.setid_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_sub_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_si_no(this.detalleevaluacionproveedor.getid_si_no());	
				detalleevaluacionproveedorAux.setdescripcion(this.detalleevaluacionproveedor.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedors();//WithConnection
						//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);
					
					this.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedorRelaciones(detalleevaluacionproveedorAux);//WithConnection
								//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleevaluacionproveedor,detalleevaluacionproveedorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleevaluacionproveedorAux=new  DetalleEvaluacionProveedor();
				
				detalleevaluacionproveedorAux.setIsNew(false);
				detalleevaluacionproveedorAux.setIsChanged(false);
				
				detalleevaluacionproveedorAux.setIsDeleted(true);
				
				detalleevaluacionproveedorAux.setId(this.detalleevaluacionproveedor.getId());	
				detalleevaluacionproveedorAux.setVersionRow(this.detalleevaluacionproveedor.getVersionRow());	
				detalleevaluacionproveedorAux.setid_empresa(this.detalleevaluacionproveedor.getid_empresa());	
				detalleevaluacionproveedorAux.setid_sucursal(this.detalleevaluacionproveedor.getid_sucursal());	
				detalleevaluacionproveedorAux.setid_ejercicio(this.detalleevaluacionproveedor.getid_ejercicio());	
				detalleevaluacionproveedorAux.setid_periodo(this.detalleevaluacionproveedor.getid_periodo());	
				detalleevaluacionproveedorAux.setid_evaluacion_proveedor(this.detalleevaluacionproveedor.getid_evaluacion_proveedor());	
				detalleevaluacionproveedorAux.setid_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_sub_pregunta_evaluacion(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion());	
				detalleevaluacionproveedorAux.setid_si_no(this.detalleevaluacionproveedor.getid_si_no());	
				detalleevaluacionproveedorAux.setdescripcion(this.detalleevaluacionproveedor.getdescripcion());	
				
				if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleevaluacionproveedorAux.getId()>=0) {	
						this.detalleevaluacionproveedorsEliminados.add(detalleevaluacionproveedorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedors();//WithConnection
						//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedorRelaciones(detalleevaluacionproveedorAux);//WithConnection
								//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
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
							if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleevaluacionproveedorAux,detalleevaluacionproveedors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.detalleevaluacionproveedorsEliminados);
					
					detalleevaluacionproveedorLogic.saveDetalleEvaluacionProveedors();//WithConnection
					//detalleevaluacionproveedorLogic.getSetVersionRowDetalleEvaluacionProveedors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor();
				
				this.detalleevaluacionproveedorsEliminados= new ArrayList<DetalleEvaluacionProveedor>();		
			}
			
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Evaluacion Proveedor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleevaluacionproveedor=detalleevaluacionproveedorAux;
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
      		//this.finishProcessDetalleEvaluacionProveedor();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleEvaluacionProveedor detalleevaluacionproveedorLocal) throws Exception {
		
		if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleEvaluacionProveedor detalleevaluacionproveedorLocal) throws Exception {	
		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleevaluacionproveedorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleevaluacionproveedorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detalleevaluacionproveedorLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detalleevaluacionproveedorLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EvaluacionProveedorDetalleFormJInternalFrame.class)) {
				EvaluacionProveedorBeanSwingJInternalFrame evaluacionproveedorBeanSwingJInternalFrameLocal=(EvaluacionProveedorBeanSwingJInternalFrame) ((EvaluacionProveedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				evaluacionproveedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEvaluacionProveedor(evaluacionproveedorBeanSwingJInternalFrameLocal.getevaluacionproveedor(),true);
				evaluacionproveedorBeanSwingJInternalFrameLocal.actualizarLista(evaluacionproveedorBeanSwingJInternalFrameLocal.evaluacionproveedor,this.evaluacionproveedorsForeignKey);

				evaluacionproveedorBeanSwingJInternalFrameLocal.actualizarRelaciones(evaluacionproveedorBeanSwingJInternalFrameLocal.evaluacionproveedor);

				detalleevaluacionproveedorLocal.setEvaluacionProveedor(evaluacionproveedorBeanSwingJInternalFrameLocal.evaluacionproveedor);

				this.addItemDefectoCombosForeignKeyEvaluacionProveedor();
				this.cargarCombosFrameEvaluacionProveedorsForeignKey("Formulario");
				this.setActualEvaluacionProveedorForeignKey(evaluacionproveedorBeanSwingJInternalFrameLocal.evaluacionproveedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PreguntaEvaluacionDetalleFormJInternalFrame.class)) {
				PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrameLocal=(PreguntaEvaluacionBeanSwingJInternalFrame) ((PreguntaEvaluacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				preguntaevaluacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPreguntaEvaluacion(preguntaevaluacionBeanSwingJInternalFrameLocal.getpreguntaevaluacion(),true);
				preguntaevaluacionBeanSwingJInternalFrameLocal.actualizarLista(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion,this.preguntaevaluacionsForeignKey);

				preguntaevaluacionBeanSwingJInternalFrameLocal.actualizarRelaciones(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion);

				detalleevaluacionproveedorLocal.setPreguntaEvaluacion(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion);

				this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
				this.cargarCombosFramePreguntaEvaluacionsForeignKey("Formulario");
				this.setActualPreguntaEvaluacionForeignKey(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SubPreguntaEvaluacionDetalleFormJInternalFrame.class)) {
				SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrameLocal=(SubPreguntaEvaluacionBeanSwingJInternalFrame) ((SubPreguntaEvaluacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				subpreguntaevaluacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSubPreguntaEvaluacion(subpreguntaevaluacionBeanSwingJInternalFrameLocal.getsubpreguntaevaluacion(),true);
				subpreguntaevaluacionBeanSwingJInternalFrameLocal.actualizarLista(subpreguntaevaluacionBeanSwingJInternalFrameLocal.subpreguntaevaluacion,this.subpreguntaevaluacionsForeignKey);

				subpreguntaevaluacionBeanSwingJInternalFrameLocal.actualizarRelaciones(subpreguntaevaluacionBeanSwingJInternalFrameLocal.subpreguntaevaluacion);

				detalleevaluacionproveedorLocal.setSubPreguntaEvaluacion(subpreguntaevaluacionBeanSwingJInternalFrameLocal.subpreguntaevaluacion);

				this.addItemDefectoCombosForeignKeySubPreguntaEvaluacion();
				this.cargarCombosFrameSubPreguntaEvaluacionsForeignKey("Formulario");
				this.setActualSubPreguntaEvaluacionForeignKey(subpreguntaevaluacionBeanSwingJInternalFrameLocal.subpreguntaevaluacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SiNoDetalleFormJInternalFrame.class)) {
				SiNoBeanSwingJInternalFrame sinoBeanSwingJInternalFrameLocal=(SiNoBeanSwingJInternalFrame) ((SiNoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSiNo(sinoBeanSwingJInternalFrameLocal.getsino(),true);
				sinoBeanSwingJInternalFrameLocal.actualizarLista(sinoBeanSwingJInternalFrameLocal.sino,this.sinosForeignKey);

				sinoBeanSwingJInternalFrameLocal.actualizarRelaciones(sinoBeanSwingJInternalFrameLocal.sino);

				detalleevaluacionproveedorLocal.setSiNo(sinoBeanSwingJInternalFrameLocal.sino);

				this.addItemDefectoCombosForeignKeySiNo();
				this.cargarCombosFrameSiNosForeignKey("Formulario");
				this.setActualSiNoForeignKey(sinoBeanSwingJInternalFrameLocal.sino.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleEvaluacionProveedorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleevaluacionproveedorValidator.getInvalidValues(this.detalleevaluacionproveedor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleEvaluacionProveedor detalleevaluacionproveedor,List<DetalleEvaluacionProveedor> detalleevaluacionproveedors) throws Exception {
		try	{		
			DetalleEvaluacionProveedorConstantesFunciones.actualizarLista(detalleevaluacionproveedor,detalleevaluacionproveedors,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleEvaluacionProveedor detalleevaluacionproveedor,List<DetalleEvaluacionProveedor> detalleevaluacionproveedors) throws Exception {
		try	{			
			DetalleEvaluacionProveedorConstantesFunciones.actualizarSelectedLista(detalleevaluacionproveedor,detalleevaluacionproveedors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleevaluacionproveedorsLocal=this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleevaluacionproveedorsLocal=this.detalleevaluacionproveedors;
			}
			//ARCHITECTURE
		
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorLocal:detalleevaluacionproveedorsLocal) {
				if(this.permiteMantenimiento(detalleevaluacionproveedorLocal) && detalleevaluacionproveedorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleEvaluacionProveedorConstantesFunciones.getDetalleEvaluacionProveedorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_empresaDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_sucursalDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_ejercicioDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_periodoDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDEVALUACIONPROVEEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDPREGUNTAEVALUACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDSUBPREGUNTAEVALUACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.IDSINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_si_noDetalleEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionProveedorConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabeldescripcionDetalleEvaluacionProveedor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_empresaDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_sucursalDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_ejercicioDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_periodoDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelid_si_noDetalleEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabeldescripcionDetalleEvaluacionProveedor,"");
		
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
		this.iIdNuevoDetalleEvaluacionProveedor--;	
		
		
		this.detalleevaluacionproveedorAux=new DetalleEvaluacionProveedor();
		
		this.detalleevaluacionproveedorAux.setId(this.iIdNuevoDetalleEvaluacionProveedor);
		this.detalleevaluacionproveedorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().add(this.detalleevaluacionproveedorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleevaluacionproveedors.add(this.detalleevaluacionproveedorAux);
		}
		//ARCHITECTURE
		
		this.detalleevaluacionproveedor=this.detalleevaluacionproveedorAux;
		
		if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
		}
				
		//this.setDefaultControlesDetalleEvaluacionProveedor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleEvaluacionProveedor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionProveedor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionProveedor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedorBean,this.detalleevaluacionproveedor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			classes=DetalleEvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.procesarEventosDetalleEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.detalleevaluacionproveedor,this.detalleevaluacionproveedorParameterGeneral,this.isEsNuevoDetalleEvaluacionProveedor,classes);//this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral,this.detalleevaluacionproveedorBean,false);
		
		if(this.detalleevaluacionproveedorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor());
		}
		
		if(this.detalleevaluacionproveedorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor(),classes);//this.detalleevaluacionproveedorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleEvaluacionProveedor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleEvaluacionProveedor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.RecargarFormDetalleEvaluacionProveedor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
						
			if(detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();
			}
			
			this.actualizarVisualTableDatosDetalleEvaluacionProveedor();
			
			this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionProveedor(), this.getIndiceNuevoDetalleEvaluacionProveedor());
			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
						
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleEvaluacionProveedor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activardescripcionDetalleEvaluacionProveedor);	
		//
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_empresaDetalleEvaluacionProveedor);//
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_sucursalDetalleEvaluacionProveedor);//
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_ejercicioDetalleEvaluacionProveedor);//
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_periodoDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_evaluacion_proveedorDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setEnabled(isHabilitar && this.detalleevaluacionproveedorConstantesFunciones.activarid_si_noDetalleEvaluacionProveedor);
	};
	
	public void setDefaultControlesDetalleEvaluacionProveedor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionProveedor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(true);			
			this.detalleevaluacionproveedorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setVisible(true);
			
					
		} else {
			//this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);			
			this.detalleevaluacionproveedorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleEvaluacionProveedor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				if(detalleevaluacionproveedorAux.getId().equals(this.iIdNuevoDetalleEvaluacionProveedor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedors) {
				if(detalleevaluacionproveedorAux.getId().equals(this.iIdNuevoDetalleEvaluacionProveedor)) {
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
	
	public int getIndiceActualDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				if(detalleevaluacionproveedorAux.getId().equals(detalleevaluacionproveedor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedors) {
				if(detalleevaluacionproveedorAux.getId().equals(detalleevaluacionproveedor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				if(detalleevaluacionproveedorAux.getDetalleEvaluacionProveedorOriginal().getId().equals(detalleevaluacionproveedorOriginal.getId())) {
					existe=true;
					detalleevaluacionproveedorOriginal.setId(detalleevaluacionproveedorAux.getId());
					detalleevaluacionproveedorOriginal.setVersionRow(detalleevaluacionproveedorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedors) {
				if(detalleevaluacionproveedorAux.getDetalleEvaluacionProveedorOriginal().getId().equals(detalleevaluacionproveedorOriginal.getId())) {
					existe=true;
					detalleevaluacionproveedorOriginal.setId(detalleevaluacionproveedorAux.getId());
					detalleevaluacionproveedorOriginal.setVersionRow(detalleevaluacionproveedorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleEvaluacionProveedor(Boolean esParaCancelar) throws Exception {
		detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
		detalleevaluacionproveedorAux=new DetalleEvaluacionProveedor();
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
					if(detalleevaluacionproveedorAux.getId()<0) {
						detalleevaluacionproveedorsAux.add(detalleevaluacionproveedorAux);
					}		
				}
				this.iIdNuevoDetalleEvaluacionProveedor=0L;
				this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().removeAll(detalleevaluacionproveedorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedors) {
					if(detalleevaluacionproveedorAux.getId()<0) {
						detalleevaluacionproveedorsAux.add(detalleevaluacionproveedorAux);
					}		
				}
				this.iIdNuevoDetalleEvaluacionProveedor=0L;
				this.detalleevaluacionproveedors.removeAll(detalleevaluacionproveedorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleEvaluacionProveedor 
					&& this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()>0
					) {
					detalleevaluacionproveedorAux=this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().get(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size() - 1);
				
					if(detalleevaluacionproveedorAux.getId()<0) {
						this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().remove(detalleevaluacionproveedorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleEvaluacionProveedor && this.detalleevaluacionproveedors.size()>0) {
					detalleevaluacionproveedorAux=this.detalleevaluacionproveedors.get(this.detalleevaluacionproveedors.size() - 1);
				
					if(detalleevaluacionproveedorAux.getId()<0) {
						this.detalleevaluacionproveedors.remove(detalleevaluacionproveedorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleEvaluacionProveedor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleevaluacionproveedor.getId()<0) {
				this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().remove(this.detalleevaluacionproveedor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleevaluacionproveedor.getId()<0) {
				this.detalleevaluacionproveedors.remove(this.detalleevaluacionproveedor);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleEvaluacionProveedor(List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsAux) throws Exception {
		DetalleEvaluacionProveedorConstantesFunciones.setEstadosInicialesDetalleEvaluacionProveedor(detalleevaluacionproveedorsAux);
	}
	
	public void setEstadosInicialesDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedorAux) throws Exception {
		DetalleEvaluacionProveedorConstantesFunciones.setEstadosInicialesDetalleEvaluacionProveedor(detalleevaluacionproveedorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleEvaluacionProveedorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleEvaluacionProveedorActual()) {
				if(!this.isEsNuevoDetalleEvaluacionProveedor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleEvaluacionProveedor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleEvaluacionProveedorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Evaluacion Proveedor ?", "MANTENIMIENTO DE Detalle Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleEvaluacionProveedor detalleevaluacionproveedor) throws Exception {
		DetalleEvaluacionProveedorConstantesFunciones.seleccionarAsignar(this.detalleevaluacionproveedor,detalleevaluacionproveedor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleEvaluacionProveedor=this.isPermisoActualizarOriginalDetalleEvaluacionProveedor;
			
			
			this.seleccionarAsignar(detalleevaluacionproveedor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleEvaluacionProveedorConstantesFunciones.quitarEspaciosDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleevaluacionproveedorSessionBean.setsFuncionBusquedaRapida(this.detalleevaluacionproveedorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleEvaluacionProveedor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleEvaluacionProveedor(esParaCancelar);				
				this.cancelarNuevoDetalleEvaluacionProveedor(esParaCancelar);								
			}
			
			this.detalleevaluacionproveedor=new DetalleEvaluacionProveedor();
			
			this.inicializarDetalleEvaluacionProveedor();
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleEvaluacionProveedor() throws Exception {
		try {
			DetalleEvaluacionProveedorConstantesFunciones.inicializarDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleEvaluacionProveedors(String sAccionBusqueda,List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleEvaluacionProveedor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleEvaluacionProveedorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleEvaluacionProveedorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleEvaluacionProveedor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Evaluacion Proveedores");		
		parameters.put("busquedapor", DetalleEvaluacionProveedorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleEvaluacionProveedor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleEvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleEvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleEvaluacionProveedor=new JRBeanArrayDataSource(DetalleEvaluacionProveedorJInternalFrame.TraerDetalleEvaluacionProveedorBeans(detalleevaluacionproveedorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleEvaluacionProveedor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleEvaluacionProveedorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleEvaluacionProveedorBean.TraerDetalleEvaluacionProveedorBeans(detalleevaluacionproveedorsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedorActionPerformed(null);
					//this.generarExcelReporteDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionproveedorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionProveedors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleEvaluacionProveedor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleEvaluacionProveedor detalleevaluacionproveedor : detalleevaluacionproveedorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteDataDetalleEvaluacionProveedor("NORMAL",row,workbook,detalleevaluacionproveedor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleEvaluacionProveedor(String sTipo,Row row,Workbook workbook) {
		
		DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionProveedor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleEvaluacionProveedor detalleevaluacionproveedor : detalleevaluacionproveedorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.getDetalleEvaluacionProveedorDescripcion(detalleevaluacionproveedor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getevaluacionproveedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getpreguntaevaluacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getsino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionproveedor.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsRespaldo=null;
		
		classes=DetalleEvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleevaluacionproveedorLogic.setDatosCliente(this.datosCliente);
		this.detalleevaluacionproveedorLogic.setDatosDeep(this.datosDeep);
		this.detalleevaluacionproveedorLogic.setIsConDeep(true);
		
		detalleevaluacionproveedorsRespaldo=this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors();
		
		this.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(detalleevaluacionproveedorsParaReportes);	
		this.detalleevaluacionproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleevaluacionproveedorsParaReportes=this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors();
		this.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(detalleevaluacionproveedorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleEvaluacionProveedor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleEvaluacionProveedor detalleevaluacionproveedor : detalleevaluacionproveedorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleEvaluacionProveedor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteDataDetalleEvaluacionProveedor("NORMAL",row,workbook,detalleevaluacionproveedor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.getDetalleEvaluacionProveedorDescripcion(detalleevaluacionproveedor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleEvaluacionProveedor() throws Exception {		
		this.startProcessDetalleEvaluacionProveedor(true);
	}
	
	public void startProcessDetalleEvaluacionProveedor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleEvaluacionProveedor ,this.jPanelParametrosReportesDetalleEvaluacionProveedor, this.jScrollPanelDatosDetalleEvaluacionProveedor,this.jPanelPaginacionDetalleEvaluacionProveedor, this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor, this.jPanelAccionesDetalleEvaluacionProveedor,this.jPanelAccionesFormularioDetalleEvaluacionProveedor,this.jmenuBarDetalleEvaluacionProveedor,this.jmenuBarDetalleDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionProveedor=this.jTabbedPaneBusquedasDetalleEvaluacionProveedor; 
		
		final JPanel jPanelParametrosReportesDetalleEvaluacionProveedor=this.jPanelParametrosReportesDetalleEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosDetalleEvaluacionProveedor=this.jScrollPanelDatosDetalleEvaluacionProveedor;
		final JTable jTableDatosDetalleEvaluacionProveedor=this.jTableDatosDetalleEvaluacionProveedor;		
		final JPanel jPanelPaginacionDetalleEvaluacionProveedor=this.jPanelPaginacionDetalleEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionProveedor=this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor;
		final JPanel jPanelAccionesDetalleEvaluacionProveedor=this.jPanelAccionesDetalleEvaluacionProveedor;
		
		JPanel jPanelCamposAuxiliarDetalleEvaluacionProveedor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			jPanelCamposAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelCamposDetalleEvaluacionProveedor;
			jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelAccionesFormularioDetalleEvaluacionProveedor;
		}
		
		final JPanel jPanelCamposDetalleEvaluacionProveedor=jPanelCamposAuxiliarDetalleEvaluacionProveedor;
		final JPanel jPanelAccionesFormularioDetalleEvaluacionProveedor=jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor;
		
		
		final JMenuBar jmenuBarDetalleEvaluacionProveedor=this.jmenuBarDetalleEvaluacionProveedor;
		final JToolBar jTtoolBarDetalleEvaluacionProveedor=this.jTtoolBarDetalleEvaluacionProveedor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jmenuBarDetalleDetalleEvaluacionProveedor;
			jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTtoolBarDetalleDetalleEvaluacionProveedor;
		}
		
		final JMenuBar jmenuBarDetalleDetalleEvaluacionProveedor=jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor;
		final JToolBar jTtoolBarDetalleDetalleEvaluacionProveedor=jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleEvaluacionProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleEvaluacionProveedor;
			processRunnable.jTableDatos=jTableDatosDetalleEvaluacionProveedor;
			processRunnable.jPanelCampos=jPanelCamposDetalleEvaluacionProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleEvaluacionProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleEvaluacionProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleEvaluacionProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleEvaluacionProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleEvaluacionProveedor;
			processRunnable.jTtoolBar=jTtoolBarDetalleEvaluacionProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleEvaluacionProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleEvaluacionProveedor ,jPanelParametrosReportesDetalleEvaluacionProveedor,jTableDatosDetalleEvaluacionProveedor, /*jScrollPanelDatosDetalleEvaluacionProveedor,*/jPanelCamposDetalleEvaluacionProveedor,jPanelPaginacionDetalleEvaluacionProveedor, /*jScrollPanelDatosEdicionDetalleEvaluacionProveedor,*/ jPanelAccionesDetalleEvaluacionProveedor,jPanelAccionesFormularioDetalleEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jmenuBarDetalleDetalleEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor,jTtoolBarDetalleDetalleEvaluacionProveedor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleEvaluacionProveedor ,jPanelParametrosReportesDetalleEvaluacionProveedor, jScrollPanelDatosDetalleEvaluacionProveedor,jPanelPaginacionDetalleEvaluacionProveedor, jScrollPanelDatosEdicionDetalleEvaluacionProveedor, jPanelAccionesDetalleEvaluacionProveedor,jPanelAccionesFormularioDetalleEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jmenuBarDetalleDetalleEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor,jTtoolBarDetalleDetalleEvaluacionProveedor);
						
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
	
	public void finishProcessDetalleEvaluacionProveedor() {// throws Exception 
		this.finishProcessDetalleEvaluacionProveedor(true);
	}
	
	public void finishProcessDetalleEvaluacionProveedor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleEvaluacionProveedor ,this.jPanelParametrosReportesDetalleEvaluacionProveedor, this.jScrollPanelDatosDetalleEvaluacionProveedor,this.jPanelPaginacionDetalleEvaluacionProveedor, this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor, this.jPanelAccionesDetalleEvaluacionProveedor,this.jPanelAccionesFormularioDetalleEvaluacionProveedor,this.jmenuBarDetalleEvaluacionProveedor,this.jmenuBarDetalleDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionProveedor=this.jTabbedPaneBusquedasDetalleEvaluacionProveedor; 
		
		final JPanel jPanelParametrosReportesDetalleEvaluacionProveedor=this.jPanelParametrosReportesDetalleEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosDetalleEvaluacionProveedor=this.jScrollPanelDatosDetalleEvaluacionProveedor;
		final JTable jTableDatosDetalleEvaluacionProveedor=this.jTableDatosDetalleEvaluacionProveedor;		
		final JPanel jPanelPaginacionDetalleEvaluacionProveedor=this.jPanelPaginacionDetalleEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionProveedor=this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor;
		final JPanel jPanelAccionesDetalleEvaluacionProveedor=this.jPanelAccionesDetalleEvaluacionProveedor;
		
		JPanel jPanelCamposAuxiliarDetalleEvaluacionProveedor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			jPanelCamposAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelCamposDetalleEvaluacionProveedor;
			jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelAccionesFormularioDetalleEvaluacionProveedor;
		}
		
		final JPanel jPanelCamposDetalleEvaluacionProveedor=jPanelCamposAuxiliarDetalleEvaluacionProveedor;
		final JPanel jPanelAccionesFormularioDetalleEvaluacionProveedor=jPanelAccionesFormularioAuxiliarDetalleEvaluacionProveedor;
		
		
		final JMenuBar jmenuBarDetalleEvaluacionProveedor=this.jmenuBarDetalleEvaluacionProveedor;		
		final JToolBar jTtoolBarDetalleEvaluacionProveedor=this.jTtoolBarDetalleEvaluacionProveedor;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jmenuBarDetalleDetalleEvaluacionProveedor;
			jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTtoolBarDetalleDetalleEvaluacionProveedor;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleEvaluacionProveedor=jmenuBarDetalleAuxiliarDetalleEvaluacionProveedor;
		final JToolBar jTtoolBarDetalleDetalleEvaluacionProveedor=jTtoolBarDetalleAuxiliarDetalleEvaluacionProveedor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleEvaluacionProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleEvaluacionProveedor;
			processRunnable.jTableDatos=jTableDatosDetalleEvaluacionProveedor;
			processRunnable.jPanelCampos=jPanelCamposDetalleEvaluacionProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleEvaluacionProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleEvaluacionProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleEvaluacionProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleEvaluacionProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleEvaluacionProveedor;
			processRunnable.jTtoolBar=jTtoolBarDetalleEvaluacionProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleEvaluacionProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleEvaluacionProveedor ,jPanelParametrosReportesDetalleEvaluacionProveedor, jTableDatosDetalleEvaluacionProveedor,/*jScrollPanelDatosDetalleEvaluacionProveedor,*/jPanelCamposDetalleEvaluacionProveedor,jPanelPaginacionDetalleEvaluacionProveedor, /*jScrollPanelDatosEdicionDetalleEvaluacionProveedor,*/ jPanelAccionesDetalleEvaluacionProveedor,jPanelAccionesFormularioDetalleEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jmenuBarDetalleDetalleEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor,jTtoolBarDetalleDetalleEvaluacionProveedor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleEvaluacionProveedor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleEvaluacionProveedor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleEvaluacionProveedor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleEvaluacionProveedor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleevaluacionproveedorConstantesFunciones.getsFinalQueryDetalleEvaluacionProveedor();
		String  finalQueryPaginacionTodos=this.detalleevaluacionproveedorConstantesFunciones.getsFinalQueryDetalleEvaluacionProveedor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleEvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesNoDetalleEvaluacionProveedor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleEvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesDetalleEvaluacionProveedor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleEvaluacionProveedorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleevaluacionproveedorsEliminados= new ArrayList<DetalleEvaluacionProveedor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleEvaluacionProveedor();
		
				///*DetalleEvaluacionProveedorSessionBean*/this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			
			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
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
					this.iNumeroPaginacion=DetalleEvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleEvaluacionProveedorConstantesFunciones.getClassesForeignKeysOfDetalleEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleevaluacionproveedor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleevaluacionproveedorsAux= new ArrayList<DetalleEvaluacionProveedor>();
			
				
			detalleevaluacionproveedorLogic.setDatosCliente(this.datosCliente);
			detalleevaluacionproveedorLogic.setDatosDeep(this.datosDeep);
			detalleevaluacionproveedorLogic.setIsConDeep(true);
			
			
			detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleevaluacionproveedorLogic.getTodosDetalleEvaluacionProveedors(finalQueryGlobal,pagination);
					
					//detalleevaluacionproveedorLogic.getTodosDetalleEvaluacionProveedorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null|| detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionproveedorsAux= new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux= new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionproveedorLogic.getTodosDetalleEvaluacionProveedors(finalQueryGlobal+"",this.pagination);												
							
							//detalleevaluacionproveedorLogic.getTodosDetalleEvaluacionProveedorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());					
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleEvaluacionProveedor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleEvaluacionProveedor=this.idActual;
				
				} else if(this.idDetalleEvaluacionProveedorActual!=null && this.idDetalleEvaluacionProveedorActual!=0L) {
					idDetalleEvaluacionProveedor=idDetalleEvaluacionProveedorActual;
				}
				
					
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndicePorId(idDetalleEvaluacionProveedor);
				
				this.detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleevaluacionproveedorLogic.getEntity(idDetalleEvaluacionProveedor);
					
					//detalleevaluacionproveedorLogic.getEntityWithConnection(idDetalleEvaluacionProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().add(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
					this.detalleevaluacionproveedors.add(detalleevaluacionproveedor);
				}
				
				if(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEjercicio",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEjercicio",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEmpresa",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEmpresa",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEvaluacionProveedor")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEvaluacionProveedor(id_evaluacion_proveedorFK_IdEvaluacionProveedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor(finalQueryGlobal,pagination,id_evaluacion_proveedorFK_IdEvaluacionProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEvaluacionProveedor(id_evaluacion_proveedorFK_IdEvaluacionProveedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEvaluacionProveedor(id_evaluacion_proveedorFK_IdEvaluacionProveedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor(finalQueryGlobal,pagination,id_evaluacion_proveedorFK_IdEvaluacionProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEvaluacionProveedor(id_evaluacion_proveedorFK_IdEvaluacionProveedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEvaluacionProveedor(id_evaluacion_proveedorFK_IdEvaluacionProveedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEvaluacionProveedor",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdEvaluacionProveedor",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdPeriodo",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdPeriodo",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPreguntaEvaluacion")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion(finalQueryGlobal,pagination,id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion(finalQueryGlobal,pagination,id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdPreguntaEvaluacion",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdPreguntaEvaluacion",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSiNo")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSiNo(id_si_noFK_IdSiNo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSiNo(finalQueryGlobal,pagination,id_si_noFK_IdSiNo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSiNo(id_si_noFK_IdSiNo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSiNo(id_si_noFK_IdSiNo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSiNo(finalQueryGlobal,pagination,id_si_noFK_IdSiNo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSiNo(id_si_noFK_IdSiNo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSiNo(id_si_noFK_IdSiNo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSiNo",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSiNo",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSubPreguntaEvaluacion")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSubPreguntaEvaluacion(id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion(finalQueryGlobal,pagination,id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSubPreguntaEvaluacion(id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSubPreguntaEvaluacion(id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion(finalQueryGlobal,pagination,id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSubPreguntaEvaluacion(id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSubPreguntaEvaluacion(id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSubPreguntaEvaluacion",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSubPreguntaEvaluacion",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()==null||detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionproveedors==null|| detalleevaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
						detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorsAux=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedorsAux.addAll(detalleevaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSucursal",detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionProveedors("FK_IdSucursal",detalleevaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
						detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(detalleevaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedors=new ArrayList<DetalleEvaluacionProveedor>();
							detalleevaluacionproveedors.addAll(detalleevaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleEvaluacionProveedor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleEvaluacionProveedor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionproveedors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionproveedors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleEvaluacionProveedor detalleevaluacionproveedor) {
		Boolean permite=true;
		
		if(this.detalleevaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleEvaluacionProveedorConstantesFunciones.getOrderByListaDetalleEvaluacionProveedor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleEvaluacionProveedorConstantesFunciones.getOrderByListaDetalleEvaluacionProveedor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				if(detalleevaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionproveedorTotales=detalleevaluacionproveedor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedor:this.detalleevaluacionproveedors) {
				if(detalleevaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionproveedorTotales=detalleevaluacionproveedor;
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
			this.detalleevaluacionproveedorAux=new DetalleEvaluacionProveedor();
			this.detalleevaluacionproveedorAux.setsType(Constantes2.S_TOTALES);
			this.detalleevaluacionproveedorAux.setIsNew(false);
			this.detalleevaluacionproveedorAux.setIsChanged(false);
			this.detalleevaluacionproveedorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleEvaluacionProveedorConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionProveedor(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.detalleevaluacionproveedorAux);
				
				this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().add(this.detalleevaluacionproveedorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleEvaluacionProveedorConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionProveedor(this.detalleevaluacionproveedors,this.detalleevaluacionproveedorAux);
				
				this.detalleevaluacionproveedors.add(this.detalleevaluacionproveedorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleevaluacionproveedorTotales=new DetalleEvaluacionProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().remove(detalleevaluacionproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleevaluacionproveedors.remove(detalleevaluacionproveedorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleevaluacionproveedorTotales=new DetalleEvaluacionProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				if(detalleevaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionproveedorTotales=detalleevaluacionproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleEvaluacionProveedorConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionProveedor(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),detalleevaluacionproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedor:this.detalleevaluacionproveedors) {
				if(detalleevaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionproveedorTotales=detalleevaluacionproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleEvaluacionProveedorConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionProveedor(this.detalleevaluacionproveedors,detalleevaluacionproveedorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleEvaluacionProveedorsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdEvaluacionProveedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdPreguntaEvaluacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSiNo()throws Exception {
		try {
			sAccionBusqueda="FK_IdSiNo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdSubPreguntaEvaluacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleEvaluacionProveedorsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor(String sFinalQuery,Long id_evaluacion_proveedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor(sFinalQuery,this.pagination,id_evaluacion_proveedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion(String sFinalQuery,Long id_pregunta_evaluacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion(sFinalQuery,this.pagination,id_pregunta_evaluacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSiNo(String sFinalQuery,Long id_si_no)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSiNo(sFinalQuery,this.pagination,id_si_no);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion(String sFinalQuery,Long id_sub_pregunta_evaluacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion(sFinalQuery,this.pagination,id_sub_pregunta_evaluacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionProveedorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetalleEvaluacionProveedor() {
		this.isPermisoTodoDetalleEvaluacionProveedor=false;
		this.isPermisoNuevoDetalleEvaluacionProveedor=false;
		this.isPermisoActualizarDetalleEvaluacionProveedor=false;
		this.isPermisoActualizarOriginalDetalleEvaluacionProveedor=false;
		this.isPermisoEliminarDetalleEvaluacionProveedor=false;
		this.isPermisoGuardarCambiosDetalleEvaluacionProveedor=false;
		this.isPermisoConsultaDetalleEvaluacionProveedor=false;
		this.isPermisoBusquedaDetalleEvaluacionProveedor=false;
		this.isPermisoReporteDetalleEvaluacionProveedor=false;		
		this.isPermisoOrdenDetalleEvaluacionProveedor=false;		
		this.isPermisoPaginacionMedioDetalleEvaluacionProveedor=false;		
		this.isPermisoPaginacionAltoDetalleEvaluacionProveedor=false;
		this.isPermisoPaginacionTodoDetalleEvaluacionProveedor=false;
		this.isPermisoCopiarDetalleEvaluacionProveedor=false;		
		this.isPermisoVerFormDetalleEvaluacionProveedor=false;		
		this.isPermisoDuplicarDetalleEvaluacionProveedor=false;		
		this.isPermisoOrdenDetalleEvaluacionProveedor=false;		
	}
	
	public void setPermisosUsuarioDetalleEvaluacionProveedor(Boolean isPermiso) {
		this.isPermisoTodoDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoNuevoDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarOriginalDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoEliminarDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoGuardarCambiosDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoConsultaDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoBusquedaDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoReporteDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoOrdenDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionMedioDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionAltoDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionTodoDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoCopiarDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoVerFormDetalleEvaluacionProveedor=isPermiso;		
		this.isPermisoDuplicarDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoOrdenDetalleEvaluacionProveedor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleEvaluacionProveedor(Boolean isPermiso) {
		//this.isPermisoTodoDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoNuevoDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarOriginalDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoEliminarDetalleEvaluacionProveedor=isPermiso;
		this.isPermisoGuardarCambiosDetalleEvaluacionProveedor=isPermiso;
		//this.isPermisoConsultaDetalleEvaluacionProveedor=isPermiso;
		//this.isPermisoBusquedaDetalleEvaluacionProveedor=isPermiso;
		//this.isPermisoReporteDetalleEvaluacionProveedor=isPermiso;
		//this.isPermisoOrdenDetalleEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleEvaluacionProveedor=isPermiso;		
		//this.isPermisoCopiarDetalleEvaluacionProveedor=isPermiso;		
		//this.isPermisoDuplicarDetalleEvaluacionProveedor=isPermiso;
		//this.isPermisoOrdenDetalleEvaluacionProveedor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleEvaluacionProveedorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleEvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleEvaluacionProveedorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleEvaluacionProveedorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleEvaluacionProveedorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleEvaluacionProveedorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleEvaluacionProveedor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleEvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleEvaluacionProveedor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleEvaluacionProveedor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleEvaluacionProveedor=this.isPermisoActualizarDetalleEvaluacionProveedor;
			this.isPermisoEliminarDetalleEvaluacionProveedor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleEvaluacionProveedor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleEvaluacionProveedor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleEvaluacionProveedor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleEvaluacionProveedor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleEvaluacionProveedor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleEvaluacionProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleEvaluacionProveedor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleEvaluacionProveedor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleEvaluacionProveedor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleEvaluacionProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleEvaluacionProveedor.setToolTipText(this.jTableDatosDetalleEvaluacionProveedor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleEvaluacionProveedor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleEvaluacionProveedor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleEvaluacionProveedor() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleEvaluacionProveedorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.evaluacionproveedorsForeignKey=new ArrayList();
				this.preguntaevaluacionsForeignKey=new ArrayList();
				this.subpreguntaevaluacionsForeignKey=new ArrayList();
				this.sinosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleEvaluacionProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleEvaluacionProveedorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleEvaluacionProveedorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEvaluacionProveedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySubPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySiNoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEvaluacionProveedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.evaluacionproveedorsForeignKey==null||this.evaluacionproveedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesEvaluacionProveedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionProveedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EvaluacionProveedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosEvaluacionProveedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPreguntaEvaluacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.preguntaevaluacionsForeignKey==null||this.preguntaevaluacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaEvaluacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PreguntaEvaluacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySubPreguntaEvaluacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.subpreguntaevaluacionsForeignKey==null||this.subpreguntaevaluacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SubPreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesSubPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SubPreguntaEvaluacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SubPreguntaEvaluacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosSubPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySiNoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sinosForeignKey==null||this.sinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SiNoConstantesFunciones.getArrayColumnasGlobalesSiNo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SiNoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SiNoConstantesFunciones.SFINALQUERY;

				this.cargarCombosSiNosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleEvaluacionProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorReturnGeneral=new DetalleEvaluacionProveedorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_empresaDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_empresaDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_sucursalDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_sucursalDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_ejercicioDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_ejercicioDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_periodoDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_periodoDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalEvaluacionProveedor="";

				if(((this.evaluacionproveedorsForeignKey==null||this.evaluacionproveedorsForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_evaluacion_proveedorDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_evaluacion_proveedorDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionProveedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesEvaluacionProveedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEvaluacionProveedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionProveedorConstantesFunciones.TABLENAME);

						finalQueryGlobalEvaluacionProveedor=Funciones.GetFinalQueryAppend(finalQueryGlobalEvaluacionProveedor, "");
						finalQueryGlobalEvaluacionProveedor+=EvaluacionProveedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEvaluacionProveedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEvaluacionProveedor=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidEvaluacionProveedorActual();
					}
				} else {
					finalQueryGlobalEvaluacionProveedor="NONE";
				}


				String finalQueryGlobalPreguntaEvaluacion="";

				if(((this.preguntaevaluacionsForeignKey==null||this.preguntaevaluacionsForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_pregunta_evaluacionDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_pregunta_evaluacionDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPreguntaEvaluacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaEvaluacionConstantesFunciones.TABLENAME);

						finalQueryGlobalPreguntaEvaluacion=Funciones.GetFinalQueryAppend(finalQueryGlobalPreguntaEvaluacion, "");
						finalQueryGlobalPreguntaEvaluacion+=PreguntaEvaluacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPreguntaEvaluacion=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidPreguntaEvaluacionActual();
					}
				} else {
					finalQueryGlobalPreguntaEvaluacion="NONE";
				}


				String finalQueryGlobalSubPreguntaEvaluacion="";

				if(((this.subpreguntaevaluacionsForeignKey==null||this.subpreguntaevaluacionsForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSubPreguntaEvaluacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SubPreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesSubPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSubPreguntaEvaluacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SubPreguntaEvaluacionConstantesFunciones.TABLENAME);

						finalQueryGlobalSubPreguntaEvaluacion=Funciones.GetFinalQueryAppend(finalQueryGlobalSubPreguntaEvaluacion, "");
						finalQueryGlobalSubPreguntaEvaluacion+=SubPreguntaEvaluacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSubPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSubPreguntaEvaluacion=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidSubPreguntaEvaluacionActual();
					}
				} else {
					finalQueryGlobalSubPreguntaEvaluacion="NONE";
				}


				String finalQueryGlobalSiNo="";

				if(((this.sinosForeignKey==null||this.sinosForeignKey.size()<=0) && this.detalleevaluacionproveedorConstantesFunciones.cargarid_si_noDetalleEvaluacionProveedor)
					 || (this.esRecargarFks && this.detalleevaluacionproveedorConstantesFunciones.cargarid_si_noDetalleEvaluacionProveedor)) {

					if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSiNo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SiNoConstantesFunciones.getArrayColumnasGlobalesSiNo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSiNo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SiNoConstantesFunciones.TABLENAME);

						finalQueryGlobalSiNo=Funciones.GetFinalQueryAppend(finalQueryGlobalSiNo, "");
						finalQueryGlobalSiNo+=SiNoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSiNosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSiNo=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionproveedorSessionBean.getlidSiNoActual();
					}
				} else {
					finalQueryGlobalSiNo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.cargarCombosLoteForeignKeyDetalleEvaluacionProveedor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalEvaluacionProveedor,finalQueryGlobalPreguntaEvaluacion,finalQueryGlobalSubPreguntaEvaluacion,finalQueryGlobalSiNo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleevaluacionproveedorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleevaluacionproveedorReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detalleevaluacionproveedorReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detalleevaluacionproveedorReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalEvaluacionProveedor.equals("NONE")) {
				this.evaluacionproveedorsForeignKey=detalleevaluacionproveedorReturnGeneral.getevaluacionproveedorsForeignKey();
			}

			if(!finalQueryGlobalPreguntaEvaluacion.equals("NONE")) {
				this.preguntaevaluacionsForeignKey=detalleevaluacionproveedorReturnGeneral.getpreguntaevaluacionsForeignKey();
			}

			if(!finalQueryGlobalSubPreguntaEvaluacion.equals("NONE")) {
				this.subpreguntaevaluacionsForeignKey=detalleevaluacionproveedorReturnGeneral.getsubpreguntaevaluacionsForeignKey();
			}

			if(!finalQueryGlobalSiNo.equals("NONE")) {
				this.sinosForeignKey=detalleevaluacionproveedorReturnGeneral.getsinosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleEvaluacionProveedor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEvaluacionProveedor();
			this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
			this.addItemDefectoCombosForeignKeySubPreguntaEvaluacion();
			this.addItemDefectoCombosForeignKeySiNo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleevaluacionproveedorSessionBean==null) {
				this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyEvaluacionProveedor()throws Exception {
		try {

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionProveedor()) {
				EvaluacionProveedor evaluacionproveedor=new EvaluacionProveedor();
				EvaluacionProveedorConstantesFunciones.setEvaluacionProveedorDescripcion(evaluacionproveedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				evaluacionproveedor.setId(null);

				if(!EvaluacionProveedorConstantesFunciones.ExisteEnLista(this.evaluacionproveedorsForeignKey,evaluacionproveedor,true)) {

					this.evaluacionproveedorsForeignKey.add(0,evaluacionproveedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPreguntaEvaluacion()throws Exception {
		try {

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {
				PreguntaEvaluacion preguntaevaluacion=new PreguntaEvaluacion();
				PreguntaEvaluacionConstantesFunciones.setPreguntaEvaluacionDescripcion(preguntaevaluacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				preguntaevaluacion.setId(null);

				if(!PreguntaEvaluacionConstantesFunciones.ExisteEnLista(this.preguntaevaluacionsForeignKey,preguntaevaluacion,true)) {

					this.preguntaevaluacionsForeignKey.add(0,preguntaevaluacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySubPreguntaEvaluacion()throws Exception {
		try {

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSubPreguntaEvaluacion()) {
				SubPreguntaEvaluacion subpreguntaevaluacion=new SubPreguntaEvaluacion();
				SubPreguntaEvaluacionConstantesFunciones.setSubPreguntaEvaluacionDescripcion(subpreguntaevaluacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				subpreguntaevaluacion.setId(null);

				if(!SubPreguntaEvaluacionConstantesFunciones.ExisteEnLista(this.subpreguntaevaluacionsForeignKey,subpreguntaevaluacion,true)) {

					this.subpreguntaevaluacionsForeignKey.add(0,subpreguntaevaluacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySiNo()throws Exception {
		try {

			if(!this.detalleevaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSiNo()) {
				SiNo sino=new SiNo();
				SiNoConstantesFunciones.setSiNoDescripcion(sino,Constantes.SMENSAJE_ESCOJA_OPCION);
				sino.setId(null);

				if(!SiNoConstantesFunciones.ExisteEnLista(this.sinosForeignKey,sino,true)) {

					this.sinosForeignKey.add(0,sino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleEvaluacionProveedor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleEvaluacionProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleEvaluacionProveedor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionProveedor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor)throws Exception {	
		try {
			
			this.setActualEvaluacionProveedorForeignKey(detalleevaluacionproveedor.getid_evaluacion_proveedor(),false,"Formulario");
			this.setActualPreguntaEvaluacionForeignKey(detalleevaluacionproveedor.getid_pregunta_evaluacion(),false,"Formulario");
			this.setActualSubPreguntaEvaluacionForeignKey(detalleevaluacionproveedor.getid_sub_pregunta_evaluacion(),false,"Formulario");
			this.setActualSiNoForeignKey(detalleevaluacionproveedor.getid_si_no(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleEvaluacionProveedor()throws Exception {	
		try {
			
			this.setActualEvaluacionProveedorForeignKey(this.detalleevaluacionproveedorConstantesFunciones.getid_evaluacion_proveedor(),false,"Formulario");
			this.setActualPreguntaEvaluacionForeignKey(this.detalleevaluacionproveedorConstantesFunciones.getid_pregunta_evaluacion(),false,"Formulario");
			this.setActualSubPreguntaEvaluacionForeignKey(this.detalleevaluacionproveedorConstantesFunciones.getid_sub_pregunta_evaluacion(),false,"Formulario");
			this.setActualSiNoForeignKey(this.detalleevaluacionproveedorConstantesFunciones.getid_si_no(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionProveedor()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleEvaluacionProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleEvaluacionProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleEvaluacionProveedor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleEvaluacionProveedor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEvaluacionProveedorsForeignKey("Todos");
			this.cargarCombosFramePreguntaEvaluacionsForeignKey("Todos");
			this.cargarCombosFrameSubPreguntaEvaluacionsForeignKey("Todos");
			this.cargarCombosFrameSiNosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleEvaluacionProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEvaluacionProveedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSubPreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSiNosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleEvaluacionProveedor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DetalleEvaluacionProveedorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean(); 
		this.detalleevaluacionproveedorConstantesFunciones=new DetalleEvaluacionProveedorConstantesFunciones(); 
		this.detalleevaluacionproveedorBean=new DetalleEvaluacionProveedor();//(this.detalleevaluacionproveedorConstantesFunciones); 		
		this.detalleevaluacionproveedorReturnGeneral=new DetalleEvaluacionProveedorParameterReturnGeneral(); 
		
		this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleEvaluacionProveedor(true);
			
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
			
			this.detalleevaluacionproveedorConstantesFunciones=new DetalleEvaluacionProveedorConstantesFunciones(); 
			this.detalleevaluacionproveedorBean=new DetalleEvaluacionProveedor();//this.detalleevaluacionproveedorConstantesFunciones); 			
			this.detalleevaluacionproveedorReturnGeneral=new DetalleEvaluacionProveedorParameterReturnGeneral(); 
		
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Evaluacion Proveedor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detalleevaluacionproveedor=new DetalleEvaluacionProveedor();
			this.detalleevaluacionproveedors = new ArrayList<DetalleEvaluacionProveedor>();
			this.detalleevaluacionproveedorsAux = new ArrayList<DetalleEvaluacionProveedor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic=new DetalleEvaluacionProveedorLogic();
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor);	
					}
					
					if(this.jInternalFrameImportacionDetalleEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleEvaluacionProveedor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleEvaluacionProveedor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor);
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setVisible(false);
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor);
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleEvaluacionProveedor);
					this.jInternalFrameImportacionDetalleEvaluacionProveedor.setVisible(false);
					this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleEvaluacionProveedor);
					this.jInternalFrameOrderByDetalleEvaluacionProveedor.setVisible(false);
					this.jInternalFrameOrderByDetalleEvaluacionProveedor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleEvaluacionProveedorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleEvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleevaluacionproveedorReturnGeneral=new DetalleEvaluacionProveedorParameterReturnGeneral();
			
			this.detalleevaluacionproveedorParameterGeneral=new DetalleEvaluacionProveedorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEvaluacionProveedor=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdPreguntaEvaluacion=true;
			this.isVisibilidadFK_IdSiNo=true;
			this.isVisibilidadFK_IdSubPreguntaEvaluacion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleEvaluacionProveedor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleEvaluacionProveedor(false);
			
			this.setPermisosUsuarioDetalleEvaluacionProveedor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleEvaluacionProveedorClasesRelacionadas();
			}
			
			if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleEvaluacionProveedorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleEvaluacionProveedor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionProveedor();
			}
			
			if(!this.isPermisoBusquedaDetalleEvaluacionProveedor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleEvaluacionProveedor,this.isPermisoPaginacionMedioDetalleEvaluacionProveedor,this.isPermisoPaginacionTodoDetalleEvaluacionProveedor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleEvaluacionProveedorConstantesFunciones.getTiposSeleccionarDetalleEvaluacionProveedor());
				
				this.tiposColumnasSelect=DetalleEvaluacionProveedorConstantesFunciones.getTiposSeleccionarDetalleEvaluacionProveedor(true);
				
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
			//if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleEvaluacionProveedor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleEvaluacionProveedor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleEvaluacionProveedor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionProveedor() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.evaluacionproveedorLogic=new EvaluacionProveedorLogic();
			this.preguntaevaluacionLogic=new PreguntaEvaluacionLogic();
			this.subpreguntaevaluacionLogic=new SubPreguntaEvaluacionLogic();
			this.sinoLogic=new SiNoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleevaluacionproveedorImplementable= (DetalleEvaluacionProveedorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleEvaluacionProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleevaluacionproveedorImplementableHome= (DetalleEvaluacionProveedorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleEvaluacionProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
			this.detalleevaluacionproveedorsEliminados= new ArrayList<DetalleEvaluacionProveedor>();
						
			this.isEsNuevoDetalleEvaluacionProveedor=false;
			this.esParaAccionDesdeFormularioDetalleEvaluacionProveedor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.evaluacionproveedorsForeignKey=new ArrayList<EvaluacionProveedor>() ;
			this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>() ;
			this.subpreguntaevaluacionsForeignKey=new ArrayList<SubPreguntaEvaluacion>() ;
			this.sinosForeignKey=new ArrayList<SiNo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleEvaluacionProveedor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleEvaluacionProveedor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleEvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleEvaluacionProveedor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleEvaluacionProveedor();
			}
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleEvaluacionProveedor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleEvaluacionProveedor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleEvaluacionProveedor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleEvaluacionProveedor")) {
				iIndex=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleEvaluacionProveedor();	
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
	
	public void cargarCombosForeignKeyDetalleEvaluacionProveedor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleEvaluacionProveedor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleEvaluacionProveedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleEvaluacionProveedorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleEvaluacionProveedor();
		
		this.cargarCombosFrameForeignKeyDetalleEvaluacionProveedor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleEvaluacionProveedor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionProveedor();
		}
	}
	
	

	public void cargarCombosForeignKeyEvaluacionProveedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEvaluacionProveedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEvaluacionProveedor();
				this.cargarCombosFrameEvaluacionProveedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEvaluacionProveedor(this.evaluacionproveedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPreguntaEvaluacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
				this.cargarCombosFramePreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPreguntaEvaluacion(this.preguntaevaluacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySubPreguntaEvaluacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySubPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySubPreguntaEvaluacion();
				this.cargarCombosFrameSubPreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSubPreguntaEvaluacion(this.subpreguntaevaluacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySiNo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySiNoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySiNo();
				this.cargarCombosFrameSiNosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSiNo(this.sinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			
			if(jTableDatosDetalleEvaluacionProveedor.getRowCount()>=1) {
				jTableDatosDetalleEvaluacionProveedor.removeRowSelectionInterval(0, jTableDatosDetalleEvaluacionProveedor.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleEvaluacionProveedor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionProveedor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(true);			
			//this.detalleevaluacionproveedor=new DetalleEvaluacionProveedor();
			//this.detalleevaluacionproveedor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor() ;
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionProveedor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleevaluacionproveedor);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);				
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleEvaluacionProveedor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRows().length;			
			}
			
			detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleEvaluacionProveedor--;			
				//DetalleEvaluacionProveedor detalleevaluacionproveedorAux= new DetalleEvaluacionProveedor();			
				//detalleevaluacionproveedorAux.setId(this.iIdNuevoDetalleEvaluacionProveedor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleEvaluacionProveedor detalleevaluacionproveedorOrigen=new DetalleEvaluacionProveedor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorOrigen : detalleevaluacionproveedorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleevaluacionproveedorOrigen =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionproveedorOrigen =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleEvaluacionProveedor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleevaluacionproveedor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleEvaluacionProveedor(detalleevaluacionproveedorOrigen,this.detalleevaluacionproveedor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().add(this.detalleevaluacionproveedorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedors.add(this.detalleevaluacionproveedorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
				
				this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionProveedor(), this.getIndiceNuevoDetalleEvaluacionProveedor());
				
				int iLastRow =  this.jTableDatosDetalleEvaluacionProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleEvaluacionProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleEvaluacionProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();									
		
			DetalleEvaluacionProveedor detalleevaluacionproveedorOrigen=new DetalleEvaluacionProveedor();
			DetalleEvaluacionProveedor detalleevaluacionproveedorDestino=new DetalleEvaluacionProveedor();
				
			detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleevaluacionproveedorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleEvaluacionProveedor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorOrigen =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleevaluacionproveedorOrigen =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionproveedorDestino =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleevaluacionproveedorDestino =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleevaluacionproveedorOrigen =detalleevaluacionproveedorsSeleccionados.get(0);
				detalleevaluacionproveedorDestino =detalleevaluacionproveedorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleEvaluacionProveedor(detalleevaluacionproveedorOrigen,detalleevaluacionproveedorDestino,true,false);
				
				detalleevaluacionproveedorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleevaluacionproveedorDestino,detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionproveedorDestino,detalleevaluacionproveedors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
				
				//this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionProveedor(), this.getIndiceNuevoDetalleEvaluacionProveedor());
				
				int iLastRow =  this.jTableDatosDetalleEvaluacionProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleEvaluacionProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleEvaluacionProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleEvaluacionProveedor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(!isVisible);
			this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(!isVisible);
			this.jPanelAccionesDetalleEvaluacionProveedor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleEvaluacionProveedor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleEvaluacionProveedor();
			
			this.abrirFrameOrderByDetalleEvaluacionProveedor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleEvaluacionProveedor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleEvaluacionProveedor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSize(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.iWidthFormulario,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jContentPaneDetalleDetalleEvaluacionProveedor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jContentPaneDetalleDetalleEvaluacionProveedor.getWidth(),DetalleEvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jContentPaneDetalleDetalleEvaluacionProveedor.getWidth(),DetalleEvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jContentPaneDetalleDetalleEvaluacionProveedor.getWidth(),DetalleEvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleEvaluacionProveedor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionProveedor,false,this);
				} else {
					this.jInternalFrameOrderByDetalleEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionProveedor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleEvaluacionProveedor);
				this.jInternalFrameOrderByDetalleEvaluacionProveedor.setVisible(false);
				this.jInternalFrameOrderByDetalleEvaluacionProveedor.setSelected(false);
				
				this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleEvaluacionProveedor"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleEvaluacionProveedor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleEvaluacionProveedor==null) {
				
				this.jInternalFrameImportacionDetalleEvaluacionProveedor=new ImportacionJInternalFrame(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleEvaluacionProveedor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleEvaluacionProveedor);
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.setVisible(false);
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSelected(false);


				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleEvaluacionProveedor"));
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleEvaluacionProveedor"));
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleEvaluacionProveedor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor==null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor=new ReporteDinamicoJInternalFrame(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor);
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionProveedor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionProveedor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleEvaluacionProveedor);
			
	       	this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.dispose();
			//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleEvaluacionProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleEvaluacionProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameOrderByDetalleEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleEvaluacionProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameOrderByDetalleEvaluacionProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleEvaluacionProveedor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleEvaluacionProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleEvaluacionProveedor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleEvaluacionProveedor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(true);
			//this.isEsNuevoDetalleEvaluacionProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false) ;
			
			if(detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionProveedor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleEvaluacionProveedorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleEvaluacionProveedor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(true);
			//this.isEsNuevoDetalleEvaluacionProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleevaluacionproveedor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false) ;
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionProveedor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaEvaluacionProveedor(List<EvaluacionProveedor> evaluacionproveedorsForeignKey)throws Exception{
		TableColumn tableColumnEvaluacionProveedor=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR));
		TableCellEditor tableCellEditorEvaluacionProveedor =tableColumnEvaluacionProveedor.getCellEditor();

		EvaluacionProveedorTableCell evaluacionproveedorTableCellFk=(EvaluacionProveedorTableCell)tableCellEditorEvaluacionProveedor;

		if(evaluacionproveedorTableCellFk!=null) {
			evaluacionproveedorTableCellFk.setevaluacionproveedorsForeignKey(evaluacionproveedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//evaluacionproveedorTableCellFk.setRowActual(intSelectedRow);
			//evaluacionproveedorTableCellFk.setevaluacionproveedorsForeignKeyActual(evaluacionproveedorsForeignKey);
		//}


		if(evaluacionproveedorTableCellFk!=null) {
			evaluacionproveedorTableCellFk.RecargarEvaluacionProveedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPreguntaEvaluacion(List<PreguntaEvaluacion> preguntaevaluacionsForeignKey)throws Exception{
		TableColumn tableColumnPreguntaEvaluacion=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION));
		TableCellEditor tableCellEditorPreguntaEvaluacion =tableColumnPreguntaEvaluacion.getCellEditor();

		PreguntaEvaluacionTableCell preguntaevaluacionTableCellFk=(PreguntaEvaluacionTableCell)tableCellEditorPreguntaEvaluacion;

		if(preguntaevaluacionTableCellFk!=null) {
			preguntaevaluacionTableCellFk.setpreguntaevaluacionsForeignKey(preguntaevaluacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//preguntaevaluacionTableCellFk.setRowActual(intSelectedRow);
			//preguntaevaluacionTableCellFk.setpreguntaevaluacionsForeignKeyActual(preguntaevaluacionsForeignKey);
		//}


		if(preguntaevaluacionTableCellFk!=null) {
			preguntaevaluacionTableCellFk.RecargarPreguntaEvaluacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSubPreguntaEvaluacion(List<SubPreguntaEvaluacion> subpreguntaevaluacionsForeignKey)throws Exception{
		TableColumn tableColumnSubPreguntaEvaluacion=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION));
		TableCellEditor tableCellEditorSubPreguntaEvaluacion =tableColumnSubPreguntaEvaluacion.getCellEditor();

		SubPreguntaEvaluacionTableCell subpreguntaevaluacionTableCellFk=(SubPreguntaEvaluacionTableCell)tableCellEditorSubPreguntaEvaluacion;

		if(subpreguntaevaluacionTableCellFk!=null) {
			subpreguntaevaluacionTableCellFk.setsubpreguntaevaluacionsForeignKey(subpreguntaevaluacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//subpreguntaevaluacionTableCellFk.setRowActual(intSelectedRow);
			//subpreguntaevaluacionTableCellFk.setsubpreguntaevaluacionsForeignKeyActual(subpreguntaevaluacionsForeignKey);
		//}


		if(subpreguntaevaluacionTableCellFk!=null) {
			subpreguntaevaluacionTableCellFk.RecargarSubPreguntaEvaluacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSiNo(List<SiNo> sinosForeignKey)throws Exception{
		TableColumn tableColumnSiNo=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO));
		TableCellEditor tableCellEditorSiNo =tableColumnSiNo.getCellEditor();

		SiNoTableCell sinoTableCellFk=(SiNoTableCell)tableCellEditorSiNo;

		if(sinoTableCellFk!=null) {
			sinoTableCellFk.setsinosForeignKey(sinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sinoTableCellFk.setRowActual(intSelectedRow);
			//sinoTableCellFk.setsinosForeignKeyActual(sinosForeignKey);
		//}


		if(sinoTableCellFk!=null) {
			sinoTableCellFk.RecargarSiNosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleEvaluacionProveedor(false);
			
			//if(!this.isEsNuevoDetalleEvaluacionProveedor) {								
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				
			}
			
			if(this.permiteMantenimiento(this.detalleevaluacionproveedor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleEvaluacionProveedor=true;
					this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					this.isEsNuevoDetalleEvaluacionProveedor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleEvaluacionProveedor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleEvaluacionProveedor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(false);
				
				this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(false);
			
												
				
				if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleEvaluacionProveedor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,detalleevaluacionproveedorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleevaluacionproveedor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				this.detalleevaluacionproveedor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				this.detalleevaluacionproveedor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleevaluacionproveedor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleEvaluacionProveedorModel) this.jTableDatosDetalleEvaluacionProveedor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleEvaluacionProveedor=true;
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
				this.isEsNuevoDetalleEvaluacionProveedor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(false);
				
				this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(false);
				
				
				
				if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleEvaluacionProveedor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleEvaluacionProveedor.getRowCount()>=1) {
				jTableDatosDetalleEvaluacionProveedor.removeRowSelectionInterval(0, jTableDatosDetalleEvaluacionProveedor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleEvaluacionProveedor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(false) ;
			
			this.isEsNuevoDetalleEvaluacionProveedor=false;
			
			if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleEvaluacionProveedor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				
				//SI ES MANUAL
				if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleEvaluacionProveedor--;			
			//DetalleEvaluacionProveedor detalleevaluacionproveedorAux= new DetalleEvaluacionProveedor();			
			//detalleevaluacionproveedorAux.setId(this.iIdNuevoDetalleEvaluacionProveedor);
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleEvaluacionProveedor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
			
			this.detalleevaluacionproveedor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().add(this.detalleevaluacionproveedorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleevaluacionproveedors.add(this.detalleevaluacionproveedorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			
			this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionProveedor(), this.getIndiceNuevoDetalleEvaluacionProveedor());
			
			int iLastRow =  this.jTableDatosDetalleEvaluacionProveedor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleEvaluacionProveedor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleEvaluacionProveedor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();
			}
			
			//this.abrirFrameTreeDetalleEvaluacionProveedor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Evaluacion ProveedorES ?", "MANTENIMIENTO DE Detalle Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleEvaluacionProveedor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleEvaluacionProveedor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.procesarImportacionDetalleEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleevaluacionproveedorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleEvaluacionProveedorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleEvaluacionProveedor.setFileImportacion(this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleEvaluacionProveedor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleEvaluacionProveedor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		

		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionProveedorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleEvaluacionProveedorBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EvaluacionProveedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EvaluacionProveedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EvaluacionProveedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EvaluacionProveedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PreguntaEvaluacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PreguntaEvaluacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PreguntaEvaluacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PreguntaEvaluacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SubPreguntaEvaluacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SubPreguntaEvaluacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SubPreguntaEvaluacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SubPreguntaEvaluacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SiNo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SiNo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SiNo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SiNo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR:
					sNombreCampoCategoria="id_evaluacion_proveedor";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					sNombreCampoCategoria="id_pregunta_evaluacion";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION:
					sNombreCampoCategoria="id_sub_pregunta_evaluacion";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO:
					sNombreCampoCategoria="id_si_no";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR:
					sNombreCampoCategoriaValor="id_evaluacion_proveedor";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					sNombreCampoCategoriaValor="id_pregunta_evaluacion";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION:
					sNombreCampoCategoriaValor="id_sub_pregunta_evaluacion";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO:
					sNombreCampoCategoriaValor="id_si_no";
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Evaluacion Proveedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_evaluacion_proveedor");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta Evaluacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pregunta_evaluacion");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Pregunta Evaluacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sub_pregunta_evaluacion");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Si No",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_si_no");
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleEvaluacionProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getevaluacionproveedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getpreguntaevaluacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getsino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionproveedor.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleEvaluacionProveedor(row);				
			//	iRow++;
			//}				
			
			//for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleEvaluacionProveedor(detalleevaluacionproveedorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleEvaluacionProveedor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleEvaluacionProveedor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleEvaluacionProveedor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleEvaluacionProveedor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleEvaluacionProveedor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleEvaluacionProveedor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleEvaluacionProveedor.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleEvaluacionProveedor.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleEvaluacionProveedor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleEvaluacionProveedor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleEvaluacionProveedor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleEvaluacionProveedor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleEvaluacionProveedor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionProveedor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleEvaluacionProveedor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleEvaluacionProveedor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor();
		
		this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleEvaluacionProveedor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionProveedor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionProveedor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionProveedor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleEvaluacionProveedor(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionProveedor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionProveedor() throws Exception {
		try	{
			if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleEvaluacionProveedor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleEvaluacionProveedor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleEvaluacionProveedor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionProveedor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionProveedor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleEvaluacionProveedor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.getSelectedItem()!=null){this.id_evaluacion_proveedorFK_IdEvaluacionProveedor=((EvaluacionProveedor)this.jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.getSelectedItem()).getId();}
		if(this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.getSelectedItem()!=null){this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion=((PreguntaEvaluacion)this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.getSelectedItem()).getId();}
		if(this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.getSelectedItem()!=null){this.id_si_noFK_IdSiNo=((SiNo)this.jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.getSelectedItem()).getId();}
		if(this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.getSelectedItem()!=null){this.id_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion=((SubPreguntaEvaluacion)this.jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleEvaluacionProveedor(Boolean esInicializar) throws Exception {				
		if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleEvaluacionProveedor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleEvaluacionProveedor() throws Exception {
		this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleEvaluacionProveedor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleEvaluacionProveedorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleEvaluacionProveedor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleevaluacionproveedors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleEvaluacionProveedor.setModel(new DetalleEvaluacionProveedorModel(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleEvaluacionProveedor.setModel(new DetalleEvaluacionProveedorModel(this.detalleevaluacionproveedors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleEvaluacionProveedor!=null && this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleEvaluacionProveedor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,detalleevaluacionproveedorConstantesFunciones.resaltarSeleccionarDetalleEvaluacionProveedor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,detalleevaluacionproveedorConstantesFunciones.resaltarSeleccionarDetalleEvaluacionProveedor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostraridDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleevaluacionproveedorConstantesFunciones.resaltaridDetalleEvaluacionProveedor,this.detalleevaluacionproveedorConstantesFunciones.activaridDetalleEvaluacionProveedor,this,true,"idDetalleEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleevaluacionproveedorConstantesFunciones.resaltaridDetalleEvaluacionProveedor,this.detalleevaluacionproveedorConstantesFunciones.activaridDetalleEvaluacionProveedor,this,true,"idDetalleEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_empresaDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_empresaDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_empresaDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_empresaDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_empresaDetalleEvaluacionProveedor,false,"id_empresaDetalleEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sucursalDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sucursalDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_sucursalDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sucursalDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_sucursalDetalleEvaluacionProveedor,false,"id_sucursalDetalleEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_ejercicioDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_ejercicioDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_ejercicioDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_ejercicioDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_ejercicioDetalleEvaluacionProveedor,false,"id_ejercicioDetalleEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_periodoDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_periodoDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_periodoDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_periodoDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_periodoDetalleEvaluacionProveedor,false,"id_periodoDetalleEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_evaluacion_proveedorDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EvaluacionProveedorTableCell(this.evaluacionproveedorsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_evaluacion_proveedorDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_evaluacion_proveedorDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new EvaluacionProveedorTableCell(this.evaluacionproveedorsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_evaluacion_proveedorDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_evaluacion_proveedorDetalleEvaluacionProveedor,true,"id_evaluacion_proveedorDetalleEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_pregunta_evaluacionDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PreguntaEvaluacionTableCell(this.preguntaevaluacionsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_pregunta_evaluacionDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_pregunta_evaluacionDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new PreguntaEvaluacionTableCell(this.preguntaevaluacionsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_pregunta_evaluacionDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_pregunta_evaluacionDetalleEvaluacionProveedor,true,"id_pregunta_evaluacionDetalleEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SubPreguntaEvaluacionTableCell(this.subpreguntaevaluacionsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new SubPreguntaEvaluacionTableCell(this.subpreguntaevaluacionsForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,true,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_si_noDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SiNoTableCell(this.sinosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_si_noDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_si_noDetalleEvaluacionProveedor));
			tableColumn.setCellEditor(new SiNoTableCell(this.sinosForeignKey,this.detalleevaluacionproveedorConstantesFunciones.resaltarid_si_noDetalleEvaluacionProveedor,this,this.detalleevaluacionproveedorConstantesFunciones.activarid_si_noDetalleEvaluacionProveedor,true,"id_si_noDetalleEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleevaluacionproveedorConstantesFunciones.mostrardescripcionDetalleEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleevaluacionproveedorConstantesFunciones.resaltardescripcionDetalleEvaluacionProveedor,this.detalleevaluacionproveedorConstantesFunciones.activardescripcionDetalleEvaluacionProveedor,this,true,"descripcionDetalleEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleevaluacionproveedorConstantesFunciones.resaltardescripcionDetalleEvaluacionProveedor,this.detalleevaluacionproveedorConstantesFunciones.activardescripcionDetalleEvaluacionProveedor,this,true,"descripcionDetalleEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleEvaluacionProveedor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleEvaluacionProveedor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleEvaluacionProveedor.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleEvaluacionProveedor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleEvaluacionProveedor.moveColumn(this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleEvaluacionProveedor.moveColumn(this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleEvaluacionProveedor.moveColumn(this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleEvaluacionProveedor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleEvaluacionProveedor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleEvaluacionProveedor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleEvaluacionProveedor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleEvaluacionProveedor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleEvaluacionProveedor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleevaluacionproveedors.size()-1;
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
		//this.jTableDatosDetalleEvaluacionProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleEvaluacionProveedor();
			
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
				
				//this.isEsNuevoDetalleEvaluacionProveedor=false;
					
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
				if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleEvaluacionProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleevaluacionproveedor.getsType().equals("DUPLICADO")
				   || this.detalleevaluacionproveedor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleEvaluacionProveedor=true;
				
				} else {
					this.isEsNuevoDetalleEvaluacionProveedor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleevaluacionproveedor.getId()>=0 && !this.detalleevaluacionproveedor.getIsNew()) {						
						this.isEsNuevoDetalleEvaluacionProveedor=false;
						
					} else {
						this.isEsNuevoDetalleEvaluacionProveedor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionProveedor(esRelaciones);						
				
				this.seleccionarDetalleEvaluacionProveedor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleevaluacionproveedor.getId()<0) {
					this.isEsNuevoDetalleEvaluacionProveedor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleEvaluacionProveedor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleEvaluacionProveedor(evt,rowIndex);
				}	
				
				if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleEvaluacionProveedor: " + this.dDif); 
					}
				}								
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleEvaluacionProveedor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleevaluacionproveedor)) {
					if(this.detalleevaluacionproveedor.getId()>0) {
						this.detalleevaluacionproveedor.setIsDeleted(true);
						
						this.detalleevaluacionproveedorsEliminados.add(this.detalleevaluacionproveedor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().remove(this.detalleevaluacionproveedor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedors.remove(this.detalleevaluacionproveedor);				
					}
					
					
					((DetalleEvaluacionProveedorModel) this.jTableDatosDetalleEvaluacionProveedor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleEvaluacionProveedor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleEvaluacionProveedor) {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleEvaluacionProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_empresaDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_empresaDetalleEvaluacionProveedor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_empresa());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleevaluacionproveedor.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleevaluacionproveedor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleevaluacionproveedor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_sucursalDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_sucursalDetalleEvaluacionProveedor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_sucursal());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleevaluacionproveedor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleevaluacionproveedor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleevaluacionproveedor.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_ejercicioDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_ejercicioDetalleEvaluacionProveedor) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detalleevaluacionproveedor.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detalleevaluacionproveedor.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detalleevaluacionproveedor.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_periodoDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_periodoDetalleEvaluacionProveedor) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_periodo());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detalleevaluacionproveedor.getPeriodo()!=null) {
							this.periodosForeignKey.add(detalleevaluacionproveedor.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detalleevaluacionproveedor.getid_periodo(),false,"Formulario");

					//EvaluacionProveedor
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_evaluacion_proveedorDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_evaluacion_proveedorDetalleEvaluacionProveedor) {
						//this.cargarCombosEvaluacionProveedorsForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_evaluacion_proveedor());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.evaluacionproveedorsForeignKey=new ArrayList<EvaluacionProveedor>();

						if(detalleevaluacionproveedor.getEvaluacionProveedor()!=null) {
							this.evaluacionproveedorsForeignKey.add(detalleevaluacionproveedor.getEvaluacionProveedor());
						}

						this.addItemDefectoCombosForeignKeyEvaluacionProveedor();
						this.cargarCombosFrameEvaluacionProveedorsForeignKey("Todos");
					}
					this.setActualEvaluacionProveedorForeignKey(this.detalleevaluacionproveedor.getid_evaluacion_proveedor(),false,"Formulario");

					//PreguntaEvaluacion
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_pregunta_evaluacionDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_pregunta_evaluacionDetalleEvaluacionProveedor) {
						//this.cargarCombosPreguntaEvaluacionsForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_pregunta_evaluacion());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>();

						if(detalleevaluacionproveedor.getPreguntaEvaluacion()!=null) {
							this.preguntaevaluacionsForeignKey.add(detalleevaluacionproveedor.getPreguntaEvaluacion());
						}

						this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
						this.cargarCombosFramePreguntaEvaluacionsForeignKey("Todos");
					}
					this.setActualPreguntaEvaluacionForeignKey(this.detalleevaluacionproveedor.getid_pregunta_evaluacion(),false,"Formulario");

					//SubPreguntaEvaluacion
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_sub_pregunta_evaluacionDetalleEvaluacionProveedor) {
						//this.cargarCombosSubPreguntaEvaluacionsForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.subpreguntaevaluacionsForeignKey=new ArrayList<SubPreguntaEvaluacion>();

						if(detalleevaluacionproveedor.getSubPreguntaEvaluacion()!=null) {
							this.subpreguntaevaluacionsForeignKey.add(detalleevaluacionproveedor.getSubPreguntaEvaluacion());
						}

						this.addItemDefectoCombosForeignKeySubPreguntaEvaluacion();
						this.cargarCombosFrameSubPreguntaEvaluacionsForeignKey("Todos");
					}
					this.setActualSubPreguntaEvaluacionForeignKey(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion(),false,"Formulario");

					//SiNo
					if(!this.detalleevaluacionproveedorConstantesFunciones.cargarid_si_noDetalleEvaluacionProveedor || this.detalleevaluacionproveedorConstantesFunciones.event_dependid_si_noDetalleEvaluacionProveedor) {
						//this.cargarCombosSiNosForeignKeyLista(" where id="+this.detalleevaluacionproveedor.getid_si_no());
									//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
						this.sinosForeignKey=new ArrayList<SiNo>();

						if(detalleevaluacionproveedor.getSiNo()!=null) {
							this.sinosForeignKey.add(detalleevaluacionproveedor.getSiNo());
						}

						this.addItemDefectoCombosForeignKeySiNo();
						this.cargarCombosFrameSiNosForeignKey("Todos");
					}
					this.setActualSiNoForeignKey(this.detalleevaluacionproveedor.getid_si_no(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleEvaluacionProveedor(detalleevaluacionproveedor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(detalleevaluacionproveedor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleEvaluacionProveedor(detalleevaluacionproveedor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionProveedor(detalleevaluacionproveedor);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setText(detalleevaluacionproveedor.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setText(detalleevaluacionproveedor.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleEvaluacionProveedor detalleevaluacionproveedorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleevaluacionproveedorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleEvaluacionProveedor detalleevaluacionproveedorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleevaluacionproveedorLocal=this.detalleevaluacionproveedor;
			} else {
				detalleevaluacionproveedorLocal=this.detalleevaluacionproveedorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleevaluacionproveedorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleEvaluacionProveedor(detalleevaluacionproveedorLocal,true);
					
					if(detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleevaluacionproveedorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleevaluacionproveedorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(detalleevaluacionproveedor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(detalleevaluacionproveedor);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(detalleevaluacionproveedor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.getText()==null || this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.getText()=="" || this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setText("0");
			}

			if(conColumnasBase) {detalleevaluacionproveedor.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelIdDetalleEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionproveedor.setdescripcion(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabeldescripcionDetalleEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedorBean,DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleevaluacionproveedorBean.getid_evaluacion_proveedor()!=null && !detalleevaluacionproveedorBean.getid_evaluacion_proveedor().equals(-1L))) {detalleevaluacionproveedor.setid_evaluacion_proveedor(detalleevaluacionproveedorBean.getid_evaluacion_proveedor());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorBean.getid_pregunta_evaluacion()!=null && !detalleevaluacionproveedorBean.getid_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedor.setid_pregunta_evaluacion(detalleevaluacionproveedorBean.getid_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorBean.getid_sub_pregunta_evaluacion()!=null && !detalleevaluacionproveedorBean.getid_sub_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedor.setid_sub_pregunta_evaluacion(detalleevaluacionproveedorBean.getid_sub_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorBean.getid_si_no()!=null && !detalleevaluacionproveedorBean.getid_si_no().equals(-1L))) {detalleevaluacionproveedor.setid_si_no(detalleevaluacionproveedorBean.getid_si_no());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedorOrigen,DetalleEvaluacionProveedor detalleevaluacionproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getId()!=null && !detalleevaluacionproveedorOrigen.getId().equals(0L))) {detalleevaluacionproveedor.setId(detalleevaluacionproveedorOrigen.getId());}}
			if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getid_evaluacion_proveedor()!=null && !detalleevaluacionproveedorOrigen.getid_evaluacion_proveedor().equals(-1L))) {detalleevaluacionproveedor.setid_evaluacion_proveedor(detalleevaluacionproveedorOrigen.getid_evaluacion_proveedor());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getid_pregunta_evaluacion()!=null && !detalleevaluacionproveedorOrigen.getid_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedor.setid_pregunta_evaluacion(detalleevaluacionproveedorOrigen.getid_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getid_sub_pregunta_evaluacion()!=null && !detalleevaluacionproveedorOrigen.getid_sub_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedor.setid_sub_pregunta_evaluacion(detalleevaluacionproveedorOrigen.getid_sub_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getid_si_no()!=null && !detalleevaluacionproveedorOrigen.getid_si_no().equals(-1L))) {detalleevaluacionproveedor.setid_si_no(detalleevaluacionproveedorOrigen.getid_si_no());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorOrigen.getdescripcion()!=null && !detalleevaluacionproveedorOrigen.getdescripcion().equals(""))) {detalleevaluacionproveedor.setdescripcion(detalleevaluacionproveedorOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setText(detalleevaluacionproveedor.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setText(detalleevaluacionproveedor.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleEvaluacionProveedor(DetalleEvaluacionProveedorBean detalleevaluacionproveedorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setText(detalleevaluacionproveedorBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setText(detalleevaluacionproveedorBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionProveedor(DetalleEvaluacionProveedorParameterReturnGeneral detalleevaluacionproveedorReturnGeneral,DetalleEvaluacionProveedorBean detalleevaluacionproveedorBean,Boolean conDefault) throws Exception { 
		try {
			DetalleEvaluacionProveedor detalleevaluacionproveedorLocal=new DetalleEvaluacionProveedor();
			
			detalleevaluacionproveedorLocal=detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getId()!=null && !detalleevaluacionproveedorLocal.getId().equals(0L))) {detalleevaluacionproveedorBean.setId(detalleevaluacionproveedorLocal.getId());}}
			if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getid_evaluacion_proveedor()!=null && !detalleevaluacionproveedorLocal.getid_evaluacion_proveedor().equals(-1L))) {detalleevaluacionproveedorBean.setid_evaluacion_proveedor(detalleevaluacionproveedorLocal.getid_evaluacion_proveedor());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getid_pregunta_evaluacion()!=null && !detalleevaluacionproveedorLocal.getid_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedorBean.setid_pregunta_evaluacion(detalleevaluacionproveedorLocal.getid_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getid_sub_pregunta_evaluacion()!=null && !detalleevaluacionproveedorLocal.getid_sub_pregunta_evaluacion().equals(-1L))) {detalleevaluacionproveedorBean.setid_sub_pregunta_evaluacion(detalleevaluacionproveedorLocal.getid_sub_pregunta_evaluacion());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getid_si_no()!=null && !detalleevaluacionproveedorLocal.getid_si_no().equals(-1L))) {detalleevaluacionproveedorBean.setid_si_no(detalleevaluacionproveedorLocal.getid_si_no());}
			if(conDefault || (!conDefault && detalleevaluacionproveedorLocal.getdescripcion()!=null && !detalleevaluacionproveedorLocal.getdescripcion().equals(""))) {detalleevaluacionproveedorBean.setdescripcion(detalleevaluacionproveedorLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleEvaluacionProveedorGenerico(Long idDetalleEvaluacionProveedorSeleccionado,JComboBox jComboBoxDetalleEvaluacionProveedor,List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsLocal)throws Exception {
		try {
			DetalleEvaluacionProveedor  detalleevaluacionproveedorTemp=null;

			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsLocal) {
				if(detalleevaluacionproveedorAux.getId()!=null && detalleevaluacionproveedorAux.getId().equals(idDetalleEvaluacionProveedorSeleccionado)) {
					detalleevaluacionproveedorTemp=detalleevaluacionproveedorAux;
					break;
				}
			}

			jComboBoxDetalleEvaluacionProveedor.setSelectedItem(detalleevaluacionproveedorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleEvaluacionProveedorGenerico(JComboBox jComboBoxDetalleEvaluacionProveedor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleEvaluacionProveedor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleEvaluacionProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleEvaluacionProveedor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleEvaluacionProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionproveedor=(DetalleEvaluacionProveedor) detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleevaluacionproveedor =(DetalleEvaluacionProveedor) detalleevaluacionproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("EvaluacionProveedor")) {
			//sDescripcion=this.getActualEvaluacionProveedorForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getevaluacionproveedor_descripcion();
			} else {
				//sDescripcion=this.getActualEvaluacionProveedorForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getevaluacionproveedor_descripcion();
			}
		}

		if(sTipo.equals("PreguntaEvaluacion")) {
			//sDescripcion=this.getActualPreguntaEvaluacionForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getpreguntaevaluacion_descripcion();
			} else {
				//sDescripcion=this.getActualPreguntaEvaluacionForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getpreguntaevaluacion_descripcion();
			}
		}

		if(sTipo.equals("SubPreguntaEvaluacion")) {
			//sDescripcion=this.getActualSubPreguntaEvaluacionForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion();
			} else {
				//sDescripcion=this.getActualSubPreguntaEvaluacionForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion();
			}
		}

		if(sTipo.equals("SiNo")) {
			//sDescripcion=this.getActualSiNoForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionproveedor.getIsNew() && !detalleevaluacionproveedor.getIsChanged() && !detalleevaluacionproveedor.getIsDeleted()) {
				sDescripcion=detalleevaluacionproveedor.getsino_descripcion();
			} else {
				//sDescripcion=this.getActualSiNoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionproveedor.getsino_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleEvaluacionProveedor detalleevaluacionproveedorRow=new DetalleEvaluacionProveedor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionproveedorRow=(DetalleEvaluacionProveedor) detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleevaluacionproveedorRow=(DetalleEvaluacionProveedor) detalleevaluacionproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));			
			this.jButtonDuplicarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor && this.isPermisoDuplicarDetalleEvaluacionProveedor));			
			this.jButtonCopiarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor && this.isPermisoCopiarDetalleEvaluacionProveedor));
			this.jButtonVerFormDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor && this.isPermisoVerFormDetalleEvaluacionProveedor));
			
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));			
			
			this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));			
			this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor && this.isPermisoEliminarDetalleEvaluacionProveedor));
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor);							
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));						
			this.jButtonDuplicarToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor && this.isPermisoDuplicarDetalleEvaluacionProveedor));						
			this.jButtonCopiarToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor && this.isPermisoCopiarDetalleEvaluacionProveedor));			
			this.jButtonVerFormToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor && this.isPermisoVerFormDetalleEvaluacionProveedor));			
			this.jButtonAbrirOrderByToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));
			this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));			
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor  && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor && this.isPermisoEliminarDetalleEvaluacionProveedor));
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarToolBarDetalleEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor);				
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));			
			this.jMenuItemDuplicarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor && this.isPermisoDuplicarDetalleEvaluacionProveedor));			
			this.jMenuItemCopiarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor && this.isPermisoCopiarDetalleEvaluacionProveedor));			
			this.jMenuItemVerFormDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor && this.isPermisoVerFormDetalleEvaluacionProveedor));			
			this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));			
			//this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));
			this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));			
			//this.jMenuItemDetalleMostrarOcultarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor && this.isPermisoOrdenDetalleEvaluacionProveedor));			
			this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor));			
			this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor && this.isPermisoNuevoDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));									
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemModificarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemActualizarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor && this.isPermisoActualizarDetalleEvaluacionProveedor));	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemEliminarDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor && this.isPermisoEliminarDetalleEvaluacionProveedor));
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemCancelarDetalleEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor);				
			}
			
			this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));						
			this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=this.jButtonNuevoDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor=this.jButtonDuplicarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor=this.jButtonCopiarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor=this.jButtonVerFormDetalleEvaluacionProveedor.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleEvaluacionProveedor=this.jButtonAbrirOrderByDetalleEvaluacionProveedor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=this.jButtonModificarDetalleEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=this.jButtonNuevoToolBarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarToolBarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarToolBarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarToolBarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarToolBarDetalleEvaluacionProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=this.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=this.jMenuItemNuevoDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemModificarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemActualizarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemEliminarDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemCancelarDetalleEvaluacionProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleEvaluacionProveedor(Boolean esInicializar) {
		if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleEvaluacionProveedor();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleEvaluacionProveedor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionProveedor() {
		this.jButtonNuevoDetalleEvaluacionProveedor.setVisible(this.isPermisoNuevoDetalleEvaluacionProveedor);			
		this.jButtonDuplicarDetalleEvaluacionProveedor.setVisible(this.isPermisoDuplicarDetalleEvaluacionProveedor);			
		this.jButtonCopiarDetalleEvaluacionProveedor.setVisible(this.isPermisoCopiarDetalleEvaluacionProveedor);			
		this.jButtonVerFormDetalleEvaluacionProveedor.setVisible(this.isPermisoVerFormDetalleEvaluacionProveedor);			
		
		this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setVisible(this.isPermisoOrdenDetalleEvaluacionProveedor);					
		
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.setVisible(this.isPermisoNuevoDetalleEvaluacionProveedor);			
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarDetalleEvaluacionProveedor.setVisible(this.isPermisoActualizarDetalleEvaluacionProveedor);	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.setVisible(this.isPermisoActualizarDetalleEvaluacionProveedor);	
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.setVisible(this.isPermisoEliminarDetalleEvaluacionProveedor);
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor);						
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.setVisible(this.isPermisoGuardarCambiosDetalleEvaluacionProveedor);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setVisible(this.isPermisoActualizarDetalleEvaluacionProveedor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleEvaluacionProveedor() {
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarDetalleEvaluacionProveedor.setVisible(this.isPermisoActualizarDetalleEvaluacionProveedor);	
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.setVisible(this.isPermisoActualizarDetalleEvaluacionProveedor);	
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.setVisible(this.isPermisoEliminarDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor);							
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor && this.isPermisoGuardarCambiosDetalleEvaluacionProveedor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleEvaluacionProveedor() {
		if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionProveedor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleEvaluacionProveedor() {
	}
	
	public void jTableDatosDetalleEvaluacionProveedorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleEvaluacionProveedor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleevaluacionproveedor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleevaluacionproveedor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleevaluacionproveedor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detalleevaluacionproveedor.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detalleevaluacionproveedor.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoevaluacionproveedor=true;

			idTienePermisoevaluacionproveedor=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(EvaluacionProveedorConstantesFunciones.CLASSNAME);

			if(idTienePermisoevaluacionproveedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.evaluacionproveedorBeanSwingJInternalFrame=new EvaluacionProveedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.evaluacionproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.evaluacionproveedorBeanSwingJInternalFrame.getEvaluacionProveedorLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_evaluacion_proveedor()!=null) {
					this.evaluacionproveedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.evaluacionproveedorBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_evaluacion_proveedor());
					this.evaluacionproveedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.evaluacionproveedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.evaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionProveedor();
				}

				JInternalFrameBase jinternalFrame =this.evaluacionproveedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBorderevaluacionproveedor=(TitledBorder)this.evaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionProveedor.getBorder();

				titledBorderevaluacionproveedor.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Evaluacion Proveedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_evaluacion_proveedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_evaluacion_proveedor = "+this.detalleevaluacionproveedor.getid_evaluacion_proveedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopreguntaevaluacion=true;

			idTienePermisopreguntaevaluacion=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			if(idTienePermisopreguntaevaluacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.preguntaevaluacionBeanSwingJInternalFrame=new PreguntaEvaluacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.preguntaevaluacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.preguntaevaluacionBeanSwingJInternalFrame.getPreguntaEvaluacionLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_pregunta_evaluacion()!=null) {
					this.preguntaevaluacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.preguntaevaluacionBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_pregunta_evaluacion());
					this.preguntaevaluacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.preguntaevaluacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.preguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaEvaluacion();
				}

				JInternalFrameBase jinternalFrame =this.preguntaevaluacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBorderpreguntaevaluacion=(TitledBorder)this.preguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosPreguntaEvaluacion.getBorder();

				titledBorderpreguntaevaluacion.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Pregunta Evaluacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_pregunta_evaluacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pregunta_evaluacion = "+this.detalleevaluacionproveedor.getid_pregunta_evaluacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosubpreguntaevaluacion=true;

			idTienePermisosubpreguntaevaluacion=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			if(idTienePermisosubpreguntaevaluacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.subpreguntaevaluacionBeanSwingJInternalFrame=new SubPreguntaEvaluacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.subpreguntaevaluacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.subpreguntaevaluacionBeanSwingJInternalFrame.getSubPreguntaEvaluacionLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion()!=null) {
					this.subpreguntaevaluacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.subpreguntaevaluacionBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion());
					this.subpreguntaevaluacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.subpreguntaevaluacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.subpreguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubPreguntaEvaluacion();
				}

				JInternalFrameBase jinternalFrame =this.subpreguntaevaluacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBordersubpreguntaevaluacion=(TitledBorder)this.subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();

				titledBordersubpreguntaevaluacion.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Sub Pregunta Evaluacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sub_pregunta_evaluacion = "+this.detalleevaluacionproveedor.getid_sub_pregunta_evaluacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_si_noDetalleEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosino=true;

			idTienePermisosino=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionProveedor(SiNoConstantesFunciones.CLASSNAME);

			if(idTienePermisosino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);

				this.sinoBeanSwingJInternalFrame=new SiNoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sinoBeanSwingJInternalFrame.getSiNoLogic().setConnexion(this.detalleevaluacionproveedorLogic.getConnexion());

				if(this.detalleevaluacionproveedor.getid_si_no()!=null) {
					this.sinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sinoBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionproveedor.getid_si_no());
					this.sinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSiNo();
				}

				JInternalFrameBase jinternalFrame =this.sinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();
				TitledBorder titledBordersino=(TitledBorder)this.sinoBeanSwingJInternalFrame.jScrollPanelDatosSiNo.getBorder();

				titledBordersino.setTitle(titledBorderDetalleEvaluacionProveedor.getTitle() + " -> Si/no");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_si_noDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getid_si_no()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_si_no = "+this.detalleevaluacionproveedor.getid_si_no().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.getdetalleevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionproveedor==null) {
						this.detalleevaluacionproveedor = new DetalleEvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);
				}

				if(this.detalleevaluacionproveedor.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleevaluacionproveedor.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdEvaluacionProveedor();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdPeriodo();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdPreguntaEvaluacion();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSiNoDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdSiNo();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdSubPreguntaEvaluacion();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);

			this.getDetalleEvaluacionProveedorsFK_IdSucursal();

			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);

			//if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleEvaluacionProveedor() {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.dispose();
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.dispose();
			this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor=null;
		}
		
		if(this.jInternalFrameImportacionDetalleEvaluacionProveedor!=null) {
			this.jInternalFrameImportacionDetalleEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleEvaluacionProveedor.dispose();
			this.jInternalFrameImportacionDetalleEvaluacionProveedor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleEvaluacionProveedor();
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleEvaluacionProveedor")) {
				jButtonDuplicarDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleEvaluacionProveedor")) {
				jButtonCopiarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleEvaluacionProveedor")) {
				jButtonVerFormDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleEvaluacionProveedor")) {
				jButtonDuplicarDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleEvaluacionProveedor")) {
				jButtonDuplicarDetalleEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleEvaluacionProveedor")) {
				jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleEvaluacionProveedor")) {
				jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleEvaluacionProveedor")) {
				jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleEvaluacionProveedor")) {
				jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleEvaluacionProveedor")) {
				jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleEvaluacionProveedor")) {
				jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleEvaluacionProveedor")) {
				jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleEvaluacionProveedor")) {
				jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleEvaluacionProveedor")) {
				jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleEvaluacionProveedor")) {
				jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleEvaluacionProveedor")) {
				jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleEvaluacionProveedor")) {
				jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleEvaluacionProveedor")) {
				jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleEvaluacionProveedor")) {
				jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleEvaluacionProveedor")) {
				jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleEvaluacionProveedor")) {
				jButtonMostrarOcultarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleEvaluacionProveedor")) {
				jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleEvaluacionProveedor")) {
				jButtonCopiarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleEvaluacionProveedor")) {
				jButtonVerFormDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleEvaluacionProveedor")) {
				jButtonCopiarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleEvaluacionProveedor")) {
				jButtonVerFormDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleEvaluacionProveedor")) {
				jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleEvaluacionProveedor")) {
				jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleEvaluacionProveedor")) {
				jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleEvaluacionProveedor")) {
				jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleEvaluacionProveedor")) {
				jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleEvaluacionProveedor")) {
				jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleEvaluacionProveedor")) {
				jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleEvaluacionProveedor")) {
				jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleEvaluacionProveedor")) {
				jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleEvaluacionProveedor") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor")) {
				jButtonAbrirOrderByDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleEvaluacionProveedor") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleEvaluacionProveedor")) {
				jButtonMostrarOcultarDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleEvaluacionProveedor")) {
				jButtonCerrarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleEvaluacionProveedor")) {
				jButtonGenerarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleEvaluacionProveedor")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleEvaluacionProveedor")) {
				jButtonCerrarImportacionDetalleEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleEvaluacionProveedor")) {
				
				jButtonGenerarImportacionDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleEvaluacionProveedor")) {
				
				jButtonAbrirImportacionDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleEvaluacionProveedor")) {
				jComboBoxTiposAccionesDetalleEvaluacionProveedorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleEvaluacionProveedor")) {
				jComboBoxTiposRelacionesDetalleEvaluacionProveedorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleEvaluacionProveedor")) {
				jComboBoxTiposAccionesDetalleEvaluacionProveedorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleEvaluacionProveedor")) {
				
				jComboBoxTiposSeleccionarDetalleEvaluacionProveedorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleEvaluacionProveedor")) {
				jTextFieldValorCampoGeneralDetalleEvaluacionProveedorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleEvaluacionProveedor")) {
				jButtonAbrirOrderByDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleEvaluacionProveedor")) {
				jButtonAbrirOrderByDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleEvaluacionProveedor")) {
				jButtonCerrarOrderByDetalleEvaluacionProveedorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonidDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_empresaDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_empresaDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_sucursalDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_sucursalDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_ejercicioDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_periodoDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_periodoDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_si_noDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_si_noDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_si_noDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_si_noDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtondescripcionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEvaluacionProveedorDetalleEvaluacionProveedor")) {
				this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPreguntaEvaluacionDetalleEvaluacionProveedor")) {
				this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSiNoDetalleEvaluacionProveedor")) {
				this.jButtonFK_IdSiNoDetalleEvaluacionProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor")) {
				this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedorActionPerformed(evt);
			}
			
			;
			
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleEvaluacionProveedor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleEvaluacionProveedor detalleevaluacionproveedorLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleevaluacionproveedorLocal=this.detalleevaluacionproveedor;
			} else {
				detalleevaluacionproveedorLocal=this.detalleevaluacionproveedorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
							
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
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
			
			


			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
								
						
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
								
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
							
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
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
			
			


			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
								
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleEvaluacionProveedor")) {
					jCheckBoxSeleccionarTodosDetalleEvaluacionProveedorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleEvaluacionProveedor")) {
					jCheckBoxSeleccionadosDetalleEvaluacionProveedorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleEvaluacionProveedor")) {
					
				}
				
				


				
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
												
				
				


				
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
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
			
			


			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionproveedor);
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
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
				
				


				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionProveedor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionproveedorAnterior =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleEvaluacionProveedor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleEvaluacionProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleEvaluacionProveedor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleevaluacionproveedor =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleevaluacionproveedor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionProveedor")) {
				
				}
				
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleEvaluacionProveedor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleEvaluacionProveedor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionProveedor")) {
			
			}
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleEvaluacionProveedor();
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleEvaluacionProveedor")) {
				jButtonDuplicarDetalleEvaluacionProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleEvaluacionProveedor")) {
				jButtonCopiarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleEvaluacionProveedor")) {
				jButtonVerFormDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleEvaluacionProveedor")) {
				jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleEvaluacionProveedor")) {
				jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleEvaluacionProveedor")) {
				jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleEvaluacionProveedor")) {
				jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleEvaluacionProveedor")) {
				jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleEvaluacionProveedor")) {
				jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleEvaluacionProveedor")) {
				jButtonAbrirOrderByDetalleEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleEvaluacionProveedor")) {
				jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleEvaluacionProveedor")) {
				jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleEvaluacionProveedor")) {
				jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonidDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_empresaDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_empresaDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_sucursalDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_sucursalDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_ejercicioDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_periodoDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_periodoDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_si_noDetalleEvaluacionProveedorUpdate")) {
				this.jButtonid_si_noDetalleEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_si_noDetalleEvaluacionProveedorBusqueda")) {
				this.jButtonid_si_noDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleEvaluacionProveedorBusqueda")) {
				this.jButtondescripcionDetalleEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleEvaluacionProveedor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleEvaluacionProveedor")) {
				closingInternalFrameDetalleEvaluacionProveedor();
				
			} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionProveedor")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleEvaluacionProveedor = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleEvaluacionProveedorBeanSwingJInternalFrame jInternalFrameParent=(DetalleEvaluacionProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleEvaluacionProveedor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleEvaluacionProveedorActionPerformed(null);
			}
			
			DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleevaluacionproveedor,new Object(),this.detalleevaluacionproveedorParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleEvaluacionProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleEvaluacionProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleEvaluacionProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleevaluacionproveedor)) {
			if(!esControlTabla) {
				if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);			
				}
				
				if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.procesarEventosDetalleEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.detalleevaluacionproveedor,this.detalleevaluacionproveedorParameterGeneral,this.isEsNuevoDetalleEvaluacionProveedor,classes);//this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral,this.detalleevaluacionproveedorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleEvaluacionProveedor(classes,this.detalleevaluacionproveedorReturnGeneral,this.detalleevaluacionproveedorBean,false);
					}
						
					if(this.detalleevaluacionproveedorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor());	
					}
						
					if(this.detalleevaluacionproveedorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor(),classes);//this.detalleevaluacionproveedorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,classes);//this.detalleevaluacionproveedorBean);									
				}
			
				if(DetalleEvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionProveedor(this.detalleevaluacionproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionProveedor(this.detalleevaluacionproveedor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleevaluacionproveedorAnterior!=null) {
						this.detalleevaluacionproveedor=this.detalleevaluacionproveedorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.procesarEventosDetalleEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.detalleevaluacionproveedor,this.detalleevaluacionproveedorParameterGeneral,this.isEsNuevoDetalleEvaluacionProveedor,classes);//this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor(),detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor(),this.detalleevaluacionproveedors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleEvaluacionProveedor.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleEvaluacionProveedor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleEvaluacionProveedor();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleEvaluacionProveedor() throws Exception {
		
		DetalleEvaluacionProveedorModel detalleevaluacionproveedorModel=(DetalleEvaluacionProveedorModel)this.jTableDatosDetalleEvaluacionProveedor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionproveedorModel.detalleevaluacionproveedors=this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleevaluacionproveedorModel.detalleevaluacionproveedors=this.detalleevaluacionproveedors;
		}
		
		
		((DetalleEvaluacionProveedorModel) this.jTableDatosDetalleEvaluacionProveedor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleEvaluacionProveedor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleevaluacionproveedorAnterior(),this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleevaluacionproveedorAnterior(),this.detalleevaluacionproveedors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleEvaluacionProveedor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
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
										
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionproveedor,new Object(),generalEntityParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleEvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleEvaluacionProveedorConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleEvaluacionProveedor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleEvaluacionProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionproveedor,new Object(),generalEntityParameterGeneral,this.detalleevaluacionproveedorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleEvaluacionProveedor(DetalleEvaluacionProveedorBean detalleevaluacionproveedorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleEvaluacionProveedor(ArrayList<Classe> classes,DetalleEvaluacionProveedorReturnGeneral detalleevaluacionproveedorReturnGeneral,DetalleEvaluacionProveedorBean detalleevaluacionproveedorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleevaluacionproveedor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor = new DetalleEvaluacionProveedorDetalleFormJInternalFrame(jDesktopPane,this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setVisible(false);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.detalleevaluacionproveedorLogic=this.detalleevaluacionproveedorLogic;
		
		this.cargarCombosFrameForeignKeyDetalleEvaluacionProveedor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleEvaluacionProveedor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleEvaluacionProveedor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleEvaluacionProveedor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionProveedor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleEvaluacionProveedor"));
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarDetalleEvaluacionProveedor"));

		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleEvaluacionProveedor"));
					
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemModificarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleEvaluacionProveedor"));
						
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemActualizarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarDetalleEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleEvaluacionProveedor"));
								
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemEliminarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarDetalleEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleEvaluacionProveedor"));
					
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemCancelarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleEvaluacionProveedor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemDetalleCerrarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionProveedor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionProveedor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleEvaluacionProveedor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonidDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtondescripcionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleEvaluacionProveedorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleEvaluacionProveedor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleEvaluacionProveedor"));
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleEvaluacionProveedor"));
		}
		
		this.jTableDatosDetalleEvaluacionProveedor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleEvaluacionProveedor"));
		
		this.jTableDatosDetalleEvaluacionProveedor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleEvaluacionProveedor"));
		
		this.jButtonNuevoDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoDetalleEvaluacionProveedor"));
		
		this.jButtonDuplicarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"DuplicarDetalleEvaluacionProveedor"));
		
		this.jButtonCopiarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"CopiarDetalleEvaluacionProveedor"));
		
		this.jButtonVerFormDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"VerFormDetalleEvaluacionProveedor"));
		
		
		this.jButtonNuevoToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleEvaluacionProveedor"));
			
		this.jButtonDuplicarToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemNuevoDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleEvaluacionProveedor"));
			
		this.jMenuItemDuplicarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleEvaluacionProveedor"));		
		
		
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleEvaluacionProveedor"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleEvaluacionProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarDetalleEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonModificarToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleEvaluacionProveedor"));
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemModificarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonActualizarToolBarDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleEvaluacionProveedor"));
				
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemActualizarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarDetalleEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonEliminarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleEvaluacionProveedor"));
						
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemEliminarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarDetalleEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonCancelarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleEvaluacionProveedor"));
			
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemCancelarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleEvaluacionProveedor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleEvaluacionProveedor"));		
		
		
		this.jButtonCerrarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarDetalleEvaluacionProveedor"));
		
		
		this.jButtonCerrarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemCerrarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleEvaluacionProveedor"));
			
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jMenuItemDetalleCerrarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionProveedor"));
		}
		
		this.jButtonCopiarToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleEvaluacionProveedor"));
			
		this.jButtonVerFormToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleEvaluacionProveedor"));
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleEvaluacionProveedor"));
			
		this.jMenuItemCopiarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleEvaluacionProveedor"));		
		
		this.jMenuItemVerFormDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleEvaluacionProveedor"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleEvaluacionProveedor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleEvaluacionProveedor"));		
		
		
		
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleEvaluacionProveedor"));
					
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleEvaluacionProveedor"));
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleEvaluacionProveedor"));		
		
		
		
		this.jButtonAnterioresDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AnterioresDetalleEvaluacionProveedor"));
		
		
		this.jButtonAnterioresToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleEvaluacionProveedor"));
		
		this.jMenuItemAnterioresDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleEvaluacionProveedor"));		
		
		
		this.jButtonSiguientesDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"SiguientesDetalleEvaluacionProveedor"));
		
		
		this.jButtonSiguientesToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemSiguientesDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleEvaluacionProveedor"));
			
		this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleEvaluacionProveedor"));
			
		this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleEvaluacionProveedor"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor"));
			
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleEvaluacionProveedor"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleEvaluacionProveedor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleEvaluacionProveedor"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleEvaluacionProveedor"));

		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleEvaluacionProveedor"));
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleEvaluacionProveedor"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleEvaluacionProveedor"));
			
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleEvaluacionProveedor"));
					
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleEvaluacionProveedor"));
			
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleEvaluacionProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonidDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtondescripcionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleEvaluacionProveedorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionProveedorDetalleEvaluacionProveedor"));

			this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaEvaluacionDetalleEvaluacionProveedor"));

			this.jButtonFK_IdSiNoDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdSiNoDetalleEvaluacionProveedor"));

			this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionProveedor"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionProveedor"));				
			//this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionProveedor"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionProveedor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleEvaluacionProveedor"));
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleEvaluacionProveedor"));
				this.jInternalFrameImportacionDetalleEvaluacionProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleEvaluacionProveedor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleEvaluacionProveedor"));
			
			this.jButtonAbrirOrderByToolBarDetalleEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleEvaluacionProveedor"));			
			
			if(this.jInternalFrameOrderByDetalleEvaluacionProveedor!=null) {
				this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleEvaluacionProveedor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTabbedPaneRelacionesDetalleEvaluacionProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleEvaluacionProveedor"));
		
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
            		closingInternalFrameDetalleEvaluacionProveedor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleEvaluacionProveedor = (JInternalFrameBase)event.getSource();
	            	
	            DetalleEvaluacionProveedorBeanSwingJInternalFrame jInternalFrameParent=(DetalleEvaluacionProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleEvaluacionProveedor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleEvaluacionProveedorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleEvaluacionProveedor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleEvaluacionProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleEvaluacionProveedor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleEvaluacionProveedor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleEvaluacionProveedorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleEvaluacionProveedor";
		inputMap = this.jButtonModificarDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleEvaluacionProveedor";
		inputMap = this.jButtonActualizarDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleEvaluacionProveedor";
		inputMap = this.jButtonEliminarDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCancelarDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCerrarDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleEvaluacionProveedor";
		inputMap = this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonGuardarCambiosDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleEvaluacionProveedorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonidDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_si_noDetalleEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jButtondescripcionDetalleEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleEvaluacionProveedorBusqueda"));
		
		
		this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionProveedorDetalleEvaluacionProveedor"));

		this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaEvaluacionDetalleEvaluacionProveedor"));

		this.jButtonFK_IdSiNoDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdSiNoDetalleEvaluacionProveedor"));

		this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleEvaluacionProveedor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
					detalleevaluacionproveedorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedors) {
					detalleevaluacionproveedorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleEvaluacionProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
						detalleevaluacionproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedors) {
						detalleevaluacionproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleEvaluacionProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleEvaluacionProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionProveedor.getSelectedRows();
			
			DetalleEvaluacionProveedor detalleevaluacionproveedorLocal=new DetalleEvaluacionProveedor();
			
			//this.seleccionarTodosDetalleEvaluacionProveedor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionproveedorLocal =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleevaluacionproveedorLocal =(DetalleEvaluacionProveedor) this.detalleevaluacionproveedors.toArray()[this.jTableDatosDetalleEvaluacionProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleevaluacionproveedorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
						detalleevaluacionproveedorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedors) {
						detalleevaluacionproveedorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleEvaluacionProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleEvaluacionProveedorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleEvaluacionProveedorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
				
						if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleevaluacionproveedorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedors) {
					
						if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleevaluacionproveedorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleEvaluacionProveedorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleEvaluacionProveedor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleEvaluacionProveedor) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleEvaluacionProveedor(conSplash);
				
					this.generarReporteDetalleEvaluacionProveedorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleEvaluacionProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleEvaluacionProveedorsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleEvaluacionProveedorsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleEvaluacionProveedor();
				
				this.exportarDetalleEvaluacionProveedorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleEvaluacionProveedors();
				//this.importarDetalleEvaluacionProveedors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleEvaluacionProveedor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleEvaluacionProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleEvaluacionProveedor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleEvaluacionProveedor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleEvaluacionProveedor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleEvaluacionProveedorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleEvaluacionProveedor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleEvaluacionProveedor(conSplash);
					
						//this.actualizarParametrosGeneralDetalleEvaluacionProveedor();
						
						this.generarReporteProcesoAccionDetalleEvaluacionProveedorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Evaluacion ProveedorES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleEvaluacionProveedor();
				
						this.actualizarParametrosGeneralDetalleEvaluacionProveedor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleevaluacionproveedorReturnGeneral=detalleevaluacionproveedorLogic.procesarAccionDetalleEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.detalleevaluacionproveedorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleEvaluacionProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleEvaluacionProveedor();
					
					DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleEvaluacionProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleEvaluacionProveedor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleEvaluacionProveedor();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
			DetalleEvaluacionProveedor detalleevaluacionproveedor=new DetalleEvaluacionProveedor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.getSelectedItem();
			
			
			
			
			detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleevaluacionproveedorsSeleccionados.size()==1) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
					detalleevaluacionproveedor=detalleevaluacionproveedorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleEvaluacionProveedor();
			
      		//this.finishProcessDetalleEvaluacionProveedor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleEvaluacionProveedorReturnGeneral() throws Exception {
		if(this.detalleevaluacionproveedorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleevaluacionproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleevaluacionproveedorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleevaluacionproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleevaluacionproveedorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleevaluacionproveedorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
		}
		
		if(this.detalleevaluacionproveedorReturnGeneral.getConRetornoLista() || this.detalleevaluacionproveedorReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleevaluacionproveedorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleevaluacionproveedorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedor(this.detalleevaluacionproveedorReturnGeneral.getDetalleEvaluacionProveedor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleEvaluacionProveedor(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleEvaluacionProveedor() throws Exception {
		
		
	}
	
	public ArrayList<DetalleEvaluacionProveedor> getDetalleEvaluacionProveedorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleEvaluacionProveedor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors()) {
					if(detalleevaluacionproveedorAux.getIsSelected()) {
						detalleevaluacionproveedorsSeleccionados.add(detalleevaluacionproveedorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:this.detalleevaluacionproveedors) {
					if(detalleevaluacionproveedorAux.getIsSelected()) {
						detalleevaluacionproveedorsSeleccionados.add(detalleevaluacionproveedorAux);				
					}
				}
			}
			
			if(detalleevaluacionproveedorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleevaluacionproveedorsSeleccionados.addAll(this.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleevaluacionproveedorsSeleccionados.addAll(this.detalleevaluacionproveedors);				
					}
				}
			}
		} else {
			detalleevaluacionproveedorsSeleccionados.add(this.detalleevaluacionproveedor);
		}
		
		return detalleevaluacionproveedorsSeleccionados;
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
	
	public void generarReporteDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleEvaluacionProveedorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleEvaluacionProveedorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Evaluacion Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleEvaluacionProveedorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleEvaluacionProveedor();
		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleEvaluacionProveedor();
		
		
		//this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados ,detalleevaluacionproveedorImplementable,detalleevaluacionproveedorImplementableHome);
	}
	
	public void mostrarImportacionDetalleEvaluacionProveedors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleEvaluacionProveedor();
		
		this.abrirFrameImportacionDetalleEvaluacionProveedor();		
		
			
		//this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados ,detalleevaluacionproveedorImplementable,detalleevaluacionproveedorImplementableHome);
	}
	
	public void importarDetalleEvaluacionProveedors() throws Exception {		
	
	}
	
	public void exportarDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleEvaluacionProveedorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleEvaluacionProveedorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Evaluacion Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleEvaluacionProveedor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleEvaluacionProveedor(detalleevaluacionproveedorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleevaluacionproveedorAux.setsDetalleGeneralEntityReporte(detalleevaluacionproveedorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleEvaluacionProveedor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleevaluacionproveedor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getevaluacionproveedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getpreguntaevaluacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getsino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionproveedor.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleEvaluacionProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleEvaluacionProveedor(row);				
				iRow++;
			}				
			
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleEvaluacionProveedor(detalleevaluacionproveedorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();		
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionproveedor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleevaluacionproveedors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleevaluacionproveedor");
			//elementRoot.appendChild(element);
		
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
				element = document.createElement("detalleevaluacionproveedor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleEvaluacionProveedor(detalleevaluacionproveedorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleEvaluacionProveedor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getevaluacionproveedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getpreguntaevaluacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getsino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionproveedor.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleEvaluacionProveedor(DetalleEvaluacionProveedor detalleevaluacionproveedor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleevaluacionproveedor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleevaluacionproveedor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementevaluacionproveedor_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDEVALUACIONPROVEEDOR);
		elementevaluacionproveedor_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getevaluacionproveedor_descripcion()));
		element.appendChild(elementevaluacionproveedor_descripcion);

		Element elementpreguntaevaluacion_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDPREGUNTAEVALUACION);
		elementpreguntaevaluacion_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getpreguntaevaluacion_descripcion()));
		element.appendChild(elementpreguntaevaluacion_descripcion);

		Element elementsubpreguntaevaluacion_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDSUBPREGUNTAEVALUACION);
		elementsubpreguntaevaluacion_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getsubpreguntaevaluacion_descripcion()));
		element.appendChild(elementsubpreguntaevaluacion_descripcion);

		Element elementsino_descripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.IDSINO);
		elementsino_descripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getsino_descripcion()));
		element.appendChild(elementsino_descripcion);

		Element elementdescripcion = document.createElement(DetalleEvaluacionProveedorConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleevaluacionproveedor.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleEvaluacionProveedorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados=new ArrayList<DetalleEvaluacionProveedor>();
		
		detalleevaluacionproveedorsSeleccionados=this.getDetalleEvaluacionProveedorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleEvaluacionProveedor(detalleevaluacionproveedorsSeleccionados);
		
		this.generarReporteDetalleEvaluacionProveedors("Todos",detalleevaluacionproveedorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleEvaluacionProveedor(ArrayList<DetalleEvaluacionProveedor> detalleevaluacionproveedorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleEvaluacionProveedor detalleevaluacionproveedorAux:detalleevaluacionproveedorsSeleccionados) {
				detalleevaluacionproveedorAux.setsDetalleGeneralEntityReporte(detalleevaluacionproveedorAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getevaluacionproveedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getpreguntaevaluacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getsubpreguntaevaluacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getsino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleevaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionproveedorAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionProveedor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=true;
		} else {
			this.actualizarEstadoPanelsDetalleEvaluacionProveedor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleEvaluacionProveedor=false;
			//this.isVisibilidadCeldaVerFormDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;												
			}
			
			this.jButtonCerrarDetalleEvaluacionProveedor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionProveedor=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleevaluacionproveedor)) {
			this.isVisibilidadCeldaActualizarDetalleEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionProveedor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleEvaluacionProveedor() {
	}
	
	public void actualizarEstadoPanelsDetalleEvaluacionProveedor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionProveedor!=null) {
				this.jScrollPanelDatosDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionProveedor!=null) {
				this.jPanelPaginacionDetalleEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
					this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEvaluacionProveedor(Boolean isParaEvaluacionProveedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEvaluacionProveedorNegation=!isParaEvaluacionProveedor;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaEvaluacionProveedor;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaEvaluacionProveedorNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaEvaluacionProveedorNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaEvaluacionProveedorNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPreguntaEvaluacion(Boolean isParaPreguntaEvaluacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPreguntaEvaluacionNegation=!isParaPreguntaEvaluacion;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaPreguntaEvaluacion;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSubPreguntaEvaluacion(Boolean isParaSubPreguntaEvaluacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSubPreguntaEvaluacionNegation=!isParaSubPreguntaEvaluacion;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaSubPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaSubPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaSubPreguntaEvaluacionNegation;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaSubPreguntaEvaluacion;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSiNo(Boolean isParaSiNo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSiNoNegation=!isParaSiNo;

			this.isVisibilidadFK_IdEvaluacionProveedor=isParaSiNoNegation;
			if(!this.isVisibilidadFK_IdEvaluacionProveedor) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaSiNoNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSiNo=isParaSiNo;
			if(!this.isVisibilidadFK_IdSiNo) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSiNoDetalleEvaluacionProveedor);}

			this.isVisibilidadFK_IdSubPreguntaEvaluacion=isParaSiNoNegation;
			if(!this.isVisibilidadFK_IdSubPreguntaEvaluacion) {this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		
		if(this.detalleevaluacionproveedorSessionBean==null) {
			this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		}
		
		this.detalleevaluacionproveedorSessionBean.setsUltimaBusquedaDetalleEvaluacionProveedor(this.getsAccionBusqueda());
		this.detalleevaluacionproveedorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleevaluacionproveedorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detalleevaluacionproveedorSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleevaluacionproveedorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionProveedor")) {
			detalleevaluacionproveedorSessionBean.setid_evaluacion_proveedor(this.getid_evaluacion_proveedorFK_IdEvaluacionProveedor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detalleevaluacionproveedorSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPreguntaEvaluacion")) {
			detalleevaluacionproveedorSessionBean.setid_pregunta_evaluacion(this.getid_pregunta_evaluacionFK_IdPreguntaEvaluacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSiNo")) {
			detalleevaluacionproveedorSessionBean.setid_si_no(this.getid_si_noFK_IdSiNo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSubPreguntaEvaluacion")) {
			detalleevaluacionproveedorSessionBean.setid_sub_pregunta_evaluacion(this.getid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleevaluacionproveedorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		
		if(this.detalleevaluacionproveedorSessionBean==null) {
			this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		}
		
		if(this.detalleevaluacionproveedorSessionBean.getsUltimaBusquedaDetalleEvaluacionProveedor()!=null&&!this.detalleevaluacionproveedorSessionBean.getsUltimaBusquedaDetalleEvaluacionProveedor().equals("")) {
			this.setsAccionBusqueda(detalleevaluacionproveedorSessionBean.getsUltimaBusquedaDetalleEvaluacionProveedor());
			this.setiNumeroPaginacion(detalleevaluacionproveedorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleevaluacionproveedorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detalleevaluacionproveedorSessionBean.getid_ejercicio());
				detalleevaluacionproveedorSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleevaluacionproveedorSessionBean.getid_empresa());
				detalleevaluacionproveedorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionProveedor")) {
				this.setid_evaluacion_proveedorFK_IdEvaluacionProveedor(detalleevaluacionproveedorSessionBean.getid_evaluacion_proveedor());
				detalleevaluacionproveedorSessionBean.setid_evaluacion_proveedor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detalleevaluacionproveedorSessionBean.getid_periodo());
				detalleevaluacionproveedorSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPreguntaEvaluacion")) {
				this.setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(detalleevaluacionproveedorSessionBean.getid_pregunta_evaluacion());
				detalleevaluacionproveedorSessionBean.setid_pregunta_evaluacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSiNo")) {
				this.setid_si_noFK_IdSiNo(detalleevaluacionproveedorSessionBean.getid_si_no());
				detalleevaluacionproveedorSessionBean.setid_si_no(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSubPreguntaEvaluacion")) {
				this.setid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion(detalleevaluacionproveedorSessionBean.getid_sub_pregunta_evaluacion());
				detalleevaluacionproveedorSessionBean.setid_sub_pregunta_evaluacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleevaluacionproveedorSessionBean.getid_sucursal());
				detalleevaluacionproveedorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detalleevaluacionproveedorSessionBean.setsUltimaBusquedaDetalleEvaluacionProveedor("");
		this.detalleevaluacionproveedorSessionBean.setiNumeroPaginacion(DetalleEvaluacionProveedorConstantesFunciones.INUMEROPAGINACION);
		this.detalleevaluacionproveedorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleEvaluacionProveedor() {
		this.updateBorderResaltarBusquedasFormularioDetalleEvaluacionProveedor();
		this.updateVisibilidadBusquedasFormularioDetalleEvaluacionProveedor();
		this.updateHabilitarBusquedasFormularioDetalleEvaluacionProveedor();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleEvaluacionProveedor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponents().length>0) {
	

		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			}
		}

		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			}
		}

		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSiNoDetalleEvaluacionProveedor!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSiNoDetalleEvaluacionProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSiNoDetalleEvaluacionProveedor);
			}
		}

		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleEvaluacionProveedor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			if(!this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(!this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSiNoDetalleEvaluacionProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdSiNoDetalleEvaluacionProveedor);
			if(!this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdSiNoDetalleEvaluacionProveedor && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(!this.detalleevaluacionproveedorConstantesFunciones.mostrarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleEvaluacionProveedor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setEnabledAt(index,this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setEnabledAt(index,this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSiNoDetalleEvaluacionProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdSiNoDetalleEvaluacionProveedor);
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setEnabledAt(index,this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdSiNoDetalleEvaluacionProveedor);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
				this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setEnabledAt(index,this.detalleevaluacionproveedorConstantesFunciones.activarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleEvaluacionProveedor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEvaluacionProveedor")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);

			this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);

			this.detalleevaluacionproveedorConstantesFunciones.setResaltarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor(resaltar);

			jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPreguntaEvaluacion")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);

			this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);

			this.detalleevaluacionproveedorConstantesFunciones.setResaltarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor(resaltar);

			jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSiNo")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSiNoDetalleEvaluacionProveedor);

			this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);

			this.detalleevaluacionproveedorConstantesFunciones.setResaltarFK_IdSiNoDetalleEvaluacionProveedor(resaltar);

			jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSiNoDetalleEvaluacionProveedor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSubPreguntaEvaluacion")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);

			this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.getComponent(index);

			this.detalleevaluacionproveedorConstantesFunciones.setResaltarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor(resaltar);

			jPanel.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleEvaluacionProveedor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleEvaluacionProveedor() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleEvaluacionProveedor();
		this.updateVisibilidadResaltarControlesFormularioDetalleEvaluacionProveedor();
		this.updateHabilitarResaltarControlesFormularioDetalleEvaluacionProveedor();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleEvaluacionProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltaridDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltaridDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_empresaDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_empresaDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sucursalDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sucursalDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_ejercicioDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_ejercicioDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_periodoDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_periodoDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_evaluacion_proveedorDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_evaluacion_proveedorDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_pregunta_evaluacionDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_pregunta_evaluacionDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_si_noDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltarid_si_noDetalleEvaluacionProveedor);}
		if(this.detalleevaluacionproveedorConstantesFunciones.resaltardescripcionDetalleEvaluacionProveedor!=null && this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setBorder(this.detalleevaluacionproveedorConstantesFunciones.resaltardescripcionDetalleEvaluacionProveedor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleEvaluacionProveedor() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
	
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostraridDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelidDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostraridDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_empresaDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_empresaDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_empresaDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sucursalDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_sucursalDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sucursalDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_ejercicioDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_ejercicioDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_ejercicioDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_periodoDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_periodoDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_periodoDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_evaluacion_proveedorDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_evaluacion_proveedorDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_pregunta_evaluacionDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_si_noDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPanelid_si_noDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrarid_si_noDetalleEvaluacionProveedor);
		//this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrardescripcionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jPaneldescripcionDetalleEvaluacionProveedor.setVisible(this.detalleevaluacionproveedorConstantesFunciones.mostrardescripcionDetalleEvaluacionProveedor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleEvaluacionProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionProveedor!=null) {
	
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jLabelidDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activaridDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_empresaDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_empresaDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sucursalDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_sucursalDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_ejercicioDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_ejercicioDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_periodoDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_periodoDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_evaluacion_proveedorDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_sub_pregunta_evaluacionDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jComboBoxid_si_noDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activarid_si_noDetalleEvaluacionProveedor);
		this.jInternalFrameDetalleFormDetalleEvaluacionProveedor.jTextAreadescripcionDetalleEvaluacionProveedor.setEnabled(this.detalleevaluacionproveedorConstantesFunciones.activardescripcionDetalleEvaluacionProveedor);
		}
	}
	
		
}